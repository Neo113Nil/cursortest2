package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.Queue;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Queue f29704a = com.bumptech.glide.util.l.g(20);

    public abstract m a();

    public m b() {
        m mVar = (m) this.f29704a.poll();
        return mVar == null ? a() : mVar;
    }

    public void c(m mVar) {
        if (this.f29704a.size() < 20) {
            this.f29704a.offer(mVar);
        }
    }
}
