package k5;

import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import k5.InterfaceC7576v1;

/* renamed from: k5.r1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC7560r1 implements InterfaceC7576v1 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f70851a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArraySet f70852b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7576v1.b f70853c = InterfaceC7576v1.b.f44transient;

    /* renamed from: d, reason: collision with root package name */
    private HandlerThread f70854d;

    AbstractC7560r1(@NonNull AudioManager audioManager) {
        this.f70851a = audioManager;
        i(audioManager.getMode(), true);
    }

    @Override // k5.InterfaceC7576v1
    public void a(@NonNull InterfaceC7576v1.a aVar) {
        this.f70852b.remove(aVar);
    }

    @Override // k5.InterfaceC7576v1
    public void b(@NonNull InterfaceC7576v1.a aVar) {
        this.f70852b.add(aVar);
    }

    @NonNull
    protected final Handler d() {
        HandlerThread handlerThread = this.f70854d;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f70854d = null;
        }
        HandlerThread handlerThread2 = new HandlerThread("AudioStateBaseListener");
        this.f70854d = handlerThread2;
        handlerThread2.start();
        return new Handler(this.f70854d.getLooper());
    }

    protected final AudioManager e() {
        return this.f70851a;
    }

    protected final void f() {
        Iterator it = this.f70852b.iterator();
        while (it.hasNext()) {
            ((InterfaceC7576v1.a) it.next()).b();
        }
    }

    protected final void finalize() throws Throwable {
        try {
            j();
        } finally {
            super.finalize();
        }
    }

    protected final boolean g() {
        return this.f70852b.isEmpty();
    }

    @NonNull
    public final InterfaceC7576v1.b h() {
        i(this.f70851a.getMode(), false);
        return this.f70853c;
    }

    protected final boolean i(int i11, boolean z11) {
        InterfaceC7576v1.b bVar;
        switch (i11) {
            case 0:
                bVar = InterfaceC7576v1.b.f40final;
                break;
            case 1:
                bVar = InterfaceC7576v1.b.f38default;
                break;
            case 2:
            case 5:
                bVar = InterfaceC7576v1.b.f39do;
                break;
            case 3:
            case 6:
                bVar = InterfaceC7576v1.b.f42instanceof;
                break;
            case 4:
                bVar = InterfaceC7576v1.b.f43native;
                break;
            default:
                bVar = InterfaceC7576v1.b.f44transient;
                break;
        }
        boolean z12 = this.f70853c != bVar;
        if (z12) {
            this.f70853c = bVar;
            if (z11) {
                Iterator it = this.f70852b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC7576v1.a) it.next()).g(this.f70853c);
                }
            }
        }
        return z12;
    }

    protected void j() {
        this.f70852b.clear();
        HandlerThread handlerThread = this.f70854d;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f70854d = null;
        }
    }
}
