package e2;

import e1.AbstractC4134a;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public abstract class q extends k1.g implements InterfaceC4169k {

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4169k f45614e;

    /* renamed from: f, reason: collision with root package name */
    public long f45615f;

    @Override // e2.InterfaceC4169k
    public int a(long j10) {
        return ((InterfaceC4169k) AbstractC4134a.e(this.f45614e)).a(j10 - this.f45615f);
    }

    @Override // e2.InterfaceC4169k
    public List b(long j10) {
        return ((InterfaceC4169k) AbstractC4134a.e(this.f45614e)).b(j10 - this.f45615f);
    }

    @Override // e2.InterfaceC4169k
    public long c(int i10) {
        return ((InterfaceC4169k) AbstractC4134a.e(this.f45614e)).c(i10) + this.f45615f;
    }

    @Override // e2.InterfaceC4169k
    public int d() {
        return ((InterfaceC4169k) AbstractC4134a.e(this.f45614e)).d();
    }

    @Override // k1.g, k1.AbstractC5145a
    public void f() {
        super.f();
        this.f45614e = null;
    }

    public void p(long j10, InterfaceC4169k interfaceC4169k, long j11) {
        this.f54116b = j10;
        this.f45614e = interfaceC4169k;
        if (j11 != LongCompanionObject.MAX_VALUE) {
            j10 = j11;
        }
        this.f45615f = j10;
    }
}
