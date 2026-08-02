package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqlj;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class qlj extends q8 {
    public final u8c e;
    public final t9c f;
    public final qw7 g;
    public final Integer h;
    public final int i;
    public final fdi j;
    public final jof k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlj(Application application, fqg fqgVar, u8c u8cVar, t9c t9cVar, qw7 qw7Var) {
        super(application);
        fqgVar.getClass();
        u8cVar.getClass();
        t9cVar.getClass();
        qw7Var.getClass();
        this.e = u8cVar;
        this.f = t9cVar;
        this.g = qw7Var;
        Integer num = (Integer) fqgVar.a("tournament_id");
        this.h = (num == null || num.intValue() == -1) ? null : num;
        Integer num2 = (Integer) fqgVar.a("media_post_id");
        this.i = num2 != null ? num2.intValue() : 0;
        fdi a = gdi.a(new plj(0, rlh.b, true, true));
        this.j = a;
        this.k = un0.u(a);
    }
}
