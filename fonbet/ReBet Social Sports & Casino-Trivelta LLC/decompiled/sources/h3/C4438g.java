package h3;

/* renamed from: h3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4438g extends C4449r {

    /* renamed from: e, reason: collision with root package name */
    public final double f47653e;

    public C4438g(double d10) {
        super(EnumC4450s.IEEE_754_DOUBLE_PRECISION_FLOAT);
        this.f47653e = d10;
    }

    @Override // h3.C4449r, h3.AbstractC4437f
    public boolean equals(Object obj) {
        if (obj instanceof C4438g) {
            C4438g c4438g = (C4438g) obj;
            if (super.equals(obj) && this.f47653e == c4438g.f47653e) {
                return true;
            }
        }
        return false;
    }

    @Override // h3.C4449r, h3.AbstractC4437f
    public int hashCode() {
        return super.hashCode() ^ Double.valueOf(this.f47653e).hashCode();
    }

    @Override // h3.C4449r
    public String toString() {
        return String.valueOf(this.f47653e);
    }
}
