package ru.ozon.app.android.domain.tiles.dislike;

import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import He.b;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.domain.tiles.dislike.data.TileDislikeRequest;
import ru.ozon.app.android.domain.tiles.dislike.data.TileDislikeResponse;
import ru.ozon.app.android.domain.tiles.dislike.model.DislikeResult;
import ru.ozon.app.android.domain.tiles.dislike.model.TileDislikeId;
import ru.ozon.app.android.domain.tiles.dislike.model.TileDislikeInfo;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR0\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00150\u001dj\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0015`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractorImpl;", "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeInfo;", "info", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDTO", "", "setDisliked", "(Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeInfo;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "setDislikeError", "Lru/ozon/app/android/domain/tiles/dislike/data/TileDislikeResponse;", "callDislikeAction", "(Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeInfo;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dislike", "(Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeInfo;)V", "Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "dislikeId", "", "isDisliked", "(Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;)Z", "LAe/h;", "Lru/ozon/app/android/domain/tiles/dislike/model/DislikeResult;", "observeDislikeInfo", "(Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;)LAe/h;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "tileDislikeInfoMap", "Ljava/util/HashMap;", "LAe/w0;", "tileDislikeResultFlow", "LAe/w0;", "Lxe/M;", "coroutineScope", "Lxe/M;", "Companion", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TileDislikeInteractorImpl implements TileDislikeInteractor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final M coroutineScope;

    @NotNull
    private final HashMap<TileDislikeId, Boolean> tileDislikeInfoMap;

    @NotNull
    private final w0<DislikeResult> tileDislikeResultFlow;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractorImpl$Companion;", "", "<init>", "()V", "DISLIKE_ACTION_ID", "", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TileDislikeInteractorImpl(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.tileDislikeInfoMap = new HashMap<>();
        this.tileDislikeResultFlow = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        Intrinsics.checkNotNullExpressionValue("TileDislikeInteractorImpl", "getSimpleName(...)");
        this.coroutineScope = N.a(d11.plus(new L("TileDislikeInteractorImpl")).plus(new TileDislikeInteractorImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r13 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r13 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object callDislikeAction(TileDislikeInfo tileDislikeInfo, d<? super TileDislikeResponse> dVar) {
        TileDislikeInteractorImpl$callDislikeAction$1 tileDislikeInteractorImpl$callDislikeAction$1;
        int i11;
        ActionV2Response actionV2Response;
        if (dVar instanceof TileDislikeInteractorImpl$callDislikeAction$1) {
            tileDislikeInteractorImpl$callDislikeAction$1 = (TileDislikeInteractorImpl$callDislikeAction$1) dVar;
            int i12 = tileDislikeInteractorImpl$callDislikeAction$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                tileDislikeInteractorImpl$callDislikeAction$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = tileDislikeInteractorImpl$callDislikeAction$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = tileDislikeInteractorImpl$callDislikeAction$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    Long y02 = h.y0(tileDislikeInfo.getDislikeId().getTileId());
                    if (y02 == null) {
                        return null;
                    }
                    ActionV2Request actionV2Request = new ActionV2Request(new TileDislikeRequest(y02.longValue(), tileDislikeInfo.getReason(), tileDislikeInfo.getAlgorithm()), "dislikeRecommendation", false, 4, null);
                    if (tileDislikeInfo.getTrackingData() != null) {
                        ActionV2Repository actionV2Repository = this.actionV2Repository;
                        c trackingData = tileDislikeInfo.getTrackingData();
                        tileDislikeInteractorImpl$callDislikeAction$1.label = 1;
                        obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, trackingData, TileDislikeResponse.class, tileDislikeInteractorImpl$callDislikeAction$1);
                    } else {
                        ActionV2Repository actionV2Repository2 = this.actionV2Repository;
                        tileDislikeInteractorImpl$callDislikeAction$1.label = 2;
                        obj = actionV2Repository2.callActionSuspend(actionV2Request, TileDislikeResponse.class, tileDislikeInteractorImpl$callDislikeAction$1);
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    s.b(obj);
                    actionV2Response = (ActionV2Response) obj;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    actionV2Response = (ActionV2Response) obj;
                }
                return actionV2Response.getData();
            }
        }
        tileDislikeInteractorImpl$callDislikeAction$1 = new TileDislikeInteractorImpl$callDislikeAction$1(this, dVar);
        Object obj2 = tileDislikeInteractorImpl$callDislikeAction$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = tileDislikeInteractorImpl$callDislikeAction$1.label;
        if (i11 != 0) {
        }
        return actionV2Response.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDislikeError(TileDislikeInfo info, NotificationDTO notificationDTO) {
        this.tileDislikeInfoMap.put(info.getDislikeId(), Boolean.FALSE);
        this.tileDislikeResultFlow.tryEmit(new DislikeResult.Failure(info.getDislikeId(), notificationDTO));
    }

    static /* synthetic */ void setDislikeError$default(TileDislikeInteractorImpl tileDislikeInteractorImpl, TileDislikeInfo tileDislikeInfo, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            notificationDTO = null;
        }
        tileDislikeInteractorImpl.setDislikeError(tileDislikeInfo, notificationDTO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDisliked(TileDislikeInfo info, NotificationDTO notificationDTO) {
        this.tileDislikeInfoMap.put(info.getDislikeId(), Boolean.TRUE);
        this.tileDislikeResultFlow.tryEmit(new DislikeResult.Disliked(info.getDislikeId(), notificationDTO));
    }

    static /* synthetic */ void setDisliked$default(TileDislikeInteractorImpl tileDislikeInteractorImpl, TileDislikeInfo tileDislikeInfo, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            notificationDTO = null;
        }
        tileDislikeInteractorImpl.setDisliked(tileDislikeInfo, notificationDTO);
    }

    @Override // ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractor
    public void dislike(@NotNull TileDislikeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C10727i.c(this.coroutineScope, null, null, new TileDislikeInteractorImpl$dislike$1(this, info, null), 3);
    }

    @Override // ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractor
    public boolean isDisliked(@NotNull TileDislikeId dislikeId) {
        Intrinsics.checkNotNullParameter(dislikeId, "dislikeId");
        Boolean orDefault = this.tileDislikeInfoMap.getOrDefault(dislikeId, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(orDefault, "getOrDefault(...)");
        return orDefault.booleanValue();
    }

    @Override // ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractor
    @NotNull
    public InterfaceC2395h<DislikeResult> observeDislikeInfo(@NotNull final TileDislikeId dislikeId) {
        Intrinsics.checkNotNullParameter(dislikeId, "dislikeId");
        final w0<DislikeResult> w0Var = this.tileDislikeResultFlow;
        return new InterfaceC2395h<DislikeResult>() { // from class: ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractorImpl$observeDislikeInfo$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractorImpl$observeDislikeInfo$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ TileDislikeId $dislikeId$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractorImpl$observeDislikeInfo$$inlined$filter$1$2", f = "TileDislikeInteractorImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractorImpl$observeDislikeInfo$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes11.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, TileDislikeId tileDislikeId) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.$dislikeId$inlined = tileDislikeId;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (Intrinsics.d(((DislikeResult) obj).getDislikeId(), this.$dislikeId$inlined)) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super DislikeResult> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, dislikeId), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }
}
