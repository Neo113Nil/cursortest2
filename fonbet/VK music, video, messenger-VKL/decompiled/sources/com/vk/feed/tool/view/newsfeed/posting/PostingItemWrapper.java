package com.vk.feed.tool.view.newsfeed.posting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeFrescoImageViewLegacy;
import com.vkontakte.android.R;
import xsna.s3q0;

/* compiled from: PostingItemWrapper.kt */
/* loaded from: classes18.dex */
public final class PostingItemWrapper extends FrameLayout {
    public FixedSizeFrescoImageViewLegacy b;
    public Boolean c;

    public PostingItemWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final FixedSizeFrescoImageViewLegacy getImageView() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r0.getChildCount() == 1) goto L22;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        if (this.b == null) {
            this.b = (FixedSizeFrescoImageViewLegacy) findViewById(R.id.posting_item_image);
        }
        ViewParent parent = getParent();
        s3q0 s3q0Var = null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        Boolean bool = this.c;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = this.b;
            if (fixedSizeFrescoImageViewLegacy != null) {
                fixedSizeFrescoImageViewLegacy.setWrapContent(booleanValue);
                s3q0Var = s3q0.a;
            }
        }
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy2 = this.b;
        if (fixedSizeFrescoImageViewLegacy2 != null) {
            boolean z = viewGroup != null;
            fixedSizeFrescoImageViewLegacy2.setWrapContent(z);
            s3q0 s3q0Var2 = s3q0.a;
        }
        super.onMeasure(i, i2);
    }

    public final void setImageView(FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy) {
        this.b = fixedSizeFrescoImageViewLegacy;
    }

    public final void setWrapContent(Boolean bool) {
        this.c = bool;
    }
}
