package jd0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import jd0.C7352e;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M;
import ze.C11115c;

/* renamed from: jd0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7348a extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yc0.c f69718a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C11115c f69719b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d f69720c;

    /* renamed from: jd0.a$a, reason: collision with other inner class name */
    public static final class C1139a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f69721a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, String> f69722b;

        public C1139a(@NotNull String url, @NotNull Map<String, String> additionalHeaders) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(additionalHeaders, "additionalHeaders");
            this.f69721a = url;
            this.f69722b = additionalHeaders;
        }

        @NotNull
        public final Map<String, String> a() {
            return this.f69722b;
        }

        @NotNull
        public final String b() {
            return this.f69721a;
        }
    }

    /* renamed from: jd0.a$b */
    public static final class b extends Throwable {

        /* renamed from: a, reason: collision with root package name */
        private final int f69723a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f69723a = -2;
        }

        public final int a() {
            return this.f69723a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.web.AbstractWebViewModel$load$1", f = "AbstractWebViewModel.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: jd0.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f69724d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f69726f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f69726f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return AbstractC7348a.this.new c(this.f69726f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f69724d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C11115c c11115c = AbstractC7348a.this.f69719b;
                this.f69724d = 1;
                if (c11115c.n(this.f69726f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: jd0.a$d */
    public static final class d implements InterfaceC2395h<C1139a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f69727a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC7348a f69728b;

        /* renamed from: jd0.a$d$a, reason: collision with other inner class name */
        public static final class C1140a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f69729a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC7348a f69730b;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.web.AbstractWebViewModel$special$$inlined$map$1$2", f = "AbstractWebViewModel.kt", l = {223}, m = "emit")
            /* renamed from: jd0.a$d$a$a, reason: collision with other inner class name */
            public static final class C1141a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f69731d;

                /* renamed from: e, reason: collision with root package name */
                int f69732e;

                public C1141a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f69731d = obj;
                    this.f69732e |= LinearLayoutManager.INVALID_OFFSET;
                    return C1140a.this.emit(null, this);
                }
            }

            public C1140a(InterfaceC2397i interfaceC2397i, AbstractC7348a abstractC7348a) {
                this.f69729a = interfaceC2397i;
                this.f69730b = abstractC7348a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C1141a c1141a;
                int i11;
                if (dVar instanceof C1141a) {
                    c1141a = (C1141a) dVar;
                    int i12 = c1141a.f69732e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c1141a.f69732e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c1141a.f69731d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1141a.f69732e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            C1139a c1139a = new C1139a((String) obj, this.f69730b.f69718a.e());
                            c1141a.f69732e = 1;
                            if (this.f69729a.emit(c1139a, c1141a) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c1141a = new C1141a(dVar);
                Object obj22 = c1141a.f69731d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1141a.f69732e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public d(InterfaceC2395h interfaceC2395h, AbstractC7348a abstractC7348a) {
            this.f69727a = interfaceC2395h;
            this.f69728b = abstractC7348a;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super C1139a> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f69727a.collect(new C1140a(interfaceC2397i, this.f69728b), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    public AbstractC7348a(@NotNull yc0.c headersProvider) {
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        this.f69718a = headersProvider;
        C11115c a11 = ze.k.a(-1, 6, null);
        this.f69719b = a11;
        this.f69720c = new d(C2399j.H(a11), this);
    }

    @NotNull
    public final d f0() {
        return this.f69720c;
    }

    protected final void g0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        td0.f.b(x0.a(this), null, new c(url, null));
    }

    public abstract void h0(@NotNull String str);

    public void i0() {
    }

    public void j0(@NotNull C7352e.a error) {
        Intrinsics.checkNotNullParameter(error, "error");
    }

    public void k0(String str) {
    }

    public void l0() {
    }

    public void m0(@NotNull C7352e.a error) {
        Intrinsics.checkNotNullParameter(error, "error");
    }

    @NotNull
    public Map<Object, String> n0() {
        return U.c();
    }
}
