package com.vk.story.viewer.impl.presentation.stories.view;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* loaded from: classes11.dex */
public final class ScrollerCustomDuration extends Scroller {
    public Mode a;
    public double b;
    public int c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode Duration;
        public static final Mode Scale;

        static {
            Mode mode = new Mode("Scale", 0);
            Scale = mode;
            Mode mode2 = new Mode("Duration", 1);
            Duration = mode2;
            $VALUES = new Mode[]{mode, mode2};
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public ScrollerCustomDuration(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.a = Mode.Scale;
        this.b = 1.5d;
        this.c = 130;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.a == Mode.Duration ? this.c : (int) (i5 * this.b));
    }
}
