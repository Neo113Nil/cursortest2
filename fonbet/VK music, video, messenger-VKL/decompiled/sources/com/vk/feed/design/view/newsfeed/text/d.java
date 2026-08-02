package com.vk.feed.design.view.newsfeed.text;

import android.text.TextUtils;
import android.view.View;
import com.vk.feed.design.view.newsfeed.text.a;
import kotlin.LazyThreadSafetyMode;
import xsna.drm0;
import xsna.hfo0;
import xsna.lg;
import xsna.lz2;
import xsna.msy;

/* compiled from: FileEllipsizeDelegate.kt */
/* loaded from: classes18.dex */
public final class d implements hfo0 {
    public final Object a;
    public final Object b;

    public d() {
        lz2 lz2Var = new lz2(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, lz2Var);
        this.b = msy.a(lazyThreadSafetyMode, new lg(15));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hfo0
    public final a a(BaseChipTextView baseChipTextView, int i) {
        CharSequence text = baseChipTextView.getText();
        float measureText = baseChipTextView.getPaint().measureText(text, 0, text.length());
        float size = View.MeasureSpec.getSize(i) - (baseChipTextView.getPaddingRight() + baseChipTextView.getPaddingLeft());
        if (measureText > size) {
            int length = text.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    if (text.charAt(length) == '.') {
                        break;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                }
            }
            length = -1;
            if (length == -1 || length == drm0.H(text)) {
                baseChipTextView.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                CharSequence subSequence = text.subSequence(0, length);
                CharSequence subSequence2 = text.subSequence(length + 1, text.length());
                ?? r1 = this.b;
                StringBuilder sb = (StringBuilder) r1.getValue();
                sb.setLength(0);
                sb.append((char) 8230);
                sb.append(subSequence2);
                CharSequence subSequence3 = subSequence.subSequence(0, baseChipTextView.getPaint().breakText(subSequence, 0, subSequence.length(), baseChipTextView.getLayoutDirection() == 0, size - baseChipTextView.getPaint().measureText((StringBuilder) r1.getValue(), 0, ((StringBuilder) r1.getValue()).length()), null));
                ?? r0 = this.a;
                StringBuilder sb2 = (StringBuilder) r0.getValue();
                sb2.setLength(0);
                sb2.append(subSequence3);
                sb2.append((CharSequence) r1.getValue());
                baseChipTextView.setText((StringBuilder) r0.getValue());
                baseChipTextView.setEllipsize(null);
            }
        }
        return a.C1055a.a;
    }
}
