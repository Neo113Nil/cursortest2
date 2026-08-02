package Ng;

import Qg.g;
import Tg.k;
import Tg.l;
import ch.AbstractC2927d;
import ch.InterfaceC2925b;
import ch.u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public boolean f8080g;

    /* renamed from: a, reason: collision with root package name */
    public final Map f8074a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f8075b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map f8076c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public Function1 f8077d = a.f8082d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8078e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8079f = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8081h = u.f27846a.b();

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f8082d = new a();

        public a() {
            super(1);
        }

        public final void a(g gVar) {
            Intrinsics.checkNotNullParameter(gVar, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((g) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: Ng.b$b, reason: collision with other inner class name */
    public static final class C0165b extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0165b f8083d = new C0165b();

        public C0165b() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m10invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10invoke(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function1 f8084d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function1 f8085e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, Function1 function12) {
            super(1);
            this.f8084d = function1;
            this.f8085e = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m11invoke(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m11invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "$this$null");
            Function1 function1 = this.f8084d;
            if (function1 != null) {
                function1.invoke(obj);
            }
            this.f8085e.invoke(obj);
        }
    }

    public static final class d extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f8086d;

        public static final class a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public static final a f8087d = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC2925b invoke() {
                return AbstractC2927d.a(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k kVar) {
            super(1);
            this.f8086d = kVar;
        }

        public final void a(Ng.a scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            InterfaceC2925b interfaceC2925b = (InterfaceC2925b) scope.getAttributes().c(l.a(), a.f8087d);
            Object obj = scope.B().f8075b.get(this.f8086d.getKey());
            Intrinsics.checkNotNull(obj);
            Object a10 = this.f8086d.a((Function1) obj);
            this.f8086d.b(a10, scope);
            interfaceC2925b.b(this.f8086d.getKey(), a10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Ng.a) obj);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void j(b bVar, k kVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = C0165b.f8083d;
        }
        bVar.h(kVar, function1);
    }

    public final boolean b() {
        return this.f8081h;
    }

    public final Function1 c() {
        return this.f8077d;
    }

    public final boolean d() {
        return this.f8080g;
    }

    public final boolean e() {
        return this.f8078e;
    }

    public final boolean f() {
        return this.f8079f;
    }

    public final void g(Ng.a client) {
        Intrinsics.checkNotNullParameter(client, "client");
        Iterator it = this.f8074a.values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(client);
        }
        Iterator it2 = this.f8076c.values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(client);
        }
    }

    public final void h(k plugin, Function1 configure) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(configure, "configure");
        this.f8075b.put(plugin.getKey(), new c((Function1) this.f8075b.get(plugin.getKey()), configure));
        if (this.f8074a.containsKey(plugin.getKey())) {
            return;
        }
        this.f8074a.put(plugin.getKey(), new d(plugin));
    }

    public final void i(String key, Function1 block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f8076c.put(key, block);
    }

    public final void k(b other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f8078e = other.f8078e;
        this.f8079f = other.f8079f;
        this.f8080g = other.f8080g;
        this.f8074a.putAll(other.f8074a);
        this.f8075b.putAll(other.f8075b);
        this.f8076c.putAll(other.f8076c);
    }
}
