package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.data;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.DeliveryWidgetV4Mapper;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.domain.DeliveryWidgetV4Repository;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4VO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4RepositoryImpl;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/domain/DeliveryWidgetV4Repository;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncRepository", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/DeliveryWidgetV4Mapper;", "mapper", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/DeliveryWidgetV4Mapper;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "isTimerUpdate", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;", "requestAsyncUpdate", "(Ll20/d;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/DeliveryWidgetV4Mapper;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV4RepositoryImpl implements DeliveryWidgetV4Repository {

    @NotNull
    private final ComposerAsyncWidgetRepository asyncRepository;

    @NotNull
    private final DeliveryWidgetV4Mapper mapper;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4RepositoryImpl$Companion;", "", "<init>", "()V", "UPDATE_BY_PERIOD_PARAM", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DeliveryWidgetV4RepositoryImpl(@NotNull ComposerAsyncWidgetRepository asyncRepository, @NotNull DeliveryWidgetV4Mapper mapper) {
        Intrinsics.checkNotNullParameter(asyncRepository, "asyncRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.asyncRepository = asyncRepository;
        this.mapper = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.domain.DeliveryWidgetV4Repository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestAsyncUpdate(@NotNull d dVar, boolean z11, @NotNull kotlin.coroutines.d<? super DeliveryWidgetV4VO> dVar2) {
        DeliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1 deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1;
        int i11;
        DeliveryWidgetV4RepositoryImpl deliveryWidgetV4RepositoryImpl;
        ComposerAsyncWidgetResponse composerAsyncWidgetResponse;
        if (dVar2 instanceof DeliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1) {
            deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1 = (DeliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1) dVar2;
            int i12 = deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                DeliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1 deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12 = deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1;
                Object obj = deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12.label;
                if (i11 != 0) {
                    s.b(obj);
                    String a11 = dVar.c().a();
                    if (a11 == null) {
                        return null;
                    }
                    if (z11) {
                        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = this.asyncRepository;
                        Map i13 = U.i(new Pair("updatedByPeriod", Boolean.TRUE));
                        deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12.L$0 = this;
                        deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12.L$1 = dVar;
                        deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12.label = 1;
                        obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, a11, i13, DeliveryWidgetV4DTO.class, null, deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12, 8, null);
                        if (obj != aVar) {
                            deliveryWidgetV4RepositoryImpl = this;
                            composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj;
                        }
                    } else {
                        ComposerAsyncWidgetRepository composerAsyncWidgetRepository2 = this.asyncRepository;
                        deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12.L$0 = this;
                        deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12.L$1 = dVar;
                        deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12.label = 2;
                        obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository2, a11, DeliveryWidgetV4DTO.class, null, deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12, 4, null);
                        if (obj != aVar) {
                            deliveryWidgetV4RepositoryImpl = this;
                            composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj;
                        }
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    dVar = (d) deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12.L$1;
                    deliveryWidgetV4RepositoryImpl = (DeliveryWidgetV4RepositoryImpl) deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12.L$0;
                    s.b(obj);
                    composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = (d) deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12.L$1;
                    deliveryWidgetV4RepositoryImpl = (DeliveryWidgetV4RepositoryImpl) deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$12.L$0;
                    s.b(obj);
                    composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj;
                }
                return C7714v.K(deliveryWidgetV4RepositoryImpl.mapper.invoke((DeliveryWidgetV4DTO) composerAsyncWidgetResponse.getState(), dVar));
            }
        }
        deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1 = new DeliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1(this, dVar2);
        DeliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1 deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$122 = deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1;
        Object obj2 = deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = deliveryWidgetV4RepositoryImpl$requestAsyncUpdate$122.label;
        if (i11 != 0) {
        }
        return C7714v.K(deliveryWidgetV4RepositoryImpl.mapper.invoke((DeliveryWidgetV4DTO) composerAsyncWidgetResponse.getState(), dVar));
    }
}
