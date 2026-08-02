package com.vk.newsfeed.common.views.header;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.feed.core.models.attachment.EntryPhotoStyle;
import com.vk.imageloader.view.VKMultiImageView;
import com.vk.newsfeed.common.R$styleable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.abg0;
import xsna.am;
import xsna.an10;
import xsna.baf0;
import xsna.bm;
import xsna.cn70;
import xsna.d540;
import xsna.dhr0;
import xsna.e3m;
import xsna.epx;
import xsna.f5h0;
import xsna.flo;
import xsna.hk;
import xsna.iut0;
import xsna.m33;
import xsna.njt;
import xsna.too0;
import xsna.ts5;
import xsna.x9;
import xsna.y9q;

/* compiled from: HeaderPhotoView.kt */
/* loaded from: classes4.dex */
public final class HeaderPhotoView extends VKMultiImageView implements too0, ts5 {
    public static final /* synthetic */ int O = 0;
    public c A;
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public Drawable E;
    public final GestureDetector F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public float l;
    public boolean m;
    public EntryPhotoStyle n;
    public boolean o;
    public boolean p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final RectF t;
    public final Paint u;
    public String v;
    public Integer w;
    public Integer x;
    public String y;
    public final ColorDrawable z;

    /* compiled from: HeaderPhotoView.kt */
    public final class a extends hk {
        public final C1376a b;

        /* compiled from: HeaderPhotoView.kt */
        /* renamed from: com.vk.newsfeed.common.views.header.HeaderPhotoView$a$a, reason: collision with other inner class name */
        public final class C1376a extends y9q {
            public C1376a(HeaderPhotoView headerPhotoView) {
                super(headerPhotoView);
            }

            @Override // xsna.y9q
            public final int getVirtualViewAt(float f, float f2) {
                HeaderPhotoView headerPhotoView = HeaderPhotoView.this;
                c cVar = headerPhotoView.A;
                Rect rect = headerPhotoView.q;
                Rect rect2 = headerPhotoView.r;
                if (cVar != null) {
                    if (headerPhotoView.getCount() > 1 && !rect2.isEmpty() && rect2.contains(an10.b(f), an10.b(f2)) && cVar.U2()) {
                        cVar.S1();
                        return 2;
                    }
                    if (headerPhotoView.getCount() > 0 && ((headerPhotoView.o || headerPhotoView.getHasAvatarSubscribeButton()) && !rect.isEmpty())) {
                        rect.contains(an10.b(f), an10.b(f2));
                    }
                }
                return -1;
            }

            @Override // xsna.y9q
            public final void getVisibleVirtualViews(List<Integer> list) {
                HeaderPhotoView headerPhotoView = HeaderPhotoView.this;
                c cVar = headerPhotoView.A;
                if (headerPhotoView.getCount() > 0 && !headerPhotoView.o) {
                    headerPhotoView.getHasAvatarSubscribeButton();
                }
                if (cVar == null || headerPhotoView.getCount() <= 1 || !cVar.U2()) {
                    return;
                }
                list.add(2);
            }

            @Override // xsna.y9q
            public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
                c cVar;
                HeaderPhotoView headerPhotoView = HeaderPhotoView.this;
                if (i2 != 16 || i == 1 || i != 2 || (cVar = headerPhotoView.A) == null) {
                    return false;
                }
                return cVar.S1();
            }

            @Override // xsna.y9q
            public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
                HeaderPhotoView headerPhotoView = HeaderPhotoView.this;
                accessibilityEvent.setContentDescription(i != 1 ? i != 2 ? null : headerPhotoView.getResources().getString(R.string.accessibility_header_overlay_image) : headerPhotoView.getResources().getString(R.string.accessibility_post_story_at_avatar));
            }

