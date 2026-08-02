package com.vk.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.log.L;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.anj;
import xsna.dhr0;
import xsna.dv0;
import xsna.e3m;
import xsna.jno0;
import xsna.too0;
import xsna.zwt0;

/* loaded from: classes17.dex */
public class AdsButton extends AppCompatTextView implements too0 {
    public Drawable b;
    public ColorStateList c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public b g;

    @Nullable
    public c h;
    public int i;

    public final class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ Rect b;
        public final /* synthetic */ View c;
        public final /* synthetic */ Rect d;
        public final /* synthetic */ int e;

        public a(Rect rect, View view, Rect rect2, int i) {
            this.b = rect;
            this.c = view;
            this.d = rect2;
            this.e = i;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            AdsButton adsButton = AdsButton.this;
            if (!adsButton.e) {
                return true;
            }
            if (!adsButton.f) {
                adsButton.e = false;
                adsButton.e();
                adsButton.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            Rect rect = this.b;
            adsButton.getGlobalVisibleRect(rect);
            View view = this.c;
            Rect rect2 = this.d;
            view.getGlobalVisibleRect(rect2);
            rect2.offset(0, -this.e);
            if (adsButton.getMeasuredHeight() != rect.height() || !rect2.contains(rect)) {
                return true;
            }
            adsButton.e = false;
            adsButton.e();
            return true;
        }
    }

    public interface b {
        void O2(int i);
    }

    public interface c {
        void a(int i);

        void b();

        void c(int i);

        void d(int i);

        void e(int i, dv0 dv0Var);
    }

    public AdsButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = true;
        this.i = 0;
        setEllipsize(TextUtils.TruncateAt.END);
        setMaxLines(1);
        com.vk.typography.b.f(this, FontFamily.MEDIUM);
        this.b = getBackground();
        this.c = getTextColors();
        Activity h = e3m.h(context);
        if (h == null) {
            this.d = false;
            return;
        }
        this.d = true;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        View findViewById = h.findViewById(R.id.list);
        getViewTreeObserver().addOnPreDrawListener(new a(rect, findViewById == null ? h.getWindow().getDecorView() : findViewById, rect2, zwt0.b(context)));
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        this.b = abg0Var.a(R.drawable.ads_button_default);
        dhr0.a.getClass();
        this.c = anj.b(R.color.vkui_outline_button_text, dhr0.E());
        if (this.i == 1) {
            setBackground(abg0Var.a(R.drawable.ads_button));
            jno0.c(this, R.attr.vk_ui_text_contrast_themed);
        } else {
            setBackground(this.b);
            setTextColor(this.c);
        }
    }

    public final void b(int i, boolean z) {
        c cVar = this.h;
        if (cVar == null) {
            L.l("Style delegate is not set in AdsButton. Make sure that you call setAnimationDelegate before using");
            return;
        }
        if (z) {
            this.i = i;
            cVar.c(i);
        } else {
            cVar.b();
            this.h.e(i, new dv0(this, i));
        }
        b bVar = this.g;
        if (bVar != null) {
            bVar.O2(i);
        }
    }

    public final void e() {
        if (this.h == null) {
            L.l("Style delegate is not set in AdsButton. Make sure that you call setAnimationDelegate before using");
        } else {
            b(1, this.i == 1);
        }
    }

    public ColorStateList getOriginalColor() {
        return this.c;
    }

    public Drawable getOriginalDrawable() {
        return this.b;
    }

    public int getStyle() {
        return this.i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d) {
            this.e = true;
        } else {
            e();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        c cVar = this.h;
        if (cVar != null) {
            cVar.b();
        }
        setAlpha(1.0f);
        super.onDetachedFromWindow();
    }

    public void setAlphaAnimationDelay(int i) {
        c cVar = this.h;
        if (cVar == null) {
            L.l("Style delegate is not set in AdsButton. Make sure that you call setAnimationDelegate before using");
        } else {
            cVar.d(i);
        }
    }

    public void setAnimationDelegate(c cVar) {
        this.h = cVar;
    }

    public void setCalculatedColor(int i) {
        c cVar = this.h;
        if (cVar == null) {
            L.l("Style delegate is not set in AdsButton. Make sure that you call setAnimationDelegate before using");
        } else {
            cVar.a(i);
        }
    }

    public void setStyleChangeListener(b bVar) {
        this.g = bVar;
    }
}
