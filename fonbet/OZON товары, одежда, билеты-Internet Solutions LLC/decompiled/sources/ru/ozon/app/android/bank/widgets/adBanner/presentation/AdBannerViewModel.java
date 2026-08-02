package ru.ozon.app.android.bank.widgets.adBanner.presentation;

import Ae.E0;
import Ae.w0;
import Sc.o;
import WZ.e;
import WZ.t;
import h20.InterfaceC6786a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.bank.widgets.adBanner.data.AnalyticEventType;
import ru.ozon.app.android.bank.widgets.adBanner.data.SetBannerActionType;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u0000 C2\u00060\u0001j\u0002`\u0002:\u0001CB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0017JC\u0010%\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102$\u0010$\u001a \u0012\b\u0012\u00060 j\u0002`!\u0012\f\u0012\n\u0018\u00010\"j\u0004\u0018\u0001`#\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\f038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00120<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerViewModel;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchers", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "key", "Lkotlin/Function0;", "", "action", "checkAndExecuteActionIfNeeded", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/bank/widgets/adBanner/data/AnalyticEventType;", "analyticEventType", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;", "adBannerItemVO", "sendSetBannerActionRequest", "(Lru/ozon/app/android/bank/widgets/adBanner/data/AnalyticEventType;Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;)V", "onCleared", "()V", "removeBannerFromSnapshot", "(Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;)V", "", "autoScrollDelay", "startAutoScrollByDelay", "(I)V", "stopAutoScroll", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "trackComposerAnalytics", "trackAnalyticEvent", "(Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;Lru/ozon/app/android/bank/widgets/adBanner/data/AnalyticEventType;Lkotlin/jvm/functions/Function2;)V", "releaseAnalyticsData", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lxe/J;", "exceptionHandler", "Lxe/J;", "Lxe/M;", "scope", "Lxe/M;", "Lxe/B0;", "autoScrollJob", "Lxe/B0;", "LAe/w0;", "autoScrollEventsFlow", "LAe/w0;", "getAutoScrollEventsFlow", "()LAe/w0;", "", "", "trackedOneTimeEventsMap", "Ljava/util/Map;", "", "bannersSnapshot", "Ljava/util/List;", "getBannersSnapshot", "()Ljava/util/List;", "setBannersSnapshot", "(Ljava/util/List;)V", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdBannerViewModel implements InterfaceC6786a {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final w0<Unit> autoScrollEventsFlow;
    private B0 autoScrollJob;

    @NotNull
    private List<AdBannerItemVO> bannersSnapshot;

    @NotNull
    private final CoroutineDispatcherProvider dispatchers;

    @NotNull
    private final J exceptionHandler;

    @NotNull
    private final M scope;

    @NotNull
    private final Map<String, Boolean> trackedOneTimeEventsMap;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnalyticEventType.values().length];
            try {
                iArr[AnalyticEventType.VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnalyticEventType.CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnalyticEventType.CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnalyticEventType.IMAGE_CLICK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AdBannerViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull CoroutineDispatcherProvider dispatchers) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.actionV2Repository = actionV2Repository;
        this.dispatchers = dispatchers;
        AdBannerViewModel$special$$inlined$CoroutineExceptionHandler$1 adBannerViewModel$special$$inlined$CoroutineExceptionHandler$1 = new AdBannerViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.exceptionHandler = adBannerViewModel$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = N.a(CoroutineContext.Element.a.d(dispatchers.getDefault(), (H0) X0.b()).plus(adBannerViewModel$special$$inlined$CoroutineExceptionHandler$1));
        this.autoScrollEventsFlow = E0.b(0, 0, null, 7);
        this.trackedOneTimeEventsMap = new LinkedHashMap();
        this.bannersSnapshot = K.f71697a;
    }

    private final void checkAndExecuteActionIfNeeded(String key, Function0<Unit> action) {
        Map<String, Boolean> map = this.trackedOneTimeEventsMap;
        Boolean bool = map.get(key);
        if (bool == null) {
            bool = Boolean.FALSE;
            map.put(key, bool);
        }
        if (bool.booleanValue()) {
            return;
        }
        this.trackedOneTimeEventsMap.put(key, Boolean.TRUE);
        action.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSetBannerActionRequest(AnalyticEventType analyticEventType, AdBannerItemVO adBannerItemVO) {
        SetBannerActionType setBannerActionType;
        int i11 = WhenMappings.$EnumSwitchMapping$0[analyticEventType.ordinal()];
        if (i11 == 1) {
            setBannerActionType = SetBannerActionType.ACTION_TYPE_VIEW;
        } else if (i11 == 2) {
            setBannerActionType = SetBannerActionType.ACTION_TYPE_CLICK;
        } else if (i11 == 3) {
            setBannerActionType = SetBannerActionType.ACTION_TYPE_CLOSE;
        } else {
            if (i11 != 4) {
                throw new o();
            }
            setBannerActionType = SetBannerActionType.ACTION_TYPE_CLICK;
        }
        C10727i.c(this.scope, null, null, new AdBannerViewModel$sendSetBannerActionRequest$1(this, setBannerActionType, adBannerItemVO, null), 3);
    }

    @NotNull
    public final w0<Unit> getAutoScrollEventsFlow() {
        return this.autoScrollEventsFlow;
    }

    @NotNull
    public final List<AdBannerItemVO> getBannersSnapshot() {
        return this.bannersSnapshot;
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        stopAutoScroll();
        N.c(this.scope, null);
    }

    public final void releaseAnalyticsData() {
        this.trackedOneTimeEventsMap.clear();
    }

    public final void removeBannerFromSnapshot(@NotNull AdBannerItemVO adBannerItemVO) {
        Intrinsics.checkNotNullParameter(adBannerItemVO, "adBannerItemVO");
        Iterator<AdBannerItemVO> it = this.bannersSnapshot.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getId() == adBannerItemVO.getId()) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0 || i11 >= this.bannersSnapshot.size()) {
            return;
        }
        this.bannersSnapshot = C7714v.p0(C7714v.K0(this.bannersSnapshot, i11), C7714v.D(this.bannersSnapshot, i11 + 1));
    }

    public final void setBannersSnapshot(@NotNull List<AdBannerItemVO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.bannersSnapshot = list;
    }

    public final void startAutoScrollByDelay(int autoScrollDelay) {
        stopAutoScroll();
        if (this.bannersSnapshot.size() < 2) {
            return;
        }
        this.autoScrollJob = C10727i.c(this.scope, null, null, new AdBannerViewModel$startAutoScrollByDelay$1(autoScrollDelay, this, null), 3);
    }

    public final void stopAutoScroll() {
        B0 b02 = this.autoScrollJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.autoScrollJob = null;
    }

    public final void trackAnalyticEvent(@NotNull AdBannerItemVO adBannerItemVO, @NotNull AnalyticEventType analyticEventType, @NotNull Function2<? super t, ? super e, Unit> trackComposerAnalytics) {
        Intrinsics.checkNotNullParameter(adBannerItemVO, "adBannerItemVO");
        Intrinsics.checkNotNullParameter(analyticEventType, "analyticEventType");
        Intrinsics.checkNotNullParameter(trackComposerAnalytics, "trackComposerAnalytics");
        checkAndExecuteActionIfNeeded(analyticEventType.name() + " " + adBannerItemVO.getId(), new AdBannerViewModel$trackAnalyticEvent$1(analyticEventType, adBannerItemVO, this, trackComposerAnalytics));
    }
}
