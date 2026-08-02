package defpackage;

import com.sofascore.model.newNetwork.commentary.SegmentEventType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class l09 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SegmentEventType.values().length];
        try {
            iArr[SegmentEventType.MISSED_PENALTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SegmentEventType.SAVED_PENALTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[wa5.values().length];
        try {
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            wa5 wa5Var = wa5.a;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
