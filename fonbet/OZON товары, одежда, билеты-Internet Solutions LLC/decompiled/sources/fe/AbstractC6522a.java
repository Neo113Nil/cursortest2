package fe;

import Td.h;
import ee.C6349a;
import fe.N;
import ge.C6718a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: fe.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6522a<A> implements InterfaceC6529h<A> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6718a f63199a;

    /* renamed from: fe.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C1010a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63200a;

        static {
            int[] iArr = new int[EnumC6525d.values().length];
            try {
                iArr[EnumC6525d.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6525d.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6525d.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63200a = iArr;
        }
    }

    public AbstractC6522a(@NotNull C6718a protocol) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.f63199a = protocol;
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final ArrayList a(@NotNull N.a container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Iterable iterable = (List) container.f().h(this.f63199a.a());
        if (iterable == null) {
            iterable = kotlin.collections.K.f71697a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C7714v.z(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6527f) this).m((Nd.a) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final List b(@NotNull N container, @NotNull h.d callableProto, @NotNull EnumC6525d kind, int i11, @NotNull Nd.t proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Iterable iterable = (List) proto.h(this.f63199a.g());
        if (iterable == null) {
            iterable = kotlin.collections.K.f71697a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C7714v.z(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6527f) this).m((Nd.a) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final List e(@NotNull N container, @NotNull h.d proto, @NotNull EnumC6525d kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        boolean z11 = proto instanceof Nd.h;
        C6718a c6718a = this.f63199a;
        if (z11) {
            c6718a.getClass();
        } else {
            if (!(proto instanceof Nd.m)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i11 = C1010a.f63200a[kind.ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            c6718a.getClass();
        }
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        ArrayList arrayList = new ArrayList(C7714v.z(k11, 10));
        Iterator<E> it = k11.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6527f) this).m((Nd.a) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final List<A> f(@NotNull N container, @NotNull Nd.m proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        this.f63199a.getClass();
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        ArrayList arrayList = new ArrayList(C7714v.z(k11, 10));
        Iterator<E> it = k11.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6527f) this).m((Nd.a) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final List g(@NotNull N.a container, @NotNull Nd.f proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Iterable iterable = (List) proto.h(this.f63199a.d());
        if (iterable == null) {
            iterable = kotlin.collections.K.f71697a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C7714v.z(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6527f) this).m((Nd.a) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final List h(@NotNull N container, @NotNull h.d proto, @NotNull EnumC6525d kind) {
        List list;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        boolean z11 = proto instanceof Nd.c;
        C6718a c6718a = this.f63199a;
        if (z11) {
            list = (List) ((Nd.c) proto).h(c6718a.c());
        } else if (proto instanceof Nd.h) {
            list = (List) ((Nd.h) proto).h(c6718a.f());
        } else {
            if (!(proto instanceof Nd.m)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i11 = C1010a.f63200a[kind.ordinal()];
            if (i11 == 1) {
                list = (List) ((Nd.m) proto).h(c6718a.h());
            } else if (i11 == 2) {
                list = (List) ((Nd.m) proto).h(c6718a.i());
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((Nd.m) proto).h(c6718a.j());
            }
        }
        if (list == null) {
            list = kotlin.collections.K.f71697a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6527f) this).m((Nd.a) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final ArrayList i(@NotNull Nd.r proto, @NotNull Pd.c nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.h(this.f63199a.l());
        if (iterable == null) {
            iterable = kotlin.collections.K.f71697a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C7714v.z(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6527f) this).m((Nd.a) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final List<A> j(@NotNull N container, @NotNull Nd.m proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        this.f63199a.getClass();
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        ArrayList arrayList = new ArrayList(C7714v.z(k11, 10));
        Iterator<E> it = k11.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6527f) this).m((Nd.a) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final ArrayList k(@NotNull Nd.p proto, @NotNull Pd.c nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.h(this.f63199a.k());
        if (iterable == null) {
            iterable = kotlin.collections.K.f71697a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C7714v.z(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6527f) this).m((Nd.a) it.next(), nameResolver));
        }
        return arrayList;
    }

    @NotNull
    protected final C6349a l() {
        return this.f63199a;
    }
}
