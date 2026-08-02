package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.vk.video.profile.presentation.e;
import kotlin.Result;
import xsna.f5z;
import xsna.lq9;

/* compiled from: WithLifecycleState.kt */
/* loaded from: classes12.dex */
public final class h0 implements l {
    public final /* synthetic */ Lifecycle.State b;
    public final /* synthetic */ Lifecycle c;
    public final /* synthetic */ lq9 d;
    public final /* synthetic */ e.a e;

    public h0(Lifecycle.State state, Lifecycle lifecycle, lq9 lq9Var, e.a aVar) {
        this.b = state;
        this.c = lifecycle;
        this.d = lq9Var;
        this.e = aVar;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        Object failure;
        Lifecycle.Event.Companion.getClass();
        Lifecycle.Event b = Lifecycle.Event.a.b(this.b);
        lq9 lq9Var = this.d;
        Lifecycle lifecycle = this.c;
        if (event != b) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                lifecycle.removeObserver(this);
                lq9Var.resumeWith(new Result.Failure(new LifecycleDestroyedException()));
                return;
            }
            return;
        }
        lifecycle.removeObserver(this);
        try {
            failure = this.e.invoke();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        lq9Var.resumeWith(failure);
    }
}
