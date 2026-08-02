package com.vk.core.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.Result;
import xsna.epx;
import xsna.f4m;
import xsna.iah0;
import xsna.krv0;
import xsna.s3q0;

/* compiled from: VkSnackbarContentLayout.kt */
/* loaded from: classes17.dex */
public final class VkSnackbarContentLayout extends LinearLayout {
    public static final int f = iah0.a(16);
    public static final int g = iah0.a(13);
    public static final int h = iah0.a(12);
    public static final int i = iah0.a(6);
    public static final int j = iah0.a(2);
    public static final int k = iah0.a(172);
    public final TextView b;
    public final TextView c;
    public int d;
    public Boolean e;

    public VkSnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Object failure;
        Object failure2;
        this.d = 2;
        View.inflate(context, R.layout.vk_snackbar_content, this);
        setOrientation(0);
        setGravity(16);
        TextView textView = (TextView) findViewById(R.id.tv_message);
        try {
            textView.setTextColor(krv0.m(R.attr.vk_ui_text_primary, context));
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            Log.e("VkSnackbarContentLayout", a.getMessage(), a);
        }
        this.b = textView;
        TextView textView2 = (TextView) findViewById(R.id.btn_action);
        try {
            textView2.setTextColor(krv0.m(R.attr.vk_ui_background_accent_themed, context));
            failure2 = s3q0.a;
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        Throwable a2 = Result.a(failure2);
        if (a2 != null) {
            Log.e("VkSnackbarContentLayout", a2.getMessage(), a2);
        }
        this.c = textView2;
    }

    public final void a(boolean z) {
        f4m.s(z ? h : f, this);
    }

    public final int getMaxLines() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        super.onMeasure(i2, i3);
        Boolean bool = this.e;
        if (bool == null || epx.f(bool, Boolean.FALSE)) {
            TextView textView = this.b;
            int lineCount = textView.getLayout().getLineCount();
            int i5 = this.d;
            TextView textView2 = this.c;
            ?? r1 = (lineCount > i5 || textView2.getMeasuredWidth() > k) ? 1 : 0;
            this.e = Boolean.valueOf((boolean) r1);
            setOrientation(r1);
            setGravity(r1 != 0 ? 8388611 : 8388627);
            boolean z = textView2.getVisibility() == 0;
            int i6 = f;
            if (r1 != 0) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -2;
                textView.setLayoutParams(layoutParams);
                f4m.s(-i6, textView2);
                int i7 = g;
                if (z) {
                    textView.setPaddingRelative(0, 0, 0, j);
                    i4 = i;
                } else {
                    i4 = i7;
                }
                setPaddingRelative(0, i7, i6, i4);
            } else if (!z) {
                f4m.r(i6, this);
            }
            super.onMeasure(i2, i3);
        }
    }

    public final void setMaxLines(int i2) {
        this.d = i2;
    }
}
