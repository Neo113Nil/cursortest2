package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jni extends lni {
    public final /* synthetic */ int d = 1;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jni(dni dniVar, String str) {
        super(dniVar, str);
        dniVar.getClass();
        str.getClass();
        this.e = dniVar.o0(str);
    }

    @Override // defpackage.nlg
    public final String F0(int i) {
        switch (this.d) {
            case 0:
                return ((kni) this.e).F0(i);
            case 1:
                h();
                b0a.R(21, "no row");
                throw null;
            default:
                h();
                b0a.R(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.nlg
    public final void L(int i, String str) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                str.getClass();
                ((kni) obj).L(i, str);
                return;
            case 1:
                str.getClass();
                h();
                ((mni) obj).m0(i, str);
                return;
            default:
                str.getClass();
                h();
                b0a.R(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.nlg
    public final boolean U0() {
        int i = this.d;
        dni dniVar = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                kni kniVar = (kni) obj;
                boolean U0 = kniVar.U0();
                if (!kniVar.F0(0).equalsIgnoreCase("wal")) {
                    dniVar.D();
                    break;
                } else {
                    dniVar.N();
                    break;
                }
            case 1:
                h();
                ((mni) obj).v();
                break;
            default:
                int ordinal = ((ini) obj).ordinal();
                if (ordinal == 0) {
                    dniVar.O();
                    dniVar.U();
                    break;
                } else if (ordinal == 1) {
                    dniVar.U();
                    break;
                } else if (ordinal == 2) {
                    dniVar.A();
                    break;
                } else if (ordinal == 3) {
                    dniVar.Q();
                    break;
                } else if (ordinal != 4) {
                    zzl.b();
                    break;
                } else {
                    dniVar.s0();
                    break;
                }
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((kni) obj).close();
                break;
            case 1:
                ((mni) obj).close();
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
    }

    @Override // defpackage.nlg
    public final byte[] getBlob(int i) {
        switch (this.d) {
            case 0:
                return ((kni) this.e).getBlob(i);
            case 1:
                h();
                b0a.R(21, "no row");
                throw null;
            default:
                h();
                b0a.R(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.nlg
    public final int getColumnCount() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                h();
                break;
            default:
                h();
                break;
        }
        return 0;
    }

    @Override // defpackage.nlg
    public final String getColumnName(int i) {
        switch (this.d) {
            case 0:
                return ((kni) this.e).getColumnName(i);
            case 1:
                h();
                b0a.R(21, "no row");
                throw null;
            default:
                h();
                b0a.R(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.nlg
    public final long getLong(int i) {
        switch (this.d) {
            case 0:
                return ((kni) this.e).getLong(i);
            case 1:
                h();
                b0a.R(21, "no row");
                throw null;
            default:
                h();
                b0a.R(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.nlg
    public final boolean isNull(int i) {
        switch (this.d) {
            case 0:
                return ((kni) this.e).isNull(i);
            case 1:
                h();
                b0a.R(21, "no row");
                throw null;
            default:
                h();
                b0a.R(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.nlg
    public final void q(int i, long j) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                ((kni) obj).q(i, j);
                return;
            case 1:
                h();
                ((mni) obj).q(i, j);
                return;
            default:
                h();
                b0a.R(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.nlg
    public final void r(int i, byte[] bArr) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                bArr.getClass();
                ((kni) obj).r(i, bArr);
                return;
            case 1:
                bArr.getClass();
                h();
                ((mni) obj).r(i, bArr);
                return;
            default:
                bArr.getClass();
                h();
                b0a.R(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.lni, defpackage.nlg
    public void reset() {
        switch (this.d) {
            case 0:
                ((kni) this.e).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // defpackage.nlg
    public final void s(int i) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                ((kni) obj).s(i);
                return;
            case 1:
                h();
                ((mni) obj).s(i);
                return;
            default:
                h();
                b0a.R(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.nlg
    public boolean v0() {
        switch (this.d) {
            case 0:
                return ((kni) this.e).v0();
            default:
                return super.v0();
        }
    }

    @Override // defpackage.lni, defpackage.nlg
    public void z() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((kni) obj).z();
                break;
            case 1:
                h();
                ((mni) obj).z();
                break;
            default:
                super.z();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jni(dni dniVar, String str, ini iniVar) {
        super(dniVar, str);
        dniVar.getClass();
        str.getClass();
        this.e = iniVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jni(dni dniVar, String str, kni kniVar) {
        super(dniVar, str);
        dniVar.getClass();
        str.getClass();
        this.e = kniVar;
    }
}
