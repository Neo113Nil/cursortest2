package com.vk.voip.ui.watchmovie.player;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.Slider;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import com.vk.voip.ui.watchmovie.player.VoipWatchMoviePlayerControlView;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import xsna.bkt0;
import xsna.cn70;
import xsna.e3m;
import xsna.gzs;
import xsna.his0;
import xsna.hl80;
import xsna.icx0;
import xsna.j5g;
import xsna.jcx0;
import xsna.jjc;
import xsna.p3x0;
import xsna.ui6;
import xsna.xq3;
import xsna.zsw0;

/* compiled from: VoipWatchMoviePlayerControlView.kt */
/* loaded from: classes7.dex */
public final class VoipWatchMoviePlayerControlView extends ConstraintLayout implements View.OnClickListener, icx0.a {
    public static final /* synthetic */ int K = 0;
    public final TextView A;
    public final TextView B;
    public final View C;
    public final Slider D;
    public final ImageView E;
    public final View F;
    public final b G;
    public final xq3 H;
    public p3x0 I;
    public boolean J;
    public icx0 t;
    public jcx0 u;
    public final ImageView v;
    public final ImageView w;
    public final View x;
    public final Slider y;
    public final TextView z;

    /* compiled from: VoipWatchMoviePlayerControlView.kt */
    public final class a implements ui6 {
        public a() {
        }

        @Override // xsna.ui6
        public final void a(BaseSlider baseSlider) {
            Slider slider = (Slider) baseSlider;
            VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView = VoipWatchMoviePlayerControlView.this;
            voipWatchMoviePlayerControlView.J = true;
            icx0 icx0Var = voipWatchMoviePlayerControlView.t;
            if (icx0Var != null) {
                icx0Var.c(voipWatchMoviePlayerControlView, true);
            }
            int id = slider.getId();
            if (id == R.id.voip_movie_progress) {
                voipWatchMoviePlayerControlView.z.setVisibility(4);
            } else if (id == R.id.voip_volume_slider) {
                slider.removeCallbacks(voipWatchMoviePlayerControlView.H);
            }
        }

        @Override // xsna.ui6
        public final void b(BaseSlider baseSlider) {
            Slider slider = (Slider) baseSlider;
            VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView = VoipWatchMoviePlayerControlView.this;
            voipWatchMoviePlayerControlView.J = false;
            icx0 icx0Var = voipWatchMoviePlayerControlView.t;
            if (icx0Var != null) {
                icx0Var.c(voipWatchMoviePlayerControlView, false);
            }
            int id = slider.getId();
            if (id == R.id.voip_movie_progress) {
                voipWatchMoviePlayerControlView.z.setVisibility(0);
            } else if (id == R.id.voip_volume_slider) {
                slider.postDelayed(voipWatchMoviePlayerControlView.H, 1000L);
            }
        }
    }

    public VoipWatchMoviePlayerControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.voip_watch_movie_player_control_view, this);
        ImageView imageView = (ImageView) findViewById(R.id.voip_play_button);
        this.v = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.voip_movie_sound_control);
        this.w = imageView2;
        this.x = findViewById(R.id.voip_player_control_group);
        Slider slider = (Slider) findViewById(R.id.voip_movie_progress);
        this.y = slider;
        this.z = (TextView) findViewById(R.id.voip_movie_title);
        this.A = (TextView) findViewById(R.id.voip_movie_full_time);
        this.B = (TextView) findViewById(R.id.voip_movie_current_time);
        this.C = findViewById(R.id.voip_movie_labels_group);
        Slider slider2 = (Slider) findViewById(R.id.voip_volume_slider);
        this.D = slider2;
        ImageView imageView3 = (ImageView) findViewById(R.id.voip_movie_sound_control_icon);
        this.E = imageView3;
        this.F = findViewById(R.id.voip_movie_sound_regulation_group);
        this.G = new b();
        Slider.a aVar = new Slider.a() { // from class: xsna.l6x0
            @Override // xsna.ti6
            public final void F0(BaseSlider baseSlider, float f, boolean z) {
                icx0 icx0Var;
                Slider slider3 = (Slider) baseSlider;
                int i = VoipWatchMoviePlayerControlView.K;
                if (z) {
                    int id = slider3.getId();
                    VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView = VoipWatchMoviePlayerControlView.this;
                    if (id == R.id.voip_movie_progress) {
                        icx0 icx0Var2 = voipWatchMoviePlayerControlView.t;
                        if (icx0Var2 != null) {
                            icx0Var2.k((long) f);
                            return;
                        }
                        return;
                    }
                    if (id != R.id.voip_volume_slider || (icx0Var = voipWatchMoviePlayerControlView.t) == null) {
                        return;
                    }
                    icx0Var.setVolume(f / 100);
                }
            }
        };
        a aVar2 = new a();
        this.H = new xq3(this, 17);
        jjc.f(this, imageView);
        jjc.f(this, imageView2);
        jjc.f(this, imageView3);
        slider.a(aVar);
        slider.o.add(aVar2);
        slider2.a(aVar);
        slider2.o.add(aVar2);
    }

    public static void P4(VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView) {
        voipWatchMoviePlayerControlView.setViewsVisible(true);
    }

    private final boolean getCanControlVideo() {
        icx0 icx0Var = this.t;
        if (icx0Var != null) {
            return icx0Var.n();
        }
        return false;
    }

    private final void setAccessibility(zsw0 zsw0Var) {
        this.v.setContentDescription(zsw0Var.b ? getContext().getString(R.string.voip_accessibility_player_pause) : getContext().getString(R.string.voip_accessibility_player_play));
        this.w.setContentDescription(getContext().getString(R.string.voip_accessibility_change_volume));
        this.D.setContentDescription(getContext().getString(R.string.voip_accessibility_volume_slider));
        this.y.setContentDescription(getContext().getString(R.string.voip_accessibility_rewind_video));
        this.E.setContentDescription(zsw0Var.c == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? getContext().getString(R.string.voip_accessibility_turn_on_sound) : getContext().getString(R.string.voip_accessibility_turn_off_sound));
    }

    private final void setViewsVisible(boolean z) {
        int i = 8;
        boolean z2 = false;
        this.F.setVisibility(!z ? 0 : 8);
        p3x0 p3x0Var = this.I;
        boolean z3 = p3x0Var != null && p3x0Var.g < 0;
        this.C.setVisibility(!z ? 4 : 0);
        if (z && !z3) {
            i = 0;
        }
        this.B.setVisibility(i);
        if (z && getCanControlVideo()) {
            z2 = true;
        }
        T4(z2, z3);
    }

    private final void setupVideo(p3x0 p3x0Var) {
        gzs<Boolean> a2;
        this.I = p3x0Var;
        this.z.setText(p3x0Var.c);
        long j = p3x0Var.g;
        String h = his0.h(j, getContext());
        TextView textView = this.A;
        textView.setText(h);
        Slider slider = this.y;
        if (j < 0) {
            textView.setBackgroundResource(R.drawable.voip_bg_live_badge);
            textView.setAlpha(1.0f);
            com.vk.typography.b.k(textView, FontFamily.DISPLAY_BOLD, Float.valueOf(9.0f), 4);
            textView.setPadding(cn70.b(3), cn70.b(2), cn70.b(3), cn70.b(2));
            slider.setValueTo(100.0f);
            slider.setValueFrom(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            slider.setValue(slider.getValueTo());
            Context context = slider.getContext();
            e3m.a aVar = e3m.a;
            slider.setTrackInactiveTintList(ColorStateList.valueOf(context.getColor(R.color.vk_red_nice)));
            slider.setTrackActiveTintList(slider.getTrackInactiveTintList());
        } else {
            textView.setBackground(null);
            com.vk.typography.b.k(textView, FontFamily.REGULAR, Float.valueOf(15.0f), 4);
            textView.setAlpha(0.6f);
            textView.setPadding(0, 0, 0, 0);
            this.B.setText(his0.h(0L, slider.getContext()));
            slider.setValueTo(Math.max(j, 1L));
            slider.setValueFrom(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Context context2 = slider.getContext();
            e3m.a aVar2 = e3m.a;
            slider.setTrackActiveTintList(ColorStateList.valueOf(context2.getColor(R.color.vk_blue_300)));
            slider.setTrackInactiveTintList(ColorStateList.valueOf(slider.getContext().getColor(R.color.vk_white_alpha12)));
        }
        setViewsVisible(true);
        jcx0 jcx0Var = this.u;
        setVisibility((jcx0Var == null || (a2 = jcx0Var.a()) == null) ? false : a2.invoke().booleanValue() ? 0 : 8);
    }

    public final void Q4(icx0 icx0Var, jcx0 jcx0Var) {
        p3x0 b;
        this.t = icx0Var;
        if (isAttachedToWindow()) {
            icx0 icx0Var2 = this.t;
            if (icx0Var2 != null && (b = icx0Var2.b()) != null) {
                setupVideo(b);
            }
            icx0 icx0Var3 = this.t;
            if (icx0Var3 != null) {
                icx0Var3.h(this);
            }
        }
        this.u = jcx0Var;
    }

    public final void T4(boolean z, boolean z2) {
        boolean z3 = false;
        this.x.setVisibility(z ? 0 : 8);
        b bVar = this.G;
        bVar.i(this);
        boolean z4 = z && !z2;
        Slider slider = this.y;
        slider.setEnabled(z4);
        if (z4) {
            slider.setThumbRadius(cn70.b(8));
            slider.setHaloRadius(cn70.b(24));
        } else {
            slider.setThumbRadius(0);
            slider.setHaloRadius(0);
        }
        if (this.B.getVisibility() != 0 && z) {
            z3 = true;
        }
        bVar.D(slider.getId(), 6, z3 ? -cn70.b(16) : cn70.b(4));
        bVar.b(this);
    }

    @Override // xsna.icx0.a
    public final void a3(LinkedHashMap linkedHashMap) {
        if (linkedHashMap.isEmpty()) {
            return;
        }
        zsw0 zsw0Var = (zsw0) j5g.X(linkedHashMap.values());
        p3x0 p3x0Var = zsw0Var.e;
        long j = zsw0Var.d;
        if (p3x0Var != null) {
            long j2 = p3x0Var.a;
            p3x0 p3x0Var2 = this.I;
            hl80 hl80Var = p3x0Var2 != null ? new hl80(p3x0Var2.a) : null;
            if (hl80Var == null || j2 != hl80Var.a) {
                setupVideo(p3x0Var);
            }
        }
        p3x0 p3x0Var3 = this.I;
        boolean z = p3x0Var3 != null && p3x0Var3.g < 0;
        if (!z) {
            this.B.setText(bkt0.a(j));
        }
        float f = zsw0Var.c;
        float f2 = j;
        Slider slider = this.y;
        boolean z2 = f2 >= slider.getValueFrom() && f2 <= slider.getValueTo();
        if (!this.J && !z && z2) {
            slider.setValue(f2);
        }
        boolean canControlVideo = getCanControlVideo();
        T4(canControlVideo && this.C.getVisibility() == 0, z);
        if (canControlVideo) {
            this.v.setImageResource(zsw0Var.b ? R.drawable.vk_icon_pause_16 : R.drawable.vk_icon_play_16);
            setAccessibility(zsw0Var);
            int i = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? R.drawable.vk_icon_mute_outline_28 : R.drawable.vk_icon_volume_outline_28;
            this.w.setImageResource(i);
            this.E.setImageResource(i);
            if (this.J) {
                return;
            }
            this.D.setValue(f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        p3x0 b;
        super.onAttachedToWindow();
        icx0 icx0Var = this.t;
        if (icx0Var != null && (b = icx0Var.b()) != null) {
            setupVideo(b);
        }
        icx0 icx0Var2 = this.t;
        if (icx0Var2 != null) {
            icx0Var2.h(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.voip_play_button) {
            icx0 icx0Var = this.t;
            if (icx0Var != null) {
                icx0Var.g();
                return;
            }
            return;
        }
        xq3 xq3Var = this.H;
        Slider slider = this.D;
        if (id == R.id.voip_movie_sound_control) {
            slider.removeCallbacks(xq3Var);
            setViewsVisible(!(this.C.getVisibility() == 0));
        } else if (id == R.id.voip_movie_sound_control_icon) {
            icx0 icx0Var2 = this.t;
            if (icx0Var2 != null) {
                icx0Var2.mute(slider.getValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            slider.postDelayed(xq3Var, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        icx0 icx0Var = this.t;
        if (icx0Var != null) {
            icx0Var.e(this);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != 0) {
            this.H.run();
        }
        super.setVisibility(i);
    }
}
