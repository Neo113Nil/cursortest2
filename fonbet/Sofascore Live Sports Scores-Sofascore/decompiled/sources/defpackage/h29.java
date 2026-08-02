package defpackage;

import android.text.TextPaint;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h29 extends hz8 {
    public final CharSequence o;
    public final TextPaint p;

    public h29(CharSequence charSequence, TextPaint textPaint) {
        this.o = charSequence;
        this.p = textPaint;
    }

    @Override // defpackage.hz8
    public final int S(int i) {
        CharSequence charSequence = this.o;
        return this.p.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.hz8
    public final int W(int i) {
        CharSequence charSequence = this.o;
        return this.p.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
