package com.swmansion.gesturehandler.react;

import Ic.AbstractC1350d;
import Ic.q;
import Jc.l;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AbstractC2094j0;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerDelegate;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface;
import com.google.crypto.tink.integration.android.b;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(name = RNGestureHandlerButtonViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002ABB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001a\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001bH\u0017¢\u0006\u0004\b$\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001bH\u0017¢\u0006\u0004\b&\u0010\u001eJ\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u001bH\u0017¢\u0006\u0004\b(\u0010\u001eJ!\u0010*\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b0\u0010+J\u001f\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0013H\u0017¢\u0006\u0004\b2\u0010\u0016J\u001f\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u000eH\u0017¢\u0006\u0004\b4\u0010\u0012J\u001f\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000eH\u0017¢\u0006\u0004\b6\u0010\u0012J!\u00108\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b8\u0010.J\u0017\u00109\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010;H\u0014¢\u0006\u0004\b<\u0010=R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "view", "", "useDrawableOnForeground", "", "setForeground", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Z)V", "", ViewProps.BACKGROUND_COLOR, "setBackgroundColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;I)V", "useBorderlessDrawable", "setBorderless", ViewProps.ENABLED, "setEnabled", "", ViewProps.BORDER_RADIUS, "setBorderRadius", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;F)V", ViewProps.BORDER_TOP_LEFT_RADIUS, "setBorderTopLeftRadius", ViewProps.BORDER_TOP_RIGHT_RADIUS, "setBorderTopRightRadius", ViewProps.BORDER_BOTTOM_LEFT_RADIUS, "setBorderBottomLeftRadius", ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, "setBorderBottomRightRadius", ViewProps.BORDER_WIDTH, "setBorderWidth", ViewProps.BORDER_COLOR, "setBorderColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/Integer;)V", "borderStyle", "setBorderStyle", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/String;)V", "rippleColor", "setRippleColor", "rippleRadius", "setRippleRadius", "exclusive", "setExclusive", "touchSoundDisabled", "setTouchSoundDisabled", ViewProps.POINTER_EVENTS, "setPointerEvents", "onAfterUpdateTransaction", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;)V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", b.f37029b, "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> implements RNGestureHandlerButtonManagerInterface<a> {

    @NotNull
    public static final String REACT_CLASS = "RNGestureHandlerButton";

    @NotNull
    private final ViewManagerDelegate<a> mDelegate;

    public static final class a extends ViewGroup implements q.e, ReactPointerEventsView {

        /* renamed from: w, reason: collision with root package name */
        public static a f41586w;

        /* renamed from: x, reason: collision with root package name */
        public static a f41587x;

        /* renamed from: a, reason: collision with root package name */
        public Integer f41589a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f41590b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f41591c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f41592d;

        /* renamed from: e, reason: collision with root package name */
        public float f41593e;

        /* renamed from: f, reason: collision with root package name */
        public float f41594f;

        /* renamed from: g, reason: collision with root package name */
        public float f41595g;

        /* renamed from: h, reason: collision with root package name */
        public float f41596h;

        /* renamed from: i, reason: collision with root package name */
        public float f41597i;

        /* renamed from: j, reason: collision with root package name */
        public float f41598j;

        /* renamed from: k, reason: collision with root package name */
        public Integer f41599k;

        /* renamed from: l, reason: collision with root package name */
        public String f41600l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f41601m;

        /* renamed from: n, reason: collision with root package name */
        public PointerEvents f41602n;

        /* renamed from: o, reason: collision with root package name */
        public int f41603o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f41604p;

        /* renamed from: q, reason: collision with root package name */
        public long f41605q;

        /* renamed from: r, reason: collision with root package name */
        public int f41606r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f41607s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f41608t;

        /* renamed from: u, reason: collision with root package name */
        public static final C0594a f41584u = new C0594a(null);

        /* renamed from: v, reason: collision with root package name */
        public static TypedValue f41585v = new TypedValue();

        /* renamed from: y, reason: collision with root package name */
        public static View.OnClickListener f41588y = new View.OnClickListener() { // from class: Jc.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RNGestureHandlerButtonViewManager.a.n(view);
            }
        };

        /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a$a, reason: collision with other inner class name */
        public static final class C0594a {
            public /* synthetic */ C0594a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0594a() {
            }
        }

        public a(Context context) {
            super(context);
            this.f41600l = "solid";
            this.f41601m = true;
            this.f41602n = PointerEvents.AUTO;
            this.f41605q = -1L;
            this.f41606r = -1;
            setOnClickListener(f41588y);
            setClickable(true);
            setFocusable(true);
            this.f41604p = true;
            setClipChildren(false);
        }

        private final boolean getHasBorderRadii() {
            return (this.f41593e == 0.0f && this.f41594f == 0.0f && this.f41595g == 0.0f && this.f41596h == 0.0f && this.f41597i == 0.0f) ? false : true;
        }

        public static final void n(View view) {
        }

        public static /* synthetic */ boolean q(a aVar, Sequence sequence, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sequence = AbstractC2094j0.a(aVar);
            }
            return aVar.p(sequence);
        }

        @Override // Ic.q.e
        public boolean a() {
            return q.e.a.f(this);
        }

        @Override // Ic.q.e
        public boolean b(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() == 3 || event.getAction() == 1 || event.getActionMasked() == 6) {
                return false;
            }
            boolean s10 = s();
            if (s10) {
                this.f41608t = true;
            }
            return s10;
        }

        @Override // Ic.q.e
        public boolean c() {
            return q.e.a.h(this);
        }

        @Override // Ic.q.e
        public boolean d(View view) {
            return q.e.a.b(this, view);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f10, float f11) {
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f10, float f11) {
            a aVar = f41586w;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f10, f11);
            }
        }

        @Override // Ic.q.e
        public Boolean e(View view, MotionEvent motionEvent) {
            return q.e.a.e(this, view, motionEvent);
        }

        @Override // Ic.q.e
        public Boolean f(AbstractC1350d abstractC1350d) {
            return q.e.a.g(this, abstractC1350d);
        }

        @Override // Ic.q.e
        public void g(MotionEvent motionEvent) {
            q.e.a.d(this, motionEvent);
        }

        public final float getBorderBottomLeftRadius() {
            return this.f41596h;
        }

        public final float getBorderBottomRightRadius() {
            return this.f41597i;
        }

        @Nullable
        public final Integer getBorderColor() {
            return this.f41599k;
        }

        public final float getBorderRadius() {
            return this.f41593e;
        }

        @Nullable
        public final String getBorderStyle() {
            return this.f41600l;
        }

        public final float getBorderTopLeftRadius() {
            return this.f41594f;
        }

        public final float getBorderTopRightRadius() {
            return this.f41595g;
        }

        public final float getBorderWidth() {
            return this.f41598j;
        }

        public final boolean getExclusive() {
            return this.f41601m;
        }

        @Override // com.facebook.react.uimanager.ReactPointerEventsView
        @NotNull
        public PointerEvents getPointerEvents() {
            return this.f41602n;
        }

        @Nullable
        public final Integer getRippleColor() {
            return this.f41589a;
        }

        @Nullable
        public final Integer getRippleRadius() {
            return this.f41590b;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.f41592d;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.f41591c;
        }

        @Override // Ic.q.e
        public void h(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            r();
            this.f41608t = false;
        }

        public final float[] j() {
            float f10 = this.f41594f;
            float f11 = this.f41595g;
            float f12 = this.f41597i;
            float f13 = this.f41596h;
            float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
            ArrayList arrayList = new ArrayList(8);
            for (int i10 = 0; i10 < 8; i10++) {
                float f14 = fArr[i10];
                if (f14 == 0.0f) {
                    f14 = this.f41593e;
                }
                arrayList.add(Float.valueOf(f14));
            }
            return CollectionsKt.toFloatArray(arrayList);
        }

        public final PathEffect k() {
            String str = this.f41600l;
            if (Intrinsics.areEqual(str, "dotted")) {
                float f10 = this.f41598j;
                return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
            }
            if (!Intrinsics.areEqual(str, "dashed")) {
                return null;
            }
            float f11 = this.f41598j;
            float f12 = 3;
            return new DashPathEffect(new float[]{f11 * f12, f11 * f12, f11 * f12, f11 * f12}, 0.0f);
        }

        public final Drawable l() {
            PaintDrawable paintDrawable = new PaintDrawable(0);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(j());
            }
            if (this.f41598j > 0.0f) {
                Paint paint = paintDrawable.getPaint();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.f41598j);
                Integer num = this.f41599k;
                paint.setColor(num != null ? num.intValue() : -16777216);
                paint.setPathEffect(k());
            }
            return paintDrawable;
        }

        public final Drawable m() {
            ColorStateList colorStateList;
            Integer num = this.f41589a;
            if (num != null && num.intValue() == 0) {
                return null;
            }
            int[][] iArr = {new int[]{R.attr.state_enabled}};
            Integer num2 = this.f41590b;
            Integer num3 = this.f41589a;
            if (num3 != null) {
                Intrinsics.checkNotNull(num3);
                colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
            } else {
                getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, f41585v, true);
                colorStateList = new ColorStateList(iArr, new int[]{f41585v.data});
            }
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, null, this.f41592d ? null : new ShapeDrawable(new RectShape()));
            if (num2 != null) {
                rippleDrawable.setRadius((int) PixelUtil.toPixelFromDIP(num2.intValue()));
            }
            return rippleDrawable;
        }

        public final l o() {
            l lVar = null;
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof l) {
                    lVar = (l) parent;
                }
            }
            return lVar;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onInitializeAccessibilityNodeInfo(info);
            Object tag = super.getTag(com.facebook.react.R.id.react_test_id);
            if (tag instanceof String) {
                info.setViewIdResourceName((String) tag);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (super.onInterceptTouchEvent(event)) {
                return true;
            }
            onTouchEvent(event);
            return isPressed();
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i10, KeyEvent keyEvent) {
            this.f41607s = true;
            return super.onKeyUp(i10, keyEvent);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            long eventTime = event.getEventTime();
            int action = event.getAction();
            a aVar = f41586w;
            if (aVar != null && aVar != this) {
                Intrinsics.checkNotNull(aVar);
                if (aVar.f41601m) {
                    if (isPressed()) {
                        setPressed(false);
                    }
                    this.f41605q = eventTime;
                    this.f41606r = action;
                    return false;
                }
            }
            if (event.getAction() == 3) {
                r();
            }
            if (this.f41605q == eventTime && this.f41606r == action && action != 3) {
                return false;
            }
            this.f41605q = eventTime;
            this.f41606r = action;
            return super.onTouchEvent(event);
        }

        public final boolean p(Sequence sequence) {
            Iterator it = sequence.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view instanceof a) {
                    a aVar = (a) view;
                    if (aVar.f41608t || aVar.isPressed()) {
                        return true;
                    }
                }
                if ((view instanceof ViewGroup) && p(AbstractC2094j0.a((ViewGroup) view))) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (!q(this, null, 1, null)) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (Jc.a.d(context)) {
                    l o10 = o();
                    if (o10 != null) {
                        o10.o(this);
                    }
                } else if (this.f41607s) {
                    l o11 = o();
                    if (o11 != null) {
                        o11.o(this);
                    }
                    this.f41607s = false;
                }
                if (f41587x == this) {
                    r();
                    f41587x = null;
                    return super.performClick();
                }
            }
            return false;
        }

        public final void r() {
            if (f41586w == this) {
                f41586w = null;
                f41587x = this;
            }
        }

        public final boolean s() {
            if (q(this, null, 1, null)) {
                return false;
            }
            a aVar = f41586w;
            if (aVar == null) {
                f41586w = this;
                return true;
            }
            if (this.f41601m) {
                return aVar == this;
            }
            return !(aVar != null ? aVar.f41601m : false);
        }

        @Override // android.view.View
        public void setBackgroundColor(int i10) {
            this.f41603o = i10;
            this.f41604p = true;
        }

        public final void setBorderBottomLeftRadius(float f10) {
            this.f41596h = f10 * getResources().getDisplayMetrics().density;
            this.f41604p = true;
        }

        public final void setBorderBottomRightRadius(float f10) {
            this.f41597i = f10 * getResources().getDisplayMetrics().density;
            this.f41604p = true;
        }

        public final void setBorderColor(@Nullable Integer num) {
            this.f41599k = num;
            this.f41604p = true;
        }

        public final void setBorderRadius(float f10) {
            this.f41593e = f10 * getResources().getDisplayMetrics().density;
            this.f41604p = true;
        }

        public final void setBorderStyle(@Nullable String str) {
            this.f41600l = str;
            this.f41604p = true;
        }

        public final void setBorderTopLeftRadius(float f10) {
            this.f41594f = f10 * getResources().getDisplayMetrics().density;
            this.f41604p = true;
        }

        public final void setBorderTopRightRadius(float f10) {
            this.f41595g = f10 * getResources().getDisplayMetrics().density;
            this.f41604p = true;
        }

        public final void setBorderWidth(float f10) {
            this.f41598j = f10 * getResources().getDisplayMetrics().density;
            this.f41604p = true;
        }

        public final void setExclusive(boolean z10) {
            this.f41601m = z10;
        }

        public void setPointerEvents(@NotNull PointerEvents pointerEvents) {
            Intrinsics.checkNotNullParameter(pointerEvents, "<set-?>");
            this.f41602n = pointerEvents;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        
            if (r0.f41601m == true) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        
            if (q(r3, null, 1, null) != false) goto L12;
         */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void setPressed(boolean z10) {
            boolean z11;
            if (!this.f41601m) {
                a aVar = f41586w;
                z11 = true;
                if (aVar != null) {
                }
            }
            z11 = false;
            if (!z10 || f41586w == this || z11) {
                this.f41608t = z10;
                super.setPressed(z10);
            }
            if (z10 || f41586w != this) {
                return;
            }
            this.f41608t = false;
        }

        public final void setRippleColor(@Nullable Integer num) {
            this.f41589a = num;
            this.f41604p = true;
        }

        public final void setRippleRadius(@Nullable Integer num) {
            this.f41590b = num;
            this.f41604p = true;
        }

        public final void setTouched(boolean z10) {
            this.f41608t = z10;
        }

        public final void setUseBorderlessDrawable(boolean z10) {
            this.f41592d = z10;
        }

        public final void setUseDrawableOnForeground(boolean z10) {
            this.f41591c = z10;
            this.f41604p = true;
        }

        public final void t() {
            if (this.f41604p) {
                this.f41604p = false;
                if (this.f41603o == 0) {
                    setBackground(null);
                }
                setForeground(null);
                Drawable m10 = m();
                Drawable l10 = l();
                if (getHasBorderRadii() && (m10 instanceof RippleDrawable)) {
                    PaintDrawable paintDrawable = new PaintDrawable(-1);
                    paintDrawable.setCornerRadii(j());
                    ((RippleDrawable) m10).setDrawableByLayerId(R.id.mask, paintDrawable);
                }
                if (this.f41591c) {
                    setForeground(m10);
                    int i10 = this.f41603o;
                    if (i10 != 0) {
                        u(i10, l10, null);
                        return;
                    }
                    return;
                }
                int i11 = this.f41603o;
                if (i11 == 0 && this.f41589a == null) {
                    setBackground(new LayerDrawable(new Drawable[]{m10, l10}));
                } else {
                    u(i11, l10, m10);
                }
            }
        }

        public final void u(int i10, Drawable drawable, Drawable drawable2) {
            PaintDrawable paintDrawable = new PaintDrawable(i10);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(j());
            }
            setBackground(new LayerDrawable(drawable2 != null ? new Drawable[]{paintDrawable, drawable2, drawable} : new Drawable[]{paintDrawable, drawable}));
        }
    }

    public RNGestureHandlerButtonViewManager() {
        super(null, 1, null);
        this.mDelegate = new RNGestureHandlerButtonManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public ViewManagerDelegate<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public a createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new a(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction((RNGestureHandlerButtonViewManager) view);
        view.t();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(@NotNull a view, int backgroundColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundColor(backgroundColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.BORDER_BOTTOM_LEFT_RADIUS)
    public void setBorderBottomLeftRadius(@NotNull a view, float borderBottomLeftRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderBottomLeftRadius(borderBottomLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.BORDER_BOTTOM_RIGHT_RADIUS)
    public void setBorderBottomRightRadius(@NotNull a view, float borderBottomRightRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderBottomRightRadius(borderBottomRightRadius);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_COLOR)
    public void setBorderColor(@NotNull a view, @Nullable Integer borderColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderColor(borderColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.BORDER_RADIUS)
    public void setBorderRadius(@NotNull a view, float borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderRadius(borderRadius);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderStyle")
    public void setBorderStyle(@NotNull a view, @Nullable String borderStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderStyle(borderStyle);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.BORDER_TOP_LEFT_RADIUS)
    public void setBorderTopLeftRadius(@NotNull a view, float borderTopLeftRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderTopLeftRadius(borderTopLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.BORDER_TOP_RIGHT_RADIUS)
    public void setBorderTopRightRadius(@NotNull a view, float borderTopRightRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderTopRightRadius(borderTopRightRadius);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_WIDTH)
    public void setBorderWidth(@NotNull a view, float borderWidth) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderWidth(borderWidth);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderless")
    public void setBorderless(@NotNull a view, boolean useBorderlessDrawable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseBorderlessDrawable(useBorderlessDrawable);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.ENABLED)
    public void setEnabled(@NotNull a view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(enabled);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "exclusive")
    public void setExclusive(@NotNull a view, boolean exclusive) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setExclusive(exclusive);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "foreground")
    @TargetApi(23)
    public void setForeground(@NotNull a view, boolean useDrawableOnForeground) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseDrawableOnForeground(useDrawableOnForeground);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r3.equals("auto") == false) goto L19;
     */
    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.POINTER_EVENTS)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPointerEvents(@NotNull a view, @Nullable String pointerEvents) {
        PointerEvents pointerEvents2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (pointerEvents != null) {
            switch (pointerEvents.hashCode()) {
                case -2089141766:
                    if (pointerEvents.equals(ViewProps.BOX_NONE)) {
                        pointerEvents2 = PointerEvents.BOX_NONE;
                        break;
                    }
                    pointerEvents2 = PointerEvents.AUTO;
                    break;
                case -2089112978:
                    if (pointerEvents.equals("box-only")) {
                        pointerEvents2 = PointerEvents.BOX_ONLY;
                        break;
                    }
                    pointerEvents2 = PointerEvents.AUTO;
                    break;
                case 3005871:
                    break;
                case 3387192:
                    if (pointerEvents.equals(ViewProps.NONE)) {
                        pointerEvents2 = PointerEvents.NONE;
                        break;
                    }
                    pointerEvents2 = PointerEvents.AUTO;
                    break;
                default:
                    pointerEvents2 = PointerEvents.AUTO;
                    break;
            }
            view.setPointerEvents(pointerEvents2);
        }
        pointerEvents2 = PointerEvents.AUTO;
        view.setPointerEvents(pointerEvents2);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "rippleColor")
    public void setRippleColor(@NotNull a view, @Nullable Integer rippleColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRippleColor(rippleColor);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "rippleRadius")
    public void setRippleRadius(@NotNull a view, int rippleRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRippleRadius(Integer.valueOf(rippleRadius));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "touchSoundDisabled")
    public void setTouchSoundDisabled(@NotNull a view, boolean touchSoundDisabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSoundEffectsEnabled(!touchSoundDisabled);
    }
}
