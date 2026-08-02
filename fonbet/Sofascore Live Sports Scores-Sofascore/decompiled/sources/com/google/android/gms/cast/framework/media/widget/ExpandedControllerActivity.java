package com.google.android.gms.cast.framework.media.widget;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.internal.zzt;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.google.android.gms.cast.framework.media.uicontroller.UIMediaController;
import com.google.android.gms.cast.framework.zzau;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzct;
import com.google.android.gms.internal.cast.zzcu;
import com.google.android.gms.internal.cast.zzcv;
import com.google.android.gms.internal.cast.zzda;
import com.google.android.gms.internal.cast.zzdc;
import com.google.android.gms.internal.cast.zzdg;
import com.google.android.gms.internal.cast.zzdj;
import com.google.android.gms.internal.cast.zzdm;
import com.google.android.gms.internal.cast.zzdn;
import com.google.android.gms.internal.cast.zzdu;
import com.google.android.gms.internal.cast.zzdv;
import com.google.android.gms.internal.cast.zzdw;
import com.google.android.gms.internal.cast.zzdx;
import com.google.android.gms.internal.cast.zzpm;
import com.google.android.gms.internal.cast.zzr;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bko;
import defpackage.bxo;
import defpackage.cb;
import defpackage.cln;
import defpackage.hvo;
import defpackage.jqn;
import defpackage.mxn;
import defpackage.o02;
import defpackage.oto;
import defpackage.zgg;
import java.util.Timer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class ExpandedControllerActivity extends AppCompatActivity implements ControlButtonsContainer {
    public int A;
    public int B;
    public TextView C;
    public CastSeekBar D;
    public ImageView E;
    public ImageView F;
    public int[] G;
    public View I;
    public View J;
    public ImageView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public TextView O;
    public com.google.android.gms.cast.framework.media.internal.zzb P;
    public UIMediaController Q;
    public SessionManager R;
    public oto S;
    public boolean T;
    public boolean U;
    public Timer V;
    public String W;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public final jqn i = new jqn(this);
    public final bxo j = new bxo(this);
    public final ImageView[] H = new ImageView[4];

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SessionManager b = CastContext.c(this).b();
        this.R = b;
        if (b.c() == null) {
            finish();
        }
        UIMediaController uIMediaController = new UIMediaController(this);
        this.Q = uIMediaController;
        Preconditions.e("Must be called from the main thread.");
        uIMediaController.f = this.j;
        setContentView(R.layout.cast_expanded_controller_activity);
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{R.attr.selectableItemBackgroundBorderless});
        this.k = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = obtainStyledAttributes(null, com.google.android.gms.cast.framework.R.styleable.a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        this.y = obtainStyledAttributes2.getResourceId(7, 0);
        this.l = obtainStyledAttributes2.getResourceId(16, 0);
        int i = 15;
        this.m = obtainStyledAttributes2.getResourceId(15, 0);
        this.n = obtainStyledAttributes2.getResourceId(26, 0);
        this.o = obtainStyledAttributes2.getResourceId(25, 0);
        this.p = obtainStyledAttributes2.getResourceId(24, 0);
        this.q = obtainStyledAttributes2.getResourceId(17, 0);
        int i2 = 12;
        this.r = obtainStyledAttributes2.getResourceId(12, 0);
        this.s = obtainStyledAttributes2.getResourceId(14, 0);
        this.t = obtainStyledAttributes2.getResourceId(8, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(9, 0);
        if (resourceId != 0) {
            TypedArray obtainTypedArray = getResources().obtainTypedArray(resourceId);
            Preconditions.b(obtainTypedArray.length() == 4);
            this.G = new int[obtainTypedArray.length()];
            for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                this.G[i3] = obtainTypedArray.getResourceId(i3, 0);
            }
            obtainTypedArray.recycle();
        } else {
            this.G = new int[]{R.id.cast_button_type_empty, R.id.cast_button_type_empty, R.id.cast_button_type_empty, R.id.cast_button_type_empty};
        }
        this.x = obtainStyledAttributes2.getColor(11, 0);
        this.u = getResources().getColor(obtainStyledAttributes2.getResourceId(4, 0));
        this.v = getResources().getColor(obtainStyledAttributes2.getResourceId(3, 0));
        this.w = getResources().getColor(obtainStyledAttributes2.getResourceId(6, 0));
        this.z = obtainStyledAttributes2.getResourceId(5, 0);
        this.A = obtainStyledAttributes2.getResourceId(1, 0);
        this.B = obtainStyledAttributes2.getResourceId(2, 0);
        int resourceId2 = obtainStyledAttributes2.getResourceId(10, 0);
        if (resourceId2 != 0) {
            this.W = getApplicationContext().getResources().getString(resourceId2);
        }
        obtainStyledAttributes2.recycle();
        View findViewById = findViewById(R.id.expanded_controller_layout);
        UIMediaController uIMediaController2 = this.Q;
        this.E = (ImageView) findViewById.findViewById(R.id.background_image_view);
        this.F = (ImageView) findViewById.findViewById(R.id.blurred_background_image_view);
        View findViewById2 = findViewById.findViewById(R.id.background_place_holder_image_view);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        ImageView imageView = this.E;
        ImageHints imageHints = new ImageHints(4, displayMetrics.widthPixels, displayMetrics.heightPixels);
        hvo hvoVar = new hvo(this);
        uIMediaController2.getClass();
        com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar = uIMediaController2.e;
        Preconditions.e("Must be called from the main thread.");
        uIMediaController2.t(imageView, new zzda(imageView, uIMediaController2.a, imageHints, 0, findViewById2, hvoVar));
        this.C = (TextView) findViewById.findViewById(R.id.status_text);
        ProgressBar progressBar = (ProgressBar) findViewById.findViewById(R.id.loading_indicator);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        int i4 = this.x;
        if (i4 != 0) {
            indeterminateDrawable.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
        }
        Preconditions.e("Must be called from the main thread.");
        uIMediaController2.t(progressBar, new zzdc(progressBar));
        TextView textView = (TextView) findViewById.findViewById(R.id.start_text);
        TextView textView2 = (TextView) findViewById.findViewById(R.id.end_text);
        CastSeekBar castSeekBar = (CastSeekBar) findViewById.findViewById(R.id.cast_seek_bar);
        this.D = castSeekBar;
        Preconditions.e("Must be called from the main thread.");
        zzr.a(zzpm.SEEK_CONTROLLER);
        castSeekBar.f = new bko(uIMediaController2);
        uIMediaController2.t(castSeekBar, new zzct(castSeekBar, zzaVar));
        UIController zzdwVar = new zzdw(textView, zzaVar);
        Preconditions.e("Must be called from the main thread.");
        uIMediaController2.t(textView, zzdwVar);
        UIController zzduVar = new zzdu(textView2, zzaVar);
        Preconditions.e("Must be called from the main thread.");
        uIMediaController2.t(textView2, zzduVar);
        View findViewById3 = findViewById.findViewById(R.id.live_indicators);
        UIController zzdvVar = new zzdv(findViewById3, zzaVar);
        Preconditions.e("Must be called from the main thread.");
        uIMediaController2.t(findViewById3, zzdvVar);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById.findViewById(R.id.tooltip_container);
        zzdx zzdxVar = new zzdx(relativeLayout, this.D, zzaVar);
        Preconditions.e("Must be called from the main thread.");
        uIMediaController2.t(relativeLayout, zzdxVar);
        uIMediaController2.d.add(zzdxVar);
        ImageView imageView2 = (ImageView) findViewById.findViewById(R.id.button_0);
        ImageView[] imageViewArr = this.H;
        imageViewArr[0] = imageView2;
        imageViewArr[1] = (ImageView) findViewById.findViewById(R.id.button_1);
        imageViewArr[2] = (ImageView) findViewById.findViewById(R.id.button_2);
        imageViewArr[3] = (ImageView) findViewById.findViewById(R.id.button_3);
        p(findViewById, R.id.button_0, this.G[0], uIMediaController2);
        p(findViewById, R.id.button_1, this.G[1], uIMediaController2);
        p(findViewById, R.id.button_play_pause_toggle, R.id.cast_button_type_play_pause_toggle, uIMediaController2);
        p(findViewById, R.id.button_2, this.G[2], uIMediaController2);
        p(findViewById, R.id.button_3, this.G[3], uIMediaController2);
        View findViewById4 = findViewById(R.id.ad_container);
        this.I = findViewById4;
        this.K = (ImageView) findViewById4.findViewById(R.id.ad_image_view);
        this.J = this.I.findViewById(R.id.ad_background_image_view);
        TextView textView3 = (TextView) this.I.findViewById(R.id.ad_label);
        this.M = textView3;
        textView3.setTextColor(this.w);
        this.M.setBackgroundColor(this.u);
        this.L = (TextView) this.I.findViewById(R.id.ad_in_progress_label);
        this.O = (TextView) findViewById(R.id.ad_skip_text);
        TextView textView4 = (TextView) findViewById(R.id.ad_skip_button);
        this.N = textView4;
        textView4.setOnClickListener(new cb(this, i));
        o((Toolbar) findViewById(R.id.toolbar));
        o02 n = n();
        if (n != null) {
            n.n0(true);
            n.q0();
        }
        s();
        r();
        TextView textView5 = this.L;
        if (textView5 != null && this.B != 0) {
            textView5.setTextAppearance(this.A);
            this.L.setTextColor(this.v);
            this.L.setText(this.B);
        }
        com.google.android.gms.cast.framework.media.internal.zzb zzbVar = new com.google.android.gms.cast.framework.media.internal.zzb(getApplicationContext(), new ImageHints(-1, this.K.getWidth(), this.K.getHeight()));
        this.P = zzbVar;
        zzbVar.e = new mxn(this, i2);
        zzr.a(zzpm.CAF_EXPANDED_CONTROLLER);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        com.google.android.gms.cast.framework.media.internal.zzb zzbVar = this.P;
        zzbVar.b();
        zzbVar.e = null;
        UIMediaController uIMediaController = this.Q;
        if (uIMediaController != null) {
            Preconditions.e("Must be called from the main thread.");
            uIMediaController.f = null;
            UIMediaController uIMediaController2 = this.Q;
            uIMediaController2.getClass();
            Preconditions.e("Must be called from the main thread.");
            uIMediaController2.s();
            uIMediaController2.c.clear();
            SessionManager sessionManager = uIMediaController2.b;
            if (sessionManager != null) {
                sessionManager.e(uIMediaController2);
            }
            uIMediaController2.f = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        SessionManager sessionManager = this.R;
        if (sessionManager == null) {
            return;
        }
        CastSession c = sessionManager.c();
        oto otoVar = this.S;
        if (otoVar != null && c != null) {
            Preconditions.e("Must be called from the main thread.");
            c.d.remove(otoVar);
            this.S = null;
        }
        this.R.e(this.i);
        super.onPause();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r2 != false) goto L17;
     */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume() {
        boolean zzj;
        SessionManager sessionManager = this.R;
        if (sessionManager == null) {
            return;
        }
        sessionManager.a(this.i);
        CastSession c = this.R.c();
        if (c != null) {
            if (!c.c()) {
                Preconditions.e("Must be called from the main thread.");
                zzau zzauVar = c.a;
                if (zzauVar != null) {
                    try {
                        zzj = zzauVar.zzj();
                    } catch (RemoteException unused) {
                        Session.b.b("Unable to call %s on %s.", "isConnecting", "zzau");
                    }
                }
                zzj = false;
            }
            oto otoVar = new oto(this);
            this.S = otoVar;
            Preconditions.e("Must be called from the main thread.");
            c.d.add(otoVar);
            RemoteMediaClient q = q();
            this.T = (q == null && q.k()) ? false : true;
            s();
            t();
            super.onResume();
        }
        finish();
        RemoteMediaClient q2 = q();
        this.T = (q2 == null && q2.k()) ? false : true;
        s();
        t();
        super.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() ^ 4102);
            setImmersive(true);
        }
    }

    public final void p(View view, int i, int i2, UIMediaController uIMediaController) {
        ImageView imageView = (ImageView) view.findViewById(i);
        if (i2 == R.id.cast_button_type_empty) {
            imageView.setVisibility(4);
            return;
        }
        if (i2 == R.id.cast_button_type_play_pause_toggle) {
            imageView.setBackgroundResource(this.k);
            Drawable b = zzo.b(this, this.y, this.m, 0, android.R.color.white);
            Drawable b2 = zzo.b(this, this.y, this.l, 0, android.R.color.white);
            Drawable b3 = zzo.b(this, this.y, this.n, 0, android.R.color.white);
            imageView.setImageDrawable(b2);
            uIMediaController.p(imageView, b2, b, b3, null, false);
            return;
        }
        if (i2 == R.id.cast_button_type_skip_previous) {
            imageView.setBackgroundResource(this.k);
            imageView.setImageDrawable(zzo.b(this, this.y, this.o, 0, android.R.color.white));
            imageView.setContentDescription(getResources().getString(R.string.cast_skip_prev));
            uIMediaController.getClass();
            Preconditions.e("Must be called from the main thread.");
            imageView.setOnClickListener(new cln(uIMediaController, 3));
            uIMediaController.t(imageView, new zzdn(imageView));
            return;
        }
        if (i2 == R.id.cast_button_type_skip_next) {
            imageView.setBackgroundResource(this.k);
            imageView.setImageDrawable(zzo.b(this, this.y, this.p, 0, android.R.color.white));
            imageView.setContentDescription(getResources().getString(R.string.cast_skip_next));
            uIMediaController.getClass();
            Preconditions.e("Must be called from the main thread.");
            imageView.setOnClickListener(new cln(uIMediaController, 2));
            uIMediaController.t(imageView, new zzdm(imageView));
            return;
        }
        if (i2 == R.id.cast_button_type_rewind_30_seconds) {
            imageView.setBackgroundResource(this.k);
            imageView.setImageDrawable(zzo.b(this, this.y, this.q, 0, android.R.color.white));
            imageView.setContentDescription(getResources().getString(R.string.cast_rewind_30));
            uIMediaController.getClass();
            Preconditions.e("Must be called from the main thread.");
            imageView.setOnClickListener(new cln(uIMediaController, 5));
            uIMediaController.t(imageView, new zzdj(imageView, uIMediaController.e));
            return;
        }
        if (i2 == R.id.cast_button_type_forward_30_seconds) {
            imageView.setBackgroundResource(this.k);
            imageView.setImageDrawable(zzo.b(this, this.y, this.r, 0, android.R.color.white));
            imageView.setContentDescription(getResources().getString(R.string.cast_forward_30));
            uIMediaController.getClass();
            Preconditions.e("Must be called from the main thread.");
            imageView.setOnClickListener(new cln(uIMediaController, 4));
            uIMediaController.t(imageView, new zzcv(imageView, uIMediaController.e));
            return;
        }
        if (i2 == R.id.cast_button_type_mute_toggle) {
            imageView.setBackgroundResource(this.k);
            imageView.setImageDrawable(zzo.b(this, this.y, this.s, 0, android.R.color.white));
            uIMediaController.getClass();
            Preconditions.e("Must be called from the main thread.");
            imageView.setOnClickListener(new cln(uIMediaController, 0));
            uIMediaController.t(imageView, new zzdg(imageView, uIMediaController.a));
            return;
        }
        if (i2 == R.id.cast_button_type_closed_caption) {
            imageView.setBackgroundResource(this.k);
            imageView.setImageDrawable(zzo.b(this, this.y, this.t, 0, android.R.color.white));
            uIMediaController.getClass();
            Preconditions.e("Must be called from the main thread.");
            imageView.setOnClickListener(new cln(uIMediaController, 7));
            uIMediaController.t(imageView, new zzcu(imageView, uIMediaController.a));
        }
    }

    public final RemoteMediaClient q() {
        CastSession c = this.R.c();
        if (c == null || !c.c()) {
            return null;
        }
        return c.k();
    }

    public final void r() {
        MediaInfo f;
        MediaMetadata mediaMetadata;
        o02 n;
        RemoteMediaClient q = q();
        if (q == null || !q.k() || (f = q.f()) == null || (mediaMetadata = f.d) == null || (n = n()) == null) {
            return;
        }
        n.u0(mediaMetadata.Y0("com.google.android.gms.cast.metadata.TITLE"));
        String a = zzt.a(mediaMetadata);
        if (a != null) {
            n.t0(a);
        }
    }

    public final void s() {
        CastDevice j;
        CastSession c = this.R.c();
        if (c != null && (j = c.j()) != null) {
            String str = j.d;
            if (!TextUtils.isEmpty(str)) {
                this.C.setText(getResources().getString(R.string.cast_casting_to_device, str));
                return;
            }
        }
        this.C.setText("");
    }

    public final void t() {
        MediaStatus h;
        String str;
        Drawable drawable;
        Bitmap bitmap;
        RemoteMediaClient q = q();
        if (q == null || (h = q.h()) == null) {
            return;
        }
        String str2 = null;
        if (!h.r) {
            this.O.setVisibility(8);
            this.N.setVisibility(8);
            this.I.setVisibility(8);
            this.F.setVisibility(8);
            this.F.setImageBitmap(null);
            return;
        }
        if (this.F.getVisibility() == 8 && (drawable = this.E.getDrawable()) != null && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
            Logger logger = zzo.a;
            logger.a("Begin blurring bitmap %s, original width = %d, original height = %d.", bitmap, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
            int round = Math.round(bitmap.getWidth() * 0.25f);
            int round2 = Math.round(bitmap.getHeight() * 0.25f);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
            Bitmap createBitmap = Bitmap.createBitmap(round, round2, createScaledBitmap.getConfig());
            RenderScript create = RenderScript.create(this);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, createFromBitmap.getElement());
            create2.setInput(createFromBitmap);
            create2.setRadius(7.5f);
            create2.forEach(createTyped);
            createTyped.copyTo(createBitmap);
            create.destroy();
            logger.a("End blurring bitmap %s, original width = %d, original height = %d.", createScaledBitmap, Integer.valueOf(round), Integer.valueOf(round2));
            if (createBitmap != null) {
                this.F.setImageBitmap(createBitmap);
                this.F.setVisibility(0);
            }
        }
        AdBreakClipInfo Y0 = h.Y0();
        if (Y0 != null) {
            String str3 = Y0.b;
            str2 = Y0.i;
            str = str3;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.P.a(Uri.parse(str2));
            this.J.setVisibility(8);
        } else if (TextUtils.isEmpty(this.W)) {
            this.L.setVisibility(0);
            this.J.setVisibility(0);
            this.K.setVisibility(8);
        } else {
            this.P.a(Uri.parse(this.W));
            this.J.setVisibility(8);
        }
        TextView textView = this.M;
        if (TextUtils.isEmpty(str)) {
            str = getResources().getString(R.string.cast_ad_label);
        }
        textView.setText(str);
        this.M.setTextAppearance(this.z);
        this.I.setVisibility(0);
        u(q);
    }

    public final void u(RemoteMediaClient remoteMediaClient) {
        MediaStatus h;
        if (this.T || (h = remoteMediaClient.h()) == null || remoteMediaClient.l()) {
            return;
        }
        this.N.setVisibility(8);
        this.O.setVisibility(8);
        AdBreakClipInfo Y0 = h.Y0();
        if (Y0 != null) {
            long j = Y0.j;
            if (j != -1) {
                if (!this.U) {
                    zgg zggVar = new zgg(this, remoteMediaClient);
                    Timer timer = new Timer();
                    this.V = timer;
                    timer.scheduleAtFixedRate(zggVar, 0L, 500L);
                    this.U = true;
                }
                if (j - remoteMediaClient.c() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.O.setVisibility(0);
                    this.O.setText(getResources().getString(R.string.cast_expanded_controller_skip_ad_text, Integer.valueOf((int) Math.ceil(r11 / 1000.0f))));
                    this.N.setClickable(false);
                } else {
                    if (this.U) {
                        this.V.cancel();
                        this.U = false;
                    }
                    this.N.setVisibility(0);
                    this.N.setClickable(true);
                }
            }
        }
    }
}
