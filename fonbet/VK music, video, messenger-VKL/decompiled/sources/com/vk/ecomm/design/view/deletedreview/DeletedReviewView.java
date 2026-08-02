package com.vk.ecomm.design.view.deletedreview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.imageloader.view.DefaultVkImageView;
import com.vkontakte.android.R;
import xsna.gzs;
import xsna.jjc;
import xsna.krv0;
import xsna.s3q0;
import xsna.uoh;
import xsna.x84;

/* compiled from: DeletedReviewView.kt */
/* loaded from: classes18.dex */
public final class DeletedReviewView extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public gzs<s3q0> b;

    public DeletedReviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new x84(6);
        View.inflate(context, R.layout.deleted_review_view, this);
        ((DefaultVkImageView) findViewById(R.id.user_photo_iv)).y0((float) 0.5d, krv0.l(R.attr.vk_ui_image_border_alpha));
        jjc.g((TextView) findViewById(R.id.restore_review_iv), new uoh(this, 4));
    }

    public final void setEventHandler(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }
}
