package com.google.android.material.floatingtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.c4;
import androidx.core.view.k2;
import androidx.core.view.q0;
import androidx.core.view.x;
import androidx.core.view.z0;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import g0.d;
import io.sentry.android.core.w0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class FloatingToolbarLayout extends FrameLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_FloatingToolbar;
    private static final String TAG = "FloatingToolbarLayout";
    private int bottomMarginWindowInset;
    private int leftMarginWindowInset;
    private boolean marginBottomSystemWindowInsets;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private Rect originalMargins;
    private int rightMarginWindowInset;
    private int topMarginWindowInset;

    public FloatingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMargins() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.originalMargins;
        if (rect == null) {
            w0.m(TAG, "Unable to update margins because original view margins are not set");
            return;
        }
        int i5 = rect.left + (this.marginLeftSystemWindowInsets ? this.leftMarginWindowInset : 0);
        int i10 = rect.right + (this.marginRightSystemWindowInsets ? this.rightMarginWindowInset : 0);
        int i11 = rect.top + (this.marginTopSystemWindowInsets ? this.topMarginWindowInset : 0);
        int i12 = rect.bottom + (this.marginBottomSystemWindowInsets ? this.bottomMarginWindowInset : 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.bottomMargin == i12 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i10 && marginLayoutParams.topMargin == i11) {
            return;
        }
        marginLayoutParams.bottomMargin = i12;
        marginLayoutParams.leftMargin = i5;
        marginLayoutParams.rightMargin = i10;
        marginLayoutParams.topMargin = i11;
        requestLayout();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            this.originalMargins = null;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.originalMargins = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        updateMargins();
    }

    public FloatingToolbarLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingToolbarStyle);
    }

    public FloatingToolbarLayout(@NonNull Context context, AttributeSet attributeSet, int i5) {
        this(context, attributeSet, i5, DEF_STYLE_RES);
    }

    public FloatingToolbarLayout(@NonNull Context context, AttributeSet attributeSet, int i5, int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i10), attributeSet, i5);
        Context context2 = getContext();
        c4 obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.FloatingToolbar, i5, i10, new int[0]);
        int i11 = R.styleable.FloatingToolbar_backgroundTint;
        TypedArray typedArray = obtainTintedStyledAttributes.f722b;
        TypedArray typedArray2 = obtainTintedStyledAttributes.f722b;
        if (typedArray.hasValue(i11)) {
            int color = typedArray2.getColor(R.styleable.FloatingToolbar_backgroundTint, 0);
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i5, i10).build());
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
            setBackground(materialShapeDrawable);
        }
        this.marginLeftSystemWindowInsets = typedArray2.getBoolean(R.styleable.FloatingToolbar_marginLeftSystemWindowInsets, true);
        this.marginTopSystemWindowInsets = typedArray2.getBoolean(R.styleable.FloatingToolbar_marginTopSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = typedArray2.getBoolean(R.styleable.FloatingToolbar_marginRightSystemWindowInsets, true);
        this.marginBottomSystemWindowInsets = typedArray2.getBoolean(R.styleable.FloatingToolbar_marginBottomSystemWindowInsets, true);
        x xVar = new x() { // from class: com.google.android.material.floatingtoolbar.FloatingToolbarLayout.1
            @Override // androidx.core.view.x
            @NonNull
            public k2 onApplyWindowInsets(@NonNull View view, @NonNull k2 k2Var) {
                if (!FloatingToolbarLayout.this.marginLeftSystemWindowInsets && !FloatingToolbarLayout.this.marginRightSystemWindowInsets && !FloatingToolbarLayout.this.marginTopSystemWindowInsets && !FloatingToolbarLayout.this.marginBottomSystemWindowInsets) {
                    return k2Var;
                }
                d f6 = k2Var.f1349a.f(655);
                FloatingToolbarLayout.this.bottomMarginWindowInset = f6.f9679d;
                FloatingToolbarLayout.this.topMarginWindowInset = f6.f9677b;
                FloatingToolbarLayout.this.rightMarginWindowInset = f6.f9678c;
                FloatingToolbarLayout.this.leftMarginWindowInset = f6.f9676a;
                FloatingToolbarLayout.this.updateMargins();
                return k2Var;
            }
        };
        WeakHashMap weakHashMap = z0.f1413a;
        q0.l(this, xVar);
        obtainTintedStyledAttributes.g();
    }
}
