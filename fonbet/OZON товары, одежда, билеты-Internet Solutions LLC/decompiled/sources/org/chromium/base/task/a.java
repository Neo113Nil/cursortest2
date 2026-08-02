package org.chromium.base.task;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f78581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f78582b;

    public /* synthetic */ a(d dVar, Object obj) {
        this.f78581a = dVar;
        this.f78582b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.a(this.f78581a, this.f78582b);
    }
}
