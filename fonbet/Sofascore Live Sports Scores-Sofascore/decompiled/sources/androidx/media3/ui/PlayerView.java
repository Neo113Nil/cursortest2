package androidx.media3.ui;

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
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ale;
import defpackage.aq5;
import defpackage.bh;
import defpackage.bnd;
import defpackage.fg;
import defpackage.fne;
import defpackage.hv9;
import defpackage.ipk;
import defpackage.is8;
import defpackage.nne;
import defpackage.nxh;
import defpackage.one;
import defpackage.q9;
import defpackage.qxe;
import defpackage.rxe;
import defpackage.suj;
import defpackage.sw9;
import defpackage.sxe;
import defpackage.tne;
import defpackage.txe;
import defpackage.vh0;
import defpackage.xuk;
import defpackage.z1a;
import defpackage.zjf;
import defpackage.zqk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class PlayerView extends FrameLayout implements bh {
    public static final /* synthetic */ int H = 0;
    public boolean A;
    public CharSequence B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final qxe a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final boolean e;
    public final txe f;
    public final ImageView g;
    public final ImageView h;
    public final SubtitleView i;
    public final View j;
    public final TextView k;
    public final one l;
    public final FrameLayout m;
    public final FrameLayout n;
    public final Handler o;
    public final Class p;
    public final Method q;
    public final Object r;
    public ale s;
    public boolean t;
    public nne u;
    public sxe v;
    public int w;
    public int x;
    public Drawable y;
    public int z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029f  */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.view.View, android.view.ViewGroup, androidx.media3.ui.PlayerView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlayerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Throwable th;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        int i9;
        boolean z6;
        boolean z7;
        int i10;
        Class<ExoPlayer> cls;
        Object obj;
        Method method;
        SubtitleView subtitleView;
        View findViewById;
        TextView textView;
        one oneVar;
        qxe qxeVar = new qxe(this);
        this.a = qxeVar;
        this.o = new Handler(Looper.getMainLooper());
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
            this.m = null;
            this.n = null;
            this.p = null;
            this.q = null;
            this.r = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            imageView.setImageDrawable(resources.getDrawable(2131231389, context.getTheme()));
            imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, zjf.d, 0, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(42);
                int color = obtainStyledAttributes.getColor(42, 0);
                int resourceId = obtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                boolean z8 = obtainStyledAttributes.getBoolean(50, true);
                int i11 = obtainStyledAttributes.getInt(3, 1);
                th = null;
                int resourceId2 = obtainStyledAttributes.getResourceId(9, 0);
                int i12 = obtainStyledAttributes.getInt(15, 0);
                boolean z9 = obtainStyledAttributes.getBoolean(51, true);
                int i13 = obtainStyledAttributes.getInt(45, 1);
                int i14 = obtainStyledAttributes.getInt(28, 0);
                z5 = z9;
                i = obtainStyledAttributes.getInt(38, 5000);
                boolean z10 = obtainStyledAttributes.getBoolean(14, true);
                boolean z11 = obtainStyledAttributes.getBoolean(4, true);
                int integer = obtainStyledAttributes.getInteger(35, 0);
                this.A = obtainStyledAttributes.getBoolean(16, this.A);
                boolean z12 = obtainStyledAttributes.getBoolean(13, true);
                obtainStyledAttributes.recycle();
                i2 = resourceId;
                z2 = z11;
                i5 = i12;
                z6 = hasValue;
                i3 = integer;
                i8 = color;
                i7 = i13;
                i6 = i14;
                i4 = resourceId2;
                z3 = z12;
                z = z10;
                i9 = i11;
                z4 = z8;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            th = null;
            i = 5000;
            i2 = R.layout.exo_player_view;
            z = true;
            z2 = true;
            z3 = true;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 1;
            i8 = 0;
            z4 = true;
            z5 = true;
            i9 = 1;
            z6 = false;
        }
        LayoutInflater.from(context).inflate(i2, (ViewGroup) this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i6);
        }
        View findViewById2 = findViewById(R.id.exo_shutter);
        this.c = findViewById2;
        if (findViewById2 != null && z6) {
            findViewById2.setBackgroundColor(i8);
        }
        if (aspectRatioFrameLayout == null || i7 == 0) {
            this.d = th;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i7 == 2) {
                this.d = new TextureView(context);
            } else if (i7 == 3) {
                try {
                    int i15 = nxh.l;
                    this.d = (View) nxh.class.getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.d.setLayoutParams(layoutParams);
                    this.d.setOnClickListener(qxeVar);
                    this.d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.d, 0);
                } catch (Exception e) {
                    sw9.m("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    throw th;
                }
            } else if (i7 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (Build.VERSION.SDK_INT >= 34) {
                    q9.K(surfaceView);
                }
                this.d = surfaceView;
            } else {
                try {
                    int i16 = ipk.b;
                    this.d = (View) ipk.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    sw9.m("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    throw th;
                }
            }
            z7 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(qxeVar);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
        }
        this.e = z7;
        this.f = Build.VERSION.SDK_INT == 34 ? new txe() : null;
        this.m = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.n = (FrameLayout) findViewById(R.id.exo_overlay);
        this.g = (ImageView) findViewById(R.id.exo_image);
        this.x = i5;
        try {
            cls = ExoPlayer.class;
            int i17 = 1;
            Class<?>[] clsArr = new Class[1];
            i10 = 0;
            try {
                clsArr[0] = ImageOutput.class;
                method = cls.getMethod("setImageOutput", clsArr);
                obj = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new bnd(this, i17));
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                cls = null;
                obj = null;
                method = null;
                this.p = cls;
                this.q = method;
                this.r = obj;
                ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
                this.h = imageView2;
                this.w = (z4 || i9 == 0 || imageView2 == null) ? i10 : i9;
                if (i4 != 0) {
                }
                subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
                this.i = subtitleView;
                if (subtitleView != null) {
                }
                findViewById = findViewById(R.id.exo_buffering);
                this.j = findViewById;
                if (findViewById != null) {
                }
                this.z = i3;
                textView = (TextView) findViewById(R.id.exo_error_message);
                this.k = textView;
                if (textView != null) {
                }
                oneVar = (one) findViewById(R.id.exo_controller);
                View findViewById3 = findViewById(R.id.exo_controller_placeholder);
                if (oneVar == null) {
                }
                this.C = oneVar == null ? i : i10;
                this.F = z;
                this.D = z2;
                this.E = z3;
                this.t = (z5 || oneVar == null) ? i10 : 1;
                if (oneVar != null) {
                }
                if (z5) {
                }
                l();
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            i10 = 0;
        }
        this.p = cls;
        this.q = method;
        this.r = obj;
        ImageView imageView22 = (ImageView) findViewById(R.id.exo_artwork);
        this.h = imageView22;
        this.w = (z4 || i9 == 0 || imageView22 == null) ? i10 : i9;
        if (i4 != 0) {
            this.y = getContext().getDrawable(i4);
        }
        subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.i = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        findViewById = findViewById(R.id.exo_buffering);
        this.j = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.z = i3;
        textView = (TextView) findViewById(R.id.exo_error_message);
        this.k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        oneVar = (one) findViewById(R.id.exo_controller);
        View findViewById32 = findViewById(R.id.exo_controller_placeholder);
        if (oneVar == null) {
            this.l = oneVar;
        } else if (findViewById32 != null) {
            oneVar = new one(context, attributeSet);
            this.l = oneVar;
            oneVar.setId(R.id.exo_controller);
            oneVar.setLayoutParams(findViewById32.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById32.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById32);
            viewGroup.removeView(findViewById32);
            viewGroup.addView(oneVar, indexOfChild);
        } else {
            this.l = null;
            oneVar = null;
        }
        this.C = oneVar == null ? i : i10;
        this.F = z;
        this.D = z2;
        this.E = z3;
        this.t = (z5 || oneVar == null) ? i10 : 1;
        if (oneVar != null) {
            tne tneVar = oneVar.a;
            int i18 = tneVar.A;
            if (i18 != 3 && i18 != 2) {
                tneVar.f();
                tneVar.i(2);
            }
            qxe qxeVar2 = this.a;
            qxeVar2.getClass();
            oneVar.k.add(qxeVar2);
        }
        if (z5) {
            setClickable(true);
        }
        l();
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(ale aleVar) {
        Class cls = this.p;
        if (cls == null || !cls.isAssignableFrom(aleVar.getClass())) {
            return;
        }
        try {
            Method method = this.q;
            method.getClass();
            Object obj = this.r;
            obj.getClass();
            method.invoke(aleVar, obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            is8.h(e);
        }
    }

    public final boolean a() {
        ale aleVar = this.s;
        return aleVar != null && this.r != null && aleVar.k(30) && aleVar.i().a(4);
    }

    public final void b() {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final boolean c() {
        ale aleVar = this.s;
        return aleVar != null && aleVar.k(16) && this.s.isPlayingAd() && this.s.getPlayWhenReady();
    }

    public final void d(Bitmap bitmap) {
        setImage(new BitmapDrawable(getResources(), bitmap));
        ale aleVar = this.s;
        if (aleVar != null && aleVar.k(30) && aleVar.i().a(2)) {
            return;
        }
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(0);
            o();
        }
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        txe txeVar;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (txeVar = this.f) != null && this.G) {
            txeVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ale aleVar = this.s;
        if (aleVar != null && aleVar.k(16) && this.s.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        one oneVar = this.l;
        if (z && p() && !oneVar.i()) {
            e(true);
            return true;
        }
        if ((p() && oneVar.c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z && p()) {
            e(true);
        }
        return false;
    }

    public final void e(boolean z) {
        if (!(c() && this.E) && p()) {
            one oneVar = this.l;
            boolean z2 = oneVar.i() && oneVar.getShowTimeoutMs() <= 0;
            boolean g = g();
            if (z || z2 || g) {
                h(g);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.h;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.w == 2) {
                    f = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        ale aleVar = this.s;
        if (aleVar != null) {
            int playbackState = aleVar.getPlaybackState();
            if (!this.D) {
                return false;
            }
            if (this.s.k(17) && this.s.getCurrentTimeline().p()) {
                return false;
            }
            if (playbackState != 1 && playbackState != 4) {
                ale aleVar2 = this.s;
                aleVar2.getClass();
                if (aleVar2.getPlayWhenReady()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.bh
    public List<fg> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.n;
        if (frameLayout != null) {
            arrayList.add(new fg(frameLayout, "Transparent overlay does not impact viewability", 4));
        }
        one oneVar = this.l;
        if (oneVar != null) {
            arrayList.add(new fg(oneVar, null, 1));
        }
        return hv9.v(arrayList);
    }

    @Override // defpackage.bh
    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.m;
        z1a.y(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.w;
    }

    public boolean getControllerAutoShow() {
        return this.D;
    }

    public boolean getControllerHideOnTouch() {
        return this.F;
    }

    public int getControllerShowTimeoutMs() {
        return this.C;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.y;
    }

    public int getImageDisplayMode() {
        return this.x;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.n;
    }

    @Nullable
    public ale getPlayer() {
        return this.s;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        aspectRatioFrameLayout.getClass();
        return aspectRatioFrameLayout.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.w != 0;
    }

    public boolean getUseController() {
        return this.t;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.d;
    }

    public final void h(boolean z) {
        if (p()) {
            int i = z ? 0 : this.C;
            one oneVar = this.l;
            oneVar.setShowTimeoutMs(i);
            tne tneVar = oneVar.a;
            one oneVar2 = tneVar.a;
            if (!oneVar2.k()) {
                oneVar2.setVisibility(0);
                oneVar2.m();
                ImageView imageView = oneVar2.v;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            tneVar.k();
        }
    }

    public final void i() {
        if (!p() || this.s == null) {
            return;
        }
        one oneVar = this.l;
        if (!oneVar.i()) {
            e(true);
        } else if (this.F) {
            oneVar.f();
        }
    }

    public final void j() {
        ale aleVar = this.s;
        zqk v = aleVar != null ? aleVar.v() : zqk.d;
        int i = v.a;
        int i2 = v.b;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = (i2 == 0 || i == 0) ? 0.0f : (i * v.c) / i2;
        if (!this.e) {
            f = f2;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    public final void k() {
        int i;
        View view = this.j;
        if (view != null) {
            ale aleVar = this.s;
            view.setVisibility((aleVar != null && aleVar.getPlaybackState() == 2 && ((i = this.z) == 2 || (i == 1 && this.s.getPlayWhenReady()))) ? 0 : 8);
        }
    }

    public final void l() {
        one oneVar = this.l;
        if (oneVar == null || !this.t) {
            setContentDescription(null);
        } else if (oneVar.i()) {
            setContentDescription(this.F ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void m() {
        TextView textView = this.k;
        if (textView != null) {
            CharSequence charSequence = this.B;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                ale aleVar = this.s;
                if (aleVar != null) {
                    aleVar.h();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void n(boolean z) {
        byte[] bArr;
        Drawable drawable;
        ale aleVar = this.s;
        boolean z2 = false;
        boolean z3 = (aleVar == null || !aleVar.k(30) || aleVar.i().a.isEmpty()) ? false : true;
        boolean z4 = this.A;
        ImageView imageView = this.h;
        View view = this.c;
        if (!z4 && (!z3 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            b();
        }
        if (z3) {
            ale aleVar2 = this.s;
            boolean z5 = aleVar2 != null && aleVar2.k(30) && aleVar2.i().a(2);
            boolean a = a();
            if (!z5 && !a) {
                if (view != null) {
                    view.setVisibility(0);
                }
                b();
            }
            ImageView imageView2 = this.g;
            boolean z6 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (a && !z5 && z6) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z5 && !a && z6) {
                b();
            }
            if (!z5 && !a && this.w != 0) {
                imageView.getClass();
                if (aleVar != null && aleVar.k(18) && (bArr = aleVar.D().g) != null) {
                    z2 = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (z2 || f(this.y)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float f = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.x == 1) {
            f = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.b) != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.s == null) {
            return false;
        }
        e(true);
        return true;
    }

    public final boolean p() {
        if (!this.t) {
            return false;
        }
        this.l.getClass();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        z1a.E(i == 0 || this.h != null);
        if (this.w != i) {
            this.w = i;
            n(false);
        }
    }

    public void setAspectRatioListener(@Nullable vh0 vh0Var) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setAspectRatioListener(vh0Var);
    }

    public void setControllerAnimationEnabled(boolean z) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.D = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.E = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        this.l.getClass();
        this.F = z;
        l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@Nullable fne fneVar) {
        one oneVar = this.l;
        oneVar.getClass();
        this.v = null;
        oneVar.setOnFullScreenModeChangedListener(fneVar);
    }

    public void setControllerShowTimeoutMs(int i) {
        one oneVar = this.l;
        oneVar.getClass();
        this.C = i;
        if (oneVar.i()) {
            h(g());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(@Nullable nne nneVar) {
        one oneVar = this.l;
        oneVar.getClass();
        nne nneVar2 = this.u;
        if (nneVar2 == nneVar) {
            return;
        }
        if (nneVar2 != null) {
            oneVar.k.remove(nneVar2);
        }
        this.u = nneVar;
        if (nneVar != null) {
            oneVar.getClass();
            oneVar.k.add(nneVar);
            setControllerVisibilityListener((rxe) null);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        z1a.E(this.k != null);
        this.B = charSequence;
        m();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.y != drawable) {
            this.y = drawable;
            n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.G = z;
    }

    public void setErrorMessageProvider(@Nullable aq5 aq5Var) {
        if (aq5Var != null) {
            m();
        }
    }

    public void setFullscreenButtonClickListener(@Nullable sxe sxeVar) {
        one oneVar = this.l;
        oneVar.getClass();
        this.v = sxeVar;
        oneVar.setOnFullScreenModeChangedListener(this.a);
    }

    public void setFullscreenButtonState(boolean z) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.o(z);
    }

    public void setImageDisplayMode(int i) {
        z1a.E(this.g != null);
        if (this.x != i) {
            this.x = i;
            o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.A != z) {
            this.A = z;
            n(false);
        }
    }

    public void setMediaRouteButtonViewProvider(@Nullable xuk xukVar) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.setMediaRouteButtonViewProvider(xukVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e6, code lost:
    
        if (r3 != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPlayer(@Nullable ale aleVar) {
        boolean z = true;
        z1a.E(Looper.myLooper() == Looper.getMainLooper());
        z1a.s(aleVar == null || aleVar.n() == Looper.getMainLooper());
        ale aleVar2 = this.s;
        if (aleVar2 == aleVar) {
            return;
        }
        View view = this.d;
        qxe qxeVar = this.a;
        if (aleVar2 != null) {
            aleVar2.z(qxeVar);
            if (aleVar2.k(27)) {
                if (view instanceof TextureView) {
                    aleVar2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    aleVar2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
            Class cls = this.p;
            if (cls != null && cls.isAssignableFrom(aleVar2.getClass())) {
                try {
                    Method method = this.q;
                    method.getClass();
                    method.invoke(aleVar2, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    is8.h(e);
                    return;
                }
            }
        }
        SubtitleView subtitleView = this.i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.s = aleVar;
        boolean p = p();
        one oneVar = this.l;
        if (p) {
            oneVar.setPlayer(aleVar);
        }
        k();
        m();
        n(true);
        if (aleVar == null) {
            if (oneVar != null) {
                oneVar.f();
                return;
            }
            return;
        }
        if (aleVar.k(27)) {
            if (view instanceof TextureView) {
                aleVar.setVideoTextureView((TextureView) view);
            } else if (view instanceof SurfaceView) {
                aleVar.setVideoSurfaceView((SurfaceView) view);
            }
            if (aleVar.k(30)) {
                hv9 hv9Var = aleVar.i().a;
                int i = 0;
                loop0: while (true) {
                    if (i >= hv9Var.size()) {
                        z = false;
                        break;
                    }
                    if (((suj) hv9Var.get(i)).b.c == 2) {
                        suj sujVar = (suj) hv9Var.get(i);
                        for (int i2 = 0; i2 < sujVar.d.length; i2++) {
                            if (sujVar.a(i2)) {
                                break loop0;
                            }
                        }
                    }
                    i++;
                }
            }
            j();
        }
        if (subtitleView != null && aleVar.k(28)) {
            subtitleView.setCues(aleVar.j().a);
        }
        aleVar.s(qxeVar);
        setImageOutput(aleVar);
        e(false);
    }

    public void setRepeatToggleModes(int i) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.z != i) {
            this.z = i;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        one oneVar = this.l;
        oneVar.getClass();
        oneVar.setTimeBarScrubbingEnabled(z);
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        one oneVar = this.l;
        z1a.E((z && oneVar == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.t == z) {
            return;
        }
        this.t = z;
        if (p()) {
            oneVar.setPlayer(this.s);
        } else if (oneVar != null) {
            oneVar.f();
            oneVar.setPlayer(null);
        }
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setControllerVisibilityListener(@Nullable rxe rxeVar) {
        if (rxeVar != null) {
            setControllerVisibilityListener((nne) null);
        }
    }
}
