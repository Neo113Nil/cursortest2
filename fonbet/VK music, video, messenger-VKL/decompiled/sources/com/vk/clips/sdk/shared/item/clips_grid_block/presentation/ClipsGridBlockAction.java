package com.vk.clips.sdk.shared.item.clips_grid_block.presentation;

import xsna.asp;
import xsna.epx;
import xsna.k4b0;
import xsna.kih0;
import xsna.kj50;
import xsna.qi5;
import xsna.vu5;
import xsna.zrp;

/* compiled from: ClipsGridBlockAction.kt */
/* loaded from: classes17.dex */
public interface ClipsGridBlockAction extends kj50 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsGridBlockAction.kt */
    public static final class HandleOnBlockFocusChanged implements ClipsGridBlockAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HandleOnBlockFocusChanged[] $VALUES;
        public static final HandleOnBlockFocusChanged FOCUSED;
        public static final HandleOnBlockFocusChanged UNFOCUSED;

        static {
            HandleOnBlockFocusChanged handleOnBlockFocusChanged = new HandleOnBlockFocusChanged("FOCUSED", 0);
            FOCUSED = handleOnBlockFocusChanged;
            HandleOnBlockFocusChanged handleOnBlockFocusChanged2 = new HandleOnBlockFocusChanged("UNFOCUSED", 1);
            UNFOCUSED = handleOnBlockFocusChanged2;
            HandleOnBlockFocusChanged[] handleOnBlockFocusChangedArr = {handleOnBlockFocusChanged, handleOnBlockFocusChanged2};
            $VALUES = handleOnBlockFocusChangedArr;
            $ENTRIES = new asp(handleOnBlockFocusChangedArr);
        }

        public HandleOnBlockFocusChanged() {
            throw null;
        }

        public static HandleOnBlockFocusChanged valueOf(String str) {
            return (HandleOnBlockFocusChanged) Enum.valueOf(HandleOnBlockFocusChanged.class, str);
        }

        public static HandleOnBlockFocusChanged[] values() {
            return (HandleOnBlockFocusChanged[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsGridBlockAction.kt */
    public static final class a implements ClipsGridBlockAction {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 773956727;
        }

        public final String toString() {
            return "HandleAnimationDidEnd";
        }
    }

    /* compiled from: ClipsGridBlockAction.kt */
    public static final class b implements ClipsGridBlockAction {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("HandleClipClickByIndex(index="), this.b, ')');
        }
    }

    /* compiled from: ClipsGridBlockAction.kt */
    public interface c extends ClipsGridBlockAction {

        /* compiled from: ClipsGridBlockAction.kt */
        public static final class a implements c {
            public final int b;
            public final kih0 c;

            public a(int i, kih0 kih0Var) {
                this.b = i;
                this.c = kih0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                return "Begin(index=" + this.b + ", autoPlay=" + this.c + ')';
            }
        }

        /* compiled from: ClipsGridBlockAction.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1668508893;
            }

            public final String toString() {
                return "End";
            }
        }
    }

    /* compiled from: ClipsGridBlockAction.kt */
    public static final class d implements ClipsGridBlockAction {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 590446498;
        }

        public final String toString() {
            return "HandleNextPlayingClip";
        }
    }

    /* compiled from: ClipsGridBlockAction.kt */
    public static final class e implements ClipsGridBlockAction {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 943472121;
        }

        public final String toString() {
            return "HandleShowOtherClips";
        }
    }

    /* compiled from: ClipsGridBlockAction.kt */
    public static final class f implements ClipsGridBlockAction {
        public final qi5 b;
        public final k4b0 c;

        public f(qi5 qi5Var, k4b0 k4b0Var) {
            this.b = qi5Var;
            this.c = k4b0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.b.equals(fVar.b) && this.c.equals(fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.a.hashCode() * 31);
        }

        public final String toString() {
            return "HandleUpdatePlayerState(autoPlay=" + this.b + ", playerState=" + this.c + ')';
        }
    }
}
