package defpackage;

import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyFaceOffZone;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncidentType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class td9 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[HockeyIncidentType.values().length];
        try {
            iArr[HockeyIncidentType.HIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HockeyIncidentType.SHOT_BLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HockeyIncidentType.SHOT_SAVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[HockeyFaceOffZone.values().length];
        try {
            iArr2[HockeyFaceOffZone.OFFENSIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[HockeyFaceOffZone.DEFENSIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[HockeyFaceOffZone.NEUTRAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
