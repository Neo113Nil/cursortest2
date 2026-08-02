package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.Country;
import com.sofascore.model.Money;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o84 {
    public static final Set a = ph0.a0(new String[]{"EURO", "POUND", "DOLLAR"});
    public static final Set b;
    public static final Set c;

    static {
        List j = b.j(zu3.b, zu3.i, zu3.t, zu3.v, zu3.D, zu3.R, zu3.T, zu3.Y, zu3.a0, zu3.b0, zu3.e0, zu3.s, zu3.s0, zu3.v0, zu3.w0, zu3.x0);
        ArrayList arrayList = new ArrayList();
        Iterator it = j.iterator();
        while (it.hasNext()) {
            o13.v(((Country) it.next()).getMccList(), arrayList);
        }
        b = CollectionsKt.W0(arrayList);
        List c2 = a.c(zu3.u0);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = c2.iterator();
        while (it2.hasNext()) {
            o13.v(((Country) it2.next()).getMccList(), arrayList2);
        }
        c = CollectionsKt.W0(arrayList2);
    }

    public static String a(Context context, Money money, long j, int i) {
        if ((i & 4) != 0) {
            j = 0;
        }
        boolean z = (i & 8) == 0;
        context.getClass();
        money.getClass();
        return b(context, money, j) != null ? c(context, r3.longValue(), z, 12) : lnb.o(uxf.E(money.getValue(), 46, z), " ", money.getCurrency());
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Long b(Context context, Money money, long j) {
        Object u2gVar;
        int value;
        Map map;
        context.getClass();
        money.getClass();
        yea yeaVar = j58.a;
        e58 f = e58.f();
        f.getClass();
        String g = f.g("euro_conversion_historical_rates");
        if (g.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                uhi uhiVar = uhi.a;
                u2gVar = yeaVar.b(l98.W(new q79(uhiVar, new q79(uhiVar, c88.a, 1), 1)), g);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            Throwable a2 = w2g.a(u2gVar);
            if (a2 != null) {
                s38.a().c(a2);
            }
        }
        u2gVar = null;
        Map map2 = (Map) u2gVar;
        if (map2 == null) {
            map2 = lm5.a;
            map2.getClass();
        }
        Map map3 = (Map) map2.get("current");
        if (map3 == null) {
            return null;
        }
        if (j > 946684800 && (map = (Map) map2.get(String.valueOf(Instant.ofEpochSecond(j).atZone(ZoneOffset.UTC).getYear()))) != null) {
            map3 = map;
        }
        String d = d(context);
        if (c.o(money.getCurrency(), d, true)) {
            return Long.valueOf(money.getValue());
        }
        if (c.o(money.getCurrency(), "EUR", true)) {
            value = money.getValue();
        } else {
            Float f2 = (Float) map3.get(money.getCurrency());
            if (f2 == null) {
                return null;
            }
            value = (int) (money.getValue() / f2.floatValue());
        }
        if (d.equalsIgnoreCase("EUR")) {
            return Long.valueOf(value);
        }
        Float f3 = (Float) map3.get(d);
        if (f3 != null) {
            return Long.valueOf((long) (value * f3.floatValue()));
        }
        return null;
    }

    public static String c(Context context, double d, boolean z, int i) {
        boolean z2 = false;
        if ((i & 16) != 0) {
            z = false;
        }
        context.getClass();
        Locale locale = Locale.getDefault();
        Currency currency = Currency.getInstance(d(context));
        locale.getClass();
        currency.getClass();
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        DecimalFormat decimalFormat = currencyInstance instanceof DecimalFormat ? (DecimalFormat) currencyInstance : null;
        if (decimalFormat != null) {
            decimalFormat.setCurrency(currency);
            String pattern = decimalFormat.toPattern();
            pattern.getClass();
            int O = StringsKt.O(pattern, (char) 164, 0, 6);
            if (O != -1) {
                int length = pattern.length();
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        char charAt = pattern.charAt(i2);
                        if (charAt == '#' || charAt == '0') {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 != -1 && O > i2) {
                    z2 = true;
                }
            }
        }
        String E = uxf.E(d, 36, z);
        String e = e(context);
        return z2 ? lnb.o(E, " ", e) : e.concat(E);
    }

    public static String d(Context context) {
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
        String string = sharedPreferences.getString("PREF_CURRENCY", "EURO");
        return Intrinsics.c(string, "DOLLAR") ? "USD" : Intrinsics.c(string, "POUND") ? "GBP" : "EUR";
    }

    public static String e(Context context) {
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
        String string = sharedPreferences.getString("PREF_CURRENCY", "EURO");
        return Intrinsics.c(string, "DOLLAR") ? "$" : Intrinsics.c(string, "POUND") ? "£" : "€";
    }
}
