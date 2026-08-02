package defpackage;

import android.app.Application;
import com.sofascore.model.network.response.MediaHighlightSummaryResponse;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnui;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class nui extends q8 {
    public final jof A;
    public final j0j e;
    public final t9c f;
    public final sef g;
    public final kgl h;
    public final int i;
    public final yzc j;
    public final yzc k;
    public final yzc l;
    public final yzc m;
    public final yzc n;
    public final zzc o;
    public final zzc p;
    public final zzc q;
    public final zzc r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Integer v;
    public Integer w;
    public String x;
    public MediaHighlightSummaryResponse y;
    public final hof z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nui(Application application, j0j j0jVar, t9c t9cVar, sef sefVar, bt7 bt7Var, fqg fqgVar, kgl kglVar) {
        super(application);
        j0jVar.getClass();
        t9cVar.getClass();
        sefVar.getClass();
        fqgVar.getClass();
        kglVar.getClass();
        this.e = j0jVar;
        this.f = t9cVar;
        this.g = sefVar;
        this.h = kglVar;
        Integer num = (Integer) fqgVar.a("TEAM_ID");
        int intValue = num != null ? num.intValue() : 0;
        this.i = intValue;
        yzc yzcVar = new yzc();
        this.j = yzcVar;
        this.k = yzcVar;
        yzc yzcVar2 = new yzc();
        this.l = yzcVar2;
        this.m = yzcVar2;
        this.n = new yzc(Boolean.TRUE);
        zzc zzcVar = new zzc();
        this.o = zzcVar;
        this.p = zzcVar;
        zzc zzcVar2 = new zzc();
        this.q = zzcVar2;
        this.r = zzcVar2;
        this.t = true;
        hof H = un0.H(j0jVar.e(intValue), un0.z(this), new uci(5000L, Long.MAX_VALUE), 0);
        this.z = H;
        this.A = un0.K(la8.a(H, new lr5(null, bt7Var, 5)), un0.z(this), new uci(5000L, Long.MAX_VALUE), null);
    }
}
