package com.vk.auth.enterpassword;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.vkontakte.android.R;
import xsna.hnj;

/* compiled from: VkEnterPasswordProgressBarView.kt */
/* loaded from: classes15.dex */
public class VkEnterPasswordProgressBarView extends LinearLayout {
    public final TextView b;
    public final ProgressBar c;
    public int d;

    public VkEnterPasswordProgressBarView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0, 0);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.vk_auth_password_progress_bar_layout, (ViewGroup) this, true);
        setOrientation(1);
        this.b = (TextView) inflate.findViewById(R.id.text);
        this.c = (ProgressBar) inflate.findViewById(R.id.progress);
        setProgress(0);
    }

    private final void setColor(int i) {
        setTextColor(i);
        setProgressColor(i);
    }

    private final void setProgressColor(int i) {
        this.c.setProgressTintList(ColorStateList.valueOf(i));
    }

    public final void a(SpannableString spannableString, int i, int i2) {
        setText(spannableString);
        setProgress(i);
        setColor(i2);
    }

    public final void setProgress(int i) {
        ObjectAnimator.ofInt(this.c, NotificationCompat.CATEGORY_PROGRESS, this.d, i).setDuration(250L).start();
        this.d = i;
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setTextColor(int i) {
        this.b.setTextColor(i);
    }
}
