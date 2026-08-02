package ru.ozon.app.android.travel.utils.extensions;

import Sc.s;
import Wc.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import xe.M;
import xe.N;
import xe.l1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$updateHeightFromMaxItem$2", f = "RecyclerViewExtensions.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$updateHeightFromMaxItem$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ RecyclerView.g<?> $adapter;
    final /* synthetic */ Function1<Integer, Unit> $applyNewHeightCallback;
    final /* synthetic */ K $cachedLocalMax;
    final /* synthetic */ int $itemsPerYield;
    final /* synthetic */ RecyclerView $rv;
    final /* synthetic */ int $targetItemWidth;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$updateHeightFromMaxItem$2(RecyclerView.g<?> gVar, int i11, RecyclerView recyclerView, int i12, K k11, Function1<? super Integer, Unit> function1, d<? super RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$updateHeightFromMaxItem$2> dVar) {
        super(2, dVar);
        this.$adapter = gVar;
        this.$targetItemWidth = i11;
        this.$rv = recyclerView;
        this.$itemsPerYield = i12;
        this.$cachedLocalMax = k11;
        this.$applyNewHeightCallback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$updateHeightFromMaxItem$2 recyclerViewExtensionsKt$autoSetHeightFromMaxItem$updateHeightFromMaxItem$2 = new RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$updateHeightFromMaxItem$2(this.$adapter, this.$targetItemWidth, this.$rv, this.$itemsPerYield, this.$cachedLocalMax, this.$applyNewHeightCallback, dVar);
        recyclerViewExtensionsKt$autoSetHeightFromMaxItem$updateHeightFromMaxItem$2.L$0 = obj;
        return recyclerViewExtensionsKt$autoSetHeightFromMaxItem$updateHeightFromMaxItem$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.recyclerview.widget.RecyclerView$C, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00b1 -> B:6:0x00dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00da -> B:5:0x00db). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i11;
        M m11;
        int i12;
        int cardsCount;
        int i13;
        int i14;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = this.label;
        if (i15 == 0) {
            s.b(obj);
            M m12 = (M) this.L$0;
            if (this.$adapter.getCardsCount() == 0) {
                return Unit.f71690a;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.$targetItemWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(536870911, LinearLayoutManager.INVALID_OFFSET);
            i11 = 0;
            m11 = m12;
            i12 = makeMeasureSpec;
            cardsCount = this.$adapter.getCardsCount();
            i13 = makeMeasureSpec2;
            i14 = 0;
            if (i14 < cardsCount) {
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cardsCount = this.I$4;
            i14 = this.I$3;
            i13 = this.I$2;
            int i16 = this.I$1;
            int max = this.I$0;
            m11 = (M) this.L$0;
            s.b(obj);
            i12 = i16;
            i11 = max;
            i14++;
            if (i14 < cardsCount) {
                N.e(m11);
                ?? createViewHolder = this.$adapter.createViewHolder(new FrameLayout(this.$rv.getContext()), this.$adapter.getItemViewType(i14));
                this.$adapter.bindViewHolder(createViewHolder, i14);
                Intrinsics.checkNotNullExpressionValue(createViewHolder, "also(...)");
                createViewHolder.itemView.setLayoutParams(new RecyclerView.p(-1, -2));
                createViewHolder.itemView.forceLayout();
                createViewHolder.itemView.measure(i12, i13);
                int paddingBottom = this.$rv.getPaddingBottom() + this.$rv.getPaddingTop() + createViewHolder.itemView.getMeasuredHeight();
                this.$adapter.onViewRecycled(createViewHolder);
                max = Math.max(i11, paddingBottom);
                if ((i14 + 1) % this.$itemsPerYield == 0) {
                    if (max > 0 && max > this.$cachedLocalMax.f71785a) {
                        this.$applyNewHeightCallback.invoke(new Integer(max));
                    }
                    this.L$0 = m11;
                    this.I$0 = max;
                    this.I$1 = i12;
                    this.I$2 = i13;
                    this.I$3 = i14;
                    this.I$4 = cardsCount;
                    this.label = 1;
                    if (l1.a(this) == aVar) {
                        return aVar;
                    }
                    i16 = i12;
                    i12 = i16;
                }
                i11 = max;
                i14++;
                if (i14 < cardsCount) {
                    if (i11 > 0) {
                        this.$cachedLocalMax.f71785a = i11;
                        this.$applyNewHeightCallback.invoke(new Integer(i11));
                    }
                    return Unit.f71690a;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$updateHeightFromMaxItem$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
