package ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation;

import Ae.InterfaceC2397i;
import Ae.w0;
import Sc.C4005g;
import Sc.o;
import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;
import z00.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModelImpl$observeViewIntent$1", f = "ReportAbuseFormViewModel.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReportAbuseFormViewModelImpl$observeViewIntent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReportAbuseFormViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportAbuseFormViewModelImpl$observeViewIntent$1(ReportAbuseFormViewModelImpl reportAbuseFormViewModelImpl, d<? super ReportAbuseFormViewModelImpl$observeViewIntent$1> dVar) {
        super(2, dVar);
        this.this$0 = reportAbuseFormViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReportAbuseFormViewModelImpl$observeViewIntent$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0<ReportAbuseFormViewModel.ViewIntent> viewIntents = this.this$0.getViewIntents();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (viewIntents.collect(anonymousClass1, this) == aVar) {
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
        return ((ReportAbuseFormViewModelImpl$observeViewIntent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModel$ViewIntent;", "event", "", "emit", "(Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModel$ViewIntent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModelImpl$observeViewIntent$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements InterfaceC2397i {
        final /* synthetic */ ReportAbuseFormViewModelImpl this$0;

        AnonymousClass1(ReportAbuseFormViewModelImpl reportAbuseFormViewModelImpl) {
            this.this$0 = reportAbuseFormViewModelImpl;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x016c, code lost:
        
            if (r2.emit(r7, r3) == r4) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0145, code lost:
        
            if (r2.emit(r8, r3) == r4) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
        
            if (r0.emit(r2, r3) == r4) goto L76;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(ReportAbuseFormViewModel.ViewIntent viewIntent, d<? super Unit> dVar) {
            ReportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1 reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1;
            int i11;
            AtomAction atomAction;
            Map map;
            ActionV2Repository actionV2Repository;
            Object mo480requestActionResultWithTrackingBWLJW6A;
            AnonymousClass1<T> anonymousClass1;
            Map<String, String> params;
            Object a11;
            Throwable b11;
            if (dVar instanceof ReportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1) {
                reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1 = (ReportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1) dVar;
                int i12 = reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        if (viewIntent instanceof ReportAbuseFormViewModel.ViewIntent.ReasonChanged) {
                            this.this$0.action = ((ReportAbuseFormViewModel.ViewIntent.ReasonChanged) viewIntent).getAction();
                            return Unit.f71690a;
                        }
                        if (viewIntent instanceof ReportAbuseFormViewModel.ViewIntent.ComplainButtonPressed) {
                            w0<ReportAbuseFormViewModel.SingleEvent> singleEvent = this.this$0.getSingleEvent();
                            ReportAbuseFormViewModel.SingleEvent.GetInputAfterComplainPressed getInputAfterComplainPressed = ReportAbuseFormViewModel.SingleEvent.GetInputAfterComplainPressed.INSTANCE;
                            reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.label = 1;
                        } else {
                            if (!(viewIntent instanceof ReportAbuseFormViewModel.ViewIntent.Report)) {
                                throw new o();
                            }
                            atomAction = this.this$0.action;
                            AtomAction.ComposerAction composerAction = atomAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) atomAction : null;
                            String actionName = composerAction != null ? composerAction.getActionName() : null;
                            if (composerAction == null || (params = composerAction.getParams()) == null) {
                                map = null;
                            } else {
                                LinkedHashMap u11 = U.u(params);
                                u11.put("comment", ((ReportAbuseFormViewModel.ViewIntent.Report) viewIntent).getReasonMessage());
                                map = u11;
                            }
                            if (actionName == null || h.K(actionName) || map == null) {
                                return Unit.f71690a;
                            }
                            actionV2Repository = this.this$0.actionV2Repository;
                            ActionV2Request actionV2Request = new ActionV2Request(map, actionName, false, 4, null);
                            c trackingData = ((ReportAbuseFormViewModel.ViewIntent.Report) viewIntent).getTrackingData();
                            reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.L$0 = this;
                            reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.L$1 = map;
                            reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.label = 2;
                            mo480requestActionResultWithTrackingBWLJW6A = actionV2Repository.mo480requestActionResultWithTrackingBWLJW6A(actionV2Request, trackingData, Object.class, reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1);
                            if (mo480requestActionResultWithTrackingBWLJW6A != aVar) {
                                anonymousClass1 = this;
                                r.Companion companion = r.INSTANCE;
                                if (mo480requestActionResultWithTrackingBWLJW6A instanceof r.b) {
                                }
                                ReportAbuseFormViewModelImpl reportAbuseFormViewModelImpl = anonymousClass1.this$0;
                                if (!(a11 instanceof r.b)) {
                                }
                                ReportAbuseFormViewModelImpl reportAbuseFormViewModelImpl2 = anonymousClass1.this$0;
                                b11 = r.b(a11);
                                if (b11 != null) {
                                }
                            }
                        }
                        return aVar;
                    }
                    if (i11 == 1) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 == 2) {
                        Map map2 = (Map) reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.L$1;
                        anonymousClass1 = (AnonymousClass1) reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.L$0;
                        s.b(obj);
                        mo480requestActionResultWithTrackingBWLJW6A = ((r) obj).getF26106a();
                        map = map2;
                        r.Companion companion2 = r.INSTANCE;
                        if (mo480requestActionResultWithTrackingBWLJW6A instanceof r.b) {
                            try {
                                a11 = ((ActionV2Response) mo480requestActionResultWithTrackingBWLJW6A).getData();
                                if (a11 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            } catch (Throwable th2) {
                                r.Companion companion3 = r.INSTANCE;
                                a11 = s.a(th2);
                            }
                        } else {
                            a11 = mo480requestActionResultWithTrackingBWLJW6A;
                        }
                        ReportAbuseFormViewModelImpl reportAbuseFormViewModelImpl3 = anonymousClass1.this$0;
                        if (!(a11 instanceof r.b)) {
                            w0<ReportAbuseFormViewModel.SingleEvent> singleEvent2 = reportAbuseFormViewModelImpl3.getSingleEvent();
                            String str = (String) map.get("review_uuid");
                            if (str == null) {
                                str = (String) map.get("selectionUuid");
                            }
                            ReportAbuseFormViewModel.SingleEvent.ReportSuccess reportSuccess = new ReportAbuseFormViewModel.SingleEvent.ReportSuccess(str);
                            reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.L$0 = anonymousClass1;
                            reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.L$1 = a11;
                            reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.label = 3;
                        }
                        ReportAbuseFormViewModelImpl reportAbuseFormViewModelImpl22 = anonymousClass1.this$0;
                        b11 = r.b(a11);
                        if (b11 != null) {
                        }
                    } else if (i11 == 3) {
                        a11 = reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.L$1;
                        anonymousClass1 = (AnonymousClass1) reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.L$0;
                        s.b(obj);
                        ReportAbuseFormViewModelImpl reportAbuseFormViewModelImpl222 = anonymousClass1.this$0;
                        b11 = r.b(a11);
                        if (b11 != null) {
                            Lm0.a.f17149a.e(b11);
                            w0<ReportAbuseFormViewModel.SingleEvent> singleEvent3 = reportAbuseFormViewModelImpl222.getSingleEvent();
                            ReportAbuseFormViewModel.SingleEvent.ReportError reportError = new ReportAbuseFormViewModel.SingleEvent.ReportError(g.c(b11));
                            reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.L$0 = a11;
                            reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.L$1 = null;
                            reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.label = 4;
                        }
                    } else {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    r.Companion companion4 = r.INSTANCE;
                    return Unit.f71690a;
                }
            }
            reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1 = new ReportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1(this, dVar);
            Object obj2 = reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.result;
            a aVar2 = a.COROUTINE_SUSPENDED;
            i11 = reportAbuseFormViewModelImpl$observeViewIntent$1$1$emit$1.label;
            if (i11 != 0) {
            }
            r.Companion companion42 = r.INSTANCE;
            return Unit.f71690a;
        }

        @Override // Ae.InterfaceC2397i
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit((ReportAbuseFormViewModel.ViewIntent) obj, (d<? super Unit>) dVar);
        }
    }
}
