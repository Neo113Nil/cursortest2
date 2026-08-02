package defpackage;

import com.blaze.blazesdk.widgets.models.OrderTypeRemoteDto;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class zam {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderTypeRemoteDto.values().length];
        try {
            iArr[OrderTypeRemoteDto.MANUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderTypeRemoteDto.RECENTLY_UPDATED_FIRST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrderTypeRemoteDto.RECENTLY_UPDATED_LAST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OrderTypeRemoteDto.A_TO_Z.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OrderTypeRemoteDto.Z_TO_A.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[OrderTypeRemoteDto.RECENTLY_CREATED_FIRST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[OrderTypeRemoteDto.RECENTLY_CREATED_LAST.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[OrderTypeRemoteDto.RANDOM.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
