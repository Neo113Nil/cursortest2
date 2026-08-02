package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.epx;
import xsna.fwq;
import xsna.j5g;

/* compiled from: FragmentStrictMode.kt */
/* loaded from: classes.dex */
public final class FragmentStrictMode {
    public static final a a = a.c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FragmentStrictMode.kt */
    public static final class Flag {
        private static final /* synthetic */ Flag[] $VALUES;
        public static final Flag DETECT_FRAGMENT_REUSE;
        public static final Flag DETECT_FRAGMENT_TAG_USAGE;
        public static final Flag DETECT_RETAIN_INSTANCE_USAGE;
        public static final Flag DETECT_SET_USER_VISIBLE_HINT;
        public static final Flag DETECT_TARGET_FRAGMENT_USAGE;
        public static final Flag DETECT_WRONG_FRAGMENT_CONTAINER;
        public static final Flag DETECT_WRONG_NESTED_HIERARCHY;
        public static final Flag PENALTY_DEATH;
        public static final Flag PENALTY_LOG;

        static {
            Flag flag = new Flag("PENALTY_LOG", 0);
            PENALTY_LOG = flag;
            Flag flag2 = new Flag("PENALTY_DEATH", 1);
            PENALTY_DEATH = flag2;
            Flag flag3 = new Flag("DETECT_FRAGMENT_REUSE", 2);
            DETECT_FRAGMENT_REUSE = flag3;
            Flag flag4 = new Flag("DETECT_FRAGMENT_TAG_USAGE", 3);
            DETECT_FRAGMENT_TAG_USAGE = flag4;
            Flag flag5 = new Flag("DETECT_WRONG_NESTED_HIERARCHY", 4);
            DETECT_WRONG_NESTED_HIERARCHY = flag5;
            Flag flag6 = new Flag("DETECT_RETAIN_INSTANCE_USAGE", 5);
            DETECT_RETAIN_INSTANCE_USAGE = flag6;
            Flag flag7 = new Flag("DETECT_SET_USER_VISIBLE_HINT", 6);
            DETECT_SET_USER_VISIBLE_HINT = flag7;
            Flag flag8 = new Flag("DETECT_TARGET_FRAGMENT_USAGE", 7);
            DETECT_TARGET_FRAGMENT_USAGE = flag8;
            Flag flag9 = new Flag("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
            DETECT_WRONG_FRAGMENT_CONTAINER = flag9;
            $VALUES = new Flag[]{flag, flag2, flag3, flag4, flag5, flag6, flag7, flag8, flag9};
        }

        public Flag() {
            throw null;
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) $VALUES.clone();
        }
    }

    /* compiled from: FragmentStrictMode.kt */
    public static final class a {
        public static final a c = new a(EmptySet.b);
        public final Set<Flag> a;
        public final LinkedHashMap b;

        public a(Set set) {
            this.a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            EmptySet.b.getClass();
            this.b = linkedHashMap;
        }
    }

    public static a a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager();
            }
            fragment = fragment.getParentFragment();
        }
        return a;
    }

    public static void b(a aVar, Violation violation) {
        Fragment d = violation.d();
        String name = d.getClass().getName();
        Set<Flag> set = aVar.a;
        set.contains(Flag.PENALTY_LOG);
        if (set.contains(Flag.PENALTY_DEATH)) {
            fwq fwqVar = new fwq(1, name, violation);
            if (!d.isAdded()) {
                fwqVar.run();
                throw null;
            }
            Handler handler = d.getParentFragmentManager().w.d;
            if (epx.f(handler.getLooper(), Looper.myLooper())) {
                fwqVar.run();
                throw null;
            }
            handler.post(fwqVar);
        }
    }

    public static void c(Violation violation) {
        if (FragmentManager.P(3)) {
            violation.d().getClass();
        }
    }

    public static final void d(Fragment fragment, String str) {
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        c(fragmentReuseViolation);
        a a2 = a(fragment);
        if (a2.a.contains(Flag.DETECT_FRAGMENT_REUSE) && e(a2, fragment.getClass(), FragmentReuseViolation.class)) {
            b(a2, fragmentReuseViolation);
        }
    }

    public static boolean e(a aVar, Class cls, Class cls2) {
        Set set = (Set) aVar.b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (epx.f(cls2.getSuperclass(), Violation.class) || !j5g.P(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
