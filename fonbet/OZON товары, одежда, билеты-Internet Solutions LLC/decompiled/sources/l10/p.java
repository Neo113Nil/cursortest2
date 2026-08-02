package l10;

import A00.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import j10.InterfaceC7238a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class p implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f72524a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v f72525b;

    p(i iVar, AbstractC5434v abstractC5434v) {
        this.f72524a = iVar;
        this.f72525b = abstractC5434v;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        i iVar = this.f72524a;
        Function0<Unit> R11 = iVar.R();
        if (R11 != null) {
            R11.invoke();
        }
        i.f(iVar);
        this.f72525b.e(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Function0<Unit> T11 = this.f72524a.T();
        if (T11 != null) {
            T11.invoke();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(J owner) {
        InterfaceC7238a interfaceC7238a;
        InterfaceC7238a interfaceC7238a2;
        Intrinsics.checkNotNullParameter(owner, "owner");
        i iVar = this.f72524a;
        interfaceC7238a = iVar.f72385E;
        i.C(iVar, interfaceC7238a);
        interfaceC7238a2 = iVar.f72385E;
        interfaceC7238a2.c(a.B.f164a);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(J owner) {
        InterfaceC7238a interfaceC7238a;
        Intrinsics.checkNotNullParameter(owner, "owner");
        i iVar = this.f72524a;
        i.B(iVar);
        interfaceC7238a = iVar.f72385E;
        interfaceC7238a.c(new a.C2368i());
    }
}
