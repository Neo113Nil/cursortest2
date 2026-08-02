package com.vk.core.view.components.spinner;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.b8q;
import xsna.cut0;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.gpo0;
import xsna.hav0;
import xsna.hbh0;
import xsna.nkk0;
import xsna.shv0;
import xsna.thv0;
import xsna.tlo0;
import xsna.too0;
import xsna.zrp;

/* compiled from: VkScreenSpinner.kt */
/* loaded from: classes.dex */
public final class VkScreenSpinner extends FrameLayout implements too0 {
    public static final /* synthetic */ int i = 0;
    public SpinnerMode b;
    public boolean c;
    public boolean d;
    public final TextView e;
    public final VkSpinnerContent f;
    public ValueAnimator g;
    public Size h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkScreenSpinner.kt */
    public static final class SpinnerMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SpinnerMode[] $VALUES;
        public static final SpinnerMode Overlay;
        public static final SpinnerMode Shadow;

        static {
            SpinnerMode spinnerMode = new SpinnerMode("Shadow", 0);
            Shadow = spinnerMode;
            SpinnerMode spinnerMode2 = new SpinnerMode("Overlay", 1);
            Overlay = spinnerMode2;
            SpinnerMode[] spinnerModeArr = {spinnerMode, spinnerMode2};
            $VALUES = spinnerModeArr;
            $ENTRIES = new asp(spinnerModeArr);
        }

        public SpinnerMode() {
            throw null;
        }

        public static zrp<SpinnerMode> h() {
            return $ENTRIES;
        }

        public static SpinnerMode valueOf(String str) {
            return (SpinnerMode) Enum.valueOf(SpinnerMode.class, str);
        }

