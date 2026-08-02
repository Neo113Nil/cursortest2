package fi;

import ei.AbstractC4212b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes5.dex */
public class M extends AbstractC4289e {

    /* renamed from: g, reason: collision with root package name */
    public final Map f46698g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(AbstractC4212b json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f46698g = new LinkedHashMap();
    }

    @Override // di.d1, ci.d
    public void C(bi.f descriptor, int i10, Zh.p serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f46757d.j()) {
            super.C(descriptor, i10, serializer, obj);
        }
    }

    @Override // fi.AbstractC4289e
    public JsonElement s0() {
        return new JsonObject(this.f46698g);
    }

    @Override // fi.AbstractC4289e
    public void w0(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f46698g.put(key, element);
    }

    public final Map x0() {
        return this.f46698g;
    }
}
