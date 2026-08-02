package ru.ozon.fintech.features.camera.presentation.camera;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import E30.f;
import Sc.o;
import Sc.s;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.camera.databinding.CameraFragmentBinding;
import ru.ozon.fintech.features.camera.databinding.CameraViewLayoutBinding;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.features.camera.ui.tips.TextTipsState;
import ru.ozon.fintech.features.camera.ui.tips.TextTipsView;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$onViewCreated$$inlined$observeWithoutRepeatOnLifeCycle$1", f = "CameraFragment.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CameraFragment$onViewCreated$$inlined$observeWithoutRepeatOnLifeCycle$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC2395h $this_observeWithoutRepeatOnLifeCycle;
    int label;
    final /* synthetic */ CameraFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraFragment$onViewCreated$$inlined$observeWithoutRepeatOnLifeCycle$1(InterfaceC2395h interfaceC2395h, d dVar, CameraFragment cameraFragment) {
        super(2, dVar);
        this.$this_observeWithoutRepeatOnLifeCycle = interfaceC2395h;
        this.this$0 = cameraFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CameraFragment$onViewCreated$$inlined$observeWithoutRepeatOnLifeCycle$1(this.$this_observeWithoutRepeatOnLifeCycle, dVar, this.this$0);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h interfaceC2395h = this.$this_observeWithoutRepeatOnLifeCycle;
            final CameraFragment cameraFragment = this.this$0;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$onViewCreated$$inlined$observeWithoutRepeatOnLifeCycle$1.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, d<? super Unit> dVar) {
                    CameraFragmentBinding cameraFragmentBinding;
                    CameraViewLayoutBinding cameraViewLayoutBinding;
                    TextTipsView textTipsView;
                    CameraFragmentBinding cameraFragmentBinding2;
                    CameraViewLayoutBinding cameraViewLayoutBinding2;
                    TextTipsView textTipsView2;
                    boolean z11;
                    int barSize;
                    TextTipsState textTipsState = (TextTipsState) t2;
                    if (textTipsState != null) {
                        int i12 = CameraFragment.WhenMappings.$EnumSwitchMapping$0[textTipsState.getType().ordinal()];
                        if (i12 == 1) {
                            cameraFragmentBinding = CameraFragment.this.binding;
                            if (cameraFragmentBinding != null && (cameraViewLayoutBinding = cameraFragmentBinding.cameraLayout) != null && (textTipsView = cameraViewLayoutBinding.fadeTextTips) != null) {
                                textTipsView.setVisibility(0);
                                textTipsView.bindsFadeAnimationState(textTipsState);
                            }
                        } else {
                            if (i12 != 2) {
                                throw new o();
                            }
                            cameraFragmentBinding2 = CameraFragment.this.binding;
                            if (cameraFragmentBinding2 != null && (cameraViewLayoutBinding2 = cameraFragmentBinding2.cameraLayout) != null && (textTipsView2 = cameraViewLayoutBinding2.drumTextTips) != null) {
                                z11 = CameraFragment.this.isCameraNotUnderSystemBars;
                                if (!z11) {
                                    barSize = CameraFragment.this.getBarSize("status_bar_height");
                                    Integer num = new Integer(barSize);
                                    if (num.intValue() <= 0) {
                                        num = null;
                                    }
                                    int intValue = num != null ? num.intValue() : f.e();
                                    ViewGroup.LayoutParams layoutParams = textTipsView2.getLayoutParams();
                                    Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                                    ((ViewGroup.MarginLayoutParams) bVar).topMargin = f.c() + intValue;
                                    textTipsView2.setLayoutParams(bVar);
                                }
                                textTipsView2.setVisibility(0);
                                textTipsView2.bindsDrumAnimationState(textTipsState);
                            }
                        }
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (interfaceC2395h.collect(interfaceC2397i, this) == aVar) {
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
        return ((CameraFragment$onViewCreated$$inlined$observeWithoutRepeatOnLifeCycle$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
