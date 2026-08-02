package com.vk.clips.design.view.camera.controls;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.divider.VkDivider;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.music.Thumb;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.an9;
import xsna.bn10;
import xsna.bwt0;
import xsna.dhr0;
import xsna.dod;
import xsna.e3m;
import xsna.e43;
import xsna.f4m;
import xsna.gm9;
import xsna.ip;
import xsna.izs;
import xsna.lmv;
import xsna.m33;
import xsna.msy;
import xsna.n23;
import xsna.y8g0;

/* compiled from: ClipsControlsView.kt */
/* loaded from: classes.dex */
public final class ClipsControlsView extends ConstraintLayout implements lmv {
    public static final /* synthetic */ int P = 0;
    public final VkText A;
    public final ViewGroup B;
    public final Flow C;
    public final View D;
    public final ViewGroup E;
    public final ViewGroup F;
    public final VkText G;
    public final ImageView H;
    public final VkImage I;
    public final Object J;
    public final View K;
    public final ImageView L;
    public final ImageView M;
    public final ProgressBar N;
    public final View O;
    public a t;
    public gm9 u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final View[] y;
    public final View z;

    /* compiled from: ClipsControlsView.kt */
    /* loaded from: classes16.dex */
    public interface a {
        void c(float f);

        void d(boolean z);

        Boolean e();

        void f();

        void g();

        void h(boolean z);

        StoryCameraTarget i();

        void j();

        void k();

        void l();

        boolean m();

        void n();

        void o(boolean z);
    }

