package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cji extends FrameLayout {
    public static final float[] x0;
    public final View A;
    public final View B;
    public final TextView C;
    public final TextView D;
    public final bhj E;
    public final StringBuilder F;
    public final Formatter G;
    public final hij H;
    public final jij I;
    public final t4f J;
    public final Drawable K;
    public final Drawable L;
    public final Drawable M;
    public final String N;
    public final String O;
    public final String P;
    public final Drawable Q;
    public final Drawable R;
    public final float S;
    public final float T;
    public final String U;
    public final String V;
    public final Drawable W;
    public final hji a;
    public final Drawable a0;
    public final Resources b;
    public final String b0;
    public final vii c;
    public final String c0;
    public final CopyOnWriteArrayList d;
    public final Drawable d0;
    public final RecyclerView e;
    public final Drawable e0;
    public final jne f;
    public final String f0;
    public final gne g;
    public final String g0;
    public final uii h;
    public zke h0;
    public final uii i;
    public wii i0;
    public final hpo j;
    public boolean j0;
    public final PopupWindow k;
    public boolean k0;
    public final int l;
    public boolean l0;
    public final View m;
    public boolean m0;
    public final View n;
    public boolean n0;
    public final View o;
    public int o0;
    public final View p;
    public int p0;
    public final View q;
    public int q0;
    public final TextView r;
    public long[] r0;
    public final TextView s;
    public boolean[] s0;
    public final ImageView t;
    public final long[] t0;
    public final ImageView u;
    public final boolean[] u0;
    public final View v;
    public long v0;
    public final ImageView w;
    public boolean w0;
    public final ImageView x;
    public final ImageView y;
    public final View z;

    static {
        jh6.a("goog.exo.ui");
        x0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cji(Context context) {
        super(context, null, 0);
        bhj bhjVar;
        int i = 0;
        this.o0 = 5000;
        this.q0 = 0;
        this.p0 = 200;
        LayoutInflater.from(context).inflate(R.layout.exo_styled_player_control_view, this);
        setDescendantFocusability(262144);
        vii viiVar = new vii(this);
        this.c = viiVar;
        this.d = new CopyOnWriteArrayList();
        this.H = new hij();
        this.I = new jij();
        StringBuilder sb = new StringBuilder();
        this.F = sb;
        this.G = new Formatter(sb, Locale.getDefault());
        this.r0 = new long[0];
        this.s0 = new boolean[0];
        this.t0 = new long[0];
        this.u0 = new boolean[0];
        this.J = new t4f(this, 13);
        this.C = (TextView) findViewById(R.id.exo_duration);
        this.D = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.w = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viiVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.x = imageView2;
        tii tiiVar = new tii(this, i);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(tiiVar);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.y = imageView3;
        tii tiiVar2 = new tii(this, i);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(tiiVar2);
        }
        View findViewById = findViewById(R.id.exo_settings);
        this.z = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(viiVar);
        }
        View findViewById2 = findViewById(R.id.exo_playback_speed);
        this.A = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(viiVar);
        }
        View findViewById3 = findViewById(R.id.exo_audio_track);
        this.B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(viiVar);
        }
        bhj bhjVar2 = (bhj) findViewById(R.id.exo_progress);
        View findViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (bhjVar2 != null) {
            this.E = bhjVar2;
            bhjVar = bhjVar2;
        } else if (findViewById4 != null) {
            ht4 ht4Var = new ht4(context);
            ht4Var.setId(R.id.exo_progress);
            ht4Var.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(ht4Var, indexOfChild);
            this.E = ht4Var;
            bhjVar = ht4Var;
        } else {
            this.E = null;
            bhjVar = null;
        }
        if (bhjVar != null) {
            ((ht4) bhjVar).x.add(viiVar);
        }
        View findViewById5 = findViewById(R.id.exo_play_pause);
        this.o = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(viiVar);
        }
        View findViewById6 = findViewById(R.id.exo_prev);
        this.m = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(viiVar);
        }
        View findViewById7 = findViewById(R.id.exo_next);
        this.n = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(viiVar);
        }
        Typeface a = z1g.a(R.font.roboto_medium_numbers, context);
        View findViewById8 = findViewById(R.id.exo_rew);
        TextView textView = findViewById8 == null ? (TextView) findViewById(R.id.exo_rew_with_amount) : null;
        this.s = textView;
        if (textView != null) {
            textView.setTypeface(a);
        }
        findViewById8 = findViewById8 == null ? textView : findViewById8;
        this.q = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(viiVar);
        }
        View findViewById9 = findViewById(R.id.exo_ffwd);
        TextView textView2 = findViewById9 == null ? (TextView) findViewById(R.id.exo_ffwd_with_amount) : null;
        this.r = textView2;
        if (textView2 != null) {
            textView2.setTypeface(a);
        }
        findViewById9 = findViewById9 == null ? textView2 : findViewById9;
        this.p = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(viiVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.t = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(viiVar);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_shuffle);
        this.u = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(viiVar);
        }
        Resources resources = context.getResources();
        this.b = resources;
        this.S = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.T = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View findViewById10 = findViewById(R.id.exo_vr);
        this.v = findViewById10;
        if (findViewById10 != null) {
            i(findViewById10, false);
        }
        hji hjiVar = new hji(this);
        this.a = hjiVar;
        hjiVar.C = true;
        jne jneVar = new jne(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack)});
        this.f = jneVar;
        this.l = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.e = recyclerView;
        recyclerView.setAdapter(jneVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.k = popupWindow;
        if (lik.a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(viiVar);
        this.w0 = true;
        Resources resources2 = getResources();
        hpo hpoVar = new hpo();
        resources2.getClass();
        hpoVar.a = resources2;
        this.j = hpoVar;
        this.W = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on);
        this.a0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off);
        this.b0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.c0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        int i2 = 1;
        this.h = new uii(this, i2);
        this.i = new uii(this, 0);
        this.g = new gne(this, resources.getStringArray(R.array.exo_controls_playback_speeds), x0, i2);
        this.d0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit);
        this.e0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter);
        this.K = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off);
        this.L = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one);
        this.M = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all);
        this.Q = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on);
        this.R = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off);
        this.f0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.g0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.N = resources.getString(R.string.exo_controls_repeat_off_description);
        this.O = resources.getString(R.string.exo_controls_repeat_one_description);
        this.P = resources.getString(R.string.exo_controls_repeat_all_description);
        this.U = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.V = resources.getString(R.string.exo_controls_shuffle_off_description);
        hjiVar.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        hjiVar.h(findViewById9, true);
        hjiVar.h(findViewById8, true);
        hjiVar.h(findViewById6, true);
        hjiVar.h(findViewById7, true);
        hjiVar.h(imageView5, false);
        hjiVar.h(imageView, false);
        hjiVar.h(findViewById10, false);
        hjiVar.h(imageView4, this.q0 != 0);
        addOnLayoutChangeListener(new r8(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        zke zkeVar = this.h0;
        if (zkeVar == null) {
            return;
        }
        ug6 ug6Var = (ug6) zkeVar;
        ug6Var.T();
        gke gkeVar = new gke(f, ug6Var.i0.n.b);
        ug6Var.T();
        if (ug6Var.i0.n.equals(gkeVar)) {
            return;
        }
        eke e = ug6Var.i0.e(gkeVar);
        ug6Var.H++;
        ug6Var.k.h.a(4, gkeVar).b();
        ug6Var.R(e, 0, 1, false, false, 5, C.TIME_UNSET, -1, false);
    }

    public final boolean b(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        zke zkeVar = this.h0;
        if (zkeVar == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                ug6 ug6Var = (ug6) zkeVar;
                if (ug6Var.o() != 4) {
                    ug6Var.T();
                    long h = ug6Var.h() + ug6Var.v;
                    long m = ug6Var.m();
                    if (m != C.TIME_UNSET) {
                        h = Math.min(h, m);
                    }
                    long max = Math.max(h, 0L);
                    int g = ug6Var.g();
                    ug6Var.T();
                    ug6Var.C(max, g, false);
                }
            } else if (keyCode == 89) {
                ug6 ug6Var2 = (ug6) zkeVar;
                ug6Var2.T();
                long h2 = ug6Var2.h() + (-ug6Var2.u);
                long m2 = ug6Var2.m();
                if (m2 != C.TIME_UNSET) {
                    h2 = Math.min(h2, m2);
                }
                long max2 = Math.max(h2, 0L);
                int g2 = ug6Var2.g();
                ug6Var2.T();
                ug6Var2.C(max2, g2, false);
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    ug6 ug6Var3 = (ug6) zkeVar;
                    int o = ug6Var3.o();
                    if (o == 1 || o == 4 || !ug6Var3.n()) {
                        int o2 = ug6Var3.o();
                        if (o2 == 1) {
                            ug6Var3.y();
                        } else if (o2 == 4) {
                            int g3 = ug6Var3.g();
                            ug6Var3.T();
                            ug6Var3.C(C.TIME_UNSET, g3, false);
                        }
                        ug6Var3.J(true);
                    } else {
                        ug6Var3.J(false);
                    }
                } else if (keyCode == 87) {
                    ((ug6) zkeVar).D();
                } else if (keyCode == 88) {
                    ((ug6) zkeVar).E();
                } else if (keyCode == 126) {
                    ug6 ug6Var4 = (ug6) zkeVar;
                    int o3 = ug6Var4.o();
                    if (o3 == 1) {
                        ug6Var4.y();
                    } else if (o3 == 4) {
                        int g4 = ug6Var4.g();
                        ug6Var4.T();
                        ug6Var4.C(C.TIME_UNSET, g4, false);
                    }
                    ug6Var4.J(true);
                } else if (keyCode == 127) {
                    ((ug6) zkeVar).J(false);
                }
            }
        }
        return true;
    }

    public final void c(l lVar, View view) {
        this.e.setAdapter(lVar);
        o();
        this.w0 = false;
        PopupWindow popupWindow = this.k;
        popupWindow.dismiss();
        this.w0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.l;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    public final vvf d(tuj tujVar, int i) {
        hv9 hv9Var;
        ruj rujVar;
        String n;
        String b;
        int i2 = 4;
        yqo.w(4, "initialCapacity");
        Object[] objArr = new Object[4];
        hv9 hv9Var2 = tujVar.a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < hv9Var2.size()) {
            ruj rujVar2 = (ruj) hv9Var2.get(i3);
            if (rujVar2.b.c == i) {
                int i5 = 0;
                while (i5 < rujVar2.a) {
                    if (rujVar2.d[i5] == i2) {
                        sm8 sm8Var = rujVar2.b.d[i5];
                        int i6 = sm8Var.d;
                        int i7 = sm8Var.h;
                        if ((i6 & 2) == 0) {
                            hpo hpoVar = this.j;
                            Resources resources = (Resources) hpoVar.a;
                            Resources resources2 = (Resources) hpoVar.a;
                            String str = sm8Var.l;
                            int i8 = sm8Var.y;
                            hv9Var = hv9Var2;
                            int i9 = sm8Var.r;
                            int i10 = i4;
                            int i11 = sm8Var.q;
                            rujVar = rujVar2;
                            String str2 = sm8Var.i;
                            int f = rjc.f(str);
                            if (f == -1) {
                                String str3 = null;
                                if (str2 != null) {
                                    String[] split = TextUtils.isEmpty(str2) ? new String[0] : str2.trim().split("(\\s*,\\s*)", -1);
                                    int length = split.length;
                                    String[] strArr = split;
                                    for (int i12 = 0; i12 < length; i12++) {
                                        b = rjc.b(strArr[i12]);
                                        if (b != null && rjc.i(b)) {
                                            break;
                                        }
                                    }
                                }
                                b = null;
                                if (b == null) {
                                    if (str2 != null) {
                                        String[] split2 = TextUtils.isEmpty(str2) ? new String[0] : str2.trim().split("(\\s*,\\s*)", -1);
                                        int length2 = split2.length;
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= length2) {
                                                break;
                                            }
                                            String b2 = rjc.b(split2[i13]);
                                            if (b2 != null && rjc.g(b2)) {
                                                str3 = b2;
                                                break;
                                            }
                                            i13++;
                                        }
                                    }
                                    if (str3 == null) {
                                        if (i11 == -1 && i9 == -1) {
                                            if (i8 == -1 && sm8Var.z == -1) {
                                                f = -1;
                                            }
                                        }
                                    }
                                    f = 1;
                                }
                                f = 2;
                            }
                            if (f == 2) {
                                n = hpoVar.z(hpoVar.o(sm8Var), (i11 == -1 || i9 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i11), Integer.valueOf(i9)), i7 != -1 ? resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f)) : "");
                            } else if (f == 1) {
                                n = hpoVar.z(hpoVar.n(sm8Var), (i8 == -1 || i8 < 1) ? "" : i8 != 1 ? i8 != 2 ? (i8 == 6 || i8 == 7) ? resources.getString(R.string.exo_track_surround_5_point_1) : i8 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1) : resources.getString(R.string.exo_track_stereo) : resources.getString(R.string.exo_track_mono), i7 != -1 ? resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f)) : "");
                            } else {
                                n = hpoVar.n(sm8Var);
                            }
                            if (n.length() == 0) {
                                n = resources.getString(R.string.exo_track_unknown);
                            }
                            aji ajiVar = new aji(tujVar, i3, i5, n);
                            i4 = i10 + 1;
                            int b3 = vu9.b(objArr.length, i4);
                            if (b3 > objArr.length) {
                                objArr = Arrays.copyOf(objArr, b3);
                            }
                            objArr[i10] = ajiVar;
                            i5++;
                            hv9Var2 = hv9Var;
                            rujVar2 = rujVar;
                            i2 = 4;
                        }
                    }
                    hv9Var = hv9Var2;
                    rujVar = rujVar2;
                    i5++;
                    hv9Var2 = hv9Var;
                    rujVar2 = rujVar;
                    i2 = 4;
                }
            }
            i3++;
            hv9Var2 = hv9Var2;
            i2 = 4;
        }
        return hv9.r(i4, objArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return b(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        hji hjiVar = this.a;
        int i = hjiVar.z;
        if (i == 3 || i == 2) {
            return;
        }
        hjiVar.f();
        if (!hjiVar.C) {
            hjiVar.i(2);
        } else if (hjiVar.z == 1) {
            hjiVar.m.start();
        } else {
            hjiVar.n.start();
        }
    }

    public final boolean f() {
        hji hjiVar = this.a;
        return hjiVar.z == 0 && hjiVar.a.g();
    }

    public final boolean g() {
        return getVisibility() == 0;
    }

    @Nullable
    public zke getPlayer() {
        return this.h0;
    }

    public int getRepeatToggleModes() {
        return this.q0;
    }

    public boolean getShowShuffleButton() {
        return this.a.b(this.u);
    }

    public boolean getShowSubtitleButton() {
        return this.a.b(this.w);
    }

    public int getShowTimeoutMs() {
        return this.o0;
    }

    public boolean getShowVrButton() {
        return this.a.b(this.v);
    }

    public final void h() {
        k();
        j();
        n();
        p();
        r();
        l();
        q();
    }

    public final void i(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.S : this.T);
    }

    public final void j() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        long j2;
        if (g() && this.k0) {
            zke zkeVar = this.h0;
            if (zkeVar != null) {
                ug6 ug6Var = (ug6) zkeVar;
                z = ug6Var.r(5);
                z3 = ug6Var.r(7);
                z4 = ug6Var.r(11);
                z5 = ug6Var.r(12);
                z2 = ug6Var.r(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            Resources resources = this.b;
            View view = this.q;
            if (z4) {
                zke zkeVar2 = this.h0;
                if (zkeVar2 != null) {
                    ug6 ug6Var2 = (ug6) zkeVar2;
                    ug6Var2.T();
                    j2 = ug6Var2.u;
                } else {
                    j2 = 5000;
                }
                int i = (int) (j2 / 1000);
                TextView textView = this.s;
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
                }
            }
            View view2 = this.p;
            if (z5) {
                zke zkeVar3 = this.h0;
                if (zkeVar3 != null) {
                    ug6 ug6Var3 = (ug6) zkeVar3;
                    ug6Var3.T();
                    j = ug6Var3.v;
                } else {
                    j = 15000;
                }
                int i2 = (int) (j / 1000);
                TextView textView2 = this.r;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i2));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i2, Integer.valueOf(i2)));
                }
            }
            i(this.m, z3);
            i(view, z4);
            i(view2, z5);
            i(this.n, z2);
            bhj bhjVar = this.E;
            if (bhjVar != null) {
                ((ht4) bhjVar).setEnabled(z);
            }
        }
    }

    public final void k() {
        View view;
        if (g() && this.k0 && (view = this.o) != null) {
            zke zkeVar = this.h0;
            Resources resources = this.b;
            if (zkeVar == null || ((ug6) zkeVar).o() == 4 || ((ug6) this.h0).o() == 1 || !((ug6) this.h0).n()) {
                ((ImageView) view).setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_play));
                view.setContentDescription(resources.getString(R.string.exo_controls_play_description));
            } else {
                ((ImageView) view).setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_pause));
                view.setContentDescription(resources.getString(R.string.exo_controls_pause_description));
            }
        }
    }

    public final void l() {
        zke zkeVar = this.h0;
        if (zkeVar == null) {
            return;
        }
        ug6 ug6Var = (ug6) zkeVar;
        ug6Var.T();
        float f = ug6Var.i0.n.a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            gne gneVar = this.g;
            float[] fArr = gneVar.c;
            if (i >= fArr.length) {
                gneVar.d = i2;
                ((String[]) this.f.c)[0] = gneVar.b[i2];
                return;
            } else {
                float abs = Math.abs(f - fArr[i]);
                if (abs < f2) {
                    i2 = i;
                    f2 = abs;
                }
                i++;
            }
        }
    }

    public final void m() {
        long j;
        long F;
        if (g() && this.k0) {
            zke zkeVar = this.h0;
            long j2 = 0;
            if (zkeVar != null) {
                ug6 ug6Var = (ug6) zkeVar;
                long d = ug6Var.d() + this.v0;
                long j3 = this.v0;
                ug6Var.T();
                if (ug6Var.i0.a.p()) {
                    F = ug6Var.k0;
                } else {
                    eke ekeVar = ug6Var.i0;
                    if (ekeVar.k.d != ekeVar.b.d) {
                        F = lik.F(ekeVar.a.m(ug6Var.g(), ug6Var.a, 0L).l);
                    } else {
                        long j4 = ekeVar.p;
                        if (ug6Var.i0.k.a()) {
                            eke ekeVar2 = ug6Var.i0;
                            hij g = ekeVar2.a.g(ekeVar2.k.a, ug6Var.n);
                            long d2 = g.d(ug6Var.i0.k.b);
                            j4 = d2 == Long.MIN_VALUE ? g.d : d2;
                        }
                        eke ekeVar3 = ug6Var.i0;
                        lij lijVar = ekeVar3.a;
                        Object obj = ekeVar3.k.a;
                        hij hijVar = ug6Var.n;
                        lijVar.g(obj, hijVar);
                        F = lik.F(j4 + hijVar.e);
                    }
                }
                j = F + j3;
                j2 = d;
            } else {
                j = 0;
            }
            TextView textView = this.D;
            if (textView != null && !this.n0) {
                textView.setText(lik.r(this.F, this.G, j2));
            }
            bhj bhjVar = this.E;
            if (bhjVar != null) {
                ((ht4) bhjVar).setPosition(j2);
                ((ht4) this.E).setBufferedPosition(j);
            }
            removeCallbacks(this.J);
            int o = zkeVar == null ? 1 : ((ug6) zkeVar).o();
            if (zkeVar != null) {
                ug6 ug6Var2 = (ug6) zkeVar;
                if (ug6Var2.o() == 3 && ug6Var2.n()) {
                    ug6Var2.T();
                    if (ug6Var2.i0.m == 0) {
                        bhj bhjVar2 = this.E;
                        long min = Math.min(bhjVar2 != null ? ((ht4) bhjVar2).getPreferredUpdateDelay() : 1000L, 1000 - (j2 % 1000));
                        ug6Var2.T();
                        float f = ug6Var2.i0.n.a;
                        postDelayed(this.J, lik.i(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (long) (min / f) : 1000L, this.p0, 1000L));
                        return;
                    }
                }
            }
            if (o == 4 || o == 1) {
                return;
            }
            postDelayed(this.J, 1000L);
        }
    }

    public final void n() {
        ImageView imageView;
        if (g() && this.k0 && (imageView = this.t) != null) {
            if (this.q0 == 0) {
                i(imageView, false);
                return;
            }
            zke zkeVar = this.h0;
            String str = this.N;
            Drawable drawable = this.K;
            if (zkeVar == null) {
                i(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            i(imageView, true);
            ug6 ug6Var = (ug6) zkeVar;
            ug6Var.T();
            int i = ug6Var.F;
            if (i == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i == 1) {
                imageView.setImageDrawable(this.L);
                imageView.setContentDescription(this.O);
            } else {
                if (i != 2) {
                    return;
                }
                imageView.setImageDrawable(this.M);
                imageView.setContentDescription(this.P);
            }
        }
    }

    public final void o() {
        RecyclerView recyclerView = this.e;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.l;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.k;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hji hjiVar = this.a;
        hjiVar.a.addOnLayoutChangeListener(hjiVar.x);
        this.k0 = true;
        if (f()) {
            hjiVar.g();
        }
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hji hjiVar = this.a;
        hjiVar.a.removeOnLayoutChangeListener(hjiVar.x);
        this.k0 = false;
        removeCallbacks(this.J);
        hjiVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void p() {
        ImageView imageView;
        if (g() && this.k0 && (imageView = this.u) != null) {
            zke zkeVar = this.h0;
            if (!this.a.b(imageView)) {
                i(imageView, false);
                return;
            }
            String str = this.V;
            Drawable drawable = this.R;
            if (zkeVar == null) {
                i(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            i(imageView, true);
            ug6 ug6Var = (ug6) zkeVar;
            ug6Var.T();
            if (ug6Var.G) {
                drawable = this.Q;
            }
            imageView.setImageDrawable(drawable);
            ug6Var.T();
            if (ug6Var.G) {
                str = this.U;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        boolean z;
        lij j;
        boolean z2;
        int i;
        TextView textView;
        bhj bhjVar;
        int i2;
        lij lijVar;
        boolean z3;
        boolean z4;
        zke zkeVar = this.h0;
        if (zkeVar == null) {
            return;
        }
        boolean z5 = this.l0;
        long j2 = C.TIME_UNSET;
        long j3 = 0;
        jij jijVar = this.I;
        boolean z6 = false;
        boolean z7 = true;
        if (z5) {
            lij j4 = ((ug6) zkeVar).j();
            if (j4.o() <= 100) {
                int o = j4.o();
                for (int i3 = 0; i3 < o; i3++) {
                    if (j4.m(i3, jijVar, 0L).l != C.TIME_UNSET) {
                    }
                }
                z = true;
                this.m0 = z;
                this.v0 = 0L;
                ug6 ug6Var = (ug6) zkeVar;
                j = ug6Var.j();
                if (j.p()) {
                    int g = ug6Var.g();
                    boolean z8 = this.m0;
                    int i4 = z8 ? 0 : g;
                    int o2 = z8 ? j.o() - 1 : g;
                    long j5 = 0;
                    i = 0;
                    while (true) {
                        if (i4 > o2) {
                            break;
                        }
                        long j6 = j2;
                        if (i4 == g) {
                            this.v0 = lik.F(j5);
                        }
                        j.n(i4, jijVar);
                        if (jijVar.l == j6) {
                            qx9.t(this.m0 ^ z7);
                            break;
                        }
                        int i5 = jijVar.m;
                        while (i5 <= jijVar.n) {
                            hij hijVar = this.H;
                            j.f(i5, hijVar, z6);
                            long j7 = j3;
                            jg jgVar = hijVar.g;
                            int i6 = jgVar.d;
                            int i7 = jgVar.a;
                            while (i6 < i7) {
                                long d = hijVar.d(i6);
                                if (d == Long.MIN_VALUE) {
                                    long j8 = hijVar.d;
                                    if (j8 != j6) {
                                        d = j8;
                                    }
                                    i2 = g;
                                    lijVar = j;
                                    z3 = true;
                                    i6++;
                                    z7 = z3;
                                    g = i2;
                                    j = lijVar;
                                    j6 = C.TIME_UNSET;
                                }
                                long j9 = d + hijVar.e;
                                if (j9 >= j7) {
                                    long[] jArr = this.r0;
                                    if (i == jArr.length) {
                                        int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                        this.r0 = Arrays.copyOf(jArr, length);
                                        this.s0 = Arrays.copyOf(this.s0, length);
                                    }
                                    this.r0[i] = lik.F(j5 + j9);
                                    boolean[] zArr = this.s0;
                                    gg a = hijVar.g.a(i6);
                                    int i8 = a.b;
                                    i2 = g;
                                    if (i8 != -1) {
                                        int i9 = 0;
                                        while (i9 < i8) {
                                            int i10 = i9;
                                            int i11 = a.e[i10];
                                            if (i11 != 0) {
                                                lijVar = j;
                                                z3 = true;
                                                if (i11 == 1) {
                                                    z4 = z3;
                                                    break;
                                                } else {
                                                    i9 = i10 + 1;
                                                    j = lijVar;
                                                }
                                            }
                                        }
                                        lijVar = j;
                                        z3 = true;
                                        z4 = false;
                                        zArr[i] = z4 ^ z3;
                                        i++;
                                        i6++;
                                        z7 = z3;
                                        g = i2;
                                        j = lijVar;
                                        j6 = C.TIME_UNSET;
                                    }
                                    lijVar = j;
                                    z3 = true;
                                    z4 = z3;
                                    zArr[i] = z4 ^ z3;
                                    i++;
                                    i6++;
                                    z7 = z3;
                                    g = i2;
                                    j = lijVar;
                                    j6 = C.TIME_UNSET;
                                }
                                i2 = g;
                                lijVar = j;
                                z3 = true;
                                i6++;
                                z7 = z3;
                                g = i2;
                                j = lijVar;
                                j6 = C.TIME_UNSET;
                            }
                            i5++;
                            j3 = j7;
                            j = j;
                            z6 = false;
                            j6 = C.TIME_UNSET;
                        }
                        j5 += jijVar.l;
                        i4++;
                        j = j;
                        j2 = C.TIME_UNSET;
                        z6 = false;
                    }
                    z2 = z7;
                    j3 = j5;
                } else {
                    z2 = true;
                    i = 0;
                }
                long F = lik.F(j3);
                textView = this.C;
                if (textView != null) {
                    textView.setText(lik.r(this.F, this.G, F));
                }
                bhjVar = this.E;
                if (bhjVar != null) {
                    ht4 ht4Var = (ht4) bhjVar;
                    ht4Var.setDuration(F);
                    long[] jArr2 = this.t0;
                    int length2 = jArr2.length;
                    int i12 = i + length2;
                    long[] jArr3 = this.r0;
                    if (i12 > jArr3.length) {
                        this.r0 = Arrays.copyOf(jArr3, i12);
                        this.s0 = Arrays.copyOf(this.s0, i12);
                    }
                    System.arraycopy(jArr2, 0, this.r0, i, length2);
                    System.arraycopy(this.u0, 0, this.s0, i, length2);
                    long[] jArr4 = this.r0;
                    boolean[] zArr2 = this.s0;
                    qx9.r((i12 == 0 || !(jArr4 == null || zArr2 == null)) ? z2 : false);
                    ht4Var.M = i12;
                    ht4Var.N = jArr4;
                    ht4Var.O = zArr2;
                    ht4Var.e();
                }
                m();
            }
        }
        z = false;
        this.m0 = z;
        this.v0 = 0L;
        ug6 ug6Var2 = (ug6) zkeVar;
        j = ug6Var2.j();
        if (j.p()) {
        }
        long F2 = lik.F(j3);
        textView = this.C;
        if (textView != null) {
        }
        bhjVar = this.E;
        if (bhjVar != null) {
        }
        m();
    }

    public final void r() {
        uii uiiVar = this.h;
        uiiVar.getClass();
        List list = Collections.EMPTY_LIST;
        uiiVar.b = list;
        uii uiiVar2 = this.i;
        uiiVar2.getClass();
        uiiVar2.b = list;
        zke zkeVar = this.h0;
        ImageView imageView = this.w;
        if (zkeVar != null && ((ug6) zkeVar).r(30) && ((ug6) this.h0).r(29)) {
            tuj k = ((ug6) this.h0).k();
            vvf d = d(k, 1);
            uiiVar2.b = d;
            cji cjiVar = uiiVar2.e;
            zke zkeVar2 = cjiVar.h0;
            jne jneVar = cjiVar.f;
            zkeVar2.getClass();
            vt4 q = ((ug6) zkeVar2).q();
            if (!d.isEmpty()) {
                if (uiiVar2.t(q)) {
                    int i = 0;
                    while (true) {
                        if (i >= d.d) {
                            break;
                        }
                        aji ajiVar = (aji) d.get(i);
                        if (ajiVar.a.e[ajiVar.b]) {
                            ((String[]) jneVar.c)[1] = ajiVar.c;
                            break;
                        }
                        i++;
                    }
                } else {
                    ((String[]) jneVar.c)[1] = cjiVar.getResources().getString(R.string.exo_track_selection_auto);
                }
            } else {
                ((String[]) jneVar.c)[1] = cjiVar.getResources().getString(R.string.exo_track_selection_none);
            }
            if (this.a.b(imageView)) {
                uiiVar.u(d(k, 3));
            } else {
                av9 av9Var = hv9.b;
                uiiVar.u(vvf.e);
            }
        }
        i(imageView, uiiVar.getItemCount() > 0);
    }

    public void setAnimationEnabled(boolean z) {
        this.a.C = z;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable wii wiiVar) {
        this.i0 = wiiVar;
        boolean z = wiiVar != null;
        ImageView imageView = this.x;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = wiiVar != null;
        ImageView imageView2 = this.y;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(@Nullable zke zkeVar) {
        qx9.t(Looper.myLooper() == Looper.getMainLooper());
        qx9.r(zkeVar == null || ((ug6) zkeVar).s == Looper.getMainLooper());
        zke zkeVar2 = this.h0;
        if (zkeVar2 == zkeVar) {
            return;
        }
        vii viiVar = this.c;
        if (zkeVar2 != null) {
            ((ug6) zkeVar2).A(viiVar);
        }
        this.h0 = zkeVar;
        if (zkeVar != null) {
            rd4 rd4Var = ((ug6) zkeVar).l;
            viiVar.getClass();
            rd4Var.e(viiVar);
        }
        h();
    }

    public void setRepeatToggleModes(int i) {
        this.q0 = i;
        zke zkeVar = this.h0;
        if (zkeVar != null) {
            ug6 ug6Var = (ug6) zkeVar;
            ug6Var.T();
            int i2 = ug6Var.F;
            if (i == 0 && i2 != 0) {
                ((ug6) this.h0).K(0);
            } else if (i == 1 && i2 == 2) {
                ((ug6) this.h0).K(1);
            } else if (i == 2 && i2 == 1) {
                ((ug6) this.h0).K(2);
            }
        }
        this.a.h(this.t, i != 0);
        n();
    }

    public void setShowFastForwardButton(boolean z) {
        this.a.h(this.p, z);
        j();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.l0 = z;
        q();
    }

    public void setShowNextButton(boolean z) {
        this.a.h(this.n, z);
        j();
    }

    public void setShowPreviousButton(boolean z) {
        this.a.h(this.m, z);
        j();
    }

    public void setShowRewindButton(boolean z) {
        this.a.h(this.q, z);
        j();
    }

    public void setShowShuffleButton(boolean z) {
        this.a.h(this.u, z);
        p();
    }

    public void setShowSubtitleButton(boolean z) {
        this.a.h(this.w, z);
    }

    public void setShowTimeoutMs(int i) {
        this.o0 = i;
        if (f()) {
            this.a.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.a.h(this.v, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.p0 = lik.h(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.v;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            i(view, onClickListener != null);
        }
    }

    public void setProgressUpdateListener(@Nullable xii xiiVar) {
    }
}
