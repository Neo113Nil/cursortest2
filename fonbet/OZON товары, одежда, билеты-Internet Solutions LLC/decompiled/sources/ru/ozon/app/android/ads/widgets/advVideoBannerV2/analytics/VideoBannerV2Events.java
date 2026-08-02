package ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/VideoBannerV2Events;", "", "<init>", "(Ljava/lang/String;I)V", "VIDEO_VIEW", "VIDEO_START", "VIDEO_END", "IMPRESSION", "PLAYED_Q1", "PLAYED_Q2", "PLAYED_Q3", "VOLUME_ON", "VOLUME_OFF", "VIDEO_CLICK", "NOT_TRACKABLE", "CLICK", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoBannerV2Events {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VideoBannerV2Events[] $VALUES;
    public static final VideoBannerV2Events VIDEO_VIEW = new VideoBannerV2Events("VIDEO_VIEW", 0);
    public static final VideoBannerV2Events VIDEO_START = new VideoBannerV2Events("VIDEO_START", 1);
    public static final VideoBannerV2Events VIDEO_END = new VideoBannerV2Events("VIDEO_END", 2);
    public static final VideoBannerV2Events IMPRESSION = new VideoBannerV2Events("IMPRESSION", 3);
    public static final VideoBannerV2Events PLAYED_Q1 = new VideoBannerV2Events("PLAYED_Q1", 4);
    public static final VideoBannerV2Events PLAYED_Q2 = new VideoBannerV2Events("PLAYED_Q2", 5);
    public static final VideoBannerV2Events PLAYED_Q3 = new VideoBannerV2Events("PLAYED_Q3", 6);
    public static final VideoBannerV2Events VOLUME_ON = new VideoBannerV2Events("VOLUME_ON", 7);
    public static final VideoBannerV2Events VOLUME_OFF = new VideoBannerV2Events("VOLUME_OFF", 8);
    public static final VideoBannerV2Events VIDEO_CLICK = new VideoBannerV2Events("VIDEO_CLICK", 9);
    public static final VideoBannerV2Events NOT_TRACKABLE = new VideoBannerV2Events("NOT_TRACKABLE", 10);
    public static final VideoBannerV2Events CLICK = new VideoBannerV2Events("CLICK", 11);

    private static final /* synthetic */ VideoBannerV2Events[] $values() {
        return new VideoBannerV2Events[]{VIDEO_VIEW, VIDEO_START, VIDEO_END, IMPRESSION, PLAYED_Q1, PLAYED_Q2, PLAYED_Q3, VOLUME_ON, VOLUME_OFF, VIDEO_CLICK, NOT_TRACKABLE, CLICK};
    }

    static {
        VideoBannerV2Events[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private VideoBannerV2Events(String str, int i11) {
    }

    public static VideoBannerV2Events valueOf(String str) {
        return (VideoBannerV2Events) Enum.valueOf(VideoBannerV2Events.class, str);
    }

    public static VideoBannerV2Events[] values() {
        return (VideoBannerV2Events[]) $VALUES.clone();
    }
}
