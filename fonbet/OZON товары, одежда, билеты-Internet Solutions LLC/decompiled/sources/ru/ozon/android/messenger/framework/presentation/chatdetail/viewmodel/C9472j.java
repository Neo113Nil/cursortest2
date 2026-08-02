package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import ru.ozon.android.messenger.framework.data.requests.h;
import xe.C10727i;
import xe.H0;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9472j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9467e f90274a;

    C9472j(C9467e c9467e) {
        this.f90274a = c9467e;
    }

    public final void a(String str) {
        C9467e c9467e = this.f90274a;
        C9467e.e1(c9467e, str);
        C9467e.d0(c9467e);
    }

    public final void b() {
        C9467e c9467e = this.f90274a;
        C9467e.g0(c9467e);
        C9467e.c1(c9467e);
    }

    public final void c() {
        xe.B0 b02;
        C9467e c9467e = this.f90274a;
        b02 = c9467e.f90201S;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new k0(c9467e, h.a.CHAT_LEAVE, null), 3);
        G.c.a();
    }

    public final void d(String str) {
        C9467e.e1(this.f90274a, str);
    }
}
