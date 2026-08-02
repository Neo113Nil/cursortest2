package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.H;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenViewModel;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.MainDrawMajorScreenAnimationView;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0015\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001a¨\u0006!"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenUpdateAnimationController;", "", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/MainDrawMajorScreenAnimationView;", "animationView", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel;", "viewModel", "Landroidx/lifecycle/v;", "lifecycle", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/MainDrawMajorScreenAnimationView;Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel;Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$UpdateProgressAnimation;", "item", "handleProgressDataAction", "(Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$UpdateProgressAnimation;)V", "startAnimationProcess", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState$Start;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnAnimationEndListener", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/MainDrawMajorScreenAnimationView;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel;", "Landroidx/lifecycle/v;", "Lkotlin/jvm/functions/Function1;", "Lxe/B0;", "animationJob", "Lxe/B0;", "animationData", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$UpdateProgressAnimation;", "onAnimationEndListener", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MainDrawMajorScreenUpdateAnimationController {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private MainDrawMajorScreenVO.UpdateProgressAnimation animationData;
    private B0 animationJob;

    @NotNull
    private final MainDrawMajorScreenAnimationView animationView;

    @NotNull
    private final AbstractC5434v lifecycle;
    private Function1<? super MainDrawMajorScreenViewModel.AnimationState.Start, Unit> onAnimationEndListener;

    @NotNull
    private final MainDrawMajorScreenViewModel viewModel;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenUpdateAnimationController$1", f = "MainDrawMajorScreenUpdateAnimationController.kt", l = {29}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenUpdateAnimationController$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return MainDrawMajorScreenUpdateAnimationController.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2395h a11 = C5427n.a(MainDrawMajorScreenUpdateAnimationController.this.viewModel.observeAnimationState(), MainDrawMajorScreenUpdateAnimationController.this.lifecycle, AbstractC5434v.b.RESUMED);
                final MainDrawMajorScreenUpdateAnimationController mainDrawMajorScreenUpdateAnimationController = MainDrawMajorScreenUpdateAnimationController.this;
                InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenUpdateAnimationController.1.1

                    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenUpdateAnimationController$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
                        final /* synthetic */ MainDrawMajorScreenViewModel.AnimationState $state;
                        final /* synthetic */ MainDrawMajorScreenUpdateAnimationController this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(MainDrawMajorScreenUpdateAnimationController mainDrawMajorScreenUpdateAnimationController, MainDrawMajorScreenViewModel.AnimationState animationState) {
                            super(0);
                            this.this$0 = mainDrawMajorScreenUpdateAnimationController;
                            this.$state = animationState;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.f71690a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Function1 function1 = this.this$0.onAnimationEndListener;
                            if (function1 != null) {
                                function1.invoke(this.$state);
                            }
                            this.this$0.animationView.setVisibility(8);
                        }
                    }

                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((MainDrawMajorScreenViewModel.AnimationState) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(MainDrawMajorScreenViewModel.AnimationState animationState, d<? super Unit> dVar) {
                        if (animationState instanceof MainDrawMajorScreenViewModel.AnimationState.Start) {
                            MainDrawMajorScreenVO.UpdateProgressAnimation updateProgressAnimation = MainDrawMajorScreenUpdateAnimationController.this.animationData;
                            if (updateProgressAnimation != null) {
                                MainDrawMajorScreenUpdateAnimationController.this.handleProgressDataAction(updateProgressAnimation);
                            }
                            MainDrawMajorScreenUpdateAnimationController.this.animationView.startAnimation(new AnonymousClass2(MainDrawMajorScreenUpdateAnimationController.this, animationState));
                        } else if (animationState instanceof MainDrawMajorScreenViewModel.AnimationState.Restart) {
                            MainDrawMajorScreenVO.UpdateProgressAnimation updateProgressAnimation2 = MainDrawMajorScreenUpdateAnimationController.this.animationData;
                            if (updateProgressAnimation2 != null) {
                                MainDrawMajorScreenUpdateAnimationController.this.handleProgressDataAction(updateProgressAnimation2);
                            }
                        } else if (!(animationState instanceof MainDrawMajorScreenViewModel.AnimationState.Empty)) {
                            throw new o();
                        }
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (((AbstractC2635g) a11).collect(interfaceC2397i, this) == aVar) {
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
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainDrawMajorScreenUpdateAnimationController(@NotNull MainDrawMajorScreenAnimationView animationView, @NotNull MainDrawMajorScreenViewModel viewModel, @NotNull AbstractC5434v lifecycle, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(animationView, "animationView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.animationView = animationView;
        this.viewModel = viewModel;
        this.lifecycle = lifecycle;
        this.actionHandler = actionHandler;
        C10727i.c(H.a(lifecycle), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleProgressDataAction(MainDrawMajorScreenVO.UpdateProgressAnimation item) {
        B0 b02 = this.animationJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.animationJob = C10727i.c(H.a(this.lifecycle), null, null, new MainDrawMajorScreenUpdateAnimationController$handleProgressDataAction$1(item, this, null), 3);
    }

    public final void setOnAnimationEndListener(@NotNull Function1<? super MainDrawMajorScreenViewModel.AnimationState.Start, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onAnimationEndListener = listener;
    }

    public final void startAnimationProcess(MainDrawMajorScreenVO.UpdateProgressAnimation item) {
        this.animationData = item;
        if (item == null) {
            this.animationView.setVisibility(8);
            return;
        }
        this.viewModel.updateAnimationState(MainDrawMajorScreenViewModel.AnimationState.Empty.INSTANCE);
        this.actionHandler.invoke(item.getProgressDataAction());
    }
}
