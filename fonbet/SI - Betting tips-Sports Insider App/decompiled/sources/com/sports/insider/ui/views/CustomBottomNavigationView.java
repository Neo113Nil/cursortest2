package com.sports.insider.ui.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.f1;
import com.sports.insider.R;
import com.sports.insider.ui.activities.MainActivity;
import d2.i;
import gc.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.c;
import ve.j;
import yg.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R.\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/sports/insider/ui/views/CustomBottomNavigationView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lve/j;", "value", "q", "Lve/j;", "getDataProvider", "()Lve/j;", "setDataProvider", "(Lve/j;)V", "dataProvider", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCustomBottomNavigationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomBottomNavigationView.kt\ncom/sports/insider/ui/views/CustomBottomNavigationView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,338:1\n1#2:339\n404#3:340\n404#3:341\n404#3:342\n*S KotlinDebug\n*F\n+ 1 CustomBottomNavigationView.kt\ncom/sports/insider/ui/views/CustomBottomNavigationView\n*L\n115#1:340\n116#1:341\n117#1:342\n*E\n"})
/* loaded from: classes.dex */
public final class CustomBottomNavigationView extends View {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f7260x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float f7261a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7262b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7263c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7264d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7265e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7266f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7267g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7268h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f7269i;
    public final Paint j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f7270k;

    /* renamed from: l, reason: collision with root package name */
    public final TextPaint f7271l;

    /* renamed from: m, reason: collision with root package name */
    public final TextPaint f7272m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f7273n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f7274o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f7275p;

    /* renamed from: q, reason: from kotlin metadata */
    public j dataProvider;

    /* renamed from: r, reason: collision with root package name */
    public int f7276r;

    /* renamed from: s, reason: collision with root package name */
    public float f7277s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f7278t;

    /* renamed from: u, reason: collision with root package name */
    public final DisplayMetrics f7279u;

    /* renamed from: v, reason: collision with root package name */
    public int f7280v;

