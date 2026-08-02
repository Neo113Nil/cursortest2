package com.vk.catalog.mvi.block.music.impl.ui;

import androidx.compose.runtime.b;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.at;
import xsna.dai;
import xsna.zrp;

/* compiled from: PlayPauseButton.kt */
/* loaded from: classes16.dex */
public final class PlayPauseButtonState {
    public final PlayingState a;
    public final Size b;
    public final Object c = at.c(LazyThreadSafetyMode.NONE);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlayPauseButton.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size SIZE_40;
        public static final Size SIZE_48;
        private final int value;

        static {
            Size size = new Size("SIZE_40", 0, 40);
            SIZE_40 = size;
            Size size2 = new Size("SIZE_48", 1, 48);
            SIZE_48 = size2;
            Size[] sizeArr = {size, size2};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size(String str, int i, int i2) {
            this.value = i2;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }

        public final int h() {
            return this.value;
        }

        public final float i() {
            if (b.d()) {
                b.f(-368429216, 0, -1, "com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButtonState.Size.toDp (PlayPauseButton.kt:119)");
            }
            float f = this.value;
            if (b.d()) {
                b.e();
            }
            return f;
        }
    }

    /* compiled from: PlayPauseButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Size.values().length];
            try {
                iArr[Size.SIZE_40.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Size.SIZE_48.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PlayPauseButtonState(PlayingState playingState, Size size) {
        this.a = playingState;
        this.b = size;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dai.c a() {
        return (dai.c) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayPauseButtonState)) {
            return false;
        }
        PlayPauseButtonState playPauseButtonState = (PlayPauseButtonState) obj;
        return this.a == playPauseButtonState.a && this.b == playPauseButtonState.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayPauseButtonState(state=" + this.a + ", size=" + this.b + ')';
    }
}
