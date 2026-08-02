package defpackage;

import com.blaze.blazesdk.ads.ima.BlazeIMAHandlerEventType;
import com.blaze.blazesdk.ads.ima.models.BlazeImaAdEvent;
import com.blaze.ima.BlazeIMADelegate;
import com.blaze.ima.ImaHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nrm extends hoi implements Function2 {
    public final /* synthetic */ int r = 1;
    public int s;
    public final /* synthetic */ ImaHandler t;
    public BlazeImaAdEvent u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrm(ImaHandler imaHandler, BlazeImaAdEvent blazeImaAdEvent, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = imaHandler;
        this.u = blazeImaAdEvent;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ImaHandler imaHandler = this.t;
        switch (i) {
            case 0:
                return new nrm(imaHandler, rq3Var);
            default:
                return new nrm(imaHandler, this.u, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        ImaHandler imaHandler = this.t;
        rq3 rq3Var = (rq3) obj2;
        switch (i) {
            case 0:
                return new nrm(imaHandler, rq3Var).invokeSuspend(Unit.a);
            default:
                return new nrm(imaHandler, this.u, rq3Var).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        b1d b1dVar;
        BlazeImaAdEvent blazeImaAdEvent;
        BlazeIMADelegate blazeIMADelegate;
        b1d b1dVar2;
        int i = this.r;
        ImaHandler imaHandler = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    BlazeImaAdEvent blazeImaAdEvent2 = new BlazeImaAdEvent(null, BlazeIMAHandlerEventType.AD_REQUESTED);
                    b1dVar = imaHandler._adEvent;
                    this.u = blazeImaAdEvent2;
                    this.s = 1;
                    if (b1dVar.emit(blazeImaAdEvent2, this) == lu3Var) {
                        break;
                    } else {
                        blazeImaAdEvent = blazeImaAdEvent2;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    blazeImaAdEvent = this.u;
                    y6a.M(obj);
                }
                blazeIMADelegate = imaHandler.delegate;
                if (blazeIMADelegate != null) {
                    blazeIMADelegate.onIMAAdEvent(blazeImaAdEvent.getType(), null);
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    b1dVar2 = imaHandler._adEvent;
                    BlazeImaAdEvent blazeImaAdEvent3 = this.u;
                    this.s = 1;
                    if (b1dVar2.emit(blazeImaAdEvent3, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrm(ImaHandler imaHandler, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = imaHandler;
    }
}
