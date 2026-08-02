package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Kk.C3532b;
import Pk0.f;
import Sc.s;
import WZ.l;
import androidx.lifecycle.C5429p;
import androidx.lifecycle.w0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.analytics.SwitchModeTracking;
import ru.ozon.app.android.ads.data.pixel.PixelApiRepository;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics.AdvVideoBannerV2TrackerAnalyticsDelegate;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import u3.InterfaceC9928b;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0004[\\]^B3\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010\u001fJ\u0015\u0010#\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b#\u0010\u001fJ\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b'\u0010\u001fJ\u0015\u0010(\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b(\u0010\u001fJ@\u00102\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-2\u0006\u00101\u001a\u000200H\u0096\u0001¢\u0006\u0004\b2\u00103J \u00105\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b7\u0010\u001fJ\u0018\u00108\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b8\u0010\u001fJ\u0018\u00109\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b9\u0010\u001fJ\u001a\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b;\u0010<J \u0010>\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b>\u0010\u001dJ&\u0010C\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020?2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000f0AH\u0096\u0001¢\u0006\u0004\bC\u0010DJ\u0018\u0010E\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\bE\u0010\u001fJ\u0018\u0010F\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\bF\u0010&J\u0018\u0010G\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\bG\u0010&J\u0017\u0010H\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\bH\u0010\u001fJ\u001f\u0010I\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u0015H\u0002¢\u0006\u0004\bI\u0010JJ%\u0010L\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00122\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00150KH\u0002¢\u0006\u0004\bL\u0010MJ!\u0010O\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010N\u001a\u00020\u001aH\u0002¢\u0006\u0004\bO\u0010\u001dR\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010PR&\u0010R\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150K0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR$\u0010V\u001a\u0012\u0012\u0004\u0012\u00020\u00180Tj\b\u0012\u0004\u0012\u00020\u0018`U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\"\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020X0Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010SR\"\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020X0Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010S¨\u0006_"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;", "Landroidx/lifecycle/w0;", "", "Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;", "pixelApiRepository", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate;", "advVideoBannerTrackerAnalyticsDelegate", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "composerController", "<init>", "(Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate;LWZ/l;Ll10/b;)V", "", "onCleared", "()V", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "item", "LAe/M0;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$State;", "getStateFlow", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;)LAe/M0;", "", "id", "", "isHalfBannerVisible", "onHalfBannerVisible", "(JZ)V", "setPausedStateAndDisableVolume", "(J)V", "isPackshotBlurred", "(J)Z", "setPackshotBlurred", "setStoppedState", "vo", "setFinishedState", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;)V", "switchVolumeState", "clearStateOnError", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;", "itemTokenizedEvents", "Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;", "switchModeTracking", "", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "pixel", "Lxe/M;", "coroutineScope", "initAdvVideoBannerAnalytics", "(JLru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;Ljava/util/List;Lxe/M;)V", "duration", "setVideoDuration", "(JJ)V", "onVideoView", "onVideoClick", "onProductClick", "Lu3/b;", "getAnalyticsListenerById", "(J)Lu3/b;", "state", "blockSoundEventSending", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;", "eventType", "Lkotlin/Function0;", "action", "trackOneTimeEvent", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;Lkotlin/jvm/functions/Function0;)V", "resetDataById", "trackPackshotView", "trackProductPreviewView", "setResumedState", "delayProductPreviewIfNeeded", "(JLru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$State;)V", "LAe/x0;", "delayPackshotIfNeeded", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;LAe/x0;)V", "disableVolume", "setPausedState", "LWZ/l;", "", "states", "Ljava/util/Map;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "blurredPackshots", "Ljava/util/HashSet;", "Lxe/B0;", "productDelayJobs", "packshotDelayJobs", "Companion", "State", "PlayerState", "ProductState", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2ViewModelNew extends w0 {
    private final /* synthetic */ AdvVideoBannerAnalyticsDelegate $$delegate_0;

    @NotNull
    private final HashSet<Long> blurredPackshots;

    @NotNull
    private Map<Long, B0> packshotDelayJobs;

    @NotNull
    private Map<Long, B0> productDelayJobs;

    @NotNull
    private final Map<Long, x0<State>> states;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew$1", f = "AdvVideoBannerV2ViewModelNew.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<A00.a, d<? super Unit>, Object> {
        final /* synthetic */ AtomicBoolean $isReloadEvent;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AdvVideoBannerV2ViewModelNew this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AtomicBoolean atomicBoolean, AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$isReloadEvent = atomicBoolean;
            this.this$0 = advVideoBannerV2ViewModelNew;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isReloadEvent, this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(A00.a aVar, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            A00.a aVar2 = (A00.a) this.L$0;
            if ((aVar2 instanceof a.u.b) || (aVar2 instanceof a.u.c)) {
                this.$isReloadEvent.set(true);
            }
            if ((aVar2 instanceof a.C2370k) && this.$isReloadEvent.getAndSet(false)) {
                Iterator it = this.this$0.productDelayJobs.values().iterator();
                while (it.hasNext()) {
                    ((B0) it.next()).j(null);
                }
                this.this$0.productDelayJobs.clear();
                Iterator it2 = this.this$0.packshotDelayJobs.values().iterator();
                while (it2.hasNext()) {
                    ((B0) it2.next()).j(null);
                }
                this.this$0.packshotDelayJobs.clear();
                Map map = this.this$0.states;
                AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew = this.this$0;
                for (Map.Entry entry : map.entrySet()) {
                    AdvBannerVideoV2VO item = ((State) ((x0) entry.getValue()).getValue()).getItem();
                    item.setPosition(0L);
                    x0 x0Var = (x0) entry.getValue();
                    do {
                        value = x0Var.getValue();
                    } while (!x0Var.b(value, State.Companion.createInitialState$default(State.INSTANCE, item, null, 2, null)));
                    advVideoBannerV2ViewModelNew.blurredPackshots.clear();
                    advVideoBannerV2ViewModelNew.resetDataById(item.getId());
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$PlayerState;", "", "<init>", "(Ljava/lang/String;I)V", "PAUSED", "RESUMED", "STOPPED", "FINISHED", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PlayerState {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ PlayerState[] $VALUES;
        public static final PlayerState PAUSED = new PlayerState("PAUSED", 0);
        public static final PlayerState RESUMED = new PlayerState("RESUMED", 1);
        public static final PlayerState STOPPED = new PlayerState("STOPPED", 2);
        public static final PlayerState FINISHED = new PlayerState("FINISHED", 3);

        private static final /* synthetic */ PlayerState[] $values() {
            return new PlayerState[]{PAUSED, RESUMED, STOPPED, FINISHED};
        }

        static {
            PlayerState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private PlayerState(String str, int i11) {
        }

        public static PlayerState valueOf(String str) {
            return (PlayerState) Enum.valueOf(PlayerState.class, str);
        }

        public static PlayerState[] values() {
            return (PlayerState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$ProductState;", "", "<init>", "(Ljava/lang/String;I)V", "GONE", "PREVIEW_VISIBLE", "PACKSHOT_VISIBLE", "EMPTY_STATE", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductState {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ ProductState[] $VALUES;
        public static final ProductState GONE = new ProductState("GONE", 0);
        public static final ProductState PREVIEW_VISIBLE = new ProductState("PREVIEW_VISIBLE", 1);
        public static final ProductState PACKSHOT_VISIBLE = new ProductState("PACKSHOT_VISIBLE", 2);
        public static final ProductState EMPTY_STATE = new ProductState("EMPTY_STATE", 3);

        private static final /* synthetic */ ProductState[] $values() {
            return new ProductState[]{GONE, PREVIEW_VISIBLE, PACKSHOT_VISIBLE, EMPTY_STATE};
        }

        static {
            ProductState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private ProductState(String str, int i11) {
        }

        public static ProductState valueOf(String str) {
            return (ProductState) Enum.valueOf(ProductState.class, str);
        }

        public static ProductState[] values() {
            return (ProductState[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$State;", "", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$PlayerState;", "playerState", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "item", "", "volumeOn", "wasFinished", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$ProductState;", "productState", "<init>", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$PlayerState;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;ZZLru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$ProductState;)V", "copy", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$PlayerState;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;ZZLru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$ProductState;)Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$State;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$PlayerState;", "getPlayerState", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$PlayerState;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "getItem", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "Z", "getVolumeOn", "()Z", "getWasFinished", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$ProductState;", "getProductState", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$ProductState;", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class State {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdvBannerVideoV2VO item;

        @NotNull
        private final PlayerState playerState;

        @NotNull
        private final ProductState productState;
        private final boolean volumeOn;
        private final boolean wasFinished;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$State$Companion;", "", "<init>", "()V", "createInitialState", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$State;", "item", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "playerState", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$PlayerState;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ State createInitialState$default(Companion companion, AdvBannerVideoV2VO advBannerVideoV2VO, PlayerState playerState, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    playerState = PlayerState.STOPPED;
                }
                return companion.createInitialState(advBannerVideoV2VO, playerState);
            }

            @NotNull
            public final State createInitialState(@NotNull AdvBannerVideoV2VO item, PlayerState playerState) {
                Intrinsics.checkNotNullParameter(item, "item");
                if (playerState == null) {
                    playerState = PlayerState.STOPPED;
                }
                return new State(playerState, item, false, false, ProductState.GONE);
            }

            private Companion() {
            }
        }

        public State(@NotNull PlayerState playerState, @NotNull AdvBannerVideoV2VO item, boolean z11, boolean z12, @NotNull ProductState productState) {
            Intrinsics.checkNotNullParameter(playerState, "playerState");
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(productState, "productState");
            this.playerState = playerState;
            this.item = item;
            this.volumeOn = z11;
            this.wasFinished = z12;
            this.productState = productState;
        }

        public static /* synthetic */ State copy$default(State state, PlayerState playerState, AdvBannerVideoV2VO advBannerVideoV2VO, boolean z11, boolean z12, ProductState productState, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                playerState = state.playerState;
            }
            if ((i11 & 2) != 0) {
                advBannerVideoV2VO = state.item;
            }
            if ((i11 & 4) != 0) {
                z11 = state.volumeOn;
            }
            if ((i11 & 8) != 0) {
                z12 = state.wasFinished;
            }
            if ((i11 & 16) != 0) {
                productState = state.productState;
            }
            ProductState productState2 = productState;
            boolean z13 = z11;
            return state.copy(playerState, advBannerVideoV2VO, z13, z12, productState2);
        }

        @NotNull
        public final State copy(@NotNull PlayerState playerState, @NotNull AdvBannerVideoV2VO item, boolean volumeOn, boolean wasFinished, @NotNull ProductState productState) {
            Intrinsics.checkNotNullParameter(playerState, "playerState");
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(productState, "productState");
            return new State(playerState, item, volumeOn, wasFinished, productState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return this.playerState == state.playerState && Intrinsics.d(this.item, state.item) && this.volumeOn == state.volumeOn && this.wasFinished == state.wasFinished && this.productState == state.productState;
        }

        @NotNull
        public final AdvBannerVideoV2VO getItem() {
            return this.item;
        }

        @NotNull
        public final PlayerState getPlayerState() {
            return this.playerState;
        }

        @NotNull
        public final ProductState getProductState() {
            return this.productState;
        }

        public final boolean getVolumeOn() {
            return this.volumeOn;
        }

        public final boolean getWasFinished() {
            return this.wasFinished;
        }

        public int hashCode() {
            return this.productState.hashCode() + C3532b.a(C3532b.a((this.item.hashCode() + (this.playerState.hashCode() * 31)) * 31, 31, this.volumeOn), 31, this.wasFinished);
        }

        @NotNull
        public String toString() {
            PlayerState playerState = this.playerState;
            AdvBannerVideoV2VO advBannerVideoV2VO = this.item;
            boolean z11 = this.volumeOn;
            boolean z12 = this.wasFinished;
            ProductState productState = this.productState;
            StringBuilder sb2 = new StringBuilder("State(playerState=");
            sb2.append(playerState);
            sb2.append(", item=");
            sb2.append(advBannerVideoV2VO);
            sb2.append(", volumeOn=");
            f.c(", wasFinished=", ", productState=", sb2, z11, z12);
            sb2.append(productState);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public AdvVideoBannerV2ViewModelNew(@NotNull PixelApiRepository pixelApiRepository, @NotNull AdvVideoBannerV2TrackerAnalyticsDelegate advVideoBannerTrackerAnalyticsDelegate, @NotNull l tokenizedAnalytics, @NotNull InterfaceC7851b composerController) {
        Intrinsics.checkNotNullParameter(pixelApiRepository, "pixelApiRepository");
        Intrinsics.checkNotNullParameter(advVideoBannerTrackerAnalyticsDelegate, "advVideoBannerTrackerAnalyticsDelegate");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        this.$$delegate_0 = new AdvVideoBannerAnalyticsDelegate(pixelApiRepository, advVideoBannerTrackerAnalyticsDelegate, tokenizedAnalytics);
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.states = new LinkedHashMap();
        this.blurredPackshots = new HashSet<>();
        this.productDelayJobs = new LinkedHashMap();
        this.packshotDelayJobs = new LinkedHashMap();
        C2399j.C(new C2408n0(C5429p.a(composerController.getEvents()), new AnonymousClass1(new AtomicBoolean(false), this, null)), androidx.lifecycle.x0.a(this));
    }

    private final void delayPackshotIfNeeded(AdvBannerVideoV2VO vo, x0<State> state) {
        long id2 = vo.getId();
        if (state.getValue().getProductState() == ProductState.PACKSHOT_VISIBLE || state.getValue().getProductState() == ProductState.EMPTY_STATE) {
            return;
        }
        B0 b02 = this.packshotDelayJobs.get(Long.valueOf(id2));
        if (b02 == null || !b02.isActive()) {
            this.packshotDelayJobs.put(Long.valueOf(id2), C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdvVideoBannerV2ViewModelNew$delayPackshotIfNeeded$1(state, vo, null), 3));
        }
    }

    private final void delayProductPreviewIfNeeded(long id2, State state) {
        State value;
        if (state.getProductState() == ProductState.GONE) {
            B0 b02 = this.productDelayJobs.get(Long.valueOf(id2));
            if ((b02 == null || !b02.isActive()) && state.getItem().getPreviewProduct() != null) {
                AdvBannerVideoV2VO item = state.getItem();
                if (item.getPosition() <= 2000) {
                    this.productDelayJobs.put(Long.valueOf(id2), C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdvVideoBannerV2ViewModelNew$delayProductPreviewIfNeeded$2(item, this, id2, null), 3));
                    return;
                }
                x0<State> x0Var = this.states.get(Long.valueOf(id2));
                if (x0Var != null) {
                    do {
                        value = x0Var.getValue();
                    } while (!x0Var.b(value, State.copy$default(value, null, null, false, false, ProductState.PREVIEW_VISIBLE, 15, null)));
                }
            }
        }
    }

    private final void setPausedState(long id2, boolean disableVolume) {
        State value;
        State value2;
        x0<State> x0Var = this.states.get(Long.valueOf(id2));
        if (x0Var == null || x0Var.getValue().getPlayerState() == PlayerState.STOPPED || x0Var.getValue().getPlayerState() == PlayerState.FINISHED) {
            return;
        }
        B0 b02 = this.productDelayJobs.get(Long.valueOf(id2));
        if (b02 != null) {
            b02.j(null);
        }
        if (disableVolume) {
            do {
                value2 = x0Var.getValue();
            } while (!x0Var.b(value2, State.copy$default(value2, PlayerState.PAUSED, null, false, false, null, 26, null)));
        } else {
            do {
                value = x0Var.getValue();
            } while (!x0Var.b(value, State.copy$default(value, PlayerState.PAUSED, null, false, false, null, 30, null)));
        }
    }

    static /* synthetic */ void setPausedState$default(AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        advVideoBannerV2ViewModelNew.setPausedState(j11, z11);
    }

    private final void setResumedState(long id2) {
        State value;
        x0<State> x0Var = this.states.get(Long.valueOf(id2));
        if (x0Var == null || x0Var.getValue().getPlayerState() == PlayerState.FINISHED) {
            return;
        }
        delayProductPreviewIfNeeded(id2, x0Var.getValue());
        if (x0Var.getValue().getPlayerState() == PlayerState.RESUMED) {
            return;
        }
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, State.copy$default(value, PlayerState.RESUMED, null, false, false, null, 30, null)));
    }

    public void blockSoundEventSending(long id2, boolean state) {
        this.$$delegate_0.blockSoundEventSending(id2, state);
    }

    public final void clearStateOnError(long id2) {
        B0 b02 = this.productDelayJobs.get(Long.valueOf(id2));
        if (b02 != null) {
            b02.j(null);
        }
        this.productDelayJobs.remove(Long.valueOf(id2));
        B0 b03 = this.packshotDelayJobs.get(Long.valueOf(id2));
        if (b03 != null) {
            b03.j(null);
        }
        this.packshotDelayJobs.remove(Long.valueOf(id2));
        this.states.remove(Long.valueOf(id2));
    }

    public InterfaceC9928b getAnalyticsListenerById(long id2) {
        return this.$$delegate_0.getAnalyticsListenerById(id2);
    }

    @NotNull
    public final M0<State> getStateFlow(@NotNull AdvBannerVideoV2VO item) {
        State value;
        State value2;
        Intrinsics.checkNotNullParameter(item, "item");
        x0<State> x0Var = this.states.get(Long.valueOf(item.getId()));
        PlayerState playerState = null;
        if (Intrinsics.d((x0Var == null || (value2 = x0Var.getValue()) == null) ? null : value2.getItem(), item)) {
            Map<Long, x0<State>> map = this.states;
            Long valueOf = Long.valueOf(item.getId());
            x0<State> x0Var2 = map.get(valueOf);
            if (x0Var2 == null) {
                x0Var2 = O0.a(State.Companion.createInitialState$default(State.INSTANCE, item, null, 2, null));
                map.put(valueOf, x0Var2);
            }
            return x0Var2;
        }
        State.Companion companion = State.INSTANCE;
        if (x0Var != null && (value = x0Var.getValue()) != null) {
            playerState = value.getPlayerState();
        }
        x0<State> a11 = O0.a(companion.createInitialState(item, playerState));
        this.states.put(Long.valueOf(item.getId()), a11);
        return a11;
    }

    public void initAdvVideoBannerAnalytics(long id2, @NotNull AdvBannerVideoV2VO.TokenizedEvents itemTokenizedEvents, @NotNull SwitchModeTracking switchModeTracking, List<Pixel> pixel, @NotNull M coroutineScope) {
        Intrinsics.checkNotNullParameter(itemTokenizedEvents, "itemTokenizedEvents");
        Intrinsics.checkNotNullParameter(switchModeTracking, "switchModeTracking");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.$$delegate_0.initAdvVideoBannerAnalytics(id2, itemTokenizedEvents, switchModeTracking, pixel, coroutineScope);
    }

    public final boolean isPackshotBlurred(long id2) {
        return this.blurredPackshots.contains(Long.valueOf(id2));
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.packshotDelayJobs.clear();
        this.productDelayJobs.clear();
    }

    public final void onHalfBannerVisible(long id2, boolean isHalfBannerVisible) {
        if (isHalfBannerVisible) {
            setResumedState(id2);
        } else {
            setPausedState$default(this, id2, false, 2, null);
        }
    }

    public void onProductClick(long id2) {
        this.$$delegate_0.onProductClick(id2);
    }

    public void onVideoClick(long id2) {
        this.$$delegate_0.onVideoClick(id2);
    }

    public void onVideoView(long id2) {
        this.$$delegate_0.onVideoView(id2);
    }

    public void resetDataById(long id2) {
        this.$$delegate_0.resetDataById(id2);
    }

    public final void setFinishedState(@NotNull AdvBannerVideoV2VO vo) {
        State value;
        Intrinsics.checkNotNullParameter(vo, "vo");
        x0<State> x0Var = this.states.get(Long.valueOf(vo.getId()));
        if (x0Var == null) {
            return;
        }
        delayPackshotIfNeeded(vo, x0Var);
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, State.copy$default(value, PlayerState.FINISHED, null, false, true, null, 22, null)));
    }

    public final void setPackshotBlurred(long id2) {
        this.blurredPackshots.add(Long.valueOf(id2));
    }

    public final void setPausedStateAndDisableVolume(long id2) {
        setPausedState(id2, true);
    }

    public final void setStoppedState(long id2) {
        State value;
        x0<State> x0Var = this.states.get(Long.valueOf(id2));
        if (x0Var == null || x0Var.getValue().getPlayerState() == PlayerState.RESUMED) {
            return;
        }
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, State.copy$default(value, PlayerState.STOPPED, null, false, false, null, 30, null)));
    }

    public void setVideoDuration(long id2, long duration) {
        this.$$delegate_0.setVideoDuration(id2, duration);
    }

    public final void switchVolumeState(long id2) {
        State value;
        x0<State> x0Var = this.states.get(Long.valueOf(id2));
        if (x0Var == null) {
            return;
        }
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, State.copy$default(value, null, null, !x0Var.getValue().getVolumeOn(), false, null, 27, null)));
    }

    public void trackOneTimeEvent(@NotNull AdvVideoBannerV2TrackerAnalyticsDelegate.EventType eventType, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.trackOneTimeEvent(eventType, action);
    }

    public void trackPackshotView(@NotNull AdvBannerVideoV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.$$delegate_0.trackPackshotView(item);
    }

    public void trackProductPreviewView(@NotNull AdvBannerVideoV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.$$delegate_0.trackProductPreviewView(item);
    }
}
