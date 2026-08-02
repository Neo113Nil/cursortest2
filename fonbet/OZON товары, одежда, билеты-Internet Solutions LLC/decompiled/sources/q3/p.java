package q3;

import android.os.ConditionVariable;

/* loaded from: classes.dex */
final class p extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConditionVariable f81482a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f81483b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(q qVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f81483b = qVar;
        this.f81482a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        d dVar;
        synchronized (this.f81483b) {
            this.f81482a.open();
            q.e(this.f81483b);
            dVar = this.f81483b.f81486b;
            dVar.getClass();
        }
    }
}
