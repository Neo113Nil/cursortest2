package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import androidx.lifecycle.x0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AdditionalServicesViewModel$fetchWithJobsMap$2$2$1 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ Map<Integer, B0> $jobs;
    final /* synthetic */ AdditionalServicesCellVO $this_with;
    final /* synthetic */ AdditionalServicesViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewModel$fetchWithJobsMap$2$2$1$1", f = "AdditionalServicesViewModel.kt", l = {370}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewModel$fetchWithJobsMap$2$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ AdditionalServicesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdditionalServicesViewModel additionalServicesViewModel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = additionalServicesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            w0 w0Var;
            boolean hasRunningJobs;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                w0Var = this.this$0.eventFlow;
                hasRunningJobs = this.this$0.getHasRunningJobs();
                AdditionalServicesViewModel.Event.OnWidgetJobsCountChanged onWidgetJobsCountChanged = new AdditionalServicesViewModel.Event.OnWidgetJobsCountChanged(hasRunningJobs);
                this.label = 1;
                if (w0Var.emit(onWidgetJobsCountChanged, this) == aVar) {
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
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServicesViewModel$fetchWithJobsMap$2$2$1(Map<Integer, B0> map, AdditionalServicesCellVO additionalServicesCellVO, AdditionalServicesViewModel additionalServicesViewModel) {
        super(1);
        this.$jobs = map;
        this.$this_with = additionalServicesCellVO;
        this.this$0 = additionalServicesViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        this.$jobs.remove(Integer.valueOf(this.$this_with.getId()));
        C10727i.c(x0.a(this.this$0), null, null, new AnonymousClass1(this.this$0, null), 3);
    }
}
