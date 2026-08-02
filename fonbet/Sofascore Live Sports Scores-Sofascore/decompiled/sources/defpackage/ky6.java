package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ky6 {
    public final Context a;
    public final wi7 b;

    public ky6(Context context, wi7 wi7Var) {
        wi7Var.getClass();
        this.a = context;
        this.b = wi7Var;
    }

    public final long a(long j, int i, boolean z) {
        q13 q13Var = new q13(i, 24);
        Context context = this.a;
        long longValue = ((Number) n9e.x(context, q13Var)).longValue();
        if (!z || j <= longValue) {
            return longValue;
        }
        n9e.u(context, new we7(i, j, 0));
        return j;
    }

    public final Object b(int i, hoi hoiVar) {
        return s9a.r(new hy6(this, i, null, 2), hoiVar);
    }
}
