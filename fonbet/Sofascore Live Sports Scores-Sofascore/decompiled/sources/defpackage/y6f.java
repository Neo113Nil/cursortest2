package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class y6f {
    public static final String a;

    static {
        String lowerCase = "MATCHES".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        a = lowerCase;
    }

    public static String a(Context context) {
        SharedPreferences d;
        context.getClass();
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
        String str = a;
        String string = sharedPreferences.getString("PREF_HOME_SCREEN", str);
        if (string == null) {
            string = str;
        }
        if (b().contains(string)) {
            return string;
        }
        str.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putString("PREF_HOME_SCREEN", str);
        edit.apply();
        return str;
    }

    public static ArrayList b() {
        kp5 kp5Var = z6f.g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : kp5Var) {
            if (((z6f) obj).b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String lowerCase = ((z6f) it.next()).name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList2.add(lowerCase);
        }
        return arrayList2;
    }

    public static boolean c(Context context, z6f z6fVar) {
        z6fVar.getClass();
        String a2 = a(context);
        String lowerCase = z6fVar.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return Intrinsics.c(a2, lowerCase);
    }
}
