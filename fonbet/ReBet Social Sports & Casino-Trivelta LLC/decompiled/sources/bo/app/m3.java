package bo.app;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class m3 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f25742a;

    public m3(JSONArray jSONArray) {
        this.f25742a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.f25742a.get(((Number) obj).intValue());
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }
}
