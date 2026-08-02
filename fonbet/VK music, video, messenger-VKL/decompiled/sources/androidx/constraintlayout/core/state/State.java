package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.adv;
import xsna.at1;
import xsna.cgu;
import xsna.ct1;
import xsna.d46;
import xsna.dpf0;
import xsna.fur;
import xsna.h5s;
import xsna.nor0;
import xsna.xru;
import xsna.xx40;

/* loaded from: classes11.dex */
public class State {
    public xx40 a;
    public boolean b = true;
    public final HashMap<Object, dpf0> c;
    public final HashMap<Object, c> d;
    public final HashMap<String, ArrayList<String>> e;
    public final a f;
    public int g;
    public final ArrayList<Object> h;
    public final ArrayList<ConstraintWidget> i;
    public boolean j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Chain {
        private static final /* synthetic */ Chain[] $VALUES;
        public static final Chain PACKED;
        public static final Chain SPREAD;
        public static final Chain SPREAD_INSIDE;
        public static Map<String, Chain> chainMap;
        public static Map<String, Integer> valueMap;

        static {
            Chain chain = new Chain("SPREAD", 0);
            SPREAD = chain;
            Chain chain2 = new Chain("SPREAD_INSIDE", 1);
            SPREAD_INSIDE = chain2;
            Chain chain3 = new Chain("PACKED", 2);
            PACKED = chain3;
            $VALUES = new Chain[]{chain, chain2, chain3};
            chainMap = new HashMap();
            valueMap = new HashMap();
            chainMap.put("packed", chain3);
            chainMap.put("spread_inside", chain2);
            chainMap.put("spread", chain);
            valueMap.put("packed", 2);
            valueMap.put("spread_inside", 1);
            valueMap.put("spread", 0);
        }

        public Chain() {
            throw null;
        }

        public static int a(String str) {
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }

        public static Chain valueOf(String str) {
            return (Chain) Enum.valueOf(Chain.class, str);
        }

        public static Chain[] values() {
            return (Chain[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Constraint {
        private static final /* synthetic */ Constraint[] $VALUES;
        public static final Constraint BASELINE_TO_BASELINE;
        public static final Constraint BASELINE_TO_BOTTOM;
        public static final Constraint BASELINE_TO_TOP;
        public static final Constraint BOTTOM_TO_BASELINE;
        public static final Constraint BOTTOM_TO_BOTTOM;
        public static final Constraint BOTTOM_TO_TOP;
        public static final Constraint CENTER_HORIZONTALLY;
        public static final Constraint CENTER_VERTICALLY;
        public static final Constraint CIRCULAR_CONSTRAINT;
        public static final Constraint END_TO_END;
        public static final Constraint END_TO_START;
        public static final Constraint LEFT_TO_LEFT;
        public static final Constraint LEFT_TO_RIGHT;
        public static final Constraint RIGHT_TO_LEFT;
        public static final Constraint RIGHT_TO_RIGHT;
        public static final Constraint START_TO_END;
        public static final Constraint START_TO_START;
        public static final Constraint TOP_TO_BASELINE;
        public static final Constraint TOP_TO_BOTTOM;
        public static final Constraint TOP_TO_TOP;

        static {
            Constraint constraint = new Constraint("LEFT_TO_LEFT", 0);
            LEFT_TO_LEFT = constraint;
            Constraint constraint2 = new Constraint("LEFT_TO_RIGHT", 1);
            LEFT_TO_RIGHT = constraint2;
            Constraint constraint3 = new Constraint("RIGHT_TO_LEFT", 2);
            RIGHT_TO_LEFT = constraint3;
            Constraint constraint4 = new Constraint("RIGHT_TO_RIGHT", 3);
            RIGHT_TO_RIGHT = constraint4;
            Constraint constraint5 = new Constraint("START_TO_START", 4);
            START_TO_START = constraint5;
            Constraint constraint6 = new Constraint("START_TO_END", 5);
            START_TO_END = constraint6;
            Constraint constraint7 = new Constraint("END_TO_START", 6);
            END_TO_START = constraint7;
            Constraint constraint8 = new Constraint("END_TO_END", 7);
            END_TO_END = constraint8;
            Constraint constraint9 = new Constraint("TOP_TO_TOP", 8);
            TOP_TO_TOP = constraint9;
            Constraint constraint10 = new Constraint("TOP_TO_BOTTOM", 9);
            TOP_TO_BOTTOM = constraint10;
            Constraint constraint11 = new Constraint("TOP_TO_BASELINE", 10);
            TOP_TO_BASELINE = constraint11;
            Constraint constraint12 = new Constraint("BOTTOM_TO_TOP", 11);
            BOTTOM_TO_TOP = constraint12;
            Constraint constraint13 = new Constraint("BOTTOM_TO_BOTTOM", 12);
            BOTTOM_TO_BOTTOM = constraint13;
            Constraint constraint14 = new Constraint("BOTTOM_TO_BASELINE", 13);
            BOTTOM_TO_BASELINE = constraint14;
            Constraint constraint15 = new Constraint("BASELINE_TO_BASELINE", 14);
            BASELINE_TO_BASELINE = constraint15;
            Constraint constraint16 = new Constraint("BASELINE_TO_TOP", 15);
            BASELINE_TO_TOP = constraint16;
            Constraint constraint17 = new Constraint("BASELINE_TO_BOTTOM", 16);
            BASELINE_TO_BOTTOM = constraint17;
            Constraint constraint18 = new Constraint("CENTER_HORIZONTALLY", 17);
            CENTER_HORIZONTALLY = constraint18;
            Constraint constraint19 = new Constraint("CENTER_VERTICALLY", 18);
            CENTER_VERTICALLY = constraint19;
            Constraint constraint20 = new Constraint("CIRCULAR_CONSTRAINT", 19);
            CIRCULAR_CONSTRAINT = constraint20;
            $VALUES = new Constraint[]{constraint, constraint2, constraint3, constraint4, constraint5, constraint6, constraint7, constraint8, constraint9, constraint10, constraint11, constraint12, constraint13, constraint14, constraint15, constraint16, constraint17, constraint18, constraint19, constraint20};
        }

        public Constraint() {
            throw null;
        }

        public static Constraint valueOf(String str) {
            return (Constraint) Enum.valueOf(Constraint.class, str);
        }

        public static Constraint[] values() {
            return (Constraint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Direction {
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction BOTTOM;
        public static final Direction END;
        public static final Direction LEFT;
        public static final Direction RIGHT;
        public static final Direction START;
        public static final Direction TOP;

        static {
            Direction direction = new Direction("LEFT", 0);
            LEFT = direction;
            Direction direction2 = new Direction("RIGHT", 1);
            RIGHT = direction2;
            Direction direction3 = new Direction("START", 2);
            START = direction3;
            Direction direction4 = new Direction("END", 3);
            END = direction4;
            Direction direction5 = new Direction("TOP", 4);
            TOP = direction5;
            Direction direction6 = new Direction("BOTTOM", 5);
            BOTTOM = direction6;
            $VALUES = new Direction[]{direction, direction2, direction3, direction4, direction5, direction6};
        }

        public Direction() {
            throw null;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Helper {
        private static final /* synthetic */ Helper[] $VALUES;
        public static final Helper ALIGN_HORIZONTALLY;
        public static final Helper ALIGN_VERTICALLY;
        public static final Helper BARRIER;
        public static final Helper COLUMN;
        public static final Helper FLOW;
        public static final Helper GRID;
        public static final Helper HORIZONTAL_CHAIN;
        public static final Helper HORIZONTAL_FLOW;
        public static final Helper LAYER;
        public static final Helper ROW;
        public static final Helper VERTICAL_CHAIN;
        public static final Helper VERTICAL_FLOW;

        static {
            Helper helper = new Helper("HORIZONTAL_CHAIN", 0);
            HORIZONTAL_CHAIN = helper;
            Helper helper2 = new Helper("VERTICAL_CHAIN", 1);
            VERTICAL_CHAIN = helper2;
            Helper helper3 = new Helper("ALIGN_HORIZONTALLY", 2);
            ALIGN_HORIZONTALLY = helper3;
            Helper helper4 = new Helper("ALIGN_VERTICALLY", 3);
            ALIGN_VERTICALLY = helper4;
            Helper helper5 = new Helper("BARRIER", 4);
            BARRIER = helper5;
            Helper helper6 = new Helper("LAYER", 5);
            LAYER = helper6;
            Helper helper7 = new Helper("HORIZONTAL_FLOW", 6);
            HORIZONTAL_FLOW = helper7;
            Helper helper8 = new Helper("VERTICAL_FLOW", 7);
            VERTICAL_FLOW = helper8;
            Helper helper9 = new Helper(SignalingProtocol.KEY_GRID, 8);
            GRID = helper9;
            Helper helper10 = new Helper("ROW", 9);
            ROW = helper10;
            Helper helper11 = new Helper("COLUMN", 10);
            COLUMN = helper11;
            Helper helper12 = new Helper("FLOW", 11);
            FLOW = helper12;
            $VALUES = new Helper[]{helper, helper2, helper3, helper4, helper5, helper6, helper7, helper8, helper9, helper10, helper11, helper12};
        }

        public Helper() {
            throw null;
        }

        public static Helper valueOf(String str) {
            return (Helper) Enum.valueOf(Helper.class, str);
        }

        public static Helper[] values() {
            return (Helper[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Wrap {
        private static final /* synthetic */ Wrap[] $VALUES;
        public static final Wrap ALIGNED;
        public static final Wrap CHAIN;
        public static final Wrap NONE;
        public static Map<String, Integer> valueMap;
        public static Map<String, Wrap> wrapMap;

        static {
            Wrap wrap = new Wrap("NONE", 0);
            NONE = wrap;
            Wrap wrap2 = new Wrap("CHAIN", 1);
            CHAIN = wrap2;
            Wrap wrap3 = new Wrap("ALIGNED", 2);
            ALIGNED = wrap3;
            $VALUES = new Wrap[]{wrap, wrap2, wrap3};
            wrapMap = new HashMap();
            valueMap = new HashMap();
            wrapMap.put("none", wrap);
            wrapMap.put("chain", wrap2);
            wrapMap.put("aligned", wrap3);
            valueMap.put("none", 0);
            valueMap.put("chain", 3);
            valueMap.put("aligned", 2);
        }

        public Wrap() {
            throw null;
        }

        public static Wrap valueOf(String str) {
            return (Wrap) Enum.valueOf(Wrap.class, str);
        }

        public static Wrap[] values() {
            return (Wrap[]) $VALUES.clone();
        }
    }

    public State() {
        HashMap<Object, dpf0> hashMap = new HashMap<>();
        this.c = hashMap;
        this.d = new HashMap<>();
        this.e = new HashMap<>();
        a aVar = new a(this);
        this.f = aVar;
        this.g = 0;
        this.h = new ArrayList<>();
        this.i = new ArrayList<>();
        this.j = true;
        aVar.a = 0;
        hashMap.put(0, aVar);
    }

    public final void a(Object obj) {
        this.h.add(obj);
        this.j = true;
    }

    public final a b(Object obj) {
        HashMap<Object, dpf0> hashMap = this.c;
        dpf0 dpf0Var = hashMap.get(obj);
        dpf0 dpf0Var2 = dpf0Var;
        if (dpf0Var == null) {
            a aVar = new a(this);
            hashMap.put(obj, aVar);
            aVar.a = obj;
            dpf0Var2 = aVar;
        }
        if (dpf0Var2 instanceof a) {
            return (a) dpf0Var2;
        }
        return null;
    }

    public int c(Float f) {
        return Math.round(f.floatValue());
    }

    public final xru d(int i, String str) {
        a b = b(str);
        Object obj = b.c;
        if (obj == null || !(obj instanceof xru)) {
            xru xruVar = new xru(this);
            xruVar.b = i;
            xruVar.g = str;
            b.c = xruVar;
            b.c(xruVar.a());
        }
        return (xru) b.c;
    }

    public final c e(Helper helper) {
        c cVar;
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i = this.g;
        this.g = i + 1;
        String c = h5s.c(i, "__", sb);
        HashMap<Object, c> hashMap = this.d;
        c cVar2 = hashMap.get(c);
        c cVar3 = cVar2;
        if (cVar2 == null) {
            switch (helper.ordinal()) {
                case 0:
                    cVar = new adv(this, Helper.HORIZONTAL_CHAIN);
                    break;
                case 1:
                    cVar = new nor0(this, Helper.VERTICAL_CHAIN);
                    break;
                case 2:
                    at1 at1Var = new at1(this, Helper.ALIGN_VERTICALLY);
                    at1Var.n0 = 0.5f;
                    cVar = at1Var;
                    break;
                case 3:
                    ct1 ct1Var = new ct1(this, Helper.ALIGN_VERTICALLY);
                    ct1Var.n0 = 0.5f;
                    cVar = ct1Var;
                    break;
                case 4:
                    cVar = new d46(this);
                    break;
                case 5:
                default:
                    cVar = new c(this, helper);
                    break;
                case 6:
                case 7:
                    cVar = new fur(this, helper);
                    break;
                case 8:
                case 9:
                case 10:
                    cVar = new cgu(this, helper);
                    break;
            }
            cVar.a = c;
            hashMap.put(c, cVar);
            cVar3 = cVar;
        }
        return cVar3;
    }
}
