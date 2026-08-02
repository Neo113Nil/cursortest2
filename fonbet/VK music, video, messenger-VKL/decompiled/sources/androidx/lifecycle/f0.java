package androidx.lifecycle;

/* compiled from: WithLifecycleState.kt */
/* loaded from: classes12.dex */
public final class f0 implements Runnable {
    public final /* synthetic */ Lifecycle b;
    public final /* synthetic */ h0 c;

    public f0(Lifecycle lifecycle, h0 h0Var) {
        this.b = lifecycle;
        this.c = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.addObserver(this.c);
    }
}
