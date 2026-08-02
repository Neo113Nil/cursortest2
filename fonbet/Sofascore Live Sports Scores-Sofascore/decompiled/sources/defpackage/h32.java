package defpackage;

import com.sofascore.model.branding.BrandLocation;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class h32 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BrandLocation.values().length];
        try {
            iArr[BrandLocation.Header.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BrandLocation.MainList.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BrandLocation.TeamOfTheWeek.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BrandLocation.EventStandings.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BrandLocation.LeagueStandings.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BrandLocation.PlayerOfTheMatch.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
