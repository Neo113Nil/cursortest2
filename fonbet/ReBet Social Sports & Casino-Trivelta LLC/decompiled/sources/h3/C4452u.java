package h3;

/* renamed from: h3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4452u extends AbstractC4436e {

    /* renamed from: d, reason: collision with root package name */
    public final String f47690d;

    public C4452u(String str) {
        super(EnumC4441j.UNICODE_STRING);
        this.f47690d = str;
    }

    @Override // h3.AbstractC4436e, h3.AbstractC4437f
    public boolean equals(Object obj) {
        if (!(obj instanceof C4452u) || !super.equals(obj)) {
            return false;
        }
        C4452u c4452u = (C4452u) obj;
        String str = this.f47690d;
        return str == null ? c4452u.f47690d == null : str.equals(c4452u.f47690d);
    }

    @Override // h3.AbstractC4436e
    public /* bridge */ /* synthetic */ AbstractC4436e g(boolean z10) {
        return super.g(z10);
    }

    public String h() {
        return this.f47690d;
    }

    @Override // h3.AbstractC4436e, h3.AbstractC4437f
    public int hashCode() {
        if (this.f47690d != null) {
            return super.hashCode() + this.f47690d.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = this.f47690d;
        return str == null ? "null" : str;
    }
}
