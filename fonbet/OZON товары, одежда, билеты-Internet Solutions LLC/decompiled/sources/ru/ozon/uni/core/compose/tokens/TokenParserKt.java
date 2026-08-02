package ru.ozon.uni.core.compose.tokens;

import K1.T;
import S0.InterfaceC3967k;
import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.models.UniGradientToken;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.models.UniRadiusToken;
import ru.ozon.uni.core.models.UniTypographyToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0006\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0015\u0010\t\u001a\u0017\u0010\u0016\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\f\u001a\u0017\u0010\u0017\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u000f\u001a\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"", "Ll1/Z;", "hexToColor", "(Ljava/lang/String;)Ll1/Z;", "tokenId", "parseColorToken", "(Ljava/lang/String;LS0/k;I)Ll1/Z;", "LK1/T;", "parseTypographyToken", "(Ljava/lang/String;)LK1/T;", "Ll1/Q;", "parseGradientToken", "(Ljava/lang/String;LS0/k;I)Ll1/Q;", "Lq1/b;", "parseIconToken", "(Ljava/lang/String;LS0/k;I)Lq1/b;", "LZ1/h;", "parsePaddingToken", "(Ljava/lang/String;)LZ1/h;", "parseRadiusToken", "tokenToColor", "tokenToTextStyle", "tokenToGradient", "tokenToIcon", "tokenToPadding", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TokenParserKt {
    public static final C7807Z hexToColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return C7807Z.m(C7811b0.b(Color.parseColor(str)));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final C7807Z parseColorToken(String str, InterfaceC3967k interfaceC3967k, int i11) {
        if (str == null) {
            return null;
        }
        String obj = h.z0(str).toString();
        if (obj.length() == 0) {
            return null;
        }
        if (h.f0(obj, '#')) {
            return hexToColor(obj);
        }
        UniColorToken byId = UniTheme.INSTANCE.getColorTokens().getById(obj);
        if (byId == null) {
            return null;
        }
        return C7807Z.m(UniCompositionLocalKt.getThemedColor(byId, interfaceC3967k, 0));
    }

    public static final AbstractC7799Q parseGradientToken(String str, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.B(-910786683);
        if (str != null) {
            UniGradientToken byId = UniTheme.INSTANCE.getGradients().getById(str);
            interfaceC3967k.B(-643404002);
            r3 = byId != null ? TokensExtKt.getGradient(byId, interfaceC3967k, 0) : null;
            interfaceC3967k.K();
        }
        interfaceC3967k.K();
        return r3;
    }

    public static final AbstractC8972b parseIconToken(String str, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.B(-1330917857);
        if (str != null) {
            UniIconToken byId = UniTheme.INSTANCE.getIconTokens().getById(str);
            interfaceC3967k.B(-1111128751);
            r3 = byId != null ? TokensExtKt.getIcon(byId, interfaceC3967k, 0) : null;
            interfaceC3967k.K();
        }
        interfaceC3967k.K();
        return r3;
    }

    public static final Z1.h parsePaddingToken(String str) {
        UniPaddingToken byId;
        if (str == null || (byId = UniTheme.INSTANCE.getPaddingTokens().getById(str)) == null) {
            return null;
        }
        return Z1.h.a(TokensExtKt.getDp(byId));
    }

    public static final Z1.h parseRadiusToken(String str) {
        UniRadiusToken byId;
        if (str == null || (byId = UniTheme.INSTANCE.getRadiusTokens().getById(str)) == null) {
            return null;
        }
        return Z1.h.a(TokensExtKt.getDp(byId));
    }

    public static final T parseTypographyToken(String str) {
        UniTypographyToken byId;
        if (str == null || (byId = UniTheme.INSTANCE.getTypographyTokens().getById(str)) == null) {
            return null;
        }
        return TokensExtKt.getTextStyle(byId);
    }

    public static final C7807Z tokenToColor(String str, InterfaceC3967k interfaceC3967k, int i11) {
        return parseColorToken(str, interfaceC3967k, i11 & 14);
    }

    public static final AbstractC7799Q tokenToGradient(String str, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.B(-1451157053);
        AbstractC7799Q parseGradientToken = parseGradientToken(str, interfaceC3967k, i11 & 14);
        interfaceC3967k.K();
        return parseGradientToken;
    }

    public static final AbstractC8972b tokenToIcon(String str, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.B(737427435);
        AbstractC8972b parseIconToken = parseIconToken(str, interfaceC3967k, i11 & 14);
        interfaceC3967k.K();
        return parseIconToken;
    }

    public static final Z1.h tokenToPadding(String str) {
        return parsePaddingToken(str);
    }

    public static final T tokenToTextStyle(String str) {
        return parseTypographyToken(str);
    }
}
