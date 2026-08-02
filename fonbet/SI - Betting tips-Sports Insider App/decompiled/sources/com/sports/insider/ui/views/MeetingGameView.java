package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import eg.c0;
import eg.m0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jg.d;
import jg.q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lg.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.b;
import ve.b0;
import yg.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0015\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\u00020\n2\"\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\n2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/sports/insider/ui/views/MeetingGameView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Typeface;", "typeface", "", "setArimoBoldTypeface", "(Landroid/graphics/Typeface;)V", "Ljava/util/HashMap;", "", "Landroid/graphics/Bitmap;", "Lkotlin/collections/HashMap;", "bitmap20dp", "setBitmaps", "(Ljava/util/HashMap;)V", "", "Lve/c0;", "games", "setGames", "(Ljava/util/List;)V", "ve/b0", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMeetingGameView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeetingGameView.kt\ncom/sports/insider/ui/views/MeetingGameView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,747:1\n404#2:748\n404#2:749\n1563#3:750\n1634#3,3:751\n1869#3:754\n1870#3:756\n1869#3,2:757\n1869#3:759\n1870#3:792\n1#4:755\n44#5,8:760\n44#5,8:768\n44#5,8:776\n44#5,8:784\n*S KotlinDebug\n*F\n+ 1 MeetingGameView.kt\ncom/sports/insider/ui/views/MeetingGameView\n*L\n96#1:748\n101#1:749\n257#1:750\n257#1:751,3\n274#1:754\n274#1:756\n330#1:757,2\n486#1:759\n486#1:792\n499#1:760,8\n511#1:768,8\n523#1:776,8\n547#1:784,8\n*E\n"})
/* loaded from: classes.dex */
public final class MeetingGameView extends View {

    /* renamed from: a, reason: collision with root package name */
    public Typeface f7682a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f7683b;

    /* renamed from: c, reason: collision with root package name */
    public int f7684c;

    /* renamed from: d, reason: collision with root package name */
    public int f7685d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7686e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7687f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7688g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7689h;

    /* renamed from: i, reason: collision with root package name */
    public final float f7690i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final float f7691k;

    /* renamed from: l, reason: collision with root package name */
    public final float f7692l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7693m;

    /* renamed from: n, reason: collision with root package name */
    public final float f7694n;

    /* renamed from: o, reason: collision with root package name */
    public final float f7695o;

    /* renamed from: p, reason: collision with root package name */
    public final float f7696p;
    public final d q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7697r;

    /* renamed from: s, reason: collision with root package name */
    public final Paint f7698s;

    /* renamed from: t, reason: collision with root package name */
    public final TextPaint f7699t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f7700u;

    /* renamed from: v, reason: collision with root package name */
    public final Paint f7701v;

