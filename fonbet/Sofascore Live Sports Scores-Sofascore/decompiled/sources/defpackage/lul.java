package defpackage;

import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickHandlerState;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class lul {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[BlazeWidgetItemImageStyle.BlazeThumbnailType.values().length];
        try {
            iArr[BlazeWidgetItemImageStyle.BlazeThumbnailType.SQUARE_ICON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeWidgetItemImageStyle.BlazeThumbnailType.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BlazeWidgetItemImageStyle.BlazeThumbnailType.VERTICAL_TWO_BY_THREE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            BlazeWidgetItemImageStyle.BlazeThumbnailType blazeThumbnailType = BlazeWidgetItemImageStyle.BlazeThumbnailType.SQUARE_ICON;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            BlazeWidgetItemImageStyle.BlazeThumbnailType blazeThumbnailType2 = BlazeWidgetItemImageStyle.BlazeThumbnailType.SQUARE_ICON;
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[BlazeWidgetItemClickHandlerState.values().length];
        try {
            iArr2[BlazeWidgetItemClickHandlerState.HANDLED_BY_APP.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[BlazeWidgetItemClickHandlerState.SDK_SHOULD_HANDLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
