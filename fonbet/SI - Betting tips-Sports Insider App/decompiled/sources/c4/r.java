package c4;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3602a;

    /* renamed from: b, reason: collision with root package name */
    public final q4.f f3603b;

    /* renamed from: c, reason: collision with root package name */
    public final gf.t f3604c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3605d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3606e;

    /* renamed from: f, reason: collision with root package name */
    public final e f3607f;

    public r(Context context, q4.f fVar, gf.t tVar, gf.i iVar, gf.i iVar2, e eVar) {
        this.f3602a = context;
        this.f3603b = fVar;
        this.f3604c = tVar;
        this.f3605d = iVar;
        this.f3606e = iVar2;
        this.f3607f = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!Intrinsics.areEqual(this.f3602a, rVar.f3602a) || !Intrinsics.areEqual(this.f3603b, rVar.f3603b) || !Intrinsics.areEqual(this.f3604c, rVar.f3604c) || !Intrinsics.areEqual(this.f3605d, rVar.f3605d) || !Intrinsics.areEqual(this.f3606e, rVar.f3606e)) {
            return false;
        }
        h hVar = h.f3590a;
        return Intrinsics.areEqual(hVar, hVar) && Intrinsics.areEqual(this.f3607f, rVar.f3607f) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return (this.f3607f.hashCode() + ((h.f3590a.hashCode() + ((this.f3606e.hashCode() + ((this.f3605d.hashCode() + ((this.f3604c.hashCode() + ((this.f3603b.hashCode() + (this.f3602a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.f3602a + ", defaults=" + this.f3603b + ", mainCoroutineContextLazy=" + this.f3604c + ", memoryCacheLazy=" + this.f3605d + ", diskCacheLazy=" + this.f3606e + ", eventListenerFactory=" + h.f3590a + ", componentRegistry=" + this.f3607f + ", logger=null)";
    }
}
