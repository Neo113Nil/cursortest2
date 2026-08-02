package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.d51;
import defpackage.g7a;
import defpackage.ktk;
import defpackage.l89;
import defpackage.q6i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ModalLayoutPortrait extends d51 {
    public final l89 e;
    public int f;

    public ModalLayoutPortrait(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        l89 l89Var = new l89();
        l89Var.a = new ArrayList();
        l89Var.b = 0;
        this.e = l89Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int size = getVisibleChildren().size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = getVisibleChildren().get(i7);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i8 = measuredHeight + paddingTop;
            if ((layoutParams.gravity & 1) == 1) {
                int i9 = (i3 - i) / 2;
                int i10 = measuredWidth / 2;
                i6 = i9 - i10;
                i5 = i9 + i10;
            } else {
                i5 = paddingLeft + measuredWidth;
                i6 = paddingLeft;
            }
            view.layout(i6, paddingTop, i5, i8);
            int measuredHeight2 = view.getMeasuredHeight() + paddingTop;
            if (i7 < size - 1) {
                measuredHeight2 += this.f;
            }
            paddingTop = measuredHeight2;
        }
    }

    @Override // defpackage.d51, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        this.f = (int) Math.floor(TypedValue.applyDimension(1, 24.0f, this.c));
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int b = b(i);
        int a = a(i2);
        int size = ((getVisibleChildren().size() - 1) * this.f) + paddingTop;
        l89 l89Var = this.e;
        l89Var.getClass();
        l89Var.b = a;
        l89Var.a = new ArrayList();
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            boolean z = childAt.getId() == R.id.body_scroll || childAt.getId() == R.id.image_view;
            ktk ktkVar = new ktk();
            ktkVar.a = childAt;
            ktkVar.b = z;
            ktkVar.c = l89Var.b;
            l89Var.a.add(ktkVar);
        }
        Objects.toString(getDisplayMetrics());
        getMaxWidthPct();
        getMaxHeightPct();
        Iterator it = l89Var.a.iterator();
        while (it.hasNext()) {
            g7a.A(((ktk) it.next()).a, b, a, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        Iterator it2 = l89Var.a.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            i5 += ((ktk) it2.next()).a();
        }
        if (i5 + size > a) {
            int i6 = a - size;
            Iterator it3 = l89Var.a.iterator();
            int i7 = 0;
            while (it3.hasNext()) {
                ktk ktkVar2 = (ktk) it3.next();
                if (!ktkVar2.b) {
                    i7 += ktkVar2.a();
                }
            }
            int i8 = i6 - i7;
            ArrayList arrayList = new ArrayList();
            Iterator it4 = l89Var.a.iterator();
            while (it4.hasNext()) {
                ktk ktkVar3 = (ktk) it4.next();
                if (ktkVar3.b) {
                    arrayList.add(ktkVar3);
                }
            }
            Collections.sort(arrayList, new q6i(13));
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                i3 += ((ktk) it5.next()).a();
            }
            if (arrayList.size() >= 6) {
                a70.r("VerticalViewGroupMeasure only supports up to 5 children");
                return;
            }
            float f2 = 1.0f - ((r6 - 1) * 0.2f);
            Iterator it6 = arrayList.iterator();
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (it6.hasNext()) {
                ktk ktkVar4 = (ktk) it6.next();
                float a2 = ktkVar4.a() / i3;
                if (a2 > f2) {
                    f3 += a2 - f2;
                    f = f2;
                } else {
                    f = a2;
                }
                if (a2 < 0.2f) {
                    float min = Math.min(0.2f - a2, f3);
                    f3 -= min;
                    f = a2 + min;
                }
                ktkVar4.c = (int) (f * i8);
            }
        }
        int i9 = b - paddingLeft;
        Iterator it7 = l89Var.a.iterator();
        while (it7.hasNext()) {
            ktk ktkVar5 = (ktk) it7.next();
            g7a.A(ktkVar5.a, i9, ktkVar5.c, Integer.MIN_VALUE, Integer.MIN_VALUE);
            size += d51.d(ktkVar5.a);
        }
        setMeasuredDimension(b, size);
    }
}
