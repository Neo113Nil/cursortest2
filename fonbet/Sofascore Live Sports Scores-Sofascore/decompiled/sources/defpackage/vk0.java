package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class vk0 extends Thread {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk0(Runnable runnable) {
        super(runnable);
        this.a = 1;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        ReentrantLock reentrantLock;
        yk0 x;
        switch (this.a) {
            case 0:
                break;
            case 1:
                Process.setThreadPriority(9);
                super.run();
                return;
            case 2:
                Process.setThreadPriority(10);
                super.run();
                return;
            case 3:
            default:
                super.run();
                return;
            case 4:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                reentrantLock = yk0.j;
                reentrantLock.lock();
                try {
                    x = fkf.x();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused2) {
            }
            if (x == yk0.i) {
                yk0.i = null;
                return;
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
            if (x != null) {
                x.j();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk0(int i, String str, Runnable runnable) {
        super(runnable, str);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk0(String str) {
        super(str);
        this.a = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk0(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
        this.a = 4;
    }
}
