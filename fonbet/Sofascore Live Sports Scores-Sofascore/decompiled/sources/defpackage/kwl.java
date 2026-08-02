package defpackage;

import com.blaze.blazesdk.interactions.models.dto.InteractionObjectXPositionDto;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class kwl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InteractionObjectXPositionDto.values().length];
        try {
            iArr[InteractionObjectXPositionDto.START_TO_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InteractionObjectXPositionDto.START_TO_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InteractionObjectXPositionDto.END_TO_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InteractionObjectXPositionDto.END_TO_END.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InteractionObjectXPositionDto.CENTER_X.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[InteractionObjectXPositionDto.CENTER_TO_START.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[InteractionObjectXPositionDto.CENTER_TO_END.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
