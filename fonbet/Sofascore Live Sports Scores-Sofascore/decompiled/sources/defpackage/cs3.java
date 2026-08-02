package defpackage;

import com.sofascore.model.profile.ContributionStatus;
import com.sofascore.model.profile.ContributionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class cs3 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ContributionType.values().length];
        try {
            iArr[ContributionType.EVENT_START_DATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContributionType.EVENT_STATUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContributionType.EVENT_SCORE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ContributionType.GOAL_SCORER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ContributionType.GOAL_ASSISTANT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[ContributionStatus.values().length];
        try {
            iArr2[ContributionStatus.APPROVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ContributionStatus.DECLINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
