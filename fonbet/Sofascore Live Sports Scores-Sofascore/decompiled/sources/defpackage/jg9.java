package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class jg9 extends hg9 {
    public long e;
    public boolean f;
    public final /* synthetic */ mg9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg9(mg9 mg9Var, jl9 jl9Var) {
        super(mg9Var, jl9Var);
        jl9Var.getClass();
        this.g = mg9Var;
        this.e = -1L;
        this.f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.c) {
            return;
        }
        if (this.f) {
            TimeZone timeZone = yol.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = yol.g(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.g.b.a();
                e(mg9.f);
            }
        }
        this.c = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (r12.f == false) goto L31;
     */
    @Override // defpackage.hg9, defpackage.cwh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(x52 x52Var, long j) {
        mg9 mg9Var = this.g;
        sx2 sx2Var = mg9Var.c;
        x52Var.getClass();
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            a70.r("closed");
            return 0L;
        }
        if (this.f) {
            long j2 = this.e;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    ((lof) sx2Var.b).n(Long.MAX_VALUE);
                }
                try {
                    this.e = ((lof) sx2Var.b).k();
                    String obj = StringsKt.l0(((lof) sx2Var.b).n(Long.MAX_VALUE)).toString();
                    if (this.e < 0 || (obj.length() > 0 && !c.v(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.e + obj + '\"');
                    }
                    if (this.e == 0) {
                        this.f = false;
                        am0 am0Var = mg9Var.e;
                        ef0 ef0Var = new ef0(1);
                        while (true) {
                            String n = ((lof) am0Var.c).n(am0Var.b);
                            am0Var.b -= n.length();
                            if (n.length() == 0) {
                                break;
                            }
                            ef0Var.c(n);
                        }
                        e(vha.i(ef0Var));
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long read = super.read(x52Var, Math.min(j, this.e));
            if (read != -1) {
                this.e -= read;
                return read;
            }
            mg9Var.b.a();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            e(mg9.f);
            throw protocolException;
        }
        return -1L;
    }
}
