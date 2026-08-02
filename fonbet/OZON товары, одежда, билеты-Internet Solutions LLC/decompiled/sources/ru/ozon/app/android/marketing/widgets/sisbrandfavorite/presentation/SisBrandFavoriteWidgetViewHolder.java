package ru.ozon.app.android.marketing.widgets.sisbrandfavorite.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.data.DynamicOnScrollColors;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.data.Options;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteButtonDelegateFactory;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegate;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonView;
import ru.ozon.app.android.storefront.navBar.v2.NavBarRepaintable;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0016\u0010 \u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/presentation/SisBrandFavoriteWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/presentation/SisBrandFavoriteVI;", "Lru/ozon/app/android/storefront/navBar/v2/NavBarRepaintable;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteButtonDelegateFactory;", "sisBrandFavoriteButtonDelegateFactory", "<init>", "(Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteButtonDelegateFactory;)V", "Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/Options;", "options", "", "setPaddings", "(Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/Options;)V", "", "alpha", "updateColorsByScroll", "(F)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/presentation/SisBrandFavoriteVI;Ll20/d;)V", "", "hasAlphaChangingFloor", "onNavbarConfigured", "(ZF)V", "onFloorAlphaChanged", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;", "navBarAlpha", "F", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegate;", "sisBrandFavoriteButtonDelegate", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegate;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SisBrandFavoriteWidgetViewHolder extends k<SisBrandFavoriteVI> implements NavBarRepaintable {
    private float navBarAlpha;

    @NotNull
    private final SisBrandFavoriteButtonDelegate sisBrandFavoriteButtonDelegate;

    @NotNull
    private final SisBrandFavoriteButtonView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SisBrandFavoriteWidgetViewHolder(@NotNull SisBrandFavoriteButtonView view, @NotNull ComposerReferences refs, @NotNull SisBrandFavoriteButtonDelegateFactory sisBrandFavoriteButtonDelegateFactory) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(sisBrandFavoriteButtonDelegateFactory, "sisBrandFavoriteButtonDelegateFactory");
        this.view = view;
        this.navBarAlpha = 1.0f;
        this.sisBrandFavoriteButtonDelegate = sisBrandFavoriteButtonDelegateFactory.create(view, this, refs);
    }

    private final void setPaddings(Options options) {
        Integer marginBottom;
        Integer marginRight;
        Integer marginTop;
        Integer marginLeft;
        SisBrandFavoriteButtonView sisBrandFavoriteButtonView = this.view;
        int i11 = 0;
        int px = (options == null || (marginLeft = options.getMarginLeft()) == null) ? 0 : ResourceExtKt.toPx(marginLeft.intValue());
        int px2 = (options == null || (marginTop = options.getMarginTop()) == null) ? 0 : ResourceExtKt.toPx(marginTop.intValue());
        int px3 = (options == null || (marginRight = options.getMarginRight()) == null) ? 0 : ResourceExtKt.toPx(marginRight.intValue());
        if (options != null && (marginBottom = options.getMarginBottom()) != null) {
            i11 = ResourceExtKt.toPx(marginBottom.intValue());
        }
        sisBrandFavoriteButtonView.setPadding(px, px2, px3, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateColorsByScroll(float alpha) {
        String iconTintColorExpanded;
        String iconTintColorCollapsed;
        String backgroundColorExpanded;
        SisBrandFavoriteButton favoriteButton;
        SisBrandFavoriteVI boundData = getBoundData();
        boolean isFavorite = (boundData == null || (favoriteButton = boundData.getFavoriteButton()) == null) ? false : favoriteButton.isFavorite();
        SisBrandFavoriteVI boundData2 = getBoundData();
        String str = null;
        DynamicOnScrollColors dynamicOnScrollFavoriteColors = boundData2 != null ? boundData2.getDynamicOnScrollFavoriteColors() : null;
        SisBrandFavoriteVI boundData3 = getBoundData();
        DynamicOnScrollColors dynamicOnScrollColors = boundData3 != null ? boundData3.getDynamicOnScrollColors() : null;
        if (isFavorite) {
            if (dynamicOnScrollFavoriteColors != null) {
                iconTintColorExpanded = dynamicOnScrollFavoriteColors.getIconTintColorExpanded();
            }
            iconTintColorExpanded = null;
        } else {
            if (dynamicOnScrollColors != null) {
                iconTintColorExpanded = dynamicOnScrollColors.getIconTintColorExpanded();
            }
            iconTintColorExpanded = null;
        }
        if (isFavorite) {
            if (dynamicOnScrollFavoriteColors != null) {
                iconTintColorCollapsed = dynamicOnScrollFavoriteColors.getIconTintColorCollapsed();
            }
            iconTintColorCollapsed = null;
        } else {
            if (dynamicOnScrollColors != null) {
                iconTintColorCollapsed = dynamicOnScrollColors.getIconTintColorCollapsed();
            }
            iconTintColorCollapsed = null;
        }
        if (isFavorite) {
            if (dynamicOnScrollFavoriteColors != null) {
                backgroundColorExpanded = dynamicOnScrollFavoriteColors.getBackgroundColorExpanded();
            }
            backgroundColorExpanded = null;
        } else {
            if (dynamicOnScrollColors != null) {
                backgroundColorExpanded = dynamicOnScrollColors.getBackgroundColorExpanded();
            }
            backgroundColorExpanded = null;
        }
        if (isFavorite) {
            if (dynamicOnScrollFavoriteColors != null) {
                str = dynamicOnScrollFavoriteColors.getBackgroundColorCollapsed();
            }
        } else if (dynamicOnScrollColors != null) {
            str = dynamicOnScrollColors.getBackgroundColorCollapsed();
        }
        this.view.updateColorsByScroll(alpha, isFavorite, iconTintColorExpanded, iconTintColorCollapsed, backgroundColorExpanded, str);
    }

    @Override // ru.ozon.app.android.storefront.navBar.v2.NavBarRepaintable
    public void onFloorAlphaChanged(float alpha) {
        this.navBarAlpha = alpha;
        SisBrandFavoriteVI boundData = getBoundData();
        if (boundData != null ? boundData.getHasDynamicColors() : false) {
            updateColorsByScroll(this.navBarAlpha);
        }
    }

    @Override // ru.ozon.app.android.storefront.navBar.v2.NavBarRepaintable
    public void onNavbarConfigured(boolean hasAlphaChangingFloor, float alpha) {
        if (hasAlphaChangingFloor) {
            SisBrandFavoriteVI boundData = getBoundData();
            if (boundData != null ? boundData.getHasDynamicColors() : false) {
                updateColorsByScroll(alpha);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SisBrandFavoriteVI item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.sisBrandFavoriteButtonDelegate.bind(item.getFavoriteButton(), new SisBrandFavoriteWidgetViewHolder$bind$1(item, this));
        setPaddings(item.getOptions());
    }
}
