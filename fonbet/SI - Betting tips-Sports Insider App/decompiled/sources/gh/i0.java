package gh;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final y f10206a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10207b;

    /* renamed from: c, reason: collision with root package name */
    public final Headers f10208c;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f10209d;

    /* renamed from: e, reason: collision with root package name */
    public final rh.g f10210e;

    /* renamed from: f, reason: collision with root package name */
    public c f10211f;

    public i0(c4.d builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        y yVar = (y) builder.f3577b;
        if (yVar == null) {
            throw new IllegalStateException("url == null");
        }
        this.f10206a = yVar;
        this.f10207b = (String) builder.f3578c;
        this.f10208c = ((v) builder.f3579d).d();
        this.f10209d = (m0) builder.f3580e;
        this.f10210e = (rh.g) builder.f3581f;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f10208c.get(name);
    }

    public final c4.d b() {
        Intrinsics.checkNotNullParameter(this, "request");
        c4.d dVar = new c4.d(false);
        dVar.f3577b = this.f10206a;
        dVar.f3578c = this.f10207b;
        dVar.f3580e = this.f10209d;
        dVar.f3581f = this.f10210e;
        dVar.f3579d = this.f10208c.newBuilder();
        return dVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Request{method=");
        sb2.append(this.f10207b);
        sb2.append(", url=");
        sb2.append(this.f10206a);
        Headers headers = this.f10208c;
        if (headers.size() != 0) {
            sb2.append(", headers=[");
            int i5 = 0;
            for (Pair<? extends String, ? extends String> pair : headers) {
                int i10 = i5 + 1;
                if (i5 < 0) {
                    kotlin.collections.u.j();
                    throw null;
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String str = (String) pair2.f19192a;
                String str2 = (String) pair2.f19193b;
                if (i5 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                if (hh.e.j(str)) {
                    str2 = "██";
                }
                sb2.append(str2);
                i5 = i10;
            }
            sb2.append(']');
        }
        hh.a aVar = hh.a.f10814f;
        rh.g gVar = this.f10210e;
        if (!Intrinsics.areEqual(gVar, aVar)) {
            sb2.append(", tags=");
            sb2.append(gVar);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
