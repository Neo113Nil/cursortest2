package com.vk.attachpicker.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.widget.c;
import com.vkontakte.android.R;
import org.chromium.base.TimeUtils;
import xsna.bd70;
import xsna.dm10;
import xsna.iah0;
import xsna.l8g;
import xsna.l960;
import xsna.m33;
import xsna.p870;

/* loaded from: classes15.dex */
public class ViewerToolbar extends LinearLayout {
    public static final int q = iah0.a(16) + iah0.v();
    public final int b;
    public final Paint c;
    public final Drawable d;
    public final View e;
    public final TextView f;
    public final ImageButton g;
    public final FrameLayout h;
    public final VkSeekBar i;
    public final TextView j;
    public final TextView k;
    public int l;
    public int m;
    public final a n;
    public final b o;
    public final c p;

    public class a implements bd70 {
        public a() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            if (obj == null || !(obj instanceof Integer)) {
                return;
            }
            int intValue = ((Integer) obj).intValue();
            ViewerToolbar viewerToolbar = ViewerToolbar.this;
            if (intValue == viewerToolbar.l) {
                viewerToolbar.f.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).start();
                viewerToolbar.h.animate().alpha(1.0f).setDuration(200L).start();
            }
        }
    }

    public class b implements bd70 {
        public b() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            if (obj == null || !(obj instanceof Integer)) {
                return;
            }
            int intValue = ((Integer) obj).intValue();
            ViewerToolbar viewerToolbar = ViewerToolbar.this;
            if (intValue == viewerToolbar.l) {
                viewerToolbar.f.animate().alpha(1.0f).setDuration(200L).start();
                viewerToolbar.h.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).start();
            }
        }
    }

    public class c implements bd70<c.e> {
        public c() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, c.e eVar) {
            c.e eVar2 = eVar;
            int i3 = eVar2.d;
            int i4 = eVar2.b;
            ViewerToolbar viewerToolbar = ViewerToolbar.this;
            if (i3 == viewerToolbar.l) {
                viewerToolbar.m = i4;
                float f = eVar2.c;
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    viewerToolbar.i.setValue(f);
                    viewerToolbar.j.setText(ViewerToolbar.a(eVar2.a));
                    viewerToolbar.k.setText(ViewerToolbar.a(i4));
                }
            }
        }
    }

    public ViewerToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f = 8;
        this.b = iah0.a(f);
        Paint paint = new Paint();
        this.c = paint;
        this.n = new a();
        this.o = new b();
        this.p = new c();
        setWillNotDraw(false);
        setPadding(0, 0, 0, iah0.a(f));
        setOrientation(0);
        LayoutInflater.from(getContext()).inflate(R.layout.picker_layout_viewer_toolbar, this);
        paint.setColor(l8g.f(0.92f, dm10.b(R.attr.vk_ui_header_background, -1, getContext())));
        Drawable a2 = m33.a(R.drawable.picker_bg_attach_toolbar, getContext());
        this.d = a2;
        a2.setCallback(this);
        this.e = findViewById(R.id.ll_back);
        this.f = (TextView) findViewById(R.id.tv_title);
        this.g = (ImageButton) findViewById(R.id.button_check);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fl_video_progress);
        this.h = frameLayout;
        this.j = (TextView) frameLayout.findViewById(R.id.tv_current_progress);
        this.k = (TextView) this.h.findViewById(R.id.tv_duration);
        VkSeekBar vkSeekBar = (VkSeekBar) this.h.findViewById(R.id.vsb_video_progress);
        this.i = vkSeekBar;
        vkSeekBar.setLimitWidth(false);
        this.i.setIgnoreMovementThreshold(iah0.a(5));
        this.i.setOnSeekBarChangeListener(new l960(this, 15));
        this.i.setStateListener(new d(this));
    }

    public static String a(int i) {
        long abs = Math.abs(i / 1000);
        return String.format("%01d:%02d", Long.valueOf((abs % TimeUtils.SECONDS_PER_HOUR) / 60), Long.valueOf(abs % 60));
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight() - getPaddingBottom(), this.c);
        super.draw(canvas);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f.setAlpha(1.0f);
        p870.f().b(4, this.n);
        p870.f().b(5, this.o);
        p870.f().b(3, this.p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        p870.f().g(this.n);
        p870.f().g(this.o);
        p870.f().g(this.p);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + ((int) getResources().getDimension(R.dimen.picker_toolbar_height)), 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > q) {
            this.f.setTextSize(16.0f);
        } else {
            this.f.setTextSize(20.0f);
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(0, i2 - this.b, i, i2);
        }
    }

    public void setChecked(boolean z) {
        if (z) {
            this.g.setImageResource(R.drawable.vk_icon_check_circle_on_24);
            this.g.setColorFilter(dm10.b(R.attr.vk_ui_icon_accent, -1, getContext()));
            this.g.setContentDescription(getContext().getString(R.string.accessibility_cancel));
            return;
        }
        this.g.setImageResource(R.drawable.picker_ic_check_outline_24);
        this.g.setColorFilter(dm10.b(R.attr.vk_ui_icon_medium, -1, getContext()));
        this.g.setContentDescription(getContext().getString(R.string.accessibility_select));
    }

    public void setCurrentPagerPosition(int i) {
        this.l = i;
    }

    public void setOnBackListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    public void setOnCheckListener(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            this.g.setVisibility(8);
            this.g.setOnClickListener(null);
        } else {
            this.g.setVisibility(0);
            this.g.setOnClickListener(onClickListener);
        }
    }

    public void setTitle(String str) {
        this.f.setText(str);
    }
}
