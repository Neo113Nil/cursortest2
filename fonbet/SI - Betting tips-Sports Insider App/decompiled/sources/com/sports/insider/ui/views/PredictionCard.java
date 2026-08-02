package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.sports.insider.data.repository.room.news.NewsTable;
import eg.c0;
import eg.m0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import jg.d;
import jg.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lg.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u6.h;
import yg.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\"B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0014J\u0019\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b!\u0010 ¨\u0006#"}, d2 = {"Lcom/sports/insider/ui/views/PredictionCard;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getFlagDefaultSize", "()I", "Landroid/graphics/Bitmap;", "bitmap", "", "setFlagHome", "(Landroid/graphics/Bitmap;)V", "setFlagGuest", "", "name", "setLeagueName", "(Ljava/lang/String;)V", "setFirstTeamName", "setSecondTeamName", "score", "setFirstTeamScore", "(Ljava/lang/Integer;)V", "setSecondTeamScore", NewsTable.DATE_TIME_COLUMN, "setStartDateTime", "Landroid/graphics/Typeface;", "typeface", "setArimoBoldTypeface", "(Landroid/graphics/Typeface;)V", "setArimoRegularTypeface", "u6/h", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPredictionCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictionCard.kt\ncom/sports/insider/ui/views/PredictionCard\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,1135:1\n1#2:1136\n135#3,8:1137\n135#3,8:1145\n27#3,7:1153\n27#3,7:1160\n27#3,7:1167\n27#3,7:1174\n27#3,7:1181\n27#3,7:1188\n27#3,7:1195\n27#3,7:1202\n27#3,7:1209\n*S KotlinDebug\n*F\n+ 1 PredictionCard.kt\ncom/sports/insider/ui/views/PredictionCard\n*L\n590#1:1137,8\n598#1:1145,8\n607#1:1153,7\n614#1:1160,7\n620#1:1167,7\n627#1:1174,7\n633#1:1181,7\n639#1:1188,7\n646#1:1195,7\n652#1:1202,7\n660#1:1209,7\n*E\n"})
/* loaded from: classes.dex */
public final class PredictionCard extends View {
    public final float A;
    public final d A0;
    public final float B;
    public Typeface B0;
    public final RectF C;
    public Typeface C0;
    public final RectF D;
    public final Matrix D0;
    public final RectF E;
    public final Matrix E0;
    public final RectF F;
    public Bitmap F0;
    public final RectF G;
    public Bitmap G0;
    public final RectF H;
    public boolean H0;
    public final RectF I;
    public final RectF J;
    public final RectF K;
    public final RectF L;

    /* renamed from: a, reason: collision with root package name */
    public String f7746a;

    /* renamed from: b, reason: collision with root package name */
    public String f7747b;

    /* renamed from: c, reason: collision with root package name */
    public float f7748c;

    /* renamed from: d, reason: collision with root package name */
    public float f7749d;

    /* renamed from: e, reason: collision with root package name */
    public float f7750e;

    /* renamed from: f, reason: collision with root package name */
    public float f7751f;

    /* renamed from: g, reason: collision with root package name */
    public String f7752g;

    /* renamed from: g0, reason: collision with root package name */
    public final RectF f7753g0;

    /* renamed from: h, reason: collision with root package name */
    public String f7754h;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f7755h0;

    /* renamed from: i, reason: collision with root package name */
    public String f7756i;

    /* renamed from: i0, reason: collision with root package name */
    public final RectF f7757i0;
    public String j;
    public StaticLayout j0;

    /* renamed from: k, reason: collision with root package name */
    public String f7758k;
    public StaticLayout k0;

    /* renamed from: l, reason: collision with root package name */
    public String f7759l;

    /* renamed from: l0, reason: collision with root package name */
    public StaticLayout f7760l0;

    /* renamed from: m, reason: collision with root package name */
    public final String f7761m;

    /* renamed from: m0, reason: collision with root package name */
    public StaticLayout f7762m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7763n;

    /* renamed from: n0, reason: collision with root package name */
    public StaticLayout f7764n0;

    /* renamed from: o, reason: collision with root package name */
    public final float f7765o;

    /* renamed from: o0, reason: collision with root package name */
    public StaticLayout f7766o0;

    /* renamed from: p, reason: collision with root package name */
    public final float f7767p;

    /* renamed from: p0, reason: collision with root package name */
    public StaticLayout f7768p0;
    public final float q;

    /* renamed from: q0, reason: collision with root package name */
    public final float f7769q0;

    /* renamed from: r, reason: collision with root package name */
    public final float f7770r;

    /* renamed from: r0, reason: collision with root package name */
    public final StringBuilder f7771r0;

    /* renamed from: s, reason: collision with root package name */
    public final float f7772s;

    /* renamed from: s0, reason: collision with root package name */
    public final Paint f7773s0;

    /* renamed from: t, reason: collision with root package name */
    public final float f7774t;

    /* renamed from: t0, reason: collision with root package name */
    public final TextPaint f7775t0;

    /* renamed from: u, reason: collision with root package name */
    public final float f7776u;

    /* renamed from: u0, reason: collision with root package name */
    public final TextPaint f7777u0;

    /* renamed from: v, reason: collision with root package name */
    public final float f7778v;

    /* renamed from: v0, reason: collision with root package name */
    public final TextPaint f7779v0;

    /* renamed from: w, reason: collision with root package name */
    public final float f7780w;

    /* renamed from: w0, reason: collision with root package name */
    public final TextPaint f7781w0;

    /* renamed from: x, reason: collision with root package name */
    public final float f7782x;
    public final TextPaint x0;

    /* renamed from: y, reason: collision with root package name */
    public final float f7783y;

    /* renamed from: y0, reason: collision with root package name */
    public final TextPaint f7784y0;

    /* renamed from: z, reason: collision with root package name */
    public final float f7785z;
    public final TextPaint z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictionCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7746a = "Left of time until the start";
        this.f7747b = "00:00:00";
        this.f7752g = "";
        this.f7754h = "";
        this.f7756i = "";
        this.j = "";
        this.f7758k = "N";
        this.f7759l = "N";
        this.f7761m = StringUtils.PROCESS_POSTFIX_DELIMITER;
        this.f7765o = 35.0f;
        this.f7767p = 11.0f;
        this.q = 22.0f;
        this.f7770r = 19.0f;
        this.f7774t = 30.0f;
        this.f7776u = 5.0f;
        this.f7778v = 18.0f;
        this.f7780w = 14.0f;
        this.f7782x = 15.0f;
        this.f7783y = 20.0f;
        this.f7785z = 150.0f;
        this.A = 56.0f;
        this.B = 5.0f;
        this.C = new RectF();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        this.L = new RectF();
        this.f7753g0 = new RectF();
        this.f7755h0 = new RectF();
        this.f7757i0 = new RectF();
        this.f7769q0 = 1.0f;
        StringBuilder sb2 = new StringBuilder(8);
        this.f7771r0 = sb2;
        this.f7773s0 = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f7775t0 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f7777u0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f7779v0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.f7781w0 = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.x0 = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        this.f7784y0 = textPaint6;
        TextPaint textPaint7 = new TextPaint(1);
        this.z0 = textPaint7;
        e eVar = m0.f9201a;
        this.A0 = c0.b(q.f18523a);
        Matrix matrix = new Matrix();
        this.D0 = matrix;
        Matrix matrix2 = new Matrix();
        this.E0 = matrix2;
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        f6 = f6 <= 0.0f ? 1.0f : f6;
        this.f7769q0 = f6;
        this.A *= f6;
        this.q *= f6;
        this.f7770r *= f6;
        this.f7772s *= f6;
        this.f7774t *= f6;
        this.f7776u *= f6;
        this.f7765o *= f6;
        this.B *= f6;
        this.f7767p *= f6;
        this.f7785z *= f6;
        this.f7778v *= f6;
        this.f7780w *= f6;
        this.f7782x *= f6;
        this.f7783y *= f6;
        sb2.append("00:00:00");
        textPaint.setColor(-1);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(this.f7782x);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint2.setColor(-1);
        textPaint2.setTypeface(typeface);
        textPaint2.setTextSize(this.f7778v);
        textPaint2.setTextAlign(align);
        textPaint3.setColor(-1);
        textPaint3.setTypeface(typeface);
        textPaint3.setTextSize(this.f7778v);
        textPaint4.setColor(-1);
        textPaint4.setTypeface(typeface);
        textPaint4.setTextSize(this.f7780w);
        this.f7750e = textPaint4.measureText("12.12.2025   00:00");
        Paint.FontMetrics fontMetrics = textPaint4.getFontMetrics();
        this.f7751f = Math.abs(fontMetrics.top) + fontMetrics.bottom;
        this.f7748c = textPaint3.measureText("00:00:00");
        Paint.FontMetrics fontMetrics2 = textPaint3.getFontMetrics();
        this.f7749d = Math.abs(fontMetrics2.top) + fontMetrics2.bottom;
        textPaint5.setColor(-1);
        Typeface typeface2 = Typeface.DEFAULT;
        textPaint5.setTypeface(typeface2);
        textPaint5.setTextSize(this.f7783y);
        textPaint5.setTextAlign(align);
        textPaint6.setColor(-1);
        textPaint6.setTypeface(typeface2);
        textPaint6.setTextSize(this.f7783y);
        textPaint6.setTextAlign(Paint.Align.RIGHT);
        textPaint7.setColor(-1);
        textPaint7.setTypeface(typeface2);
        textPaint7.setTextSize(this.f7783y);
        textPaint7.setTextAlign(Paint.Align.LEFT);
        matrix.setScale(1.0f, 1.0f);
        matrix2.setScale(1.0f, 1.0f);
        if (isInEditMode()) {
            this.f7754h = "UEFA Nations League. Women games";
            this.f7756i = "Sweden (Women)";
            this.j = "Denmark (Women)";
            this.f7758k = "N";
            this.f7759l = "N";
            this.f7746a = "Left of time until the start";
            this.f7747b = "00:00:00";
            this.f7752g = "12.12.2025   00:00";
        }
    }

    public static StaticLayout f(CharSequence charSequence, TextPaint textPaint, int i5) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.min(i5, (int) textPaint.measureText(charSequence.toString()))).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i5).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).setMaxLines(3).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoBoldTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.C0, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT_BOLD;
            }
            this.C0 = typeface;
            this.f7775t0.setTypeface(typeface);
            this.f7777u0.setTypeface(this.C0);
            this.f7779v0.setTypeface(this.C0);
            this.f7781w0.setTypeface(this.C0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoRegularTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.B0, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            this.B0 = typeface;
            this.x0.setTypeface(typeface);
            this.f7784y0.setTypeface(this.B0);
            this.z0.setTypeface(this.B0);
        }
    }

    public final void c() {
        this.C.setEmpty();
        this.D.setEmpty();
        this.E.setEmpty();
        this.F.setEmpty();
        this.L.setEmpty();
        this.k0 = null;
        this.f7753g0.setEmpty();
        this.j0 = null;
        this.f7755h0.setEmpty();
        this.f7757i0.setEmpty();
        this.f7752g = "";
        this.G.setEmpty();
        this.f7760l0 = null;
        this.H.setEmpty();
        this.f7762m0 = null;
        this.I.setEmpty();
        this.f7764n0 = null;
        this.J.setEmpty();
        this.f7766o0 = null;
        this.K.setEmpty();
        this.f7768p0 = null;
    }

    public final void d() {
        requestLayout();
        invalidate();
    }

    public final void e(int i5, int i10) {
        float f6;
        int i11;
        float f10;
        int i12;
        float f11;
        int i13;
        float f12;
        float f13;
        StaticLayout staticLayout;
        int i14;
        StaticLayout staticLayout2;
        int i15;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        if (i5 < this.f7785z || i10 <= this.A) {
            c();
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float f28 = paddingEnd - paddingStart;
        if (paddingBottom - paddingTop <= 0.0f || f28 <= 0.0f) {
            c();
            return;
        }
        StaticLayout staticLayout3 = this.k0;
        float width = staticLayout3 != null ? staticLayout3.getWidth() : 0;
        float f29 = (width / 2.0f) + (width < f28 ? (f28 - width) / 2.0f : 0.0f) + paddingStart;
        float height = (this.k0 != null ? r9.getHeight() : 0) + paddingTop;
        float f30 = f28 / 2.0f;
        float f31 = this.A;
        if (f30 <= f31) {
            f31 = f30;
        }
        float f32 = this.f7765o + height;
        float f33 = f32 + f31;
        float f34 = (f30 - f31) / 2.0f;
        float f35 = paddingStart + f34;
        float f36 = f35 + f31;
        float f37 = paddingEnd - (f34 + f31);
        float f38 = f31 + f37;
        int i16 = (int) (f30 - (this.B * 2.0f));
        String str = this.f7756i;
        TextPaint textPaint = this.x0;
        StaticLayout f39 = f(str, textPaint, i16);
        StaticLayout f40 = f(this.j, textPaint, i16);
        int width2 = f39 != null ? f39.getWidth() : 0;
        if (f40 != null) {
            f6 = f38;
            i11 = f40.getWidth();
        } else {
            f6 = f38;
            i11 = 0;
        }
        if (f39 != null) {
            f10 = f37;
            i12 = f39.getHeight();
        } else {
            f10 = f37;
            i12 = 0;
        }
        if (f40 != null) {
            f11 = f35;
            i13 = f40.getHeight();
        } else {
            f11 = f35;
            i13 = 0;
        }
        int i17 = i16 >= width2 ? i16 - width2 : width2 - i16;
        float f41 = width2;
        float f42 = (f41 / 2.0f) + (i17 / 2.0f);
        float f43 = ((i16 >= i11 ? i16 - i11 : i11 - i16) / 2.0f) + f30;
        float f44 = i11;
        float f45 = (f44 / 2.0f) + f43;
        if (i12 == i13) {
            f12 = 0.0f;
            f13 = 0.0f;
        } else if (i12 > i13) {
            f12 = (i12 - i13) / 2.0f;
            f13 = 0.0f;
        } else {
            f13 = (i13 - i12) / 2.0f;
            f12 = 0.0f;
        }
        float f46 = this.B;
        float f47 = paddingStart + f46;
        float f48 = f47 + f42;
        float f49 = f33 + f46;
        float f50 = f49 + f13;
        float f51 = f41 + f48;
        float f52 = i12 + f50;
        float f53 = f47 + f45;
        float f54 = f49 + f12;
        float f55 = f53 + f44;
        float f56 = i13 + f54;
        float max = Math.max(f52, f56) + this.B;
        float f57 = f28 / 3.0f;
        StaticLayout staticLayout4 = this.f7764n0;
        int height2 = staticLayout4 != null ? staticLayout4.getHeight() : 0;
        StaticLayout staticLayout5 = this.f7764n0;
        float width3 = staticLayout5 != null ? staticLayout5.getWidth() : 0;
        float f58 = width3 / 2.0f;
        float f59 = (f30 - f58) + f58;
        float f60 = this.B;
        float f61 = max + f60;
        float f62 = f59 + width3;
        float f63 = height2;
        float f64 = f61 + f63;
        int i18 = (int) (f57 - (f60 * 2.0f));
        StaticLayout f65 = f(this.f7758k, this.f7784y0, i18);
        int height3 = f65 != null ? f65.getHeight() : 0;
        float f66 = (paddingStart + f57) - this.B;
        if (f65 != null) {
            staticLayout = f39;
            i14 = f65.getWidth();
        } else {
            staticLayout = f39;
            i14 = 0;
        }
        float f67 = f66 - i14;
        float f68 = max + this.B;
        float f69 = height3;
        float f70 = f68 + f69;
        StaticLayout f71 = f(this.f7759l, this.z0, i18);
        int height4 = f71 != null ? f71.getHeight() : 0;
        float f72 = this.B;
        float f73 = (paddingEnd - f57) + f72;
        float f74 = f73 + f72;
        if (f71 != null) {
            staticLayout2 = f71;
            i15 = f71.getWidth();
        } else {
            staticLayout2 = f71;
            i15 = 0;
        }
        float f75 = f74 + i15;
        float f76 = max + this.B;
        float f77 = height4;
        float f78 = f76 + f77;
        int max2 = Math.max((int) ((this.B * 2.0f) + Math.max(height3, height4)), height2);
        if (max2 != height2) {
            f61 = ((max2 - height2) / 2.0f) + max;
            f64 = f61 + f63;
        }
        float f79 = f61;
        float f80 = f64;
        if (max2 != height3) {
            float f81 = ((max2 - height3) / 2.0f) + max;
            f70 = f81 + f69;
            f14 = f81;
        } else {
            f14 = f68;
        }
        float f82 = f70;
        if (max2 != height4) {
            f15 = ((max2 - height4) / 2.0f) + max;
            f78 = f15 + f77;
        } else {
            f15 = f76;
        }
        float f83 = f78;
        float f84 = f15;
        float max3 = Math.max(f82, f83) + this.B + this.q;
        float f85 = (f28 - (this.f7774t * 2.0f)) - (this.f7776u * 2.0f);
        StaticLayout staticLayout6 = this.j0;
        int width4 = staticLayout6 != null ? staticLayout6.getWidth() : 0;
        StaticLayout staticLayout7 = this.j0;
        int height5 = staticLayout7 != null ? staticLayout7.getHeight() : 0;
        float f86 = max3 + this.f7770r;
        float max4 = Math.max(height5, this.f7749d) + f86;
        float f87 = this.f7749d + f86;
        RectF rectF = this.f7755h0;
        RectF rectF2 = this.f7753g0;
        if (width4 != 0) {
            if (this.f7748c != 0.0f && f85 >= Math.min(width4, (int) r7)) {
                float f88 = this.f7774t;
                float f89 = f88 * 2.0f;
                float f90 = this.f7776u;
                float f91 = 4.0f * f90;
                float f92 = width4;
                float f93 = f91 + f89 + f92;
                float f94 = this.f7748c;
                float f95 = f93 + f94;
                TextPaint textPaint2 = this.f7779v0;
                if (f28 >= f95) {
                    float f96 = f92 / 2.0f;
                    float f97 = (((((f28 - f89) - f91) - f92) - f94) / 2.0f) + paddingStart + f88 + f90 + f96;
                    float f98 = f97 + f96;
                    float f99 = (f90 * 2.0f) + f98;
                    float f100 = f99 + f94;
                    float f101 = max4 - textPaint2.getFontMetrics().bottom;
                    f17 = textPaint2.getFontMetrics().top + max4;
                    f16 = f54;
                    f20 = f99;
                    f21 = f97;
                    f25 = f79;
                    f27 = f98;
                    f24 = f56;
                    f26 = f100;
                    f18 = f53;
                    f22 = f101;
                    f23 = max4;
                } else {
                    float f102 = (f28 - f89) - (f90 * 2.0f);
                    float f103 = (f92 / 2.0f) + ((f102 - f92) / 2.0f) + paddingStart + f88 + f90;
                    float f104 = f103 + f92;
                    float f105 = ((f102 - f94) / 2.0f) + paddingStart + f88 + f90;
                    float f106 = f105 + f94;
                    float f107 = f87 + textPaint2.getFontMetrics().top;
                    float f108 = (this.f7749d + max4) - textPaint2.getFontMetrics().bottom;
                    f23 = this.f7749d + max4;
                    f17 = f107;
                    f24 = f56;
                    f26 = f106;
                    f21 = f103;
                    f25 = f79;
                    f27 = f104;
                    f18 = f53;
                    f22 = f108;
                    f16 = f54;
                    f20 = f105;
                }
                f19 = f55;
                float f109 = this.f7750e;
                float f110 = ((f28 - f109) / 2.0f) + paddingStart;
                float f111 = f23 + this.f7767p;
                this.f7757i0.set(f110, f111, f110 + f109, (this.f7751f + f111) - this.f7781w0.getFontMetrics().bottom);
                rectF2.set(f21, f86, f27, max4);
                rectF.set(f20, f17, f26, f22);
                this.G.set(f48, f50, f51, f52);
                this.H.set(f18, f16, f19, f24);
                this.I.set(f59, f25, f62, f80);
                this.J.set(f67, f14, f66, f82);
                this.K.set(f73, f84, f75, f83);
                this.f7763n = (f65 != null || staticLayout2 == null || this.f7758k.length() == 0 || this.f7759l.length() == 0 || StringsKt.H(this.f7758k) || StringsKt.H(this.f7759l) || Intrinsics.areEqual(this.f7758k, "N") || Intrinsics.areEqual(this.f7759l, "N")) ? false : true;
                this.f7760l0 = staticLayout;
                this.f7762m0 = f40;
                this.f7766o0 = f65;
                this.f7768p0 = staticLayout2;
                this.L.set(f29, paddingTop, paddingEnd, height);
                this.D.set(paddingStart, f32, paddingEnd, f33);
                this.E.set(f11, f32, f36, f33);
                this.F.set(f10, f32, f6, f33);
                this.C.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
                invalidate();
            }
        }
        rectF2.setEmpty();
        rectF.setEmpty();
        f16 = f54;
        f17 = f86;
        f18 = f53;
        f19 = f55;
        f20 = 0.0f;
        f21 = 0.0f;
        f22 = f87;
        f23 = f22;
        f24 = f56;
        f25 = f79;
        f26 = 0.0f;
        f27 = 0.0f;
        float f1092 = this.f7750e;
        float f1102 = ((f28 - f1092) / 2.0f) + paddingStart;
        float f1112 = f23 + this.f7767p;
        this.f7757i0.set(f1102, f1112, f1102 + f1092, (this.f7751f + f1112) - this.f7781w0.getFontMetrics().bottom);
        rectF2.set(f21, f86, f27, max4);
        rectF.set(f20, f17, f26, f22);
        this.G.set(f48, f50, f51, f52);
        this.H.set(f18, f16, f19, f24);
        this.I.set(f59, f25, f62, f80);
        this.J.set(f67, f14, f66, f82);
        this.K.set(f73, f84, f75, f83);
        this.f7763n = (f65 != null || staticLayout2 == null || this.f7758k.length() == 0 || this.f7759l.length() == 0 || StringsKt.H(this.f7758k) || StringsKt.H(this.f7759l) || Intrinsics.areEqual(this.f7758k, "N") || Intrinsics.areEqual(this.f7759l, "N")) ? false : true;
        this.f7760l0 = staticLayout;
        this.f7762m0 = f40;
        this.f7766o0 = f65;
        this.f7768p0 = staticLayout2;
        this.L.set(f29, paddingTop, paddingEnd, height);
        this.D.set(paddingStart, f32, paddingEnd, f33);
        this.E.set(f11, f32, f36, f33);
        this.F.set(f10, f32, f6, f33);
        this.C.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
        invalidate();
    }

    public final void g(long j) {
        if (j <= 0) {
            this.f7747b = "00:00:00";
            return;
        }
        long j6 = 86400;
        int i5 = (int) (j / j6);
        long j10 = 3600;
        int i10 = (int) ((j % j6) / j10);
        if (i5 > 0) {
            i10 += i5 * 24;
        }
        if (i10 > 99) {
            this.f7747b = "99:59:59";
            return;
        }
        long j11 = j % j10;
        long j12 = 60;
        int i11 = (int) (j11 / j12);
        int i12 = (int) (j % j12);
        char n9 = h.n(i10);
        StringBuilder sb2 = this.f7771r0;
        sb2.setCharAt(0, n9);
        sb2.setCharAt(1, h.o(i10));
        sb2.setCharAt(3, h.n(i11));
        sb2.setCharAt(4, h.o(i11));
        sb2.setCharAt(6, h.n(i12));
        sb2.setCharAt(7, h.o(i12));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        this.f7747b = sb3;
    }

    public final int getFlagDefaultSize() {
        return (int) this.A;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        e(getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
        if (this.H0) {
            c0.h(this.A0.f18494a);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        Bitmap bitmap;
        Bitmap bitmap2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.E;
        boolean isEmpty = rectF.isEmpty();
        Paint paint = this.f7773s0;
        if (!isEmpty && (bitmap2 = this.F0) != null) {
            save = canvas.save();
            canvas.clipRect(rectF);
            try {
                canvas.translate(rectF.left, rectF.top);
                if (!bitmap2.isRecycled()) {
                    canvas.drawBitmap(bitmap2, this.D0, paint);
                }
                canvas.restoreToCount(save);
            } finally {
            }
        }
        RectF rectF2 = this.F;
        if (!rectF2.isEmpty() && (bitmap = this.G0) != null) {
            save = canvas.save();
            canvas.clipRect(rectF2);
            try {
                canvas.translate(rectF2.left, rectF2.top);
                if (!bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, this.E0, paint);
                }
                canvas.restoreToCount(save);
            } finally {
            }
        }
        RectF rectF3 = this.L;
        if (!rectF3.isEmpty()) {
            save = canvas.save();
            try {
                canvas.translate(rectF3.left, rectF3.top);
                StaticLayout staticLayout = this.k0;
                if (staticLayout != null) {
                    staticLayout.draw(canvas);
                }
                canvas.restoreToCount(save);
            } finally {
            }
        }
        RectF rectF4 = this.G;
        if (!rectF4.isEmpty()) {
            save = canvas.save();
            try {
                canvas.translate(rectF4.left, rectF4.top);
                StaticLayout staticLayout2 = this.f7760l0;
                if (staticLayout2 != null) {
                    staticLayout2.draw(canvas);
                }
                canvas.restoreToCount(save);
            } finally {
            }
        }
        RectF rectF5 = this.H;
        if (!rectF5.isEmpty()) {
            save = canvas.save();
            try {
                canvas.translate(rectF5.left, rectF5.top);
                StaticLayout staticLayout3 = this.f7762m0;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
                canvas.restoreToCount(save);
            } finally {
            }
        }
        if (this.f7763n) {
            RectF rectF6 = this.J;
            if (!rectF6.isEmpty()) {
                save = canvas.save();
                try {
                    canvas.translate(rectF6.right, rectF6.top);
                    StaticLayout staticLayout4 = this.f7766o0;
                    if (staticLayout4 != null) {
                        staticLayout4.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                } finally {
                }
            }
            RectF rectF7 = this.I;
            if (!rectF7.isEmpty()) {
                save = canvas.save();
                try {
                    canvas.translate(rectF7.left, rectF7.top);
                    StaticLayout staticLayout5 = this.f7764n0;
                    if (staticLayout5 != null) {
                        staticLayout5.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                } finally {
                }
            }
            RectF rectF8 = this.K;
            if (!rectF8.isEmpty()) {
                save = canvas.save();
                try {
                    canvas.translate(rectF8.left, rectF8.top);
                    StaticLayout staticLayout6 = this.f7768p0;
                    if (staticLayout6 != null) {
                        staticLayout6.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                } finally {
                }
            }
        }
        RectF rectF9 = this.f7753g0;
        if (!rectF9.isEmpty() && !Intrinsics.areEqual(this.f7747b, "00:00:00") && !Intrinsics.areEqual(this.f7747b, "99:59:59")) {
            save = canvas.save();
            try {
                canvas.translate(rectF9.left, rectF9.top);
                StaticLayout staticLayout7 = this.j0;
                if (staticLayout7 != null) {
                    staticLayout7.draw(canvas);
                }
                canvas.restoreToCount(save);
            } finally {
            }
        }
        RectF rectF10 = this.f7755h0;
        if (!rectF10.isEmpty() && !Intrinsics.areEqual(this.f7747b, "00:00:00") && !Intrinsics.areEqual(this.f7747b, "99:59:59")) {
            save = canvas.save();
            try {
                canvas.drawText(this.f7747b, rectF10.left, rectF10.bottom, this.f7779v0);
            } finally {
            }
        }
        RectF rectF11 = this.f7757i0;
        if (rectF11.isEmpty()) {
            return;
        }
        save = canvas.save();
        try {
            canvas.drawText(this.f7752g, rectF11.left, rectF11.bottom, this.f7781w0);
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        int i11;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingEnd = getPaddingEnd() + getPaddingStart() + ((int) this.f7785z);
        float f6 = 2;
        float f10 = this.A;
        float f11 = f10 * f6;
        int paddingEnd2 = ((mode == Integer.MIN_VALUE || mode == 1073741824) ? (int) ((size / 2.0f) - (this.B * 2.0f)) : (int) (1.0737418E9f - (this.B * 2.0f))) - (getPaddingEnd() + getPaddingStart());
        String str = this.f7756i;
        TextPaint textPaint = this.x0;
        StaticLayout f12 = f(str, textPaint, paddingEnd2);
        StaticLayout f13 = f(this.j, textPaint, paddingEnd2);
        int paddingEnd3 = getPaddingEnd() + getPaddingStart() + Math.max(paddingEnd, (int) Math.max(f11, (this.B * 4.0f) + (f12 != null ? f12.getWidth() : 0) + (f13 != null ? f13.getWidth() : 0)));
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(paddingEnd3, size);
        } else if (mode != 1073741824) {
            size = paddingEnd3;
        }
        float max = Math.max(f12 != null ? f12.getHeight() : 0, f13 != null ? f13.getHeight() : 0);
        float f14 = this.B;
        float f15 = (f14 * 2.0f) + max;
        float f16 = size;
        float f17 = f16 / 3.0f;
        int i12 = (int) f17;
        int i13 = (int) (f17 - (f14 * f6));
        StaticLayout f18 = f(this.f7758k, this.f7784y0, i13);
        int height = f18 != null ? f18.getHeight() : 0;
        float max2 = (this.B * 2.0f) + Math.max(height, f(this.f7759l, this.z0, i13) != null ? r5.getHeight() : 0);
        StaticLayout f19 = f(this.f7761m, textPaint, i12);
        this.f7764n0 = f19;
        float max3 = Math.max(max2, (this.B * 2.0f) + (f19 != null ? f19.getHeight() : 0)) + this.q;
        StaticLayout f20 = f(this.f7754h, this.f7775t0, size);
        if (f20 != null) {
            this.k0 = f20;
            i11 = f20.getHeight();
        } else {
            i11 = 0;
        }
        TextPaint textPaint2 = this.f7781w0;
        this.f7750e = textPaint2.measureText("12.12.2025   00:00");
        Paint.FontMetrics fontMetrics = textPaint2.getFontMetrics();
        this.f7751f = Math.abs(fontMetrics.top) + fontMetrics.bottom;
        StaticLayout f21 = f(this.f7746a, this.f7777u0, (int) ((size - (getPaddingEnd() + getPaddingStart())) - ((this.f7776u * 2.0f) + (this.f7774t * 2.0f))));
        this.j0 = f21;
        int height2 = f21 != null ? f21.getHeight() : 0;
        StaticLayout staticLayout = this.j0;
        int width = staticLayout != null ? staticLayout.getWidth() : 0;
        TextPaint textPaint3 = this.f7779v0;
        this.f7748c = textPaint3.measureText("00:00:00");
        Paint.FontMetrics fontMetrics2 = textPaint3.getFontMetrics();
        this.f7749d = Math.abs(fontMetrics2.top) + fontMetrics2.bottom;
        int paddingTop = (int) (getPaddingTop() + i11 + this.f7765o + f10 + f15 + max3 + this.f7770r + this.f7772s + height2 + ((f16 > ((((this.f7776u * 4.0f) + ((this.f7774t * 2.0f) + ((float) (getPaddingEnd() + getPaddingStart())))) + ((float) width)) + this.f7748c) ? 1 : (f16 == ((((this.f7776u * 4.0f) + ((this.f7774t * 2.0f) + ((float) (getPaddingEnd() + getPaddingStart())))) + ((float) width)) + this.f7748c) ? 0 : -1)) >= 0 ? 0.0f : this.f7749d) + this.f7767p + this.f7751f + getPaddingBottom());
        if (mode2 != 1073741824) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
        e(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        if (i11 == i5 && i12 == i10) {
            invalidate();
        } else {
            e(i5, i10);
        }
    }

    public final void setFirstTeamName(@Nullable String name) {
        String str = "";
        if (name != null) {
            if (Intrinsics.areEqual(name, "null")) {
                name = "";
            }
            str = name;
        }
        this.f7756i = str;
        d();
    }

    public final void setFirstTeamScore(@Nullable Integer score) {
        String str;
        if (score == null || (str = String.valueOf(score.intValue())) == null) {
            str = "N";
        }
        this.f7758k = str;
        d();
    }

    public final void setFlagGuest(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            this.G0 = null;
        }
        float width = bitmap != null ? bitmap.getWidth() : 0.0f;
        float height = bitmap != null ? bitmap.getHeight() : 0.0f;
        if (bitmap != null && width > 10.0f && height > 10.0f) {
            RectF rectF = this.F;
            float f6 = rectF.right - rectF.left;
            float f10 = this.A;
            if (f6 > f10) {
                f6 = f10;
            }
            float min = Math.min(f6 / width, f6 / height);
            float f11 = 2;
            float f12 = (f6 - (width * min)) / f11;
            float f13 = (f6 - (height * min)) / f11;
            Matrix matrix = this.E0;
            matrix.setScale(min, min);
            matrix.postTranslate(f12, f13);
            if (!bitmap.isRecycled()) {
                this.G0 = bitmap;
            }
        }
        invalidate();
    }

    public final void setFlagHome(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            this.F0 = null;
        }
        float width = bitmap != null ? bitmap.getWidth() : 0.0f;
        float height = bitmap != null ? bitmap.getHeight() : 0.0f;
        if (bitmap != null && width > 10.0f && height > 10.0f) {
            RectF rectF = this.E;
            float f6 = rectF.right - rectF.left;
            float f10 = this.A;
            if (f6 > f10) {
                f6 = f10;
            }
            float min = Math.min(f6 / width, f6 / height);
            float f11 = 2;
            float f12 = (f6 - (width * min)) / f11;
            float f13 = (f6 - (height * min)) / f11;
            Matrix matrix = this.D0;
            matrix.setScale(min, min);
            matrix.postTranslate(f12, f13);
            if (!bitmap.isRecycled()) {
                this.F0 = bitmap;
            }
        }
        invalidate();
    }

    public final void setLeagueName(@Nullable String name) {
        String str = "";
        if (name != null) {
            if (Intrinsics.areEqual(name, "null")) {
                name = "";
            }
            str = name;
        }
        this.f7754h = str;
        d();
    }

    public final void setSecondTeamName(@Nullable String name) {
        String str = "";
        if (name != null) {
            if (Intrinsics.areEqual(name, "null")) {
                name = "";
            }
            str = name;
        }
        this.j = str;
        d();
    }

    public final void setSecondTeamScore(@Nullable Integer score) {
        String str;
        if (score == null || (str = String.valueOf(score.intValue())) == null) {
            str = "N";
        }
        this.f7759l = str;
        d();
    }

    public final void setStartDateTime(@NotNull String dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        this.f7752g = dateTime;
        invalidate();
    }

    public final void setFirstTeamScore(@Nullable String score) {
        String str = "N";
        if (score != null) {
            if (score.length() == 0 || Intrinsics.areEqual(score, "null")) {
                score = "N";
            }
            str = score;
        }
        this.f7758k = str;
        d();
    }

    public final void setSecondTeamScore(@Nullable String score) {
        String str = "N";
        if (score != null) {
            if (score.length() == 0 || Intrinsics.areEqual(score, "null")) {
                score = "N";
            }
            str = score;
        }
        this.f7759l = str;
        d();
    }
}
