package com.google.android.material.bottomnavigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.c4;
import androidx.core.view.k2;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class BottomNavigationView extends NavigationBarView {
    private static final int MAX_ITEM_COUNT = 6;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Deprecated
    public interface OnNavigationItemReselectedListener extends NavigationBarView.OnItemReselectedListener {
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Deprecated
    public interface OnNavigationItemSelectedListener extends NavigationBarView.OnItemSelectedListener {
    }

    public BottomNavigationView(@NonNull Context context) {
        this(context, null);
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public k2 onApplyWindowInsets(View view, @NonNull k2 k2Var, @NonNull ViewUtils.RelativePadding relativePadding) {
                relativePadding.bottom = k2Var.a() + relativePadding.bottom;
                boolean z5 = view.getLayoutDirection() == 1;
                int b10 = k2Var.b();
                int c2 = k2Var.c();
                relativePadding.start += z5 ? c2 : b10;
                int i5 = relativePadding.end;
                if (!z5) {
                    b10 = c2;
                }
                relativePadding.end = i5 + b10;
                relativePadding.applyToView(view);
                return k2Var;
            }
        });
    }

    private int makeMinHeightSpec(int i5) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i5) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i5;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i5), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), Integer.MIN_VALUE);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    public NavigationBarMenuView createNavigationBarMenuView(@NonNull Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 6;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return ((BottomNavigationMenuView) getMenuView()).isItemHorizontalTranslationEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, makeMinHeightSpec(i10));
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight()));
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z5) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.isItemHorizontalTranslationEnabled() != z5) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z5);
            getPresenter().updateMenuView(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        setOnItemReselectedListener(onNavigationItemReselectedListener);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        setOnItemSelectedListener(onNavigationItemSelectedListener);
    }

    public BottomNavigationView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(@NonNull Context context, AttributeSet attributeSet, int i5) {
        this(context, attributeSet, i5, R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@NonNull Context context, AttributeSet attributeSet, int i5, int i10) {
        super(context, attributeSet, i5, i10);
        c4 obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(getContext(), attributeSet, R.styleable.BottomNavigationView, i5, i10, new int[0]);
        setItemHorizontalTranslationEnabled(obtainTintedStyledAttributes.f722b.getBoolean(R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int i11 = R.styleable.BottomNavigationView_android_minHeight;
        TypedArray typedArray = obtainTintedStyledAttributes.f722b;
        if (typedArray.hasValue(i11)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(R.styleable.BottomNavigationView_android_minHeight, 0));
        }
        obtainTintedStyledAttributes.g();
        applyWindowInsets();
    }
}
