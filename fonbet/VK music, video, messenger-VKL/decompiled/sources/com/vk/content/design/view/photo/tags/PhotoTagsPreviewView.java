package com.vk.content.design.view.photo.tags;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.cn70;
import xsna.e3m;
import xsna.gzs;
import xsna.s3q0;
import xsna.xca0;

/* compiled from: PhotoTagsPreviewView.kt */
/* loaded from: classes17.dex */
public final class PhotoTagsPreviewView extends FrameLayout {
    public static final /* synthetic */ int k = 0;
    public final VKImageView b;
    public final VKImageView c;
    public final FrameLayout d;
    public final VKImageView e;
    public final FrameLayout f;
    public final TextView g;
    public final int h;
    public int i;
    public gzs<s3q0> j;

    public PhotoTagsPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h = e3m.a(R.dimen.photo_tags_preview_size, context);
        float b = cn70.b(8);
        xca0 xca0Var = new xca0(this);
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_photo_tags_preview, (ViewGroup) this, true);
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.first_image);
        this.b = vKImageView;
        vKImageView.setCornerRadius(b);
        vKImageView.setOnLoadCallback(xca0Var);
        VKImageView vKImageView2 = (VKImageView) inflate.findViewById(R.id.second_image);
        this.c = vKImageView2;
        vKImageView2.setCornerRadius(b);
        vKImageView2.setOnLoadCallback(xca0Var);
        this.d = (FrameLayout) inflate.findViewById(R.id.second_container);
        VKImageView vKImageView3 = (VKImageView) inflate.findViewById(R.id.third_image);
        this.e = vKImageView3;
        vKImageView3.setCornerRadius(b);
        vKImageView3.setOnLoadCallback(xca0Var);
        this.f = (FrameLayout) inflate.findViewById(R.id.third_container);
        this.g = (TextView) inflate.findViewById(R.id.more);
    }

    public final gzs<s3q0> getImagesReadyCallback() {
        return this.j;
    }

    public final void setImagesReadyCallback(gzs<s3q0> gzsVar) {
        this.j = gzsVar;
    }
}
