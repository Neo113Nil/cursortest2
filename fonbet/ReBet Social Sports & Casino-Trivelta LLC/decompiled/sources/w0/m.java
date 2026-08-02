package w0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import x0.AbstractC6773b;

/* loaded from: classes.dex */
public abstract class m implements Spannable {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f67235a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f67236b;

        /* renamed from: c, reason: collision with root package name */
        public final int f67237c;

        /* renamed from: d, reason: collision with root package name */
        public final int f67238d;

        /* renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f67239e;

        /* renamed from: w0.m$a$a, reason: collision with other inner class name */
        public static class C0948a {

            /* renamed from: a, reason: collision with root package name */
            public final TextPaint f67240a;

            /* renamed from: c, reason: collision with root package name */
            public int f67242c = 1;

            /* renamed from: d, reason: collision with root package name */
            public int f67243d = 1;

            /* renamed from: b, reason: collision with root package name */
            public TextDirectionHeuristic f67241b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0948a(TextPaint textPaint) {
                this.f67240a = textPaint;
            }

            public a a() {
                return new a(this.f67240a, this.f67241b, this.f67242c, this.f67243d);
            }

            public C0948a b(int i10) {
                this.f67242c = i10;
                return this;
            }

            public C0948a c(int i10) {
                this.f67243d = i10;
                return this;
            }

            public C0948a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f67241b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = l.a(textPaint).setBreakStrategy(i10);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i11);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f67239e = build;
            } else {
                this.f67239e = null;
            }
            this.f67235a = textPaint;
            this.f67236b = textDirectionHeuristic;
            this.f67237c = i10;
            this.f67238d = i11;
        }

        public boolean a(a aVar) {
            if (this.f67237c == aVar.b() && this.f67238d == aVar.c() && this.f67235a.getTextSize() == aVar.e().getTextSize() && this.f67235a.getTextScaleX() == aVar.e().getTextScaleX() && this.f67235a.getTextSkewX() == aVar.e().getTextSkewX() && this.f67235a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f67235a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f67235a.getFlags() == aVar.e().getFlags() && this.f67235a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f67235a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f67235a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f67237c;
        }

        public int c() {
            return this.f67238d;
        }

        public TextDirectionHeuristic d() {
            return this.f67236b;
        }

        public TextPaint e() {
            return this.f67235a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f67236b == aVar.d();
        }

        public int hashCode() {
            return AbstractC6773b.b(Float.valueOf(this.f67235a.getTextSize()), Float.valueOf(this.f67235a.getTextScaleX()), Float.valueOf(this.f67235a.getTextSkewX()), Float.valueOf(this.f67235a.getLetterSpacing()), Integer.valueOf(this.f67235a.getFlags()), this.f67235a.getTextLocales(), this.f67235a.getTypeface(), Boolean.valueOf(this.f67235a.isElegantTextHeight()), this.f67236b, Integer.valueOf(this.f67237c), Integer.valueOf(this.f67238d));
        }

        public String toString() {
            String fontVariationSettings;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f67235a.getTextSize());
            sb2.append(", textScaleX=" + this.f67235a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f67235a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f67235a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f67235a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f67235a.getTextLocales());
            sb2.append(", typeface=" + this.f67235a.getTypeface());
            if (i10 >= 26) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", variationSettings=");
                fontVariationSettings = this.f67235a.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb2.append(sb3.toString());
            }
            sb2.append(", textDir=" + this.f67236b);
            sb2.append(", breakStrategy=" + this.f67237c);
            sb2.append(", hyphenationFrequency=" + this.f67238d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f67235a = textPaint;
            textDirection = params.getTextDirection();
            this.f67236b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f67237c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f67238d = hyphenationFrequency;
            this.f67239e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
