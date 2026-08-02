package com.vk.content.design.view.photo.flow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.awt0;
import xsna.bwt0;
import xsna.bzw;
import xsna.cn70;
import xsna.e43;
import xsna.es00;
import xsna.fv90;
import xsna.iou;
import xsna.jjc;
import xsna.x2y;

/* compiled from: PhotoFlowHeaderView.kt */
/* loaded from: classes17.dex */
public final class PhotoFlowHeaderView extends ConstraintLayout {
    public final TextView t;
    public final ImageView u;
    public final ImageView v;
    public final TextView w;
    public final ImageView x;
    public a y;

    /* compiled from: PhotoFlowHeaderView.kt */
    public interface a {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    public PhotoFlowHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.photo_flow_header_view, this);
        bwt0.d(this, getResources().getDimension(R.dimen.photos_root_page_background_corner_radius), false, true);
        awt0.x(this, 0, 0, cn70.b(8), 0, 11);
        TextView textView = (TextView) findViewById(R.id.tv_add_photo);
        this.t = textView;
        ImageView imageView = (ImageView) findViewById(R.id.iv_archive);
        this.u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_settings);
        this.v = imageView2;
        TextView textView2 = (TextView) findViewById(R.id.tv_multiselect_exit);
        this.w = textView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.iv_multiselect_options);
        this.x = imageView3;
        jjc.g(textView, new bzw(this, 18));
        jjc.g(imageView, new fv90(this, 1));
        jjc.g(imageView2, new x2y(this, 25));
        jjc.g(textView2, new es00(this, 17));
        jjc.g(imageView3, new iou(this, 29));
    }

    public final a getClickListener() {
        return this.y;
    }

    public final ImageView getMultiSelectOptionsAnchorView() {
        return this.x;
    }

    public final void setAddPhotoButtonVisible(boolean z) {
        bwt0.p0(this.t, z);
    }

    public final void setClickListener(a aVar) {
        this.y = aVar;
    }

    public final void setIsInMultiselectMode(boolean z) {
        Iterator it = e43.l(this.t, this.u, this.v).iterator();
        while (it.hasNext()) {
            bwt0.p0((View) it.next(), !z);
        }
        Iterator it2 = e43.l(this.w, this.x).iterator();
        while (it2.hasNext()) {
            bwt0.p0((View) it2.next(), z);
        }
    }

    public final void setMultiSelectOptionsVisible(boolean z) {
        ImageView imageView = this.x;
        bwt0.d0(imageView, !z);
        imageView.setEnabled(z);
    }
}
