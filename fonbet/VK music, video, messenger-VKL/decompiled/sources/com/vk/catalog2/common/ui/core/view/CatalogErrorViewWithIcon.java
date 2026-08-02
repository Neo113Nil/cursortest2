package com.vk.catalog2.common.ui.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.gzs;
import xsna.s3q0;
import xsna.w4a;

/* compiled from: CatalogErrorViewWithIcon.kt */
/* loaded from: classes16.dex */
public final class CatalogErrorViewWithIcon extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final VKImageView b;
    public final TextView c;
    public final TextView d;

    public CatalogErrorViewWithIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.vk_video_catalog_error_with_icon_screen, (ViewGroup) this, true);
        this.b = (VKImageView) findViewById(R.id.error_icon);
        this.c = (TextView) findViewById(R.id.error_text);
        this.d = (TextView) findViewById(R.id.error_retry);
    }

    public final void setOnRetryClickListener(gzs<s3q0> gzsVar) {
        this.d.setOnClickListener(new w4a(0, gzsVar));
    }
}
