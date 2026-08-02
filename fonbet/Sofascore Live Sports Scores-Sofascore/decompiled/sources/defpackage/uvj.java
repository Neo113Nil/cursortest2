package defpackage;

import com.sofascore.model.PlayerTransferFilterData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luvj;", "Lltk;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class uvj extends ltk {
    public final vyh b;
    public final vrj c;
    public int d;
    public boolean e;
    public boolean f;
    public PlayerTransferFilterData g;
    public ovj h;
    public final yzc i;
    public final yzc j;
    public final yzc k;
    public final yzc l;
    public g9i m;
    public fxe n;

    public uvj(vyh vyhVar, vrj vrjVar) {
        vyhVar.getClass();
        vrjVar.getClass();
        this.b = vyhVar;
        this.c = vrjVar;
        this.e = true;
        this.f = true;
        yzc yzcVar = new yzc();
        this.i = yzcVar;
        this.j = yzcVar;
        yzc yzcVar2 = new yzc();
        this.k = yzcVar2;
        this.l = yzcVar2;
    }

    public final void f(boolean z) {
        g9i g9iVar;
        if (!z && (g9iVar = this.m) != null) {
            g9iVar.e(null);
        }
        this.f = z;
        this.m = xw3.L(un0.z(this), null, null, new tvj(this, null), 3);
    }

    public final ovj g() {
        ovj ovjVar = this.h;
        if (ovjVar != null) {
            return ovjVar;
        }
        Intrinsics.i("currentSort");
        throw null;
    }
}
