package q4;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22007a;

    /* renamed from: b, reason: collision with root package name */
    public final r4.i f22008b;

    /* renamed from: c, reason: collision with root package name */
    public final r4.g f22009c;

    /* renamed from: d, reason: collision with root package name */
    public final r4.d f22010d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22011e;

    /* renamed from: f, reason: collision with root package name */
    public final FileSystem f22012f;

    /* renamed from: g, reason: collision with root package name */
    public final b f22013g;

    /* renamed from: h, reason: collision with root package name */
    public final b f22014h;

    /* renamed from: i, reason: collision with root package name */
    public final b f22015i;
    public final c4.l j;

    public n(Context context, r4.i iVar, r4.g gVar, r4.d dVar, String str, FileSystem fileSystem, b bVar, b bVar2, b bVar3, c4.l lVar) {
        this.f22007a = context;
        this.f22008b = iVar;
        this.f22009c = gVar;
        this.f22010d = dVar;
        this.f22011e = str;
        this.f22012f = fileSystem;
        this.f22013g = bVar;
        this.f22014h = bVar2;
        this.f22015i = bVar3;
        this.j = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f22007a, nVar.f22007a) && Intrinsics.areEqual(this.f22008b, nVar.f22008b) && this.f22009c == nVar.f22009c && this.f22010d == nVar.f22010d && Intrinsics.areEqual(this.f22011e, nVar.f22011e) && Intrinsics.areEqual(this.f22012f, nVar.f22012f) && this.f22013g == nVar.f22013g && this.f22014h == nVar.f22014h && this.f22015i == nVar.f22015i && Intrinsics.areEqual(this.j, nVar.j);
    }

    public final int hashCode() {
        int hashCode = (this.f22010d.hashCode() + ((this.f22009c.hashCode() + ((this.f22008b.hashCode() + (this.f22007a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f22011e;
        return this.j.f3595a.hashCode() + ((this.f22015i.hashCode() + ((this.f22014h.hashCode() + ((this.f22013g.hashCode() + ((this.f22012f.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.f22007a + ", size=" + this.f22008b + ", scale=" + this.f22009c + ", precision=" + this.f22010d + ", diskCacheKey=" + this.f22011e + ", fileSystem=" + this.f22012f + ", memoryCachePolicy=" + this.f22013g + ", diskCachePolicy=" + this.f22014h + ", networkCachePolicy=" + this.f22015i + ", extras=" + this.j + ')';
    }
}
