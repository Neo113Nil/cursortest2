package com.vk.inappreview.impl.fake;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.inappreview.impl.R$styleable;
import com.vk.inappreview.impl.fake.RatingBar;
import com.vkontakte.android.R;

/* compiled from: RatingBar.kt */
/* loaded from: classes2.dex */
public final class RatingBar extends LinearLayout {
    public final int b;
    public int c;
    public a d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    /* compiled from: RatingBar.kt */
    public interface a {
    }

    public RatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        int i = obtainStyledAttributes.getInt(0, 0);
        this.b = i;
        this.g = obtainStyledAttributes.getColor(4, -16777216);
        this.h = obtainStyledAttributes.getColor(2, -16711936);
        this.e = obtainStyledAttributes.getResourceId(5, R.drawable.rating_star_off);
        this.f = obtainStyledAttributes.getResourceId(6, R.drawable.rating_star_on);
        this.c = obtainStyledAttributes.getInt(7, 0) - 1;
        float dimension = obtainStyledAttributes.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension2 = obtainStyledAttributes.getDimension(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        obtainStyledAttributes.recycle();
        final int i2 = 0;
        while (i2 < i) {
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.MATRIX);
            imageView.setMinimumHeight((int) dimension);
            boolean z = i2 <= this.c - 1;
            imageView.setColorFilter(z ? this.h : this.g);
            imageView.setImageResource(z ? this.f : this.e);
            imageView.setClickable(true);
            imageView.setFocusable(true);
            imageView.setSelected(i2 == this.c - 1);
            int i3 = i2 + 1;
            imageView.setContentDescription(getResources().getQuantityString(R.plurals.rating_star_accessibility, i3, Integer.valueOf(i3)));
            if (i2 != i - 1) {
                LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
                generateDefaultLayoutParams.setMarginEnd((int) dimension2);
                imageView.setLayoutParams(generateDefaultLayoutParams);
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: xsna.gxe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RatingBar ratingBar = RatingBar.this;
                    int i4 = i2;
                    ratingBar.c = i4;
                    int i5 = ratingBar.b;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            break;
                        }
                        ImageView imageView2 = (ImageView) ratingBar.getChildAt(i6);
                        boolean z2 = i6 <= i4;
                        imageView2.setSelected(i6 == i4);
                        imageView2.setImageResource(z2 ? ratingBar.f : ratingBar.e);
                        imageView2.setColorFilter(z2 ? ratingBar.h : ratingBar.g);
                        i6++;
                    }
                    ratingBar.setContentDescription(ratingBar.getResources().getQuantityString(R.plurals.rating_bar_accessibility, i5, Integer.valueOf(ratingBar.getSelected()), Integer.valueOf(i5)));
                    RatingBar.a aVar = ratingBar.d;
                    if (aVar != null) {
                        int selected = ratingBar.getSelected();
                        pjq pjqVar = (pjq) aVar;
                        com.vk.inappreview.impl.fake.a aVar2 = (com.vk.inappreview.impl.fake.a) pjqVar.b;
                        Button button = (Button) pjqVar.c;
                        Button button2 = (Button) pjqVar.d;
                        aVar2.y = selected;
                        aVar2.An(false);
                        button.setText(R.string.iar_action_cancel);
                        button2.setEnabled(true);
                    }
                }
            });
            addView(imageView);
            i2 = i3;
        }
        setFocusableInTouchMode(true);
        setContentDescription(getResources().getQuantityString(R.plurals.rating_bar_accessibility, i, Integer.valueOf(getSelected()), Integer.valueOf(i)));
    }

    public final int getCount() {
        return this.b;
    }

    public final int getSelected() {
        return this.c + 1;
    }

    public final void setOnSelectListener(a aVar) {
        this.d = aVar;
    }
}
