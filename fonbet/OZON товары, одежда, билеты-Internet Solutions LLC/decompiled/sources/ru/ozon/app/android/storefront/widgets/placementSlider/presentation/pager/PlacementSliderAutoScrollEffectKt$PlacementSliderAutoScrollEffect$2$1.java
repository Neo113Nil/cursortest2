package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import Sc.s;
import Wc.a;
import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;
import y0.b0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$2$1", f = "PlacementSliderAutoScrollEffect.kt", l = {68, 74}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $autoScrollStartedAtMillis;
    final /* synthetic */ boolean $isAutoScrollPaused;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ Function1<Integer, Integer> $nextPage;
    final /* synthetic */ b0 $pagerState;
    final /* synthetic */ long $scrollInterval;
    long J$0;
    long J$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$2$1(long j11, boolean z11, boolean z12, long j12, b0 b0Var, Function1<? super Integer, Integer> function1, d<? super PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$2$1> dVar) {
        super(2, dVar);
        this.$scrollInterval = j11;
        this.$isEnabled = z11;
        this.$isAutoScrollPaused = z12;
        this.$autoScrollStartedAtMillis = j12;
        this.$pagerState = b0Var;
        this.$nextPage = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$2$1(this.$scrollInterval, this.$isEnabled, this.$isAutoScrollPaused, this.$autoScrollStartedAtMillis, this.$pagerState, this.$nextPage, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008a -> B:6:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j11;
        long j12;
        long j13;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long j14 = this.$scrollInterval;
            if (j14 == 0 || !this.$isEnabled || this.$isAutoScrollPaused) {
                return Unit.f71690a;
            }
            j11 = j14 * 1000;
        } else {
            if (i11 == 1) {
                j13 = this.J$1;
                j12 = this.J$0;
                s.b(obj);
                if (j13 >= j12) {
                    return Unit.f71690a;
                }
                b0 b0Var = this.$pagerState;
                int intValue = this.$nextPage.invoke(new Integer(b0Var.r())).intValue();
                this.J$0 = j12;
                this.label = 2;
                if (b0.m(b0Var, intValue, null, this, 6) != aVar) {
                    j11 = j12;
                }
                return aVar;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = this.J$0;
            s.b(obj);
        }
        long elapsedRealtime = 3600000 - (SystemClock.elapsedRealtime() - this.$autoScrollStartedAtMillis);
        if (elapsedRealtime <= 0) {
            return Unit.f71690a;
        }
        long min = Math.min(j11, elapsedRealtime);
        this.J$0 = j11;
        this.J$1 = min;
        this.label = 1;
        if (Y.b(min, this) != aVar) {
            j12 = j11;
            j13 = min;
            if (j13 >= j12) {
            }
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
