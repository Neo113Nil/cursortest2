package com.vk.vas.design.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.iah0;
import xsna.j5g;
import xsna.krv0;

/* compiled from: FriendsBirthdayBannerVerticalUserStack.kt */
/* loaded from: classes6.dex */
public final class FriendsBirthdayBannerVerticalUserStack extends FrameLayout {
    public final Paint b;
    public List<String> c;
    public Integer d;

    public FriendsBirthdayBannerVerticalUserStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.b = paint;
        setLayerType(2, null);
    }

    private final void setupLayout(List<? extends View> list) {
        FrameLayout.LayoutParams layoutParams;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            View view = (View) obj;
            if (list.size() == 2) {
                float f = 32;
                layoutParams = new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f));
                layoutParams.gravity = i == 0 ? 8388661 : 8388691;
            } else {
                float f2 = 28;
                layoutParams = new FrameLayout.LayoutParams(iah0.a(f2), iah0.a(f2));
                if (i == 0) {
                    layoutParams.rightMargin = iah0.a(3);
                    r6 = 8388661;
                } else if (i != 1) {
                    r6 = 8388693;
                } else {
                    layoutParams.bottomMargin = iah0.a(8);
                }
                layoutParams.gravity = r6;
            }
            addView(view, layoutParams);
            i = i2;
        }
    }

    public final VkAvatar a(String str) {
        VkAvatar vkAvatar = new VkAvatar(getContext(), null, 6, 0);
        vkAvatar.o0(str, null);
        vkAvatar.setPlaceholderImage(R.drawable.ds_internal_avatar_placeholder);
        vkAvatar.y0(iah0.b(0.5f), krv0.l(R.attr.vk_ui_image_border_alpha));
        return vkAvatar;
    }

    public final void b(Integer num, List list) {
        if (epx.f(this.c, list) && epx.f(this.d, num)) {
            return;
        }
        this.c = list;
        this.d = num;
        removeAllViews();
        ArrayList arrayList = new ArrayList();
        if (num != null) {
            Iterator it = j5g.H0(list, 2).iterator();
            while (it.hasNext()) {
                arrayList.add(a((String) it.next()));
            }
            int intValue = num.intValue();
            TextView textView = new TextView(getContext());
            textView.setGravity(17);
            textView.setSingleLine(true);
            int a = e3m.a(R.dimen.vk_ui_spacing_size_xs, textView.getContext());
            textView.setPadding(a, 0, a, 0);
            textView.setText("+" + intValue);
            float[] fArr = new float[8];
            Arrays.fill(fArr, 0, 8, Float.MAX_VALUE);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(krv0.m(R.attr.vk_ui_icon_secondary, textView.getContext()));
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
            textView.setBackground(shapeDrawable);
            textView.setTextAppearance(R.style.VkUiTypography_Caption2);
            textView.setTextColor(krv0.m(R.attr.vk_ui_text_contrast, textView.getContext()));
            arrayList.add(textView);
        } else {
            Iterator it2 = j5g.H0(list, 3).iterator();
            while (it2.hasNext()) {
                arrayList.add(a((String) it2.next()));
            }
        }
        setupLayout(arrayList);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (getChildCount() <= 1) {
            super.dispatchDraw(canvas);
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (i > 0) {
                canvas.drawCircle((childAt.getWidth() / 2.0f) + childAt.getX(), (childAt.getHeight() / 2.0f) + childAt.getY(), (childAt.getWidth() / 2.0f) + iah0.a(2), this.b);
            }
            drawChild(canvas, childAt, getDrawingTime());
        }
    }
}
