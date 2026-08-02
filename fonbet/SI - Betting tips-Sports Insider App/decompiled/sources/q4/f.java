package q4;

import eg.m0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: o, reason: collision with root package name */
    public static final f f21953o;

    /* renamed from: a, reason: collision with root package name */
    public final FileSystem f21954a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f21955b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext f21956c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f21957d;

    /* renamed from: e, reason: collision with root package name */
    public final b f21958e;

    /* renamed from: f, reason: collision with root package name */
    public final b f21959f;

    /* renamed from: g, reason: collision with root package name */
    public final b f21960g;

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f21961h;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f21962i;
    public final Function1 j;

    /* renamed from: k, reason: collision with root package name */
    public final r4.j f21963k;

    /* renamed from: l, reason: collision with root package name */
    public final r4.g f21964l;

    /* renamed from: m, reason: collision with root package name */
    public final r4.d f21965m;

    /* renamed from: n, reason: collision with root package name */
    public final c4.l f21966n;

    static {
        FileSystem fileSystem = FileSystem.SYSTEM;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f19227a;
        lg.e eVar = m0.f9201a;
        lg.d dVar = lg.d.f20063c;
        b bVar = b.f21930c;
        r4.e eVar2 = r4.j.f22309a;
        r4.g gVar2 = r4.g.f22299b;
        r4.d dVar2 = r4.d.f22293a;
        c4.l lVar = c4.l.f3594b;
        v4.o oVar = v4.o.f24430a;
        f21953o = new f(fileSystem, gVar, dVar, dVar, bVar, bVar, bVar, oVar, oVar, oVar, eVar2, gVar2, dVar2, lVar);
    }

    public f(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, b bVar, b bVar2, b bVar3, Function1 function1, Function1 function12, Function1 function13, r4.j jVar, r4.g gVar, r4.d dVar, c4.l lVar) {
        this.f21954a = fileSystem;
        this.f21955b = coroutineContext;
        this.f21956c = coroutineContext2;
        this.f21957d = coroutineContext3;
        this.f21958e = bVar;
        this.f21959f = bVar2;
        this.f21960g = bVar3;
        this.f21961h = function1;
        this.f21962i = function12;
        this.j = function13;
        this.f21963k = jVar;
        this.f21964l = gVar;
        this.f21965m = dVar;
        this.f21966n = lVar;
    }

    public static f a(f fVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, c4.l lVar, int i5) {
        b bVar = b.f21930c;
        FileSystem fileSystem = fVar.f21954a;
        CoroutineContext coroutineContext4 = (i5 & 2) != 0 ? fVar.f21955b : coroutineContext;
        CoroutineContext coroutineContext5 = (i5 & 4) != 0 ? fVar.f21956c : coroutineContext2;
        CoroutineContext coroutineContext6 = (i5 & 8) != 0 ? fVar.f21957d : coroutineContext3;
        b bVar2 = (i5 & 16) != 0 ? fVar.f21958e : bVar;
        b bVar3 = (i5 & 32) != 0 ? fVar.f21959f : bVar;
        if ((i5 & 64) != 0) {
            bVar = fVar.f21960g;
        }
        b bVar4 = bVar;
        Function1 function1 = fVar.f21961h;
        Function1 function12 = fVar.f21962i;
        Function1 function13 = fVar.j;
        r4.j jVar = fVar.f21963k;
        r4.g gVar = fVar.f21964l;
        r4.d dVar = fVar.f21965m;
        c4.l lVar2 = (i5 & Segment.SIZE) != 0 ? fVar.f21966n : lVar;
        fVar.getClass();
        return new f(fileSystem, coroutineContext4, coroutineContext5, coroutineContext6, bVar2, bVar3, bVar4, function1, function12, function13, jVar, gVar, dVar, lVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f21954a, fVar.f21954a) && Intrinsics.areEqual(this.f21955b, fVar.f21955b) && Intrinsics.areEqual(this.f21956c, fVar.f21956c) && Intrinsics.areEqual(this.f21957d, fVar.f21957d) && this.f21958e == fVar.f21958e && this.f21959f == fVar.f21959f && this.f21960g == fVar.f21960g && Intrinsics.areEqual(this.f21961h, fVar.f21961h) && Intrinsics.areEqual(this.f21962i, fVar.f21962i) && Intrinsics.areEqual(this.j, fVar.j) && Intrinsics.areEqual(this.f21963k, fVar.f21963k) && this.f21964l == fVar.f21964l && this.f21965m == fVar.f21965m && Intrinsics.areEqual(this.f21966n, fVar.f21966n);
    }

    public final int hashCode() {
        return this.f21966n.f3595a.hashCode() + ((this.f21965m.hashCode() + ((this.f21964l.hashCode() + ((this.f21963k.hashCode() + ((this.j.hashCode() + ((this.f21962i.hashCode() + ((this.f21961h.hashCode() + ((this.f21960g.hashCode() + ((this.f21959f.hashCode() + ((this.f21958e.hashCode() + ((this.f21957d.hashCode() + ((this.f21956c.hashCode() + ((this.f21955b.hashCode() + (this.f21954a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.f21954a + ", interceptorCoroutineContext=" + this.f21955b + ", fetcherCoroutineContext=" + this.f21956c + ", decoderCoroutineContext=" + this.f21957d + ", memoryCachePolicy=" + this.f21958e + ", diskCachePolicy=" + this.f21959f + ", networkCachePolicy=" + this.f21960g + ", placeholderFactory=" + this.f21961h + ", errorFactory=" + this.f21962i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.f21963k + ", scale=" + this.f21964l + ", precision=" + this.f21965m + ", extras=" + this.f21966n + ')';
    }
}
