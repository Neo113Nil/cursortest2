package s7;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: s7.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9615j {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f98322a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f98323b;

    /* renamed from: c, reason: collision with root package name */
    private final int f98324c;

    /* renamed from: d, reason: collision with root package name */
    private int f98325d;

    /* renamed from: j, reason: collision with root package name */
    private boolean f98331j;

    /* renamed from: e, reason: collision with root package name */
    private Layout.Alignment f98326e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    private int f98327f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    private float f98328g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private int f98329h = 1;

    /* renamed from: i, reason: collision with root package name */
    private boolean f98330i = true;

    /* renamed from: k, reason: collision with root package name */
    private TextUtils.TruncateAt f98332k = null;

    /* renamed from: s7.j$a */
    static class a extends Exception {
    }

    private C9615j(CharSequence charSequence, TextPaint textPaint, int i11) {
        this.f98322a = charSequence;
        this.f98323b = textPaint;
        this.f98324c = i11;
        this.f98325d = charSequence.length();
    }

    @NonNull
    public static C9615j b(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, int i11) {
        return new C9615j(charSequence, textPaint, i11);
    }

    public final StaticLayout a() throws a {
        if (this.f98322a == null) {
            this.f98322a = "";
        }
        int max = Math.max(0, this.f98324c);
        CharSequence charSequence = this.f98322a;
        int i11 = this.f98327f;
        TextPaint textPaint = this.f98323b;
        if (i11 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f98332k);
        }
        int min = Math.min(charSequence.length(), this.f98325d);
        this.f98325d = min;
        if (this.f98331j && this.f98327f == 1) {
            this.f98326e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f98326e);
        obtain.setIncludePad(this.f98330i);
        obtain.setTextDirection(this.f98331j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f98332k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f98327f);
        float f7 = this.f98328g;
        if (f7 != 1.0f) {
            obtain.setLineSpacing(0.0f, f7);
        }
        if (this.f98327f > 1) {
            obtain.setHyphenationFrequency(this.f98329h);
        }
        return obtain.build();
    }

    @NonNull
    public final void c(@NonNull Layout.Alignment alignment) {
        this.f98326e = alignment;
    }

    @NonNull
    public final void d() {
        this.f98332k = TextUtils.TruncateAt.END;
    }

    @NonNull
    public final void e() {
        this.f98329h = 1;
    }

    @NonNull
    public final void f() {
        this.f98330i = false;
    }

    public final void g(boolean z11) {
        this.f98331j = z11;
    }

    @NonNull
    public final void h() {
        this.f98328g = 1.0f;
    }

    @NonNull
    public final void i(int i11) {
        this.f98327f = i11;
    }
}
