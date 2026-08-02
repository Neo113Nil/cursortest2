package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601x9 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f14914a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f14915b;

    public C0601x9(Context context, String str) {
        this(new ReentrantLock(), new Y9(context, str));
    }

    public final void a() {
        this.f14914a.lock();
        this.f14915b.a();
    }

    public final void b() {
        this.f14915b.b();
        this.f14914a.unlock();
    }

    public final void c() {
        Y9 y92 = this.f14915b;
        synchronized (y92) {
            y92.b();
            y92.f13217a.delete();
        }
        this.f14914a.unlock();
    }

    public C0601x9(ReentrantLock reentrantLock, Y9 y92) {
        this.f14914a = reentrantLock;
        this.f14915b = y92;
    }
}
