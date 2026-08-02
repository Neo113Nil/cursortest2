package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import defpackage.fc6;
import defpackage.km5;
import defpackage.wt3;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DescriptorKindFilter {

    @NotNull
    public static final DescriptorKindFilter ALL;
    private static final int ALL_KINDS_MASK;

    @NotNull
    public static final DescriptorKindFilter CALLABLES;
    private static final int CALLABLES_MASK;

    @NotNull
    public static final DescriptorKindFilter CLASSIFIERS;
    private static final int CLASSIFIERS_MASK;

    @NotNull
    public static final Companion Companion;

    @NotNull
    private static final List<Companion.MaskToName> DEBUG_MASK_BIT_NAMES;

    @NotNull
    private static final List<Companion.MaskToName> DEBUG_PREDEFINED_FILTERS_MASK_NAMES;

    @NotNull
    public static final DescriptorKindFilter FUNCTIONS;
    private static final int FUNCTIONS_MASK;

    @NotNull
    public static final DescriptorKindFilter NON_SINGLETON_CLASSIFIERS;
    private static final int NON_SINGLETON_CLASSIFIERS_MASK;

    @NotNull
    public static final DescriptorKindFilter PACKAGES;
    private static final int PACKAGES_MASK;

    @NotNull
    public static final DescriptorKindFilter SINGLETON_CLASSIFIERS;
    private static final int SINGLETON_CLASSIFIERS_MASK;

    @NotNull
    public static final DescriptorKindFilter TYPE_ALIASES;
    private static final int TYPE_ALIASES_MASK;

    @NotNull
    public static final DescriptorKindFilter VALUES;
    private static final int VALUES_MASK;

    @NotNull
    public static final DescriptorKindFilter VARIABLES;
    private static final int VARIABLES_MASK;
    private static int nextMaskValue;

    @NotNull
    private final List<DescriptorKindExclude> excludes;
    private final int kindMask;

    static {
        Companion.MaskToName maskToName;
        Companion.MaskToName maskToName2;
        Companion companion = new Companion(null);
        Companion = companion;
        nextMaskValue = 1;
        int nextMask = companion.nextMask();
        NON_SINGLETON_CLASSIFIERS_MASK = nextMask;
        int nextMask2 = companion.nextMask();
        SINGLETON_CLASSIFIERS_MASK = nextMask2;
        int nextMask3 = companion.nextMask();
        TYPE_ALIASES_MASK = nextMask3;
        int nextMask4 = companion.nextMask();
        PACKAGES_MASK = nextMask4;
        int nextMask5 = companion.nextMask();
        FUNCTIONS_MASK = nextMask5;
        int nextMask6 = companion.nextMask();
        VARIABLES_MASK = nextMask6;
        int nextMask7 = companion.nextMask() - 1;
        ALL_KINDS_MASK = nextMask7;
        int i = nextMask | nextMask2 | nextMask3;
        CLASSIFIERS_MASK = i;
        int i2 = nextMask2 | nextMask5 | nextMask6;
        VALUES_MASK = i2;
        int i3 = nextMask5 | nextMask6;
        CALLABLES_MASK = i3;
        ALL = new DescriptorKindFilter(nextMask7, null, 2, null);
        CALLABLES = new DescriptorKindFilter(i3, null, 2, null);
        NON_SINGLETON_CLASSIFIERS = new DescriptorKindFilter(nextMask, null, 2, null);
        SINGLETON_CLASSIFIERS = new DescriptorKindFilter(nextMask2, null, 2, null);
        TYPE_ALIASES = new DescriptorKindFilter(nextMask3, null, 2, null);
        CLASSIFIERS = new DescriptorKindFilter(i, null, 2, null);
        PACKAGES = new DescriptorKindFilter(nextMask4, null, 2, null);
        FUNCTIONS = new DescriptorKindFilter(nextMask5, null, 2, null);
        VARIABLES = new DescriptorKindFilter(nextMask6, null, 2, null);
        VALUES = new DescriptorKindFilter(i2, null, 2, null);
        Field[] fields = DescriptorKindFilter.class.getFields();
        fields.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            DescriptorKindFilter descriptorKindFilter = obj instanceof DescriptorKindFilter ? (DescriptorKindFilter) obj : null;
            if (descriptorKindFilter != null) {
                int i4 = descriptorKindFilter.kindMask;
                String name = field2.getName();
                name.getClass();
                maskToName2 = new Companion.MaskToName(i4, name);
            } else {
                maskToName2 = null;
            }
            if (maskToName2 != null) {
                arrayList2.add(maskToName2);
            }
        }
        DEBUG_PREDEFINED_FILTERS_MASK_NAMES = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        fields2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (Intrinsics.c(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            obj3.getClass();
            int intValue = ((Integer) obj3).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                name2.getClass();
                maskToName = new Companion.MaskToName(intValue, name2);
            } else {
                maskToName = null;
            }
            if (maskToName != null) {
                arrayList5.add(maskToName);
            }
        }
        DEBUG_MASK_BIT_NAMES = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorKindFilter(int i, @NotNull List<? extends DescriptorKindExclude> list) {
        list.getClass();
        this.excludes = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((DescriptorKindExclude) it.next()).getFullyExcludedDescriptorKinds();
        }
        this.kindMask = i;
    }

    public final boolean acceptsKinds(int i) {
        return (this.kindMask & i) != 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DescriptorKindFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        return Intrinsics.c(this.excludes, descriptorKindFilter.excludes) && this.kindMask == descriptorKindFilter.kindMask;
    }

    @NotNull
    public final List<DescriptorKindExclude> getExcludes() {
        return this.excludes;
    }

    public final int getKindMask() {
        return this.kindMask;
    }

    public int hashCode() {
        return (this.excludes.hashCode() * 31) + this.kindMask;
    }

    @Nullable
    public final DescriptorKindFilter restrictedToKindsOrNull(int i) {
        int i2 = i & this.kindMask;
        if (i2 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i2, this.excludes);
    }

    @NotNull
    public String toString() {
        Object obj;
        Iterator<T> it = DEBUG_PREDEFINED_FILTERS_MASK_NAMES.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Companion.MaskToName) obj).getMask() == this.kindMask) {
                break;
            }
        }
        Companion.MaskToName maskToName = (Companion.MaskToName) obj;
        String name = maskToName != null ? maskToName.getName() : null;
        if (name == null) {
            List<Companion.MaskToName> list = DEBUG_MASK_BIT_NAMES;
            ArrayList arrayList = new ArrayList();
            for (Companion.MaskToName maskToName2 : list) {
                String name2 = acceptsKinds(maskToName2.getMask()) ? maskToName2.getName() : null;
                if (name2 != null) {
                    arrayList.add(name2);
                }
            }
            name = CollectionsKt.f0(arrayList, " | ", null, null, null, 62);
        }
        return fc6.p(wt3.q("DescriptorKindFilter(", name, ", "), this.excludes, ')');
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class MaskToName {
            private final int mask;

            @NotNull
            private final String name;

            public MaskToName(int i, @NotNull String str) {
                str.getClass();
                this.mask = i;
                this.name = str;
            }

            public final int getMask() {
                return this.mask;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int nextMask() {
            int i = DescriptorKindFilter.nextMaskValue;
            DescriptorKindFilter.nextMaskValue <<= 1;
            return i;
        }

        public final int getALL_KINDS_MASK() {
            return DescriptorKindFilter.ALL_KINDS_MASK;
        }

        public final int getCLASSIFIERS_MASK() {
            return DescriptorKindFilter.CLASSIFIERS_MASK;
        }

        public final int getFUNCTIONS_MASK() {
            return DescriptorKindFilter.FUNCTIONS_MASK;
        }

        public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.NON_SINGLETON_CLASSIFIERS_MASK;
        }

        public final int getPACKAGES_MASK() {
            return DescriptorKindFilter.PACKAGES_MASK;
        }

        public final int getSINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.SINGLETON_CLASSIFIERS_MASK;
        }

        public final int getTYPE_ALIASES_MASK() {
            return DescriptorKindFilter.TYPE_ALIASES_MASK;
        }

        public final int getVARIABLES_MASK() {
            return DescriptorKindFilter.VARIABLES_MASK;
        }

        private Companion() {
        }
    }

    public DescriptorKindFilter(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? km5.a : list);
    }
}
