package Ic;

import Hc.g;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: Ic.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1350d {

    /* renamed from: F, reason: collision with root package name */
    public static final b f5552F = new b(null);

    /* renamed from: G, reason: collision with root package name */
    public static final Void f5553G = null;

    /* renamed from: H, reason: collision with root package name */
    public static short f5554H;
    private static MotionEvent.PointerCoords[] pointerCoords;
    private static MotionEvent.PointerProperties[] pointerProps;

    /* renamed from: A, reason: collision with root package name */
    public int f5555A;

    /* renamed from: B, reason: collision with root package name */
    public int f5556B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f5557C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5558D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5559E;

    /* renamed from: a, reason: collision with root package name */
    public int f5560a;

    /* renamed from: b, reason: collision with root package name */
    public int f5561b;

    /* renamed from: c, reason: collision with root package name */
    public View f5562c;

    /* renamed from: d, reason: collision with root package name */
    public int f5563d;

    /* renamed from: e, reason: collision with root package name */
    public float f5564e;

    /* renamed from: f, reason: collision with root package name */
    public float f5565f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5566g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5567h;

    @Nullable
    private float[] hitSlop;

    /* renamed from: i, reason: collision with root package name */
    public int f5568i;

    /* renamed from: j, reason: collision with root package name */
    public WritableArray f5569j;

    /* renamed from: k, reason: collision with root package name */
    public WritableArray f5570k;

    /* renamed from: l, reason: collision with root package name */
    public int f5571l;

    /* renamed from: m, reason: collision with root package name */
    public int f5572m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5573n;

    /* renamed from: o, reason: collision with root package name */
    public short f5574o;

    /* renamed from: p, reason: collision with root package name */
    public float f5575p;

    /* renamed from: q, reason: collision with root package name */
    public float f5576q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5577r;

    /* renamed from: s, reason: collision with root package name */
    public float f5578s;

    /* renamed from: t, reason: collision with root package name */
    public float f5579t;

    @NotNull
    private final int[] trackedPointerIDs = new int[12];

    @NotNull
    private final C0122d[] trackedPointers;

    /* renamed from: u, reason: collision with root package name */
    public int f5580u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5581v;

    /* renamed from: w, reason: collision with root package name */
    public i f5582w;

    @NotNull
    private final int[] windowOffset;

    /* renamed from: x, reason: collision with root package name */
    public r f5583x;

    /* renamed from: y, reason: collision with root package name */
    public e f5584y;

    /* renamed from: z, reason: collision with root package name */
    public int f5585z;

    /* renamed from: Ic.d$a */
    public static final class a extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1350d handler, MotionEvent event, IllegalArgumentException e10) {
            super(StringsKt.trimIndent("\n    handler: " + Reflection.getOrCreateKotlinClass(handler.getClass()).getSimpleName() + "\n    state: " + handler.S() + "\n    view: " + handler.W() + "\n    orchestrator: " + handler.P() + "\n    isEnabled: " + handler.d0() + "\n    isActive: " + handler.Z() + "\n    isAwaiting: " + handler.a0() + "\n    trackedPointersCount: " + handler.f5560a + "\n    trackedPointers: " + ArraysKt.joinToString$default(handler.trackedPointerIDs, (CharSequence) ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + "\n    while handling event: " + event + "\n      "), e10);
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(e10, "e");
        }
    }

    /* renamed from: Ic.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean c(float f10) {
            return !Float.isNaN(f10);
        }

        public final void d(int i10) {
            if (AbstractC1350d.pointerProps == null) {
                AbstractC1350d.pointerProps = new MotionEvent.PointerProperties[12];
                AbstractC1350d.pointerCoords = new MotionEvent.PointerCoords[12];
            }
            while (i10 > 0) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = AbstractC1350d.pointerProps;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (pointerPropertiesArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                    pointerPropertiesArr = null;
                }
                int i11 = i10 - 1;
                if (pointerPropertiesArr[i11] != null) {
                    return;
                }
                MotionEvent.PointerProperties[] pointerPropertiesArr2 = AbstractC1350d.pointerProps;
                if (pointerPropertiesArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                    pointerPropertiesArr2 = null;
                }
                pointerPropertiesArr2[i11] = new MotionEvent.PointerProperties();
                MotionEvent.PointerCoords[] pointerCoordsArr2 = AbstractC1350d.pointerCoords;
                if (pointerCoordsArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
                } else {
                    pointerCoordsArr = pointerCoordsArr2;
                }
                pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
                i10--;
            }
        }

        public b() {
        }
    }

    /* renamed from: Ic.d$c */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5586a = new a(null);

        /* renamed from: Ic.d$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void b(AbstractC1350d abstractC1350d, ReadableMap readableMap) {
                if (readableMap.getType("hitSlop") == ReadableType.Number) {
                    float pixelFromDIP = PixelUtil.toPixelFromDIP(readableMap.getDouble("hitSlop"));
                    abstractC1350d.z0(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, Float.NaN, Float.NaN);
                    return;
                }
                ReadableMap map = readableMap.getMap("hitSlop");
                Intrinsics.checkNotNull(map);
                float pixelFromDIP2 = map.hasKey("horizontal") ? PixelUtil.toPixelFromDIP(map.getDouble("horizontal")) : Float.NaN;
                float f10 = pixelFromDIP2;
                float pixelFromDIP3 = map.hasKey("vertical") ? PixelUtil.toPixelFromDIP(map.getDouble("vertical")) : Float.NaN;
                float f11 = pixelFromDIP3;
                if (map.hasKey(ViewProps.LEFT)) {
                    pixelFromDIP2 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.LEFT));
                }
                float f12 = pixelFromDIP2;
                if (map.hasKey(ViewProps.TOP)) {
                    pixelFromDIP3 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.TOP));
                }
                float f13 = pixelFromDIP3;
                if (map.hasKey(ViewProps.RIGHT)) {
                    f10 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.RIGHT));
                }
                float f14 = f10;
                if (map.hasKey(ViewProps.BOTTOM)) {
                    f11 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.BOTTOM));
                }
                abstractC1350d.z0(f12, f13, f14, f11, map.hasKey("width") ? PixelUtil.toPixelFromDIP(map.getDouble("width")) : Float.NaN, map.hasKey("height") ? PixelUtil.toPixelFromDIP(map.getDouble("height")) : Float.NaN);
            }

            public a() {
            }
        }

        public abstract AbstractC1350d a(Context context);

        public final AbstractC1350d b(Context context, int i10) {
            AbstractC1350d a10 = a(context);
            a10.I0(i10);
            return a10;
        }

        public abstract Kc.b c(AbstractC1350d abstractC1350d);

        public abstract String d();

        public abstract Class e();

        public void f(AbstractC1350d handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            handler.s0();
            if (config.hasKey("shouldCancelWhenOutside")) {
                handler.G0(config.getBoolean("shouldCancelWhenOutside"));
            }
            if (config.hasKey(ViewProps.ENABLED)) {
                handler.y0(config.getBoolean(ViewProps.ENABLED));
            }
            if (config.hasKey("hitSlop")) {
                f5586a.b(handler, config);
            }
            if (config.hasKey("needsPointerData")) {
                handler.C0(config.getBoolean("needsPointerData"));
            }
            if (config.hasKey("manualActivation")) {
                handler.f5577r = config.getBoolean("manualActivation");
            }
            if (config.hasKey("mouseButton")) {
                handler.B0(config.getInt("mouseButton"));
            }
        }
    }

    /* renamed from: Ic.d$d, reason: collision with other inner class name */
    public static final class C0122d {

        /* renamed from: a, reason: collision with root package name */
        public final int f5587a;

        /* renamed from: b, reason: collision with root package name */
        public float f5588b;

        /* renamed from: c, reason: collision with root package name */
        public float f5589c;

        /* renamed from: d, reason: collision with root package name */
        public float f5590d;

        /* renamed from: e, reason: collision with root package name */
        public float f5591e;

        public C0122d(int i10, float f10, float f11, float f12, float f13) {
            this.f5587a = i10;
            this.f5588b = f10;
            this.f5589c = f11;
            this.f5590d = f12;
            this.f5591e = f13;
        }

        public final float a() {
            return this.f5590d;
        }

        public final float b() {
            return this.f5591e;
        }

        public final int c() {
            return this.f5587a;
        }

        public final float d() {
            return this.f5588b;
        }

        public final float e() {
            return this.f5589c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0122d)) {
                return false;
            }
            C0122d c0122d = (C0122d) obj;
            return this.f5587a == c0122d.f5587a && Float.compare(this.f5588b, c0122d.f5588b) == 0 && Float.compare(this.f5589c, c0122d.f5589c) == 0 && Float.compare(this.f5590d, c0122d.f5590d) == 0 && Float.compare(this.f5591e, c0122d.f5591e) == 0;
        }

        public final void f(float f10) {
            this.f5590d = f10;
        }

        public final void g(float f10) {
            this.f5591e = f10;
        }

        public final void h(float f10) {
            this.f5588b = f10;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f5587a) * 31) + Float.hashCode(this.f5588b)) * 31) + Float.hashCode(this.f5589c)) * 31) + Float.hashCode(this.f5590d)) * 31) + Float.hashCode(this.f5591e);
        }

        public final void i(float f10) {
            this.f5589c = f10;
        }

        public String toString() {
            return "PointerData(pointerId=" + this.f5587a + ", x=" + this.f5588b + ", y=" + this.f5589c + ", absoluteX=" + this.f5590d + ", absoluteY=" + this.f5591e + ")";
        }
    }

    public AbstractC1350d() {
        int[] iArr = new int[2];
        for (int i10 = 0; i10 < 2; i10++) {
            iArr[i10] = 0;
        }
        this.windowOffset = iArr;
        this.f5567h = true;
        C0122d[] c0122dArr = new C0122d[12];
        for (int i11 = 0; i11 < 12; i11++) {
            c0122dArr[i11] = null;
        }
        this.trackedPointers = c0122dArr;
        this.f5585z = 3;
    }

    public static final void b(AbstractC1350d abstractC1350d) {
        abstractC1350d.q();
    }

    public final void A(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C();
        this.f5569j = null;
        this.f5571l = 3;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.trackedPointers[pointerId] = new C0122d(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.windowOffset[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.windowOffset[1]);
        C0122d c0122d = this.trackedPointers[pointerId];
        Intrinsics.checkNotNull(c0122d);
        n(c0122d);
        this.trackedPointers[pointerId] = null;
        this.f5572m--;
        y();
    }

    public final void A0(e eVar) {
        this.f5584y = eVar;
    }

    public final void B() {
        int i10 = this.f5563d;
        if (i10 == 2 || i10 == 4) {
            h0(5);
        }
    }

    public final void B0(int i10) {
        this.f5555A = i10;
    }

    public final void C() {
        this.f5570k = null;
        for (C0122d c0122d : this.trackedPointers) {
            if (c0122d != null) {
                o(c0122d);
            }
        }
    }

    public final void C0(boolean z10) {
        this.f5573n = z10;
    }

    public final void D() {
        int i10 = this.f5563d;
        if (i10 == 4 || i10 == 0 || i10 == 2) {
            k0();
            h0(1);
        }
    }

    public final void D0(int i10) {
        this.f5580u = i10;
    }

    public final int E() {
        int[] iArr;
        int i10 = 0;
        while (i10 < this.f5560a) {
            int i11 = 0;
            while (true) {
                iArr = this.trackedPointerIDs;
                if (i11 >= iArr.length || iArr[i11] == i10) {
                    break;
                }
                i11++;
            }
            if (i11 == iArr.length) {
                break;
            }
            i10++;
        }
        return i10;
    }

    public final void E0(r rVar) {
        this.f5583x = rVar;
    }

    public final int F() {
        return this.f5568i;
    }

    public final void F0(MotionEvent motionEvent) {
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        int i10 = 1;
        if (toolType == 1) {
            i10 = 0;
        } else if (toolType != 2) {
            i10 = 3;
            if (toolType == 3) {
                i10 = 2;
            }
        }
        this.f5585z = i10;
    }

    public final int G() {
        return this.f5556B;
    }

    public final void G0(boolean z10) {
        this.f5581v = z10;
    }

    public final Activity H(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return H(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final void H0(boolean z10) {
        this.f5559E = z10;
    }

    public final short I() {
        return this.f5574o;
    }

    public final void I0(int i10) {
        this.f5561b = i10;
    }

    public final float J() {
        return (this.f5575p + this.f5578s) - this.windowOffset[0];
    }

    public final boolean J0(MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (sourceEvent.getToolType(0) == 3) {
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 1 || sourceEvent.getAction() == 6 || sourceEvent.getAction() == 5 || !(sourceEvent.getAction() == 2 || b0(sourceEvent.getActionButton()))) {
                return false;
            }
            if (sourceEvent.getAction() == 2 && !b0(sourceEvent.getButtonState())) {
                return false;
            }
        }
        return true;
    }

    public final float K() {
        return (this.f5576q + this.f5579t) - this.windowOffset[1];
    }

    public boolean K0(AbstractC1350d handler) {
        e eVar;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (eVar = this.f5584y) == null) {
            return false;
        }
        return eVar.d(this, handler);
    }

    public final float L() {
        return this.f5575p;
    }

    public boolean L0(AbstractC1350d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this) {
            return true;
        }
        e eVar = this.f5584y;
        if (eVar != null) {
            return eVar.c(this, handler);
        }
        return false;
    }

    public final float M() {
        return this.f5576q;
    }

    public boolean M0(AbstractC1350d handler) {
        e eVar;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (eVar = this.f5584y) == null) {
            return false;
        }
        return eVar.b(this, handler);
    }

    public final boolean N() {
        return this.f5573n;
    }

    public final boolean N0(AbstractC1350d handler) {
        e eVar;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (eVar = this.f5584y) == null) {
            return false;
        }
        return eVar.a(this, handler);
    }

    public final int O() {
        return this.f5580u;
    }

    public final void O0(int i10) {
        if (e0(i10)) {
            return;
        }
        this.trackedPointerIDs[i10] = E();
        this.f5560a++;
    }

    public final i P() {
        return this.f5582w;
    }

    public final void P0(int i10) {
        if (e0(i10)) {
            this.trackedPointerIDs[i10] = -1;
            this.f5560a--;
        }
    }

    public final int Q() {
        return this.f5585z;
    }

    public final PointF Q0(PointF point) {
        PointF L10;
        Intrinsics.checkNotNullParameter(point, "point");
        i iVar = this.f5582w;
        if (iVar != null && (L10 = iVar.L(this.f5562c, point)) != null) {
            return L10;
        }
        point.x = Float.NaN;
        point.y = Float.NaN;
        return point;
    }

    public final boolean R() {
        return this.f5559E;
    }

    public final void R0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getActionMasked() == 0 || event.getActionMasked() == 5) {
            x(event, sourceEvent);
            z(event, sourceEvent);
        } else if (event.getActionMasked() == 1 || event.getActionMasked() == 6) {
            z(event, sourceEvent);
            A(event, sourceEvent);
        } else if (event.getActionMasked() == 2) {
            z(event, sourceEvent);
        }
    }

    public final int S() {
        return this.f5563d;
    }

    public final boolean S0(MotionEvent event) {
        int i10;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.f5567h || (i10 = this.f5563d) == 1 || i10 == 3 || i10 == 5) {
            return false;
        }
        if (event.getActionMasked() != 2) {
            return e0(event.getPointerId(event.getActionIndex()));
        }
        int pointerCount = event.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (e0(event.getPointerId(i11))) {
                return true;
            }
        }
        return false;
    }

    public final int T() {
        return this.f5561b;
    }

    public final void T0(Function0 closure) {
        Intrinsics.checkNotNullParameter(closure, "closure");
        this.f5566g = true;
        closure.invoke();
        this.f5566g = false;
    }

    public final int U() {
        return this.f5571l;
    }

    public final int V() {
        return this.f5572m;
    }

    public final View W() {
        return this.f5562c;
    }

    public final void X(MotionEvent transformedEvent, MotionEvent sourceEvent) {
        int i10;
        Intrinsics.checkNotNullParameter(transformedEvent, "transformedEvent");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (!this.f5567h || (i10 = this.f5563d) == 3 || i10 == 1 || i10 == 5 || this.f5560a < 1) {
            return;
        }
        try {
            MotionEvent[] motionEventArr = {m(transformedEvent), m(sourceEvent)};
            MotionEvent motionEvent = motionEventArr[0];
            MotionEvent motionEvent2 = motionEventArr[1];
            this.f5564e = motionEvent.getX();
            this.f5565f = motionEvent.getY();
            this.f5580u = motionEvent.getPointerCount();
            boolean g02 = g0(this.f5562c, this.f5564e, this.f5565f);
            this.f5566g = g02;
            if (this.f5581v && !g02) {
                int i11 = this.f5563d;
                if (i11 == 4) {
                    q();
                    return;
                } else {
                    if (i11 == 2) {
                        D();
                        return;
                    }
                    return;
                }
            }
            k kVar = k.f5610a;
            this.f5575p = kVar.b(motionEvent, true);
            this.f5576q = kVar.c(motionEvent, true);
            this.f5578s = motionEvent.getRawX() - motionEvent.getX();
            this.f5579t = motionEvent.getRawY() - motionEvent.getY();
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 9 || sourceEvent.getAction() == 7) {
                F0(sourceEvent);
            }
            if (Jc.a.c(sourceEvent)) {
                m0(motionEvent, motionEvent2);
            } else {
                l0(motionEvent, motionEvent2);
            }
            if (!Intrinsics.areEqual(motionEvent, transformedEvent)) {
                motionEvent.recycle();
            }
            if (Intrinsics.areEqual(motionEvent2, sourceEvent)) {
                return;
            }
            motionEvent2.recycle();
        } catch (a unused) {
            D();
        }
    }

    public final boolean Y(AbstractC1350d other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = this.trackedPointerIDs.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.trackedPointerIDs[i10] != -1 && other.trackedPointerIDs[i10] != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z() {
        return this.f5557C;
    }

    public final boolean a0() {
        return this.f5558D;
    }

    public final boolean b0(int i10) {
        int i11 = this.f5555A;
        return i11 == 0 ? i10 == 1 : (i10 & i11) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0018, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c0(AbstractC1350d of2) {
        View view;
        Intrinsics.checkNotNullParameter(of2, "of");
        View view2 = this.f5562c;
        Object parent = view2 != null ? view2.getParent() : null;
        if (parent instanceof View) {
            view = (View) parent;
            while (view != null) {
                if (Intrinsics.areEqual(view, of2.f5562c)) {
                    return true;
                }
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    view = (View) parent2;
                }
            }
            return false;
        }
        view = null;
    }

    public final boolean d0() {
        return this.f5567h;
    }

    public final boolean e0(int i10) {
        return this.trackedPointerIDs[i10] != -1;
    }

    public final boolean f0() {
        return this.f5566g;
    }

    public final boolean g0(View view, float f10, float f11) {
        float f12;
        g.a aVar = Hc.g.f4876a;
        Intrinsics.checkNotNull(view);
        if (aVar.e(view)) {
            return aVar.c(view, f10, f11);
        }
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.hitSlop;
        if (fArr != null) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            b bVar = f5552F;
            float f17 = bVar.c(f13) ? 0.0f - f13 : 0.0f;
            r8 = bVar.c(f14) ? 0.0f - f14 : 0.0f;
            if (bVar.c(f15)) {
                width += f15;
            }
            if (bVar.c(f16)) {
                height += f16;
            }
            float f18 = fArr[4];
            float f19 = fArr[5];
            if (bVar.c(f18)) {
                if (!bVar.c(f13)) {
                    f17 = width - f18;
                } else if (!bVar.c(f15)) {
                    width = f18 + f17;
                }
            }
            if (bVar.c(f19)) {
                if (!bVar.c(f14)) {
                    r8 = height - f19;
                } else if (!bVar.c(f16)) {
                    height = f19 + r8;
                }
            }
            f12 = r8;
            r8 = f17;
        } else {
            f12 = 0.0f;
        }
        return r8 <= f10 && f10 <= width && f12 <= f11 && f11 <= height;
    }

    public final void h0(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (this.f5563d == i10) {
            return;
        }
        if (this.f5572m > 0 && (i10 == 5 || i10 == 3 || i10 == 1)) {
            r();
        }
        int i11 = this.f5563d;
        this.f5563d = i10;
        if (i10 == 4) {
            short s10 = f5554H;
            f5554H = (short) (s10 + 1);
            this.f5574o = s10;
        }
        i iVar = this.f5582w;
        Intrinsics.checkNotNull(iVar);
        iVar.A(this, i10, i11);
        p0(i10, i11);
    }

    public final boolean i0(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f5560a) {
            return true;
        }
        int length = this.trackedPointerIDs.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = this.trackedPointerIDs[i10];
            if (i11 != -1 && i11 != i10) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        l(false);
    }

    public void l(boolean z10) {
        if (!this.f5577r || z10) {
            int i10 = this.f5563d;
            if (i10 == 0 || i10 == 2) {
                h0(4);
            }
        }
    }

    public abstract void l0(MotionEvent motionEvent, MotionEvent motionEvent2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6 A[EDGE_INSN: B:34:0x00b6->B:35:0x00b6 BREAK  A[LOOP:0: B:13:0x006d->B:31:0x00b3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e0  */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.MotionEvent$PointerProperties[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MotionEvent m(MotionEvent motionEvent) {
        int actionIndex;
        int pointerCount;
        MotionEvent.PointerCoords[] pointerCoordsArr;
        MotionEvent.PointerProperties[] pointerPropertiesArr;
        MotionEvent.PointerCoords[] pointerCoordsArr2;
        ?? r32;
        MotionEvent.PointerProperties[] pointerPropertiesArr2;
        MotionEvent.PointerCoords[] pointerCoordsArr3;
        if (!i0(motionEvent)) {
            return motionEvent;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 2;
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        i10 = actionMasked;
                        actionIndex = -1;
                        f5552F.d(this.f5560a);
                        float rawX = motionEvent.getRawX() - motionEvent.getX();
                        float rawY = motionEvent.getRawY() - motionEvent.getY();
                        motionEvent.offsetLocation(rawX, rawY);
                        pointerCount = motionEvent.getPointerCount();
                        int i12 = i10;
                        int i13 = 0;
                        while (true) {
                            pointerCoordsArr = null;
                            if (i11 >= pointerCount) {
                                break;
                            }
                            int pointerId = motionEvent.getPointerId(i11);
                            if (this.trackedPointerIDs[pointerId] != -1) {
                                MotionEvent.PointerProperties[] pointerPropertiesArr3 = pointerProps;
                                if (pointerPropertiesArr3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                                    pointerPropertiesArr3 = null;
                                }
                                motionEvent.getPointerProperties(i11, pointerPropertiesArr3[i13]);
                                MotionEvent.PointerProperties[] pointerPropertiesArr4 = pointerProps;
                                if (pointerPropertiesArr4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                                    pointerPropertiesArr4 = null;
                                }
                                MotionEvent.PointerProperties pointerProperties = pointerPropertiesArr4[i13];
                                Intrinsics.checkNotNull(pointerProperties);
                                pointerProperties.id = this.trackedPointerIDs[pointerId];
                                MotionEvent.PointerCoords[] pointerCoordsArr4 = pointerCoords;
                                if (pointerCoordsArr4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
                                } else {
                                    pointerCoordsArr = pointerCoordsArr4;
                                }
                                motionEvent.getPointerCoords(i11, pointerCoordsArr[i13]);
                                if (i11 == actionIndex) {
                                    i12 |= i13 << 8;
                                }
                                i13++;
                            }
                            i11++;
                        }
                        pointerPropertiesArr = pointerProps;
                        if (pointerPropertiesArr == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                            pointerPropertiesArr = null;
                        }
                        if (pointerPropertiesArr.length != 0) {
                            MotionEvent.PointerCoords[] pointerCoordsArr5 = pointerCoords;
                            if (pointerCoordsArr5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
                                pointerCoordsArr5 = null;
                            }
                            if (pointerCoordsArr5.length != 0) {
                                try {
                                    long downTime = motionEvent.getDownTime();
                                    long eventTime = motionEvent.getEventTime();
                                    MotionEvent.PointerProperties[] pointerPropertiesArr5 = pointerProps;
                                    if (pointerPropertiesArr5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                                        pointerPropertiesArr2 = null;
                                    } else {
                                        pointerPropertiesArr2 = pointerPropertiesArr5;
                                    }
                                    MotionEvent.PointerCoords[] pointerCoordsArr6 = pointerCoords;
                                    if (pointerCoordsArr6 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
                                        pointerCoordsArr3 = null;
                                    } else {
                                        pointerCoordsArr3 = pointerCoordsArr6;
                                    }
                                    MotionEvent obtain = MotionEvent.obtain(downTime, eventTime, i12, i13, pointerPropertiesArr2, pointerCoordsArr3, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
                                    Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
                                    float f10 = -rawX;
                                    float f11 = -rawY;
                                    motionEvent.offsetLocation(f10, f11);
                                    obtain.offsetLocation(f10, f11);
                                    return obtain;
                                } catch (IllegalArgumentException e10) {
                                    throw new a(this, motionEvent, e10);
                                }
                            }
                        }
                        pointerCoordsArr2 = pointerCoords;
                        if (pointerCoordsArr2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
                            pointerCoordsArr2 = null;
                        }
                        int length = pointerCoordsArr2.length;
                        r32 = pointerProps;
                        if (r32 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                        } else {
                            pointerCoordsArr = r32;
                        }
                        throw new IllegalStateException("pointerCoords.size=" + length + ", pointerProps.size=" + pointerCoordsArr.length);
                    }
                }
            }
            actionIndex = motionEvent.getActionIndex();
            if (this.trackedPointerIDs[motionEvent.getPointerId(actionIndex)] != -1) {
                i10 = this.f5560a == 1 ? 1 : 6;
            }
            f5552F.d(this.f5560a);
            float rawX2 = motionEvent.getRawX() - motionEvent.getX();
            float rawY2 = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX2, rawY2);
            pointerCount = motionEvent.getPointerCount();
            int i122 = i10;
            int i132 = 0;
            while (true) {
                pointerCoordsArr = null;
                if (i11 >= pointerCount) {
                }
                i11++;
            }
            pointerPropertiesArr = pointerProps;
            if (pointerPropertiesArr == null) {
            }
            if (pointerPropertiesArr.length != 0) {
            }
            pointerCoordsArr2 = pointerCoords;
            if (pointerCoordsArr2 == null) {
            }
            int length2 = pointerCoordsArr2.length;
            r32 = pointerProps;
            if (r32 == 0) {
            }
            throw new IllegalStateException("pointerCoords.size=" + length2 + ", pointerProps.size=" + pointerCoordsArr.length);
        }
        actionIndex = motionEvent.getActionIndex();
        if (this.trackedPointerIDs[motionEvent.getPointerId(actionIndex)] != -1) {
            i10 = this.f5560a == 1 ? 0 : 5;
        }
        f5552F.d(this.f5560a);
        float rawX22 = motionEvent.getRawX() - motionEvent.getX();
        float rawY22 = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX22, rawY22);
        pointerCount = motionEvent.getPointerCount();
        int i1222 = i10;
        int i1322 = 0;
        while (true) {
            pointerCoordsArr = null;
            if (i11 >= pointerCount) {
            }
            i11++;
        }
        pointerPropertiesArr = pointerProps;
        if (pointerPropertiesArr == null) {
        }
        if (pointerPropertiesArr.length != 0) {
        }
        pointerCoordsArr2 = pointerCoords;
        if (pointerCoordsArr2 == null) {
        }
        int length22 = pointerCoordsArr2.length;
        r32 = pointerProps;
        if (r32 == 0) {
        }
        throw new IllegalStateException("pointerCoords.size=" + length22 + ", pointerProps.size=" + pointerCoordsArr.length);
    }

    public void m0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
    }

    public final void n(C0122d c0122d) {
        if (this.f5569j == null) {
            this.f5569j = Arguments.createArray();
        }
        WritableArray writableArray = this.f5569j;
        Intrinsics.checkNotNull(writableArray);
        writableArray.pushMap(u(c0122d));
    }

    public final void o(C0122d c0122d) {
        if (this.f5570k == null) {
            this.f5570k = Arguments.createArray();
        }
        WritableArray writableArray = this.f5570k;
        Intrinsics.checkNotNull(writableArray);
        writableArray.pushMap(u(c0122d));
    }

    public final void p() {
        if (this.f5563d == 0) {
            h0(2);
        }
    }

    public final void q() {
        int i10 = this.f5563d;
        if (i10 == 4 || i10 == 0 || i10 == 2 || this.f5558D) {
            j0();
            h0(3);
        }
    }

    public final void q0(View view, i iVar) {
        if (this.f5562c != null || this.f5582w != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset");
        }
        Arrays.fill(this.trackedPointerIDs, -1);
        this.f5560a = 0;
        this.f5563d = 0;
        this.f5562c = view;
        this.f5582w = iVar;
        Activity H10 = H(view != null ? view.getContext() : null);
        View findViewById = H10 != null ? H10.findViewById(R.id.content) : null;
        if (findViewById != null) {
            findViewById.getLocationOnScreen(this.windowOffset);
        } else {
            int[] iArr = this.windowOffset;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        n0();
    }

    public final void r() {
        this.f5571l = 4;
        this.f5569j = null;
        C();
        for (C0122d c0122d : this.trackedPointers) {
            if (c0122d != null) {
                n(c0122d);
            }
        }
        this.f5572m = 0;
        ArraysKt.fill$default(this.trackedPointers, (Object) null, 0, 0, 6, (Object) null);
        y();
    }

    public final void r0() {
        this.f5562c = null;
        this.f5582w = null;
        Arrays.fill(this.trackedPointerIDs, -1);
        this.f5560a = 0;
        this.f5572m = 0;
        ArraysKt.fill$default(this.trackedPointers, (Object) null, 0, 0, 6, (Object) null);
        this.f5571l = 0;
        o0();
    }

    public final WritableArray s() {
        WritableArray writableArray = this.f5570k;
        this.f5570k = null;
        return writableArray;
    }

    public void s0() {
        this.f5573n = false;
        this.f5577r = false;
        this.f5581v = false;
        y0(true);
        this.hitSlop = (float[]) f5553G;
        this.f5555A = 0;
    }

    public final WritableArray t() {
        WritableArray writableArray = this.f5569j;
        this.f5569j = null;
        return writableArray;
    }

    public String toString() {
        String simpleName;
        View view = this.f5562c;
        if (view == null) {
            simpleName = null;
        } else {
            Intrinsics.checkNotNull(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.f5561b + "]:" + simpleName;
    }

    public final WritableMap u(C0122d c0122d) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(StackTraceHelper.ID_KEY, c0122d.c());
        createMap.putDouble(C5444x.f55808b, PixelUtil.toDIPFromPixel(c0122d.d()));
        createMap.putDouble("y", PixelUtil.toDIPFromPixel(c0122d.e()));
        createMap.putDouble("absoluteX", PixelUtil.toDIPFromPixel(c0122d.a()));
        createMap.putDouble("absoluteY", PixelUtil.toDIPFromPixel(c0122d.b()));
        return createMap;
    }

    public final void u0(int i10) {
        this.f5568i = i10;
    }

    public void v(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        r rVar = this.f5583x;
        if (rVar != null) {
            rVar.b(this, event);
        }
    }

    public final void v0(int i10) {
        this.f5556B = i10;
    }

    public void w(int i10, int i11) {
        r rVar = this.f5583x;
        if (rVar != null) {
            rVar.c(this, i10, i11);
        }
    }

    public final void w0(boolean z10) {
        this.f5557C = z10;
    }

    public final void x(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f5569j = null;
        this.f5571l = 1;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.trackedPointers[pointerId] = new C0122d(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.windowOffset[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.windowOffset[1]);
        this.f5572m++;
        C0122d c0122d = this.trackedPointers[pointerId];
        Intrinsics.checkNotNull(c0122d);
        n(c0122d);
        C();
        y();
    }

    public final void x0(boolean z10) {
        this.f5558D = z10;
    }

    public void y() {
        r rVar;
        if (this.f5569j == null || (rVar = this.f5583x) == null) {
            return;
        }
        rVar.a(this);
    }

    public final void y0(boolean z10) {
        if (this.f5562c != null && this.f5567h != z10) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: Ic.c
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1350d.b(AbstractC1350d.this);
                }
            });
        }
        this.f5567h = z10;
    }

    public final void z(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f5569j = null;
        this.f5571l = 2;
        float rawX = motionEvent2.getRawX() - motionEvent2.getX();
        float rawY = motionEvent2.getRawY() - motionEvent2.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            C0122d c0122d = this.trackedPointers[motionEvent.getPointerId(i11)];
            if (c0122d != null && (c0122d.d() != motionEvent.getX(i11) || c0122d.e() != motionEvent.getY(i11))) {
                c0122d.h(motionEvent.getX(i11));
                c0122d.i(motionEvent.getY(i11));
                c0122d.f((motionEvent2.getX(i11) + rawX) - this.windowOffset[0]);
                c0122d.g((motionEvent2.getY(i11) + rawY) - this.windowOffset[1]);
                n(c0122d);
                i10++;
            }
        }
        if (i10 > 0) {
            C();
            y();
        }
    }

    public final void z0(float f10, float f11, float f12, float f13, float f14, float f15) {
        if (this.hitSlop == null) {
            this.hitSlop = new float[6];
        }
        float[] fArr = this.hitSlop;
        Intrinsics.checkNotNull(fArr);
        fArr[0] = f10;
        float[] fArr2 = this.hitSlop;
        Intrinsics.checkNotNull(fArr2);
        fArr2[1] = f11;
        float[] fArr3 = this.hitSlop;
        Intrinsics.checkNotNull(fArr3);
        fArr3[2] = f12;
        float[] fArr4 = this.hitSlop;
        Intrinsics.checkNotNull(fArr4);
        fArr4[3] = f13;
        float[] fArr5 = this.hitSlop;
        Intrinsics.checkNotNull(fArr5);
        fArr5[4] = f14;
        float[] fArr6 = this.hitSlop;
        Intrinsics.checkNotNull(fArr6);
        fArr6[5] = f15;
        b bVar = f5552F;
        if (bVar.c(f14) && bVar.c(f10) && bVar.c(f12)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (bVar.c(f14) && !bVar.c(f10) && !bVar.c(f12)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (bVar.c(f15) && bVar.c(f13) && bVar.c(f11)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (bVar.c(f15) && !bVar.c(f13) && !bVar.c(f11)) {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
    }

    public void j0() {
    }

    public void k0() {
    }

    public void n0() {
    }

    public void o0() {
    }

    public void t0() {
    }

    public void p0(int i10, int i11) {
    }
}
