package ei;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes5.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final Map f46067a = new LinkedHashMap();

    public final JsonObject a() {
        return new JsonObject(this.f46067a);
    }

    public final JsonElement b(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return (JsonElement) this.f46067a.put(key, element);
    }
}
