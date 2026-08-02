package com.vk.newsfeed.common.recycler.holders.zhukov;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import xsna.qik;
import xsna.xhk;

/* compiled from: CropableImageContainer.kt */
/* loaded from: classes4.dex */
public final class CropableImageContainer extends FrameLayout {
    public final qik b;
    public final xhk c;
    public boolean d;
    public boolean e;
    public PreviewRatio f;

    public CropableImageContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        qik qikVar = new qik(context);
        this.b = qikVar;
        xhk xhkVar = new xhk(context);
        this.c = xhkVar;
        qikVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(qikVar);
        xhkVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(xhkVar);
    }

    public final qik getImageLayer() {
        return this.b;
    }
}
