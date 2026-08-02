package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.lifecycle.d1;
import com.google.android.material.sidesheet.b;
import com.sports.insider.R;
import com.sports.insider.ui.activities.MainActivity;
import d2.i;
import gc.d;
import gf.u;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.LinkedHashSet;
import java.util.List;
import kc.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.c;
import ve.k;
import ve.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002*\"B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR2\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013R2\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R0\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/sports/insider/ui/views/DrawerMenu;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getMaxScroll", "()I", "Lkotlin/Function1;", "", "Landroid/graphics/Bitmap;", "c", "Lkotlin/jvm/functions/Function1;", "getBitmapProviderLogo", "()Lkotlin/jvm/functions/Function1;", "setBitmapProviderLogo", "(Lkotlin/jvm/functions/Function1;)V", "bitmapProviderLogo", "", "d", "getBitmapRequesterLogo", "setBitmapRequesterLogo", "bitmapRequesterLogo", "e", "getBitmapProviderIconRes", "setBitmapProviderIconRes", "bitmapProviderIconRes", "f", "getBitmapRequesterIconRes", "setBitmapRequesterIconRes", "bitmapRequesterIconRes", "Lve/k;", "p0", "Lve/k;", "getDataDrawerMenu", "()Lve/k;", "setDataDrawerMenu", "(Lve/k;)V", "dataDrawerMenu", "Lve/l;", "q0", "Lve/l;", "getListenerDrawerMenu", "()Lve/l;", "setListenerDrawerMenu", "(Lve/l;)V", "listenerDrawerMenu", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDrawerMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawerMenu.kt\ncom/sports/insider/ui/views/DrawerMenu\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,778:1\n1#2:779\n404#3:780\n404#3:781\n404#3:782\n404#3:783\n44#4,8:784\n44#4,8:792\n44#4,8:800\n44#4,8:808\n44#4,8:816\n*S KotlinDebug\n*F\n+ 1 DrawerMenu.kt\ncom/sports/insider/ui/views/DrawerMenu\n*L\n248#1:780\n262#1:781\n273#1:782\n274#1:783\n352#1:784,8\n363#1:792,8\n376#1:800,8\n407#1:808,8\n414#1:816,8\n*E\n"})
/* loaded from: classes.dex */
public final class DrawerMenu extends View {
    public final int[] A;
    public final int B;
    public LinearGradient C;
    public final float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public int J;
    public final int K;
    public boolean L;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f7350a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f7351b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Function1 bitmapProviderLogo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Function1 bitmapRequesterLogo;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Function1 bitmapProviderIconRes;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Function1 bitmapRequesterIconRes;

    /* renamed from: g, reason: collision with root package name */
    public final DisplayMetrics f7356g;

    /* renamed from: g0, reason: collision with root package name */
    public float f7357g0;

    /* renamed from: h, reason: collision with root package name */
    public final float f7358h;

    /* renamed from: h0, reason: collision with root package name */
    public float f7359h0;

    /* renamed from: i, reason: collision with root package name */
    public final float f7360i;

    /* renamed from: i0, reason: collision with root package name */
    public final OverScroller f7361i0;
    public final RectF j;
    public VelocityTracker j0;

    /* renamed from: k, reason: collision with root package name */
    public final float f7362k;
    public final float k0;

    /* renamed from: l, reason: collision with root package name */
    public final float f7363l;

    /* renamed from: l0, reason: collision with root package name */
    public final int f7364l0;

    /* renamed from: m, reason: collision with root package name */
    public final float f7365m;

    /* renamed from: m0, reason: collision with root package name */
    public final int f7366m0;

    /* renamed from: n, reason: collision with root package name */
    public final float f7367n;

    /* renamed from: n0, reason: collision with root package name */
    public final String f7368n0;

    /* renamed from: o, reason: collision with root package name */
    public final float f7369o;

    /* renamed from: o0, reason: collision with root package name */
    public final String f7370o0;

    /* renamed from: p, reason: collision with root package name */
    public final float f7371p;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public k dataDrawerMenu;
    public final float q;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public l listenerDrawerMenu;

    /* renamed from: r, reason: collision with root package name */
    public final float f7374r;

    /* renamed from: s, reason: collision with root package name */
    public int f7375s;

    /* renamed from: t, reason: collision with root package name */
    public float f7376t;

    /* renamed from: u, reason: collision with root package name */
    public final TextPaint f7377u;

    /* renamed from: v, reason: collision with root package name */
    public final TextPaint f7378v;

    /* renamed from: w, reason: collision with root package name */
    public final TextPaint f7379w;

