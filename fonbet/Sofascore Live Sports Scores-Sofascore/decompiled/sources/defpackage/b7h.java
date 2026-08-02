package defpackage;

import androidx.compose.runtime.e;
import com.facebook.login.w;
import com.sofascore.model.network.response.SignupLinkResponse;
import com.sofascore.model.network.response.SofaSeason;
import com.sofascore.model.newNetwork.SetPP;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.IntentCreation;
import com.unity3d.ads.core.domain.events.GetAdRevenueEventData;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.store.core.StoreExceptionHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class b7h implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ b7h(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        IntentCreation initialize$lambda$220$lambda$86;
        GetAdRevenueEventData initialize$lambda$220$lambda$138;
        GetDiagnosticEventBatchRequest initialize$lambda$220$lambda$140;
        HandleGatewayEventResponse initialize$lambda$220$lambda$144;
        UniversalRequestTtlValidator initialize$lambda$220$lambda$153;
        FlattenerRulesUseCase initialize$lambda$220$lambda$165;
        FlattenerRulesUseCase initialize$lambda$220$lambda$166;
        VolumeChange initialize$lambda$220$lambda$171;
        StoreExceptionHandler initialize$lambda$220$lambda$173;
        HandleInvocationsFromAdViewer initialize$lambda$220$lambda$184;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$12;
        switch (this.a) {
            case 0:
                initialize$lambda$220$lambda$86 = ServiceProvider.initialize$lambda$220$lambda$86();
                return initialize$lambda$220$lambda$86;
            case 1:
                initialize$lambda$220$lambda$138 = ServiceProvider.initialize$lambda$220$lambda$138();
                return initialize$lambda$220$lambda$138;
            case 2:
                initialize$lambda$220$lambda$140 = ServiceProvider.initialize$lambda$220$lambda$140();
                return initialize$lambda$220$lambda$140;
            case 3:
                initialize$lambda$220$lambda$144 = ServiceProvider.initialize$lambda$220$lambda$144();
                return initialize$lambda$220$lambda$144;
            case 4:
                initialize$lambda$220$lambda$153 = ServiceProvider.initialize$lambda$220$lambda$153();
                return initialize$lambda$220$lambda$153;
            case 5:
                initialize$lambda$220$lambda$165 = ServiceProvider.initialize$lambda$220$lambda$165();
                return initialize$lambda$220$lambda$165;
            case 6:
                initialize$lambda$220$lambda$166 = ServiceProvider.initialize$lambda$220$lambda$166();
                return initialize$lambda$220$lambda$166;
            case 7:
                initialize$lambda$220$lambda$171 = ServiceProvider.initialize$lambda$220$lambda$171();
                return initialize$lambda$220$lambda$171;
            case 8:
                initialize$lambda$220$lambda$173 = ServiceProvider.initialize$lambda$220$lambda$173();
                return initialize$lambda$220$lambda$173;
            case 9:
                initialize$lambda$220$lambda$184 = ServiceProvider.initialize$lambda$220$lambda$184();
                return initialize$lambda$220$lambda$184;
            case 10:
                return new q79(uhi.a, t7f.a, 1);
            case 11:
                _childSerializers$_anonymous_ = SetPP._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 12:
                _childSerializers$_anonymous_$0 = SetPP._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 13:
                _childSerializers$_anonymous_$1 = SetPP._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 14:
                return new cch(cbh.a, cbh.b, cbh.c, cbh.d, cbh.f);
            case 15:
                return new dch(o7g.a(4.0f), o7g.a(4.0f), o7g.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            case 16:
                return null;
            case 17:
                return w.b.a();
            case 18:
                _childSerializers$_anonymous_2 = SignupLinkResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 19:
                return e.f(Boolean.FALSE);
            case 20:
                return Unit.a;
            case 21:
                tc3 tc3Var = null;
                vt2 vt2Var = new vt2("Performance", "Performance", false, null, tc3Var, null, null, 252);
                Object[] objArr = 0 == true ? 1 : 0;
                vt2 vt2Var2 = new vt2("Club", "Club", false, tc3Var, 0 == true ? 1 : 0, objArr, null, 252);
                String str = "Age";
                String str2 = "Age";
                boolean z = false;
                Object[] objArr2 = 0 == true ? 1 : 0;
                return l6g.K(vt2Var, vt2Var2, new vt2(str, str2, z, 0 == true ? 1 : 0, objArr2, 0 == true ? 1 : 0, null, 252));
            case 22:
                return ntd.b;
            case 23:
                _childSerializers$_anonymous_3 = SofaSeason._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 24:
                _childSerializers$_anonymous_$02 = SofaSeason._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 25:
                _childSerializers$_anonymous_$12 = SofaSeason._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 26:
                return Unit.a;
            case 27:
                return e.f(Boolean.FALSE);
            case 28:
                return Unit.a;
            default:
                return e.f(Boolean.FALSE);
        }
    }
}
