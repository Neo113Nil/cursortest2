package defpackage;

import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerCtaIconStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerHeadingTextStyle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class t0n {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[BlazeVideosPlayerHeadingTextStyle.BlazeContentSource.values().length];
        try {
            iArr[BlazeVideosPlayerHeadingTextStyle.BlazeContentSource.TITLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[BlazeLiveStreamStatus.values().length];
        try {
            iArr2[BlazeLiveStreamStatus.LIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[BlazeLiveStreamStatus.UPCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[BlazeLiveStreamStatus.ENDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[BlazeVideosPlayerCtaIconStyle.BlazeIconPositioning.values().length];
        try {
            iArr3[BlazeVideosPlayerCtaIconStyle.BlazeIconPositioning.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        c = iArr3;
    }
}
