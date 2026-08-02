package h3;

import java.util.Objects;

/* renamed from: h3.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4449r extends AbstractC4437f {

    /* renamed from: d, reason: collision with root package name */
    public static final C4449r f47680d = new C4449r(EnumC4450s.BREAK);

    /* renamed from: c, reason: collision with root package name */
    public final EnumC4450s f47681c;

    public C4449r(EnumC4450s enumC4450s) {
        super(EnumC4441j.SPECIAL);
        Objects.requireNonNull(enumC4450s);
        this.f47681c = enumC4450s;
    }

    @Override // h3.AbstractC4437f
    public boolean equals(Object obj) {
        if (obj instanceof C4449r) {
            C4449r c4449r = (C4449r) obj;
            if (super.equals(obj) && this.f47681c == c4449r.f47681c) {
                return true;
            }
        }
        return false;
    }

    @Override // h3.AbstractC4437f
    public int hashCode() {
        return super.hashCode() ^ Objects.hashCode(this.f47681c);
    }

    public String toString() {
        return this.f47681c.name();
    }
}
