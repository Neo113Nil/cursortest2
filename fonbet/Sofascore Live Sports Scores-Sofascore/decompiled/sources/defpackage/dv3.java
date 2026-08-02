package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.Country;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class dv3 {
    public static final ArrayList a = CollectionsKt.w0(zu3.z0, zu3.y0);

    public static Country a(String str) {
        Object obj;
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.c(((Country) obj).getIso2Alpha(), str)) {
                break;
            }
        }
        return (Country) obj;
    }

    public static Country b(Integer num) {
        Object obj;
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (CollectionsKt.R(((Country) obj).getMccList(), num)) {
                break;
            }
        }
        return (Country) obj;
    }

    public static String c() {
        String iso2Alpha;
        Country e = e();
        return (e == null || (iso2Alpha = e.getIso2Alpha()) == null) ? "XX" : iso2Alpha;
    }

    public static String d(Integer num) {
        Object obj;
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (CollectionsKt.R(((Country) obj).getMccList(), num)) {
                break;
            }
        }
        Country country = (Country) obj;
        if (country != null) {
            return country.getIso2Alpha();
        }
        return null;
    }

    public static Country e() {
        return b(Integer.valueOf(ke0.c));
    }

    public static String f(Context context) {
        String str;
        SharedPreferences d;
        context.getClass();
        Country e = e();
        if (e == null || (str = e.getIso2Alpha()) == null) {
            str = "XX";
        }
        if (e == null || !e.getHasRegions()) {
            return str;
        }
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        String string = sharedPreferences.getString("REGION_USER_LAST_REGION", null);
        if (string != null) {
            return lnb.o(str, "-", string);
        }
        return null;
    }
}
