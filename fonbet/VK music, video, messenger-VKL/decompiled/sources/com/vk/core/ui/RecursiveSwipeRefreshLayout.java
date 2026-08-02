package com.vk.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iut0;
import xsna.wov;

/* loaded from: classes17.dex */
public class RecursiveSwipeRefreshLayout extends SwipeDrawableRefreshLayout implements wov {
    public RecursiveSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static View A(View view) {
        if ((view instanceof AdapterView) || (view instanceof ScrollView)) {
            return view;
        }
        if (view instanceof RecyclerView) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View A = A(viewGroup.getChildAt(i));
                if (A != null) {
                    return A;
                }
            }
        }
        return null;
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout
    public boolean f() {
        View A = A(this);
        if (A == null) {
            return false;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        return A.canScrollVertically(-1);
    }

    public void setReversed(boolean z) {
    }
}
