package defpackage;

import android.content.Context;
import android.content.Intent;
import com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate;
import com.blaze.blazesdk.shared.results.ErrorDomain;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sjk extends hoi implements Function1 {
    public final /* synthetic */ Intent r;
    public final /* synthetic */ String s;
    public final /* synthetic */ BlazePlayerSourceDelegate t;
    public final /* synthetic */ ErrorDomain u;
    public final /* synthetic */ Context v;
    public final /* synthetic */ yql w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjk(Intent intent, String str, BlazePlayerSourceDelegate blazePlayerSourceDelegate, ErrorDomain errorDomain, Context context, yql yqlVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = intent;
        this.s = str;
        this.t = blazePlayerSourceDelegate;
        this.u = errorDomain;
        this.v = context;
        this.w = yqlVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new sjk(this.r, this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((sjk) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        gzk gzkVar = gzk.a;
        ErrorDomain errorDomain = this.u;
        Context context = this.v;
        Intent intent = this.r;
        String str = this.s;
        gzk.b(intent, str, this.t, errorDomain, context);
        gzk.a(intent, str, this.w);
        return Unit.a;
    }
}
