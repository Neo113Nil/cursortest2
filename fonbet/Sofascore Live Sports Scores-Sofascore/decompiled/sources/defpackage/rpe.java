package defpackage;

import com.sofascore.model.newNetwork.FootballEventPlayerRatingBreakdownResponse;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class rpe {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[FootballEventPlayerRatingBreakdownResponse.ActionType.values().length];
        try {
            iArr[FootballEventPlayerRatingBreakdownResponse.ActionType.Pass.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FootballEventPlayerRatingBreakdownResponse.ActionType.Cross.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FootballEventPlayerRatingBreakdownResponse.ActionType.BallTouch.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FootballEventPlayerRatingBreakdownResponse.ActionType.Dribble.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FootballEventPlayerRatingBreakdownResponse.ActionType.Tackle.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[FootballEventPlayerRatingBreakdownResponse.ActionType.Clearance.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[FootballEventPlayerRatingBreakdownResponse.ActionType.BallRecovery.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[FootballEventPlayerRatingBreakdownResponse.ActionType.Interception.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[FootballEventPlayerRatingBreakdownResponse.ActionType.Block.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[FootballEventPlayerRatingBreakdownResponse.ActionType.BallCarry.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
        int[] iArr2 = new int[wj1.values().length];
        try {
            wj1 wj1Var = wj1.b;
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            wj1 wj1Var2 = wj1.b;
            iArr2[0] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}
