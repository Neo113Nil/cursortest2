package com.vk.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.design.ui.themehelper.R$styleable;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.bwt0;
import xsna.d3m;
import xsna.e3m;
import xsna.f4m;
import xsna.fm0;
import xsna.iah0;
import xsna.jjc;
import xsna.jm0;
import xsna.l8g;
import xsna.ozl;
import xsna.qt0;
import xsna.s3q0;
import xsna.wng0;
import xsna.xus;

/* compiled from: BottomConfirmButton.kt */
@ozl
/* loaded from: classes17.dex */
public final class BottomConfirmButton extends FrameLayout {
    public static final int n = iah0.a(0.5f);
    public final View b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final long f;
    public final int g;
    public final int h;
    public final Paint i;
    public final int j;
    public final Rect k;
    public Drawable l;
    public Drawable m;

    public BottomConfirmButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = 100L;
        float f = 48;
        this.g = iah0.a(f);
        int i = n;
        this.h = i;
        this.i = new Paint(1);
        this.k = new Rect();
        this.l = new ColorDrawable();
        this.m = new ColorDrawable();
        LayoutInflater.from(context).inflate(R.layout.bottom_confirm_button, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.bcb_send);
        this.b = findViewById;
        TextView textView = (TextView) findViewById(R.id.bcb_send_text);
        this.c = textView;
        TextView textView2 = (TextView) findViewById(R.id.bcb_send_counter);
        textView2.setBackground(new wng0());
        this.d = textView2;
        TextView textView3 = (TextView) findViewById(R.id.bcb_cancel);
        this.e = textView3;
        TypedArray obtainStyledAttributes = attributeSet == null ? null : context.obtainStyledAttributes(attributeSet, R$styleable.a);
        if (obtainStyledAttributes != null) {
            int color = obtainStyledAttributes.getColor(9, e3m.f(R.attr.vk_ui_text_primary, context));
            int color2 = obtainStyledAttributes.getColor(6, e3m.f(R.attr.vk_ui_background_accent_themed, context));
            int color3 = obtainStyledAttributes.getColor(7, l8g.f(0.64f, e3m.f(R.attr.vk_ui_background_accent_themed, context)));
            int color4 = obtainStyledAttributes.getColor(3, e3m.f(R.attr.vk_ui_text_primary, context));
            int color5 = obtainStyledAttributes.getColor(1, e3m.f(R.attr.vk_ui_background_accent, context));
            String string = obtainStyledAttributes.getString(8);
            String string2 = obtainStyledAttributes.getString(2);
            boolean z = obtainStyledAttributes.getBoolean(10, false);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(11, iah0.a(f));
            this.h = obtainStyledAttributes.getDimensionPixelSize(5, i);
            int a2 = z ? iah0.a(8) : 0;
            this.j = a2;
            dimensionPixelSize = z ? dimensionPixelSize : iah0.a(44);
            setDividerColor(obtainStyledAttributes.getColor(4, 503316480));
            this.f = obtainStyledAttributes.getInt(0, 100);
            if (z) {
                this.g = iah0.a(68);
                setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, context));
                float f2 = 16;
                float f3 = 12;
                setPadding(iah0.a(f2), iah0.a(f3), iah0.a(f2), iah0.a(f3));
                bwt0.c0(dimensionPixelSize, findViewById);
                textView3.setHeight(dimensionPixelSize);
            }
            float f4 = a2;
            this.m = xus.a(f4, color3, 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
            RippleDrawable a3 = xus.a(f4, color2, 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
            this.l = a3;
            findViewById.setBackground(a3);
            textView.setTextColor(color);
            textView.setText(string);
            textView2.setTextColor(color2);
            Drawable background = textView2.getBackground();
            wng0 wng0Var = background instanceof wng0 ? (wng0) background : null;
            if (wng0Var != null) {
                wng0Var.b(color);
            }
            setCounter(0);
            textView3.setBackground(xus.a(f4, color5, 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE));
            textView3.setTextColor(color4);
            textView3.setText(string2);
            s3q0 s3q0Var = s3q0.a;
            obtainStyledAttributes.recycle();
        }
    }

    private final wng0 getCounterBackground() {
        Drawable background = this.d.getBackground();
        if (background instanceof wng0) {
            return (wng0) background;
        }
        return null;
    }

    private final int getDividerColor() {
        return this.i.getColor();
    }

    private final void setDividerColor(int i) {
        this.i.setColor(i);
    }

    public final void a(boolean z) {
        TextView textView = this.e;
        if (bwt0.K(textView)) {
            if (z) {
                d3m.e(this.e, (r15 & 1) != 0 ? 300L : this.f, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            } else {
                f4m.j(textView);
            }
        }
    }

    public final int getExpectedHeight() {
        return this.g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int i = this.h;
        Rect rect = this.k;
        rect.set(0, 0, width, i);
        canvas.drawRect(rect, this.i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable background = this.d.getBackground();
        wng0 wng0Var = background instanceof wng0 ? (wng0) background : null;
        if (wng0Var != null) {
            wng0.e((int) (r2.getMeasuredHeight() / 2.0f), wng0Var);
        }
    }

    public final void setAccentColor(int i) {
        this.b.setBackground(xus.a(this.j, i, 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE));
        this.e.setTextColor(i);
    }

    public final void setButtonsAccent(int i) {
        float f = this.j;
        this.m = xus.a(f, i, 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
        this.l = xus.a(f, i, 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
        setAccentColor(i);
    }

    public final void setConfirmText(String str) {
        this.c.setText(str);
        setCounter(0);
    }

    public final void setCounter(int i) {
        String valueOf = String.valueOf(i);
        TextView textView = this.d;
        textView.setText(valueOf);
        bwt0.p0(textView, i > 0);
        this.c.setTranslationX(i <= 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : -((int) iah0.y(12)));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.b.setBackground(z ? this.l : this.m);
        super.setEnabled(z);
    }

    public final void setListener(a aVar) {
        fm0 fm0Var = new fm0(aVar, 7);
        View view = this.b;
        jjc.g(view, fm0Var);
        bwt0.k0(view, new qt0(aVar));
        jjc.g(this.e, new jm0(aVar, 3));
    }

    /* compiled from: BottomConfirmButton.kt */
    public interface a {
        default void b() {
        }

        default void c() {
        }
    }
}
