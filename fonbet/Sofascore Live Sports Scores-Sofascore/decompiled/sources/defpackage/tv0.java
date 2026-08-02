package defpackage;

import android.content.SharedPreferences;
import com.sofascore.model.chat.BanReason;
import com.sofascore.model.mvvm.model.BaseballAdditionalPlayerData;
import com.sofascore.model.mvvm.model.BaseballEvent;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.network.response.AveragePositionsResponse;
import com.sofascore.model.newNetwork.AvailableSportFiltersResponse;
import com.sofascore.model.newNetwork.BaseballAtBatsResponse;
import com.sofascore.model.newNetwork.BaseballEventTopPerformersResponse;
import com.sofascore.model.newNetwork.statistics.BaseballPitch;
import com.sofascore.results.base.BaseActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class tv0 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ tv0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_$13;
        KSerializer _childSerializers$_anonymous_$22;
        KSerializer _childSerializers$_anonymous_$32;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = AvailableSportFiltersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                _childSerializers$_anonymous_2 = AveragePositionsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 2:
                _childSerializers$_anonymous_$0 = AveragePositionsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 3:
                _childSerializers$_anonymous_$1 = AveragePositionsResponse._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 4:
                _childSerializers$_anonymous_3 = BanReason._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 5:
                KProperty[] kPropertyArr = BaseActivity.H;
                ia0 ia0Var = ia0.q;
                v38 v38Var = ok3.p().k;
                if (v38Var != null) {
                    return v38Var;
                }
                Intrinsics.i("firebaseInAppMessaging");
                throw null;
            case 6:
                KProperty[] kPropertyArr2 = BaseActivity.H;
                ia0 ia0Var2 = ia0.q;
                SharedPreferences sharedPreferences = ok3.p().l;
                if (sharedPreferences != null) {
                    return sharedPreferences;
                }
                Intrinsics.i("preferences");
                throw null;
            case 7:
                return new jcd();
            case 8:
                return Unit.a;
            case 9:
                return Unit.a;
            case 10:
                return Unit.a;
            case 11:
                _childSerializers$_anonymous_4 = BaseballAdditionalPlayerData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 12:
                _childSerializers$_anonymous_5 = BaseballAtBatsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 13:
                return new a0f(duf.a.getOrCreateKotlinClass(gv9.class), new Annotation[0]);
            case 14:
                _childSerializers$_anonymous_6 = BaseballEvent._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 15:
                _childSerializers$_anonymous_$02 = BaseballEvent._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 16:
                _childSerializers$_anonymous_$12 = BaseballEvent._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 17:
                _childSerializers$_anonymous_$2 = BaseballEvent._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 18:
                _childSerializers$_anonymous_$3 = BaseballEvent._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 19:
                _childSerializers$_anonymous_$4 = BaseballEvent._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 20:
                return new w81(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 1, (BaseballInningInfo) v81.a.getValue());
            case 21:
                return new BaseballInningInfo(b.j(1, 3), 1, 2, 9, BaseballInningInfo.InningHalf.Top, 3);
            case 22:
                _childSerializers$_anonymous_7 = BaseballEventTopPerformersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 23:
                _childSerializers$_anonymous_8 = BaseballInningInfo._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 24:
                _childSerializers$_anonymous_$03 = BaseballInningInfo._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 25:
                _childSerializers$_anonymous_9 = BaseballPitch._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 26:
                _childSerializers$_anonymous_$04 = BaseballPitch._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 27:
                _childSerializers$_anonymous_$13 = BaseballPitch._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$13;
            case 28:
                _childSerializers$_anonymous_$22 = BaseballPitch._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$22;
            default:
                _childSerializers$_anonymous_$32 = BaseballPitch._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$32;
        }
    }
}
