package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.appsflyer.AppsFlyerLib;
import com.sofascore.model.mvvm.model.AmericanFootballEvent;
import com.sofascore.model.newNetwork.ApiBranchesResponse;
import com.sofascore.model.newNetwork.AttributeOverviewResponse;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.model.newNetwork.statistics.PlayerHand;
import com.sofascore.model.newNetwork.topperformance.response.AmericanFootballTopPlayersStatistics;
import com.unity3d.services.core.properties.SdkProperties;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class st implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ st(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$8;
        KSerializer _childSerializers$_anonymous_$9;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$22;
        KSerializer _childSerializers$_anonymous_$32;
        KSerializer _childSerializers$_anonymous_$42;
        KSerializer _childSerializers$_anonymous_$5;
        KSerializer _childSerializers$_anonymous_$6;
        KSerializer _childSerializers$_anonymous_$7;
        KSerializer _childSerializers$_anonymous_2;
        long elapsedRealtime;
        long initializationTime;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$23;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$2 = AmericanFootballEvent._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 1:
                _childSerializers$_anonymous_$3 = AmericanFootballEvent._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 2:
                _childSerializers$_anonymous_$4 = AmericanFootballEvent._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 3:
                _childSerializers$_anonymous_ = AmericanFootballTopPlayersStatistics._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 4:
                _childSerializers$_anonymous_$8 = AmericanFootballTopPlayersStatistics._childSerializers$_anonymous_$8();
                return _childSerializers$_anonymous_$8;
            case 5:
                _childSerializers$_anonymous_$9 = AmericanFootballTopPlayersStatistics._childSerializers$_anonymous_$9();
                return _childSerializers$_anonymous_$9;
            case 6:
                _childSerializers$_anonymous_$0 = AmericanFootballTopPlayersStatistics._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 7:
                _childSerializers$_anonymous_$1 = AmericanFootballTopPlayersStatistics._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 8:
                _childSerializers$_anonymous_$22 = AmericanFootballTopPlayersStatistics._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$22;
            case 9:
                _childSerializers$_anonymous_$32 = AmericanFootballTopPlayersStatistics._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$32;
            case 10:
                _childSerializers$_anonymous_$42 = AmericanFootballTopPlayersStatistics._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$42;
            case 11:
                _childSerializers$_anonymous_$5 = AmericanFootballTopPlayersStatistics._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$5;
            case 12:
                _childSerializers$_anonymous_$6 = AmericanFootballTopPlayersStatistics._childSerializers$_anonymous_$6();
                return _childSerializers$_anonymous_$6;
            case 13:
                _childSerializers$_anonymous_$7 = AmericanFootballTopPlayersStatistics._childSerializers$_anonymous_$7();
                return _childSerializers$_anonymous_$7;
            case 14:
                _childSerializers$_anonymous_2 = ApiBranchesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 15:
                boolean z = dg0.a;
                dg0.c = true;
                if (dg0.b && dg0.c) {
                    AppsFlyerLib.getInstance().start();
                }
                return Unit.a;
            case 16:
                ff5 ff5Var = oa0.a;
                return qs4.a;
            case 17:
                ff5 ff5Var2 = oa0.a;
                return ccd.c;
            case 18:
                return new ccd();
            case 19:
                return new q1f(0);
            case 20:
                elapsedRealtime = SystemClock.elapsedRealtime();
                return Long.valueOf(elapsedRealtime);
            case 21:
                initializationTime = SdkProperties.getInitializationTime();
                return Long.valueOf(initializationTime);
            case 22:
                return new Handler(Looper.getMainLooper());
            case 23:
                return hz8.F("com.sofascore.model.newNetwork.commentary.BaseballActionOutcome", BaseballActionOutcome.values(), new String[]{"kAK", "kAKP", "kAKB", "kKL", "kKS", "kF", "kFT", "rPABC", "rPABO", "oBI", "oDT2", "oDT3", "oDT4", "oFC", "oFCT2", "oFCT3", "oFCT4", "oFO", "oGO", "oKLT1", "oKLT2", "oKLT3", "oKLT4", "oKST1", "oKST2", "oKST3", "oKST4", "oROET2", "oROET3", "oROET4", "oST1", "oST2", "oST3", "oST4", "oTT3", "oTT4", "oLO", "oOBB", "oOP", "oPO", "oSB", "oSBT2", "oSBT3", "oSBT4", "oSF", "oSFT2", "oSFT3", "oSFT4", "bAB", "bABP", "bABC", "bABS", "bB", "bDB", "bIB", "bPO", "aBK", "aCI", "aD", "aDAD3", "aDAD4", "aFCAD2", "aFCAD3", "aFCAD4", "aHBP", "aHR", "aIBB", "BB", "aKLAD1", "aKLAD2", "aKLAD3", "aKLAD4", "aKSAD1", "aKSAD2", "aKSAD3", "aKSAD4", "aROE", "aROEAD2", "aROEAD3", "aROEAD4", "aROV", "aS", "aSAD2", "aSAD3", "aSAD4", "aSBAD1", "aSBAD2", "aSBAD3", "aSBAD4", "aSFAD1", "aSFAD2", "aSFAD3", "aSFAD4", "aT", "aTAD4", "CS2", "CS3", "CS4", "POCS2", "POCS3", "POCS4", "TO", "TO2", "TO3", "TO4", "FO1", "FO2", "FO3", "FO4", "DO1", "DO2", "DO3", "SB2O2", "SB2O3", "SB2O4", "SB3O3", "SB3O4", "RI", "OOA", "OBP", "HBB", "SB2", "SB3", "SB4", "SB4u", "AD1", "AD2", "AD3", "DI2", "DI3", "CS2AD3", "CS2AD4", "CS2AD4u", "CS3AD4", "CS3AD4u", "SB2E2", "SB2E3", "SB2E4", "SB3E4", "SB2E4E", "SB3E4E", "SB2AD3", "SB2AD4", "SB2AD4u", "SB3AD4", "SB3AD4u", "CK", "PO", "POCSC", "ERN", "eRN", "ERNu", "eRNu", "URN", "uRN", "PITCHER_SUBSTITUTION", "PINCH_HITTING_SUBSTITUTION", "PINCH_RUNNING_SUBSTITUTION", "DEFENSIVE_SUBSTITUTION", "DEFENSIVE_SWITCH"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 24:
                return PlayerHand.INSTANCE.serializer();
            case 25:
                _childSerializers$_anonymous_3 = AttributeOverviewResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 26:
                _childSerializers$_anonymous_$02 = AttributeOverviewResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 27:
                _childSerializers$_anonymous_$12 = AttributeOverviewResponse._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 28:
                _childSerializers$_anonymous_$23 = AttributeOverviewResponse._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$23;
            default:
                return new pvh(hkg.b(1308617531));
        }
    }
}
