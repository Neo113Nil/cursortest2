package com.sports.insider.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c1;
import androidx.core.view.h0;
import com.sports.insider.R;
import com.sports.insider.domain.entity.CustomTypefaceSpan;
import d2.i;
import d9.e;
import da.s;
import f0.l;
import gc.d;
import ic.b;
import ic.c;
import ic.g;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/sports/insider/ui/views/FrameGradientWithHead;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enable", "", "set1RubWeekCloudPayment", "(Z)V", "Lic/g;", "data", "setDetails", "(Lic/g;)V", "", "getCurrentLang", "()Ljava/lang/String;", "currentLang", "getPlaceholderActive", "placeholderActive", "getPlaceholderActiveWV", "placeholderActiveWV", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFrameGradientWithHead.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameGradientWithHead.kt\ncom/sports/insider/ui/views/FrameGradientWithHead\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,639:1\n404#2:640\n404#2:641\n27#3,7:642\n62#3,8:649\n44#3,8:657\n1#4:665\n*S KotlinDebug\n*F\n+ 1 FrameGradientWithHead.kt\ncom/sports/insider/ui/views/FrameGradientWithHead\n*L\n54#1:640\n148#1:641\n259#1:642,7\n308#1:649,8\n325#1:657,8\n*E\n"})
/* loaded from: classes.dex */
public final class FrameGradientWithHead extends FrameLayout {
    public final float A;
    public final float B;
    public final Path C;
    public final String D;
    public final TextPaint E;
    public StaticLayout F;
    public final Rect G;
    public final Path H;
    public final TextPaint I;
    public StaticLayout J;
    public int K;
    public String L;

    /* renamed from: a, reason: collision with root package name */
    public int f7469a;

    /* renamed from: b, reason: collision with root package name */
    public int f7470b;

    /* renamed from: c, reason: collision with root package name */
    public int f7471c;

    /* renamed from: d, reason: collision with root package name */
    public int f7472d;

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f7473e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f7474f;

    /* renamed from: g, reason: collision with root package name */
    public final CustomTypefaceSpan f7475g;

    /* renamed from: g0, reason: collision with root package name */
    public final Rect f7476g0;

    /* renamed from: h, reason: collision with root package name */
    public final CustomTypefaceSpan f7477h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f7478h0;

    /* renamed from: i, reason: collision with root package name */
    public final int f7479i;

    /* renamed from: i0, reason: collision with root package name */
    public final String f7480i0;
    public final int j;
    public String j0;

    /* renamed from: k, reason: collision with root package name */
    public final int f7481k;
    public String k0;

    /* renamed from: l, reason: collision with root package name */
    public final int f7482l;

    /* renamed from: l0, reason: collision with root package name */
    public String f7483l0;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f7484m;

    /* renamed from: m0, reason: collision with root package name */
    public String f7485m0;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f7486n;

    /* renamed from: n0, reason: collision with root package name */
    public String f7487n0;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f7488o;

    /* renamed from: o0, reason: collision with root package name */
    public final String f7489o0;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f7490p;

    /* renamed from: p0, reason: collision with root package name */
    public String f7491p0;
    public final Paint q;

    /* renamed from: q0, reason: collision with root package name */
    public Character f7492q0;

    /* renamed from: r, reason: collision with root package name */
    public final DisplayMetrics f7493r;

    /* renamed from: r0, reason: collision with root package name */
    public String f7494r0;

    /* renamed from: s, reason: collision with root package name */
    public final float f7495s;

    /* renamed from: s0, reason: collision with root package name */
    public String f7496s0;

    /* renamed from: t, reason: collision with root package name */
    public final float f7497t;

    /* renamed from: u, reason: collision with root package name */
    public final float f7498u;

    /* renamed from: v, reason: collision with root package name */
    public final float f7499v;

    /* renamed from: w, reason: collision with root package name */
    public final float f7500w;

    /* renamed from: x, reason: collision with root package name */
    public final int f7501x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7502y;

