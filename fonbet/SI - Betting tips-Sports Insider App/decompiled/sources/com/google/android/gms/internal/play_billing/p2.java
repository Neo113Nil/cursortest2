package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p2 extends g3 {
    private static final p2 zzb;
    private k3 zzd = b4.f5403e;

    static {
        p2 p2Var = new p2();
        zzb = p2Var;
        g3.k(p2.class, p2Var);
    }

    public static o2 n() {
        return (o2) zzb.f();
    }

    public static void o(p2 p2Var, Iterable iterable) {
        k3 k3Var = p2Var.zzd;
        if (!((u2) k3Var).f5599a) {
            int size = k3Var.size();
            p2Var.zzd = k3Var.k(size + size);
        }
        List list = p2Var.zzd;
        Charset charset = l3.f5497a;
        iterable.getClass();
        if (iterable instanceof z3) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size2 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size2);
            }
            if (list instanceof b4) {
                b4 b4Var = (b4) list;
                int i5 = b4Var.f5405c + size2;
                int length = b4Var.f5404b.length;
                if (i5 > length) {
                    if (length != 0) {
                        while (length < i5) {
                            length = androidx.appcompat.widget.c1.h(length, 3, 2, 1, 10);
                        }
                        b4Var.f5404b = Arrays.copyOf(b4Var.f5404b, length);
                    } else {
                        b4Var.f5404b = new Object[Math.max(i5, 10)];
                    }
                }
            }
        }
        int size3 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    f3.a(size3, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size4 = list2.size();
        for (int i10 = 0; i10 < size4; i10++) {
            Object obj2 = list2.get(i10);
            if (obj2 == null) {
                f3.a(size3, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", n2.class});
        }
        if (i10 == 3) {
            return new p2();
        }
        if (i10 == 4) {
            return new o2(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
