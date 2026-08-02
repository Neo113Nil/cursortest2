package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends Lambda implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2009e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2011g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2012h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, ViewGroup viewGroup, Object obj) {
        super(0);
        this.f2010f = pVar;
        this.f2012h = viewGroup;
        this.f2011g = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2009e) {
            case 0:
                ((p) this.f2010f).f2023f.e((ViewGroup) this.f2012h, this.f2011g);
                break;
            case 1:
                p pVar = (p) this.f2010f;
                ArrayList arrayList = pVar.f2020c;
                a2 a2Var = pVar.f2023f;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((q) it.next()).f1994a.f1909g) {
                            if (j1.L(2)) {
                                Log.v("FragmentManager", "Completing animating immediately");
                            }
                            l0.d dVar = new l0.d();
                            a2Var.u(((q) arrayList.get(0)).f1994a.f1905c, this.f2011g, dVar, new z(3, pVar));
                            dVar.a();
                            break;
                        }
                    }
                }
                if (j1.L(2)) {
                    Log.v("FragmentManager", "Animating to start");
                }
                Object obj = pVar.q;
                Intrinsics.checkNotNull(obj);
                a2Var.d(obj, new c(1, pVar, (ViewGroup) this.f2012h));
            default:
                Integer num = (Integer) this.f2010f;
                io.sentry.android.replay.j jVar = ((io.sentry.android.replay.capture.c) this.f2012h).f15982h;
                if (jVar != null) {
                    jVar.r("segment.id", String.valueOf(num));
                }
                break;
        }
        return Unit.f19194a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Object obj, ViewGroup viewGroup) {
        super(0);
        this.f2010f = pVar;
        this.f2011g = obj;
        this.f2012h = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Object obj, Integer num, io.sentry.android.replay.capture.c cVar) {
        super(0);
        this.f2011g = obj;
        this.f2010f = num;
        this.f2012h = cVar;
    }
}
