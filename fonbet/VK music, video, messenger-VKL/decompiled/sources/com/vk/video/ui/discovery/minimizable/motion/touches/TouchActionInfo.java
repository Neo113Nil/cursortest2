package com.vk.video.ui.discovery.minimizable.motion.touches;

import defpackage.q0;
import kotlin.NoWhenBranchMatchedException;
import xsna.aq0;
import xsna.asp;
import xsna.epx;
import xsna.gzs;
import xsna.ho8;
import xsna.izs;
import xsna.nb30;
import xsna.nmp0;
import xsna.q3s0;
import xsna.qoy;
import xsna.s3q0;
import xsna.uf3;
import xsna.up;
import xsna.vu5;
import xsna.zrp;

/* compiled from: TouchActionInfo.kt */
/* loaded from: classes7.dex */
public final class TouchActionInfo {
    public final nmp0 a;
    public final c b;
    public final Direction c;
    public final b d;
    public final a e;
    public final float f;
    public final boolean g;
    public final d h;
    public final izs<nb30, s3q0> i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TouchActionInfo.kt */
    public static final class Direction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction Down;
        public static final Direction Left;
        public static final Direction Right;
        public static final Direction Up;

        /* compiled from: TouchActionInfo.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Direction.values().length];
                try {
                    iArr[Direction.Up.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Direction.Down.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Direction.Right.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Direction.Left.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            Direction direction = new Direction("Up", 0);
            Up = direction;
            Direction direction2 = new Direction("Down", 1);
            Down = direction2;
            Direction direction3 = new Direction("Left", 2);
            Left = direction3;
            Direction direction4 = new Direction("Right", 3);
            Right = direction4;
            Direction[] directionArr = {direction, direction2, direction3, direction4};
            $VALUES = directionArr;
            $ENTRIES = new asp(directionArr);
        }

        public Direction() {
            throw null;
        }

        public static zrp<Direction> h() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }

        public final Direction i() {
            int i = a.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return Down;
            }
            if (i == 2) {
                return Up;
            }
            if (i == 3) {
                return Left;
            }
            if (i == 4) {
                return Right;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final boolean j() {
            int i = a.$EnumSwitchMapping$0[ordinal()];
            return i == 3 || i == 4;
        }

        public final boolean k() {
            int i = a.$EnumSwitchMapping$0[ordinal()];
            return i == 1 || i == 2;
        }
    }

    /* compiled from: TouchActionInfo.kt */
    public interface a {

        /* compiled from: TouchActionInfo.kt */
        /* renamed from: com.vk.video.ui.discovery.minimizable.motion.touches.TouchActionInfo$a$a, reason: collision with other inner class name */
        public static final class C1988a implements a {
            public static final C1988a a = new C1988a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1988a);
            }

            public final int hashCode() {
                return 287253745;
            }

