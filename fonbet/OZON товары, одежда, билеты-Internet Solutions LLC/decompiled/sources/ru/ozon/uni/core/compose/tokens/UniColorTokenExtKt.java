package ru.ozon.uni.core.compose.tokens;

import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniColorToken;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/core/models/UniColorToken;", "Ll1/Z;", "getLightColor", "(Lru/ozon/uni/core/models/UniColorToken;)J", "lightColor", "getDarkColor", "darkColor", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniColorTokenExtKt {
    public static final long getDarkColor(@NotNull UniColorToken uniColorToken) {
        Intrinsics.checkNotNullParameter(uniColorToken, "<this>");
        return ((UniComposeColorToken) U.e(UniComposeColorTokensKt.getComposeColorTokenMap(), uniColorToken)).getDarkColor();
    }

    public static final long getLightColor(@NotNull UniColorToken uniColorToken) {
        Intrinsics.checkNotNullParameter(uniColorToken, "<this>");
        return ((UniComposeColorToken) U.e(UniComposeColorTokensKt.getComposeColorTokenMap(), uniColorToken)).getLightColor();
    }
}
