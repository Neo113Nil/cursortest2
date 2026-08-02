package ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics;

import Fl.b;
import Fl.c;
import Fl.d;
import Fl.e;
import Mc.a;
import Nc.C3667a;
import io.reactivex.p;
import io.reactivex.u;
import j3.y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.rx.RxExtKt;
import u3.InterfaceC9928b;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u0000 K2\u00020\u0001:\u0001KB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\"J\u001f\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u00101\u001a\u00020\u0016H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\b¢\u0006\u0004\b8\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020'0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010B\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020'0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2AnalyticsListenerImpl;", "", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2AnalyticsSender;", "analyticsSender", "<init>", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2AnalyticsSender;)V", "", "t", "", "onError", "(Ljava/lang/Throwable;)V", "Lj3/y;", "player", "Lio/reactivex/p;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/VideoBannerV2Events;", "getPlayerProgressEvents", "(Lj3/y;)Lio/reactivex/p;", "", "position", "castToPlayerEvent", "(J)Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/VideoBannerV2Events;", "current", "", "percentsPlayed", "(J)I", "videoBannerEvent", "Lkotlin/Function0;", "action", "trackAndSetFlag", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/VideoBannerV2Events;Lkotlin/jvm/functions/Function0;)V", "duration", "setVideoDuration", "(J)V", "onVideoView", "()V", "onVideoClick", "onClick", "Lu3/b$a;", "eventTime", "", "isPlaying", "onIsPlayingChanged", "(Lu3/b$a;Z)V", "onPlayerReleased", "(Lu3/b$a;)V", "", "volume", "onVolumeChanged", "(Lu3/b$a;F)V", "state", "onPlaybackStateChanged", "(Lu3/b$a;I)V", "Lu3/b$b;", "events", "onEvents", "(Lj3/y;Lu3/b$b;)V", "disposePlayer", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2AnalyticsSender;", "Lnc/a;", "playerDisposable", "Lnc/a;", "LNc/a;", "isVideoPlayingSubject", "LNc/a;", "videoDuration", "J", "isNeedDropEvent", "Z", "isNeedDropEvent$ads_prodGoogleAllVendorsRelease", "()Z", "setNeedDropEvent$ads_prodGoogleAllVendorsRelease", "(Z)V", "", "trackedOneTimeEventsMap", "Ljava/util/Map;", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2AnalyticsListenerImpl implements InterfaceC9928b {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final IntRange Q1_RANGE = new IntRange(25, 49, 1);

    @NotNull
    private static final IntRange Q2_RANGE = new IntRange(50, 74, 1);

    @NotNull
    private static final IntRange Q3_RANGE = new IntRange(75, 99, 1);

    @NotNull
    private final AdvVideoBannerV2AnalyticsSender analyticsSender;
    private boolean isNeedDropEvent;

    @NotNull
    private final C3667a<Boolean> isVideoPlayingSubject;

    @NotNull
    private final C8486a playerDisposable;

    @NotNull
    private final Map<VideoBannerV2Events, Boolean> trackedOneTimeEventsMap;
    private long videoDuration;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2AnalyticsListenerImpl$Companion;", "", "<init>", "()V", "", "IMPRESSED_AFTER_MS", "J", "", "VOLUME_OFF_VALUE", "F", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AdvVideoBannerV2AnalyticsListenerImpl(@NotNull AdvVideoBannerV2AnalyticsSender analyticsSender) {
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        this.analyticsSender = analyticsSender;
        this.playerDisposable = new C8486a();
        C3667a<Boolean> e11 = C3667a.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(e11, "createDefault(...)");
        this.isVideoPlayingSubject = e11;
        this.isNeedDropEvent = true;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (VideoBannerV2Events videoBannerV2Events : VideoBannerV2Events.values()) {
            linkedHashMap.put(videoBannerV2Events, Boolean.FALSE);
        }
        this.trackedOneTimeEventsMap = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoBannerV2Events castToPlayerEvent(long position) {
        Map<VideoBannerV2Events, Boolean> map = this.trackedOneTimeEventsMap;
        VideoBannerV2Events videoBannerV2Events = VideoBannerV2Events.IMPRESSION;
        Boolean bool = map.get(videoBannerV2Events);
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.d(bool, bool2) && position > 2000) {
            this.trackedOneTimeEventsMap.put(videoBannerV2Events, bool2);
            return videoBannerV2Events;
        }
        int percentsPlayed = percentsPlayed(position);
        IntRange intRange = Q1_RANGE;
        int f71842a = intRange.getF71842a();
        if (percentsPlayed <= intRange.getF71843b() && f71842a <= percentsPlayed) {
            Map<VideoBannerV2Events, Boolean> map2 = this.trackedOneTimeEventsMap;
            VideoBannerV2Events videoBannerV2Events2 = VideoBannerV2Events.PLAYED_Q1;
            if (Intrinsics.d(map2.get(videoBannerV2Events2), bool2)) {
                return VideoBannerV2Events.NOT_TRACKABLE;
            }
            this.trackedOneTimeEventsMap.put(videoBannerV2Events2, bool2);
            return videoBannerV2Events2;
        }
        IntRange intRange2 = Q2_RANGE;
        int f71842a2 = intRange2.getF71842a();
        if (percentsPlayed <= intRange2.getF71843b() && f71842a2 <= percentsPlayed) {
            Map<VideoBannerV2Events, Boolean> map3 = this.trackedOneTimeEventsMap;
            VideoBannerV2Events videoBannerV2Events3 = VideoBannerV2Events.PLAYED_Q2;
            if (Intrinsics.d(map3.get(videoBannerV2Events3), bool2)) {
                return VideoBannerV2Events.NOT_TRACKABLE;
            }
            this.trackedOneTimeEventsMap.put(videoBannerV2Events3, bool2);
            return videoBannerV2Events3;
        }
        IntRange intRange3 = Q3_RANGE;
        int f71842a3 = intRange3.getF71842a();
        if (percentsPlayed > intRange3.getF71843b() || f71842a3 > percentsPlayed) {
            return VideoBannerV2Events.NOT_TRACKABLE;
        }
        Map<VideoBannerV2Events, Boolean> map4 = this.trackedOneTimeEventsMap;
        VideoBannerV2Events videoBannerV2Events4 = VideoBannerV2Events.PLAYED_Q3;
        if (Intrinsics.d(map4.get(videoBannerV2Events4), bool2)) {
            return VideoBannerV2Events.NOT_TRACKABLE;
        }
        this.trackedOneTimeEventsMap.put(videoBannerV2Events4, bool2);
        return videoBannerV2Events4;
    }

    private final p<VideoBannerV2Events> getPlayerProgressEvents(y player) {
        int i11 = 0;
        p<VideoBannerV2Events> distinct = this.isVideoPlayingSubject.distinctUntilChanged().switchMap(new c(AdvVideoBannerV2AnalyticsListenerImpl$getPlayerProgressEvents$1.INSTANCE, 0)).observeOn(C8125a.a()).map(new d(new AdvVideoBannerV2AnalyticsListenerImpl$getPlayerProgressEvents$2(player), i11)).observeOn(a.b()).map(new e(new AdvVideoBannerV2AnalyticsListenerImpl$getPlayerProgressEvents$3(this), i11)).distinct();
        Intrinsics.checkNotNullExpressionValue(distinct, "distinct(...)");
        return distinct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u getPlayerProgressEvents$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (u) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getPlayerProgressEvents$lambda$5(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Long) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoBannerV2Events getPlayerProgressEvents$lambda$6(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (VideoBannerV2Events) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable t2) {
        Lm0.a.f17149a.e(t2);
    }

    private final int percentsPlayed(long current) {
        long j11 = this.videoDuration;
        if (j11 <= 0) {
            return 0;
        }
        return (int) ((current * 100) / j11);
    }

    private final void trackAndSetFlag(VideoBannerV2Events videoBannerEvent, Function0<Unit> action) {
        Boolean bool = this.trackedOneTimeEventsMap.get(videoBannerEvent);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.d(bool, bool2)) {
            return;
        }
        action.invoke();
        this.trackedOneTimeEventsMap.put(videoBannerEvent, bool2);
    }

    public final void disposePlayer() {
        this.playerDisposable.dispose();
    }

    public void onClick() {
        trackAndSetFlag(VideoBannerV2Events.CLICK, new AdvVideoBannerV2AnalyticsListenerImpl$onClick$1(this));
    }

    @Override // u3.InterfaceC9928b
    public void onEvents(@NotNull y player, @NotNull InterfaceC9928b.C2198b events) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.a(7) && !this.playerDisposable.isDisposed() && this.playerDisposable.f() == 0) {
            trackAndSetFlag(VideoBannerV2Events.VIDEO_START, new AdvVideoBannerV2AnalyticsListenerImpl$onEvents$1(this));
            C8486a c8486a = this.playerDisposable;
            InterfaceC8487b subscribe = getPlayerProgressEvents(player).subscribe(new Fl.a(new AdvVideoBannerV2AnalyticsListenerImpl$onEvents$2(this.analyticsSender), 0), new b(new AdvVideoBannerV2AnalyticsListenerImpl$onEvents$3(this), 0));
            Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
            RxExtKt.plusAssign(c8486a, subscribe);
        }
    }

    @Override // u3.InterfaceC9928b
    public void onIsPlayingChanged(@NotNull InterfaceC9928b.a eventTime, boolean isPlaying) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        this.isVideoPlayingSubject.onNext(Boolean.valueOf(isPlaying));
    }

    @Override // u3.InterfaceC9928b
    public void onPlaybackStateChanged(@NotNull InterfaceC9928b.a eventTime, int state) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        if (this.playerDisposable.isDisposed() || state != 4) {
            return;
        }
        trackAndSetFlag(VideoBannerV2Events.VIDEO_END, new AdvVideoBannerV2AnalyticsListenerImpl$onPlaybackStateChanged$1(this));
        this.playerDisposable.dispose();
    }

    @Override // u3.InterfaceC9928b
    public void onPlayerReleased(@NotNull InterfaceC9928b.a eventTime) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        this.playerDisposable.dispose();
    }

    public void onVideoClick() {
        trackAndSetFlag(VideoBannerV2Events.VIDEO_CLICK, new AdvVideoBannerV2AnalyticsListenerImpl$onVideoClick$1(this));
    }

    public void onVideoView() {
        trackAndSetFlag(VideoBannerV2Events.VIDEO_VIEW, new AdvVideoBannerV2AnalyticsListenerImpl$onVideoView$1(this));
    }

    @Override // u3.InterfaceC9928b
    public void onVolumeChanged(@NotNull InterfaceC9928b.a eventTime, float volume) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        if (this.isNeedDropEvent) {
            return;
        }
        if (volume == 0.0f) {
            trackAndSetFlag(VideoBannerV2Events.VOLUME_OFF, new AdvVideoBannerV2AnalyticsListenerImpl$onVolumeChanged$1(this));
        } else {
            trackAndSetFlag(VideoBannerV2Events.VOLUME_ON, new AdvVideoBannerV2AnalyticsListenerImpl$onVolumeChanged$2(this));
        }
    }

    public final void setNeedDropEvent$ads_prodGoogleAllVendorsRelease(boolean z11) {
        this.isNeedDropEvent = z11;
    }

    public void setVideoDuration(long duration) {
        this.videoDuration = duration;
    }
}
