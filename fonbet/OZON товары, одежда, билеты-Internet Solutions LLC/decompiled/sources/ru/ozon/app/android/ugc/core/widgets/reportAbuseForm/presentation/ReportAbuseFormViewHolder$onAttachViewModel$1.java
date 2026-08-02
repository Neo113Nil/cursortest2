package ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReportAbuseResult;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewHolder$onAttachViewModel$1", f = "ReportAbuseFormViewHolder.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReportAbuseFormViewHolder$onAttachViewModel$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReportAbuseFormViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportAbuseFormViewHolder$onAttachViewModel$1(ReportAbuseFormViewHolder reportAbuseFormViewHolder, d<? super ReportAbuseFormViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = reportAbuseFormViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReportAbuseFormViewHolder$onAttachViewModel$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ReportAbuseFormViewModel reportAbuseFormViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            reportAbuseFormViewModel = this.this$0.viewModel;
            InterfaceC2395h<ReportAbuseFormViewModel.SingleEvent> singleEvent = reportAbuseFormViewModel.getSingleEvent();
            final ReportAbuseFormViewHolder reportAbuseFormViewHolder = this.this$0;
            InterfaceC2397i<? super ReportAbuseFormViewModel.SingleEvent> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewHolder$onAttachViewModel$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((ReportAbuseFormViewModel.SingleEvent) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(ReportAbuseFormViewModel.SingleEvent singleEvent2, d<? super Unit> dVar) {
                    ReportAbuseFormViewModel reportAbuseFormViewModel2;
                    ReportAbuseFormView reportAbuseFormView;
                    UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel;
                    if (singleEvent2 instanceof ReportAbuseFormViewModel.SingleEvent.ReportSuccess) {
                        String reviewUuid = ((ReportAbuseFormViewModel.SingleEvent.ReportSuccess) singleEvent2).getReviewUuid();
                        if (reviewUuid != null) {
                            ugcCachedActionsSharedViewModel = ReportAbuseFormViewHolder.this.ugcCachedActionsSharedViewModel;
                            ugcCachedActionsSharedViewModel.saveActionState(reviewUuid, true, "reportButtonEnabled");
                        }
                        ReportAbuseFormViewHolder.this.setResult(ReportAbuseResult.SUCCESS);
                    } else if (singleEvent2 instanceof ReportAbuseFormViewModel.SingleEvent.ReportError) {
                        ReportAbuseFormViewHolder.this.setResult(((ReportAbuseFormViewModel.SingleEvent.ReportError) singleEvent2).getIsNetworkError() ? ReportAbuseResult.NETWORK_ERROR : ReportAbuseResult.UNKNOWN_ERROR);
                    } else {
                        if (!Intrinsics.d(singleEvent2, ReportAbuseFormViewModel.SingleEvent.GetInputAfterComplainPressed.INSTANCE)) {
                            throw new o();
                        }
                        reportAbuseFormViewModel2 = ReportAbuseFormViewHolder.this.viewModel;
                        reportAbuseFormView = ReportAbuseFormViewHolder.this.view;
                        reportAbuseFormViewModel2.onViewIntent(new ReportAbuseFormViewModel.ViewIntent.Report(reportAbuseFormView.getReportMessage(), ReportAbuseFormViewHolder.this.getTrackingData()));
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (singleEvent.collect(interfaceC2397i, this) == aVar) {
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
        return ((ReportAbuseFormViewHolder$onAttachViewModel$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
