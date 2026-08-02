package ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.progressiveText;

import D90.c;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.app.android.common.progressivemolecula.presentation.ProgressiveTextWidgetVO;
import ru.ozon.app.android.common.progressivemolecula.view.ProgressiveTextView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/progressiveText/ProgressiveTextVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;", "progressiveText", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAtomAction", "<init>", "(Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$ProgressiveTextElement;", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$ProgressiveTextElement;)V", "Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;", "Lkotlin/jvm/functions/Function1;", "currentItem", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$ProgressiveTextElement;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressiveTextVH extends RecyclerView.C {
    private SplitDynamicElementVO.ProgressiveTextElement currentItem;

    @NotNull
    private final Function1<AtomAction, Unit> onAtomAction;

    @NotNull
    private final ProgressiveTextView progressiveText;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int HORIZONTAL_PADDING = UiExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/progressiveText/ProgressiveTextVH$Companion;", "", "<init>", "()V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProgressiveTextVH(@NotNull ProgressiveTextView progressiveText, @NotNull Function1<? super AtomAction, Unit> onAtomAction) {
        super(progressiveText);
        Intrinsics.checkNotNullParameter(progressiveText, "progressiveText");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        this.progressiveText = progressiveText;
        this.onAtomAction = onAtomAction;
        progressiveText.setOnClickListener(new c(this, 11));
        int i11 = HORIZONTAL_PADDING;
        progressiveText.setPadding(i11, progressiveText.getPaddingTop(), i11, progressiveText.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ProgressiveTextVH progressiveTextVH, View view) {
        ProgressiveTextWidgetVO.ProgressiveTextVO progressiveText;
        AtomAction action;
        SplitDynamicElementVO.ProgressiveTextElement progressiveTextElement = progressiveTextVH.currentItem;
        if (progressiveTextElement == null || (progressiveText = progressiveTextElement.getProgressiveText()) == null || (action = progressiveText.getAction()) == null) {
            return;
        }
        progressiveTextVH.onAtomAction.invoke(action);
    }

    public final void bind(@NotNull SplitDynamicElementVO.ProgressiveTextElement item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.currentItem = item;
        this.progressiveText.bind(item.getProgressiveText());
    }
}
