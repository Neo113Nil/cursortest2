package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.blf;
import defpackage.bsk;
import defpackage.ca;
import defpackage.eq3;
import defpackage.im3;
import defpackage.mm3;
import defpackage.pjf;
import defpackage.w3a;
import defpackage.yy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
class ClockFaceView extends blf implements az2 {
    public final ClockHandView d;
    public final Rect e;
    public final RectF f;
    public final Rect g;
    public final SparseArray h;
    public final a i;
    public final int[] j;
    public final float[] k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final String[] p;
    public float q;
    public final ColorStateList r;
    public e s;

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Rect();
        this.f = new RectF();
        this.g = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.k = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.i, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        int i = 1;
        ColorStateList x = w3a.x(context, obtainStyledAttributes, 1);
        this.r = x;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.d = clockHandView;
        this.l = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = x.getColorForState(new int[]{android.R.attr.state_selected}, x.getDefaultColor());
        this.j = new int[]{colorForState, colorForState, x.getDefaultColor()};
        clockHandView.c.add(this);
        int defaultColor = eq3.q(R.color.material_timepicker_clockface, context).getDefaultColor();
        ColorStateList x2 = w3a.x(context, obtainStyledAttributes, 0);
        setBackgroundColor(x2 != null ? x2.getDefaultColor() : defaultColor);
        obtainStyledAttributes.recycle();
        setOutlineProvider(new yy2(0));
        setFocusable(true);
        setClipToOutline(true);
        this.i = new a(this, i);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.p = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.p.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.p.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.p[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                bsk.q(textView, this.i);
                textView.setTextColor(this.r);
            }
        }
        ClockHandView clockHandView2 = this.d;
        if (clockHandView2.b && !z) {
            clockHandView2.m = 1;
        }
        clockHandView2.b = z;
        clockHandView2.invalidate();
        this.m = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.n = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.o = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // defpackage.blf
    public final void f() {
        mm3 mm3Var = new mm3();
        mm3Var.e(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            int i3 = this.b;
            if (intValue == 2) {
                i3 = Math.round(i3 * 0.66f);
            }
            Iterator it = list.iterator();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (it.hasNext()) {
                im3 im3Var = mm3Var.j(((View) it.next()).getId()).d;
                im3Var.z = R.id.circle_center;
                im3Var.A = i3;
                im3Var.B = f;
                f += 360.0f / list.size();
            }
        }
        mm3Var.a(this);
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i4)).setVisibility(0);
            i4++;
        }
    }

    public final void j() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.d.g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.h;
            int size = sparseArray.size();
            rect = this.e;
            rectF = this.f;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.g);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.j, this.k, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ca.b(1, this.p.length, 1, false).a);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        int length;
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i3 >= sparseArray.size()) {
                i2 = -1;
                break;
            }
            TextView textView = (TextView) sparseArray.valueAt(i3);
            if (textView.isSelected()) {
                i2 = ((Integer) textView.getTag(R.id.material_value_index)).intValue();
                break;
            }
            i3++;
        }
        if (!isShown() || i2 == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 66) {
            String[] strArr = this.p;
            switch (i) {
                case 19:
                case 22:
                    length = (i2 + 1) % strArr.length;
                    break;
                case 20:
                case 21:
                    length = ((i2 - 1) + strArr.length) % strArr.length;
                    break;
                case 23:
                    break;
                default:
                    return super.onKeyDown(i, keyEvent);
            }
            if (length == i2) {
                return super.onKeyDown(i, keyEvent);
            }
            int i4 = (length / 12) + 1;
            ClockHandView clockHandView = this.d;
            if (i4 != clockHandView.m) {
                clockHandView.m = i4;
                clockHandView.invalidate();
            }
            clockHandView.a((length % 12) * 30.0f);
            j();
            return true;
        }
        e eVar = this.s;
        if (eVar != null) {
            eVar.a.a.isChecked();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        j();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.o / Math.max(Math.max(this.m / displayMetrics.heightPixels, this.n / displayMetrics.widthPixels), 1.0f));
        if (View.MeasureSpec.getMode(i) != 0) {
            max = Math.min(max, View.MeasureSpec.getSize(i));
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            max = Math.min(max, View.MeasureSpec.getSize(i2));
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        ClockHandView clockHandView = this.d;
        int i3 = ((max / 2) - clockHandView.d) - this.l;
        int i4 = this.b;
        if (i3 != i4 && i3 != i4) {
            this.b = i3;
            f();
            clockHandView.l = this.b;
            clockHandView.invalidate();
        }
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
