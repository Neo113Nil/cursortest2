package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.aac;
import defpackage.b8;
import defpackage.dh0;
import defpackage.eac;
import defpackage.fac;
import defpackage.gac;
import defpackage.hac;
import defpackage.hda;
import defpackage.iac;
import defpackage.ibc;
import defpackage.iyd;
import defpackage.jac;
import defpackage.lac;
import defpackage.o23;
import defpackage.obc;
import defpackage.pbc;
import defpackage.wca;
import defpackage.wj9;
import defpackage.xm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d extends xm {
    public static final /* synthetic */ int r0 = 0;
    public final boolean A;
    public final boolean B;
    public LinearLayout C;
    public RelativeLayout D;
    public LinearLayout E;
    public View F;
    public OverlayListView G;
    public c H;
    public ArrayList I;
    public HashSet J;
    public HashSet K;
    public HashSet L;
    public SeekBar M;
    public lac N;
    public obc O;
    public int P;
    public int Q;
    public int R;
    public final int S;
    public HashMap T;
    public wj9 U;
    public final jac V;
    public PlaybackStateCompat W;
    public MediaDescriptionCompat X;
    public iac Y;
    public Bitmap Z;
    public Uri a0;
    public boolean b0;
    public Bitmap c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public final pbc h;
    public boolean h0;
    public final aac i;
    public boolean i0;
    public final obc j;
    public int j0;
    public final Context k;
    public int k0;
    public boolean l;
    public int l0;
    public boolean m;
    public Interpolator m0;
    public int n;
    public final Interpolator n0;
    public Button o;
    public final Interpolator o0;
    public Button p;
    public final AccessibilityManager p0;
    public ImageButton q;
    public final b8 q0;
    public MediaRouteExpandCollapseButton r;
    public FrameLayout s;
    public LinearLayout t;
    public FrameLayout u;
    public FrameLayout v;
    public ImageView w;
    public TextView x;
    public TextView y;
    public TextView z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(Context context) {
        super(r4, r1 == 0 ? hda.F(r4) : r1);
        ContextThemeWrapper u = hda.u(context, true);
        int I = hda.I(R.attr.mediaRouteTheme, u);
        this.A = true;
        this.q0 = new b8(this, 29);
        Context context2 = getContext();
        this.k = context2;
        this.V = new jac(this, 0);
        this.h = pbc.d(context2);
        this.B = pbc.g();
        this.i = new aac(this, 2);
        this.j = pbc.f();
        p(pbc.e());
        this.S = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.p0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.n0 = AnimationUtils.loadInterpolator(u, R.interpolator.mr_linear_out_slow_in);
        this.o0 = AnimationUtils.loadInterpolator(u, R.interpolator.mr_fast_out_slow_in);
    }

    public static void o(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public final void h(int i, View view) {
        gac gacVar = new gac(view.getLayoutParams().height, i, 0, view);
        gacVar.setDuration(this.j0);
        gacVar.setInterpolator(this.m0);
        view.startAnimation(gacVar);
    }

    public final boolean i() {
        return (this.X == null && this.W == null) ? false : true;
    }

    public final void j(boolean z) {
        OverlayListView overlayListView;
        HashSet hashSet;
        int firstVisiblePosition = this.G.getFirstVisiblePosition();
        int i = 0;
        while (true) {
            int childCount = this.G.getChildCount();
            overlayListView = this.G;
            if (i >= childCount) {
                break;
            }
            View childAt = overlayListView.getChildAt(i);
            obc obcVar = (obc) this.H.getItem(firstVisiblePosition + i);
            if (!z || (hashSet = this.J) == null || !hashSet.contains(obcVar)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
            i++;
        }
        Iterator it = overlayListView.a.iterator();
        while (it.hasNext()) {
            iyd iydVar = (iyd) it.next();
            iydVar.j = true;
            iydVar.k = true;
            wj9 wj9Var = iydVar.l;
            if (wj9Var != null) {
                d dVar = (d) wj9Var.c;
                dVar.L.remove((obc) wj9Var.b);
                dVar.H.notifyDataSetChanged();
            }
        }
        if (z) {
            return;
        }
        k(false);
    }

    public final void k(boolean z) {
        this.J = null;
        this.K = null;
        this.h0 = false;
        if (this.i0) {
            this.i0 = false;
            t(z);
        }
        this.G.setEnabled(true);
    }

    public final int l(int i, int i2) {
        float f;
        float f2;
        int i3 = this.n;
        if (i >= i2) {
            f = i3 * i2;
            f2 = i;
        } else {
            f = i3 * 9.0f;
            f2 = 16.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public final int m(boolean z) {
        if (!z && this.E.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.C.getPaddingBottom() + this.C.getPaddingTop();
        if (z) {
            paddingBottom += this.D.getMeasuredHeight();
        }
        if (this.E.getVisibility() == 0) {
            paddingBottom += this.E.getMeasuredHeight();
        }
        return (z && this.E.getVisibility() == 0) ? this.F.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    public final boolean n() {
        obc obcVar = this.j;
        return obcVar.e() && Collections.unmodifiableList(obcVar.v).size() > 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
        this.h.a(ibc.c, this.i, 2);
        p(pbc.e());
    }

    @Override // defpackage.xm, defpackage.wb0, defpackage.cc3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        hac hacVar = new hac(this, 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.s = frameLayout;
        frameLayout.setOnClickListener(new hac(this, 1));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.t = linearLayout;
        linearLayout.setOnClickListener(new eac());
        Context context = this.k;
        int H = hda.H(R.attr.colorPrimary, context);
        if (o23.e(H, hda.H(android.R.attr.colorBackground, context)) < 3.0d) {
            H = hda.H(R.attr.colorAccent, context);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.o = button;
        button.setText(R.string.mr_controller_disconnect);
        this.o.setTextColor(H);
        this.o.setOnClickListener(hacVar);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.p = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.p.setTextColor(H);
        this.p.setOnClickListener(hacVar);
        this.z = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(hacVar);
        this.v = (FrameLayout) findViewById(R.id.mr_custom_control);
        this.u = (FrameLayout) findViewById(R.id.mr_default_control);
        hac hacVar2 = new hac(this, 2);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.w = imageView;
        imageView.setOnClickListener(hacVar2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(hacVar2);
        this.C = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.F = findViewById(R.id.mr_control_divider);
        this.D = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.x = (TextView) findViewById(R.id.mr_control_title);
        this.y = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.q = imageButton;
        imageButton.setOnClickListener(hacVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.E = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.M = seekBar;
        obc obcVar = this.j;
        seekBar.setTag(obcVar);
        lac lacVar = new lac(this);
        this.N = lacVar;
        this.M.setOnSeekBarChangeListener(lacVar);
        this.G = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.I = new ArrayList();
        c cVar = new c(this, this.G.getContext(), this.I);
        this.H = cVar;
        this.G.setAdapter((ListAdapter) cVar);
        this.L = new HashSet();
        LinearLayout linearLayout3 = this.C;
        OverlayListView overlayListView = this.G;
        boolean n = n();
        int H2 = hda.H(R.attr.colorPrimary, context);
        int H3 = hda.H(R.attr.colorPrimaryDark, context);
        if (n && hda.A(context) == -570425344) {
            H3 = H2;
            H2 = -1;
        }
        linearLayout3.setBackgroundColor(H2);
        overlayListView.setBackgroundColor(H3);
        linearLayout3.setTag(Integer.valueOf(H2));
        overlayListView.setTag(Integer.valueOf(H3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.M;
        LinearLayout linearLayout4 = this.C;
        int A = hda.A(context);
        if (Color.alpha(A) != 255) {
            A = o23.h(A, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(A, A);
        HashMap hashMap = new HashMap();
        this.T = hashMap;
        hashMap.put(obcVar, this.M);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.r = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.i = new hac(this, 3);
        this.m0 = this.g0 ? this.n0 : this.o0;
        this.j0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.k0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.l0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.l = true;
        s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.h.h(this.i);
        p(null);
        this.m = false;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.xm, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.B || !this.g0) {
            this.j.k(i == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // defpackage.xm, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void p(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        PlaybackStateCompat playbackState;
        wj9 wj9Var = this.U;
        jac jacVar = this.V;
        if (wj9Var != null) {
            wj9Var.M(jacVar);
            this.U = null;
        }
        if (mediaSessionCompat$Token != null && this.m) {
            wj9 wj9Var2 = new wj9(this.k, mediaSessionCompat$Token);
            this.U = wj9Var2;
            wj9Var2.K(jacVar);
            MediaMetadata metadata = ((android.support.v4.media.session.a) this.U.b).a.getMetadata();
            if (metadata != null) {
                dh0 dh0Var = MediaMetadataCompat.d;
                Parcel obtain = Parcel.obtain();
                metadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                mediaMetadataCompat.b = metadata;
            } else {
                mediaMetadataCompat = null;
            }
            this.X = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
            android.support.v4.media.session.a aVar = (android.support.v4.media.session.a) this.U.b;
            MediaSessionCompat$Token mediaSessionCompat$Token2 = aVar.e;
            if (mediaSessionCompat$Token2.a() != null) {
                try {
                    playbackState = mediaSessionCompat$Token2.a().getPlaybackState();
                } catch (RemoteException unused) {
                }
                this.W = playbackState;
                r();
                q(false);
            }
            PlaybackState playbackState2 = aVar.a.getPlaybackState();
            playbackState = playbackState2 != null ? PlaybackStateCompat.a(playbackState2) : null;
            this.W = playbackState;
            r();
            q(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z) {
        boolean z2;
        boolean z3;
        PlaybackStateCompat playbackStateCompat;
        int i;
        int i2;
        boolean z4 = true;
        if (this.O != null) {
            this.e0 = true;
            this.f0 = z | this.f0;
            return;
        }
        this.e0 = false;
        this.f0 = false;
        obc obcVar = this.j;
        if (!obcVar.g() || obcVar.d()) {
            dismiss();
            return;
        }
        if (this.l) {
            this.z.setText(obcVar.d);
            this.o.setVisibility(obcVar.j ? 0 : 8);
            if (this.b0) {
                Bitmap bitmap = this.c0;
                if (bitmap == null || !bitmap.isRecycled()) {
                    this.w.setImageBitmap(this.c0);
                    this.w.setBackgroundColor(this.d0);
                } else {
                    Objects.toString(this.c0);
                }
                this.b0 = false;
                this.c0 = null;
                this.d0 = 0;
            }
            boolean z5 = this.B;
            if (z5 || !n()) {
                if ((!this.g0 || z5) && this.A) {
                    if (((!obcVar.e() || pbc.g()) ? obcVar.o : 0) == 1) {
                        if (this.E.getVisibility() == 8) {
                            this.E.setVisibility(0);
                            this.M.setMax(obcVar.q);
                            this.M.setProgress(obcVar.p);
                            this.r.setVisibility(n() ? 0 : 8);
                        }
                    }
                }
                this.E.setVisibility(8);
            } else {
                this.E.setVisibility(8);
                this.g0 = true;
                this.G.setVisibility(0);
                this.m0 = this.g0 ? this.n0 : this.o0;
                t(false);
            }
            if (i()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.X;
                CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b;
                boolean isEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.X;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
                boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
                if (obcVar.r != -1) {
                    this.x.setText(R.string.mr_controller_casting_screen);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.W;
                    if (playbackStateCompat2 == null || playbackStateCompat2.a == 0) {
                        this.x.setText(R.string.mr_controller_no_media_selected);
                    } else if (isEmpty && isEmpty2) {
                        this.x.setText(R.string.mr_controller_no_info_available);
                    } else {
                        if (isEmpty) {
                            z2 = false;
                        } else {
                            this.x.setText(charSequence);
                            z2 = true;
                        }
                        if (isEmpty2) {
                            z3 = false;
                        } else {
                            this.y.setText(charSequence2);
                            z3 = true;
                        }
                        this.x.setVisibility(!z2 ? 0 : 8);
                        this.y.setVisibility(!z3 ? 0 : 8);
                        playbackStateCompat = this.W;
                        if (playbackStateCompat != null) {
                            int i3 = playbackStateCompat.a;
                            boolean z6 = i3 == 6 || i3 == 3;
                            Context context = this.q.getContext();
                            if (z6 && (this.W.e & 514) != 0) {
                                i = R.attr.mediaRoutePauseDrawable;
                                i2 = R.string.mr_controller_pause;
                            } else if (z6 && (this.W.e & 1) != 0) {
                                i = R.attr.mediaRouteStopDrawable;
                                i2 = R.string.mr_controller_stop;
                            } else if (z6 || (this.W.e & 516) == 0) {
                                z4 = false;
                                i = 0;
                                i2 = 0;
                            } else {
                                i = R.attr.mediaRoutePlayDrawable;
                                i2 = R.string.mr_controller_play;
                            }
                            this.q.setVisibility(z4 ? 0 : 8);
                            if (z4) {
                                this.q.setImageResource(hda.I(i, context));
                                this.q.setContentDescription(context.getResources().getText(i2));
                            }
                        }
                    }
                }
                z3 = false;
                z2 = true;
                this.x.setVisibility(!z2 ? 0 : 8);
                this.y.setVisibility(!z3 ? 0 : 8);
                playbackStateCompat = this.W;
                if (playbackStateCompat != null) {
                }
            }
            t(z);
        }
    }

    public final void r() {
        MediaDescriptionCompat mediaDescriptionCompat = this.X;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        iac iacVar = this.Y;
        Bitmap bitmap2 = iacVar == null ? this.Z : iacVar.a;
        Uri uri2 = iacVar == null ? this.a0 : iacVar.b;
        if (bitmap2 == bitmap) {
            if (bitmap2 != null) {
                return;
            }
            if (uri2 != null && uri2.equals(uri)) {
                return;
            }
            if (uri2 == null && uri == null) {
                return;
            }
        }
        if (!n() || this.B) {
            iac iacVar2 = this.Y;
            if (iacVar2 != null) {
                iacVar2.cancel(true);
            }
            iac iacVar3 = new iac(this);
            this.Y = iacVar3;
            iacVar3.execute(new Void[0]);
        }
    }

    public final void s() {
        Context context = this.k;
        int y = wca.y(context);
        getWindow().setLayout(y, -2);
        View decorView = getWindow().getDecorView();
        this.n = (y - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.P = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.Q = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.R = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.Z = null;
        this.a0 = null;
        r();
        q(false);
    }

    public final void t(boolean z) {
        this.u.requestLayout();
        this.u.getViewTreeObserver().addOnGlobalLayoutListener(new fac(this, z));
    }

    public final void u(boolean z) {
        int i = 0;
        this.F.setVisibility((this.E.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.C;
        if (this.E.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }
}
