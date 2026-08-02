package si;

import Ae.C;
import Ae.C2399j;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import Hi.h;
import Hi.j;
import Sc.s;
import androidx.lifecycle.C5423j;
import androidx.lifecycle.C5429p;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import cj.C5838a;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import wi.c;
import xe.C10727i;
import xe.M;

/* renamed from: si.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9699b extends w0 {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C9698a f98786e = new C9698a(K.f71697a, null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Oi.b f98787a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<C9698a> f98788b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C5423j f98789c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x0<h> f98790d;

    @e(c = "ru.ozon.android.gallery.album.presentation.AlbumViewModel$1", f = "AlbumViewModel.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: si.b$a */
    static final class a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f98791d;

        @e(c = "ru.ozon.android.gallery.album.presentation.AlbumViewModel$1$1", f = "AlbumViewModel.kt", l = {40}, m = "invokeSuspend")
        /* renamed from: si.b$a$a, reason: collision with other inner class name */
        static final class C2171a extends j implements Function2<h, d<? super List<wi.c>>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f98793d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f98794e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C9699b f98795f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2171a(C9699b c9699b, d<? super C2171a> dVar) {
                super(2, dVar);
                this.f98795f = c9699b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C2171a c2171a = new C2171a(this.f98795f, dVar);
                c2171a.f98794e = obj;
                return c2171a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(h hVar, d<? super List<wi.c>> dVar) {
                return ((C2171a) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f98793d;
                if (i11 == 0) {
                    s.b(obj);
                    h hVar = (h) this.f98794e;
                    Oi.b bVar = this.f98795f.f98787a;
                    this.f98793d = 1;
                    obj = bVar.c(hVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : (Iterable) obj) {
                    String name = ((Hi.j) obj2).getClass().getName();
                    Object obj3 = linkedHashMap.get(name);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(name, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(U.h(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    linkedHashMap2.put(Intrinsics.d(str, j.c.class.getName()) ? new c.b(C5838a.b(R.string.gallery_user_albums_title)) : Intrinsics.d(str, j.d.class.getName()) ? new c.b(C5838a.b(R.string.gallery_media_type_title)) : null, entry.getValue());
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(U.h(linkedHashMap2.size()));
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    Object key = entry2.getKey();
                    Iterable iterable = (Iterable) entry2.getValue();
                    ArrayList arrayList = new ArrayList(C7714v.z(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new c.a((Hi.j) it.next()));
                    }
                    linkedHashMap3.put(key, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                    c.b bVar2 = (c.b) entry3.getKey();
                    if (bVar2 != null) {
                        arrayList2.add(bVar2);
                    }
                    arrayList2.addAll((Collection) entry3.getValue());
                }
                return arrayList2;
            }
        }

        @e(c = "ru.ozon.android.gallery.album.presentation.AlbumViewModel$1$2", f = "AlbumViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: si.b$a$b, reason: collision with other inner class name */
        static final class C2172b extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super List<wi.c>>, Throwable, d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Throwable f98796d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C9699b f98797e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2172b(C9699b c9699b, d<? super C2172b> dVar) {
                super(3, dVar);
                this.f98797e = c9699b;
            }

            @Override // fd.InterfaceC6511n
            public final Object invoke(InterfaceC2397i<? super List<wi.c>> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
                C2172b c2172b = new C2172b(this.f98797e, dVar);
                c2172b.f98796d = th2;
                return c2172b.invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                Throwable th2 = this.f98796d;
                x0 x0Var = this.f98797e.f98788b;
                do {
                    value = x0Var.getValue();
                } while (!x0Var.b(value, C9698a.a((C9698a) value, null, th2.getMessage(), 1)));
                return Unit.f71690a;
            }
        }

        /* renamed from: si.b$a$c */
        static final class c<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C9699b f98798a;

            c(C9699b c9699b) {
                this.f98798a = c9699b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, d dVar) {
                Object value;
                List list = (List) obj;
                x0 x0Var = this.f98798a.f98788b;
                do {
                    value = x0Var.getValue();
                } while (!x0Var.b(value, C9698a.a((C9698a) value, list, null, 2)));
                return Unit.f71690a;
            }
        }

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return C9699b.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f98791d;
            if (i11 == 0) {
                s.b(obj);
                C9699b c9699b = C9699b.this;
                C c11 = new C(C2399j.D(c9699b.f98790d, new C2171a(c9699b, null)), new C2172b(c9699b, null));
                c cVar = new c(c9699b);
                this.f98791d = 1;
                if (c11.collect(cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public C9699b(@NotNull Oi.b ozMediaFileManager) {
        Intrinsics.checkNotNullParameter(ozMediaFileManager, "ozMediaFileManager");
        this.f98787a = ozMediaFileManager;
        x0<C9698a> a11 = O0.a(f98786e);
        this.f98788b = a11;
        this.f98789c = C5429p.b(a11);
        this.f98790d = O0.a(h.b.f11016a);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new a(null), 3);
    }

    public final void g0() {
        C9698a value;
        x0<C9698a> x0Var = this.f98788b;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, C9698a.a(value, null, null, 1)));
    }

    @NotNull
    public final P<C9698a> getViewState() {
        return this.f98789c;
    }

    public final void h0(@NotNull h mediaFilter) {
        Intrinsics.checkNotNullParameter(mediaFilter, "mediaFilter");
        this.f98790d.setValue(mediaFilter);
    }
}
