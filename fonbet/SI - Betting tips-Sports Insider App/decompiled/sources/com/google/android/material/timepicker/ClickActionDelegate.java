package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class ClickActionDelegate extends androidx.core.view.b {
    private final q0.b clickAction;

    public ClickActionDelegate(Context context, int i5) {
        this.clickAction = new q0.b(16, context.getString(i5));
    }

    @Override // androidx.core.view.b
    public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        cVar.b(this.clickAction);
    }
}
