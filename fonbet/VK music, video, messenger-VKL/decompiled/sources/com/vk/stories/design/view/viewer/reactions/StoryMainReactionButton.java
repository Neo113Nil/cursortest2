package com.vk.stories.design.view.viewer.reactions;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.provider.Settings;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.rlottie.RLottieDrawable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.dhr0;
import xsna.ez3;
import xsna.iah0;
import xsna.lhg;
import xsna.x5m0;
import xsna.y0f0;
import xsna.zrp;

/* compiled from: StoryMainReactionButton.kt */
/* loaded from: classes6.dex */
public final class StoryMainReactionButton extends View {
    public static final int f = iah0.a(180);
    public static final int g = iah0.a(32);
    public final Drawable b;
    public RLottieDrawable c;
    public State d;
    public y0f0 e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoryMainReactionButton.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DEFAULT;
        public static final State HIDDEN;
        public static final State REACTION;

        static {
            State state = new State("DEFAULT", 0);
            DEFAULT = state;
            State state2 = new State("HIDDEN", 1);
            HIDDEN = state2;
            State state3 = new State("REACTION", 2);
            REACTION = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: StoryMainReactionButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.REACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StoryMainReactionButton(Context context) {
        super(context, null, 0);
        this.b = context.getDrawable(R.drawable.vk_icon_like_outline_shadow_medium_48).mutate();
        this.d = State.DEFAULT;
        int Y = dhr0.Y(R.attr.vk_ui_separator_primary_alpha, getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1);
        setForeground(new RippleDrawable(ColorStateList.valueOf(Y), null, gradientDrawable));
        setClickable(true);
        setFocusable(true);
    }

    private final boolean getAnimationEnabled() {
        return !(Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void a() {
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            rLottieDrawable.k();
        }
        RLottieDrawable rLottieDrawable2 = this.c;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.setCallback(null);
        }
        this.c = null;
    }

    public final void b(y0f0 y0f0Var, boolean z) {
        int i = y0f0Var.a;
        this.d = State.REACTION;
        this.e = y0f0Var;
        setContentDescription(getContext().getString(R.string.story_reactions_remove_reaction_accessibility));
        animate().cancel();
        setAlpha(1.0f);
        a();
        boolean z2 = z && getAnimationEnabled();
        int i2 = z2 ? f : g;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(z2 ? y0f0Var.d : y0f0Var.c, lhg.a(i, z2 ? "main_" : "menu_"), i2, i2, null, false, false, null, 496);
        ez3 ez3Var = rLottieDrawable.k;
        ez3Var.q = 1;
        ez3Var.t = new x5m0(rLottieDrawable);
        this.c = rLottieDrawable;
        rLottieDrawable.setCallback(this);
        rLottieDrawable.setBounds(0, 0, i2, i2);
        if (z2) {
            rLottieDrawable.j();
        } else {
            rLottieDrawable.i();
        }
        invalidate();
    }

    public final y0f0 getCurrentReactionItem() {
        return this.e;
    }

    public final State getCurrentState() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = a.$EnumSwitchMapping$0[this.d.ordinal()];
        if (i == 1) {
            int width = getWidth();
            int height = getHeight();
            Drawable drawable = this.b;
            drawable.setBounds(0, 0, width, height);
            drawable.draw(canvas);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            float f2 = -((rLottieDrawable.getBounds().width() - getWidth()) / 2.0f);
            int save = canvas.save();
            canvas.translate(f2, f2);
            try {
                rLottieDrawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c || drawable == this.b;
    }
}
