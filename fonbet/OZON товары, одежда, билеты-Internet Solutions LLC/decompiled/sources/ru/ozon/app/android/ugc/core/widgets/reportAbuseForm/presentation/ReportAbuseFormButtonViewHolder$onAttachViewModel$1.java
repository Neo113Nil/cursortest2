package ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormButtonViewHolder$onAttachViewModel$1", f = "ReportAbuseFormButtonViewHolder.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReportAbuseFormButtonViewHolder$onAttachViewModel$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReportAbuseFormButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportAbuseFormButtonViewHolder$onAttachViewModel$1(ReportAbuseFormButtonViewHolder reportAbuseFormButtonViewHolder, d<? super ReportAbuseFormButtonViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = reportAbuseFormButtonViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReportAbuseFormButtonViewHolder$onAttachViewModel$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ReportAbuseFormViewModel reportAbuseFormViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            reportAbuseFormViewModel = this.this$0.viewModel;
            final w0<ReportAbuseFormViewModel.ViewIntent> viewIntents = reportAbuseFormViewModel.getViewIntents();
            InterfaceC2395h<Object> interfaceC2395h = new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormButtonViewHolder$onAttachViewModel$1$invokeSuspend$$inlined$filterIsInstance$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormButtonViewHolder$onAttachViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormButtonViewHolder$onAttachViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ReportAbuseFormButtonViewHolder.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormButtonViewHolder$onAttachViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                    if (obj instanceof ReportAbuseFormViewModel.ViewIntent.ReasonChanged) {
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
                        a aVar2 = a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                    return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            };
            final ReportAbuseFormButtonViewHolder reportAbuseFormButtonViewHolder = this.this$0;
            InterfaceC2397i<? super Object> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormButtonViewHolder$onAttachViewModel$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((ReportAbuseFormViewModel.ViewIntent.ReasonChanged) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(ReportAbuseFormViewModel.ViewIntent.ReasonChanged reasonChanged, d<? super Unit> dVar) {
                    Map<String, String> params;
                    ReportAbuseFormButtonViewHolder reportAbuseFormButtonViewHolder2 = ReportAbuseFormButtonViewHolder.this;
                    AtomAction action = reasonChanged.getAction();
                    String str = null;
                    AtomAction.Click click = action instanceof AtomAction.Click ? (AtomAction.Click) action : null;
                    if (click != null && (params = click.getParams()) != null) {
                        str = params.get("id");
                    }
                    reportAbuseFormButtonViewHolder2.currentReasonActionId = str;
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
        return ((ReportAbuseFormButtonViewHolder$onAttachViewModel$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
