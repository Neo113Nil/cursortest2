package V8;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class E extends FrameLayout implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12597a;

    /* renamed from: b, reason: collision with root package name */
    public float f12598b;

    /* renamed from: c, reason: collision with root package name */
    public float f12599c;

    /* renamed from: d, reason: collision with root package name */
    public float f12600d;

    /* renamed from: e, reason: collision with root package name */
    public float f12601e;

    /* renamed from: f, reason: collision with root package name */
    public View f12602f;

    /* renamed from: g, reason: collision with root package name */
    public View f12603g;

    /* renamed from: h, reason: collision with root package name */
    public GestureDetector f12604h;

    /* renamed from: i, reason: collision with root package name */
    public Function1 f12605i;

    /* renamed from: j, reason: collision with root package name */
    public Function0 f12606j;

    /* renamed from: k, reason: collision with root package name */
    public Function0 f12607k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f12608l;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f12609d = new a();

        public a() {
            super(1);
        }

        public final void a(float f10) {
            timber.log.a.a("dragAccumulator " + f10, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f12610d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m21invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m21invoke() {
            timber.log.a.a("dragRelease", new Object[0]);
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f12611d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m22invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m22invoke() {
            timber.log.a.a("dragRelease", new Object[0]);
        }
    }

    public /* synthetic */ E(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        if (view == null || view.getGlobalVisibleRect(this.f12608l)) {
            return this.f12608l.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        return false;
    }

    @NotNull
    public final Function1<Float, Unit> getDragAccumulator() {
        return this.f12605i;
    }

    @NotNull
    public final Function0<Unit> getDragRelease() {
        return this.f12606j;
    }

    @Nullable
    public final View getDragView() {
        return this.f12602f;
    }

    @Nullable
    public final View getSlideView() {
        return this.f12603g;
    }

    @NotNull
    public final Function0<Unit> getTouchOutside() {
        return this.f12607k;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        if (a(this.f12603g, e10)) {
            return false;
        }
        timber.log.a.a("user tapped outside", new Object[0]);
        this.f12607k.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent e12, MotionEvent e22, float f10, float f11) {
        Intrinsics.checkNotNullParameter(e12, "e1");
        Intrinsics.checkNotNullParameter(e22, "e2");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 != 3) goto L24;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        timber.log.a.a("onInterceptTouchEvent", new Object[0]);
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    timber.log.a.a("onInterceptTouch move", new Object[0]);
                    this.f12600d = event.getX() - this.f12598b;
                    this.f12601e = event.getY() - this.f12599c;
                    if (a(this.f12602f, event) && Math.abs(this.f12601e) > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                        if (!this.f12597a) {
                            this.f12598b = event.getX();
                            this.f12599c = event.getY();
                        }
                        this.f12597a = true;
                    }
                }
            }
            this.f12597a = false;
        } else {
            this.f12598b = event.getX();
            this.f12599c = event.getY();
            if (a(this.f12602f, event)) {
                this.f12597a = false;
                return false;
            }
        }
        timber.log.a.a("onInterceptTouch " + event.getAction() + ' ' + event.getActionMasked() + ' ' + event.getY() + ' ' + this.f12597a, new Object[0]);
        return this.f12597a;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent e12, MotionEvent e22, float f10, float f11) {
        Intrinsics.checkNotNullParameter(e12, "e1");
        Intrinsics.checkNotNullParameter(e22, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        timber.log.a.a("onTouchEvent " + this.f12597a, new Object[0]);
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.f12604h.onTouchEvent(motionEvent);
        }
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f12598b = motionEvent.getX();
            this.f12599c = motionEvent.getY();
        } else if (valueOf != null && valueOf.intValue() == 2) {
            if (Math.abs(this.f12601e) > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                if (!this.f12597a) {
                    this.f12598b = motionEvent.getX();
                    this.f12599c = motionEvent.getY();
                }
                this.f12597a = true;
            }
            timber.log.a.a("onMove " + motionEvent.getX() + ' ' + motionEvent.getY(), new Object[0]);
            this.f12600d = motionEvent.getX() - this.f12598b;
            this.f12601e = motionEvent.getY() - this.f12599c;
            if (this.f12597a) {
                this.f12600d = motionEvent.getX() - this.f12598b;
                float y10 = motionEvent.getY() - this.f12599c;
                this.f12601e = y10;
                this.f12605i.invoke(Float.valueOf(y10));
                this.f12598b = motionEvent.getX();
                this.f12599c = motionEvent.getY();
            }
        } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            this.f12606j.invoke();
            this.f12597a = false;
        }
        return this.f12597a;
    }

    public final void setDragAccumulator(@NotNull Function1<? super Float, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f12605i = function1;
    }

    public final void setDragRelease(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f12606j = function0;
    }

    public final void setDragView(@Nullable View view) {
        this.f12602f = view;
    }

    public final void setSlideView(@Nullable View view) {
        this.f12603g = view;
        if (view != null) {
            view.setOnClickListener(null);
        }
        if (view != null) {
            view.setClickable(true);
        }
        if (view != null) {
            view.setFocusableInTouchMode(false);
        }
        if (view == null) {
            return;
        }
        view.setFocusable(false);
    }

    public final void setTouchOutside(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f12607k = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12604h = new GestureDetector(context, this);
        this.f12605i = a.f12609d;
        this.f12606j = b.f12610d;
        this.f12607k = c.f12611d;
        this.f12608l = new Rect();
    }
}
