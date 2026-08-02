package f3;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9349c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9350d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i5) {
        this.f9347a = i5;
        this.f9348b = obj;
        this.f9349c = obj2;
        this.f9350d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f9347a) {
            case 0:
                f fVar = (f) this.f9348b;
                ArrayList arrayList = (ArrayList) this.f9349c;
                String id2 = (String) this.f9350d;
                WorkDatabase workDatabase = fVar.f9357e;
                m3.u z5 = workDatabase.z();
                z5.getClass();
                Intrinsics.checkNotNullParameter(id2, "id");
                arrayList.addAll((List) x.n0(z5.f20365a, true, false, new a2.k(id2, 25)));
                return workDatabase.y().c(id2);
            default:
                return ((p8.e) this.f9348b).f21549a.submit(new io.sentry.android.replay.util.c(18, (Callable) this.f9349c, (i2.d) this.f9350d));
        }
    }
}
