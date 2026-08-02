package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import xsna.cnx0;
import xsna.oou;

/* loaded from: classes.dex */
public final class ConstraintAnchor {
    public int b;
    public boolean c;
    public final ConstraintWidget d;
    public final Type e;
    public ConstraintAnchor f;
    public SolverVariable i;
    public HashSet<ConstraintAnchor> a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BASELINE;
        public static final Type BOTTOM;
        public static final Type CENTER;
        public static final Type CENTER_X;
        public static final Type CENTER_Y;
        public static final Type LEFT;
        public static final Type NONE;
        public static final Type RIGHT;
        public static final Type TOP;

        static {
            Type type = new Type("NONE", 0);
            NONE = type;
            Type type2 = new Type("LEFT", 1);
            LEFT = type2;
            Type type3 = new Type("TOP", 2);
            TOP = type3;
            Type type4 = new Type("RIGHT", 3);
            RIGHT = type4;
            Type type5 = new Type("BOTTOM", 4);
            BOTTOM = type5;
            Type type6 = new Type("BASELINE", 5);
            BASELINE = type6;
            Type type7 = new Type("CENTER", 6);
            CENTER = type7;
            Type type8 = new Type("CENTER_X", 7);
            CENTER_X = type8;
            Type type9 = new Type("CENTER_Y", 8);
            CENTER_Y = type9;
            $VALUES = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.d = constraintWidget;
        this.e = type;
    }

    public final void a(ConstraintAnchor constraintAnchor, int i) {
        b(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            j();
            return true;
        }
        if (!z && !i(constraintAnchor)) {
            return false;
        }
        this.f = constraintAnchor;
        if (constraintAnchor.a == null) {
            constraintAnchor.a = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList<cnx0> arrayList, cnx0 cnx0Var) {
        HashSet<ConstraintAnchor> hashSet = this.a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                oou.a(it.next().d, i, arrayList, cnx0Var);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        ConstraintAnchor constraintAnchor;
        if (this.d.j0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (constraintAnchor = this.f) == null || constraintAnchor.d.j0 != 8) ? this.g : i;
    }

    public final ConstraintAnchor f() {
        Type type = this.e;
        int ordinal = type.ordinal();
        ConstraintWidget constraintWidget = this.d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return constraintWidget.M;
            case 2:
                return constraintWidget.N;
            case 3:
                return constraintWidget.K;
            case 4:
                return constraintWidget.L;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final boolean g() {
        HashSet<ConstraintAnchor> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final boolean i(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        ConstraintWidget constraintWidget = constraintAnchor.d;
        Type type = constraintAnchor.e;
        Type type2 = this.e;
        if (type == type2) {
            return type2 != Type.BASELINE || (constraintWidget.F && this.d.F);
        }
        switch (type2.ordinal()) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = type == Type.LEFT || type == Type.RIGHT;
                return constraintWidget instanceof f ? z || type == Type.CENTER_X : z;
            case 2:
            case 4:
                boolean z2 = type == Type.TOP || type == Type.BOTTOM;
                return constraintWidget instanceof f ? z2 || type == Type.CENTER_Y : z2;
            case 5:
                return (type == Type.LEFT || type == Type.RIGHT) ? false : true;
            case 6:
                return (type == Type.BASELINE || type == Type.CENTER_X || type == Type.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(type2.name());
        }
    }

    public final void j() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        SolverVariable solverVariable = this.i;
        if (solverVariable == null) {
            this.i = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.l0 + StringUtils.PROCESS_POSTFIX_DELIMITER + this.e.toString();
    }
}
