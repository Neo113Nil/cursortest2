package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.dmi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class IncompatibleVersionErrorData<T> {
    private final T actualVersion;

    @NotNull
    private final ClassId classId;
    private final T compilerVersion;
    private final T expectedVersion;

    @NotNull
    private final String filePath;
    private final T languageVersion;

    public IncompatibleVersionErrorData(T t, T t2, T t3, T t4, @NotNull String str, @NotNull ClassId classId) {
        str.getClass();
        classId.getClass();
        this.actualVersion = t;
        this.compilerVersion = t2;
        this.languageVersion = t3;
        this.expectedVersion = t4;
        this.filePath = str;
        this.classId = classId;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.c(this.actualVersion, incompatibleVersionErrorData.actualVersion) && Intrinsics.c(this.compilerVersion, incompatibleVersionErrorData.compilerVersion) && Intrinsics.c(this.languageVersion, incompatibleVersionErrorData.languageVersion) && Intrinsics.c(this.expectedVersion, incompatibleVersionErrorData.expectedVersion) && Intrinsics.c(this.filePath, incompatibleVersionErrorData.filePath) && Intrinsics.c(this.classId, incompatibleVersionErrorData.classId);
    }

    public int hashCode() {
        T t = this.actualVersion;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.compilerVersion;
        int hashCode2 = (hashCode + (t2 == null ? 0 : t2.hashCode())) * 31;
        T t3 = this.languageVersion;
        int hashCode3 = (hashCode2 + (t3 == null ? 0 : t3.hashCode())) * 31;
        T t4 = this.expectedVersion;
        return this.classId.hashCode() + dmi.c((hashCode3 + (t4 != null ? t4.hashCode() : 0)) * 31, 31, this.filePath);
    }

    @NotNull
    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.actualVersion + ", compilerVersion=" + this.compilerVersion + ", languageVersion=" + this.languageVersion + ", expectedVersion=" + this.expectedVersion + ", filePath=" + this.filePath + ", classId=" + this.classId + ')';
    }
}
