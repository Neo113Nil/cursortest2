package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class eu6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[u77.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            u77 u77Var = u77.a;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[FantasyCompetitionType.values().length];
        try {
            iArr2[FantasyCompetitionType.SEASON.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[FantasyCompetitionType.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr2;
        int[] iArr3 = new int[uj7.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            uj7 uj7Var = uj7.a;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            uj7 uj7Var2 = uj7.a;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
