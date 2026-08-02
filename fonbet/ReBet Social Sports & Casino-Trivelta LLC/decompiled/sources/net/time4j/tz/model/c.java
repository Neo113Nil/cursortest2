package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import li.AbstractC5468b;
import net.time4j.B;
import net.time4j.EnumC5706f;
import net.time4j.F;
import net.time4j.Y;

/* loaded from: classes5.dex */
public final class c extends g {
    private static final long serialVersionUID = -7354650946442523175L;

    /* renamed from: f, reason: collision with root package name */
    public final transient byte f58379f;

    /* renamed from: g, reason: collision with root package name */
    public final transient byte f58380g;

    /* renamed from: h, reason: collision with root package name */
    public final transient boolean f58381h;

    public c(B b10, int i10, Y y10, int i11, i iVar, int i12, boolean z10) {
        super(b10, i11, iVar, i12);
        AbstractC5468b.a(2000, b10.b(), i10);
        this.f58379f = (byte) i10;
        this.f58380g = (byte) y10.b();
        this.f58381h = z10;
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
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f58379f == cVar.f58379f && this.f58380g == cVar.f58380g && this.f58381h == cVar.f58381h && super.l(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.tz.model.d
    public int g() {
        return 121;
    }

    public int hashCode() {
        return this.f58379f + ((this.f58380g + (k() * 37)) * 17) + (this.f58381h ? 1 : 0);
    }

    @Override // net.time4j.tz.model.g
    public F j(int i10) {
        int i11;
        byte k10 = k();
        int c10 = AbstractC5468b.c(i10, k10, this.f58379f);
        F B02 = F.B0(i10, k10, this.f58379f);
        byte b10 = this.f58380g;
        if (c10 == b10) {
            return B02;
        }
        int i12 = c10 - b10;
        if (this.f58381h) {
            i12 = -i12;
            i11 = 1;
        } else {
            i11 = -1;
        }
        if (i12 < 0) {
            i12 += 7;
        }
        return (F) B02.E(i12 * i11, EnumC5706f.f57798h);
    }

    public int m() {
        return this.f58379f;
    }

    public byte n() {
        return this.f58380g;
    }

    public boolean o() {
        return this.f58381h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DayOfWeekInMonthPattern:[month=");
        sb2.append((int) k());
        sb2.append(",dayOfMonth=");
        sb2.append((int) this.f58379f);
        sb2.append(",dayOfWeek=");
        sb2.append(Y.f(this.f58380g));
        sb2.append(",day-overflow=");
        sb2.append(c());
        sb2.append(",time-of-day=");
        sb2.append(f());
        sb2.append(",offset-indicator=");
        sb2.append(d());
        sb2.append(",dst-offset=");
        sb2.append(e());
        sb2.append(",after=");
        sb2.append(this.f58381h);
        sb2.append(']');
        return sb2.toString();
    }
}
