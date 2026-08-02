package defpackage;

import com.blaze.blazesdk.ads.ima.BlazeImaHandler;
import com.blaze.blazesdk.ads.ima.exo_player.ImaPresenterActivity;
import com.blaze.blazesdk.ads.ima.models.BlazeIMAAdRequestData;
import com.blaze.blazesdk.ads.ima.models.b;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.players.models.InterfaceC1358b;
import com.blaze.blazesdk.players.models.a;
import com.blaze.blazesdk.players.models.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class axl extends hoi implements Function2 {
    public x8m r;
    public int s;
    public final /* synthetic */ x8m t;
    public final /* synthetic */ ImaPresenterActivity u;
    public final /* synthetic */ bh v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axl(x8m x8mVar, ImaPresenterActivity imaPresenterActivity, bh bhVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = x8mVar;
        this.u = imaPresenterActivity;
        this.v = bhVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new axl(this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((axl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        x8m x8mVar;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        x8m x8mVar2 = this.t;
        ale aleVar = null;
        if (i == 0) {
            y6a.M(obj);
            BlazeImaHandler blazeImaHandler = x8mVar2.c;
            if (blazeImaHandler == null) {
                x8mVar = x8mVar2;
                x8mVar.t = aleVar;
                return x8mVar2.t;
            }
            c cVar = x8mVar2.s;
            InterfaceC1358b interfaceC1358b = cVar != null ? cVar.c : null;
            a aVar = interfaceC1358b instanceof a ? (a) interfaceC1358b : null;
            b bVar = aVar != null ? aVar.a : null;
            BlazeIMAAdRequestData blazeIMAAdRequestData = bVar != null ? new BlazeIMAAdRequestData(bVar.a, bVar.b, bVar.c) : null;
            Boolean bool = (Boolean) c8m.a.d();
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            BlazeContentExtraInfo blazeContentExtraInfo = x8mVar2.j;
            this.r = x8mVar2;
            this.s = 1;
            obj = blazeImaHandler.createPlayer(this.u, this.v, blazeIMAAdRequestData, booleanValue, blazeContentExtraInfo, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
            x8mVar = x8mVar2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x8mVar = this.r;
            y6a.M(obj);
        }
        aleVar = (ale) obj;
        x8mVar.t = aleVar;
        return x8mVar2.t;
    }
}
