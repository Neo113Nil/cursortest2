package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view;

import Dc0.m;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModelKt;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.uikit.extensions.view.VibrationExtKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\fJ/\u0010\u0019\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\n2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010&\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010#\u001a\u0004\b'\u0010(\"\u0004\b)\u0010!¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/SwipeFavoriteButtonView;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "handleClick", "()V", "", "isFavorite", "updateContainerBackground", "(Ljava/lang/Boolean;)V", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "model", "bindFavoriteOrGone", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;)V", "revertAndRebindViewState", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindDataOrGone", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onClick", "setupViewClickListener", "(Lkotlin/jvm/functions/Function0;)V", "visible", "setIconVisibility", "(Z)V", "isIconVisible", "Z", "customClickHandler", "Lkotlin/jvm/functions/Function0;", "needVibrate", "getNeedVibrate", "()Z", "setNeedVibrate", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SwipeFavoriteButtonView extends ProductFavoriteMoleculeV4ButtonView {
    private Function0<Unit> customClickHandler;
    private boolean isIconVisible;
    private boolean needVibrate;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.SwipeFavoriteButtonView$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<AtomAction, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
            invoke2(atomAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction it) {
            Function0 function0;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!(it instanceof AtomAction.ComposerAction) || (function0 = SwipeFavoriteButtonView.this.customClickHandler) == null) {
                return;
            }
            SwipeFavoriteButtonView swipeFavoriteButtonView = SwipeFavoriteButtonView.this;
            if (swipeFavoriteButtonView.getNeedVibrate()) {
                VibrationExtKt.vibrateSingle(swipeFavoriteButtonView);
            }
            function0.invoke();
        }
    }

    public /* synthetic */ SwipeFavoriteButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(SwipeFavoriteButtonView swipeFavoriteButtonView, View view) {
        Function0<Unit> function0 = swipeFavoriteButtonView.customClickHandler;
        if (function0 == null) {
            swipeFavoriteButtonView.handleClick();
            return;
        }
        if (swipeFavoriteButtonView.getNeedVibrate()) {
            VibrationExtKt.vibrateSingle(swipeFavoriteButtonView);
        }
        function0.invoke();
    }

    private final void handleClick() {
        FavoriteProductModel currentModel = getCurrentModel();
        if (currentModel != null) {
            if (getNeedVibrate()) {
                VibrationExtKt.vibrateSingle(this);
            }
            Function2<FavoriteProductModel, View, Unit> onClick = getOnClick();
            if (onClick != null) {
                onClick.invoke(currentModel, this);
            }
        }
    }

    private final void updateContainerBackground(Boolean isFavorite) {
        setBackgroundColor(getContext().getColor(Intrinsics.d(isFavorite, Boolean.TRUE) ? R$color.bg_opaque_accent_secondary : R$color.bg_secondary));
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView
    protected void bindDataOrGone(FavoriteProductModel model, Function1<? super AtomAction, Unit> actionHandler) {
        IconButtonV3View favIcon = getFavIcon();
        IconButtonV3HolderKt.bindOrGone(favIcon, model != null ? FavoriteProductModelKt.getButton(model) : null, actionHandler);
        setContentDescription(model);
        favIcon.setSelected(model != null ? model.getIsFavorite() : false);
        favIcon.setVisibility(this.isIconVisible ? 0 : 8);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView
    public void bindFavoriteOrGone(FavoriteProductModel model) {
        setCurrentModel(model);
        bindDataOrGone(model, this.isIconVisible ? getActionHandler() : null);
        updateContainerBackground(model != null ? Boolean.valueOf(model.getIsFavorite()) : null);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView
    public boolean getNeedVibrate() {
        return this.needVibrate;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView
    public void revertAndRebindViewState() {
        FavoriteProductModel currentModel = getCurrentModel();
        FavoriteProductModel favoriteProductModel = null;
        if (currentModel != null) {
            FavoriteProductModel copy$default = FavoriteProductModel.copy$default(currentModel, 0L, !currentModel.getIsFavorite(), null, null, null, null, 61, null);
            bindDataOrGone(copy$default, null);
            updateContainerBackground(Boolean.valueOf(copy$default.getIsFavorite()));
            favoriteProductModel = copy$default;
        }
        setCurrentModel(favoriteProductModel);
    }

    public final void setIconVisibility(boolean visible) {
        this.isIconVisible = visible;
        getFavIcon().setVisibility(visible ? 0 : 8);
    }

    public final void setupViewClickListener(Function0<Unit> onClick) {
        this.customClickHandler = onClick;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeFavoriteButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isIconVisible = true;
        this.needVibrate = true;
        IconButtonV3View favIcon = getFavIcon();
        ViewGroup.LayoutParams layoutParams = getFavIcon().getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = null;
        FrameLayout.LayoutParams layoutParams3 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams3 != null) {
            layoutParams3.gravity = 17;
            layoutParams2 = layoutParams3;
        }
        favIcon.setLayoutParams(layoutParams2);
        setOnClickListener(new m(this, 21));
        setActionHandler(new AnonymousClass3());
    }
}
