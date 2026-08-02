package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ik3 implements nlg {
    public final nlg a;

    public ik3(nlg nlgVar) {
        nlgVar.getClass();
        this.a = nlgVar;
    }

    @Override // defpackage.nlg
    public final String F0(int i) {
        return this.a.F0(i);
    }

    @Override // defpackage.nlg
    public final void L(int i, String str) {
        str.getClass();
        this.a.L(i, str);
    }

    @Override // defpackage.nlg
    public final boolean U0() {
        return this.a.U0();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        nlg nlgVar = this.a;
        nlgVar.reset();
        nlgVar.z();
    }

    @Override // defpackage.nlg
    public final byte[] getBlob(int i) {
        return this.a.getBlob(i);
    }

    @Override // defpackage.nlg
    public final int getColumnCount() {
        return this.a.getColumnCount();
    }

    @Override // defpackage.nlg
    public final String getColumnName(int i) {
        return this.a.getColumnName(i);
    }

    @Override // defpackage.nlg
    public final long getLong(int i) {
        return this.a.getLong(i);
    }

    @Override // defpackage.nlg
    public final boolean isNull(int i) {
        return this.a.isNull(i);
    }

    @Override // defpackage.nlg
    public final void q(int i, long j) {
        this.a.q(i, j);
    }

    @Override // defpackage.nlg
    public final void r(int i, byte[] bArr) {
        bArr.getClass();
        this.a.r(i, bArr);
    }

    @Override // defpackage.nlg
    public final void reset() {
        this.a.reset();
    }

    @Override // defpackage.nlg
    public final void s(int i) {
        this.a.s(i);
    }

    @Override // defpackage.nlg
    public final boolean v0() {
        return this.a.v0();
    }

    @Override // defpackage.nlg
    public final void z() {
        this.a.z();
    }
}
