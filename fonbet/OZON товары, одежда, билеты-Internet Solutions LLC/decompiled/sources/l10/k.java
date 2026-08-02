package l10;

import android.view.View;
import o10.C8630a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f72463a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f72464b;

    public k(View view, i iVar) {
        this.f72463a = view;
        this.f72464b = iVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
        C8630a c8630a;
        this.f72463a.removeOnAttachStateChangeListener(this);
        i iVar = this.f72464b;
        i.x(view, iVar);
        c8630a = iVar.f72400T;
        c8630a.b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View view) {
    }
}
