package com.vk.stories.design.view.viewer;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.f4m;
import xsna.g3g;
import xsna.gkm0;
import xsna.iah0;
import xsna.msy;
import xsna.zrp;

/* compiled from: StoryUploadIndicatorView.kt */
/* loaded from: classes6.dex */
public final class StoryUploadIndicatorView extends FrameLayout {
    public static final /* synthetic */ int g = 0;
    public final Object b;
    public State c;
    public final gkm0 d;
    public final View e;
    public final View f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoryUploadIndicatorView.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ERROR;
        public static final State IDLE;
        public static final State PROGRESS;

        static {
            State state = new State("PROGRESS", 0);
            PROGRESS = state;
            State state2 = new State("ERROR", 1);
            ERROR = state2;
            State state3 = new State("IDLE", 2);
            IDLE = state3;
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

    /* compiled from: StoryUploadIndicatorView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StoryUploadIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = msy.a(LazyThreadSafetyMode.NONE, new g3g(context, 2));
        this.c = State.IDLE;
        LayoutInflater.from(context).inflate(R.layout.pds_story_upload_indicator_view, (ViewGroup) this, true);
        this.d = (gkm0) findViewById(R.id.pv_progress);
        this.e = findViewById(R.id.fl_uploading_view);
        this.f = findViewById(R.id.fl_upload_failure);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final GradientDrawable getBgGradient() {
        return (GradientDrawable) this.b.getValue();
    }

    public final float getProgress() {
        return this.d.getProgress();
    }

    public final State getState() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f4m.k(iah0.a(120), this);
        setBackground(getBgGradient());
    }

    public final void setProgress(float f) {
        this.d.setProgress(f);
    }

    public final void setState(State state) {
        this.c = state;
        int i = a.$EnumSwitchMapping$0[state.ordinal()];
        View view = this.f;
        View view2 = this.e;
        if (i == 1) {
            f4m.j(view2);
            f4m.j(view);
        } else if (i == 2) {
            view2.setVisibility(0);
            f4m.j(view);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(view2);
            view.setVisibility(0);
        }
    }
}
