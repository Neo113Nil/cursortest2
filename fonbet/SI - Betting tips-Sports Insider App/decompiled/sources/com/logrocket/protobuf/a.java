package com.logrocket.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {
    protected int memoizedHashCode;

    public static void a(Iterable iterable, List list) {
        Charset charset = d0.f6681a;
        iterable.getClass();
        if (iterable instanceof i0) {
            List N = ((i0) iterable).N();
            i0 i0Var = (i0) list;
            int size = list.size();
            for (Object obj : N) {
                if (obj == null) {
                    String str = "Element at index " + (i0Var.size() - size) + " is null.";
                    for (int size2 = i0Var.size() - 1; size2 >= size; size2--) {
                        i0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof j) {
                    i0Var.C((j) obj);
                } else {
                    i0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof z0) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public abstract int b(g1 g1Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public final i d() {
        try {
            int b10 = ((z) this).b(null);
            i iVar = j.f6736b;
            byte[] bArr = new byte[b10];
            Logger logger = p.f6773d;
            k kVar = new k(bArr, 0, b10);
            e(kVar);
            if (kVar.P() == 0) {
                return new i(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            throw new RuntimeException(c("ByteString"), e7);
        }
    }

    public abstract void e(p pVar);
}
