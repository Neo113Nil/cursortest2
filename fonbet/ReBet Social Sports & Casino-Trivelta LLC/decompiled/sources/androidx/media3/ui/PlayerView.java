package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.C2243l;
import androidx.media3.ui.PlayerView;
import b1.AbstractC2346O;
import b1.C2347a;
import b1.InterfaceC2341J;
import b1.InterfaceC2349c;
import b1.InterfaceC2363q;
import com.google.common.collect.AbstractC3445z;
import d1.C3987c;
import e1.AbstractC4134a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import l0.AbstractC5338c;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class PlayerView extends FrameLayout implements InterfaceC2349c {

    /* renamed from: A, reason: collision with root package name */
    public int f22199A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f22200B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f22201C;

    /* renamed from: D, reason: collision with root package name */
    public int f22202D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f22203E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f22204F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f22205G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f22206H;

    /* renamed from: a, reason: collision with root package name */
    public final c f22207a;

    /* renamed from: b, reason: collision with root package name */
    public final AspectRatioFrameLayout f22208b;

    /* renamed from: c, reason: collision with root package name */
    public final View f22209c;

    /* renamed from: d, reason: collision with root package name */
    public final View f22210d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22211e;

    /* renamed from: f, reason: collision with root package name */
    public final f f22212f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f22213g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f22214h;

    /* renamed from: i, reason: collision with root package name */
    public final SubtitleView f22215i;

    /* renamed from: j, reason: collision with root package name */
    public final View f22216j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f22217k;

    /* renamed from: l, reason: collision with root package name */
    public final C2243l f22218l;

    /* renamed from: m, reason: collision with root package name */
    public final FrameLayout f22219m;

    /* renamed from: n, reason: collision with root package name */
    public final FrameLayout f22220n;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f22221o;

    /* renamed from: p, reason: collision with root package name */
    public final Class f22222p;

    /* renamed from: q, reason: collision with root package name */
    public final Method f22223q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f22224r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC2341J f22225s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f22226t;

    /* renamed from: u, reason: collision with root package name */
    public d f22227u;

    /* renamed from: v, reason: collision with root package name */
    public C2243l.m f22228v;

    /* renamed from: w, reason: collision with root package name */
    public e f22229w;

    /* renamed from: x, reason: collision with root package name */
    public int f22230x;

    /* renamed from: y, reason: collision with root package name */
    public int f22231y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f22232z;

    public static class b {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    public final class c implements InterfaceC2341J.d, View.OnClickListener, C2243l.m, C2243l.d {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC2346O.b f22233a = new AbstractC2346O.b();

        /* renamed from: b, reason: collision with root package name */
        public Object f22234b;

        public c() {
        }

        @Override // b1.InterfaceC2341J.d
        public void F(int i10) {
            PlayerView.this.W();
            PlayerView.this.Z();
            PlayerView.this.Y();
        }

        @Override // androidx.media3.ui.C2243l.d
        public void G(boolean z10) {
            if (PlayerView.this.f22229w != null) {
                PlayerView.this.f22229w.a(z10);
            }
        }

        @Override // b1.InterfaceC2341J.d
        public void Q() {
            if (PlayerView.this.f22209c != null) {
                PlayerView.this.f22209c.setVisibility(4);
                if (PlayerView.this.B()) {
                    PlayerView.this.G();
                } else {
                    PlayerView.this.D();
                }
            }
        }

        @Override // b1.InterfaceC2341J.d
        public void W(int i10, int i11) {
            if (Build.VERSION.SDK_INT == 34 && (PlayerView.this.f22210d instanceof SurfaceView) && PlayerView.this.f22206H) {
                f fVar = (f) AbstractC4134a.e(PlayerView.this.f22212f);
                Handler handler = PlayerView.this.f22221o;
                SurfaceView surfaceView = (SurfaceView) PlayerView.this.f22210d;
                final PlayerView playerView = PlayerView.this;
                fVar.d(handler, surfaceView, new Runnable() { // from class: androidx.media3.ui.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlayerView.this.invalidate();
                    }
                });
            }
        }

        @Override // b1.InterfaceC2341J.d
        public void X(InterfaceC2341J.e eVar, InterfaceC2341J.e eVar2, int i10) {
            if (PlayerView.this.J() && PlayerView.this.f22204F) {
                PlayerView.this.F();
            }
        }

        @Override // b1.InterfaceC2341J.d
        public void c(b1.Y y10) {
            if (y10.equals(b1.Y.f24525e) || PlayerView.this.f22225s == null || PlayerView.this.f22225s.g0() == 1) {
                return;
            }
            PlayerView.this.V();
        }

        @Override // b1.InterfaceC2341J.d
        public void g0(b1.T t10) {
            InterfaceC2341J interfaceC2341J = (InterfaceC2341J) AbstractC4134a.e(PlayerView.this.f22225s);
            AbstractC2346O I10 = interfaceC2341J.E(17) ? interfaceC2341J.I() : AbstractC2346O.f24345a;
            if (I10.q()) {
                this.f22234b = null;
            } else if (!interfaceC2341J.E(30) || interfaceC2341J.z().b()) {
                Object obj = this.f22234b;
                if (obj != null) {
                    int b10 = I10.b(obj);
                    if (b10 != -1) {
                        if (interfaceC2341J.h0() == I10.f(b10, this.f22233a).f24356c) {
                            return;
                        }
                    }
                    this.f22234b = null;
                }
            } else {
                this.f22234b = I10.g(interfaceC2341J.X(), this.f22233a, true).f24355b;
            }
            PlayerView.this.a0(false);
        }

        @Override // androidx.media3.ui.C2243l.m
        public void m(int i10) {
            PlayerView.this.X();
            if (PlayerView.this.f22227u != null) {
                PlayerView.this.f22227u.a(i10);
            }
        }

        @Override // b1.InterfaceC2341J.d
        public void o0(boolean z10, int i10) {
            PlayerView.this.W();
            PlayerView.this.Y();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.U();
        }

        @Override // b1.InterfaceC2341J.d
        public void y(C3987c c3987c) {
            if (PlayerView.this.f22215i != null) {
                PlayerView.this.f22215i.setCues(c3987c.f44897a);
            }
        }
    }

    public interface d {
        void a(int i10);
    }

    public interface e {
        void a(boolean z10);
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public SurfaceSyncGroup f22236a;

        public f() {
        }

        public static /* synthetic */ void a(f fVar, SurfaceView surfaceView, Runnable runnable) {
            AttachedSurfaceControl rootSurfaceControl;
            boolean add;
            fVar.getClass();
            rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup a10 = J.a("exo-sync-b-334901521");
            fVar.f22236a = a10;
            add = a10.add(rootSurfaceControl, new Runnable() { // from class: androidx.media3.ui.Q
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.f.b();
                }
            });
            AbstractC4134a.g(add);
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(K.a());
        }

        public static /* synthetic */ void b() {
        }

        public void c() {
            SurfaceSyncGroup surfaceSyncGroup = this.f22236a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f22236a = null;
            }
        }

        public void d(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: androidx.media3.ui.P
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.f.a(PlayerView.f.this, surfaceView, runnable);
                }
            });
        }
    }

    public PlayerView(Context context) {
        this(context, null);
    }

    public static void P(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public static /* synthetic */ void a(PlayerView playerView, Bitmap bitmap) {
        playerView.getClass();
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        if (playerView.C()) {
            return;
        }
        playerView.T();
        playerView.y();
    }

    public static /* synthetic */ Object b(PlayerView playerView, Object obj, Method method, Object[] objArr) {
        playerView.getClass();
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        playerView.M((Bitmap) objArr[1]);
        return null;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f22213g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        b0();
    }

    private void setImageOutput(InterfaceC2341J interfaceC2341J) {
        Class cls = this.f22222p;
        if (cls == null || !cls.isAssignableFrom(interfaceC2341J.getClass())) {
            return;
        }
        try {
            ((Method) AbstractC4134a.e(this.f22223q)).invoke(interfaceC2341J, AbstractC4134a.e(this.f22224r));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void z(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(e1.Z.d0(context, resources, V.f22269a));
        imageView.setBackgroundColor(resources.getColor(T.f22248a, null));
    }

    public boolean A(KeyEvent keyEvent) {
        return d0() && this.f22218l.a0(keyEvent);
    }

    public final boolean B() {
        InterfaceC2341J interfaceC2341J = this.f22225s;
        return interfaceC2341J != null && this.f22224r != null && interfaceC2341J.E(30) && interfaceC2341J.z().c(4);
    }

    public final boolean C() {
        InterfaceC2341J interfaceC2341J = this.f22225s;
        return interfaceC2341J != null && interfaceC2341J.E(30) && interfaceC2341J.z().c(2);
    }

    public final void D() {
        G();
        ImageView imageView = this.f22213g;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    public final void E() {
        ImageView imageView = this.f22214h;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f22214h.setVisibility(4);
        }
    }

    public void F() {
        C2243l c2243l = this.f22218l;
        if (c2243l != null) {
            c2243l.e0();
        }
    }

    public final void G() {
        ImageView imageView = this.f22213g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    public final boolean H(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    public final boolean I() {
        Drawable drawable;
        ImageView imageView = this.f22213g;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    public final boolean J() {
        InterfaceC2341J interfaceC2341J = this.f22225s;
        return interfaceC2341J != null && interfaceC2341J.E(16) && this.f22225s.j() && this.f22225s.S();
    }

    public final void K(boolean z10) {
        if (!(J() && this.f22204F) && d0()) {
            boolean z11 = this.f22218l.k0() && this.f22218l.getShowTimeoutMs() <= 0;
            boolean Q10 = Q();
            if (z10 || z11 || Q10) {
                S(Q10);
            }
        }
    }

    public void L(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public final void M(final Bitmap bitmap) {
        this.f22221o.post(new Runnable() { // from class: androidx.media3.ui.G
            @Override // java.lang.Runnable
            public final void run() {
                PlayerView.a(PlayerView.this, bitmap);
            }
        });
    }

    public final boolean N(InterfaceC2341J interfaceC2341J) {
        byte[] bArr;
        if (interfaceC2341J == null || !interfaceC2341J.E(18) || (bArr = interfaceC2341J.q0().artworkData) == null) {
            return false;
        }
        return O(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    public final boolean O(Drawable drawable) {
        if (this.f22214h != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f22230x == 2) {
                    f10 = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                L(this.f22208b, f10);
                this.f22214h.setScaleType(scaleType);
                this.f22214h.setImageDrawable(drawable);
                this.f22214h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean Q() {
        InterfaceC2341J interfaceC2341J = this.f22225s;
        if (interfaceC2341J == null) {
            return true;
        }
        int g02 = interfaceC2341J.g0();
        if (!this.f22203E) {
            return false;
        }
        if (this.f22225s.E(17) && this.f22225s.I().q()) {
            return false;
        }
        return g02 == 1 || g02 == 4 || !((InterfaceC2341J) AbstractC4134a.e(this.f22225s)).S();
    }

    public void R() {
        S(Q());
    }

    public final void S(boolean z10) {
        if (d0()) {
            this.f22218l.setShowTimeoutMs(z10 ? 0 : this.f22202D);
            this.f22218l.v0();
        }
    }

    public final void T() {
        ImageView imageView = this.f22213g;
        if (imageView != null) {
            imageView.setVisibility(0);
            b0();
        }
    }

    public final void U() {
        if (!d0() || this.f22225s == null) {
            return;
        }
        if (!this.f22218l.k0()) {
            K(true);
        } else if (this.f22205G) {
            this.f22218l.e0();
        }
    }

    public final void V() {
        InterfaceC2341J interfaceC2341J = this.f22225s;
        b1.Y Z10 = interfaceC2341J != null ? interfaceC2341J.Z() : b1.Y.f24525e;
        int i10 = Z10.f24529a;
        int i11 = Z10.f24530b;
        L(this.f22208b, this.f22211e ? 0.0f : (i11 == 0 || i10 == 0) ? 0.0f : (i10 * Z10.f24532d) / i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r4.f22225s.S() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        boolean z10;
        if (this.f22216j != null) {
            InterfaceC2341J interfaceC2341J = this.f22225s;
            if (interfaceC2341J != null && interfaceC2341J.g0() == 2) {
                int i10 = this.f22199A;
                z10 = true;
                if (i10 != 2) {
                    if (i10 == 1) {
                    }
                }
                this.f22216j.setVisibility(z10 ? 0 : 8);
            }
            z10 = false;
            this.f22216j.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void X() {
        C2243l c2243l = this.f22218l;
        if (c2243l == null || !this.f22226t) {
            setContentDescription(null);
        } else if (c2243l.k0()) {
            setContentDescription(this.f22205G ? getResources().getString(b0.f22369e) : null);
        } else {
            setContentDescription(getResources().getString(b0.f22376l));
        }
    }

    public final void Y() {
        if (J() && this.f22204F) {
            F();
        } else {
            K(false);
        }
    }

    public final void Z() {
        TextView textView = this.f22217k;
        if (textView != null) {
            CharSequence charSequence = this.f22201C;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f22217k.setVisibility(0);
            } else {
                InterfaceC2341J interfaceC2341J = this.f22225s;
                if (interfaceC2341J != null) {
                    interfaceC2341J.w();
                }
                this.f22217k.setVisibility(8);
            }
        }
    }

    public final void a0(boolean z10) {
        InterfaceC2341J interfaceC2341J = this.f22225s;
        boolean z11 = false;
        boolean z12 = (interfaceC2341J == null || !interfaceC2341J.E(30) || interfaceC2341J.z().b()) ? false : true;
        if (!this.f22200B && (!z12 || z10)) {
            E();
            y();
            D();
        }
        if (z12) {
            boolean C10 = C();
            boolean B10 = B();
            if (!C10 && !B10) {
                y();
                D();
            }
            View view = this.f22209c;
            if (view != null && view.getVisibility() == 4 && I()) {
                z11 = true;
            }
            if (B10 && !C10 && z11) {
                y();
                T();
            } else if (C10 && !B10 && z11) {
                D();
            }
            if (C10 || B10 || !c0() || !(N(interfaceC2341J) || O(this.f22232z))) {
                E();
            }
        }
    }

    public final void b0() {
        Drawable drawable;
        ImageView imageView = this.f22213g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float f10 = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f22231y == 1) {
            f10 = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.f22213g.getVisibility() == 0) {
            L(this.f22208b, f10);
        }
        this.f22213g.setScaleType(scaleType);
    }

    public final boolean c0() {
        if (this.f22230x == 0) {
            return false;
        }
        AbstractC4134a.i(this.f22214h);
        return true;
    }

    public final boolean d0() {
        if (!this.f22226t) {
            return false;
        }
        AbstractC4134a.i(this.f22218l);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        f fVar;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (fVar = this.f22212f) != null && this.f22206H) {
            fVar.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC2341J interfaceC2341J = this.f22225s;
        if (interfaceC2341J != null && interfaceC2341J.E(16) && this.f22225s.j()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean H10 = H(keyEvent.getKeyCode());
        if (H10 && d0() && !this.f22218l.k0()) {
            K(true);
            return true;
        }
        if (A(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            K(true);
            return true;
        }
        if (H10 && d0()) {
            K(true);
        }
        return false;
    }

    public List<C2347a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f22220n;
        if (frameLayout != null) {
            arrayList.add(new C2347a.C0429a(frameLayout, 4).b("Transparent overlay does not impact viewability").a());
        }
        C2243l c2243l = this.f22218l;
        if (c2243l != null) {
            arrayList.add(new C2347a.C0429a(c2243l, 1).a());
        }
        return AbstractC3445z.o(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) AbstractC4134a.j(this.f22219m, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f22230x;
    }

    public boolean getControllerAutoShow() {
        return this.f22203E;
    }

    public boolean getControllerHideOnTouch() {
        return this.f22205G;
    }

    public int getControllerShowTimeoutMs() {
        return this.f22202D;
    }

    public Drawable getDefaultArtwork() {
        return this.f22232z;
    }

    public int getImageDisplayMode() {
        return this.f22231y;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f22220n;
    }

    public InterfaceC2341J getPlayer() {
        return this.f22225s;
    }

    public int getResizeMode() {
        AbstractC4134a.i(this.f22208b);
        return this.f22208b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f22215i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f22230x != 0;
    }

    public boolean getUseController() {
        return this.f22226t;
    }

    public View getVideoSurfaceView() {
        return this.f22210d;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!d0() || this.f22225s == null) {
            return false;
        }
        K(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        U();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        AbstractC4134a.g(i10 == 0 || this.f22214h != null);
        if (this.f22230x != i10) {
            this.f22230x = i10;
            a0(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        AbstractC4134a.i(this.f22208b);
        this.f22208b.setAspectRatioListener(bVar);
    }

    public void setControllerAnimationEnabled(boolean z10) {
        AbstractC4134a.i(this.f22218l);
        this.f22218l.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f22203E = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f22204F = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        AbstractC4134a.i(this.f22218l);
        this.f22205G = z10;
        X();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(C2243l.d dVar) {
        AbstractC4134a.i(this.f22218l);
        this.f22229w = null;
        this.f22218l.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        AbstractC4134a.i(this.f22218l);
        this.f22202D = i10;
        if (this.f22218l.k0()) {
            R();
        }
    }

    public void setControllerVisibilityListener(d dVar) {
        this.f22227u = dVar;
        if (dVar != null) {
            setControllerVisibilityListener((C2243l.m) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC4134a.g(this.f22217k != null);
        this.f22201C = charSequence;
        Z();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f22232z != drawable) {
            this.f22232z = drawable;
            a0(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.f22206H = z10;
    }

    public void setErrorMessageProvider(InterfaceC2363q interfaceC2363q) {
        if (interfaceC2363q != null) {
            Z();
        }
    }

    public void setFullscreenButtonClickListener(e eVar) {
        AbstractC4134a.i(this.f22218l);
        this.f22229w = eVar;
        this.f22218l.setOnFullScreenModeChangedListener(this.f22207a);
    }

    public void setFullscreenButtonState(boolean z10) {
        AbstractC4134a.i(this.f22218l);
        this.f22218l.B0(z10);
    }

    public void setImageDisplayMode(int i10) {
        AbstractC4134a.g(this.f22213g != null);
        if (this.f22231y != i10) {
            this.f22231y = i10;
            b0();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f22200B != z10) {
            this.f22200B = z10;
            a0(false);
        }
    }

    public void setPlayer(InterfaceC2341J interfaceC2341J) {
        AbstractC4134a.g(Looper.myLooper() == Looper.getMainLooper());
        AbstractC4134a.a(interfaceC2341J == null || interfaceC2341J.J() == Looper.getMainLooper());
        InterfaceC2341J interfaceC2341J2 = this.f22225s;
        if (interfaceC2341J2 == interfaceC2341J) {
            return;
        }
        if (interfaceC2341J2 != null) {
            interfaceC2341J2.v(this.f22207a);
            if (interfaceC2341J2.E(27)) {
                View view = this.f22210d;
                if (view instanceof TextureView) {
                    interfaceC2341J2.Y((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC2341J2.k0((SurfaceView) view);
                }
            }
            x(interfaceC2341J2);
        }
        SubtitleView subtitleView = this.f22215i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f22225s = interfaceC2341J;
        if (d0()) {
            this.f22218l.setPlayer(interfaceC2341J);
        }
        W();
        Z();
        a0(true);
        if (interfaceC2341J == null) {
            F();
            return;
        }
        if (interfaceC2341J.E(27)) {
            View view2 = this.f22210d;
            if (view2 instanceof TextureView) {
                interfaceC2341J.M((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                interfaceC2341J.r((SurfaceView) view2);
            }
            if (!interfaceC2341J.E(30) || interfaceC2341J.z().d(2)) {
                V();
            }
        }
        if (this.f22215i != null && interfaceC2341J.E(28)) {
            this.f22215i.setCues(interfaceC2341J.C().f44897a);
        }
        interfaceC2341J.p(this.f22207a);
        setImageOutput(interfaceC2341J);
        K(false);
    }

    public void setRepeatToggleModes(int i10) {
        AbstractC4134a.i(this.f22218l);
        this.f22218l.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        AbstractC4134a.i(this.f22208b);
        this.f22208b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f22199A != i10) {
            this.f22199A = i10;
            W();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        AbstractC4134a.i(this.f22218l);
        this.f22218l.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        AbstractC4134a.i(this.f22218l);
        this.f22218l.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        AbstractC4134a.i(this.f22218l);
        this.f22218l.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        AbstractC4134a.i(this.f22218l);
        this.f22218l.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        AbstractC4134a.i(this.f22218l);
        this.f22218l.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        AbstractC4134a.i(this.f22218l);
        this.f22218l.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        AbstractC4134a.i(this.f22218l);
        this.f22218l.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        AbstractC4134a.i(this.f22218l);
        this.f22218l.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        AbstractC4134a.i(this.f22218l);
        this.f22218l.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f22209c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z10) {
        AbstractC4134a.i(this.f22218l);
        this.f22218l.setTimeBarScrubbingEnabled(z10);
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        AbstractC4134a.g((z10 && this.f22218l == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f22226t == z10) {
            return;
        }
        this.f22226t = z10;
        if (d0()) {
            this.f22218l.setPlayer(this.f22225s);
        } else {
            C2243l c2243l = this.f22218l;
            if (c2243l != null) {
                c2243l.e0();
                this.f22218l.setPlayer(null);
            }
        }
        X();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f22210d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public final void x(InterfaceC2341J interfaceC2341J) {
        Class cls = this.f22222p;
        if (cls == null || !cls.isAssignableFrom(interfaceC2341J.getClass())) {
            return;
        }
        try {
            ((Method) AbstractC4134a.e(this.f22223q)).invoke(interfaceC2341J, null);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void y() {
        View view = this.f22209c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z14;
        boolean z15;
        a aVar;
        boolean z16;
        Class<ExoPlayer> cls;
        Object obj;
        Method method;
        int i20;
        c cVar = new c();
        this.f22207a = cVar;
        this.f22221o = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f22208b = null;
            this.f22209c = null;
            this.f22210d = null;
            this.f22211e = false;
            this.f22212f = null;
            this.f22213g = null;
            this.f22214h = null;
            this.f22215i = null;
            this.f22216j = null;
            this.f22217k = null;
            this.f22218l = null;
            this.f22219m = null;
            this.f22220n = null;
            this.f22222p = null;
            this.f22223q = null;
            this.f22224r = null;
            ImageView imageView = new ImageView(context);
            z(context, getResources(), imageView);
            addView(imageView);
            return;
        }
        int i21 = Z.f22341c;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d0.PlayerView, i10, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(d0.f22426d0);
                int color = obtainStyledAttributes.getColor(d0.f22426d0, 0);
                int resourceId = obtainStyledAttributes.getResourceId(d0.f22418Z, i21);
                boolean z17 = obtainStyledAttributes.getBoolean(d0.f22430f0, true);
                int i22 = obtainStyledAttributes.getInt(d0.f22411S, 1);
                int resourceId2 = obtainStyledAttributes.getResourceId(d0.f22413U, 0);
                int i23 = obtainStyledAttributes.getInt(d0.f22416X, 0);
                boolean z18 = obtainStyledAttributes.getBoolean(d0.f22432g0, true);
                int i24 = obtainStyledAttributes.getInt(d0.f22428e0, 1);
                int i25 = obtainStyledAttributes.getInt(d0.f22420a0, 0);
                i11 = obtainStyledAttributes.getInt(d0.f22424c0, 5000);
                boolean z19 = obtainStyledAttributes.getBoolean(d0.f22415W, true);
                boolean z20 = obtainStyledAttributes.getBoolean(d0.f22412T, true);
                int integer = obtainStyledAttributes.getInteger(d0.f22422b0, 0);
                this.f22200B = obtainStyledAttributes.getBoolean(d0.f22417Y, this.f22200B);
                boolean z21 = obtainStyledAttributes.getBoolean(d0.f22414V, true);
                obtainStyledAttributes.recycle();
                i14 = resourceId2;
                z11 = z19;
                z14 = hasValue;
                i15 = i25;
                z13 = z21;
                i12 = resourceId;
                z10 = z18;
                z12 = z20;
                z15 = z17;
                i17 = i23;
                i19 = i22;
                i18 = color;
                i16 = i24;
                i13 = integer;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            i12 = i21;
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 1;
            i17 = 0;
            i18 = 0;
            i19 = 1;
            z14 = false;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(X.f22319i);
        this.f22208b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            P(aspectRatioFrameLayout, i15);
        }
        View findViewById = findViewById(X.f22304N);
        this.f22209c = findViewById;
        if (findViewById != null && z14) {
            findViewById.setBackgroundColor(i18);
        }
        if (aspectRatioFrameLayout != null && i16 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i16 == 2) {
                this.f22210d = new TextureView(context);
            } else if (i16 == 3) {
                try {
                    int i26 = G1.l.f3825m;
                    this.f22210d = (View) G1.l.class.getConstructor(Context.class).newInstance(context);
                    z16 = true;
                    this.f22210d.setLayoutParams(layoutParams);
                    this.f22210d.setOnClickListener(cVar);
                    this.f22210d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f22210d, 0);
                    aVar = null;
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i16 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (Build.VERSION.SDK_INT >= 34) {
                    b.a(surfaceView);
                }
                this.f22210d = surfaceView;
            } else {
                try {
                    int i27 = F1.w.f3470b;
                    this.f22210d = (View) F1.w.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z16 = false;
            this.f22210d.setLayoutParams(layoutParams);
            this.f22210d.setOnClickListener(cVar);
            this.f22210d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f22210d, 0);
            aVar = null;
        } else {
            aVar = null;
            this.f22210d = null;
            z16 = false;
        }
        this.f22211e = z16;
        this.f22212f = Build.VERSION.SDK_INT == 34 ? new f() : null;
        this.f22219m = (FrameLayout) findViewById(X.f22311a);
        this.f22220n = (FrameLayout) findViewById(X.f22292B);
        this.f22213g = (ImageView) findViewById(X.f22331u);
        this.f22231y = i17;
        try {
            cls = ExoPlayer.class;
            ImageOutput imageOutput = ImageOutput.f21341a;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            obj = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: androidx.media3.ui.F
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method2, Object[] objArr) {
                    return PlayerView.b(PlayerView.this, obj2, method2, objArr);
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            obj = null;
            method = null;
        }
        this.f22222p = cls;
        this.f22223q = method;
        this.f22224r = obj;
        ImageView imageView2 = (ImageView) findViewById(X.f22312b);
        this.f22214h = imageView2;
        this.f22230x = (!z15 || i19 == 0 || imageView2 == null) ? 0 : i19;
        if (i14 != 0) {
            this.f22232z = AbstractC5338c.getDrawable(getContext(), i14);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(X.f22307Q);
        this.f22215i = subtitleView;
        if (subtitleView != null) {
            subtitleView.e();
            subtitleView.f();
        }
        View findViewById2 = findViewById(X.f22316f);
        this.f22216j = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f22199A = i13;
        TextView textView = (TextView) findViewById(X.f22324n);
        this.f22217k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C2243l c2243l = (C2243l) findViewById(X.f22320j);
        View findViewById3 = findViewById(X.f22321k);
        if (c2243l != null) {
            this.f22218l = c2243l;
            i20 = 0;
        } else if (findViewById3 != null) {
            i20 = 0;
            C2243l c2243l2 = new C2243l(context, null, 0, attributeSet);
            this.f22218l = c2243l2;
            c2243l2.setId(X.f22320j);
            c2243l2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(c2243l2, indexOfChild);
        } else {
            i20 = 0;
            this.f22218l = null;
        }
        C2243l c2243l3 = this.f22218l;
        this.f22202D = c2243l3 != null ? i11 : i20;
        this.f22205G = z11;
        this.f22203E = z12;
        this.f22204F = z13;
        this.f22226t = (!z10 || c2243l3 == null) ? i20 : 1;
        if (c2243l3 != null) {
            c2243l3.f0();
            this.f22218l.Y(this.f22207a);
        }
        if (z10) {
            setClickable(true);
        }
        X();
    }

    @Deprecated
    public void setControllerVisibilityListener(C2243l.m mVar) {
        AbstractC4134a.i(this.f22218l);
        C2243l.m mVar2 = this.f22228v;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f22218l.s0(mVar2);
        }
        this.f22228v = mVar;
        if (mVar != null) {
            this.f22218l.Y(mVar);
            setControllerVisibilityListener((d) null);
        }
    }
}
