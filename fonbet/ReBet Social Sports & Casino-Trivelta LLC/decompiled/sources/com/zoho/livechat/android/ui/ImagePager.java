package com.zoho.livechat.android.ui;

import Xf.i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class ImagePager extends ViewPager {

    /* renamed from: Q4, reason: collision with root package name */
    public boolean f44272Q4;

    /* renamed from: R4, reason: collision with root package name */
    public i f44273R4;

    public ImagePager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44272Q4 = true;
        this.f44273R4 = null;
        R();
        setOffscreenPageLimit(2);
    }

    public final void R() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            Field declaredField2 = ViewPager.class.getDeclaredField("y2");
            declaredField2.setAccessible(true);
            i iVar = new i(getContext(), (Interpolator) declaredField2.get(null));
            this.f44273R4 = iVar;
            declaredField.set(this, iVar);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f44272Q4 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f44272Q4 && super.onTouchEvent(motionEvent);
    }

    public void setPagingEnabled(boolean z10) {
        this.f44272Q4 = z10;
    }

    public void setScrollDurationFactor(double d10) {
        this.f44273R4.a(d10);
    }
}
