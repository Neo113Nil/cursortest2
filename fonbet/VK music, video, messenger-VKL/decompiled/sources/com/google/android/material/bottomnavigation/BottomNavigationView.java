package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.navigation.NavigationBarView;
import xsna.d68;
import xsna.fpo0;
import xsna.rw50;
import xsna.t1u0;
import xsna.x58;
import xsna.yyo0;

/* loaded from: classes13.dex */
public class BottomNavigationView extends NavigationBarView {

    @Deprecated
    public interface a extends NavigationBarView.b {
    }

    @Deprecated
    public interface b extends NavigationBarView.c {
    }

    public BottomNavigationView(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    public final rw50 a(@NonNull Context context) {
        return new x58(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        x58 x58Var = (x58) getMenuView();
        if (x58Var.M != z) {
            x58Var.setItemHorizontalTranslationEnabled(z);
            getPresenter().c(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@Nullable a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@Nullable b bVar) {
        setOnItemSelectedListener(bVar);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.bottomNavigationStyle);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        yyo0 e = fpo0.e(getContext(), attributeSet, R$styleable.BottomNavigationView, i, i2, new int[0]);
        int i3 = R$styleable.BottomNavigationView_itemHorizontalTranslationEnabled;
        TypedArray typedArray = e.b;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(i3, true));
        if (typedArray.hasValue(R$styleable.BottomNavigationView_android_minHeight)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(R$styleable.BottomNavigationView_android_minHeight, 0));
        }
        typedArray.getBoolean(R$styleable.BottomNavigationView_compatShadowEnabled, true);
        e.f();
        t1u0.a(this, new d68());
    }
}
