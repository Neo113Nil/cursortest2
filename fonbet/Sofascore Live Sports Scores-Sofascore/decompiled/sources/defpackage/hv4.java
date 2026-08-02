package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hv4 implements ejh {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;

    public hv4(mg9 mg9Var) {
        this.a = 2;
        this.d = mg9Var;
        this.c = new on8(((kof) mg9Var.c.c).a.timeout());
    }

    @Override // defpackage.ejh
    public final void W(x52 x52Var, long j) {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                Deflater deflater = (Deflater) obj;
                x52Var.getClass();
                yqo.x(x52Var.b, 0L, j);
                long j2 = j;
                while (j2 > 0) {
                    b1h b1hVar = x52Var.a;
                    b1hVar.getClass();
                    int min = (int) Math.min(j2, b1hVar.c - b1hVar.b);
                    deflater.setInput(b1hVar.a, b1hVar.b, min);
                    e(false);
                    long j3 = min;
                    x52Var.b -= j3;
                    int i2 = b1hVar.b + min;
                    b1hVar.b = i2;
                    if (i2 == b1hVar.c) {
                        x52Var.a = b1hVar.a();
                        o1h.a(b1hVar);
                    }
                    j2 -= j3;
                }
                deflater.setInput(qx9.g, 0, 0);
                break;
            case 1:
                if (this.b) {
                    x52Var.skip(j);
                    break;
                } else {
                    try {
                        ((ejh) this.c).W(x52Var, j);
                        break;
                    } catch (IOException e) {
                        this.b = true;
                        ((kz3) obj).invoke(e);
                        return;
                    }
                }
            default:
                x52Var.getClass();
                if (!this.b) {
                    wol.a(x52Var.b, 0L, j);
                    ((kof) ((mg9) obj).c.c).W(x52Var, j);
                    break;
                } else {
                    a70.r("closed");
                    break;
                }
        }
    }

    @Override // defpackage.ejh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                Deflater deflater = (Deflater) obj2;
                if (this.b) {
                    return;
                }
                try {
                    deflater.finish();
                    e(false);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    deflater.end();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((kof) obj).close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.b = true;
                if (th != null) {
                    throw th;
                }
                return;
            case 1:
                try {
                    ((ejh) obj).close();
                    return;
                } catch (IOException e) {
                    this.b = true;
                    ((kz3) obj2).invoke(e);
                    return;
                }
            default:
                mg9 mg9Var = (mg9) obj2;
                if (this.b) {
                    return;
                }
                this.b = true;
                on8 on8Var = (on8) obj;
                pij pijVar = on8Var.e;
                on8Var.e = pij.d;
                pijVar.a();
                pijVar.b();
                mg9Var.d = 3;
                return;
        }
    }

    public void e(boolean z) {
        b1h Q0;
        int deflate;
        Deflater deflater = (Deflater) this.d;
        kof kofVar = (kof) this.c;
        x52 x52Var = kofVar.b;
        while (true) {
            Q0 = x52Var.Q0(1);
            byte[] bArr = Q0.a;
            int i = Q0.c;
            if (z) {
                try {
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (IllegalStateException e) {
                    cp4.i("Deflater already closed", e);
                    return;
                } catch (NullPointerException e2) {
                    cp4.i("Deflater already closed", e2);
                    return;
                }
            } else {
                deflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (deflate > 0) {
                Q0.c += deflate;
                x52Var.b += deflate;
                kofVar.k();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (Q0.b == Q0.c) {
            x52Var.a = Q0.a();
            o1h.a(Q0);
        }
    }

    @Override // defpackage.ejh, java.io.Flushable
    public final void flush() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                e(true);
                ((kof) obj).flush();
                break;
            case 1:
                try {
                    ((ejh) obj).flush();
                    break;
                } catch (IOException e) {
                    this.b = true;
                    ((kz3) obj2).invoke(e);
                    return;
                }
            default:
                if (!this.b) {
                    ((kof) ((mg9) obj2).c.c).flush();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ejh
    public final pij timeout() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((kof) obj).a.timeout();
            case 1:
                return ((ejh) obj).timeout();
            default:
                return (on8) obj;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "DeflaterSink(" + ((kof) this.c) + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hv4(ejh ejhVar, Object obj, int i) {
        this.a = i;
        this.c = ejhVar;
        this.d = obj;
    }
}
