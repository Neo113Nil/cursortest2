package com.sofascore.results.mvvm.base;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.ironsource.U3;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.hkg;
import defpackage.i5h;
import defpackage.tsk;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/sofascore/results/mvvm/base/SofaTabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "", "f0", "Ljava/lang/Integer;", "getInitialTabMode", "()Ljava/lang/Integer;", "initialTabMode", "", U3.i.X, "g0", "Z", "getDrawBottomDivider", "()Z", "setDrawBottomDivider", "(Z)V", "drawBottomDivider", "initialTabGravity", "getInitialTabGravity", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public class SofaTabLayout extends TabLayout {
    public final int a0;
    public final Paint b0;
    public boolean c0;
    public boolean d0;
    public int e0;

    /* renamed from: f0, reason: from kotlin metadata */
    public final Integer initialTabMode;

    /* renamed from: g0, reason: from kotlin metadata */
    public boolean drawBottomDivider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SofaTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        Context context2 = getContext();
        context2.getClass();
        this.a0 = ao2.s(1, context2);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getContext().getColor(R.color.k_20));
        paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.b0 = paint;
        this.c0 = true;
        this.initialTabMode = 0;
        this.drawBottomDivider = true;
        q();
    }

    public final boolean getDrawBottomDivider() {
        return this.drawBottomDivider;
    }

    @Nullable
    public Integer getInitialTabGravity() {
        return null;
    }

    @Nullable
    public Integer getInitialTabMode() {
        return this.initialTabMode;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q();
    }

    @Override // com.google.android.material.tabs.TabLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Context context = getContext();
        context.getClass();
        if (hkg.b0(context) && this.drawBottomDivider) {
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getHeight() - this.a0, getWidth(), getHeight(), this.b0);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            this.d0 = !this.c0;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        View childAt = getChildAt(0);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            super.onMeasure(i, i2);
            return;
        }
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        viewGroup.setMinimumWidth(getWidth());
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            List<View> q = i5h.q(new tsk(viewGroup));
            if (((View) q.get(0)).getMeasuredWidth() != 0) {
                if (this.d0 || !(childCount == this.e0 || this.c0)) {
                    this.e0 = childCount;
                    this.d0 = false;
                    Iterator it = q.iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).setMinimumWidth(0);
                    }
                } else {
                    this.c0 = false;
                    this.e0 = childCount;
                    Iterator it2 = q.iterator();
                    while (it2.hasNext()) {
                        i3 += ((View) it2.next()).getMinimumWidth();
                    }
                    int width = getWidth() - i3;
                    if (width > 0) {
                        int i4 = width / childCount;
                        for (View view : q) {
                            view.setMinimumWidth(view.getMinimumWidth() + i4);
                        }
                    } else {
                        for (View view2 : q) {
                            view2.setMinimumWidth(view2.getMeasuredWidth());
                        }
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public final void q() {
        Context context = getContext();
        context.getClass();
        if (hkg.c0(context)) {
            setLayoutDirection(1);
        }
        Integer initialTabMode = getInitialTabMode();
        if (initialTabMode != null) {
            setTabMode(initialTabMode.intValue());
        }
        Integer initialTabGravity = getInitialTabGravity();
        if (initialTabGravity != null) {
            setTabGravity(initialTabGravity.intValue());
        }
    }

    public final void setDrawBottomDivider(boolean z) {
        this.drawBottomDivider = z;
        invalidate();
    }
}
