package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import io.sentry.AbstractC4842u3;
import io.sentry.android.replay.f;
import io.sentry.android.replay.util.q;
import io.sentry.android.replay.util.r;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: m, reason: collision with root package name */
    public static final a f51833m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f51834n = 8;

    /* renamed from: a, reason: collision with root package name */
    public final float f51835a;

    /* renamed from: b, reason: collision with root package name */
    public final float f51836b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51837c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51838d;

    /* renamed from: e, reason: collision with root package name */
    public final float f51839e;

    /* renamed from: f, reason: collision with root package name */
    public final int f51840f;

    /* renamed from: g, reason: collision with root package name */
    public final c f51841g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f51842h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f51843i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f51844j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f51845k;

    /* renamed from: l, reason: collision with root package name */
    public List f51846l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(View view, c cVar, int i10, AbstractC4842u3 options) {
            Drawable drawable;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(options, "options");
            Pair g10 = r.g(view);
            boolean booleanValue = ((Boolean) g10.component1()).booleanValue();
            Rect rect = (Rect) g10.component2();
            boolean z10 = booleanValue && e(view, options);
            if (!(view instanceof TextView)) {
                if (view instanceof ImageView) {
                    if (cVar != null) {
                        cVar.h(true);
                    }
                    ImageView imageView = (ImageView) view;
                    return new C0762c(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), (cVar != null ? cVar.a() : 0.0f) + imageView.getElevation(), i10, cVar, z10 && (drawable = imageView.getDrawable()) != null && r.f(drawable), true, booleanValue, rect);
                }
                if (!(view instanceof SurfaceView)) {
                    return new b(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (cVar != null ? cVar.a() : 0.0f) + view.getElevation(), i10, cVar, z10, false, booleanValue, rect);
                }
                if (cVar != null) {
                    cVar.h(true);
                }
                SurfaceView surfaceView = (SurfaceView) view;
                return new d(new WeakReference(view), surfaceView.getX(), surfaceView.getY(), surfaceView.getWidth(), surfaceView.getHeight(), surfaceView.getElevation() + (cVar != null ? cVar.a() : 0.0f), i10, cVar, z10, true, booleanValue, rect);
            }
            if (cVar != null) {
                cVar.h(true);
            }
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            io.sentry.android.replay.util.a aVar = layout != null ? new io.sentry.android.replay.util.a(layout) : null;
            int j10 = r.j(textView.getCurrentTextColor());
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int c10 = r.c(textView);
            float x10 = textView.getX();
            float y10 = textView.getY();
            int width = textView.getWidth();
            float f10 = 0.0f;
            int height = textView.getHeight();
            if (cVar != null) {
                f10 = cVar.a();
            }
            return new e(aVar, Integer.valueOf(j10), totalPaddingLeft, c10, x10, y10, width, height, f10 + textView.getElevation(), i10, cVar, z10, true, booleanValue, rect);
        }

        public final boolean b(Class cls, Set set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        public final boolean c(View view, AbstractC4842u3 abstractC4842u3) {
            String d10 = abstractC4842u3.d();
            if (d10 == null) {
                return false;
            }
            return Intrinsics.areEqual(view.getClass().getName(), d10);
        }

        public final boolean d(ViewParent viewParent, AbstractC4842u3 abstractC4842u3) {
            String f10 = abstractC4842u3.f();
            if (f10 == null) {
                return false;
            }
            return Intrinsics.areEqual(viewParent.getClass().getName(), f10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) "sentry-mask", false, 2, (java.lang.Object) null) == true) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) "sentry-unmask", false, 2, (java.lang.Object) null) == true) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean e(View view, AbstractC4842u3 abstractC4842u3) {
            Object tag = view.getTag();
            String str = tag instanceof String ? (String) tag : null;
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase != null) {
                }
            }
            if (!Intrinsics.areEqual(view.getTag(f.f51602a), "unmask")) {
                Object tag2 = view.getTag();
                String str2 = tag2 instanceof String ? (String) tag2 : null;
                if (str2 != null) {
                    String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    if (lowerCase2 != null) {
                    }
                }
                if (!Intrinsics.areEqual(view.getTag(f.f51602a), "mask")) {
                    if (!c(view, abstractC4842u3) && view.getParent() != null) {
                        ViewParent parent = view.getParent();
                        Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                        if (d(parent, abstractC4842u3)) {
                            return false;
                        }
                    }
                    Class<?> cls = view.getClass();
                    Set e10 = abstractC4842u3.e();
                    Intrinsics.checkNotNullExpressionValue(e10, "getUnmaskViewClasses(...)");
                    if (b(cls, e10)) {
                        return false;
                    }
                    Class<?> cls2 = view.getClass();
                    Set c10 = abstractC4842u3.c();
                    Intrinsics.checkNotNullExpressionValue(c10, "getMaskViewClasses(...)");
                    return b(cls2, c10);
                }
                abstractC4842u3.k();
                return true;
            }
            abstractC4842u3.k();
            return false;
        }

        public a() {
        }
    }

    public static final class b extends c {
        public b(float f10, float f11, int i10, int i11, float f12, int i12, c cVar, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i10, i11, f12, i12, cVar, z10, z11, z12, rect, null);
        }
    }

    /* renamed from: io.sentry.android.replay.viewhierarchy.c$c, reason: collision with other inner class name */
    public static final class C0762c extends c {
        public C0762c(float f10, float f11, int i10, int i11, float f12, int i12, c cVar, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i10, i11, f12, i12, cVar, z10, z11, z12, rect, null);
        }
    }

    public static final class d extends c {

        /* renamed from: o, reason: collision with root package name */
        public final WeakReference f51847o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(WeakReference surfaceViewRef, float f10, float f11, int i10, int i11, float f12, int i12, c cVar, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i10, i11, f12, i12, cVar, z10, z11, z12, rect, null);
            Intrinsics.checkNotNullParameter(surfaceViewRef, "surfaceViewRef");
            this.f51847o = surfaceViewRef;
        }

        public final WeakReference j() {
            return this.f51847o;
        }
    }

    public static final class e extends c {

        /* renamed from: o, reason: collision with root package name */
        public final q f51848o;

        /* renamed from: p, reason: collision with root package name */
        public final Integer f51849p;

        /* renamed from: q, reason: collision with root package name */
        public final int f51850q;

        /* renamed from: r, reason: collision with root package name */
        public final int f51851r;

        public /* synthetic */ e(q qVar, Integer num, int i10, int i11, float f10, float f11, int i12, int i13, float f12, int i14, c cVar, boolean z10, boolean z11, boolean z12, Rect rect, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? null : qVar, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? 0 : i10, (i15 & 8) != 0 ? 0 : i11, f10, f11, i12, i13, f12, i14, (i15 & 1024) != 0 ? null : cVar, (i15 & 2048) != 0 ? false : z10, (i15 & 4096) != 0 ? false : z11, (i15 & 8192) != 0 ? false : z12, (i15 & 16384) != 0 ? null : rect);
        }

        public final Integer j() {
            return this.f51849p;
        }

        public final q k() {
            return this.f51848o;
        }

        public final int l() {
            return this.f51850q;
        }

        public final int m() {
            return this.f51851r;
        }

        public e(q qVar, Integer num, int i10, int i11, float f10, float f11, int i12, int i13, float f12, int i14, c cVar, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i12, i13, f12, i14, cVar, z10, z11, z12, rect, null);
            this.f51848o = qVar;
            this.f51849p = num;
            this.f51850q = i10;
            this.f51851r = i11;
        }
    }

    public /* synthetic */ c(float f10, float f11, int i10, int i11, float f12, int i12, c cVar, boolean z10, boolean z11, boolean z12, Rect rect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, i10, i11, f12, i12, cVar, z10, z11, z12, rect);
    }

    public final float a() {
        return this.f51839e;
    }

    public final int b() {
        return this.f51838d;
    }

    public final boolean c() {
        return this.f51842h;
    }

    public final Rect d() {
        return this.f51845k;
    }

    public final int e() {
        return this.f51837c;
    }

    public final boolean f() {
        return this.f51844j;
    }

    public final void g(List list) {
        this.f51846l = list;
    }

    public final void h(boolean z10) {
        for (c cVar = this.f51841g; cVar != null; cVar = cVar.f51841g) {
            cVar.f51843i = z10;
        }
    }

    public final void i(Function1 callback) {
        List list;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!((Boolean) callback.invoke(this)).booleanValue() || (list = this.f51846l) == null) {
            return;
        }
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((c) it.next()).i(callback);
        }
    }

    public c(float f10, float f11, int i10, int i11, float f12, int i12, c cVar, boolean z10, boolean z11, boolean z12, Rect rect) {
        this.f51835a = f10;
        this.f51836b = f11;
        this.f51837c = i10;
        this.f51838d = i11;
        this.f51839e = f12;
        this.f51840f = i12;
        this.f51841g = cVar;
        this.f51842h = z10;
        this.f51843i = z11;
        this.f51844j = z12;
        this.f51845k = rect;
    }
}
