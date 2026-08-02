package ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics;

import Sc.o;
import WZ.l;
import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.analytics.SwitchModeTracking;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000bR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R.\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\t0%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2AnalyticsSender;", "", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "analytics", "<init>", "(LWZ/l;)V", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/VideoBannerV2Events;", "event", "", "trackAnalytics", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/VideoBannerV2Events;)V", "trackPixelAnalytics", "sendEvent", "LWZ/l;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;", "videoEvents", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;", "getVideoEvents", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;", "setVideoEvents", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;)V", "Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;", "switchVolumeEvents", "Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;", "getSwitchVolumeEvents", "()Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;", "setSwitchVolumeEvents", "(Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;)V", "", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "pixelItem", "Ljava/util/List;", "getPixelItem", "()Ljava/util/List;", "setPixelItem", "(Ljava/util/List;)V", "Lkotlin/Function1;", "trackPixel", "Lkotlin/jvm/functions/Function1;", "getTrackPixel", "()Lkotlin/jvm/functions/Function1;", "setTrackPixel", "(Lkotlin/jvm/functions/Function1;)V", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2AnalyticsSender {

    @NotNull
    private final l analytics;
    private List<Pixel> pixelItem;
    private SwitchModeTracking switchVolumeEvents;

    @NotNull
    private Function1<? super Pixel, Unit> trackPixel;
    private AdvBannerVideoV2VO.TokenizedEvents videoEvents;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoBannerV2Events.values().length];
            try {
                iArr[VideoBannerV2Events.VIDEO_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoBannerV2Events.VIDEO_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoBannerV2Events.IMPRESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoBannerV2Events.PLAYED_Q1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoBannerV2Events.PLAYED_Q2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoBannerV2Events.PLAYED_Q3.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoBannerV2Events.VIDEO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoBannerV2Events.VIDEO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoBannerV2Events.VOLUME_ON.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VideoBannerV2Events.VOLUME_OFF.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VideoBannerV2Events.CLICK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VideoBannerV2Events.NOT_TRACKABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AdvVideoBannerV2AnalyticsSender(@NotNull l analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.analytics = analytics;
        this.trackPixel = AdvVideoBannerV2AnalyticsSender$trackPixel$1.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void trackAnalytics(VideoBannerV2Events event) {
        t videoView;
        switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                AdvBannerVideoV2VO.TokenizedEvents tokenizedEvents = this.videoEvents;
                if (tokenizedEvents != null) {
                    videoView = tokenizedEvents.getVideoView();
                    if (videoView != null) {
                        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.analytics, videoView, null, 2, null);
                        return;
                    }
                    return;
                }
                videoView = null;
                if (videoView != null) {
                }
            case 2:
                AdvBannerVideoV2VO.TokenizedEvents tokenizedEvents2 = this.videoEvents;
                if (tokenizedEvents2 != null) {
                    videoView = tokenizedEvents2.getVideoClick();
                    if (videoView != null) {
                    }
                }
                videoView = null;
                if (videoView != null) {
                }
                break;
            case 3:
                AdvBannerVideoV2VO.TokenizedEvents tokenizedEvents3 = this.videoEvents;
                if (tokenizedEvents3 != null) {
                    videoView = tokenizedEvents3.getVideoViewableImpressions();
                    if (videoView != null) {
                    }
                }
                videoView = null;
                if (videoView != null) {
                }
                break;
            case 4:
                AdvBannerVideoV2VO.TokenizedEvents tokenizedEvents4 = this.videoEvents;
                if (tokenizedEvents4 != null) {
                    videoView = tokenizedEvents4.getVideoQ1();
                    if (videoView != null) {
                    }
                }
                videoView = null;
                if (videoView != null) {
                }
                break;
            case 5:
                AdvBannerVideoV2VO.TokenizedEvents tokenizedEvents5 = this.videoEvents;
                if (tokenizedEvents5 != null) {
                    videoView = tokenizedEvents5.getVideoQ2();
                    if (videoView != null) {
                    }
                }
                videoView = null;
                if (videoView != null) {
                }
                break;
            case 6:
                AdvBannerVideoV2VO.TokenizedEvents tokenizedEvents6 = this.videoEvents;
                if (tokenizedEvents6 != null) {
                    videoView = tokenizedEvents6.getVideoQ3();
                    if (videoView != null) {
                    }
                }
                videoView = null;
                if (videoView != null) {
                }
                break;
            case 7:
                AdvBannerVideoV2VO.TokenizedEvents tokenizedEvents7 = this.videoEvents;
                if (tokenizedEvents7 != null) {
                    videoView = tokenizedEvents7.getVideoStart();
                    if (videoView != null) {
                    }
                }
                videoView = null;
                if (videoView != null) {
                }
                break;
            case 8:
                AdvBannerVideoV2VO.TokenizedEvents tokenizedEvents8 = this.videoEvents;
                if (tokenizedEvents8 != null) {
                    videoView = tokenizedEvents8.getVideoEnd();
                    if (videoView != null) {
                    }
                }
                videoView = null;
                if (videoView != null) {
                }
                break;
            case 9:
                SwitchModeTracking switchModeTracking = this.switchVolumeEvents;
                if (switchModeTracking != null) {
                    videoView = switchModeTracking.getOnTrackingInfo();
                    if (videoView != null) {
                    }
                }
                videoView = null;
                if (videoView != null) {
                }
                break;
            case 10:
                SwitchModeTracking switchModeTracking2 = this.switchVolumeEvents;
                if (switchModeTracking2 != null) {
                    videoView = switchModeTracking2.getOffTrackingInfo();
                    if (videoView != null) {
                    }
                }
                videoView = null;
                if (videoView != null) {
                }
                break;
            case 11:
            case 12:
                videoView = null;
                if (videoView != null) {
                }
                break;
            default:
                throw new o();
        }
    }

    private final void trackPixelAnalytics(VideoBannerV2Events event) {
        ArrayList arrayList = null;
        switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                List<Pixel> list = this.pixelItem;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((Pixel) obj).getAction() == Pixel.ActionType.VIEW) {
                            arrayList.add(obj);
                        }
                    }
                    break;
                }
                break;
            case 2:
            case 11:
                List<Pixel> list2 = this.pixelItem;
                if (list2 != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        if (((Pixel) obj2).getAction() == Pixel.ActionType.CLICK) {
                            arrayList.add(obj2);
                        }
                    }
                    break;
                }
                break;
            case 3:
                List<Pixel> list3 = this.pixelItem;
                if (list3 != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list3) {
                        if (((Pixel) obj3).getAction() == Pixel.ActionType.VIDEO_VIEWABLE_IMPRESSIONS) {
                            arrayList.add(obj3);
                        }
                    }
                    break;
                }
                break;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
                break;
            case 7:
                List<Pixel> list4 = this.pixelItem;
                if (list4 != null) {
                    arrayList = new ArrayList();
                    for (Object obj4 : list4) {
                        if (((Pixel) obj4).getAction() == Pixel.ActionType.VIDEO_START) {
                            arrayList.add(obj4);
                        }
                    }
                    break;
                }
                break;
            default:
                throw new o();
        }
        if (arrayList != null) {
            Function1<? super Pixel, Unit> function1 = this.trackPixel;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                function1.invoke((Pixel) it.next());
            }
        }
    }

    public final void sendEvent(@NotNull VideoBannerV2Events event) {
        Intrinsics.checkNotNullParameter(event, "event");
        trackAnalytics(event);
        trackPixelAnalytics(event);
    }

    public final void setPixelItem(List<Pixel> list) {
        this.pixelItem = list;
    }

    public final void setSwitchVolumeEvents(SwitchModeTracking switchModeTracking) {
        this.switchVolumeEvents = switchModeTracking;
    }

    public final void setTrackPixel(@NotNull Function1<? super Pixel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.trackPixel = function1;
    }

    public final void setVideoEvents(AdvBannerVideoV2VO.TokenizedEvents tokenizedEvents) {
        this.videoEvents = tokenizedEvents;
    }
}
