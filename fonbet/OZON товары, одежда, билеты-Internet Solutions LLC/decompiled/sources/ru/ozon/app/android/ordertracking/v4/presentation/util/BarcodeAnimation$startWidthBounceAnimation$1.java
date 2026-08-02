package ru.ozon.app.android.ordertracking.v4.presentation.util;

import Sc.s;
import Wc.a;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ordertracking.v4.presentation.util.BarcodeAnimation$startWidthBounceAnimation$1", f = "BarcodeAnimation.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30, DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 32}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class BarcodeAnimation$startWidthBounceAnimation$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $additionalWidth;
    final /* synthetic */ View $view;
    int I$0;
    int I$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeAnimation$startWidthBounceAnimation$1(View view, int i11, d<? super BarcodeAnimation$startWidthBounceAnimation$1> dVar) {
        super(2, dVar);
        this.$view = view;
        this.$additionalWidth = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BarcodeAnimation$startWidthBounceAnimation$1(this.$view, this.$additionalWidth, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        if (r0 == r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (xe.Y.c(r2, r12) == r8) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j11;
        OvershootInterpolator overshootInterpolator;
        Object m872animateWidthgwCluXo;
        int i11;
        int i12;
        long j12;
        long j13;
        OvershootInterpolator overshootInterpolator2;
        Object m872animateWidthgwCluXo2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.label;
        if (i13 == 0) {
            s.b(obj);
            int width = this.$view.getWidth();
            int i14 = width + this.$additionalWidth;
            BarcodeAnimation barcodeAnimation = BarcodeAnimation.INSTANCE;
            View view = this.$view;
            j11 = BarcodeAnimation.ANIMATION_DURATION;
            overshootInterpolator = BarcodeAnimation.interpolator;
            this.I$0 = width;
            this.I$1 = i14;
            this.label = 1;
            m872animateWidthgwCluXo = barcodeAnimation.m872animateWidthgwCluXo(view, width, i14, j11, overshootInterpolator, this);
            if (m872animateWidthgwCluXo != aVar) {
                i11 = width;
                i12 = i14;
            }
            return aVar;
        }
        if (i13 == 1) {
            i12 = this.I$1;
            i11 = this.I$0;
            s.b(obj);
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            i12 = this.I$1;
            i11 = this.I$0;
            s.b(obj);
            int i15 = i12;
            int i16 = i11;
            BarcodeAnimation barcodeAnimation2 = BarcodeAnimation.INSTANCE;
            View view2 = this.$view;
            j13 = BarcodeAnimation.ANIMATION_DURATION;
            overshootInterpolator2 = BarcodeAnimation.interpolator;
            this.label = 3;
            m872animateWidthgwCluXo2 = barcodeAnimation2.m872animateWidthgwCluXo(view2, i15, i16, j13, overshootInterpolator2, this);
        }
        j12 = BarcodeAnimation.PAUSE_BETWEEN_ANIMATIONS;
        this.I$0 = i11;
        this.I$1 = i12;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BarcodeAnimation$startWidthBounceAnimation$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
