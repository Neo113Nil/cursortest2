package u4;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import b1.AbstractC2346O;
import b1.InterfaceC2341J;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u4.C6505k;

/* renamed from: u4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6505k extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final a f66109g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public r4.j f66110a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f66111b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f66112c;

    /* renamed from: d, reason: collision with root package name */
    public final PlayerView f66113d;

    /* renamed from: e, reason: collision with root package name */
    public final b f66114e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f66115f;

    /* renamed from: u4.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: u4.k$b */
    public static final class b implements InterfaceC2341J.d {
        public b() {
        }

        public static final void G(C6505k c6505k) {
            c6505k.f66113d.requestLayout();
            Integer num = c6505k.f66111b;
            if (num != null) {
                c6505k.f66113d.setResizeMode(num.intValue());
            }
        }

        @Override // b1.InterfaceC2341J.d
        public void d0(AbstractC2346O timeline, int i10) {
            Intrinsics.checkNotNullParameter(timeline, "timeline");
            PlayerView playerView = C6505k.this.f66113d;
            final C6505k c6505k = C6505k.this;
            playerView.post(new Runnable() { // from class: u4.l
                @Override // java.lang.Runnable
                public final void run() {
                    C6505k.b.G(C6505k.this);
                }
            });
            C6505k.this.j();
        }

        @Override // b1.InterfaceC2341J.d
        public void r0(InterfaceC2341J player, InterfaceC2341J.c events) {
            Intrinsics.checkNotNullParameter(player, "player");
            Intrinsics.checkNotNullParameter(events, "events");
            if (events.a(1) || events.a(7)) {
                C6505k.this.j();
            }
            if (events.a(25)) {
                Integer num = C6505k.this.f66111b;
                if (num != null) {
                    C6505k c6505k = C6505k.this;
                    c6505k.f66113d.setResizeMode(num.intValue());
                }
                C6505k.this.f66113d.requestLayout();
                C6505k.this.requestLayout();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6505k(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void h(C6505k c6505k) {
        c6505k.measure(View.MeasureSpec.makeMeasureSpec(c6505k.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c6505k.getHeight(), 1073741824));
        c6505k.layout(c6505k.getLeft(), c6505k.getTop(), c6505k.getRight(), c6505k.getBottom());
    }

    @Override // android.view.View
    public void addOnLayoutChangeListener(View.OnLayoutChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f66113d.addOnLayoutChangeListener(listener);
    }

    public final void e() {
        this.f66113d.F();
    }

    public final void f() {
        this.f66113d.requestLayout();
        Integer num = this.f66111b;
        if (num != null) {
            this.f66113d.setResizeMode(num.intValue());
        }
    }

    public final boolean g() {
        InterfaceC2341J player = this.f66113d.getPlayer();
        if (player != null) {
            return player.isPlaying();
        }
        return false;
    }

    @NotNull
    public final PlayerView getPlayerView() {
        return this.f66113d;
    }

    public final void i() {
        this.f66113d.R();
    }

    public final void j() {
        InterfaceC2341J player = this.f66113d.getPlayer();
        if (player == null) {
            return;
        }
        boolean s02 = player.s0();
        boolean f02 = player.f0();
        this.f66112c.setVisibility(s02 ? 0 : 8);
        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) this.f66113d.findViewById(androidx.media3.ui.X.f22297G);
        if (defaultTimeBar != null) {
            defaultTimeBar.setEnabled(!s02 || f02);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || (num = this.f66111b) == null) {
            return;
        }
        this.f66113d.setResizeMode(num.intValue());
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f66115f);
    }

    public final void setControllerAutoShow(boolean z10) {
        this.f66113d.setControllerAutoShow(z10);
    }

    public final void setControllerHideOnTouch(boolean z10) {
        this.f66113d.setControllerHideOnTouch(z10);
    }

    public final void setControllerShowTimeoutMs(int i10) {
        this.f66113d.setControllerShowTimeoutMs(i10);
    }

    public final void setControllerVisibilityListener(@Nullable PlayerView.d dVar) {
        this.f66113d.setControllerVisibilityListener(dVar);
    }

    @Override // android.view.View
    public void setFocusable(boolean z10) {
        this.f66113d.setFocusable(z10);
    }

    public final void setFullscreenButtonClickListener(@Nullable PlayerView.e eVar) {
        this.f66113d.setFullscreenButtonClickListener(eVar);
    }

    public final void setPlayer(@Nullable ExoPlayer exoPlayer) {
        InterfaceC2341J player = this.f66113d.getPlayer();
        if (player != null) {
            player.v(this.f66114e);
        }
        this.f66113d.setPlayer(exoPlayer);
        if (exoPlayer != null) {
            exoPlayer.p(this.f66114e);
            Integer num = this.f66111b;
            if (num != null) {
                this.f66113d.setResizeMode(num.intValue());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r3 != 4) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setResizeMode(int i10) {
        int i11 = 0;
        if (i10 != 0) {
            int i12 = 1;
            if (i10 != 1) {
                i12 = 2;
                if (i10 != 2) {
                    i12 = 3;
                    if (i10 != 3) {
                        i12 = 4;
                    }
                }
            }
            i11 = i12;
        }
        this.f66113d.setResizeMode(i11);
        this.f66111b = Integer.valueOf(i11);
        this.f66113d.requestLayout();
        requestLayout();
    }

    public final void setShowSubtitleButton(boolean z10) {
        this.f66113d.setShowSubtitleButton(z10);
    }

    public final void setShutterColor(int i10) {
        this.f66113d.setShutterBackgroundColor(i10);
    }

    public final void setSubtitleStyle(@NotNull r4.j style) {
        Intrinsics.checkNotNullParameter(style, "style");
        SubtitleView subtitleView = this.f66113d.getSubtitleView();
        if (subtitleView != null) {
            subtitleView.e();
            subtitleView.f();
            if (style.h() > 0) {
                subtitleView.b(2, style.h());
            }
            subtitleView.setPadding(style.k(), style.m(), style.l(), style.j());
            if (style.i() == 0.0f) {
                subtitleView.setVisibility(8);
            } else {
                subtitleView.setAlpha(style.i());
                subtitleView.setVisibility(0);
            }
        }
        this.f66110a = style;
    }

    public final void setUseController(boolean z10) {
        this.f66113d.setUseController(z10);
        if (z10) {
            this.f66113d.setControllerAutoShow(true);
            this.f66113d.setControllerHideOnTouch(true);
            this.f66113d.R();
        }
    }

    public /* synthetic */ C6505k(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6505k(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66110a = new r4.j();
        TextView textView = new TextView(context);
        textView.setText("LIVE");
        textView.setTextColor(-1);
        textView.setTextSize(12.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-65536);
        gradientDrawable.setCornerRadius(6.0f);
        textView.setBackground(gradientDrawable);
        textView.setPadding(12, 4, 12, 4);
        textView.setVisibility(8);
        this.f66112c = textView;
        PlayerView playerView = new PlayerView(context);
        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        playerView.setShutterBackgroundColor(0);
        playerView.setUseController(true);
        playerView.setControllerAutoShow(true);
        playerView.setControllerHideOnTouch(true);
        playerView.setControllerShowTimeoutMs(5000);
        playerView.setShowSubtitleButton(false);
        playerView.setUseArtwork(false);
        playerView.setDefaultArtwork(null);
        playerView.setResizeMode(0);
        this.f66113d = playerView;
        addView(playerView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(16, 16, 16, 16);
        addView(textView, layoutParams);
        this.f66114e = new b();
        this.f66115f = new Runnable() { // from class: u4.j
            @Override // java.lang.Runnable
            public final void run() {
                C6505k.h(C6505k.this);
            }
        };
    }

    public final void k(int i10) {
    }
}
