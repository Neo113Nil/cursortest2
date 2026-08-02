package q4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final b f21967a;

    /* renamed from: b, reason: collision with root package name */
    public final b f21968b;

    /* renamed from: c, reason: collision with root package name */
    public final b f21969c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f21970d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f21971e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f21972f;

    /* renamed from: g, reason: collision with root package name */
    public final r4.j f21973g;

    /* renamed from: h, reason: collision with root package name */
    public final r4.g f21974h;

    /* renamed from: i, reason: collision with root package name */
    public final r4.d f21975i;

    public g(b bVar, b bVar2, b bVar3, Function1 function1, Function1 function12, Function1 function13, r4.j jVar, r4.g gVar, r4.d dVar) {
        this.f21967a = bVar;
        this.f21968b = bVar2;
        this.f21969c = bVar3;
        this.f21970d = function1;
        this.f21971e = function12;
        this.f21972f = function13;
        this.f21973g = jVar;
        this.f21974h = gVar;
        this.f21975i = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && this.f21967a == gVar.f21967a && this.f21968b == gVar.f21968b && this.f21969c == gVar.f21969c && Intrinsics.areEqual(this.f21970d, gVar.f21970d) && Intrinsics.areEqual(this.f21971e, gVar.f21971e) && Intrinsics.areEqual(this.f21972f, gVar.f21972f) && Intrinsics.areEqual(this.f21973g, gVar.f21973g) && this.f21974h == gVar.f21974h && this.f21975i == gVar.f21975i;
    }

    public final int hashCode() {
        b bVar = this.f21967a;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        b bVar2 = this.f21968b;
        int hashCode2 = (hashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        b bVar3 = this.f21969c;
        int hashCode3 = (hashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        Function1 function1 = this.f21970d;
        int hashCode4 = (hashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.f21971e;
        int hashCode5 = (hashCode4 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1 function13 = this.f21972f;
        int hashCode6 = (hashCode5 + (function13 == null ? 0 : function13.hashCode())) * 31;
        r4.j jVar = this.f21973g;
        int hashCode7 = (hashCode6 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        r4.g gVar = this.f21974h;
        int hashCode8 = (hashCode7 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        r4.d dVar = this.f21975i;
        return hashCode8 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=null, fetcherCoroutineContext=null, decoderCoroutineContext=null, memoryCachePolicy=" + this.f21967a + ", diskCachePolicy=" + this.f21968b + ", networkCachePolicy=" + this.f21969c + ", placeholderFactory=" + this.f21970d + ", errorFactory=" + this.f21971e + ", fallbackFactory=" + this.f21972f + ", sizeResolver=" + this.f21973g + ", scale=" + this.f21974h + ", precision=" + this.f21975i + ')';
    }
}
