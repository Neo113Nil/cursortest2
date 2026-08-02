package defpackage;

import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyGoalType;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyPlayType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class de9 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[HockeyGoalType.values().length];
        try {
            iArr[HockeyGoalType.SHOOTOUT_GOAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HockeyGoalType.PENALTY_GOAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HockeyGoalType.AWARDED_GOAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[HockeyGoalType.EMPTY_NET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[HockeyPlayType.values().length];
        try {
            iArr2[HockeyPlayType.SHORTHANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[HockeyPlayType.POWERPLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
