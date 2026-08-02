package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a70;
import defpackage.de6;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.tub;
import defpackage.y6a;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.w9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3854w9 implements Xg {
    public final String a;
    public InMobiJsonResponse b;

    public C3854w9(String str) {
        str.getClass();
        this.a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.inmobi.media.Xg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        C3828v9 c3828v9;
        int i;
        try {
            if (rq3Var instanceof C3828v9) {
                c3828v9 = (C3828v9) rq3Var;
                int i2 = c3828v9.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3828v9.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3828v9.b;
                    lu3 lu3Var = lu3.a;
                    i = c3828v9.d;
                    if (i != 0) {
                        y6a.M(obj);
                        String str = this.a;
                        c3828v9.a = this;
                        c3828v9.d = 1;
                        obj = InMobiJsonResponse.class.cast(AbstractC3907ya.a(new JSONObject(str), InMobiJsonResponse.class, null, null));
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = c3828v9.a;
                        y6a.M(obj);
                    }
                    this.b = (InMobiJsonResponse) obj;
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            this.b = (InMobiJsonResponse) obj;
            return Unit.a;
        } catch (Throwable th) {
            de6.b(th);
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C3527jj(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, new Short((short) (!(th instanceof JSONException) ? th instanceof ClassCastException ? 2310 : 2311 : 2309))))));
        }
        c3828v9 = new C3828v9(this, (sq3) rq3Var);
        Object obj2 = c3828v9.b;
        lu3 lu3Var2 = lu3.a;
        i = c3828v9.d;
    }

    @Override // com.inmobi.media.Xg
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InMobiJsonResponse b() {
        Objects.toString(this.b);
        return this.b;
    }

    @Override // com.inmobi.media.Xg
    public final void a() {
        String str = this.a;
        if (this.b == null || str.length() == 0) {
            throw new Zg(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C3527jj(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, (short) 3))));
        }
    }
}
