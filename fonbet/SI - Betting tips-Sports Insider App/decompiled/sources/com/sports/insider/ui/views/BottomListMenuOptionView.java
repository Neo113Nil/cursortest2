package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ve.b;
import ve.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0014\u0010!\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0012R\u0014\u0010#\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0012R\u0014\u0010%\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0016R\u0014\u0010'\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0016¨\u0006("}, d2 = {"Lcom/sports/insider/ui/views/BottomListMenuOptionView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lve/b;", "G", "Lve/b;", "getClickListener", "()Lve/b;", "setClickListener", "(Lve/b;)V", "clickListener", "", "getDp328", "()I", "dp328", "", "getDp53", "()F", "dp53", "getDp20", "dp20", "getDp16", "dp16", "getDp13", "dp13", "getDp8", "dp8", "getDp0f5", "dp0f5", "getCountItems", "countItems", "getDpHeightItem", "dpHeightItem", "getRoundItemCancel", "roundItemCancel", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBottomListMenuOptionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomListMenuOptionView.kt\ncom/sports/insider/ui/views/BottomListMenuOptionView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,779:1\n404#2:780\n404#2:781\n404#2:782\n404#2:783\n404#2:784\n1#3:785\n1563#4:786\n1634#4,3:787\n135#5,8:790\n135#5,8:798\n27#5,7:806\n27#5,7:813\n27#5,7:820\n*S KotlinDebug\n*F\n+ 1 BottomListMenuOptionView.kt\ncom/sports/insider/ui/views/BottomListMenuOptionView\n*L\n128#1:780\n129#1:781\n130#1:782\n131#1:783\n132#1:784\n298#1:786\n298#1:787,3\n520#1:790,8\n527#1:798,8\n535#1:806,7\n543#1:813,7\n552#1:820,7\n*E\n"})
/* loaded from: classes.dex */
public final class BottomListMenuOptionView extends View {
    public final float A;
    public final TextPaint B;
    public final TextPaint C;
    public final Paint D;
    public final Paint E;
    public GestureDetector F;

    /* renamed from: G, reason: from kotlin metadata */
    public b clickListener;
    public Object H;

    /* renamed from: a, reason: collision with root package name */
    public final float f7185a;

    /* renamed from: b, reason: collision with root package name */
    public int f7186b;

    /* renamed from: c, reason: collision with root package name */
    public int f7187c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f7188d;

    /* renamed from: e, reason: collision with root package name */
    public RectF f7189e;

    /* renamed from: f, reason: collision with root package name */
    public RectF f7190f;

    /* renamed from: g, reason: collision with root package name */
    public StaticLayout f7191g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f7192h;

    /* renamed from: i, reason: collision with root package name */
    public RectF f7193i;
    public StaticLayout j;

    /* renamed from: k, reason: collision with root package name */
    public Pair[] f7194k;

    /* renamed from: l, reason: collision with root package name */
    public Path[] f7195l;

    /* renamed from: m, reason: collision with root package name */
    public Pair[] f7196m;

    /* renamed from: n, reason: collision with root package name */
    public Path[] f7197n;

    /* renamed from: o, reason: collision with root package name */
    public SpannableString f7198o;

    /* renamed from: p, reason: collision with root package name */
    public final SpannableString f7199p;
    public final int q;

    /* renamed from: r, reason: collision with root package name */
    public final int f7200r;

    /* renamed from: s, reason: collision with root package name */
    public final int f7201s;

    /* renamed from: t, reason: collision with root package name */
    public final int f7202t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7203u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7204v;

    /* renamed from: w, reason: collision with root package name */
    public final int f7205w;

    /* renamed from: x, reason: collision with root package name */
    public final float f7206x;

    /* renamed from: y, reason: collision with root package name */
    public final float f7207y;

