package com.vk.core.view.components.paging.list;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import xsna.dak0;
import xsna.ee;
import xsna.qak0;
import xsna.s3q0;
import xsna.uh50;

/* compiled from: VkErrorView.kt */
/* loaded from: classes17.dex */
public class VkErrorView extends ee {
    public VkPlaceholder d;

    public VkErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void c(a aVar) {
        uh50 C;
        dak0 j = qak0.j();
        uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
        if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            dak0 j2 = C.j();
            try {
                this.d.setTop(aVar.a);
                this.d.setMiddle(aVar.b);
                this.d.setBottom(aVar.c);
                s3q0 s3q0Var = s3q0.a;
                C.w().a();
            } finally {
                dak0.q(j2);
            }
        } finally {
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void setPlaceholder(VkPlaceholder vkPlaceholder) {
        uh50 C;
        removeView(this.d);
        dak0 j = qak0.j();
        uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
        if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            dak0 j2 = C.j();
            try {
                vkPlaceholder.setTop(this.d.getTop());
                vkPlaceholder.setMiddle(this.d.getMiddle());
                vkPlaceholder.setBottom(this.d.getBottom());
                s3q0 s3q0Var = s3q0.a;
                C.w().a();
                C.c();
                this.d = vkPlaceholder;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                super.addView(vkPlaceholder, layoutParams);
            } finally {
                dak0.q(j2);
            }
        } finally {
        }
    }

    public /* synthetic */ VkErrorView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public VkErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        VkPlaceholder vkPlaceholder = new VkPlaceholder(context, null, 6);
        this.d = vkPlaceholder;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        s3q0 s3q0Var = s3q0.a;
        super.addView(vkPlaceholder, layoutParams);
    }

    @Override // xsna.ee
    public void b() {
    }

    @Override // xsna.ee
    public void setActionTitle(int i) {
    }

    @Override // xsna.ee
    public void setMessage(CharSequence charSequence) {
    }

    @Override // xsna.ee
    public void setRetryBtnVisible(boolean z) {
    }
}
