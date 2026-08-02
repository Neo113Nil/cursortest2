package a2;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f40d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i5) {
        this.f37a = i5;
        this.f38b = obj;
        this.f39c = obj2;
        this.f40d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37a) {
            case 0:
                m mVar = (m) this.f38b;
                Fragment fragment = (Fragment) this.f39c;
                y1.l lVar = (y1.l) this.f40d;
                e0 e0Var = (e0) obj;
                ArrayList arrayList = mVar.f51g;
                boolean z5 = false;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.areEqual(((Pair) it.next()).f19192a, fragment.getTag())) {
                                z5 = true;
                            }
                        }
                    }
                }
                if (e0Var != null && !z5) {
                    y lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
                    if (((g0) lifecycle).f2169d.a(x.f2255c)) {
                        lifecycle.a((d0) mVar.f53i.invoke(lVar));
                    }
                }
                return Unit.f19194a;
            case 1:
                f fVar = (f) this.f38b;
                com.google.firebase.messaging.x xVar = (com.google.firebase.messaging.x) this.f39c;
                c1.k kVar = (c1.k) this.f40d;
                Throwable th2 = (Throwable) obj;
                fVar.invoke(th2);
                gg.h hVar = (gg.h) xVar.f6184c;
                hVar.l(th2, false);
                while (true) {
                    Object e7 = hVar.e();
                    if (e7 instanceof gg.n) {
                        e7 = null;
                    }
                    if (e7 == null) {
                        return Unit.f19194a;
                    }
                    kVar.invoke(e7, th2);
                }
            default:
                String str = (String) this.f38b;
                String str2 = (String) this.f39c;
                Integer num = (Integer) this.f40d;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                s2.c r02 = _connection.r0("INSERT INTO events_table (name, content, dateCreate) VALUES (?, ?, ?)");
                try {
                    r02.B(1, str);
                    if (str2 == null) {
                        r02.h(2);
                    } else {
                        r02.B(2, str2);
                    }
                    r02.f(3, num.intValue());
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection);
                    r02.close();
                    return Long.valueOf(p10);
                } catch (Throwable th3) {
                    r02.close();
                    throw th3;
                }
        }
    }
}
