package com.vk.photogallery.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import xsna.xnj;

/* compiled from: CoordinatorLayoutWithContextMenuDelegate.kt */
/* loaded from: classes4.dex */
public final class CoordinatorLayoutWithContextMenuDelegate extends CoordinatorLayout {
    public xnj z;

    public CoordinatorLayoutWithContextMenuDelegate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final xnj getContextMenuCreator() {
        return this.z;
    }

    public final void setContextMenuCreator(xnj xnjVar) {
        this.z = xnjVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view) {
        xnj xnjVar = this.z;
        return xnjVar != null ? xnjVar.showContextMenuForChild(view, -1.0f, -1.0f) : super.showContextMenuForChild(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view, float f, float f2) {
        xnj xnjVar = this.z;
        return xnjVar != null ? xnjVar.showContextMenuForChild(view, f, f2) : super.showContextMenuForChild(view, f, f2);
    }
}
