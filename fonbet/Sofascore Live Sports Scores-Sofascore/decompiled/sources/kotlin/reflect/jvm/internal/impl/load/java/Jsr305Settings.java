package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.dmi;
import defpackage.joa;
import defpackage.lm5;
import defpackage.ypa;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class Jsr305Settings {

    @NotNull
    private final joa description$delegate;

    @NotNull
    private final ReportLevel globalLevel;
    private final boolean isDisabled;

    @Nullable
    private final ReportLevel migrationLevel;

    @NotNull
    private final Map<FqName, ReportLevel> userDefinedLevelForSpecificAnnotation;

    /* JADX WARN: Multi-variable type inference failed */
    public Jsr305Settings(@NotNull ReportLevel reportLevel, @Nullable ReportLevel reportLevel2, @NotNull Map<FqName, ? extends ReportLevel> map) {
        reportLevel.getClass();
        map.getClass();
        this.globalLevel = reportLevel;
        this.migrationLevel = reportLevel2;
        this.userDefinedLevelForSpecificAnnotation = map;
        this.description$delegate = ypa.b(new Jsr305Settings$description$2(this));
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.isDisabled = reportLevel == reportLevel3 && reportLevel2 == reportLevel3 && map.isEmpty();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.globalLevel == jsr305Settings.globalLevel && this.migrationLevel == jsr305Settings.migrationLevel && Intrinsics.c(this.userDefinedLevelForSpecificAnnotation, jsr305Settings.userDefinedLevelForSpecificAnnotation);
    }

    @NotNull
    public final ReportLevel getGlobalLevel() {
        return this.globalLevel;
    }

    @Nullable
    public final ReportLevel getMigrationLevel() {
        return this.migrationLevel;
    }

    @NotNull
    public final Map<FqName, ReportLevel> getUserDefinedLevelForSpecificAnnotation() {
        return this.userDefinedLevelForSpecificAnnotation;
    }

    public int hashCode() {
        int hashCode = this.globalLevel.hashCode() * 31;
        ReportLevel reportLevel = this.migrationLevel;
        return this.userDefinedLevelForSpecificAnnotation.hashCode() + ((hashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Jsr305Settings(globalLevel=");
        sb.append(this.globalLevel);
        sb.append(", migrationLevel=");
        sb.append(this.migrationLevel);
        sb.append(", userDefinedLevelForSpecificAnnotation=");
        return dmi.s(sb, this.userDefinedLevelForSpecificAnnotation, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, reportLevel2, map);
        reportLevel2 = (i & 2) != 0 ? null : reportLevel2;
        if ((i & 4) != 0) {
            map = lm5.a;
            map.getClass();
        }
    }
}
