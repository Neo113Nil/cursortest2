package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view.tools;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselViewModelAction;
import v0.I;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view.tools.CenterItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$1$1", f = "CenterItemByIndexTools.kt", l = {33, 38}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class CenterItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $itemWidthPx;
    final /* synthetic */ int $lastSelectedIndex;
    final /* synthetic */ Function1<InsuranceCarouselViewModelAction, Unit> $onAction;
    final /* synthetic */ I $this_CenterItemByIndexAfterListUpdate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CenterItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$1$1(I i11, int i12, int i13, int i14, Function1<? super InsuranceCarouselViewModelAction, Unit> function1, d<? super CenterItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$1$1> dVar) {
        super(2, dVar);
        this.$this_CenterItemByIndexAfterListUpdate = i11;
        this.$index = i12;
        this.$lastSelectedIndex = i13;
        this.$itemWidthPx = i14;
        this.$onAction = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CenterItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$1$1(this.$this_CenterItemByIndexAfterListUpdate, this.$index, this.$lastSelectedIndex, this.$itemWidthPx, this.$onAction, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r1.G(r2, r6, r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r1.k(r3, r6, r5) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int centerOffset;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            int d11 = this.$this_CenterItemByIndexAfterListUpdate.t().d();
            if (d11 == 0) {
                return Unit.f71690a;
            }
            int i12 = this.$index;
            if (i12 != this.$lastSelectedIndex && i12 >= 0 && i12 < d11) {
                centerOffset = CenterItemByIndexToolsKt.centerOffset(this.$this_CenterItemByIndexAfterListUpdate, this.$itemWidthPx);
                if (this.$lastSelectedIndex == -1) {
                    I i13 = this.$this_CenterItemByIndexAfterListUpdate;
                    int i14 = this.$index;
                    this.label = 1;
                } else {
                    I i15 = this.$this_CenterItemByIndexAfterListUpdate;
                    int i16 = this.$index;
                    this.label = 2;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$onAction.invoke(new InsuranceCarouselViewModelAction.OnSaveLastSelectedIndex(this.$index));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CenterItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
