package defpackage;

import com.blaze.blazesdk.ads.custom_native.a;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.mbridge.msdk.foundation.download.Command;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vvl extends hoi implements Function2 {
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ a t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvl(String str, String str2, a aVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = str;
        this.s = str2;
        this.t = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new vvl(this.r, this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vvl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        pzf pzfVar = new pzf();
        pzfVar.f(this.r);
        String str = this.s;
        if (str != null) {
            pzfVar.c(Command.HTTP_HEADER_USER_AGENT, str);
        }
        qzf qzfVar = new qzf(pzfVar);
        jod jodVar = this.t.c;
        jodVar.getClass();
        return FirebasePerfOkHttpClient.execute(new pof(jodVar, qzfVar));
    }
}
