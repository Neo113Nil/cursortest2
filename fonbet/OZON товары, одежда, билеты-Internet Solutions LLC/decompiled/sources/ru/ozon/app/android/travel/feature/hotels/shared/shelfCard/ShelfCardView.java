package ru.ozon.app.android.travel.feature.hotels.shared.shelfCard;

import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.binders.BadgesBinder;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.binders.BottomContentBinder;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.binders.FavoriteBinder;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.binders.ImagesBinder;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;", "vo", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/J;", "owner", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "delegate", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardView$LayoutContainerMode;", "layoutContainerMode", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "favoritesForAuthorizedFeatureActivator", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "favoriteUnauthorizedClickDelegate", "setDependencies", "(Landroidx/lifecycle/J;Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardView$LayoutContainerMode;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;)V", "lifecycleOwner", "onAttach", "(Landroidx/lifecycle/J;)V", "onRecycle", "()V", "onDetach", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/binders/ImagesBinder;", "imagesBinder", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/binders/ImagesBinder;", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/binders/BadgesBinder;", "badgesBinder", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/binders/BadgesBinder;", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/binders/BottomContentBinder;", "bottomContentBinder", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/binders/BottomContentBinder;", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/binders/FavoriteBinder;", "favoriteBinder", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/binders/FavoriteBinder;", "Landroid/graphics/drawable/GradientDrawable;", "roundedBackground", "Landroid/graphics/drawable/GradientDrawable;", "Lkotlin/jvm/functions/Function1;", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "Lkotlin/Function0;", "clickListener", "Lkotlin/jvm/functions/Function0;", "LayoutContainerMode", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShelfCardView extends ConstraintLayout {
    private AtomAction action;
    private BadgesBinder badgesBinder;
    private BottomContentBinder bottomContentBinder;

    @NotNull
    private final Function0<Unit> clickListener;
    private FavoriteBinder favoriteBinder;
    private ImagesBinder imagesBinder;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final GradientDrawable roundedBackground;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardView$LayoutContainerMode;", "", "<init>", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LayoutContainerMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LayoutContainerMode[] $VALUES;
        public static final LayoutContainerMode VERTICAL = new LayoutContainerMode("VERTICAL", 0);
        public static final LayoutContainerMode HORIZONTAL = new LayoutContainerMode("HORIZONTAL", 1);

        private static final /* synthetic */ LayoutContainerMode[] $values() {
            return new LayoutContainerMode[]{VERTICAL, HORIZONTAL};
        }

        static {
            LayoutContainerMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private LayoutContainerMode(String str, int i11) {
        }

        public static LayoutContainerMode valueOf(String str) {
            return (LayoutContainerMode) Enum.valueOf(LayoutContainerMode.class, str);
        }

        public static LayoutContainerMode[] values() {
            return (LayoutContainerMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShelfCardView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        this.roundedBackground = gradientDrawable;
        this.clickListener = new ShelfCardView$clickListener$1(this);
        setBackground(gradientDrawable);
        setOnClickListener(new DN.a(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ShelfCardView shelfCardView, View view) {
        shelfCardView.clickListener.invoke();
    }

    public final void bind(@NotNull ShelfCardVO vo, @NotNull AnalyticData analyticData, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.action = vo.getAction();
        this.onAction = onAction;
        this.roundedBackground.setCornerRadius(vo.getSettings().getCardCornerRadius());
        ImagesBinder imagesBinder = this.imagesBinder;
        if (imagesBinder != null) {
            imagesBinder.bind(vo.getGallery().getImages(), vo.getSettings());
        }
        BadgesBinder badgesBinder = this.badgesBinder;
        if (badgesBinder != null) {
            badgesBinder.bind(vo.getGallery().getTopBadges(), vo.getGallery().getBottomBadges(), onAction);
        }
        BottomContentBinder bottomContentBinder = this.bottomContentBinder;
        if (bottomContentBinder != null) {
            bottomContentBinder.bind(vo.getContentList(), vo.getContentMargins(), vo.getSettings(), this.clickListener);
        }
        FavoriteBinder favoriteBinder = this.favoriteBinder;
        if (favoriteBinder != null) {
            favoriteBinder.bindOrGone(vo.getFavoriteButton(), analyticData);
        }
        setPadding(0, 0, 0, vo.getSettings().getCardBottomMargin());
    }

    public final void onAttach(@NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        FavoriteBinder favoriteBinder = this.favoriteBinder;
        if (favoriteBinder != null) {
            favoriteBinder.onAttach(lifecycleOwner);
        }
    }

    public final void onDetach() {
        FavoriteBinder favoriteBinder = this.favoriteBinder;
        if (favoriteBinder != null) {
            favoriteBinder.onDetach();
        }
    }

    public final void onRecycle() {
        FavoriteBinder favoriteBinder = this.favoriteBinder;
        if (favoriteBinder != null) {
            favoriteBinder.onDetach();
        }
    }

    public final void setDependencies(@NotNull J owner, @NotNull FavoriteProductV4Delegate delegate, @NotNull LayoutContainerMode layoutContainerMode, @NotNull HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator, HotelFavoriteUnauthorizedClickDelegate favoriteUnauthorizedClickDelegate) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(layoutContainerMode, "layoutContainerMode");
        Intrinsics.checkNotNullParameter(favoritesForAuthorizedFeatureActivator, "favoritesForAuthorizedFeatureActivator");
        ImagesBinder imagesBinder = new ImagesBinder(this, owner, this.clickListener);
        this.imagesBinder = imagesBinder;
        FavoriteBinder favoriteBinder = new FavoriteBinder(this, delegate, imagesBinder.getContainerId(), favoritesForAuthorizedFeatureActivator, favoriteUnauthorizedClickDelegate);
        this.favoriteBinder = favoriteBinder;
        this.badgesBinder = new BadgesBinder(this, imagesBinder.getContainerId(), favoriteBinder.getId(), imagesBinder.getIndicatorId());
        this.bottomContentBinder = new BottomContentBinder(this, imagesBinder.getContainerId(), layoutContainerMode);
    }
}
