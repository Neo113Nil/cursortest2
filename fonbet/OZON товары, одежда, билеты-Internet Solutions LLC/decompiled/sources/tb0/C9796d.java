package tb0;

import Sc.C4001c;
import Sc.InterfaceC4008j;
import Vb0.b;
import android.app.Application;
import android.webkit.WebView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import java.util.Map;
import jd0.C7352e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ob0.s;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

/* renamed from: tb0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9796d extends rb0.c<String, s.g> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f99337h = 0;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<yc0.c> f99338e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Application f99339f;

    /* renamed from: g, reason: collision with root package name */
    private WebView f99340g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.js.AntibotJSChallengeManager$onInterceptUrl$1", f = "AntibotJSChallengeManager.kt", l = {48, 49, 50}, m = "invokeSuspend")
    /* renamed from: tb0.d$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f99341d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f99342e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C9796d f99343f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d dVar, C9796d c9796d) {
            super(2, dVar);
            this.f99342e = str;
            this.f99343f = c9796d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f99342e, dVar, this.f99343f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        
            if (tb0.C9796d.w(r6, r8, r7) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        
            if (tb0.C9796d.w(r6, r8, r7) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        
            if (r8 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f99341d;
            if (i11 != 0) {
                if (i11 == 1 || i11 == 2) {
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
            String str = this.f99342e;
            boolean A11 = h.A(str, "abt/challenge/ok", false);
            C9796d c9796d = this.f99343f;
            if (!A11) {
                if (h.A(str, "abt/challenge/fail", false)) {
                    s.h hVar = s.h.JsChallengeBlock;
                    this.f99341d = 2;
                } else {
                    this.f99341d = 3;
                    int i12 = C9796d.f99337h;
                    c9796d.getClass();
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    obj = C10727i.f(De.s.f6650a, new C9795c(str, null, c9796d), this);
                }
                return aVar;
            }
            s.h hVar2 = s.h.JsChallengeSuccess;
            this.f99341d = 1;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.js.AntibotJSChallengeManager$onNetworkError$1", f = "AntibotJSChallengeManager.kt", l = {58}, m = "invokeSuspend")
    /* renamed from: tb0.d$b */
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f99344d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C7352e.a f99346f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C7352e.a aVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f99346f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9796d.this.new b(this.f99346f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f99344d;
            if (i11 == 0) {
                Sc.s.b(obj);
                Vb0.c cVar = Vb0.c.NETWORK_ERROR;
                C9796d c9796d = C9796d.this;
                C7352e.a aVar2 = this.f99346f;
                C9796d.j(c9796d, cVar, aVar2);
                s.h hVar = s.h.JsChallengeNetworkError;
                this.f99344d = 1;
                if (c9796d.v(hVar, aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.js.AntibotJSChallengeManager", f = "AntibotJSChallengeManager.kt", l = {41, 42}, m = "onStart")
    /* renamed from: tb0.d$c */
    static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        C9796d f99347d;

        /* renamed from: e, reason: collision with root package name */
        String f99348e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f99349f;

        /* renamed from: h, reason: collision with root package name */
        int f99351h;

        c(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f99349f = obj;
            this.f99351h |= LinearLayoutManager.INVALID_OFFSET;
            return C9796d.this.d(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.js.AntibotJSChallengeManager$onWebViewError$1", f = "AntibotJSChallengeManager.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
    /* renamed from: tb0.d$d, reason: collision with other inner class name */
    static final class C2187d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f99352d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C7352e.a f99354f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2187d(C7352e.a aVar, kotlin.coroutines.d<? super C2187d> dVar) {
            super(2, dVar);
            this.f99354f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9796d.this.new C2187d(this.f99354f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C2187d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f99352d;
            if (i11 == 0) {
                Sc.s.b(obj);
                Vb0.c cVar = Vb0.c.RENDER_ERROR;
                C9796d c9796d = C9796d.this;
                C7352e.a aVar2 = this.f99354f;
                C9796d.j(c9796d, cVar, aVar2);
                s.h hVar = s.h.JsChallengeWebViewError;
                this.f99352d = 1;
                if (c9796d.v(hVar, aVar2, this) == aVar) {
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

    public C9796d(@NotNull InterfaceC4008j headersProvider, @NotNull Application context) {
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f99338e = headersProvider;
        this.f99339f = context;
    }

    public static final /* synthetic */ void i(C9796d c9796d, Vb0.c cVar, String str, Throwable th2) {
        c9796d.getClass();
        p(cVar, str, th2);
    }

    public static final void j(C9796d c9796d, Vb0.c cVar, C7352e.a aVar) {
        c9796d.getClass();
        b.a aVar2 = Vb0.b.f28514a;
        String a11 = cVar.a();
        Map j11 = U.j(new Pair("data", aVar.b()), new Pair(ImagesContract.URL, aVar.c()), new Pair("error_code", aVar.a()), new Pair("trace_id", aVar.d()), new Pair("webview_type", Vb0.d.JS_CHALLENGE));
        aVar2.getClass();
        b.a.a(a11, j11);
    }

    private static void p(Vb0.c cVar, String str, Throwable th2) {
        b.a aVar = Vb0.b.f28514a;
        String a11 = cVar.a();
        Tc.d builder = new Tc.d();
        builder.put(ImagesContract.URL, str);
        if (th2 != null) {
            builder.put("data", C4001c.b(th2));
            builder.put("trace_id", td0.j.b(th2));
        }
        builder.put("webview_type", Vb0.d.JS_CHALLENGE);
        Unit unit = Unit.f71690a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.d u11 = builder.u();
        aVar.getClass();
        b.a.a(a11, u11);
    }

    static /* synthetic */ void q(C9796d c9796d, Vb0.c cVar, String str) {
        c9796d.getClass();
        p(cVar, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(String str) {
        C10727i.c(c(), null, null, new a(str, null, this), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(C7352e.a aVar) {
        C10727i.c(c(), null, null, new b(aVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(C7352e.a aVar) {
        C10727i.c(c(), null, null, new C2187d(aVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(s.h hVar, C7352e.a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        C9797e c9797e;
        int i11;
        C9796d c9796d;
        if (cVar instanceof C9797e) {
            c9797e = (C9797e) cVar;
            int i12 = c9797e.f99360i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9797e.f99360i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9797e.f99358g;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9797e.f99360i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 l02 = De.s.f6650a;
                    C9798f c9798f = new C9798f(this, null);
                    c9797e.f99355d = this;
                    c9797e.f99356e = hVar;
                    c9797e.f99357f = aVar;
                    c9797e.f99360i = 1;
                    if (C10727i.f(l02, c9798f, c9797e) == aVar2) {
                        return aVar2;
                    }
                    c9796d = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = c9797e.f99357f;
                    hVar = c9797e.f99356e;
                    c9796d = c9797e.f99355d;
                    Sc.s.b(obj);
                }
                c9796d.e(new s.g(hVar, aVar != null ? aVar.e() : null, 2));
                return Unit.f71690a;
            }
        }
        c9797e = new C9797e(this, cVar);
        Object obj2 = c9797e.f99358g;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9797e.f99360i;
        if (i11 != 0) {
        }
        c9796d.e(new s.g(hVar, aVar != null ? aVar.e() : null, 2));
        return Unit.f71690a;
    }

    static /* synthetic */ Object w(C9796d c9796d, s.h hVar, j jVar) {
        return c9796d.v(hVar, null, jVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // rb0.c
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        c cVar;
        int i11;
        C9796d c9796d;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i12 = cVar.f99351h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar.f99351h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar.f99349f;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar.f99351h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    cVar.f99347d = this;
                    cVar.f99348e = str;
                    cVar.f99351h = 1;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    Object f7 = C10727i.f(De.s.f6650a, new C9794b(str, null, this), cVar);
                    if (f7 != obj2) {
                        f7 = Unit.f71690a;
                    }
                    if (f7 != obj2) {
                        c9796d = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return obj;
                }
                str = cVar.f99348e;
                c9796d = cVar.f99347d;
                Sc.s.b(obj);
                cVar.f99347d = null;
                cVar.f99348e = null;
                cVar.f99351h = 2;
                c9796d.getClass();
                C10720e0 c10720e02 = C10720e0.f105451a;
                Object f11 = C10727i.f(De.s.f6650a, new C9795c(str, null, c9796d), cVar);
                return f11 != obj2 ? obj2 : f11;
            }
        }
        cVar = new c((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj3 = cVar.f99349f;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar.f99351h;
        if (i11 != 0) {
        }
        cVar.f99347d = null;
        cVar.f99348e = null;
        cVar.f99351h = 2;
        c9796d.getClass();
        C10720e0 c10720e022 = C10720e0.f105451a;
        Object f112 = C10727i.f(De.s.f6650a, new C9795c(str, null, c9796d), cVar);
        if (f112 != obj22) {
        }
    }
}
