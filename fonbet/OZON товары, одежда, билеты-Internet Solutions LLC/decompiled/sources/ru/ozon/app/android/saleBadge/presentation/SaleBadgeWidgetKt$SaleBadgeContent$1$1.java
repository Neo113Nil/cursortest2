package ru.ozon.app.android.saleBadge.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C8004n;
import m0.C8008p;
import m0.T0;
import ru.ozon.app.android.saleBadge.presentation.SaleBadgeVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.saleBadge.presentation.SaleBadgeWidgetKt$SaleBadgeContent$1$1", f = "SaleBadgeWidget.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SaleBadgeWidgetKt$SaleBadgeContent$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C7980b<Float, C8008p> $labelAlphaAnimation;
    final /* synthetic */ C7980b<Float, C8008p> $overlayProgressAnimation;
    final /* synthetic */ SaleBadgeVO $state;
    final /* synthetic */ SaleBadgeViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaleBadgeWidgetKt$SaleBadgeContent$1$1(SaleBadgeViewModel saleBadgeViewModel, C7980b<Float, C8008p> c7980b, SaleBadgeVO saleBadgeVO, C7980b<Float, C8008p> c7980b2, d<? super SaleBadgeWidgetKt$SaleBadgeContent$1$1> dVar) {
        super(2, dVar);
        this.$viewModel = saleBadgeViewModel;
        this.$overlayProgressAnimation = c7980b;
        this.$state = saleBadgeVO;
        this.$labelAlphaAnimation = c7980b2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SaleBadgeWidgetKt$SaleBadgeContent$1$1(this.$viewModel, this.$overlayProgressAnimation, this.$state, this.$labelAlphaAnimation, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h o11 = C2399j.o(this.$viewModel.isStartAnimation());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overlayProgressAnimation, this.$state, this.$labelAlphaAnimation, this.$viewModel);
            this.label = 1;
            if (o11.collect(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SaleBadgeWidgetKt$SaleBadgeContent$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "emit", "(Lkotlin/Unit;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.saleBadge.presentation.SaleBadgeWidgetKt$SaleBadgeContent$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements InterfaceC2397i {
        final /* synthetic */ C7980b<Float, C8008p> $labelAlphaAnimation;
        final /* synthetic */ C7980b<Float, C8008p> $overlayProgressAnimation;
        final /* synthetic */ SaleBadgeVO $state;
        final /* synthetic */ SaleBadgeViewModel $viewModel;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/b;", "", "Lm0/p;", "", "invoke", "(Lm0/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.saleBadge.presentation.SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C18561 extends AbstractC7737t implements Function1<C7980b<Float, C8008p>, Unit> {
            final /* synthetic */ SaleBadgeViewModel $viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18561(SaleBadgeViewModel saleBadgeViewModel) {
                super(1);
                this.$viewModel = saleBadgeViewModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C7980b<Float, C8008p> c7980b) {
                invoke2(c7980b);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C7980b<Float, C8008p> animateTo) {
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                this.$viewModel.saveAnimProgress(animateTo.k().floatValue());
            }
        }

        AnonymousClass1(C7980b<Float, C8008p> c7980b, SaleBadgeVO saleBadgeVO, C7980b<Float, C8008p> c7980b2, SaleBadgeViewModel saleBadgeViewModel) {
            this.$overlayProgressAnimation = c7980b;
            this.$state = saleBadgeVO;
            this.$labelAlphaAnimation = c7980b2;
            this.$viewModel = saleBadgeViewModel;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00e1, code lost:
        
            if (m0.C7980b.f(r1, r2, r3, r4, r5, 4) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
        
            if (m0.C7980b.f(r1, r13, r3, r4, r5, 4) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        
            if (r13.m(r1, r5) != r0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Unit unit, d<? super Unit> dVar) {
            SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1 saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1;
            int i11;
            AnonymousClass1<T> anonymousClass1;
            if (dVar instanceof SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1) {
                saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1 = (SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1) dVar;
                int i12 = saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1 saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12 = saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1;
                    Object obj = saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.label;
                    if (i11 != 0) {
                        s.b(obj);
                        if (unit != null) {
                            C7980b<Float, C8008p> c7980b = this.$overlayProgressAnimation;
                            SaleBadgeVO.BackgroundOverlay backgroundOverlay = this.$state.getBackgroundOverlay();
                            Float f7 = new Float(backgroundOverlay != null ? backgroundOverlay.getOverlayProgress() : 1.0f);
                            saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.L$0 = this;
                            saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.label = 1;
                            if (c7980b.m(f7, saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12) != aVar) {
                                anonymousClass1 = this;
                                C7980b<Float, C8008p> c7980b2 = anonymousClass1.$labelAlphaAnimation;
                                Float f11 = new Float(0.0f);
                                saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.L$0 = anonymousClass1;
                                saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.label = 2;
                            }
                            return aVar;
                        }
                    } else if (i11 == 1) {
                        anonymousClass1 = (AnonymousClass1) saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.L$0;
                        s.b(obj);
                        C7980b<Float, C8008p> c7980b22 = anonymousClass1.$labelAlphaAnimation;
                        Float f112 = new Float(0.0f);
                        saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.L$0 = anonymousClass1;
                        saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.label = 2;
                    } else if (i11 == 2) {
                        anonymousClass1 = (AnonymousClass1) saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.L$0;
                        s.b(obj);
                        if (anonymousClass1.$state.getAnimationBgProgress() != null) {
                            C7980b<Float, C8008p> c7980b3 = anonymousClass1.$overlayProgressAnimation;
                            Float animationBgProgress = anonymousClass1.$state.getAnimationBgProgress();
                            T0 d11 = C8004n.d(800, 1000, null, 4);
                            C18561 c18561 = new C18561(anonymousClass1.$viewModel);
                            saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.L$0 = anonymousClass1;
                            saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.label = 3;
                        }
                        if (anonymousClass1.$state.getLabelAnimation() != null) {
                        }
                    } else if (i11 == 3) {
                        anonymousClass1 = (AnonymousClass1) saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.L$0;
                        s.b(obj);
                        if (anonymousClass1.$state.getLabelAnimation() != null) {
                            C7980b<Float, C8008p> c7980b4 = anonymousClass1.$labelAlphaAnimation;
                            SaleBadgeViewModel saleBadgeViewModel = anonymousClass1.$viewModel;
                            Float f12 = new Float(1.0f);
                            T0 d12 = C8004n.d(300, 1000, null, 4);
                            SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$2$1 saleBadgeWidgetKt$SaleBadgeContent$1$1$1$2$1 = new SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$2$1(saleBadgeViewModel);
                            saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.L$0 = null;
                            saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$12.label = 4;
                        }
                    } else {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return Unit.f71690a;
                }
            }
            saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1 = new SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1(this, dVar);
            SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1 saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$122 = saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1;
            Object obj2 = saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$122.result;
            a aVar2 = a.COROUTINE_SUSPENDED;
            i11 = saleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$122.label;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }

        @Override // Ae.InterfaceC2397i
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit((Unit) obj, (d<? super Unit>) dVar);
        }
    }
}
