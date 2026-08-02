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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.R$styleable;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.internal.cast.zzct;
import com.google.android.gms.internal.cast.zzcu;
import com.google.android.gms.internal.cast.zzcv;
import com.google.android.gms.internal.cast.zzda;
import com.google.android.gms.internal.cast.zzdc;
import com.google.android.gms.internal.cast.zzdg;
import com.google.android.gms.internal.cast.zzdh;
import com.google.android.gms.internal.cast.zzdj;
import com.google.android.gms.internal.cast.zzdm;
import com.google.android.gms.internal.cast.zzdn;
import com.google.android.gms.internal.cast.zzdu;
import com.google.android.gms.internal.cast.zzdv;
import com.google.android.gms.internal.cast.zzdw;
import com.google.android.gms.internal.cast.zzdx;
import com.google.android.gms.internal.cast.zzpm;
import com.google.android.gms.internal.cast.zzr;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.Objects;
import java.util.Timer;
import xsna.a901;
import xsna.aq01;
import xsna.be01;
import xsna.bl01;
import xsna.d001;
import xsna.d601;
import xsna.eu;
import xsna.exc0;
import xsna.fh01;
import xsna.g0a;
import xsna.g2z;
import xsna.g701;
import xsna.hui0;
import xsna.i201;
import xsna.j201;
import xsna.jn4;
import xsna.kk01;
import xsna.lvf0;
import xsna.mc01;
import xsna.o100;
import xsna.qm01;
import xsna.rhh0;
import xsna.sa01;
import xsna.ssi0;
import xsna.twp0;
import xsna.utz0;
import xsna.uz9;
import xsna.vi01;
import xsna.vwp0;
import xsna.wi01;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class ExpandedControllerActivity extends AppCompatActivity {
    public CastSeekBar A;
    public ImageView B;
    public ImageView C;
    public int[] D;
    public View F;
    public View G;
    public ImageView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public i201 M;
    public vwp0 N;
    public hui0 O;

    @Nullable
    public wi01 P;
    public boolean Q;
    public boolean R;
    public Timer S;

    @Nullable
    public String T;
    public int h;
    public int i;
    public int j;
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
    public TextView z;
    public final g2z f = new g2z(this);
    public final bl01 g = new bl01(this);
    public final ImageView[] E = new ImageView[4];

    public final void O1(View view, int i, int i2, vwp0 vwp0Var) {
        ImageView imageView = (ImageView) view.findViewById(i);
        if (i2 == R.id.cast_button_type_empty) {
            imageView.setVisibility(4);
            return;
        }
        if (i2 == R.id.cast_button_type_play_pause_toggle) {
            imageView.setBackgroundResource(this.h);
            Drawable a = qm01.a(this, this.v, this.j);
            Drawable a2 = qm01.a(this, this.v, this.i);
            Drawable a3 = qm01.a(this, this.v, this.k);
            imageView.setImageDrawable(a2);
            vwp0Var.getClass();
            exc0.e("Must be called from the main thread.");
            zzr.zzb(zzpm.PAUSE_CONTROLLER);
            imageView.setOnClickListener(new d601(vwp0Var));
            vwp0Var.j(imageView, new zzdh(imageView, vwp0Var.b, a2, a, a3, null, false));
            return;
        }
        if (i2 == R.id.cast_button_type_skip_previous) {
            imageView.setBackgroundResource(this.h);
            imageView.setImageDrawable(qm01.a(this, this.v, this.l));
            imageView.setContentDescription(getResources().getString(R.string.cast_skip_prev));
            vwp0Var.getClass();
            exc0.e("Must be called from the main thread.");
            imageView.setOnClickListener(new a901(vwp0Var));
            vwp0Var.j(imageView, new zzdn(imageView, 0));
            return;
        }
        if (i2 == R.id.cast_button_type_skip_next) {
            imageView.setBackgroundResource(this.h);
            imageView.setImageDrawable(qm01.a(this, this.v, this.m));
            imageView.setContentDescription(getResources().getString(R.string.cast_skip_next));
            vwp0Var.getClass();
            exc0.e("Must be called from the main thread.");
            imageView.setOnClickListener(new g701(vwp0Var));
            vwp0Var.j(imageView, new zzdm(imageView, 0));
            return;
        }
        if (i2 == R.id.cast_button_type_rewind_30_seconds) {
            imageView.setBackgroundResource(this.h);
            imageView.setImageDrawable(qm01.a(this, this.v, this.n));
            imageView.setContentDescription(getResources().getString(R.string.cast_rewind_30));
            vwp0Var.getClass();
            exc0.e("Must be called from the main thread.");
            imageView.setOnClickListener(new mc01(vwp0Var));
            vwp0Var.j(imageView, new zzdj(imageView, vwp0Var.f));
            return;
        }
        if (i2 == R.id.cast_button_type_forward_30_seconds) {
            imageView.setBackgroundResource(this.h);
            imageView.setImageDrawable(qm01.a(this, this.v, this.o));
            imageView.setContentDescription(getResources().getString(R.string.cast_forward_30));
            vwp0Var.getClass();
            exc0.e("Must be called from the main thread.");
            imageView.setOnClickListener(new sa01(vwp0Var));
            vwp0Var.j(imageView, new zzcv(imageView, vwp0Var.f));
            return;
        }
        if (i2 == R.id.cast_button_type_mute_toggle) {
            imageView.setBackgroundResource(this.h);
            imageView.setImageDrawable(qm01.a(this, this.v, this.p));
            vwp0Var.getClass();
            exc0.e("Must be called from the main thread.");
            imageView.setOnClickListener(new j201(vwp0Var));
            vwp0Var.j(imageView, new zzdg(imageView, vwp0Var.b));
            return;
        }
        if (i2 == R.id.cast_button_type_closed_caption) {
            imageView.setBackgroundResource(this.h);
            imageView.setImageDrawable(qm01.a(this, this.v, this.q));
            vwp0Var.getClass();
            exc0.e("Must be called from the main thread.");
            imageView.setOnClickListener(new vi01(vwp0Var));
            vwp0Var.j(imageView, new zzcu(imageView, vwp0Var.b));
        }
    }

    @Nullable
    public final lvf0 Q1() {
        g0a c = this.O.c();
        if (c == null || !c.c()) {
            return null;
        }
        return c.k();
    }

    public final void R1() {
        MediaInfo g;
        MediaMetadata mediaMetadata;
        eu supportActionBar;
        lvf0 Q1 = Q1();
        if (Q1 == null || !Q1.k() || (g = Q1.g()) == null || (mediaMetadata = g.e) == null || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.u(mediaMetadata.b("com.google.android.gms.cast.metadata.TITLE"));
        String a = aq01.a(mediaMetadata);
        if (a != null) {
            supportActionBar.t(a);
        }
    }

    public final void T1() {
        CastDevice j;
        g0a c = this.O.c();
        if (c != null && (j = c.j()) != null) {
            String str = j.e;
            if (!TextUtils.isEmpty(str)) {
                this.z.setText(getResources().getString(R.string.cast_casting_to_device, str));
                return;
            }
        }
        this.z.setText("");
    }

    public final void U1() {
        MediaStatus h;
        String str;
        Drawable drawable;
        Bitmap bitmap;
        lvf0 Q1 = Q1();
        if (Q1 == null || (h = Q1.h()) == null) {
            return;
        }
        String str2 = null;
        if (!h.s) {
            this.L.setVisibility(8);
            this.K.setVisibility(8);
            this.F.setVisibility(8);
            this.C.setVisibility(8);
            this.C.setImageBitmap(null);
            return;
        }
        if (this.C.getVisibility() == 8 && (drawable = this.B.getDrawable()) != null && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
            o100 o100Var = qm01.a;
            o100Var.a("Begin blurring bitmap %s, original width = %d, original height = %d.", bitmap, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
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
            o100Var.a("End blurring bitmap %s, original width = %d, original height = %d.", createScaledBitmap, Integer.valueOf(round), Integer.valueOf(round2));
            if (createBitmap != null) {
                this.C.setImageBitmap(createBitmap);
                this.C.setVisibility(0);
            }
        }
        AdBreakClipInfo i = h.i();
        if (i != null) {
            String str3 = i.c;
            str2 = i.j;
            str = str3;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.M.a(Uri.parse(str2));
            this.G.setVisibility(8);
        } else if (TextUtils.isEmpty(this.T)) {
            this.I.setVisibility(0);
            this.G.setVisibility(0);
            this.H.setVisibility(8);
        } else {
            this.M.a(Uri.parse(this.T));
            this.G.setVisibility(8);
        }
        TextView textView = this.J;
        if (TextUtils.isEmpty(str)) {
            str = getResources().getString(R.string.cast_ad_label);
        }
        textView.setText(str);
        this.J.setTextAppearance(this.w);
        this.F.setVisibility(0);
        V1(Q1);
    }

    public final void V1(lvf0 lvf0Var) {
        MediaStatus h;
        if (this.Q || (h = lvf0Var.h()) == null || lvf0Var.l()) {
            return;
        }
        this.K.setVisibility(8);
        this.L.setVisibility(8);
        AdBreakClipInfo i = h.i();
        if (i != null) {
            long j = i.k;
            if (j != -1) {
                if (!this.R) {
                    fh01 fh01Var = new fh01(this, lvf0Var);
                    Timer timer = new Timer();
                    this.S = timer;
                    timer.scheduleAtFixedRate(fh01Var, 0L, 500L);
                    this.R = true;
                }
                if (j - lvf0Var.c() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.L.setVisibility(0);
                    this.L.setText(getResources().getString(R.string.cast_expanded_controller_skip_ad_text, Integer.valueOf((int) Math.ceil(r11 / 1000.0f))));
                    this.K.setClickable(false);
                } else {
                    if (this.R) {
                        this.S.cancel();
                        this.R = false;
                    }
                    this.K.setVisibility(0);
                    this.K.setClickable(true);
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        hui0 d = uz9.e(this).d();
        this.O = d;
        if (d.c() == null) {
            finish();
        }
        vwp0 vwp0Var = new vwp0(this);
        this.N = vwp0Var;
        exc0.e("Must be called from the main thread.");
        vwp0Var.g = this.g;
        setContentView(R.layout.cast_expanded_controller_activity);
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{R.attr.selectableItemBackgroundBorderless});
        this.h = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = obtainStyledAttributes(null, R$styleable.a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        this.v = obtainStyledAttributes2.getResourceId(7, 0);
        this.i = obtainStyledAttributes2.getResourceId(16, 0);
        this.j = obtainStyledAttributes2.getResourceId(15, 0);
        this.k = obtainStyledAttributes2.getResourceId(26, 0);
        this.l = obtainStyledAttributes2.getResourceId(25, 0);
        this.m = obtainStyledAttributes2.getResourceId(24, 0);
        this.n = obtainStyledAttributes2.getResourceId(17, 0);
        this.o = obtainStyledAttributes2.getResourceId(12, 0);
        this.p = obtainStyledAttributes2.getResourceId(14, 0);
        this.q = obtainStyledAttributes2.getResourceId(8, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(9, 0);
        if (resourceId != 0) {
            TypedArray obtainTypedArray = getResources().obtainTypedArray(resourceId);
            exc0.b(obtainTypedArray.length() == 4);
            this.D = new int[obtainTypedArray.length()];
            for (int i = 0; i < obtainTypedArray.length(); i++) {
                this.D[i] = obtainTypedArray.getResourceId(i, 0);
            }
            obtainTypedArray.recycle();
        } else {
            this.D = new int[]{R.id.cast_button_type_empty, R.id.cast_button_type_empty, R.id.cast_button_type_empty, R.id.cast_button_type_empty};
        }
        this.u = obtainStyledAttributes2.getColor(11, 0);
        this.r = getResources().getColor(obtainStyledAttributes2.getResourceId(4, 0));
        this.s = getResources().getColor(obtainStyledAttributes2.getResourceId(3, 0));
        this.t = getResources().getColor(obtainStyledAttributes2.getResourceId(6, 0));
        this.w = obtainStyledAttributes2.getResourceId(5, 0);
        this.x = obtainStyledAttributes2.getResourceId(1, 0);
        this.y = obtainStyledAttributes2.getResourceId(2, 0);
        int resourceId2 = obtainStyledAttributes2.getResourceId(10, 0);
        if (resourceId2 != 0) {
            this.T = getApplicationContext().getResources().getString(resourceId2);
        }
        obtainStyledAttributes2.recycle();
        View findViewById = findViewById(R.id.expanded_controller_layout);
        vwp0 vwp0Var2 = this.N;
        this.B = (ImageView) findViewById.findViewById(R.id.background_image_view);
        this.C = (ImageView) findViewById.findViewById(R.id.blurred_background_image_view);
        View findViewById2 = findViewById.findViewById(R.id.background_place_holder_image_view);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        ImageView imageView = this.B;
        ImageHints imageHints = new ImageHints(4, displayMetrics.widthPixels, displayMetrics.heightPixels);
        kk01 kk01Var = new kk01(this);
        vwp0Var2.getClass();
        utz0 utz0Var = vwp0Var2.f;
        exc0.e("Must be called from the main thread.");
        vwp0Var2.j(imageView, new zzda(imageView, vwp0Var2.b, imageHints, 0, findViewById2, kk01Var));
        this.z = (TextView) findViewById.findViewById(R.id.status_text);
        ProgressBar progressBar = (ProgressBar) findViewById.findViewById(R.id.loading_indicator);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        int i2 = this.u;
        if (i2 != 0) {
            indeterminateDrawable.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
        }
        exc0.e("Must be called from the main thread.");
        vwp0Var2.j(progressBar, new zzdc(progressBar));
        TextView textView = (TextView) findViewById.findViewById(R.id.start_text);
        TextView textView2 = (TextView) findViewById.findViewById(R.id.end_text);
        CastSeekBar castSeekBar = (CastSeekBar) findViewById.findViewById(R.id.cast_seek_bar);
        this.A = castSeekBar;
        exc0.e("Must be called from the main thread.");
        zzr.zzb(zzpm.SEEK_CONTROLLER);
        jn4 jn4Var = new jn4();
        Objects.requireNonNull(vwp0Var2);
        jn4Var.b = vwp0Var2;
        castSeekBar.g = jn4Var;
        vwp0Var2.j(castSeekBar, new zzct(castSeekBar, 1000L, utz0Var));
        twp0 zzdwVar = new zzdw(textView, utz0Var);
        exc0.e("Must be called from the main thread.");
        vwp0Var2.j(textView, zzdwVar);
        twp0 zzduVar = new zzdu(textView2, utz0Var);
        exc0.e("Must be called from the main thread.");
        vwp0Var2.j(textView2, zzduVar);
        View findViewById3 = findViewById.findViewById(R.id.live_indicators);
        twp0 zzdvVar = new zzdv(findViewById3, utz0Var);
        exc0.e("Must be called from the main thread.");
        vwp0Var2.j(findViewById3, zzdvVar);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById.findViewById(R.id.tooltip_container);
        zzdx zzdxVar = new zzdx(relativeLayout, this.A, utz0Var);
        exc0.e("Must be called from the main thread.");
        vwp0Var2.j(relativeLayout, zzdxVar);
        vwp0Var2.e.add(zzdxVar);
        ImageView imageView2 = (ImageView) findViewById.findViewById(R.id.button_0);
        ImageView[] imageViewArr = this.E;
        imageViewArr[0] = imageView2;
        imageViewArr[1] = (ImageView) findViewById.findViewById(R.id.button_1);
        imageViewArr[2] = (ImageView) findViewById.findViewById(R.id.button_2);
        imageViewArr[3] = (ImageView) findViewById.findViewById(R.id.button_3);
        O1(findViewById, R.id.button_0, this.D[0], vwp0Var2);
        O1(findViewById, R.id.button_1, this.D[1], vwp0Var2);
        O1(findViewById, R.id.button_play_pause_toggle, R.id.cast_button_type_play_pause_toggle, vwp0Var2);
        O1(findViewById, R.id.button_2, this.D[2], vwp0Var2);
        O1(findViewById, R.id.button_3, this.D[3], vwp0Var2);
        View findViewById4 = findViewById(R.id.ad_container);
        this.F = findViewById4;
        this.H = (ImageView) findViewById4.findViewById(R.id.ad_image_view);
        this.G = this.F.findViewById(R.id.ad_background_image_view);
        TextView textView3 = (TextView) this.F.findViewById(R.id.ad_label);
        this.J = textView3;
        textView3.setTextColor(this.t);
        this.J.setBackgroundColor(this.r);
        this.I = (TextView) this.F.findViewById(R.id.ad_in_progress_label);
        this.L = (TextView) findViewById(R.id.ad_skip_text);
        TextView textView4 = (TextView) findViewById(R.id.ad_skip_button);
        this.K = textView4;
        textView4.setOnClickListener(new be01(this));
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        eu supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.n(true);
            supportActionBar.q();
        }
        T1();
        R1();
        TextView textView5 = this.I;
        if (textView5 != null && this.y != 0) {
            textView5.setTextAppearance(this.x);
            this.I.setTextColor(this.s);
            this.I.setText(this.y);
        }
        i201 i201Var = new i201(getApplicationContext(), new ImageHints(-1, this.H.getWidth(), this.H.getHeight()));
        this.M = i201Var;
        i201Var.e = new rhh0(this);
        zzr.zzb(zzpm.CAF_EXPANDED_CONTROLLER);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.M.b();
        vwp0 vwp0Var = this.N;
        if (vwp0Var != null) {
            exc0.e("Must be called from the main thread.");
            vwp0Var.g = null;
            vwp0 vwp0Var2 = this.N;
            vwp0Var2.getClass();
            exc0.e("Must be called from the main thread.");
            vwp0Var2.i();
            vwp0Var2.d.clear();
            hui0 hui0Var = vwp0Var2.c;
            if (hui0Var != null) {
                hui0Var.e(vwp0Var2);
            }
            vwp0Var2.g = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        hui0 hui0Var = this.O;
        if (hui0Var == null) {
            return;
        }
        g0a c = hui0Var.c();
        wi01 wi01Var = this.P;
        if (wi01Var != null && c != null) {
            exc0.e("Must be called from the main thread.");
            c.d.remove(wi01Var);
            this.P = null;
        }
        this.O.e(this.f);
        super.onPause();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r2 != false) goto L17;
     */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume() {
        boolean zzj;
        hui0 hui0Var = this.O;
        if (hui0Var == null) {
            return;
        }
        hui0Var.a(this.f);
        g0a c = this.O.c();
        if (c != null) {
            if (!c.c()) {
                exc0.e("Must be called from the main thread.");
                d001 d001Var = c.a;
                if (d001Var != null) {
                    try {
                        zzj = d001Var.zzj();
                    } catch (RemoteException unused) {
                        ssi0.b.b("Unable to call %s on %s.", "isConnecting", d001.class.getSimpleName());
                    }
                }
                zzj = false;
            }
            wi01 wi01Var = new wi01(this);
            this.P = wi01Var;
            exc0.e("Must be called from the main thread.");
            c.d.add(wi01Var);
            lvf0 Q1 = Q1();
            this.Q = (Q1 == null && Q1.k()) ? false : true;
            T1();
            U1();
            super.onResume();
        }
        finish();
        lvf0 Q12 = Q1();
        this.Q = (Q12 == null && Q12.k()) ? false : true;
        T1();
        U1();
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
}
