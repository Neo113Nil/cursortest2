package ru.ozon.app.android.favorites.wishlistMultiselect.presentation;

import AF.a;
import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Bt.C2673b;
import GZ.g;
import WZ.m;
import WZ.t;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.domain.utils.ActionHandlersUtilsKt;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.favorites.wishlistMultiselect.presentation.WishlistMultiselectOverlayViewHolder;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0005*\u00017\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001a\u001a\u00020\u0019*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u0019*\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\"\u001a\u00020\u0019*\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020\u0019*\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010#J7\u0010*\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00162\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/favorites/wishlistMultiselect/presentation/WishlistMultiselectOverlayViewHolder;", "Ld20/a;", "Lru/ozon/app/android/favorites/wishlistMultiselect/presentation/WishlistMultiselectVO;", "Ll10/i;", "container", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "selectedProductsManager", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "favListInteractor", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoriteEventManager", "LGZ/g;", "router", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "wishlistEventManager", "Lkotlin/Function1;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/favorites/common/SelectedProductsManager;Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;LGZ/g;Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "", "count", "item", "", "bindButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ILru/ozon/app/android/favorites/wishlistMultiselect/presentation/WishlistMultiselectVO;)V", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "show", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "", "itemId", "execute", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;J)V", "trackClick", "skusCount", "", "", "selectWords", "productWords", "pluralizeSubtitle", "(ILjava/util/List;Ljava/util/List;)Ljava/lang/String;", "bind", "(Lru/ozon/app/android/favorites/wishlistMultiselect/presentation/WishlistMultiselectVO;)V", "Ll10/i;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "LGZ/g;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "", "canShowNotificationWarning", "Z", "ru/ozon/app/android/favorites/wishlistMultiselect/presentation/WishlistMultiselectOverlayViewHolder$notificationCallback$1", "notificationCallback", "Lru/ozon/app/android/favorites/wishlistMultiselect/presentation/WishlistMultiselectOverlayViewHolder$notificationCallback$1;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WishlistMultiselectOverlayViewHolder extends AbstractC6064a<WishlistMultiselectVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private boolean canShowNotificationWarning;

    @NotNull
    private final i container;

    @NotNull
    private final FavoritesListsInteractor favListInteractor;

    @NotNull
    private final FavoriteEventManager favoriteEventManager;

    @NotNull
    private final WishlistMultiselectOverlayViewHolder$notificationCallback$1 notificationCallback;

    @NotNull
    private final g router;

    @NotNull
    private final SelectedProductsManager selectedProductsManager;

    @NotNull
    private final WishlistEventManager wishlistEventManager;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/favorites/wishlistMultiselect/presentation/WishlistMultiselectOverlayViewHolder$Companion;", "", "<init>", "()V", "FAVORITE_LIST_ADD", "", "WISHLIST_MULTISELECT", "SUBTEXTS_SIZE", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.favorites.wishlistMultiselect.presentation.WishlistMultiselectOverlayViewHolder$notificationCallback$1] */
    public WishlistMultiselectOverlayViewHolder(@NotNull i container, @NotNull SelectedProductsManager selectedProductsManager, @NotNull FavoritesListsInteractor favListInteractor, @NotNull FavoriteEventManager favoriteEventManager, @NotNull g router, @NotNull WishlistEventManager wishlistEventManager, @NotNull Function1<? super LinearLayout, ? extends View> viewFactory) {
        super(container, new WishlistMultiselectOverlayViewHolder$sam$ru_ozon_composer_ui_widget_overlay_holder_ViewFactory$0(viewFactory));
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(selectedProductsManager, "selectedProductsManager");
        Intrinsics.checkNotNullParameter(favListInteractor, "favListInteractor");
        Intrinsics.checkNotNullParameter(favoriteEventManager, "favoriteEventManager");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(wishlistEventManager, "wishlistEventManager");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.selectedProductsManager = selectedProductsManager;
        this.favListInteractor = favListInteractor;
        this.favoriteEventManager = favoriteEventManager;
        this.router = router;
        this.wishlistEventManager = wishlistEventManager;
        this.canShowNotificationWarning = true;
        this.notificationCallback = new NotificationBar.Callback() { // from class: ru.ozon.app.android.favorites.wishlistMultiselect.presentation.WishlistMultiselectOverlayViewHolder$notificationCallback$1
            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onDismissed(NotificationBar notificationBar, NotificationBar.DismissReason reason) {
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                Intrinsics.checkNotNullParameter(reason, "reason");
                WishlistMultiselectOverlayViewHolder.this.canShowNotificationWarning = true;
                notificationBar.removeCallback(this);
            }

            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onShown(NotificationBar notificationBar) {
                NotificationBar.Callback.DefaultImpls.onShown(this, notificationBar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindButton(ButtonV3DTO buttonV3DTO, final int i11, final WishlistMultiselectVO wishlistMultiselectVO) {
        AtomActionDTO action;
        boolean z11 = i11 > wishlistMultiselectVO.getLimit();
        String string = z11 ? StringProvider.getString(R$string.multiselect_decrease_count) : wishlistMultiselectVO.getSubmitButton().getTitle();
        String string2 = z11 ? StringProvider.getString(R$string.multiselect_limit_reached, Integer.valueOf(wishlistMultiselectVO.getLimit())) : pluralizeSubtitle(i11, wishlistMultiselectVO.getSubtextParts().getSelectWords(), wishlistMultiselectVO.getSubtextParts().getProductWords());
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.favorites.wishlistMultiselect.presentation.WishlistMultiselectView");
        ButtonV3View submitButton = ((WishlistMultiselectView) view).getSubmitButton();
        String str = string2;
        final AtomAction atomAction = null;
        ButtonV3HolderKt.bind$default(submitButton, ButtonV3DTO.copy$default(buttonV3DTO, null, null, string, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131067, null), null, 2, null);
        CommonControlSettings common = buttonV3DTO.getCommon();
        if (common != null && (action = common.getAction()) != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action, null);
        }
        submitButton.setOnClickListener(new View.OnClickListener() { // from class: Bt.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WishlistMultiselectOverlayViewHolder wishlistMultiselectOverlayViewHolder = this;
                WishlistMultiselectOverlayViewHolder.bindButton$lambda$1$lambda$0(i11, wishlistMultiselectVO, wishlistMultiselectOverlayViewHolder, atomAction, view2);
            }
        });
        submitButton.setDisabled(z11);
        submitButton.setSubtitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindButton$lambda$1$lambda$0(int i11, WishlistMultiselectVO wishlistMultiselectVO, WishlistMultiselectOverlayViewHolder wishlistMultiselectOverlayViewHolder, AtomAction atomAction, View view) {
        if (i11 != 0) {
            if (atomAction instanceof AtomAction.ComposerAction) {
                wishlistMultiselectOverlayViewHolder.execute((AtomAction.ComposerAction) atomAction, wishlistMultiselectVO.getId());
            }
        } else {
            NotificationModelWrapper notificationWarning = wishlistMultiselectVO.getNotificationWarning();
            if (notificationWarning != null) {
                wishlistMultiselectOverlayViewHolder.show(notificationWarning);
            }
        }
    }

    @SuppressLint({"CheckResult"})
    private final void execute(AtomAction.ComposerAction composerAction, long j11) {
        Long extractListIdFromFavoriteAction = ActionHandlersUtilsKt.extractListIdFromFavoriteAction(composerAction);
        if (extractListIdFromFavoriteAction != null) {
            long longValue = extractListIdFromFavoriteAction.longValue();
            if (Intrinsics.d(composerAction.getId(), "favoriteListAdd")) {
                trackClick(composerAction, j11);
                FavoritesListsInteractor.DefaultImpls.addProductsToFavoritesList$default(this.favListInteractor, longValue, this.selectedProductsManager.getSelectedIds(), null, null, "multiselect", 12, null).g(C8125a.a()).h(new C2673b(new WishlistMultiselectOverlayViewHolder$execute$1(this, longValue), 0), new a(WishlistMultiselectOverlayViewHolder$execute$2.INSTANCE, 1));
            }
        }
    }

    private final String pluralizeSubtitle(int skusCount, List<String> selectWords, List<String> productWords) {
        if (skusCount == 0) {
            return StringProvider.getString(R$string.multiselect_products_not_selected);
        }
        if (selectWords == null || selectWords.size() != 3 || productWords == null || productWords.size() != 3) {
            return "";
        }
        int i11 = skusCount % 10;
        int i12 = skusCount % 100;
        if (10 <= i12 && i12 < 20) {
            return ((Object) selectWords.get(2)) + " " + skusCount + " " + ((Object) productWords.get(2));
        }
        if (i11 == 1) {
            return ((Object) selectWords.get(0)) + " " + skusCount + " " + ((Object) productWords.get(0));
        }
        if (2 > i11 || i11 >= 5) {
            return ((Object) selectWords.get(2)) + " " + skusCount + " " + ((Object) productWords.get(2));
        }
        return ((Object) selectWords.get(1)) + " " + skusCount + " " + ((Object) productWords.get(1));
    }

    private final void show(NotificationModelWrapper notificationModelWrapper) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        if (this.canShowNotificationWarning) {
            ComponentCallbacksC5392m b11 = this.container.K().b();
            View view = b11 != null ? b11.getView() : null;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) == null) {
                return;
            }
            this.canShowNotificationWarning = false;
            NotificationBar make$default = NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notificationModelWrapper, this.container.K().f(), null, 8, null);
            make$default.addCallback(this.notificationCallback);
            make$default.show();
        }
    }

    private final void trackClick(AtomAction.ComposerAction composerAction, long j11) {
        t mapToTokenizedEvent$default;
        Map<String, TokenizedTrackingInfo> trackingInfo = composerAction.getTrackingInfo();
        if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null)) == null) {
            return;
        }
        m.a(this.container.X(), mapToTokenizedEvent$default, null);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull WishlistMultiselectVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        C2399j.C(new C(new C2408n0(this.selectedProductsManager.observeCount(), new WishlistMultiselectOverlayViewHolder$bind$1(this, item, null)), new WishlistMultiselectOverlayViewHolder$bind$2(null)), K.a(this.container.K().f()));
    }
}
