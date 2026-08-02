package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.model.firebase.AdType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e9a extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ AppCompatActivity s;
    public final /* synthetic */ AdType.Interstitial t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9a(AppCompatActivity appCompatActivity, AdType.Interstitial interstitial, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = appCompatActivity;
        this.t = interstitial;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new e9a(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e9a) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            this.r = 1;
            Object r = s9a.r(new z8a(this.s, this.t, null), this);
            return r == lu3Var ? lu3Var : r;
        }
        if (i == 1) {
            y6a.M(obj);
            return obj;
        }
        a70.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
