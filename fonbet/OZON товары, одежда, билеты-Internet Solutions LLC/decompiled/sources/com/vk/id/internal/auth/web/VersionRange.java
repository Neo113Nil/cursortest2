package com.vk.id.internal.auth.web;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/vk/id/internal/auth/web/VersionRange;", "", "lowerBound", "Lcom/vk/id/internal/auth/web/DelimitedVersion;", "upperBound", "<init>", "(Lcom/vk/id/internal/auth/web/DelimitedVersion;Lcom/vk/id/internal/auth/web/DelimitedVersion;)V", "matches", "", "version", "", "toString", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VersionRange {
    private final DelimitedVersion lowerBound;
    private final DelimitedVersion upperBound;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final VersionRange ANY_VERSION = new VersionRange(null, null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vk/id/internal/auth/web/VersionRange$Companion;", "", "<init>", "()V", "Lcom/vk/id/internal/auth/web/DelimitedVersion;", "version", "Lcom/vk/id/internal/auth/web/VersionRange;", "atLeast", "(Lcom/vk/id/internal/auth/web/DelimitedVersion;)Lcom/vk/id/internal/auth/web/VersionRange;", "ANY_VERSION", "Lcom/vk/id/internal/auth/web/VersionRange;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VersionRange atLeast(DelimitedVersion version) {
            return new VersionRange(version, null);
        }

        private Companion() {
        }
    }

    public VersionRange(DelimitedVersion delimitedVersion, DelimitedVersion delimitedVersion2) {
        this.lowerBound = delimitedVersion;
        this.upperBound = delimitedVersion2;
    }

    public final boolean matches(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return matches(DelimitedVersion.INSTANCE.parse(version));
    }

    @NotNull
    public String toString() {
        DelimitedVersion delimitedVersion = this.lowerBound;
        if (delimitedVersion == null) {
            DelimitedVersion delimitedVersion2 = this.upperBound;
            if (delimitedVersion2 == null) {
                return "any version";
            }
            return delimitedVersion2 + " or lower";
        }
        DelimitedVersion delimitedVersion3 = this.upperBound;
        if (delimitedVersion3 == null) {
            return delimitedVersion + " or higher";
        }
        return "between " + delimitedVersion + " and " + delimitedVersion3;
    }

    public final boolean matches(@NotNull DelimitedVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        DelimitedVersion delimitedVersion = this.lowerBound;
        if (delimitedVersion != null && delimitedVersion.compareTo(version) > 0) {
            return false;
        }
        DelimitedVersion delimitedVersion2 = this.upperBound;
        return delimitedVersion2 == null || delimitedVersion2.compareTo(version) >= 0;
    }
}
