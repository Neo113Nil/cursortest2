package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation;

import He.b;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation.ReportDocumentWidgetViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation.ReportDocumentWidgetViewModel$performAction$1", f = "ReportDocumentWidgetViewModel.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ReportDocumentWidgetViewModel$performAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $link;
    Object L$0;
    int label;
    final /* synthetic */ ReportDocumentWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportDocumentWidgetViewModel$performAction$1(ReportDocumentWidgetViewModel reportDocumentWidgetViewModel, String str, d<? super ReportDocumentWidgetViewModel$performAction$1> dVar) {
        super(2, dVar);
        this.this$0 = reportDocumentWidgetViewModel;
        this.$link = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReportDocumentWidgetViewModel$performAction$1(this.this$0, this.$link, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        M m11;
        SingleLiveEvent singleLiveEvent;
        SingleLiveEvent singleLiveEvent2;
        SingleLiveEvent singleLiveEvent3;
        ReportDocumentWidgetViewModel reportDocumentWidgetViewModel;
        M m12;
        SingleLiveEvent singleLiveEvent4;
        V v11;
        List list;
        SingleLiveEvent singleLiveEvent5;
        SingleLiveEvent singleLiveEvent6;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                ReportDocumentWidgetViewModel reportDocumentWidgetViewModel2 = this.this$0;
                String str = this.$link;
                r.Companion companion = r.INSTANCE;
                singleLiveEvent3 = reportDocumentWidgetViewModel2.progressLiveData;
                singleLiveEvent3.setValue(Boolean.TRUE);
                C10720e0 c10720e0 = C10720e0.f105451a;
                b bVar = b.f10879b;
                ReportDocumentWidgetViewModel$performAction$1$1$result$1 reportDocumentWidgetViewModel$performAction$1$1$result$1 = new ReportDocumentWidgetViewModel$performAction$1$1$result$1(reportDocumentWidgetViewModel2, str, null);
                this.L$0 = reportDocumentWidgetViewModel2;
                this.label = 1;
                Object f7 = C10727i.f(bVar, reportDocumentWidgetViewModel$performAction$1$1$result$1, this);
                if (f7 == aVar) {
                    return aVar;
                }
                reportDocumentWidgetViewModel = reportDocumentWidgetViewModel2;
                obj = f7;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                reportDocumentWidgetViewModel = (ReportDocumentWidgetViewModel) this.L$0;
                s.b(obj);
            }
            ReportDocumentsResponseVO reportDocumentsResponseVO = (ReportDocumentsResponseVO) obj;
            m12 = reportDocumentWidgetViewModel.scope;
            if (N.f(m12)) {
                singleLiveEvent4 = reportDocumentWidgetViewModel.progressLiveData;
                singleLiveEvent4.setValue(Boolean.FALSE);
                reportDocumentWidgetViewModel.cachedInputs = C7714v.W0(reportDocumentsResponseVO.getInputs());
                v11 = reportDocumentWidgetViewModel.submitInputsLiveData;
                list = reportDocumentWidgetViewModel.cachedInputs;
                v11.setValue(list);
                if (reportDocumentsResponseVO.getAction() != null) {
                    singleLiveEvent6 = reportDocumentWidgetViewModel.operationLiveData;
                    singleLiveEvent6.setValue(new ReportDocumentWidgetViewModel.Operation.ProcessAction(reportDocumentsResponseVO.getAction()));
                } else if (reportDocumentsResponseVO.getNotification() != null) {
                    singleLiveEvent5 = reportDocumentWidgetViewModel.operationLiveData;
                    singleLiveEvent5.setValue(new ReportDocumentWidgetViewModel.Operation.ProcessNotification(reportDocumentsResponseVO.getNotification()));
                }
            }
            a11 = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        ReportDocumentWidgetViewModel reportDocumentWidgetViewModel3 = this.this$0;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
            m11 = reportDocumentWidgetViewModel3.scope;
            if (N.f(m11)) {
                singleLiveEvent = reportDocumentWidgetViewModel3.progressLiveData;
                singleLiveEvent.setValue(Boolean.FALSE);
                singleLiveEvent2 = reportDocumentWidgetViewModel3.operationLiveData;
                singleLiveEvent2.setValue(ReportDocumentWidgetViewModel.Operation.Error.INSTANCE);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReportDocumentWidgetViewModel$performAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
