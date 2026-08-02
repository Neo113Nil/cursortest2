package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import d1.C3985a;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: A, reason: collision with root package name */
    public int f22465A;

    /* renamed from: B, reason: collision with root package name */
    public int f22466B;

    /* renamed from: C, reason: collision with root package name */
    public int f22467C;

    /* renamed from: D, reason: collision with root package name */
    public int f22468D;

    /* renamed from: E, reason: collision with root package name */
    public StaticLayout f22469E;

    /* renamed from: F, reason: collision with root package name */
    public StaticLayout f22470F;

    /* renamed from: G, reason: collision with root package name */
    public int f22471G;

    /* renamed from: H, reason: collision with root package name */
    public int f22472H;

    /* renamed from: I, reason: collision with root package name */
    public int f22473I;

    /* renamed from: J, reason: collision with root package name */
    public Rect f22474J;

    /* renamed from: a, reason: collision with root package name */
    public final float f22475a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22476b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22477c;

    /* renamed from: d, reason: collision with root package name */
    public final float f22478d;

    /* renamed from: e, reason: collision with root package name */
    public final float f22479e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f22480f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f22481g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f22482h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f22483i;

    /* renamed from: j, reason: collision with root package name */
    public Layout.Alignment f22484j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f22485k;

    /* renamed from: l, reason: collision with root package name */
    public float f22486l;

    /* renamed from: m, reason: collision with root package name */
    public int f22487m;

    /* renamed from: n, reason: collision with root package name */
    public int f22488n;

    /* renamed from: o, reason: collision with root package name */
    public float f22489o;

    /* renamed from: p, reason: collision with root package name */
    public int f22490p;

    /* renamed from: q, reason: collision with root package name */
    public float f22491q;

    /* renamed from: r, reason: collision with root package name */
    public float f22492r;

    /* renamed from: s, reason: collision with root package name */
    public int f22493s;

    /* renamed from: t, reason: collision with root package name */
    public int f22494t;

    /* renamed from: u, reason: collision with root package name */
    public int f22495u;

    /* renamed from: v, reason: collision with root package name */
    public int f22496v;

    /* renamed from: w, reason: collision with root package name */
    public int f22497w;

    /* renamed from: x, reason: collision with root package name */
    public float f22498x;

    /* renamed from: y, reason: collision with root package name */
    public float f22499y;

    /* renamed from: z, reason: collision with root package name */
    public float f22500z;

    public h0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f22479e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f22478d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f22475a = round;
        this.f22476b = round;
        this.f22477c = round;
        TextPaint textPaint = new TextPaint();
        this.f22480f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f22481g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f22482h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    public void b(C3985a c3985a, C2233b c2233b, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = c3985a.f44860d == null;
        if (!z10) {
            i14 = -16777216;
        } else if (TextUtils.isEmpty(c3985a.f44857a)) {
            return;
        } else {
            i14 = c3985a.f44868l ? c3985a.f44869m : c2233b.f22356c;
        }
        if (a(this.f22483i, c3985a.f44857a) && Objects.equals(this.f22484j, c3985a.f44858b) && this.f22485k == c3985a.f44860d && this.f22486l == c3985a.f44861e && this.f22487m == c3985a.f44862f && Integer.valueOf(this.f22488n).equals(Integer.valueOf(c3985a.f44863g)) && this.f22489o == c3985a.f44864h && Integer.valueOf(this.f22490p).equals(Integer.valueOf(c3985a.f44865i)) && this.f22491q == c3985a.f44866j && this.f22492r == c3985a.f44867k && this.f22493s == c2233b.f22354a && this.f22494t == c2233b.f22355b && this.f22495u == i14 && this.f22497w == c2233b.f22357d && this.f22496v == c2233b.f22358e && Objects.equals(this.f22480f.getTypeface(), c2233b.f22359f) && this.f22498x == f10 && this.f22499y == f11 && this.f22500z == f12 && this.f22465A == i10 && this.f22466B == i11 && this.f22467C == i12 && this.f22468D == i13) {
            d(canvas, z10);
            return;
        }
        this.f22483i = c3985a.f44857a;
        this.f22484j = c3985a.f44858b;
        this.f22485k = c3985a.f44860d;
        this.f22486l = c3985a.f44861e;
        this.f22487m = c3985a.f44862f;
        this.f22488n = c3985a.f44863g;
        this.f22489o = c3985a.f44864h;
        this.f22490p = c3985a.f44865i;
        this.f22491q = c3985a.f44866j;
        this.f22492r = c3985a.f44867k;
        this.f22493s = c2233b.f22354a;
        this.f22494t = c2233b.f22355b;
        this.f22495u = i14;
        this.f22497w = c2233b.f22357d;
        this.f22496v = c2233b.f22358e;
        this.f22480f.setTypeface(c2233b.f22359f);
        this.f22498x = f10;
        this.f22499y = f11;
        this.f22500z = f12;
        this.f22465A = i10;
        this.f22466B = i11;
        this.f22467C = i12;
        this.f22468D = i13;
        if (z10) {
            AbstractC4134a.e(this.f22483i);
            g();
        } else {
            AbstractC4134a.e(this.f22485k);
            f();
        }
        d(canvas, z10);
    }

    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.f22485k, (Rect) null, this.f22474J, this.f22482h);
    }

    public final void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        AbstractC4134a.e(this.f22474J);
        AbstractC4134a.e(this.f22485k);
        c(canvas);
    }

    public final void e(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.f22469E;
        StaticLayout staticLayout2 = this.f22470F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.f22471G, this.f22472H);
        if (Color.alpha(this.f22495u) > 0) {
            this.f22481g.setColor(this.f22495u);
            canvas2 = canvas;
            canvas2.drawRect(-this.f22473I, 0.0f, staticLayout.getWidth() + this.f22473I, staticLayout.getHeight(), this.f22481g);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f22497w;
        if (i10 == 1) {
            this.f22480f.setStrokeJoin(Paint.Join.ROUND);
            this.f22480f.setStrokeWidth(this.f22475a);
            this.f22480f.setColor(this.f22496v);
            this.f22480f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f22480f;
            float f10 = this.f22476b;
            float f11 = this.f22477c;
            textPaint.setShadowLayer(f10, f11, f11, this.f22496v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f22496v;
            int i12 = z10 ? this.f22496v : -1;
            float f12 = this.f22476b / 2.0f;
            this.f22480f.setColor(this.f22493s);
            this.f22480f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f22480f.setShadowLayer(this.f22476b, f13, f13, i11);
            staticLayout2.draw(canvas2);
            this.f22480f.setShadowLayer(this.f22476b, f12, f12, i12);
        }
        this.f22480f.setColor(this.f22493s);
        this.f22480f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.f22480f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(save);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        float f10;
        int i10;
        float f11;
        Bitmap bitmap = this.f22485k;
        int i11 = this.f22467C;
        int i12 = this.f22465A;
        int i13 = this.f22468D;
        int i14 = this.f22466B;
        float f12 = i11 - i12;
        float f13 = i12 + (this.f22489o * f12);
        float f14 = i13 - i14;
        float f15 = i14 + (this.f22486l * f14);
        int round = Math.round(f12 * this.f22491q);
        float f16 = this.f22492r;
        int round2 = f16 != -3.4028235E38f ? Math.round(f14 * f16) : Math.round(round * (bitmap.getHeight() / bitmap.getWidth()));
        int i15 = this.f22490p;
        if (i15 != 2) {
            if (i15 == 1) {
                f10 = round / 2;
            }
            int round3 = Math.round(f13);
            i10 = this.f22488n;
            if (i10 == 2) {
                if (i10 == 1) {
                    f11 = round2 / 2;
                }
                int round4 = Math.round(f15);
                this.f22474J = new Rect(round3, round4, round + round3, round2 + round4);
            }
            f11 = round2;
            f15 -= f11;
            int round42 = Math.round(f15);
            this.f22474J = new Rect(round3, round42, round + round3, round2 + round42);
        }
        f10 = round;
        f13 -= f10;
        int round32 = Math.round(f13);
        i10 = this.f22488n;
        if (i10 == 2) {
        }
        f15 -= f11;
        int round422 = Math.round(f15);
        this.f22474J = new Rect(round32, round422, round + round32, round2 + round422);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        CharSequence charSequence = this.f22483i;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f22483i);
        int i15 = this.f22467C - this.f22465A;
        int i16 = this.f22468D - this.f22466B;
        this.f22480f.setTextSize(this.f22498x);
        int i17 = (int) ((this.f22498x * 0.125f) + 0.5f);
        int i18 = i17 * 2;
        int i19 = i15 - i18;
        float f10 = this.f22491q;
        float f11 = -3.4028235E38f;
        if (f10 != -3.4028235E38f) {
            i19 = (int) (i19 * f10);
        }
        int i20 = i19;
        String str = "SubtitlePainter";
        if (i20 <= 0) {
            AbstractC4156x.i("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.f22499y > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f22499y), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.f22497w == 1) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class);
            int length = foregroundColorSpanArr.length;
            int i21 = 0;
            while (i21 < length) {
                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i21]);
                i21++;
                f11 = f11;
            }
        }
        float f12 = f11;
        if (Color.alpha(this.f22494t) > 0) {
            int i22 = this.f22497w;
            if (i22 == 0 || i22 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f22494t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f22494t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.f22484j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f22480f, i20, alignment2, this.f22478d, this.f22479e, true);
        this.f22469E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.f22469E.getLineCount();
        int i23 = 0;
        int i24 = 0;
        while (i24 < lineCount) {
            i23 = Math.max((int) Math.ceil(this.f22469E.getLineWidth(i24)), i23);
            i24++;
            str = str;
        }
        String str2 = str;
        if (this.f22491q == f12 || i23 >= i20) {
            i20 = i23;
        }
        int i25 = i20 + i18;
        float f13 = this.f22489o;
        if (f13 != f12) {
            int round = Math.round(i15 * f13);
            int i26 = this.f22465A;
            int i27 = round + i26;
            int i28 = this.f22490p;
            if (i28 == 1) {
                i27 = ((i27 * 2) - i25) / 2;
            } else if (i28 == 2) {
                i27 -= i25;
            }
            i10 = Math.max(i27, i26);
            i11 = Math.min(i25 + i10, this.f22467C);
        } else {
            i10 = ((i15 - i25) / 2) + this.f22465A;
            i11 = i10 + i25;
        }
        int i29 = i11 - i10;
        if (i29 <= 0) {
            AbstractC4156x.i(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f14 = this.f22486l;
        if (f14 == f12) {
            i12 = (this.f22468D - height) - ((int) (i16 * this.f22500z));
        } else if (this.f22487m == 0) {
            i12 = Math.round(i16 * f14) + this.f22466B;
            int i30 = this.f22488n;
            if (i30 != 2) {
                if (i30 == 1) {
                    i12 = ((i12 * 2) - height) / 2;
                }
                i13 = i12 + height;
                i14 = this.f22468D;
                if (i13 <= i14) {
                    i12 = i14 - height;
                } else {
                    int i31 = this.f22466B;
                    if (i12 < i31) {
                        i12 = i31;
                    }
                }
            }
            i12 -= height;
            i13 = i12 + height;
            i14 = this.f22468D;
            if (i13 <= i14) {
            }
        } else {
            int lineBottom = this.f22469E.getLineBottom(0) - this.f22469E.getLineTop(0);
            float f15 = this.f22486l;
            if (f15 >= 0.0f) {
                i12 = Math.round(f15 * lineBottom) + this.f22466B;
                i13 = i12 + height;
                i14 = this.f22468D;
                if (i13 <= i14) {
                }
            } else {
                i12 = Math.round((f15 + 1.0f) * lineBottom) + this.f22468D;
                i12 -= height;
                i13 = i12 + height;
                i14 = this.f22468D;
                if (i13 <= i14) {
                }
            }
        }
        this.f22469E = new StaticLayout(spannableStringBuilder, this.f22480f, i29, alignment2, this.f22478d, this.f22479e, true);
        this.f22470F = new StaticLayout(spannableStringBuilder2, this.f22480f, i29, alignment2, this.f22478d, this.f22479e, true);
        this.f22471G = i10;
        this.f22472H = i12;
        this.f22473I = i17;
    }
}
