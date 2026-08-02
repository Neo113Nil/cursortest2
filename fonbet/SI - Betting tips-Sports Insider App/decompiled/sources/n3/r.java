package n3;

import androidx.work.impl.WorkDatabase;
import com.google.firebase.messaging.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final x f20851a;

    /* renamed from: b, reason: collision with root package name */
    public final l3.a f20852b;

    /* renamed from: c, reason: collision with root package name */
    public final m3.s f20853c;

    static {
        e3.x.g("WMFgUpdater");
    }

    public r(WorkDatabase workDatabase, l3.a aVar, x xVar) {
        this.f20852b = aVar;
        this.f20851a = xVar;
        this.f20853c = workDatabase.y();
    }
}
