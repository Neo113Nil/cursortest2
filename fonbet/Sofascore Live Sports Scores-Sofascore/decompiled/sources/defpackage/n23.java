package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n23 implements ycj {
    public final long a;

    public n23(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        s3a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.ycj
    public final float a() {
        return r13.d(this.a);
    }

    @Override // defpackage.ycj
    public final long b() {
        return this.a;
    }

    @Override // defpackage.ycj
    public final n52 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n23)) {
            return false;
        }
        long j = ((n23) obj).a;
        int i = r13.j;
        return e8k.a(this.a, j);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) r13.i(this.a)) + ')';
    }
}
