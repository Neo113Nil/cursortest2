package defpackage;

import android.app.Application;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.TvChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu3k;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class u3k extends q8 {
    public final z3k e;
    public final a4k f;
    public final yzc g;
    public final yzc h;
    public final yzc i;
    public final yzc j;
    public ArrayList k;
    public final ArrayList l;
    public ArrayList m;
    public final yzc n;
    public final yzc o;
    public final List p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3k(Application application, z3k z3kVar, a4k a4kVar) {
        super(application);
        z3kVar.getClass();
        a4kVar.getClass();
        this.e = z3kVar;
        this.f = a4kVar;
        yzc yzcVar = new yzc();
        this.g = yzcVar;
        this.h = yzcVar;
        yzc yzcVar2 = new yzc();
        this.i = yzcVar2;
        this.j = yzcVar2;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        yzc yzcVar3 = new yzc();
        this.n = yzcVar3;
        this.o = yzcVar3;
        this.p = zu3.y0;
        xw3.L(un0.z(this), null, null, new vki(this, (rq3) null, 21), 3);
    }

    public final void k(TvChannel tvChannel, boolean z) {
        Country country;
        tvChannel.getClass();
        this.l.add(tvChannel);
        this.k.remove(tvChannel);
        if (!z || (country = (Country) this.h.d()) == null) {
            return;
        }
        String iso2Alpha = country.getIso2Alpha();
        a4k a4kVar = this.f;
        Map a = a4kVar.a();
        i5k.c(a).remove(iso2Alpha);
        a4kVar.b(a);
        this.m.remove(country);
    }
}
