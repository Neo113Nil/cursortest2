package bo.app;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ia implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f25567a;

    public ia(JSONArray jSONArray) {
        this.f25567a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f25567a.opt(((Number) obj).intValue()) instanceof JSONObject);
    }
}
