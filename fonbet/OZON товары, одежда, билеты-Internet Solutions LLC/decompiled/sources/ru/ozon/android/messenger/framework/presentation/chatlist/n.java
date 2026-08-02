package ru.ozon.android.messenger.framework.presentation.chatlist;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.MessengerMetricsRecyclerView;

/* loaded from: classes10.dex */
public final class n extends RecyclerView.i {

    /* renamed from: a, reason: collision with root package name */
    private final Function2<Integer, Integer, Unit> f90509a;

    static final class a extends AbstractC7737t implements Function2<Integer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MessengerMetricsRecyclerView f90510b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MessengerMetricsRecyclerView messengerMetricsRecyclerView) {
            super(2);
            this.f90510b = messengerMetricsRecyclerView;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, Integer num2) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (intValue == 0 && intValue2 == 1) {
                MessengerMetricsRecyclerView messengerMetricsRecyclerView = this.f90510b;
                Intrinsics.f(messengerMetricsRecyclerView);
                RecyclerView.o layoutManager = messengerMetricsRecyclerView.getLayoutManager();
                if (layoutManager == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
                if (((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0) {
                    messengerMetricsRecyclerView.scrollToPosition(0);
                }
            }
            return Unit.f71690a;
        }
    }

    n(MessengerMetricsRecyclerView messengerMetricsRecyclerView) {
        this.f90509a = new a(messengerMetricsRecyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeInserted(int i11, int i12) {
        ((a) this.f90509a).invoke(Integer.valueOf(i11), Integer.valueOf(i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeMoved(int i11, int i12, int i13) {
        ((a) this.f90509a).invoke(Integer.valueOf(i12), Integer.valueOf(i13));
    }
}
