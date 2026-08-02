package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.BaseSwipeableWrapperView;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeInfoVO;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\rH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/SwipeableWrapperViewV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/BaseSwipeableWrapperView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isSwipeMenuInitialized", "", "swipeData", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "favButton", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/SwipeFavoriteButtonView;", "getFavButton", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/SwipeFavoriteButtonView;", "removeButton", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/SwipeRemoveButtonView;", "getRemoveButton", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/SwipeRemoveButtonView;", "setRemoveButton", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/SwipeRemoveButtonView;)V", "ensureSwipeMenuInitialized", "", "setSwipeData", "data", "updateSwipeOffset", "offset", "", "resetSwipeMenuState", "bindSwipeMenu", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SwipeableWrapperViewV2 extends BaseSwipeableWrapperView {

    @NotNull
    private final SwipeFavoriteButtonView favButton;
    private boolean isSwipeMenuInitialized;
    private SwipeRemoveButtonView removeButton;
    private SwipeInfoVO swipeData;

    public /* synthetic */ SwipeableWrapperViewV2(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindSwipeMenu(SwipeInfoVO data) {
        ViewExtKt.show(getFavButton());
        updateRemoveButton(data.getRemoveButton());
        recalculateMaxSwipeDistance();
        resetSwipeState();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.BaseSwipeableWrapperView
    public void ensureSwipeMenuInitialized() {
        SwipeInfoVO swipeInfoVO;
        if (this.isSwipeMenuInitialized || !getIsSwipeEnabled() || (swipeInfoVO = this.swipeData) == null) {
            return;
        }
        if (getFavButton().getParent() == null) {
            getActionsContainer().addView(getFavButton());
        }
        if (getRemoveButton() == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View i11 = q.f64554a.i(N.b(SwipeRemoveButtonView.class), context);
            if (i11 == null) {
                i11 = new SwipeRemoveButtonView(context, null, 0, 6, null);
            }
            SwipeRemoveButtonView swipeRemoveButtonView = (SwipeRemoveButtonView) i11;
            BaseSwipeableWrapperView.Companion companion = BaseSwipeableWrapperView.INSTANCE;
            swipeRemoveButtonView.setLayoutParams(new FrameLayout.LayoutParams(companion.getDEFAULT_BUTTON_WIDTH(), -1, 17));
            swipeRemoveButtonView.setPadding(swipeRemoveButtonView.getPaddingLeft(), companion.getDEFAULT_ICON_TOP_PADDING(), swipeRemoveButtonView.getPaddingRight(), swipeRemoveButtonView.getPaddingBottom());
            swipeRemoveButtonView.setVisibility(8);
            setRemoveButton(swipeRemoveButtonView);
            getActionsContainer().addView(getRemoveButton());
        } else {
            SwipeRemoveButtonView removeButton = getRemoveButton();
            if ((removeButton != null ? removeButton.getParent() : null) == null) {
                getActionsContainer().addView(getRemoveButton());
            }
        }
        this.isSwipeMenuInitialized = true;
        bindSwipeMenu(swipeInfoVO);
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.BaseSwipeableWrapperView
    @NotNull
    public SwipeFavoriteButtonView getFavButton() {
        return this.favButton;
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.BaseSwipeableWrapperView
    public SwipeRemoveButtonView getRemoveButton() {
        return this.removeButton;
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.BaseSwipeableWrapperView
    public void resetSwipeMenuState() {
        this.isSwipeMenuInitialized = false;
        this.swipeData = null;
        if (getFavButton().getParent() != null) {
            getActionsContainer().removeView(getFavButton());
        }
        SwipeRemoveButtonView removeButton = getRemoveButton();
        if ((removeButton != null ? removeButton.getParent() : null) != null) {
            getActionsContainer().removeView(getRemoveButton());
        }
        hideSwipeMenu();
        resetSwipeState();
    }

    public void setRemoveButton(SwipeRemoveButtonView swipeRemoveButtonView) {
        this.removeButton = swipeRemoveButtonView;
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.BaseSwipeableWrapperView
    public void setSwipeData(SwipeInfoVO data) {
        if (data != null) {
            setSwipeEnabled(true);
            this.swipeData = data;
            if (this.isSwipeMenuInitialized) {
                bindSwipeMenu(data);
                return;
            }
            return;
        }
        setSwipeEnabled(false);
        this.swipeData = null;
        if (this.isSwipeMenuInitialized) {
            hideSwipeMenu();
        }
        setMaxSwipeDistance(0.0f);
        resetSwipeState();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.BaseSwipeableWrapperView
    public void updateSwipeOffset(float offset) {
        View contentView;
        if (getIsSwipeEnabled() && (contentView = getContentView()) != null) {
            contentView.setTranslationX(offset);
            if (offset < 0.0f && getActionsContainer().getVisibility() != 0) {
                ViewExtKt.show(getActionsContainer());
            } else if (offset >= 0.0f && getActionsContainer().getVisibility() == 0) {
                hideSwipeMenu();
            }
            float maxSwipeDistance = getMaxSwipeDistance() + offset;
            getActionsContainer().setTranslationX(maxSwipeDistance >= 0.0f ? maxSwipeDistance : 0.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableWrapperViewV2(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View i12 = q.f64554a.i(N.b(SwipeFavoriteButtonView.class), context);
        SwipeFavoriteButtonView swipeFavoriteButtonView = (SwipeFavoriteButtonView) (i12 == null ? new SwipeFavoriteButtonView(context, null, 0, 6, null) : i12);
        BaseSwipeableWrapperView.Companion companion = BaseSwipeableWrapperView.INSTANCE;
        swipeFavoriteButtonView.setLayoutParams(new FrameLayout.LayoutParams(companion.getDEFAULT_BUTTON_WIDTH(), -1));
        swipeFavoriteButtonView.setPadding(swipeFavoriteButtonView.getPaddingLeft(), companion.getDEFAULT_ICON_TOP_PADDING(), swipeFavoriteButtonView.getPaddingRight(), swipeFavoriteButtonView.getPaddingBottom());
        swipeFavoriteButtonView.setVisibility(8);
        this.favButton = swipeFavoriteButtonView;
        ViewExtKt.gone(getActionsContainer());
    }
}
