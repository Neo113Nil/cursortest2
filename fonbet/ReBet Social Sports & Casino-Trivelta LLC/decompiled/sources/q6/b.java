package q6;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import q6.f;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: m, reason: collision with root package name */
    public static final a f63411m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final Map f63412n = MapsKt.hashMapOf(TuplesKt.to("embedding.weight", "embed.weight"), TuplesKt.to("dense1.weight", "fc1.weight"), TuplesKt.to("dense2.weight", "fc2.weight"), TuplesKt.to("dense3.weight", "fc3.weight"), TuplesKt.to("dense1.bias", "fc1.bias"), TuplesKt.to("dense2.bias", "fc2.bias"), TuplesKt.to("dense3.bias", "fc3.bias"));

    /* renamed from: a, reason: collision with root package name */
    public final C6119a f63413a;

    /* renamed from: b, reason: collision with root package name */
    public final C6119a f63414b;

    /* renamed from: c, reason: collision with root package name */
    public final C6119a f63415c;

    /* renamed from: d, reason: collision with root package name */
    public final C6119a f63416d;

    /* renamed from: e, reason: collision with root package name */
    public final C6119a f63417e;

    /* renamed from: f, reason: collision with root package name */
    public final C6119a f63418f;

    /* renamed from: g, reason: collision with root package name */
    public final C6119a f63419g;

    /* renamed from: h, reason: collision with root package name */
    public final C6119a f63420h;

    /* renamed from: i, reason: collision with root package name */
    public final C6119a f63421i;

    /* renamed from: j, reason: collision with root package name */
    public final C6119a f63422j;

    /* renamed from: k, reason: collision with root package name */
    public final C6119a f63423k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f63424l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            Map b10 = b(file);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (b10 == null) {
                return null;
            }
            try {
                return new b(b10, defaultConstructorMarker);
            } catch (Exception unused) {
                return null;
            }
        }

        public final Map b(File file) {
            Map c10 = j.c(file);
            if (c10 == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Map a10 = b.a();
            for (Map.Entry entry : c10.entrySet()) {
                String str = (String) entry.getKey();
                if (a10.containsKey(entry.getKey()) && (str = (String) a10.get(entry.getKey())) == null) {
                    return null;
                }
                hashMap.put(str, entry.getValue());
            }
            return hashMap;
        }

        public a() {
        }
    }

    public /* synthetic */ b(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        if (Y7.a.d(b.class)) {
            return null;
        }
        try {
            return f63412n;
        } catch (Throwable th2) {
            Y7.a.b(th2, b.class);
            return null;
        }
    }

    public final C6119a b(C6119a dense, String[] texts, String task) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(dense, "dense");
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(task, "task");
            i iVar = i.f63442a;
            C6119a c10 = i.c(i.e(texts, 128, this.f63413a), this.f63414b);
            i.a(c10, this.f63417e);
            i.i(c10);
            C6119a c11 = i.c(c10, this.f63415c);
            i.a(c11, this.f63418f);
            i.i(c11);
            C6119a g10 = i.g(c11, 2);
            C6119a c12 = i.c(g10, this.f63416d);
            i.a(c12, this.f63419g);
            i.i(c12);
            C6119a g11 = i.g(c10, c10.b(1));
            C6119a g12 = i.g(g10, g10.b(1));
            C6119a g13 = i.g(c12, c12.b(1));
            i.f(g11, 1);
            i.f(g12, 1);
            i.f(g13, 1);
            C6119a d10 = i.d(i.b(new C6119a[]{g11, g12, g13, dense}), this.f63420h, this.f63422j);
            i.i(d10);
            C6119a d11 = i.d(d10, this.f63421i, this.f63423k);
            i.i(d11);
            C6119a c6119a = (C6119a) this.f63424l.get(Intrinsics.stringPlus(task, ".weight"));
            C6119a c6119a2 = (C6119a) this.f63424l.get(Intrinsics.stringPlus(task, ".bias"));
            if (c6119a != null && c6119a2 != null) {
                C6119a d12 = i.d(d11, c6119a, c6119a2);
                i.j(d12);
                return d12;
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public b(Map map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63413a = (C6119a) obj;
        i iVar = i.f63442a;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63414b = i.l((C6119a) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63415c = i.l((C6119a) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63416d = i.l((C6119a) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63417e = (C6119a) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63418f = (C6119a) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63419g = (C6119a) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63420h = i.k((C6119a) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63421i = i.k((C6119a) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63422j = (C6119a) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63423k = (C6119a) obj11;
        this.f63424l = new HashMap();
        for (String str : SetsKt.setOf((Object[]) new String[]{f.a.MTML_INTEGRITY_DETECT.b(), f.a.MTML_APP_EVENT_PREDICTION.b()})) {
            String stringPlus = Intrinsics.stringPlus(str, ".weight");
            String stringPlus2 = Intrinsics.stringPlus(str, ".bias");
            C6119a c6119a = (C6119a) map.get(stringPlus);
            C6119a c6119a2 = (C6119a) map.get(stringPlus2);
            if (c6119a != null) {
                this.f63424l.put(stringPlus, i.k(c6119a));
            }
            if (c6119a2 != null) {
                this.f63424l.put(stringPlus2, c6119a2);
            }
        }
    }
}
