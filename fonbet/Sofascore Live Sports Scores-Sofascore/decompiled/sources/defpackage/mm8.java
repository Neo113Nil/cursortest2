package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class mm8 extends yzf {
    public static final zdc e;
    public final List c;
    public final List d;

    static {
        Regex regex = zdc.e;
        e = bea.v("application/x-www-form-urlencoded");
    }

    public mm8(ArrayList arrayList, ArrayList arrayList2) {
        this.c = yol.j(arrayList);
        this.d = yol.j(arrayList2);
    }

    public final long a(k62 k62Var, boolean z) {
        x52 u;
        if (z) {
            u = new x52();
        } else {
            k62Var.getClass();
            u = k62Var.u();
        }
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                u.Y0(38);
            }
            u.g1((String) list.get(i));
            u.Y0(61);
            u.g1((String) this.d.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = u.b;
        u.k();
        return j;
    }

    @Override // defpackage.yzf
    public final long contentLength() {
        return a(null, true);
    }

    @Override // defpackage.yzf
    public final zdc contentType() {
        return e;
    }

    @Override // defpackage.yzf
    public final void writeTo(k62 k62Var) {
        a(k62Var, false);
    }
}
