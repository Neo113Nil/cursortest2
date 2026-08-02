package bg;

import gf.x;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import sg.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p implements Iterable, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3221a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3222b;

    public /* synthetic */ p(int i5, Object obj) {
        this.f3221a = i5;
        this.f3222b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3221a) {
            case 0:
                return new kotlin.text.b((kotlin.text.c) this.f3222b);
            case 1:
                return new b(ArrayIteratorKt.iterator((Object[]) ((a2.q) this.f3222b).f60b));
            default:
                return new x((u) this.f3222b);
        }
    }

    public p(a2.q iteratorFactory) {
        this.f3221a = 1;
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f3222b = iteratorFactory;
    }
}
