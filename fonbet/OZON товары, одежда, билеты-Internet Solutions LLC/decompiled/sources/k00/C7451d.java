package k00;

import De.C2862e;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.net.URI;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import xb0.InterfaceC10696a;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.L0;
import xe.M;
import xe.N;
import xe.X0;
import zb0.AbstractC11016a;

/* renamed from: k00.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7451d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Pc.a<AbToolBaseApi> f70255a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Pc.a<InterfaceC10696a> f70256b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2862e f70257c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.data.cookie.X03ComposerDebugTokenCookieDelegate$removeCookieAsync$1", f = "X03ComposerDebugTokenCookieDelegate.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: k00.d$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f70258d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C7451d.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f70258d;
            if (i11 == 0) {
                s.b(obj);
                this.f70258d = 1;
                if (C7451d.c(C7451d.this, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.data.cookie.X03ComposerDebugTokenCookieDelegate$setCookieAsync$1", f = "X03ComposerDebugTokenCookieDelegate.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: k00.d$b */
    /* loaded from: classes3.dex */
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f70260d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f70262f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f70262f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C7451d.this.new b(this.f70262f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f70260d;
            if (i11 == 0) {
                s.b(obj);
                this.f70260d = 1;
                if (C7451d.d(C7451d.this, this.f70262f, this) == aVar) {
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

    public C7451d() {
        throw null;
    }

    public C7451d(@NotNull Pc.a<AbToolBaseApi> abToolApiProvider, @NotNull Pc.a<InterfaceC10696a> ozonIdApiProvider) {
        Intrinsics.checkNotNullParameter(abToolApiProvider, "abToolApiProvider");
        Intrinsics.checkNotNullParameter(ozonIdApiProvider, "ozonIdApiProvider");
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b cookieDispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(abToolApiProvider, "abToolApiProvider");
        Intrinsics.checkNotNullParameter(ozonIdApiProvider, "ozonIdApiProvider");
        Intrinsics.checkNotNullParameter(cookieDispatcher, "cookieDispatcher");
        this.f70255a = abToolApiProvider;
        this.f70256b = ozonIdApiProvider;
        this.f70257c = N.a(CoroutineContext.Element.a.d(cookieDispatcher, (H0) X0.b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(C7451d c7451d, kotlin.coroutines.jvm.internal.c cVar) {
        C7449b c7449b;
        int i11;
        AbstractC11016a abstractC11016a;
        AbstractC11016a abstractC11016a2;
        List list;
        c7451d.getClass();
        if (cVar instanceof C7449b) {
            c7449b = (C7449b) cVar;
            int i12 = c7449b.f70253g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c7449b.f70253g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c7449b.f70251e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c7449b.f70253g;
                if (i11 != 0) {
                    s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 l02 = De.s.f6650a;
                    C7450c c7450c = new C7450c(c7451d, null);
                    c7449b.f70250d = c7451d;
                    c7449b.f70253g = 1;
                    obj = C10727i.f(l02, c7450c, c7449b);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        abstractC11016a2 = (AbstractC11016a) c7449b.f70250d;
                        s.b(obj);
                        list = (List) obj;
                        if (!list.isEmpty()) {
                            return Unit.f71690a;
                        }
                        abstractC11016a2.a(list, e0.h("x-o3-composer-debug-token"));
                        return Unit.f71690a;
                    }
                    c7451d = (C7451d) c7449b.f70250d;
                    s.b(obj);
                }
                abstractC11016a = (AbstractC11016a) obj;
                if (abstractC11016a != null) {
                    return Unit.f71690a;
                }
                c7449b.f70250d = abstractC11016a;
                c7449b.f70253g = 2;
                c7451d.getClass();
                C10720e0 c10720e02 = C10720e0.f105451a;
                Object f7 = C10727i.f(De.s.f6650a, new C7448a(c7451d, null), c7449b);
                if (f7 != aVar) {
                    obj = f7;
                    abstractC11016a2 = abstractC11016a;
                    list = (List) obj;
                    if (!list.isEmpty()) {
                    }
                }
                return aVar;
            }
        }
        c7449b = new C7449b(c7451d, cVar);
        Object obj2 = c7449b.f70251e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c7449b.f70253g;
        if (i11 != 0) {
        }
        abstractC11016a = (AbstractC11016a) obj2;
        if (abstractC11016a != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(C7451d c7451d, String str, kotlin.coroutines.jvm.internal.c cVar) {
        C7452e c7452e;
        int i11;
        AbstractC11016a abstractC11016a;
        AbstractC11016a abstractC11016a2;
        List<URI> list;
        c7451d.getClass();
        if (cVar instanceof C7452e) {
            c7452e = (C7452e) cVar;
            int i12 = c7452e.f70267h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c7452e.f70267h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c7452e.f70265f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c7452e.f70267h;
                if (i11 != 0) {
                    s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 l02 = De.s.f6650a;
                    C7454g c7454g = new C7454g(c7451d, null);
                    c7452e.f70263d = c7451d;
                    c7452e.f70264e = str;
                    c7452e.f70267h = 1;
                    obj = C10727i.f(l02, c7454g, c7452e);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        abstractC11016a2 = (AbstractC11016a) c7452e.f70264e;
                        str = (String) c7452e.f70263d;
                        s.b(obj);
                        list = (List) obj;
                        if (!list.isEmpty()) {
                            return Unit.f71690a;
                        }
                        C7453f c7453f = new C7453f(str);
                        c7453f.getAttributes().g(true);
                        abstractC11016a2.c(C7714v.a0(c7453f), list);
                        return Unit.f71690a;
                    }
                    str = (String) c7452e.f70264e;
                    c7451d = (C7451d) c7452e.f70263d;
                    s.b(obj);
                }
                abstractC11016a = (AbstractC11016a) obj;
                if (abstractC11016a != null) {
                    return Unit.f71690a;
                }
                c7452e.f70263d = str;
                c7452e.f70264e = abstractC11016a;
                c7452e.f70267h = 2;
                c7451d.getClass();
                C10720e0 c10720e02 = C10720e0.f105451a;
                Object f7 = C10727i.f(De.s.f6650a, new C7448a(c7451d, null), c7452e);
                if (f7 != aVar) {
                    obj = f7;
                    abstractC11016a2 = abstractC11016a;
                    list = (List) obj;
                    if (!list.isEmpty()) {
                    }
                }
                return aVar;
            }
        }
        c7452e = new C7452e(c7451d, cVar);
        Object obj2 = c7452e.f70265f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c7452e.f70267h;
        if (i11 != 0) {
        }
        abstractC11016a = (AbstractC11016a) obj2;
        if (abstractC11016a != null) {
        }
    }

    public final void e() {
        C10727i.c(this.f70257c, null, null, new a(null), 3);
    }

    public final void f(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        C10727i.c(this.f70257c, null, null, new b(token, null), 3);
    }
}
