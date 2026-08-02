package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import xsna.byy;
import xsna.kj90;
import xsna.lbd0;
import xsna.mye0;
import xsna.oa20;
import xsna.yyc0;

/* compiled from: PreferencesProto.java */
/* loaded from: classes.dex */
public final class a extends GeneratedMessageLite<a, C0026a> implements oa20 {
    private static final a DEFAULT_INSTANCE;
    private static volatile kj90<a> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private p.c<String> strings_ = z.d();

    /* compiled from: PreferencesProto.java */
    /* renamed from: androidx.datastore.preferences.a$a, reason: collision with other inner class name */
    /* loaded from: classes12.dex */
    public static final class C0026a extends GeneratedMessageLite.a<a, C0026a> implements oa20 {
        public /* synthetic */ C0026a(int i) {
            this();
        }

        public final void k(Iterable iterable) {
            j();
            a.o((a) this.c, iterable);
        }

        public C0026a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.m(a.class, aVar);
    }

    public static void o(a aVar, Iterable iterable) {
        p.c<String> cVar = aVar.strings_;
        if (!cVar.isModifiable()) {
            int size = cVar.size();
            aVar.strings_ = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        List list = aVar.strings_;
        Charset charset = p.a;
        iterable.getClass();
        if (!(iterable instanceof byy)) {
            if (iterable instanceof lbd0) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
            return;
        }
        List<?> underlyingElements = ((byy) iterable).getUnderlyingElements();
        byy byyVar = (byy) list;
        int size4 = list.size();
        for (Object obj2 : underlyingElements) {
            if (obj2 == null) {
                String str2 = "Element at index " + (byyVar.size() - size4) + " is null.";
                for (int size5 = byyVar.size() - 1; size5 >= size4; size5--) {
                    byyVar.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof ByteString) {
                byyVar.T();
            } else if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                ByteString.e(0, bArr.length, bArr);
                byyVar.T();
            } else {
                byyVar.add((String) obj2);
            }
        }
    }

    public static a p() {
        return DEFAULT_INSTANCE;
    }

    public static C0026a r() {
        return (C0026a) ((GeneratedMessageLite.a) DEFAULT_INSTANCE.f(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object f(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        kj90 kj90Var;
        switch (yyc0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new C0026a(0);
            case 3:
                return new mye0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                kj90<a> kj90Var2 = PARSER;
                if (kj90Var2 != null) {
                    return kj90Var2;
                }
                synchronized (a.class) {
                    try {
                        kj90Var = PARSER;
                        if (kj90Var == null) {
                            kj90Var = new GeneratedMessageLite.b(DEFAULT_INSTANCE);
                            PARSER = kj90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return kj90Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final p.c q() {
        return this.strings_;
    }
}
