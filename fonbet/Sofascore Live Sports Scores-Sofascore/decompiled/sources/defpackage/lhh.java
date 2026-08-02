package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lhh extends wtc implements oma, p3h {
    public int A;
    public xjd B;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public uah v;
    public boolean w;
    public long x;
    public long y;
    public int z;

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        if (this.w) {
            y3h.k(b4hVar, this.v);
        }
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        qhe J = g1cVar.J(j);
        return m1c.G0(m1cVar, J.a, J.b, new i20(12, J, this));
    }

    @Override // defpackage.p3h
    public final boolean p() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.o);
        sb.append(", scaleY=");
        sb.append(this.p);
        sb.append(", alpha = ");
        sb.append(this.q);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.r);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.s);
        sb.append(", cameraDistance=");
        sb.append(this.t);
        sb.append(", transformOrigin=");
        sb.append((Object) xvj.b(this.u));
        sb.append(", shape=");
        sb.append(this.v);
        sb.append(", clip=");
        sb.append(this.w);
        sb.append(", renderEffect=null, ambientShadowColor=");
        vxd.q(this.x, ", spotShadowColor=", sb);
        vxd.q(this.y, ", compositingStrategy=", sb);
        sb.append((Object) ("CompositingStrategy(value=" + this.z + ')'));
        sb.append(", blendMode=");
        sb.append((Object) rfo.P(this.A));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
