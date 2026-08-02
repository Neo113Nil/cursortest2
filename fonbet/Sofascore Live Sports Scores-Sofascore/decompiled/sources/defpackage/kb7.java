package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class kb7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FantasyCompetitionType.values().length];
        try {
            iArr[FantasyCompetitionType.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FantasyCompetitionType.SEASON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[uj7.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            uj7 uj7Var = uj7.a;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            uj7 uj7Var2 = uj7.a;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
