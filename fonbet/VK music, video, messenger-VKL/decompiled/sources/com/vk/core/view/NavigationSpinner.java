package com.vk.core.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.iah0;
import xsna.jjc;
import xsna.too0;
import xsna.u11;

/* loaded from: classes17.dex */
public class NavigationSpinner extends AppCompatSpinner implements too0 {
    public int k;
    public boolean l;

    public interface a {
    }

    public interface b {
    }

    public NavigationSpinner(Context context) {
        this(context, null);
    }

    private int getParentWidth() {
        Object parent = getParent();
        if (parent instanceof View) {
            return ((View) parent).getWidth();
        }
        return 0;
    }

    @Override // xsna.too0
    public final void Ng() {
        setPopupBackgroundDrawable(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background_modal)));
        SpinnerAdapter adapter = getAdapter();
        int selectedItemPosition = getSelectedItemPosition();
        AdapterView.OnItemSelectedListener onItemSelectedListener = getOnItemSelectedListener();
        setAdapter((SpinnerAdapter) null);
        setOnItemSelectedListener(null);
        setAdapter(adapter);
        setSelection(selectedItemPosition, false);
        setOnItemSelectedListener(onItemSelectedListener);
    }

    public final int b(SpinnerAdapter spinnerAdapter, int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        View view = null;
        while (i < i2) {
            int itemViewType = spinnerAdapter.getItemViewType(i);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = spinnerAdapter.getView(i, view, this);
            if (view.getLayoutParams() == null) {
                u11.h(-2, -2, view);
            }
            view.measure(i3, i4);
            i5 = Math.max(i5, view.getMeasuredWidth());
            i++;
        }
        return i5;
    }

    public final int c(SpinnerAdapter spinnerAdapter) {
        if (spinnerAdapter == null) {
            return 0;
        }
        new Rect();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int b2 = b(spinnerAdapter, Math.max(0, max - (15 - (min - max))), min, makeMeasureSpec, makeMeasureSpec2, 0);
        if (spinnerAdapter.getCount() <= 15) {
            return b2;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < spinnerAdapter.getCount(); i3++) {
            Object item = spinnerAdapter.getItem(i3);
            int length = item instanceof CharSequence ? ((CharSequence) item).length() : 0;
            if (length > i) {
                i2 = i3;
                i = length;
            }
        }
        return b(spinnerAdapter, i2, i2 + 1, makeMeasureSpec, makeMeasureSpec2, b2);
    }

    public final void d(int i) {
        int min = this.k == 0 ? Math.min(c(getAdapter()), getWidth()) : Math.max(c(getAdapter()), getWidth());
        if (getParent() instanceof View) {
            if (i == 0) {
                getLeft();
            } else {
                getRight();
            }
        }
        setDropDownWidth(min);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        getParentWidth();
        iah0.a(configuration.screenWidthDp);
        d(configuration.getLayoutDirection());
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.l && z) {
            this.l = false;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner, android.widget.Spinner, android.view.View
    public final boolean performClick() {
        if (jjc.b()) {
            return false;
        }
        this.l = true;
        getParentWidth();
        d(getLayoutDirection());
        return super.performClick();
    }

    public void setPopupSizeAlgorithm(int i) {
        this.k = i;
    }

    public NavigationSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public NavigationSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public NavigationSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = 0;
        this.l = false;
    }

    public void setDropDownWidthHelper(a aVar) {
    }

    public void setShowDismissListener(b bVar) {
    }
}
