package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ffb {
    public static final rm0 c = new rm0("internal:health-checking-config");
    public static final it7 d = new it7(27);
    public static final rm0 e = new rm0("internal:has-health-check-producer-listener");
    public static final rm0 f = new rm0("io.grpc.IS_PETIOLE_POLICY");
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ ffb(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public static void e(String str) {
        if (c.o(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.d(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    public static String g(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static String h(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static int x(int i) {
        return (i >> 24) & 255;
    }

    public xei a(cfb cfbVar) {
        List list = cfbVar.a;
        if (!list.isEmpty() || c()) {
            int i = this.b;
            this.b = i + 1;
            if (i == 0) {
                p(cfbVar);
            }
            this.b = 0;
            return xei.e;
        }
        xei h = xei.m.h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + cfbVar.b);
        o(h);
        return h;
    }

    public void b(int i) {
        switch (this.a) {
            case 2:
                this.b = i | this.b;
                break;
            default:
                this.b = i | this.b;
                break;
        }
    }

    public boolean c() {
        return false;
    }

    public abstract void d(rr8 rr8Var);

    public abstract void f(rr8 rr8Var);

    public boolean i(int i) {
        switch (this.a) {
            case 2:
                if ((this.b & i) == i) {
                }
                break;
            default:
                if ((this.b & i) == i) {
                }
                break;
        }
        return false;
    }

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract void o(xei xeiVar);

    public void p(cfb cfbVar) {
        int i = this.b;
        this.b = i + 1;
        if (i == 0) {
            a(cfbVar);
        }
        this.b = 0;
    }

    public abstract void r(rr8 rr8Var);

    public abstract void s(rr8 rr8Var, int i, int i2);

    public abstract void t(rr8 rr8Var);

    public String toString() {
        switch (this.a) {
            case 1:
                return g(this.b);
            case 5:
                return h(this.b);
            default:
                return super.toString();
        }
    }

    public abstract void u(rr8 rr8Var);

    public abstract void v(rr8 rr8Var, int i, int i2);

    public abstract n6g w(rr8 rr8Var);

    public abstract void z();

    public /* synthetic */ ffb(int i) {
        this.a = i;
    }

    public void y() {
    }

    public void q(rr8 rr8Var) {
    }
}
