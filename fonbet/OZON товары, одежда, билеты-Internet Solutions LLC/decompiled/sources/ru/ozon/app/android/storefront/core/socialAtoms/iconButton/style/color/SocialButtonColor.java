package ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.color;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Style;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/color/SocialButtonColor;", "", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;", "style", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;)V", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;", "getStyle", "()Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SocialButtonColor {

    @NotNull
    private final Style style;

    public SocialButtonColor(@NotNull Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.style = style;
    }

    @NotNull
    public final Style getStyle() {
        return this.style;
    }
}
