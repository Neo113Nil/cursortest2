package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import Sc.s;
import Wc.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;
import xe.l1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl$startFindViewJob$1", f = "OnBoardingDelegate.kt", l = {161, 173, 175, 178}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OnBoardingDelegateImpl$startFindViewJob$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ OnBoardingDelegateImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl$startFindViewJob$1$1", f = "OnBoardingDelegate.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl$startFindViewJob$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ RecyclerView $rv;
        int label;
        final /* synthetic */ OnBoardingDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OnBoardingDelegateImpl onBoardingDelegateImpl, RecyclerView recyclerView, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = onBoardingDelegateImpl;
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
    OnBoardingDelegateImpl$startFindViewJob$1(OnBoardingDelegateImpl onBoardingDelegateImpl, d<? super OnBoardingDelegateImpl$startFindViewJob$1> dVar) {
        super(2, dVar);
        this.this$0 = onBoardingDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OnBoardingDelegateImpl$startFindViewJob$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0129, code lost:
    
        if (r12.awaitBottomSheetHidden(r11) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0072, code lost:
    
        r7 = r11.this$0.getTargetView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007d, code lost:
    
        r1 = r11.this$0.viewHolder;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009f, code lost:
    
        if (r12 == r0) goto L57;
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x00b6 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0148  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RecyclerView composerRv;
        View targetView;
        k kVar;
        k kVar2;
        int i11;
        L0 l02;
        AnonymousClass1 anonymousClass1;
        boolean z11;
        boolean isViewInAcceptableRange;
        BaseOnBoardingViewModel baseOnBoardingViewModel;
        boolean isEnoughSpaceForOnboarding;
        int bottomOffset;
        int i12;
        BottomSheetVisibilityObserver bottomSheetVisibilityObserver;
        ComposerReferences composerReferences;
        BottomSheetVisibilityObserver bottomSheetVisibilityObserver2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.label;
        if (i13 == 0) {
            s.b(obj);
            composerRv = this.this$0.getComposerRv();
            if (composerRv != null && targetView != null && kVar != null) {
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l03 = De.s.f6650a;
                OnBoardingDelegateImpl$startFindViewJob$1$bannerHeight$1 onBoardingDelegateImpl$startFindViewJob$1$bannerHeight$1 = new OnBoardingDelegateImpl$startFindViewJob$1$bannerHeight$1(this.this$0, null);
                this.L$0 = composerRv;
                this.L$1 = targetView;
                this.L$2 = kVar;
                this.label = 1;
                obj = C10727i.f(l03, onBoardingDelegateImpl$startFindViewJob$1$bannerHeight$1, this);
            }
            return Unit.f71690a;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                i11 = this.I$0;
                kVar2 = (k) this.L$2;
                targetView = (View) this.L$1;
                composerRv = (RecyclerView) this.L$0;
                s.b(obj);
                C10720e0 c10720e02 = C10720e0.f105451a;
                l02 = De.s.f6650a;
                anonymousClass1 = new AnonymousClass1(this.this$0, composerRv, null);
                this.L$0 = composerRv;
                this.L$1 = targetView;
                this.L$2 = kVar2;
                this.I$0 = i11;
                this.label = 3;
                if (C10727i.f(l02, anonymousClass1, this) != aVar) {
                }
                return aVar;
            }
            if (i13 == 3) {
                i11 = this.I$0;
                kVar2 = (k) this.L$2;
                targetView = (View) this.L$1;
                composerRv = (RecyclerView) this.L$0;
                s.b(obj);
                this.this$0.isFindView = false;
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.I$0;
                kVar2 = (k) this.L$2;
                targetView = (View) this.L$1;
                composerRv = (RecyclerView) this.L$0;
                s.b(obj);
            }
            while (z11) {
                if (!composerRv.isAnimating() && kVar2.getViewHolderPositionInfo().c()) {
                    isViewInAcceptableRange = this.this$0.isViewInAcceptableRange(kVar2);
                    if (isViewInAcceptableRange) {
                        baseOnBoardingViewModel = this.this$0.viewModel;
                        if (baseOnBoardingViewModel.getIsEnabled()) {
                            isEnoughSpaceForOnboarding = this.this$0.isEnoughSpaceForOnboarding(kVar2);
                            if (isEnoughSpaceForOnboarding) {
                                int height = targetView.getHeight() + i11;
                                bottomOffset = this.this$0.getBottomOffset();
                                int i14 = bottomOffset + height;
                                i12 = this.this$0.windowHeight;
                                if (i14 > i12) {
                                    return Unit.f71690a;
                                }
                                bottomSheetVisibilityObserver = this.this$0.bottomSheetObserver;
                                composerReferences = this.this$0.refs;
                                if (!bottomSheetVisibilityObserver.isCurrentFragmentBottomSheet(composerReferences.getContainer().c())) {
                                    bottomSheetVisibilityObserver2 = this.this$0.bottomSheetObserver;
                                    this.L$0 = composerRv;
                                    this.L$1 = targetView;
                                    this.L$2 = kVar2;
                                    this.I$0 = i11;
                                    this.label = 2;
                                }
                                C10720e0 c10720e022 = C10720e0.f105451a;
                                l02 = De.s.f6650a;
                                anonymousClass1 = new AnonymousClass1(this.this$0, composerRv, null);
                                this.L$0 = composerRv;
                                this.L$1 = targetView;
                                this.L$2 = kVar2;
                                this.I$0 = i11;
                                this.label = 3;
                                if (C10727i.f(l02, anonymousClass1, this) != aVar) {
                                    this.this$0.isFindView = false;
                                    while (z11) {
                                    }
                                }
                                return aVar;
                            }
                        }
                    }
                }
                this.L$0 = composerRv;
                this.L$1 = targetView;
                this.L$2 = kVar2;
                this.I$0 = i11;
                this.label = 4;
                if (l1.a(this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        kVar = (k) this.L$2;
        targetView = (View) this.L$1;
        composerRv = (RecyclerView) this.L$0;
        s.b(obj);
        int intValue = ((Number) obj).intValue();
        this.this$0.isFindView = true;
        kVar2 = kVar;
        i11 = intValue;
        while (z11) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OnBoardingDelegateImpl$startFindViewJob$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
