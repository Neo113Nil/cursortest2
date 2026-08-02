package pd;

import com.sports.insider.ui.activities.MainActivity;
import eg.m0;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class o extends FunctionReferenceImpl implements vf.b {
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        MainActivity mainActivity = (MainActivity) this.receiver;
        Set set = MainActivity.J0;
        mainActivity.getClass();
        lg.e eVar = m0.f9201a;
        Object A = eg.c0.A(jg.q.f18523a, new m2.f0(mainActivity, (Integer) obj2, (String) obj3, intValue, (Continuation) null), (Continuation) obj4);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }
}
