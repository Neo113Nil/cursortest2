package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class yi9 {
    static {
        gc2 gc2Var = gc2.d;
        q1f.o("\"\\");
        q1f.o("\t ,=");
    }

    public static final boolean a(d2g d2gVar) {
        if (Intrinsics.c(d2gVar.a.b, "HEAD")) {
            return false;
        }
        int i = d2gVar.d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || yol.e(d2gVar) != -1) {
            return true;
        }
        String a = d2gVar.f.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        return "chunked".equalsIgnoreCase(a);
    }

    public static final void b(ss3 ss3Var, jl9 jl9Var, q89 q89Var) {
        ss3Var.getClass();
        jl9Var.getClass();
        q89Var.getClass();
        if (ss3Var == ss3.m7) {
            return;
        }
        Pattern pattern = rs3.k;
        List d = q89Var.d("Set-Cookie");
        int size = d.size();
        List list = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            rs3 g0 = ml4.g0(jl9Var, (String) d.get(i));
            if (g0 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(g0);
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            list.getClass();
        }
        if (list == null) {
            list = km5.a;
        }
        if (list.isEmpty()) {
            return;
        }
        ss3Var.a(jl9Var, list);
    }
}
