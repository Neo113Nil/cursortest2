package com.vk.voip.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.typography.FontFamily;
import com.vk.typography.b;
import com.vk.voip.ui.R$styleable;
import java.util.LinkedList;
import kotlin.collections.EmptyList;
import xsna.iah0;
import xsna.j5g;
import xsna.rqi;
import xsna.sew0;
import xsna.x59;

/* compiled from: VoipWatchersView.kt */
/* loaded from: classes7.dex */
public final class VoipWatchersView extends ViewGroup {
    public final LinkedList b;
    public final LinkedList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public Iterable<? extends sew0> k;
    public String l;

    public VoipWatchersView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new LinkedList();
        this.c = new LinkedList();
        this.k = EmptyList.b;
        this.l = "";
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.o, 0, 0);
        setItemSize(obtainStyledAttributes.getDimensionPixelSize(5, iah0.a(40)));
        setItemCount(obtainStyledAttributes.getInteger(4, 3));
        setOverlapSize(obtainStyledAttributes.getDimensionPixelSize(6, iah0.a(10)));
        setDividerSize(obtainStyledAttributes.getDimensionPixelSize(0, iah0.a(2)));
        setExtraTextSize(obtainStyledAttributes.getDimensionPixelSize(3, (int) iah0.y(16)));
        setExtraTextColor(obtainStyledAttributes.getColor(2, -1));
        setExtraBgColor(obtainStyledAttributes.getColor(1, -7829368));
        obtainStyledAttributes.recycle();
    }

    private final TextView getExtraView() {
        TextView textView = (TextView) this.c.poll();
        if (textView != null) {
            return textView;
        }
        TextView textView2 = new TextView(getContext());
        float f = 11;
        textView2.setPadding(iah0.a(f), 0, iah0.a(f), 0);
        textView2.setGravity(17);
        b.k(textView2, FontFamily.MEDIUM, null, 6);
        textView2.setLetterSpacing(0.02f);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        return textView2;
    }

    private final AvatarView getItemView() {
        AvatarView avatarView = (AvatarView) this.b.poll();
        return avatarView == null ? new AvatarView(getContext(), null, 6, 0) : avatarView;
    }

    public final void a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof AvatarView) {
                this.b.offer(childAt);
            } else if (childAt instanceof TextView) {
                this.c.offer(childAt);
            }
        }
        removeAllViews();
        for (sew0 sew0Var : j5g.H0(this.k, this.e)) {
            AvatarView itemView = getItemView();
            int i2 = this.d;
            itemView.setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
            x59.a(itemView, sew0Var);
            addView(itemView);
        }
        if (this.l.length() > 0) {
            TextView extraView = getExtraView();
            extraView.setText(this.l);
            extraView.setTextSize(0, this.h);
            extraView.setTextColor(this.i);
            extraView.setBackground(new a(this.j));
            addView(extraView);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        View view2;
        int childCount = getChildCount();
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= childCount) {
                view2 = null;
                break;
            }
            view2 = getChildAt(i);
            if (z) {
                break;
            }
            if (view2 == view) {
                z = true;
            }
            i++;
        }
        if (view2 == null) {
            return super.drawChild(canvas, view, j);
        }
        Path path = new Path();
        float left = view2.getLeft() - this.g;
        float top = view2.getTop();
        float right = view2.getRight() - this.g;
        float bottom = view2.getBottom();
        float min = Math.min(view2.getWidth() / 2.0f, view2.getHeight() / 2.0f);
        path.addRoundRect(left, top, right, bottom, min, min, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final int getDividerSize() {
        return this.g;
    }

    public final int getExtraBgColor() {
        return this.j;
    }

    public final int getExtraTextColor() {
        return this.i;
    }

    public final int getExtraTextSize() {
        return this.h;
    }

    public final int getItemCount() {
        return this.e;
    }

    public final int getItemSize() {
        return this.d;
    }

    public final int getOverlapSize() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
            paddingLeft = (childAt.getRight() - this.f) + this.g;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt instanceof AvatarView) {
                ((AvatarView) childAt).measure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
            }
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
                int measuredWidth = textView.getMeasuredWidth();
                int i6 = this.d;
                if (measuredWidth < i6) {
                    textView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
                }
            }
            i3 += childAt.getMeasuredWidth();
            i4 = Math.max(i4, childAt.getMeasuredHeight());
        }
        setMeasuredDimension((Math.max(0, getChildCount() - 1) * ((-this.f) + this.g)) + i3 + paddingRight, paddingBottom + i4);
    }

    public final void setDividerSize(int i) {
        if (this.g != i) {
            this.g = i;
            a();
        }
    }

    public final void setExtraBgColor(int i) {
        if (this.j != i) {
            this.j = i;
            a();
        }
    }

    public final void setExtraTextColor(int i) {
        if (this.i != i) {
            this.i = i;
            a();
        }
    }

    public final void setExtraTextSize(int i) {
        if (this.h != i) {
            this.h = i;
            a();
        }
    }

    public final void setItemCount(int i) {
        if (this.e != i) {
            this.e = i;
            a();
        }
    }

    public final void setItemSize(int i) {
        if (this.d != i) {
            this.d = i;
            a();
        }
    }

    public final void setOverlapSize(int i) {
        if (this.f != i) {
            this.f = i;
            a();
        }
    }

    /* compiled from: VoipWatchersView.kt */
    public static final class a extends Drawable {
        public final Paint a;
        public final RectF b = new RectF();

        public a(int i) {
            this.a = rqi.b(1, i);
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            Rect bounds = getBounds();
            RectF rectF = this.b;
            rectF.set(bounds);
            float min = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
            canvas.drawRoundRect(rectF, min, min, this.a);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
