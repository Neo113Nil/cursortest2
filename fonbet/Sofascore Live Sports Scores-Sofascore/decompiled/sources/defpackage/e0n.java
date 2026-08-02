package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.recyclerview.widget.u;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.features.videos.models.ui.a;
import com.blaze.blazesdk.features.videos.models.ui.g;
import com.blaze.blazesdk.features.videos.models.ui.h;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.unity3d.services.UnityAdsConstants;
import defpackage.c1m;
import defpackage.n4m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e0n extends u {
    public static boolean n;
    public static s5m o;
    public final uxm b;
    public final csl c;
    public n4m d;
    public f1n e;
    public boolean f;
    public boolean g;
    public com.blaze.blazesdk.features.videos.models.ui.a h;
    public xyl i;
    public wpm j;
    public boolean k;
    public long l;
    public final long m;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        n = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0n(@NotNull uxm uxmVar, @NotNull csl cslVar) {
        super(uxmVar.a);
        uxmVar.getClass();
        cslVar.getClass();
        this.b = uxmVar;
        this.c = cslVar;
        wpm.d.getClass();
        this.j = new wpm(true, true, false);
        this.m = 500L;
    }

    public static void b(TextView textView, String str) {
        textView.setText(str);
        textView.setAlpha(1.0f);
        textView.setVisibility(0);
        textView.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(1000L).withEndAction(new xtl(textView, 16)).start();
    }

    public static void j(uxm uxmVar, BlazeVideosPlayerStyle blazeVideosPlayerStyle) {
        if (blazeVideosPlayerStyle == null) {
            return;
        }
        mm3 mm3Var = new mm3();
        ConstraintLayout constraintLayout = uxmVar.a;
        FrameLayout frameLayout = uxmVar.c;
        mm3Var.e(constraintLayout);
        mm3Var.c(frameLayout.getId());
        mm3Var.g(uxmVar.z.getId(), 4, uxmVar.h.getId(), 3, blazeVideosPlayerStyle.getSeekBar().getBottomMargin().getToPx$blazesdk_release());
        mm3Var.s(frameLayout.getId());
        mm3Var.j(frameLayout.getId()).d.w = 0.5f;
        mm3Var.f(frameLayout.getId(), 3, constraintLayout.getId(), 3);
        mm3Var.f(frameLayout.getId(), 6, constraintLayout.getId(), 6);
        mm3Var.f(frameLayout.getId(), 7, constraintLayout.getId(), 7);
        mm3Var.f(frameLayout.getId(), 4, constraintLayout.getId(), 4);
        uxmVar.d.setScaleType(ImageView.ScaleType.FIT_CENTER);
        mm3Var.a(constraintLayout);
    }

    public static /* synthetic */ void updatePlayerOverlayVisibility$default(e0n e0nVar, wpm wpmVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        e0nVar.h(wpmVar, z);
    }

    public final BlazeVideosPlayerStyle a() {
        com.blaze.blazesdk.features.videos.models.ui.a aVar = this.h;
        if (aVar != null) {
            return h.a(aVar);
        }
        return null;
    }

    public final void c(w0m w0mVar) {
        FrameLayout frameLayout;
        w0mVar.getClass();
        o();
        uxm uxmVar = this.b;
        FrameLayout frameLayout2 = uxmVar.c;
        PlayerView playerView = ((qdm) w0mVar).a;
        if (Intrinsics.c(frameLayout2, playerView.getParent())) {
            return;
        }
        ViewGroup r = evl.r(uxmVar.a.getId(), playerView);
        uxm a2 = r != null ? uxm.a(r) : null;
        if (a2 != null && (frameLayout = a2.c) != null) {
            frameLayout.removeView(playerView);
        }
        n4m n4mVar = this.d;
        if ((n4mVar != null ? n4mVar.c : null) instanceof n4m.a.b) {
            uxmVar.c.addView(playerView);
        }
    }

    public final void d(c1m.a aVar) {
        aVar.getClass();
        s5m s5mVar = o;
        if ((s5mVar instanceof pql) || (s5mVar instanceof yul)) {
            return;
        }
        uxm uxmVar = this.b;
        FrameLayout frameLayout = uxmVar.c;
        frameLayout.getClass();
        lz.y(frameLayout, aVar.a);
        ImageView imageView = uxmVar.d;
        imageView.getClass();
        boolean z = aVar.b;
        imageView.getClass();
        if (z) {
            evl.u(imageView);
        } else {
            evl.s(imageView);
        }
    }

    public final void e(n4m n4mVar) {
        BlazeVideosPlayerStyle a2 = a();
        final int i = 0;
        final int i2 = 1;
        this.f = fgm.h(n4mVar) >= 20.0d;
        if (a2 != null) {
            g(new wzm(a2, n4mVar, this, 9), new yzm(this, 8));
            g(new xzm(n4mVar, this, a2), new fsm(20));
            final int i3 = 3;
            g(new wzm(n4mVar, this, a2), new yzm(this, i3));
            com.blaze.blazesdk.features.videos.models.ui.a aVar = this.h;
            final uxm uxmVar = this.b;
            if (aVar != null) {
                a.d b = aVar.b();
                if (b instanceof a.d.C0014a) {
                    ImageView imageView = uxmVar.e;
                    imageView.getClass();
                    ctl.setPlayerButtonUi$default(imageView, a2.getButtons().getExit(), n4mVar.n, n4mVar.b, null, 8, null);
                    uxmVar.e.setOnClickListener(new b0n(this, 13));
                    Unit unit = Unit.a;
                } else {
                    if (!(b instanceof g)) {
                        zzl.b();
                        return;
                    }
                    ImageView imageView2 = uxmVar.e;
                    imageView2.getClass();
                    imageView2.setVisibility(8);
                    Unit unit2 = Unit.a;
                }
            }
            int i4 = 4;
            g(new wzm(this, n4mVar, a2), new yzm(this, i4));
            final int i5 = 2;
            int i6 = 24;
            g(new wzm(a2, n4mVar, this, i5), new fsm(i6));
            int i7 = 6;
            g(new wzm(a2, n4mVar, this, i7), new wzm(a2, n4mVar, this, 7));
            g(new xzm(a2, n4mVar), new fsm(29));
            g(new wzm(a2, n4mVar, this, i), new fsm(23));
            int i8 = 19;
            g(new wzm(a2, n4mVar, this, 10), new fsm(i8));
            com.blaze.blazesdk.features.videos.models.ui.a aVar2 = this.h;
            if (aVar2 != null) {
                h.b(aVar2, new Function0() { // from class: zzm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i9 = i;
                        uxm uxmVar2 = uxmVar;
                        switch (i9) {
                            case 0:
                                boolean z = e0n.n;
                                ImageView imageView3 = uxmVar2.s;
                                imageView3.getClass();
                                evl.q(imageView3);
                                break;
                            case 1:
                                boolean z2 = e0n.n;
                                ImageView imageView4 = uxmVar2.s;
                                imageView4.getClass();
                                evl.q(imageView4);
                                break;
                            case 2:
                                boolean z3 = e0n.n;
                                ImageView imageView5 = uxmVar2.s;
                                imageView5.getClass();
                                evl.q(imageView5);
                                break;
                            default:
                                boolean z4 = e0n.n;
                                ImageView imageView6 = uxmVar2.s;
                                imageView6.getClass();
                                evl.q(imageView6);
                                break;
                        }
                        return Unit.a;
                    }
                }, new Function0() { // from class: zzm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i9 = i2;
                        uxm uxmVar2 = uxmVar;
                        switch (i9) {
                            case 0:
                                boolean z = e0n.n;
                                ImageView imageView3 = uxmVar2.s;
                                imageView3.getClass();
                                evl.q(imageView3);
                                break;
                            case 1:
                                boolean z2 = e0n.n;
                                ImageView imageView4 = uxmVar2.s;
                                imageView4.getClass();
                                evl.q(imageView4);
                                break;
                            case 2:
                                boolean z3 = e0n.n;
                                ImageView imageView5 = uxmVar2.s;
                                imageView5.getClass();
                                evl.q(imageView5);
                                break;
                            default:
                                boolean z4 = e0n.n;
                                ImageView imageView6 = uxmVar2.s;
                                imageView6.getClass();
                                evl.q(imageView6);
                                break;
                        }
                        return Unit.a;
                    }
                }, new fjl(uxmVar, a2, n4mVar, this, 1), new Function0() { // from class: zzm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i9 = i5;
                        uxm uxmVar2 = uxmVar;
                        switch (i9) {
                            case 0:
                                boolean z = e0n.n;
                                ImageView imageView3 = uxmVar2.s;
                                imageView3.getClass();
                                evl.q(imageView3);
                                break;
                            case 1:
                                boolean z2 = e0n.n;
                                ImageView imageView4 = uxmVar2.s;
                                imageView4.getClass();
                                evl.q(imageView4);
                                break;
                            case 2:
                                boolean z3 = e0n.n;
                                ImageView imageView5 = uxmVar2.s;
                                imageView5.getClass();
                                evl.q(imageView5);
                                break;
                            default:
                                boolean z4 = e0n.n;
                                ImageView imageView6 = uxmVar2.s;
                                imageView6.getClass();
                                evl.q(imageView6);
                                break;
                        }
                        return Unit.a;
                    }
                }, new Function0() { // from class: zzm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i9 = i3;
                        uxm uxmVar2 = uxmVar;
                        switch (i9) {
                            case 0:
                                boolean z = e0n.n;
                                ImageView imageView3 = uxmVar2.s;
                                imageView3.getClass();
                                evl.q(imageView3);
                                break;
                            case 1:
                                boolean z2 = e0n.n;
                                ImageView imageView4 = uxmVar2.s;
                                imageView4.getClass();
                                evl.q(imageView4);
                                break;
                            case 2:
                                boolean z3 = e0n.n;
                                ImageView imageView5 = uxmVar2.s;
                                imageView5.getClass();
                                evl.q(imageView5);
                                break;
                            default:
                                boolean z4 = e0n.n;
                                ImageView imageView6 = uxmVar2.s;
                                imageView6.getClass();
                                evl.q(imageView6);
                                break;
                        }
                        return Unit.a;
                    }
                });
            }
            Context context = this.itemView.getContext();
            context.getClass();
            if (cnb.h(context)) {
                com.blaze.blazesdk.features.videos.models.ui.a aVar3 = this.h;
                if (aVar3 != null) {
                    a.d b2 = aVar3.b();
                    if (b2 instanceof a.d.C0014a) {
                        ImageView imageView3 = uxmVar.o;
                        imageView3.getClass();
                        ctl.setPlayerButtonUi$default(imageView3, a2.getButtons().getForceRotation(), false, n4mVar.b, null, 10, null);
                        uxmVar.o.setOnClickListener(new b0n(this, i2));
                        Unit unit3 = Unit.a;
                    } else {
                        if (!(b2 instanceof g)) {
                            zzl.b();
                            return;
                        }
                        ImageView imageView4 = uxmVar.o;
                        imageView4.getClass();
                        imageView4.setVisibility(8);
                        Unit unit4 = Unit.a;
                    }
                }
            } else {
                ImageView imageView5 = uxmVar.o;
                imageView5.getClass();
                imageView5.setVisibility(8);
            }
            com.blaze.blazesdk.features.videos.models.ui.a aVar4 = this.h;
            if (aVar4 != null) {
                ufl uflVar = new ufl(14, this, a2);
                a.d b3 = aVar4.b();
                if (b3 instanceof a.d.C0014a) {
                    uflVar.invoke();
                } else {
                    if (!(b3 instanceof g)) {
                        zzl.b();
                        return;
                    }
                    MediaRouteButton mediaRouteButton = uxmVar.i;
                    mediaRouteButton.getClass();
                    mediaRouteButton.setVisibility(8);
                    Unit unit5 = Unit.a;
                }
            }
            int i9 = 5;
            g(new wzm(this, a2, n4mVar, i9), new fsm(27));
            g(new wzm(this, a2, n4mVar, i2), new fsm(21));
            com.blaze.blazesdk.features.videos.models.ui.a aVar5 = this.h;
            if (aVar5 != null) {
                a.d b4 = aVar5.b();
                if (b4 instanceof a.d.C0014a) {
                    s5m s5mVar = o;
                    boolean z = (s5mVar instanceof yul) || (s5mVar instanceof pql);
                    ImageView imageView6 = uxmVar.t;
                    imageView6.getClass();
                    ctl.setPlayerButtonUi$default(imageView6, a2.getButtons().getPip(), !z, n4mVar.b, null, 8, null);
                    uxmVar.t.setOnClickListener(new b0n(this, i7));
                    Unit unit6 = Unit.a;
                } else {
                    if (!(b4 instanceof g)) {
                        zzl.b();
                        return;
                    }
                    ImageView imageView7 = uxmVar.t;
                    imageView7.getClass();
                    imageView7.setVisibility(8);
                    Unit unit7 = Unit.a;
                }
            }
            com.blaze.blazesdk.features.videos.models.ui.a aVar6 = this.h;
            if (aVar6 != null) {
                mth mthVar = new mth(16, a2, this, n4mVar);
                a.d b5 = aVar6.b();
                if (b5 instanceof a.d.C0014a) {
                    mthVar.invoke();
                } else {
                    if (!(b5 instanceof g)) {
                        zzl.b();
                        return;
                    }
                    BlazeTextWithIconButton blazeTextWithIconButton = uxmVar.m;
                    blazeTextWithIconButton.getClass();
                    blazeTextWithIconButton.setVisibility(8);
                    Unit unit8 = Unit.a;
                }
            }
            g(new ncj(i8, a2.getSeekBar(), this, n4mVar), new fsm(22));
            g(new a0n(i), new a0n(i2));
            g(new wzm(a2, n4mVar, this, i4), new fsm(26));
            g(new bcl(i6, a2, this), new fsm(25));
            g(new ncj(20, n4mVar, a2.getButtons().getLike(), this), new a0n(i9));
        }
        g(new yzm(this, i), new yzm(this, i2));
    }

    public final void f(s5m s5mVar) {
        String str;
        n4m n4mVar;
        com.blaze.blazesdk.features.videos.models.ui.a aVar;
        o = s5mVar;
        boolean z = s5mVar instanceof yul;
        uxm uxmVar = this.b;
        if (z || (s5mVar instanceof pql)) {
            FrameLayout frameLayout = uxmVar.c;
            frameLayout.getClass();
            frameLayout.setVisibility(4);
            ImageView imageView = uxmVar.d;
            imageView.getClass();
            imageView.setVisibility(8);
            BlazeTextView blazeTextView = uxmVar.j;
            s5mVar.getClass();
            str = "";
            if (z) {
                StringBuilder sb = new StringBuilder("Connecting");
                String str2 = ((yul) s5mVar).a;
                str = mz1.o(sb, str2 != null ? " to ".concat(str2) : "", "...");
            } else if (s5mVar instanceof pql) {
                String str3 = ((pql) s5mVar).a;
                str = "Playing".concat(str3 != null ? " on ".concat(str3) : "");
            } else if (!(s5mVar instanceof wyl)) {
                zzl.b();
                return;
            }
            blazeTextView.setText(str);
            blazeTextView.setVisibility(0);
        } else {
            if (!Intrinsics.c(s5mVar, wyl.a) && s5mVar != null) {
                zzl.b();
                return;
            }
            FrameLayout frameLayout2 = uxmVar.c;
            frameLayout2.getClass();
            frameLayout2.setVisibility(0);
            ImageView imageView2 = uxmVar.d;
            imageView2.getClass();
            imageView2.setVisibility(8);
            BlazeTextView blazeTextView2 = uxmVar.j;
            blazeTextView2.getClass();
            blazeTextView2.setVisibility(8);
        }
        BlazeVideosPlayerStyle a2 = a();
        if (a2 == null || (n4mVar = this.d) == null || (aVar = this.h) == null) {
            return;
        }
        a.d b = aVar.b();
        if (b instanceof a.d.C0014a) {
            s5m s5mVar2 = o;
            boolean z2 = (s5mVar2 instanceof yul) || (s5mVar2 instanceof pql);
            ImageView imageView3 = uxmVar.t;
            imageView3.getClass();
            ctl.setPlayerButtonUi$default(imageView3, a2.getButtons().getPip(), !z2, n4mVar.b, null, 8, null);
            Unit unit = Unit.a;
            return;
        }
        if (!(b instanceof g)) {
            zzl.b();
            return;
        }
        ImageView imageView4 = uxmVar.t;
        imageView4.getClass();
        imageView4.setVisibility(8);
        Unit unit2 = Unit.a;
    }

    public final void g(Function1 function1, Function1 function12) {
        com.blaze.blazesdk.features.videos.models.ui.a aVar = this.h;
        if (aVar != null) {
            ufl uflVar = new ufl(15, function1, this);
            if (aVar instanceof a.b) {
                a.d dVar = ((a.b) aVar).c;
                if (dVar instanceof a.d.C0014a) {
                    uflVar.invoke();
                } else if (!(dVar instanceof g)) {
                    zzl.b();
                    return;
                } else {
                    function12.invoke(this.b);
                    Unit unit = Unit.a;
                }
            } else if (aVar instanceof a.C0011a) {
                uflVar.invoke();
            } else {
                if (!(aVar instanceof a.e)) {
                    zzl.b();
                    return;
                }
                uflVar.invoke();
            }
            Unit unit2 = Unit.a;
        }
    }

    public final void h(wpm wpmVar, boolean z) {
        wpmVar.getClass();
        g(new gk(wpmVar, this, z, 15), new a0n(3));
    }

    public final void i(fqm fqmVar) {
        this.g = fqmVar.a;
        g(new yzm(this, 9), new a0n(7));
    }

    public final void k(boolean z) {
        BlazeVideosPlayerButtonsStyle buttons;
        BlazeVideosPlayerButtonStyle mute;
        n = z;
        uxm uxmVar = this.b;
        uxmVar.H.setSelected(!z);
        ImageView imageView = uxmVar.H;
        imageView.getClass();
        BlazeVideosPlayerStyle a2 = a();
        ctl.b(imageView, (a2 == null || (buttons = a2.getButtons()) == null || (mute = buttons.getMute()) == null) ? null : mute.getCustomImage());
    }

    public final void l(boolean z) {
        mm3 mm3Var = new mm3();
        uxm uxmVar = this.b;
        ConstraintLayout constraintLayout = uxmVar.a;
        ConstraintLayout constraintLayout2 = uxmVar.a;
        mm3Var.e(constraintLayout);
        BlazeTextView blazeTextView = uxmVar.q;
        if (z) {
            mm3Var.g(blazeTextView.getId(), 6, uxmVar.I.getId(), 7, new BlazeDp(8).getToPx$blazesdk_release());
        } else {
            mm3Var.g(blazeTextView.getId(), 6, constraintLayout2.getId(), 6, new BlazeDp(16).getToPx$blazesdk_release());
        }
        mm3Var.a(constraintLayout2);
    }

    public final void m() {
        BlazeVideosPlayerButtonsStyle buttons;
        BlazeVideosPlayerButtonStyle captions;
        n4m n4mVar;
        eqm d;
        e0n e0nVar;
        uxm uxmVar = this.b;
        try {
            xyl xylVar = this.i;
            if (xylVar != null) {
                xylVar.destroy();
            }
            this.i = null;
            uxmVar.b.removeAllViews();
            BlazeVideosPlayerStyle a2 = a();
            if (a2 != null && (buttons = a2.getButtons()) != null && (captions = buttons.getCaptions()) != null && captions.isVisible() && (n4mVar = this.d) != null && (d = fgm.d(n4mVar)) != null) {
                n4m n4mVar2 = this.d;
                Context applicationContext = uxmVar.a.getContext().getApplicationContext();
                applicationContext.getClass();
                xyl xylVar2 = new xyl(applicationContext, null, 0, 6, null);
                xylVar2.setId(View.generateViewId());
                xylVar2.setImportantForAccessibility(2);
                int id = xylVar2.getId();
                uxmVar.b.addView(xylVar2, new tl3(-1, -1));
                xylVar2.a();
                if (d.d()) {
                    e0nVar = this;
                    xyl.loadAndInitialize$default(xylVar2, null, new im1(xylVar2, id, e0nVar, n4mVar2, 10), 1, null);
                } else {
                    e0nVar = this;
                }
                e0nVar.i = xylVar2;
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void n() {
        eqm d;
        BlazeVideosPlayerButtonsStyle buttons;
        BlazeVideosPlayerButtonStyle captions;
        ImageView imageView = this.b.k;
        n4m n4mVar = this.d;
        if (n4mVar == null || (d = fgm.d(n4mVar)) == null) {
            return;
        }
        imageView.setSelected(d.a());
        BlazeVideosPlayerStyle a2 = a();
        ctl.b(imageView, (a2 == null || (buttons = a2.getButtons()) == null || (captions = buttons.getCaptions()) == null) ? null : captions.getCustomImage());
    }

    public final void o() {
        BlazeVideosPlayerButtonsStyle buttons;
        BlazeVideosPlayerButtonStyle mute;
        ImageView imageView = this.b.H;
        imageView.setSelected(!n);
        BlazeVideosPlayerStyle a2 = a();
        ctl.b(imageView, (a2 == null || (buttons = a2.getButtons()) == null || (mute = buttons.getMute()) == null) ? null : mute.getCustomImage());
    }
}
