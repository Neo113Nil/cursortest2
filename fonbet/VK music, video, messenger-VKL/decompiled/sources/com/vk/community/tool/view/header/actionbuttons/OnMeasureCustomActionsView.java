package com.vk.community.tool.view.header.actionbuttons;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: OnMeasureCustomActionsView.kt */
/* loaded from: classes17.dex */
public final class OnMeasureCustomActionsView extends ConstraintLayout {
    public List<? extends gzs<s3q0>> t;

    public OnMeasureCustomActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = EmptyList.b;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Iterator<T> it = this.t.iterator();
        while (it.hasNext()) {
            ((gzs) it.next()).invoke();
            super.onMeasure(i, i2);
        }
    }

    public final void setOnMeasureCustomActions(List<? extends gzs<s3q0>> list) {
        this.t = list;
    }
}
