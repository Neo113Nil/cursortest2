package P1;

import H1.InterfaceC1184q;
import H1.z;
import e1.AbstractC4134a;

/* loaded from: classes.dex */
public final class d extends z {

    /* renamed from: b, reason: collision with root package name */
    public final long f8706b;

    public d(InterfaceC1184q interfaceC1184q, long j10) {
        super(interfaceC1184q);
        AbstractC4134a.a(interfaceC1184q.getPosition() >= j10);
        this.f8706b = j10;
    }

    @Override // H1.z, H1.InterfaceC1184q
    public long getLength() {
        return super.getLength() - this.f8706b;
    }

    @Override // H1.z, H1.InterfaceC1184q
    public long getPosition() {
        return super.getPosition() - this.f8706b;
    }

    @Override // H1.z, H1.InterfaceC1184q
    public long i() {
        return super.i() - this.f8706b;
    }
}
