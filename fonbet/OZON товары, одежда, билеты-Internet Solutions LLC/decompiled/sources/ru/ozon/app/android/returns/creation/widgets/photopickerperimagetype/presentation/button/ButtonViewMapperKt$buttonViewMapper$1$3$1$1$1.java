package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.s;
import Tg.b;
import Wc.a;
import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.OwnerContainerExtKt;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.PickerViewModel;
import ru.ozon.composer.compose.widget.i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button.ButtonViewMapperKt$buttonViewMapper$1$3$1$1$1", f = "ButtonViewMapper.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ButtonViewMapperKt$buttonViewMapper$1$3$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C4911f $container;
    final /* synthetic */ Function1<b, Unit> $onAction;
    final /* synthetic */ i<ButtonVI> $this_content;
    final /* synthetic */ PickerViewModel $viewModel;
    int label;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button.ButtonViewMapperKt$buttonViewMapper$1$3$1$1$1$1", f = "ButtonViewMapper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button.ButtonViewMapperKt$buttonViewMapper$1$3$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Unit, d<? super Unit>, Object> {
        final /* synthetic */ C4911f $container;
        final /* synthetic */ Function1<b, Unit> $onAction;
        final /* synthetic */ i<ButtonVI> $this_content;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(C4911f c4911f, i<ButtonVI> iVar, Function1<? super b, Unit> function1, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$container = c4911f;
            this.$this_content = iVar;
            this.$onAction = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$container, this.$this_content, this.$onAction, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            OwnerContainerExtKt.showNotification(this.$container, this.$this_content.b().getNotifications().getUploadFailed(), this.$onAction);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(unit, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ButtonViewMapperKt$buttonViewMapper$1$3$1$1$1(PickerViewModel pickerViewModel, C4911f c4911f, i<ButtonVI> iVar, Function1<? super b, Unit> function1, d<? super ButtonViewMapperKt$buttonViewMapper$1$3$1$1$1> dVar) {
        super(2, dVar);
        this.$viewModel = pickerViewModel;
        this.$container = c4911f;
        this.$this_content = iVar;
        this.$onAction = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ButtonViewMapperKt$buttonViewMapper$1$3$1$1$1(this.$viewModel, this.$container, this.$this_content, this.$onAction, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h<Unit> observeError = this.$viewModel.observeError();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$container, this.$this_content, this.$onAction, null);
            this.label = 1;
            if (C2399j.h(observeError, anonymousClass1, this) == aVar) {
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
        return ((ButtonViewMapperKt$buttonViewMapper$1$3$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
