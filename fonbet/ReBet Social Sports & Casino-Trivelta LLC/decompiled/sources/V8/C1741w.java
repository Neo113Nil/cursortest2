package V8;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.giphy.sdk.core.models.Image;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.User;
import com.giphy.sdk.core.models.enums.RenditionType;
import com.giphy.sdk.ui.views.GPHVideoPlayerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: V8.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1741w extends PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12790a;

    /* renamed from: b, reason: collision with root package name */
    public Media f12791b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12792c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12793d;

    /* renamed from: e, reason: collision with root package name */
    public P8.d f12794e;

    /* renamed from: f, reason: collision with root package name */
    public U8.b f12795f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12796g;

    /* renamed from: h, reason: collision with root package name */
    public Function1 f12797h;

    /* renamed from: i, reason: collision with root package name */
    public Function1 f12798i;

    /* renamed from: j, reason: collision with root package name */
    public Function1 f12799j;

    /* renamed from: V8.w$a */
    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f12800d = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
        }
    }

    /* renamed from: V8.w$b */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f12801d = new b();

        public b() {
            super(1);
        }

        public final void a(Media it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Media) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: V8.w$c */
    public static final class c extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f12802d = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
        }
    }

    /* renamed from: V8.w$d */
    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m30invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m30invoke() {
            C1741w.this.dismiss();
        }
    }

    public C1741w(Context context, Media media, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f12790a = context;
        this.f12791b = media;
        this.f12792c = z10;
        this.f12793d = z11;
        this.f12796g = true;
        this.f12797h = c.f12802d;
        this.f12798i = a.f12800d;
        this.f12799j = b.f12801d;
        setContentView(View.inflate(context, O8.t.f8533d, null));
        this.f12794e = P8.d.a(getContentView());
        setWidth(-1);
        setHeight(-1);
        setOverlapAnchor(true);
        v(z11);
        setOutsideTouchable(true);
        j();
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: V8.p
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C1741w.h(C1741w.this);
            }
        });
    }

    public static final void h(C1741w this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m();
    }

    public static final void k(C1741w this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void l(C1741w this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void p(C1741w this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f12798i.invoke(this$0.f12791b.getId());
        this$0.dismiss();
    }

    public static final void r(C1741w this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f12799j.invoke(this$0.f12791b);
        this$0.dismiss();
    }

    public static final void x(C1741w this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        User user = this$0.f12791b.getUser();
        if (user != null) {
            this$0.f12797h.invoke(user.getUsername());
        }
        this$0.dismiss();
    }

    public static final void z(C1741w this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.f12790a;
        if (context != null) {
            context.startActivity(U8.d.f12144a.b(this$0.f12791b));
        }
        this$0.dismiss();
    }

    public final P8.d i() {
        P8.d dVar = this.f12794e;
        Intrinsics.checkNotNull(dVar);
        return dVar;
    }

    public final void j() {
        Unit unit;
        P8.d i10 = i();
        i10.f8854g.setVisibility(this.f12792c ? 0 : 8);
        i10.f8858k.setVisibility(this.f12793d ? 0 : 8);
        ConstraintLayout constraintLayout = i10.f8849b;
        O8.k kVar = O8.k.f8390a;
        constraintLayout.setBackgroundColor(kVar.h().a());
        i10.f8852e.setBackgroundColor(kVar.h().g());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(U8.f.a(12));
        gradientDrawable.setColor(kVar.h().a());
        i10.f8851d.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(U8.f.a(2));
        gradientDrawable2.setColor(kVar.h().a());
        TextView[] textViewArr = {i10.f8850c, i10.f8855h, i10.f8857j, i10.f8859l};
        for (int i11 = 0; i11 < 4; i11++) {
            textViewArr[i11].setTextColor(O8.k.f8390a.h().f());
        }
        User user = this.f12791b.getUser();
        if (user != null) {
            i10.f8850c.setText('@' + user.getUsername());
            i10.f8863p.setVisibility(user.getVerified() ? 0 : 8);
            i10.f8862o.m(user.getAvatarUrl());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            i10.f8861n.setVisibility(8);
        }
        i10.f8860m.setAdjustViewBounds(true);
        i10.f8860m.y(this.f12791b, RenditionType.original, new ColorDrawable(O8.a.a()));
        i10.f8852e.setOnClickListener(new View.OnClickListener() { // from class: V8.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1741w.k(C1741w.this, view);
            }
        });
        i10.f8860m.setOnClickListener(new View.OnClickListener() { // from class: V8.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1741w.l(C1741w.this, view);
            }
        });
        ConstraintLayout constraintLayout2 = i10.f8851d;
        constraintLayout2.setScaleX(0.7f);
        constraintLayout2.setScaleY(0.7f);
        constraintLayout2.setTranslationY(U8.f.a(200));
        constraintLayout2.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(new DecelerateInterpolator());
        i10.f8861n.setOnClickListener(w());
        i10.f8854g.setOnClickListener(o());
        i10.f8856i.setOnClickListener(q());
        i10.f8858k.setOnClickListener(y());
        if (N8.j.c(this.f12791b)) {
            n();
        }
    }

    public final void m() {
        this.f12794e = null;
        U8.b bVar = this.f12795f;
        if (bVar != null) {
            bVar.n();
        }
    }

    public final void n() {
        U8.b bVar;
        GPHVideoPlayerView gPHVideoPlayerView = i().f8864q;
        Image original = this.f12791b.getImages().getOriginal();
        gPHVideoPlayerView.setMaxHeight(original != null ? U8.f.a(original.getHeight()) : Integer.MAX_VALUE);
        i().f8860m.setVisibility(4);
        i().f8864q.setVisibility(0);
        Function3 i10 = O8.k.f8390a.i();
        if (i10 != null) {
            GPHVideoPlayerView gPHVideoPlayerView2 = i().f8864q;
            Boolean bool = Boolean.TRUE;
            bVar = (U8.b) i10.invoke(gPHVideoPlayerView2, bool, bool);
        } else {
            bVar = null;
        }
        U8.b bVar2 = bVar;
        this.f12795f = bVar2;
        if (bVar2 != null) {
            U8.b.m(bVar2, this.f12791b, true, null, null, 12, null);
        }
        GPHVideoPlayerView gPHVideoPlayerView3 = i().f8864q;
        i().f8864q.setPreviewMode(new d());
    }

    public final View.OnClickListener o() {
        return new View.OnClickListener() { // from class: V8.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1741w.p(C1741w.this, view);
            }
        };
    }

    public final View.OnClickListener q() {
        return new View.OnClickListener() { // from class: V8.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1741w.r(C1741w.this, view);
            }
        };
    }

    public final void s(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f12798i = function1;
    }

    public final void t(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f12799j = function1;
    }

    public final void u(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f12797h = function1;
    }

    public final void v(boolean z10) {
        this.f12796g = z10;
        P8.d dVar = this.f12794e;
        if (dVar != null) {
            dVar.f8858k.setVisibility(z10 ? 0 : 8);
        }
    }

    public final View.OnClickListener w() {
        return new View.OnClickListener() { // from class: V8.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1741w.x(C1741w.this, view);
            }
        };
    }

    public final View.OnClickListener y() {
        return new View.OnClickListener() { // from class: V8.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1741w.z(C1741w.this, view);
            }
        };
    }

    public /* synthetic */ C1741w(Context context, Media media, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, media, z10, (i10 & 8) != 0 ? true : z11);
    }
}
