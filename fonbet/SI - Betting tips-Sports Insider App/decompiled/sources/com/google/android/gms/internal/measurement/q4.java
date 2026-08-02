package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class q4 {
    protected int zza;

    public static void c(Iterable iterable, List list) {
        Charset charset = n5.f5148a;
        iterable.getClass();
        if (iterable instanceof d6) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof f6) {
                f6 f6Var = (f6) list;
                int i5 = f6Var.f5045c + size;
                int length = f6Var.f5044b.length;
                if (i5 > length) {
                    if (length != 0) {
                        while (length < i5) {
                            length = androidx.appcompat.widget.c1.h(length, 3, 2, 1, 10);
                        }
                        f6Var.f5044b = Arrays.copyOf(f6Var.f5044b, length);
                    } else {
                        f6Var.f5044b = new Object[Math.max(i5, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    f5.a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj2 = list2.get(i10);
            if (obj2 == null) {
                f5.a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] a() {
        try {
            g5 g5Var = (g5) this;
            int k6 = g5Var.k();
            byte[] bArr = new byte[k6];
            x4 x4Var = new x4(k6, bArr);
            g5Var.d(x4Var);
            if (k6 - x4Var.f5358e == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            String name = getClass().getName();
            throw new RuntimeException(d9.e.m(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e7);
        }
    }

    public abstract int b(h6 h6Var);
}
