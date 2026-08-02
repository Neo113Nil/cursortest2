package com.vk.attachpicker.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import ru.ok.android.utils.Logger;
import xsna.c3r0;
import xsna.e43;
import xsna.iah0;
import xsna.m33;

/* loaded from: classes15.dex */
public class ContentViewPager extends ViewPager {
    public static Field f;
    public final int b;
    public final Drawable c;
    public boolean d;
    public boolean e;

    public ContentViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = iah0.a(8);
        this.d = true;
        this.e = false;
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mTouchSlop");
            f = declaredField;
            declaredField.setAccessible(true);
            f.setInt(this, iah0.a(2));
            Drawable a = m33.a(R.drawable.picker_bg_attach_toolbar, getContext());
            this.c = a;
            a.setCallback(this);
            setWillNotDraw(false);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            Context context2 = e43.a;
            setPadding(paddingLeft, paddingTop, paddingRight, (int) (context2 == null ? null : context2).getResources().getDimension(R.dimen.picker_bottom_button_height));
        } catch (Exception unused) {
            throw new RuntimeException("touchSlop field not found");
        }
    }

    public static void a(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DisableableViewPager) {
                ((DisableableViewPager) childAt).setTouchEnabled(z);
            } else if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (this.e) {
            return super.canScroll(view, z, i, i2, i3);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.save();
        canvas.translate(getScrollX(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        boolean fitSystemWindows = super.fitSystemWindows(rect);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        setPadding(paddingLeft, paddingTop, paddingRight, (int) context.getResources().getDimension(R.dimen.picker_bottom_button_height));
        return fitSystemWindows;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) - getResources().getDimension(R.dimen.picker_toolbar_height)), 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(0, getPaddingTop(), i, getPaddingTop() + this.b);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAllowNestedViewHorizontalScroll(boolean z) {
        this.e = z;
        PagerAdapter adapter = getAdapter();
        View view = null;
        if (adapter != null && adapter.getCount() != 0 && getChildCount() != 0) {
            if (c3r0.a == null) {
                try {
                    Field declaredField = ViewPager.g.class.getDeclaredField(Logger.METHOD_E);
                    c3r0.a = declaredField;
                    declaredField.setAccessible(true);
                } catch (Exception unused) {
                    throw new RuntimeException("position field not found");
                }
            }
            int currentItem = getCurrentItem();
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i);
                ViewPager.g gVar = (ViewPager.g) childAt.getLayoutParams();
                if (!gVar.a) {
                    try {
                        if (c3r0.a.getInt(gVar) == currentItem) {
                            view = childAt;
                            break;
                        }
                    } catch (Exception unused2) {
                    }
                }
                i++;
            }
        }
        if (view == null || !(view instanceof ViewGroup)) {
            return;
        }
        a((ViewGroup) view, z);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        super.setPadding(i, i2, i3, (int) context.getResources().getDimension(R.dimen.picker_bottom_button_height));
    }

    public void setSwipeEnabled(boolean z) {
        this.d = z;
    }
}
