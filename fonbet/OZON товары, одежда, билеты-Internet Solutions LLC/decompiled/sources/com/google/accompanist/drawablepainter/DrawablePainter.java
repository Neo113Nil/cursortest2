package com.google.accompanist.drawablepainter;

import S0.C3991w0;
import S0.D1;
import S0.V0;
import S0.n1;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Z1.s;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import hd.C6915b;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import l1.C7809a0;
import l1.C7845v;
import l1.InterfaceC7802U;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Lq1/b;", "LS0/V0;", "drawablepainter_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DrawablePainter extends AbstractC8972b implements V0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Drawable f57770a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f57771b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f57772c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f57773d;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57774a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f57774a = iArr;
        }
    }

    static final class b extends AbstractC7737t implements Function0<com.google.accompanist.drawablepainter.a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.google.accompanist.drawablepainter.a invoke() {
            return new com.google.accompanist.drawablepainter.a(DrawablePainter.this);
        }
    }

    public DrawablePainter(@NotNull Drawable drawable) {
        C3991w0 f7;
        C3991w0 f11;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f57770a = drawable;
        f7 = n1.f(0, D1.f25195a);
        this.f57771b = f7;
        int i11 = N6.a.f18745b;
        f11 = n1.f(C7464j.a((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : C7465k.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())), D1.f25195a);
        this.f57772c = f11;
        this.f57773d = k.b(new b());
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int a(DrawablePainter drawablePainter) {
        return ((Number) drawablePainter.f57771b.getValue()).intValue();
    }

    public static final void c(DrawablePainter drawablePainter, int i11) {
        drawablePainter.f57771b.setValue(Integer.valueOf(i11));
    }

    public static final void f(DrawablePainter drawablePainter, long j11) {
        drawablePainter.f57772c.setValue(C7464j.a(j11));
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyAlpha(float f7) {
        this.f57770a.setAlpha(h.e(C6915b.c(f7 * 255), 0, 255));
        return true;
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyColorFilter(C7809a0 c7809a0) {
        this.f57770a.setColorFilter(c7809a0 != null ? c7809a0.a() : null);
        return true;
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyLayoutDirection(@NotNull s layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i11 = a.f57774a[layoutDirection.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new o();
        }
        return this.f57770a.setLayoutDirection(i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S0.V0
    public final void b() {
        Drawable.Callback callback = (Drawable.Callback) this.f57773d.getValue();
        Drawable drawable = this.f57770a;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // S0.V0
    public final void d() {
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S0.V0
    public final void e() {
        Drawable drawable = this.f57770a;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @NotNull
    /* renamed from: g, reason: from getter */
    public final Drawable getF57770a() {
        return this.f57770a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q1.AbstractC8972b
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo14getIntrinsicSizeNHjbRc() {
        return ((C7464j) this.f57772c.getValue()).i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q1.AbstractC8972b
    protected final void onDraw(@NotNull InterfaceC8412e interfaceC8412e) {
        Intrinsics.checkNotNullParameter(interfaceC8412e, "<this>");
        InterfaceC7802U a11 = interfaceC8412e.w0().a();
        ((Number) this.f57771b.getValue()).intValue();
        int c11 = C6915b.c(C7464j.f(interfaceC8412e.i()));
        int c12 = C6915b.c(C7464j.d(interfaceC8412e.i()));
        Drawable drawable = this.f57770a;
        drawable.setBounds(0, 0, c11, c12);
        try {
            a11.save();
            drawable.draw(C7845v.b(a11));
        } finally {
            a11.p();
        }
    }
}
