package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j0f implements nlg {
    public final nlg a;
    public final long b;
    public final /* synthetic */ p0f c;

    public j0f(p0f p0fVar, nlg nlgVar) {
        nlgVar.getClass();
        this.c = p0fVar;
        this.a = nlgVar;
        this.b = egj.a();
    }

    @Override // defpackage.nlg
    public final String F0(int i) {
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            return this.a.F0(i);
        }
        b0a.R(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.nlg
    public final void L(int i, String str) {
        str.getClass();
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            this.a.L(i, str);
        } else {
            b0a.R(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.nlg
    public final boolean U0() {
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            return this.a.U0();
        }
        b0a.R(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            this.a.close();
        } else {
            b0a.R(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.nlg
    public final byte[] getBlob(int i) {
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            return this.a.getBlob(i);
        }
        b0a.R(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.nlg
    public final int getColumnCount() {
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            return this.a.getColumnCount();
        }
        b0a.R(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.nlg
    public final String getColumnName(int i) {
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            return this.a.getColumnName(i);
        }
        b0a.R(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.nlg
    public final long getLong(int i) {
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            return this.a.getLong(i);
        }
        b0a.R(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.nlg
    public final boolean isNull(int i) {
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            return this.a.isNull(i);
        }
        b0a.R(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.nlg
    public final void q(int i, long j) {
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            this.a.q(i, j);
        } else {
            b0a.R(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.nlg
    public final void r(int i, byte[] bArr) {
        bArr.getClass();
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            this.a.r(i, bArr);
        } else {
            b0a.R(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.nlg
    public final void reset() {
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            this.a.reset();
        } else {
            b0a.R(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.nlg
    public final void s(int i) {
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            this.a.s(i);
        } else {
            b0a.R(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.nlg
    public final void z() {
        if (this.c.e) {
            b0a.R(21, "Statement is recycled");
            throw null;
        }
        if (this.b == egj.a()) {
            this.a.z();
        } else {
            b0a.R(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
