package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lji extends FrameLayout {
    public final iji a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final boolean e;
    public final ImageView f;
    public final SubtitleView g;
    public final View h;
    public final TextView i;
    public final cji j;
    public final FrameLayout k;
    public final FrameLayout l;
    public zke m;
    public boolean n;
    public bji o;
    public boolean p;
    public Drawable q;
    public int r;
    public boolean s;
    public CharSequence t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lji(Context context) {
        super(context, null, 0);
        cji cjiVar = null;
        iji ijiVar = new iji(this);
        this.a = ijiVar;
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            ImageView imageView = new ImageView(context);
            if (lik.a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(2131231389, null));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(2131231389));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.exo_styled_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(0);
        }
        this.c = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            this.d = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(ijiVar);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.d = null;
        }
        this.e = false;
        this.k = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.l = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f = imageView2;
        this.p = imageView2 != null;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.g = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById = findViewById(R.id.exo_buffering);
        this.h = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.r = 0;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        cji cjiVar2 = (cji) findViewById(R.id.exo_controller);
        View findViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (cjiVar2 != null) {
            this.j = cjiVar2;
            cjiVar = cjiVar2;
        } else if (findViewById2 != null) {
            cjiVar = new cji(context);
            this.j = cjiVar;
            cjiVar.setId(R.id.exo_controller);
            cjiVar.setLayoutParams(findViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById2.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById2);
            viewGroup.removeView(findViewById2);
            viewGroup.addView(cjiVar, indexOfChild);
        } else {
            this.j = null;
        }
        this.u = cjiVar != null ? 5000 : 0;
        this.x = true;
        this.v = true;
        this.w = true;
        this.n = cjiVar != null;
        if (cjiVar != null) {
            hji hjiVar = cjiVar.a;
            int i = hjiVar.z;
            if (i != 3 && i != 2) {
                hjiVar.f();
                hjiVar.i(2);
            }
            cjiVar.d.add(ijiVar);
        }
        setClickable(true);
        j();
    }

    public static void a(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && height != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        zke zkeVar = this.m;
        return zkeVar != null && ((ug6) zkeVar).u() && ((ug6) this.m).n();
    }

    public final void c(boolean z) {
        if (!(b() && this.w) && m()) {
            cji cjiVar = this.j;
            boolean z2 = cjiVar.f() && cjiVar.getShowTimeoutMs() <= 0;
            boolean e = e();
            if (z || z2 || e) {
                f(e);
            }
        }
    }

    public final boolean d(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                ImageView imageView = this.f;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        zke zkeVar = this.m;
        if (zkeVar != null && ((ug6) zkeVar).u()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        cji cjiVar = this.j;
        if (z && m() && !cjiVar.f()) {
            c(true);
            return true;
        }
        if ((m() && cjiVar.b(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            c(true);
            return true;
        }
        if (z && m()) {
            c(true);
        }
        return false;
    }

    public final boolean e() {
        zke zkeVar = this.m;
        if (zkeVar == null) {
            return true;
        }
        int o = ((ug6) zkeVar).o();
        if (!this.v || ((ug6) this.m).j().p()) {
            return false;
        }
        if (o != 1 && o != 4) {
            zke zkeVar2 = this.m;
            zkeVar2.getClass();
            if (((ug6) zkeVar2).n()) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z) {
        if (m()) {
            int i = z ? 0 : this.u;
            cji cjiVar = this.j;
            cjiVar.setShowTimeoutMs(i);
            hji hjiVar = cjiVar.a;
            cji cjiVar2 = hjiVar.a;
            if (!cjiVar2.g()) {
                cjiVar2.setVisibility(0);
                cjiVar2.h();
                View view = cjiVar2.o;
                if (view != null) {
                    view.requestFocus();
                }
            }
            hjiVar.k();
        }
    }

    public final void g() {
        if (!m() || this.m == null) {
            return;
        }
        cji cjiVar = this.j;
        if (!cjiVar.f()) {
            c(true);
        } else if (this.x) {
            cjiVar.e();
        }
    }

    public List<j0l> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        int i = 5;
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            arrayList.add(new j0l(frameLayout, i));
        }
        cji cjiVar = this.j;
        if (cjiVar != null) {
            arrayList.add(new j0l(cjiVar, i));
        }
        return hv9.v(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.k;
        qx9.v(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.v;
    }

    public boolean getControllerHideOnTouch() {
        return this.x;
    }

    public int getControllerShowTimeoutMs() {
        return this.u;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.q;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.l;
    }

    @Nullable
    public zke getPlayer() {
        return this.m;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        qx9.u(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.g;
    }

    public boolean getUseArtwork() {
        return this.p;
    }

    public boolean getUseController() {
        return this.n;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.d;
    }

    public final void h() {
        yqk yqkVar;
        zke zkeVar = this.m;
        if (zkeVar != null) {
            ug6 ug6Var = (ug6) zkeVar;
            ug6Var.T();
            yqkVar = ug6Var.g0;
        } else {
            yqkVar = yqk.e;
        }
        int i = yqkVar.a;
        int i2 = yqkVar.b;
        int i3 = yqkVar.c;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = (i2 == 0 || i == 0) ? 0.0f : (i * yqkVar.d) / i2;
        View view = this.d;
        if (view instanceof TextureView) {
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i3 == 90 || i3 == 270)) {
                f2 = 1.0f / f2;
            }
            int i4 = this.y;
            iji ijiVar = this.a;
            if (i4 != 0) {
                view.removeOnLayoutChangeListener(ijiVar);
            }
            this.y = i3;
            if (i3 != 0) {
                view.addOnLayoutChangeListener(ijiVar);
            }
            a((TextureView) view, this.y);
        }
        if (!this.e) {
            f = f2;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (((defpackage.ug6) r5.m).n() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        boolean z;
        View view = this.h;
        if (view != null) {
            zke zkeVar = this.m;
            if (zkeVar != null && ((ug6) zkeVar).o() == 2) {
                int i = this.r;
                z = true;
                if (i != 2) {
                    if (i == 1) {
                    }
                }
                view.setVisibility(z ? 0 : 8);
            }
            z = false;
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void j() {
        cji cjiVar = this.j;
        if (cjiVar == null || !this.n) {
            setContentDescription(null);
        } else if (cjiVar.f()) {
            setContentDescription(this.x ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void k() {
        TextView textView = this.i;
        if (textView != null) {
            CharSequence charSequence = this.t;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            zke zkeVar = this.m;
            if (zkeVar != null) {
                ug6 ug6Var = (ug6) zkeVar;
                ug6Var.T();
                sf6 sf6Var = ug6Var.i0.f;
            }
            textView.setVisibility(8);
        }
    }

    public final void l(boolean z) {
        zke zkeVar = this.m;
        View view = this.c;
        ImageView imageView = this.f;
        boolean z2 = false;
        if (zkeVar != null) {
            ug6 ug6Var = (ug6) zkeVar;
            if (!ug6Var.k().a.isEmpty()) {
                if (z && !this.s && view != null) {
                    view.setVisibility(0);
                }
                if (ug6Var.k().a(2)) {
                    if (imageView != null) {
                        imageView.setImageResource(android.R.color.transparent);
                        imageView.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (view != null) {
                    view.setVisibility(0);
                }
                if (this.p) {
                    qx9.u(imageView);
                    ug6Var.T();
                    byte[] bArr = ug6Var.P.j;
                    if (bArr != null) {
                        z2 = d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                    }
                    if (z2 || d(this.q)) {
                        return;
                    }
                }
                if (imageView != null) {
                    imageView.setImageResource(android.R.color.transparent);
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
        }
        if (this.s) {
            return;
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            imageView.setVisibility(4);
        }
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final boolean m() {
        if (!this.n) {
            return false;
        }
        qx9.u(this.j);
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m() || this.m == null) {
            return false;
        }
        c(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        g();
        return super.performClick();
    }

    public void setAspectRatioListener(@Nullable uh0 uh0Var) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        qx9.u(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(uh0Var);
    }

    public void setControllerAutoShow(boolean z) {
        this.v = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.w = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        qx9.u(this.j);
        this.x = z;
        j();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@Nullable wii wiiVar) {
        cji cjiVar = this.j;
        qx9.u(cjiVar);
        cjiVar.setOnFullScreenModeChangedListener(wiiVar);
    }

    public void setControllerShowTimeoutMs(int i) {
        cji cjiVar = this.j;
        qx9.u(cjiVar);
        this.u = i;
        if (cjiVar.f()) {
            f(e());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(@Nullable bji bjiVar) {
        cji cjiVar = this.j;
        qx9.u(cjiVar);
        CopyOnWriteArrayList copyOnWriteArrayList = cjiVar.d;
        bji bjiVar2 = this.o;
        if (bjiVar2 == bjiVar) {
            return;
        }
        if (bjiVar2 != null) {
            copyOnWriteArrayList.remove(bjiVar2);
        }
        this.o = bjiVar;
        if (bjiVar != null) {
            copyOnWriteArrayList.add(bjiVar);
        }
        setControllerVisibilityListener((jji) null);
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        qx9.t(this.i != null);
        this.t = charSequence;
        k();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.q != drawable) {
            this.q = drawable;
            l(false);
        }
    }

    public void setErrorMessageProvider(@Nullable zp5 zp5Var) {
        if (zp5Var != null) {
            k();
        }
    }

    public void setFullscreenButtonClickListener(@Nullable kji kjiVar) {
        cji cjiVar = this.j;
        qx9.u(cjiVar);
        cjiVar.setOnFullScreenModeChangedListener(this.a);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.s != z) {
            this.s = z;
            l(false);
        }
    }

    public void setPlayer(@Nullable zke zkeVar) {
        qx9.t(Looper.myLooper() == Looper.getMainLooper());
        qx9.r(zkeVar == null || ((ug6) zkeVar).s == Looper.getMainLooper());
        zke zkeVar2 = this.m;
        if (zkeVar2 == zkeVar) {
            return;
        }
        View view = this.d;
        iji ijiVar = this.a;
        if (zkeVar2 != null) {
            ug6 ug6Var = (ug6) zkeVar2;
            ug6Var.A(ijiVar);
            if (view instanceof TextureView) {
                TextureView textureView = (TextureView) view;
                ug6Var.T();
                if (textureView == ug6Var.W) {
                    ug6Var.b();
                }
            } else if (view instanceof SurfaceView) {
                ug6Var.T();
                SurfaceHolder holder = ((SurfaceView) view).getHolder();
                ug6Var.T();
                if (holder != null && holder == ug6Var.T) {
                    ug6Var.b();
                }
            }
        }
        SubtitleView subtitleView = this.g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.m = zkeVar;
        boolean m = m();
        cji cjiVar = this.j;
        if (m) {
            cjiVar.setPlayer(zkeVar);
        }
        i();
        k();
        l(true);
        if (zkeVar == null) {
            if (cjiVar != null) {
                cjiVar.e();
                return;
            }
            return;
        }
        ug6 ug6Var2 = (ug6) zkeVar;
        if (ug6Var2.r(27)) {
            if (view instanceof TextureView) {
                ug6Var2.N((TextureView) view);
            } else if (view instanceof SurfaceView) {
                SurfaceView surfaceView = (SurfaceView) view;
                lg6 lg6Var = ug6Var2.x;
                ug6Var2.T();
                if (surfaceView instanceof kpk) {
                    ug6Var2.B();
                    ug6Var2.M(surfaceView);
                    ug6Var2.I(surfaceView.getHolder());
                } else if (surfaceView instanceof mxh) {
                    ug6Var2.B();
                    ug6Var2.U = (mxh) surfaceView;
                    kte c = ug6Var2.c(ug6Var2.y);
                    qx9.t(!c.g);
                    c.d = 10000;
                    mxh mxhVar = ug6Var2.U;
                    qx9.t(true ^ c.g);
                    c.e = mxhVar;
                    c.c();
                    ug6Var2.U.a.add(lg6Var);
                    ug6Var2.M(ug6Var2.U.getVideoSurface());
                    ug6Var2.I(surfaceView.getHolder());
                } else {
                    SurfaceHolder holder2 = surfaceView.getHolder();
                    ug6Var2.T();
                    if (holder2 == null) {
                        ug6Var2.b();
                    } else {
                        ug6Var2.B();
                        ug6Var2.V = true;
                        ug6Var2.T = holder2;
                        holder2.addCallback(lg6Var);
                        Surface surface = holder2.getSurface();
                        if (surface == null || !surface.isValid()) {
                            ug6Var2.M(null);
                            ug6Var2.x(0, 0);
                        } else {
                            ug6Var2.M(surface);
                            Rect surfaceFrame = holder2.getSurfaceFrame();
                            ug6Var2.x(surfaceFrame.width(), surfaceFrame.height());
                        }
                    }
                }
            }
            h();
        }
        if (subtitleView != null && ug6Var2.r(28)) {
            ug6Var2.T();
            subtitleView.setCues(ug6Var2.c0.a);
        }
        rd4 rd4Var = ug6Var2.l;
        ijiVar.getClass();
        rd4Var.e(ijiVar);
        c(false);
    }

    public void setRepeatToggleModes(int i) {
        cji cjiVar = this.j;
        qx9.u(cjiVar);
        cjiVar.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        qx9.u(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.r != i) {
            this.r = i;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        cji cjiVar = this.j;
        qx9.u(cjiVar);
        cjiVar.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        cji cjiVar = this.j;
        qx9.u(cjiVar);
        cjiVar.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        cji cjiVar = this.j;
        qx9.u(cjiVar);
        cjiVar.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        cji cjiVar = this.j;
        qx9.u(cjiVar);
        cjiVar.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        cji cjiVar = this.j;
        qx9.u(cjiVar);
        cjiVar.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        cji cjiVar = this.j;
        qx9.u(cjiVar);
        cjiVar.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        cji cjiVar = this.j;
        qx9.u(cjiVar);
        cjiVar.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        cji cjiVar = this.j;
        qx9.u(cjiVar);
        cjiVar.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        qx9.t((z && this.f == null) ? false : true);
        if (this.p != z) {
            this.p = z;
            l(false);
        }
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        cji cjiVar = this.j;
        qx9.t((z && cjiVar == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.n == z) {
            return;
        }
        this.n = z;
        if (m()) {
            cjiVar.setPlayer(this.m);
        } else if (cjiVar != null) {
            cjiVar.e();
            cjiVar.setPlayer(null);
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setControllerVisibilityListener(@Nullable jji jjiVar) {
        setControllerVisibilityListener((bji) null);
    }
}
