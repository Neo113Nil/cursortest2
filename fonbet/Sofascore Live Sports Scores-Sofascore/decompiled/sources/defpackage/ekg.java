package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ekg {
    public boolean a;
    public boolean b;
    public int c;
    public final Object d;

    public ekg(String str, boolean z) {
        int i = 1;
        this.a = true;
        this.b = z;
        this.c = 3;
        char[] charArray = str.toLowerCase().toCharArray();
        int length = charArray.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (!"abcdefghijklmnopqrstuvwxyz0123456789-_.".contains("" + charArray[i2])) {
                fjg.c().f(3);
                this.a = false;
                break;
            }
            i2++;
        }
        if (str.length() == 0) {
            this.a = false;
        }
        this.d = str;
        if (this.a) {
            int i3 = str.toCharArray()[0] - 'A';
            if (i3 != 1) {
                i = 2;
                if (i3 != 2) {
                    i = 3;
                }
            }
            this.c = i;
            if (i == 3) {
                this.a = false;
            }
        }
    }

    public boolean a(Context context) {
        SharedPreferences d = a5f.d(context);
        if (this.b) {
            return b(d, "IABGPP_TCFEU2_PurposesConsent", "IABGPP_TCFEU2_VendorConsent");
        }
        int i = -1;
        try {
            i = d.getInt("IABTCF_gdprApplies", -1);
        } catch (Exception unused) {
        }
        if (i == 1) {
            return b(d, "IABTCF_PurposeConsents", "IABTCF_VendorConsents");
        }
        return true;
    }

    public boolean b(SharedPreferences sharedPreferences, String str, String str2) {
        String str3;
        boolean z;
        boolean z2 = this.b;
        String str4 = null;
        try {
            str3 = sharedPreferences.getString(str2, null);
        } catch (Exception unused) {
            str3 = null;
        }
        if (str3 == null && z2) {
            throw new cjg("The GPP String have been badly implemented by the CMP. Reason: ".concat("This TCFEU2 String is coming from a GPP String, but the key " + str2 + " is either missing from SharedPreferences or invalid"));
        }
        try {
            str4 = sharedPreferences.getString(str, null);
        } catch (Exception unused2) {
        }
        if (str4 == null && z2) {
            throw new cjg("The GPP String have been badly implemented by the CMP. Reason: ".concat("This TCFEU2 String is coming from a GPP String, but the key " + str + " is either missing from SharedPreferences or invalid"));
        }
        try {
            boolean z3 = str3.charAt(44) == '1';
            if (str4.charAt(0) == '1' && str4.charAt(1) == '1' && str4.charAt(3) == '1' && str4.charAt(6) == '1') {
                if (str4.charAt(9) == '1') {
                    z = true;
                    return z3 && z;
                }
            }
            z = false;
            if (z3) {
                return false;
            }
        } catch (Exception unused3) {
            return false;
        }
    }

    public ekg(d4a d4aVar) {
        boolean z = false;
        this.c = 0;
        this.d = d4aVar;
        r38 r38Var = (r38) d4aVar.b;
        r38Var.a();
        SharedPreferences sharedPreferences = ((Application) r38Var.a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        boolean z2 = true;
        if (sharedPreferences.contains("fresh_install")) {
            z2 = sharedPreferences.getBoolean("fresh_install", true);
        } else {
            d4aVar.w("fresh_install", true);
        }
        this.b = z2;
        r38 r38Var2 = (r38) d4aVar.b;
        r38Var2.a();
        SharedPreferences sharedPreferences2 = ((Application) r38Var2.a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences2.contains("test_device")) {
            z = sharedPreferences2.getBoolean("test_device", false);
        } else {
            d4aVar.w("test_device", false);
        }
        this.a = z;
    }
}
