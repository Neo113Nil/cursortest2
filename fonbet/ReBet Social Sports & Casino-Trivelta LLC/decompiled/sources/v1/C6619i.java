package v1;

import e1.AbstractC4134a;
import java.nio.ByteBuffer;

/* renamed from: v1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6619i extends k1.f {

    /* renamed from: j, reason: collision with root package name */
    public long f66963j;

    /* renamed from: k, reason: collision with root package name */
    public int f66964k;

    /* renamed from: l, reason: collision with root package name */
    public int f66965l;

    public C6619i() {
        super(2);
        this.f66965l = 32;
    }

    public void A(int i10) {
        AbstractC4134a.a(i10 > 0);
        this.f66965l = i10;
    }

    @Override // k1.f, k1.AbstractC5145a
    public void f() {
        super.f();
        this.f66964k = 0;
    }

    public boolean u(k1.f fVar) {
        AbstractC4134a.a(!fVar.r());
        AbstractC4134a.a(!fVar.h());
        AbstractC4134a.a(!fVar.i());
        if (!v(fVar)) {
            return false;
        }
        int i10 = this.f66964k;
        this.f66964k = i10 + 1;
        if (i10 == 0) {
            this.f54110f = fVar.f54110f;
            if (fVar.k()) {
                n(1);
            }
        }
        ByteBuffer byteBuffer = fVar.f54108d;
        if (byteBuffer != null) {
            p(byteBuffer.remaining());
            this.f54108d.put(byteBuffer);
        }
        this.f66963j = fVar.f54110f;
        return true;
    }

    public final boolean v(k1.f fVar) {
        ByteBuffer byteBuffer;
        if (!z()) {
            return true;
        }
        if (this.f66964k >= this.f66965l) {
            return false;
        }
        ByteBuffer byteBuffer2 = fVar.f54108d;
        return byteBuffer2 == null || (byteBuffer = this.f54108d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long w() {
        return this.f54110f;
    }

    public long x() {
        return this.f66963j;
    }

    public int y() {
        return this.f66964k;
    }

    public boolean z() {
        return this.f66964k > 0;
    }
}
