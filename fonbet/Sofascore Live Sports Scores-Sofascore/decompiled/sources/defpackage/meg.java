package defpackage;

import android.os.Build;
import com.appsflyer.internal.i;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.Q3;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class meg extends ijg {
    public final /* synthetic */ int a;
    public JSONObject b;

    public meg(String str, String str2, String str3, String str4, int i, Boolean bool, String str5, String str6, bjg bjgVar, Boolean bool2, String str7, Boolean bool3, int i2, String str8, Boolean bool4, int i3, int i4, int i5, zig zigVar, int i6) {
        int i7;
        int i8;
        int i9;
        this.a = 7;
        String str9 = Build.MODEL;
        String str10 = Build.VERSION.RELEASE;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("name", "displaysdk");
            hashMap.put("version", "8.6.1");
            hashMap.put("versionId", 3131);
            if (!str.isEmpty()) {
                hashMap.put("coreVersion", str);
            }
            hashMap.put("platformName", "android");
            hashMap.put("platformVersion", str10);
            hashMap.put("deviceName", str9);
            if (i4 == 6) {
                hashMap.put("deviceConnectionType", Q3.b);
            } else if (i4 > 0 && i4 < 6) {
                hashMap.put("deviceConnectionType", "cell");
            }
            int C = wt3.C(i);
            if (C == 1) {
                hashMap.put("uidType", "advertisingId");
            } else if (C != 2) {
                hashMap.put("uidType", "unknown");
            } else {
                hashMap.put("uidType", "customId");
            }
            hashMap.put("uidLimitedTracking", bool);
            hashMap.put("appName", str2);
            hashMap.put(U3.j.W, str3);
            hashMap.put("bundleId", str4);
            int i10 = -1;
            if (i6 != 0) {
                if (i6 == 1) {
                    i9 = 0;
                } else if (i6 == 2) {
                    i9 = 1;
                } else if (i6 == 3) {
                    i9 = 2;
                } else {
                    if (i6 != 4) {
                        throw null;
                    }
                    i9 = -1;
                }
                hashMap.put("appFramework", Integer.valueOf(i9));
            } else {
                hashMap.put("appFramework", -1);
            }
            hashMap.put("GPPString", str5);
            hashMap.put("GPPSIDString", str6);
            hashMap.put("GPPVersion", Integer.valueOf(bjgVar.a));
            hashMap.put("GPPStringValid", bool2);
            hashMap.put(InMobiSdk.IM_GDPR_CONSENT_IAB, str7);
            hashMap.put("TCFStringValid", bool3);
            if (i2 == 1) {
                i7 = 1;
            } else if (i2 == 2) {
                i7 = 2;
            } else {
                if (i2 != 3) {
                    throw null;
                }
                i7 = -1;
            }
            hashMap.put("TCFVersion", Integer.valueOf(i7));
            hashMap.put("CCPAString", str8);
            hashMap.put("CCPAStringValid", bool4);
            if (i3 == 1) {
                i8 = 1;
            } else {
                if (i3 != 2) {
                    throw null;
                }
                i8 = -1;
            }
            hashMap.put("CCPAVersion", Integer.valueOf(i8));
            if (i5 == 1) {
                i10 = 0;
            } else if (i5 == 2) {
                i10 = 1;
            } else if (i5 != 3) {
                throw null;
            }
            hashMap.put("implementationType", Integer.valueOf(i10));
            hashMap.put("deviceType", Integer.valueOf(zigVar.a));
            JSONObject f0 = hkg.f0(hashMap);
            if (f0.length() > 0) {
                this.b = f0;
            }
        } catch (JSONException unused) {
            fjg.c().f(1);
        }
    }

    @Override // defpackage.ijg
    public final JSONObject a() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.ijg
    public final String b() {
        switch (this.a) {
            case 0:
                return U3.i.I0;
            case 1:
                return "mediation";
            case 2:
                return "smart";
            case 3:
                return "feedback";
            case 4:
                return "error";
            case 5:
                return "measure";
            case 6:
                return HandleInvocationsFromAdViewer.KEY_OMID;
            case 7:
                return "sdk";
            default:
                return "error";
        }
    }

    public meg(String str, String str2, int i) {
        this.a = 6;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("vendorName", str);
        }
        if (str2 != null) {
            hashMap.put("JSLibraryURL", str2);
        }
        hashMap.put("implementationType", Integer.valueOf(wt3.C(i)));
        try {
            JSONObject f0 = hkg.f0(hashMap);
            if (f0.length() > 0) {
                this.b = f0;
            }
        } catch (JSONException unused) {
            fjg.c().f(1);
        }
    }

    public meg(String str, String str2, String str3, String str4) {
        this.a = 4;
        HashMap l = i.l(PglCryptUtils.KEY_MESSAGE, str);
        if (str2 != null) {
            l.put("ad_response", str2);
        }
        if (str3 != null && !str3.isEmpty()) {
            l.put("adCallUrl", str3);
        }
        if (str4 != null && !str4.isEmpty()) {
            l.put("adCallJsonMessage", str4);
        }
        try {
            JSONObject f0 = hkg.f0(l);
            if (f0.length() > 0) {
                this.b = f0;
            }
        } catch (JSONException unused) {
            fjg.c().f(1);
        }
    }

    public /* synthetic */ meg(int i) {
        this.a = i;
    }

    public meg(LinkedHashMap linkedHashMap) {
        this.a = 5;
        try {
            JSONObject f0 = hkg.f0(linkedHashMap);
            if (f0.length() > 0) {
                this.b = f0;
            }
        } catch (JSONException unused) {
            fjg.c().f(1);
        }
    }
}
