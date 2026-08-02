package defpackage;

import androidx.compose.runtime.e;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b80 {
    public final q4k a;
    public final Object b;
    public final long c;
    public final Function0 d;
    public final e1d e;
    public j80 f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final e1d i = e.f(Boolean.TRUE);

    public b80(Object obj, q4k q4kVar, j80 j80Var, long j, Object obj2, long j2, Function0 function0) {
        this.a = q4kVar;
        this.b = obj2;
        this.c = j2;
        this.d = function0;
        this.e = e.f(obj);
        this.f = j72.y(j80Var);
        this.g = j;
    }

    public final void a() {
        ((eoh) this.i).setValue(Boolean.FALSE);
        this.d.invoke();
    }

    public final Object b() {
        return this.a.b.invoke(this.f);
    }
}
