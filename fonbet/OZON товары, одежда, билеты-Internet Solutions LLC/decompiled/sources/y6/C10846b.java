package y6;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Sc.s;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import xe.C10720e0;
import xe.C10727i;
import z6.C10992a;
import ze.C11115c;
import ze.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly6/b;", "Landroidx/lifecycle/w0;", "<init>", "()V", "esiasdk-1.1.3(6)_nonPguRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: y6.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10846b extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A6.a f106051a = A6.a.f501a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f106052b = O0.a(Boolean.TRUE);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f106053c = O0.a(Boolean.FALSE);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C11115c f106054d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<String> f106055e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C11115c f106056f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<B6.c> f106057g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C11115c f106058h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<C10848d> f106059i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C11115c f106060j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<C10848d> f106061k;

    @kotlin.coroutines.jvm.internal.e(c = "com.esiasdk.android.EsiaAuthVm$loadAuthUrl$1", f = "EsiaAuthVm.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: y6.b$a */
    static final class a extends j implements Function1<kotlin.coroutines.d<? super String>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106062d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f106064f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C10992a f106065g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, C10992a c10992a, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f106064f = str;
            this.f106065g = c10992a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return C10846b.this.new a(this.f106064f, this.f106065g, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super String> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106062d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            A6.a aVar2 = C10846b.this.f106051a;
            this.f106062d = 1;
            String a11 = aVar2.a(this.f106064f, this.f106065g);
            return a11 == aVar ? aVar : a11;
        }
    }

    /* renamed from: y6.b$b, reason: collision with other inner class name */
    static final class C2292b extends AbstractC7737t implements Function1<String, Unit> {
        C2292b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            C10846b c10846b = C10846b.this;
            c10846b.f106053c.setValue(Boolean.TRUE);
            c10846b.f106054d.b(it);
            return Unit.f71690a;
        }
    }

    /* renamed from: y6.b$c */
    static final class c extends AbstractC7737t implements Function1<Exception, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Exception exc) {
            Exception it = exc;
            Intrinsics.checkNotNullParameter(it, "it");
            C10846b c10846b = C10846b.this;
            c10846b.n0(it);
            c10846b.f106052b.setValue(Boolean.FALSE);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "com.esiasdk.android.EsiaAuthVm$loadPermissionsUrl$1", f = "EsiaAuthVm.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: y6.b$d */
    static final class d extends j implements Function1<kotlin.coroutines.d<? super String>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106068d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f106070f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C10992a f106071g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f106072h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, C10992a c10992a, String str2, kotlin.coroutines.d<? super d> dVar) {
            super(1, dVar);
            this.f106070f = str;
            this.f106071g = c10992a;
            this.f106072h = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return C10846b.this.new d(this.f106070f, this.f106071g, this.f106072h, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super String> dVar) {
            return ((d) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106068d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            A6.a aVar2 = C10846b.this.f106051a;
            this.f106068d = 1;
            Object b11 = aVar2.b(this.f106070f, this.f106071g, this.f106072h, this);
            return b11 == aVar ? aVar : b11;
        }
    }

    /* renamed from: y6.b$e */
    static final class e extends AbstractC7737t implements Function1<String, Unit> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            C10846b c10846b = C10846b.this;
            c10846b.f106053c.setValue(Boolean.TRUE);
            c10846b.f106054d.b(it);
            return Unit.f71690a;
        }
    }

    /* renamed from: y6.b$f */
    static final class f extends AbstractC7737t implements Function1<Exception, Unit> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Exception exc) {
            Exception it = exc;
            Intrinsics.checkNotNullParameter(it, "it");
            C10846b c10846b = C10846b.this;
            c10846b.n0(it);
            c10846b.f106052b.setValue(Boolean.FALSE);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "com.esiasdk.android.EsiaAuthVm$processRedirectUrl$1", f = "EsiaAuthVm.kt", l = {75}, m = "invokeSuspend")
    /* renamed from: y6.b$g */
    static final class g extends j implements Function1<kotlin.coroutines.d<? super B6.c>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106075d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Uri f106077f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Uri uri, kotlin.coroutines.d<? super g> dVar) {
            super(1, dVar);
            this.f106077f = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return C10846b.this.new g(this.f106077f, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super B6.c> dVar) {
            return ((g) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106075d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            A6.a aVar2 = C10846b.this.f106051a;
            this.f106075d = 1;
            aVar2.getClass();
            Uri uri = this.f106077f;
            String queryParameter = uri.getQueryParameter("code");
            if (queryParameter == null) {
                throw new C10848d("Access code not found!", 2, new Integer(3));
            }
            String queryParameter2 = uri.getQueryParameter("state");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "url.queryParameterNames");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : queryParameterNames) {
                if (!C7714v.b0("code", "state").contains((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            int h11 = U.h(C7714v.z(arrayList, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String queryParameter3 = uri.getQueryParameter((String) next);
                if (queryParameter3 == null) {
                    queryParameter3 = "";
                }
                linkedHashMap.put(next, queryParameter3);
            }
            B6.c cVar = new B6.c(queryParameter, queryParameter2, linkedHashMap);
            return cVar == aVar ? aVar : cVar;
        }
    }

    /* renamed from: y6.b$h */
    static final class h extends AbstractC7737t implements Function1<B6.c, Unit> {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(B6.c cVar) {
            B6.c it = cVar;
            Intrinsics.checkNotNullParameter(it, "it");
            C10846b.d0(C10846b.this, it);
            return Unit.f71690a;
        }
    }

    /* renamed from: y6.b$i */
    static final class i extends AbstractC7737t implements Function1<Exception, Unit> {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Exception exc) {
            Exception it = exc;
            Intrinsics.checkNotNullParameter(it, "it");
            C10846b.this.n0(it);
            return Unit.f71690a;
        }
    }

    public C10846b() {
        C11115c a11 = k.a(0, 7, null);
        this.f106054d = a11;
        this.f106055e = C2399j.H(a11);
        C11115c a12 = k.a(0, 7, null);
        this.f106056f = a12;
        this.f106057g = C2399j.H(a12);
        C11115c a13 = k.a(0, 7, null);
        this.f106058h = a13;
        this.f106059i = C2399j.H(a13);
        C11115c a14 = k.a(0, 7, null);
        this.f106060j = a14;
        this.f106061k = C2399j.H(a14);
    }

    public static final void d0(C10846b c10846b, B6.c cVar) {
        x0<Boolean> x0Var = c10846b.f106052b;
        Boolean bool = Boolean.FALSE;
        x0Var.setValue(bool);
        c10846b.f106053c.setValue(bool);
        c10846b.f106056f.b(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(Exception exc) {
        boolean z11 = exc instanceof C10848d;
        C11115c c11115c = this.f106058h;
        if (z11) {
            c11115c.b(exc);
            return;
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        c11115c.b(new C10848d(message, 3, (Integer) null));
    }

    static void s0(C10846b c10846b, Function1 function1, Function1 function12, Function1 function13) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b bVar = He.b.f10879b;
        c10846b.getClass();
        C10727i.c(androidx.lifecycle.x0.a(c10846b), null, null, new C10847c(bVar, function12, function13, function1, null), 3);
    }

    @NotNull
    public final InterfaceC2395h<String> j0() {
        return this.f106055e;
    }

    @NotNull
    public final InterfaceC2395h<C10848d> k0() {
        return this.f106061k;
    }

    @NotNull
    public final InterfaceC2395h<C10848d> l0() {
        return this.f106059i;
    }

    @NotNull
    public final InterfaceC2395h<B6.c> m0() {
        return this.f106057g;
    }

    public final void p0(@NotNull String esiaUrl, @NotNull C10992a clientSession) {
        Intrinsics.checkNotNullParameter(esiaUrl, "esiaUrl");
        Intrinsics.checkNotNullParameter(clientSession, "clientSession");
        this.f106052b.setValue(Boolean.TRUE);
        this.f106053c.setValue(Boolean.FALSE);
        s0(this, new a(esiaUrl, clientSession, null), new C2292b(), new c());
    }

    public final void q0(@NotNull String esiaUrl, @NotNull C10992a clientSession, @NotNull String permissions) {
        Intrinsics.checkNotNullParameter(esiaUrl, "esiaUrl");
        Intrinsics.checkNotNullParameter(clientSession, "clientSession");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f106052b.setValue(Boolean.TRUE);
        this.f106053c.setValue(Boolean.FALSE);
        s0(this, new d(esiaUrl, clientSession, permissions, null), new e(), new f());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(Uri url, Bundle bundle) {
        Pair pair;
        Pair pair2;
        C10848d c10848d;
        x0<Boolean> x0Var = this.f106052b;
        Boolean bool = Boolean.TRUE;
        x0Var.setValue(bool);
        Boolean valueOf = bundle == null ? null : Boolean.valueOf(bundle.getBoolean("EXTRA_BACK_PRESSED"));
        if (url != null) {
            this.f106051a.getClass();
            Intrinsics.checkNotNullParameter(url, "url");
            String queryParameter = url.getQueryParameter("error_description");
            String queryParameter2 = url.getQueryParameter("error");
            String queryParameter3 = url.getQueryParameter("message");
            if (queryParameter != null && kotlin.text.h.t(queryParameter, ProductContainerDTO.RATIO_DELIMITER, false)) {
                List m11 = kotlin.text.h.m(queryParameter, new String[]{ProductContainerDTO.RATIO_DELIMITER}, 0, 6);
                pair = new Pair(m11.get(0), m11.get(1));
            } else if (queryParameter3 != null && kotlin.text.h.t(queryParameter3, ProductContainerDTO.RATIO_DELIMITER, false)) {
                List m12 = kotlin.text.h.m(queryParameter3, new String[]{ProductContainerDTO.RATIO_DELIMITER}, 0, 6);
                pair = new Pair(m12.get(0), m12.get(1));
            } else if (queryParameter2 != null && kotlin.text.h.t(queryParameter2, ProductContainerDTO.RATIO_DELIMITER, false)) {
                List m13 = kotlin.text.h.m(queryParameter2, new String[]{ProductContainerDTO.RATIO_DELIMITER}, 0, 6);
                pair = new Pair(m13.get(0), m13.get(1));
            } else {
                if (queryParameter2 != null && kotlin.text.h.t(queryParameter2, "ESIA-", false)) {
                    pair2 = new Pair(queryParameter2, queryParameter3);
                } else if (queryParameter3 != null && kotlin.text.h.t(queryParameter3, "ESIA-", false)) {
                    pair2 = new Pair(queryParameter3, queryParameter2);
                } else {
                    if (queryParameter2 == null) {
                        queryParameter2 = queryParameter3;
                    }
                    if (queryParameter2 != null) {
                        queryParameter = queryParameter2;
                    }
                    pair = new Pair(null, queryParameter);
                }
                pair = pair2;
            }
            String str = (String) pair.a();
            String str2 = (String) pair.b();
            if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
                if (str == null) {
                    str = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                c10848d = new C10848d((Integer) 4, str, str2);
                if (!Intrinsics.d(valueOf, bool)) {
                    C11115c c11115c = this.f106060j;
                    if (c10848d != null) {
                        c11115c.b(c10848d);
                        return;
                    } else {
                        c11115c.b(new C10848d((String) null, 6, (Integer) 5));
                        return;
                    }
                }
                if (c10848d != null) {
                    n0(c10848d);
                    return;
                } else {
                    if (url != null) {
                        s0(this, new g(url, null), new h(), new i());
                        return;
                    }
                    return;
                }
            }
        }
        c10848d = null;
        if (!Intrinsics.d(valueOf, bool)) {
        }
    }
}
