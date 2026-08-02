package defpackage;

import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcomeCategory;
import com.sofascore.model.newNetwork.commentary.BaseballPitchType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class i81 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[BaseballPitchType.values().length];
        try {
            iArr[BaseballPitchType.Fastball.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BaseballPitchType.FourSeamFastball.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BaseballPitchType.Cutter.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BaseballPitchType.Sinker.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BaseballPitchType.Splitter.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BaseballPitchType.Forkball.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BaseballPitchType.Changeup.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[BaseballPitchType.Screwball.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[BaseballPitchType.Slider.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[BaseballPitchType.Curveball.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[BaseballPitchType.SlowCurve.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[BaseballPitchType.KnuckleCurve.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[BaseballPitchType.Slurve.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[BaseballPitchType.Sweeper.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[BaseballPitchType.Slutter.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[BaseballPitchType.Gyroball.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[BaseballPitchType.Knuckleball.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[BaseballPitchType.EephusPitch.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[BaseballPitchType.IntentionalBall.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[BaseballPitchType.Pitchout.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[BaseballPitchType.AutomaticBall.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[BaseballPitchType.AutomaticStrike.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[BaseballPitchType.NoPitch.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[BaseballPitchType.Unknown.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        a = iArr;
        int[] iArr2 = new int[BaseballActionOutcome.values().length];
        try {
            iArr2[BaseballActionOutcome.EnforcedStrike.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeAutomaticPitchTimerViolation.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeAutomaticBatterTimeoutViolation.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeLooking.ordinal()] = 4;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeSwinging.ordinal()] = 5;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[BaseballActionOutcome.FoulBall.ordinal()] = 6;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[BaseballActionOutcome.FoulTip.ordinal()] = 7;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[BaseballActionOutcome.RulingPendingAtBatContinues.ordinal()] = 8;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[BaseballActionOutcome.RulingPendingAtBatOver.ordinal()] = 9;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[BaseballActionOutcome.HitterInterference.ordinal()] = 10;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[BaseballActionOutcome.DoubleTaggedOut2nd.ordinal()] = 11;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[BaseballActionOutcome.DoubleOut3rd.ordinal()] = 12;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[BaseballActionOutcome.DoubleOutHome.ordinal()] = 13;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[BaseballActionOutcome.FieldersChoice.ordinal()] = 14;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[BaseballActionOutcome.FieldersChoiceOut2nd.ordinal()] = 15;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[BaseballActionOutcome.FieldersChoiceOut3rd.ordinal()] = 16;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[BaseballActionOutcome.FieldersChoiceOutHome.ordinal()] = 17;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[BaseballActionOutcome.FlyOut.ordinal()] = 18;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[BaseballActionOutcome.GroundOut.ordinal()] = 19;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeLookingOut1st.ordinal()] = 20;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeLookingOut2nd.ordinal()] = 21;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeLookingOut3rd.ordinal()] = 22;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeLookingOutHome.ordinal()] = 23;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeSwingingOut1st.ordinal()] = 24;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeSwingingOut2nd.ordinal()] = 25;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeSwingingOut3rd.ordinal()] = 26;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeSwingingOutHome.ordinal()] = 27;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[BaseballActionOutcome.ReachedOnErrorOut2nd.ordinal()] = 28;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[BaseballActionOutcome.ReachedOnErrorOut3rd.ordinal()] = 29;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[BaseballActionOutcome.ReachedOnErrorOutHome.ordinal()] = 30;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[BaseballActionOutcome.SingleTaggedOut1st.ordinal()] = 31;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[BaseballActionOutcome.SingleOut2nd.ordinal()] = 32;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[BaseballActionOutcome.SingleOut3rd.ordinal()] = 33;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr2[BaseballActionOutcome.SingleOutHome.ordinal()] = 34;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr2[BaseballActionOutcome.TripleTaggedOut3rd.ordinal()] = 35;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr2[BaseballActionOutcome.TripleOutHome.ordinal()] = 36;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr2[BaseballActionOutcome.LineOut.ordinal()] = 37;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr2[BaseballActionOutcome.OutOfBattersBox.ordinal()] = 38;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr2[BaseballActionOutcome.OutOnAppealAtBat.ordinal()] = 39;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr2[BaseballActionOutcome.PopOut.ordinal()] = 40;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeBunt.ordinal()] = 41;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeBuntOut2nd.ordinal()] = 42;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeBuntOut3rd.ordinal()] = 43;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeBuntOutHome.ordinal()] = 44;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeFly.ordinal()] = 45;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeFlyOut2nd.ordinal()] = 46;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeFlyOut3rd.ordinal()] = 47;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeFlyOutHome.ordinal()] = 48;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr2[BaseballActionOutcome.EnforcedBall.ordinal()] = 49;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr2[BaseballActionOutcome.BallAutomaticPitchTimerViolationPitcher.ordinal()] = 50;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr2[BaseballActionOutcome.BallAutomaticPitchTimerViolationCatcher.ordinal()] = 51;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr2[BaseballActionOutcome.BallAutomaticShiftViolation.ordinal()] = 52;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr2[BaseballActionOutcome.Ball.ordinal()] = 53;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr2[BaseballActionOutcome.DirtBall.ordinal()] = 54;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr2[BaseballActionOutcome.IntentionalBall.ordinal()] = 55;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr2[BaseballActionOutcome.Pitchout.ordinal()] = 56;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr2[BaseballActionOutcome.Balk.ordinal()] = 57;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr2[BaseballActionOutcome.CatcherInterference.ordinal()] = 58;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr2[BaseballActionOutcome.Double.ordinal()] = 59;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr2[BaseballActionOutcome.DoubleAdv3rd.ordinal()] = 60;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr2[BaseballActionOutcome.DoubleAdvHome.ordinal()] = 61;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr2[BaseballActionOutcome.FieldersChoiceAdv2nd.ordinal()] = 62;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr2[BaseballActionOutcome.FieldersChoiceAdv3rd.ordinal()] = 63;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr2[BaseballActionOutcome.FieldersChoiceAdvHome.ordinal()] = 64;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr2[BaseballActionOutcome.HitByPitch.ordinal()] = 65;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr2[BaseballActionOutcome.Homerun.ordinal()] = 66;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr2[BaseballActionOutcome.IntentionalWalk.ordinal()] = 67;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr2[BaseballActionOutcome.Walk.ordinal()] = 68;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeLookingAdv1st.ordinal()] = 69;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeLookingAdv2nd.ordinal()] = 70;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeLookingAdv3rd.ordinal()] = 71;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeLookingAdvHome.ordinal()] = 72;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeSwingingAdv1st.ordinal()] = 73;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeSwingingAdv2nd.ordinal()] = 74;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeSwingingAdv3rd.ordinal()] = 75;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr2[BaseballActionOutcome.StrikeSwingingAdvHome.ordinal()] = 76;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr2[BaseballActionOutcome.ReachedOnError.ordinal()] = 77;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr2[BaseballActionOutcome.ReachedOnErrorAdv2nd.ordinal()] = 78;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            iArr2[BaseballActionOutcome.ReachedOnErrorAdv3rd.ordinal()] = 79;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr2[BaseballActionOutcome.ReachedOnErrorAdvHome.ordinal()] = 80;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr2[BaseballActionOutcome.ReachedOnViolation.ordinal()] = 81;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr2[BaseballActionOutcome.Single.ordinal()] = 82;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            iArr2[BaseballActionOutcome.SingleAdv2nd.ordinal()] = 83;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            iArr2[BaseballActionOutcome.SingleAdv3rd.ordinal()] = 84;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            iArr2[BaseballActionOutcome.SingleAdvHome.ordinal()] = 85;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeBuntAdv1st.ordinal()] = 86;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeBuntAdv2nd.ordinal()] = 87;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeBuntAdv3rd.ordinal()] = 88;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeBuntAdvHome.ordinal()] = 89;
        } catch (NoSuchFieldError unused113) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeFlyAdv1st.ordinal()] = 90;
        } catch (NoSuchFieldError unused114) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeFlyAdv2nd.ordinal()] = 91;
        } catch (NoSuchFieldError unused115) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeFlyAdv3rd.ordinal()] = 92;
        } catch (NoSuchFieldError unused116) {
        }
        try {
            iArr2[BaseballActionOutcome.SacrificeFlyAdvHome.ordinal()] = 93;
        } catch (NoSuchFieldError unused117) {
        }
        try {
            iArr2[BaseballActionOutcome.Triple.ordinal()] = 94;
        } catch (NoSuchFieldError unused118) {
        }
        try {
            iArr2[BaseballActionOutcome.TripleAdvHome.ordinal()] = 95;
        } catch (NoSuchFieldError unused119) {
        }
        try {
            iArr2[BaseballActionOutcome.CaughtStealing2nd.ordinal()] = 96;
        } catch (NoSuchFieldError unused120) {
        }
        try {
            iArr2[BaseballActionOutcome.CaughtStealing3rd.ordinal()] = 97;
        } catch (NoSuchFieldError unused121) {
        }
        try {
            iArr2[BaseballActionOutcome.CaughtStealingHome.ordinal()] = 98;
        } catch (NoSuchFieldError unused122) {
        }
        try {
            iArr2[BaseballActionOutcome.PickoffCaughtStealing2nd.ordinal()] = 99;
        } catch (NoSuchFieldError unused123) {
        }
        try {
            iArr2[BaseballActionOutcome.PickoffCaughtStealing3rd.ordinal()] = 100;
        } catch (NoSuchFieldError unused124) {
        }
        try {
            iArr2[BaseballActionOutcome.PickoffCaughtStealingHome.ordinal()] = 101;
        } catch (NoSuchFieldError unused125) {
        }
        try {
            iArr2[BaseballActionOutcome.TagOut1st.ordinal()] = 102;
        } catch (NoSuchFieldError unused126) {
        }
        try {
            iArr2[BaseballActionOutcome.TagOut2nd.ordinal()] = 103;
        } catch (NoSuchFieldError unused127) {
        }
        try {
            iArr2[BaseballActionOutcome.TagOut3rd.ordinal()] = 104;
        } catch (NoSuchFieldError unused128) {
        }
        try {
            iArr2[BaseballActionOutcome.TagOutHome.ordinal()] = 105;
        } catch (NoSuchFieldError unused129) {
        }
        try {
            iArr2[BaseballActionOutcome.ForceOut1st.ordinal()] = 106;
        } catch (NoSuchFieldError unused130) {
        }
        try {
            iArr2[BaseballActionOutcome.ForceOut2nd.ordinal()] = 107;
        } catch (NoSuchFieldError unused131) {
        }
        try {
            iArr2[BaseballActionOutcome.ForceOut3rd.ordinal()] = 108;
        } catch (NoSuchFieldError unused132) {
        }
        try {
            iArr2[BaseballActionOutcome.ForceOutHome.ordinal()] = 109;
        } catch (NoSuchFieldError unused133) {
        }
        try {
            iArr2[BaseballActionOutcome.DoubledOff1st.ordinal()] = 110;
        } catch (NoSuchFieldError unused134) {
        }
        try {
            iArr2[BaseballActionOutcome.DoubledOff2nd.ordinal()] = 111;
        } catch (NoSuchFieldError unused135) {
        }
        try {
            iArr2[BaseballActionOutcome.DoubledOff3rd.ordinal()] = 112;
        } catch (NoSuchFieldError unused136) {
        }
        try {
            iArr2[BaseballActionOutcome.Stole2ndOut2nd.ordinal()] = 113;
        } catch (NoSuchFieldError unused137) {
        }
        try {
            iArr2[BaseballActionOutcome.Stole2ndOut3rd.ordinal()] = 114;
        } catch (NoSuchFieldError unused138) {
        }
        try {
            iArr2[BaseballActionOutcome.Stole2ndOutHome.ordinal()] = 115;
        } catch (NoSuchFieldError unused139) {
        }
        try {
            iArr2[BaseballActionOutcome.Stole3rdOut3rd.ordinal()] = 116;
        } catch (NoSuchFieldError unused140) {
        }
        try {
            iArr2[BaseballActionOutcome.Stole3rdOutHome.ordinal()] = 117;
        } catch (NoSuchFieldError unused141) {
        }
        try {
            iArr2[BaseballActionOutcome.RunnerInterference.ordinal()] = 118;
        } catch (NoSuchFieldError unused142) {
        }
        try {
            iArr2[BaseballActionOutcome.OutOnAppealSteal.ordinal()] = 119;
        } catch (NoSuchFieldError unused143) {
        }
        try {
            iArr2[BaseballActionOutcome.OutOfBasePath.ordinal()] = 120;
        } catch (NoSuchFieldError unused144) {
        }
        try {
            iArr2[BaseballActionOutcome.HitByBattedBall.ordinal()] = 121;
        } catch (NoSuchFieldError unused145) {
        }
        try {
            iArr2[BaseballActionOutcome.Stole2nd.ordinal()] = 122;
        } catch (NoSuchFieldError unused146) {
        }
        try {
            iArr2[BaseballActionOutcome.Stole3rd.ordinal()] = 123;
        } catch (NoSuchFieldError unused147) {
        }
        try {
            iArr2[BaseballActionOutcome.StoleHome.ordinal()] = 124;
        } catch (NoSuchFieldError unused148) {
        }
        try {
            iArr2[BaseballActionOutcome.StoleHomeUnearnedRun.ordinal()] = 125;
        } catch (NoSuchFieldError unused149) {
        }
        try {
            iArr2[BaseballActionOutcome.Advance1st.ordinal()] = 126;
        } catch (NoSuchFieldError unused150) {
        }
        try {
            iArr2[BaseballActionOutcome.Advance2nd.ordinal()] = 127;
        } catch (NoSuchFieldError unused151) {
        }
        try {
            iArr2[BaseballActionOutcome.Advance3rd.ordinal()] = 128;
        } catch (NoSuchFieldError unused152) {
        }
        try {
            iArr2[BaseballActionOutcome.Indifference2nd.ordinal()] = 129;
        } catch (NoSuchFieldError unused153) {
        }
        try {
            iArr2[BaseballActionOutcome.Indifference3rd.ordinal()] = 130;
        } catch (NoSuchFieldError unused154) {
        }
        try {
            iArr2[BaseballActionOutcome.CaughtStealing2ndAdvanced3rd.ordinal()] = 131;
        } catch (NoSuchFieldError unused155) {
        }
        try {
            iArr2[BaseballActionOutcome.CaughtStealing2ndAdvancedHome.ordinal()] = 132;
        } catch (NoSuchFieldError unused156) {
        }
        try {
            iArr2[BaseballActionOutcome.CaughtStealing2ndAdvancedHomeUnearnedRun.ordinal()] = 133;
        } catch (NoSuchFieldError unused157) {
        }
        try {
            iArr2[BaseballActionOutcome.CaughtStealing3rdAdvancedHome.ordinal()] = 134;
        } catch (NoSuchFieldError unused158) {
        }
        try {
            iArr2[BaseballActionOutcome.CaughtStealing3rdAdvancedHomeUnearnedRun.ordinal()] = 135;
        } catch (NoSuchFieldError unused159) {
        }
        try {
            iArr2[BaseballActionOutcome.Stole2ndError2nd.ordinal()] = 136;
        } catch (NoSuchFieldError unused160) {
        }
        try {
            iArr2[BaseballActionOutcome.Stole2ndError3rd.ordinal()] = 137;
        } catch (NoSuchFieldError unused161) {
        }
        try {
            iArr2[BaseballActionOutcome.Stole2ndErrorHome.ordinal()] = 138;
        } catch (NoSuchFieldError unused162) {
        }
        try {
            iArr2[BaseballActionOutcome.Stole3rdErrorHome.ordinal()] = 139;
        } catch (NoSuchFieldError unused163) {
        }
        try {
            iArr2[BaseballActionOutcome.Stole2ndErrorHomeEarned.ordinal()] = 140;
        } catch (NoSuchFieldError unused164) {
        }
        try {
            iArr2[BaseballActionOutcome.Stole3rdErrorHomeEarned.ordinal()] = 141;
        } catch (NoSuchFieldError unused165) {
        }
        try {
            iArr2[BaseballActionOutcome.Steal2ndAdvanced3rd.ordinal()] = 142;
        } catch (NoSuchFieldError unused166) {
        }
        try {
            iArr2[BaseballActionOutcome.Steal2ndAdvancedHome.ordinal()] = 143;
        } catch (NoSuchFieldError unused167) {
        }
        try {
            iArr2[BaseballActionOutcome.Steal2ndAdvancedHomeUnearnedRun.ordinal()] = 144;
        } catch (NoSuchFieldError unused168) {
        }
        try {
            iArr2[BaseballActionOutcome.Steal3rdAdvancedHome.ordinal()] = 145;
        } catch (NoSuchFieldError unused169) {
        }
        try {
            iArr2[BaseballActionOutcome.Steal3rdAdvancedHomeUnearnedRun.ordinal()] = 146;
        } catch (NoSuchFieldError unused170) {
        }
        try {
            iArr2[BaseballActionOutcome.Checked.ordinal()] = 147;
        } catch (NoSuchFieldError unused171) {
        }
        try {
            iArr2[BaseballActionOutcome.Pickoff.ordinal()] = 148;
        } catch (NoSuchFieldError unused172) {
        }
        try {
            iArr2[BaseballActionOutcome.CatcherPickoff.ordinal()] = 149;
        } catch (NoSuchFieldError unused173) {
        }
        try {
            iArr2[BaseballActionOutcome.EarnedRunRbi.ordinal()] = 150;
        } catch (NoSuchFieldError unused174) {
        }
        try {
            iArr2[BaseballActionOutcome.EarnedRunNoRbi.ordinal()] = 151;
        } catch (NoSuchFieldError unused175) {
        }
        try {
            iArr2[BaseballActionOutcome.PlayerEarnedRunTeamUnearnedRbi.ordinal()] = 152;
        } catch (NoSuchFieldError unused176) {
        }
        try {
            iArr2[BaseballActionOutcome.PlayerEarnedRunTeamUnearnedNoRbi.ordinal()] = 153;
        } catch (NoSuchFieldError unused177) {
        }
        try {
            iArr2[BaseballActionOutcome.UnearnedRunRbi.ordinal()] = 154;
        } catch (NoSuchFieldError unused178) {
        }
        try {
            iArr2[BaseballActionOutcome.UnearnedRunNoRbi.ordinal()] = 155;
        } catch (NoSuchFieldError unused179) {
        }
        try {
            iArr2[BaseballActionOutcome.PitchingSubstitution.ordinal()] = 156;
        } catch (NoSuchFieldError unused180) {
        }
        try {
            iArr2[BaseballActionOutcome.PinchHittingSubstitution.ordinal()] = 157;
        } catch (NoSuchFieldError unused181) {
        }
        try {
            iArr2[BaseballActionOutcome.PinchRunningSubstitution.ordinal()] = 158;
        } catch (NoSuchFieldError unused182) {
        }
        try {
            iArr2[BaseballActionOutcome.DefensiveSubstitution.ordinal()] = 159;
        } catch (NoSuchFieldError unused183) {
        }
        try {
            iArr2[BaseballActionOutcome.DefensiveSwitch.ordinal()] = 160;
        } catch (NoSuchFieldError unused184) {
        }
        b = iArr2;
        int[] iArr3 = new int[BaseballActionOutcomeCategory.values().length];
        try {
            iArr3[BaseballActionOutcomeCategory.Strikes.ordinal()] = 1;
        } catch (NoSuchFieldError unused185) {
        }
        try {
            iArr3[BaseballActionOutcomeCategory.Outs.ordinal()] = 2;
        } catch (NoSuchFieldError unused186) {
        }
        try {
            iArr3[BaseballActionOutcomeCategory.Balls.ordinal()] = 3;
        } catch (NoSuchFieldError unused187) {
        }
        try {
            iArr3[BaseballActionOutcomeCategory.Advances.ordinal()] = 4;
        } catch (NoSuchFieldError unused188) {
        }
        try {
            iArr3[BaseballActionOutcomeCategory.Other.ordinal()] = 5;
        } catch (NoSuchFieldError unused189) {
        }
        c = iArr3;
    }
}
