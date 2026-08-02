package fi;

import ei.AbstractC4212b;
import ei.C4213c;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public final class Q extends M {

    /* renamed from: h, reason: collision with root package name */
    public String f46707h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f46708i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(AbstractC4212b json, Function1 nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f46708i = true;
    }

    @Override // fi.M, fi.AbstractC4289e
    public JsonElement s0() {
        return new JsonObject(x0());
    }

    @Override // fi.M, fi.AbstractC4289e
    public void w0(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (!this.f46708i) {
            Map x02 = x0();
            String str = this.f46707h;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tag");
                str = null;
            }
            x02.put(str, element);
            this.f46708i = true;
            return;
        }
        if (element instanceof JsonPrimitive) {
            this.f46707h = ((JsonPrimitive) element).a();
            this.f46708i = false;
        } else {
            if (element instanceof JsonObject) {
                throw C.d(ei.D.f46068a.getDescriptor());
            }
            if (!(element instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            throw C.d(C4213c.f46083a.getDescriptor());
        }
    }
}
