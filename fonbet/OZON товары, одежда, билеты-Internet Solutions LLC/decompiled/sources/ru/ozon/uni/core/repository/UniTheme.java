package ru.ozon.uni.core.repository;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.theme.UniColorScheme;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.core.compose.tokens.UniTypography;
import ru.ozon.uni.core.repository.implementation.UniColorTokenRepositoryImpl;
import ru.ozon.uni.core.repository.implementation.UniGradientTokenRepositoryImpl;
import ru.ozon.uni.core.repository.implementation.UniIconTokenRepositoryImpl;
import ru.ozon.uni.core.repository.implementation.UniPaddingTokenRepositoryImpl;
import ru.ozon.uni.core.repository.implementation.UniRadiusTokenRepositoryImpl;
import ru.ozon.uni.core.repository.implementation.UniTypographyTokenRepositoryImpl;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0011\u00109\u001a\u0002068G¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/uni/core/repository/UniTheme;", "", "<init>", "()V", "Lru/ozon/uni/core/repository/UniColorTokenRepository;", "colorTokens", "Lru/ozon/uni/core/repository/UniColorTokenRepository;", "getColorTokens", "()Lru/ozon/uni/core/repository/UniColorTokenRepository;", "Lru/ozon/uni/core/repository/UniTypographyTokenRepository;", "typographyTokens", "Lru/ozon/uni/core/repository/UniTypographyTokenRepository;", "getTypographyTokens", "()Lru/ozon/uni/core/repository/UniTypographyTokenRepository;", "Lru/ozon/uni/core/compose/tokens/UniTypography;", "typography", "Lru/ozon/uni/core/compose/tokens/UniTypography;", "getTypography", "()Lru/ozon/uni/core/compose/tokens/UniTypography;", "Lru/ozon/uni/core/repository/UniIconTokenRepository;", "iconTokens", "Lru/ozon/uni/core/repository/UniIconTokenRepository;", "getIconTokens", "()Lru/ozon/uni/core/repository/UniIconTokenRepository;", "Lru/ozon/uni/core/compose/tokens/UniResourceIcons;", "icons", "Lru/ozon/uni/core/compose/tokens/UniResourceIcons;", "getIcons", "()Lru/ozon/uni/core/compose/tokens/UniResourceIcons;", "Lru/ozon/uni/core/repository/UniRadiusTokenRepository;", "radiusTokens", "Lru/ozon/uni/core/repository/UniRadiusTokenRepository;", "getRadiusTokens", "()Lru/ozon/uni/core/repository/UniRadiusTokenRepository;", "Lru/ozon/uni/core/compose/tokens/UniRadii;", "radii", "Lru/ozon/uni/core/compose/tokens/UniRadii;", "getRadii", "()Lru/ozon/uni/core/compose/tokens/UniRadii;", "Lru/ozon/uni/core/repository/UniPaddingTokenRepository;", "paddingTokens", "Lru/ozon/uni/core/repository/UniPaddingTokenRepository;", "getPaddingTokens", "()Lru/ozon/uni/core/repository/UniPaddingTokenRepository;", "Lru/ozon/uni/core/compose/tokens/UniPaddings;", "paddings", "Lru/ozon/uni/core/compose/tokens/UniPaddings;", "getPaddings", "()Lru/ozon/uni/core/compose/tokens/UniPaddings;", "Lru/ozon/uni/core/repository/UniGradientTokenRepository;", "gradients", "Lru/ozon/uni/core/repository/UniGradientTokenRepository;", "getGradients", "()Lru/ozon/uni/core/repository/UniGradientTokenRepository;", "Lru/ozon/uni/core/compose/theme/UniColorScheme;", "getColors", "(LS0/k;I)Lru/ozon/uni/core/compose/theme/UniColorScheme;", "colors", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniTheme {
    public static final int $stable = 0;

    @NotNull
    public static final UniTheme INSTANCE = new UniTheme();

    @NotNull
    private static final UniColorTokenRepository colorTokens = UniColorTokenRepositoryImpl.INSTANCE;

    @NotNull
    private static final UniTypographyTokenRepository typographyTokens = UniTypographyTokenRepositoryImpl.INSTANCE;

    @NotNull
    private static final UniTypography typography = new UniTypography();

    @NotNull
    private static final UniIconTokenRepository iconTokens = UniIconTokenRepositoryImpl.INSTANCE;

    @NotNull
    private static final UniResourceIcons icons = new UniResourceIcons();

    @NotNull
    private static final UniRadiusTokenRepository radiusTokens = UniRadiusTokenRepositoryImpl.INSTANCE;

    @NotNull
    private static final UniRadii radii = new UniRadii();

    @NotNull
    private static final UniPaddingTokenRepository paddingTokens = UniPaddingTokenRepositoryImpl.INSTANCE;

    @NotNull
    private static final UniPaddings paddings = new UniPaddings();

    @NotNull
    private static final UniGradientTokenRepository gradients = UniGradientTokenRepositoryImpl.INSTANCE;

    private UniTheme() {
    }

    @NotNull
    public final UniColorTokenRepository getColorTokens() {
        return colorTokens;
    }

    @NotNull
    public final UniColorScheme getColors(InterfaceC3967k interfaceC3967k, int i11) {
        return (UniColorScheme) interfaceC3967k.m(UniCompositionLocalKt.getLocalUniColorScheme());
    }

    @NotNull
    public final UniGradientTokenRepository getGradients() {
        return gradients;
    }

    @NotNull
    public final UniIconTokenRepository getIconTokens() {
        return iconTokens;
    }

    @NotNull
    public final UniResourceIcons getIcons() {
        return icons;
    }

    @NotNull
    public final UniPaddingTokenRepository getPaddingTokens() {
        return paddingTokens;
    }

    @NotNull
    public final UniPaddings getPaddings() {
        return paddings;
    }

    @NotNull
    public final UniRadii getRadii() {
        return radii;
    }

    @NotNull
    public final UniRadiusTokenRepository getRadiusTokens() {
        return radiusTokens;
    }

    @NotNull
    public final UniTypography getTypography() {
        return typography;
    }

    @NotNull
    public final UniTypographyTokenRepository getTypographyTokens() {
        return typographyTokens;
    }
}
