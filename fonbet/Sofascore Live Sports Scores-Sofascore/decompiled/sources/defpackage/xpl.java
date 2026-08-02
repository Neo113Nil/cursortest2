package defpackage;

import com.blaze.blazesdk.style.widgets.BlazeViewType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class xpl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlazeViewType.values().length];
        try {
            iArr[BlazeViewType.GRID_VIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeViewType.ROW_VIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
