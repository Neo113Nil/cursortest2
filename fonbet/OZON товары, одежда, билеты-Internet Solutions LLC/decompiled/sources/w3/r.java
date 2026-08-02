package w3;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import h4.k;
import j3.C7266h;
import j3.C7270l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import m3.C8050C;
import m3.N;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.InterfaceC9588b;
import u3.G;
import u3.P;
import w3.C10425b;
import w3.o;

/* loaded from: classes8.dex */
public final class r implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final Ej.b f103493d = new Ej.b();

    /* renamed from: a, reason: collision with root package name */
    private final UUID f103494a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaDrm f103495b;

    /* renamed from: c, reason: collision with root package name */
    private int f103496c;

    private r(UUID uuid) throws UnsupportedSchemeException {
        uuid.getClass();
        UUID uuid2 = C7266h.f69062b;
        G10.a.b("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f103494a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(C7266h.f69063c)) ? uuid : uuid2);
        this.f103495b = mediaDrm;
        this.f103496c = 1;
        if (C7266h.f69064d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static o n(UUID uuid) {
        try {
            try {
                return new r(uuid);
            } catch (w unused) {
                m3.s.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                return new m();
            }
        } catch (UnsupportedSchemeException e11) {
            throw new w(e11);
        } catch (Exception e12) {
            throw new w(e12);
        }
    }

    @Override // w3.o
    public final Map<String, String> a(byte[] bArr) {
        return this.f103495b.queryKeyStatus(bArr);
    }

    @Override // w3.o
    public final o.c b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f103495b.getProvisionRequest();
        return new o.c(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // w3.o
    public final byte[] c() throws MediaDrmException {
        return this.f103495b.openSession();
    }

    @Override // w3.o
    public final void d(byte[] bArr, byte[] bArr2) {
        this.f103495b.restoreKeys(bArr, bArr2);
    }

    @Override // w3.o
    public final byte[] e(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (C7266h.f69063c.equals(this.f103494a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(N.r(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    if (i11 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e11) {
                m3.s.d("ClearKeyUtil", "Failed to adjust response data: ".concat(N.r(bArr2)), e11);
            }
        }
        return this.f103495b.provideKeyResponse(bArr, bArr2);
    }

    @Override // w3.o
    public final boolean f(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        int securityLevel;
        boolean requiresSecureDecoder;
        int i11 = Build.VERSION.SDK_INT;
        UUID uuid = this.f103494a;
        if (i11 >= 31) {
            boolean equals2 = uuid.equals(C7266h.f69064d);
            MediaDrm mediaDrm = this.f103495b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                equals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                equals = uuid.equals(C7266h.f69063c);
            }
            if (equals) {
                securityLevel = mediaDrm.getSecurityLevel(bArr);
                requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str, securityLevel);
                return requiresSecureDecoder;
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i11 >= 27 || !Objects.equals(uuid, C7266h.f69063c)) ? uuid : C7266h.f69062b, bArr);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z11 = !uuid.equals(C7266h.f69063c);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z11;
        } catch (Throwable th3) {
            th = th3;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override // w3.o
    public final void g(final o.b bVar) {
        this.f103495b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: w3.q
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i11, int i12, byte[] bArr2) {
                r rVar = r.this;
                o.b bVar2 = bVar;
                rVar.getClass();
                C10425b.c cVar = ((C10425b.C2243b) bVar2).f103456a.f103447x;
                cVar.getClass();
                cVar.obtainMessage(i11, bArr).sendToTarget();
            }
        });
    }

    @Override // w3.o
    public final void h(byte[] bArr) throws DeniedByServerException {
        this.f103495b.provideProvisionResponse(bArr);
    }

    @Override // w3.o
    public final int i() {
        return 2;
    }

    @Override // w3.o
    public final InterfaceC9588b j(byte[] bArr) throws MediaCryptoException {
        int i11 = Build.VERSION.SDK_INT;
        UUID uuid = this.f103494a;
        if (i11 < 27 && Objects.equals(uuid, C7266h.f69063c)) {
            uuid = C7266h.f69062b;
        }
        return new p(uuid, bArr);
    }

    @Override // w3.o
    public final void k(byte[] bArr) {
        this.f103495b.closeSession(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x021f, code lost:
    
        if (java.util.Objects.equals(r3, "aidl-1") == false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0232  */
    @Override // w3.o
    @SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o.a l(byte[] bArr, List<C7270l.b> list, int i11, HashMap<String, String> hashMap) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        String str2;
        C7270l.b bVar;
        byte[] bArr3;
        byte[] c11;
        k.a b11;
        UUID uuid = this.f103494a;
        C7270l.b bVar2 = null;
        if (list != null) {
            boolean z11 = false;
            if (C7266h.f69064d.equals(uuid)) {
                if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
                    C7270l.b bVar3 = list.get(0);
                    int i12 = 0;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        C7270l.b bVar4 = list.get(i13);
                        byte[] bArr4 = bVar4.f69092e;
                        bArr4.getClass();
                        if (Objects.equals(bVar4.f69091d, bVar3.f69091d) && Objects.equals(bVar4.f69090c, bVar3.f69090c) && h4.k.b(bArr4) != null) {
                            i12 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i12];
                    int i14 = 0;
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        byte[] bArr6 = list.get(i15).f69092e;
                        bArr6.getClass();
                        int length = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i14, length);
                        i14 += length;
                    }
                    bVar = new C7270l.b(bVar3.f69089b, bVar3.f69090c, bVar3.f69091d, bArr5);
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= list.size()) {
                        bVar = list.get(0);
                        break;
                    }
                    C7270l.b bVar5 = list.get(i16);
                    byte[] bArr7 = bVar5.f69092e;
                    bArr7.getClass();
                    k.a b12 = h4.k.b(bArr7);
                    if ((b12 == null ? -1 : b12.f64899b) == 1) {
                        bVar = bVar5;
                        break;
                    }
                    i16++;
                }
            } else {
                bVar = list.get(0);
            }
            byte[] bArr8 = bVar.f69092e;
            bArr8.getClass();
            UUID uuid2 = C7266h.f69065e;
            if (uuid2.equals(uuid)) {
                byte[] c12 = h4.k.c(uuid, bArr8);
                if (c12 != null) {
                    bArr8 = c12;
                }
                C8050C c8050c = new C8050C(bArr8);
                int s11 = c8050c.s();
                short u11 = c8050c.u();
                short u12 = c8050c.u();
                if (u11 == 1 && u12 == 1) {
                    short u13 = c8050c.u();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String C11 = c8050c.C(u13, charset);
                    if (!C11.contains("<LA_URL>")) {
                        int indexOf = C11.indexOf("</DATA>");
                        if (indexOf == -1) {
                            m3.s.f("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str3 = C11.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + C11.substring(indexOf);
                        int i17 = s11 + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i17);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i17);
                        allocate.putShort(u11);
                        allocate.putShort(u12);
                        allocate.putShort((short) (str3.length() * 2));
                        allocate.put(str3.getBytes(charset));
                        bArr8 = allocate.array();
                    }
                } else {
                    m3.s.e("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr8 = h4.k.a(uuid2, null, bArr8);
            }
            if (Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, C7266h.f69063c)) {
                z11 = true;
            }
            if (z11 && (b11 = h4.k.b(bArr8)) != null) {
                bArr8 = h4.k.a(C7266h.f69062b, b11.f64901d, b11.f64900c);
            }
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str4 = Build.MODEL;
                if (("AFTB".equals(str4) || "AFTS".equals(str4) || "AFTM".equals(str4) || "AFTT".equals(str4)) && (c11 = h4.k.c(uuid, bArr8)) != null) {
                    bArr3 = c11;
                    str = bVar.f69091d;
                    bArr2 = bArr3;
                    bVar2 = bVar;
                }
            }
            bArr3 = bArr8;
            str = bVar.f69091d;
            bArr2 = bArr3;
            bVar2 = bVar;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f103495b.getKeyRequest(bArr, bArr2, str, i11, hashMap);
        byte[] data = keyRequest.getData();
        if (C7266h.f69063c.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = N.r(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
                String propertyString = this.f103495b.getPropertyString("version");
                if (!Objects.equals(propertyString, "1.2")) {
                }
            }
            if (TextUtils.isEmpty(defaultUrl) && bVar2 != null) {
                str2 = bVar2.f69090c;
                if (!TextUtils.isEmpty(str2)) {
                    defaultUrl = str2;
                }
            }
            keyRequest.getRequestType();
            return new o.a(defaultUrl, data);
        }
        defaultUrl = "";
        if (TextUtils.isEmpty(defaultUrl)) {
            str2 = bVar2.f69090c;
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        keyRequest.getRequestType();
        return new o.a(defaultUrl, data);
    }

    @Override // w3.o
    public final void m(byte[] bArr, P p11) {
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        LogSessionId unused;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                MediaDrm mediaDrm = this.f103495b;
                LogSessionId a11 = p11.a();
                unused = LogSessionId.LOG_SESSION_ID_NONE;
                equals = a11.equals(LogSessionId.LOG_SESSION_ID_NONE);
                if (equals) {
                    return;
                }
                playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                G.a(playbackComponent).setLogSessionId(a11);
            } catch (UnsupportedOperationException unused2) {
                m3.s.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // w3.o
    public final synchronized void release() {
        int i11 = this.f103496c - 1;
        this.f103496c = i11;
        if (i11 == 0) {
            this.f103495b.release();
        }
    }
}
