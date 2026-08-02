package defpackage;

import com.sofascore.model.newNetwork.UniqueTournamentTeamAwardType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class jua {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UniqueTournamentTeamAwardType.values().length];
        try {
            iArr[UniqueTournamentTeamAwardType.BestFirst.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UniqueTournamentTeamAwardType.BestSecond.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UniqueTournamentTeamAwardType.BestThird.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UniqueTournamentTeamAwardType.BestDefensiveFirst.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[UniqueTournamentTeamAwardType.BestDefensiveSecond.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[UniqueTournamentTeamAwardType.BestRookieFirst.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[UniqueTournamentTeamAwardType.BestRookieSecond.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
