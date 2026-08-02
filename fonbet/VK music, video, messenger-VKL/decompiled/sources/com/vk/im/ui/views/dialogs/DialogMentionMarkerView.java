package com.vk.im.ui.views.dialogs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.iah0;
import xsna.rcc;

/* compiled from: DialogMentionMarkerView.kt */
/* loaded from: classes2.dex */
public final class DialogMentionMarkerView extends AppCompatImageView {
    public DialogMentionMarkerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBackground(new rcc((Object) null));
        setImageResource(R.drawable.vk_icon_mention_outline_20);
        int a = iah0.a(4);
        setPadding(a, a, a, a);
        setMuted(false);
    }

    private final rcc getCircleBg() {
        return (rcc) getBackground();
    }

    private final int getMutedBgColor() {
        return e3m.f(R.attr.vk_legacy_counter_secondary_background, getContext());
    }

    private final ColorStateList getMutedTintList() {
        return ColorStateList.valueOf(e3m.f(R.attr.vk_legacy_counter_secondary_text, getContext()));
    }

    private final int getUnmutedBgColor() {
        return e3m.f(R.attr.vk_legacy_counter_primary_background, getContext());
    }

    private final ColorStateList getUnmutedTintList() {
        return ColorStateList.valueOf(e3m.f(R.attr.vk_legacy_counter_primary_text, getContext()));
    }

    public final void setMuted(boolean z) {
        if (z) {
            rcc circleBg = getCircleBg();
            circleBg.c = getMutedBgColor();
            circleBg.e = true;
            circleBg.invalidateSelf();
            setImageTintList(getMutedTintList());
            return;
        }
        setImageTintList(getUnmutedTintList());
        rcc circleBg2 = getCircleBg();
        circleBg2.c = getUnmutedBgColor();
        circleBg2.e = true;
        circleBg2.invalidateSelf();
    }
}
