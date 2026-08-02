package defpackage;

import com.blaze.blazesdk.interactions.models.dto.InteractionRelativeToDto;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d4m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InteractionRelativeToDto.values().length];
        try {
            iArr[InteractionRelativeToDto.PLAYER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InteractionRelativeToDto.SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
