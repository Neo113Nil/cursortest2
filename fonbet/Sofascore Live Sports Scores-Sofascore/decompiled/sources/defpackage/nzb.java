package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nzb extends AppCompatRadioButton {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    public nzb(Context context, AttributeSet attributeSet) {
        super(oyn.U(context, attributeSet, com.sofascore.results.R.attr.radioButtonStyle, com.sofascore.results.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, 0);
        Context context2 = getContext();
        TypedArray Y = m6k.Y(context2, attributeSet, pjf.D, com.sofascore.results.R.attr.radioButtonStyle, com.sofascore.results.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (Y.hasValue(0)) {
            setButtonTintList(w3a.x(context2, Y, 0));
        }
        if (Y.hasValue(1)) {
            setRippleColor(w3a.x(context2, Y, 1));
        }
        this.f = Y.getBoolean(2, false);
        Y.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.e;
        if (colorStateList != null) {
            return colorStateList;
        }
        int O = o3a.O(getContext(), x2a.O(com.sofascore.results.R.attr.colorControlActivated, this));
        int O2 = o3a.O(getContext(), x2a.O(com.sofascore.results.R.attr.colorOnSurface, this));
        int O3 = o3a.O(getContext(), x2a.O(com.sofascore.results.R.attr.colorSurface, this));
        ColorStateList colorStateList2 = new ColorStateList(g, new int[]{o3a.J(1.0f, O3, O), o3a.J(0.54f, O3, O2), o3a.J(0.38f, O3, O2), o3a.J(0.38f, O3, O2)});
        this.e = colorStateList2;
        return colorStateList2;
    }

    private void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