            @Override // xsna.y9q
            public final void onPopulateNodeForVirtualView(int i, am amVar) {
                HeaderPhotoView headerPhotoView = HeaderPhotoView.this;
                Rect rect = headerPhotoView.q;
                Rect rect2 = headerPhotoView.r;
                Rect rect3 = headerPhotoView.s;
                if (!rect.isEmpty() && i == 1) {
                    amVar.t(true);
                    amVar.o(true);
                    amVar.r(headerPhotoView.getResources().getString(R.string.accessibility_post_story_at_avatar));
                    amVar.j(rect);
                    amVar.a(16);
                } else if (rect2.isEmpty() || i != 2) {
                    amVar.t(false);
                    amVar.o(false);
                    amVar.r("");
                    if (rect.isEmpty()) {
                        rect3.set(0, 0, 1, 1);
                    } else {
                        rect3.set(rect);
                    }
                    amVar.j(rect3);
                    amVar.a(16);
                } else {
                    amVar.t(true);
                    amVar.o(true);
                    amVar.r(headerPhotoView.getResources().getString(R.string.accessibility_header_overlay_image));
                    amVar.j(rect2);
                    amVar.a(16);
                }
                if (amVar.a.getContentDescription() == null) {
                    amVar.r("");
                }
            }
        }

        public a() {
            this.b = new C1376a(HeaderPhotoView.this);
        }

        @Override // xsna.hk
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // xsna.hk
        public final bm getAccessibilityNodeProvider(View view) {
            return this.b.getAccessibilityNodeProvider(view);
        }

        @Override // xsna.hk
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.b.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            this.b.onInitializeAccessibilityNodeInfo(view, amVar);
        }

        @Override // xsna.hk
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.b.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // xsna.hk
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // xsna.hk
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.b.performAccessibilityAction(view, i, bundle);
        }

        @Override // xsna.hk
        public final void sendAccessibilityEvent(View view, int i) {
            this.b.sendAccessibilityEvent(view, i);
        }

        @Override // xsna.hk
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    /* compiled from: HeaderPhotoView.kt */
    public static final class b {
        public static final float a(float f) {
            int i = HeaderPhotoView.O;
            return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
        }
    }

    /* compiled from: HeaderPhotoView.kt */
    public interface c {
        boolean S1();

        boolean U2();
    }

    /* compiled from: HeaderPhotoView.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EntryPhotoStyle.values().length];
            try {
                iArr[EntryPhotoStyle.Squircle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EntryPhotoStyle.Square.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EntryPhotoStyle.Circle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: HeaderPhotoView.kt */
    public final class e extends GestureDetector.SimpleOnGestureListener {
        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            HeaderPhotoView headerPhotoView = HeaderPhotoView.this;
            Rect rect = headerPhotoView.q;
            Rect rect2 = headerPhotoView.r;
            if (headerPhotoView.getCount() > 1 && !rect2.isEmpty() && rect2.contains(an10.b(motionEvent.getX()), an10.b(motionEvent.getY()))) {
                c cVar = headerPhotoView.A;
                if (cVar != null) {
                    return cVar.U2();
                }
            } else if (headerPhotoView.getCount() > 0 && ((headerPhotoView.o || headerPhotoView.getHasAvatarSubscribeButton()) && !rect.isEmpty())) {
                rect.contains(an10.b(motionEvent.getX()), an10.b(motionEvent.getY()));
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            HeaderPhotoView headerPhotoView = HeaderPhotoView.this;
            Rect rect = headerPhotoView.q;
            Rect rect2 = headerPhotoView.r;
            if (headerPhotoView.getCount() > 1 && !rect2.isEmpty() && rect2.contains(an10.b(motionEvent.getX()), an10.b(motionEvent.getY()))) {
                c cVar = headerPhotoView.A;
                if (cVar != null) {
                    return cVar.S1();
                }
            } else if (headerPhotoView.getCount() > 0 && ((headerPhotoView.o || headerPhotoView.getHasAvatarSubscribeButton()) && !rect.isEmpty())) {
                rect.contains(an10.b(motionEvent.getX()), an10.b(motionEvent.getY()));
            }
            return false;
        }
    }

    public HeaderPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = b.a(21.0f);
        this.g = b.a(19.0f);
        float a2 = b.a(2.0f);
        this.h = a2;
        this.i = cn70.a() * 2.0f;
        float a3 = b.a(0.5f);
        this.j = b.a(6.0f);
        this.k = b.a(12.0f);
        this.l = a3;
        this.m = true;
        this.n = EntryPhotoStyle.Circle;
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new RectF();
        Paint c2 = x9.c(true);
        Paint.Style style = Paint.Style.STROKE;
        c2.setStyle(style);
        c2.setStrokeWidth(a2);
        abg0 abg0Var = dhr0.t;
        c2.setColor(abg0Var.c(R.attr.vk_ui_stroke_accent));
        this.u = c2;
        this.z = new ColorDrawable(abg0Var.c(R.attr.vk_ui_background_secondary));
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.vk_black_alpha8));
        paint.setStyle(style);
        paint.setStrokeWidth(this.l);
        this.B = paint;
        this.C = new Paint(3);
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.D = paint2;
        this.F = new GestureDetector(context, new e(), new Handler(Looper.getMainLooper()));
        iut0.q(this, new a());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.e);
        this.G = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.H = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.I = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.J = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.K = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.L = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.M = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.N = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    private final float getCornerRadius() {
        return d.$EnumSwitchMapping$0[this.n.ordinal()] == 1 ? this.k : this.j;
    }

    public static /* synthetic */ void p(HeaderPhotoView headerPhotoView, Integer num, EntryPhotoStyle entryPhotoStyle, int i) {
        if ((i & 16) != 0) {
            entryPhotoStyle = null;
        }
        headerPhotoView.m(null, num, null, null, entryPhotoStyle);
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        this.u.setColor(abg0Var.c(R.attr.vk_ui_stroke_accent));
        this.d = new ColorDrawable(abg0Var.c(R.attr.vk_ui_background_secondary));
        invalidate();
    }

    public final float getBorderWidth() {
        return this.l;
    }

    public final int getCount() {
        return this.b.b.size();
    }

    public final boolean getHasAvatarSubscribeButton() {
        return this.p;
    }

    public final EntryPhotoStyle getMainPhotoStyle() {
        return this.n;
    }

    public final void l(int i, String str) {
        d540<njt> d540Var = this.b;
        flo<njt> a2 = d540Var.a(i);
        if (a2 != null) {
            njt njtVar = a2.d;
            njtVar.getClass();
            njtVar.p(this.z, 1);
        }
        flo<njt> a3 = d540Var.a(i);
        if (a3 != null) {
            njt njtVar2 = a3.d;
            njtVar2.getClass();
            njtVar2.p(null, 0);
        }
        h(i, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(String str, Integer num, String str2, Integer num2, EntryPhotoStyle entryPhotoStyle) {
        Drawable a2;
        if (epx.f(this.v, str) && epx.f(this.w, num) && epx.f(this.v, str2) && epx.f(this.w, num2)) {
            return;
        }
        int i = (num == null && (str == null || str.length() == 0)) ? 0 : 1;
        if (i == 0) {
            setCount(i);
            return;
        }
        if (num2 != null || (str2 != null && str2.length() != 0)) {
            i++;
        }
        setCount(i);
        if (entryPhotoStyle != null) {
            setMainPhotoStyle(entryPhotoStyle);
        }
        this.v = str;
        this.w = num;
        Drawable drawable = null;
        if (num != null) {
            try {
                a2 = dhr0.t.a(num.intValue());
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(th);
            }
            d540<njt> d540Var = this.b;
            if (a2 == null) {
                baf0 baf0Var = new baf0(a2, dhr0.t.c(R.attr.vk_ui_icon_medium));
                j(baf0Var, 0);
                flo<njt> a3 = d540Var.a(0);
                if (a3 != null) {
                    njt njtVar = a3.d;
                    njtVar.getClass();
                    njtVar.p(this.z, 0);
                }
                flo<njt> a4 = d540Var.a(0);
                if (a4 != null) {
                    njt njtVar2 = a4.d;
                    njtVar2.getClass();
                    njtVar2.s(baf0Var, f5h0.g.a);
                }
            } else {
                if (str == null || str.length() == 0) {
                    for (int i2 = 0; i2 < d540Var.b.size(); i2++) {
                        d540Var.a(i2).h(null);
                        this.e.clear();
                    }
                    return;
                }
                l(0, str);
            }
            this.x = num2;
            this.y = str2;
            if (num2 != null) {
                try {
                    drawable = dhr0.t.a(num2.intValue());
                } catch (Throwable th2) {
                    com.vk.metrics.eventtracking.b.a.a(th2);
                }
            }
            if (drawable == null) {
                j(drawable, 1);
                return;
            } else {
                if (str2 == null || str2.length() == 0) {
                    return;
                }
                l(1, str2);
                return;
            }
        }
        a2 = null;
        d540<njt> d540Var2 = this.b;
        if (a2 == null) {
        }
        this.x = num2;
        this.y = str2;
        if (num2 != null) {
        }
        if (drawable == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01d5  */
    @Override // com.vk.imageloader.view.VKMultiImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        Rect rect;
        int i;
        int i2;
        Canvas canvas2;
        Paint paint;
        float f2;
        Rect rect2;
        int i3;
        boolean z;
        Integer num;
        String str;
        float f3;
        float f4;
        Rect rect3;
        float f5;
        Integer num2;
        float f6;
        String str2;
        super.onDraw(canvas);
        float f7 = this.l / 2.0f;
        RectF rectF = this.t;
        rectF.setEmpty();
        int count = getCount();
        d540<njt> d540Var = this.b;
        boolean z2 = count > 1 && d540Var.b.size() > 1;
        int i4 = this.N;
        int i5 = this.L;
        int i6 = this.M;
        Rect rect4 = this.r;
        if (z2) {
            rect4.set(i6 - i5, i4 - i5, i6 + i5, i4 + i5);
            float f8 = rect4.left;
            float f9 = rectF.left;
            if (f8 > f9) {
                f8 = f9;
            }
            float f10 = rect4.top;
            float f11 = rectF.top;
            if (f10 > f11) {
                f10 = f11;
            }
            float f12 = rect4.right;
            float f13 = rectF.right;
            if (f12 < f13) {
                f12 = f13;
            }
            float f14 = rect4.bottom;
            f = 2.0f;
            float f15 = rectF.bottom;
            if (f14 < f15) {
                f14 = f15;
            }
            rectF.set(f8, f10, f12, f14);
        } else {
            f = 2.0f;
            rect4.setEmpty();
        }
        int i7 = z2 ? this.I : this.H;
        boolean z3 = getCount() > 0 && d540Var.b.size() > 0;
        int i8 = i7 * 2;
        Rect rect5 = this.q;
        if (z2) {
            int i9 = this.G;
            int i10 = i8 + i9;
            rect5.set(i9, i9, i10, i10);
            rect = rect4;
            i2 = i9 + i7;
            i = i2;
        } else {
            int i11 = this.J;
            int i12 = this.K;
            rect = rect4;
            rect5.set(i11 - i7, i12 - i7, i11 + i7, i12 + i7);
            i = i12;
            i2 = i11;
        }
        float f16 = rect5.left;
        float f17 = rectF.left;
        if (f16 > f17) {
            f16 = f17;
        }
        float f18 = rect5.top;
        float f19 = rectF.top;
        if (f18 > f19) {
            f18 = f19;
        }
        float f20 = rect5.right;
        float f21 = rectF.right;
        if (f20 < f21) {
            f20 = f21;
        }
        float f22 = rect5.bottom;
        float f23 = rectF.bottom;
        if (f22 < f23) {
            f22 = f23;
        }
        rectF.set(f16, f18, f20, f22);
        Paint paint2 = this.B;
        if (z3) {
            float f24 = z2 ? this.g : this.f;
            boolean z4 = this.o;
            float f25 = this.h;
            if (z4) {
                float f26 = (f25 / f) + f24;
                float f27 = i2;
                float f28 = f27 - f26;
                float f29 = rectF.left;
                if (f28 <= f29) {
                    f29 = f28;
                }
                f3 = f24;
                float f30 = i;
                float f31 = f30 - f26;
                float f32 = rectF.top;
                if (f31 <= f32) {
                    f32 = f31;
                }
                float f33 = f27 + f26;
                float f34 = rectF.right;
                if (f33 < f34) {
                    f33 = f34;
                }
                float f35 = f30 + f26;
                float f36 = rectF.bottom;
                if (f35 >= f36) {
                    f36 = f35;
                }
                rectF.set(f29, f32, f33, f36);
            } else {
                f3 = f24;
            }
            if (z2) {
                f2 = f7;
                f4 = f3;
                rect2 = rect;
                z = z2;
                rect3 = rect5;
                f5 = f25;
                canvas2 = canvas;
                num2 = Integer.valueOf(canvas2.saveLayer(rectF.left, rectF.top, rectF.right, rectF.bottom, this.C));
            } else {
                canvas2 = canvas;
                f2 = f7;
                f4 = f3;
                rect2 = rect;
                z = z2;
                rect3 = rect5;
                f5 = f25;
                num2 = null;
            }
            if (z3) {
                Point point = new Point(i2, i);
                float f37 = point.x;
                float f38 = point.y;
                Drawable d2 = d540Var.a(0).d();
                if (d2 != null) {
                    d2.setBounds(rect3);
                }
                if (d2 != null) {
                    d2.draw(canvas2);
                }
                if (this.w == null && (str2 = this.v) != null && str2.length() != 0) {
                    if (d.$EnumSwitchMapping$0[this.n.ordinal()] == 3) {
                        canvas2.drawCircle(f37, f38, i7 - f2, paint2);
                    } else {
                        float f39 = i7;
                        f6 = f38;
                        i3 = i6;
                        canvas2.drawRoundRect((f37 - f39) + f2, (f38 - f39) + f2, (f37 + f39) - f2, (f39 + f38) - f2, getCornerRadius(), getCornerRadius(), paint2);
                        if (this.o) {
                            int i13 = d.$EnumSwitchMapping$0[this.n.ordinal()];
                            Paint paint3 = this.u;
                            if (i13 == 3) {
                                canvas2.drawCircle(f37, f6, f4, paint3);
                                paint = paint2;
                            } else {
                                float f40 = f6;
                                float f41 = i7;
                                float f42 = f5 / f;
                                paint = paint2;
                                canvas2.drawRoundRect(((f37 - f41) - f5) + f42, ((f40 - f41) - f5) + f42, ((f37 + f41) + f5) - f42, ((f41 + f40) + f5) - f42, getCornerRadius(), getCornerRadius(), paint3);
                            }
                            num = num2;
                        }
                    }
                }
                f6 = f38;
                i3 = i6;
                if (this.o) {
                }
            } else {
                i3 = i6;
            }
            paint = paint2;
            num = num2;
        } else {
            canvas2 = canvas;
            paint = paint2;
            f2 = f7;
            rect2 = rect;
            i3 = i6;
            z = z2;
            num = null;
        }
        if (z) {
            Drawable d3 = d540Var.a(1).d();
            float f43 = i3;
            float f44 = i4;
            float f45 = i5;
            canvas2.drawCircle(f43, f44, this.i + f45, this.D);
            if (d3 != null) {
                d3.setBounds(rect2);
            }
            if (d3 != null) {
                d3.draw(canvas2);
            }
            if (this.x == null && (str = this.y) != null && str.length() != 0) {
                canvas2.drawCircle(f43, f44, f45 - f2, paint);
            }
        }
        if (num != null) {
            canvas2.restoreToCount(num.intValue());
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.getSuperState());
            setBorderWidth(state.b);
            setDrawBorder(state.c);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        State state = new State(super.onSaveInstanceState());
        state.b = this.l;
        state.c = this.m;
        return state;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.A != null ? this.F.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public final void setBorderWidth(float f) {
        float a2 = b.a(f);
        this.l = a2;
        if (a2 == f) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCount(int i) {
        boolean z;
        flo<njt> a2;
        d540<njt> d540Var = this.b;
        if (d540Var.b.size() != i) {
            k();
            for (int i2 = 0; i2 < i; i2++) {
                b();
            }
            ColorDrawable colorDrawable = this.z;
            this.d = colorDrawable;
            ArrayList<flo<njt>> arrayList = d540Var.b;
            if (arrayList.size() > 0) {
                RoundingParams roundingParams = new RoundingParams();
                int i3 = d.$EnumSwitchMapping$0[this.n.ordinal()];
                if (i3 == 1) {
                    roundingParams.f(this.k);
                } else if (i3 == 2) {
                    roundingParams.f(this.j);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    roundingParams.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    z = true;
                    roundingParams.b = z;
                    roundingParams.i = true;
                    a2 = d540Var.a(0);
                    if (a2 != null) {
                        njt njtVar = a2.d;
                        njtVar.getClass();
                        njtVar.u(roundingParams);
                    }
                }
                z = false;
                roundingParams.b = z;
                roundingParams.i = true;
                a2 = d540Var.a(0);
                if (a2 != null) {
                }
            }
            if (arrayList.size() > 1) {
                RoundingParams roundingParams2 = new RoundingParams();
                roundingParams2.b = true;
                roundingParams2.i = true;
                int size = arrayList.size();
                for (int i4 = 1; i4 < size; i4++) {
                    flo<njt> a3 = d540Var.a(i4);
                    if (a3 != null) {
                        njt njtVar2 = a3.d;
                        njtVar2.getClass();
                        njtVar2.p(colorDrawable, 1);
                    }
                    flo<njt> a4 = d540Var.a(i4);
                    if (a4 != null) {
                        njt njtVar3 = a4.d;
                        njtVar3.getClass();
                        njtVar3.u(roundingParams2);
                    }
                }
            }
            invalidate();
        }
    }

    public final void setDrawBorder(boolean z) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        invalidate();
    }

    public void setEmptyImagePlaceholder(int i) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        Context context = getContext();
        e3m.a aVar = e3m.a;
        this.E = m33.a(i, context);
        invalidate();
    }

    public final void setHasAvatarSubscribeButton(boolean z) {
        this.p = z;
    }

    public final void setMainPhotoStyle(EntryPhotoStyle entryPhotoStyle) {
        this.n = entryPhotoStyle;
        d540<njt> d540Var = this.b;
        if (d540Var.b.size() > 0) {
            boolean z = false;
            flo<njt> a2 = d540Var.a(0);
            if (a2 != null) {
                njt njtVar = a2.d;
                njtVar.getClass();
                njt njtVar2 = njtVar;
                RoundingParams roundingParams = njtVar2.c;
                if (roundingParams == null) {
                    roundingParams = new RoundingParams();
                }
                int i = d.$EnumSwitchMapping$0[entryPhotoStyle.ordinal()];
                if (i == 1) {
                    roundingParams.f(this.k);
                } else if (i == 2) {
                    roundingParams.f(this.j);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    roundingParams.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    z = true;
                }
                roundingParams.b = z;
                njtVar2.u(roundingParams);
            }
        }
        invalidate();
    }

    public void setPhotoClickListener(c cVar) {
        this.A = cVar;
    }

    public final void setStoryBorderVisible(boolean z) {
        if (this.o == z) {
            return;
        }
        this.o = z;
        invalidate();
    }

    /* compiled from: HeaderPhotoView.kt */
    public static final class State extends View.BaseSavedState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public float b;
        public boolean c;

        /* compiled from: HeaderPhotoView.kt */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(Parcelable parcelable) {
            super(parcelable);
            int i = HeaderPhotoView.O;
            this.b = b.a(0.5f);
            this.c = true;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public State(Parcel parcel) {
            super(parcel);
            int i = HeaderPhotoView.O;
            this.b = b.a(0.5f);
            this.c = true;
            this.b = parcel.readFloat();
            this.c = parcel.readInt() == 1;
        }
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }
}
