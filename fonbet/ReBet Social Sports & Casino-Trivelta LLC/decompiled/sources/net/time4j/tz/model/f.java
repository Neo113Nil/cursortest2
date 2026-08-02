package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import li.AbstractC5468b;
import net.time4j.B;
import net.time4j.F;

/* loaded from: classes5.dex */
public final class f extends g {
    private static final long serialVersionUID = 3957240859230862745L;

    /* renamed from: f, reason: collision with root package name */
    public final transient byte f58386f;

    public f(B b10, int i10, int i11, i iVar, int i12) {
        super(b10, i11, iVar, i12);
        AbstractC5468b.a(2000, b10.b(), i10);
        this.f58386f = (byte) i10;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, g());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f58386f == fVar.f58386f && super.l(fVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.tz.model.d
    public int g() {
        return 120;
    }

    public int hashCode() {
        return this.f58386f + (k() * 37);
    }

    @Override // net.time4j.tz.model.g
    public F j(int i10) {
        return F.B0(i10, k(), this.f58386f);
    }

    public int m() {
        return this.f58386f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("FixedDayPattern:[month=");
        sb2.append((int) k());
        sb2.append(",day-of-month=");
        sb2.append((int) this.f58386f);
        sb2.append(",day-overflow=");
        sb2.append(c());
        sb2.append(",time-of-day=");
        sb2.append(f());
        sb2.append(",offset-indicator=");
        sb2.append(d());
        sb2.append(",dst-offset=");
        sb2.append(e());
        sb2.append(']');
        return sb2.toString();
    }
}
