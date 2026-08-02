package m3;

import f3.x;
import java.util.Iterator;
import java.util.Set;
import k2.w;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final w f20365a;

    /* renamed from: b, reason: collision with root package name */
    public final b f20366b;

    public u(w __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f20365a = __db;
        this.f20366b = new b(5);
    }

    public final void a(String id2, Set tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            t workTag = new t((String) it.next(), id2);
            Intrinsics.checkNotNullParameter(workTag, "workTag");
            x.n0(this.f20365a, false, true, new fg.d(11, this, workTag));
        }
    }
}
