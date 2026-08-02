package ru.ozon.app.android.returns.common.presentation.viewHolderDelegate.total;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnTotalViewHolderDelegate$atomItemViewHolderDelegate$1 extends AbstractC7737t implements Function1<AtomItemViewHolder, Unit> {
    final /* synthetic */ Function0<Unit> $onTotalClick;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.common.presentation.viewHolderDelegate.total.ReturnTotalViewHolderDelegate$atomItemViewHolderDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> $onTotalClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0<Unit> function0) {
            super(1);
            this.$onTotalClick = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$onTotalClick.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnTotalViewHolderDelegate$atomItemViewHolderDelegate$1(Function0<Unit> function0) {
        super(1);
        this.$onTotalClick = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomItemViewHolder atomItemViewHolder) {
        invoke2(atomItemViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomItemViewHolder AtomItemViewHolderDelegate) {
        Intrinsics.checkNotNullParameter(AtomItemViewHolderDelegate, "$this$AtomItemViewHolderDelegate");
        View itemView = AtomItemViewHolderDelegate.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewExtKt.setOnClickListenerThrottle$default(itemView, 0L, new AnonymousClass1(this.$onTotalClick), 1, null);
    }
}
