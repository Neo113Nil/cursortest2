package defpackage;

import android.app.Application;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lay6;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ay6 extends q8 {
    public final wi7 e;
    public final bfk f;
    public final fdi g;
    public final jof h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay6(Application application, wi7 wi7Var, bfk bfkVar) {
        super(application);
        wi7Var.getClass();
        bfkVar.getClass();
        this.e = wi7Var;
        this.f = bfkVar;
        uj7 uj7Var = uj7.a;
        uee ueeVar = uee.g;
        ueeVar.getClass();
        fdi a = gdi.a(new zx6(uj7Var, ueeVar));
        this.g = a;
        this.h = un0.u(a);
    }

    public static Pair k(String str) {
        Regex regex = new Regex("(\\d{2})/(\\d{2})");
        if (!regex.f(str)) {
            Boolean bool = Boolean.FALSE;
            Integer intOrNull = StringsKt.toIntOrNull(iii.I(str));
            return new Pair(bool, Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0));
        }
        txb b = regex.b(str);
        if (b == null) {
            a70.r("Required value was null.");
            return null;
        }
        int parseInt = Integer.parseInt((String) ((sxb) b.a()).get(1));
        int parseInt2 = Integer.parseInt((String) ((sxb) b.a()).get(2));
        Boolean bool2 = Boolean.TRUE;
        if (parseInt < parseInt2) {
            parseInt = parseInt2;
        }
        return new Pair(bool2, Integer.valueOf(parseInt));
    }
}