    /* renamed from: z, reason: collision with root package name */
    public final int f7503z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameGradientWithHead(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        char c2;
        Typeface typeface;
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7479i = Color.parseColor("#D7D7D7");
        this.j = -1;
        this.f7481k = -65536;
        this.f7482l = -16776961;
        int[] iArr = {-65536, -16776961};
        this.f7484m = iArr;
        Paint paint = new Paint(1);
        this.f7488o = paint;
        Paint paint2 = new Paint(1);
        this.f7490p = paint2;
        Paint paint3 = new Paint(1);
        this.q = paint3;
        this.C = new Path();
        String str = "";
        this.D = "";
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        Rect rect = new Rect();
        this.G = rect;
        this.H = new Path();
        TextPaint textPaint2 = new TextPaint(1);
        this.I = textPaint2;
        this.L = e.i(new StringBuilder("-"), this.K, '%');
        Rect rect2 = new Rect();
        this.f7476g0 = rect2;
        setWillNotDraw(false);
        this.f7480i0 = "Payment launch";
        this.f7489o0 = "/unknown";
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.f7493r = displayMetrics;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f8355e);
            this.j = obtainStyledAttributes.getColor(0, this.j);
            this.f7481k = obtainStyledAttributes.getColor(3, this.f7481k);
            this.f7482l = obtainStyledAttributes.getColor(1, this.f7482l);
            this.f7486n = obtainStyledAttributes.getBoolean(2, false);
            if (obtainStyledAttributes.hasValue(4)) {
                int i5 = obtainStyledAttributes.peekValue(4).type;
                if (i5 != 1) {
                    c2 = 1;
                    if (i5 == 3 && (string = obtainStyledAttributes.getString(4)) != null) {
                        str = string;
                    }
                } else {
                    c2 = 1;
                    int resourceId = obtainStyledAttributes.getResourceId(4, 0);
                    if (resourceId != 0) {
                        str = context.getString(resourceId);
                        Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                    }
                }
                this.D = str;
            } else {
                c2 = 1;
            }
            obtainStyledAttributes.recycle();
        } else {
            c2 = 1;
        }
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint.setStyle(style);
        paint.setColor(this.j);
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        paint3.setStyle(style2);
        paint3.setColor(Color.parseColor("#E93324"));
        float f6 = 20;
        DisplayMetrics displayMetrics2 = this.f7493r;
        Typeface typeface2 = null;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        this.f7495s = f6 * displayMetrics2.density;
        float f10 = 2;
        DisplayMetrics displayMetrics3 = this.f7493r;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        float f11 = f10 * displayMetrics3.density;
        this.f7497t = f11;
        this.f7498u = f11 / 2.0f;
        float f12 = 90;
        DisplayMetrics displayMetrics4 = this.f7493r;
        if (displayMetrics4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics4 = null;
        }
        this.f7499v = f12 * displayMetrics4.density;
        float f13 = 16;
        DisplayMetrics displayMetrics5 = this.f7493r;
        if (displayMetrics5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics5 = null;
        }
        this.f7502y = (int) (f13 * displayMetrics5.density);
        float f14 = 12;
        DisplayMetrics displayMetrics6 = this.f7493r;
        if (displayMetrics6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics6 = null;
        }
        this.f7501x = (int) (f14 * displayMetrics6.density);
        float f15 = 22;
        DisplayMetrics displayMetrics7 = this.f7493r;
        if (displayMetrics7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics7 = null;
        }
        this.f7503z = (int) (f15 * displayMetrics7.density);
        float f16 = 25;
        DisplayMetrics displayMetrics8 = this.f7493r;
        if (displayMetrics8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics8 = null;
        }
        this.f7500w = f16 * displayMetrics8.density;
        float f17 = this.f7497t + this.f7498u;
        float f18 = 55;
        DisplayMetrics displayMetrics9 = this.f7493r;
        if (displayMetrics9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics9 = null;
        }
        this.A = (f18 * displayMetrics9.density) + f17;
        this.B = this.f7495s - this.f7497t;
        iArr[0] = this.f7481k;
        iArr[c2] = this.f7482l;
        b(this.f7469a, this.f7470b);
        textPaint2.setLetterSpacing(0.1f);
        DisplayMetrics displayMetrics10 = this.f7493r;
        if (displayMetrics10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics10 = null;
        }
        textPaint2.setStrokeWidth(h0.l(displayMetrics10, 1.0f));
        textPaint2.setColor(-1);
        textPaint2.setStyle(style2);
        DisplayMetrics displayMetrics11 = this.f7493r;
        if (displayMetrics11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics11 = null;
        }
        textPaint2.setTextSize(h0.l(displayMetrics11, 14.0f));
        String str2 = this.L;
        textPaint2.getTextBounds(str2, 0, str2.length(), rect2);
        this.J = a(this.L, textPaint2);
        if (!this.f7486n) {
            textPaint.setLetterSpacing(0.1f);
            DisplayMetrics displayMetrics12 = this.f7493r;
            if (displayMetrics12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metrics");
                displayMetrics12 = null;
            }
            textPaint.setStrokeWidth(h0.l(displayMetrics12, 1.0f));
            textPaint.setColor(-1);
            textPaint.setStyle(style2);
            DisplayMetrics displayMetrics13 = this.f7493r;
            if (displayMetrics13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metrics");
                displayMetrics13 = null;
            }
            textPaint.setTextSize(h0.l(displayMetrics13, 25.0f));
            String str3 = this.D;
            textPaint.getTextBounds(str3, 0, str3.length(), rect);
            this.F = a(this.D, textPaint);
        }
        try {
            typeface = l.b(context, R.font.arimo_bold);
        } catch (Exception unused) {
            typeface = null;
        }
        this.f7473e = typeface;
        try {
            typeface2 = l.b(context, R.font.arimo_regular);
        } catch (Exception unused2) {
        }
        this.f7474f = typeface2;
        Typeface typeface3 = this.f7473e;
        if (typeface3 != null) {
            textPaint2.setTypeface(typeface3);
            if (!this.f7486n) {
                textPaint.setTypeface(typeface3);
            }
            this.f7475g = new CustomTypefaceSpan("arimo_bold", typeface3);
        }
        Typeface typeface4 = this.f7474f;
        if (typeface4 != null) {
            this.f7477h = new CustomTypefaceSpan("arimo_regular", typeface4);
        }
    }

    public static StaticLayout a(String str, TextPaint textPaint) {
        int measureText = (int) (textPaint.measureText("A") + textPaint.measureText(str));
        if (Build.VERSION.SDK_INT < 28) {
            return new StaticLayout(str, textPaint, measureText, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
        }
        StaticLayout build = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, measureText).setAlignment(Layout.Alignment.ALIGN_CENTER).setMaxLines(1).setText(str).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
        Intrinsics.checkNotNull(build);
        return build;
    }

    private final String getCurrentLang() {
        String str = d.f9945a;
        return i.c();
    }

    private final String getPlaceholderActive() {
        String currentLang = getCurrentLang();
        int hashCode = currentLang.hashCode();
        return hashCode != 3201 ? hashCode != 3246 ? hashCode != 3276 ? hashCode != 3588 ? hashCode != 3651 ? (hashCode == 3710 && currentLang.equals("tr")) ? "Aktif" : "Active" : !currentLang.equals("ru") ? "Active" : "Активна" : !currentLang.equals("pt") ? "Active" : "Activa" : !currentLang.equals("fr") ? "Active" : "Actif" : !currentLang.equals("es") ? "Active" : "Activa" : !currentLang.equals("de") ? "Active" : "Aktiv";
    }

    private final String getPlaceholderActiveWV() {
        String currentLang = getCurrentLang();
        int hashCode = currentLang.hashCode();
        return hashCode != 3201 ? hashCode != 3246 ? hashCode != 3276 ? hashCode != 3588 ? hashCode != 3651 ? (hashCode == 3710 && currentLang.equals("tr")) ? "Doğrulama olmadan etkin" : "Active without verification" : !currentLang.equals("ru") ? "Active without verification" : "Активна без верификации" : !currentLang.equals("pt") ? "Active without verification" : "Ativo sem verificação" : !currentLang.equals("fr") ? "Active without verification" : "Actif sans vérification" : !currentLang.equals("es") ? "Active without verification" : "Activo sin verificación" : !currentLang.equals("de") ? "Active without verification" : "Aktiv ohne Verifizierung";
    }

    public final void b(int i5, int i10) {
        if (this.f7471c == i5 && this.f7472d == i10) {
            return;
        }
        this.f7471c = i5;
        this.f7472d = i10;
        int i11 = this.f7472d;
        this.f7490p.setShader(new LinearGradient(0.0f, i11 / 2.0f, this.f7471c, i11 / 2.0f, this.f7484m, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void c(String str, String str2, boolean z5) {
        TextView textView = (TextView) getChildAt(0).findViewWithTag("firstPrice");
        if (z5 || str == null || str.length() == 0) {
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null) {
            textView.setTextSize(12.0f);
        }
        if (textView != null) {
            textView.setTextColor(this.f7479i);
        }
        String str3 = this.j0;
        if (str3 == null) {
            str3 = getResources().getString(R.string.firstPrice);
            this.j0 = str3;
            if (str3 == null) {
                str3 = "";
            }
        }
        SpannableStringBuilder append = SpannableStringBuilder.valueOf(str3).append((CharSequence) " ").append((CharSequence) str).append((CharSequence) str2);
        CustomTypefaceSpan customTypefaceSpan = this.f7477h;
        if (customTypefaceSpan != null) {
            append.setSpan(customTypefaceSpan, 0, append.length(), 18);
        }
        int length = str.length();
        if (length > 0) {
            Intrinsics.checkNotNull(append);
            int G = StringsKt.G(append, str, 0, false, 4);
            if (G > -1) {
                int i5 = length + G;
                CustomTypefaceSpan customTypefaceSpan2 = this.f7475g;
                if (customTypefaceSpan2 != null) {
                    append.setSpan(customTypefaceSpan2, G, i5, 18);
                }
                append.setSpan(new ForegroundColorSpan(-1), G, i5, 18);
                append.setSpan(new AbsoluteSizeSpan(this.f7502y), G, i5, 18);
            }
        }
        if (textView != null) {
            textView.setText(append);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Path path;
        int i5;
        FrameGradientWithHead frameGradientWithHead;
        float f6;
        boolean z5;
        float f10;
        Path path2 = this.C;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int save = canvas.save();
        try {
            float f11 = this.f7498u;
            float f12 = this.f7495s;
            canvas.drawRoundRect(0.0f, f11, this.f7469a, this.f7470b - f11, f12, f12, this.f7488o);
            canvas2 = canvas;
            try {
                path2.rewind();
                boolean z7 = this.f7486n;
                float f13 = this.f7498u;
                if (z7) {
                    path = path2;
                } else {
                    float f14 = this.f7497t;
                    float f15 = this.B;
                    float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, f15, f15, f15, f15};
                    path = path2;
                    path.addRoundRect(f14, this.A, this.f7469a - f14, (this.f7470b - f14) - f13, fArr, Path.Direction.CCW);
                }
                a.c(canvas2, path);
                path.rewind();
                float f16 = this.f7498u;
                float f17 = this.f7495s;
                path.addRoundRect(0.0f, f16, this.f7469a, this.f7470b - f16, f17, f17, Path.Direction.CCW);
                canvas2.drawPath(path, this.f7490p);
                canvas2.restoreToCount(save);
                int i10 = this.K;
                float f18 = this.A;
                if (i10 > 0) {
                    float f19 = this.f7469a;
                    float f20 = this.f7499v;
                    float f21 = this.f7500w;
                    float f22 = this.f7497t;
                    float f23 = (f18 - (f21 + f22)) - f13;
                    float f24 = f23 / ((f18 - f13) / f20);
                    Path path3 = this.H;
                    path3.moveTo(f19 - f20, f13);
                    path3.lineTo(this.f7469a, f18);
                    f10 = 2.0f;
                    path3.lineTo(this.f7469a, f23 + f13);
                    path3.lineTo(this.f7469a - f24, f13);
                    path3.close();
                    canvas2.drawPath(path3, this.q);
                    z5 = z7;
                    int i11 = this.f7469a;
                    float f25 = 2;
                    f6 = f18;
                    i5 = 2;
                    double d10 = 4;
                    save = canvas2.save();
                    canvas2.rotate((float) ((((float) Math.atan(r8)) * 180) / 3.141592653589793d), (((((i11 * 2) - f20) - f24) / f25) + i11) / 2.0f, (float) (((f22 * 1.5d) + (f18 + f23)) / d10));
                    frameGradientWithHead = this;
                    try {
                        float f26 = (((((r0 * 2) - f20) - f24) / f25) + frameGradientWithHead.f7469a) / 2.0f;
                        Rect rect = frameGradientWithHead.f7476g0;
                        canvas2.translate(f26 - ((rect.right - rect.left) / 2.0f), ((float) (((f22 * 1.5d) + (f6 + f23)) / d10)) - (Math.abs(rect.centerY()) * 2));
                        StaticLayout staticLayout = frameGradientWithHead.J;
                        if (staticLayout != null) {
                            staticLayout.draw(canvas2);
                        }
                    } finally {
                    }
                } else {
                    i5 = 2;
                    frameGradientWithHead = this;
                    f6 = f18;
                    z5 = z7;
                    f10 = 2.0f;
                }
                if (z5) {
                    return;
                }
                float width = (frameGradientWithHead.f7469a / i5) - ((frameGradientWithHead.F != null ? r2.getWidth() : 0) / r1);
                float height = (f6 / f10) - ((frameGradientWithHead.F != null ? r2.getHeight() : 0) / r1);
                save = canvas2.save();
                canvas2.translate(width, height);
                try {
                    StaticLayout staticLayout2 = frameGradientWithHead.F;
                    if (staticLayout2 != null) {
                        staticLayout2.draw(canvas2);
                    }
                } finally {
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            canvas2 = canvas;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        super.onLayout(z5, i5, i10, i11, i12);
        if (z5) {
            String str = this.L;
            int length = str.length();
            Rect rect = this.f7476g0;
            TextPaint textPaint = this.I;
            textPaint.getTextBounds(str, 0, length, rect);
            this.J = a(this.L, textPaint);
            if (this.f7486n) {
                return;
            }
            String str2 = this.D;
            TextPaint textPaint2 = this.E;
            this.F = a(str2, textPaint2);
            String str3 = this.D;
            textPaint2.getTextBounds(str3, 0, str3.length(), this.G);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        this.f7469a = getMeasuredWidth();
        this.f7470b = getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.f7470b = i10;
        this.f7469a = i5;
        b(i10, i5);
    }

    public final void set1RubWeekCloudPayment(boolean enable) {
        this.f7478h0 = enable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x031d, code lost:
    
        if (r2 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x023c, code lost:
    
        if (r3 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x023f, code lost:
    
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0263, code lost:
    
        if (r3 == null) goto L147;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setDetails(@Nullable g data) {
        SpannableStringBuilder spannableStringBuilder;
        String k6;
        CharSequence append;
        b bVar;
        String str;
        String str2;
        Character valueOf;
        String str3;
        String m6;
        int i5 = data != null ? ((c) data).f11087c : 0;
        Integer num = data != null ? ((c) data).f11088d : null;
        this.K = num != null ? num.intValue() : 0;
        String str4 = "-" + num + '%';
        this.L = str4;
        int length = str4.length();
        Rect rect = this.f7476g0;
        TextPaint textPaint = this.I;
        textPaint.getTextBounds(str4, 0, length, rect);
        this.J = a(this.L, textPaint);
        invalidate();
        if (getChildCount() > 0) {
            TextView textView = (TextView) getChildAt(0).findViewWithTag("oldPrice");
            int i10 = this.f7479i;
            if (i5 > 0) {
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if (textView != null) {
                if ((data != null ? ((c) data).f11086b : null) == null) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    c cVar = (c) data;
                    b bVar2 = cVar.f11086b;
                    String str5 = bVar2 != null ? bVar2.f11082h : null;
                    if (str5 == null || str5.length() == 0) {
                        b bVar3 = cVar.f11086b;
                        str5 = bVar3 != null ? bVar3.f11083i : null;
                    }
                    if (str5 != null) {
                        int length2 = str5.length();
                        spannableStringBuilder = SpannableStringBuilder.valueOf(str5);
                        CustomTypefaceSpan customTypefaceSpan = this.f7477h;
                        if (customTypefaceSpan != null) {
                            spannableStringBuilder.setSpan(customTypefaceSpan, 0, length2, 18);
                        }
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i10), 0, length2, 18);
                        spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, length2, 18);
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.f7501x), 0, length2, 18);
                    } else {
                        spannableStringBuilder = null;
                    }
                    textView.setText(spannableStringBuilder);
                }
            }
            TextView textView2 = (TextView) getChildAt(0).findViewWithTag("freePeriod");
            if (i5 > 0) {
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else if (textView2 != null) {
                int i11 = (data == null || (bVar = ((c) data).f11085a) == null) ? 0 : bVar.j;
                if ((data != null ? ((c) data).f11085a : null) == null || i11 <= 0) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    if (this.f7478h0) {
                        append = "7 дней за 1 ₽";
                    } else {
                        b bVar4 = ((c) data).f11085a;
                        String str6 = bVar4 != null ? bVar4.f11077c : null;
                        if (str6 == null) {
                            append = null;
                        } else {
                            if (!Intrinsics.areEqual(this.f7494r0, str6) || (k6 = this.f7496s0) == null) {
                                k6 = aa.b.k(str6, getResources());
                                this.f7494r0 = str6;
                                this.f7496s0 = k6;
                            }
                            String str7 = this.f7483l0;
                            if (str7 == null) {
                                str7 = getResources().getString(R.string.free);
                                this.f7483l0 = str7;
                            }
                            append = SpannableStringBuilder.valueOf(k6).append((CharSequence) " ").append((CharSequence) str7);
                        }
                    }
                    textView2.setText(append);
                }
            }
            TextView textView3 = (TextView) getChildAt(0).findViewWithTag("price");
            String str8 = "";
            boolean z5 = true;
            if (i5 > 0) {
                if (textView3 != null) {
                    String placeholderActive = i5 > 1 ? getPlaceholderActive() : getPlaceholderActiveWV();
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(placeholderActive);
                    CustomTypefaceSpan customTypefaceSpan2 = this.f7475g;
                    if (customTypefaceSpan2 != null) {
                        valueOf2.setSpan(customTypefaceSpan2, 0, placeholderActive.length(), 18);
                    }
                    int length3 = valueOf2.length();
                    if (length3 > 0) {
                        valueOf2.setSpan(new ForegroundColorSpan(-1), 0, length3, 18);
                        valueOf2.setSpan(new AbsoluteSizeSpan(this.f7502y), 0, length3, 18);
                    }
                    Intrinsics.checkNotNullExpressionValue(valueOf2, "apply(...)");
                    textView3.setText(valueOf2);
                }
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                c(null, "", true);
                return;
            }
            if ((data != null ? ((c) data).f11085a : null) == null) {
                if (textView3 != null) {
                    textView3.setText(this.f7480i0);
                }
                c(null, "", true);
                return;
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            c cVar2 = (c) data;
            b bVar5 = cVar2.f11085a;
            String str9 = bVar5 != null ? bVar5.f11078d : null;
            String str10 = this.f7489o0;
            if (str9 != null) {
                if (!Intrinsics.areEqual(this.f7491p0, str9) || (valueOf = this.f7492q0) == null) {
                    String upperCase = str9.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    char[] charArray = upperCase.toCharArray();
                    Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                    valueOf = (charArray.length == 3 && charArray[0] == 'P') ? Character.valueOf(charArray[2]) : null;
                    this.f7491p0 = str9;
                    this.f7492q0 = valueOf;
                }
                if (valueOf != null && valueOf.charValue() == 'W') {
                    str3 = this.f7485m0;
                    if (str3 == null) {
                        m6 = c1.m("/", getResources().getString(R.string.in_week));
                        this.f7485m0 = m6;
                    }
                    str10 = str3;
                } else if (valueOf != null && valueOf.charValue() == 'M') {
                    str3 = this.f7487n0;
                    if (str3 == null) {
                        m6 = c1.m("/", getResources().getString(R.string.in_month));
                        this.f7487n0 = m6;
                    }
                    str10 = str3;
                }
            }
            b bVar6 = cVar2.f11085a;
            if (bVar6 == null || (str = bVar6.f11082h) == null) {
                str = bVar6 != null ? bVar6.f11080f : null;
            }
            if (str != null && str.length() != 0) {
                z5 = false;
            }
            if (bVar6 == null || (str2 = bVar6.f11083i) == null) {
                String str11 = bVar6 != null ? bVar6.f11079e : null;
                str2 = str11 == null ? "" : str11;
            }
            if ((bVar6 != null ? bVar6.j : 0) <= 0 && z5) {
                if (textView3 != null) {
                    SpannableStringBuilder append2 = SpannableStringBuilder.valueOf(str2).append((CharSequence) str10);
                    int length4 = str2.length();
                    if (length4 > 0) {
                        CustomTypefaceSpan customTypefaceSpan3 = this.f7475g;
                        if (customTypefaceSpan3 != null) {
                            append2.setSpan(customTypefaceSpan3, 0, length4, 18);
                        }
                        append2.setSpan(new AbsoluteSizeSpan(this.f7503z), 0, length4, 18);
                        append2.setSpan(new ForegroundColorSpan(-1), 0, length4, 18);
                    }
                    int length5 = str10.length();
                    if (length5 > 0) {
                        if (length4 <= 0) {
                            length4 = 0;
                        }
                        Intrinsics.checkNotNull(append2);
                        int G = StringsKt.G(append2, str10, length4, false, 4);
                        if (G > -1) {
                            int i12 = length5 + G;
                            CustomTypefaceSpan customTypefaceSpan4 = this.f7477h;
                            if (customTypefaceSpan4 != null) {
                                append2.setSpan(customTypefaceSpan4, G, i12, 18);
                            }
                            append2.setSpan(new AbsoluteSizeSpan(this.f7502y), G, i12, 18);
                            append2.setSpan(new ForegroundColorSpan(i10), G, i12, 18);
                        }
                    }
                    Intrinsics.checkNotNullExpressionValue(append2, "apply(...)");
                    textView3.setText(append2);
                    return;
                }
                return;
            }
            c(str, str10, false);
            if (textView3 != null) {
                textView3.setTextSize(12.0f);
            }
            if (textView3 != null) {
                textView3.setTextColor(i10);
            }
            if (textView3 != null) {
                String str12 = this.k0;
                if (str12 == null) {
                    str12 = getResources().getString(R.string.nextPrice);
                    this.k0 = str12;
                }
                str8 = str12;
                SpannableStringBuilder append3 = SpannableStringBuilder.valueOf(str8).append((CharSequence) " ").append((CharSequence) str2).append((CharSequence) str10);
                CustomTypefaceSpan customTypefaceSpan5 = this.f7477h;
                if (customTypefaceSpan5 != null) {
                    append3.setSpan(customTypefaceSpan5, 0, append3.length(), 18);
                }
                int length6 = str2.length();
                if (length6 > 0) {
                    Intrinsics.checkNotNull(append3);
                    int G2 = StringsKt.G(append3, str2, 0, false, 4);
                    if (G2 > -1) {
                        int i13 = length6 + G2;
                        CustomTypefaceSpan customTypefaceSpan6 = this.f7475g;
                        if (customTypefaceSpan6 != null) {
                            append3.setSpan(customTypefaceSpan6, G2, i13, 18);
                        }
                        append3.setSpan(new ForegroundColorSpan(-1), G2, i13, 18);
                        append3.setSpan(new AbsoluteSizeSpan(this.f7502y), G2, i13, 18);
                    }
                }
                Intrinsics.checkNotNullExpressionValue(append3, "apply(...)");
                textView3.setText(append3);
            }
        }
    }
}
