package defpackage;

import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.analytics.enums.AudioState;
import com.blaze.blazesdk.analytics.enums.BlazeAnalyticsOrientation;
import com.blaze.blazesdk.analytics.enums.BlazeVideoOrientationChangeTrigger;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventCategoryType;
import com.blaze.blazesdk.analytics.enums.EventExitTrigger;
import com.blaze.blazesdk.analytics.enums.EventStartTrigger;
import com.blaze.blazesdk.analytics.enums.PlaybackSpeedType;
import com.blaze.blazesdk.analytics.enums.SeekDirection;
import com.blaze.blazesdk.analytics.enums.SeekType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.analytics.models.AnalyticsPlayerViewingTransitionState;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsReferring;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsVideos;
import com.blaze.blazesdk.delegates.models.BlazePlayerEvent;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.OnVideoStartParams;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.D;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.players.models.P;
import com.blaze.blazesdk.players.models.k;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.gim;
import defpackage.n4m;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class mzm {
    public static final void a(w3m w3mVar) {
        w3mVar.getClass();
        n4m D = w3mVar.D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.e) {
            b(w3mVar, EventActionName.PIP_DISABLED, createVideosPlayerProps$default(w3mVar, (gim.e) gimVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
        }
    }

    public static final void b(w3m w3mVar, EventActionName eventActionName, AnalyticsPropsVideos analyticsPropsVideos) {
        w3mVar.getClass();
        eventActionName.getClass();
        analyticsPropsVideos.getClass();
        cwm cwmVar = cwm.a;
        EventCategoryType eventCategoryType = EventCategoryType.VIDEO;
        w3mVar.getClass();
        WidgetType widgetType = w3mVar.h;
        spm.postEvent$default(cwmVar, eventActionName, eventCategoryType, new AnalyticsPropsReferring(w3mVar.H(), widgetType != null ? widgetType.getValue() : null, w3mVar.k), null, null, analyticsPropsVideos, null, null, null, 472, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(w3m w3mVar, Long l) {
        Long l2;
        int i;
        Long l3;
        w3mVar.getClass();
        n4m D = w3mVar.D();
        Double d = null;
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.e) {
            SeekType seekType = w3mVar.s0;
            int i2 = seekType == null ? -1 : tym.a[seekType.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    Long l4 = w3mVar.C;
                    if (l4 != null) {
                        long longValue = l4.longValue();
                        Long l5 = w3mVar.D;
                        if (l5 != null) {
                            l3 = Long.valueOf(l5.longValue() - longValue);
                            if (l3 != null) {
                                l2 = Long.valueOf(Math.abs(l3.longValue()));
                            }
                        }
                    }
                    l3 = null;
                    if (l3 != null) {
                    }
                } else {
                    if (i2 != 2 && i2 != 3) {
                        zzl.b();
                        return;
                    }
                    l2 = l;
                }
                SeekType seekType2 = w3mVar.s0;
                i = seekType2 != null ? -1 : tym.a[seekType2.ordinal()];
                if (i != -1 && i != 1) {
                    if (i == 2 && i != 3) {
                        zzl.b();
                        return;
                    }
                    d = Double.valueOf(10.0d);
                }
                b(w3mVar, EventActionName.SEEK, createVideosPlayerProps$default(w3mVar, (gim.e) gimVar, false, w3mVar.s0, w3mVar.C, w3mVar.D, l2, w3mVar.t0, d, null, null, false, null, null, null, null, 32514, null));
            }
            l2 = null;
            SeekType seekType22 = w3mVar.s0;
            if (seekType22 != null) {
            }
            if (i != -1) {
                if (i == 2) {
                }
                d = Double.valueOf(10.0d);
            }
            b(w3mVar, EventActionName.SEEK, createVideosPlayerProps$default(w3mVar, (gim.e) gimVar, false, w3mVar.s0, w3mVar.C, w3mVar.D, l2, w3mVar.t0, d, null, null, false, null, null, null, null, 32514, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AnalyticsPropsVideos createVideosPlayerProps$default(w3m w3mVar, gim.e eVar, boolean z, SeekType seekType, Long l, Long l2, Long l3, SeekDirection seekDirection, Double d, String str, AnalyticsPlayerViewingTransitionState.PlayerViewingMode playerViewingMode, boolean z2, PlaybackSpeedType playbackSpeedType, Long l4, Long l5, Long l6, int i, Object obj) {
        AnalyticsPlayerViewingTransitionState analyticsPlayerViewingTransitionState;
        EventStartTrigger eventStartTrigger;
        EventStartTrigger eventStartTrigger2;
        EventExitTrigger eventExitTrigger;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        BlazeAnalyticsOrientation blazeAnalyticsOrientation;
        n4m D;
        String str2;
        B b;
        BlazeVideoOrientationChangeTrigger blazeVideoOrientationChangeTrigger;
        P p;
        BlazeVideoOrientationChangeTrigger blazeVideoOrientationChangeTrigger2;
        BlazeAnalyticsOrientation blazeAnalyticsOrientation2;
        B b2;
        boolean z3 = (i & 2) != 0 ? false : z;
        SeekType seekType2 = (i & 4) != 0 ? null : seekType;
        Long l7 = (i & 8) != 0 ? null : l;
        Long l8 = (i & 16) != 0 ? null : l2;
        Long l9 = (i & 32) != 0 ? null : l3;
        SeekDirection seekDirection2 = (i & 64) != 0 ? null : seekDirection;
        Double d7 = (i & 128) != 0 ? null : d;
        String str3 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str;
        AnalyticsPlayerViewingTransitionState.PlayerViewingMode playerViewingMode2 = (i & 512) != 0 ? null : playerViewingMode;
        boolean z4 = (i & 1024) == 0 ? z2 : false;
        PlaybackSpeedType playbackSpeedType2 = (i & a.o) != 0 ? null : playbackSpeedType;
        Long l10 = (i & 4096) != 0 ? null : l4;
        Long l11 = (i & 8192) != 0 ? null : l5;
        Long l12 = (i & 16384) != 0 ? null : l6;
        w3mVar.getClass();
        eVar.getClass();
        VideoModel videoModel = eVar.a;
        AudioState audioState = Intrinsics.c(w3mVar.H.d(), Boolean.TRUE) ? AudioState.MUTE : AudioState.UNMUTE;
        double d8 = videoModel.c;
        Long l13 = l8;
        double G = w3mVar.G() / 1000.0d;
        Long l14 = l12;
        Map map = x5m.f() ? videoModel.p : null;
        boolean z5 = z3;
        AnalyticsPlayerViewingTransitionState analyticsPlayerViewingTransitionState2 = new AnalyticsPlayerViewingTransitionState(w3mVar.E0, playerViewingMode2);
        H h = (!z5 || (b2 = w3mVar.p0) == null) ? null : b2.c;
        n4m D2 = w3mVar.D();
        String g = D2 != null ? fgm.g(D2) : null;
        Map map2 = z4 ? videoModel.u : null;
        B b3 = w3mVar.p0;
        if (b3 != null) {
            F f = b3.a;
            f.getClass();
            int ordinal = f.ordinal();
            if (ordinal != 0) {
                analyticsPlayerViewingTransitionState = analyticsPlayerViewingTransitionState2;
                if (ordinal == 1) {
                    eventStartTrigger = EventStartTrigger.WIDGET_AUTO_PLAY;
                } else if (ordinal == 2) {
                    eventStartTrigger = EventStartTrigger.DEEPLINK;
                } else if (ordinal == 3) {
                    eventStartTrigger = EventStartTrigger.ENTRYPOINT;
                } else if (ordinal == 4) {
                    eventStartTrigger = EventStartTrigger.NOTIFICATION;
                } else {
                    if (ordinal != 5) {
                        zzl.b();
                        return null;
                    }
                    eventStartTrigger = EventStartTrigger.INLINE;
                }
            } else {
                analyticsPlayerViewingTransitionState = analyticsPlayerViewingTransitionState2;
                eventStartTrigger = EventStartTrigger.WIDGET;
            }
        } else {
            analyticsPlayerViewingTransitionState = analyticsPlayerViewingTransitionState2;
            eventStartTrigger = null;
        }
        String str4 = (String) w3mVar.g.getValue();
        String str5 = videoModel.id;
        String str6 = videoModel.title;
        EventStartTrigger eventStartTrigger3 = eventStartTrigger;
        B b4 = w3mVar.p0;
        EventStartTrigger b5 = b4 != null ? k.b(b4.b) : null;
        EventExitTrigger a = h != null ? k.a(h) : null;
        if (l7 != null) {
            eventStartTrigger2 = b5;
            eventExitTrigger = a;
            d2 = Double.valueOf(l7.longValue() / 1000.0d);
        } else {
            eventStartTrigger2 = b5;
            eventExitTrigger = a;
            d2 = null;
        }
        if (l13 != null) {
            d3 = d2;
            d4 = Double.valueOf(l13.longValue() / 1000.0d);
        } else {
            d3 = d2;
            d4 = null;
        }
        if (l9 != null) {
            d5 = d4;
            d6 = Double.valueOf(l9.longValue() / 1000.0d);
        } else {
            d5 = d4;
            d6 = null;
        }
        B b6 = w3mVar.p0;
        if (b6 != null) {
            D d9 = b6.e;
            if (d9 == null) {
                d9 = b6.f;
            }
            if (d9 != null) {
                int ordinal2 = d9.ordinal();
                if (ordinal2 == 0) {
                    blazeAnalyticsOrientation2 = BlazeAnalyticsOrientation.PORTRAIT;
                } else {
                    if (ordinal2 != 1) {
                        zzl.b();
                        return null;
                    }
                    blazeAnalyticsOrientation2 = BlazeAnalyticsOrientation.LANDSCAPE;
                }
                blazeAnalyticsOrientation = blazeAnalyticsOrientation2;
                D = w3mVar.D();
                if (D != null) {
                    n4m.a aVar = D.c;
                    qrl a2 = aVar instanceof n4m.a.b ? ((n4m.a.b) aVar).a() : aVar instanceof n4m.a.C1353a ? ((n4m.a.C1353a) aVar).c : null;
                    if (a2 != null) {
                        str2 = a2.c;
                        b = w3mVar.p0;
                        if (b != null || (p = b.d) == null) {
                            blazeVideoOrientationChangeTrigger = null;
                        } else {
                            int ordinal3 = p.ordinal();
                            if (ordinal3 == 0) {
                                blazeVideoOrientationChangeTrigger2 = BlazeVideoOrientationChangeTrigger.INITIAL_REQUEST;
                            } else if (ordinal3 == 1) {
                                blazeVideoOrientationChangeTrigger2 = BlazeVideoOrientationChangeTrigger.BUTTON;
                            } else {
                                if (ordinal3 != 2) {
                                    zzl.b();
                                    return null;
                                }
                                blazeVideoOrientationChangeTrigger2 = BlazeVideoOrientationChangeTrigger.DEVICE_ROTATION;
                            }
                            blazeVideoOrientationChangeTrigger = blazeVideoOrientationChangeTrigger2;
                        }
                        return new AnalyticsPropsVideos(str4, str5, str3, str6, audioState, eventStartTrigger3, eventStartTrigger2, eventExitTrigger, Double.valueOf(G), Double.valueOf(d8), seekType2, d3, d5, d6, seekDirection2, d7, blazeAnalyticsOrientation, str2, blazeVideoOrientationChangeTrigger, map, analyticsPlayerViewingTransitionState, g, map2, playbackSpeedType2, Float.valueOf(w3mVar.z0), l10 != null ? Double.valueOf(l10.longValue() / 1000.0d) : null, l11 != null ? Double.valueOf(l11.longValue() / 1000.0d) : null, l14 != null ? Double.valueOf(l14.longValue() / 1000.0d) : null);
                    }
                }
                str2 = null;
                b = w3mVar.p0;
                if (b != null) {
                }
                blazeVideoOrientationChangeTrigger = null;
                return new AnalyticsPropsVideos(str4, str5, str3, str6, audioState, eventStartTrigger3, eventStartTrigger2, eventExitTrigger, Double.valueOf(G), Double.valueOf(d8), seekType2, d3, d5, d6, seekDirection2, d7, blazeAnalyticsOrientation, str2, blazeVideoOrientationChangeTrigger, map, analyticsPlayerViewingTransitionState, g, map2, playbackSpeedType2, Float.valueOf(w3mVar.z0), l10 != null ? Double.valueOf(l10.longValue() / 1000.0d) : null, l11 != null ? Double.valueOf(l11.longValue() / 1000.0d) : null, l14 != null ? Double.valueOf(l14.longValue() / 1000.0d) : null);
            }
        }
        blazeAnalyticsOrientation = null;
        D = w3mVar.D();
        if (D != null) {
        }
        str2 = null;
        b = w3mVar.p0;
        if (b != null) {
        }
        blazeVideoOrientationChangeTrigger = null;
        return new AnalyticsPropsVideos(str4, str5, str3, str6, audioState, eventStartTrigger3, eventStartTrigger2, eventExitTrigger, Double.valueOf(G), Double.valueOf(d8), seekType2, d3, d5, d6, seekDirection2, d7, blazeAnalyticsOrientation, str2, blazeVideoOrientationChangeTrigger, map, analyticsPlayerViewingTransitionState, g, map2, playbackSpeedType2, Float.valueOf(w3mVar.z0), l10 != null ? Double.valueOf(l10.longValue() / 1000.0d) : null, l11 != null ? Double.valueOf(l11.longValue() / 1000.0d) : null, l14 != null ? Double.valueOf(l14.longValue() / 1000.0d) : null);
    }

    public static final void d(w3m w3mVar, boolean z) {
        n4m D;
        String str;
        n4m D2 = w3mVar.D();
        gim gimVar = D2 != null ? D2.b : null;
        if (gimVar instanceof gim.e) {
            b(w3mVar, EventActionName.VIDEO_START, createVideosPlayerProps$default(w3mVar, (gim.e) gimVar, false, null, null, null, null, null, null, null, null, true, null, null, null, null, 31742, null));
            if (!z || (D = w3mVar.D()) == null || (str = D.a) == null) {
                return;
            }
            gzk gzkVar = gzk.a;
            gzk.e(w3mVar.C(), BlazePlayerType.VIDEOS, new BlazePlayerEvent.OnVideoStart(new OnVideoStartParams(str)), w3mVar.j);
        }
    }

    public static final void e(w3m w3mVar) {
        n4m D = w3mVar.D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.e) {
            gim.e eVar = (gim.e) gimVar;
            Integer t = tz9.t(w3mVar.t, w3mVar.D());
            n4m n4mVar = t != null ? (n4m) CollectionsKt.a0(t.intValue() + 1, w3mVar.t) : null;
            b(w3mVar, EventActionName.VIDEO_END, createVideosPlayerProps$default(w3mVar, eVar, true, null, null, null, null, null, null, n4mVar != null ? n4mVar.a : null, null, false, null, null, null, null, 32508, null));
        }
    }

    public static final void f(w3m w3mVar) {
        n4m D = w3mVar.D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.e) {
            b(w3mVar, EventActionName.PLAYBACK_PAUSE, createVideosPlayerProps$default(w3mVar, (gim.e) gimVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
        }
    }

    public static final void g(w3m w3mVar) {
        n4m D = w3mVar.D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.e) {
            b(w3mVar, EventActionName.PLAYBACK_PLAY, createVideosPlayerProps$default(w3mVar, (gim.e) gimVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
        }
    }

    public static /* synthetic */ void logSeekEvent$default(w3m w3mVar, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        c(w3mVar, l);
    }
}
