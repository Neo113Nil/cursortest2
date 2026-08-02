package com.vk.stories.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vkontakte.android.R;

/* compiled from: MentionHint.kt */
/* loaded from: classes6.dex */
public final class MentionHint extends FrameLayout {
    public MentionHint(Context context) {
        this(context, null, 0, 14, 0);
    }

    public MentionHint(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public MentionHint(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MentionHint(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MentionHint(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        View.inflate(context, R.layout.mention_hint, this);
    }
}
