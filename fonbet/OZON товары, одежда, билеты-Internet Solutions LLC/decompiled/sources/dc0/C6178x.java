package dc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.C10754w;
import xe.InterfaceC10750u;

/* renamed from: dc0.x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6178x {

    /* renamed from: a, reason: collision with root package name */
    private volatile C6154S f61591a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC10750u<Unit> f61592b = C10754w.a();

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.account.CurrentUserRepository$getUserDataBlocking$1", f = "CurrentUserRepository.kt", l = {21}, m = "invokeSuspend")
    /* renamed from: dc0.x$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super C6154S>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f61593d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C6178x.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super C6154S> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f61593d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            this.f61593d = 1;
            Object a11 = C6178x.this.a(this);
            return a11 == aVar ? aVar : a11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C6177w c6177w;
        int i11;
        C6178x c6178x;
        C6154S c6154s;
        if (cVar instanceof C6177w) {
            c6177w = (C6177w) cVar;
            int i12 = c6177w.f61590g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6177w.f61590g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c6177w.f61588e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6177w.f61590g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    InterfaceC10750u<Unit> interfaceC10750u = this.f61592b;
                    c6177w.f61587d = this;
                    c6177w.f61590g = 1;
                    if (interfaceC10750u.s(c6177w) == aVar) {
                        return aVar;
                    }
                    c6178x = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6178x = c6177w.f61587d;
                    Sc.s.b(obj);
                }
                c6154s = c6178x.f61591a;
                if (c6154s == null) {
                    return c6154s;
                }
                Intrinsics.n("userData");
                throw null;
            }
        }
        c6177w = new C6177w(this, cVar);
        Object obj2 = c6177w.f61588e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6177w.f61590g;
        if (i11 != 0) {
        }
        c6154s = c6178x.f61591a;
        if (c6154s == null) {
        }
    }

    @NotNull
    public final C6154S b() {
        return (C6154S) C10727i.d(kotlin.coroutines.g.f71771a, new a(null));
    }

    public final void c(@NotNull C6154S userData) {
        Intrinsics.checkNotNullParameter(userData, "userData");
        this.f61591a = userData;
        this.f61592b.complete(Unit.f71690a);
    }

    @NotNull
    public final C6154S d(@NotNull C6154S newUserData) {
        Intrinsics.checkNotNullParameter(newUserData, "newUserData");
        if (this.f61591a == null) {
            Intrinsics.n("userData");
            throw null;
        }
        Long h11 = newUserData.h();
        if (h11 == null) {
            C6154S c6154s = this.f61591a;
            if (c6154s == null) {
                Intrinsics.n("userData");
                throw null;
            }
            h11 = c6154s.h();
        }
        Long l11 = h11;
        String a11 = newUserData.a();
        if (a11 == null) {
            C6154S c6154s2 = this.f61591a;
            if (c6154s2 == null) {
                Intrinsics.n("userData");
                throw null;
            }
            a11 = c6154s2.a();
        }
        String str = a11;
        String e11 = newUserData.e();
        if (e11 == null) {
            C6154S c6154s3 = this.f61591a;
            if (c6154s3 == null) {
                Intrinsics.n("userData");
                throw null;
            }
            e11 = c6154s3.e();
        }
        String str2 = e11;
        String b11 = newUserData.b();
        if (b11 == null) {
            C6154S c6154s4 = this.f61591a;
            if (c6154s4 == null) {
                Intrinsics.n("userData");
                throw null;
            }
            b11 = c6154s4.b();
        }
        String str3 = b11;
        String f7 = newUserData.f();
        if (f7 == null) {
            C6154S c6154s5 = this.f61591a;
            if (c6154s5 == null) {
                Intrinsics.n("userData");
                throw null;
            }
            f7 = c6154s5.f();
        }
        String str4 = f7;
        String g10 = newUserData.g();
        if (g10 == null) {
            C6154S c6154s6 = this.f61591a;
            if (c6154s6 == null) {
                Intrinsics.n("userData");
                throw null;
            }
            g10 = c6154s6.g();
        }
        String str5 = g10;
        String c11 = newUserData.c();
        if (c11 == null) {
            C6154S c6154s7 = this.f61591a;
            if (c6154s7 == null) {
                Intrinsics.n("userData");
                throw null;
            }
            c11 = c6154s7.c();
        }
        String str6 = c11;
        Long d11 = newUserData.d();
        if (d11 == null) {
            C6154S c6154s8 = this.f61591a;
            if (c6154s8 == null) {
                Intrinsics.n("userData");
                throw null;
            }
            d11 = c6154s8.d();
        }
        this.f61591a = new C6154S(l11, str, str2, str3, str4, str5, str6, d11);
        C6154S c6154s9 = this.f61591a;
        if (c6154s9 != null) {
            return c6154s9;
        }
        Intrinsics.n("userData");
        throw null;
    }
}
