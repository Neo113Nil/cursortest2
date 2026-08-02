package defpackage;

import com.sofascore.model.newNetwork.FilterCategory;
import com.sofascore.model.newNetwork.FilterValue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class ayb {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[FilterCategory.values().length];
        try {
            iArr[FilterCategory.STATUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FilterCategory.LEVEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FilterCategory.CATEGORY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FilterCategory.GENDER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FilterCategory.REGION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[FilterCategory.TOURNAMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[FilterValue.values().length];
        try {
            iArr2[FilterValue.CLUB.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[FilterValue.NATIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[FilterValue.TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[FilterValue.RUGBY_UNION.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[FilterValue.RUGBY_LEAGUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[FilterValue.RUGBY_UNION_SEVENS.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[FilterValue.BEACH_RUGBY.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[FilterValue.ALL.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[FilterValue.CSGO.ordinal()] = 9;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[FilterValue.DOTA2.ordinal()] = 10;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[FilterValue.LOL.ordinal()] = 11;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[FilterValue.MEN.ordinal()] = 12;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[FilterValue.WOMEN.ordinal()] = 13;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[FilterValue.MIX.ordinal()] = 14;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[FilterValue.CONTRIBUTOR.ordinal()] = 15;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[FilterValue.YOUTH.ordinal()] = 16;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[FilterValue.COLLEGE.ordinal()] = 17;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[FilterValue.SINGLES.ordinal()] = 18;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[FilterValue.DOUBLES.ordinal()] = 19;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[FilterValue.GRAND_SLAM.ordinal()] = 20;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[FilterValue.P1000.ordinal()] = 21;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[FilterValue.P500.ordinal()] = 22;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[FilterValue.P250.ordinal()] = 23;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[FilterValue.LOWER.ordinal()] = 24;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[FilterValue.MAJOR.ordinal()] = 25;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[FilterValue.MINOR.ordinal()] = 26;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[FilterValue.NORTH_AMERICA.ordinal()] = 27;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[FilterValue.EUROPE.ordinal()] = 28;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[FilterValue.UPCOMING.ordinal()] = 29;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[FilterValue.FINISHED.ordinal()] = 30;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[FilterValue.PRO.ordinal()] = 31;
        } catch (NoSuchFieldError unused37) {
        }
        b = iArr2;
    }
}
