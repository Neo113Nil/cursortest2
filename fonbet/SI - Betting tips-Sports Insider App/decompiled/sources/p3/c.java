package p3;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import e3.w;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public w f21500a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f21502c;

    /* renamed from: d, reason: collision with root package name */
    public int f21503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConstraintTrackingWorker constraintTrackingWorker, mf.c cVar) {
        super(cVar);
        this.f21502c = constraintTrackingWorker;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21501b = obj;
        this.f21503d |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.e(this.f21502c, this);
    }
}