    /* renamed from: w, reason: collision with root package name */
    public final b0 f7702w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeetingGameView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7688g = 22.0f;
        this.f7689h = 5.0f;
        this.f7690i = 2.0f;
        this.j = 20.0f;
        this.f7691k = 38.0f;
        this.f7692l = 4.5f;
        this.f7693m = 8.0f;
        this.f7694n = 4.0f;
        this.f7695o = 7.0f;
        this.f7696p = 3.0f;
        e eVar = m0.f9201a;
        this.q = c0.b(q.f18523a);
        this.f7698s = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f7699t = textPaint;
        Paint paint = new Paint(1);
        this.f7700u = paint;
        Paint paint2 = new Paint(1);
        this.f7701v = paint2;
        ArrayList gamesList = new ArrayList();
        HashMap cacheMap = new HashMap();
        Intrinsics.checkNotNullParameter(gamesList, "gamesList");
        Intrinsics.checkNotNullParameter(cacheMap, "cacheMap");
        b0 b0Var = new b0();
        b0Var.f24582a = 0;
        b0Var.f24583b = 0;
        b0Var.f24584c = gamesList;
        b0Var.f24585d = cacheMap;
        this.f7702w = b0Var;
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        this.f7683b = b10;
        DisplayMetrics displayMetrics = null;
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        this.f7690i = 2.0f * b10.density;
        DisplayMetrics displayMetrics2 = this.f7683b;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        this.j = 20.0f * displayMetrics2.density;
        DisplayMetrics displayMetrics3 = this.f7683b;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        this.f7688g = displayMetrics3.density * 22.0f;
        DisplayMetrics displayMetrics4 = this.f7683b;
        if (displayMetrics4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics4 = null;
        }
        this.f7691k = 34.0f * displayMetrics4.density;
        DisplayMetrics displayMetrics5 = this.f7683b;
        if (displayMetrics5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics5 = null;
        }
        float f6 = displayMetrics5.density;
        DisplayMetrics displayMetrics6 = this.f7683b;
        if (displayMetrics6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics6 = null;
        }
        this.f7692l = 4.5f * displayMetrics6.density;
        DisplayMetrics displayMetrics7 = this.f7683b;
        if (displayMetrics7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics7 = null;
        }
        this.f7693m = 8.0f * displayMetrics7.density;
        DisplayMetrics displayMetrics8 = this.f7683b;
        if (displayMetrics8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics8 = null;
        }
        this.f7694n = 4.0f * displayMetrics8.density;
        DisplayMetrics displayMetrics9 = this.f7683b;
        if (displayMetrics9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics9 = null;
        }
        this.f7695o = 7.0f * displayMetrics9.density;
        DisplayMetrics displayMetrics10 = this.f7683b;
        if (displayMetrics10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics10 = null;
        }
        this.f7696p = 3.0f * displayMetrics10.density;
        DisplayMetrics displayMetrics11 = this.f7683b;
        if (displayMetrics11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics11 = null;
        }
        this.f7689h = displayMetrics11.density * 5.0f;
        DisplayMetrics displayMetrics12 = this.f7683b;
        if (displayMetrics12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics12 = null;
        }
        this.f7686e = displayMetrics12.density * 10.0f;
        DisplayMetrics displayMetrics13 = this.f7683b;
        if (displayMetrics13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics13 = null;
        }
        float f10 = displayMetrics13.density;
        DisplayMetrics displayMetrics14 = this.f7683b;
        if (displayMetrics14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics14 = null;
        }
        float f11 = displayMetrics14.density;
        DisplayMetrics displayMetrics15 = this.f7683b;
        if (displayMetrics15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics15 = null;
        }
        this.f7687f = 10.0f * displayMetrics15.density;
        Typeface typeface = this.f7682a;
        textPaint.setTypeface(typeface == null ? Typeface.DEFAULT_BOLD : typeface);
        textPaint.setLetterSpacing(0.0f);
        textPaint.setStrokeWidth(0.0f);
        textPaint.setColor(-1);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        DisplayMetrics displayMetrics16 = this.f7683b;
        if (displayMetrics16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics16 = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics16, "<this>");
        textPaint.setTextSize(Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, 16.0f, displayMetrics16) : displayMetrics16.scaledDensity * 16.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(Color.parseColor("#03F39E"));
        DisplayMetrics displayMetrics17 = this.f7683b;
        if (displayMetrics17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics17 = null;
        }
        paint.setStrokeWidth(displayMetrics17.density * 1.0f);
        paint2.setStyle(style);
        paint2.setColor(Color.parseColor("#B6B6B6"));
        DisplayMetrics displayMetrics18 = this.f7683b;
        if (displayMetrics18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics = displayMetrics18;
        }
        paint2.setStrokeWidth(1.0f * displayMetrics.density);
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        b0Var.f24584c = arrayList;
        b0Var.f24582a = b(this.f7684c);
        f(this.f7684c);
    }

    public static StaticLayout d(MeetingGameView meetingGameView, String str, Integer num, TextPaint textPaint, boolean z5, Layout.Alignment alignment) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 28) {
            StaticLayout build = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, num != null ? num.intValue() : (int) textPaint.measureText(str.toString())).setAlignment(alignment).setEllipsize(TextUtils.TruncateAt.END).setIncludePad(z5).setLineSpacing(0.0f, 1.0f).setMaxLines(2).build();
            Intrinsics.checkNotNull(build);
            return build;
        }
        int length = str.length();
        if (length < 0) {
            length = 0;
        }
        StaticLayout.Builder lineSpacing = StaticLayout.Builder.obtain(str, 0, length, textPaint, num != null ? num.intValue() : (int) textPaint.measureText(str.toString())).setMaxLines(2).setAlignment(alignment).setIncludePad(z5).setEllipsize(TextUtils.TruncateAt.END).setLineSpacing(0.0f, 1.0f);
        if (i5 >= 33) {
            lineSpacing.setHyphenationFrequency(4);
        } else {
            lineSpacing.setHyphenationFrequency(2);
        }
        if (i5 >= 33) {
            lineSpacing.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(2).setLineBreakWordStyle(1).build());
        }
        if (i5 >= 29) {
            lineSpacing.setBreakStrategy(1);
        }
        StaticLayout build2 = lineSpacing.build();
        Intrinsics.checkNotNull(build2);
        return build2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoBoldTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7682a, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT_BOLD;
            }
            this.f7682a = typeface;
            this.f7699t.setTypeface(typeface);
        }
    }

    public final int b(int i5) {
        MeetingGameView meetingGameView = this;
        int i10 = 0;
        if (i5 <= 0) {
            return 0;
        }
        float f6 = i5;
        float f10 = 2;
        float f11 = f6 / f10;
        float f12 = meetingGameView.f7691k;
        float f13 = f12 + 0.0f;
        float f14 = f6 - f12;
        b0 b0Var = meetingGameView.f7702w;
        List<ve.c0> W = CollectionsKt.W(b0Var.f24584c);
        int size = W.size();
        float f15 = 0.0f;
        for (ve.c0 c0Var : W) {
            StaticLayout staticLayout = c0Var.f24588a;
            int width = staticLayout != null ? staticLayout.getWidth() : i10;
            StaticLayout staticLayout2 = c0Var.f24602p;
            int width2 = staticLayout2 != null ? staticLayout2.getWidth() : i10;
            StaticLayout staticLayout3 = c0Var.f24588a;
            int height = staticLayout3 != null ? staticLayout3.getHeight() : i10;
            StaticLayout staticLayout4 = c0Var.f24602p;
            int height2 = staticLayout4 != null ? staticLayout4.getHeight() : i10;
            float f16 = meetingGameView.f7692l * f10;
            int i11 = height;
            float f17 = meetingGameView.f7693m + meetingGameView.f7695o;
            float f18 = ((f11 - f16) - f17) - width;
            float f19 = f14 - (((f16 + f11) + f17) + width2);
            String str = c0Var.f24590c;
            int i12 = (int) (f18 - f13);
            Integer valueOf = i12 <= 0 ? null : Integer.valueOf(i12);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            int i13 = height2;
            TextPaint textPaint = meetingGameView.f7699t;
            float f20 = f10;
            float f21 = f11;
            int height3 = d(meetingGameView, str, valueOf, textPaint, false, alignment).getHeight();
            int i14 = (int) f19;
            meetingGameView = this;
            int height4 = d(meetingGameView, c0Var.f24603r, i14 > 0 ? Integer.valueOf(i14) : null, textPaint, false, Layout.Alignment.ALIGN_OPPOSITE).getHeight();
            float f22 = meetingGameView.f7696p;
            float f23 = meetingGameView.f7694n;
            f15 = Math.max(f15, Math.max(Math.max(height3, height4), Math.max(Math.max((i11 + f22) - f23, (i13 + f22) - f23), meetingGameView.f7688g)));
            f11 = f21;
            f10 = f20;
            i10 = 0;
        }
        int i15 = (int) (f15 + meetingGameView.f7686e + meetingGameView.f7687f);
        b0Var.f24583b = i15;
        return size * i15;
    }

    public final void c(int i5, int i10) {
        int b10 = b(i5);
        b0 b0Var = this.f7702w;
        if (i10 == b10 && this.f7685d == b10 && b0Var.f24582a == b10) {
            invalidate();
            return;
        }
        this.f7685d = i10;
        this.f7684c = i5;
        b0Var.f24582a = b(i5);
        f(i5);
        requestLayout();
        invalidate();
    }

    public final void e(Function1 blockTypeface) {
        Intrinsics.checkNotNullParameter(blockTypeface, "blockTypeface");
        c0.t(this.q, null, null, new b(this, blockTypeface, (Continuation) null), 3);
    }

    public final void f(int i5) {
        MeetingGameView meetingGameView = this;
        if (i5 <= 0) {
            return;
        }
        float f6 = i5;
        float f10 = 2;
        float f11 = f6 / f10;
        float f12 = meetingGameView.f7691k;
        float f13 = f12 + 0.0f;
        float f14 = f6 - f12;
        b0 b0Var = meetingGameView.f7702w;
        int i10 = b0Var.f24583b;
        Iterator it = CollectionsKt.W(b0Var.f24584c).iterator();
        while (it.hasNext()) {
            ve.c0 c0Var = (ve.c0) it.next();
            StaticLayout staticLayout = c0Var.f24588a;
            int width = staticLayout != null ? staticLayout.getWidth() : 0;
            StaticLayout staticLayout2 = c0Var.f24602p;
            int width2 = staticLayout2 != null ? staticLayout2.getWidth() : 0;
            StaticLayout staticLayout3 = c0Var.f24588a;
            int height = staticLayout3 != null ? staticLayout3.getHeight() : 0;
            float f15 = meetingGameView.f7692l;
            float f16 = f15 * f10;
            float f17 = meetingGameView.f7693m;
            float f18 = meetingGameView.f7695o;
            float f19 = f17 + f18;
            float f20 = ((f11 - f16) - f19) - width;
            float f21 = f16 + f11 + f19 + width2;
            float f22 = f15 + f17 + f20;
            float f23 = f11 - (f15 + f18);
            float f24 = height;
            float f25 = meetingGameView.f7696p;
            float f26 = f24 + f25;
            float f27 = i10;
            float f28 = meetingGameView.f7694n;
            float f29 = (f27 - (f26 - f28)) / f10;
            float f30 = f29 + f24;
            float f31 = f22 - f17;
            float f32 = f23 + f18;
            float f33 = f29 - f28;
            float f34 = f30 + f25;
            float f35 = f34 - f33;
            float f36 = meetingGameView.f7688g;
            if (f36 > f35) {
                f33 = (f27 - f36) / f10;
                f34 = f33 + f36;
            }
            StaticLayout staticLayout4 = c0Var.f24602p;
            int height2 = staticLayout4 != null ? staticLayout4.getHeight() : 0;
            float f37 = meetingGameView.f7692l;
            float f38 = f33;
            float f39 = meetingGameView.f7693m;
            float f40 = f37 + f39 + f11;
            float f41 = meetingGameView.f7695o;
            float f42 = f21 - (f37 + f41);
            float f43 = height2;
            float f44 = meetingGameView.f7696p;
            float f45 = f43 + f44;
            float f46 = meetingGameView.f7694n;
            float f47 = f45 + f46;
            float f48 = ((f27 - f47) / f10) + f46;
            float f49 = f48 + f43;
            float f50 = f49 - f48;
            float f51 = meetingGameView.f7688g;
            if (f51 > f50) {
                float f52 = f51 - f50;
                f48 = ((f27 - (f52 + f47)) / f10) + (f52 / f10) + f46;
                f49 = f48 + f43;
            }
            float f53 = f40 - f39;
            float f54 = f42 + f41;
            float f55 = f48 - f46;
            float f56 = f49 + f44;
            if (f51 > f56 - f55) {
                f55 = (f27 - f51) / f10;
                f56 = f55 + f51;
            }
            float f57 = f14 - f21;
            String str = c0Var.f24590c;
            int i11 = (int) (f20 - f13);
            Integer valueOf = i11 <= 0 ? null : Integer.valueOf(i11);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = meetingGameView.f7699t;
            float f58 = f14;
            float f59 = f11;
            int i12 = i10;
            float f60 = f34;
            float f61 = f10;
            Iterator it2 = it;
            float f62 = f55;
            float f63 = f6;
            float f64 = f56;
            float f65 = f13;
            StaticLayout d10 = d(meetingGameView, str, valueOf, textPaint, false, alignment);
            int i13 = (int) f57;
            StaticLayout d11 = d(this, c0Var.f24603r, i13 > 0 ? Integer.valueOf(i13) : null, textPaint, false, Layout.Alignment.ALIGN_OPPOSITE);
            float f66 = this.f7690i;
            float f67 = this.j;
            float f68 = f66 + f67;
            float f69 = ((f27 - ((f66 * f61) + f67)) / f61) + f66;
            c0Var.f24595h = f31;
            c0Var.f24596i = f38;
            c0Var.j = f32;
            c0Var.f24597k = f60;
            c0Var.f24609x = f53;
            c0Var.f24610y = f62;
            c0Var.f24611z = f54;
            c0Var.A = f64;
            c0Var.f24600n = f66;
            c0Var.f24601o = f69;
            c0Var.D = f63 - f68;
            c0Var.E = f69;
            c0Var.f24593f = f22;
            c0Var.f24594g = f29;
            c0Var.f24607v = f40;
            c0Var.f24608w = f48;
            c0Var.q = d11;
            c0Var.f24589b = d10;
            c0Var.f24598l = f65;
            c0Var.f24599m = (i12 - d10.getHeight()) / 2.0f;
            c0Var.B = f21;
            c0Var.C = (i12 - d11.getHeight()) / 2.0f;
            meetingGameView = this;
            f11 = f59;
            f13 = f65;
            f6 = f63;
            f10 = f61;
            f14 = f58;
            i10 = i12;
            it = it2;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7697r) {
            c0.h(this.q.f18494a);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int save;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        b0 b0Var = this.f7702w;
        float f6 = b0Var.f24583b;
        for (ve.c0 c0Var : b0Var.f24584c) {
            StaticLayout staticLayout = c0Var.f24589b;
            int i5 = c0Var.f24606u;
            if (staticLayout != null) {
                float f10 = c0Var.f24598l;
                float f11 = c0Var.f24599m;
                save = canvas.save();
                canvas.translate(f10, f11);
                try {
                    staticLayout.draw(canvas);
                    canvas.restoreToCount(save);
                } finally {
                }
            }
            StaticLayout staticLayout2 = c0Var.q;
            if (staticLayout2 != null) {
                float f12 = c0Var.B;
                float f13 = c0Var.C;
                save = canvas.save();
                canvas.translate(f12, f13);
                try {
                    staticLayout2.draw(canvas);
                    canvas.restoreToCount(save);
                } finally {
                }
            }
            StaticLayout staticLayout3 = c0Var.f24588a;
            if (staticLayout3 != null) {
                float f14 = c0Var.f24593f;
                float f15 = c0Var.f24594g;
                save = canvas.save();
                canvas.translate(f14, f15);
                try {
                    staticLayout3.draw(canvas);
                    canvas.restoreToCount(save);
                } finally {
                }
            }
            float f16 = c0Var.f24595h;
            float f17 = c0Var.f24596i;
            float f18 = c0Var.j;
            float f19 = c0Var.f24597k;
            Paint paint = this.f7700u;
            Paint paint2 = this.f7701v;
            Paint paint3 = i5 == 2 ? paint2 : paint;
            float f20 = this.f7689h;
            canvas.drawRoundRect(f16, f17, f18, f19, f20, f20, paint3);
            StaticLayout staticLayout4 = c0Var.f24602p;
            if (staticLayout4 != null) {
                float f21 = c0Var.f24607v;
                float f22 = c0Var.f24608w;
                save = canvas.save();
                canvas.translate(f21, f22);
                try {
                    staticLayout4.draw(canvas);
                } finally {
                }
            }
            float f23 = c0Var.f24609x;
            float f24 = c0Var.f24610y;
            float f25 = c0Var.f24611z;
            float f26 = c0Var.A;
            Paint paint4 = i5 == 1 ? paint2 : paint;
            float f27 = this.f7689h;
            canvas.drawRoundRect(f23, f24, f25, f26, f27, f27, paint4);
            String str = c0Var.f24592e;
            Paint paint5 = this.f7698s;
            if (str != null && (bitmap2 = (Bitmap) b0Var.f24585d.get(str)) != null) {
                canvas.drawBitmap(bitmap2, c0Var.f24600n, c0Var.f24601o, paint5);
            }
            String str2 = c0Var.f24605t;
            if (str2 != null && (bitmap = (Bitmap) b0Var.f24585d.get(str2)) != null) {
                canvas.drawBitmap(bitmap, c0Var.D, c0Var.E, paint5);
            }
            canvas.translate(0.0f, f6);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        b0 b0Var = this.f7702w;
        if (mode == Integer.MIN_VALUE) {
            b0Var.getClass();
            size = Math.min(size, 200);
        } else if (mode != 1073741824) {
            b0Var.getClass();
            size = 200;
        }
        this.f7684c = size;
        int b10 = b(size);
        b0Var.f24582a = b10;
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, b10);
        } else if (mode2 != 1073741824) {
            size2 = b10;
        }
        this.f7685d = size2;
        setMeasuredDimension(this.f7684c, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        c(i5, i10);
    }

    public final void setBitmaps(@NotNull HashMap<String, Bitmap> bitmap20dp) {
        Intrinsics.checkNotNullParameter(bitmap20dp, "bitmap20dp");
        b0 b0Var = this.f7702w;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(bitmap20dp, "<set-?>");
        b0Var.f24585d = bitmap20dp;
        invalidate();
    }

    public final void setGames(@Nullable List<ve.c0> games) {
        b0 b0Var = this.f7702w;
        if (games == null || games.isEmpty()) {
            e0 e0Var = e0.f19204a;
            b0Var.getClass();
            Intrinsics.checkNotNullParameter(e0Var, "<set-?>");
            b0Var.f24584c = e0Var;
            c(this.f7684c, this.f7685d);
            return;
        }
        ArrayList arrayList = new ArrayList(v.k(games, 10));
        for (ve.c0 c0Var : games) {
            String str = c0Var.f24591d;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextPaint textPaint = this.f7699t;
            c0Var.f24588a = d(this, str, null, textPaint, true, alignment);
            c0Var.f24602p = d(this, c0Var.f24604s, null, textPaint, true, alignment);
            arrayList.add(c0Var);
        }
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        b0Var.f24584c = arrayList;
        int i5 = this.f7684c;
        b0Var.f24582a = b(i5);
        f(i5);
        requestLayout();
    }
}
