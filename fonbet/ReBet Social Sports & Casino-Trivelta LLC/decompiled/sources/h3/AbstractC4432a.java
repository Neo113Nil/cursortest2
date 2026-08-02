package h3;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4432a extends C4449r {

    /* renamed from: e, reason: collision with root package name */
    public final float f47640e;

    public AbstractC4432a(EnumC4450s enumC4450s, float f10) {
        super(enumC4450s);
        this.f47640e = f10;
    }

    @Override // h3.C4449r, h3.AbstractC4437f
    public boolean equals(Object obj) {
        if (obj instanceof AbstractC4432a) {
            AbstractC4432a abstractC4432a = (AbstractC4432a) obj;
            if (super.equals(obj) && this.f47640e == abstractC4432a.f47640e) {
                return true;
            }
        }
        return false;
    }

    @Override // h3.C4449r, h3.AbstractC4437f
    public int hashCode() {
        return super.hashCode() ^ Float.valueOf(this.f47640e).hashCode();
    }
}
