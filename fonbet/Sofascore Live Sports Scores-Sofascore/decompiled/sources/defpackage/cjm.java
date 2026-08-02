package defpackage;

import com.blaze.blazesdk.ads.ima.exo_player.ImaPresenterActivity;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cjm implements b98 {
    public final /* synthetic */ ku3 a;
    public final /* synthetic */ ImaPresenterActivity b;

    public cjm(ku3 ku3Var, ImaPresenterActivity imaPresenterActivity) {
        this.a = ku3Var;
        this.b = imaPresenterActivity;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        evl.m(this.a);
        this.b.finish();
        return Unit.a;
    }
}
