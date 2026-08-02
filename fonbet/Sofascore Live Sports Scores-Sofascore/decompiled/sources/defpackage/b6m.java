package defpackage;

import com.blaze.blazesdk.style.players.BlazePlayerDisplayMode;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerBodyTextStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerCtaIconStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerCtaStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFooterGradientStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerHeadingTextStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.shared.models.BlazeObjectXPosition;
import com.blaze.blazesdk.style.shared.models.BlazeObjectYPosition;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b6m {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;
    public static final /* synthetic */ int[] h;
    public static final /* synthetic */ int[] i;
    public static final /* synthetic */ int[] j;

    static {
        int[] iArr = new int[BlazePlayerDisplayMode.values().length];
        try {
            iArr[BlazePlayerDisplayMode.FIXED_RATIO_9_16.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazePlayerDisplayMode.RESIZE_ASPECT_FILL_CENTER_CROP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            BlazePlayerDisplayMode blazePlayerDisplayMode = BlazePlayerDisplayMode.FIXED_RATIO_9_16;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[BlazeMomentsPlayerFooterGradientStyle.BlazeEndPositioning.values().length];
        try {
            iArr2[BlazeMomentsPlayerFooterGradientStyle.BlazeEndPositioning.BOTTOM_TO_CONTAINER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[BlazeMomentsPlayerFooterGradientStyle.BlazeEndPositioning.BOTTOM_TO_PLAYER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[e4m.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            e4m e4mVar = e4m.PLAYER;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr4 = new int[BlazeObjectXPosition.values().length];
        try {
            iArr4[BlazeObjectXPosition.START_TO_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[BlazeObjectXPosition.END_TO_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[BlazeObjectXPosition.CENTER_X.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[BlazeObjectXPosition.START_TO_END.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[BlazeObjectXPosition.END_TO_START.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[BlazeObjectXPosition.CENTER_TO_START.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[BlazeObjectXPosition.CENTER_TO_END.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        c = iArr4;
        int[] iArr5 = new int[BlazeObjectYPosition.values().length];
        try {
            iArr5[BlazeObjectYPosition.TOP_TO_TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[BlazeObjectYPosition.BOTTOM_TO_BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr5[BlazeObjectYPosition.CENTER_Y.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[BlazeObjectYPosition.TOP_TO_BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[BlazeObjectYPosition.BOTTOM_TO_TOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[BlazeObjectYPosition.CENTER_TO_TOP.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[BlazeObjectYPosition.CENTER_TO_BOTTOM.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        d = iArr5;
        int[] iArr6 = new int[BlazeMomentsPlayerHeadingTextStyle.BlazeContentSource.values().length];
        try {
            iArr6[BlazeMomentsPlayerHeadingTextStyle.BlazeContentSource.TITLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr6[BlazeMomentsPlayerHeadingTextStyle.BlazeContentSource.SUBTITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        e = iArr6;
        int[] iArr7 = new int[BlazeMomentsPlayerBodyTextStyle.BlazeContentSource.values().length];
        try {
            iArr7[BlazeMomentsPlayerBodyTextStyle.BlazeContentSource.TITLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr7[BlazeMomentsPlayerBodyTextStyle.BlazeContentSource.SUBTITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr7[BlazeMomentsPlayerBodyTextStyle.BlazeContentSource.DESCRIPTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused26) {
        }
        f = iArr7;
        int[] iArr8 = new int[BlazeMomentsPlayerCtaIconStyle.BlazeIconPositioning.values().length];
        try {
            iArr8[BlazeMomentsPlayerCtaIconStyle.BlazeIconPositioning.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused27) {
        }
        g = iArr8;
        int[] iArr9 = new int[BlazeMomentsPlayerStyle.BlazeBottomComponentsAlignment.values().length];
        try {
            iArr9[BlazeMomentsPlayerStyle.BlazeBottomComponentsAlignment.RELATIVE_TO_CONTAINER.ordinal()] = 1;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr9[BlazeMomentsPlayerStyle.BlazeBottomComponentsAlignment.RELATIVE_TO_PLAYER.ordinal()] = 2;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr9[BlazeMomentsPlayerStyle.BlazeBottomComponentsAlignment.FIT_CTA_BELOW_PLAYER.ordinal()] = 3;
        } catch (NoSuchFieldError unused30) {
        }
        h = iArr9;
        int[] iArr10 = new int[BlazeMomentsPlayerCtaStyle.BlazeCTAPositioning.values().length];
        try {
            iArr10[BlazeMomentsPlayerCtaStyle.BlazeCTAPositioning.CTA_BELLOW_BOTTOM_BUTTONS_BOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr10[BlazeMomentsPlayerCtaStyle.BlazeCTAPositioning.CTA_NEXT_TO_BOTTOM_BUTTONS_BOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused32) {
        }
        i = iArr10;
        int[] iArr11 = new int[BlazeMomentsPlayerCtaStyle.BlazeCTAHorizontalAlignment.values().length];
        try {
            iArr11[BlazeMomentsPlayerCtaStyle.BlazeCTAHorizontalAlignment.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr11[BlazeMomentsPlayerCtaStyle.BlazeCTAHorizontalAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr11[BlazeMomentsPlayerCtaStyle.BlazeCTAHorizontalAlignment.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr11[BlazeMomentsPlayerCtaStyle.BlazeCTAHorizontalAlignment.FULL_AVAILABLE_WIDTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused36) {
        }
        j = iArr11;
    }
}
