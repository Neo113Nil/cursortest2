package com.vk.feed.tool.view.posting.preview.crop;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import xsna.w3d0;

/* compiled from: PreviewCropLayout.kt */
/* loaded from: classes18.dex */
public final class PreviewCropLayout extends FrameLayout {
    public final w3d0 b;

    public PreviewCropLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        w3d0 w3d0Var = new w3d0(context);
        this.b = w3d0Var;
        w3d0Var.setId(R.id.posting_step2_preview_crop_view);
        w3d0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(w3d0Var);
    }

    public final w3d0 getImageLayer() {
        return this.b;
    }
}
