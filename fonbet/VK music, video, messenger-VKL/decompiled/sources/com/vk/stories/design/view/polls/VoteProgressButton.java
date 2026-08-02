package com.vk.stories.design.view.polls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;

/* compiled from: VoteProgressButton.kt */
/* loaded from: classes6.dex */
public final class VoteProgressButton extends ConstraintLayout {
    public final TextView t;
    public final ProgressBar u;

    public VoteProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.vote_progress_button, this);
        this.t = (TextView) findViewById(R.id.text);
        this.u = (ProgressBar) findViewById(R.id.progress);
    }

    public final void setEnableState(boolean z) {
        TextView textView = this.t;
        if (z) {
            getBackground().setAlpha(255);
            textView.setAlpha(1.0f);
        } else {
            getBackground().setAlpha(163);
            textView.setAlpha(0.64f);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setEnableState(z);
    }

    public final void setProgressIndicatorColor(int i) {
        this.u.getIndeterminateDrawable().setTint(i);
    }

    public final void setText(String str) {
        this.t.setText(str);
    }

    public final void setTextColor(int i) {
        this.t.setTextColor(i);
    }
}
