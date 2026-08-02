package com.vk.instantjobs.services;

import com.vk.instantjobs.services.a;
import xsna.o7x;

/* compiled from: JobsForegroundServiceController.kt */
/* loaded from: classes2.dex */
public final class b implements a.InterfaceC1189a {
    public final /* synthetic */ o7x a;

    public b(o7x o7xVar) {
        this.a = o7xVar;
    }

    @Override // com.vk.instantjobs.services.a.InterfaceC1189a
    public final void a(boolean z) {
        if (z) {
            return;
        }
        a.b.remove(this);
        this.a.invoke();
    }
}
