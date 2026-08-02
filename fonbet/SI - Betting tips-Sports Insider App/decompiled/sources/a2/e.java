package a2;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29b;

    public /* synthetic */ e(int i5, Object obj) {
        this.f28a = i5;
        this.f29b = obj;
    }

    @Override // androidx.lifecycle.c0
    public final void c(e0 source, w event) {
        switch (this.f28a) {
            case 0:
                m mVar = (m) this.f29b;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == w.ON_DESTROY) {
                    Fragment fragment = (Fragment) source;
                    Object obj = null;
                    for (Object obj2 : (Iterable) mVar.b().f25605f.f10742a.getValue()) {
                        if (Intrinsics.areEqual(((y1.l) obj2).f25587f, fragment.getTag())) {
                            obj = obj2;
                        }
                    }
                    y1.l lVar = (y1.l) obj;
                    if (lVar != null) {
                        if (m.n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + source + " lifecycle reaching DESTROYED");
                        }
                        mVar.b().c(lVar);
                        break;
                    }
                }
                break;
            case 1:
                b2.j jVar = (b2.j) this.f29b;
                Intrinsics.checkNotNullParameter(source, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                jVar.f3000p = event.a();
                if (jVar.f2988c != null) {
                    Iterator it = CollectionsKt.X(jVar.f2991f).iterator();
                    while (it.hasNext()) {
                        y1.l lVar2 = (y1.l) it.next();
                        lVar2.getClass();
                        Intrinsics.checkNotNullParameter(event, "event");
                        b2.d dVar = lVar2.f25589h;
                        dVar.getClass();
                        Intrinsics.checkNotNullParameter(event, "event");
                        y1.l lVar3 = dVar.f2956a;
                        x a7 = event.a();
                        Intrinsics.checkNotNullParameter(a7, "<set-?>");
                        lVar3.f25585d = a7;
                        dVar.f2959d = event.a();
                        dVar.b();
                    }
                    break;
                }
                break;
            default:
                r2.a aVar = (r2.a) this.f29b;
                Intrinsics.checkNotNullParameter(source, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == w.ON_START) {
                    aVar.f22206h = true;
                    break;
                } else if (event == w.ON_STOP) {
                    aVar.f22206h = false;
                    break;
                }
                break;
        }
    }
}