        public static SpinnerMode[] values() {
            return (SpinnerMode[]) $VALUES.clone();
        }
    }

    /* compiled from: VkScreenSpinner.kt */
    /* loaded from: classes17.dex */
    public static final class a implements TypeEvaluator<Size> {
        @Override // android.animation.TypeEvaluator
        public final Size evaluate(float f, Size size, Size size2) {
            Size size3 = size;
            Size size4 = size2;
            return new Size((int) (((size4.getWidth() - size3.getWidth()) * f) + size3.getWidth()), (int) (((size4.getHeight() - size3.getHeight()) * f) + size3.getHeight()));
        }
    }

    public VkScreenSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.too0
    public final void Ng() {
        a();
    }

    public final void a() {
        nkk0 nkk0Var;
        int i2 = com.vk.core.view.components.spinner.a.$EnumSwitchMapping$1[this.b.ordinal()];
        if (i2 == 1) {
            nkk0Var = new nkk0(R.attr.vk_ui_background_contrast_themed, R.attr.vk_ui_icon_medium, R.attr.vk_ui_text_secondary);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            nkk0Var = new nkk0(R.attr.vk_ui_avatar_overlay, R.attr.vk_ui_icon_contrast, R.attr.vk_ui_text_contrast);
        }
        if (this.c) {
            setBackgroundColor(gpo0.d(nkk0Var.a, this));
        }
        if (this.d) {
            this.f.setColor(gpo0.d(nkk0Var.b, this));
        }
        this.e.setTextColor(gpo0.d(nkk0Var.c, this));
    }

    public final void b(CharSequence charSequence, boolean z) {
        TextView textView = this.e;
        if (!z || getWidth() <= 0) {
            ValueAnimator valueAnimator = this.g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
            }
            textView.setText(charSequence);
            f4m.E(textView, !(charSequence == null || charSequence.length() == 0));
            return;
        }
        if (epx.f(charSequence, getSubtitle())) {
            return;
        }
        Size size = new Size(getWidth(), getHeight());
        textView.setText(charSequence);
        f4m.E(textView, !(charSequence == null || charSequence.length() == 0));
        int i2 = textView.getLayoutParams().width;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -2;
        textView.setLayoutParams(layoutParams);
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        getLayoutParams().width = i2;
        textView.setLayoutParams(layoutParams2);
        Size size2 = new Size(getMeasuredWidth(), getMeasuredHeight());
        ValueAnimator valueAnimator2 = this.g;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && epx.f(this.h, size2)) {
            return;
        }
        ValueAnimator valueAnimator3 = this.g;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            valueAnimator3.removeAllUpdateListeners();
            valueAnimator3.removeAllListeners();
        }
        if (size.equals(size2)) {
            return;
        }
        textView.getLayoutParams().width = textView.getMeasuredWidth();
        ValueAnimator ofObject = ValueAnimator.ofObject(new a(), size, size2);
        ofObject.addUpdateListener(new b8q(this, 3));
        ofObject.setInterpolator(new LinearInterpolator());
        ofObject.setDuration(200L);
        ofObject.addListener(new thv0(this));
        ofObject.addListener(new shv0(this));
        ofObject.start();
        this.h = size2;
        this.g = ofObject;
    }

    public final boolean getBackgroundColorful() {
        return this.c;
    }

    public final boolean getContentColorful() {
        return this.d;
    }

    public final SpinnerMode getSpinnerMode() {
        return this.b;
    }

    public final VkSpinner.SpinnerSize getSpinnerSize() {
        return this.f.getSpinnerSize();
    }

    public final VkSpinnerContent.SpinnerState getSpinnerState() {
        return this.f.getSpinnerState();
    }

    public final String getSubtitle() {
        return this.e.getText().toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
    }

    public final void setBackgroundColorful(boolean z) {
        if (this.c != z) {
            this.c = z;
            a();
        }
    }

    public final void setCardBackgroundColor(cut0 cut0Var) {
        setCardBackgroundColor(cut0Var.b(getContext()));
    }

    public final void setColor(cut0 cut0Var) {
        setColor(cut0Var.b(getContext()));
    }

    public final void setContentColorful(boolean z) {
        if (this.d != z) {
            this.d = z;
            a();
        }
    }

    public final void setCustomContent(VkSpinnerContent.a aVar) {
        this.f.setCustomContent(aVar);
    }

    public final void setOnCancelListener(VkSpinnerContent.b bVar) {
        this.f.setOnCancelListener(bVar);
    }

    public final void setSpinnerMode(SpinnerMode spinnerMode) {
        int i2;
        this.b = spinnerMode;
        Context context = getContext();
        int i3 = com.vk.core.view.components.spinner.a.$EnumSwitchMapping$1[this.b.ordinal()];
        if (i3 == 1) {
            i2 = R.dimen.vk_ui_elevation_three;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.dimen.vk_ui_elevation_zero;
        }
        setElevation(e3m.a(i2, context));
        a();
    }

    public final void setSpinnerSize(VkSpinner.SpinnerSize spinnerSize) {
        this.f.setSpinnerSize(spinnerSize);
    }

    public final void setSpinnerState(VkSpinnerContent.SpinnerState spinnerState) {
        this.f.setSpinnerState(spinnerState);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkScreenSpinner(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        tlo0.h hVar;
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        this.b = SpinnerMode.Shadow;
        this.c = true;
        this.d = true;
        LayoutInflater.from(context).inflate(R.layout.ds_internal_screen_spinner, this);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.e = (TextView) findViewById(R.id.subtitle);
        this.f = (VkSpinnerContent) findViewById(R.id.spinner_content);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.x, 0, 0);
        int integer = obtainStyledAttributes.getInteger(2, 0);
        int integer2 = obtainStyledAttributes.getInteger(4, 0);
        int integer3 = obtainStyledAttributes.getInteger(3, VkSpinner.SpinnerSize.Size56.ordinal());
        String string = obtainStyledAttributes.getString(5);
        setBackgroundColorful(obtainStyledAttributes.getBoolean(0, true));
        setContentColorful(obtainStyledAttributes.getBoolean(1, true));
        if (string != null) {
            tlo0.Companion.getClass();
            hVar = tlo0.a.d(string);
        } else {
            hVar = null;
        }
        b(hVar != null ? hVar.a(getContext()) : null, false);
        setSpinnerMode((SpinnerMode) SpinnerMode.h().get(integer));
        setSpinnerState((VkSpinnerContent.SpinnerState) VkSpinnerContent.SpinnerState.h().get(integer2));
        setSpinnerSize((VkSpinner.SpinnerSize) VkSpinner.SpinnerSize.h().get(integer3));
        setClipToOutline(true);
        setOutlineProvider(hav0.c);
        setMinimumWidth(hbh0.b(56, context));
        a();
        obtainStyledAttributes.recycle();
    }

    public final void setCardBackgroundColor(int i2) {
        setBackgroundColor(i2);
        setBackgroundColorful(false);
    }

    public final void setColor(int i2) {
        this.f.setColor(i2);
        setContentColorful(false);
    }
}
