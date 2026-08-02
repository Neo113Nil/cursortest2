package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.jka;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JavaNullabilityAnnotationsStatus {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final JavaNullabilityAnnotationsStatus DEFAULT = new JavaNullabilityAnnotationsStatus(ReportLevel.STRICT, null, null, 6, null);

    @NotNull
    private final ReportLevel reportLevelAfter;

    @NotNull
    private final ReportLevel reportLevelBefore;

    @Nullable
    private final jka sinceVersion;

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, jka jkaVar, ReportLevel reportLevel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? new jka(1, 0, 0) : jkaVar, (i & 4) != 0 ? reportLevel : reportLevel2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
        return this.reportLevelBefore == javaNullabilityAnnotationsStatus.reportLevelBefore && Intrinsics.c(this.sinceVersion, javaNullabilityAnnotationsStatus.sinceVersion) && this.reportLevelAfter == javaNullabilityAnnotationsStatus.reportLevelAfter;
    }

    @NotNull
    public final ReportLevel getReportLevelAfter() {
        return this.reportLevelAfter;
    }

    @NotNull
    public final ReportLevel getReportLevelBefore() {
        return this.reportLevelBefore;
    }

    @Nullable
    public final jka getSinceVersion() {
        return this.sinceVersion;
    }

    public int hashCode() {
        int hashCode = this.reportLevelBefore.hashCode() * 31;
        jka jkaVar = this.sinceVersion;
        return this.reportLevelAfter.hashCode() + ((hashCode + (jkaVar == null ? 0 : jkaVar.d)) * 31);
    }

    @NotNull
    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.reportLevelBefore + ", sinceVersion=" + this.sinceVersion + ", reportLevelAfter=" + this.reportLevelAfter + ')';
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JavaNullabilityAnnotationsStatus getDEFAULT() {
            return JavaNullabilityAnnotationsStatus.DEFAULT;
        }

        private Companion() {
        }
    }

    public JavaNullabilityAnnotationsStatus(@NotNull ReportLevel reportLevel, @Nullable jka jkaVar, @NotNull ReportLevel reportLevel2) {
        reportLevel.getClass();
        reportLevel2.getClass();
        this.reportLevelBefore = reportLevel;
        this.sinceVersion = jkaVar;
        this.reportLevelAfter = reportLevel2;
    }
}
