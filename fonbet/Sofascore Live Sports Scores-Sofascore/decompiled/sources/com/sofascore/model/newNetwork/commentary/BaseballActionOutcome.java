package com.sofascore.model.newNetwork.commentary;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0003\b¨\u0001\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001¨\u0006\u00ad\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;", "", "category", "Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcomeCategory;", "stringFormatNumber", "", "<init>", "(Ljava/lang/String;ILcom/sofascore/model/newNetwork/commentary/BaseballActionOutcomeCategory;Ljava/lang/Integer;)V", "getCategory", "()Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcomeCategory;", "getStringFormatNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "EnforcedStrike", "StrikeAutomaticPitchTimerViolation", "StrikeAutomaticBatterTimeoutViolation", "StrikeLooking", "StrikeSwinging", "FoulBall", "FoulTip", "RulingPendingAtBatContinues", "RulingPendingAtBatOver", "HitterInterference", "DoubleTaggedOut2nd", "DoubleOut3rd", "DoubleOutHome", "FieldersChoice", "FieldersChoiceOut2nd", "FieldersChoiceOut3rd", "FieldersChoiceOutHome", "FlyOut", "GroundOut", "StrikeLookingOut1st", "StrikeLookingOut2nd", "StrikeLookingOut3rd", "StrikeLookingOutHome", "StrikeSwingingOut1st", "StrikeSwingingOut2nd", "StrikeSwingingOut3rd", "StrikeSwingingOutHome", "ReachedOnErrorOut2nd", "ReachedOnErrorOut3rd", "ReachedOnErrorOutHome", "SingleTaggedOut1st", "SingleOut2nd", "SingleOut3rd", "SingleOutHome", "TripleTaggedOut3rd", "TripleOutHome", "LineOut", "OutOfBattersBox", "OutOnAppealAtBat", "PopOut", "SacrificeBunt", "SacrificeBuntOut2nd", "SacrificeBuntOut3rd", "SacrificeBuntOutHome", "SacrificeFly", "SacrificeFlyOut2nd", "SacrificeFlyOut3rd", "SacrificeFlyOutHome", "EnforcedBall", "BallAutomaticPitchTimerViolationPitcher", "BallAutomaticPitchTimerViolationCatcher", "BallAutomaticShiftViolation", "Ball", "DirtBall", "IntentionalBall", "Pitchout", "Balk", "CatcherInterference", "Double", "DoubleAdv3rd", "DoubleAdvHome", "FieldersChoiceAdv2nd", "FieldersChoiceAdv3rd", "FieldersChoiceAdvHome", "HitByPitch", "Homerun", "IntentionalWalk", "Walk", "StrikeLookingAdv1st", "StrikeLookingAdv2nd", "StrikeLookingAdv3rd", "StrikeLookingAdvHome", "StrikeSwingingAdv1st", "StrikeSwingingAdv2nd", "StrikeSwingingAdv3rd", "StrikeSwingingAdvHome", "ReachedOnError", "ReachedOnErrorAdv2nd", "ReachedOnErrorAdv3rd", "ReachedOnErrorAdvHome", "ReachedOnViolation", "Single", "SingleAdv2nd", "SingleAdv3rd", "SingleAdvHome", "SacrificeBuntAdv1st", "SacrificeBuntAdv2nd", "SacrificeBuntAdv3rd", "SacrificeBuntAdvHome", "SacrificeFlyAdv1st", "SacrificeFlyAdv2nd", "SacrificeFlyAdv3rd", "SacrificeFlyAdvHome", "Triple", "TripleAdvHome", "CaughtStealing2nd", "CaughtStealing3rd", "CaughtStealingHome", "PickoffCaughtStealing2nd", "PickoffCaughtStealing3rd", "PickoffCaughtStealingHome", "TagOut1st", "TagOut2nd", "TagOut3rd", "TagOutHome", "ForceOut1st", "ForceOut2nd", "ForceOut3rd", "ForceOutHome", "DoubledOff1st", "DoubledOff2nd", "DoubledOff3rd", "Stole2ndOut2nd", "Stole2ndOut3rd", "Stole2ndOutHome", "Stole3rdOut3rd", "Stole3rdOutHome", "RunnerInterference", "OutOnAppealSteal", "OutOfBasePath", "HitByBattedBall", "Stole2nd", "Stole3rd", "StoleHome", "StoleHomeUnearnedRun", "Advance1st", "Advance2nd", "Advance3rd", "Indifference2nd", "Indifference3rd", "CaughtStealing2ndAdvanced3rd", "CaughtStealing2ndAdvancedHome", "CaughtStealing2ndAdvancedHomeUnearnedRun", "CaughtStealing3rdAdvancedHome", "CaughtStealing3rdAdvancedHomeUnearnedRun", "Stole2ndError2nd", "Stole2ndError3rd", "Stole2ndErrorHome", "Stole3rdErrorHome", "Stole2ndErrorHomeEarned", "Stole3rdErrorHomeEarned", "Steal2ndAdvanced3rd", "Steal2ndAdvancedHome", "Steal2ndAdvancedHomeUnearnedRun", "Steal3rdAdvancedHome", "Steal3rdAdvancedHomeUnearnedRun", "Checked", "Pickoff", "CatcherPickoff", "EarnedRunRbi", "EarnedRunNoRbi", "PlayerEarnedRunTeamUnearnedRbi", "PlayerEarnedRunTeamUnearnedNoRbi", "UnearnedRunRbi", "UnearnedRunNoRbi", "PitchingSubstitution", "PinchHittingSubstitution", "PinchRunningSubstitution", "DefensiveSubstitution", "DefensiveSwitch", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BaseballActionOutcome {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BaseballActionOutcome[] $VALUES;

    @q5h("AD1")
    public static final BaseballActionOutcome Advance1st;

    @q5h("AD2")
    public static final BaseballActionOutcome Advance2nd;

    @q5h("AD3")
    public static final BaseballActionOutcome Advance3rd;

    @q5h("aBK")
    public static final BaseballActionOutcome Balk;

    @q5h("bB")
    public static final BaseballActionOutcome Ball;

    @q5h("bABC")
    public static final BaseballActionOutcome BallAutomaticPitchTimerViolationCatcher;

    @q5h("bABP")
    public static final BaseballActionOutcome BallAutomaticPitchTimerViolationPitcher;

    @q5h("bABS")
    public static final BaseballActionOutcome BallAutomaticShiftViolation;

    @q5h("aCI")
    public static final BaseballActionOutcome CatcherInterference;

    @q5h("POCSC")
    public static final BaseballActionOutcome CatcherPickoff;

    @q5h("CS2")
    public static final BaseballActionOutcome CaughtStealing2nd;

    @q5h("CS2AD3")
    public static final BaseballActionOutcome CaughtStealing2ndAdvanced3rd;

    @q5h("CS2AD4")
    public static final BaseballActionOutcome CaughtStealing2ndAdvancedHome;

    @q5h("CS2AD4u")
    public static final BaseballActionOutcome CaughtStealing2ndAdvancedHomeUnearnedRun;

    @q5h("CS3")
    public static final BaseballActionOutcome CaughtStealing3rd;

    @q5h("CS3AD4")
    public static final BaseballActionOutcome CaughtStealing3rdAdvancedHome;

    @q5h("CS3AD4u")
    public static final BaseballActionOutcome CaughtStealing3rdAdvancedHomeUnearnedRun;

    @q5h("CS4")
    public static final BaseballActionOutcome CaughtStealingHome;

    @q5h("CK")
    public static final BaseballActionOutcome Checked;

    @q5h("DEFENSIVE_SUBSTITUTION")
    public static final BaseballActionOutcome DefensiveSubstitution;

    @q5h("DEFENSIVE_SWITCH")
    public static final BaseballActionOutcome DefensiveSwitch;

    @q5h("bDB")
    public static final BaseballActionOutcome DirtBall;

    @q5h("aD")
    public static final BaseballActionOutcome Double;

    @q5h("aDAD3")
    public static final BaseballActionOutcome DoubleAdv3rd;

    @q5h("aDAD4")
    public static final BaseballActionOutcome DoubleAdvHome;

    @q5h("oDT3")
    public static final BaseballActionOutcome DoubleOut3rd;

    @q5h("oDT4")
    public static final BaseballActionOutcome DoubleOutHome;

    @q5h("oDT2")
    public static final BaseballActionOutcome DoubleTaggedOut2nd;

    @q5h("DO1")
    public static final BaseballActionOutcome DoubledOff1st;

    @q5h("DO2")
    public static final BaseballActionOutcome DoubledOff2nd;

    @q5h("DO3")
    public static final BaseballActionOutcome DoubledOff3rd;

    @q5h("eRN")
    public static final BaseballActionOutcome EarnedRunNoRbi;

    @q5h("ERN")
    public static final BaseballActionOutcome EarnedRunRbi;

    @q5h("bAB")
    public static final BaseballActionOutcome EnforcedBall;

    @q5h("kAK")
    public static final BaseballActionOutcome EnforcedStrike;

    @q5h("oFC")
    public static final BaseballActionOutcome FieldersChoice;

    @q5h("aFCAD2")
    public static final BaseballActionOutcome FieldersChoiceAdv2nd;

    @q5h("aFCAD3")
    public static final BaseballActionOutcome FieldersChoiceAdv3rd;

    @q5h("aFCAD4")
    public static final BaseballActionOutcome FieldersChoiceAdvHome;

    @q5h("oFCT2")
    public static final BaseballActionOutcome FieldersChoiceOut2nd;

    @q5h("oFCT3")
    public static final BaseballActionOutcome FieldersChoiceOut3rd;

    @q5h("oFCT4")
    public static final BaseballActionOutcome FieldersChoiceOutHome;

    @q5h("oFO")
    public static final BaseballActionOutcome FlyOut;

    @q5h("FO1")
    public static final BaseballActionOutcome ForceOut1st;

    @q5h("FO2")
    public static final BaseballActionOutcome ForceOut2nd;

    @q5h("FO3")
    public static final BaseballActionOutcome ForceOut3rd;

    @q5h("FO4")
    public static final BaseballActionOutcome ForceOutHome;

    @q5h("kF")
    public static final BaseballActionOutcome FoulBall;

    @q5h("kFT")
    public static final BaseballActionOutcome FoulTip;

    @q5h("oGO")
    public static final BaseballActionOutcome GroundOut;

    @q5h("HBB")
    public static final BaseballActionOutcome HitByBattedBall;

    @q5h("aHBP")
    public static final BaseballActionOutcome HitByPitch;

    @q5h("oBI")
    public static final BaseballActionOutcome HitterInterference;

    @q5h("aHR")
    public static final BaseballActionOutcome Homerun;

    @q5h("DI2")
    public static final BaseballActionOutcome Indifference2nd;

    @q5h("DI3")
    public static final BaseballActionOutcome Indifference3rd;

    @q5h("bIB")
    public static final BaseballActionOutcome IntentionalBall;

    @q5h("aIBB")
    public static final BaseballActionOutcome IntentionalWalk;

    @q5h("oLO")
    public static final BaseballActionOutcome LineOut;

    @q5h("OBP")
    public static final BaseballActionOutcome OutOfBasePath;

    @q5h("oOBB")
    public static final BaseballActionOutcome OutOfBattersBox;

    @q5h("oOP")
    public static final BaseballActionOutcome OutOnAppealAtBat;

    @q5h("OOA")
    public static final BaseballActionOutcome OutOnAppealSteal;

    @q5h("PO")
    public static final BaseballActionOutcome Pickoff;

    @q5h("POCS2")
    public static final BaseballActionOutcome PickoffCaughtStealing2nd;

    @q5h("POCS3")
    public static final BaseballActionOutcome PickoffCaughtStealing3rd;

    @q5h("POCS4")
    public static final BaseballActionOutcome PickoffCaughtStealingHome;

    @q5h("PINCH_HITTING_SUBSTITUTION")
    public static final BaseballActionOutcome PinchHittingSubstitution;

    @q5h("PINCH_RUNNING_SUBSTITUTION")
    public static final BaseballActionOutcome PinchRunningSubstitution;

    @q5h("PITCHER_SUBSTITUTION")
    public static final BaseballActionOutcome PitchingSubstitution;

    @q5h("bPO")
    public static final BaseballActionOutcome Pitchout;

    @q5h("eRNu")
    public static final BaseballActionOutcome PlayerEarnedRunTeamUnearnedNoRbi;

    @q5h("ERNu")
    public static final BaseballActionOutcome PlayerEarnedRunTeamUnearnedRbi;

    @q5h("oPO")
    public static final BaseballActionOutcome PopOut;

    @q5h("aROE")
    public static final BaseballActionOutcome ReachedOnError;

    @q5h("aROEAD2")
    public static final BaseballActionOutcome ReachedOnErrorAdv2nd;

    @q5h("aROEAD3")
    public static final BaseballActionOutcome ReachedOnErrorAdv3rd;

    @q5h("aROEAD4")
    public static final BaseballActionOutcome ReachedOnErrorAdvHome;

    @q5h("oROET2")
    public static final BaseballActionOutcome ReachedOnErrorOut2nd;

    @q5h("oROET3")
    public static final BaseballActionOutcome ReachedOnErrorOut3rd;

    @q5h("oROET4")
    public static final BaseballActionOutcome ReachedOnErrorOutHome;

    @q5h("aROV")
    public static final BaseballActionOutcome ReachedOnViolation;

    @q5h("rPABC")
    public static final BaseballActionOutcome RulingPendingAtBatContinues;

    @q5h("rPABO")
    public static final BaseballActionOutcome RulingPendingAtBatOver;

    @q5h("RI")
    public static final BaseballActionOutcome RunnerInterference;

    @q5h("oSB")
    public static final BaseballActionOutcome SacrificeBunt;

    @q5h("aSBAD1")
    public static final BaseballActionOutcome SacrificeBuntAdv1st;

    @q5h("aSBAD2")
    public static final BaseballActionOutcome SacrificeBuntAdv2nd;

    @q5h("aSBAD3")
    public static final BaseballActionOutcome SacrificeBuntAdv3rd;

    @q5h("aSBAD4")
    public static final BaseballActionOutcome SacrificeBuntAdvHome;

    @q5h("oSBT2")
    public static final BaseballActionOutcome SacrificeBuntOut2nd;

    @q5h("oSBT3")
    public static final BaseballActionOutcome SacrificeBuntOut3rd;

    @q5h("oSBT4")
    public static final BaseballActionOutcome SacrificeBuntOutHome;

    @q5h("oSF")
    public static final BaseballActionOutcome SacrificeFly;

    @q5h("aSFAD1")
    public static final BaseballActionOutcome SacrificeFlyAdv1st;

    @q5h("aSFAD2")
    public static final BaseballActionOutcome SacrificeFlyAdv2nd;

    @q5h("aSFAD3")
    public static final BaseballActionOutcome SacrificeFlyAdv3rd;

    @q5h("aSFAD4")
    public static final BaseballActionOutcome SacrificeFlyAdvHome;

    @q5h("oSFT2")
    public static final BaseballActionOutcome SacrificeFlyOut2nd;

    @q5h("oSFT3")
    public static final BaseballActionOutcome SacrificeFlyOut3rd;

    @q5h("oSFT4")
    public static final BaseballActionOutcome SacrificeFlyOutHome;

    @q5h("aS")
    public static final BaseballActionOutcome Single;

    @q5h("aSAD2")
    public static final BaseballActionOutcome SingleAdv2nd;

    @q5h("aSAD3")
    public static final BaseballActionOutcome SingleAdv3rd;

    @q5h("aSAD4")
    public static final BaseballActionOutcome SingleAdvHome;

    @q5h("oST2")
    public static final BaseballActionOutcome SingleOut2nd;

    @q5h("oST3")
    public static final BaseballActionOutcome SingleOut3rd;

    @q5h("oST4")
    public static final BaseballActionOutcome SingleOutHome;

    @q5h("oST1")
    public static final BaseballActionOutcome SingleTaggedOut1st;

    @q5h("SB2AD3")
    public static final BaseballActionOutcome Steal2ndAdvanced3rd;

    @q5h("SB2AD4")
    public static final BaseballActionOutcome Steal2ndAdvancedHome;

    @q5h("SB2AD4u")
    public static final BaseballActionOutcome Steal2ndAdvancedHomeUnearnedRun;

    @q5h("SB3AD4")
    public static final BaseballActionOutcome Steal3rdAdvancedHome;

    @q5h("SB3AD4u")
    public static final BaseballActionOutcome Steal3rdAdvancedHomeUnearnedRun;

    @q5h("SB2")
    public static final BaseballActionOutcome Stole2nd;

    @q5h("SB2E2")
    public static final BaseballActionOutcome Stole2ndError2nd;

    @q5h("SB2E3")
    public static final BaseballActionOutcome Stole2ndError3rd;

    @q5h("SB2E4")
    public static final BaseballActionOutcome Stole2ndErrorHome;

    @q5h("SB2E4E")
    public static final BaseballActionOutcome Stole2ndErrorHomeEarned;

    @q5h("SB2O2")
    public static final BaseballActionOutcome Stole2ndOut2nd;

    @q5h("SB2O3")
    public static final BaseballActionOutcome Stole2ndOut3rd;

    @q5h("SB2O4")
    public static final BaseballActionOutcome Stole2ndOutHome;

    @q5h("SB3")
    public static final BaseballActionOutcome Stole3rd;

    @q5h("SB3E4")
    public static final BaseballActionOutcome Stole3rdErrorHome;

    @q5h("SB3E4E")
    public static final BaseballActionOutcome Stole3rdErrorHomeEarned;

    @q5h("SB3O3")
    public static final BaseballActionOutcome Stole3rdOut3rd;

    @q5h("SB3O4")
    public static final BaseballActionOutcome Stole3rdOutHome;

    @q5h("SB4")
    public static final BaseballActionOutcome StoleHome;

    @q5h("SB4u")
    public static final BaseballActionOutcome StoleHomeUnearnedRun;

    @q5h("kAKB")
    public static final BaseballActionOutcome StrikeAutomaticBatterTimeoutViolation;

    @q5h("kAKP")
    public static final BaseballActionOutcome StrikeAutomaticPitchTimerViolation;

    @q5h("kKL")
    public static final BaseballActionOutcome StrikeLooking;

    @q5h("aKLAD1")
    public static final BaseballActionOutcome StrikeLookingAdv1st;

    @q5h("aKLAD2")
    public static final BaseballActionOutcome StrikeLookingAdv2nd;

    @q5h("aKLAD3")
    public static final BaseballActionOutcome StrikeLookingAdv3rd;

    @q5h("aKLAD4")
    public static final BaseballActionOutcome StrikeLookingAdvHome;

    @q5h("oKLT1")
    public static final BaseballActionOutcome StrikeLookingOut1st;

    @q5h("oKLT2")
    public static final BaseballActionOutcome StrikeLookingOut2nd;

    @q5h("oKLT3")
    public static final BaseballActionOutcome StrikeLookingOut3rd;

    @q5h("oKLT4")
    public static final BaseballActionOutcome StrikeLookingOutHome;

    @q5h("kKS")
    public static final BaseballActionOutcome StrikeSwinging;

    @q5h("aKSAD1")
    public static final BaseballActionOutcome StrikeSwingingAdv1st;

    @q5h("aKSAD2")
    public static final BaseballActionOutcome StrikeSwingingAdv2nd;

    @q5h("aKSAD3")
    public static final BaseballActionOutcome StrikeSwingingAdv3rd;

    @q5h("aKSAD4")
    public static final BaseballActionOutcome StrikeSwingingAdvHome;

    @q5h("oKST1")
    public static final BaseballActionOutcome StrikeSwingingOut1st;

    @q5h("oKST2")
    public static final BaseballActionOutcome StrikeSwingingOut2nd;

    @q5h("oKST3")
    public static final BaseballActionOutcome StrikeSwingingOut3rd;

    @q5h("oKST4")
    public static final BaseballActionOutcome StrikeSwingingOutHome;

    @q5h("TO")
    public static final BaseballActionOutcome TagOut1st;

    @q5h("TO2")
    public static final BaseballActionOutcome TagOut2nd;

    @q5h("TO3")
    public static final BaseballActionOutcome TagOut3rd;

    @q5h("TO4")
    public static final BaseballActionOutcome TagOutHome;

    @q5h("aT")
    public static final BaseballActionOutcome Triple;

    @q5h("aTAD4")
    public static final BaseballActionOutcome TripleAdvHome;

    @q5h("oTT4")
    public static final BaseballActionOutcome TripleOutHome;

    @q5h("oTT3")
    public static final BaseballActionOutcome TripleTaggedOut3rd;

    @q5h("uRN")
    public static final BaseballActionOutcome UnearnedRunNoRbi;

    @q5h("URN")
    public static final BaseballActionOutcome UnearnedRunRbi;

    @q5h("BB")
    public static final BaseballActionOutcome Walk;

    @NotNull
    private final BaseballActionOutcomeCategory category;

    @Nullable
    private final Integer stringFormatNumber;

    private static final /* synthetic */ BaseballActionOutcome[] $values() {
        return new BaseballActionOutcome[]{EnforcedStrike, StrikeAutomaticPitchTimerViolation, StrikeAutomaticBatterTimeoutViolation, StrikeLooking, StrikeSwinging, FoulBall, FoulTip, RulingPendingAtBatContinues, RulingPendingAtBatOver, HitterInterference, DoubleTaggedOut2nd, DoubleOut3rd, DoubleOutHome, FieldersChoice, FieldersChoiceOut2nd, FieldersChoiceOut3rd, FieldersChoiceOutHome, FlyOut, GroundOut, StrikeLookingOut1st, StrikeLookingOut2nd, StrikeLookingOut3rd, StrikeLookingOutHome, StrikeSwingingOut1st, StrikeSwingingOut2nd, StrikeSwingingOut3rd, StrikeSwingingOutHome, ReachedOnErrorOut2nd, ReachedOnErrorOut3rd, ReachedOnErrorOutHome, SingleTaggedOut1st, SingleOut2nd, SingleOut3rd, SingleOutHome, TripleTaggedOut3rd, TripleOutHome, LineOut, OutOfBattersBox, OutOnAppealAtBat, PopOut, SacrificeBunt, SacrificeBuntOut2nd, SacrificeBuntOut3rd, SacrificeBuntOutHome, SacrificeFly, SacrificeFlyOut2nd, SacrificeFlyOut3rd, SacrificeFlyOutHome, EnforcedBall, BallAutomaticPitchTimerViolationPitcher, BallAutomaticPitchTimerViolationCatcher, BallAutomaticShiftViolation, Ball, DirtBall, IntentionalBall, Pitchout, Balk, CatcherInterference, Double, DoubleAdv3rd, DoubleAdvHome, FieldersChoiceAdv2nd, FieldersChoiceAdv3rd, FieldersChoiceAdvHome, HitByPitch, Homerun, IntentionalWalk, Walk, StrikeLookingAdv1st, StrikeLookingAdv2nd, StrikeLookingAdv3rd, StrikeLookingAdvHome, StrikeSwingingAdv1st, StrikeSwingingAdv2nd, StrikeSwingingAdv3rd, StrikeSwingingAdvHome, ReachedOnError, ReachedOnErrorAdv2nd, ReachedOnErrorAdv3rd, ReachedOnErrorAdvHome, ReachedOnViolation, Single, SingleAdv2nd, SingleAdv3rd, SingleAdvHome, SacrificeBuntAdv1st, SacrificeBuntAdv2nd, SacrificeBuntAdv3rd, SacrificeBuntAdvHome, SacrificeFlyAdv1st, SacrificeFlyAdv2nd, SacrificeFlyAdv3rd, SacrificeFlyAdvHome, Triple, TripleAdvHome, CaughtStealing2nd, CaughtStealing3rd, CaughtStealingHome, PickoffCaughtStealing2nd, PickoffCaughtStealing3rd, PickoffCaughtStealingHome, TagOut1st, TagOut2nd, TagOut3rd, TagOutHome, ForceOut1st, ForceOut2nd, ForceOut3rd, ForceOutHome, DoubledOff1st, DoubledOff2nd, DoubledOff3rd, Stole2ndOut2nd, Stole2ndOut3rd, Stole2ndOutHome, Stole3rdOut3rd, Stole3rdOutHome, RunnerInterference, OutOnAppealSteal, OutOfBasePath, HitByBattedBall, Stole2nd, Stole3rd, StoleHome, StoleHomeUnearnedRun, Advance1st, Advance2nd, Advance3rd, Indifference2nd, Indifference3rd, CaughtStealing2ndAdvanced3rd, CaughtStealing2ndAdvancedHome, CaughtStealing2ndAdvancedHomeUnearnedRun, CaughtStealing3rdAdvancedHome, CaughtStealing3rdAdvancedHomeUnearnedRun, Stole2ndError2nd, Stole2ndError3rd, Stole2ndErrorHome, Stole3rdErrorHome, Stole2ndErrorHomeEarned, Stole3rdErrorHomeEarned, Steal2ndAdvanced3rd, Steal2ndAdvancedHome, Steal2ndAdvancedHomeUnearnedRun, Steal3rdAdvancedHome, Steal3rdAdvancedHomeUnearnedRun, Checked, Pickoff, CatcherPickoff, EarnedRunRbi, EarnedRunNoRbi, PlayerEarnedRunTeamUnearnedRbi, PlayerEarnedRunTeamUnearnedNoRbi, UnearnedRunRbi, UnearnedRunNoRbi, PitchingSubstitution, PinchHittingSubstitution, PinchRunningSubstitution, DefensiveSubstitution, DefensiveSwitch};
    }

    static {
        BaseballActionOutcomeCategory baseballActionOutcomeCategory = BaseballActionOutcomeCategory.Strikes;
        EnforcedStrike = new BaseballActionOutcome("EnforcedStrike", 0, baseballActionOutcomeCategory, null, 2, null);
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Integer num = null;
        StrikeAutomaticPitchTimerViolation = new BaseballActionOutcome("StrikeAutomaticPitchTimerViolation", 1, baseballActionOutcomeCategory, num, i, defaultConstructorMarker);
        StrikeAutomaticBatterTimeoutViolation = new BaseballActionOutcome("StrikeAutomaticBatterTimeoutViolation", 2, baseballActionOutcomeCategory, num, i, defaultConstructorMarker);
        StrikeLooking = new BaseballActionOutcome("StrikeLooking", 3, baseballActionOutcomeCategory, num, i, defaultConstructorMarker);
        StrikeSwinging = new BaseballActionOutcome("StrikeSwinging", 4, baseballActionOutcomeCategory, num, i, defaultConstructorMarker);
        FoulBall = new BaseballActionOutcome("FoulBall", 5, baseballActionOutcomeCategory, num, i, defaultConstructorMarker);
        FoulTip = new BaseballActionOutcome("FoulTip", 6, baseballActionOutcomeCategory, num, i, defaultConstructorMarker);
        RulingPendingAtBatContinues = new BaseballActionOutcome("RulingPendingAtBatContinues", 7, baseballActionOutcomeCategory, num, i, defaultConstructorMarker);
        RulingPendingAtBatOver = new BaseballActionOutcome("RulingPendingAtBatOver", 8, baseballActionOutcomeCategory, num, i, defaultConstructorMarker);
        BaseballActionOutcomeCategory baseballActionOutcomeCategory2 = BaseballActionOutcomeCategory.Outs;
        HitterInterference = new BaseballActionOutcome("HitterInterference", 9, baseballActionOutcomeCategory2, null, 2, null);
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        Integer num2 = null;
        DoubleTaggedOut2nd = new BaseballActionOutcome("DoubleTaggedOut2nd", 10, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        DoubleOut3rd = new BaseballActionOutcome("DoubleOut3rd", 11, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        DoubleOutHome = new BaseballActionOutcome("DoubleOutHome", 12, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        FieldersChoice = new BaseballActionOutcome("FieldersChoice", 13, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        FieldersChoiceOut2nd = new BaseballActionOutcome("FieldersChoiceOut2nd", 14, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        FieldersChoiceOut3rd = new BaseballActionOutcome("FieldersChoiceOut3rd", 15, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        FieldersChoiceOutHome = new BaseballActionOutcome("FieldersChoiceOutHome", 16, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        FlyOut = new BaseballActionOutcome("FlyOut", 17, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        GroundOut = new BaseballActionOutcome("GroundOut", 18, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        StrikeLookingOut1st = new BaseballActionOutcome("StrikeLookingOut1st", 19, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        StrikeLookingOut2nd = new BaseballActionOutcome("StrikeLookingOut2nd", 20, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        StrikeLookingOut3rd = new BaseballActionOutcome("StrikeLookingOut3rd", 21, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        StrikeLookingOutHome = new BaseballActionOutcome("StrikeLookingOutHome", 22, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        StrikeSwingingOut1st = new BaseballActionOutcome("StrikeSwingingOut1st", 23, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        StrikeSwingingOut2nd = new BaseballActionOutcome("StrikeSwingingOut2nd", 24, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        StrikeSwingingOut3rd = new BaseballActionOutcome("StrikeSwingingOut3rd", 25, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        StrikeSwingingOutHome = new BaseballActionOutcome("StrikeSwingingOutHome", 26, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        ReachedOnErrorOut2nd = new BaseballActionOutcome("ReachedOnErrorOut2nd", 27, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        ReachedOnErrorOut3rd = new BaseballActionOutcome("ReachedOnErrorOut3rd", 28, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        ReachedOnErrorOutHome = new BaseballActionOutcome("ReachedOnErrorOutHome", 29, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        SingleTaggedOut1st = new BaseballActionOutcome("SingleTaggedOut1st", 30, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        SingleOut2nd = new BaseballActionOutcome("SingleOut2nd", 31, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        SingleOut3rd = new BaseballActionOutcome("SingleOut3rd", 32, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        SingleOutHome = new BaseballActionOutcome("SingleOutHome", 33, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        TripleTaggedOut3rd = new BaseballActionOutcome("TripleTaggedOut3rd", 34, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        TripleOutHome = new BaseballActionOutcome("TripleOutHome", 35, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        LineOut = new BaseballActionOutcome("LineOut", 36, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        OutOfBattersBox = new BaseballActionOutcome("OutOfBattersBox", 37, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        OutOnAppealAtBat = new BaseballActionOutcome("OutOnAppealAtBat", 38, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        PopOut = new BaseballActionOutcome("PopOut", 39, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        SacrificeBunt = new BaseballActionOutcome("SacrificeBunt", 40, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        SacrificeBuntOut2nd = new BaseballActionOutcome("SacrificeBuntOut2nd", 41, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        SacrificeBuntOut3rd = new BaseballActionOutcome("SacrificeBuntOut3rd", 42, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        SacrificeBuntOutHome = new BaseballActionOutcome("SacrificeBuntOutHome", 43, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        SacrificeFly = new BaseballActionOutcome("SacrificeFly", 44, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        SacrificeFlyOut2nd = new BaseballActionOutcome("SacrificeFlyOut2nd", 45, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        SacrificeFlyOut3rd = new BaseballActionOutcome("SacrificeFlyOut3rd", 46, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        SacrificeFlyOutHome = new BaseballActionOutcome("SacrificeFlyOutHome", 47, baseballActionOutcomeCategory2, num2, i2, defaultConstructorMarker2);
        BaseballActionOutcomeCategory baseballActionOutcomeCategory3 = BaseballActionOutcomeCategory.Balls;
        EnforcedBall = new BaseballActionOutcome("EnforcedBall", 48, baseballActionOutcomeCategory3, null, 2, null);
        int i3 = 2;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        Integer num3 = null;
        BallAutomaticPitchTimerViolationPitcher = new BaseballActionOutcome("BallAutomaticPitchTimerViolationPitcher", 49, baseballActionOutcomeCategory3, num3, i3, defaultConstructorMarker3);
        BallAutomaticPitchTimerViolationCatcher = new BaseballActionOutcome("BallAutomaticPitchTimerViolationCatcher", 50, baseballActionOutcomeCategory3, num3, i3, defaultConstructorMarker3);
        BallAutomaticShiftViolation = new BaseballActionOutcome("BallAutomaticShiftViolation", 51, baseballActionOutcomeCategory3, num3, i3, defaultConstructorMarker3);
        Ball = new BaseballActionOutcome("Ball", 52, baseballActionOutcomeCategory3, num3, i3, defaultConstructorMarker3);
        DirtBall = new BaseballActionOutcome("DirtBall", 53, baseballActionOutcomeCategory3, num3, i3, defaultConstructorMarker3);
        IntentionalBall = new BaseballActionOutcome("IntentionalBall", 54, baseballActionOutcomeCategory3, num3, i3, defaultConstructorMarker3);
        Pitchout = new BaseballActionOutcome("Pitchout", 55, baseballActionOutcomeCategory3, num3, i3, defaultConstructorMarker3);
        BaseballActionOutcomeCategory baseballActionOutcomeCategory4 = BaseballActionOutcomeCategory.Advances;
        Balk = new BaseballActionOutcome("Balk", 56, baseballActionOutcomeCategory4, null, 2, null);
        int i4 = 2;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        Integer num4 = null;
        CatcherInterference = new BaseballActionOutcome("CatcherInterference", 57, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        Double = new BaseballActionOutcome("Double", 58, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        DoubleAdv3rd = new BaseballActionOutcome("DoubleAdv3rd", 59, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        DoubleAdvHome = new BaseballActionOutcome("DoubleAdvHome", 60, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        FieldersChoiceAdv2nd = new BaseballActionOutcome("FieldersChoiceAdv2nd", 61, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        FieldersChoiceAdv3rd = new BaseballActionOutcome("FieldersChoiceAdv3rd", 62, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        FieldersChoiceAdvHome = new BaseballActionOutcome("FieldersChoiceAdvHome", 63, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        HitByPitch = new BaseballActionOutcome("HitByPitch", 64, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        Homerun = new BaseballActionOutcome("Homerun", 65, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        IntentionalWalk = new BaseballActionOutcome("IntentionalWalk", 66, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        Walk = new BaseballActionOutcome("Walk", 67, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        StrikeLookingAdv1st = new BaseballActionOutcome("StrikeLookingAdv1st", 68, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        StrikeLookingAdv2nd = new BaseballActionOutcome("StrikeLookingAdv2nd", 69, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        StrikeLookingAdv3rd = new BaseballActionOutcome("StrikeLookingAdv3rd", 70, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        StrikeLookingAdvHome = new BaseballActionOutcome("StrikeLookingAdvHome", 71, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        StrikeSwingingAdv1st = new BaseballActionOutcome("StrikeSwingingAdv1st", 72, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        StrikeSwingingAdv2nd = new BaseballActionOutcome("StrikeSwingingAdv2nd", 73, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        StrikeSwingingAdv3rd = new BaseballActionOutcome("StrikeSwingingAdv3rd", 74, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        StrikeSwingingAdvHome = new BaseballActionOutcome("StrikeSwingingAdvHome", 75, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        ReachedOnError = new BaseballActionOutcome("ReachedOnError", 76, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        ReachedOnErrorAdv2nd = new BaseballActionOutcome("ReachedOnErrorAdv2nd", 77, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        ReachedOnErrorAdv3rd = new BaseballActionOutcome("ReachedOnErrorAdv3rd", 78, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        ReachedOnErrorAdvHome = new BaseballActionOutcome("ReachedOnErrorAdvHome", 79, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        ReachedOnViolation = new BaseballActionOutcome("ReachedOnViolation", 80, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        Single = new BaseballActionOutcome("Single", 81, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        SingleAdv2nd = new BaseballActionOutcome("SingleAdv2nd", 82, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        SingleAdv3rd = new BaseballActionOutcome("SingleAdv3rd", 83, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        SingleAdvHome = new BaseballActionOutcome("SingleAdvHome", 84, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        SacrificeBuntAdv1st = new BaseballActionOutcome("SacrificeBuntAdv1st", 85, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        SacrificeBuntAdv2nd = new BaseballActionOutcome("SacrificeBuntAdv2nd", 86, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        SacrificeBuntAdv3rd = new BaseballActionOutcome("SacrificeBuntAdv3rd", 87, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        SacrificeBuntAdvHome = new BaseballActionOutcome("SacrificeBuntAdvHome", 88, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        SacrificeFlyAdv1st = new BaseballActionOutcome("SacrificeFlyAdv1st", 89, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        SacrificeFlyAdv2nd = new BaseballActionOutcome("SacrificeFlyAdv2nd", 90, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        SacrificeFlyAdv3rd = new BaseballActionOutcome("SacrificeFlyAdv3rd", 91, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        SacrificeFlyAdvHome = new BaseballActionOutcome("SacrificeFlyAdvHome", 92, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        Triple = new BaseballActionOutcome("Triple", 93, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        TripleAdvHome = new BaseballActionOutcome("TripleAdvHome", 94, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        int i5 = 2;
        DefaultConstructorMarker defaultConstructorMarker5 = null;
        Integer num5 = null;
        CaughtStealing2nd = new BaseballActionOutcome("CaughtStealing2nd", 95, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        CaughtStealing3rd = new BaseballActionOutcome("CaughtStealing3rd", 96, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        CaughtStealingHome = new BaseballActionOutcome("CaughtStealingHome", 97, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        PickoffCaughtStealing2nd = new BaseballActionOutcome("PickoffCaughtStealing2nd", 98, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        PickoffCaughtStealing3rd = new BaseballActionOutcome("PickoffCaughtStealing3rd", 99, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        PickoffCaughtStealingHome = new BaseballActionOutcome("PickoffCaughtStealingHome", 100, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        TagOut1st = new BaseballActionOutcome("TagOut1st", 101, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        TagOut2nd = new BaseballActionOutcome("TagOut2nd", 102, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        TagOut3rd = new BaseballActionOutcome("TagOut3rd", 103, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        TagOutHome = new BaseballActionOutcome("TagOutHome", 104, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        ForceOut1st = new BaseballActionOutcome("ForceOut1st", 105, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        ForceOut2nd = new BaseballActionOutcome("ForceOut2nd", 106, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        ForceOut3rd = new BaseballActionOutcome("ForceOut3rd", 107, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        ForceOutHome = new BaseballActionOutcome("ForceOutHome", 108, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        DoubledOff1st = new BaseballActionOutcome("DoubledOff1st", 109, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        DoubledOff2nd = new BaseballActionOutcome("DoubledOff2nd", 110, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        DoubledOff3rd = new BaseballActionOutcome("DoubledOff3rd", 111, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        Stole2ndOut2nd = new BaseballActionOutcome("Stole2ndOut2nd", 112, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        Stole2ndOut3rd = new BaseballActionOutcome("Stole2ndOut3rd", 113, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        Stole2ndOutHome = new BaseballActionOutcome("Stole2ndOutHome", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        Stole3rdOut3rd = new BaseballActionOutcome("Stole3rdOut3rd", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        Stole3rdOutHome = new BaseballActionOutcome("Stole3rdOutHome", Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        RunnerInterference = new BaseballActionOutcome("RunnerInterference", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        OutOnAppealSteal = new BaseballActionOutcome("OutOnAppealSteal", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        OutOfBasePath = new BaseballActionOutcome("OutOfBasePath", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        HitByBattedBall = new BaseballActionOutcome("HitByBattedBall", 120, baseballActionOutcomeCategory2, num5, i5, defaultConstructorMarker5);
        Stole2nd = new BaseballActionOutcome("Stole2nd", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, baseballActionOutcomeCategory4, 2);
        Stole3rd = new BaseballActionOutcome("Stole3rd", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, baseballActionOutcomeCategory4, 3);
        StoleHome = new BaseballActionOutcome("StoleHome", Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        StoleHomeUnearnedRun = new BaseballActionOutcome("StoleHomeUnearnedRun", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        Advance1st = new BaseballActionOutcome("Advance1st", Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        Advance2nd = new BaseballActionOutcome("Advance2nd", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        Advance3rd = new BaseballActionOutcome("Advance3rd", Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        Indifference2nd = new BaseballActionOutcome("Indifference2nd", 128, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        Indifference3rd = new BaseballActionOutcome("Indifference3rd", 129, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        CaughtStealing2ndAdvanced3rd = new BaseballActionOutcome("CaughtStealing2ndAdvanced3rd", 130, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        CaughtStealing2ndAdvancedHome = new BaseballActionOutcome("CaughtStealing2ndAdvancedHome", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        CaughtStealing2ndAdvancedHomeUnearnedRun = new BaseballActionOutcome("CaughtStealing2ndAdvancedHomeUnearnedRun", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        CaughtStealing3rdAdvancedHome = new BaseballActionOutcome("CaughtStealing3rdAdvancedHome", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        CaughtStealing3rdAdvancedHomeUnearnedRun = new BaseballActionOutcome("CaughtStealing3rdAdvancedHomeUnearnedRun", 134, baseballActionOutcomeCategory4, num4, i4, defaultConstructorMarker4);
        Stole2ndError2nd = new BaseballActionOutcome("Stole2ndError2nd", 135, baseballActionOutcomeCategory4, 2);
        Stole2ndError3rd = new BaseballActionOutcome("Stole2ndError3rd", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, baseballActionOutcomeCategory4, 2);
        Stole2ndErrorHome = new BaseballActionOutcome("Stole2ndErrorHome", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, baseballActionOutcomeCategory4, 2);
        Stole3rdErrorHome = new BaseballActionOutcome("Stole3rdErrorHome", 138, baseballActionOutcomeCategory4, 3);
        Stole2ndErrorHomeEarned = new BaseballActionOutcome("Stole2ndErrorHomeEarned", 139, baseballActionOutcomeCategory4, 2);
        Stole3rdErrorHomeEarned = new BaseballActionOutcome("Stole3rdErrorHomeEarned", 140, baseballActionOutcomeCategory4, 3);
        Steal2ndAdvanced3rd = new BaseballActionOutcome("Steal2ndAdvanced3rd", 141, baseballActionOutcomeCategory4, 2);
        Steal2ndAdvancedHome = new BaseballActionOutcome("Steal2ndAdvancedHome", 142, baseballActionOutcomeCategory4, 2);
        Steal2ndAdvancedHomeUnearnedRun = new BaseballActionOutcome("Steal2ndAdvancedHomeUnearnedRun", 143, baseballActionOutcomeCategory4, 2);
        Steal3rdAdvancedHome = new BaseballActionOutcome("Steal3rdAdvancedHome", 144, baseballActionOutcomeCategory4, 3);
        Steal3rdAdvancedHomeUnearnedRun = new BaseballActionOutcome("Steal3rdAdvancedHomeUnearnedRun", 145, baseballActionOutcomeCategory4, 3);
        BaseballActionOutcomeCategory baseballActionOutcomeCategory5 = BaseballActionOutcomeCategory.Other;
        Checked = new BaseballActionOutcome("Checked", 146, baseballActionOutcomeCategory5, null, 2, null);
        int i6 = 2;
        DefaultConstructorMarker defaultConstructorMarker6 = null;
        Integer num6 = null;
        Pickoff = new BaseballActionOutcome("Pickoff", 147, baseballActionOutcomeCategory5, num6, i6, defaultConstructorMarker6);
        CatcherPickoff = new BaseballActionOutcome("CatcherPickoff", 148, baseballActionOutcomeCategory5, num6, i6, defaultConstructorMarker6);
        EarnedRunRbi = new BaseballActionOutcome("EarnedRunRbi", 149, baseballActionOutcomeCategory5, num6, i6, defaultConstructorMarker6);
        EarnedRunNoRbi = new BaseballActionOutcome("EarnedRunNoRbi", 150, baseballActionOutcomeCategory5, num6, i6, defaultConstructorMarker6);
        PlayerEarnedRunTeamUnearnedRbi = new BaseballActionOutcome("PlayerEarnedRunTeamUnearnedRbi", 151, baseballActionOutcomeCategory5, num6, i6, defaultConstructorMarker6);
        PlayerEarnedRunTeamUnearnedNoRbi = new BaseballActionOutcome("PlayerEarnedRunTeamUnearnedNoRbi", 152, baseballActionOutcomeCategory5, num6, i6, defaultConstructorMarker6);
        UnearnedRunRbi = new BaseballActionOutcome("UnearnedRunRbi", 153, baseballActionOutcomeCategory5, num6, i6, defaultConstructorMarker6);
        UnearnedRunNoRbi = new BaseballActionOutcome("UnearnedRunNoRbi", 154, baseballActionOutcomeCategory5, num6, i6, defaultConstructorMarker6);
        PitchingSubstitution = new BaseballActionOutcome("PitchingSubstitution", 155, baseballActionOutcomeCategory5, num6, i6, defaultConstructorMarker6);
        PinchHittingSubstitution = new BaseballActionOutcome("PinchHittingSubstitution", 156, baseballActionOutcomeCategory5, num6, i6, defaultConstructorMarker6);
        PinchRunningSubstitution = new BaseballActionOutcome("PinchRunningSubstitution", 157, baseballActionOutcomeCategory5, num6, i6, defaultConstructorMarker6);
        DefensiveSubstitution = new BaseballActionOutcome("DefensiveSubstitution", 158, baseballActionOutcomeCategory5, num6, i6, defaultConstructorMarker6);
        DefensiveSwitch = new BaseballActionOutcome("DefensiveSwitch", 159, baseballActionOutcomeCategory5, num6, i6, defaultConstructorMarker6);
        BaseballActionOutcome[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    public /* synthetic */ BaseballActionOutcome(String str, int i, BaseballActionOutcomeCategory baseballActionOutcomeCategory, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, baseballActionOutcomeCategory, (i2 & 2) != 0 ? null : num);
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BaseballActionOutcome valueOf(String str) {
        return (BaseballActionOutcome) Enum.valueOf(BaseballActionOutcome.class, str);
    }

    public static BaseballActionOutcome[] values() {
        return (BaseballActionOutcome[]) $VALUES.clone();
    }

    @NotNull
    public final BaseballActionOutcomeCategory getCategory() {
        return this.category;
    }

    @Nullable
    public final Integer getStringFormatNumber() {
        return this.stringFormatNumber;
    }

    private BaseballActionOutcome(String str, int i, BaseballActionOutcomeCategory baseballActionOutcomeCategory, Integer num) {
        this.category = baseballActionOutcomeCategory;
        this.stringFormatNumber = num;
    }
}
