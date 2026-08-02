package ru.ozon.uni.core.compose.theme;

import S0.B1;
import S0.G0;
import S0.InterfaceC3967k;
import kl0.C7692c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.tokens.UniColorTokenExtKt;
import ru.ozon.uni.core.models.UniColorToken;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0015\u0010\n\u001a\u00020\u0007*\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0015\u0010\f\u001a\u00020\u0007*\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"LS0/G0;", "Lru/ozon/uni/core/compose/theme/UniColorScheme;", "LocalUniColorScheme", "LS0/G0;", "getLocalUniColorScheme", "()LS0/G0;", "Lru/ozon/uni/core/models/UniColorToken;", "Ll1/Z;", "getNotThemedColor", "(Lru/ozon/uni/core/models/UniColorToken;LS0/k;I)J", "notThemedColor", "getThemedColor", "themedColor", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniCompositionLocalKt {

    @NotNull
    private static final G0<UniColorScheme> LocalUniColorScheme = new B1(new C7692c());

    @NotNull
    public static final G0<UniColorScheme> getLocalUniColorScheme() {
        return LocalUniColorScheme;
    }

    public static final long getNotThemedColor(@NotNull UniColorToken uniColorToken, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(uniColorToken, "<this>");
        return ((UniColorScheme) interfaceC3967k.m(LocalUniColorScheme)).getIsDark() ? UniColorTokenExtKt.getDarkColor(uniColorToken) : UniColorTokenExtKt.getLightColor(uniColorToken);
    }

    public static final long getThemedColor(@NotNull UniColorToken uniColorToken, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(uniColorToken, "<this>");
        Function1 function1 = UniThemeColorAttrsMapKt.getUniThemeColorAttrsMap().get(uniColorToken);
        C7807Z c7807z = function1 == null ? null : (C7807Z) function1.invoke(interfaceC3967k.m(LocalUniColorScheme));
        return c7807z == null ? getNotThemedColor(uniColorToken, interfaceC3967k, i11 & 14) : c7807z.w();
    }
}
