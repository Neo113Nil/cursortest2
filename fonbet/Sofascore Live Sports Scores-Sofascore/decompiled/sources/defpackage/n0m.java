package defpackage;

import com.blaze.blazesdk.interactions.models.dto.InteractionObjectYPositionDto;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class n0m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InteractionObjectYPositionDto.values().length];
        try {
            iArr[InteractionObjectYPositionDto.BOTTOM_TO_TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InteractionObjectYPositionDto.TOP_TO_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InteractionObjectYPositionDto.BOTTOM_TO_BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InteractionObjectYPositionDto.TOP_TO_BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InteractionObjectYPositionDto.CENTER_TO_TOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[InteractionObjectYPositionDto.CENTER_Y.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[InteractionObjectYPositionDto.CENTER_TO_BOTTOM.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
