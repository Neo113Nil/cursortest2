package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hfc extends FrameLayout implements t03 {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public hfc(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.t03
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.t03
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
