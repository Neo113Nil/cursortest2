package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.ByteString;
import androidx.health.platform.client.proto.CodedOutputStream;
import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.a.AbstractC0036a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import xsna.ibd0;
import xsna.ja20;
import xsna.ma20;
import xsna.zxy;

/* compiled from: AbstractMessageLite.java */
/* loaded from: classes12.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0036a<MessageType, BuilderType>> implements ja20 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: androidx.health.platform.client.proto.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0036a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0036a<MessageType, BuilderType>> implements ma20, Cloneable {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(ArrayList arrayList, List list) {
        Charset charset = b0.a;
        if (!(arrayList instanceof zxy)) {
            if (arrayList instanceof ibd0) {
                list.addAll(arrayList);
                return;
            }
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
            }
            int size = list.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
            return;
        }
        List<?> underlyingElements = ((zxy) arrayList).getUnderlyingElements();
        zxy zxyVar = (zxy) list;
        int size3 = list.size();
        for (Object obj : underlyingElements) {
            if (obj == null) {
                String str2 = "Element at index " + (zxyVar.size() - size3) + " is null.";
                for (int size4 = zxyVar.size() - 1; size4 >= size3; size4--) {
                    zxyVar.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            if (obj instanceof ByteString) {
                zxyVar.T();
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                ByteString.e(0, bArr.length, bArr);
                zxyVar.T();
            } else {
                zxyVar.add((String) obj);
            }
        }
    }

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int e(w0 w0Var) {
        int d = d();
        if (d != -1) {
            return d;
        }
        int h = w0Var.h(this);
        g(h);
        return h;
    }

    public final String f(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void g(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.ja20
    public final ByteString.f toByteString() {
        try {
            int e = ((GeneratedMessageLite) this).e(null);
            ByteString.f fVar = ByteString.b;
            byte[] bArr = new byte[e];
            Logger logger = CodedOutputStream.b;
            CodedOutputStream.a aVar = new CodedOutputStream.a(bArr, e);
            ((GeneratedMessageLite) this).b(aVar);
            if (aVar.X() == 0) {
                return new ByteString.f(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException(f("ByteString"), e2);
        }
    }
}
