package io.ktor.utils.io.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f49482b = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availableForRead$internal");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f49483c = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availableForWrite$internal");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f49484d = AtomicIntegerFieldUpdater.newUpdater(h.class, "_pendingToFlush");

    @NotNull
    public volatile /* synthetic */ int _availableForWrite$internal;

    /* renamed from: a, reason: collision with root package name */
    public final int f49485a;

    @NotNull
    public volatile /* synthetic */ int _availableForRead$internal = 0;

    @NotNull
    volatile /* synthetic */ int _pendingToFlush = 0;

    public h(int i10) {
        this.f49485a = i10;
        this._availableForWrite$internal = i10;
    }

    public final void a(int i10) {
        int i11;
        int i12;
        do {
            i11 = this._availableForWrite$internal;
            i12 = i11 + i10;
            if (i12 > this.f49485a) {
                b(i11, i12, i10);
                throw new KotlinNothingValueException();
            }
        } while (!f49483c.compareAndSet(this, i11, i12));
    }

    public final Void b(int i10, int i11, int i12) {
        throw new IllegalArgumentException("Completed read overflow: " + i10 + " + " + i12 + " = " + i11 + " > " + this.f49485a);
    }

    public final void c(int i10) {
        int i11;
        int i12;
        do {
            i11 = this._pendingToFlush;
            i12 = i11 + i10;
            if (i12 > this.f49485a) {
                d(i11, i10);
                throw new KotlinNothingValueException();
            }
        } while (!f49484d.compareAndSet(this, i11, i12));
    }

    public final Void d(int i10, int i11) {
        throw new IllegalArgumentException("Complete write overflow: " + i10 + " + " + i11 + " > " + this.f49485a);
    }

    public final boolean e() {
        int andSet = f49484d.getAndSet(this, 0);
        return andSet == 0 ? this._availableForRead$internal > 0 : f49482b.addAndGet(this, andSet) > 0;
    }

    public final void f() {
        f49483c.getAndSet(this, 0);
    }

    public final boolean g() {
        return this._availableForWrite$internal == this.f49485a;
    }

    public final boolean h() {
        return this._availableForWrite$internal == 0;
    }

    public final void i() {
        this._availableForRead$internal = this.f49485a;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final void j() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.f49485a;
    }

    public final boolean k() {
        int i10;
        do {
            i10 = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i10 != this.f49485a) {
                return false;
            }
        } while (!f49483c.compareAndSet(this, i10, 0));
        return true;
    }

    public final int l(int i10) {
        int i11;
        int min;
        do {
            i11 = this._availableForRead$internal;
            min = Math.min(i10, i11);
            if (min == 0) {
                return 0;
            }
        } while (!f49482b.compareAndSet(this, i11, i11 - min));
        return Math.min(i10, i11);
    }

    public final boolean m(int i10) {
        int i11;
        do {
            i11 = this._availableForRead$internal;
            if (i11 < i10) {
                return false;
            }
        } while (!f49482b.compareAndSet(this, i11, i11 - i10));
        return true;
    }

    public final int n(int i10) {
        int i11;
        do {
            i11 = this._availableForWrite$internal;
            if (i11 < i10) {
                return 0;
            }
        } while (!f49483c.compareAndSet(this, i11, 0));
        return i11;
    }

    public final int o(int i10) {
        int i11;
        int min;
        do {
            i11 = this._availableForWrite$internal;
            min = Math.min(i10, i11);
            if (min == 0) {
                return 0;
            }
        } while (!f49483c.compareAndSet(this, i11, i11 - min));
        return Math.min(i10, i11);
    }

    public String toString() {
        return "RingBufferCapacity[read: " + this._availableForRead$internal + ", write: " + this._availableForWrite$internal + ", flush: " + this._pendingToFlush + ", capacity: " + this.f49485a + ']';
    }
}
