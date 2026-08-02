package k5;

import android.media.AudioManager;
import androidx.annotation.NonNull;
import k5.InterfaceC7576v1;
import v3.ExecutorC10204F;

/* renamed from: k5.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7492a0 extends AbstractC7560r1 {

    /* renamed from: e, reason: collision with root package name */
    private final Z f70699e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f70700f;

    /* JADX WARN: Type inference failed for: r1v1, types: [k5.Z] */
    C7492a0(@NonNull AudioManager audioManager) {
        super(audioManager);
        this.f70699e = new AudioManager.OnModeChangedListener() { // from class: k5.Z
            @Override // android.media.AudioManager.OnModeChangedListener
            public final void onModeChanged(int i11) {
                C7492a0.this.i(i11, true);
            }
        };
    }

    private synchronized void k() {
        if (this.f70700f) {
            e().removeOnModeChangedListener(this.f70699e);
            this.f70700f = false;
        }
    }

    @Override // k5.AbstractC7560r1, k5.InterfaceC7576v1
    public final void a(@NonNull InterfaceC7576v1.a aVar) {
        super.a(aVar);
        if (g()) {
            k();
        }
    }

    @Override // k5.AbstractC7560r1, k5.InterfaceC7576v1
    public final void b(@NonNull InterfaceC7576v1.a aVar) {
        super.b(aVar);
        c();
    }

    @Override // k5.InterfaceC7576v1
    public final void c() {
        if (g()) {
            return;
        }
        synchronized (this) {
            if (!this.f70700f) {
                e().addOnModeChangedListener(new ExecutorC10204F(d()), this.f70699e);
                this.f70700f = true;
            }
        }
    }

    @Override // k5.AbstractC7560r1
    protected final void j() {
        super.j();
        k();
    }
}
