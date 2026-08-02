package com.vk.music.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.ui.CircularProgressView;
import com.vk.music.ui.R$styleable;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.asp;
import xsna.b0u0;
import xsna.bwt0;
import xsna.f4m;
import xsna.iut0;
import xsna.sp2;
import xsna.w450;
import xsna.x450;
import xsna.y450;
import xsna.z450;
import xsna.zrp;

/* compiled from: MusicRoundPlayView.kt */
/* loaded from: classes3.dex */
public final class MusicRoundPlayView extends FrameLayout {
    public final CircularProgressView b;
    public final AppCompatImageView c;
    public State d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MusicRoundPlayView.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State BUFFERING;
        public static final State PAUSE;
        public static final State PLAY;

        static {
            State state = new State("PAUSE", 0);
            PAUSE = state;
            State state2 = new State("PLAY", 1);
            PLAY = state2;
            State state3 = new State("BUFFERING", 2);
            BUFFERING = state3;
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

    /* compiled from: MusicRoundPlayView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.PLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.BUFFERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MusicRoundPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        State state = State.PAUSE;
        this.d = state;
        this.h = R.drawable.vk_icon_play_36;
        this.i = R.drawable.vk_icon_pause_36;
        LayoutInflater.from(context).inflate(R.layout.music_round_play_view, (ViewGroup) this, true);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.play_icon);
        this.c = appCompatImageView;
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.progress);
        this.b = circularProgressView;
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(R.id.play_background);
        appCompatImageView.setContentDescription(context.getString(R.string.music_talkback_play));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
            try {
                int color = obtainStyledAttributes.getColor(1, -1);
                if (color != -1) {
                    bwt0.o0(appCompatImageView2, color);
                }
                int color2 = obtainStyledAttributes.getColor(5, -1);
                if (color2 != -1) {
                    bwt0.o0(appCompatImageView, color2);
                    circularProgressView.setColor(color2);
                }
                appCompatImageView2.setAlpha(obtainStyledAttributes.getFloat(0, 1.0f));
                int resourceId = obtainStyledAttributes.getResourceId(4, 0);
                if (resourceId != 0) {
                    this.h = resourceId;
                    appCompatImageView.setImageResource(resourceId);
                }
                int resourceId2 = obtainStyledAttributes.getResourceId(3, 0);
                if (resourceId2 != 0) {
                    this.i = resourceId2;
                }
                if (!obtainStyledAttributes.getBoolean(6, true)) {
                    f4m.j(appCompatImageView2);
                }
                this.e = obtainStyledAttributes.getBoolean(7, false);
                this.f = obtainStyledAttributes.getBoolean(8, false);
                this.g = obtainStyledAttributes.getBoolean(2, false);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        b(state);
        if (this.g) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (!circularProgressView.isLaidOut()) {
                circularProgressView.addOnLayoutChangeListener(new z450(this));
                return;
            }
            int a2 = an10.a(getWidth() * 0.25d);
            int a3 = an10.a(circularProgressView.getWidth() * 0.04d);
            circularProgressView.setPadding(a2, a2, a2, a2);
            circularProgressView.setThickness(a3);
        }
    }

    public final boolean a() {
        return this.d == State.BUFFERING;
    }

    public final void b(State state) {
        if (this.d == state) {
            return;
        }
        this.d = state;
        int i = a.$EnumSwitchMapping$0[state.ordinal()];
        boolean z = this.e;
        CircularProgressView circularProgressView = this.b;
        AppCompatImageView appCompatImageView = this.c;
        if (i == 1) {
            if (z && bwt0.K(circularProgressView)) {
                c(getScaleX(), 1.0f, new x450());
            }
            f4m.j(circularProgressView);
            appCompatImageView.setVisibility(0);
            appCompatImageView.setImageResource(this.h);
            appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(R.string.music_talkback_play));
            return;
        }
        int i2 = this.i;
        if (i == 2) {
            if (z && bwt0.K(circularProgressView)) {
                c(getScaleX(), 1.0f, new y450());
            }
            f4m.j(circularProgressView);
            appCompatImageView.setVisibility(0);
            appCompatImageView.setImageResource(i2);
            appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(R.string.music_talkback_pause));
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        circularProgressView.setVisibility(0);
        if (z) {
            c(getScaleX(), 0.8f, new w450());
        }
        if (!this.f) {
            f4m.j(appCompatImageView);
        }
        appCompatImageView.setImageResource(i2);
    }

    public final void c(float f, float f2, sp2 sp2Var) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillBefore(true);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setAnimationListener(sp2Var);
        startAnimation(scaleAnimation);
    }
}
