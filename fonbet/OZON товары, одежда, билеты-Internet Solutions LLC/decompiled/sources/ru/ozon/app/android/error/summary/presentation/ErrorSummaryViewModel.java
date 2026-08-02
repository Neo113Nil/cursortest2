package ru.ozon.app.android.error.summary.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import De.C2862e;
import GZ.g;
import GZ.l;
import He.c;
import Sc.s;
import Wc.a;
import android.content.Context;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.Experiment;
import ru.ozon.app.android.abtool.FeatureFlag;
import ru.ozon.app.android.error.summary.domain.ErrorSummaryInteractor;
import ru.ozon.app.android.error.summary.presentation.shared.ErrorSummaryExperimentSharedDTO;
import ru.ozon.app.android.error.summary.presentation.shared.ErrorSummaryExperimentSharedDTOKt;
import ru.ozon.app.android.error.summary.presentation.shared.ErrorSummaryFeatureFlagSharedDTO;
import ru.ozon.app.android.error.summary.presentation.shared.ErrorSummaryFeatureFlagSharedDTOKt;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.logrequests.LogRequestsService;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0082@¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020'0*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001d\u00104\u001a\b\u0012\u0004\u0012\u000200038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/ErrorSummaryViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/error/summary/domain/ErrorSummaryInteractor;", "errorSummaryInteractor", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryStateToViewStateMapper;", "stateToViewStateMapper", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/logrequests/LogRequestsService;", "logRequestsService", "<init>", "(Lru/ozon/app/android/error/summary/domain/ErrorSummaryInteractor;Lru/ozon/app/android/error/summary/presentation/ErrorSummaryStateToViewStateMapper;LGZ/g;Lru/ozon/app/android/network/serialize/JsonSerializer;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/network/logrequests/LogRequestsService;)V", "", "Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryFeatureFlagSharedDTO;", "getFeatureFlags", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryExperimentSharedDTO;", "getExperiments", "", "onShareButtonClicked", "()Z", "Landroid/content/Context;", "context", "onShareHarItemClicked", "(Landroid/content/Context;)Z", "", "onBackButtonClicked", "()V", "Lru/ozon/app/android/error/summary/domain/ErrorSummaryInteractor;", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryStateToViewStateMapper;", "LGZ/g;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/network/logrequests/LogRequestsService;", "LAe/x0;", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryViewState;", "_viewStateFlow", "LAe/x0;", "LAe/M0;", "viewStateFlow", "LAe/M0;", "getViewStateFlow", "()LAe/M0;", "LAe/w0;", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryCommand;", "_commandFlow", "LAe/w0;", "LAe/B0;", "commandFlow", "LAe/B0;", "getCommandFlow", "()LAe/B0;", "Lxe/M;", "safeScope", "Lxe/M;", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryState;", "lastState", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryState;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSummaryViewModel extends w0 {

    @NotNull
    private final Ae.w0<ErrorSummaryCommand> _commandFlow;

    @NotNull
    private final x0<ErrorSummaryViewState> _viewStateFlow;

    @NotNull
    private final B0<ErrorSummaryCommand> commandFlow;

    @NotNull
    private final ErrorSummaryInteractor errorSummaryInteractor;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final JsonSerializer jsonSerializer;
    private ErrorSummaryState lastState;

    @NotNull
    private final LogRequestsService logRequestsService;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final M safeScope;

    @NotNull
    private final ErrorSummaryStateToViewStateMapper stateToViewStateMapper;

    @NotNull
    private final M0<ErrorSummaryViewState> viewStateFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.error.summary.presentation.ErrorSummaryViewModel$1", f = "ErrorSummaryViewModel.kt", l = {49, 51}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.error.summary.presentation.ErrorSummaryViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryViewState;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/error/summary/presentation/ErrorSummaryViewState;"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.error.summary.presentation.ErrorSummaryViewModel$1$1", f = "ErrorSummaryViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.error.summary.presentation.ErrorSummaryViewModel$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17661 extends j implements Function2<M, d<? super ErrorSummaryViewState>, Object> {
            final /* synthetic */ ErrorSummaryState $state;
            int label;
            final /* synthetic */ ErrorSummaryViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17661(ErrorSummaryViewModel errorSummaryViewModel, ErrorSummaryState errorSummaryState, d<? super C17661> dVar) {
                super(2, dVar);
                this.this$0 = errorSummaryViewModel;
                this.$state = errorSummaryState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C17661(this.this$0, this.$state, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return this.this$0.stateToViewStateMapper.invoke(this.$state);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super ErrorSummaryViewState> dVar) {
                return ((C17661) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ErrorSummaryViewModel.this.new AnonymousClass1(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0 x0Var;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                ErrorSummaryInteractor errorSummaryInteractor = ErrorSummaryViewModel.this.errorSummaryInteractor;
                this.label = 1;
                obj = errorSummaryInteractor.fetch(this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x0Var = (x0) this.L$0;
                    s.b(obj);
                    x0Var.setValue(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            ErrorSummaryState errorSummaryState = (ErrorSummaryState) obj;
            ErrorSummaryViewModel.this.lastState = errorSummaryState;
            x0 x0Var2 = ErrorSummaryViewModel.this._viewStateFlow;
            c a11 = C10720e0.a();
            C17661 c17661 = new C17661(ErrorSummaryViewModel.this, errorSummaryState, null);
            this.L$0 = x0Var2;
            this.label = 2;
            obj = C10727i.f(a11, c17661, this);
            if (obj != aVar) {
                x0Var = x0Var2;
                x0Var.setValue(obj);
                return Unit.f71690a;
            }
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public ErrorSummaryViewModel(@NotNull ErrorSummaryInteractor errorSummaryInteractor, @NotNull ErrorSummaryStateToViewStateMapper stateToViewStateMapper, @NotNull g ozonRouter, @NotNull JsonSerializer jsonSerializer, @NotNull FeatureService featureService, @NotNull LogRequestsService logRequestsService) {
        Intrinsics.checkNotNullParameter(errorSummaryInteractor, "errorSummaryInteractor");
        Intrinsics.checkNotNullParameter(stateToViewStateMapper, "stateToViewStateMapper");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(logRequestsService, "logRequestsService");
        this.errorSummaryInteractor = errorSummaryInteractor;
        this.stateToViewStateMapper = stateToViewStateMapper;
        this.ozonRouter = ozonRouter;
        this.jsonSerializer = jsonSerializer;
        this.featureService = featureService;
        this.logRequestsService = logRequestsService;
        x0<ErrorSummaryViewState> a11 = O0.a(new ErrorSummaryViewState(null, 1, null));
        this._viewStateFlow = a11;
        this.viewStateFlow = C2399j.b(a11);
        C0 b11 = E0.b(0, 0, null, 7);
        this._commandFlow = b11;
        this.commandFlow = C2399j.a(b11);
        C2862e g10 = N.g(androidx.lifecycle.x0.a(this), new ErrorSummaryViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0));
        this.safeScope = g10;
        C10727i.c(g10, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getExperiments(d<? super List<ErrorSummaryExperimentSharedDTO>> dVar) {
        List<Experiment> experiments = this.featureService.getExperiments();
        ArrayList arrayList = new ArrayList(C7714v.z(experiments, 10));
        Iterator<T> it = experiments.iterator();
        while (it.hasNext()) {
            arrayList.add(ErrorSummaryExperimentSharedDTOKt.mapToSharedDto((Experiment) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFeatureFlags(d<? super List<ErrorSummaryFeatureFlagSharedDTO>> dVar) {
        List<FeatureFlag> featureFlags = this.featureService.getFeatureFlags();
        ArrayList arrayList = new ArrayList(C7714v.z(featureFlags, 10));
        Iterator<T> it = featureFlags.iterator();
        while (it.hasNext()) {
            arrayList.add(ErrorSummaryFeatureFlagSharedDTOKt.mapToSharedDto((FeatureFlag) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public final B0<ErrorSummaryCommand> getCommandFlow() {
        return this.commandFlow;
    }

    @NotNull
    public final M0<ErrorSummaryViewState> getViewStateFlow() {
        return this.viewStateFlow;
    }

    public final void onBackButtonClicked() {
        l.a(this.ozonRouter);
    }

    public final boolean onShareButtonClicked() {
        C10727i.c(this.safeScope, C10720e0.a(), null, new ErrorSummaryViewModel$onShareButtonClicked$1(this, null), 2);
        return true;
    }

    public final boolean onShareHarItemClicked(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C10727i.c(this.safeScope, null, null, new ErrorSummaryViewModel$onShareHarItemClicked$1(this, context, null), 3);
        return true;
    }
}
