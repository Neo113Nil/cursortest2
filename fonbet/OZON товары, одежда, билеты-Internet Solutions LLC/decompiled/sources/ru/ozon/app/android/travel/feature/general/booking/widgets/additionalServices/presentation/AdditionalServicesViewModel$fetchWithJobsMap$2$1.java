package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewModel$fetchWithJobsMap$2$1", f = "AdditionalServicesViewModel.kt", l = {356}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AdditionalServicesViewModel$fetchWithJobsMap$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ AdditionalServicesCellVO $oldCellVO;
    final /* synthetic */ Map<String, Object> $params;
    final /* synthetic */ AdditionalServicesCellVO $this_with;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdditionalServicesViewModel this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "fetchedCell", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewModel$fetchWithJobsMap$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AdditionalServicesCellVO, Unit> {
        final /* synthetic */ AdditionalServicesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdditionalServicesViewModel additionalServicesViewModel) {
            super(1);
            this.this$0 = additionalServicesViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AdditionalServicesCellVO additionalServicesCellVO) {
            invoke2(additionalServicesCellVO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AdditionalServicesCellVO fetchedCell) {
            Intrinsics.checkNotNullParameter(fetchedCell, "fetchedCell");
            this.this$0.setState(fetchedCell);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewModel$fetchWithJobsMap$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ AdditionalServicesCellVO $oldCellVO;
        final /* synthetic */ AdditionalServicesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdditionalServicesViewModel additionalServicesViewModel, AdditionalServicesCellVO additionalServicesCellVO) {
            super(0);
            this.this$0 = additionalServicesViewModel;
            this.$oldCellVO = additionalServicesCellVO;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.setState(this.$oldCellVO);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServicesViewModel$fetchWithJobsMap$2$1(AdditionalServicesViewModel additionalServicesViewModel, String str, Map<String, ? extends Object> map, AdditionalServicesCellVO additionalServicesCellVO, AdditionalServicesCellVO additionalServicesCellVO2, d<? super AdditionalServicesViewModel$fetchWithJobsMap$2$1> dVar) {
        super(2, dVar);
        this.this$0 = additionalServicesViewModel;
        this.$asyncData = str;
        this.$params = map;
        this.$this_with = additionalServicesCellVO;
        this.$oldCellVO = additionalServicesCellVO2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AdditionalServicesViewModel$fetchWithJobsMap$2$1 additionalServicesViewModel$fetchWithJobsMap$2$1 = new AdditionalServicesViewModel$fetchWithJobsMap$2$1(this.this$0, this.$asyncData, this.$params, this.$this_with, this.$oldCellVO, dVar);
        additionalServicesViewModel$fetchWithJobsMap$2$1.L$0 = obj;
        return additionalServicesViewModel$fetchWithJobsMap$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object handleFetchResult;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            AdditionalServicesViewModel additionalServicesViewModel = this.this$0;
            String str = this.$asyncData;
            Map<String, Object> map = this.$params;
            AdditionalServicesCellVO additionalServicesCellVO = this.$this_with;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(additionalServicesViewModel);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$oldCellVO);
            this.label = 1;
            handleFetchResult = additionalServicesViewModel.handleFetchResult(str, map, m11, additionalServicesCellVO, anonymousClass1, anonymousClass2, this);
            if (handleFetchResult == aVar) {
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
        return ((AdditionalServicesViewModel$fetchWithJobsMap$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
