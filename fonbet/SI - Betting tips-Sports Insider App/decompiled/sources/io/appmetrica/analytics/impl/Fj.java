package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Fj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f12230a;

    public Fj(ModuleEvent moduleEvent) {
        this.f12230a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.reportEvent(this.f12230a);
    }
}
