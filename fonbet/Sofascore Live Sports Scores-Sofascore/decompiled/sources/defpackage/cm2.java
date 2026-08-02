package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.ironsource.L6;
import com.ironsource.U3;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cm2 implements uxj {
    public final d4a a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final wy2 e;
    public final wy2 f;

    public cm2(Context context, wy2 wy2Var, wy2 wy2Var2) {
        lfa lfaVar = new lfa();
        sp0 sp0Var = sp0.a;
        lfaVar.a(et1.class, sp0Var);
        lfaVar.a(js0.class, sp0Var);
        zp0 zp0Var = zp0.a;
        lfaVar.a(tib.class, zp0Var);
        lfaVar.a(pu0.class, zp0Var);
        tp0 tp0Var = tp0.a;
        lfaVar.a(nx2.class, tp0Var);
        lfaVar.a(ks0.class, tp0Var);
        rp0 rp0Var = rp0.a;
        lfaVar.a(ey.class, rp0Var);
        lfaVar.a(hs0.class, rp0Var);
        yp0 yp0Var = yp0.a;
        lfaVar.a(pib.class, yp0Var);
        lfaVar.a(ou0.class, yp0Var);
        up0 up0Var = up0.a;
        lfaVar.a(hb3.class, up0Var);
        lfaVar.a(ls0.class, up0Var);
        xp0 xp0Var = xp0.a;
        lfaVar.a(fl6.class, xp0Var);
        lfaVar.a(hu0.class, xp0Var);
        wp0 wp0Var = wp0.a;
        lfaVar.a(el6.class, wp0Var);
        lfaVar.a(gu0.class, wp0Var);
        aq0 aq0Var = aq0.a;
        lfaVar.a(x9d.class, aq0Var);
        lfaVar.a(ru0.class, aq0Var);
        vp0 vp0Var = vp0.a;
        lfaVar.a(si6.class, vp0Var);
        lfaVar.a(fu0.class, vp0Var);
        lfaVar.d = true;
        this.a = new d4a(lfaVar, 2);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(zc2.c);
        this.e = wy2Var2;
        this.f = wy2Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(dmi.q("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (((defpackage.v9d) defpackage.v9d.a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final du0 a(du0 du0Var) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        c40 c = du0Var.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c.g;
        if (hashMap2 == null) {
            a70.r("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        c.h(L6.B, Build.MODEL);
        c.h("hardware", Build.HARDWARE);
        c.h(U3.i.G, Build.DEVICE);
        c.h("product", Build.PRODUCT);
        c.h("os-uild", Build.ID);
        c.h("manufacturer", Build.MANUFACTURER);
        c.h("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c.g;
        if (hashMap3 == null) {
            a70.r("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = w9d.a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c.g;
        if (hashMap4 == null) {
            a70.r("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = v9d.a;
                subtype = 100;
            }
            hashMap = (HashMap) c.g;
            if (hashMap != null) {
                a70.r("Property \"autoMetadata\" has not been set");
                return null;
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c.h("country", Locale.getDefault().getCountry());
            c.h("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            c.h("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                d7a.A("CctTransportBackend");
            }
            c.h("application_build", Integer.toString(i2));
            return c.i();
        }
        SparseArray sparseArray3 = v9d.a;
        subtype = 0;
        hashMap = (HashMap) c.g;
        if (hashMap != null) {
        }
    }
}
