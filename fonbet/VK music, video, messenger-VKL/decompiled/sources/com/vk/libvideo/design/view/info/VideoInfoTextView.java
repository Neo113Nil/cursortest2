package com.vk.libvideo.design.view.info;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.libvideo.R$styleable;
import xsna.dqs0;
import xsna.s3q0;
import xsna.zps0;

/* compiled from: VideoInfoTextView.kt */
/* loaded from: classes2.dex */
public final class VideoInfoTextView extends VkLinkedText {
    public final dqs0 k;
    public boolean l;
    public boolean m;

    public VideoInfoTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.k = new dqs0(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c, 0, 0);
        this.l = obtainStyledAttributes.getBoolean(0, this.l);
        obtainStyledAttributes.recycle();
    }

    public final boolean getEllipsizeEnabled() {
        return this.l;
    }

    public final boolean getPreferOwnerTextEllipsize() {
        return this.k.c;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        dqs0 dqs0Var = this.k;
        Trace.beginSection("VideoInfoTextView.onMeasure");
        try {
            int size = View.MeasureSpec.getSize(i);
            if (this.l) {
                if (dqs0Var.b == size) {
                    if (this.m) {
                    }
                }
                if (!isInEditMode()) {
                    this.m = false;
                    setText(dqs0Var.c(size));
                }
            }
            super.onMeasure(i, i2);
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void setEllipsizeEnabled(boolean z) {
        this.l = z;
    }

    public final void setPreferOwnerTextEllipsize(boolean z) {
        this.k.c = z;
        requestLayout();
    }

    public final void setText(zps0 zps0Var) {
        this.k.d = zps0Var;
        this.m = true;
        requestLayout();
    }

    public final void setTextDirty(boolean z) {
        this.m = z;
    }
}
