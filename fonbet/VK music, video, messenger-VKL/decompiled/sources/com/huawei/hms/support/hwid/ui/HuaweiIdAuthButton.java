package com.huawei.hms.support.hwid.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.android.hms.hwid.R$styleable;
import com.vkontakte.android.R;
import xsna.lr;

/* loaded from: classes13.dex */
public class HuaweiIdAuthButton extends RelativeLayout {
    public static final int COLOR_POLICY_BLACK = 3;
    public static final int COLOR_POLICY_GRAY = 4;
    public static final int COLOR_POLICY_RED = 0;
    public static final int COLOR_POLICY_WHITE = 1;
    public static final int COLOR_POLICY_WHITE_WITH_BORDER = 2;
    public static final int CORNER_RADIUS_LARGE = -1;
    public static final int CORNER_RADIUS_MEDIUM = -2;
    public static final int CORNER_RADIUS_SMALL = -3;
    public static final int THEME_FULL_TITLE = 1;
    public static final int THEME_NO_TITLE = 0;
    private static final PorterDuffColorFilter a;
    private static final PorterDuffColorFilter b;
    private static final PorterDuffColorFilter c;
    private int d;
    private int e;
    private int f;
    private GradientDrawable g;
    private Button h;
    private ImageView i;
    private LinearLayout j;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        a = new PorterDuffColorFilter(218103808, mode);
        b = new PorterDuffColorFilter(436207616, mode);
        c = new PorterDuffColorFilter(872415231, mode);
    }

    public HuaweiIdAuthButton(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    private void a(AttributeSet attributeSet) {
        GradientDrawable gradientDrawable = (GradientDrawable) getResources().getDrawable(R.drawable.hwid_auth_button_background);
        this.g = gradientDrawable;
        setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.j = linearLayout;
        int i = 0;
        linearLayout.setOrientation(0);
        this.j.setGravity(17);
        b();
        a();
        addView(this.j);
        int a2 = a(8.0f);
        int i2 = 1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.a);
            int i3 = obtainStyledAttributes.getInt(0, 1);
            i = obtainStyledAttributes.getInt(1, 0);
            int layoutDimension = obtainStyledAttributes.getLayoutDimension(2, a(8.0f));
            obtainStyledAttributes.recycle();
            i2 = i3;
            a2 = layoutDimension;
        }
        setLayoutParams(generateDefaultLayoutParams());
        setUIMode(i2, i, a2);
    }

    private void b() {
        if (this.h == null) {
            this.h = new Button(getContext());
        }
        this.h.setStateListAnimator(null);
        this.h.setBackground(null);
        int intrinsicWidth = a(R.drawable.hwid_auth_button_white).getIntrinsicWidth();
        int a2 = a(8.0f);
        this.h.setCompoundDrawablePadding(a2);
        a(intrinsicWidth, a2);
        this.h.setLayoutParams(new ViewGroup.LayoutParams(-2, a(36.0f)));
        this.j.addView(this.h);
    }

    private void setBackgroundCornerRadius(int i) {
        this.g.mutate();
        this.g.setCornerRadius(i);
    }

    private void setBackgroundDrawableColor(int i) {
        this.g.mutate();
        this.g.setColor(getResources().getColor(i));
    }

    public int getColorPolicy() {
        return this.e;
    }

    public int getCornerRadius() {
        return this.f;
    }

    public int getTheme() {
        return this.d;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (r0 != 4) goto L26;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        GradientDrawable gradientDrawable;
        if (motionEvent.getAction() == 0) {
            if (this.g != null && isEnabled()) {
                int i = this.e;
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            this.g.setColorFilter(c);
                        }
                    }
                    this.g.setColorFilter(a);
                } else {
                    this.g.setColorFilter(b);
                }
            }
        } else if (1 == motionEvent.getAction() && (gradientDrawable = this.g) != null) {
            gradientDrawable.clearColorFilter();
        }
        if (hasOnClickListeners()) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setColorPolicy(int i) {
        if (i == 0) {
            a(i, R.color.hwid_auth_button_color_red, R.color.hwid_auth_button_color_text_white, R.drawable.hwid_auth_button_white);
            this.i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_white));
            return;
        }
        if (i == 1) {
            a(i, R.color.hwid_auth_button_color_white, R.color.hwid_auth_button_color_text_black, R.drawable.hwid_auth_button_normal);
            this.i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_normal));
            return;
        }
        if (i == 2) {
            a(i, R.color.hwid_auth_button_color_white, R.color.hwid_auth_button_color_text_black, R.drawable.hwid_auth_button_normal);
            if (this.d == 1) {
                b(a(1.0f), getResources().getColor(R.color.hwid_auth_button_color_border));
                return;
            }
            return;
        }
        if (i == 3) {
            a(i, R.color.hwid_auth_button_color_black, R.color.hwid_auth_button_color_text_white, R.drawable.hwid_auth_button_white);
            this.i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_white));
        } else {
            if (i != 4) {
                return;
            }
            a(i, R.color.hwid_auth_button_color_gray, R.color.hwid_auth_button_color_text_black, R.drawable.hwid_auth_button_normal);
        }
    }

    public void setCornerRadius(int i) {
        if (i == -3) {
            i = a(3.0f);
        } else if (i == -2) {
            i = a(8.0f);
        } else if (i == -1) {
            i = a(24.0f);
        }
        if (i < 0) {
            return;
        }
        this.f = i;
        setBackgroundCornerRadius(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.38f);
        }
    }

    public void setTheme(int i) {
        if (i == 0) {
            this.d = i;
            this.i.setVisibility(0);
            this.h.setVisibility(8);
            setMinimumWidth(a(48.0f));
            setMinimumHeight(a(48.0f));
            this.j.setMinimumWidth(a(48.0f));
            this.j.setMinimumHeight(a(48.0f));
            return;
        }
        if (i != 1) {
            return;
        }
        this.d = i;
        this.i.setVisibility(8);
        this.h.setVisibility(0);
        setMinimumWidth(a(200.0f));
        setMinimumHeight(a(36.0f));
        this.j.setMinimumWidth(a(200.0f));
        this.j.setMinimumHeight(a(36.0f));
    }

    public void setUIMode(int i, int i2, int i3) {
        setTheme(i);
        setColorPolicy(i2);
        setCornerRadius(i3);
    }

    public HuaweiIdAuthButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public HuaweiIdAuthButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }

    private void b(int i, int i2) {
        this.g.mutate();
        this.g.setStroke(i, i2);
    }

    private void a() {
        if (this.i == null) {
            this.i = new ImageView(getContext());
        }
        this.i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_normal));
        setBackgroundDrawableColor(R.color.hwid_auth_button_color_white);
        this.j.addView(this.i);
    }

    private void a(int i, int i2) {
        this.h.setTextSize(16.0f);
        this.h.setText(getResources().getText(R.string.hwid_huawei_login_button_text));
        this.h.setSingleLine();
        int i3 = getResources().getDisplayMetrics().widthPixels;
        int a2 = a(16.0f);
        int i4 = a2 + a2;
        int i5 = i3 - i4;
        this.h.setMaxWidth(i5);
        float measureText = this.h.getPaint().measureText(this.h.getText().toString());
        while (lr.a((int) measureText, i, i2, i4) > i5 && this.h.getTextSize() > a(9.0f)) {
            Button button = this.h;
            button.setTextSize(0, button.getTextSize() - 1.0f);
            measureText = this.h.getPaint().measureText(this.h.getText().toString());
        }
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(a2, 0, a2, 0);
    }

    private Drawable a(int i) {
        Drawable drawable = getResources().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.h.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        return drawable;
    }

    private void a(int i, int i2, int i3, int i4) {
        this.e = i;
        if (this.d != 1 && i != 0 && i != 3 && i != 1) {
            setBackgroundDrawableColor(R.color.hwid_auth_button_color_white);
            this.i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_normal));
        } else {
            setBackgroundDrawableColor(i2);
        }
        b(0, 0);
        this.h.setTextColor(getResources().getColor(i3));
        a(i4);
    }

    private int a(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
