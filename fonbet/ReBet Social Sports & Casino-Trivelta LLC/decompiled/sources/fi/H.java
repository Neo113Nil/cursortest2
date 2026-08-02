package fi;

import ei.AbstractC4212b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
public final class H extends AbstractC4289e {

    /* renamed from: g, reason: collision with root package name */
    public JsonElement f46689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(AbstractC4212b json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        Z("primitive");
    }

    @Override // fi.AbstractC4289e
    public JsonElement s0() {
        JsonElement jsonElement = this.f46689g;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // fi.AbstractC4289e
    public void w0(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (key != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.f46689g != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.f46689g = element;
        t0().invoke(element);
    }
}
