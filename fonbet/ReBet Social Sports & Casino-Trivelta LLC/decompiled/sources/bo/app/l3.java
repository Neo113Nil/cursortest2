package bo.app;

import java.util.Objects;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class l3 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f25693a;

    public l3(JSONArray jSONArray) {
        this.f25693a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(Objects.nonNull(this.f25693a.opt(((Number) obj).intValue())));
    }
}
