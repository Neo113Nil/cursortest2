package ru.ozon.app.android.storefront.domain.onboarding.presentation;

import Sc.s;
import Wc.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingResolver;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;
import xe.l1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegateImpl$startFindViewJob$1", f = "OnboardingDelegate.kt", l = {170, 182, 185}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OnboardingDelegateImpl$startFindViewJob$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OnboardingDelegateImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegateImpl$startFindViewJob$1$1", f = "OnboardingDelegate.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegateImpl$startFindViewJob$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ RecyclerView $rv;
        int label;
        final /* synthetic */ OnboardingDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OnboardingDelegateImpl onboardingDelegateImpl, RecyclerView recyclerView, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = onboardingDelegateImpl;
            this.$rv = recyclerView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$rv, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.this$0.showOnboarding(this.$rv);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingDelegateImpl$startFindViewJob$1(OnboardingDelegateImpl onboardingDelegateImpl, d<? super OnboardingDelegateImpl$startFindViewJob$1> dVar) {
        super(2, dVar);
        this.this$0 = onboardingDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OnboardingDelegateImpl$startFindViewJob$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0058, code lost:
    
        r1 = r9.this$0.targetView;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0089 A[Catch: CancellationException -> 0x0020, TryCatch #0 {CancellationException -> 0x0020, blocks: (B:8:0x001c, B:11:0x0089, B:13:0x008f, B:15:0x009f, B:26:0x00a7, B:35:0x00bb, B:28:0x00be, B:18:0x00da, B:45:0x0035, B:49:0x0046, B:50:0x007e, B:52:0x004d, B:54:0x0055, B:56:0x0058, B:58:0x0060, B:60:0x0063), top: B:2:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RecyclerView composerRv;
        View view;
        RecyclerView recyclerView;
        View view2;
        int intValue;
        boolean isViewInAcceptableRange;
        int bottomOffset;
        int i11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = this.label;
        int i13 = 1;
        try {
            if (i12 == 0) {
                s.b(obj);
                composerRv = this.this$0.getComposerRv();
                if (composerRv != null && view != null) {
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 l02 = De.s.f6650a;
                    OnboardingDelegateImpl$startFindViewJob$1$bannerHeight$1 onboardingDelegateImpl$startFindViewJob$1$bannerHeight$1 = new OnboardingDelegateImpl$startFindViewJob$1$bannerHeight$1(this.this$0, null);
                    this.L$0 = composerRv;
                    this.L$1 = view;
                    this.I$0 = 1;
                    this.label = 1;
                    obj = C10727i.f(l02, onboardingDelegateImpl$startFindViewJob$1$bannerHeight$1, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    intValue = this.I$0;
                    View view3 = (View) this.L$1;
                    RecyclerView recyclerView2 = (RecyclerView) this.L$0;
                    s.b(obj);
                    recyclerView = recyclerView2;
                    view2 = view3;
                    i13 = 0;
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intValue = this.I$1;
                    i13 = this.I$0;
                    view2 = (View) this.L$1;
                    recyclerView = (RecyclerView) this.L$0;
                    s.b(obj);
                }
                while (i13 != 0) {
                    if (!recyclerView.isAnimating() && this.this$0.widgetViewHolder.getViewHolderPositionInfo().c()) {
                        isViewInAcceptableRange = this.this$0.isViewInAcceptableRange();
                        if (isViewInAcceptableRange) {
                            int height = view2.getHeight() + intValue;
                            bottomOffset = this.this$0.getBottomOffset();
                            int i14 = height + bottomOffset;
                            i11 = this.this$0.windowHeight;
                            if (i14 > i11) {
                                return Unit.f71690a;
                            }
                            C10720e0 c10720e02 = C10720e0.f105451a;
                            L0 l03 = De.s.f6650a;
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, recyclerView, null);
                            this.L$0 = recyclerView;
                            this.L$1 = view2;
                            this.I$0 = intValue;
                            this.label = 2;
                            if (C10727i.f(l03, anonymousClass1, this) == aVar) {
                                return aVar;
                            }
                            i13 = 0;
                        }
                    }
                    this.L$0 = recyclerView;
                    this.L$1 = view2;
                    this.I$0 = i13;
                    this.I$1 = intValue;
                    this.label = 3;
                    if (l1.a(this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            i13 = this.I$0;
            view = (View) this.L$1;
            composerRv = (RecyclerView) this.L$0;
            s.b(obj);
            recyclerView = composerRv;
            view2 = view;
            intValue = ((Number) obj).intValue();
            while (i13 != 0) {
            }
            return Unit.f71690a;
        } catch (CancellationException e11) {
            CommonOnboardingResolver.INSTANCE.onStopShow();
            throw e11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OnboardingDelegateImpl$startFindViewJob$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
