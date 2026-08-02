package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.P;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2126a implements P {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0371a implements P.a {
        public static void b(Iterable iterable, List list) {
            AbstractC2149y.a(iterable);
            if (!(iterable instanceof C)) {
                if (iterable instanceof Z) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    c(iterable, list);
                    return;
                }
            }
            List underlyingElements = ((C) iterable).getUnderlyingElements();
            C c10 = (C) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (c10.size() - size) + " is null.";
                    for (int size2 = c10.size() - 1; size2 >= size; size2--) {
                        c10.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC2132g) {
                    c10.U((AbstractC2132g) obj);
                } else if (obj instanceof byte[]) {
                    c10.U(AbstractC2132g.f((byte[]) obj));
                } else {
                    c10.add((String) obj);
                }
            }
        }

        public static void c(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        public static l0 d(P p10) {
            return new l0(p10);
        }
    }

    public static void b(Iterable iterable, List list) {
        AbstractC0371a.b(iterable, list);
    }

    public abstract int c(f0 f0Var);

    public l0 d() {
        return new l0(this);
    }

    public void e(OutputStream outputStream) {
        AbstractC2135j Y10 = AbstractC2135j.Y(outputStream, AbstractC2135j.C(getSerializedSize()));
        a(Y10);
        Y10.V();
    }
}
