package h3;

/* renamed from: h3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4436e extends AbstractC4437f {

    /* renamed from: c, reason: collision with root package name */
    public boolean f47650c;

    public AbstractC4436e(EnumC4441j enumC4441j) {
        super(enumC4441j);
        this.f47650c = false;
    }

    @Override // h3.AbstractC4437f
    public boolean equals(Object obj) {
        if (obj instanceof AbstractC4436e) {
            AbstractC4436e abstractC4436e = (AbstractC4436e) obj;
            if (super.equals(obj) && this.f47650c == abstractC4436e.f47650c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f47650c;
    }

    public AbstractC4436e g(boolean z10) {
        this.f47650c = z10;
        return this;
    }

    @Override // h3.AbstractC4437f
    public int hashCode() {
        return super.hashCode() ^ Boolean.valueOf(this.f47650c).hashCode();
    }
}
