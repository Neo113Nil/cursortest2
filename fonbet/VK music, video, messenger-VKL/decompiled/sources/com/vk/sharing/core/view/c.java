package com.vk.sharing.core.view;

import android.content.ContextWrapper;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.vkontakte.android.R;
import xsna.cn;

/* compiled from: SharingV2View.kt */
/* loaded from: classes5.dex */
public final class c extends View.AccessibilityDelegate {
    public final /* synthetic */ ContextWrapper a;
    public final /* synthetic */ cn b;

    public c(ContextWrapper contextWrapper, cn cnVar) {
        this.a = contextWrapper;
        this.b = cnVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        cn cnVar = this.b;
        accessibilityNodeInfo.setContentDescription(this.a.getString(R.string.avatar_accessibility_description, cnVar.a(), (String) cnVar.n.getValue()));
    }
}
