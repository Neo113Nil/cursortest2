package com.vk.stories.design.view.editor;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.core.view.components.context.menu.e;
import com.vk.storycamera.builder.StoryEditorCameraParams;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.d;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bek0;
import xsna.bwt0;
import xsna.cn70;
import xsna.d3m;
import xsna.d4l0;
import xsna.d50;
import xsna.e43;
import xsna.eqy;
import xsna.krv0;
import xsna.n930;
import xsna.o930;
import xsna.rl3;
import xsna.tam0;
import xsna.u76;
import xsna.y8g0;
import xsna.z4p;

/* compiled from: SideControlPanelView.kt */
/* loaded from: classes6.dex */
public final class SideControlPanelView extends FrameLayout implements z4p {
    public final boolean b;
    public final ViewGroup c;
    public final View d;
    public final VkToolButton e;
    public final VkToolButton f;
    public final View g;
    public final VkToolButton h;
    public final VkToolButton i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final View p;
    public final ViewGroup q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public u76 u;
    public d4l0 v;

    public SideControlPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.layout_story_editor_side_panel, this);
        StoriesFeatures storiesFeatures = StoriesFeatures.VERTICALIZATION;
        storiesFeatures.getClass();
        this.b = b.A.a(storiesFeatures);
        this.c = (ViewGroup) findViewById(R.id.fl_end_buttons_panel);
        this.d = findViewById(R.id.iv_text);
        this.e = (VkToolButton) findViewById(R.id.iv_stickers);
        this.f = (VkToolButton) findViewById(R.id.iv_background);
        this.g = findViewById(R.id.iv_music);
        this.h = (VkToolButton) findViewById(R.id.iv_more);
        this.i = (VkToolButton) findViewById(R.id.iv_mute);
        this.j = true;
        this.k = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = true;
        this.p = findViewById(R.id.story_editor_dark_fog);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.story_editor_controls_tips_layout);
        this.q = viewGroup;
        this.r = (TextView) viewGroup.findViewById(R.id.story_background_control_tip);
        this.s = (TextView) viewGroup.findViewById(R.id.story_music_control_tip);
        this.t = (TextView) viewGroup.findViewById(R.id.story_editor_controls_tip_sound);
    }

    private final void setConfigAllowsBackgroundChange(boolean z) {
        this.j = z;
        boolean z2 = false;
        bwt0.p0(this.f, z && this.k);
        if (z && this.k) {
            z2 = true;
        }
        bwt0.p0(this.r, z2);
    }

    private final void setStoryDataAllowsBackgroundChange(boolean z) {
        this.k = z;
        boolean z2 = false;
        bwt0.p0(this.f, z && this.j);
        if (z && this.j) {
            z2 = true;
        }
        bwt0.p0(this.r, z2);
    }

    @Override // xsna.z4p
    public final void a(final long j) {
        ViewPropertyAnimator c;
        eqy<bek0> eqyVar = d.a;
        if (b.A.a(Features.Type.FEATURE_STORY_EDITOR_CONTROLS_TIPS)) {
            Preference.F(Preference.m(0L, "story_controls_tips_pref", "story_editor_tips_seen_times") + 1, "story_controls_tips_pref", "story_editor_tips_seen_times");
            final ViewGroup viewGroup = this.q;
            final View view = this.p;
            c = d3m.c(viewGroup, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 200L, (r15 & 4) != 0 ? null : new Runnable() { // from class: xsna.q0m0
                @Override // java.lang.Runnable
                public final void run() {
                    ViewPropertyAnimator e;
                    eqy<bek0> eqyVar2 = com.vk.toggle.d.a;
                    if (com.vk.toggle.b.A.a(Features.Type.FEATURE_STORY_EDITOR_CONTROLS_TIPS)) {
                        ViewGroup viewGroup2 = viewGroup;
                        long j2 = j;
                        e = d3m.e(viewGroup2, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : j2, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                        if (e != null) {
                            e.translationX(y8g0.b(R.dimen.camera_controls_tips_shift));
                        }
                        d3m.e(view, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : j2, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                    }
                }
            }, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (c != null) {
                c.translationX(-y8g0.b(R.dimen.camera_controls_tips_shift));
            }
            d3m.c(view, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 200L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a3, code lost:
    
        if (r6 != null) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.vk.core.view.components.context.menu.VkContextMenu] */
    @Override // xsna.z4p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        n930.i iVar;
        StoryEditorCameraParams A0;
        StoryEditorCameraParams.State state;
        StoryEditorCameraParams.ButtonsConfig buttonsConfig;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        o930 o930Var = new o930(new d50(25, this, ref$ObjectRef));
        u76 u76Var = this.u;
        boolean z = u76Var != null && u76Var.N6();
        u76 u76Var2 = this.u;
        boolean z2 = (u76Var2 == null || (A0 = u76Var2.A0()) == null || (state = A0.k) == null || (buttonsConfig = state.h) == null || !buttonsConfig.m) ? false : true;
        n930.b bVar = this.l ? n930.b.c : null;
        n930.n nVar = n930.n.c;
        boolean z3 = this.b;
        if (!z3) {
            nVar = null;
        }
        n930.h hVar = this.n ? n930.h.c : null;
        u76 u76Var3 = this.u;
        n930.e D2 = u76Var3 != null ? u76Var3.D2() : null;
        if (z2) {
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_STORY_LIFETIME_SAVE;
            storiesFeatures.getClass();
            b bVar2 = b.A;
            if (bVar2.a(storiesFeatures)) {
                u76 u76Var4 = this.u;
                if (u76Var4 != null) {
                    iVar = u76Var4.Y6();
                }
            } else {
                StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_STORY_LIFETIME_48;
                storiesFeatures2.getClass();
                boolean a = bVar2.a(storiesFeatures2);
                n930.l lVar = n930.l.d;
                if (!a) {
                    StoriesFeatures storiesFeatures3 = StoriesFeatures.ST_STORY_LIFETIME_COMM_48;
                    storiesFeatures3.getClass();
                    if (!bVar2.a(storiesFeatures3)) {
                        u76 u76Var5 = this.u;
                        if (u76Var5 != null && u76Var5.G2() == 1) {
                            u76 u76Var6 = this.u;
                            if (u76Var6 != null) {
                                iVar = u76Var6.Y6();
                            }
                            iVar = lVar;
                        }
                    }
                }
                u76 u76Var7 = this.u;
                if (u76Var7 == null || (iVar = u76Var7.Y6()) == null) {
                    u76 u76Var8 = this.u;
                    if (u76Var8 != null && u76Var8.G2() == 1) {
                        iVar = n930.m.d;
                    }
                    iVar = lVar;
                }
            }
            n930 n930Var = this.o ? null : z ? n930.a.c : n930.c.c;
            n930.d dVar = this.m ? n930.d.c : null;
            o930Var.setItems(!z3 ? rl3.I(new n930[]{bVar, nVar, iVar, hVar, D2, n930Var, dVar}) : rl3.I(new n930[]{bVar, iVar, dVar, hVar, D2, n930Var}));
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            VkToolButton vkToolButton = this.h;
            vkToolButton.getContext();
            e.b bVar3 = new e.b(vkToolButton, null, null, l, 6);
            bVar3.w = R.layout.ds_internal_context_menu_item;
            bVar3.e = getContext();
            bVar3.l = o930Var;
            bVar3.m = cn70.b(7);
            ?? a2 = bVar3.a();
            a2.j(false);
            ref$ObjectRef.element = a2;
        }
        iVar = null;
        if (this.o) {
        }
        if (this.m) {
        }
        o930Var.setItems(!z3 ? rl3.I(new n930[]{bVar, nVar, iVar, hVar, D2, n930Var, dVar}) : rl3.I(new n930[]{bVar, iVar, dVar, hVar, D2, n930Var}));
        int l2 = krv0.l(R.attr.vk_ui_icon_accent);
        VkToolButton vkToolButton2 = this.h;
        vkToolButton2.getContext();
        e.b bVar32 = new e.b(vkToolButton2, null, null, l2, 6);
        bVar32.w = R.layout.ds_internal_context_menu_item;
        bVar32.e = getContext();
        bVar32.l = o930Var;
        bVar32.m = cn70.b(7);
        ?? a22 = bVar32.a();
        a22.j(false);
        ref$ObjectRef.element = a22;
    }

    @Override // xsna.z4p
    public View getAddStickerButtonView() {
        return this.e;
    }

    public Rect getBackgroundButtonRect() {
        return bwt0.F(this.f);
    }

    public final ViewGroup getEndButtonsPanel() {
        return this.c;
    }

    @Override // xsna.z4p
    public Rect getMoreButtonRect() {
        return bwt0.C(this.h);
    }

    @Override // xsna.z4p
    public View getMoreButtonView() {
        return this.h;
    }

    @Override // xsna.z4p
    public View getMusicButtonView() {
        return this.g;
    }

    @Override // xsna.z4p
    public View getMuteButton() {
        return this.i;
    }

    @Override // xsna.z4p
    public void setAdMarkVisible(boolean z) {
        this.o = z;
    }

    @Override // xsna.z4p
    public void setBackgroundButton(tam0 tam0Var) {
        setStoryDataAllowsBackgroundChange(tam0Var.m);
    }

    @Override // xsna.z4p
    public void setBackgroundSelectionAvailable(boolean z) {
        setConfigAllowsBackgroundChange(z);
    }

    @Override // xsna.z4p
    public void setDrawingVisible(boolean z) {
        this.l = z;
    }

    public void setEditorViewsEnabled(boolean z) {
        Iterator it = e43.l(this.d, this.e, this.f, this.g, this.h, this.i).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(z);
        }
    }

    @Override // xsna.z4p
    public void setMusicButtonVisible(boolean z) {
        bwt0.p0(this.g, z);
        bwt0.p0(this.s, z);
    }

    @Override // xsna.z4p
    public void setMuteBtnImage(boolean z) {
        int i;
        int i2;
        int i3;
        if (z) {
            i = R.drawable.vk_icon_mute_outline_28;
            i2 = R.string.story_accessibility_unmute;
            i3 = R.string.story_turn_on_sound;
        } else {
            i = R.drawable.vk_icon_volume_outline_28;
            i2 = R.string.story_accessibility_mute;
            i3 = R.string.story_turn_off_sound;
        }
        String string = getContext().getString(i2);
        VkToolButton vkToolButton = this.i;
        vkToolButton.setContentDescription(string);
        VkToolButton.c(vkToolButton, Integer.valueOf(i));
        this.t.setText(i3);
    }

    @Override // xsna.z4p
    public void setMuteButtonVisible(boolean z) {
        bwt0.p0(this.i, z);
        bwt0.p0(this.t, z);
    }

    @Override // xsna.z4p
    public void setNewFrameVisible(boolean z) {
        this.m = z;
    }

    public final void setPresenter(u76 u76Var) {
        this.u = u76Var;
    }

    @Override // xsna.z4p
    public void setSaveToDeviceVisible(boolean z) {
        this.n = z;
    }

    public final void setStickerListener(d4l0 d4l0Var) {
        this.v = d4l0Var;
    }

    @Override // xsna.z4p
    public void setStickersSelectionVisible(boolean z) {
        bwt0.p0(this.e, z);
    }

    @Override // xsna.z4p
    public void setTextStickerVisible(boolean z) {
        bwt0.p0(this.d, z);
    }
}
