package com.vk.clips.design.view.editor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.f4m;

/* compiled from: TransformOverlayView.kt */
/* loaded from: classes16.dex */
public final class TransformOverlayView extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final VkText b;
    public final VkText c;
    public final RectDrawingView d;
    public final ViewGroup e;

    public TransformOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_clips_transform_overlay, (ViewGroup) this, true);
        this.b = (VkText) inflate.findViewById(R.id.video_transform_scale_info);
        this.c = (VkText) inflate.findViewById(R.id.video_transform_rotate_info);
        this.d = (RectDrawingView) inflate.findViewById(R.id.video_border_view);
        this.e = (ViewGroup) findViewById(R.id.video_transform_info_container);
    }

    public final void a(float[] fArr, String str, String str2, boolean z, boolean z2) {
        RectDrawingView rectDrawingView = this.d;
        rectDrawingView.setPoints(fArr);
        rectDrawingView.setRounded(z);
        ViewGroup viewGroup = this.e;
        if (!z2) {
            f4m.j(viewGroup);
            return;
        }
        viewGroup.setVisibility(0);
        this.b.setText(str);
        this.c.setText(str2);
    }
}
