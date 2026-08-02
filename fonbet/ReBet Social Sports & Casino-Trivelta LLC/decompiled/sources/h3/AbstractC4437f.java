package h3;

import java.util.Objects;

/* renamed from: h3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4437f {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC4441j f47651a;

    /* renamed from: b, reason: collision with root package name */
    public C4451t f47652b;

    public AbstractC4437f(EnumC4441j enumC4441j) {
        this.f47651a = enumC4441j;
        Objects.requireNonNull(enumC4441j, "majorType is null");
    }

    public EnumC4441j a() {
        return this.f47651a;
    }

    public C4451t b() {
        return this.f47652b;
    }

    public boolean c() {
        return this.f47652b != null;
    }

    public void d(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("tag number must be 0 or greater");
        }
        this.f47652b = new C4451t(j10);
    }

    public void e(C4451t c4451t) {
        Objects.requireNonNull(c4451t, "tag is null");
        this.f47652b = c4451t;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC4437f) {
            AbstractC4437f abstractC4437f = (AbstractC4437f) obj;
            C4451t c4451t = this.f47652b;
            if (c4451t != null) {
                return c4451t.equals(abstractC4437f.f47652b) && this.f47651a == abstractC4437f.f47651a;
            }
            if (abstractC4437f.f47652b == null && this.f47651a == abstractC4437f.f47651a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f47651a, this.f47652b);
    }
}
