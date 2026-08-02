package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view;

import CG.a;
import Dc0.n;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeButtonVO;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.uikit.extensions.view.VibrationExtKt;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/SwipeRemoveButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeButtonVO;", "data", "Lkotlin/Function0;", "", "onRemoveClick", "bind", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeButtonVO;Lkotlin/jvm/functions/Function0;)V", "onRemoveClickListener", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "removeButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getRemoveButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SwipeRemoveButtonView extends FrameLayout {
    private Function0<Unit> onRemoveClickListener;

    @NotNull
    private final IconButtonV3View removeButton;

    public /* synthetic */ SwipeRemoveButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(SwipeRemoveButtonView swipeRemoveButtonView, View view) {
        VibrationExtKt.vibrateSingle(swipeRemoveButtonView);
        Function0<Unit> function0 = swipeRemoveButtonView.onRemoveClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(SwipeRemoveButtonView swipeRemoveButtonView, View view) {
        VibrationExtKt.vibrateSingle(swipeRemoveButtonView);
        Function0<Unit> function0 = swipeRemoveButtonView.onRemoveClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void bind(SwipeButtonVO data, Function0<Unit> onRemoveClick) {
        int backgroundColor;
        IconButtonV3HolderKt.bindOrGone$default(this.removeButton, data != null ? data.getIconButton() : null, null, 2, null);
        if (data != null && data.getIsDisabled()) {
            onRemoveClick = null;
        }
        this.onRemoveClickListener = onRemoveClick;
        if (data != null) {
            setEnabled(!data.getIsDisabled());
            this.removeButton.setDisabled(data.getIsDisabled());
            if (data.getIsDisabled()) {
                this.removeButton.setBackgroundColor(0);
                backgroundColor = UniColors.BG_SECONDARY.getResId();
            } else {
                backgroundColor = data.getBackgroundColor();
            }
            setBackgroundColor(getContext().getColor(backgroundColor));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeRemoveButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(R$id.swipeMenuRemoveIcon);
        iconButtonV3View.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(iconButtonV3View);
        this.removeButton = iconButtonV3View;
        ViewGroup.LayoutParams layoutParams = iconButtonV3View.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = null;
        FrameLayout.LayoutParams layoutParams3 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams3 != null) {
            layoutParams3.gravity = 17;
            layoutParams2 = layoutParams3;
        }
        iconButtonV3View.setLayoutParams(layoutParams2);
        setOnClickListener(new n(this, 23));
        iconButtonV3View.setOnClickListener(new a(this, 20));
    }
}
