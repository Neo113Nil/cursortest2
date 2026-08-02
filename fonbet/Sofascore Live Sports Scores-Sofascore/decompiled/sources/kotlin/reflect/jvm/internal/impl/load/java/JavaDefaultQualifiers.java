package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.lnb;
import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JavaDefaultQualifiers {
    private final boolean definitelyNotNull;

    @NotNull
    private final NullabilityQualifierWithMigrationStatus nullabilityQualifier;

    @NotNull
    private final Collection<AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes;

    public /* synthetic */ JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifierWithMigrationStatus, collection, (i & 4) != 0 ? nullabilityQualifierWithMigrationStatus.getQualifier() == NullabilityQualifier.NOT_NULL : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaDefaultQualifiers copy$default(JavaDefaultQualifiers javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifierWithMigrationStatus = javaDefaultQualifiers.nullabilityQualifier;
        }
        if ((i & 2) != 0) {
            collection = javaDefaultQualifiers.qualifierApplicabilityTypes;
        }
        if ((i & 4) != 0) {
            z = javaDefaultQualifiers.definitelyNotNull;
        }
        return javaDefaultQualifiers.copy(nullabilityQualifierWithMigrationStatus, collection, z);
    }

    @NotNull
    public final JavaDefaultQualifiers copy(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @NotNull Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z) {
        nullabilityQualifierWithMigrationStatus.getClass();
        collection.getClass();
        return new JavaDefaultQualifiers(nullabilityQualifierWithMigrationStatus, collection, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaDefaultQualifiers)) {
            return false;
        }
        JavaDefaultQualifiers javaDefaultQualifiers = (JavaDefaultQualifiers) obj;
        return Intrinsics.c(this.nullabilityQualifier, javaDefaultQualifiers.nullabilityQualifier) && Intrinsics.c(this.qualifierApplicabilityTypes, javaDefaultQualifiers.qualifierApplicabilityTypes) && this.definitelyNotNull == javaDefaultQualifiers.definitelyNotNull;
    }

    public final boolean getDefinitelyNotNull() {
        return this.definitelyNotNull;
    }

    @NotNull
    public final NullabilityQualifierWithMigrationStatus getNullabilityQualifier() {
        return this.nullabilityQualifier;
    }

    @NotNull
    public final Collection<AnnotationQualifierApplicabilityType> getQualifierApplicabilityTypes() {
        return this.qualifierApplicabilityTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.qualifierApplicabilityTypes.hashCode() + (this.nullabilityQualifier.hashCode() * 31)) * 31;
        boolean z = this.definitelyNotNull;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.nullabilityQualifier);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.qualifierApplicabilityTypes);
        sb.append(", definitelyNotNull=");
        return lnb.r(sb, this.definitelyNotNull, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaDefaultQualifiers(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @NotNull Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z) {
        nullabilityQualifierWithMigrationStatus.getClass();
        collection.getClass();
        this.nullabilityQualifier = nullabilityQualifierWithMigrationStatus;
        this.qualifierApplicabilityTypes = collection;
        this.definitelyNotNull = z;
    }
}
