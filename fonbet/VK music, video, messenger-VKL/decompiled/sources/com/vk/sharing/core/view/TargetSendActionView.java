package com.vk.sharing.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.sharing.core.cancellation.TargetSharingTask;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a4o0;
import xsna.anj;
import xsna.asp;
import xsna.b4o0;
import xsna.dbg0;
import xsna.dhr0;
import xsna.e3m;
import xsna.icj0;
import xsna.jk9;
import xsna.luj0;
import xsna.pg2;
import xsna.pq9;
import xsna.uko;
import xsna.zrp;

/* compiled from: TargetSendActionView.kt */
/* loaded from: classes5.dex */
public final class TargetSendActionView extends AppCompatTextView {
    public static final /* synthetic */ int j = 0;
    public State b;
    public final Drawable c;
    public final Drawable d;
    public final ColorStateList e;
    public ColorStateList f;
    public final pg2 g;
    public boolean h;
    public b4o0 i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TargetSendActionView.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State CANCEL;
        public static final State OPEN;
        public static final State SEND;

        static {
            State state = new State("SEND", 0);
            SEND = state;
            State state2 = new State("CANCEL", 1);
            CANCEL = state2;
            State state3 = new State("OPEN", 2);
            OPEN = state3;
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

    /* compiled from: TargetSendActionView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TargetSendActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Pair pair;
        this.b = State.SEND;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = dbg0.a;
        this.c = resources.getDrawable(R.drawable.vkui_bg_button_primary, theme);
        this.d = context.getResources().getDrawable(R.drawable.vkui_bg_button_secondary, context.getTheme());
        this.e = anj.b(R.color.vk_primary_button_text, context);
        this.f = anj.b(R.color.vk_secondary_button_text, context);
        pg2 pg2Var = new pg2(context);
        pg2Var.k = 3500L;
        float a2 = e3m.a(R.dimen.sharing_cancel_padding, context);
        if (pg2Var.a.getResources().getDisplayMetrics().density >= 2.0f) {
            pair = new Pair(Float.valueOf(a2), Float.valueOf(a2 * 2));
        } else {
            float f = a2 * 2;
            pair = new Pair(Float.valueOf(f), Float.valueOf(f));
        }
        float floatValue = ((Number) pair.d()).floatValue();
        float floatValue2 = ((Number) pair.g()).floatValue();
        pg2Var.b = floatValue;
        Paint paint = pg2Var.j;
        paint.setStrokeWidth(floatValue2);
        pg2Var.i = e3m.a(R.dimen.vk_button_corner_big_radius, context);
        paint.setColor(dhr0.Y(R.attr.vk_ui_stroke_accent_themed, context));
        this.g = pg2Var;
    }

    public final void b(a4o0 a4o0Var, State state, pq9 pq9Var) {
        boolean z = a4o0Var.c;
        this.b = state;
        State state2 = State.SEND;
        Drawable drawable = state != state2 ? this.d : this.c;
        pg2 pg2Var = this.g;
        setBackground(new LayerDrawable(new Drawable[]{drawable, pg2Var}));
        setTextColor(this.b == state2 ? this.e : this.f);
        int i = a.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            setText(getContext().getString(z ? R.string.sharing_share : R.string.sharing_send));
        } else if (i == 2) {
            setText(getContext().getString(z ? R.string.sharing_goto_group_short : R.string.sharing_goto_chat));
            if (z) {
                setContentDescription(getContext().getString(R.string.sharing_goto_group));
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            setText(getContext().getString(R.string.sharing_animated_cancel_label));
        }
        if (pq9Var != null) {
            float min = ((TargetSharingTask) pq9Var.c.get(new icj0(a4o0Var.b, a4o0Var.a, z))) != null ? Math.min((System.currentTimeMillis() - r8.b) / 3500, 1.0f) : -1.0f;
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= min) {
                post(new luj0(this, min, 1));
            } else {
                if (min >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !pg2Var.m) {
                    return;
                }
                post(new jk9(this, 12));
            }
        }
    }

    public final State getCurrentState() {
        return this.b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.h = true;
        b4o0 b4o0Var = this.i;
        if (b4o0Var != null) {
            post(b4o0Var);
        }
        this.i = null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.h = false;
        super.setBackground(drawable);
    }

    public final void setColorAccent(int i) {
        Drawable drawable = this.c;
        if (drawable != null) {
            ColorStateList valueOf = ColorStateList.valueOf(i);
            uko.a aVar = uko.a;
            drawable.mutate().setTintList(valueOf);
        }
        this.f = ColorStateList.valueOf(i);
        this.g.j.setColor(i);
    }
}
