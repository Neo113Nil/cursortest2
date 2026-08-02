package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gwh implements zd4, yd4 {
    public final sl4 a;
    public final tl4 b;
    public volatile int c;
    public volatile pd4 d;
    public volatile Object e;
    public volatile ntc f;
    public volatile qd4 g;

    public gwh(sl4 sl4Var, tl4 tl4Var) {
        this.a = sl4Var;
        this.b = tl4Var;
    }

    @Override // defpackage.yd4
    public final void a(pia piaVar, Object obj, xd4 xd4Var, int i, pia piaVar2) {
        this.b.a(piaVar, obj, xd4Var, this.f.c.e(), piaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (d(r0) == false) goto L12;
     */
    @Override // defpackage.zd4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        if (this.e != null) {
            Object obj = this.e;
            this.e = null;
        }
        if (this.d == null || !this.d.b()) {
            this.d = null;
            this.f = null;
            boolean z = false;
            while (!z && this.c < this.a.b().size()) {
                ArrayList b = this.a.b();
                int i = this.c;
                this.c = i + 1;
                this.f = (ntc) b.get(i);
                if (this.f != null && (this.a.p.a(this.f.c.e()) || this.a.c(this.f.c.c()) != null)) {
                    this.f.c.b(this.a.o, new y3g(this, this.f, false, 14));
                    z = true;
                }
            }
            return z;
        }
        return true;
    }

    @Override // defpackage.yd4
    public final void c(pia piaVar, Exception exc, xd4 xd4Var, int i) {
        this.b.c(piaVar, exc, xd4Var, this.f.c.e());
    }

    @Override // defpackage.zd4
    public final void cancel() {
        ntc ntcVar = this.f;
        if (ntcVar != null) {
            ntcVar.c.cancel();
        }
    }

    public final boolean d(Object obj) {
        Throwable th;
        int i = vib.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            ie4 g = this.a.c.a().g(obj);
            Object e = g.e();
            gn5 d = this.a.d(e);
            sx2 sx2Var = new sx2(d, e, this.a.i);
            pia piaVar = this.f.a;
            sl4 sl4Var = this.a;
            qd4 qd4Var = new qd4(piaVar, sl4Var.n);
            s35 d2 = sl4Var.h.d();
            d2.d(qd4Var, sx2Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                qd4Var.toString();
                obj.toString();
                d.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (d2.b(qd4Var) != null) {
                this.g = qd4Var;
                this.d = new pd4(Collections.singletonList(this.f.a), this.a, this);
                this.f.c.a();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.g);
                obj.toString();
            }
            try {
                this.b.a(this.f.a, g.e(), this.f.c, this.f.c.e(), this.f.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f.c.a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
