package ie;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ie.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7054c implements InterfaceC7063l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f66257a;

    public C7054c(int i11) {
        ReentrantLock lock = new ReentrantLock();
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f66257a = lock;
    }

    @Override // ie.InterfaceC7063l
    public void lock() {
        this.f66257a.lock();
    }

    @Override // ie.InterfaceC7063l
    public final void unlock() {
        this.f66257a.unlock();
    }
}
