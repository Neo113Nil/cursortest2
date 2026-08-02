package defpackage;

import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncidentType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class pe9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HockeyIncidentType.values().length];
        try {
            iArr[HockeyIncidentType.GOALIE_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HockeyIncidentType.GOALIE_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HockeyIncidentType.PENALTY_ATTEMPT_FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[HockeyIncidentType.PENALTY_MISSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[HockeyIncidentType.PENALTY_SAVED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
