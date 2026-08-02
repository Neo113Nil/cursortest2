package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lsh5;", "Lq8;", "Lcn9;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class sh5 extends q8 implements cn9 {
    public final /* synthetic */ wj9 e;
    public final e64 f;
    public g9i g;
    public g9i h;
    public final yzc i;
    public final yzc j;
    public final yzc k;
    public final yzc l;
    public final Player m;
    public qvj n;
    public Team o;
    public Team p;
    public String q;
    public long r;
    public long s;
    public String t;
    public String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh5(e64 e64Var, fqg fqgVar, Application application) {
        super(application);
        fqgVar.getClass();
        e64Var.getClass();
        this.e = new wj9(2);
        this.f = e64Var;
        yzc yzcVar = new yzc();
        this.i = yzcVar;
        this.j = yzcVar;
        yzc yzcVar2 = new yzc();
        this.k = yzcVar2;
        this.l = yzcVar2;
        this.m = (Player) fqgVar.a("ARG_PLAYER");
        this.n = qvj.c;
        Set set = o84.a;
        this.u = o84.e(i());
    }

    @Override // defpackage.cn9
    public final yzc b() {
        return (yzc) this.e.c;
    }
}
