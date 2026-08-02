package ru.ozon.app.android.returns.list.viewMapper;

import android.view.View;
import androidx.lifecycle.J;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.common.presentation.viewHolderDelegate.total.ReturnTotalViewHolderDelegate;
import ru.ozon.app.android.returns.common.presentation.views.ReturnPreviewView;
import ru.ozon.app.android.returns.list.presentation.viewHolder.ReturnPreviewViewHolder;
import ru.ozon.app.android.returns.list.presentation.views.ReturnTotalView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/returns/list/presentation/viewHolder/ReturnPreviewViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ReturnListViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ReturnPreviewViewHolder> {
    public static final ReturnListViewMapper$holderProducer$1 INSTANCE = new ReturnListViewMapper$holderProducer$1();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lru/ozon/app/android/returns/list/presentation/views/ReturnTotalView;", "totalView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function0;", "onTotalClick", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/total/ReturnTotalViewHolderDelegate;", "invoke", "(Lru/ozon/app/android/returns/list/presentation/views/ReturnTotalView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/J;)Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/total/ReturnTotalViewHolderDelegate;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.list.viewMapper.ReturnListViewMapper$holderProducer$1$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<ReturnTotalView, Function1<? super AtomAction, ? extends Unit>, Function0<? extends Unit>, J, ReturnTotalViewHolderDelegate> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(4);
        }

        @Override // fd.InterfaceC6512o
        public /* bridge */ /* synthetic */ ReturnTotalViewHolderDelegate invoke(ReturnTotalView returnTotalView, Function1<? super AtomAction, ? extends Unit> function1, Function0<? extends Unit> function0, J j11) {
            return invoke2(returnTotalView, (Function1<? super AtomAction, Unit>) function1, (Function0<Unit>) function0, j11);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ReturnTotalViewHolderDelegate invoke2(ReturnTotalView totalView, Function1<? super AtomAction, Unit> actionHandler, Function0<Unit> onTotalClick, J lifecycleOwner) {
            Intrinsics.checkNotNullParameter(totalView, "totalView");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            Intrinsics.checkNotNullParameter(onTotalClick, "onTotalClick");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            return new ReturnTotalViewHolderDelegate(totalView, actionHandler, onTotalClick, null, null, lifecycleOwner, 24, null);
        }
    }

    ReturnListViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ReturnPreviewViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new ReturnPreviewViewHolder((ReturnPreviewView) view, refs, AnonymousClass1.INSTANCE);
    }
}
