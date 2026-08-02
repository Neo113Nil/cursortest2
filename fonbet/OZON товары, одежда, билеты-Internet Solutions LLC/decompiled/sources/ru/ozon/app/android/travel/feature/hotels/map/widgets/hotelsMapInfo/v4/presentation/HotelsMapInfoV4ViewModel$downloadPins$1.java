package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.s;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.ThrowableExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import we0.i;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$downloadPins$1", f = "HotelsMapInfoV4ViewModel.kt", l = {603, 624}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4ViewModel$downloadPins$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ i $area;
    final /* synthetic */ List<String> $pinsOnMap;
    final /* synthetic */ float $zoom;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HotelsMapInfoV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4ViewModel$downloadPins$1(HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel, List<String> list, i iVar, float f7, d<? super HotelsMapInfoV4ViewModel$downloadPins$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapInfoV4ViewModel;
        this.$pinsOnMap = list;
        this.$area = iVar;
        this.$zoom = f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsMapInfoV4ViewModel$downloadPins$1 hotelsMapInfoV4ViewModel$downloadPins$1 = new HotelsMapInfoV4ViewModel$downloadPins$1(this.this$0, this.$pinsOnMap, this.$area, this.$zoom, dVar);
        hotelsMapInfoV4ViewModel$downloadPins$1.L$0 = obj;
        return hotelsMapInfoV4ViewModel$downloadPins$1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|2|(1:(1:(8:6|7|8|9|(2:26|27)|(1:14)|24|25)(2:31|32))(4:33|34|35|36))(5:63|(1:102)(1:67)|68|(1:70)(1:101)|(2:72|73)(12:74|(1:100)(1:78)|79|80|81|(2:83|84)(1:95)|85|86|87|88|(1:90)|52))|37|38|(1:40)(1:56)|41|(1:43)(1:55)|(1:45)|(1:49)|50|(5:53|(0)|(2:12|14)|24|25)|52|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cb, code lost:
    
        r15 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HotelsMapInfoV4ViewModel$downloadPins$1 hotelsMapInfoV4ViewModel$downloadPins$1;
        M m11;
        UpdateHotelsManager updateHotelsManager;
        M m12;
        long j11;
        HotelsMapInfoV4VO.DownloadPinsAction downloadPinsAction;
        HotelsMapInfoV4VO.DownloadPinsAction downloadPinsAction2;
        Throwable th2;
        FetchPinsActionResponseVO fetchPinsActionResponseVO;
        NotificationDTO notification;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        AtomAction atomAction = null;
        try {
            if (i11 == 0) {
                s.b(obj);
                M m13 = (M) this.L$0;
                HotelsMapInfoV4VO hotelsMapInfoV4VO = this.this$0.vo;
                AtomAction nextAction = (hotelsMapInfoV4VO == null || (downloadPinsAction2 = hotelsMapInfoV4VO.getDownloadPinsAction()) == null) ? null : downloadPinsAction2.getNextAction();
                AtomAction.ComposerAction composerAction = nextAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) nextAction : null;
                if (composerAction == null) {
                    this.this$0.hideLoader();
                    return Unit.f71690a;
                }
                HotelsMapInfoV4VO hotelsMapInfoV4VO2 = this.this$0.vo;
                long nextFetchInterval = (hotelsMapInfoV4VO2 == null || (downloadPinsAction = hotelsMapInfoV4VO2.getDownloadPinsAction()) == null) ? 0L : downloadPinsAction.getNextFetchInterval();
                try {
                    try {
                        this.this$0.showLoaderWithDelay();
                        updateHotelsManager = this.this$0.updateHotelsManager;
                        HotelsMapInfoV4VO hotelsMapInfoV4VO3 = this.this$0.vo;
                        Long l11 = hotelsMapInfoV4VO3 != null ? new Long(hotelsMapInfoV4VO3.getId()) : null;
                        List<String> list = this.$pinsOnMap;
                        i iVar = this.$area;
                        this.L$0 = m13;
                        this.J$0 = nextFetchInterval;
                        this.label = 1;
                        hotelsMapInfoV4ViewModel$downloadPins$1 = this;
                        try {
                            try {
                                Object downloadPins = updateHotelsManager.downloadPins(l11, composerAction, list, iVar, hotelsMapInfoV4ViewModel$downloadPins$1);
                                if (downloadPins != aVar) {
                                    m12 = m13;
                                    obj = downloadPins;
                                    j11 = nextFetchInterval;
                                }
                                return aVar;
                            } catch (Throwable th3) {
                                th = th3;
                                m11 = m13;
                                th2 = th;
                                hotelsMapInfoV4ViewModel$downloadPins$1.this$0.isPolling = false;
                                hotelsMapInfoV4ViewModel$downloadPins$1.this$0.hideLoader();
                                hotelsMapInfoV4ViewModel$downloadPins$1.this$0.send(MapAction.ShowErrorNotification.INSTANCE);
                                ThrowableExtKt.log(th2, m11.getClass().getSimpleName().concat("_downloadPins"));
                                return Unit.f71690a;
                            }
                        } catch (CancellationException e11) {
                            e = e11;
                            throw e;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        hotelsMapInfoV4ViewModel$downloadPins$1 = this;
                    }
                } catch (CancellationException e12) {
                    e = e12;
                    throw e;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fetchPinsActionResponseVO = (FetchPinsActionResponseVO) this.L$1;
                    m11 = (M) this.L$0;
                    try {
                        s.b(obj);
                        hotelsMapInfoV4ViewModel$downloadPins$1 = this;
                        if (fetchPinsActionResponseVO != null) {
                            try {
                                atomAction = fetchPinsActionResponseVO.getNextAction();
                            } catch (Throwable th5) {
                                th = th5;
                                th2 = th;
                                hotelsMapInfoV4ViewModel$downloadPins$1.this$0.isPolling = false;
                                hotelsMapInfoV4ViewModel$downloadPins$1.this$0.hideLoader();
                                hotelsMapInfoV4ViewModel$downloadPins$1.this$0.send(MapAction.ShowErrorNotification.INSTANCE);
                                ThrowableExtKt.log(th2, m11.getClass().getSimpleName().concat("_downloadPins"));
                                return Unit.f71690a;
                            }
                        }
                        if (atomAction != null && !(fetchPinsActionResponseVO.getNextAction() instanceof AtomAction.ComposerAction)) {
                            hotelsMapInfoV4ViewModel$downloadPins$1.this$0.send(new MapAction.PerformAction(fetchPinsActionResponseVO.getNextAction()));
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        hotelsMapInfoV4ViewModel$downloadPins$1 = this;
                        hotelsMapInfoV4ViewModel$downloadPins$1.this$0.isPolling = false;
                        hotelsMapInfoV4ViewModel$downloadPins$1.this$0.hideLoader();
                        hotelsMapInfoV4ViewModel$downloadPins$1.this$0.send(MapAction.ShowErrorNotification.INSTANCE);
                        ThrowableExtKt.log(th2, m11.getClass().getSimpleName().concat("_downloadPins"));
                        return Unit.f71690a;
                    }
                    return Unit.f71690a;
                }
                j11 = this.J$0;
                m12 = (M) this.L$0;
                try {
                    s.b(obj);
                    hotelsMapInfoV4ViewModel$downloadPins$1 = this;
                } catch (Throwable th7) {
                    th2 = th7;
                    hotelsMapInfoV4ViewModel$downloadPins$1 = this;
                    m11 = m12;
                    hotelsMapInfoV4ViewModel$downloadPins$1.this$0.isPolling = false;
                    hotelsMapInfoV4ViewModel$downloadPins$1.this$0.hideLoader();
                    hotelsMapInfoV4ViewModel$downloadPins$1.this$0.send(MapAction.ShowErrorNotification.INSTANCE);
                    ThrowableExtKt.log(th2, m11.getClass().getSimpleName().concat("_downloadPins"));
                    return Unit.f71690a;
                }
            }
            FetchPinsActionResponseVO fetchPinsActionResponseVO2 = (FetchPinsActionResponseVO) obj;
            AtomAction nextAction2 = fetchPinsActionResponseVO2 != null ? fetchPinsActionResponseVO2.getNextAction() : null;
            if ((nextAction2 instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) nextAction2 : null) == null) {
                hotelsMapInfoV4ViewModel$downloadPins$1.this$0.hideLoader();
                Unit unit = Unit.f71690a;
            }
            if (fetchPinsActionResponseVO2 != null && (notification = fetchPinsActionResponseVO2.getNotification()) != null) {
                HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel = hotelsMapInfoV4ViewModel$downloadPins$1.this$0;
                hotelsMapInfoV4ViewModel.isEmptyState = true;
                hotelsMapInfoV4ViewModel.send(new MapAction.ToggleNotification(notification), new MapAction.ToggleCard(null, null, 2, null));
            }
            hotelsMapInfoV4ViewModel$downloadPins$1.this$0.fetchState(hotelsMapInfoV4ViewModel$downloadPins$1.$area, fetchPinsActionResponseVO2, hotelsMapInfoV4ViewModel$downloadPins$1.$zoom, false);
            hotelsMapInfoV4ViewModel$downloadPins$1.L$0 = m12;
            hotelsMapInfoV4ViewModel$downloadPins$1.L$1 = fetchPinsActionResponseVO2;
            hotelsMapInfoV4ViewModel$downloadPins$1.label = 2;
            if (Y.b(j11, this) != aVar) {
                fetchPinsActionResponseVO = fetchPinsActionResponseVO2;
                m11 = m12;
                if (fetchPinsActionResponseVO != null) {
                }
                if (atomAction != null) {
                    hotelsMapInfoV4ViewModel$downloadPins$1.this$0.send(new MapAction.PerformAction(fetchPinsActionResponseVO.getNextAction()));
                }
                return Unit.f71690a;
            }
            return aVar;
        } catch (CancellationException e13) {
            throw e13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4ViewModel$downloadPins$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
