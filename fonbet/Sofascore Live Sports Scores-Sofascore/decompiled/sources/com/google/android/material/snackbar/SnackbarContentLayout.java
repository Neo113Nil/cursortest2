package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e80;
import defpackage.yfa;
import defpackage.yp3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements yp3 {
    public TextView a;
    public Button b;
    public Button c;
    public final TimeInterpolator d;
    public int e;

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = yfa.E(context, R.attr.motionEasingEmphasizedInterpolator, e80.b);
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    @Override // defpackage.yp3
    public final void b(int i, int i2) {
        this.a.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        long j = i2;
        ViewPropertyAnimator duration = this.a.animate().alpha(1.0f).setDuration(j);
        TimeInterpolator timeInterpolator = this.d;
        long j2 = i;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }

    @Override // defpackage.yp3
    public final void c(int i) {
        this.a.setAlpha(1.0f);
        long j = i;
        ViewPropertyAnimator duration = this.a.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j);
        TimeInterpolator timeInterpolator = this.d;
        duration.setInterpolator(timeInterpolator).setStartDelay(0L).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(0L).start();
        }
    }

    public Button getActionView() {
        return this.b;
    }

    @Nullable
    public Button getCloseView() {
        return this.c;
    }

    public TextView getMessageView() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.snackbar_text);
        this.b = (Button) findViewById(R.id.snackbar_action);
        this.c = (Button) findViewById(R.id.mtrl_snackbar_close);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.e <= 0 || this.b.getMeasuredWidth() <= this.e) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.e = i;
    }
}
