package j1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.e0;
import androidx.lifecycle.y;
import e6.z;
import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18211a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18212b;

    public k(eg.l lVar) {
        this.f18212b = lVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(e0 e0Var) {
        int i5 = this.f18211a;
        androidx.lifecycle.j.a(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(e0 e0Var) {
        int i5 = this.f18211a;
        androidx.lifecycle.j.b(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(e0 e0Var) {
        int i5 = this.f18211a;
        androidx.lifecycle.j.c(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(e0 e0Var) {
        switch (this.f18211a) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new z(1), 500L);
                ((y) this.f18212b).b(this);
                break;
            default:
                androidx.lifecycle.j.d(this, e0Var);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(e0 e0Var) {
        switch (this.f18211a) {
            case 0:
                androidx.lifecycle.j.e(this, e0Var);
                break;
            default:
                eg.l lVar = (eg.l) this.f18212b;
                gf.o oVar = gf.q.f10031a;
                lVar.resumeWith(Unit.f19194a);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(e0 e0Var) {
        int i5 = this.f18211a;
        androidx.lifecycle.j.f(this, e0Var);
    }

    public k(EmojiCompatInitializer emojiCompatInitializer, y yVar) {
        this.f18212b = yVar;
    }
}
