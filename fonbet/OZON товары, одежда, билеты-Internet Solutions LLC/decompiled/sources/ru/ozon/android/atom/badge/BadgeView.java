package ru.ozon.android.atom.badge;

import Fj.f;
import Jj.b;
import Kj.C3529a;
import Kj.C3530b;
import Kj.d;
import Kj.e;
import Lj.a;
import Sc.o;
import Yg.C4894a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;
import java.util.Locale;
import ji.C7430a;
import ji.C7431b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.uikit.extensions.ResourceExtKt;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/android/atom/badge/BadgeView;", "Landroid/view/ViewGroup;", "", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public class BadgeView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private BadgeDTO.BadgeSize f83738a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f83739b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f83740c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f83741d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f83742e;

    /* renamed from: f, reason: collision with root package name */
    private PorterDuffColorFilter f83743f;

    /* renamed from: g, reason: collision with root package name */
    private int f83744g;

    /* renamed from: h, reason: collision with root package name */
    private int f83745h;

    /* renamed from: i, reason: collision with root package name */
    private Bitmap f83746i;

    /* renamed from: j, reason: collision with root package name */
    private PorterDuffColorFilter f83747j;

    /* renamed from: k, reason: collision with root package name */
    private Lj.a f83748k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Paint f83749l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private b f83750m;

    /* renamed from: n, reason: collision with root package name */
    private int f83751n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final TextPaint f83752o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final GradientDrawable f83753p;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83754a;

        static {
            int[] iArr = new int[BadgeDTO.BadgeSize.values().length];
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f83754a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, R.style.Badge_Neutral_Secondary);
        int b11;
        Object a11;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        int color = androidx.core.content.a.getColor(context, R.color.bg_action_primary);
        int color2 = androidx.core.content.a.getColor(context, R.color.text_primary);
        BadgeDTO.BadgeSize badgeSize = BadgeDTO.BadgeSize.SIZE_500;
        this.f83738a = badgeSize;
        this.f83739b = C7431b.a(context);
        this.f83744g = color2;
        this.f83745h = color2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f83749l = paint;
        this.f83750m = new b.C0283b(color);
        this.f83751n = color2;
        TextPaint textPaint = new TextPaint(1);
        this.f83752o = textPaint;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f83750m.applyTo(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setAlpha(26);
        this.f83753p = gradientDrawable2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4894a.f35029a, 0, R.style.Badge_Neutral_Secondary);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f83738a = ((BadgeDTO.BadgeSize[]) BadgeDTO.BadgeSize.getEntries().toArray(new BadgeDTO.BadgeSize[0]))[obtainStyledAttributes.getInt(7, badgeSize.ordinal())];
        float e11 = e();
        float e12 = e();
        float e13 = e();
        float e14 = e();
        gradientDrawable.setCornerRadii(new float[]{e11, e11, e12, e12, e14, e14, e13, e13});
        gradientDrawable2.setCornerRadius(e());
        int i11 = a.f83754a[this.f83738a.ordinal()];
        if (i11 == 1) {
            b11 = f.BODY_200_X_SMALL.b();
        } else if (i11 == 2) {
            b11 = f.BODY_ACCENT_250_CAPTION.b();
        } else if (i11 == 3) {
            b11 = f.BODY_CONTROL_300_X_SMALL.b();
        } else if (i11 == 4) {
            b11 = f.BODY_CONTROL_400_SMALL.b();
        } else {
            if (i11 != 5) {
                throw new o();
            }
            b11 = f.BODY_CONTROL_500_MEDIUM.b();
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        C3529a.a(textPaint, context2, b11);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f83742e = C3530b.a(context3, b11);
        b value = d.a(obtainStyledAttributes, context, 5, 1, color);
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.d(this.f83750m, value)) {
            this.f83750m = value;
            value.applyTo(gradientDrawable);
            invalidate();
        }
        d.a(obtainStyledAttributes, context, 6, 4, color);
        int color3 = obtainStyledAttributes.getColor(8, color2);
        if (this.f83745h != color3) {
            this.f83745h = color3;
            this.f83747j = new PorterDuffColorFilter(this.f83745h, PorterDuff.Mode.SRC_IN);
            invalidate();
        }
        int color4 = obtainStyledAttributes.getColor(9, color2);
        if (this.f83744g != color4) {
            this.f83744g = color4;
            this.f83743f = new PorterDuffColorFilter(this.f83744g, PorterDuff.Mode.SRC_IN);
            invalidate();
        }
        int color5 = obtainStyledAttributes.getColor(0, color2);
        if (this.f83751n != color5) {
            this.f83751n = color5;
            textPaint.setColor(color5);
            gradientDrawable2.setColor(this.f83751n);
            invalidate();
        }
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        CharSequence charSequence = null;
        if (resourceId != 0) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Lj.a a12 = a.C0332a.a(resources, resourceId);
            this.f83748k = a12;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            a11 = ((a.b) a12).a(context4);
            Drawable drawable = (Drawable) a11;
            if (drawable != null) {
                int a13 = a();
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                int a14 = e.a(a13, context5);
                Intrinsics.checkNotNullParameter(drawable, "<this>");
                bitmap = androidx.core.graphics.drawable.b.a(drawable, a14, a14, Bitmap.Config.ARGB_8888);
            } else {
                bitmap = null;
            }
            this.f83746i = bitmap;
            invalidate();
        }
        CharSequence text = obtainStyledAttributes.getText(3);
        if (!this.f83742e) {
            charSequence = text;
        } else if (text != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullParameter(text, "<this>");
            Intrinsics.checkNotNullParameter(locale, "locale");
            charSequence = text.toString().toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(charSequence, "toUpperCase(...)");
        }
        this.f83740c = charSequence;
        if (!C7430a.a()) {
            setContentDescription(this.f83740c);
        }
        sendAccessibilityEvent(2);
        setBackground(gradientDrawable);
        obtainStyledAttributes.recycle();
        if (C7430a.a()) {
            setContentDescription("badge");
        }
    }

    private final int a() {
        int i11 = a.f83754a[this.f83738a.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return 12;
        }
        if (i11 == 3 || i11 == 4 || i11 == 5) {
            return 16;
        }
        throw new o();
    }

    private final int b() {
        int i11 = a.f83754a[this.f83738a.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2 && i11 != 3) {
                i12 = 4;
                if (i11 != 4 && i11 != 5) {
                    throw new o();
                }
            }
        }
        return i12;
    }

    private final int c() {
        int i11 = a.f83754a[this.f83738a.ordinal()];
        if (i11 == 1) {
            CharSequence charSequence = this.f83740c;
            if (charSequence == null || charSequence.length() == 0) {
                return 1;
            }
            return this.f83746i == null ? 3 : 2;
        }
        if (i11 == 2) {
            CharSequence charSequence2 = this.f83740c;
            if (charSequence2 == null || charSequence2.length() == 0) {
                return 2;
            }
            return this.f83746i == null ? 5 : 3;
        }
        if (i11 == 3) {
            CharSequence charSequence3 = this.f83740c;
            if (charSequence3 == null || charSequence3.length() == 0) {
                return 2;
            }
            return this.f83746i == null ? 6 : 4;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                return this.f83746i == null ? 12 : 8;
            }
            throw new o();
        }
        CharSequence charSequence4 = this.f83740c;
        if (charSequence4 == null || charSequence4.length() == 0) {
            return 4;
        }
        return this.f83746i == null ? 8 : 6;
    }

    private final int d() {
        BadgeDTO.BadgeSize badgeSize = this.f83738a;
        Intrinsics.checkNotNullParameter(badgeSize, "<this>");
        int i11 = Zg.a.f35904a[badgeSize.ordinal()];
        if (i11 == 1) {
            return 14;
        }
        if (i11 == 2) {
            return 16;
        }
        if (i11 == 3) {
            return 20;
        }
        if (i11 == 4) {
            return 24;
        }
        if (i11 == 5) {
            return 32;
        }
        throw new o();
    }

    private final float e() {
        int i11;
        if (this.f83739b) {
            i11 = 99;
        } else {
            int i12 = a.f83754a[this.f83738a.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    i11 = 5;
                } else if (i12 != 3) {
                    if (i12 == 4) {
                        i11 = 8;
                    } else {
                        if (i12 != 5) {
                            throw new o();
                        }
                        i11 = 12;
                    }
                }
            }
            i11 = 6;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ResourceExtKt.toPxF(i11, context);
    }

    private final int f() {
        if (!h()) {
            return c();
        }
        int i11 = a.f83754a[this.f83738a.ordinal()];
        if (i11 == 1) {
            CharSequence charSequence = this.f83740c;
            if (charSequence == null || charSequence.length() == 0) {
                return 1;
            }
            return !g() ? 3 : 0;
        }
        if (i11 == 2) {
            return !g() ? 5 : 0;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 == 5) {
                    return !g() ? 12 : 4;
                }
                throw new o();
            }
            if (!g()) {
                return 8;
            }
        } else if (!g()) {
            return 6;
        }
        return 2;
    }

    public final boolean g() {
        return isClickable() && h();
    }

    public final boolean h() {
        CharSequence charSequence = this.f83740c;
        return !(charSequence == null || charSequence.length() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onDraw(@NotNull Canvas canvas) {
        Canvas canvas2;
        float pxF;
        Drawable drawable;
        float pxF2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int d11 = d();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int a11 = e.a(d11, context);
        Bitmap bitmap = this.f83746i;
        Paint paint = this.f83749l;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            Lj.a aVar = this.f83748k;
            paint.setColorFilter((aVar == null || !aVar.isMulticolor()) ? this.f83747j : null);
            if (getHeight() != a11) {
                pxF2 = (getHeight() - bitmap.getHeight()) / 2;
            } else {
                int d12 = (d() - a()) / 2;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                pxF2 = ResourceExtKt.toPxF(d12, context2);
            }
            int c11 = c();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            canvas.drawBitmap(bitmap, ResourceExtKt.toPxF(c11, context3), pxF2, paint);
        }
        CharSequence charSequence = this.f83741d;
        if (charSequence != null) {
            CharSequence charSequence2 = charSequence.length() > 0 ? charSequence : null;
            if (charSequence2 != null) {
                int length = charSequence2.length();
                int c12 = c() + (this.f83748k == null ? 0 : a() + b());
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                float pxF3 = ResourceExtKt.toPxF(c12, context4);
                float height = getHeight() / 2;
                TextPaint textPaint = this.f83752o;
                canvas2 = canvas;
                canvas2.drawText(charSequence2, 0, length, pxF3, height - ((textPaint.ascent() + textPaint.descent()) / 2), textPaint);
                if (g() && (drawable = androidx.core.content.a.getDrawable(getContext(), R.drawable.ic_s_disclosure_compact)) != null) {
                    int a12 = a();
                    Context context5 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    int a13 = e.a(a12, context5);
                    int a14 = a();
                    Context context6 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                    bitmap2 = androidx.core.graphics.drawable.b.a(drawable, a13, e.a(a14, context6), Bitmap.Config.ARGB_8888);
                }
                if (bitmap2 == null) {
                    if (getHeight() != a11) {
                        pxF = (getHeight() - bitmap2.getHeight()) / 2;
                    } else {
                        int d13 = (d() - a()) / 2;
                        Context context7 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                        pxF = ResourceExtKt.toPxF(d13, context7);
                    }
                    float width = getWidth();
                    int a15 = a();
                    Context context8 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                    float pxF4 = width - ResourceExtKt.toPxF(a15, context8);
                    int f7 = f();
                    Context context9 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                    float pxF5 = pxF4 - ResourceExtKt.toPxF(f7, context9);
                    paint.setColorFilter(this.f83743f);
                    Unit unit = Unit.f71690a;
                    canvas2.drawBitmap(bitmap2, pxF5, pxF, paint);
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        if (g()) {
            int a122 = a();
            Context context52 = getContext();
            Intrinsics.checkNotNullExpressionValue(context52, "getContext(...)");
            int a132 = e.a(a122, context52);
            int a142 = a();
            Context context62 = getContext();
            Intrinsics.checkNotNullExpressionValue(context62, "getContext(...)");
            bitmap2 = androidx.core.graphics.drawable.b.a(drawable, a132, e.a(a142, context62), Bitmap.Config.ARGB_8888);
        }
        if (bitmap2 == null) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.setText(this.f83740c);
        }
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.setClassName("android.widget.TextView");
        }
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.setFocusable(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0046  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i11, int i12) {
        int i13;
        CharSequence charSequence;
        float f7;
        float ceil;
        int min;
        int suggestedMinimumWidth;
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        int b11 = h() ? b() : 0;
        if (h()) {
            int i14 = a.f83754a[this.f83738a.ordinal()];
            if (i14 != 1) {
                i13 = 2;
                if (i14 != 2 && i14 != 3) {
                    if (i14 != 4 && i14 != 5) {
                        throw new o();
                    }
                    int c11 = c() + (this.f83748k == null ? a() + b11 : 0) + (!g() ? a() + i13 : 0) + f();
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    int a11 = e.a(c11, context);
                    charSequence = this.f83740c;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    f7 = mode != Integer.MIN_VALUE ? size : Float.MAX_VALUE;
                    int length = charSequence.length();
                    TextPaint textPaint = this.f83752o;
                    ceil = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, length, textPaint));
                    if (ceil <= f7) {
                        f7 = ceil;
                    }
                    int i15 = (int) f7;
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    int i16 = (int) (fontMetrics.descent - fontMetrics.ascent);
                    int d11 = d();
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    int max = Math.max(e.a(d11, context2), i16);
                    min = mode != 0 ? i15 + a11 : Math.min(size, i15 + a11);
                    suggestedMinimumWidth = getSuggestedMinimumWidth();
                    if (min < suggestedMinimumWidth) {
                        min = suggestedMinimumWidth;
                    }
                    if (charSequence.length() <= 0) {
                        CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, min - a11, TextUtils.TruncateAt.END);
                        this.f83741d = ellipsize;
                        CharSequence charSequence2 = ellipsize != null ? ellipsize : "";
                        min = (int) Math.ceil(Math.min(min, textPaint.measureText(charSequence2, 0, charSequence2.length()) + a11));
                    } else {
                        this.f83741d = null;
                    }
                    setMeasuredDimension(min, max);
                }
            }
        }
        i13 = 0;
        if (this.f83748k == null) {
        }
        int c112 = c() + (this.f83748k == null ? a() + b11 : 0) + (!g() ? a() + i13 : 0) + f();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int a112 = e.a(c112, context3);
        charSequence = this.f83740c;
        if (charSequence == null) {
        }
        if (mode != Integer.MIN_VALUE) {
        }
        int length2 = charSequence.length();
        TextPaint textPaint2 = this.f83752o;
        ceil = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, length2, textPaint2));
        if (ceil <= f7) {
        }
        int i152 = (int) f7;
        Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
        int i162 = (int) (fontMetrics2.descent - fontMetrics2.ascent);
        int d112 = d();
        Context context22 = getContext();
        Intrinsics.checkNotNullExpressionValue(context22, "getContext(...)");
        int max2 = Math.max(e.a(d112, context22), i162);
        if (mode != 0) {
        }
        suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (min < suggestedMinimumWidth) {
        }
        if (charSequence.length() <= 0) {
        }
        setMeasuredDimension(min, max2);
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        List<CharSequence> text;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent == null || (text = accessibilityEvent.getText()) == null) {
            return;
        }
        text.add(this.f83740c);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return super.onTouchEvent(motionEvent);
        }
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            setForeground(this.f83753p);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            setForeground(null);
            performClick();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            setForeground(null);
        }
        return true;
    }
}
