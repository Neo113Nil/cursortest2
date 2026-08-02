package h3;

import java.math.BigInteger;
import java.util.Objects;

/* renamed from: h3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4444m extends AbstractC4437f {

    /* renamed from: c, reason: collision with root package name */
    public final BigInteger f47666c;

    public AbstractC4444m(EnumC4441j enumC4441j, BigInteger bigInteger) {
        super(enumC4441j);
        Objects.requireNonNull(bigInteger);
        this.f47666c = bigInteger;
    }

    @Override // h3.AbstractC4437f
    public boolean equals(Object obj) {
        if (obj instanceof AbstractC4444m) {
            AbstractC4444m abstractC4444m = (AbstractC4444m) obj;
            if (super.equals(obj) && this.f47666c.equals(abstractC4444m.f47666c)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger f() {
        return this.f47666c;
    }

    @Override // h3.AbstractC4437f
    public int hashCode() {
        return super.hashCode() ^ this.f47666c.hashCode();
    }

    public String toString() {
        return this.f47666c.toString();
    }
}
