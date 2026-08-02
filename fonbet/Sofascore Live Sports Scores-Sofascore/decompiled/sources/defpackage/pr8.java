package defpackage;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pr8 implements rf6 {
    public static final hg6 d = new hg6(29);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public pr8(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = yc2.b;
        z1a.r("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(yc2.c)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (yc2.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // defpackage.rf6
    public final void a(final de0 de0Var) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: or8
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                gl0 gl0Var = ((so4) de0Var.b).w;
                gl0Var.getClass();
                gl0Var.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // defpackage.rf6
    public final int b() {
        return 2;
    }

    @Override // defpackage.rf6
    public final void c(byte[] bArr, cse cseVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                qz.w(this.b, bArr, cseVar);
            } catch (UnsupportedOperationException unused) {
                tgj.d0("setLogSessionId failed.");
            }
        }
    }

    @Override // defpackage.rf6
    public final void closeSession(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // defpackage.rf6
    public final nr8 d(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i < 27 && Objects.equals(uuid, yc2.c)) {
            uuid = yc2.b;
        }
        return new nr8(uuid, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x019d, code lost:
    
        if ("AFTT".equals(r5) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a3, code lost:
    
        if (r5 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0216, code lost:
    
        if (java.util.Objects.equals(r3, "aidl-1") == false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0229  */
    @Override // defpackage.rf6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pf6 e(byte[] bArr, List list, int i, HashMap hashMap) {
        byte[] bArr2;
        String str;
        String str2;
        DrmInitData.SchemeData schemeData;
        byte[] bArr3;
        axn z;
        UUID uuid = this.a;
        DrmInitData.SchemeData schemeData2 = null;
        if (list != null) {
            if (yc2.d.equals(uuid)) {
                if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
                    DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) list.get(0);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        DrmInitData.SchemeData schemeData4 = (DrmInitData.SchemeData) list.get(i3);
                        byte[] bArr4 = schemeData4.e;
                        bArr4.getClass();
                        if (Objects.equals(schemeData4.d, schemeData3.d) && Objects.equals(schemeData4.c, schemeData3.c) && d2a.z(bArr4) != null) {
                            i2 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i2];
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        byte[] bArr6 = ((DrmInitData.SchemeData) list.get(i5)).e;
                        bArr6.getClass();
                        int length = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i4, length);
                        i4 += length;
                    }
                    schemeData = new DrmInitData.SchemeData(schemeData3.b, schemeData3.c, schemeData3.d, bArr5);
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= list.size()) {
                        schemeData = (DrmInitData.SchemeData) list.get(0);
                        break;
                    }
                    DrmInitData.SchemeData schemeData5 = (DrmInitData.SchemeData) list.get(i6);
                    byte[] bArr7 = schemeData5.e;
                    bArr7.getClass();
                    axn z2 = d2a.z(bArr7);
                    if ((z2 == null ? -1 : z2.a) == 1) {
                        schemeData = schemeData5;
                        break;
                    }
                    i6++;
                }
            } else {
                schemeData = (DrmInitData.SchemeData) list.get(0);
            }
            byte[] bArr8 = schemeData.e;
            bArr8.getClass();
            UUID uuid2 = yc2.e;
            if (uuid2.equals(uuid)) {
                byte[] A = d2a.A(bArr8, uuid);
                if (A != null) {
                    bArr8 = A;
                }
                j9e j9eVar = new j9e(bArr8);
                int o = j9eVar.o();
                short q = j9eVar.q();
                short q2 = j9eVar.q();
                if (q == 1 && q2 == 1) {
                    short q3 = j9eVar.q();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String y = j9eVar.y(q3, charset);
                    if (!y.contains("<LA_URL>")) {
                        int indexOf = y.indexOf("</DATA>");
                        if (indexOf == -1) {
                            tgj.d0("Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str3 = y.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + y.substring(indexOf);
                        int i7 = o + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i7);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i7);
                        allocate.putShort(q);
                        allocate.putShort(q2);
                        allocate.putShort((short) (str3.length() * 2));
                        allocate.put(str3.getBytes(charset));
                        bArr8 = allocate.array();
                    }
                } else {
                    tgj.O("Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr8 = d2a.q(uuid2, null, bArr8);
            }
            if (Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, yc2.c) && (z = d2a.z(bArr8)) != null) {
                bArr8 = d2a.q(yc2.b, (UUID[]) z.d, (byte[]) z.c);
            }
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str4 = Build.MODEL;
                if (!"AFTB".equals(str4)) {
                    if (!"AFTS".equals(str4)) {
                        if (!"AFTM".equals(str4)) {
                        }
                    }
                }
                bArr3 = d2a.A(bArr8, uuid);
            }
            bArr3 = bArr8;
            bArr2 = bArr3;
            str = schemeData.d;
            schemeData2 = schemeData;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm mediaDrm = this.b;
        MediaDrm.KeyRequest keyRequest = mediaDrm.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] data = keyRequest.getData();
        if (yc2.c.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = nik.r(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!Objects.equals(propertyString, "1.2")) {
                }
            }
            if (TextUtils.isEmpty(defaultUrl) && schemeData2 != null) {
                str2 = schemeData2.c;
                if (!TextUtils.isEmpty(str2)) {
                    defaultUrl = str2;
                }
            }
            keyRequest.getRequestType();
            return new pf6(data, defaultUrl);
        }
        defaultUrl = "";
        if (TextUtils.isEmpty(defaultUrl)) {
            str2 = schemeData2.c;
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        keyRequest.getRequestType();
        return new pf6(data, defaultUrl);
    }

    @Override // defpackage.rf6
    public final boolean f(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i >= 31) {
            boolean equals2 = uuid.equals(yc2.d);
            MediaDrm mediaDrm = this.b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                equals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                equals = uuid.equals(yc2.c);
            }
            if (equals) {
                return qz.u(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !Objects.equals(uuid, yc2.c)) ? uuid : yc2.b, bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z = !uuid.equals(yc2.c);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override // defpackage.rf6
    public final qf6 getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new qf6(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // defpackage.rf6
    public final byte[] openSession() {
        return this.b.openSession();
    }

    @Override // defpackage.rf6
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (yc2.c.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(nik.r(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K).replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                tgj.A("Failed to adjust response data: ".concat(nik.r(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.rf6
    public final void provideProvisionResponse(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // defpackage.rf6
    public final Map queryKeyStatus(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // defpackage.rf6
    public final synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // defpackage.rf6
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }
}
