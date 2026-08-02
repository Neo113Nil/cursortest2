package com.vk.superapp.ui.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import xsna.izs;

/* compiled from: SuperAppRecyclerView.kt */
/* loaded from: classes6.dex */
public final class SuperAppRecyclerView extends VkRecyclerPaginatedView {
    public izs<? super Throwable, ? extends Throwable> O;

    public SuperAppRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final izs<Throwable, Throwable> getUiErrorMapper() {
        return this.O;
    }

    @Override // com.vk.lists.AbstractPaginatedView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Throwable th) {
            x(th);
            throw null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (Throwable th) {
            x(th);
            throw null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            x(th);
            throw null;
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            x(th);
            throw null;
        }
    }

    public final void setUiErrorMapper(izs<? super Throwable, ? extends Throwable> izsVar) {
        this.O = izsVar;
    }

    public final void x(Throwable th) {
        Throwable invoke;
        izs<? super Throwable, ? extends Throwable> izsVar = this.O;
        if (izsVar != null && (invoke = izsVar.invoke(th)) != null) {
            throw invoke;
        }
    }
}
