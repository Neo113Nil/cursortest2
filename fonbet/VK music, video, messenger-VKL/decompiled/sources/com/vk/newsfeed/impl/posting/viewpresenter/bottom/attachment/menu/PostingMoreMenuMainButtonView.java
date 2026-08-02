package com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.iut0;
import xsna.qcy;
import xsna.wm;

/* compiled from: PostingMoreMenuMainButtonView.kt */
/* loaded from: classes4.dex */
public final class PostingMoreMenuMainButtonView extends ConstraintLayout {
    public final ImageView t;
    public final TextView u;
    public boolean v;

    public PostingMoreMenuMainButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.view_posting_more_menu_button, (ViewGroup) this, true);
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(R.drawable.bg_button_posting_bottom_panel, this);
        this.t = (ImageView) findViewById(R.id.icon_button);
        this.u = (TextView) findViewById(R.id.text_button);
        iut0.q(this, new wm());
    }

    private final void setConstraint(boolean z) {
        b bVar = new b();
        bVar.i(this);
        if (z) {
            setVerticalConstraint(bVar);
        } else {
            setHorizontalConstraint(bVar);
        }
        bVar.b(this);
    }

    private final void setDisableIcon(boolean z) {
        float f = z ? 0.5f : 1.0f;
        this.t.setAlpha(f);
        this.u.setAlpha(f);
    }

    private final void setHorizontalConstraint(b bVar) {
        bVar.l(R.id.icon_button, 6, 0, 6, cn70.b(12));
        bVar.k(R.id.icon_button, 3, 0, 3);
        bVar.k(R.id.icon_button, 4, 0, 4);
        bVar.k(R.id.icon_button, 7, -1, 7);
        bVar.l(R.id.text_button, 6, R.id.icon_button, 7, cn70.b(8));
        bVar.k(R.id.text_button, 4, 0, 4);
        bVar.k(R.id.text_button, 3, 0, 3);
        bVar.l(R.id.text_button, 7, 0, 7, cn70.b(12));
        bVar.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, R.id.text_button);
    }

    private final void setVerticalConstraint(b bVar) {
        bVar.k(R.id.icon_button, 6, 0, 6);
        bVar.k(R.id.icon_button, 7, 0, 7);
        bVar.k(R.id.icon_button, 3, 0, 3);
        bVar.k(R.id.icon_button, 4, R.id.text_button, 3);
        bVar.f(R.id.icon_button, R.id.text_button);
        bVar.k(R.id.text_button, 6, 0, 6);
        bVar.k(R.id.text_button, 7, 0, 7);
        bVar.k(R.id.text_button, 4, 0, 4);
        bVar.l(R.id.text_button, 3, R.id.icon_button, 4, cn70.b(6));
    }

    public final void P4(int i, int i2, Integer num, boolean z) {
        this.t.setImageResource(i);
        CharSequence text = getContext().getText(i2);
        TextView textView = this.u;
        textView.setText(text);
        if (num != null) {
            textView.setContentDescription(getContext().getString(num.intValue()));
        }
        setMainButton(z);
        if (z) {
            textView.setGravity(17);
        }
    }

    public final TextView getButtonText() {
        return this.u;
    }

    public final ImageView getImage() {
        return this.t;
    }

    public final void setDisable(boolean z) {
        this.v = z;
        setDisableIcon(z);
    }

    public final void setMainButton(boolean z) {
        setConstraint(z);
    }
}
