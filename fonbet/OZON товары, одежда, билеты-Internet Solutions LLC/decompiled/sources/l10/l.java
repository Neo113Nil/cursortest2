package l10;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f72465a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f72466b;

    public l(View view, i iVar) {
        this.f72465a = view;
        this.f72466b = iVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
        this.f72465a.removeOnAttachStateChangeListener(this);
        i iVar = this.f72466b;
        i.x(view, iVar);
        C10.e eVar = iVar.f72397Q;
        if (eVar != null) {
            eVar.g(view.getMeasuredHeight());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View view) {
    }
}
