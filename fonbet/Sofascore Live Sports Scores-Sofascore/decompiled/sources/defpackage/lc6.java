package defpackage;

import android.content.Context;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.results.team.TeamActivity;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lc6 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public lc6(z02 z02Var, int i, String str) {
        this.c = z02Var;
        this.b = i;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                boh bohVar = (boh) obj2;
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    int i2 = TeamActivity.Z;
                    jle.r((Context) obj, this.b, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                break;
            default:
                nv.q(((z02) obj2).b, Integer.valueOf(this.b), BrandLocation.WhoWillWin, (String) obj, BrandType.STRIPE);
                break;
        }
        return Unit.a;
    }

    public lc6(boh bohVar, Context context, int i) {
        this.c = bohVar;
        this.d = context;
        this.b = i;
    }
}
