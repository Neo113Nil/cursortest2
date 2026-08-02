package defpackage;

import com.blaze.blazesdk.shared.models.BlazeLayoutDirection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class mka {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[lpl.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            lpl lplVar = lpl.CORRECT;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            lpl lplVar2 = lpl.CORRECT;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            lpl lplVar3 = lpl.CORRECT;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[BlazeLayoutDirection.values().length];
        try {
            iArr2[BlazeLayoutDirection.LTR.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[BlazeLayoutDirection.RTL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr2;
    }
}
