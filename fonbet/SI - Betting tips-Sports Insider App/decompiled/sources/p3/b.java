package p3;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f21498b;

    /* renamed from: c, reason: collision with root package name */
    public int f21499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ConstraintTrackingWorker constraintTrackingWorker, mf.c cVar) {
        super(cVar);
        this.f21498b = constraintTrackingWorker;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21497a = obj;
        this.f21499c |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.d(this.f21498b, null, null, null, this);
    }
}
