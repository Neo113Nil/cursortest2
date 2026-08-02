package defpackage;

import com.blaze.blazesdk.style.players.BlazeTextCase;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerCtaIconStyle;
import com.blaze.blazesdk.style.shared.models.BlazeObjectXPosition;
import com.blaze.blazesdk.style.shared.models.BlazeObjectYPosition;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ghm {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[e4m.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            e4m e4mVar = e4m.PLAYER;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[BlazeObjectXPosition.values().length];
        try {
            iArr2[BlazeObjectXPosition.START_TO_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[BlazeObjectXPosition.END_TO_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[BlazeObjectXPosition.CENTER_X.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[BlazeObjectXPosition.START_TO_END.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[BlazeObjectXPosition.END_TO_START.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[BlazeObjectXPosition.CENTER_TO_START.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[BlazeObjectXPosition.CENTER_TO_END.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr2;
        int[] iArr3 = new int[BlazeObjectYPosition.values().length];
        try {
            iArr3[BlazeObjectYPosition.TOP_TO_TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[BlazeObjectYPosition.BOTTOM_TO_BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[BlazeObjectYPosition.CENTER_Y.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[BlazeObjectYPosition.TOP_TO_BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[BlazeObjectYPosition.BOTTOM_TO_TOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[BlazeObjectYPosition.CENTER_TO_TOP.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[BlazeObjectYPosition.CENTER_TO_BOTTOM.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        b = iArr3;
        int[] iArr4 = new int[BlazeStoryPlayerCtaIconStyle.BlazeIconPositioning.values().length];
        try {
            iArr4[BlazeStoryPlayerCtaIconStyle.BlazeIconPositioning.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        c = iArr4;
        int[] iArr5 = new int[s6m.values().length];
        try {
            iArr5[0] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        d = iArr5;
        int[] iArr6 = new int[BlazeTextCase.values().length];
        try {
            iArr6[BlazeTextCase.LOWERCASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr6[BlazeTextCase.UPPERCASE.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        e = iArr6;
    }
}
