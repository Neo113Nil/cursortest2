package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeButtonVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeInfoVO;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 E2\u00020\u0001:\u0001EB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0004¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\fH\u0004¢\u0006\u0004\b\u001b\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\fH\u0004¢\u0006\u0004\b\u001c\u0010\u0014J\u0019\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0004¢\u0006\u0004\b\u001f\u0010 R(\u0010\"\u001a\u0004\u0018\u00010\u00162\b\u0010!\u001a\u0004\u0018\u00010\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R*\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010-\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u0012R\"\u00103\u001a\u0002028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b3\u00105\"\u0004\b6\u00107R\u001a\u00109\u001a\u0002088\u0004X\u0084\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020=8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010D\u001a\u0004\u0018\u00010A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/BaseSwipeableWrapperView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "data", "", "setSwipeData", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;)V", "", "offset", "updateSwipeOffset", "(F)V", "ensureSwipeMenuInitialized", "()V", "resetSwipeMenuState", "Landroid/view/View;", "view", "setContent", "(Landroid/view/View;)V", "resetSwipeState", "recalculateMaxSwipeDistance", "hideSwipeMenu", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeButtonVO;", "buttonVO", "updateRemoveButton", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeButtonVO;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "Lkotlin/Function0;", "onRemoveClick", "Lkotlin/jvm/functions/Function0;", "getOnRemoveClick", "()Lkotlin/jvm/functions/Function0;", "setOnRemoveClick", "(Lkotlin/jvm/functions/Function0;)V", "maxSwipeDistance", "F", "getMaxSwipeDistance", "()F", "setMaxSwipeDistance", "", "isSwipeEnabled", "Z", "()Z", "setSwipeEnabled", "(Z)V", "Landroid/widget/LinearLayout;", "actionsContainer", "Landroid/widget/LinearLayout;", "getActionsContainer", "()Landroid/widget/LinearLayout;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/SwipeFavoriteButtonView;", "getFavButton", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/SwipeFavoriteButtonView;", "favButton", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/SwipeRemoveButtonView;", "getRemoveButton", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/SwipeRemoveButtonView;", "removeButton", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BaseSwipeableWrapperView extends FrameLayout {

    @NotNull
    private final LinearLayout actionsContainer;
    private View contentView;
    private boolean isSwipeEnabled;
    private float maxSwipeDistance;
    private Function0<Unit> onRemoveClick;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int DEFAULT_BUTTON_WIDTH = ResourceExtKt.toPx(80);
    private static final int DEFAULT_ICON_TOP_PADDING = ResourceExtKt.toPx(56);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/BaseSwipeableWrapperView$Companion;", "", "<init>", "()V", "DEFAULT_BUTTON_WIDTH", "", "getDEFAULT_BUTTON_WIDTH", "()I", "DEFAULT_ICON_TOP_PADDING", "getDEFAULT_ICON_TOP_PADDING", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDEFAULT_BUTTON_WIDTH() {
            return BaseSwipeableWrapperView.DEFAULT_BUTTON_WIDTH;
        }

        public final int getDEFAULT_ICON_TOP_PADDING() {
            return BaseSwipeableWrapperView.DEFAULT_ICON_TOP_PADDING;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSwipeableWrapperView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R$id.swipeableViewActionContainer);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        linearLayout.setOrientation(0);
        this.actionsContainer = linearLayout;
        setClipChildren(false);
        setClipToPadding(false);
        addView(linearLayout);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }

    public void ensureSwipeMenuInitialized() {
    }

    @NotNull
    protected final LinearLayout getActionsContainer() {
        return this.actionsContainer;
    }

    public final View getContentView() {
        return this.contentView;
    }

    @NotNull
    public abstract SwipeFavoriteButtonView getFavButton();

    public final float getMaxSwipeDistance() {
        return this.maxSwipeDistance;
    }

    public abstract SwipeRemoveButtonView getRemoveButton();

    protected final void hideSwipeMenu() {
        if (this.actionsContainer.getVisibility() == 0) {
            ViewExtKt.gone(this.actionsContainer);
        }
    }

    /* renamed from: isSwipeEnabled, reason: from getter */
    protected final boolean getIsSwipeEnabled() {
        return this.isSwipeEnabled;
    }

    protected final void recalculateMaxSwipeDistance() {
        int i11 = getFavButton().getVisibility() == 0 ? DEFAULT_BUTTON_WIDTH : 0;
        SwipeRemoveButtonView removeButton = getRemoveButton();
        if (removeButton != null && removeButton.getVisibility() == 0) {
            i11 += DEFAULT_BUTTON_WIDTH;
        }
        this.maxSwipeDistance = i11;
    }

    public void resetSwipeMenuState() {
    }

    protected final void resetSwipeState() {
        View view;
        View view2 = this.contentView;
        if (!Intrinsics.b(view2 != null ? Float.valueOf(view2.getTranslationX()) : null, 0.0f) && (view = this.contentView) != null) {
            view.setTranslationX(0.0f);
        }
        float translationX = this.actionsContainer.getTranslationX();
        float f7 = this.maxSwipeDistance;
        if (translationX == f7) {
            return;
        }
        this.actionsContainer.setTranslationX(f7);
    }

    public final void setContent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View view2 = this.contentView;
        if (view2 != null) {
            removeView(view2);
        }
        view.setId(R$id.swipeableViewContent);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(view, 0);
        this.contentView = view;
    }

    protected final void setMaxSwipeDistance(float f7) {
        this.maxSwipeDistance = f7;
    }

    public final void setOnRemoveClick(Function0<Unit> function0) {
        this.onRemoveClick = function0;
    }

    public abstract void setSwipeData(SwipeInfoVO data);

    protected final void setSwipeEnabled(boolean z11) {
        this.isSwipeEnabled = z11;
    }

    protected final void updateRemoveButton(SwipeButtonVO buttonVO) {
        SwipeRemoveButtonView removeButton = getRemoveButton();
        if (removeButton != null) {
            removeButton.bind(buttonVO, this.onRemoveClick);
            ViewExtKt.show(removeButton);
        }
    }

    public abstract void updateSwipeOffset(float offset);
}