    /* renamed from: z, reason: collision with root package name */
    public final float f7208z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomListMenuOptionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7185a = 2.3f;
        this.f7194k = new Pair[0];
        this.f7195l = new Path[0];
        this.f7196m = new Pair[0];
        this.f7197n = new Path[0];
        this.f7203u = getDp328();
        this.f7204v = getDp0f5();
        this.f7205w = getDp8();
        this.f7206x = getDp16();
        this.f7207y = getDp16();
        this.f7208z = getDp16();
        this.A = getDp16();
        TextPaint textPaint = new TextPaint(1);
        this.B = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.C = textPaint2;
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.H = e0.f19204a;
        this.f7185a = context.getResources().getDisplayMetrics().density;
        this.f7201s = Color.parseColor("#545458");
        this.f7200r = Color.parseColor("#03F39E");
        this.q = Color.parseColor("#F7F7F7");
        this.f7202t = Color.parseColor("#1A1A1A");
        Color.parseColor("#4DB0B0B0");
        this.f7198o = new SpannableString("Cancel");
        this.f7199p = new SpannableString("OK");
        paint.setColor(this.f7202t);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setColor(this.f7201s);
        paint2.setStyle(style);
        textPaint.setColor(this.f7200r);
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        textPaint.setStyle(style2);
        textPaint.setTextSize(getDp20());
        textPaint2.setColor(this.q);
        textPaint2.setStyle(style2);
        textPaint2.setTextSize(getDp20());
    }

    public static final boolean a(BottomListMenuOptionView bottomListMenuOptionView, float f6, float f10, RectF rectF) {
        if (rectF == null || rectF.isEmpty()) {
            return false;
        }
        float f11 = rectF.left;
        if (f6 > rectF.right || f11 > f6) {
            return false;
        }
        return f10 <= rectF.bottom && rectF.top <= f10;
    }

    public static RectF b(float f6, float f10, float f11, float f12, int i5, int i10) {
        float abs = ((Math.abs(f11) - Math.abs(f6)) / 2.0f) + f6;
        float abs2 = ((Math.abs(f12) - Math.abs(f10)) / 2.0f) + f10;
        float f13 = i10;
        float f14 = abs - (f13 / 2.0f);
        float f15 = i5;
        float f16 = abs2 - (f15 / 2.0f);
        return new RectF(f14, f16, f13 + f14, f15 + f16);
    }

    public static StaticLayout e(int i5, SpannableString spannableString, TextPaint textPaint) {
        if (spannableString == null || spannableString.length() == 0 || StringsKt.H(spannableString) || i5 <= 5) {
            return null;
        }
        StaticLayout build = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i5).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i5).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(true).setLineSpacing(0.0f, 1.0f).setMaxLines(2).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    private final int getCountItems() {
        return this.H.size();
    }

    private final int getDp0f5() {
        return (int) (this.f7185a * 0.5d);
    }

    private final float getDp13() {
        return this.f7185a * 13.0f;
    }

    private final float getDp16() {
        return this.f7185a * 16.0f;
    }

    private final float getDp20() {
        return 20 * this.f7185a;
    }

    private final int getDp328() {
        return (int) (328 * this.f7185a);
    }

    private final float getDp53() {
        return 53 * this.f7185a;
    }

    private final int getDp8() {
        return (int) (8 * this.f7185a);
    }

    private final float getDpHeightItem() {
        return getDp53();
    }

    private final float getRoundItemCancel() {
        return getDp13();
    }

    public final void c() {
        this.f7192h = null;
        this.f7188d = null;
        this.f7189e = null;
        this.f7190f = null;
        this.f7191g = null;
        this.f7195l = new Path[0];
        this.f7196m = new Pair[0];
        this.f7194k = new Pair[0];
        this.f7197n = new Path[0];
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.List] */
    public final void d(int i5, int i10) {
        int i11;
        SpannableString spannableString;
        String str;
        float f6;
        float f10;
        Path path;
        if (i5 <= 0 || i10 <= 0) {
            c();
            return;
        }
        Rect rect = new Rect((int) this.A, (int) this.f7206x, (int) (i5 - this.f7208z), (int) (i10 - this.f7207y));
        if (rect.height() <= 0 || rect.width() <= 0 || rect.isEmpty()) {
            c();
            return;
        }
        float dpHeightItem = rect.bottom - getDpHeightItem();
        RectF rectF = new RectF(rect.left, rect.top, rect.right, dpHeightItem - this.f7205w);
        float f11 = 2.0f;
        if (rect.height() <= 0 || rect.width() <= 0 || rect.isEmpty()) {
            this.f7192h = null;
            this.f7193i = null;
            this.j = null;
        } else {
            RectF rectF2 = new RectF(rect.left, dpHeightItem, rect.right, rect.bottom);
            Rect rect2 = new Rect((int) (rectF2.left + getDp16()), (int) (rectF2.top + getDp16()), (int) (rectF2.right - getDp16()), (int) (rectF2.bottom - getDp16()));
            int width = rect2.width();
            SpannableString spannableString2 = this.f7198o;
            if (spannableString2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cancel");
                spannableString2 = null;
            }
            StaticLayout e7 = e(width, spannableString2, this.B);
            if (e7 != null) {
                int i12 = rect2.left;
                int i13 = rect2.top;
                int i14 = rect2.right;
                int i15 = rect2.bottom;
                int height = e7.getHeight();
                float abs = ((Math.abs(i14) - Math.abs(i12)) / 2.0f) + i12;
                float abs2 = ((Math.abs(i15) - Math.abs(i13)) / 2.0f) + i13;
                float width2 = e7.getWidth();
                float f12 = abs - (width2 / 2.0f);
                float f13 = height;
                float f14 = abs2 - (f13 / 2.0f);
                this.f7193i = new RectF(f12, f14, width2 + f12, f13 + f14);
            } else {
                e7 = null;
            }
            if (e7 == null) {
                this.f7193i = null;
            }
            this.j = e7;
            this.f7192h = rectF2;
        }
        this.f7188d = (rect.height() <= 0 || rect.width() <= 0 || rect.isEmpty()) ? null : rectF;
        int countItems = getCountItems();
        if (countItems <= 0) {
            this.f7189e = null;
            this.f7191g = null;
            this.f7190f = null;
            this.f7195l = new Path[0];
            this.f7196m = new Pair[0];
            this.f7194k = new Pair[0];
            this.f7197n = new Path[0];
            return;
        }
        TextPaint textPaint = this.C;
        String str2 = "onlyOption";
        boolean z5 = true;
        if (countItems == 1) {
            float dpHeightItem2 = getDpHeightItem();
            Pair pair = (Pair) CollectionsKt.firstOrNull(this.H);
            SpannableString spannableString3 = pair != null ? new SpannableString((CharSequence) pair.f19193b) : null;
            RectF rectF3 = new RectF(rectF.left, rectF.bottom - dpHeightItem2, rectF.right, rectF.bottom);
            RectF rectF4 = new RectF(rectF3.left + getDp16(), rectF3.top + getDp16(), rectF3.right - getDp16(), rectF3.bottom - getDp16());
            int width3 = (int) rectF4.width();
            if (spannableString3 == null && (spannableString3 = this.f7199p) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onlyOption");
                spannableString3 = null;
            }
            StaticLayout e9 = e(width3, spannableString3, textPaint);
            if (e9 != null) {
                this.f7190f = b(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, e9.getHeight(), e9.getWidth());
            } else {
                e9 = null;
            }
            if (e9 == null) {
                this.f7190f = null;
            }
            this.f7191g = e9;
            this.f7189e = rectF3;
            this.f7195l = new Path[0];
            this.f7196m = new Pair[0];
            this.f7194k = new Pair[0];
            this.f7197n = new Path[0];
            return;
        }
        float dpHeightItem3 = getDpHeightItem();
        float roundItemCancel = getRoundItemCancel();
        ?? r11 = this.H;
        this.f7189e = null;
        this.f7190f = null;
        this.f7191g = null;
        Path[] pathArr = new Path[countItems];
        int i16 = 0;
        while (true) {
            i11 = this.f7204v;
            if (i16 >= countItems) {
                break;
            }
            int i17 = countItems - 1;
            float f15 = f11;
            float f16 = rectF.bottom - (((i17 - i16) * dpHeightItem3) + (i11 * r3));
            float f17 = f16 - dpHeightItem3;
            float f18 = rectF.left;
            float f19 = rectF.right;
            boolean z7 = i16 == 0 ? z5 : false;
            boolean z10 = i16 == i17 ? z5 : false;
            if (z7) {
                path = new Path();
                path.moveTo(f18, f16);
                path.lineTo(f18, f17 + roundItemCancel);
                str = str2;
                float f20 = 2 * roundItemCancel;
                f6 = dpHeightItem3;
                float f21 = f17 + f20;
                f10 = roundItemCancel;
                path.arcTo(new RectF(f18, f17, f18 + f20, f21), 180.0f, 90.0f);
                path.lineTo(f19 - f10, f17);
                path.arcTo(new RectF(f19 - f20, f17, f19, f21), 270.0f, 90.0f);
                path.lineTo(f19, f16);
                path.lineTo(f18, f16);
                path.close();
            } else {
                str = str2;
                f6 = dpHeightItem3;
                f10 = roundItemCancel;
                if (z10) {
                    path = new Path();
                    path.moveTo(f18, f17);
                    path.lineTo(f19, f17);
                    path.lineTo(f19, f16 - f10);
                    float f22 = 2 * f10;
                    float f23 = f16 - f22;
                    path.arcTo(new RectF(f19 - f22, f23, f19, f16), 0.0f, 90.0f);
                    path.lineTo(f18 + f10, f16);
                    path.arcTo(new RectF(f18, f23, f22 + f18, f16), 90.0f, 90.0f);
                    path.lineTo(f18, f17);
                    path.close();
                } else {
                    path = new Path();
                    path.moveTo(f18, f16);
                    path.lineTo(f18, f17);
                    path.lineTo(f19, f17);
                    path.lineTo(f19, f16);
                    path.lineTo(f18, f16);
                    path.close();
                }
            }
            pathArr[i16] = path;
            i16++;
            f11 = f15;
            str2 = str;
            dpHeightItem3 = f6;
            roundItemCancel = f10;
            z5 = true;
        }
        float f24 = f11;
        String str3 = str2;
        float f25 = dpHeightItem3;
        this.f7195l = pathArr;
        Pair[] pairArr = new Pair[countItems];
        for (int i18 = 0; i18 < countItems; i18++) {
            float f26 = rectF.bottom - ((f25 * ((countItems - 1) - i18)) + (r6 * i11));
            pairArr[i18] = new Pair(Integer.valueOf(i18), new RectF(rectF.left, f26 - f25, rectF.right, f26));
        }
        this.f7196m = pairArr;
        int i19 = countItems - 1;
        Path[] pathArr2 = new Path[i19];
        for (int i20 = 0; i20 < i19; i20++) {
            int i21 = (countItems - 2) - i20;
            float f27 = rectF.bottom - ((f25 * (i21 + 1)) + (i21 * i11));
            float f28 = i11;
            float f29 = f27 - f28;
            float f30 = rectF.left;
            float f31 = rectF.right;
            float f32 = f27 + f28;
            float f33 = f29 - f28;
            Path path2 = new Path();
            path2.moveTo(f30, f32);
            path2.lineTo(f30, f33);
            path2.lineTo(f31, f33);
            path2.lineTo(f31, f32);
            path2.lineTo(f30, f32);
            path2.close();
            pathArr2[i20] = path2;
        }
        this.f7197n = pathArr2;
        float dp16 = getDp16();
        Pair[] pairArr2 = new Pair[countItems];
        for (int i22 = 0; i22 < countItems; i22++) {
            float f34 = rectF.bottom - (((i19 - i22) * f25) + (r8 * i11));
            RectF rectF5 = new RectF(rectF.left, f34 - f25, rectF.right, f34);
            int width4 = (int) (rectF5.width() - (dp16 * f24));
            Pair pair2 = (Pair) CollectionsKt.G(i22, r11);
            if ((pair2 == null || (spannableString = (SpannableString) pair2.f19193b) == null) && (spannableString = this.f7199p) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str3);
                spannableString = null;
            }
            StaticLayout e10 = e(width4, spannableString, textPaint);
            pairArr2[i22] = e10 == null ? null : new Pair(b(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, e10.getHeight(), e10.getWidth()), e10);
        }
        this.f7194k = pairArr2;
    }

    @Nullable
    public final b getClickListener() {
        return this.clickListener;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d(this.f7186b, this.f7187c);
        this.F = new GestureDetector(getContext(), new c(0, this));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = null;
        this.clickListener = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Layout layout;
        RectF rectF;
        int save;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF2 = this.f7192h;
        Paint paint = this.D;
        if (rectF2 != null) {
            save = canvas.save();
            canvas.clipRect(rectF2);
            try {
                canvas.drawRoundRect(rectF2, getRoundItemCancel(), getRoundItemCancel(), paint);
                RectF rectF3 = this.f7193i;
                if (rectF3 != null) {
                    canvas.translate(rectF3.left, rectF3.top);
                }
                StaticLayout staticLayout = this.j;
                if (staticLayout != null) {
                    staticLayout.draw(canvas);
                }
                canvas.restoreToCount(save);
            } finally {
            }
        }
        RectF rectF4 = this.f7189e;
        if (rectF4 != null) {
            save = canvas.save();
            canvas.clipRect(rectF4);
            try {
                canvas.drawRoundRect(rectF4, getRoundItemCancel(), getRoundItemCancel(), paint);
                RectF rectF5 = this.f7190f;
                if (rectF5 != null) {
                    canvas.translate(rectF5.left, rectF5.top);
                }
                StaticLayout staticLayout2 = this.f7191g;
                if (staticLayout2 != null) {
                    staticLayout2.draw(canvas);
                }
                canvas.restoreToCount(save);
            } finally {
            }
        }
        if (this.f7197n.length != 0) {
            int save2 = canvas.save();
            try {
                RectF rectF6 = this.f7188d;
                if (rectF6 != null) {
                    canvas.clipRect(rectF6);
                }
                for (Path path : this.f7197n) {
                    canvas.drawPath(path, this.E);
                }
                canvas.restoreToCount(save2);
            } finally {
                canvas.restoreToCount(save2);
            }
        }
        if (this.f7195l.length != 0) {
            save = canvas.save();
            try {
                RectF rectF7 = this.f7188d;
                if (rectF7 != null) {
                    canvas.clipRect(rectF7);
                }
                for (Path path2 : this.f7195l) {
                    canvas.drawPath(path2, paint);
                }
                canvas.restoreToCount(save);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        Pair[] pairArr = this.f7194k;
        if (pairArr.length == 0) {
            return;
        }
        for (Pair pair : pairArr) {
            int save3 = canvas.save();
            if (pair != null) {
                try {
                    RectF rectF8 = (RectF) pair.f19192a;
                    if (rectF8 != null) {
                        canvas.clipRect(rectF8);
                    }
                } finally {
                    canvas.restoreToCount(save3);
                }
            }
            if (pair != null && (rectF = (RectF) pair.f19192a) != null) {
                canvas.translate(rectF.left, rectF.top);
            }
            if (pair != null && (layout = (Layout) pair.f19193b) != null) {
                layout.draw(canvas);
            }
            canvas.restoreToCount(save3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        float dpHeightItem = (((getDpHeightItem() * getCountItems()) + (this.f7204v * getCountItems())) - 1) + getDpHeightItem() + this.f7205w;
        float f6 = this.f7203u + this.A + this.f7208z;
        float f10 = dpHeightItem + this.f7206x + this.f7207y;
        float floatValue = (mode != Integer.MIN_VALUE ? mode != 1073741824 ? Float.valueOf(f6) : Integer.valueOf(size) : Integer.valueOf(size)).floatValue();
        float floatValue2 = (mode2 != Integer.MIN_VALUE ? mode2 != 1073741824 ? Float.valueOf(f10) : Integer.valueOf(size2) : Float.valueOf(Math.min(f10, size2))).floatValue();
        Float valueOf = Float.valueOf(floatValue);
        Float valueOf2 = Float.valueOf(floatValue2);
        this.f7186b = (int) valueOf.floatValue();
        int floatValue3 = (int) valueOf2.floatValue();
        this.f7187c = floatValue3;
        setMeasuredDimension(this.f7186b, floatValue3);
        d(this.f7186b, this.f7187c);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 == 0 || i10 == 0) {
            return;
        }
        if (i11 != i5 && i12 != i10) {
            d(this.f7186b, this.f7187c);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        GestureDetector gestureDetector = this.F;
        return gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public final void setClickListener(@Nullable b bVar) {
        this.clickListener = bVar;
    }
}
