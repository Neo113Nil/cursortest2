package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2195a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2196b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2197c;

    public l(DefaultLifecycleObserver defaultLifecycleObserver, c0 c0Var) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f2196b = defaultLifecycleObserver;
        this.f2197c = c0Var;
    }

    @Override // androidx.lifecycle.c0
    public final void c(e0 source, w event) {
        switch (this.f2195a) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f2196b;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                switch (k.$EnumSwitchMapping$0[event.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.onCreate(source);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(source);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(source);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(source);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(source);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(source);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new gf.m();
                }
                c0 c0Var = (c0) this.f2197c;
                if (c0Var != null) {
                    c0Var.c(source, event);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == w.ON_START) {
                    ((y) this.f2196b).b(this);
                    ((q2.d) this.f2197c).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((d) this.f2197c).f2147a;
                List list = (List) hashMap.get(event);
                Object obj = this.f2196b;
                d.a(list, source, event, obj);
                d.a((List) hashMap.get(w.ON_ANY), source, event, obj);
                return;
        }
    }

    public l(d0 d0Var) {
        this.f2196b = d0Var;
        f fVar = f.f2159c;
        Class<?> cls = d0Var.getClass();
        d dVar = (d) fVar.f2160a.get(cls);
        this.f2197c = dVar == null ? fVar.a(cls, null) : dVar;
    }

    public l(y yVar, q2.d dVar) {
        this.f2196b = yVar;
        this.f2197c = dVar;
    }
}
