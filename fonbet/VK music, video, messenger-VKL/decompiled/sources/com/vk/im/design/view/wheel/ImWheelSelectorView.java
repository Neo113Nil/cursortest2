package com.vk.im.design.view.wheel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.vk.im.design.view.R$styleable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cn70;
import xsna.ful0;
import xsna.izs;
import xsna.s3q0;
import xsna.uew;
import xsna.xab;

/* compiled from: ImWheelSelectorView.kt */
/* loaded from: classes2.dex */
public final class ImWheelSelectorView extends FrameLayout {
    public static final int l = Color.argb(8, 0, 0, 0);
    public final RecyclerView b;
    public final w c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public int h;
    public int i;
    public int j;
    public izs<? super Integer, s3q0> k;

    /* compiled from: ImWheelSelectorView.kt */
    public static final class a extends RecyclerView.Adapter<C1105a> {
        public final ArrayList c;
        public final int d = R.drawable.vk_icon_donut_color_28;

        /* compiled from: ImWheelSelectorView.kt */
        /* renamed from: com.vk.im.design.view.wheel.ImWheelSelectorView$a$a, reason: collision with other inner class name */
        public static final class C1105a extends RecyclerView.e0 {
            public final TextView l;

            public C1105a(LinearLayout linearLayout, TextView textView) {
                super(linearLayout);
                this.l = textView;
            }
        }

        public a(ArrayList arrayList) {
            this.c = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(C1105a c1105a, int i) {
            c1105a.l.setText((CharSequence) this.c.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final C1105a onCreateViewHolder(ViewGroup viewGroup, int i) {
            LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setGravity(17);
            linearLayout.setPadding(0, cn70.b(12), 0, cn70.b(12));
            ImageView imageView = new ImageView(viewGroup.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(cn70.b(20), cn70.b(20));
            layoutParams.setMarginEnd(cn70.b(8));
            imageView.setLayoutParams(layoutParams);
            int i2 = this.d;
            if (i2 != 0) {
                imageView.setImageResource(i2);
            }
            imageView.setVisibility(i2 == 0 ? 8 : 0);
            TextView textView = new TextView(viewGroup.getContext());
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            textView.setTextAppearance(R.style.VkUiTypography_Text);
            linearLayout.addView(imageView);
            linearLayout.addView(textView);
            return new C1105a(linearLayout, textView);
        }
    }

    public ImWheelSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setOverScrollMode(2);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.b = recyclerView;
        w wVar = new w();
        this.c = wVar;
        View view = new View(context);
        this.d = view;
        View view2 = new View(context);
        this.e = view2;
        View view3 = new View(context);
        this.f = view3;
        View view4 = new View(context);
        this.g = view4;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(false);
        linearLayout.setFocusable(false);
        this.i = -1;
        this.j = -1;
        int i2 = l;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            Drawable drawable = resourceId != 0 ? context.getDrawable(resourceId) : null;
            TypedValue typedValue = new TypedValue();
            int color = obtainStyledAttributes.getColor(0, getContext().getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true) ? typedValue.data : -1);
            obtainStyledAttributes.recycle();
            Drawable drawable2 = drawable;
            if (drawable == null) {
                GradientDrawable a2 = ful0.a(0);
                a2.setCornerRadius(cn70.c(10));
                a2.setColor(i2);
                drawable2 = a2;
            }
            view.setBackground(drawable2);
            setupGradients(color);
            i = -1;
        } else {
            GradientDrawable a3 = ful0.a(0);
            a3.setCornerRadius(cn70.c(10));
            a3.setColor(i2);
            view.setBackground(a3);
            i = -1;
            setupGradients(-1);
        }
        wVar.attachToRecyclerView(recyclerView);
        addView(view, new FrameLayout.LayoutParams(i, -2));
        addView(recyclerView, new FrameLayout.LayoutParams(i, i));
        linearLayout.addView(view2, new LinearLayout.LayoutParams(i, 0, 1.0f));
        linearLayout.addView(view3, new LinearLayout.LayoutParams(i, 0));
        linearLayout.addView(view4, new LinearLayout.LayoutParams(i, 0, 1.0f));
        addView(linearLayout, new FrameLayout.LayoutParams(i, i));
        recyclerView.addOnScrollListener(new uew(this));
    }

    public static void b(ImWheelSelectorView imWheelSelectorView, int i) {
        imWheelSelectorView.getLayoutManager().K(i, imWheelSelectorView.b.getPaddingTop());
        imWheelSelectorView.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.b.getLayoutManager();
    }

    private final void setupGradients(int i) {
        int i2 = 16777215 & i;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        this.e.setBackground(new GradientDrawable(orientation, new int[]{i, i2}));
        this.g.setBackground(new GradientDrawable(orientation, new int[]{i2, i}));
    }

    public final void d() {
        if (getHeight() <= 0) {
            return;
        }
        RecyclerView recyclerView = this.b;
        View childAt = recyclerView.getChildAt(0);
        int height = childAt != null ? childAt.getHeight() : 0;
        if (height > 0) {
            if (height != this.h) {
                this.h = height;
                int height2 = (getHeight() - this.h) / 2;
                recyclerView.setPadding(0, height2, 0, height2);
                View view = this.f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                int i = layoutParams.height;
                int i2 = this.h;
                if (i != i2) {
                    layoutParams.height = i2;
                    view.setLayoutParams(layoutParams);
                }
            }
            int height3 = (getHeight() / 2) - (this.h / 2);
            this.d.layout(recyclerView.getLeft(), height3, recyclerView.getRight(), this.h + height3);
        }
    }

    public final void e() {
        int position;
        View findSnapView = this.c.findSnapView(getLayoutManager());
        if (findSnapView == null || (position = getLayoutManager().getPosition(findSnapView)) == this.i || position < 0) {
            return;
        }
        this.i = position;
        izs<? super Integer, s3q0> izsVar = this.k;
        if (izsVar != null) {
            izsVar.invoke(Integer.valueOf(position));
        }
    }

    public final RecyclerView.Adapter<? extends RecyclerView.e0> getAdapter() {
        return this.b.getAdapter();
    }

    public final int getSelectedPosition() {
        return this.i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d();
    }

    public final void setAdapter(RecyclerView.Adapter<? extends RecyclerView.e0> adapter) {
        this.b.setAdapter(adapter);
        post(new xab(this, 3));
    }

    public final void setOnItemSelectedListener(izs<? super Integer, s3q0> izsVar) {
        this.k = izsVar;
    }
}
