package Qc;

/* loaded from: classes4.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public int f9630a = 3;

    @Override // Qc.n
    public int a() {
        int i10 = this.f9630a;
        c();
        return i10;
    }

    public final boolean b(int i10) {
        return i10 % 10 == 1;
    }

    public final void c() {
        int i10 = this.f9630a + 2;
        this.f9630a = i10;
        if (b(i10)) {
            this.f9630a += 2;
        }
    }
}
