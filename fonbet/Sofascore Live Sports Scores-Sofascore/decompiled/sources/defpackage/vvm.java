package defpackage;

import com.blaze.blazesdk.style.shared.models.BlazeObjectXPosition;
import com.blaze.blazesdk.style.shared.models.BlazeObjectYPosition;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class vvm {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[BlazeObjectXPosition.values().length];
        try {
            iArr[BlazeObjectXPosition.START_TO_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeObjectXPosition.START_TO_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BlazeObjectXPosition.END_TO_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BlazeObjectXPosition.END_TO_END.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BlazeObjectXPosition.CENTER_TO_START.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BlazeObjectXPosition.CENTER_X.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BlazeObjectXPosition.CENTER_TO_END.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[BlazeObjectYPosition.values().length];
        try {
            iArr2[BlazeObjectYPosition.BOTTOM_TO_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[BlazeObjectYPosition.BOTTOM_TO_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[BlazeObjectYPosition.TOP_TO_BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[BlazeObjectYPosition.TOP_TO_TOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[BlazeObjectYPosition.CENTER_TO_TOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[BlazeObjectYPosition.CENTER_Y.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[BlazeObjectYPosition.CENTER_TO_BOTTOM.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        b = iArr2;
        int[] iArr3 = new int[sl9.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            sl9 sl9Var = sl9.IDLE;
            iArr3[4] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            sl9 sl9Var2 = sl9.IDLE;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            sl9 sl9Var3 = sl9.IDLE;
            iArr3[3] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            sl9 sl9Var4 = sl9.IDLE;
            iArr3[1] = 5;
        } catch (NoSuchFieldError unused19) {
        }
    }
}
