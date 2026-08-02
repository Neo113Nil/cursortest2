package defpackage;

import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncidentType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class e16 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HockeyIncidentType.values().length];
        try {
            iArr[HockeyIncidentType.FACEOFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HockeyIncidentType.SHOT_MISSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HockeyIncidentType.SHOT_SAVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[HockeyIncidentType.SHOT_BLOCKED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[HockeyIncidentType.HIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[HockeyIncidentType.STOPPAGE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[HockeyIncidentType.CHALLENGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[HockeyIncidentType.POSSESSION_CHANGE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[HockeyIncidentType.UNKNOWN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[HockeyIncidentType.GOAL.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[HockeyIncidentType.PENALTY_SCORED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[HockeyIncidentType.SUSPENSION.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[HockeyIncidentType.PENALTY_SAVED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[HockeyIncidentType.PENALTY_MISSED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[HockeyIncidentType.PENALTY_ATTEMPT_FAILED.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[HockeyIncidentType.GOALIE_IN.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[HockeyIncidentType.GOALIE_OUT.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        a = iArr;
    }
}
