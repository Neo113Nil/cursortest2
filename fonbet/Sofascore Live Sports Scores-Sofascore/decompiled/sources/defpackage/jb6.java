package defpackage;

import com.sofascore.model.network.response.EventStatisticsItem;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class jb6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EventStatisticsItem.SpecialEventStatisticType.values().length];
        try {
            iArr[EventStatisticsItem.SpecialEventStatisticType.ExpectedGoals.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EventStatisticsItem.SpecialEventStatisticType.ExpectedGoalsOnTarget.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EventStatisticsItem.SpecialEventStatisticType.GoalsPrevented.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
