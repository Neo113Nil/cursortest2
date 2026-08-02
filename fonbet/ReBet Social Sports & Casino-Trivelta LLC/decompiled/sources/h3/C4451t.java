package h3;

/* renamed from: h3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4451t extends AbstractC4437f {

    /* renamed from: c, reason: collision with root package name */
    public final long f47689c;

    public C4451t(long j10) {
        super(EnumC4441j.TAG);
        this.f47689c = j10;
    }

    @Override // h3.AbstractC4437f
    public boolean equals(Object obj) {
        if (obj instanceof C4451t) {
            C4451t c4451t = (C4451t) obj;
            if (super.equals(obj) && this.f47689c == c4451t.f47689c) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f47689c;
    }

    @Override // h3.AbstractC4437f
    public int hashCode() {
        return super.hashCode() ^ Long.valueOf(this.f47689c).hashCode();
    }

    public String toString() {
        return "Tag(" + this.f47689c + ")";
    }
}
