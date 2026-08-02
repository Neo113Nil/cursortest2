package defpackage;

import com.blaze.blazesdk.shared.exceptions.BlazeException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rwl {
    public static final rwl a = new rwl();

    public static final a6m a(Exception exc) {
        if (!(exc instanceof wi9)) {
            return exc instanceof SocketTimeoutException ? new e1n(exc.getMessage(), exc) : exc instanceof ConnectException ? new ttm(exc.getMessage(), exc) : exc instanceof UnknownHostException ? new ttm(exc.getMessage(), exc) : ((exc instanceof gka) || (exc instanceof NullPointerException)) ? new bx0(null, exc.getMessage(), exc, 1, null) : exc instanceof IllegalArgumentException ? new bx0(null, exc.getMessage(), exc, 1, null) : exc instanceof nga ? new uwm(null, exc.getMessage(), exc, 1, null) : exc instanceof BlazeException.a ? new azm(null, ((BlazeException.a) exc).a, exc, 1, null) : exc instanceof BlazeException.b ? new yha(null, ((BlazeException.b) exc).a, exc, 1, null) : new bx0(null, exc.getMessage(), exc, 1, null);
        }
        wi9 wi9Var = (wi9) exc;
        int i = wi9Var.a;
        String str = wi9Var.b;
        return i != 400 ? i != 401 ? i != 403 ? i != 404 ? i != 409 ? i != 422 ? i != 500 ? i != 503 ? new dom(Integer.valueOf(i), str, exc) : new s0n(Integer.valueOf(i), str, exc) : new f0n(Integer.valueOf(i), str, exc) : new mc2(Integer.valueOf(i), str, exc) : new fjm(Integer.valueOf(i), str, exc) : new num(Integer.valueOf(i), str, exc) : new rmm(Integer.valueOf(i), str, exc) : new n(Integer.valueOf(i), str, exc) : new hxl(Integer.valueOf(i), str, exc);
    }

    public static Object safeApiCall$default(rwl rwlVar, boolean z, Function1 function1, rq3 rq3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        rwlVar.getClass();
        hs4 hs4Var = z45.a;
        return xw3.R(hq4.c, new xsl(z, function1, null), rq3Var);
    }
}
