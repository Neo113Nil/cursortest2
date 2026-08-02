package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f6d {
    public final d6d a;
    public final s6d b;
    public final Bundle c;
    public e6b d;
    public final l6d e;
    public final String f;
    public final Bundle g;
    public final oqg h;
    public boolean i;
    public final y6b j;
    public e6b k;
    public final sqg l;
    public final mqi m;

    public f6d(d6d d6dVar) {
        this.a = d6dVar;
        this.b = d6dVar.b;
        this.c = d6dVar.c;
        this.d = d6dVar.d;
        this.e = d6dVar.e;
        this.f = d6dVar.f;
        this.g = d6dVar.g;
        this.h = new oqg(new pqg(d6dVar, new e6g(d6dVar, 8)));
        mqi b = ypa.b(new ivc(6));
        this.j = new y6b(d6dVar, true);
        this.k = e6b.b;
        this.l = (sqg) b.getValue();
        this.m = ypa.b(new ivc(7));
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        lm5.a.getClass();
        Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
        E.putAll(bundle);
        return E;
    }

    public final void b() {
        if (!this.i) {
            oqg oqgVar = this.h;
            oqgVar.a.c();
            this.i = true;
            if (this.e != null) {
                yso.y(this.a);
            }
            oqgVar.a(this.g);
        }
        int ordinal = this.d.ordinal();
        int ordinal2 = this.k.ordinal();
        y6b y6bVar = this.j;
        if (ordinal < ordinal2) {
            y6bVar.i(this.d);
        } else {
            y6bVar.i(this.k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(duf.a.getOrCreateKotlinClass(d6d.class).getSimpleName());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}
