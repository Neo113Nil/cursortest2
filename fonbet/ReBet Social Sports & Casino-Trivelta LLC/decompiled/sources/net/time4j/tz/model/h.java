package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import li.AbstractC5468b;
import net.time4j.B;
import net.time4j.F;
import net.time4j.Y;

/* loaded from: classes5.dex */
public final class h extends g {
    private static final long serialVersionUID = -946839310332554772L;

    /* renamed from: f, reason: collision with root package name */
    public final transient byte f58388f;

    public h(B b10, Y y10, int i10, i iVar, int i11) {
        super(b10, i10, iVar, i11);
        this.f58388f = (byte) y10.b();
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
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f58388f == hVar.f58388f && super.l(hVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.tz.model.d
    public int g() {
        return 122;
    }

    public int hashCode() {
        return (this.f58388f * 17) + (k() * 37);
    }

    @Override // net.time4j.tz.model.g
    public F j(int i10) {
        byte k10 = k();
        int d10 = AbstractC5468b.d(i10, k10);
        int c10 = AbstractC5468b.c(i10, k10, d10) - this.f58388f;
        if (c10 < 0) {
            c10 += 7;
        }
        return F.B0(i10, k10, d10 - c10);
    }

    public byte m() {
        return this.f58388f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LastDayOfWeekPattern:[month=");
        sb2.append((int) k());
        sb2.append(",day-of-week=");
        sb2.append(Y.f(this.f58388f));
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