    /* renamed from: w, reason: collision with root package name */
    public int f7281w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomBottomNavigationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7261a = 1.0f;
        this.f7262b = -1;
        this.f7263c = -1;
        this.f7267g = 4.0f;
        this.f7268h = 8.0f;
        Paint paint = new Paint(1);
        this.f7269i = paint;
        Paint paint2 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.j = paint3;
        Paint paint4 = new Paint(1);
        this.f7270k = paint4;
        TextPaint textPaint = new TextPaint(1);
        this.f7271l = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f7272m = textPaint2;
        this.f7273n = new Rect();
        int i5 = (int) 24.0f;
        Rect rect = new Rect(0, 0, i5, i5);
        this.f7274o = rect;
        this.f7275p = new Rect();
        this.f7277s = 1.0f;
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        this.f7279u = b10;
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        this.f7261a = f6 > 0.0f ? f6 : 1.0f;
        this.f7262b = Color.parseColor("#03F39E");
        this.f7263c = Color.parseColor("#CBCBCB");
        paint.setColor(Color.parseColor("#18012E"));
        int i10 = this.f7263c;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint4.setColorFilter(new PorterDuffColorFilter(i10, mode));
        paint3.setColorFilter(new PorterDuffColorFilter(this.f7262b, mode));
        float f10 = this.f7267g;
        float f11 = this.f7261a;
        this.f7267g = f10 * f11;
        this.f7268h *= f11;
        this.f7264d = 24.0f * f11;
        this.f7265e = a(12.8f);
        this.f7266f = a(12.3f);
        int i11 = (int) this.f7264d;
        rect.set(0, 0, i11, i11);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint.setTextSize(this.f7266f);
        textPaint.setColor(this.f7262b);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint2.setTextAlign(align);
        textPaint2.setTextSize(this.f7265e);
        textPaint2.setColor(this.f7263c);
        textPaint2.setTypeface(Typeface.DEFAULT);
        paint2.setColor(this.f7262b);
        paint2.setAlpha(50);
    }

    public final float a(float f6) {
        DisplayMetrics displayMetrics = this.f7279u;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        return Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, f6, displayMetrics) : f6 * displayMetrics.scaledDensity;
    }

    @Nullable
    public final j getDataProvider() {
        return this.dataProvider;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        int i5;
        super.onAttachedToWindow();
        j jVar = this.dataProvider;
        if (jVar != null) {
            Integer num = (Integer) ((MainActivity) jVar).G().f21742n.d();
            i5 = num != null ? num.intValue() : -1;
        } else {
            i5 = this.f7276r;
        }
        this.f7276r = i5;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setDataProvider(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01af  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Rect rect;
        TextPaint textPaint;
        float f6;
        Pair pair;
        String str;
        Pair pair2;
        TextPaint textPaint2;
        Rect rect2;
        Rect rect3;
        int i5;
        String str2;
        Rect rect4 = this.f7274o;
        Rect rect5 = this.f7273n;
        TextPaint textPaint3 = this.f7272m;
        TextPaint textPaint4 = this.f7271l;
        Rect rect6 = this.f7275p;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f7269i);
        j jVar = this.dataProvider;
        if (jVar == null) {
            return;
        }
        MainActivity mainActivity = (MainActivity) jVar;
        mainActivity.G().getClass();
        Integer num = (Integer) mainActivity.G().f21742n.d();
        this.f7276r = num != null ? num.intValue() : -1;
        int i10 = 5;
        int width = getWidth() / 5;
        int i11 = 0;
        while (i11 < i10) {
            float f10 = (width / 2.0f) + (i11 * width);
            c G = mainActivity.G();
            G.getClass();
            MainActivity mainActivity2 = mainActivity;
            int i12 = width;
            Rect rect7 = rect4;
            if (i11 == 0) {
                rect = rect5;
                textPaint = textPaint4;
                f6 = f10;
                Integer valueOf = Integer.valueOf(R.drawable.ic_category201);
                String str3 = d.f9945a;
                String c2 = i.c();
                int hashCode = c2.hashCode();
                if (hashCode == 3201) {
                    if (c2.equals("de")) {
                        str = "Vorhersagen";
                        pair = new Pair(valueOf, str);
                    }
                    str = "Predictions";
                    pair = new Pair(valueOf, str);
                } else if (hashCode == 3246) {
                    if (c2.equals("es")) {
                        str = "Pronósticos";
                        pair = new Pair(valueOf, str);
                    }
                    str = "Predictions";
                    pair = new Pair(valueOf, str);
                } else if (hashCode == 3276) {
                    if (c2.equals("fr")) {
                        str = "Pronostics";
                        pair = new Pair(valueOf, str);
                    }
                    str = "Predictions";
                    pair = new Pair(valueOf, str);
                } else if (hashCode == 3588) {
                    if (c2.equals("pt")) {
                        str = "Previsões";
                        pair = new Pair(valueOf, str);
                    }
                    str = "Predictions";
                    pair = new Pair(valueOf, str);
                } else if (hashCode != 3651) {
                    if (hashCode == 3710 && c2.equals("tr")) {
                        str = "Tahminler";
                        pair = new Pair(valueOf, str);
                    }
                    str = "Predictions";
                    pair = new Pair(valueOf, str);
                } else {
                    if (c2.equals("ru")) {
                        str = "Прогнозы";
                        pair = new Pair(valueOf, str);
                    }
                    str = "Predictions";
                    pair = new Pair(valueOf, str);
                }
                if (pair2 != null) {
                }
                rect2 = rect7;
                rect3 = rect;
                textPaint2 = textPaint;
                i11++;
                rect5 = rect3;
                rect4 = rect2;
                mainActivity = mainActivity2;
                i10 = 5;
                textPaint4 = textPaint2;
                width = i12;
            } else if (i11 != 1) {
                pair2 = i11 != 2 ? i11 != 3 ? i11 != 4 ? null : new Pair(Integer.valueOf(R.drawable.ic_live), G.j) : new Pair(Integer.valueOf(R.drawable.ic_faq), G.f21738i) : new Pair(Integer.valueOf(R.drawable.ic_tarif), c.j());
                rect = rect5;
                textPaint = textPaint4;
                f6 = f10;
                if (pair2 != null) {
                    int intValue = ((Number) pair2.f19192a).intValue();
                    String str4 = (String) pair2.f19193b;
                    Bitmap bitmap = (Bitmap) mainActivity2.G().f21735f.get(Integer.valueOf(intValue));
                    if (bitmap == null) {
                        mainActivity2.G().m(intValue);
                        Unit unit = Unit.f19194a;
                    }
                    if (i11 != this.f7276r) {
                        float f11 = this.f7268h;
                        if (bitmap != null) {
                            canvas.drawBitmap(bitmap, f6 - (this.f7264d / 2), f11, this.f7270k);
                        }
                        textPaint3.getTextBounds(str4, 0, str4.length(), rect6);
                        canvas.drawText(str4, f6, (rect6.height() + (this.f7280v + ((this.f7281w - this.f7280v) - rect6.height()))) - this.f7267g, textPaint3);
                    } else {
                        float f12 = f6;
                        float f13 = this.f7277s;
                        int i13 = this.f7263c;
                        int i14 = this.f7262b;
                        float f14 = 1.0f - f13;
                        int argb = Color.argb((int) ((Color.alpha(i14) * f13) + (Color.alpha(i13) * f14)), (int) ((Color.red(i14) * f13) + (Color.red(i13) * f14)), (int) ((Color.green(i14) * f13) + (Color.green(i13) * f14)), (int) ((Color.blue(i14) * f13) + (Color.blue(i13) * f14)));
                        float f15 = this.f7265e;
                        float f16 = ((this.f7266f - f15) * f13) + f15;
                        textPaint2 = textPaint;
                        textPaint2.setTextSize(f16);
                        textPaint2.setColor(argb);
                        float f17 = this.f7268h;
                        if (bitmap != null) {
                            float f18 = this.f7264d;
                            float f19 = f18 / 2;
                            int i15 = (int) (f17 + f18);
                            rect3 = rect;
                            rect3.set((int) (f12 - f19), (int) f17, (int) (f19 + f12), i15);
                            rect2 = rect7;
                            i5 = 0;
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect3, this.j);
                        } else {
                            rect2 = rect7;
                            rect3 = rect;
                            i5 = 0;
                        }
                        textPaint2.getTextBounds(str4, i5, str4.length(), rect6);
                        canvas.drawText(str4, f12, (rect6.height() + (this.f7280v + ((this.f7281w - this.f7280v) - rect6.height()))) - this.f7267g, textPaint2);
                        i11++;
                        rect5 = rect3;
                        rect4 = rect2;
                        mainActivity = mainActivity2;
                        i10 = 5;
                        textPaint4 = textPaint2;
                        width = i12;
                    }
                }
                rect2 = rect7;
                rect3 = rect;
                textPaint2 = textPaint;
                i11++;
                rect5 = rect3;
                rect4 = rect2;
                mainActivity = mainActivity2;
                i10 = 5;
                textPaint4 = textPaint2;
                width = i12;
            } else {
                Integer valueOf2 = Integer.valueOf(R.drawable.ic_news);
                String str5 = d.f9945a;
                rect = rect5;
                String c8 = i.c();
                textPaint = textPaint4;
                int hashCode2 = c8.hashCode();
                f6 = f10;
                if (hashCode2 == 3201) {
                    if (c8.equals("de")) {
                        str2 = "Nachrichten";
                        pair = new Pair(valueOf2, str2);
                    }
                    str2 = "News";
                    pair = new Pair(valueOf2, str2);
                } else if (hashCode2 == 3246) {
                    if (c8.equals("es")) {
                        str2 = "Noticias";
                        pair = new Pair(valueOf2, str2);
                    }
                    str2 = "News";
                    pair = new Pair(valueOf2, str2);
                } else if (hashCode2 == 3276) {
                    if (c8.equals("fr")) {
                        str2 = "Actualités";
                        pair = new Pair(valueOf2, str2);
                    }
                    str2 = "News";
                    pair = new Pair(valueOf2, str2);
                } else if (hashCode2 == 3588) {
                    if (c8.equals("pt")) {
                        str2 = "Notícias";
                        pair = new Pair(valueOf2, str2);
                    }
                    str2 = "News";
                    pair = new Pair(valueOf2, str2);
                } else if (hashCode2 != 3651) {
                    if (hashCode2 == 3710 && c8.equals("tr")) {
                        str2 = "Haberler";
                        pair = new Pair(valueOf2, str2);
                    }
                    str2 = "News";
                    pair = new Pair(valueOf2, str2);
                } else {
                    if (c8.equals("ru")) {
                        str2 = "Новости";
                        pair = new Pair(valueOf2, str2);
                    }
                    str2 = "News";
                    pair = new Pair(valueOf2, str2);
                }
                if (pair2 != null) {
                }
                rect2 = rect7;
                rect3 = rect;
                textPaint2 = textPaint;
                i11++;
                rect5 = rect3;
                rect4 = rect2;
                mainActivity = mainActivity2;
                i10 = 5;
                textPaint4 = textPaint2;
                width = i12;
            }
            pair2 = pair;
            if (pair2 != null) {
            }
            rect2 = rect7;
            rect3 = rect;
            textPaint2 = textPaint;
            i11++;
            rect5 = rect3;
            rect4 = rect2;
            mainActivity = mainActivity2;
            i10 = 5;
            textPaint4 = textPaint2;
            width = i12;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        float f6 = this.f7267g;
        float f10 = this.f7268h;
        float f11 = f6 + f10 + f10;
        TextPaint textPaint = this.f7272m;
        float f12 = textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent;
        TextPaint textPaint2 = this.f7271l;
        int max = (int) (Math.max(f12, textPaint2.getFontMetrics().descent - textPaint2.getFontMetrics().ascent) + f11 + this.f7264d);
        setMeasuredDimension(View.MeasureSpec.getSize(i5), max);
        float f13 = this.f7267g;
        float f14 = this.f7268h;
        this.f7280v = (int) (f13 + f14 + this.f7264d);
        this.f7281w = (int) (max - f14);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        j jVar = this.dataProvider;
        if (jVar == null) {
            return false;
        }
        MainActivity mainActivity = (MainActivity) jVar;
        mainActivity.G().getClass();
        int width = getWidth() / 5;
        if (event.getAction() != 0) {
            return super.onTouchEvent(event);
        }
        int x10 = (int) (event.getX() / width);
        if (x10 >= 0 && x10 < 5) {
            if (this.f7276r != x10) {
                this.f7276r = x10;
                mainActivity.S(x10);
                ValueAnimator valueAnimator = this.f7278t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(100L);
                ofFloat.addUpdateListener(new f1(5, this));
                ofFloat.start();
                this.f7278t = ofFloat;
            } else {
                this.f7276r = x10;
                mainActivity.S(x10);
            }
        }
        event.getX();
        event.getY();
        return true;
    }

    public final void setDataProvider(@Nullable j jVar) {
        this.dataProvider = jVar;
        invalidate();
    }
}
