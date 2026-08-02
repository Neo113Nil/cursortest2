package defpackage;

import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingEvent;
import com.sofascore.model.branding.PartnerOfferType;
import com.sofascore.model.mvvm.model.Event;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xwb extends hoi implements Function2 {
    public Brand r;
    public PartnerOfferType s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ BrandingEvent v;
    public final /* synthetic */ axb w;
    public final /* synthetic */ int x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwb(BrandingEvent brandingEvent, axb axbVar, int i, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = brandingEvent;
        this.w = axbVar;
        this.x = i;
        this.y = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        xwb xwbVar = new xwb(this.v, this.w, this.x, this.y, rq3Var);
        xwbVar.u = obj;
        return xwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xwb) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Brand brand;
        PartnerOfferType partnerOfferType;
        Object value;
        Object value2;
        axb axbVar = this.w;
        fdi fdiVar = axbVar.e;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        int i2 = this.x;
        if (i == 0) {
            y6a.M(obj);
            BrandingEvent brandingEvent = this.v;
            brand = brandingEvent.getBrand();
            if (brand == null) {
                do {
                    value2 = fdiVar.getValue();
                } while (!fdiVar.k(value2, new snb()));
                return Unit.a;
            }
            PartnerOfferType fromValue = PartnerOfferType.INSTANCE.fromValue(brandingEvent.getOfferType());
            if (fromValue == null) {
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, new snb()));
                return Unit.a;
            }
            this.u = null;
            this.r = brand;
            this.s = fromValue;
            this.t = 1;
            Object r = s9a.r(new zwb(axbVar, this.y, i2, null), this);
            if (r == lu3Var) {
                return lu3Var;
            }
            partnerOfferType = fromValue;
            obj = r;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            PartnerOfferType partnerOfferType2 = this.s;
            Brand brand2 = this.r;
            y6a.M(obj);
            partnerOfferType = partnerOfferType2;
            brand = brand2;
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            return Unit.a;
        }
        Event event = (Event) pair.a;
        w3f w3fVar = (w3f) pair.b;
        nwb.d(i2, axbVar.i());
        axbVar.p = event;
        axbVar.o(new yx1(event, axbVar, brand, w3fVar, partnerOfferType, this.v, 3));
        return Unit.a;
    }
}
