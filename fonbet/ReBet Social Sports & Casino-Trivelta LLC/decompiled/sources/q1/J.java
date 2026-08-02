package q1;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import b1.AbstractC2356j;
import b2.p;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import n1.G1;
import q1.InterfaceC6089A;

/* loaded from: classes.dex */
public final class J implements InterfaceC6089A {

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC6089A.c f63235d = new InterfaceC6089A.c() { // from class: q1.D
        @Override // q1.InterfaceC6089A.c
        public final InterfaceC6089A a(UUID uuid) {
            return J.n(uuid);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final UUID f63236a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f63237b;

    /* renamed from: c, reason: collision with root package name */
    public int f63238c;

    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str, int i10) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str, i10);
            return requiresSecureDecoder;
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, G1 g12) {
            LogSessionId logSessionId;
            boolean equals;
            MediaDrm.PlaybackComponent playbackComponent;
            LogSessionId a10 = g12.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a10.equals(logSessionId);
            if (equals) {
                return;
            }
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            H.a(AbstractC4134a.e(playbackComponent)).setLogSessionId(a10);
        }
    }

    public J(UUID uuid) {
        AbstractC4134a.e(uuid);
        AbstractC4134a.b(!AbstractC2356j.f24592b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f63236a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f63237b = mediaDrm;
        this.f63238c = 1;
        if (AbstractC2356j.f24594d.equals(uuid) && B()) {
            x(mediaDrm);
        }
    }

    public static boolean B() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    public static J C(UUID uuid) {
        try {
            return new J(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new O(1, e10);
        } catch (Exception e11) {
            throw new O(2, e11);
        }
    }

    public static /* synthetic */ InterfaceC6089A n(UUID uuid) {
        try {
            return C(uuid);
        } catch (O unused) {
            AbstractC4156x.d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new y();
        }
    }

    public static /* synthetic */ void o(J j10, InterfaceC6089A.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        j10.getClass();
        bVar.a(j10, bArr, i10, i11, bArr2);
    }

    public static byte[] p(byte[] bArr) {
        e1.J j10 = new e1.J(bArr);
        int z10 = j10.z();
        short B10 = j10.B();
        short B11 = j10.B();
        if (B10 != 1 || B11 != 1) {
            AbstractC4156x.g("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short B12 = j10.B();
        Charset charset = StandardCharsets.UTF_16LE;
        String K10 = j10.K(B12, charset);
        if (K10.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = K10.indexOf("</DATA>");
        if (indexOf == -1) {
            AbstractC4156x.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = K10.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + K10.substring(indexOf);
        int i10 = z10 + 52;
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i10);
        allocate.putShort(B10);
        allocate.putShort(B11);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(charset));
        return allocate.array();
    }

    public static byte[] r(UUID uuid, byte[] bArr) {
        return AbstractC2356j.f24593c.equals(uuid) ? AbstractC6092a.a(bArr) : bArr;
    }

    public static byte[] s(UUID uuid, byte[] bArr) {
        byte[] e10;
        p.a d10;
        UUID uuid2 = AbstractC2356j.f24595e;
        if (uuid2.equals(uuid)) {
            byte[] e11 = b2.p.e(bArr, uuid);
            if (e11 != null) {
                bArr = e11;
            }
            bArr = b2.p.a(uuid2, p(bArr));
        }
        if (v(uuid) && (d10 = b2.p.d(bArr)) != null) {
            bArr = b2.p.b(AbstractC2356j.f24592b, d10.keyIds, d10.schemeData);
        }
        if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if (("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) && (e10 = b2.p.e(bArr, uuid)) != null) {
                return e10;
            }
        }
        return bArr;
    }

    public static String t(UUID uuid, String str) {
        return (Build.VERSION.SDK_INT < 26 && AbstractC2356j.f24593c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    public static UUID u(UUID uuid) {
        return v(uuid) ? AbstractC2356j.f24592b : uuid;
    }

    public static boolean v(UUID uuid) {
        return Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, AbstractC2356j.f24593c);
    }

    public static void x(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static DrmInitData.SchemeData z(UUID uuid, List list) {
        if (!AbstractC2356j.f24594d.equals(uuid)) {
            return (DrmInitData.SchemeData) list.get(0);
        }
        if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) list.get(0);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) list.get(i11);
                byte[] bArr = (byte[]) AbstractC4134a.e(schemeData2.data);
                if (Objects.equals(schemeData2.f20468d, schemeData.f20468d) && Objects.equals(schemeData2.f20467c, schemeData.f20467c) && b2.p.c(bArr)) {
                    i10 += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i10];
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                byte[] bArr3 = (byte[]) AbstractC4134a.e(((DrmInitData.SchemeData) list.get(i13)).data);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i12, length);
                i12 += length;
            }
            return schemeData.b(bArr2);
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) list.get(i14);
            if (b2.p.g((byte[]) AbstractC4134a.e(schemeData3.data)) == 1) {
                return schemeData3;
            }
        }
        return (DrmInitData.SchemeData) list.get(0);
    }

    public final boolean A() {
        if (!this.f63236a.equals(AbstractC2356j.f24594d)) {
            return this.f63236a.equals(AbstractC2356j.f24593c);
        }
        String y10 = y("version");
        return (y10.startsWith("v5.") || y10.startsWith("14.") || y10.startsWith("15.") || y10.startsWith("16.0")) ? false : true;
    }

    public void D(String str, String str2) {
        this.f63237b.setPropertyString(str, str2);
    }

    @Override // q1.InterfaceC6089A
    public Map a(byte[] bArr) {
        return this.f63237b.queryKeyStatus(bArr);
    }

    @Override // q1.InterfaceC6089A
    public InterfaceC6089A.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f63237b.getProvisionRequest();
        return new InterfaceC6089A.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // q1.InterfaceC6089A
    public byte[] c() {
        return this.f63237b.openSession();
    }

    @Override // q1.InterfaceC6089A
    public void d(byte[] bArr, byte[] bArr2) {
        this.f63237b.restoreKeys(bArr, bArr2);
    }

    @Override // q1.InterfaceC6089A
    public void e(byte[] bArr) {
        this.f63237b.provideProvisionResponse(bArr);
    }

    @Override // q1.InterfaceC6089A
    public int f() {
        return 2;
    }

    @Override // q1.InterfaceC6089A
    public void g(final InterfaceC6089A.b bVar) {
        this.f63237b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: q1.E
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                J.o(J.this, bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // q1.InterfaceC6089A
    public void i(byte[] bArr, G1 g12) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                a.b(this.f63237b, bArr, g12);
            } catch (UnsupportedOperationException unused) {
                AbstractC4156x.i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // q1.InterfaceC6089A
    public boolean j(byte[] bArr, String str) {
        MediaCrypto mediaCrypto;
        int securityLevel;
        if (Build.VERSION.SDK_INT >= 31 && A()) {
            MediaDrm mediaDrm = this.f63237b;
            securityLevel = mediaDrm.getSecurityLevel(bArr);
            return a.a(mediaDrm, str, securityLevel);
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto(u(this.f63236a), bArr);
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
            boolean z10 = !this.f63236a.equals(AbstractC2356j.f24593c);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z10;
        } catch (Throwable th3) {
            th = th3;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override // q1.InterfaceC6089A
    public void k(byte[] bArr) {
        this.f63237b.closeSession(bArr);
    }

    @Override // q1.InterfaceC6089A
    public byte[] l(byte[] bArr, byte[] bArr2) {
        if (AbstractC2356j.f24593c.equals(this.f63236a)) {
            bArr2 = AbstractC6092a.b(bArr2);
        }
        return this.f63237b.provideKeyResponse(bArr, bArr2);
    }

    @Override // q1.InterfaceC6089A
    public InterfaceC6089A.a m(byte[] bArr, List list, int i10, HashMap hashMap) {
        DrmInitData.SchemeData schemeData;
        byte[] bArr2;
        String str;
        if (list != null) {
            schemeData = z(this.f63236a, list);
            bArr2 = s(this.f63236a, (byte[]) AbstractC4134a.e(schemeData.data));
            str = t(this.f63236a, schemeData.f20468d);
        } else {
            schemeData = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f63237b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] r10 = r(this.f63236a, keyRequest.getData());
        String q10 = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(q10) && schemeData != null && !TextUtils.isEmpty(schemeData.f20467c)) {
            q10 = schemeData.f20467c;
        }
        return new InterfaceC6089A.a(r10, q10, keyRequest.getRequestType());
    }

    public final String q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(str)) {
            String y10 = y("version");
            if (Objects.equals(y10, "1.2") || Objects.equals(y10, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    @Override // q1.InterfaceC6089A
    public synchronized void release() {
        int i10 = this.f63238c - 1;
        this.f63238c = i10;
        if (i10 == 0) {
            this.f63237b.release();
        }
    }

    @Override // q1.InterfaceC6089A
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public C6090B h(byte[] bArr) {
        return new C6090B(u(this.f63236a), bArr);
    }

    public String y(String str) {
        return this.f63237b.getPropertyString(str);
    }
}
