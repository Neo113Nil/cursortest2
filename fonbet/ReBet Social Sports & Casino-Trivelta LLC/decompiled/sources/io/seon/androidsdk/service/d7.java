package io.seon.androidsdk.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Base64;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import java.io.ByteArrayOutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d7 {

    /* renamed from: k, reason: collision with root package name */
    public static final Lh.a f53274k = Lh.a.d(d7.class);

    /* renamed from: l, reason: collision with root package name */
    public static String f53275l = null;

    /* renamed from: m, reason: collision with root package name */
    public static SeonNT f53276m = null;

    /* renamed from: a, reason: collision with root package name */
    public final C4942i f53277a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C4930g3 f53278b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f53279c = null;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f53280d;

    /* renamed from: e, reason: collision with root package name */
    public String f53281e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f53282f;

    /* renamed from: g, reason: collision with root package name */
    public L6 f53283g;

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantLock f53284h;

    /* renamed from: i, reason: collision with root package name */
    public final Condition f53285i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f53286j;

    public d7(final C4942i c4942i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f53284h = reentrantLock;
        this.f53285i = reentrantLock.newCondition();
        this.f53286j = false;
        this.f53277a = c4942i;
        this.f53278b = new C4930g3(c4942i);
        V.h(new Runnable() { // from class: io.seon.androidsdk.service.V6
            @Override // java.lang.Runnable
            public final void run() {
                d7.this.k(c4942i);
            }
        });
        V.h(new Runnable() { // from class: io.seon.androidsdk.service.W6
            @Override // java.lang.Runnable
            public final void run() {
                d7.t(C4942i.this);
            }
        });
    }

    public static JSONObject h(InterfaceC4966l... interfaceC4966lArr) {
        JSONObject jSONObject = new JSONObject();
        for (InterfaceC4966l interfaceC4966l : interfaceC4966lArr) {
            AbstractC4950j abstractC4950j = (AbstractC4950j) interfaceC4966l;
            abstractC4950j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Map b10 = abstractC4950j.b();
            try {
                ((Map) abstractC4950j.f53367a.get(abstractC4950j.f53369c)).put("experimental", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable unused) {
            }
            if (b10 != null) {
                for (Map.Entry entry : b10.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Collection) {
                        value = V.e((Collection) value);
                    } else if (value instanceof Map) {
                        value = V.f((Map) value);
                    } else if (value != null && value.getClass().isArray() && value.getClass().getComponentType() == String.class) {
                        p(jSONObject, str, new JSONArray((Collection) Arrays.asList((String[]) value)));
                    }
                    p(jSONObject, str, value);
                }
            }
        }
        return jSONObject;
    }

    public static void p(JSONObject jSONObject, String str, Object obj) {
        if (obj == null) {
            jSONObject.put(str, JSONObject.NULL);
        } else {
            jSONObject.put(str, obj);
        }
    }

    public static byte[] q(String str, boolean z10) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(str.getBytes());
                    gZIPOutputStream.finish();
                    if (!z10) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    try {
                        SeonNT seonNT = f53276m;
                        int e10 = (seonNT != null ? seonNT.e() : 0) + 96;
                        if (byteArray2.length >= 10 && byteArray2[0] == 31 && byteArray2[1] == -117) {
                            byteArray2[9] = (byte) (e10 & 255);
                        }
                    } catch (Throwable unused) {
                    }
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray2;
                } finally {
                }
            } finally {
            }
        } catch (Exception unused2) {
            return str.getBytes();
        }
    }

    public static void t(C4942i c4942i) {
        f53276m = new SeonNT(c4942i.f53349b);
    }

    public static String w() {
        try {
            String[] split = "6.8.6".split("-")[0].split("\\.");
            return String.format(Locale.US, "%s%02d%02d%02d", "02", Integer.valueOf((split.length > 0 ? Integer.parseInt(split[0]) : 0) % 100), Integer.valueOf((split.length > 1 ? Integer.parseInt(split[1]) : 0) % 100), Integer.valueOf((split.length > 2 ? Integer.parseInt(split[2]) : 0) % 100));
        } catch (Exception unused) {
            return null;
        }
    }

    public final synchronized String e() {
        try {
            if (f53275l == null) {
                SharedPreferences sharedPreferences = this.f53277a.f53349b.getSharedPreferences("PREF_UNIQUE_ID", 0);
                String string = sharedPreferences.getString("PREF_UNIQUE_ID", null);
                f53275l = string;
                if (string == null) {
                    f53275l = UUID.randomUUID().toString();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("PREF_UNIQUE_ID", f53275l);
                    edit.apply();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f53275l;
    }

    public final String f(String str, JSONObject jSONObject) {
        String str2;
        try {
            JSONObject jSONObject2 = new JSONObject();
            this.f53277a.getClass();
            p(jSONObject2, "source", "android-6.8.6");
            p(jSONObject2, "request_id", str);
            p(jSONObject2, "battery_total_capacity", jSONObject.get("battery_total_capacity"));
            p(jSONObject2, "emulator_trigger_cause", "");
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            String encodeToString = Base64.encodeToString(bArr, 2);
            byte[] q10 = q(jSONObject2.toString(), false);
            P6 p62 = this.f53277a.f53350c;
            String str3 = new String(Base64.encode(p62.f53107b.encrypt(p62.f53106a, q10, q10.length, bArr, 1), 2));
            StringBuilder sb2 = new StringBuilder("Android;");
            C4942i c4942i = this.f53277a;
            synchronized (c4942i) {
                str2 = c4942i.f53351d;
            }
            sb2.append(str2);
            sb2.append(";");
            sb2.append(encodeToString);
            sb2.append(";");
            sb2.append(str3);
            return sb2.toString();
        } catch (Exception e10) {
            V.j("DCReq", e10);
            return null;
        }
    }

    public final /* synthetic */ void i(long j10, JSONObject jSONObject, boolean z10, ArrayList arrayList, String str) {
        this.f53282f = z10;
        this.f53280d = arrayList;
        this.f53281e = str;
        try {
            p(jSONObject, "performance_emulator", Long.valueOf(System.currentTimeMillis() - j10));
        } catch (Exception unused) {
        }
    }

    public final void j(Jh.a aVar) {
        this.f53278b.f53310h.z(aVar);
    }

    public final void k(C4942i c4942i) {
        this.f53283g = new L6(c4942i.f53349b);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:173)(24:115|(1:117)|120|(1:122)|123|124|(1:172)|128|(1:130)|131|(1:168)|138|(1:140)|141|(1:143)|144|145|146|(4:148|149|150|151)(1:163)|152|(1:154)|155|156|157)|145|146|(0)(0)|152|(0)|155|156|157) */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04dc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04dd, code lost:
    
        r2 = "behaviour_results";
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0413 A[Catch: Exception -> 0x00d1, d -> 0x00d4, JSONException -> 0x00d7, TryCatch #9 {d -> 0x00d4, JSONException -> 0x00d7, Exception -> 0x00d1, blocks: (B:12:0x0050, B:15:0x00c3, B:17:0x00dc, B:20:0x00e4, B:22:0x00f0, B:25:0x00f9, B:27:0x0108, B:28:0x00fe, B:31:0x0110, B:34:0x0117, B:36:0x0123, B:38:0x012b, B:40:0x0137, B:43:0x013e, B:45:0x014a, B:48:0x0152, B:50:0x015e, B:53:0x0165, B:57:0x0175, B:59:0x0180, B:61:0x018d, B:63:0x01cc, B:65:0x01d0, B:66:0x01df, B:69:0x01ef, B:71:0x01fb, B:73:0x0202, B:75:0x020c, B:77:0x0212, B:80:0x0218, B:82:0x021c, B:83:0x0224, B:85:0x022b, B:87:0x0235, B:89:0x023b, B:92:0x0241, B:94:0x02c1, B:95:0x02d1, B:97:0x02d7, B:99:0x02ec, B:100:0x02fe, B:102:0x0304, B:103:0x0316, B:105:0x031c, B:108:0x032e, B:120:0x03d3, B:122:0x0413, B:123:0x0417, B:126:0x0433, B:128:0x0444, B:130:0x044a, B:131:0x044e, B:134:0x0463, B:136:0x0469, B:138:0x0474, B:140:0x0491, B:141:0x0494, B:143:0x04a2, B:144:0x04a5, B:152:0x04e8, B:154:0x04ee, B:155:0x04f2, B:161:0x04e3, B:167:0x0512, B:168:0x046f, B:170:0x043b, B:172:0x0441, B:180:0x0513, B:181:0x0516, B:182:0x02e5, B:146:0x04bb, B:148:0x04c1, B:151:0x04d4, B:110:0x0366, B:113:0x039e, B:115:0x03a2, B:118:0x03ca, B:173:0x03c4, B:176:0x03ce), top: B:11:0x0050, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x044a A[Catch: Exception -> 0x00d1, d -> 0x00d4, JSONException -> 0x00d7, TryCatch #9 {d -> 0x00d4, JSONException -> 0x00d7, Exception -> 0x00d1, blocks: (B:12:0x0050, B:15:0x00c3, B:17:0x00dc, B:20:0x00e4, B:22:0x00f0, B:25:0x00f9, B:27:0x0108, B:28:0x00fe, B:31:0x0110, B:34:0x0117, B:36:0x0123, B:38:0x012b, B:40:0x0137, B:43:0x013e, B:45:0x014a, B:48:0x0152, B:50:0x015e, B:53:0x0165, B:57:0x0175, B:59:0x0180, B:61:0x018d, B:63:0x01cc, B:65:0x01d0, B:66:0x01df, B:69:0x01ef, B:71:0x01fb, B:73:0x0202, B:75:0x020c, B:77:0x0212, B:80:0x0218, B:82:0x021c, B:83:0x0224, B:85:0x022b, B:87:0x0235, B:89:0x023b, B:92:0x0241, B:94:0x02c1, B:95:0x02d1, B:97:0x02d7, B:99:0x02ec, B:100:0x02fe, B:102:0x0304, B:103:0x0316, B:105:0x031c, B:108:0x032e, B:120:0x03d3, B:122:0x0413, B:123:0x0417, B:126:0x0433, B:128:0x0444, B:130:0x044a, B:131:0x044e, B:134:0x0463, B:136:0x0469, B:138:0x0474, B:140:0x0491, B:141:0x0494, B:143:0x04a2, B:144:0x04a5, B:152:0x04e8, B:154:0x04ee, B:155:0x04f2, B:161:0x04e3, B:167:0x0512, B:168:0x046f, B:170:0x043b, B:172:0x0441, B:180:0x0513, B:181:0x0516, B:182:0x02e5, B:146:0x04bb, B:148:0x04c1, B:151:0x04d4, B:110:0x0366, B:113:0x039e, B:115:0x03a2, B:118:0x03ca, B:173:0x03c4, B:176:0x03ce), top: B:11:0x0050, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0491 A[Catch: Exception -> 0x00d1, d -> 0x00d4, JSONException -> 0x00d7, TryCatch #9 {d -> 0x00d4, JSONException -> 0x00d7, Exception -> 0x00d1, blocks: (B:12:0x0050, B:15:0x00c3, B:17:0x00dc, B:20:0x00e4, B:22:0x00f0, B:25:0x00f9, B:27:0x0108, B:28:0x00fe, B:31:0x0110, B:34:0x0117, B:36:0x0123, B:38:0x012b, B:40:0x0137, B:43:0x013e, B:45:0x014a, B:48:0x0152, B:50:0x015e, B:53:0x0165, B:57:0x0175, B:59:0x0180, B:61:0x018d, B:63:0x01cc, B:65:0x01d0, B:66:0x01df, B:69:0x01ef, B:71:0x01fb, B:73:0x0202, B:75:0x020c, B:77:0x0212, B:80:0x0218, B:82:0x021c, B:83:0x0224, B:85:0x022b, B:87:0x0235, B:89:0x023b, B:92:0x0241, B:94:0x02c1, B:95:0x02d1, B:97:0x02d7, B:99:0x02ec, B:100:0x02fe, B:102:0x0304, B:103:0x0316, B:105:0x031c, B:108:0x032e, B:120:0x03d3, B:122:0x0413, B:123:0x0417, B:126:0x0433, B:128:0x0444, B:130:0x044a, B:131:0x044e, B:134:0x0463, B:136:0x0469, B:138:0x0474, B:140:0x0491, B:141:0x0494, B:143:0x04a2, B:144:0x04a5, B:152:0x04e8, B:154:0x04ee, B:155:0x04f2, B:161:0x04e3, B:167:0x0512, B:168:0x046f, B:170:0x043b, B:172:0x0441, B:180:0x0513, B:181:0x0516, B:182:0x02e5, B:146:0x04bb, B:148:0x04c1, B:151:0x04d4, B:110:0x0366, B:113:0x039e, B:115:0x03a2, B:118:0x03ca, B:173:0x03c4, B:176:0x03ce), top: B:11:0x0050, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04a2 A[Catch: Exception -> 0x00d1, d -> 0x00d4, JSONException -> 0x00d7, TryCatch #9 {d -> 0x00d4, JSONException -> 0x00d7, Exception -> 0x00d1, blocks: (B:12:0x0050, B:15:0x00c3, B:17:0x00dc, B:20:0x00e4, B:22:0x00f0, B:25:0x00f9, B:27:0x0108, B:28:0x00fe, B:31:0x0110, B:34:0x0117, B:36:0x0123, B:38:0x012b, B:40:0x0137, B:43:0x013e, B:45:0x014a, B:48:0x0152, B:50:0x015e, B:53:0x0165, B:57:0x0175, B:59:0x0180, B:61:0x018d, B:63:0x01cc, B:65:0x01d0, B:66:0x01df, B:69:0x01ef, B:71:0x01fb, B:73:0x0202, B:75:0x020c, B:77:0x0212, B:80:0x0218, B:82:0x021c, B:83:0x0224, B:85:0x022b, B:87:0x0235, B:89:0x023b, B:92:0x0241, B:94:0x02c1, B:95:0x02d1, B:97:0x02d7, B:99:0x02ec, B:100:0x02fe, B:102:0x0304, B:103:0x0316, B:105:0x031c, B:108:0x032e, B:120:0x03d3, B:122:0x0413, B:123:0x0417, B:126:0x0433, B:128:0x0444, B:130:0x044a, B:131:0x044e, B:134:0x0463, B:136:0x0469, B:138:0x0474, B:140:0x0491, B:141:0x0494, B:143:0x04a2, B:144:0x04a5, B:152:0x04e8, B:154:0x04ee, B:155:0x04f2, B:161:0x04e3, B:167:0x0512, B:168:0x046f, B:170:0x043b, B:172:0x0441, B:180:0x0513, B:181:0x0516, B:182:0x02e5, B:146:0x04bb, B:148:0x04c1, B:151:0x04d4, B:110:0x0366, B:113:0x039e, B:115:0x03a2, B:118:0x03ca, B:173:0x03c4, B:176:0x03ce), top: B:11:0x0050, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04c1 A[Catch: a -> 0x04da, Exception -> 0x04dc, TRY_LEAVE, TryCatch #2 {Exception -> 0x04dc, blocks: (B:146:0x04bb, B:148:0x04c1), top: B:145:0x04bb }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04ee A[Catch: Exception -> 0x00d1, d -> 0x00d4, JSONException -> 0x00d7, TryCatch #9 {d -> 0x00d4, JSONException -> 0x00d7, Exception -> 0x00d1, blocks: (B:12:0x0050, B:15:0x00c3, B:17:0x00dc, B:20:0x00e4, B:22:0x00f0, B:25:0x00f9, B:27:0x0108, B:28:0x00fe, B:31:0x0110, B:34:0x0117, B:36:0x0123, B:38:0x012b, B:40:0x0137, B:43:0x013e, B:45:0x014a, B:48:0x0152, B:50:0x015e, B:53:0x0165, B:57:0x0175, B:59:0x0180, B:61:0x018d, B:63:0x01cc, B:65:0x01d0, B:66:0x01df, B:69:0x01ef, B:71:0x01fb, B:73:0x0202, B:75:0x020c, B:77:0x0212, B:80:0x0218, B:82:0x021c, B:83:0x0224, B:85:0x022b, B:87:0x0235, B:89:0x023b, B:92:0x0241, B:94:0x02c1, B:95:0x02d1, B:97:0x02d7, B:99:0x02ec, B:100:0x02fe, B:102:0x0304, B:103:0x0316, B:105:0x031c, B:108:0x032e, B:120:0x03d3, B:122:0x0413, B:123:0x0417, B:126:0x0433, B:128:0x0444, B:130:0x044a, B:131:0x044e, B:134:0x0463, B:136:0x0469, B:138:0x0474, B:140:0x0491, B:141:0x0494, B:143:0x04a2, B:144:0x04a5, B:152:0x04e8, B:154:0x04ee, B:155:0x04f2, B:161:0x04e3, B:167:0x0512, B:168:0x046f, B:170:0x043b, B:172:0x0441, B:180:0x0513, B:181:0x0516, B:182:0x02e5, B:146:0x04bb, B:148:0x04c1, B:151:0x04d4, B:110:0x0366, B:113:0x039e, B:115:0x03a2, B:118:0x03ca, B:173:0x03c4, B:176:0x03ce), top: B:11:0x0050, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Boolean bool) {
        final JSONObject jSONObject;
        JSONObject jSONObject2;
        long currentTimeMillis;
        ExecutorService newFixedThreadPool;
        String str;
        String str2;
        Double valueOf;
        ArrayList arrayList;
        String F10;
        String str3;
        C5016r2 c5016r2;
        Throwable th2;
        String str4;
        String str5;
        Object e10;
        this.f53284h.lock();
        while (this.f53286j) {
            try {
                try {
                    this.f53285i.await();
                } catch (Exception unused) {
                    Thread.currentThread().interrupt();
                    this.f53284h.unlock();
                    return;
                }
            } finally {
                this.f53284h.unlock();
            }
        }
        C4930g3 c4930g3 = this.f53278b;
        this.f53284h.unlock();
        s();
        long currentTimeMillis2 = System.currentTimeMillis();
        V.v();
        V.w();
        String j10 = this.f53277a.j();
        boolean c10 = this.f53278b.b().T() != null ? this.f53278b.b().T().c() : false;
        try {
            Map e11 = c4930g3.a().e();
            Map e12 = c4930g3.g().e();
            Map e13 = c4930g3.h().e();
            Map e14 = c4930g3.d().e();
            Map e15 = c4930g3.f().e();
            Map e16 = c4930g3.i().e();
            Map e17 = c4930g3.k().e();
            Map e18 = c4930g3.b().e();
            Map e19 = c4930g3.j().e();
            Map e20 = c4930g3.e().e();
            boolean z10 = c10;
            Map e21 = c4930g3.l().e();
            jSONObject = new JSONObject();
            String[] strArr = C4985n2.f53439m;
            for (int i10 = 0; i10 < 17; i10++) {
                String str6 = strArr[i10];
                p(jSONObject, str6, e11.get(str6));
            }
            String[] strArr2 = T.f53143i;
            int i11 = 0;
            while (i11 < 9) {
                String str7 = strArr2[i11];
                String[] strArr3 = strArr2;
                if (!"enabled_accessibility_apps".equals(str7) && !"interfering_apps".equals(str7)) {
                    e10 = e12.get(str7);
                    p(jSONObject, str7, e10);
                    i11++;
                    strArr2 = strArr3;
                }
                e10 = V.e((Collection) e12.get(str7));
                p(jSONObject, str7, e10);
                i11++;
                strArr2 = strArr3;
            }
            String[] strArr4 = L1.f53016h;
            for (int i12 = 0; i12 < 6; i12++) {
                String str8 = strArr4[i12];
                p(jSONObject, str8, e13.get(str8));
            }
            String[] strArr5 = M4.f53052j;
            for (int i13 = 0; i13 < 17; i13++) {
                String str9 = strArr5[i13];
                p(jSONObject, str9, e14.get(str9));
            }
            String[] strArr6 = e7.f53293f;
            for (int i14 = 0; i14 < 4; i14++) {
                String str10 = strArr6[i14];
                p(jSONObject, str10, e15.get(str10));
            }
            String[] strArr7 = C4890b3.f53240j;
            for (int i15 = 0; i15 < 10; i15++) {
                String str11 = strArr7[i15];
                p(jSONObject, str11, e16.get(str11));
            }
            String[] strArr8 = V0.f53169k;
            for (int i16 = 0; i16 < 6; i16++) {
                String str12 = strArr8[i16];
                p(jSONObject, str12, e17.get(str12));
            }
            if (e18 != null) {
                jSONObject2 = new JSONObject();
                String[] strArr9 = C4939h4.f53330t;
                for (int i17 = 0; i17 < 8; i17++) {
                    String str13 = strArr9[i17];
                    p(jSONObject2, str13, e18.get(str13));
                }
            } else {
                jSONObject2 = null;
            }
            p(jSONObject, "device_location", jSONObject2);
            Jh.a T10 = this.f53278b.b().T();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(ViewProps.ENABLED, T10.c());
            jSONObject3.put("timeout_ms", T10.a());
            jSONObject3.put("prefetch", T10.d());
            jSONObject3.put("max_cache_age", T10.b());
            p(jSONObject, "geolocation_config", jSONObject3);
            p(jSONObject, "location_timestamp", Long.valueOf((jSONObject2 == null || jSONObject2 == JSONObject.NULL) ? -1L : ((Long) jSONObject2.get(EventKeys.TIMESTAMP)).longValue()));
            String[] strArr10 = T4.f53155f;
            for (int i18 = 0; i18 < 2; i18++) {
                String str14 = strArr10[i18];
                p(jSONObject, str14, e19.get(str14));
            }
            for (String str15 : C5036t6.f53495i) {
                Object obj = e20.get(str15);
                if (obj instanceof Collection) {
                    obj = V.e((Collection) obj);
                }
                p(jSONObject, str15, obj);
            }
            if (C5071y1.f53561j == null) {
                C5071y1.f53561j = C5071y1.h(C5071y1.f53560i);
            }
            for (String str16 : C5071y1.f53561j) {
                Object obj2 = e21.get(str16);
                if (obj2 instanceof Collection) {
                    obj2 = V.e((Collection) obj2);
                }
                p(jSONObject, str16, obj2);
            }
            p(jSONObject, "app_guid", e());
            p(jSONObject, "build_id", Build.ID);
            p(jSONObject, "build_manufacturer", Build.MANUFACTURER);
            p(jSONObject, "build_number", Build.DISPLAY);
            p(jSONObject, "build_time", Long.valueOf(Build.TIME / 1000));
            p(jSONObject, "session_id", j10);
            this.f53277a.getClass();
            p(jSONObject, "source", "android-6.8.6");
            this.f53277a.getClass();
            JSONObject h10 = h(c4930g3.a(), c4930g3.d(), c4930g3.i(), c4930g3.f(), c4930g3.g(), c4930g3.h(), c4930g3.k(), c4930g3.e());
            if (z10) {
                JSONObject h11 = h(c4930g3.b());
                Iterator<String> keys = h11.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    h10.put(next, h11.get(next));
                }
            } else {
                h10.put("experimental_device_location", JSONObject.NULL);
            }
            p(jSONObject, "experimental_fields", h10);
            HashMap hashMap = new HashMap();
            Iterator it = c4930g3.c().iterator();
            while (it.hasNext()) {
                AbstractC4950j abstractC4950j = (AbstractC4950j) it.next();
                for (String str17 : abstractC4950j.d().keySet()) {
                    hashMap.put(str17, abstractC4950j.d().get(str17));
                }
            }
            p(jSONObject, "performance_probes", V.f(hashMap));
            final long currentTimeMillis3 = System.currentTimeMillis();
            C4938h3.a(this.f53277a.i(), jSONObject).c(new InterfaceC4922f3() { // from class: io.seon.androidsdk.service.Y6
                @Override // io.seon.androidsdk.service.InterfaceC4922f3
                public final void a(boolean z11, ArrayList arrayList2, String str18) {
                    d7.this.i(currentTimeMillis3, jSONObject, z11, arrayList2, str18);
                }
            });
            this.f53277a.getClass();
            currentTimeMillis = System.currentTimeMillis();
            newFixedThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
            try {
                try {
                    String uuid = UUID.randomUUID().toString();
                    p(jSONObject, "request_id", uuid);
                    c5016r2 = (C5016r2) newFixedThreadPool.submit(new CallableC4898c3(new C5001p2(j10, f(uuid, jSONObject)), this.f53277a.h())).get(this.f53277a.h(), TimeUnit.MILLISECONDS);
                } catch (Exception e22) {
                    f53274k.b(e22);
                }
            } finally {
                newFixedThreadPool.shutdown();
            }
        } catch (Kh.d e23) {
            throw e23;
        } catch (JSONException e24) {
            f53274k.c(e24, 6);
            this.f53279c = null;
        } catch (Exception e25) {
            Lh.a aVar = f53274k;
            aVar.c(e25, 6);
            this.f53279c = null;
            aVar.c(e25, 6);
        }
        try {
            if (c5016r2 != null && (str5 = c5016r2.f53479a) != null) {
                p(jSONObject, "dynamic_evaluator_results", str5);
                p(jSONObject, "performance_network_call", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                if (c5016r2.f53479a.isEmpty()) {
                    str4 = "DCEmptyResult";
                    th2 = null;
                }
                newFixedThreadPool.shutdown();
                p(jSONObject, "is_emulator", Boolean.valueOf(this.f53282f));
                p(jSONObject, "emulator_trigger_causes", V.e(this.f53280d));
                p(jSONObject, "predicted_emulator_engine", this.f53281e);
                p(jSONObject, "version_code", w());
                p(jSONObject, "performance_exec_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                if (!jSONObject.has("media_drm_id")) {
                    p(jSONObject, "media_drm_id", null);
                }
                str = (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.Z6
                    @Override // io.seon.androidsdk.service.InterfaceC4990o
                    public final Object a() {
                        String string;
                        string = jSONObject.getString("device_id");
                        return string;
                    }
                });
                str2 = (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.a7
                    @Override // io.seon.androidsdk.service.InterfaceC4990o
                    public final Object a() {
                        String string;
                        string = jSONObject.getString("media_drm_id");
                        return string;
                    }
                });
                if ((str != null || str.equals("null")) && str2 != null && !str2.equals("null")) {
                    p(jSONObject, "device_id", str2);
                }
                if (!jSONObject.has("device_id")) {
                    p(jSONObject, "device_id", null);
                }
                String str18 = (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.b7
                    @Override // io.seon.androidsdk.service.InterfaceC4990o
                    public final Object a() {
                        String string;
                        string = jSONObject.getString("true_device_id_source");
                        return string;
                    }
                });
                if (jSONObject.has("true_device_id_source") || str18 == null || str18.isEmpty() || str18.equals("null")) {
                    p(jSONObject, "true_device_id_source", "l0f60b08-156b-4szd-9ca0-756a7af17ba7");
                }
                p(jSONObject, "core_int", O4.a(jSONObject));
                valueOf = Double.valueOf(c4930g3.d().t());
                arrayList = M1.f53048c;
                if (!arrayList.contains(valueOf)) {
                    arrayList.add(valueOf);
                }
                F10 = c4930g3.d().F();
                if (!arrayList.contains(F10)) {
                    arrayList.add(F10);
                }
                p(jSONObject, "device_hash", M1.a(jSONObject));
                p(jSONObject, "port_scan_result", V.e(AbstractC4914e3.a()));
                if (bool.booleanValue()) {
                    str3 = "behaviour_results";
                } else {
                    v();
                    str3 = "behaviour_results";
                    try {
                        p(jSONObject, str3, V.f(this.f53283g.l()));
                    } catch (Exception e26) {
                        e = e26;
                        V.j("bhvrfp", e);
                        if (!jSONObject.has(str3)) {
                        }
                        p(jSONObject, "stored_errors", V.e(V.u()));
                        V.x();
                        p(jSONObject, "comm_errors", V.e(V.o()));
                        this.f53279c = jSONObject;
                        V.g();
                        return;
                    }
                }
                if (!jSONObject.has(str3)) {
                    p(jSONObject, str3, null);
                }
                p(jSONObject, "stored_errors", V.e(V.u()));
                V.x();
                p(jSONObject, "comm_errors", V.e(V.o()));
                this.f53279c = jSONObject;
                V.g();
                return;
            }
            th2 = null;
            p(jSONObject, "dynamic_evaluator_results", null);
            str4 = "DCFailure";
            if (bool.booleanValue()) {
            }
            if (!jSONObject.has(str3)) {
            }
            p(jSONObject, "stored_errors", V.e(V.u()));
            V.x();
            p(jSONObject, "comm_errors", V.e(V.o()));
            this.f53279c = jSONObject;
            V.g();
            return;
        } catch (Kh.a e27) {
            throw e27;
        }
        V.j(str4, th2);
        newFixedThreadPool.shutdown();
        p(jSONObject, "is_emulator", Boolean.valueOf(this.f53282f));
        p(jSONObject, "emulator_trigger_causes", V.e(this.f53280d));
        p(jSONObject, "predicted_emulator_engine", this.f53281e);
        p(jSONObject, "version_code", w());
        p(jSONObject, "performance_exec_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
        if (!jSONObject.has("media_drm_id")) {
        }
        str = (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.Z6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                String string;
                string = jSONObject.getString("device_id");
                return string;
            }
        });
        str2 = (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.a7
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                String string;
                string = jSONObject.getString("media_drm_id");
                return string;
            }
        });
        if (str != null) {
        }
        p(jSONObject, "device_id", str2);
        if (!jSONObject.has("device_id")) {
        }
        String str182 = (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.b7
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                String string;
                string = jSONObject.getString("true_device_id_source");
                return string;
            }
        });
        if (jSONObject.has("true_device_id_source")) {
        }
        p(jSONObject, "true_device_id_source", "l0f60b08-156b-4szd-9ca0-756a7af17ba7");
        p(jSONObject, "core_int", O4.a(jSONObject));
        valueOf = Double.valueOf(c4930g3.d().t());
        arrayList = M1.f53048c;
        if (!arrayList.contains(valueOf)) {
        }
        F10 = c4930g3.d().F();
        if (!arrayList.contains(F10)) {
        }
        p(jSONObject, "device_hash", M1.a(jSONObject));
        p(jSONObject, "port_scan_result", V.e(AbstractC4914e3.a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2 A[Catch: d -> 0x001c, InterruptedException -> 0x00d4, TryCatch #0 {InterruptedException -> 0x00d4, blocks: (B:26:0x00b8, B:28:0x00c2, B:30:0x00cb), top: B:25:0x00b8, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df A[Catch: d -> 0x001c, TryCatch #1 {d -> 0x001c, blocks: (B:3:0x000e, B:5:0x0011, B:11:0x002b, B:24:0x00b5, B:26:0x00b8, B:28:0x00c2, B:30:0x00cb, B:36:0x00d4, B:39:0x00b2, B:42:0x00df, B:43:0x00e6, B:44:0x0016, B:47:0x0020), top: B:2:0x000e, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Boolean bool, InterfaceC4910e interfaceC4910e, String str, ExecutorService executorService) {
        String str2;
        TimeUnit timeUnit;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            l(bool);
            try {
                jSONObject2 = this.f53279c;
            } catch (JSONException e10) {
                f53274k.c(e10, 6);
            }
            if (jSONObject2 == null) {
                str2 = null;
                if (str2 != null) {
                    throw new Kh.d("Fingerprint could not be generated");
                }
                if (interfaceC4910e == null) {
                    return;
                }
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                String encodeToString = Base64.encodeToString(bArr, 2);
                byte[] q10 = q(str2, true);
                P6 p62 = this.f53277a.f53350c;
                String str3 = "Android;" + str + ";" + encodeToString + ";" + new String(Base64.encode(p62.f53107b.encrypt(p62.f53106a, q10, q10.length, bArr, 1), 2));
                try {
                    if ((interfaceC4910e instanceof InterfaceC4918f) && this.f53279c.has("device_location") && (jSONObject = this.f53279c.getJSONObject("device_location")) != JSONObject.NULL && jSONObject.has("status")) {
                        String string = jSONObject.getString("status");
                        int statusCode = GeolocationProbe$LocationStatus.valueOf(string).getStatusCode();
                        if (!GeolocationProbe$LocationStatus.SUCCESS.toString().equals(string)) {
                            ((InterfaceC4918f) interfaceC4910e).a(str3, statusCode);
                            executorService.shutdown();
                            timeUnit = TimeUnit.SECONDS;
                            if (executorService.awaitTermination(3L, timeUnit)) {
                                executorService.shutdownNow();
                                if (executorService.awaitTermination(3L, timeUnit)) {
                                    return;
                                }
                                f53274k.a("Pool didn't terminate", 5);
                                return;
                            }
                            return;
                        }
                    }
                    timeUnit = TimeUnit.SECONDS;
                    if (executorService.awaitTermination(3L, timeUnit)) {
                    }
                } catch (InterruptedException unused) {
                    executorService.shutdownNow();
                    Thread.currentThread().interrupt();
                    return;
                }
                interfaceC4910e.b(str3);
                executorService.shutdown();
            } else {
                str2 = jSONObject2.toString(0);
                if (str2 != null) {
                }
            }
        } catch (Kh.d e11) {
            f53274k.b(e11);
        }
    }

    public final void n(final String str, final InterfaceC4910e interfaceC4910e, final Boolean bool) {
        if (str == null || str.isEmpty()) {
            throw new Kh.e();
        }
        Context context = this.f53277a.f53349b;
        if (context == null) {
            throw new Kh.b();
        }
        if (!V.k(context, "android.permission.INTERNET")) {
            throw new Kh.c();
        }
        final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        newSingleThreadExecutor.submit(new Runnable() { // from class: io.seon.androidsdk.service.X6
            @Override // java.lang.Runnable
            public final void run() {
                d7.this.m(bool, interfaceC4910e, str, newSingleThreadExecutor);
            }
        });
    }

    public final void o(ExecutorService executorService) {
        C4930g3 c4930g3 = new C4930g3(this.f53277a);
        Jh.a aVar = this.f53278b.f53310h.f53340g;
        if (aVar != null) {
            c4930g3.f53310h.z(aVar);
        }
        this.f53284h.lock();
        try {
            this.f53278b = c4930g3;
            this.f53286j = false;
            this.f53285i.signalAll();
            this.f53284h.unlock();
            executorService.shutdown();
        } catch (Throwable th2) {
            this.f53284h.unlock();
            throw th2;
        }
    }

    public final void s() {
        this.f53284h.lock();
        try {
            if (this.f53286j) {
                this.f53284h.unlock();
                return;
            }
            this.f53286j = true;
            this.f53284h.unlock();
            final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            newSingleThreadExecutor.submit(new Runnable() { // from class: io.seon.androidsdk.service.c7
                @Override // java.lang.Runnable
                public final void run() {
                    d7.this.o(newSingleThreadExecutor);
                }
            });
        } catch (Exception unused) {
            this.f53284h.unlock();
        }
    }

    public final void v() {
        try {
            this.f53283g.E();
        } catch (Kh.a e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }
}
