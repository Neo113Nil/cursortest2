package com.vk.story.viewer.impl.presentation.ideas.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import xsna.bpn0;
import xsna.ca6;
import xsna.izs;
import xsna.lsv;
import xsna.n5i;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: IdeasStoryAvatarView.kt */
/* loaded from: classes6.dex */
public final class IdeasStoryAvatarView extends FrameLayout {
    public static final /* synthetic */ int g = 0;
    public final VkImage b;
    public final StickersDrawingViewGroup c;
    public final bpn0 d;
    public izs<? super StoryBoxPrepared, s3q0> e;
    public wzs<? super StoryBoxPrepared, ? super Throwable, s3q0> f;

    public IdeasStoryAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        VkImage vkImage = new VkImage(context, null, 6, 0);
        vkImage.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b = vkImage;
        StickersDrawingViewGroup stickersDrawingViewGroup = new StickersDrawingViewGroup(context);
        stickersDrawingViewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        stickersDrawingViewGroup.setClickable(false);
        stickersDrawingViewGroup.setFocusable(false);
        this.c = stickersDrawingViewGroup;
        this.d = new bpn0(new n5i(this, 24));
        addView(vkImage);
        addView(stickersDrawingViewGroup);
    }

    private final lsv getRenderer() {
        return (lsv) this.d.getValue();
    }

    public final wzs<StoryBoxPrepared, Throwable, s3q0> getOnRenderErrorListener() {
        return this.f;
    }

    public final izs<StoryBoxPrepared, s3q0> getOnRenderedListener() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 20;
        getRenderer().e = new ca6(this, i);
        getRenderer().f = new ca6(this, i);
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        lsv renderer = getRenderer();
        int width = getWidth();
        int height = getHeight();
        if (width == renderer.k && height == renderer.l) {
            return;
        }
        renderer.k = width;
        renderer.l = height;
        renderer.b();
        renderer.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getRenderer().b();
        getRenderer().e = null;
        getRenderer().f = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = (int) (size / 0.5625f);
        if (i3 < 1) {
            i3 = 1;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        lsv renderer = getRenderer();
        if (i == renderer.k && i2 == renderer.l) {
            return;
        }
        renderer.k = i;
        renderer.l = i2;
        renderer.b();
        renderer.d();
    }

    public final void setAvatar(StoryBoxPrepared storyBoxPrepared) {
        lsv renderer = getRenderer();
        renderer.i = storyBoxPrepared;
        renderer.d();
    }

    public final void setOnRenderErrorListener(wzs<? super StoryBoxPrepared, ? super Throwable, s3q0> wzsVar) {
        this.f = wzsVar;
    }

    public final void setOnRenderedListener(izs<? super StoryBoxPrepared, s3q0> izsVar) {
        this.e = izsVar;
    }
}
