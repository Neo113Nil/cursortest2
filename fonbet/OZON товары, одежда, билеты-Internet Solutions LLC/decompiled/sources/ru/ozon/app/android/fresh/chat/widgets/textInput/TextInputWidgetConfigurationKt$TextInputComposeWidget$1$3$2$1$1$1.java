package ru.ozon.app.android.fresh.chat.widgets.textInput;

import A00.a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.InterfaceC4008j;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.chat.viewModels.FreshAISharedViewModel;
import ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1;
import ru.ozon.app.android.fresh.chat.widgets.textInput.di.TextInputDIComponent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$1$1", f = "TextInputWidgetConfiguration.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC4008j<TextInputDIComponent> $diComponent$delegate;
    final /* synthetic */ FreshAISharedViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$1$1(InterfaceC4008j<? extends TextInputDIComponent> interfaceC4008j, FreshAISharedViewModel freshAISharedViewModel, d<? super TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$1$1> dVar) {
        super(2, dVar);
        this.$diComponent$delegate = interfaceC4008j;
        this.$viewModel = freshAISharedViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$1$1(this.$diComponent$delegate, this.$viewModel, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            final InterfaceC2395h<A00.a> eventsFlow = TextInputWidgetConfigurationKt$TextInputComposeWidget$1.AnonymousClass3.invoke$lambda$0(this.$diComponent$delegate).getComposerController().getEventsFlow();
            InterfaceC2395h<A00.a> interfaceC2395h = new InterfaceC2395h<A00.a>() { // from class: ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$1$1$invokeSuspend$$inlined$filter$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "TextInputWidgetConfiguration.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= LinearLayoutManager.INVALID_OFFSET;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                        this.$this_unsafeFlow = interfaceC2397i;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                a aVar = a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    A00.a aVar2 = (A00.a) obj;
                                    if ((aVar2 instanceof a.o) || (aVar2 instanceof a.u.b)) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super A00.a> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                    return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            };
            final FreshAISharedViewModel freshAISharedViewModel = this.$viewModel;
            InterfaceC2397i<? super A00.a> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$1$1.2
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((A00.a) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(A00.a aVar2, d<? super Unit> dVar) {
                    FreshAISharedViewModel.this.clearText();
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
        return ((TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
