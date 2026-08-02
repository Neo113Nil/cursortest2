package fi;

import Zh.InterfaceC1900a;
import ei.AbstractC4212b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public abstract class b0 {
    public static final Object a(AbstractC4212b json, JsonElement element, InterfaceC1900a deserializer) {
        ci.e g10;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (element instanceof JsonObject) {
            g10 = new L(json, (JsonObject) element, null, null, 12, null);
        } else if (element instanceof JsonArray) {
            g10 = new N(json, (JsonArray) element);
        } else {
            if (!(element instanceof ei.w) && !Intrinsics.areEqual(element, JsonNull.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            g10 = new G(json, (JsonPrimitive) element, null, 4, null);
        }
        return g10.H(deserializer);
    }

    public static final Object b(AbstractC4212b abstractC4212b, String discriminator, JsonObject element, InterfaceC1900a deserializer) {
        Intrinsics.checkNotNullParameter(abstractC4212b, "<this>");
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return new L(abstractC4212b, element, discriminator, deserializer.getDescriptor()).H(deserializer);
    }
}