    public ClipsControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.w = true;
        this.x = true;
        this.J = msy.a(LazyThreadSafetyMode.NONE, new ip(this, 3));
        View.inflate(context, R.layout.camera_stub_tooltips, this);
        this.y = bn10.e((androidx.constraintlayout.widget.a) findViewById(R.id.camera_clips_tooltips_group));
        this.z = findViewById(R.id.camera_clips_controls_tip_speed);
        VkText vkText = (VkText) findViewById(R.id.camera_clips_controls_tip_gesture);
        vkText.setText(context.getText(R.string.clips_gesture_tip));
        this.A = vkText;
        this.G = (VkText) findViewById(R.id.camera_clips_drafts_counter);
        this.C = (Flow) findViewById(R.id.camera_clips_speed_flow);
        this.L = (ImageView) findViewById(R.id.clips_duet_mic_btn);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.camera_clips_speed_btn);
        viewGroup.setContentDescription(context.getString(R.string.clips_speed_title));
        this.B = viewGroup;
        viewGroup.setVisibility(0);
        this.D = findViewById(R.id.camera_clips_templates_btn);
        VkDivider vkDivider = (VkDivider) findViewById(R.id.camera_clips_controls_divider);
        dhr0.a.getClass();
        vkDivider.setBackgroundColor(e3m.f(R.attr.vk_ui_separator_primary3x, dhr0.y()));
        this.E = (ViewGroup) findViewById(R.id.camera_drafts_addon);
        this.F = (ViewGroup) findViewById(R.id.camera_clips_drafts_btn);
        ImageView imageView = (ImageView) findViewById(R.id.camera_clips_timer_btn);
        imageView.setContentDescription(context.getString(R.string.clips_timer_dialog_title));
        this.H = imageView;
        this.M = (ImageView) findViewById(R.id.camera_clips_gesture_btn);
        this.N = (ProgressBar) findViewById(R.id.camera_clips_gesture_progress);
        this.O = findViewById(R.id.dynamic_lib_popup_anchor);
        View findViewById = findViewById(R.id.camera_clips_buttons_flow);
        this.K = findViewById;
        ((ConstraintLayout.b) findViewById.getLayoutParams()).l = 0;
        VkImage vkImage = (VkImage) findViewById(R.id.camera_clips_music_btn);
        vkImage.setCornerRadius(y8g0.b(R.dimen.camera_music_button_corner_radius));
        vkImage.setContentDescription(getResources().getString(R.string.camera_music));
        this.I = vkImage;
    }

    public static void Q4(View view, boolean z) {
        if (view != null) {
            view.setClickable(z);
        }
        if (view != null) {
            view.setEnabled(z);
        }
        if (view != null) {
            view.setAlpha(z ? 1.0f : 0.6f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getClipsMusicBg() {
        return (VkImageSimple) this.J.getValue();
    }

    private final void setMusicThumbImage(String str) {
        if (str == null || str.length() == 0) {
            setThumbDrawable(R.drawable.bg_default_thumb_music);
            return;
        }
        int a2 = y8g0.a(R.dimen.camera_icon_size);
        int a3 = y8g0.a(R.dimen.camera_music_thumb_margin);
        VkImage vkImage = this.I;
        bwt0.m0(a2, a2, vkImage);
        vkImage.setPadding(a3, a3, a3, a3);
        vkImage.o0(str, null);
    }

    private final void setThumbDrawable(int i) {
        VkImage vkImage = this.I;
        Drawable drawable = vkImage.getContext().getDrawable(i);
        int a2 = e3m.a(R.dimen.camera_icon_size, vkImage.getContext());
        vkImage.setImageDrawable(drawable);
        bwt0.m0(a2, a2, vkImage);
        bwt0.e0(vkImage, 0, 0, 0, 0);
        f4m.j(getClipsMusicBg());
    }

    @Override // xsna.lmv
    public final void B1() {
        setThumbDrawable(R.drawable.vk_icon_music_outline_shadow_large_48);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0025  */
    @Override // xsna.lmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B3(boolean z) {
        boolean z2;
        gm9 gm9Var;
        an9 state;
        a aVar;
        if (z && (aVar = this.t) != null && aVar.m()) {
            a aVar2 = this.t;
            if ((aVar2 != null ? aVar2.i() : null) != StoryCameraTarget.CLIP_FRAGMENT) {
                z2 = true;
                this.E.setVisibility(!z2 ? 0 : 8);
                this.F.setVisibility(!z2 ? 0 : 8);
                findViewById(R.id.camera_clips_controls_tip_drafts).setVisibility((z2 || (gm9Var = this.u) == null || (state = gm9Var.getState()) == null || !state.c()) ? 8 : 0);
            }
        }
        z2 = false;
        this.E.setVisibility(!z2 ? 0 : 8);
        this.F.setVisibility(!z2 ? 0 : 8);
        findViewById(R.id.camera_clips_controls_tip_drafts).setVisibility((z2 || (gm9Var = this.u) == null || (state = gm9Var.getState()) == null || !state.c()) ? 8 : 0);
    }

    public final void P4() {
        View[] viewArr = this.y;
        int length = viewArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (f4m.h(viewArr[i])) {
                this.z.setVisibility(0);
                break;
            }
            i++;
        }
        a aVar = this.t;
        if (aVar != null) {
            aVar.d(false);
        }
    }

    @Override // xsna.lmv
    public final void S0(int i) {
        VkText vkText = this.G;
        if (i <= 0) {
            vkText.setVisibility(8);
        } else {
            vkText.setText(String.valueOf(i));
            vkText.setVisibility(0);
        }
    }

    @Override // xsna.lmv
    public final void W(izs izsVar, boolean z) {
        dod.a(this.y, new com.vk.im.engine.commands.messages.a(11, this, izsVar), 0L);
        if (z) {
            this.v = false;
        }
    }

    @Override // xsna.lmv
    public final void Y0(boolean z, boolean z2) {
        View view = this.D;
        if (!z2 || z) {
            Q4(view, z);
        } else {
            view.setAlpha(0.6f);
        }
    }

    @Override // xsna.lmv
    public final void Z0() {
        VkImage vkImage = this.I;
        Drawable drawable = vkImage.getContext().getDrawable(R.drawable.vk_icon_video_arrow_square_outline_shadow_medium_48);
        int a2 = e3m.a(R.dimen.camera_icon_size, vkImage.getContext());
        vkImage.setImageDrawable(drawable);
        bwt0.m0(a2, a2, vkImage);
        getClipsMusicBg().setVisibility(0);
    }

    public final gm9 getCameraUiPositions() {
        return this.u;
    }

    public final boolean getClipsControlsTipsShown() {
        return this.v;
    }

    @Override // xsna.lmv
    public float getClipsCurrentSpeed() {
        Object tag = this.B.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str != null) {
            return Float.parseFloat(str);
        }
        return 1.0f;
    }

    public final View getClipsGestureAnchor() {
        return this.O;
    }

    public final ProgressBar getClipsGestureProgress() {
        return this.N;
    }

    public final ImageView getClipsGestureRecControl() {
        return this.M;
    }

    public final a getControlCallbacks() {
        return this.t;
    }

    public final boolean getDuetMic() {
        return this.x;
    }

    public final boolean getGesturedControl() {
        return this.w;
    }

    @Override // xsna.lmv
    public final void q0(boolean z, boolean z2) {
        VkImage vkImage = this.I;
        if (!z2 || z) {
            Q4(vkImage, z);
        } else {
            vkImage.setAlpha(0.6f);
        }
    }

    public final void setCameraUiPositions(gm9 gm9Var) {
        this.u = gm9Var;
    }

    public final void setClipsSpeedbtnAttributes(float f) {
        String valueOf;
        ViewGroup viewGroup = this.B;
        ((ImageView) viewGroup.findViewById(R.id.camera_clips_speed_btn_image)).setImageResource(1.0f == f ? R.drawable.vk_icon_circle_outline_shadow_large_48 : R.drawable.vk_icon_deprecated_ic_editor_speed_circle_shadow_48);
        VkText vkText = (VkText) viewGroup.findViewById(R.id.camera_clips_speed_btn_text);
        if (f == 1.0f || f == 2.0f || f == 3.0f) {
            vkText.setTextSize(2, 12.0f);
        } else {
            vkText.setTextSize(2, 10.0f);
        }
        vkText.setTextColor(1.0f == f ? -1 : -16777216);
        viewGroup.setTag(String.valueOf(f));
        if (f == 0.3f) {
            valueOf = getContext().getString(R.string.clips_speed_0_3);
        } else if (f == 0.5f) {
            valueOf = getContext().getString(R.string.clips_speed_0_5);
        } else if (f == 1.0f) {
            valueOf = getContext().getString(R.string.clips_speed_1);
        } else if (f == 2.0f) {
            valueOf = getContext().getString(R.string.clips_speed_2);
        } else if (f == 3.0f) {
            valueOf = getContext().getString(R.string.clips_speed_3);
        } else {
            com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException(n23.a(f, "invalid speed: ")));
            valueOf = String.valueOf(f);
        }
        vkText.setText(valueOf);
    }

    public final void setControlCallbacks(a aVar) {
        this.t = aVar;
    }

    @Override // xsna.lmv
    public void setCountDownIcon(int i) {
        this.H.setImageResource(i != 3 ? i != 10 ? R.drawable.vk_icon_timer_outline_shadow_large_48 : R.drawable.vk_icon_timer_10_outline_shadow_large_48 : R.drawable.vk_icon_timer_3_outline_shadow_large_48);
    }

    public void setDuetMicButtonIcon(int i) {
        this.L.setImageDrawable(m33.a(this.x ? R.drawable.vk_icon_microphone_outline_shadow_large_48 : R.drawable.vk_icon_microphone_slash_outline_shadow_large_48, e43.a));
    }

    @Override // xsna.lmv
    public void setMusicThumb(Thumb thumb) {
        setMusicThumbImage(thumb != null ? thumb.Ab(y8g0.a(R.dimen.camera_music_thumb_size), false) : null);
        f4m.j(getClipsMusicBg());
    }

    public final void setSpeedButtonEnabled(boolean z) {
        Q4(this.B, z);
    }

    @Override // xsna.lmv
    public void setTimerButtonEnabled(boolean z) {
        Q4(this.H, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r5.c() == true) goto L16;
     */
    @Override // xsna.lmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u1(boolean z) {
        boolean z2;
        gm9 gm9Var;
        this.D.setVisibility(z ? 0 : 8);
        View findViewById = findViewById(R.id.camera_clips_controls_tip_templates);
        if (z && (gm9Var = this.u) != null && (r5 = gm9Var.getState()) != null) {
            z2 = true;
        }
        z2 = false;
        findViewById.setVisibility(z2 ? 0 : 8);
    }

    @Override // xsna.lmv
    public final void x2(boolean z) {
        this.w = z;
        this.M.setImageDrawable(m33.a(z ? R.drawable.vk_icon_gesture_outline_shadow_large_48 : R.drawable.vk_icon_gesture_off_outline_shadow_large_48, e43.a));
    }
}
