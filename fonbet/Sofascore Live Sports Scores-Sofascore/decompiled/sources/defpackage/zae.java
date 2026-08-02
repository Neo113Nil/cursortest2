package defpackage;

import com.sofascore.model.newNetwork.commentary.SegmentEventType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class zae {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SegmentEventType.values().length];
        try {
            iArr[SegmentEventType.SAVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SegmentEventType.POST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
