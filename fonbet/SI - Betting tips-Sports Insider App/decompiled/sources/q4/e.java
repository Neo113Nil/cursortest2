package q4;

import android.content.Context;
import java.util.Map;
import kotlin.collections.n0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import okio.FileSystem;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21938a;

    /* renamed from: b, reason: collision with root package name */
    public f f21939b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21940c;

    /* renamed from: d, reason: collision with root package name */
    public s4.b f21941d;

    /* renamed from: e, reason: collision with root package name */
    public c4.i f21942e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21943f;

    /* renamed from: g, reason: collision with root package name */
    public Map f21944g;

    /* renamed from: h, reason: collision with root package name */
    public b f21945h;

    /* renamed from: i, reason: collision with root package name */
    public b f21946i;
    public b j;

    /* renamed from: k, reason: collision with root package name */
    public Function1 f21947k;

    /* renamed from: l, reason: collision with root package name */
    public Function1 f21948l;

    /* renamed from: m, reason: collision with root package name */
    public final Function1 f21949m;

    /* renamed from: n, reason: collision with root package name */
    public r4.j f21950n;

    /* renamed from: o, reason: collision with root package name */
    public r4.g f21951o;

    /* renamed from: p, reason: collision with root package name */
    public r4.d f21952p;
    public Object q;

    public e(Context context) {
        this.f21938a = context;
        this.f21939b = f.f21953o;
        this.f21940c = null;
        this.f21941d = null;
        this.f21942e = null;
        this.f21944g = n0.c();
        this.f21945h = null;
        this.f21946i = null;
        this.j = null;
        v4.o oVar = v4.o.f24430a;
        this.f21947k = oVar;
        this.f21948l = oVar;
        this.f21949m = oVar;
        this.f21950n = null;
        this.f21951o = null;
        this.f21952p = null;
        this.q = c4.l.f3594b;
    }

    public final h a() {
        Map map;
        c4.l lVar;
        Object obj = this.f21940c;
        if (obj == null) {
            obj = l.f22006a;
        }
        Object obj2 = obj;
        s4.b bVar = this.f21941d;
        c4.i iVar = this.f21942e;
        Map map2 = this.f21944g;
        if (Intrinsics.areEqual(map2, Boolean.valueOf(this.f21943f))) {
            Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            map = ci.c.b0(TypeIntrinsics.asMutableMap(map2));
        } else {
            if (!(map2 instanceof Map)) {
                throw new AssertionError();
            }
            map = map2;
        }
        Map map3 = map;
        Intrinsics.checkNotNull(map3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        f fVar = this.f21939b;
        FileSystem fileSystem = fVar.f21954a;
        b bVar2 = this.f21945h;
        if (bVar2 == null) {
            bVar2 = fVar.f21958e;
        }
        b bVar3 = bVar2;
        b bVar4 = this.f21946i;
        if (bVar4 == null) {
            bVar4 = fVar.f21959f;
        }
        b bVar5 = bVar4;
        b bVar6 = this.j;
        if (bVar6 == null) {
            bVar6 = fVar.f21960g;
        }
        b bVar7 = bVar6;
        CoroutineContext coroutineContext = fVar.f21955b;
        CoroutineContext coroutineContext2 = fVar.f21956c;
        CoroutineContext coroutineContext3 = fVar.f21957d;
        Function1 function1 = this.f21947k;
        if (function1 == null) {
            function1 = fVar.f21961h;
        }
        Function1 function12 = function1;
        Function1 function13 = this.f21948l;
        if (function13 == null) {
            function13 = fVar.f21962i;
        }
        Function1 function14 = function13;
        Function1 function15 = this.f21949m;
        if (function15 == null) {
            function15 = fVar.j;
        }
        Function1 function16 = function15;
        r4.j jVar = this.f21950n;
        if (jVar == null) {
            jVar = fVar.f21963k;
        }
        r4.j jVar2 = jVar;
        r4.g gVar = this.f21951o;
        if (gVar == null) {
            gVar = fVar.f21964l;
        }
        r4.g gVar2 = gVar;
        r4.d dVar = this.f21952p;
        if (dVar == null) {
            dVar = fVar.f21965m;
        }
        r4.d dVar2 = dVar;
        Object obj3 = this.q;
        if (obj3 instanceof c4.j) {
            lVar = new c4.l(ci.c.b0(((c4.j) obj3).f3592a));
        } else {
            if (!(obj3 instanceof c4.l)) {
                throw new AssertionError();
            }
            lVar = (c4.l) obj3;
        }
        c4.l lVar2 = lVar;
        Function1 function17 = this.f21947k;
        Function1 function18 = this.f21948l;
        return new h(this.f21938a, obj2, bVar, iVar, map3, fileSystem, coroutineContext, coroutineContext2, coroutineContext3, bVar3, bVar5, bVar7, function12, function14, function16, jVar2, gVar2, dVar2, lVar2, new g(this.f21945h, this.f21946i, this.j, function17, function18, this.f21949m, this.f21950n, this.f21951o, this.f21952p), this.f21939b);
    }

    public final Map b() {
        Map map = this.f21944g;
        if (!Intrinsics.areEqual(map, Boolean.valueOf(this.f21943f))) {
            if (!(map instanceof Map)) {
                throw new AssertionError();
            }
            map = n0.j(map);
            this.f21944g = map;
            this.f21943f = true;
        }
        Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
        return TypeIntrinsics.asMutableMap(map);
    }

    public final void c(int i5, int i10) {
        this.f21950n = new r4.e(ci.c.c(i5, i10));
    }

    public e(h hVar, Context context) {
        this.f21938a = context;
        this.f21939b = hVar.f21994u;
        this.f21940c = hVar.f21977b;
        this.f21941d = hVar.f21978c;
        this.f21942e = hVar.f21979d;
        this.f21944g = hVar.f21980e;
        g gVar = hVar.f21993t;
        this.f21945h = gVar.f21967a;
        this.f21946i = gVar.f21968b;
        this.j = gVar.f21969c;
        this.f21947k = gVar.f21970d;
        this.f21948l = gVar.f21971e;
        this.f21949m = gVar.f21972f;
        this.f21950n = gVar.f21973g;
        this.f21951o = gVar.f21974h;
        this.f21952p = gVar.f21975i;
        this.q = hVar.f21992s;
    }
}
