package com.vk.ecomm.reviews.ui.reviewbody;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.ExpandableTextViewGroup;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bhg0;
import xsna.bwt0;
import xsna.d3u0;
import xsna.dce0;
import xsna.dhr0;
import xsna.drm0;
import xsna.eig0;
import xsna.iah0;
import xsna.k1;
import xsna.odo0;
import xsna.oq80;
import xsna.tfv;
import xsna.ugg0;
import xsna.y2u0;
import xsna.zl20;

/* compiled from: ReviewBodyView.kt */
/* loaded from: classes18.dex */
public final class ReviewBodyView extends FrameLayout {
    public static final /* synthetic */ int i = 0;
    public final ExpandableTextViewGroup b;
    public final TextView c;
    public final RecyclerView d;
    public final TextView e;
    public eig0<bhg0> f;
    public final d3u0 g;
    public final oq80 h;

    public ReviewBodyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.g = new d3u0(new zl20(this, 29));
        this.h = new oq80(this, 5);
        View.inflate(context, R.layout.review_body_view, this);
        this.b = (ExpandableTextViewGroup) findViewById(R.id.review_tv);
        this.c = (TextView) findViewById(R.id.date_tv);
        this.d = (RecyclerView) findViewById(R.id.images_rv);
        this.e = (TextView) findViewById(R.id.reply_btn);
    }

    public static void a(ReviewBodyView reviewBodyView, eig0 eig0Var, RecyclerView.u uVar) {
        reviewBodyView.f = eig0Var;
        ExpandableTextViewGroup expandableTextViewGroup = reviewBodyView.b;
        if (expandableTextViewGroup == null) {
            expandableTextViewGroup = null;
        }
        expandableTextViewGroup.setMaxLines(3);
        ExpandableTextViewGroup expandableTextViewGroup2 = reviewBodyView.b;
        if (expandableTextViewGroup2 == null) {
            expandableTextViewGroup2 = null;
        }
        expandableTextViewGroup2.setExpandText(reviewBodyView.getContext().getString(R.string.reviews_expand_text));
        ExpandableTextViewGroup expandableTextViewGroup3 = reviewBodyView.b;
        if (expandableTextViewGroup3 == null) {
            expandableTextViewGroup3 = null;
        }
        expandableTextViewGroup3.setOnExpandClickListener(reviewBodyView.h);
        RecyclerView recyclerView = reviewBodyView.d;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(reviewBodyView.g);
        RecyclerView recyclerView2 = reviewBodyView.d;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setRecycledViewPool(uVar);
        RecyclerView recyclerView3 = reviewBodyView.d;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(new tfv(iah0.a(7)));
        TextView textView = reviewBodyView.e;
        (textView != null ? textView : null).setOnClickListener(new k1(eig0Var, 12));
    }

    public final void b(ugg0 ugg0Var, String str) {
        List<y2u0> list = ugg0Var.a;
        dce0 dce0Var = ugg0Var.b;
        odo0 odo0Var = ugg0Var.c;
        ExpandableTextViewGroup expandableTextViewGroup = this.b;
        if (expandableTextViewGroup == null) {
            expandableTextViewGroup = null;
        }
        bwt0.p0(expandableTextViewGroup, !drm0.N(odo0Var.a));
        ExpandableTextViewGroup expandableTextViewGroup2 = this.b;
        if (expandableTextViewGroup2 == null) {
            expandableTextViewGroup2 = null;
        }
        expandableTextViewGroup2.setText(odo0Var.a);
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        bwt0.p0(textView, ugg0Var.d);
        if (odo0Var.c) {
            ExpandableTextViewGroup expandableTextViewGroup3 = this.b;
            if (expandableTextViewGroup3 == null) {
                expandableTextViewGroup3 = null;
            }
            expandableTextViewGroup3.b();
        } else {
            ExpandableTextViewGroup expandableTextViewGroup4 = this.b;
            if (expandableTextViewGroup4 == null) {
                expandableTextViewGroup4 = null;
            }
            expandableTextViewGroup4.a();
            ExpandableTextViewGroup expandableTextViewGroup5 = this.b;
            if (expandableTextViewGroup5 == null) {
                expandableTextViewGroup5 = null;
            }
            ViewGroup.LayoutParams layoutParams = expandableTextViewGroup5.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
            ExpandableTextViewGroup expandableTextViewGroup6 = this.b;
            if (expandableTextViewGroup6 == null) {
                expandableTextViewGroup6 = null;
            }
            expandableTextViewGroup6.requestLayout();
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            recyclerView = null;
        }
        bwt0.p0(recyclerView, !list.isEmpty());
        this.g.setItems(list);
        TextView textView2 = this.c;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(dce0Var.a);
        RecyclerView recyclerView2 = this.d;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setContentDescription(str);
        TextView textView3 = this.c;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setContentDescription(dce0Var.a);
        TextView textView4 = this.c;
        (textView4 != null ? textView4 : null).setTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
    }
}
