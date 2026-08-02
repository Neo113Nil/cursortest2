package com.monetization.ads.nativeads.view.pager;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.mobile.ads.R$id;
import java.util.ArrayList;
import xsna.an10;
import xsna.mv3;
import xsna.rmk0;
import xsna.s3q0;
import yads.ay1;
import yads.gj0;
import yads.jm0;
import yads.pg0;

/* loaded from: classes14.dex */
public final class MultiBannerControlsContainer extends FrameLayout {
    private final gj0 a;
    private final jm0 b;
    private boolean c;

    public MultiBannerControlsContainer(Context context) {
        super(context);
        this.a = new gj0();
        this.b = new jm0();
        this.c = true;
    }

    public final void setOnClickLeftButtonListener(View.OnClickListener onClickListener) {
        View findViewById = findViewById(R$id.left_scroll_control_button);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public final void setOnClickRightButtonListener(View.OnClickListener onClickListener) {
        View findViewById = findViewById(R$id.right_scroll_control_button);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public final void a(ViewPager2 viewPager2) {
        viewPager2.b(new ay1(viewPager2, this));
        viewPager2.addOnLayoutChangeListener(new mv3(this, 1));
    }

    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new gj0();
        this.b = new jm0();
        this.c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MultiBannerControlsContainer multiBannerControlsContainer, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view instanceof ViewPager2) {
            boolean z = multiBannerControlsContainer.c;
            jm0 jm0Var = multiBannerControlsContainer.b;
            int i9 = i3 - i;
            int i10 = i4 - i2;
            pg0 pg0Var = jm0Var.a;
            Context context = view.getContext();
            pg0Var.getClass();
            int a = pg0.a(context, 144.0f);
            pg0 pg0Var2 = jm0Var.a;
            Context context2 = view.getContext();
            pg0Var2.getClass();
            boolean z2 = i9 >= a && i10 >= pg0.a(context2, 96.0f);
            multiBannerControlsContainer.c = z2;
            if (z2 != z) {
                ViewPager2 viewPager2 = (ViewPager2) view;
                int currentItem = viewPager2.getCurrentItem();
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                multiBannerControlsContainer.a(currentItem, adapter != null ? adapter.getItemCount() : 0);
            }
        }
    }

    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new gj0();
        this.b = new jm0();
        this.c = true;
    }

    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new gj0();
        this.b = new jm0();
        this.c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, int i2) {
        View findViewById = findViewById(R$id.left_scroll_control_button);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        View findViewById2 = findViewById(R$id.right_scroll_control_button);
        ImageView imageView2 = findViewById2 instanceof ImageView ? (ImageView) findViewById2 : null;
        View findViewById3 = findViewById(R$id.dot_indicator);
        ImageView imageView3 = findViewById3 instanceof ImageView ? (ImageView) findViewById3 : null;
        if (!this.c) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(8);
            return;
        }
        View findViewById4 = findViewById(R$id.dot_indicator);
        ImageView imageView4 = findViewById4 instanceof ImageView ? (ImageView) findViewById4 : null;
        boolean z = true;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
            gj0 gj0Var = this.a;
            Context context = getContext();
            gj0Var.a.getClass();
            int a = pg0.a(context, 6.0f);
            gj0Var.a.getClass();
            int b = an10.b(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
            gj0Var.a.getClass();
            int b2 = an10.b(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
            gj0Var.a.getClass();
            int b3 = an10.b(TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics()));
            int i3 = ((i2 + 1) * b) + (a * i2);
            float f = b3;
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3, f);
            float[] fArr = new float[8];
            for (int i4 = 0; i4 < 8; i4++) {
                fArr[i4] = f;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, null));
            shapeDrawable.setIntrinsicWidth(i3);
            shapeDrawable.setIntrinsicHeight(b3);
            shapeDrawable.getPaint().setColor(-16777216);
            shapeDrawable.setAlpha(102);
            ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[i2];
            int i5 = 0;
            while (i5 < i2) {
                boolean z2 = z;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.setIntrinsicHeight(a);
                shapeDrawable2.setIntrinsicWidth(a);
                shapeDrawable2.getPaint().setColor(-1);
                if (i5 != i) {
                    shapeDrawable2.setAlpha(102);
                }
                s3q0 s3q0Var = s3q0.a;
                shapeDrawableArr[i5] = shapeDrawable2;
                i5++;
                z = z2;
            }
            rmk0 rmk0Var = new rmk0(2);
            rmk0Var.a(shapeDrawable);
            rmk0Var.b(shapeDrawableArr);
            ArrayList<Object> arrayList = rmk0Var.a;
            LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) arrayList.toArray(new ShapeDrawable[arrayList.size()]));
            int i6 = 0;
            while (i6 < i2) {
                int i7 = b + a;
                int i8 = i6 + 1;
                layerDrawable.setLayerInset(i8, (i7 * i6) + b, b2, i3 - (i7 * i8), b2);
                i6 = i8;
            }
            imageView4.setImageDrawable(layerDrawable);
        }
        View findViewById5 = findViewById(R$id.left_scroll_control_button);
        ImageView imageView5 = findViewById5 instanceof ImageView ? (ImageView) findViewById5 : null;
        View findViewById6 = findViewById(R$id.right_scroll_control_button);
        ImageView imageView6 = findViewById6 instanceof ImageView ? (ImageView) findViewById6 : null;
        if (imageView5 == null || imageView6 == null) {
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(8);
            return;
        }
        if (i == 0) {
            imageView5.setVisibility(8);
            imageView6.setVisibility(0);
        } else if (i == i2 - 1) {
            imageView5.setVisibility(0);
            imageView6.setVisibility(8);
        } else {
            imageView5.setVisibility(0);
            imageView6.setVisibility(0);
        }
    }
}
