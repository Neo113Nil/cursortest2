package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fk3 {
    public final boolean a;
    public String[] b;
    public String[] c;
    public boolean d;

    public fk3(hk3 hk3Var) {
        this.a = hk3Var.a;
        this.b = hk3Var.b;
        this.c = hk3Var.c;
        this.d = hk3Var.d;
    }

    public gk3 a() {
        return new gk3(this.a, this.d, this.b, this.c);
    }

    public void b(tu2... tu2VarArr) {
        boolean z = this.a;
        if (!z) {
            a70.p("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(tu2VarArr.length);
        for (tu2 tu2Var : tu2VarArr) {
            arrayList.add(tu2Var.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            a70.p("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.b = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            a70.p("At least one cipher suite is required");
        }
    }

    public void c(uu2... uu2VarArr) {
        if (!this.a) {
            a70.r("no cipher suites for cleartext connections");
            return;
        }
        String[] strArr = new String[uu2VarArr.length];
        for (int i = 0; i < uu2VarArr.length; i++) {
            strArr[i] = uu2VarArr[i].a;
        }
        this.b = strArr;
    }

    public void d(ljj... ljjVarArr) {
        boolean z = this.a;
        if (!z) {
            a70.p("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(ljjVarArr.length);
        for (ljj ljjVar : ljjVarArr) {
            arrayList.add(ljjVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            a70.p("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            a70.p("At least one TLS version is required");
        }
    }

    public void e(mjj... mjjVarArr) {
        if (!this.a) {
            a70.r("no TLS versions for cleartext connections");
            return;
        }
        if (mjjVarArr.length == 0) {
            a70.p("At least one TlsVersion is required");
            return;
        }
        String[] strArr = new String[mjjVarArr.length];
        for (int i = 0; i < mjjVarArr.length; i++) {
            strArr[i] = mjjVarArr[i].a;
        }
        this.c = strArr;
    }

    public fk3(boolean z) {
        this.a = z;
    }

    public fk3() {
        this.a = true;
    }
}
