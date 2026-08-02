package defpackage;

import com.sofascore.model.fantasy.FantasyLeagueType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class p37 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FantasyLeagueType.values().length];
        try {
            iArr[FantasyLeagueType.GLOBAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FantasyLeagueType.COUNTRY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FantasyLeagueType.RANDOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FantasyLeagueType.PRIVATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
