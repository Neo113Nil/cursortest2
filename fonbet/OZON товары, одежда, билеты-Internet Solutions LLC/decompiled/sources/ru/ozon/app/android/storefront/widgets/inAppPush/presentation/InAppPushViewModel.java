package ru.ozon.app.android.storefront.widgets.inAppPush.presentation;

import B0.C2454a;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.domain.flags.InAppPushAsyncFeatureFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storefront.widgets.inAppPush.core.InAppPushMapper;
import ru.ozon.app.android.storefront.widgets.inAppPush.data.InAppPushDTO;
import ru.ozon.app.android.storefront.widgets.inAppPush.pixelAnalytics.InAppPushPixelApiRepository;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.B0;
import xe.C10727i;
import xe.Y;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 02\u00020\u0001:\u00010B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020(0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "Lru/ozon/app/android/storefront/widgets/inAppPush/pixelAnalytics/InAppPushPixelApiRepository;", "analyticsRepo", "Lru/ozon/app/android/storefront/widgets/inAppPush/core/InAppPushMapper;", "mapper", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/storefront/widgets/inAppPush/pixelAnalytics/InAppPushPixelApiRepository;Lru/ozon/app/android/storefront/widgets/inAppPush/core/InAppPushMapper;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "timerSeconds", "", "fetchAsync", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "", "asyncData", "", "setAsyncData", "(Ljava/lang/String;)V", "pixelUrl", "trackAnalytics", "stopTimer", "()V", "startFetchWidgetWithTimer", "(I)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/storefront/widgets/inAppPush/pixelAnalytics/InAppPushPixelApiRepository;", "Lru/ozon/app/android/storefront/widgets/inAppPush/core/InAppPushMapper;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "", "asyncParams", "Ljava/util/Map;", "Ljava/lang/String;", "Lxe/B0;", "timerJob", "Lxe/B0;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushVO;", "_notificationEvent", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "notificationEvent", "Landroidx/lifecycle/P;", "getNotificationEvent", "()Landroidx/lifecycle/P;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPushViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<InAppPushVO> _notificationEvent;

    @NotNull
    private final InAppPushPixelApiRepository analyticsRepo;
    private String asyncData;

    @NotNull
    private final Map<String, String> asyncParams;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final InAppPushMapper mapper;

    @NotNull
    private final P<InAppPushVO> notificationEvent;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;
    private B0 timerJob;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushViewModel$Companion;", "", "<init>", "()V", "ASYNC_PARAM_NAME", "", "ASYNC_PARAM_VALUE", "MILLISECONDS", "", "EMPTY_TIMER", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public InAppPushViewModel(@NotNull ComposerAsyncWidgetRepository repository, @NotNull InAppPushPixelApiRepository analyticsRepo, @NotNull InAppPushMapper mapper, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analyticsRepo, "analyticsRepo");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.repository = repository;
        this.analyticsRepo = analyticsRepo;
        this.mapper = mapper;
        this.featureChecker = featureChecker;
        this.asyncParams = C2454a.b("refreshType", "RefreshWidget");
        SingleLiveEvent<InAppPushVO> singleLiveEvent = new SingleLiveEvent<>();
        this._notificationEvent = singleLiveEvent;
        this.notificationEvent = singleLiveEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAsync(int i11, d<? super Boolean> dVar) {
        InAppPushViewModel$fetchAsync$1 inAppPushViewModel$fetchAsync$1;
        int i12;
        String str;
        InAppPushViewModel inAppPushViewModel;
        InAppPushViewModel inAppPushViewModel2;
        int i13;
        InAppPushViewModel inAppPushViewModel3;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Map<String, String> map;
        Object fetchWidget$default;
        InAppPushViewModel inAppPushViewModel4;
        Object a11;
        int i14 = i11;
        if (dVar instanceof InAppPushViewModel$fetchAsync$1) {
            inAppPushViewModel$fetchAsync$1 = (InAppPushViewModel$fetchAsync$1) dVar;
            int i15 = inAppPushViewModel$fetchAsync$1.label;
            if ((i15 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                inAppPushViewModel$fetchAsync$1.label = i15 - LinearLayoutManager.INVALID_OFFSET;
                InAppPushViewModel$fetchAsync$1 inAppPushViewModel$fetchAsync$12 = inAppPushViewModel$fetchAsync$1;
                Object obj = inAppPushViewModel$fetchAsync$12.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i12 = inAppPushViewModel$fetchAsync$12.label;
                if (i12 != 0) {
                    s.b(obj);
                    String str2 = this.asyncData;
                    if (i14 == 0 || str2 == null) {
                        return Boolean.FALSE;
                    }
                    inAppPushViewModel$fetchAsync$12.L$0 = this;
                    inAppPushViewModel$fetchAsync$12.L$1 = str2;
                    inAppPushViewModel$fetchAsync$12.I$0 = i14;
                    inAppPushViewModel$fetchAsync$12.label = 1;
                    if (Y.b(i14 * 1000, inAppPushViewModel$fetchAsync$12) != aVar) {
                        str = str2;
                        inAppPushViewModel = this;
                    }
                    return aVar;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            s.b(obj);
                            return obj;
                        }
                        if (i12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return obj;
                    }
                    i13 = inAppPushViewModel$fetchAsync$12.I$0;
                    inAppPushViewModel4 = (InAppPushViewModel) inAppPushViewModel$fetchAsync$12.L$1;
                    inAppPushViewModel3 = (InAppPushViewModel) inAppPushViewModel$fetchAsync$12.L$0;
                    try {
                        s.b(obj);
                        a11 = InAppPushMapper.toVO$default(inAppPushViewModel4.mapper, (InAppPushDTO) ((ComposerAsyncWidgetResponse) obj).getState(), null, 2, null);
                        r.Companion companion = r.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        r.Companion companion2 = r.INSTANCE;
                        a11 = s.a(th);
                        if (a11 instanceof r.b) {
                        }
                        return aVar;
                    }
                    if (a11 instanceof r.b) {
                        InAppPushVO inAppPushVO = (InAppPushVO) a11;
                        inAppPushViewModel3._notificationEvent.setValue(inAppPushVO);
                        int refreshInterval = inAppPushVO.getRefreshInterval();
                        inAppPushViewModel$fetchAsync$12.L$0 = null;
                        inAppPushViewModel$fetchAsync$12.L$1 = null;
                        inAppPushViewModel$fetchAsync$12.label = 3;
                        Object fetchAsync = inAppPushViewModel3.fetchAsync(refreshInterval, inAppPushViewModel$fetchAsync$12);
                        if (fetchAsync != aVar) {
                            return fetchAsync;
                        }
                    } else {
                        if (r.b(a11) == null) {
                            return Boolean.TRUE;
                        }
                        inAppPushViewModel$fetchAsync$12.L$0 = null;
                        inAppPushViewModel$fetchAsync$12.L$1 = null;
                        inAppPushViewModel$fetchAsync$12.label = 4;
                        Object fetchAsync2 = inAppPushViewModel3.fetchAsync(i13, inAppPushViewModel$fetchAsync$12);
                        if (fetchAsync2 != aVar) {
                            return fetchAsync2;
                        }
                    }
                    return aVar;
                }
                i14 = inAppPushViewModel$fetchAsync$12.I$0;
                String str3 = (String) inAppPushViewModel$fetchAsync$12.L$1;
                InAppPushViewModel inAppPushViewModel5 = (InAppPushViewModel) inAppPushViewModel$fetchAsync$12.L$0;
                s.b(obj);
                str = str3;
                inAppPushViewModel = inAppPushViewModel5;
                int i16 = i14;
                if (inAppPushViewModel.featureChecker.isEnabled(InAppPushAsyncFeatureFlag.INSTANCE)) {
                    return Boolean.FALSE;
                }
                try {
                    r.Companion companion3 = r.INSTANCE;
                    composerAsyncWidgetRepository = inAppPushViewModel.repository;
                    map = inAppPushViewModel.asyncParams;
                    inAppPushViewModel$fetchAsync$12.L$0 = inAppPushViewModel;
                    inAppPushViewModel$fetchAsync$12.L$1 = inAppPushViewModel;
                    inAppPushViewModel$fetchAsync$12.I$0 = i16;
                    inAppPushViewModel$fetchAsync$12.label = 2;
                    inAppPushViewModel2 = inAppPushViewModel;
                } catch (Throwable th3) {
                    th = th3;
                    inAppPushViewModel2 = inAppPushViewModel;
                }
                try {
                    fetchWidget$default = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, map, InAppPushDTO.class, null, inAppPushViewModel$fetchAsync$12, 8, null);
                } catch (Throwable th4) {
                    th = th4;
                    i13 = i16;
                    inAppPushViewModel3 = inAppPushViewModel2;
                    r.Companion companion22 = r.INSTANCE;
                    a11 = s.a(th);
                    if (a11 instanceof r.b) {
                    }
                    return aVar;
                }
                if (fetchWidget$default != aVar) {
                    i13 = i16;
                    inAppPushViewModel3 = inAppPushViewModel2;
                    obj = fetchWidget$default;
                    inAppPushViewModel4 = inAppPushViewModel3;
                    a11 = InAppPushMapper.toVO$default(inAppPushViewModel4.mapper, (InAppPushDTO) ((ComposerAsyncWidgetResponse) obj).getState(), null, 2, null);
                    r.Companion companion4 = r.INSTANCE;
                    if (a11 instanceof r.b) {
                    }
                }
                return aVar;
            }
        }
        inAppPushViewModel$fetchAsync$1 = new InAppPushViewModel$fetchAsync$1(this, dVar);
        InAppPushViewModel$fetchAsync$1 inAppPushViewModel$fetchAsync$122 = inAppPushViewModel$fetchAsync$1;
        Object obj2 = inAppPushViewModel$fetchAsync$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i12 = inAppPushViewModel$fetchAsync$122.label;
        if (i12 != 0) {
        }
        int i162 = i14;
        if (inAppPushViewModel.featureChecker.isEnabled(InAppPushAsyncFeatureFlag.INSTANCE)) {
        }
    }

    @NotNull
    public final P<InAppPushVO> getNotificationEvent() {
        return this.notificationEvent;
    }

    public final void setAsyncData(String asyncData) {
        this.asyncData = asyncData;
    }

    public final void startFetchWidgetWithTimer(int timerSeconds) {
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.timerJob = C10727i.c(x0.a(this), null, null, new InAppPushViewModel$startFetchWidgetWithTimer$1(this, timerSeconds, null), 3);
    }

    public final void stopTimer() {
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    public final void trackAnalytics(String pixelUrl) {
        if (pixelUrl == null || pixelUrl.length() == 0) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new InAppPushViewModel$trackAnalytics$1(this, pixelUrl, null), 3);
    }
}
