package com.vk.im.ui.views.dialogs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.omw;

/* compiled from: DialogsGroupItemView.kt */
/* loaded from: classes2.dex */
public final class DialogsGroupItemView extends LinearLayout {
    public final DialogMentionMarkerView b;
    public final AnimatedDialogUnreadMarkerView c;

    public DialogsGroupItemView(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final void setRippleBackground(View view) {
        view.setBackgroundResource(R.drawable.vkim_ripple_dark);
    }

    public final void setCounter(int i) {
        AnimatedDialogUnreadMarkerView animatedDialogUnreadMarkerView = this.c;
        if (i <= 0) {
            bwt0.p0(animatedDialogUnreadMarkerView, false);
        } else {
            bwt0.p0(animatedDialogUnreadMarkerView, true);
            AnimatedCounterView.c(animatedDialogUnreadMarkerView, i);
        }
    }

    public DialogsGroupItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public DialogsGroupItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ DialogsGroupItemView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public DialogsGroupItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        bwt0.I(R.layout.vkim_dialogs_group_item, this, true);
        setRippleBackground(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.i, i, i2);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.icon);
        if (drawable != null) {
            bwt0.p0(appCompatImageView, true);
            omw.c(R.attr.vk_legacy_accent, drawable, appCompatImageView);
        } else {
            bwt0.p0(appCompatImageView, false);
        }
        ((TextView) findViewById(R.id.title)).setText(obtainStyledAttributes.getString(1));
        obtainStyledAttributes.recycle();
        AnimatedDialogUnreadMarkerView animatedDialogUnreadMarkerView = (AnimatedDialogUnreadMarkerView) findViewById(R.id.unread_counter);
        animatedDialogUnreadMarkerView.setMuted(true);
        this.c = animatedDialogUnreadMarkerView;
        DialogMentionMarkerView dialogMentionMarkerView = (DialogMentionMarkerView) findViewById(R.id.mention);
        dialogMentionMarkerView.setMuted(true);
        this.b = dialogMentionMarkerView;
    }
}
