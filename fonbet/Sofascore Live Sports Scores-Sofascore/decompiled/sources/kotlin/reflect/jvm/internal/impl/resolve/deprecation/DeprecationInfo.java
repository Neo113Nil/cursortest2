package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class DeprecationInfo implements Comparable<DeprecationInfo> {
    @Override // java.lang.Comparable
    public int compareTo(@NotNull DeprecationInfo deprecationInfo) {
        deprecationInfo.getClass();
        int compareTo = getDeprecationLevel().compareTo(deprecationInfo.getDeprecationLevel());
        if (compareTo == 0 && !getPropagatesToOverrides() && deprecationInfo.getPropagatesToOverrides()) {
            return 1;
        }
        return compareTo;
    }

    @NotNull
    public abstract DeprecationLevelValue getDeprecationLevel();

    public abstract boolean getPropagatesToOverrides();
}
