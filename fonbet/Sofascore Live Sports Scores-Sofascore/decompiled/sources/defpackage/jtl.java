package defpackage;

import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamEdgeState;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class jtl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlazeLiveStreamEdgeState.values().length];
        try {
            iArr[BlazeLiveStreamEdgeState.AT_LIVE_EDGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeLiveStreamEdgeState.BEHIND_LIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
