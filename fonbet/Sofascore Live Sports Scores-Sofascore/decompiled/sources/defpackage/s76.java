package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.ServerType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class s76 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Gender.values().length];
        try {
            iArr[Gender.Male.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Gender.Female.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ServerType.values().length];
        try {
            iArr2[ServerType.SPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ServerType.SEASON.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ServerType.EVENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ServerType.PRACTICE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ServerType.QUALIFYING.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ServerType.QUALIFYING_PART.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ServerType.RACE.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ServerType.LAP.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ServerType.STAGE.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ServerType.PROLOGUE.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ServerType.SPRINT.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[ServerType.DISCIPLINE.ordinal()] = 12;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[ServerType.SPRINT_QUALIFYING.ordinal()] = 13;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[ServerType.SPRINT_QUALIFYING_PART.ordinal()] = 14;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[ServerType.PRACTICE_PART.ordinal()] = 15;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[ServerType.DAY.ordinal()] = 16;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[ServerType.AFTER_STAGE.ordinal()] = 17;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[ServerType.CYCLING_OVERALL.ordinal()] = 18;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[ServerType.CUSTOM.ordinal()] = 19;
        } catch (NoSuchFieldError unused21) {
        }
        b = iArr2;
    }
}
