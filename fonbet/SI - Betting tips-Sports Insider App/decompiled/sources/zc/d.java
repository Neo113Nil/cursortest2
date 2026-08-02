package zc;

import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import java.util.List;
import kotlin.collections.u;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import te.k0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {
    public static final List a() {
        return u.f("AED", "AUD", "BDT", "BGN", "BOB", "BRL", "CAD", "CHF", "CLP", "COP", "CRC", "CZK", "DKK", "DZD", "EGP", "EUR", "GBP", "GEL", "GHS", "HKD", "HRK", "HUF", "IDR", "ILS", "INR", "IQD", "JOD", "JPY", "KES", "KRW", "KZT", "LKR", "MAD", "MMK", "MOP", "MXN", "MYR", "NGN", "NOK", "NZD", "PEN", "PHP", "PKR", "PLN", "PYG", "QAR", "RUB", "RON", "RSD", "SAR", "SEK", "SGD", "THB", "TRY", "TWD", "TZS", "UAH", "USD", "VND", "ZAR");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(int i5, String str, Throwable ex) {
        Comparable comparable = null;
        Object[] objArr = 0;
        String str2 = (i5 & 2) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(ex, "ex");
        jg.d dVar = MyApp.f6830c;
        lg.e eVar = m0.f9201a;
        c0.t(dVar, lg.d.f20063c, null, new ge.f((Object) ex, comparable, str2, (Continuation) (objArr == true ? 1 : 0), 18), 2);
    }

    public static void c(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        jg.d dVar = MyApp.f6830c;
        lg.e eVar = m0.f9201a;
        c0.t(dVar, lg.d.f20063c, null, new k0(message, str, null, 4), 2);
    }
}
