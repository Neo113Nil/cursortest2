package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.adapter.HotTicketsItemAdapter;
import ru.ozon.app.android.travel.utils.CustomSpeedSmoothScroller;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsWidgetViewHolder$startAutoSwipe$1$1", f = "HotTicketsWidgetViewHolder.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotTicketsWidgetViewHolder$startAutoSwipe$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ LinearLayoutManager $layoutManager;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotTicketsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotTicketsWidgetViewHolder$startAutoSwipe$1$1(HotTicketsWidgetViewHolder hotTicketsWidgetViewHolder, LinearLayoutManager linearLayoutManager, d<? super HotTicketsWidgetViewHolder$startAutoSwipe$1$1> dVar) {
        super(2, dVar);
        this.this$0 = hotTicketsWidgetViewHolder;
        this.$layoutManager = linearLayoutManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotTicketsWidgetViewHolder$startAutoSwipe$1$1 hotTicketsWidgetViewHolder$startAutoSwipe$1$1 = new HotTicketsWidgetViewHolder$startAutoSwipe$1$1(this.this$0, this.$layoutManager, dVar);
        hotTicketsWidgetViewHolder$startAutoSwipe$1$1.L$0 = obj;
        return hotTicketsWidgetViewHolder$startAutoSwipe$1$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:5:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        int i11;
        int i12;
        HotTicketsItemAdapter hotTicketsItemAdapter;
        int i13;
        int i14;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = this.label;
        if (i15 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            if (N.f(m11)) {
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.L$0;
            s.b(obj);
            i11 = this.this$0.currentItemPosition;
            this.this$0.currentItemPosition = i11 + 1;
            i12 = this.this$0.currentItemPosition;
            hotTicketsItemAdapter = this.this$0.hotTicketsAdapter;
            if (i12 >= hotTicketsItemAdapter.getShimmersCount()) {
                this.this$0.currentItemPosition = 0;
            }
            i13 = this.this$0.currentItemPosition;
            CustomSpeedSmoothScroller customSpeedSmoothScroller = new CustomSpeedSmoothScroller(this.this$0.getContext(), i13 != 0 ? 25.0f : 100.0f);
            i14 = this.this$0.currentItemPosition;
            customSpeedSmoothScroller.setTargetPosition(i14);
            this.$layoutManager.startSmoothScroll(customSpeedSmoothScroller);
            if (N.f(m11)) {
                this.L$0 = m11;
                this.label = 1;
                if (Y.b(3000L, this) == aVar) {
                    return aVar;
                }
                i11 = this.this$0.currentItemPosition;
                this.this$0.currentItemPosition = i11 + 1;
                i12 = this.this$0.currentItemPosition;
                hotTicketsItemAdapter = this.this$0.hotTicketsAdapter;
                if (i12 >= hotTicketsItemAdapter.getShimmersCount()) {
                }
                i13 = this.this$0.currentItemPosition;
                CustomSpeedSmoothScroller customSpeedSmoothScroller2 = new CustomSpeedSmoothScroller(this.this$0.getContext(), i13 != 0 ? 25.0f : 100.0f);
                i14 = this.this$0.currentItemPosition;
                customSpeedSmoothScroller2.setTargetPosition(i14);
                this.$layoutManager.startSmoothScroll(customSpeedSmoothScroller2);
                if (N.f(m11)) {
                    return Unit.f71690a;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotTicketsWidgetViewHolder$startAutoSwipe$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
