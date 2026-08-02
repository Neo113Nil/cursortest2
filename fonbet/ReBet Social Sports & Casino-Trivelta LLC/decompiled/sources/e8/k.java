package e8;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import d8.AbstractC4018C;
import d8.AbstractC4019D;
import d8.AbstractC4020E;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: i, reason: collision with root package name */
    public static final a f45804i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f45805a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f45806b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f45807c;

    /* renamed from: d, reason: collision with root package name */
    public b f45808d;

    /* renamed from: e, reason: collision with root package name */
    public PopupWindow f45809e;

    /* renamed from: f, reason: collision with root package name */
    public c f45810f;

    /* renamed from: g, reason: collision with root package name */
    public long f45811g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewTreeObserver.OnScrollChangedListener f45812h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public final class b extends FrameLayout {

        /* renamed from: a, reason: collision with root package name */
        public final ImageView f45813a;

        /* renamed from: b, reason: collision with root package name */
        public final ImageView f45814b;

        /* renamed from: c, reason: collision with root package name */
        public final View f45815c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f45816d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k f45817e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k this$0, Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(context, "context");
            this.f45817e = this$0;
            LayoutInflater.from(context).inflate(AbstractC4020E.f45036a, this);
            View findViewById = findViewById(AbstractC4019D.f45035e);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.f45813a = (ImageView) findViewById;
            View findViewById2 = findViewById(AbstractC4019D.f45033c);
            if (findViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.f45814b = (ImageView) findViewById2;
            View findViewById3 = findViewById(AbstractC4019D.f45031a);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.com_facebook_body_frame)");
            this.f45815c = findViewById3;
            View findViewById4 = findViewById(AbstractC4019D.f45032b);
            if (findViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.f45816d = (ImageView) findViewById4;
        }

        public final View a() {
            return this.f45815c;
        }

        public final ImageView b() {
            return this.f45814b;
        }

        public final ImageView c() {
            return this.f45813a;
        }

        public final ImageView d() {
            return this.f45816d;
        }

        public final void e() {
            this.f45813a.setVisibility(4);
            this.f45814b.setVisibility(0);
        }

        public final void f() {
            this.f45813a.setVisibility(0);
            this.f45814b.setVisibility(4);
        }
    }

    public enum c {
        BLUE,
        BLACK;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public k(String text, View anchor) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.f45805a = text;
        this.f45806b = new WeakReference(anchor);
        Context context = anchor.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "anchor.context");
        this.f45807c = context;
        this.f45810f = c.BLUE;
        this.f45811g = 6000L;
        this.f45812h = new ViewTreeObserver.OnScrollChangedListener() { // from class: e8.h
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                k.f(k.this);
            }
        };
    }

    public static final void f(k this$0) {
        PopupWindow popupWindow;
        if (Y7.a.d(k.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.f45806b.get() == null || (popupWindow = this$0.f45809e) == null || !popupWindow.isShowing()) {
                return;
            }
            if (popupWindow.isAboveAnchor()) {
                b bVar = this$0.f45808d;
                if (bVar == null) {
                    return;
                }
                bVar.e();
                return;
            }
            b bVar2 = this$0.f45808d;
            if (bVar2 == null) {
                return;
            }
            bVar2.f();
        } catch (Throwable th2) {
            Y7.a.b(th2, k.class);
        }
    }

    public static final void j(k this$0) {
        if (Y7.a.d(k.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.d();
        } catch (Throwable th2) {
            Y7.a.b(th2, k.class);
        }
    }

    public static final void k(k this$0, View view) {
        if (Y7.a.d(k.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.d();
        } catch (Throwable th2) {
            Y7.a.b(th2, k.class);
        }
    }

    public final void d() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            l();
            PopupWindow popupWindow = this.f45809e;
            if (popupWindow == null) {
                return;
            }
            popupWindow.dismiss();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void e() {
        ViewTreeObserver viewTreeObserver;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            l();
            View view = (View) this.f45806b.get();
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnScrollChangedListener(this.f45812h);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void g(long j10) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            this.f45811g = j10;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void h(c style) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(style, "style");
            this.f45810f = style;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void i() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (this.f45806b.get() != null) {
                b bVar = new b(this, this.f45807c);
                this.f45808d = bVar;
                View findViewById = bVar.findViewById(AbstractC4019D.f45034d);
                if (findViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                ((TextView) findViewById).setText(this.f45805a);
                if (this.f45810f == c.BLUE) {
                    bVar.a().setBackgroundResource(AbstractC4018C.f45027e);
                    bVar.b().setImageResource(AbstractC4018C.f45028f);
                    bVar.c().setImageResource(AbstractC4018C.f45029g);
                    bVar.d().setImageResource(AbstractC4018C.f45030h);
                } else {
                    bVar.a().setBackgroundResource(AbstractC4018C.f45023a);
                    bVar.b().setImageResource(AbstractC4018C.f45024b);
                    bVar.c().setImageResource(AbstractC4018C.f45025c);
                    bVar.d().setImageResource(AbstractC4018C.f45026d);
                }
                View decorView = ((Activity) this.f45807c).getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                e();
                bVar.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                PopupWindow popupWindow = new PopupWindow(bVar, bVar.getMeasuredWidth(), bVar.getMeasuredHeight());
                this.f45809e = popupWindow;
                popupWindow.showAsDropDown((View) this.f45806b.get());
                m();
                if (this.f45811g > 0) {
                    bVar.postDelayed(new Runnable() { // from class: e8.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            k.j(k.this);
                        }
                    }, this.f45811g);
                }
                popupWindow.setTouchable(true);
                bVar.setOnClickListener(new View.OnClickListener() { // from class: e8.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        k.k(k.this, view);
                    }
                });
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void l() {
        ViewTreeObserver viewTreeObserver;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            View view = (View) this.f45806b.get();
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnScrollChangedListener(this.f45812h);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void m() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            PopupWindow popupWindow = this.f45809e;
            if (popupWindow != null && popupWindow.isShowing()) {
                if (popupWindow.isAboveAnchor()) {
                    b bVar = this.f45808d;
                    if (bVar == null) {
                        return;
                    }
                    bVar.e();
                    return;
                }
                b bVar2 = this.f45808d;
                if (bVar2 == null) {
                    return;
                }
                bVar2.f();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
