package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Vh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f13067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0183gi f13068b;

    public Vh(C0183gi c0183gi, ModuleEvent moduleEvent) {
        this.f13068b = c0183gi;
        this.f13067a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f13068b;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).reportEvent(this.f13067a);
    }
}
