package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.widget.Toast;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ke0 {
    public static Calendar a;
    public static final int b;
    public static int c;
    public static String d;
    public static Integer e;
    public static Toast f;
    public static String g;
    public static boolean h;
    public static boolean i;
    public static String j;
    public static boolean k;
    public static boolean l;
    public static final ArrayList m;
    public static final LinkedList n;

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        a = calendar;
        b = 15;
        c = c1c.a;
        m = new ArrayList();
        n = new LinkedList();
    }

    public static Integer a(Context context, boolean z) {
        Object u2gVar;
        int i2;
        Object u2gVar2;
        Integer intOrNull;
        SharedPreferences d2;
        context.getClass();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
        Integer num = e;
        if (num != null) {
            return num;
        }
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        int i3 = sharedPreferences.getInt("PREF_DEV_MODE_MCC_2", -100);
        if (i3 != -100) {
            Integer valueOf = Integer.valueOf(i3);
            e = valueOf;
            return valueOf;
        }
        String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = networkOperator != null ? StringsKt.toIntOrNull(networkOperator.substring(0, 3)) : null;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (w2g.a(u2gVar) != null) {
            if (z) {
                String simOperator = telephonyManager != null ? telephonyManager.getSimOperator() : null;
                if (simOperator != null) {
                    try {
                        intOrNull = StringsKt.toIntOrNull(simOperator.substring(0, 3));
                    } catch (Throwable th2) {
                        p2g p2gVar3 = w2g.b;
                        u2gVar2 = new u2g(th2);
                    }
                } else {
                    intOrNull = null;
                }
                u2gVar2 = intOrNull;
                i2 = (Integer) (u2gVar2 instanceof u2g ? null : u2gVar2);
            } else {
                i2 = 0;
            }
            u2gVar = i2;
        }
        Integer num2 = (Integer) u2gVar;
        e = num2;
        return num2;
    }

    public static String b(Context context) {
        SharedPreferences d2;
        context.getClass();
        String str = d;
        if (str != null) {
            return str;
        }
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        String string = sharedPreferences.getString("PREF_HOME_SPORT_V2", Sports.FOOTBALL);
        return string == null ? Sports.FOOTBALL : string;
    }

    public static int c() {
        return TimeZone.getDefault().getOffset(a.getTime().getTime()) / 1000;
    }

    public static String d(Context context) {
        SharedPreferences d2;
        context.getClass();
        String str = g;
        if (str == null || str.length() == 0) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    d2 = a5f.d(applicationContext);
                    uic.j = d2;
                }
                d2.getClass();
                sharedPreferences = d2;
            }
            String string = sharedPreferences.getString("INSTALLATION", "");
            g = string;
            if (string == null || string.length() == 0) {
                g = UUID.randomUUID().toString();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.getClass();
                edit.putString("INSTALLATION", g);
                edit.apply();
            }
        }
        String str2 = g;
        return str2 == null ? "" : str2;
    }

    public static void e(Context context) {
        Object u2gVar;
        Integer num;
        int intValue;
        List<Integer> mccList;
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
        int i2 = sharedPreferences.getInt("PREF_DEV_MODE_MCC", -100);
        if (i2 != -100) {
            c = i2;
            return;
        }
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences2 = a5f.d(applicationContext2);
                uic.j = sharedPreferences2;
            }
            sharedPreferences2.getClass();
        }
        String string = sharedPreferences2.getString("REGION_USER_COUNTRY_ALPHA", null);
        if (string == null || string.length() == 0) {
            string = null;
        }
        Country a2 = dv3.a(string);
        Integer num2 = (a2 == null || (mccList = a2.getMccList()) == null) ? null : (Integer) CollectionsKt.firstOrNull(mccList);
        if (num2 == null || num2.intValue() == 0) {
            num2 = null;
        }
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
            String simOperator = telephonyManager != null ? telephonyManager.getSimOperator() : null;
            if (simOperator != null) {
                try {
                    p2g p2gVar = w2g.b;
                    u2gVar = Integer.valueOf(Integer.parseInt(simOperator.substring(0, 3)));
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                if (w2g.a(u2gVar) != null) {
                    u2gVar = a(context, false);
                }
                num = (Integer) u2gVar;
            } else {
                num = a(context, false);
            }
            intValue = num != null ? num.intValue() : 0;
        }
        c = intValue;
    }

    public static void f(int i2, Context context) {
        context.getClass();
        g(context, context.getResources().getText(i2), 0);
    }

    public static void g(Context context, CharSequence charSequence, int i2) {
        context.getClass();
        Toast toast = f;
        if (toast == null) {
            toast = Toast.makeText(context.getApplicationContext(), charSequence, i2);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            toast.cancel();
            toast = Toast.makeText(context.getApplicationContext(), charSequence, i2);
            f = toast;
        } else {
            toast.setText(charSequence);
            toast.setDuration(i2);
        }
        if (i3 >= 30) {
            toast.addCallback(new je0());
        }
        toast.show();
    }
}
