package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class vfj {
    public static ufj a = ufj.c;
    public static final String b;

    static {
        b = Build.VERSION.SDK_INT > 28 ? "SYSTEM" : "LIGHT";
    }

    public static final void a(Context context, Function2 function2) {
        String str;
        SharedPreferences d;
        String str2;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        String string = sharedPreferences.getString("FIREBASE_THEME_PREF", null);
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences2 = a5f.d(applicationContext2);
                uic.j = sharedPreferences2;
            }
            sharedPreferences2.getClass();
        }
        String string2 = sharedPreferences2.getString("FIREBASE_THEME_MODE", null);
        if (string == null || string2 == null) {
            str = "new_user";
        } else if (string.equals("SYSTEM")) {
            ufj.b.getClass();
            str = lnb.o(string, "_", w9f.d(string2));
        } else {
            ufj.b.getClass();
            str = w9f.d(string2);
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        SharedPreferences sharedPreferences3 = uic.j;
        if (sharedPreferences3 == null) {
            Context applicationContext3 = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences3 = a5f.d(applicationContext3);
                uic.j = sharedPreferences3;
            }
            sharedPreferences3.getClass();
        }
        String string3 = sharedPreferences3.getString("PREF_THEME", b);
        ufj ufjVar = Intrinsics.c(string3, "LIGHT") ? ufj.c : Intrinsics.c(string3, "DARK") ? ufj.d : (context.getResources().getConfiguration().uiMode & 48) == 32 ? ufj.d : ufj.c;
        a = ufjVar;
        String obj = ufjVar.toString();
        if (!Intrinsics.c(string, string3) || !Intrinsics.c(string2, obj)) {
            SharedPreferences sharedPreferences4 = uic.j;
            if (sharedPreferences4 == null) {
                Context applicationContext4 = context.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext4);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences4 = d;
            }
            SharedPreferences.Editor edit = sharedPreferences4.edit();
            edit.getClass();
            edit.putString("FIREBASE_THEME_PREF", string3);
            edit.putString("FIREBASE_THEME_MODE", obj);
            Unit unit = Unit.a;
            edit.apply();
        }
        if (Intrinsics.c(string3, "SYSTEM")) {
            String lowerCase2 = string3.toLowerCase(locale);
            lowerCase2.getClass();
            str2 = lnb.o(lowerCase2, "_", a.a);
        } else {
            str2 = a.a;
        }
        if (!lowerCase.equals(str2)) {
            function2.invoke(lowerCase, str2);
        }
        if (Intrinsics.c(string3, "LIGHT")) {
            kb0.n(1);
            return;
        }
        if (Intrinsics.c(string3, "DARK")) {
            kb0.n(2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            kb0.n(-1);
        } else {
            kb0.n(3);
        }
    }
}
