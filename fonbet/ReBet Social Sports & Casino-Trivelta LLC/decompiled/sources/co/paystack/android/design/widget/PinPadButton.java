package co.paystack.android.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
class PinPadButton extends ForegroundRelativeLayout {

    /* renamed from: g, reason: collision with root package name */
    public float f27907g;

    /* renamed from: h, reason: collision with root package name */
    public float f27908h;

    /* renamed from: i, reason: collision with root package name */
    public int f27909i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f27910j;

    /* renamed from: k, reason: collision with root package name */
    public String f27911k;

    /* renamed from: l, reason: collision with root package name */
    public String f27912l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f27913m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f27914n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f27915o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f27916p;

    /* renamed from: q, reason: collision with root package name */
    public a f27917q;

    public interface a {
        void a(PinPadButton pinPadButton);
    }

    public PinPadButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i10) {
        View inflate = View.inflate(context, e.f27991a, this);
        this.f27913m = (TextView) inflate.findViewById(d.f27975b);
        this.f27914n = (TextView) inflate.findViewById(d.f27974a);
        this.f27915o = (ImageView) inflate.findViewById(d.f27976c);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.PinPadView, i10, 0);
            this.f27907g = obtainStyledAttributes.getDimension(f.f28000h, 18.0f);
            this.f27908h = obtainStyledAttributes.getDimension(f.f27997e, 12.0f);
            this.f27909i = obtainStyledAttributes.getDimensionPixelSize(f.f27999g, 15);
            if (obtainStyledAttributes.hasValue(f.f27998f)) {
                this.f27910j = obtainStyledAttributes.getDrawable(f.f27998f);
            }
            if (obtainStyledAttributes.hasValue(f.f28002j)) {
                this.f27911k = obtainStyledAttributes.getString(f.f28002j);
            }
            if (obtainStyledAttributes.hasValue(f.f28001i)) {
                this.f27912l = obtainStyledAttributes.getString(f.f28001i);
            }
            if (obtainStyledAttributes.hasValue(f.f28003k)) {
                this.f27916p = obtainStyledAttributes.getColorStateList(f.f28003k);
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f27910j == null) {
            String str = this.f27911k;
            if (str != null && !str.isEmpty()) {
                this.f27915o.setVisibility(8);
                this.f27913m.setVisibility(0);
                this.f27913m.setTextSize(0, this.f27907g);
                this.f27913m.setText(this.f27911k);
            }
            String str2 = this.f27912l;
            if (str2 != null && !str2.isEmpty()) {
                this.f27915o.setVisibility(8);
                this.f27914n.setVisibility(0);
                this.f27914n.setTextSize(0, this.f27908h);
                this.f27914n.setText(this.f27912l);
            }
        } else {
            this.f27915o.setVisibility(0);
            this.f27914n.setVisibility(8);
            this.f27913m.setVisibility(8);
            int i11 = this.f27909i;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
            layoutParams.addRule(13, -1);
            this.f27915o.setLayoutParams(layoutParams);
            this.f27915o.setImageDrawable(this.f27910j);
        }
        h(this.f27916p);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13, -1);
        setLayoutParams(layoutParams2);
        setClickable(true);
    }

    public void b(float f10) {
        TextView textView = this.f27914n;
        if (textView != null) {
            this.f27908h = f10;
            textView.setTextSize(0, f10);
            requestLayout();
        }
    }

    public void c(a aVar) {
        this.f27917q = aVar;
    }

    public void d(int i10) {
        if (this.f27915o != null) {
            this.f27909i = i10;
            int i11 = this.f27909i;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
            layoutParams.addRule(13, -1);
            this.f27915o.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        a aVar;
        if (keyEvent.getAction() == 1 && ((keyEvent.getKeyCode() == 23 || keyEvent.getKeyCode() == 66) && (aVar = this.f27917q) != null)) {
            aVar.a(this);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (motionEvent.getAction() == 1 && (aVar = this.f27917q) != null) {
            aVar.a(this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void e(String str) {
        TextView textView = this.f27913m;
        if (textView != null) {
            this.f27911k = str;
            textView.setText(str);
            requestLayout();
        }
    }

    public void f(float f10) {
        TextView textView = this.f27913m;
        if (textView != null) {
            this.f27907g = f10;
            textView.setTextSize(0, f10);
            requestLayout();
        }
    }

    public void g(int i10) {
        h(ColorStateList.valueOf(i10));
        requestLayout();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f27914n.setTextColor(colorStateList);
            this.f27913m.setTextColor(colorStateList);
        }
    }

    public PinPadButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27916p = ColorStateList.valueOf(-1);
        a(context, attributeSet, i10);
    }
}