            public final String toString() {
                return "Both";
            }
        }

        /* compiled from: TouchActionInfo.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1037917471;
            }

            public final String toString() {
                return "OnlyBackward";
            }
        }

        /* compiled from: TouchActionInfo.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -850662903;
            }

            public final String toString() {
                return "OnlyForward";
            }
        }
    }

    /* compiled from: TouchActionInfo.kt */
    public interface b {

        /* compiled from: TouchActionInfo.kt */
        public static final class a implements b {
            public final boolean a;

            public a() {
                this(false);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("NestedScroll(isTransitionFirst="), this.a, ')');
            }

            public a(boolean z) {
                this.a = z;
            }
        }

        /* compiled from: TouchActionInfo.kt */
        /* renamed from: com.vk.video.ui.discovery.minimizable.motion.touches.TouchActionInfo$b$b, reason: collision with other inner class name */
        public static final class C1989b implements b {
            public static final C1989b a = new C1989b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1989b);
            }

            public final int hashCode() {
                return -370120133;
            }

            public final String toString() {
                return "Scroll";
            }
        }
    }

    /* compiled from: TouchActionInfo.kt */
    public interface c {

        /* compiled from: TouchActionInfo.kt */
        public static final class a implements c {
            public final String a;

            public a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ComposeNode(tag="), this.a, ')');
            }
        }

        /* compiled from: TouchActionInfo.kt */
        public interface b extends c {

            /* compiled from: TouchActionInfo.kt */
            public static final class a implements b {
                public final int a;

                public a(int i) {
                    this.a = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.a == ((a) obj).a;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.a);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("Id(id="), this.a, ')');
                }
            }

            /* compiled from: TouchActionInfo.kt */
            /* renamed from: com.vk.video.ui.discovery.minimizable.motion.touches.TouchActionInfo$c$b$b, reason: collision with other inner class name */
            public static final class C1990b implements b {
                public final String a;

                public C1990b(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1990b) && epx.f(this.a, ((C1990b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Tag(tag="), this.a, ')');
                }
            }
        }
    }

    /* compiled from: TouchActionInfo.kt */
    public interface d {

        /* compiled from: TouchActionInfo.kt */
        public static final class a implements d {
            public final gzs<Boolean> a;

            public a() {
                this(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return uf3.d(new StringBuilder("Dynamic(isSupported="), this.a, ')');
            }

            public /* synthetic */ a(int i) {
                this(new aq0(10));
            }

            public a(gzs<Boolean> gzsVar) {
                this.a = gzsVar;
            }
        }

        /* compiled from: TouchActionInfo.kt */
        public static final class b implements d {
            public final boolean a;

            public b() {
                this(true);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("Static(isEnabled="), this.a, ')');
            }

            public b(boolean z) {
                this.a = z;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TouchActionInfo(nmp0 nmp0Var, c cVar, Direction direction, b bVar, a aVar, float f, boolean z, d dVar, izs<? super nb30, s3q0> izsVar) {
        this.a = nmp0Var;
        this.b = cVar;
        this.c = direction;
        this.d = bVar;
        this.e = aVar;
        this.f = f;
        this.g = z;
        this.h = dVar;
        this.i = izsVar;
    }

    public static TouchActionInfo a(TouchActionInfo touchActionInfo, nmp0 nmp0Var, d dVar, int i) {
        if ((i & 1) != 0) {
            nmp0Var = touchActionInfo.a;
        }
        nmp0 nmp0Var2 = nmp0Var;
        c cVar = touchActionInfo.b;
        Direction direction = touchActionInfo.c;
        b bVar = touchActionInfo.d;
        a aVar = touchActionInfo.e;
        float f = touchActionInfo.f;
        boolean z = touchActionInfo.g;
        if ((i & 128) != 0) {
            dVar = touchActionInfo.h;
        }
        izs<nb30, s3q0> izsVar = touchActionInfo.i;
        touchActionInfo.getClass();
        return new TouchActionInfo(nmp0Var2, cVar, direction, bVar, aVar, f, z, dVar, izsVar);
    }

    public final boolean b() {
        d dVar = this.h;
        if (dVar instanceof d.b) {
            return ((d.b) dVar).a;
        }
        if (dVar instanceof d.a) {
            return ((d.a) dVar).a.invoke().booleanValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchActionInfo)) {
            return false;
        }
        TouchActionInfo touchActionInfo = (TouchActionInfo) obj;
        return epx.f(this.a, touchActionInfo.a) && epx.f(this.b, touchActionInfo.b) && this.c == touchActionInfo.c && epx.f(this.d, touchActionInfo.d) && epx.f(this.e, touchActionInfo.e) && Float.compare(this.f, touchActionInfo.f) == 0 && this.g == touchActionInfo.g && epx.f(this.h, touchActionInfo.h) && epx.f(this.i, touchActionInfo.i);
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + qoy.b(io.reactivex.rxjava3.subjects.b.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31), 31, this.g)) * 31;
        izs<nb30, s3q0> izsVar = this.i;
        return hashCode + (izsVar == null ? 0 : izsVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TouchActionInfo(transitionId=");
        sb.append(this.a);
        sb.append(", targetAttribute=");
        sb.append(this.b);
        sb.append(", dragDirection=");
        sb.append(this.c);
        sb.append(", scrollType=");
        sb.append(this.d);
        sb.append(", allowedDirections=");
        sb.append(this.e);
        sb.append(", scale=");
        sb.append(this.f);
        sb.append(", canBeTransitive=");
        sb.append(this.g);
        sb.append(", mode=");
        sb.append(this.h);
        sb.append(", onGestureDone=");
        return up.c(sb, this.i, ')');
    }

    public /* synthetic */ TouchActionInfo(nmp0 nmp0Var, c cVar, Direction direction, b bVar, a aVar, float f, d.a aVar2, q3s0 q3s0Var, int i) {
        this(nmp0Var, cVar, direction, bVar, (i & 16) != 0 ? a.C1988a.a : aVar, (i & 32) != 0 ? 1.0f : f, (i & 64) == 0, (i & 128) != 0 ? new d.b(true) : aVar2, (i & 256) != 0 ? null : q3s0Var);
    }
}
