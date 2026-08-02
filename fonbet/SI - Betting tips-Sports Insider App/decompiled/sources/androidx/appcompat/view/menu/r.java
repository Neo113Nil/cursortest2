package androidx.appcompat.view.menu;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends FrameLayout implements n.c {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f543a;

    /* JADX WARN: Multi-variable type inference failed */
    public r(View view) {
        super(view.getContext());
        this.f543a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // n.c
    public final void onActionViewCollapsed() {
        this.f543a.onActionViewCollapsed();
    }

    @Override // n.c
    public final void onActionViewExpanded() {
        this.f543a.onActionViewExpanded();
    }
}
