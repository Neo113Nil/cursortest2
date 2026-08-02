package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import defpackage.a70;
import defpackage.km5;
import defpackage.lh0;
import defpackage.lnb;
import defpackage.ph0;
import defpackage.wv8;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int major;
    private final int minor;

    @NotNull
    private final int[] numbers;
    private final int patch;

    @NotNull
    private final List<Integer> rest;

    public BinaryVersion(@NotNull int... iArr) {
        List<Integer> list;
        iArr.getClass();
        this.numbers = iArr;
        Integer E = ph0.E(0, iArr);
        this.major = E != null ? E.intValue() : -1;
        Integer E2 = ph0.E(1, iArr);
        this.minor = E2 != null ? E2.intValue() : -1;
        Integer E3 = ph0.E(2, iArr);
        this.patch = E3 != null ? E3.intValue() : -1;
        if (iArr.length <= 3) {
            list = km5.a;
        } else {
            if (iArr.length > 1024) {
                a70.p(wv8.j(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
                throw null;
            }
            list = CollectionsKt.S0(new lh0(iArr).subList(3, iArr.length));
        }
        this.rest = list;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && Intrinsics.c(this.rest, binaryVersion.rest);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public int hashCode() {
        int i = this.major;
        int i2 = (i * 31) + this.minor + i;
        int i3 = (i2 * 31) + this.patch + i2;
        return this.rest.hashCode() + (i3 * 31) + i3;
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4 = this.major;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.minor;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.patch >= i3;
    }

    public final boolean isAtMost(int i, int i2, int i3) {
        int i4 = this.major;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.minor;
        if (i5 < i2) {
            return true;
        }
        return i5 <= i2 && this.patch <= i3;
    }

    public final boolean isCompatibleTo(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        int i = this.major;
        return i == 0 ? binaryVersion.major == 0 && this.minor == binaryVersion.minor : i == binaryVersion.major && this.minor <= binaryVersion.minor;
    }

    @NotNull
    public final int[] toArray() {
        return this.numbers;
    }

    @NotNull
    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        int length = array.length;
        int i = 0;
        while (i < length) {
            int i2 = array[i];
            if (i2 == -1) {
                break;
            }
            i = lnb.f(i2, arrayList, i, 1);
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.f0(arrayList, ".", null, null, null, 62);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final boolean isAtLeast(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return isAtLeast(binaryVersion.major, binaryVersion.minor, binaryVersion.patch);
    }
}
