package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles;

import K1.T;
import P1.AbstractC3809p;
import P1.C3810q;
import P1.C3815w;
import P1.C3816x;
import P1.F;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.R$font;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/TextStyles;", "", "<init>", "()V", "LP1/p;", "onestRegular", "LP1/p;", "onestBold", "LK1/T;", "ozonTextAppearanceBody500medium", "LK1/T;", "getOzonTextAppearanceBody500medium", "()LK1/T;", "bodyL", "getBodyL", "bodyM", "getBodyM", "headL", "getHeadL", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextStyles {

    @NotNull
    public static final TextStyles INSTANCE = new TextStyles();

    @NotNull
    private static final T bodyL;

    @NotNull
    private static final T bodyM;

    @NotNull
    private static final T headL;

    @NotNull
    private static final AbstractC3809p onestBold;

    @NotNull
    private static final AbstractC3809p onestRegular;

    @NotNull
    private static final T ozonTextAppearanceBody500medium;

    static {
        F f7;
        F f11;
        C3816x a11 = C3810q.a(C3815w.a(R$font.onest_regular, null, 14));
        onestRegular = a11;
        C3816x a12 = C3810q.a(C3815w.a(R$font.onest_bold, null, 14));
        onestBold = a12;
        long d11 = Hj0.T.d(16);
        f7 = F.f21505c;
        ozonTextAppearanceBody500medium = new T(0L, d11, f7, a11, Hj0.T.d(0), 0, Hj0.T.f(24.0f, 4294967296L), null, 0, 16645977);
        bodyL = new T(0L, Hj0.T.d(16), null, a11, Hj0.T.f(0.15f, 4294967296L), 0, 0L, null, 0, 16777053);
        bodyM = new T(0L, Hj0.T.d(14), null, a11, Hj0.T.c(0.2d), 0, 0L, null, 0, 16777053);
        long d12 = Hj0.T.d(24);
        f11 = F.f21507e;
        headL = new T(0L, d12, f11, a12, Hj0.T.f(0.4f, 4294967296L), 0, 0L, null, 0, 16777049);
    }

    private TextStyles() {
    }

    @NotNull
    public final T getBodyL() {
        return bodyL;
    }

    @NotNull
    public final T getBodyM() {
        return bodyM;
    }

    @NotNull
    public final T getHeadL() {
        return headL;
    }

    @NotNull
    public final T getOzonTextAppearanceBody500medium() {
        return ozonTextAppearanceBody500medium;
    }
}
