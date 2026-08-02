package h1;

import e1.AbstractC4134a;
import e1.Z;
import java.util.ArrayList;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4406b implements InterfaceC4411g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f47528a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f47529b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f47530c;

    /* renamed from: d, reason: collision with root package name */
    public C4418n f47531d;

    public AbstractC4406b(boolean z10) {
        this.f47528a = z10;
    }

    @Override // h1.InterfaceC4411g
    public final void c(InterfaceC4403F interfaceC4403F) {
        AbstractC4134a.e(interfaceC4403F);
        if (this.f47529b.contains(interfaceC4403F)) {
            return;
        }
        this.f47529b.add(interfaceC4403F);
        this.f47530c++;
    }

    public final void o(int i10) {
        C4418n c4418n = (C4418n) Z.i(this.f47531d);
        for (int i11 = 0; i11 < this.f47530c; i11++) {
            ((InterfaceC4403F) this.f47529b.get(i11)).f(this, c4418n, this.f47528a, i10);
        }
    }

    public final void p() {
        C4418n c4418n = (C4418n) Z.i(this.f47531d);
        for (int i10 = 0; i10 < this.f47530c; i10++) {
            ((InterfaceC4403F) this.f47529b.get(i10)).i(this, c4418n, this.f47528a);
        }
        this.f47531d = null;
    }

    public final void q(C4418n c4418n) {
        for (int i10 = 0; i10 < this.f47530c; i10++) {
            ((InterfaceC4403F) this.f47529b.get(i10)).c(this, c4418n, this.f47528a);
        }
    }

    public final void r(C4418n c4418n) {
        this.f47531d = c4418n;
        for (int i10 = 0; i10 < this.f47530c; i10++) {
            ((InterfaceC4403F) this.f47529b.get(i10)).a(this, c4418n, this.f47528a);
        }
    }
}
