package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.c;

/* compiled from: DefaultGlyphChecker.java */
/* loaded from: classes12.dex */
public final class b implements c.e {
    public static final ThreadLocal<StringBuilder> b = new ThreadLocal<>();
    public final TextPaint a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
