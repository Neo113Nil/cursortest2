package defpackage;

import com.sofascore.model.Injury;
import com.sofascore.model.PlayerActiveSuspension;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class dle {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Injury.ExpectedReturn.values().length];
        try {
            iArr[Injury.ExpectedReturn.AFewDays.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Injury.ExpectedReturn.DayToDay.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Injury.ExpectedReturn.OutForSeason.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Injury.ExpectedReturn.BackInTraining.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Injury.ExpectedReturn.AFewWeeks.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Injury.ExpectedReturn.AboutAWeek.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Injury.ExpectedReturn.AboutOneOrTwoWeeks.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Injury.ExpectedReturn.EarlyMonthYear.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[Injury.ExpectedReturn.MidMonthYear.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[Injury.ExpectedReturn.LateMonthYear.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
        int[] iArr2 = new int[PlayerActiveSuspension.SuspensionReason.values().length];
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.RedCard.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.YellowCardAccumulation.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.YellowToRedCard.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.ImproperConduct.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.Doping.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.SuspendedAfterReview.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.Personal.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.PoliceInvestigation.ordinal()] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.CoachDecision.ordinal()] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.ClubDecision.ordinal()] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.PendingTransfer.ordinal()] = 11;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.Rested.ordinal()] = 12;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.Gambling.ordinal()] = 13;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.NationalTeam.ordinal()] = 14;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[PlayerActiveSuspension.SuspensionReason.Other.ordinal()] = 15;
        } catch (NoSuchFieldError unused25) {
        }
        b = iArr2;
    }
}
