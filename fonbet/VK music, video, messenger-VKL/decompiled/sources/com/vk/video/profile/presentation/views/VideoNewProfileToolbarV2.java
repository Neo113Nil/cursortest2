package com.vk.video.profile.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.asp;
import xsna.blk;
import xsna.bwt0;
import xsna.fnj;
import xsna.iah0;
import xsna.izs;
import xsna.nr2;
import xsna.s3q0;
import xsna.xwk;
import xsna.zrp;

/* compiled from: VideoNewProfileToolbarV2.kt */
/* loaded from: classes6.dex */
public final class VideoNewProfileToolbarV2 extends FrameLayout {
    public static final /* synthetic */ int m = 0;
    public final MotionLayout b;
    public final ToolbarButton c;
    public final AppCompatTextView d;
    public final ToolbarButton e;
    public final ToolbarButton f;
    public final ToolbarButton g;
    public final ToolbarButton h;
    public final VkSearchView i;
    public float j;
    public boolean k;
    public izs<? super Float, s3q0> l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoNewProfileToolbarV2.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Default;
        public static final State Error;
        public static final State Searchable;
        private final int transitionId;

        static {
            State state = new State("Default", 0, R.id.video_profile_appbar_transition_default);
            Default = state;
            State state2 = new State("Searchable", 1, R.id.video_profile_appbar_transition_default_search);
            Searchable = state2;
            State state3 = new State("Error", 2, R.id.video_profile_appbar_transition_error);
            Error = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State(String str, int i, int i2) {
            this.transitionId = i2;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final int h() {
            return this.transitionId;
        }
    }

    public VideoNewProfileToolbarV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        HashSet hashSet = iah0.a;
        View.inflate(context, (fnj.d(context) ? nr2.d : blk.d).t(), this);
        this.b = (MotionLayout) findViewById(R.id.video_profile_v2_appbar_motion_layout);
        ToolbarButton toolbarButton = (ToolbarButton) findViewById(R.id.video_profile_toolbar_v2_navigation_icon);
        this.c = toolbarButton;
        this.d = (AppCompatTextView) findViewById(R.id.video_profile_toolbar_v2_title);
        ToolbarButton toolbarButton2 = (ToolbarButton) findViewById(R.id.video_profile_toolbar_v2_share);
        this.e = toolbarButton2;
        ToolbarButton toolbarButton3 = (ToolbarButton) findViewById(R.id.video_profile_toolbar_v2_search);
        this.f = toolbarButton3;
        ToolbarButton toolbarButton4 = (ToolbarButton) findViewById(R.id.video_profile_toolbar_v2_more);
        this.g = toolbarButton4;
        ToolbarButton toolbarButton5 = (ToolbarButton) findViewById(R.id.video_profile_toolbar_v2_settings);
        this.h = toolbarButton5;
        VkSearchView vkSearchView = (VkSearchView) findViewById(R.id.video_profile_toolbar_v2_search_view);
        this.i = vkSearchView;
        vkSearchView.X4(false);
        vkSearchView.setVoiceInputEnabled(false);
        toolbarButton.setContentDescription(getContext().getString(R.string.video_profile_talkback_navigation_button));
        toolbarButton2.setContentDescription(getContext().getString(R.string.video_profile_talkback_share_button));
        toolbarButton3.setContentDescription(getContext().getString(R.string.search));
        toolbarButton4.setContentDescription(getContext().getString(R.string.video_profile_talkback_more_button));
        toolbarButton5.setContentDescription(getContext().getString(R.string.video_profile_talkback_settings_button));
    }

    public final izs<Float, s3q0> getListener() {
        return this.l;
    }

    @Keep
    public final float getProgress() {
        return this.j;
    }

    public final void setListener(izs<? super Float, s3q0> izsVar) {
        this.l = izsVar;
    }

    public final void setMoreVisibility(boolean z) {
        bwt0.p0(this.g, z);
    }

    public final void setNavigationButtonVisibility(boolean z) {
        bwt0.p0(this.c, z);
    }

    @Keep
    public final void setProgress(float f) {
        this.j = f;
        float a = xwk.a(f * 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.b.setProgress(a);
        izs<? super Float, s3q0> izsVar = this.l;
        if (izsVar != null) {
            izsVar.invoke(Float.valueOf(a));
        }
    }

    public final void setSearchButtonVisibility(boolean z) {
        bwt0.p0(this.f, this.k && z);
    }

    public final void setSearchEnabled(boolean z) {
        this.k = z;
        VkSearchView vkSearchView = this.i;
        ToolbarButton toolbarButton = this.f;
        ToolbarButton toolbarButton2 = this.e;
        if (z) {
            bwt0.p0(toolbarButton2, false);
            bwt0.p0(toolbarButton, true);
            bwt0.p0(vkSearchView, false);
        } else {
            bwt0.p0(toolbarButton, false);
            bwt0.p0(vkSearchView, false);
            bwt0.p0(toolbarButton2, true);
        }
    }

    public final void setSearchViewVisibility(boolean z) {
        bwt0.p0(this.i, this.k && z);
    }

    public final void setSettingsVisibility(boolean z) {
        bwt0.p0(this.h, z);
    }

    public final void setShareVisibility(boolean z) {
        bwt0.p0(this.e, !this.k && z);
    }

    public final void setState(State state) {
        int h = state.h();
        MotionLayout motionLayout = this.b;
        motionLayout.setTransition(h);
        motionLayout.Z4(motionLayout.t.h(state.h()).d).b(motionLayout);
        motionLayout.B0.e(motionLayout.t.b(motionLayout.x), motionLayout.t.b(motionLayout.z));
        motionLayout.e5();
    }

    public final void setTitle(String str) {
        this.d.setText(str);
    }
}
