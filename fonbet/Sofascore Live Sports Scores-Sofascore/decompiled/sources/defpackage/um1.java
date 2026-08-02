package defpackage;

import com.sofascore.model.newNetwork.BaseballTopPerformerRole;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class um1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BaseballTopPerformerRole.values().length];
        try {
            iArr[BaseballTopPerformerRole.Batter.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BaseballTopPerformerRole.Pitcher.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BaseballTopPerformerRole.Fielder.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
