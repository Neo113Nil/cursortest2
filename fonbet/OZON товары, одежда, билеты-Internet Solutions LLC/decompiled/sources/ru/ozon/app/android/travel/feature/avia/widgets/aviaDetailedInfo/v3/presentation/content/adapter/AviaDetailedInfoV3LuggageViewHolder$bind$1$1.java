package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter;

import Sc.s;
import Wc.a;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3VO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter.luggage.AviaDetailedInfoV3LuggageAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.view.AviaDetailedInfoV3LuggageView;
import ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter.AviaDetailedInfoV3LuggageViewHolder$bind$1$1", f = "AviaDetailedInfoV3LuggageViewHolder.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaDetailedInfoV3LuggageViewHolder$bind$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AviaDetailedInfoV3LuggageView $luggage;
    final /* synthetic */ AviaDetailedInfoV3VO.LuggageContentItemsVO $this_run;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AviaDetailedInfoV3LuggageViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaDetailedInfoV3LuggageViewHolder$bind$1$1(AviaDetailedInfoV3LuggageView aviaDetailedInfoV3LuggageView, AviaDetailedInfoV3LuggageViewHolder aviaDetailedInfoV3LuggageViewHolder, AviaDetailedInfoV3VO.LuggageContentItemsVO luggageContentItemsVO, d<? super AviaDetailedInfoV3LuggageViewHolder$bind$1$1> dVar) {
        super(2, dVar);
        this.$luggage = aviaDetailedInfoV3LuggageView;
        this.this$0 = aviaDetailedInfoV3LuggageViewHolder;
        this.$this_run = luggageContentItemsVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AviaDetailedInfoV3LuggageViewHolder$bind$1$1 aviaDetailedInfoV3LuggageViewHolder$bind$1$1 = new AviaDetailedInfoV3LuggageViewHolder$bind$1$1(this.$luggage, this.this$0, this.$this_run, dVar);
        aviaDetailedInfoV3LuggageViewHolder$bind$1$1.L$0 = obj;
        return aviaDetailedInfoV3LuggageViewHolder$bind$1$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        M m12;
        RecyclerView recyclerView;
        LinearLayout linearLayout;
        AviaDetailedInfoV3LuggageAdapter aviaDetailedInfoV3LuggageAdapter;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            AviaDetailedInfoV3LuggageView aviaDetailedInfoV3LuggageView = this.$luggage;
            AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO tallestItem = this.$this_run.getTallestItem();
            if (tallestItem != null) {
                aviaDetailedInfoV3LuggageView.bind(tallestItem);
                this.L$0 = m11;
                this.label = 1;
                if (ViewExtensionsKt.awaitNextLayout(aviaDetailedInfoV3LuggageView, this) == aVar) {
                    return aVar;
                }
                m12 = m11;
            }
            if (N.f(m11)) {
                recyclerView = this.this$0.recyclerView;
                if (recyclerView != null) {
                    AviaDetailedInfoV3LuggageView aviaDetailedInfoV3LuggageView2 = this.$luggage;
                    ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = aviaDetailedInfoV3LuggageView2.getHeight();
                    recyclerView.setLayoutParams(layoutParams);
                }
                linearLayout = this.this$0.linearLayout;
                linearLayout.removeView(this.$luggage);
                aviaDetailedInfoV3LuggageAdapter = this.this$0.luggageAdapter;
                aviaDetailedInfoV3LuggageAdapter.submitList(this.$this_run.getItems());
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m12 = (M) this.L$0;
        s.b(obj);
        m11 = m12;
        if (N.f(m11)) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AviaDetailedInfoV3LuggageViewHolder$bind$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
