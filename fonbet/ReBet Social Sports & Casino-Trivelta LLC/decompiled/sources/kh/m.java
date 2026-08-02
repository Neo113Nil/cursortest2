package kh;

import ih.InterfaceC4548a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lh.C5466a;
import mh.AbstractC5587c;

/* loaded from: classes3.dex */
public final class m extends AbstractC5587c {

    /* renamed from: g, reason: collision with root package name */
    public final int f54501g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4548a f54502h;

    public /* synthetic */ m(int i10, int i11, InterfaceC4548a interfaceC4548a, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 4096 : i10, (i12 & 2) != 0 ? 1000 : i11, (i12 & 4) != 0 ? ih.b.f49148a : interfaceC4548a);
    }

    @Override // mh.AbstractC5587c
    /* renamed from: T1, reason: merged with bridge method [inline-methods] */
    public void D0(C5466a instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        super.D0(instance);
        if (instance.g().limit() != this.f54501g) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Buffer size mismatch. Expected: ");
            sb2.append(this.f54501g);
            sb2.append(", actual: ");
            sb2.append(instance.g().limit());
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (instance == C5466a.f55859j.a()) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled");
        }
        if (instance == AbstractC5255a.f54486g.a()) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (instance.A() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        }
        if (instance.y() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        }
        if (instance.z() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.");
        }
    }

    @Override // mh.AbstractC5587c
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C5466a r(C5466a instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        C5466a c5466a = (C5466a) super.r(instance);
        c5466a.F();
        c5466a.q();
        return c5466a;
    }

    @Override // mh.AbstractC5587c
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public void B(C5466a instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f54502h.a(instance.g());
        super.B(instance);
        instance.E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mh.AbstractC5587c
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public C5466a U() {
        return new C5466a(this.f54502h.b(this.f54501g), null, this, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i10, int i11, InterfaceC4548a allocator) {
        super(i11);
        Intrinsics.checkNotNullParameter(allocator, "allocator");
        this.f54501g = i10;
        this.f54502h = allocator;
    }
}
