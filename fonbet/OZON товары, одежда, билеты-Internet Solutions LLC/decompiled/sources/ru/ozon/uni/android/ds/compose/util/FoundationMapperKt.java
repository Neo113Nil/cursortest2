package ru.ozon.uni.android.ds.compose.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.models.UniRadiusToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0018\u0010\n\u001a\u00020\u0007*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u000b*\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u000e\u001a\u00020\u000b*\u0004\u0018\u00010\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "E", "cornerRadiusEnum", "Lru/ozon/uni/core/models/UniRadiusToken;", "cornerRadiusEnumToRadiusToken", "(Ljava/lang/Enum;)Lru/ozon/uni/core/models/UniRadiusToken;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "Lru/ozon/uni/core/models/UniPaddingToken;", "getToken", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)Lru/ozon/uni/core/models/UniPaddingToken;", "token", "LZ1/h;", "getDp", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)F", "dp", "Lru/ozon/uni/atoms/data/image/CornerRadius;", "(Lru/ozon/uni/atoms/data/image/CornerRadius;)F", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FoundationMapperKt {
    private static final <E extends Enum<?>> UniRadiusToken cornerRadiusEnumToRadiusToken(E e11) {
        String name = e11.name();
        if (Intrinsics.d(name, "NO_RADIUS")) {
            return UniTheme.INSTANCE.getRadiusTokens().getNone();
        }
        UniRadiusToken byId = UniTheme.INSTANCE.getRadiusTokens().getById(name);
        if (byId != null) {
            return byId;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final float getDp(CommonCellSettings.LayoutPadding layoutPadding) {
        UniPaddingToken token;
        if (layoutPadding == null || (token = getToken(layoutPadding)) == null) {
            return Float.NaN;
        }
        return TokensExtKt.getDp(token);
    }

    @NotNull
    public static final UniPaddingToken getToken(@NotNull CommonCellSettings.LayoutPadding layoutPadding) {
        Intrinsics.checkNotNullParameter(layoutPadding, "<this>");
        UniPaddingToken byId = UniTheme.INSTANCE.getPaddingTokens().getById(layoutPadding.toString());
        if (byId != null) {
            return byId;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final float getDp(CornerRadius cornerRadius) {
        UniRadiusToken cornerRadiusEnumToRadiusToken;
        if (cornerRadius == null || (cornerRadiusEnumToRadiusToken = cornerRadiusEnumToRadiusToken(cornerRadius)) == null) {
            return Float.NaN;
        }
        return TokensExtKt.getDp(cornerRadiusEnumToRadiusToken);
    }
}
