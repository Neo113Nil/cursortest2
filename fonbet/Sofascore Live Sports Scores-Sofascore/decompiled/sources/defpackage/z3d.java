package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class z3d implements ViewGroup.OnHierarchyChangeListener {
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ImageView imageView = view2 instanceof ImageView ? (ImageView) view2 : null;
        if (imageView != null) {
            imageView.setAdjustViewBounds(true);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        view.getClass();
        view2.getClass();
    }
}
