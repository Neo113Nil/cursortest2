package ru.ozon.uni.ozi.theme;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/ozi/theme/OziTheme;", "", "<init>", "()V", "Lru/ozon/uni/ozi/theme/OziTypography;", "typography", "Lru/ozon/uni/ozi/theme/OziTypography;", "getTypography", "()Lru/ozon/uni/ozi/theme/OziTypography;", "Lru/ozon/uni/core/compose/tokens/UniResourceIcons;", "icons", "Lru/ozon/uni/core/compose/tokens/UniResourceIcons;", "getIcons", "()Lru/ozon/uni/core/compose/tokens/UniResourceIcons;", "Lru/ozon/uni/core/compose/tokens/UniPaddings;", "paddings", "Lru/ozon/uni/core/compose/tokens/UniPaddings;", "getPaddings", "()Lru/ozon/uni/core/compose/tokens/UniPaddings;", "Lru/ozon/uni/core/compose/tokens/UniRadii;", "cornerRadius", "Lru/ozon/uni/core/compose/tokens/UniRadii;", "getCornerRadius", "()Lru/ozon/uni/core/compose/tokens/UniRadii;", "Lru/ozon/uni/ozi/theme/OziColorScheme;", "getColors", "(LS0/k;I)Lru/ozon/uni/ozi/theme/OziColorScheme;", "colors", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziTheme {
    public static final int $stable;

    @NotNull
    private static final UniRadii cornerRadius;

    @NotNull
    private static final UniResourceIcons icons;

    @NotNull
    private static final UniPaddings paddings;

    @NotNull
    public static final OziTheme INSTANCE = new OziTheme();

    @NotNull
    private static final OziTypography typography = OziTypographyKt.getDefaultOziTypography();

    static {
        UniTheme uniTheme = UniTheme.INSTANCE;
        icons = uniTheme.getIcons();
        paddings = uniTheme.getPaddings();
        cornerRadius = uniTheme.getRadii();
        $stable = UniRadii.$stable | UniPaddings.$stable | UniResourceIcons.$stable;
    }

    private OziTheme() {
    }

    @NotNull
    public final OziColorScheme getColors(InterfaceC3967k interfaceC3967k, int i11) {
        return (OziColorScheme) interfaceC3967k.m(OziThemeKt.getLocalOziColors());
    }

    @NotNull
    public final UniRadii getCornerRadius() {
        return cornerRadius;
    }

    @NotNull
    public final UniResourceIcons getIcons() {
        return icons;
    }

    @NotNull
    public final UniPaddings getPaddings() {
        return paddings;
    }

    @NotNull
    public final OziTypography getTypography() {
        return typography;
    }
}
