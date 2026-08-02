package rc;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import m2.f0;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class b0 {
    public static final za.k a(b0 b0Var) {
        b0Var.getClass();
        return (za.k) y3.m(za.k.class, null, 6);
    }

    public static CoroutineContext b() {
        eg.y yVar = new eg.y("YandexMetricUseCase");
        lg.e eVar = m0.f9201a;
        return kotlin.coroutines.e.c(yVar, lg.d.f20063c);
    }

    public final void c(String eventName, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        c0.t(MyApp.f6830c, b(), null, new f0(this, eventName, jSONObject, (Continuation) null, 13), 2);
    }

    public final Object d(JSONObject jSONObject, Continuation continuation) {
        Object i5 = c0.i(new me.y(this, jSONObject, null, 21), continuation);
        return i5 == lf.a.f20034a ? i5 : Unit.f19194a;
    }

    public final Object e(String str, JSONObject jSONObject, Continuation continuation) {
        Object i5 = c0.i(new ge.f(this, str, jSONObject, (Continuation) null, 13), continuation);
        return i5 == lf.a.f20034a ? i5 : Unit.f19194a;
    }
}
