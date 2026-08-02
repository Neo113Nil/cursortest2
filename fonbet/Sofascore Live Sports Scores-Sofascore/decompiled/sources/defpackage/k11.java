package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.firebase.AdType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k11 implements bcg {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ u11 b;
    public final /* synthetic */ ng c;
    public final /* synthetic */ hbg d;
    public final /* synthetic */ fcg e;

    public k11(Integer num, u11 u11Var, ng ngVar, hbg hbgVar, fcg fcgVar) {
        this.a = num;
        this.b = u11Var;
        this.c = ngVar;
        this.d = hbgVar;
        this.e = fcgVar;
    }

    public final void a(hdg hdgVar) {
        u11 u11Var = this.b;
        FragmentActivity fragmentActivity = u11Var.b;
        String str = u11Var.B;
        AdType.Banner banner = this.c.d;
        ru ruVar = ru.EQUATIV;
        String valueOf = String.valueOf(this.d.b);
        int ordinal = hdgVar.a.ordinal();
        String message = hdgVar.getMessage();
        if (message == null) {
            message = "";
        }
        nv.j(fragmentActivity, str, banner, ruVar, valueOf, ordinal, message, qu.LOAD, null, null, 768);
        u11Var.i(true);
    }
}
