package defpackage;

import com.blaze.blazesdk.style.widgets.BlazeViewType;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageGradientOverlayStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class m8m {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[BlazeViewType.values().length];
        try {
            iArr[BlazeViewType.ROW_VIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeViewType.GRID_VIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[BlazeWidgetItemImageGradientOverlayStyle.BlazeGradientPosition.values().length];
        try {
            iArr2[BlazeWidgetItemImageGradientOverlayStyle.BlazeGradientPosition.BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[BlazeWidgetItemImageGradientOverlayStyle.BlazeGradientPosition.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[BlazeWidgetItemImageGradientOverlayStyle.BlazeGradientPosition.TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[BlazeWidgetItemImageStyle.BlazeImagePosition.values().length];
        try {
            iArr3[BlazeWidgetItemImageStyle.BlazeImagePosition.BottomStart.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[BlazeWidgetItemImageStyle.BlazeImagePosition.BottomCenter.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[BlazeWidgetItemImageStyle.BlazeImagePosition.BottomEnd.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[BlazeWidgetItemImageStyle.BlazeImagePosition.Center.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[BlazeWidgetItemImageStyle.BlazeImagePosition.CenterStart.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[BlazeWidgetItemImageStyle.BlazeImagePosition.CenterEnd.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[BlazeWidgetItemImageStyle.BlazeImagePosition.TopStart.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[BlazeWidgetItemImageStyle.BlazeImagePosition.TopCenter.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[BlazeWidgetItemImageStyle.BlazeImagePosition.TopEnd.ordinal()] = 9;
        } catch (NoSuchFieldError unused14) {
        }
        c = iArr3;
    }
}
