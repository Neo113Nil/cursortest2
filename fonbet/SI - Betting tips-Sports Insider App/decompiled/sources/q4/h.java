package q4;

import android.content.Context;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21976a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21977b;

    /* renamed from: c, reason: collision with root package name */
    public final s4.b f21978c;

    /* renamed from: d, reason: collision with root package name */
    public final c4.i f21979d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f21980e;

    /* renamed from: f, reason: collision with root package name */
    public final FileSystem f21981f;

    /* renamed from: g, reason: collision with root package name */
    public final CoroutineContext f21982g;

    /* renamed from: h, reason: collision with root package name */
    public final CoroutineContext f21983h;

    /* renamed from: i, reason: collision with root package name */
    public final CoroutineContext f21984i;
    public final b j;

    /* renamed from: k, reason: collision with root package name */
    public final b f21985k;

    /* renamed from: l, reason: collision with root package name */
    public final b f21986l;

    /* renamed from: m, reason: collision with root package name */
    public final Function1 f21987m;

    /* renamed from: n, reason: collision with root package name */
    public final Function1 f21988n;

    /* renamed from: o, reason: collision with root package name */
    public final Function1 f21989o;

    /* renamed from: p, reason: collision with root package name */
    public final r4.j f21990p;
    public final r4.g q;

    /* renamed from: r, reason: collision with root package name */
    public final r4.d f21991r;

    /* renamed from: s, reason: collision with root package name */
    public final c4.l f21992s;

    /* renamed from: t, reason: collision with root package name */
    public final g f21993t;

    /* renamed from: u, reason: collision with root package name */
    public final f f21994u;

    public h(Context context, Object obj, s4.b bVar, c4.i iVar, Map map, FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, b bVar2, b bVar3, b bVar4, Function1 function1, Function1 function12, Function1 function13, r4.j jVar, r4.g gVar, r4.d dVar, c4.l lVar, g gVar2, f fVar) {
        this.f21976a = context;
        this.f21977b = obj;
        this.f21978c = bVar;
        this.f21979d = iVar;
        this.f21980e = map;
        this.f21981f = fileSystem;
        this.f21982g = coroutineContext;
        this.f21983h = coroutineContext2;
        this.f21984i = coroutineContext3;
        this.j = bVar2;
        this.f21985k = bVar3;
        this.f21986l = bVar4;
        this.f21987m = function1;
        this.f21988n = function12;
        this.f21989o = function13;
        this.f21990p = jVar;
        this.q = gVar;
        this.f21991r = dVar;
        this.f21992s = lVar;
        this.f21993t = gVar2;
        this.f21994u = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f21976a, hVar.f21976a) && Intrinsics.areEqual(this.f21977b, hVar.f21977b) && Intrinsics.areEqual(this.f21978c, hVar.f21978c) && Intrinsics.areEqual(this.f21979d, hVar.f21979d) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f21980e, hVar.f21980e) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f21981f, hVar.f21981f) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f21982g, hVar.f21982g) && Intrinsics.areEqual(this.f21983h, hVar.f21983h) && Intrinsics.areEqual(this.f21984i, hVar.f21984i) && this.j == hVar.j && this.f21985k == hVar.f21985k && this.f21986l == hVar.f21986l && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f21987m, hVar.f21987m) && Intrinsics.areEqual(this.f21988n, hVar.f21988n) && Intrinsics.areEqual(this.f21989o, hVar.f21989o) && Intrinsics.areEqual(this.f21990p, hVar.f21990p) && this.q == hVar.q && this.f21991r == hVar.f21991r && Intrinsics.areEqual(this.f21992s, hVar.f21992s) && Intrinsics.areEqual(this.f21993t, hVar.f21993t) && Intrinsics.areEqual(this.f21994u, hVar.f21994u);
    }

    public final int hashCode() {
        int hashCode = (this.f21977b.hashCode() + (this.f21976a.hashCode() * 31)) * 31;
        s4.b bVar = this.f21978c;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c4.i iVar = this.f21979d;
        return this.f21994u.hashCode() + ((this.f21993t.hashCode() + ((this.f21992s.f3595a.hashCode() + ((this.f21991r.hashCode() + ((this.q.hashCode() + ((this.f21990p.hashCode() + ((this.f21989o.hashCode() + ((this.f21988n.hashCode() + ((this.f21987m.hashCode() + ((this.f21986l.hashCode() + ((this.f21985k.hashCode() + ((this.j.hashCode() + ((this.f21984i.hashCode() + ((this.f21983h.hashCode() + ((this.f21982g.hashCode() + ((this.f21981f.hashCode() + ((this.f21980e.hashCode() + ((hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 961)) * 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.f21976a + ", data=" + this.f21977b + ", target=" + this.f21978c + ", listener=" + this.f21979d + ", memoryCacheKey=null, memoryCacheKeyExtras=" + this.f21980e + ", diskCacheKey=null, fileSystem=" + this.f21981f + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f21982g + ", fetcherCoroutineContext=" + this.f21983h + ", decoderCoroutineContext=" + this.f21984i + ", memoryCachePolicy=" + this.j + ", diskCachePolicy=" + this.f21985k + ", networkCachePolicy=" + this.f21986l + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.f21987m + ", errorFactory=" + this.f21988n + ", fallbackFactory=" + this.f21989o + ", sizeResolver=" + this.f21990p + ", scale=" + this.q + ", precision=" + this.f21991r + ", extras=" + this.f21992s + ", defined=" + this.f21993t + ", defaults=" + this.f21994u + ')';
    }
}
