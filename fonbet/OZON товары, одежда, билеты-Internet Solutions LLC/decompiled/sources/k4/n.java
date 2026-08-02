package k4;

import java.util.List;
import l3.C7855a;

/* loaded from: classes8.dex */
public abstract class n extends s3.g implements i {

    /* renamed from: d, reason: collision with root package name */
    private i f70472d;

    /* renamed from: e, reason: collision with root package name */
    private long f70473e;

    @Override // k4.i
    public final long a(int i11) {
        i iVar = this.f70472d;
        iVar.getClass();
        return iVar.a(i11) + this.f70473e;
    }

    @Override // k4.i
    public final int b() {
        i iVar = this.f70472d;
        iVar.getClass();
        return iVar.b();
    }

    @Override // k4.i
    public final int c(long j11) {
        i iVar = this.f70472d;
        iVar.getClass();
        return iVar.c(j11 - this.f70473e);
    }

    @Override // k4.i
    public final List<C7855a> d(long j11) {
        i iVar = this.f70472d;
        iVar.getClass();
        return iVar.d(j11 - this.f70473e);
    }

    @Override // s3.g, s3.AbstractC9587a
    public final void f() {
        super.f();
        this.f70472d = null;
    }

    public final void o(long j11, i iVar, long j12) {
        this.f98189b = j11;
        this.f70472d = iVar;
        if (j12 != Long.MAX_VALUE) {
            j11 = j12;
        }
        this.f70473e = j11;
    }
}
