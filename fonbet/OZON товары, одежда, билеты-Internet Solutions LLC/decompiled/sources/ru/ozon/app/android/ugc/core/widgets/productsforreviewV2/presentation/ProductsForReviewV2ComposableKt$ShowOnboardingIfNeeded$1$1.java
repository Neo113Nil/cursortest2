package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8008p;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$ShowOnboardingIfNeeded$1$1", f = "ProductsForReviewV2Composable.kt", l = {501, 502, 503, 504}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$ShowOnboardingIfNeeded$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ float $actionsWidthPx;
    final /* synthetic */ C7980b<Float, C8008p> $offsetX;
    final /* synthetic */ Function0<Unit> $onOnboardingShown;
    final /* synthetic */ boolean $shouldShowOnboarding;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsForReviewV2ComposableKt$ShowOnboardingIfNeeded$1$1(boolean z11, C7980b<Float, C8008p> c7980b, float f7, Function0<Unit> function0, d<? super ProductsForReviewV2ComposableKt$ShowOnboardingIfNeeded$1$1> dVar) {
        super(2, dVar);
        this.$shouldShowOnboarding = z11;
        this.$offsetX = c7980b;
        this.$actionsWidthPx = f7;
        this.$onOnboardingShown = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProductsForReviewV2ComposableKt$ShowOnboardingIfNeeded$1$1(this.$shouldShowOnboarding, this.$offsetX, this.$actionsWidthPx, this.$onOnboardingShown, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r8 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (xe.Y.b(600, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r8 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (xe.Y.b(1000, r7) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object smoothAnimateTo;
        Object smoothAnimateTo2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$shouldShowOnboarding) {
                this.label = 1;
            }
            return Unit.f71690a;
        }
        if (i11 == 1) {
            s.b(obj);
        } else if (i11 == 2) {
            s.b(obj);
            this.label = 3;
        } else {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.$onOnboardingShown.invoke();
                return Unit.f71690a;
            }
            s.b(obj);
            C7980b<Float, C8008p> c7980b = this.$offsetX;
            this.label = 4;
            smoothAnimateTo2 = ProductsForReviewV2ComposableKt.smoothAnimateTo(c7980b, 0.0f, this);
        }
        C7980b<Float, C8008p> c7980b2 = this.$offsetX;
        float f7 = -this.$actionsWidthPx;
        this.label = 2;
        smoothAnimateTo = ProductsForReviewV2ComposableKt.smoothAnimateTo(c7980b2, f7, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ProductsForReviewV2ComposableKt$ShowOnboardingIfNeeded$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
