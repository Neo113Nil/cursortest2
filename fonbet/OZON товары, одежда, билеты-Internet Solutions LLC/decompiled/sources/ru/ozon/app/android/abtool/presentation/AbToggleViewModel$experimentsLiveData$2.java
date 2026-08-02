package ru.ozon.app.android.abtool.presentation;

import Jb.b;
import Sc.s;
import Wc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.abtool.AbToolImpl;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.Experiment;
import ru.ozon.app.android.abtool.data.mapper.ExperimentMapper;
import ru.ozon.app.android.abtool.presentation.experiments.recycler.ExperimentItem;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/P;", "", "Lru/ozon/app/android/abtool/presentation/experiments/recycler/ExperimentItem;", "invoke", "()Landroidx/lifecycle/P;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class AbToggleViewModel$experimentsLiveData$2 extends AbstractC7737t implements Function0<P<List<? extends ExperimentItem>>> {
    final /* synthetic */ AbToggleViewModel this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/Q;", "", "Lru/ozon/app/android/abtool/presentation/experiments/recycler/ExperimentItem;", "", "<anonymous>", "(Landroidx/lifecycle/Q;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.abtool.presentation.AbToggleViewModel$experimentsLiveData$2$1", f = "AbToggleViewModel.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.abtool.presentation.AbToggleViewModel$experimentsLiveData$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Q<List<? extends ExperimentItem>>, d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbToggleViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AbToggleViewModel abToggleViewModel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = abToggleViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Q<List<ExperimentItem>> q11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(q11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbToolImpl abToolImpl;
            AbToolNamespace abToolNamespace;
            ExperimentMapper experimentMapper;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                Q q11 = (Q) this.L$0;
                abToolImpl = this.this$0.abTool;
                abToolNamespace = this.this$0.namespace;
                List<Experiment> experiments = abToolImpl.getExperiments(abToolNamespace);
                experimentMapper = this.this$0.experimentsMapper;
                List<ExperimentItem> mapExperiments = experimentMapper.mapExperiments(experiments);
                this.label = 1;
                if (q11.emit(mapExperiments, this) == aVar) {
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
        public /* bridge */ /* synthetic */ Object invoke(Q<List<? extends ExperimentItem>> q11, d<? super Unit> dVar) {
            return invoke2((Q<List<ExperimentItem>>) q11, dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToggleViewModel$experimentsLiveData$2(AbToggleViewModel abToggleViewModel) {
        super(0);
        this.this$0 = abToggleViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final P<List<? extends ExperimentItem>> invoke() {
        return b.d(new AnonymousClass1(this.this$0, null));
    }
}
