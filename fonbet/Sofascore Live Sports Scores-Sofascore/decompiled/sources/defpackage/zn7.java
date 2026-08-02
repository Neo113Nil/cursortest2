package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class zn7 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[FantasyCompetitionType.values().length];
        try {
            iArr[FantasyCompetitionType.SEASON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FantasyCompetitionType.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[yy6.values().length];
        try {
            yy6 yy6Var = yy6.AVAILABLE;
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            yy6 yy6Var2 = yy6.AVAILABLE;
            iArr2[5] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            yy6 yy6Var3 = yy6.AVAILABLE;
            iArr2[1] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
