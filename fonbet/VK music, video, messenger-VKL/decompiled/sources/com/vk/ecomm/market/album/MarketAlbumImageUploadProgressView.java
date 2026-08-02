package com.vk.ecomm.market.album;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.view.ProgressView;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.h3a;
import xsna.j6r0;

/* compiled from: MarketAlbumImageUploadProgressView.kt */
/* loaded from: classes18.dex */
public final class MarketAlbumImageUploadProgressView extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final ImageView b;
    public final ProgressView c;
    public boolean d;
    public boolean e;

    public MarketAlbumImageUploadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View inflate = View.inflate(context, R.layout.view_market_album_image_upload, this);
        this.b = (ImageView) inflate.findViewById(R.id.error_view);
        this.c = (ProgressView) inflate.findViewById(R.id.progress_view);
    }

    public final void a(int i, int i2) {
        if (bwt0.K(this.b)) {
            setErrorVisible(false);
        }
        if (!this.d) {
            setProgressVisible(true);
        }
        ProgressView progressView = this.c;
        progressView.setProgressValue(i);
        progressView.setProgressMax(i2);
    }

    public final boolean getErrorVisible() {
        return this.e;
    }

    public final boolean getProgressVisible() {
        return this.d;
    }

    public final void setErrorVisible(boolean z) {
        j6r0.d(this.b, z ? 0 : 8, true, 300, null);
        this.e = z;
    }

    public final void setProgressClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public final void setProgressVisible(boolean z) {
        j6r0.d(this.c, z ? 0 : 8, true, 300, null);
        this.d = z;
    }

    public final void setRetryClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(new h3a(1, this, onClickListener));
    }
}
