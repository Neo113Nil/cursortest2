package defpackage;

import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d80 implements cdi {
    public final q4k a;
    public final e1d b;
    public j80 c;
    public long d;
    public long e;
    public boolean f;

    public d80(q4k q4kVar, Object obj, j80 j80Var, long j, long j2, boolean z) {
        j80 j80Var2;
        this.a = q4kVar;
        this.b = e.f(obj);
        if (j80Var != null) {
            j80Var2 = j72.y(j80Var);
        } else {
            j80Var2 = (j80) q4kVar.a.invoke(obj);
            j80Var2.d();
        }
        this.c = j80Var2;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final Object c() {
        return this.a.b.invoke(this.c);
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        return ((eoh) this.b).getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(((eoh) this.b).getValue());
        sb.append(", velocity=");
        sb.append(c());
        sb.append(", isRunning=");
        sb.append(this.f);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.d);
        sb.append(", finishedTimeNanos=");
        return fn0.n(sb, this.e, ')');
    }

    public /* synthetic */ d80(q4k q4kVar, Object obj, j80 j80Var, int i) {
        this(q4kVar, obj, (i & 4) != 0 ? null : j80Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
