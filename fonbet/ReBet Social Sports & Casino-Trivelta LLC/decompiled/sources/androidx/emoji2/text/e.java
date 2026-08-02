package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;

/* loaded from: classes.dex */
public class e implements f.e {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f19723b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f19724a;

    public e() {
        TextPaint textPaint = new TextPaint();
        this.f19724a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal threadLocal = f19723b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.f.e
    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder b10 = b();
        b10.setLength(0);
        while (i10 < i11) {
            b10.append(charSequence.charAt(i10));
            i10++;
        }
        return androidx.core.graphics.f.a(this.f19724a, b10.toString());
    }
}
