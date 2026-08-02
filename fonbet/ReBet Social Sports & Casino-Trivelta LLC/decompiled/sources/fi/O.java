package fi;

import ei.AbstractC4212b;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
public final class O extends AbstractC4289e {

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f46702g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(AbstractC4212b json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f46702g = new ArrayList();
    }

    @Override // fi.AbstractC4289e, di.AbstractC4111r0
    public String b0(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // fi.AbstractC4289e
    public JsonElement s0() {
        return new JsonArray(this.f46702g);
    }

    @Override // fi.AbstractC4289e
    public void w0(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f46702g.add(Integer.parseInt(key), element);
    }
}
