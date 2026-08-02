package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation;

import A00.a;
import Sc.o;
import Vg.d;
import a00.h;
import a00.j;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.w0;
import c20.r;
import com.google.android.material.appbar.AppBarLayout;
import d20.AbstractC6065b;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.data.TransparentNavBarV2DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.di.TransparentNavBarV2Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2VO;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollAnchorViewModel;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\n\u0010!\u001a\u00060\u001fj\u0002` H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R&\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/di/TransparentNavBarV2Component;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO;", "<init>", "()V", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO$Button;", "buttons", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;", "buttonColors", "", "isPlaceholderVisible", "updateFavoriteButtonBackgroundColor", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;Z)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO;)Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO;", "state", "Ll20/d;", "info", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/PlaceholderVisibilityUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TransparentNavBarV2ViewMapper extends OverlayWidgetScreenViewItemMapper2<TransparentNavBarV2Component, TransparentNavBarV2DTO, TransparentNavBarV2VO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<PlaceholderVisibilityUpdateKey>> supportedUpdates = C7714v.a0(PlaceholderVisibilityUpdateKey.class);

    private final List<TransparentNavBarV2VO.Button> updateFavoriteButtonBackgroundColor(List<? extends TransparentNavBarV2VO.Button> buttons, TransparentNavBarV2DTO.ButtonsColors buttonColors, boolean isPlaceholderVisible) {
        List<? extends TransparentNavBarV2VO.Button> list = buttons;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (TransparentNavBarV2VO.Button button : list) {
            if (button instanceof TransparentNavBarV2VO.FavoriteButton) {
                String str = null;
                if (isPlaceholderVisible) {
                    if (buttonColors != null) {
                        str = buttonColors.getWithBackground();
                    }
                } else if (buttonColors != null) {
                    str = buttonColors.getWithoutBackground();
                }
                String str2 = str;
                TransparentNavBarV2VO.FavoriteButton favoriteButton = (TransparentNavBarV2VO.FavoriteButton) button;
                button = new TransparentNavBarV2VO.FavoriteButton(FavoriteProductModel.copy$default(favoriteButton.getButton(), 0L, false, IconButtonV3DTO.copy$default(favoriteButton.getButton().getFavoriteButton(), null, null, null, null, null, null, str2, null, null, null, null, null, null, null, 16319, null), IconButtonV3DTO.copy$default(favoriteButton.getButton().getUnfavoriteButton(), null, null, null, null, null, null, str2, null, null, null, null, null, null, null, 16319, null), null, null, 51, null));
            } else if (!(button instanceof TransparentNavBarV2VO.IconButton)) {
                throw new o();
            }
            arrayList.add(button);
        }
        return arrayList;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<TransparentNavBarV2VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ViewGroup Z11 = container.Z();
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(Z11);
        if (composerAppbar == null) {
            AbstractC6065b.INSTANCE.getClass();
            return AbstractC6065b.Companion.a();
        }
        Toolbar composerToolbar = ComposerViewExtensionKt.composerToolbar(Z11);
        if (composerToolbar == null) {
            AbstractC6065b.INSTANCE.getClass();
            return AbstractC6065b.Companion.a();
        }
        FavoriteProductV4Delegate provideV4Delegate = component().getProductFavoriteDelegateProvider().provideV4Delegate(container);
        d customActionHandlersStoreFactory = component().getCustomActionHandlersStoreFactory();
        h a02 = container.a0();
        ScrollAnchorViewModel scrollAnchorViewModel = (ScrollAnchorViewModel) ((w0) j.a(a02.a(), N.b(ScrollAnchorViewModel.class), new TransparentNavBarV2ViewMapper$createHolder$1(this)).getValue());
        h a03 = container.a0();
        return new TransparentNavBarV2WidgetViewHolder(container, composerAppbar, composerToolbar, provideV4Delegate, customActionHandlersStoreFactory, scrollAnchorViewModel, component().getFavoriteManager(), (TransparentNavBarViewModel) ((w0) j.a(a03.a(), N.b(TransparentNavBarViewModel.class), new TransparentNavBarV2ViewMapper$createHolder$2(this)).getValue()), component().getFeatureChecker(), component().getAuthStateStorage(), component().getFavoriteUnauthorizedAnalytics());
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<PlaceholderVisibilityUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TransparentNavBarV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TransparentNavBarV2Component.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    public TransparentNavBarV2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TransparentNavBarV2VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof PlaceholderVisibilityUpdateKey) {
            return TransparentNavBarV2VO.copy$default(oldItem, 0L, null, updateFavoriteButtonBackgroundColor(oldItem.getRightButtons(), oldItem.getButtonShapeColors(), ((PlaceholderVisibilityUpdateKey) update).getIsPlaceholderVisible()), 0.0f, false, null, null, null, 251, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TransparentNavBarV2VO> map(@NotNull TransparentNavBarV2DTO state, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