    /* renamed from: x, reason: collision with root package name */
    public final TextPaint f7380x;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f7381y;

    /* renamed from: z, reason: collision with root package name */
    public final Paint f7382z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerMenu(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7350a = new LinkedHashSet();
        this.f7351b = new LinkedHashSet();
        this.f7358h = 1.0f;
        this.f7360i = 1.0f;
        this.j = new RectF();
        this.f7362k = 60.0f;
        this.f7363l = 16.0f;
        this.f7365m = 36.0f;
        this.f7367n = 16.0f;
        this.f7369o = 24.0f;
        this.f7371p = 76.0f;
        this.q = 85.0f;
        this.f7374r = 32.0f;
        this.f7376t = 117.0f + this.f7375s;
        this.f7377u = new TextPaint(1);
        this.f7378v = new TextPaint(1);
        this.f7379w = new TextPaint(1);
        this.f7380x = new TextPaint(1);
        this.f7381y = new Paint(1);
        this.f7382z = new Paint(1);
        int[] iArr = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr[i5] = -1;
        }
        this.A = iArr;
        this.B = -16777216;
        this.D = 1.5f;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.K = 8;
        this.f7361i0 = new OverScroller(getContext());
        this.k0 = 300.0f;
        this.f7368n0 = "Live - predictions";
        this.f7370o0 = "Американский футбол";
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.f7356g = displayMetrics;
        DisplayMetrics displayMetrics2 = null;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f6 = displayMetrics.density;
        f6 = f6 <= 0.0f ? this.f7358h : f6;
        this.f7360i = f6;
        this.f7363l *= f6;
        this.f7362k *= f6;
        this.q *= f6;
        this.f7374r *= f6;
        float f10 = this.f7365m;
        float f11 = this.f7369o;
        float f12 = this.f7367n;
        this.f7371p = (f10 + f11 + f12) * f6;
        this.f7369o = f11 * f6;
        this.f7367n = f12 * f6;
        this.f7365m = f10 * f6;
        DisplayMetrics displayMetrics3 = this.f7356g;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics2 = displayMetrics3;
        }
        Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
        float applyDimension = Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, 14.0f, displayMetrics2) : displayMetrics2.scaledDensity * 14.0f;
        this.B = Color.parseColor("#18012E");
        TextPaint textPaint = this.f7377u;
        textPaint.setColor(-1);
        textPaint.setTextSize(applyDimension);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textPaint.setTypeface(typeface);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        textPaint.setStyle(style);
        TextPaint textPaint2 = this.f7378v;
        textPaint2.setColor(-1);
        textPaint2.setTextSize(applyDimension);
        textPaint2.setTypeface(typeface);
        textPaint2.setStyle(style);
        TextPaint textPaint3 = this.f7379w;
        textPaint3.setColor(Color.parseColor("#D3D3D3"));
        textPaint3.setTextSize(applyDimension);
        Typeface typeface2 = Typeface.DEFAULT;
        textPaint3.setTypeface(typeface2);
        textPaint3.setStyle(style);
        TextPaint textPaint4 = this.f7380x;
        textPaint4.setColor(-1);
        textPaint4.setTextSize(applyDimension);
        textPaint4.setTypeface(typeface2);
        textPaint4.setStyle(style);
        this.f7364l0 = Color.parseColor("#03F39E");
        int parseColor = Color.parseColor("#40007E");
        this.f7366m0 = parseColor;
        this.D *= this.f7360i;
        iArr[0] = parseColor;
        iArr[1] = this.f7364l0;
        Paint paint = this.f7382z;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f7366m0);
        paint.setDither(true);
        paint.setStrokeWidth(this.D);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.J = 0;
        this.K = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final int getMaxScroll() {
        int i5;
        k kVar = this.dataDrawerMenu;
        if (kVar != null) {
            c G = ((MainActivity) kVar).G();
            if (G.f21740l == 0) {
                i5 = G.f21741m;
                if (G.f21739k) {
                    i5--;
                }
            } else {
                List list = (List) d1.a(G.f21732c).d();
                i5 = (list != null ? list.size() : 0) + 2;
            }
        } else {
            i5 = 0;
        }
        float f6 = i5 * this.f7362k;
        float height = getHeight();
        if (f6 <= height) {
            return 0;
        }
        return (int) Math.max(0.0f, f6 - height);
    }

    public final void a(Canvas canvas, float f6) {
        float f10 = this.F;
        float f11 = this.G;
        if (f10 >= f11 || this.E <= 0.0f || f10 <= 0.0f) {
            return;
        }
        canvas.drawLine(f10, f6 - this.D, f11, f6, this.f7382z);
    }

    public final void b(int i5, int i10) {
        RectF rectF = this.j;
        if (i5 <= 0 || i10 <= 0) {
            rectF.setEmpty();
            this.E = 0.0f;
            this.F = 0.0f;
            this.G = 0.0f;
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float f6 = paddingEnd - paddingStart;
        float f10 = paddingBottom - paddingTop;
        if (f10 <= 0.0f || f6 <= 0.0f) {
            rectF.setEmpty();
            this.E = 0.0f;
            this.F = 0.0f;
            this.G = 0.0f;
            return;
        }
        float f11 = (f10 / 2.0f) + paddingTop;
        this.E = f11;
        float f12 = this.f7363l;
        float f13 = paddingStart + f12;
        this.F = f13;
        float f14 = paddingEnd - f12;
        this.G = f14;
        if (f13 > f14) {
            this.E = 0.0f;
            this.F = 0.0f;
            this.G = 0.0f;
        }
        rectF.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
        this.C = new LinearGradient(paddingStart, f11, paddingEnd, f11, this.A, (float[]) null, Shader.TileMode.CLAMP);
        invalidate();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f7361i0.computeScrollOffset()) {
            this.f7357g0 = r0.getCurrY();
            float maxScroll = getMaxScroll();
            if (this.f7357g0 < 0.0f) {
                this.f7357g0 = 0.0f;
            }
            if (this.f7357g0 > maxScroll) {
                this.f7357g0 = maxScroll;
            }
            invalidate();
        }
    }

    @Nullable
    public final Function1<Integer, Bitmap> getBitmapProviderIconRes() {
        return this.bitmapProviderIconRes;
    }

    @Nullable
    public final Function1<String, Bitmap> getBitmapProviderLogo() {
        return this.bitmapProviderLogo;
    }

    @Nullable
    public final Function1<Integer, Unit> getBitmapRequesterIconRes() {
        return this.bitmapRequesterIconRes;
    }

    @Nullable
    public final Function1<String, Unit> getBitmapRequesterLogo() {
        return this.bitmapRequesterLogo;
    }

    @Nullable
    public final k getDataDrawerMenu() {
        return this.dataDrawerMenu;
    }

    @Nullable
    public final l getListenerDrawerMenu() {
        return this.listenerDrawerMenu;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        b(getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.listenerDrawerMenu = null;
        this.dataDrawerMenu = null;
        this.bitmapProviderLogo = null;
        this.bitmapRequesterLogo = null;
        this.bitmapProviderIconRes = null;
        this.bitmapRequesterIconRes = null;
        this.j.setEmpty();
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04b6 A[LOOP:1: B:143:0x029f->B:156:0x04b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0256 A[LOOP:0: B:19:0x0086->B:34:0x0256, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x04bb A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i5;
        float f6;
        int i10;
        int i11;
        int i12;
        Pair pair;
        Pair pair2;
        int save;
        String str;
        TextPaint textPaint;
        float f10;
        float f11;
        TextPaint textPaint2;
        u uVar;
        u uVar2;
        float f12;
        Pair M;
        Integer num;
        a aVar;
        LinkedHashSet linkedHashSet = this.f7351b;
        TextPaint textPaint3 = this.f7377u;
        Integer valueOf = Integer.valueOf(R.drawable.ic_apps);
        Paint paint = this.f7381y;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.j;
        if (rectF.isEmpty()) {
            return;
        }
        canvas.drawColor(this.B);
        float f13 = rectF.left + this.q;
        float f14 = this.f7362k / 2.0f;
        float f15 = -this.f7357g0;
        k kVar = this.dataDrawerMenu;
        int i13 = kVar != null ? ((MainActivity) kVar).G().f21740l : 0;
        if (i13 == 0) {
            float f16 = f15;
            float f17 = f14 - textPaint3.getFontMetrics().descent;
            k kVar2 = this.dataDrawerMenu;
            if (kVar2 == null) {
                return;
            }
            c G = ((MainActivity) kVar2).G();
            int i14 = G.f21741m;
            if (G.f21739k) {
                i14--;
            }
            if (i14 * this.f7362k <= getHeight()) {
                this.f7357g0 = 0.0f;
                f16 = 0.0f;
            }
            if (i14 <= 0 || i14 - 1 < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                int i16 = i15 + 1;
                k kVar3 = this.dataDrawerMenu;
                if (kVar3 != null) {
                    c G2 = ((MainActivity) kVar3).G();
                    Integer valueOf2 = Integer.valueOf(R.drawable.ic_live);
                    String str2 = G2.f21737h;
                    Integer valueOf3 = Integer.valueOf(R.drawable.ic_si_academy);
                    Integer valueOf4 = Integer.valueOf(R.drawable.ic_bonus);
                    f6 = f17;
                    Integer valueOf5 = Integer.valueOf(R.drawable.ic_archive);
                    i10 = i5;
                    Integer valueOf6 = Integer.valueOf(R.drawable.ic_tarif);
                    i11 = i15;
                    Integer valueOf7 = Integer.valueOf(R.drawable.ic_support);
                    TextPaint textPaint4 = textPaint3;
                    Integer valueOf8 = Integer.valueOf(R.drawable.ic_setting);
                    if (G2.f21739k) {
                        switch (i11) {
                            case 0:
                                pair = new Pair(valueOf, c.g());
                                break;
                            case 1:
                                pair = new Pair(valueOf2, c.h());
                                break;
                            case 2:
                                pair = new Pair(valueOf3, str2);
                                break;
                            case 3:
                                pair = new Pair(valueOf4, c.i());
                                break;
                            case 4:
                                pair2 = new Pair(valueOf5, c.f());
                                break;
                            case 5:
                                pair = new Pair(valueOf6, c.j());
                                break;
                            case 6:
                                pair = new Pair(valueOf7, c.l());
                                break;
                            case 7:
                                pair = new Pair(valueOf8, c.k());
                                break;
                        }
                        pair = pair2;
                        if (pair == null) {
                        }
                        if (pair != null) {
                        }
                    } else {
                        switch (i11) {
                            case 0:
                                pair = new Pair(valueOf, c.g());
                                break;
                            case 1:
                                pair = new Pair(valueOf2, c.h());
                                break;
                            case 2:
                                pair = new Pair(valueOf3, str2);
                                break;
                            case 3:
                                pair = new Pair(valueOf4, c.i());
                                break;
                            case 4:
                                Integer valueOf9 = Integer.valueOf(R.drawable.ic_monetization);
                                String str3 = d.f9945a;
                                String c2 = i.c();
                                int hashCode = c2.hashCode();
                                if (hashCode == 3201) {
                                    if (c2.equals("de")) {
                                        str = "Persönlicher Bonus";
                                        pair = new Pair(valueOf9, str);
                                    }
                                    str = "Personal bonus";
                                    pair = new Pair(valueOf9, str);
                                } else if (hashCode == 3246) {
                                    if (c2.equals("es")) {
                                        str = "Bono personal";
                                        pair = new Pair(valueOf9, str);
                                    }
                                    str = "Personal bonus";
                                    pair = new Pair(valueOf9, str);
                                } else if (hashCode == 3276) {
                                    if (c2.equals("fr")) {
                                        str = "Bonus personnel";
                                        pair = new Pair(valueOf9, str);
                                    }
                                    str = "Personal bonus";
                                    pair = new Pair(valueOf9, str);
                                } else if (hashCode == 3588) {
                                    if (c2.equals("pt")) {
                                        str = "Bônus pessoal";
                                        pair = new Pair(valueOf9, str);
                                    }
                                    str = "Personal bonus";
                                    pair = new Pair(valueOf9, str);
                                } else if (hashCode != 3651) {
                                    if (hashCode == 3710 && c2.equals("tr")) {
                                        str = "Kişisel bonus";
                                        pair = new Pair(valueOf9, str);
                                        break;
                                    }
                                    str = "Personal bonus";
                                    pair = new Pair(valueOf9, str);
                                } else {
                                    if (c2.equals("ru")) {
                                        str = "Персональный бонус";
                                        pair = new Pair(valueOf9, str);
                                    }
                                    str = "Personal bonus";
                                    pair = new Pair(valueOf9, str);
                                }
                                break;
                            case 5:
                                pair2 = new Pair(valueOf5, c.f());
                                break;
                            case 6:
                                pair = new Pair(valueOf6, c.j());
                                break;
                            case 7:
                                pair = new Pair(valueOf7, c.l());
                                break;
                            case 8:
                                pair = new Pair(valueOf8, c.k());
                                break;
                            default:
                                pair = null;
                                break;
                        }
                        pair = pair2;
                        if (pair == null) {
                            pair = null;
                        }
                        if (pair != null) {
                            textPaint3 = textPaint4;
                        } else {
                            Integer num2 = (Integer) pair.f19192a;
                            String str4 = (String) pair.f19193b;
                            if (str4 == null) {
                                i5 = i10;
                                i12 = i11;
                                textPaint3 = textPaint4;
                                if (i12 != i5) {
                                    return;
                                }
                                i15 = i16;
                                f17 = f6;
                            } else {
                                float f18 = i16;
                                a(canvas, (this.f7362k * f18) + f16);
                                try {
                                    if (num2 != null) {
                                        int intValue = num2.intValue();
                                        Function1 function1 = this.bitmapProviderIconRes;
                                        Bitmap bitmap = function1 != null ? (Bitmap) function1.invoke(Integer.valueOf(intValue)) : null;
                                        if (bitmap != null) {
                                            float f19 = this.f7365m;
                                            float f20 = (((this.f7362k * f18) - f14) - (this.f7369o / 2.0f)) + f16;
                                            save = canvas.save();
                                            canvas.translate(f19, f20);
                                            try {
                                                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                                                canvas.restoreToCount(save);
                                            } finally {
                                            }
                                        } else if (!linkedHashSet.contains(Integer.valueOf(intValue))) {
                                            linkedHashSet.add(Integer.valueOf(intValue));
                                            post(new b(intValue, 2, this));
                                            float f21 = ((this.f7362k * f18) - f6) + f16;
                                            save = canvas.save();
                                            canvas.translate(f13, f21);
                                            textPaint3 = textPaint4;
                                            canvas.drawText(str4, 0.0f, 0.0f, textPaint3);
                                            i5 = i10;
                                            i12 = i11;
                                            if (i12 != i5) {
                                            }
                                        }
                                    }
                                    canvas.drawText(str4, 0.0f, 0.0f, textPaint3);
                                    i5 = i10;
                                    i12 = i11;
                                    if (i12 != i5) {
                                    }
                                } finally {
                                }
                                float f212 = ((this.f7362k * f18) - f6) + f16;
                                save = canvas.save();
                                canvas.translate(f13, f212);
                                textPaint3 = textPaint4;
                            }
                        }
                    }
                } else {
                    f6 = f17;
                    i10 = i5;
                    i11 = i15;
                }
                i5 = i10;
                i12 = i11;
                if (i12 != i5) {
                }
            }
        } else {
            if (i13 != 1) {
                return;
            }
            TextPaint textPaint5 = this.f7379w;
            TextPaint textPaint6 = this.f7378v;
            k kVar4 = this.dataDrawerMenu;
            if (kVar4 == null) {
                return;
            }
            List list = (List) d1.a(((MainActivity) kVar4).G().f21732c).d();
            int size = list != null ? list.size() : 0;
            if (size + 2 <= 0) {
                return;
            }
            float f22 = f14 - textPaint6.getFontMetrics().descent;
            float f23 = f14 - textPaint5.getFontMetrics().descent;
            int i17 = size + 1;
            if (i17 < 0) {
                return;
            }
            int i18 = 0;
            while (true) {
                int i19 = i18 + 1;
                k kVar5 = this.dataDrawerMenu;
                if (kVar5 != null) {
                    c G3 = ((MainActivity) kVar5).G();
                    if (i18 != 0) {
                        textPaint = textPaint5;
                        if (i18 != 1) {
                            int i20 = i18 - 2;
                            if (i20 < 0) {
                                G3.getClass();
                                f10 = f14;
                            } else {
                                f10 = f14;
                                List list2 = (List) d1.a(G3.f21732c).d();
                                int size2 = list2 != null ? list2.size() : 0;
                                if (size2 > 0 && i20 < size2) {
                                    List list3 = (List) d1.a(G3.f21732c).d();
                                    if (list3 == null || (aVar = (a) CollectionsKt.G(i20, list3)) == null) {
                                        f11 = f15;
                                        uVar = null;
                                        uVar2 = null;
                                    } else {
                                        f11 = f15;
                                        uVar = null;
                                        uVar2 = new u(null, aVar.f18992c, aVar.f18991b);
                                    }
                                }
                            }
                            f11 = f15;
                            uVar2 = null;
                            uVar = null;
                        } else {
                            f10 = f14;
                            f11 = f15;
                            uVar = null;
                            G3.getClass();
                            uVar2 = new u(null, null, c.e());
                        }
                    } else {
                        textPaint = textPaint5;
                        f10 = f14;
                        f11 = f15;
                        uVar = null;
                        G3.getClass();
                        uVar2 = new u(valueOf, null, c.g());
                    }
                    if (uVar2 == null) {
                        uVar2 = uVar;
                    }
                    if (uVar2 != null) {
                        Integer num3 = (Integer) uVar2.f10039a;
                        String str5 = (String) uVar2.f10040b;
                        String str6 = (String) uVar2.f10041c;
                        float f24 = i19;
                        a(canvas, (this.f7362k * f24) + f11);
                        if (str5 != null) {
                            Function1 function12 = this.bitmapProviderLogo;
                            Bitmap bitmap2 = function12 != null ? (Bitmap) function12.invoke(str5) : null;
                            if (bitmap2 != null) {
                                float f25 = this.f7365m;
                                f12 = f24;
                                float f26 = (((this.f7362k * f12) - f10) - (this.f7369o / 2.0f)) + f11;
                                textPaint2 = textPaint6;
                                save = canvas.save();
                                canvas.translate(f25, f26);
                                try {
                                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                                    canvas.restoreToCount(save);
                                } finally {
                                }
                            } else {
                                f12 = f24;
                                textPaint2 = textPaint6;
                                LinkedHashSet linkedHashSet2 = this.f7350a;
                                if (!linkedHashSet2.contains(str5)) {
                                    linkedHashSet2.add(str5);
                                    post(new io.sentry.android.replay.util.c(19, this, str5));
                                }
                            }
                        } else {
                            f12 = f24;
                            textPaint2 = textPaint6;
                        }
                        if (num3 != null) {
                            int intValue2 = num3.intValue();
                            Function1 function13 = this.bitmapProviderIconRes;
                            Bitmap bitmap3 = function13 != null ? (Bitmap) function13.invoke(Integer.valueOf(intValue2)) : null;
                            if (bitmap3 != null) {
                                float f27 = this.f7365m;
                                float f28 = (((this.f7362k * f12) - f10) - (this.f7369o / 2.0f)) + f11;
                                save = canvas.save();
                                canvas.translate(f27, f28);
                                try {
                                    canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
                                } finally {
                                }
                            } else if (!linkedHashSet.contains(Integer.valueOf(intValue2))) {
                                linkedHashSet.add(Integer.valueOf(intValue2));
                                post(new b(intValue2, 2, this));
                            }
                        }
                        if (str6 == null) {
                            return;
                        }
                        k kVar6 = this.dataDrawerMenu;
                        this.J = (kVar6 == null || (num = (Integer) d1.a(((MainActivity) kVar6).I().f21876p).d()) == null) ? 0 : num.intValue();
                        k kVar7 = this.dataDrawerMenu;
                        int intValue3 = (kVar7 == null || (M = ((MainActivity) kVar7).M(i18)) == null) ? 0 : ((Number) M.f19192a).intValue();
                        int i21 = this.J;
                        float f29 = ((intValue3 != i21 || i21 <= 0) ? 0.0f : this.f7367n) + f13;
                        float f30 = ((this.f7362k * f12) - (i18 == 0 ? f22 : f23)) + f11;
                        save = canvas.save();
                        canvas.translate(f29, f30);
                        try {
                            canvas.drawText(str6, 0.0f, 0.0f, i18 == 0 ? textPaint2 : textPaint);
                            if (i18 != i17) {
                                return;
                            }
                            i18 = i19;
                            textPaint5 = textPaint;
                            f14 = f10;
                            f15 = f11;
                            textPaint6 = textPaint2;
                        } finally {
                        }
                    }
                } else {
                    textPaint = textPaint5;
                    f10 = f14;
                    f11 = f15;
                }
                textPaint2 = textPaint6;
                if (i18 != i17) {
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        int i11;
        int i12;
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        String str = this.f7368n0;
        TextPaint textPaint = this.f7377u;
        int max = Math.max((int) textPaint.measureText(str), (int) textPaint.measureText(this.f7370o0));
        this.f7375s = max;
        this.f7376t = this.q + this.f7374r + max;
        int max2 = (int) (Math.max(this.f7371p, this.f7376t) + getPaddingRight() + getPaddingLeft());
        float paddingBottom = getPaddingBottom() + getPaddingTop();
        k kVar = this.dataDrawerMenu;
        if (kVar != null) {
            c G = ((MainActivity) kVar).G();
            i11 = G.f21741m;
            if (G.f21739k) {
                i11--;
            }
        } else {
            i11 = 0;
        }
        k kVar2 = this.dataDrawerMenu;
        if (kVar2 != null) {
            List list = (List) d1.a(((MainActivity) kVar2).G().f21732c).d();
            i12 = (list != null ? list.size() : 0) + 2;
        } else {
            i12 = 0;
        }
        int max3 = (int) ((this.f7362k * Math.max(i11, i12)) + paddingBottom);
        if (mode == Integer.MIN_VALUE) {
            if (max2 < 0) {
                max2 = 0;
            }
            size = Math.min(max2, size);
        } else if (mode != 1073741824) {
            size = max2 < 0 ? 0 : max2;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(max3 >= 0 ? max3 : 0, size2);
        } else if (mode2 != 1073741824) {
            size2 = max3 < 0 ? 0 : max3;
        }
        Integer valueOf = Integer.valueOf(size);
        Integer valueOf2 = Integer.valueOf(size2);
        int resolveSize = View.resolveSize(valueOf.intValue(), i5);
        int resolveSize2 = View.resolveSize(valueOf2.intValue(), i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        b(resolveSize, resolveSize2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        Paint paint = this.f7382z;
        if (i11 == i5 && i12 == i10) {
            LinearGradient linearGradient = this.C;
            if (linearGradient != null) {
                paint.setShader(linearGradient);
            }
            invalidate();
            return;
        }
        b(i5, i10);
        LinearGradient linearGradient2 = this.C;
        if (linearGradient2 != null) {
            paint.setShader(linearGradient2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017b, code lost:
    
        if (r3.f21739k != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0166, code lost:
    
        if (r3.f21739k != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0169, code lost:
    
        r5 = "onSettings";
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016d, code lost:
    
        if (r3.f21739k != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0170, code lost:
    
        r5 = "onSupport";
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0174, code lost:
    
        if (r3.f21739k != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0177, code lost:
    
        r5 = "onRates";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.sports.insider.ui.activities.MainActivity] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Integer] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i5;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        boolean z5;
        k kVar;
        Pair M;
        int i10;
        ?? r5;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        OverScroller overScroller = this.f7361i0;
        if (actionMasked == 0) {
            overScroller.forceFinished(true);
            VelocityTracker velocityTracker3 = this.j0;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            obtain.addMovement(motionEvent);
            this.j0 = obtain;
            this.H = motionEvent.getX();
            this.I = motionEvent.getY();
            this.f7359h0 = motionEvent.getY();
            this.L = false;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                VelocityTracker velocityTracker4 = this.j0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                }
                this.j0 = null;
                this.L = false;
                return true;
            }
            VelocityTracker velocityTracker5 = this.j0;
            if (velocityTracker5 != null) {
                velocityTracker5.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.H;
            float y5 = motionEvent.getY() - this.I;
            float y10 = motionEvent.getY() - this.f7359h0;
            if (!this.L && (Math.abs(y5) > this.K || Math.abs(x10) > this.K)) {
                this.L = true;
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.L) {
                int maxScroll = getMaxScroll();
                float f6 = this.f7357g0 - y10;
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                float f10 = maxScroll;
                if (f6 > f10) {
                    f6 = f10;
                }
                this.f7357g0 = f6;
                invalidate();
            }
            this.f7359h0 = motionEvent.getY();
            return true;
        }
        VelocityTracker velocityTracker6 = this.j0;
        if (velocityTracker6 != null) {
            velocityTracker6.addMovement(motionEvent);
            velocityTracker6.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
            int yVelocity = (int) velocityTracker6.getYVelocity();
            if (Math.abs(yVelocity) > ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity()) {
                velocityTracker = null;
                i5 = 2;
                overScroller.fling(0, (int) this.f7357g0, 0, -yVelocity, 0, 0, 0, getMaxScroll(), 0, (int) this.k0);
                invalidate();
                velocityTracker2 = this.j0;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                }
                this.j0 = velocityTracker;
                if (!this.L) {
                    float f11 = this.H;
                    float f12 = this.I;
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    float f13 = this.f7357g0;
                    RectF rectF = this.j;
                    int i11 = -1;
                    if (!rectF.isEmpty()) {
                        float f14 = rectF.left;
                        float f15 = rectF.right;
                        if (x11 <= f15 && f14 <= x11 && f11 <= f15 && f14 <= f11) {
                            float f16 = f12 + f13;
                            float f17 = y11 + f13;
                            if (Math.abs(f17 - f16) <= this.K) {
                                i11 = (int) (((f16 + f17) / i5) / this.f7362k);
                            }
                        }
                    }
                    if (i11 >= 0) {
                        k kVar2 = this.dataDrawerMenu;
                        ?? valueOf = kVar2 != null ? Integer.valueOf(((MainActivity) kVar2).G().f21740l) : velocityTracker;
                        if (valueOf != 0 && valueOf.intValue() == 0) {
                            k kVar3 = this.dataDrawerMenu;
                            if (kVar3 != null) {
                                c G = ((MainActivity) kVar3).G();
                                G.getClass();
                                String str = "onFavorite";
                                switch (i11) {
                                    case 0:
                                        r5 = "onKind";
                                        break;
                                    case 1:
                                        r5 = "onLive";
                                        break;
                                    case 2:
                                        r5 = "onSiAcademy";
                                        break;
                                    case 3:
                                        r5 = "onMyBonuses";
                                        break;
                                    case 4:
                                        r5 = str;
                                        if (!G.f21739k) {
                                            r5 = "onPersonalBonus";
                                            break;
                                        }
                                        break;
                                    case 5:
                                        r5 = str;
                                        break;
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        break;
                                    default:
                                        r5 = velocityTracker;
                                        break;
                                }
                                if (r5 == 0) {
                                    r5 = velocityTracker;
                                }
                                if (r5 != 0) {
                                    if (Intrinsics.areEqual((Object) r5, "onKind")) {
                                        k kVar4 = this.dataDrawerMenu;
                                        if (kVar4 != null) {
                                            ((MainActivity) kVar4).G().f21740l = 1;
                                        }
                                        invalidate();
                                    }
                                    l lVar = this.listenerDrawerMenu;
                                    if (lVar != null) {
                                        ((MainActivity) lVar).P(r5);
                                    }
                                    playSoundEffect(0);
                                }
                            }
                        } else if (valueOf != 0 && valueOf.intValue() == 1 && (kVar = this.dataDrawerMenu) != null && (M = ((MainActivity) kVar).M(i11)) != null) {
                            int intValue = ((Number) M.f19192a).intValue();
                            String str2 = (String) M.f19193b;
                            if (i11 != 0 && i11 != 1) {
                                k kVar5 = this.dataDrawerMenu;
                                if (kVar5 != null) {
                                    ((MainActivity) kVar5).G().f21740l = 0;
                                }
                                this.J = intValue;
                                invalidate();
                                l lVar2 = this.listenerDrawerMenu;
                                if (lVar2 != null) {
                                    MainActivity mainActivity = (MainActivity) lVar2;
                                    mainActivity.P("onKindOtherSport");
                                    mainActivity.H().f();
                                    mainActivity.B();
                                    mainActivity.O(Integer.valueOf(intValue), str2);
                                }
                            } else if (Intrinsics.areEqual(str2, "onKind")) {
                                k kVar6 = this.dataDrawerMenu;
                                if (kVar6 != null) {
                                    ((MainActivity) kVar6).G().f21740l = 0;
                                }
                                invalidate();
                                l lVar3 = this.listenerDrawerMenu;
                                if (lVar3 != null) {
                                    ((MainActivity) lVar3).P("onKind");
                                }
                            } else if (Intrinsics.areEqual(str2, "onKindAllSport")) {
                                k kVar7 = this.dataDrawerMenu;
                                if (kVar7 != null) {
                                    i10 = 0;
                                    ((MainActivity) kVar7).G().f21740l = 0;
                                } else {
                                    i10 = 0;
                                }
                                this.J = i10;
                                invalidate();
                                l lVar4 = this.listenerDrawerMenu;
                                if (lVar4 != null) {
                                    MainActivity mainActivity2 = (MainActivity) lVar4;
                                    mainActivity2.P("onKindOtherSport");
                                    mainActivity2.H().f();
                                    mainActivity2.B();
                                    mainActivity2.O(Integer.valueOf(intValue), str2);
                                }
                            }
                            z5 = false;
                            playSoundEffect(0);
                            this.L = z5;
                            return true;
                        }
                    }
                }
                z5 = false;
                this.L = z5;
                return true;
            }
        }
        i5 = 2;
        velocityTracker = null;
        velocityTracker2 = this.j0;
        if (velocityTracker2 != null) {
        }
        this.j0 = velocityTracker;
        if (!this.L) {
        }
        z5 = false;
        this.L = z5;
        return true;
    }

    public final void setBitmapProviderIconRes(@Nullable Function1<? super Integer, Bitmap> function1) {
        this.bitmapProviderIconRes = function1;
    }

    public final void setBitmapProviderLogo(@Nullable Function1<? super String, Bitmap> function1) {
        this.bitmapProviderLogo = function1;
    }

    public final void setBitmapRequesterIconRes(@Nullable Function1<? super Integer, Unit> function1) {
        this.bitmapRequesterIconRes = function1;
    }

    public final void setBitmapRequesterLogo(@Nullable Function1<? super String, Unit> function1) {
        this.bitmapRequesterLogo = function1;
    }

    public final void setDataDrawerMenu(@Nullable k kVar) {
        this.dataDrawerMenu = kVar;
    }

    public final void setListenerDrawerMenu(@Nullable l lVar) {
        this.listenerDrawerMenu = lVar;
    }
}
