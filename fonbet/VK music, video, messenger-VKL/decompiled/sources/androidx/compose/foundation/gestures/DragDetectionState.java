package androidx.compose.foundation.gestures;

import xsna.asp;
import xsna.xlb0;
import xsna.zrp;

/* compiled from: Draggable.kt */
/* loaded from: classes11.dex */
public abstract class DragDetectionState {

    /* compiled from: Draggable.kt */
    public static final class AwaitDown extends DragDetectionState {
        public AwaitTouchSlop a;
        public boolean b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Draggable.kt */
        public static final class AwaitTouchSlop {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ AwaitTouchSlop[] $VALUES;
            public static final AwaitTouchSlop No;
            public static final AwaitTouchSlop NotInitialized;
            public static final AwaitTouchSlop Yes;

            static {
                AwaitTouchSlop awaitTouchSlop = new AwaitTouchSlop("Yes", 0);
                Yes = awaitTouchSlop;
                AwaitTouchSlop awaitTouchSlop2 = new AwaitTouchSlop("No", 1);
                No = awaitTouchSlop2;
                AwaitTouchSlop awaitTouchSlop3 = new AwaitTouchSlop("NotInitialized", 2);
                NotInitialized = awaitTouchSlop3;
                AwaitTouchSlop[] awaitTouchSlopArr = {awaitTouchSlop, awaitTouchSlop2, awaitTouchSlop3};
                $VALUES = awaitTouchSlopArr;
                $ENTRIES = new asp(awaitTouchSlopArr);
            }

            public AwaitTouchSlop() {
                throw null;
            }

            public static AwaitTouchSlop valueOf(String str) {
                return (AwaitTouchSlop) Enum.valueOf(AwaitTouchSlop.class, str);
            }

            public static AwaitTouchSlop[] values() {
                return (AwaitTouchSlop[]) $VALUES.clone();
            }
        }

        public AwaitDown() {
            this(0);
        }

        public AwaitDown(int i) {
            this.a = AwaitTouchSlop.NotInitialized;
            this.b = false;
        }
    }

    /* compiled from: Draggable.kt */
    public static final class a extends DragDetectionState {
        public xlb0 a;
        public long b;
    }

    /* compiled from: Draggable.kt */
    public static final class b extends DragDetectionState {
        public xlb0 a;
        public long b;
        public boolean c;
    }

    /* compiled from: Draggable.kt */
    public static final class c extends DragDetectionState {
        public long a;
    }
}
