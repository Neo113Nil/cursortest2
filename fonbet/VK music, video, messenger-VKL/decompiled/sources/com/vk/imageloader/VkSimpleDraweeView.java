package com.vk.imageloader;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.drawee.view.SimpleDraweeView;
import com.vk.imageloader.fresco.CallerContext;
import xsna.meq0;
import xsna.ozl;

/* compiled from: VkSimpleDraweeView.kt */
/* loaded from: classes2.dex */
public class VkSimpleDraweeView extends SimpleDraweeView {
    public VkSimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.facebook.drawee.view.SimpleDraweeView
    public void setActualImageResource(int i) {
        e(meq0.c(i), CallerContext.Frontend);
    }

    @Override // com.facebook.drawee.view.SimpleDraweeView, com.facebook.drawee.view.DraweeView, android.widget.ImageView
    @ozl
    public void setImageURI(Uri uri) {
        e(uri, CallerContext.Frontend);
    }

    @Override // com.facebook.drawee.view.SimpleDraweeView
    public void setImageURI(String str) {
        e(str != null ? Uri.parse(str) : null, CallerContext.Frontend);
    }
}
