package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation;

import Ae.B0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.Action;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserContentKt$IconChooserContent$2$1", f = "IconChooserContent.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class IconChooserContentKt$IconChooserContent$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $openBottomSheetCallback;
    final /* synthetic */ IconChooserViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IconChooserContentKt$IconChooserContent$2$1(IconChooserViewModel iconChooserViewModel, Function0<Unit> function0, d<? super IconChooserContentKt$IconChooserContent$2$1> dVar) {
        super(2, dVar);
        this.$viewModel = iconChooserViewModel;
        this.$openBottomSheetCallback = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new IconChooserContentKt$IconChooserContent$2$1(this.$viewModel, this.$openBottomSheetCallback, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            B0<Action> action = this.$viewModel.getAction();
            final Function0<Unit> function0 = this.$openBottomSheetCallback;
            InterfaceC2397i<? super Action> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserContentKt$IconChooserContent$2$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((Action) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(Action action2, d<? super Unit> dVar) {
                    if (!(action2 instanceof Action.OpenBottomSheet)) {
                        throw new o();
                    }
                    function0.invoke();
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (action.collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((IconChooserContentKt$IconChooserContent$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
