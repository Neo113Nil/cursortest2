package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class b0g {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final jl9 b;
    public String c;
    public il9 d;
    public final pzf e = new pzf();
    public final ef0 f;
    public zdc g;
    public final boolean h;
    public final l2a i;
    public final lm8 j;
    public yzf k;

    public b0g(String str, jl9 jl9Var, String str2, q89 q89Var, zdc zdcVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = jl9Var;
        this.c = str2;
        this.g = zdcVar;
        this.h = z;
        if (q89Var != null) {
            this.f = vha.k(q89Var);
        } else {
            this.f = new ef0(1);
        }
        if (z2) {
            lm8 lm8Var = new lm8();
            lm8Var.a = new ArrayList();
            lm8Var.b = new ArrayList();
            this.j = lm8Var;
            return;
        }
        if (z3) {
            l2a l2aVar = new l2a(14);
            this.i = l2aVar;
            zdc zdcVar2 = ezc.h;
            zdcVar2.getClass();
            if (Intrinsics.c(zdcVar2.b, "multipart")) {
                l2aVar.c = zdcVar2;
            } else {
                hg6.e(zdcVar2, "multipart != ");
                throw null;
            }
        }
    }

    public final void a(String str, String str2, boolean z) {
        lm8 lm8Var = this.j;
        if (z) {
            lm8Var.getClass();
            str.getClass();
            lm8Var.a.add(rz8.x(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            lm8Var.b.add(rz8.x(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        lm8Var.getClass();
        str.getClass();
        lm8Var.a.add(rz8.x(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        lm8Var.b.add(rz8.x(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Regex regex = zdc.e;
                this.g = bea.v(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(dmi.q("Malformed content type: ", str2), e);
            }
        }
        ef0 ef0Var = this.f;
        if (z) {
            ef0Var.d(str, str2);
        } else {
            ef0Var.b(str, str2);
        }
    }

    public final void c(q89 q89Var, yzf yzfVar) {
        l2a l2aVar = this.i;
        l2aVar.getClass();
        yzfVar.getClass();
        if (q89Var.a("Content-Type") != null) {
            a70.p("Unexpected header: Content-Type");
        } else if (q89Var.a("Content-Length") != null) {
            a70.p("Unexpected header: Content-Length");
        } else {
            ((ArrayList) l2aVar.d).add(new dzc(q89Var, yzfVar));
        }
    }

    public final void d(String str, String str2, boolean z) {
        il9 il9Var;
        String str3 = this.c;
        if (str3 != null) {
            jl9 jl9Var = this.b;
            jl9Var.getClass();
            try {
                il9Var = new il9(0);
                il9Var.h(jl9Var, str3);
            } catch (IllegalArgumentException unused) {
                il9Var = null;
            }
            this.d = il9Var;
            if (il9Var == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(jl9Var);
                String str4 = this.c;
                sb.append(", Relative: ");
                sb.append(str4);
                throw new IllegalArgumentException(sb.toString());
            }
            this.c = null;
        }
        il9 il9Var2 = this.d;
        if (!z) {
            il9Var2.a(str, str2);
            return;
        }
        il9Var2.getClass();
        str.getClass();
        ArrayList arrayList = (ArrayList) il9Var2.i;
        if (arrayList == null) {
            arrayList = new ArrayList();
            il9Var2.i = arrayList;
        }
        arrayList.add(rz8.w(0, 0, str, " \"'<>#&=", 83));
        ArrayList arrayList2 = (ArrayList) il9Var2.i;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? rz8.w(0, 0, str2, " \"'<>#&=", 83) : null);
    }
}
