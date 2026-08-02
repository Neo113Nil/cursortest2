package defpackage;

import com.sofascore.model.database.VoteType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class b4f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VoteType.values().length];
        try {
            iArr[VoteType.WHO_WILL_WIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VoteType.WILL_BOTH_TEAMS_SCORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VoteType.FIRST_TEAM_TO_SCORE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
