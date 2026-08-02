package ei;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
public abstract class i {
    public static final JsonElement a(C c10, String key, String str) {
        Intrinsics.checkNotNullParameter(c10, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return c10.b(key, j.c(str));
    }

    public static final JsonElement b(C c10, String key, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(c10, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        C c11 = new C();
        builderAction.invoke(c11);
        return c10.b(key, c11.a());
    }
}
