package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.media3.common.b;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class one extends FrameLayout {
    public static final float[] I0;
    public final ImageView A;
    public int A0;
    public final ImageView B;
    public int B0;
    public final ImageView C;
    public long[] C0;
    public final ImageView D;
    public boolean[] D0;
    public final ImageView E;
    public final long[] E0;
    public final ImageView F;
    public final boolean[] F0;
    public final View G;
    public long G0;
    public final View H;
    public boolean H0;
    public final View I;
    public final TextView J;
    public final TextView K;
    public final chj L;
    public final StringBuilder M;
    public final Formatter N;
    public final iij O;
    public final kij P;
    public final yp8 Q;
    public final Drawable R;
    public final Drawable S;
    public final Drawable T;
    public final Drawable U;
    public final Drawable V;
    public final String W;
    public final tne a;
    public final String a0;
    public final Resources b;
    public final String b0;
    public final Handler c;
    public final Drawable c0;
    public final ene d;
    public final Drawable d0;
    public final Class e;
    public final float e0;
    public final Method f;
    public final float f0;
    public final Method g;
    public final String g0;
    public final Class h;
    public final String h0;
    public final Method i;
    public final Drawable i0;
    public final Method j;
    public final Drawable j0;
    public final CopyOnWriteArrayList k;
    public final String k0;
    public final RecyclerView l;
    public final String l0;
    public final jne m;
    public final Drawable m0;
    public final gne n;
    public final Drawable n0;
    public final dne o;
    public final String o0;
    public final dne p;
    public final String p0;
    public final de0 q;
    public ale q0;
    public final PopupWindow r;
    public fne r0;
    public final int s;
    public boolean s0;
    public final ImageView t;
    public boolean t0;
    public final ImageView u;
    public boolean u0;
    public final ImageView v;
    public boolean v0;
    public final View w;
    public boolean w0;
    public final View x;
    public boolean x0;
    public final TextView y;
    public int y0;
    public final TextView z;
    public boolean z0;

    static {
        i6c.a("media3.ui");
        I0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't wrap try/catch for region: R(56:0|1|(4:3|4|5|6)(1:113)|7|8|9|(3:10|11|12)|(3:13|14|15)|16|17|18|20|21|22|(2:23|24)|25|(1:27)|28|(1:30)(1:96)|31|(1:33)|34|(1:36)|37|(1:39)|40|(1:42)|43|(1:45)(1:(1:94)(26:95|(1:48)|49|(1:51)|52|(1:54)|55|(1:57)|58|(1:60)(2:89|(1:91)(1:92))|61|(1:63)|64|(1:66)(2:85|(1:87)(1:88))|67|(1:69)|70|(1:72)|73|(1:75)|76|(1:78)|79|(1:81)|82|83))|46|(0)|49|(0)|52|(0)|55|(0)|58|(0)(0)|61|(0)|64|(0)(0)|67|(0)|70|(0)|73|(0)|76|(0)|79|(0)|82|83|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(58:0|1|(4:3|4|5|6)(1:113)|7|8|9|10|11|12|(3:13|14|15)|16|17|18|20|21|22|(2:23|24)|25|(1:27)|28|(1:30)(1:96)|31|(1:33)|34|(1:36)|37|(1:39)|40|(1:42)|43|(1:45)(1:(1:94)(26:95|(1:48)|49|(1:51)|52|(1:54)|55|(1:57)|58|(1:60)(2:89|(1:91)(1:92))|61|(1:63)|64|(1:66)(2:85|(1:87)(1:88))|67|(1:69)|70|(1:72)|73|(1:75)|76|(1:78)|79|(1:81)|82|83))|46|(0)|49|(0)|52|(0)|55|(0)|58|(0)(0)|61|(0)|64|(0)(0)|67|(0)|70|(0)|73|(0)|76|(0)|79|(0)|82|83|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0242, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0244, code lost:
    
        r5 = null;
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028c  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public one(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        Class cls;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i15;
        boolean z8;
        Method method;
        Method method2;
        Method method3;
        ImageView imageView;
        ImageView imageView2;
        int i16;
        ImageView imageView3;
        View findViewById;
        View findViewById2;
        View findViewById3;
        chj chjVar;
        Handler.Callback callback;
        chj chjVar2;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        ImageView imageView7;
        View view;
        ImageView imageView8;
        View view2;
        ImageView imageView9;
        ImageView imageView10;
        ImageView imageView11;
        chj chjVar3;
        Class cls2 = Boolean.TYPE;
        this.v0 = true;
        this.y0 = 5000;
        this.B0 = 0;
        this.A0 = 200;
        int i17 = R.drawable.exo_styled_controls_pause;
        int i18 = R.drawable.exo_styled_controls_next;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, zjf.c, 0, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                int resourceId2 = obtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                i17 = obtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                i18 = obtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId3 = obtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                int resourceId4 = obtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                i = obtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId5 = obtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                cls = cls2;
                int resourceId6 = obtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId7 = obtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId8 = obtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                int resourceId9 = obtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                int resourceId10 = obtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                int resourceId11 = obtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                int resourceId12 = obtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                int resourceId13 = obtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId14 = obtainStyledAttributes.getResourceId(42, R.drawable.exo_styled_controls_vr);
                this.y0 = obtainStyledAttributes.getInt(32, this.y0);
                this.B0 = obtainStyledAttributes.getInt(19, this.B0);
                boolean z9 = obtainStyledAttributes.getBoolean(29, true);
                boolean z10 = obtainStyledAttributes.getBoolean(26, true);
                boolean z11 = obtainStyledAttributes.getBoolean(28, true);
                boolean z12 = obtainStyledAttributes.getBoolean(27, true);
                boolean z13 = obtainStyledAttributes.getBoolean(30, false);
                boolean z14 = obtainStyledAttributes.getBoolean(31, false);
                boolean z15 = obtainStyledAttributes.getBoolean(33, false);
                this.z0 = obtainStyledAttributes.getBoolean(39, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(38, this.A0));
                boolean z16 = obtainStyledAttributes.getBoolean(2, true);
                obtainStyledAttributes.recycle();
                i2 = resourceId4;
                i3 = resourceId;
                i4 = resourceId3;
                i5 = resourceId2;
                i7 = resourceId5;
                i6 = resourceId14;
                i11 = resourceId9;
                z5 = z12;
                z = z16;
                i12 = resourceId11;
                i13 = resourceId12;
                i14 = resourceId13;
                z6 = z9;
                z7 = z10;
                i9 = resourceId7;
                i10 = resourceId8;
                i15 = resourceId10;
                z8 = z11;
                z4 = z13;
                z3 = z14;
                i8 = resourceId6;
                z2 = z15;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            cls = cls2;
            i = R.drawable.exo_styled_controls_simple_rewind;
            i2 = R.drawable.exo_styled_controls_previous;
            i3 = R.layout.exo_player_control_view;
            i4 = R.drawable.exo_styled_controls_simple_fastforward;
            i5 = R.drawable.exo_styled_controls_play;
            i6 = R.drawable.exo_styled_controls_vr;
            i7 = R.drawable.exo_styled_controls_fullscreen_exit;
            i8 = R.drawable.exo_styled_controls_fullscreen_enter;
            i9 = R.drawable.exo_styled_controls_repeat_off;
            i10 = R.drawable.exo_styled_controls_repeat_one;
            i11 = R.drawable.exo_styled_controls_repeat_all;
            i12 = R.drawable.exo_styled_controls_shuffle_off;
            i13 = R.drawable.exo_styled_controls_subtitle_on;
            i14 = R.drawable.exo_styled_controls_subtitle_off;
            z = true;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = true;
            z6 = true;
            z7 = true;
            i15 = R.drawable.exo_styled_controls_shuffle_on;
            z8 = true;
        }
        int i19 = i17;
        int i20 = i;
        LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(262144);
        this.d = new ene(this);
        this.k = new CopyOnWriteArrayList();
        this.O = new iij();
        this.P = new kij();
        StringBuilder sb = new StringBuilder();
        this.M = sb;
        int i21 = i5;
        this.N = new Formatter(sb, Locale.getDefault());
        this.C0 = new long[0];
        this.D0 = new boolean[0];
        this.E0 = new long[0];
        this.F0 = new boolean[0];
        this.Q = new yp8(this, 27);
        try {
            method = ExoPlayer.class.getMethod("setScrubbingModeEnabled", cls);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
        }
        try {
            method2 = ExoPlayer.class.getMethod("isScrubbingModeEnabled", null);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            method2 = null;
            this.e = ExoPlayer.class;
            this.f = method;
            this.g = method2;
            Class<?> cls3 = Class.forName("androidx.media3.transformer.CompositionPlayer");
            Method method4 = cls3.getMethod("setScrubbingModeEnabled", cls);
            method3 = cls3.getMethod("isScrubbingModeEnabled", null);
            this.h = cls3;
            this.i = method4;
            this.j = method3;
            this.J = (TextView) findViewById(R.id.exo_duration);
            this.K = (TextView) findViewById(R.id.exo_position);
            imageView = (ImageView) findViewById(R.id.exo_subtitle);
            this.D = imageView;
            if (imageView != null) {
            }
            imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
            this.E = imageView2;
            int i22 = 29;
            cd5 cd5Var = new cd5(this, i22);
            if (imageView2 == null) {
            }
            imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
            this.F = imageView3;
            cd5 cd5Var2 = new cd5(this, i22);
            if (imageView3 != null) {
            }
            findViewById = findViewById(R.id.exo_settings);
            this.G = findViewById;
            if (findViewById != null) {
            }
            findViewById2 = findViewById(R.id.exo_playback_speed);
            this.H = findViewById2;
            if (findViewById2 != null) {
            }
            findViewById3 = findViewById(R.id.exo_audio_track);
            this.I = findViewById3;
            if (findViewById3 != null) {
            }
            chjVar = (chj) findViewById(R.id.exo_progress);
            View findViewById4 = findViewById(R.id.exo_progress_placeholder);
            if (chjVar != null) {
            }
            callback = null;
            chjVar2 = chjVar3;
            if (chjVar2 != null) {
            }
            this.c = nik.q(callback);
            Resources resources = context.getResources();
            this.b = resources;
            imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
            this.v = imageView4;
            if (imageView4 != null) {
            }
            imageView5 = (ImageView) findViewById(R.id.exo_prev);
            this.t = imageView5;
            if (imageView5 != null) {
            }
            imageView6 = (ImageView) findViewById(R.id.exo_next);
            this.u = imageView6;
            if (imageView6 != null) {
            }
            Typeface a = z1g.a(R.font.roboto_medium_numbers, context);
            imageView7 = (ImageView) findViewById(R.id.exo_rew);
            TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
            if (imageView7 == null) {
            }
            view = this.x;
            if (view != null) {
            }
            imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
            TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
            if (imageView8 == null) {
            }
            view2 = this.w;
            if (view2 != null) {
            }
            imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
            this.A = imageView9;
            if (imageView9 != null) {
            }
            imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
            this.B = imageView10;
            if (imageView10 != null) {
            }
            this.e0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
            this.f0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
            imageView11 = (ImageView) findViewById(R.id.exo_vr);
            this.C = imageView11;
            if (imageView11 != null) {
            }
            tne tneVar = new tne(this);
            this.a = tneVar;
            tneVar.D = z;
            jne jneVar = new jne(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
            this.m = jneVar;
            this.s = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
            RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
            this.l = recyclerView;
            recyclerView.setAdapter(jneVar);
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
            this.r = popupWindow;
            popupWindow.setOnDismissListener(this.d);
            this.H0 = true;
            this.q = new de0(getResources());
            this.i0 = resources.getDrawable(i13, context.getTheme());
            this.j0 = resources.getDrawable(i14, context.getTheme());
            this.k0 = resources.getString(R.string.exo_controls_cc_enabled_description);
            this.l0 = resources.getString(R.string.exo_controls_cc_disabled_description);
            this.o = new dne(this, 1);
            this.p = new dne(this, false ? 1 : 0);
            this.n = new gne(this, resources.getStringArray(R.array.exo_controls_playback_speeds), I0, false ? 1 : 0);
            this.R = resources.getDrawable(i21, context.getTheme());
            this.S = resources.getDrawable(i19, context.getTheme());
            this.m0 = resources.getDrawable(i7, context.getTheme());
            this.n0 = resources.getDrawable(i8, context.getTheme());
            this.T = resources.getDrawable(i9, context.getTheme());
            this.U = resources.getDrawable(i10, context.getTheme());
            this.V = resources.getDrawable(i11, context.getTheme());
            this.c0 = resources.getDrawable(i15, context.getTheme());
            this.d0 = resources.getDrawable(i12, context.getTheme());
            this.o0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
            this.p0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
            this.W = resources.getString(R.string.exo_controls_repeat_off_description);
            this.a0 = resources.getString(R.string.exo_controls_repeat_one_description);
            this.b0 = resources.getString(R.string.exo_controls_repeat_all_description);
            this.g0 = resources.getString(R.string.exo_controls_shuffle_on_description);
            this.h0 = resources.getString(R.string.exo_controls_shuffle_off_description);
            tneVar.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
            tneVar.h(this.w, z7);
            tneVar.h(this.x, z6);
            tneVar.h(imageView5, z8);
            tneVar.h(imageView6, z5);
            tneVar.h(imageView10, z4);
            tneVar.h(this.D, z3);
            tneVar.h(imageView11, z2);
            tneVar.h(imageView9, this.B0 != 0);
            addOnLayoutChangeListener(new r8(this, 6));
        }
        this.e = ExoPlayer.class;
        this.f = method;
        this.g = method2;
        Class<?> cls32 = Class.forName("androidx.media3.transformer.CompositionPlayer");
        Method method42 = cls32.getMethod("setScrubbingModeEnabled", cls);
        try {
            method3 = cls32.getMethod("isScrubbingModeEnabled", null);
        } catch (ClassNotFoundException | NoSuchMethodException unused3) {
            method3 = null;
            this.h = cls32;
            this.i = method42;
            this.j = method3;
            this.J = (TextView) findViewById(R.id.exo_duration);
            this.K = (TextView) findViewById(R.id.exo_position);
            imageView = (ImageView) findViewById(R.id.exo_subtitle);
            this.D = imageView;
            if (imageView != null) {
            }
            imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
            this.E = imageView2;
            int i222 = 29;
            cd5 cd5Var3 = new cd5(this, i222);
            if (imageView2 == null) {
            }
            imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
            this.F = imageView3;
            cd5 cd5Var22 = new cd5(this, i222);
            if (imageView3 != null) {
            }
            findViewById = findViewById(R.id.exo_settings);
            this.G = findViewById;
            if (findViewById != null) {
            }
            findViewById2 = findViewById(R.id.exo_playback_speed);
            this.H = findViewById2;
            if (findViewById2 != null) {
            }
            findViewById3 = findViewById(R.id.exo_audio_track);
            this.I = findViewById3;
            if (findViewById3 != null) {
            }
            chjVar = (chj) findViewById(R.id.exo_progress);
            View findViewById42 = findViewById(R.id.exo_progress_placeholder);
            if (chjVar != null) {
            }
            callback = null;
            chjVar2 = chjVar3;
            if (chjVar2 != null) {
            }
            this.c = nik.q(callback);
            Resources resources2 = context.getResources();
            this.b = resources2;
            imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
            this.v = imageView4;
            if (imageView4 != null) {
            }
            imageView5 = (ImageView) findViewById(R.id.exo_prev);
            this.t = imageView5;
            if (imageView5 != null) {
            }
            imageView6 = (ImageView) findViewById(R.id.exo_next);
            this.u = imageView6;
            if (imageView6 != null) {
            }
            Typeface a2 = z1g.a(R.font.roboto_medium_numbers, context);
            imageView7 = (ImageView) findViewById(R.id.exo_rew);
            TextView textView3 = (TextView) findViewById(R.id.exo_rew_with_amount);
            if (imageView7 == null) {
            }
            view = this.x;
            if (view != null) {
            }
            imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
            TextView textView22 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
            if (imageView8 == null) {
            }
            view2 = this.w;
            if (view2 != null) {
            }
            imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
            this.A = imageView9;
            if (imageView9 != null) {
            }
            imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
            this.B = imageView10;
            if (imageView10 != null) {
            }
            this.e0 = resources2.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
            this.f0 = resources2.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
            imageView11 = (ImageView) findViewById(R.id.exo_vr);
            this.C = imageView11;
            if (imageView11 != null) {
            }
            tne tneVar2 = new tne(this);
            this.a = tneVar2;
            tneVar2.D = z;
            jne jneVar2 = new jne(this, new String[]{resources2.getString(R.string.exo_controls_playback_speed), resources2.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources2.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources2.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
            this.m = jneVar2;
            this.s = resources2.getDimensionPixelSize(R.dimen.exo_settings_offset);
            RecyclerView recyclerView2 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
            this.l = recyclerView2;
            recyclerView2.setAdapter(jneVar2);
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager());
            PopupWindow popupWindow2 = new PopupWindow((View) recyclerView2, -2, -2, true);
            this.r = popupWindow2;
            popupWindow2.setOnDismissListener(this.d);
            this.H0 = true;
            this.q = new de0(getResources());
            this.i0 = resources2.getDrawable(i13, context.getTheme());
            this.j0 = resources2.getDrawable(i14, context.getTheme());
            this.k0 = resources2.getString(R.string.exo_controls_cc_enabled_description);
            this.l0 = resources2.getString(R.string.exo_controls_cc_disabled_description);
            this.o = new dne(this, 1);
            this.p = new dne(this, false ? 1 : 0);
            this.n = new gne(this, resources2.getStringArray(R.array.exo_controls_playback_speeds), I0, false ? 1 : 0);
            this.R = resources2.getDrawable(i21, context.getTheme());
            this.S = resources2.getDrawable(i19, context.getTheme());
            this.m0 = resources2.getDrawable(i7, context.getTheme());
            this.n0 = resources2.getDrawable(i8, context.getTheme());
            this.T = resources2.getDrawable(i9, context.getTheme());
            this.U = resources2.getDrawable(i10, context.getTheme());
            this.V = resources2.getDrawable(i11, context.getTheme());
            this.c0 = resources2.getDrawable(i15, context.getTheme());
            this.d0 = resources2.getDrawable(i12, context.getTheme());
            this.o0 = resources2.getString(R.string.exo_controls_fullscreen_exit_description);
            this.p0 = resources2.getString(R.string.exo_controls_fullscreen_enter_description);
            this.W = resources2.getString(R.string.exo_controls_repeat_off_description);
            this.a0 = resources2.getString(R.string.exo_controls_repeat_one_description);
            this.b0 = resources2.getString(R.string.exo_controls_repeat_all_description);
            this.g0 = resources2.getString(R.string.exo_controls_shuffle_on_description);
            this.h0 = resources2.getString(R.string.exo_controls_shuffle_off_description);
            tneVar2.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
            tneVar2.h(this.w, z7);
            tneVar2.h(this.x, z6);
            tneVar2.h(imageView5, z8);
            tneVar2.h(imageView6, z5);
            tneVar2.h(imageView10, z4);
            tneVar2.h(this.D, z3);
            tneVar2.h(imageView11, z2);
            tneVar2.h(imageView9, this.B0 != 0);
            addOnLayoutChangeListener(new r8(this, 6));
        }
        this.h = cls32;
        this.i = method42;
        this.j = method3;
        this.J = (TextView) findViewById(R.id.exo_duration);
        this.K = (TextView) findViewById(R.id.exo_position);
        imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.D = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.d);
        }
        imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.E = imageView2;
        int i2222 = 29;
        cd5 cd5Var32 = new cd5(this, i2222);
        if (imageView2 == null) {
            i16 = 8;
        } else {
            i16 = 8;
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(cd5Var32);
        }
        imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.F = imageView3;
        cd5 cd5Var222 = new cd5(this, i2222);
        if (imageView3 != null) {
            imageView3.setVisibility(i16);
            imageView3.setOnClickListener(cd5Var222);
        }
        findViewById = findViewById(R.id.exo_settings);
        this.G = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this.d);
        }
        findViewById2 = findViewById(R.id.exo_playback_speed);
        this.H = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this.d);
        }
        findViewById3 = findViewById(R.id.exo_audio_track);
        this.I = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this.d);
        }
        chjVar = (chj) findViewById(R.id.exo_progress);
        View findViewById422 = findViewById(R.id.exo_progress_placeholder);
        if (chjVar != null) {
            this.L = chjVar;
            chjVar3 = chjVar;
        } else {
            if (findViewById422 == null) {
                callback = null;
                this.L = null;
                chjVar2 = null;
                if (chjVar2 != null) {
                    chjVar2.b(this.d);
                }
                this.c = nik.q(callback);
                Resources resources22 = context.getResources();
                this.b = resources22;
                imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
                this.v = imageView4;
                if (imageView4 != null) {
                    imageView4.setOnClickListener(this.d);
                }
                imageView5 = (ImageView) findViewById(R.id.exo_prev);
                this.t = imageView5;
                if (imageView5 != null) {
                    imageView5.setImageDrawable(resources22.getDrawable(i2, context.getTheme()));
                    imageView5.setOnClickListener(this.d);
                }
                imageView6 = (ImageView) findViewById(R.id.exo_next);
                this.u = imageView6;
                if (imageView6 != null) {
                    imageView6.setImageDrawable(resources22.getDrawable(i18, context.getTheme()));
                    imageView6.setOnClickListener(this.d);
                }
                Typeface a22 = z1g.a(R.font.roboto_medium_numbers, context);
                imageView7 = (ImageView) findViewById(R.id.exo_rew);
                TextView textView32 = (TextView) findViewById(R.id.exo_rew_with_amount);
                if (imageView7 == null) {
                    imageView7.setImageDrawable(resources22.getDrawable(i20, context.getTheme()));
                    this.x = imageView7;
                    this.z = null;
                } else if (textView32 != null) {
                    textView32.setTypeface(a22);
                    this.z = textView32;
                    this.x = textView32;
                } else {
                    this.z = null;
                    this.x = null;
                }
                view = this.x;
                if (view != null) {
                    view.setOnClickListener(this.d);
                }
                imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
                TextView textView222 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
                if (imageView8 == null) {
                    imageView8.setImageDrawable(resources22.getDrawable(i4, context.getTheme()));
                    this.w = imageView8;
                    this.y = null;
                } else if (textView222 != null) {
                    textView222.setTypeface(a22);
                    this.y = textView222;
                    this.w = textView222;
                } else {
                    this.y = null;
                    this.w = null;
                }
                view2 = this.w;
                if (view2 != null) {
                    view2.setOnClickListener(this.d);
                }
                imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
                this.A = imageView9;
                if (imageView9 != null) {
                    imageView9.setOnClickListener(this.d);
                }
                imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
                this.B = imageView10;
                if (imageView10 != null) {
                    imageView10.setOnClickListener(this.d);
                }
                this.e0 = resources22.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                this.f0 = resources22.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                imageView11 = (ImageView) findViewById(R.id.exo_vr);
                this.C = imageView11;
                if (imageView11 != null) {
                    imageView11.setImageDrawable(resources22.getDrawable(i6, context.getTheme()));
                    n(imageView11, false);
                }
                tne tneVar22 = new tne(this);
                this.a = tneVar22;
                tneVar22.D = z;
                jne jneVar22 = new jne(this, new String[]{resources22.getString(R.string.exo_controls_playback_speed), resources22.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources22.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources22.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
                this.m = jneVar22;
                this.s = resources22.getDimensionPixelSize(R.dimen.exo_settings_offset);
                RecyclerView recyclerView22 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
                this.l = recyclerView22;
                recyclerView22.setAdapter(jneVar22);
                getContext();
                recyclerView22.setLayoutManager(new LinearLayoutManager());
                PopupWindow popupWindow22 = new PopupWindow((View) recyclerView22, -2, -2, true);
                this.r = popupWindow22;
                popupWindow22.setOnDismissListener(this.d);
                this.H0 = true;
                this.q = new de0(getResources());
                this.i0 = resources22.getDrawable(i13, context.getTheme());
                this.j0 = resources22.getDrawable(i14, context.getTheme());
                this.k0 = resources22.getString(R.string.exo_controls_cc_enabled_description);
                this.l0 = resources22.getString(R.string.exo_controls_cc_disabled_description);
                this.o = new dne(this, 1);
                this.p = new dne(this, false ? 1 : 0);
                this.n = new gne(this, resources22.getStringArray(R.array.exo_controls_playback_speeds), I0, false ? 1 : 0);
                this.R = resources22.getDrawable(i21, context.getTheme());
                this.S = resources22.getDrawable(i19, context.getTheme());
                this.m0 = resources22.getDrawable(i7, context.getTheme());
                this.n0 = resources22.getDrawable(i8, context.getTheme());
                this.T = resources22.getDrawable(i9, context.getTheme());
                this.U = resources22.getDrawable(i10, context.getTheme());
                this.V = resources22.getDrawable(i11, context.getTheme());
                this.c0 = resources22.getDrawable(i15, context.getTheme());
                this.d0 = resources22.getDrawable(i12, context.getTheme());
                this.o0 = resources22.getString(R.string.exo_controls_fullscreen_exit_description);
                this.p0 = resources22.getString(R.string.exo_controls_fullscreen_enter_description);
                this.W = resources22.getString(R.string.exo_controls_repeat_off_description);
                this.a0 = resources22.getString(R.string.exo_controls_repeat_one_description);
                this.b0 = resources22.getString(R.string.exo_controls_repeat_all_description);
                this.g0 = resources22.getString(R.string.exo_controls_shuffle_on_description);
                this.h0 = resources22.getString(R.string.exo_controls_shuffle_off_description);
                tneVar22.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
                tneVar22.h(this.w, z7);
                tneVar22.h(this.x, z6);
                tneVar22.h(imageView5, z8);
                tneVar22.h(imageView6, z5);
                tneVar22.h(imageView10, z4);
                tneVar22.h(this.D, z3);
                tneVar22.h(imageView11, z2);
                tneVar22.h(imageView9, this.B0 != 0);
                addOnLayoutChangeListener(new r8(this, 6));
            }
            it4 it4Var = new it4(context, attributeSet);
            it4Var.setId(R.id.exo_progress);
            it4Var.setLayoutParams(findViewById422.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById422.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById422);
            viewGroup.removeView(findViewById422);
            viewGroup.addView(it4Var, indexOfChild);
            this.L = it4Var;
            chjVar3 = it4Var;
        }
        callback = null;
        chjVar2 = chjVar3;
        if (chjVar2 != null) {
        }
        this.c = nik.q(callback);
        Resources resources222 = context.getResources();
        this.b = resources222;
        imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.v = imageView4;
        if (imageView4 != null) {
        }
        imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.t = imageView5;
        if (imageView5 != null) {
        }
        imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.u = imageView6;
        if (imageView6 != null) {
        }
        Typeface a222 = z1g.a(R.font.roboto_medium_numbers, context);
        imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView322 = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 == null) {
        }
        view = this.x;
        if (view != null) {
        }
        imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2222 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 == null) {
        }
        view2 = this.w;
        if (view2 != null) {
        }
        imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.A = imageView9;
        if (imageView9 != null) {
        }
        imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.B = imageView10;
        if (imageView10 != null) {
        }
        this.e0 = resources222.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f0 = resources222.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.C = imageView11;
        if (imageView11 != null) {
        }
        tne tneVar222 = new tne(this);
        this.a = tneVar222;
        tneVar222.D = z;
        jne jneVar222 = new jne(this, new String[]{resources222.getString(R.string.exo_controls_playback_speed), resources222.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources222.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources222.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.m = jneVar222;
        this.s = resources222.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView222 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.l = recyclerView222;
        recyclerView222.setAdapter(jneVar222);
        getContext();
        recyclerView222.setLayoutManager(new LinearLayoutManager());
        PopupWindow popupWindow222 = new PopupWindow((View) recyclerView222, -2, -2, true);
        this.r = popupWindow222;
        popupWindow222.setOnDismissListener(this.d);
        this.H0 = true;
        this.q = new de0(getResources());
        this.i0 = resources222.getDrawable(i13, context.getTheme());
        this.j0 = resources222.getDrawable(i14, context.getTheme());
        this.k0 = resources222.getString(R.string.exo_controls_cc_enabled_description);
        this.l0 = resources222.getString(R.string.exo_controls_cc_disabled_description);
        this.o = new dne(this, 1);
        this.p = new dne(this, false ? 1 : 0);
        this.n = new gne(this, resources222.getStringArray(R.array.exo_controls_playback_speeds), I0, false ? 1 : 0);
        this.R = resources222.getDrawable(i21, context.getTheme());
        this.S = resources222.getDrawable(i19, context.getTheme());
        this.m0 = resources222.getDrawable(i7, context.getTheme());
        this.n0 = resources222.getDrawable(i8, context.getTheme());
        this.T = resources222.getDrawable(i9, context.getTheme());
        this.U = resources222.getDrawable(i10, context.getTheme());
        this.V = resources222.getDrawable(i11, context.getTheme());
        this.c0 = resources222.getDrawable(i15, context.getTheme());
        this.d0 = resources222.getDrawable(i12, context.getTheme());
        this.o0 = resources222.getString(R.string.exo_controls_fullscreen_exit_description);
        this.p0 = resources222.getString(R.string.exo_controls_fullscreen_enter_description);
        this.W = resources222.getString(R.string.exo_controls_repeat_off_description);
        this.a0 = resources222.getString(R.string.exo_controls_repeat_one_description);
        this.b0 = resources222.getString(R.string.exo_controls_repeat_all_description);
        this.g0 = resources222.getString(R.string.exo_controls_shuffle_on_description);
        this.h0 = resources222.getString(R.string.exo_controls_shuffle_off_description);
        tneVar222.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        tneVar222.h(this.w, z7);
        tneVar222.h(this.x, z6);
        tneVar222.h(imageView5, z8);
        tneVar222.h(imageView6, z5);
        tneVar222.h(imageView10, z4);
        tneVar222.h(this.D, z3);
        tneVar222.h(imageView11, z2);
        tneVar222.h(imageView9, this.B0 != 0);
        addOnLayoutChangeListener(new r8(this, 6));
    }

    public static boolean b(ale aleVar, kij kijVar) {
        mij currentTimeline;
        int o;
        if (aleVar.k(17) && (o = (currentTimeline = aleVar.getCurrentTimeline()).o()) > 1 && o <= 100) {
            for (int i = 0; i < o; i++) {
                if (currentTimeline.m(i, kijVar, 0L).l != C.TIME_UNSET) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        ale aleVar = this.q0;
        if (aleVar == null || !aleVar.k(13)) {
            return;
        }
        ale aleVar2 = this.q0;
        aleVar2.b(new hke(f, aleVar2.getPlaybackParameters().b));
    }

    public final boolean c(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ale aleVar = this.q0;
        if (aleVar == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (aleVar.getPlaybackState() != 4 && aleVar.k(12)) {
                    aleVar.B();
                }
            } else if (keyCode == 89 && aleVar.k(11)) {
                aleVar.C();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (nik.e0(aleVar, this.v0)) {
                        nik.K(aleVar);
                    } else if (aleVar.k(1)) {
                        aleVar.pause();
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            nik.K(aleVar);
                        } else if (keyCode == 127) {
                            String str = nik.a;
                            if (aleVar.k(1)) {
                                aleVar.pause();
                            }
                        }
                    } else if (aleVar.k(7)) {
                        aleVar.g();
                    }
                } else if (aleVar.k(9)) {
                    aleVar.p();
                }
            }
        }
        return true;
    }

    public final void d(l lVar, View view) {
        this.l.setAdapter(lVar);
        u();
        this.H0 = false;
        PopupWindow popupWindow = this.r;
        popupWindow.dismiss();
        this.H0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.s;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final vvf e(uuj uujVar, int i) {
        yqo.w(4, "initialCapacity");
        Object[] objArr = new Object[4];
        hv9 hv9Var = uujVar.a;
        int i2 = 0;
        for (int i3 = 0; i3 < hv9Var.size(); i3++) {
            suj sujVar = (suj) hv9Var.get(i3);
            if (sujVar.b.c == i) {
                for (int i4 = 0; i4 < sujVar.a; i4++) {
                    if (sujVar.a(i4)) {
                        b bVar = sujVar.b.d[i4];
                        if ((bVar.e & 2) == 0) {
                            lne lneVar = new lne(uujVar, i3, i4, this.q.w(bVar));
                            int i5 = i2 + 1;
                            int b = vu9.b(objArr.length, i5);
                            if (b > objArr.length) {
                                objArr = Arrays.copyOf(objArr, b);
                            }
                            objArr[i2] = lneVar;
                            i2 = i5;
                        }
                    }
                }
            }
        }
        return hv9.r(i2, objArr);
    }

    public final void f() {
        tne tneVar = this.a;
        int i = tneVar.A;
        if (i == 3 || i == 2) {
            return;
        }
        tneVar.f();
        if (!tneVar.D) {
            tneVar.i(2);
        } else if (tneVar.A == 1) {
            tneVar.n.start();
        } else {
            tneVar.o.start();
        }
    }

    public final boolean g(ale aleVar) {
        Class cls;
        return (aleVar == null || (cls = this.h) == null || !cls.isAssignableFrom(aleVar.getClass())) ? false : true;
    }

    @Nullable
    public ale getPlayer() {
        return this.q0;
    }

    public int getRepeatToggleModes() {
        return this.B0;
    }

    public boolean getShowShuffleButton() {
        return this.a.b(this.B);
    }

    public boolean getShowSubtitleButton() {
        return this.a.b(this.D);
    }

    public int getShowTimeoutMs() {
        return this.y0;
    }

    public boolean getShowVrButton() {
        return this.a.b(this.C);
    }

    public final boolean h(ale aleVar) {
        Class cls;
        return (aleVar == null || (cls = this.e) == null || !cls.isAssignableFrom(aleVar.getClass())) ? false : true;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i() {
        tne tneVar = this.a;
        return tneVar.A == 0 && tneVar.a.k();
    }

    public final boolean j(ale aleVar) {
        try {
            if (h(aleVar)) {
                Method method = this.g;
                method.getClass();
                Object invoke = method.invoke(aleVar, null);
                invoke.getClass();
                if (((Boolean) invoke).booleanValue()) {
                    return true;
                }
            }
            if (g(aleVar)) {
                Method method2 = this.j;
                method2.getClass();
                Object invoke2 = method2.invoke(aleVar, null);
                invoke2.getClass();
                if (((Boolean) invoke2).booleanValue()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalAccessException e) {
            e = e;
            is8.h(e);
            return false;
        } catch (InvocationTargetException e2) {
            e = e2;
            is8.h(e);
            return false;
        }
    }

    public final boolean k() {
        return getVisibility() == 0;
    }

    public final void l(ale aleVar, long j) {
        if (this.w0) {
            if (aleVar.k(17) && aleVar.k(10)) {
                mij currentTimeline = aleVar.getCurrentTimeline();
                int o = currentTimeline.o();
                int i = 0;
                while (true) {
                    long h0 = nik.h0(currentTimeline.m(i, this.P, 0L).l);
                    if (j < h0) {
                        break;
                    }
                    if (i == o - 1) {
                        j = h0;
                        break;
                    } else {
                        j -= h0;
                        i++;
                    }
                }
                aleVar.seekTo(i, j);
            }
        } else if (aleVar.k(5)) {
            aleVar.seekTo(j);
        }
        s();
    }

    public final void m() {
        q();
        p();
        t();
        v();
        x();
        r();
        w();
    }

    public final void n(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.e0 : this.f0);
    }

    public final void o(boolean z) {
        sxe sxeVar;
        if (this.s0 == z) {
            return;
        }
        this.s0 = z;
        String str = this.p0;
        Drawable drawable = this.n0;
        String str2 = this.o0;
        Drawable drawable2 = this.m0;
        ImageView imageView = this.E;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.F;
        if (imageView2 != null) {
            if (z) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        fne fneVar = this.r0;
        if (fneVar == null || (sxeVar = ((qxe) fneVar).c.v) == null) {
            return;
        }
        sxeVar.a(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tne tneVar = this.a;
        tneVar.a.addOnLayoutChangeListener(tneVar.y);
        this.t0 = true;
        if (i()) {
            tneVar.g();
        }
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tne tneVar = this.a;
        tneVar.a.removeOnLayoutChangeListener(tneVar.y);
        this.t0 = false;
        removeCallbacks(this.Q);
        tneVar.f();
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
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (k() && this.t0) {
            ale aleVar = this.q0;
            if (aleVar != null) {
                z = (this.u0 && b(aleVar, this.P)) ? aleVar.k(10) : aleVar.k(5);
                z3 = aleVar.k(7);
                z4 = aleVar.k(11);
                z5 = aleVar.k(12);
                z2 = aleVar.k(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            Resources resources = this.b;
            View view = this.x;
            if (z4) {
                ale aleVar2 = this.q0;
                int E = (int) ((aleVar2 != null ? aleVar2.E() : 5000L) / 1000);
                TextView textView = this.z;
                if (textView != null) {
                    textView.setText(String.valueOf(E));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, E, Integer.valueOf(E)));
                }
            }
            View view2 = this.w;
            if (z5) {
                ale aleVar3 = this.q0;
                int w = (int) ((aleVar3 != null ? aleVar3.w() : 15000L) / 1000);
                TextView textView2 = this.y;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(w));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, w, Integer.valueOf(w)));
                }
            }
            n(this.t, z3);
            n(view, z4);
            n(view2, z5);
            n(this.u, z2);
            chj chjVar = this.L;
            if (chjVar != null) {
                chjVar.setEnabled(z);
            }
        }
    }

    public final void q() {
        ImageView imageView;
        if (k() && this.t0 && (imageView = this.v) != null) {
            boolean e0 = nik.e0(this.q0, this.v0);
            Drawable drawable = e0 ? this.R : this.S;
            int i = e0 ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.b.getString(i));
            n(imageView, nik.d0(this.q0));
        }
    }

    public final void r() {
        gne gneVar;
        ale aleVar = this.q0;
        if (aleVar == null) {
            return;
        }
        float f = aleVar.getPlaybackParameters().a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            gneVar = this.n;
            float[] fArr = gneVar.c;
            if (i >= fArr.length) {
                break;
            }
            float abs = Math.abs(f - fArr[i]);
            if (abs < f2) {
                i2 = i;
                f2 = abs;
            }
            i++;
        }
        gneVar.d = i2;
        String str = gneVar.b[i2];
        jne jneVar = this.m;
        ((String[]) jneVar.c)[0] = str;
        n(this.G, jneVar.o(1) || jneVar.o(0));
    }

    public final void s() {
        long j;
        long j2;
        if (k() && this.t0) {
            ale aleVar = this.q0;
            if (aleVar == null || !aleVar.k(16)) {
                j = 0;
                j2 = 0;
            } else {
                j = aleVar.getContentPosition() + this.G0;
                j2 = aleVar.A() + this.G0;
            }
            TextView textView = this.K;
            if (textView != null && !this.x0) {
                textView.setText(nik.G(this.M, this.N, j));
            }
            chj chjVar = this.L;
            if (chjVar != null) {
                chjVar.setPosition(j);
                if (j(aleVar)) {
                    j2 = j;
                }
                chjVar.setBufferedPosition(j2);
            }
            yp8 yp8Var = this.Q;
            removeCallbacks(yp8Var);
            int playbackState = aleVar == null ? 1 : aleVar.getPlaybackState();
            if (aleVar != null && aleVar.isPlaying()) {
                long min = Math.min(chjVar != null ? chjVar.getPreferredUpdateDelay() : 1000L, 1000 - (j % 1000));
                float f = aleVar.getPlaybackParameters().a;
                postDelayed(yp8Var, nik.k(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (long) (min / f) : 1000L, this.A0, 1000L));
            } else {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(yp8Var, 1000L);
            }
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.a.D = z;
    }

    public void setMediaRouteButtonViewProvider(@Nullable xuk xukVar) {
        View findViewById = findViewById(R.id.exo_media_route_button_placeholder);
        if (findViewById == null) {
            a70.r("The media route button placeholder is missing.");
            return;
        }
        if (xukVar == null) {
            findViewById.setVisibility(8);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
        if (viewGroup == null) {
            a70.r("The media route button placeholder has no parent view.");
            return;
        }
        ddb view = xukVar.getView();
        x6k x6kVar = new x6k(this, findViewById, viewGroup, false, 16);
        Handler handler = this.c;
        Objects.requireNonNull(handler);
        view.addListener(new pyn(11, view, x6kVar), new ip0(handler, 1));
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable fne fneVar) {
        this.r0 = fneVar;
        boolean z = fneVar != null;
        ImageView imageView = this.E;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = fneVar != null;
        ImageView imageView2 = this.F;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(@Nullable ale aleVar) {
        z1a.E(Looper.myLooper() == Looper.getMainLooper());
        z1a.s(aleVar == null || aleVar.n() == Looper.getMainLooper());
        ale aleVar2 = this.q0;
        if (aleVar2 == aleVar) {
            return;
        }
        ene eneVar = this.d;
        if (aleVar2 != null) {
            aleVar2.z(eneVar);
        }
        this.q0 = aleVar;
        if (aleVar != null) {
            aleVar.s(eneVar);
        }
        m();
    }

    public void setRepeatToggleModes(int i) {
        this.B0 = i;
        ale aleVar = this.q0;
        if (aleVar != null && aleVar.k(15)) {
            int repeatMode = this.q0.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.q0.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.q0.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.q0.setRepeatMode(2);
            }
        }
        this.a.h(this.A, i != 0);
        t();
    }

    public void setShowFastForwardButton(boolean z) {
        this.a.h(this.w, z);
        p();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.u0 = z;
        w();
    }

    public void setShowNextButton(boolean z) {
        this.a.h(this.u, z);
        p();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.v0 = z;
        q();
    }

    public void setShowPreviousButton(boolean z) {
        this.a.h(this.t, z);
        p();
    }

    public void setShowRewindButton(boolean z) {
        this.a.h(this.x, z);
        p();
    }

    public void setShowShuffleButton(boolean z) {
        this.a.h(this.B, z);
        v();
    }

    public void setShowSubtitleButton(boolean z) {
        this.a.h(this.D, z);
    }

    public void setShowTimeoutMs(int i) {
        this.y0 = i;
        if (i()) {
            this.a.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.a.h(this.C, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.A0 = nik.j(i, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.z0 = z;
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageView imageView = this.C;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            n(imageView, onClickListener != null);
        }
    }

    public final void t() {
        ImageView imageView;
        if (k() && this.t0 && (imageView = this.A) != null) {
            if (this.B0 == 0) {
                n(imageView, false);
                return;
            }
            ale aleVar = this.q0;
            String str = this.W;
            Drawable drawable = this.T;
            if (aleVar == null || !aleVar.k(15)) {
                n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, true);
            int repeatMode = aleVar.getRepeatMode();
            if (repeatMode == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (repeatMode == 1) {
                imageView.setImageDrawable(this.U);
                imageView.setContentDescription(this.a0);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                imageView.setImageDrawable(this.V);
                imageView.setContentDescription(this.b0);
            }
        }
    }

    public final void u() {
        RecyclerView recyclerView = this.l;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.s;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.r;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void v() {
        ImageView imageView;
        if (k() && this.t0 && (imageView = this.B) != null) {
            ale aleVar = this.q0;
            if (!this.a.b(imageView)) {
                n(imageView, false);
                return;
            }
            String str = this.h0;
            Drawable drawable = this.d0;
            if (aleVar == null || !aleVar.k(14)) {
                n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, true);
            if (aleVar.getShuffleModeEnabled()) {
                drawable = this.c0;
            }
            imageView.setImageDrawable(drawable);
            if (aleVar.getShuffleModeEnabled()) {
                str = this.g0;
            }
            imageView.setContentDescription(str);
        }
    }

    public final void w() {
        long j;
        int i;
        int i2;
        mij mijVar;
        boolean z;
        boolean z2;
        ale aleVar = this.q0;
        if (aleVar == null) {
            return;
        }
        boolean z3 = this.u0;
        kij kijVar = this.P;
        boolean z4 = false;
        boolean z5 = true;
        this.w0 = z3 && b(aleVar, kijVar);
        long j2 = 0;
        this.G0 = 0L;
        mij currentTimeline = aleVar.k(17) ? aleVar.getCurrentTimeline() : mij.a;
        boolean p = currentTimeline.p();
        long j3 = C.TIME_UNSET;
        if (p) {
            if (aleVar.k(16)) {
                long u = aleVar.u();
                if (u != C.TIME_UNSET) {
                    j = nik.T(u);
                    i = 0;
                }
            }
            j = 0;
            i = 0;
        } else {
            int y = aleVar.y();
            boolean z6 = this.w0;
            int i3 = z6 ? 0 : y;
            int o = z6 ? currentTimeline.o() - 1 : y;
            i = 0;
            long j4 = 0;
            while (true) {
                if (i3 > o) {
                    break;
                }
                long j5 = j2;
                if (i3 == y) {
                    this.G0 = nik.h0(j4);
                }
                currentTimeline.n(i3, kijVar);
                if (kijVar.l == j3) {
                    z1a.E(this.w0 ^ z5);
                    break;
                }
                int i4 = kijVar.m;
                while (i4 <= kijVar.n) {
                    iij iijVar = this.O;
                    currentTimeline.f(i4, iijVar, z4);
                    long j6 = j3;
                    kg kgVar = iijVar.g;
                    int i5 = kgVar.e;
                    int i6 = kgVar.b;
                    while (i5 < i6) {
                        long b = iijVar.b(i5);
                        if (b == Long.MIN_VALUE) {
                            long j7 = iijVar.d;
                            if (j7 != j6) {
                                b = j7;
                            }
                            i2 = y;
                            mijVar = currentTimeline;
                            z = true;
                            i5++;
                            z5 = z;
                            y = i2;
                            currentTimeline = mijVar;
                            j5 = 0;
                        }
                        long j8 = b + iijVar.e;
                        if (j8 >= j5) {
                            long[] jArr = this.C0;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.C0 = Arrays.copyOf(jArr, length);
                                this.D0 = Arrays.copyOf(this.D0, length);
                            }
                            this.C0[i] = nik.h0(j4 + j8);
                            boolean[] zArr = this.D0;
                            hg b2 = iijVar.g.b(i5);
                            int i7 = b2.b;
                            i2 = y;
                            if (i7 == -1) {
                                mijVar = currentTimeline;
                                z = true;
                                z2 = true;
                            } else {
                                int i8 = 0;
                                while (i8 < i7) {
                                    int i9 = i8;
                                    int i10 = b2.f[i9];
                                    mijVar = currentTimeline;
                                    z = true;
                                    if (i10 == 0 || i10 == 1) {
                                        z2 = true;
                                        break;
                                    } else {
                                        i8 = i9 + 1;
                                        currentTimeline = mijVar;
                                    }
                                }
                                mijVar = currentTimeline;
                                z = true;
                                z2 = false;
                            }
                            zArr[i] = !z2;
                            i++;
                            i5++;
                            z5 = z;
                            y = i2;
                            currentTimeline = mijVar;
                            j5 = 0;
                        }
                        i2 = y;
                        mijVar = currentTimeline;
                        z = true;
                        i5++;
                        z5 = z;
                        y = i2;
                        currentTimeline = mijVar;
                        j5 = 0;
                    }
                    i4++;
                    j3 = j6;
                    currentTimeline = currentTimeline;
                    z4 = false;
                    j5 = 0;
                }
                j4 += kijVar.l;
                i3++;
                z5 = z5;
                currentTimeline = currentTimeline;
                z4 = false;
                j2 = 0;
            }
            j = j4;
        }
        long h0 = nik.h0(j);
        TextView textView = this.J;
        if (textView != null) {
            textView.setText(nik.G(this.M, this.N, h0));
        }
        chj chjVar = this.L;
        if (chjVar != null) {
            chjVar.setDuration(h0);
            long[] jArr2 = this.E0;
            int length2 = jArr2.length;
            int i11 = i + length2;
            long[] jArr3 = this.C0;
            if (i11 > jArr3.length) {
                this.C0 = Arrays.copyOf(jArr3, i11);
                this.D0 = Arrays.copyOf(this.D0, i11);
            }
            System.arraycopy(jArr2, 0, this.C0, i, length2);
            System.arraycopy(this.F0, 0, this.D0, i, length2);
            chjVar.a(this.C0, this.D0, i11);
        }
        s();
    }

    public final void x() {
        dne dneVar = this.o;
        dneVar.getClass();
        List list = Collections.EMPTY_LIST;
        dneVar.b = list;
        dne dneVar2 = this.p;
        dneVar2.getClass();
        dneVar2.b = list;
        ale aleVar = this.q0;
        ImageView imageView = this.D;
        if (aleVar != null && aleVar.k(30) && this.q0.k(29)) {
            uuj i = this.q0.i();
            vvf e = e(i, 1);
            dneVar2.b = e;
            one oneVar = dneVar2.e;
            ale aleVar2 = oneVar.q0;
            jne jneVar = oneVar.m;
            aleVar2.getClass();
            etj o = aleVar2.o();
            if (!e.isEmpty()) {
                if (dneVar2.t(o)) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= e.d) {
                            break;
                        }
                        lne lneVar = (lne) e.get(i2);
                        if (lneVar.a.e[lneVar.b]) {
                            ((String[]) jneVar.c)[1] = lneVar.c;
                            break;
                        }
                        i2++;
                    }
                } else {
                    ((String[]) jneVar.c)[1] = oneVar.getResources().getString(R.string.exo_track_selection_auto);
                }
            } else {
                ((String[]) jneVar.c)[1] = oneVar.getResources().getString(R.string.exo_track_selection_none);
            }
            if (this.a.b(imageView)) {
                dneVar.u(e(i, 3));
            } else {
                av9 av9Var = hv9.b;
                dneVar.u(vvf.e);
            }
        }
        n(imageView, dneVar.getItemCount() > 0);
        jne jneVar2 = this.m;
        n(this.G, jneVar2.o(1) || jneVar2.o(0));
    }

    public void setProgressUpdateListener(@Nullable hne hneVar) {
    }
}
