package com.vk.im.ui.views.avatars;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.typography.FontFamily;
import com.vk.ui.R$styleable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import xsna.c5g;
import xsna.e43;
import xsna.i5g;
import xsna.qtd0;
import xsna.rcc;
import xsna.rli0;
import xsna.uki0;
import xsna.uqm0;

/* compiled from: StackAvatarView.kt */
/* loaded from: classes2.dex */
public final class StackAvatarView extends ViewGroup {
    public static final /* synthetic */ int n = 0;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final Path j;
    public final Rect k;
    public final LinkedHashMap l;
    public final LinkedList m;

    public StackAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = -16777216;
        this.f = -7829368;
        this.g = true;
        this.h = true;
        this.i = -16777216;
        this.j = new Path();
        this.k = new Rect();
        this.l = new LinkedHashMap();
        this.m = new LinkedList();
        setChildrenDrawingOrderEnabled(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.B, 0, 0);
        setIconSize(obtainStyledAttributes.getDimensionPixelSize(4, 0));
        setOffset(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        setStrokeColor(obtainStyledAttributes.getColor(5, -16777216));
        setExtraColor(obtainStyledAttributes.getColor(1, -7829368));
        setExtraTextColor(obtainStyledAttributes.getColor(2, this.e));
        setUseExtraView(obtainStyledAttributes.getBoolean(7, false));
        setReverseDrawingOrder(obtainStyledAttributes.getInt(0, 0) == 1);
        obtainStyledAttributes.recycle();
    }

    public final AvatarView a() {
        AvatarView avatarView = (AvatarView) this.m.poll();
        if (avatarView != null) {
            return avatarView;
        }
        AvatarView avatarView2 = new AvatarView(getContext(), null, 6, 0);
        avatarView2.setBackground(new rcc(this.e));
        return avatarView2;
    }

    public final void b(int i) {
        if (!this.h || i <= 3) {
            return;
        }
        TextView textView = new TextView(getContext());
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new rcc(this.e));
        c(frameLayout);
        frameLayout.addView(textView);
        int i2 = this.b;
        addView(frameLayout, new ViewGroup.LayoutParams(i2, i2));
        textView.setBackground(new rcc(this.f));
        textView.setGravity(17);
        textView.setText("+" + ((Object) uqm0.o(i - 3)));
        textView.setTextSize(0, ((float) this.b) / 2.5f);
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, null, 6);
        textView.setTextColor(this.i);
    }

    public final void c(View view) {
        rcc rccVar = (rcc) view.getBackground();
        rccVar.c = this.e;
        rccVar.e = true;
        rccVar.invalidateSelf();
        int i = this.d;
        view.setPadding(i, i, i, i);
    }

    public final void d(uki0 uki0Var, int i, Drawable drawable) {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof AvatarView) {
                this.m.offer(childAt);
            }
        }
        removeAllViews();
        for (Object obj : rli0.A(rli0.y(uki0Var, 3))) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            AvatarView a = a();
            int i5 = this.b;
            addView(a, new ViewGroup.LayoutParams(i5, i5));
            c(a);
            a.T0((ImageList) obj, drawable);
            i2 = i4;
        }
        b(i);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (((this.e >> 24) & 255) != 0) {
            return super.drawChild(canvas, view, j);
        }
        Object obj = this.l.get(view);
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int save = canvas.save();
        canvas.clipPath((Path) obj);
        try {
            return super.drawChild(canvas, view, j);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void e(Collection<? extends Peer> collection, int i, ProfilesSimpleInfo profilesSimpleInfo) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof AvatarView) {
                this.m.offer(childAt);
            }
        }
        removeAllViews();
        for (Peer peer : rli0.y(new i5g(collection), 3)) {
            AvatarView a = a();
            int i3 = this.b;
            addView(a, new ViewGroup.LayoutParams(i3, i3));
            c(a);
            a.Y0(profilesSimpleInfo.zb(peer));
        }
        b(i);
    }

    public final void f(Collection<? extends qtd0> collection) {
        Collection<? extends qtd0> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((qtd0) it.next()).B7());
        }
        e(arrayList, 0, new ProfilesSimpleInfo(collection));
    }

    public final void g() {
        for (int i = 0; i < getChildCount(); i++) {
            c((AvatarView) getChildAt(i));
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return this.g ? (i - i2) - 1 : i2;
    }

    public final int getExtraColor() {
        return this.f;
    }

    public final int getExtraTextColor() {
        return this.i;
    }

    public final int getIconSize() {
        return this.b;
    }

    public final int getOffset() {
        return this.c;
    }

    public final boolean getReverseDrawingOrder() {
        return this.g;
    }

    public final int getStrokeColor() {
        return this.e;
    }

    public final int getStrokeWidth() {
        return this.d;
    }

    public final boolean getUseExtraView() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Path path;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
            paddingLeft = childAt.getRight() + this.c;
            Path path2 = this.j;
            path2.reset();
            int left = childAt.getLeft();
            int top = childAt.getTop();
            int right = childAt.getRight();
            int bottom = childAt.getBottom();
            Rect rect = this.k;
            rect.set(left, top, right, bottom);
            path2.addCircle(rect.exactCenterX(), rect.exactCenterY(), Math.min(rect.width(), rect.height()) / 2.0f, Path.Direction.CCW);
            LinkedHashMap linkedHashMap = this.l;
            if (i5 > 0 && (path = (Path) linkedHashMap.get(getChildAt(i5 - 1))) != null) {
                if (this.g) {
                    path.op(path2, Path.Op.DIFFERENCE);
                } else {
                    path2.op(path, Path.Op.DIFFERENCE);
                }
            }
            Path path3 = (Path) linkedHashMap.get(childAt);
            if (path3 != null) {
                path3.set(path2);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = (this.d * 2) + this.b;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).measure(makeMeasureSpec, makeMeasureSpec);
        }
        setMeasuredDimension((Math.max(0, getChildCount() - 1) * this.c) + (getChildCount() * i3) + paddingRight, paddingBottom + i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.l.put(view, new Path());
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        this.l.remove(view);
        super.onViewRemoved(view);
    }

    public final void setExtraColor(int i) {
        this.f = i;
        g();
    }

    public final void setExtraTextColor(int i) {
        this.i = i;
        if (this.h) {
            requestLayout();
            invalidate();
        }
    }

    public final void setIconSize(int i) {
        this.b = i;
        requestLayout();
        invalidate();
    }

    public final void setOffset(int i) {
        this.c = i;
        requestLayout();
        invalidate();
    }

    public final void setReverseDrawingOrder(boolean z) {
        this.g = z;
        requestLayout();
        invalidate();
    }

    public final void setStrokeColor(int i) {
        this.e = i;
        g();
    }

    public final void setStrokeWidth(int i) {
        this.d = i;
        g();
        requestLayout();
    }

    public final void setUseExtraView(boolean z) {
        this.h = z;
        requestLayout();
        invalidate();
    }
}
