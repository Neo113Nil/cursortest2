package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import xsna.lhs;
import xsna.njt;
import xsna.ojt;
import xsna.pjt;

@Deprecated
/* loaded from: classes.dex */
public class GenericDraweeView extends DraweeView<njt> {
    public GenericDraweeView(Context context) {
        super(context);
        c(context, null);
    }

    public void c(Context context, AttributeSet attributeSet) {
        if (lhs.d()) {
            lhs.a("GenericDraweeView#inflateHierarchy");
        }
        ojt d = pjt.d(context, attributeSet);
        setAspectRatio(d.c);
        setHierarchy(d.a());
        if (lhs.d()) {
            lhs.b();
        }
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet);
    }

    @TargetApi(21)
    public GenericDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c(context, attributeSet);
    }
}
