package defpackage;

import com.blaze.blazesdk.style.players.BlazePlayerDisplayMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class rqm {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

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
        int[] iArr2 = new int[htl.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            htl[] htlVarArr = htl.b;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            htl[] htlVarArr2 = htl.b;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            htl[] htlVarArr3 = htl.b;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
