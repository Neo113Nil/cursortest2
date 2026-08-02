package ze;

import com.google.gson.k;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.conversations.data.local.entities.SalesIQConversationAttributes;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import od.y;

/* renamed from: ze.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6959a {

    /* renamed from: v, reason: collision with root package name */
    public static C6959a f68674v;

    /* renamed from: x, reason: collision with root package name */
    public static De.b f68676x;

    /* renamed from: a, reason: collision with root package name */
    public Channel f68678a;

    /* renamed from: b, reason: collision with root package name */
    public Long f68679b;

    /* renamed from: c, reason: collision with root package name */
    public Long f68680c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f68681d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f68682e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f68683f;

    /* renamed from: g, reason: collision with root package name */
    public String f68684g;

    /* renamed from: h, reason: collision with root package name */
    public y f68685h;

    /* renamed from: i, reason: collision with root package name */
    public final Lazy f68686i;

    /* renamed from: j, reason: collision with root package name */
    public final Lazy f68687j;

    /* renamed from: k, reason: collision with root package name */
    public HashMap f68688k;

    /* renamed from: l, reason: collision with root package name */
    public LinkedHashMap f68689l;

    /* renamed from: m, reason: collision with root package name */
    public LinkedHashMap f68690m;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashMap f68691n;

    /* renamed from: o, reason: collision with root package name */
    public HashMap f68692o;

    /* renamed from: p, reason: collision with root package name */
    public Form.Message f68693p;

    /* renamed from: q, reason: collision with root package name */
    public SalesIQConversationAttributes f68694q;

    /* renamed from: r, reason: collision with root package name */
    public final Lazy f68695r;

    /* renamed from: s, reason: collision with root package name */
    public final Lazy f68696s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f68697t;

    /* renamed from: u, reason: collision with root package name */
    public static final C0984a f68673u = new C0984a(null);

    /* renamed from: w, reason: collision with root package name */
    public static final Object f68675w = new Object();

    /* renamed from: y, reason: collision with root package name */
    public static final HashMap f68677y = new HashMap();

    /* renamed from: ze.a$a, reason: collision with other inner class name */
    public static final class C0984a {
        public /* synthetic */ C0984a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            C6959a.f68674v = null;
        }

        public final C6959a b() {
            C6959a c6959a;
            synchronized (C6959a.f68675w) {
                c6959a = C6959a.f68674v;
                if (c6959a == null) {
                    c6959a = new C6959a(null);
                    C6959a.f68674v = c6959a;
                }
            }
            return c6959a;
        }

        public final De.b c() {
            return C6959a.f68676x;
        }

        public final void d(De.b bVar) {
            C6959a.e(bVar);
        }

        public C0984a() {
        }
    }

    /* renamed from: ze.a$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f68698d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: ze.a$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f68699d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: ze.a$d */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f68700d = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HashMap invoke() {
            return new HashMap();
        }
    }

    /* renamed from: ze.a$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f68701d = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return new k();
        }
    }

    public /* synthetic */ C6959a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final void g() {
        f68673u.a();
    }

    public static final C6959a t() {
        return f68673u.b();
    }

    public final Boolean A() {
        return this.f68682e;
    }

    public final Boolean B() {
        return this.f68681d;
    }

    public final boolean C() {
        return this.f68697t;
    }

    public final void D(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
        this.f68691n = linkedHashMap;
    }

    public final void E(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
        this.f68690m = linkedHashMap;
    }

    public final void F(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
        this.f68689l = linkedHashMap;
    }

    public final void G(Channel channel) {
        this.f68678a = channel;
    }

    public final void H(String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        f68677y.put(key, Boolean.valueOf(z10));
    }

    public final void I(String str) {
        this.f68684g = str;
    }

    public final void J(Long l10) {
        this.f68679b = l10;
    }

    public final void K(SalesIQConversationAttributes salesIQConversationAttributes) {
        this.f68694q = salesIQConversationAttributes;
    }

    public final void L(Form.Message message) {
        this.f68693p = message;
    }

    public final void M(HashMap hashMap) {
        this.f68692o = hashMap;
    }

    public final void N(Boolean bool) {
        this.f68683f = bool;
    }

    public final void O(Boolean bool) {
        this.f68682e = bool;
    }

    public final void P(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.f68688k = hashMap;
    }

    public final void Q(Boolean bool) {
        this.f68681d = bool;
    }

    public final void R(y yVar) {
        this.f68685h = yVar;
    }

    public final void S(boolean z10) {
        this.f68697t = z10;
    }

    public final void f() {
        this.f68688k.clear();
        this.f68691n.clear();
        this.f68689l.clear();
        this.f68690m.clear();
    }

    public final LinkedHashMap h() {
        return this.f68691n;
    }

    public final LinkedHashMap i() {
        return this.f68690m;
    }

    public final LinkedHashMap j() {
        return this.f68689l;
    }

    public final Long k() {
        return this.f68680c;
    }

    public final Channel l() {
        return this.f68678a;
    }

    public final Boolean m(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Boolean) f68677y.get(key);
    }

    public final String n() {
        return this.f68684g;
    }

    public final Long o() {
        return this.f68679b;
    }

    public final SalesIQConversationAttributes p() {
        return this.f68694q;
    }

    public final Map q() {
        return (Map) this.f68695r.getValue();
    }

    public final Form.Message r() {
        return this.f68693p;
    }

    public final HashMap s() {
        return this.f68692o;
    }

    public final Set u() {
        return (Set) this.f68687j.getValue();
    }

    public final HashMap v() {
        return this.f68688k;
    }

    public final y w() {
        return this.f68685h;
    }

    public final HashMap x() {
        return (HashMap) this.f68696s.getValue();
    }

    public final k y() {
        return (k) this.f68686i.getValue();
    }

    public final Boolean z() {
        return this.f68683f;
    }

    public C6959a() {
        this.f68686i = LazyKt.lazy(e.f68701d);
        this.f68687j = LazyKt.lazy(c.f68699d);
        this.f68688k = new HashMap();
        this.f68689l = new LinkedHashMap();
        this.f68690m = new LinkedHashMap();
        this.f68691n = new LinkedHashMap();
        this.f68695r = LazyKt.lazy(b.f68698d);
        this.f68696s = LazyKt.lazy(d.f68700d);
    }

    public static final /* synthetic */ void e(De.b bVar) {
    }
}
