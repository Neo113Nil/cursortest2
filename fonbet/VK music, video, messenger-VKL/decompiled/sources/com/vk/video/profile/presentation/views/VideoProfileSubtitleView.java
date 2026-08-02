package com.vk.video.profile.presentation.views;

import android.content.Context;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.components.text.links.a;
import xsna.erm0;
import xsna.lfo0;
import xsna.tgw;

/* compiled from: VideoProfileSubtitleView.kt */
/* loaded from: classes6.dex */
public final class VideoProfileSubtitleView extends AppCompatTextView implements a.InterfaceC0867a {
    public static final /* synthetic */ int c = 0;
    public final lfo0 b;

    public VideoProfileSubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new lfo0(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r3 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2, boolean z3) {
        if (charSequence != null) {
            if (z3 && charSequence.length() >= spannableStringBuilder.length()) {
                int length = spannableStringBuilder.length();
                if (length < 0) {
                    throw new IllegalArgumentException(tgw.b(length, "Requested character count ", " is less than zero.").toString());
                }
                int length2 = charSequence.length() - length;
                if (length2 < 0) {
                    length2 = 0;
                }
                charSequence = erm0.C0(length2, charSequence);
            }
        }
        charSequence = "";
        lfo0 lfo0Var = this.b;
        lfo0Var.b = charSequence;
        lfo0Var.c = spannableStringBuilder;
        lfo0Var.d = z;
        lfo0Var.g = false;
        lfo0Var.h = z2;
        lfo0Var.e = 0;
        requestLayout();
    }

    @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
    public VideoProfileSubtitleView getView() {
        return this;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (!isInEditMode()) {
            lfo0 lfo0Var = this.b;
            if (lfo0Var.e != size) {
                setText(lfo0.b(lfo0Var, size, 0, 6));
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
    public final void a(RectF rectF, float f) {
    }
}
