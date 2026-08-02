package com.vk.content.design.view.photo.flow;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.bbw;
import xsna.bk30;
import xsna.bwt0;
import xsna.dhr0;
import xsna.fnj;
import xsna.iah0;
import xsna.wk;
import xsna.wvv;
import xsna.yr00;

/* compiled from: PhotoFlowToolbarView.kt */
/* loaded from: classes17.dex */
public final class PhotoFlowToolbarView extends ConstraintLayout {
    public static final /* synthetic */ int B = 0;
    public final wk A;
    public final ImageView t;
    public final ImageView u;
    public final TextView v;
    public c w;
    public d x;
    public b y;
    public boolean z;

    /* compiled from: PhotoFlowToolbarView.kt */
    public final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            wvv.b(wvv.a, PhotoFlowToolbarView.this.A, 0L, 0L, 14);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            wvv wvvVar = wvv.a;
            wvv.a(PhotoFlowToolbarView.this.A);
        }
    }

    /* compiled from: PhotoFlowToolbarView.kt */
    public interface b {
        void onClick(View view);
    }

    /* compiled from: PhotoFlowToolbarView.kt */
    public interface c {
        void a0();
    }

    /* compiled from: PhotoFlowToolbarView.kt */
    public interface d {
        void onClick();
    }

    public PhotoFlowToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.photo_flow_toolbar_view, this);
        ImageView imageView = (ImageView) findViewById(R.id.iv_menu);
        this.t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_navigation);
        this.u = imageView2;
        TextView textView = (TextView) findViewById(R.id.tv_title);
        this.v = textView;
        this.z = true;
        this.A = new wk(this, 15);
        bwt0.i0(imageView2, new yr00(this, 16));
        bwt0.i0(textView, new bbw(this, 20));
        bwt0.i0(imageView, new bk30(this, 13));
        addOnAttachStateChangeListener(new a());
        String string = context.getString(R.string.accessibility_actions);
        imageView.setImageDrawable(dhr0.t.a(R.drawable.vk_icon_more_vertical_28));
        imageView.setContentDescription(string);
    }

    public final void P4(c cVar) {
        Context context = getContext();
        HashSet hashSet = iah0.a;
        if (fnj.c(context)) {
            bwt0.p0(this.u, true);
            this.w = cVar;
        }
    }

    public final void Q4(int i, int i2) {
        ImageView imageView = this.u;
        imageView.setImageResource(i);
        imageView.setContentDescription(getContext().getString(i2));
    }

    public final void T4(int i, int i2) {
        String string = getContext().getString(i2);
        Drawable a2 = dhr0.t.a(i);
        ImageView imageView = this.t;
        imageView.setImageDrawable(a2);
        imageView.setContentDescription(string);
        imageView.setVisibility(0);
    }

    public final ImageView getMenuButton() {
        return this.t;
    }

    public final boolean getTitleAutoFocusEnabled() {
        return this.z;
    }

    public final void setMenuButtonEnabled(boolean z) {
        this.t.setEnabled(z);
    }

    public final void setMenuClickListener(b bVar) {
        this.y = bVar;
    }

    public final void setTitle(int i) {
        setTitle(getContext().getString(i));
    }

    public final void setTitleAutoFocusEnabled(boolean z) {
        this.z = z;
    }

    public final void setTitleClickListener(d dVar) {
        this.x = dVar;
    }

    public final void setTitleTalkbackVisible(boolean z) {
        TextView textView = this.v;
        textView.setFocusable(z);
        textView.setImportantForAccessibility(z ? 1 : 2);
    }

    public final void setTitleTextAppearance(int i) {
        this.v.setTextAppearance(i);
    }

    public final void setTitle(String str) {
        this.v.setText(str);
    }
}
