package e2;

import e1.AbstractC4134a;
import java.nio.ByteBuffer;

/* renamed from: e2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4168j extends k1.h implements l {

    /* renamed from: m, reason: collision with root package name */
    public final String f45600m;

    /* renamed from: e2.j$a */
    public class a extends q {
        public a() {
        }

        @Override // k1.g
        public void o() {
            AbstractC4168j.this.t(this);
        }
    }

    public AbstractC4168j(String str) {
        super(new p[2], new q[2]);
        this.f45600m = str;
        w(1024);
    }

    @Override // k1.h
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final m k(Throwable th2) {
        return new m("Unexpected decode error", th2);
    }

    public abstract InterfaceC4169k B(byte[] bArr, int i10, boolean z10);

    @Override // k1.h
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final m l(p pVar, q qVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC4134a.e(pVar.f54108d);
            qVar.p(pVar.f54110f, B(byteBuffer.array(), byteBuffer.limit(), z10), pVar.f45613j);
            qVar.f54118d = false;
            return null;
        } catch (m e10) {
            return e10;
        }
    }

    @Override // k1.h
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final p i() {
        return new p();
    }

    @Override // k1.h
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final q j() {
        return new a();
    }

    @Override // e2.l
    public void b(long j10) {
    }
}
