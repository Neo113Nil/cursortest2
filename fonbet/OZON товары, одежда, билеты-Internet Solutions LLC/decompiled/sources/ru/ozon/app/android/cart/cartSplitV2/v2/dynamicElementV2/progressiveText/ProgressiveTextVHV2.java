package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.progressiveText;

import GD.b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementVOV2;
import ru.ozon.app.android.common.progressivemolecula.presentation.ProgressiveTextWidgetVO;
import ru.ozon.app.android.common.progressivemolecula.view.ProgressiveTextView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/progressiveText/ProgressiveTextVHV2;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;", "progressiveTextView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$ProgressiveText;", "item", "bind", "(Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$ProgressiveText;)V", "Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "boundedData", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressiveTextVHV2 extends RecyclerView.C {
    private ProgressiveTextWidgetVO.ProgressiveTextVO boundedData;

    @NotNull
    private final ProgressiveTextView progressiveTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressiveTextVHV2(@NotNull ProgressiveTextView progressiveTextView, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(progressiveTextView);
        Intrinsics.checkNotNullParameter(progressiveTextView, "progressiveTextView");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.progressiveTextView = progressiveTextView;
        progressiveTextView.setOnClickListener(new b(3, this, onAction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ProgressiveTextVHV2 progressiveTextVHV2, Function1 function1, View view) {
        AtomAction action;
        ProgressiveTextWidgetVO.ProgressiveTextVO progressiveTextVO = progressiveTextVHV2.boundedData;
        if (progressiveTextVO == null || (action = progressiveTextVO.getAction()) == null) {
            return;
        }
        function1.invoke(action);
    }

    public final void bind(@NotNull DynamicElementVOV2.ProgressiveText item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundedData = item.getProgressiveText();
        this.progressiveTextView.bind(item.getProgressiveText());
    }
}
