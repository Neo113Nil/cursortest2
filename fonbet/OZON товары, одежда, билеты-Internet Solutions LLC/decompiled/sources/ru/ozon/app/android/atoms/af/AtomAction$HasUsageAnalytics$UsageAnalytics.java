package ru.ozon.app.android.atoms.af;

import B0.A0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"ru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics", "", "", "rawBehavior", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRawBehavior", "Companion", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AtomAction$HasUsageAnalytics$UsageAnalytics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String rawBehavior;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "rawBehavior", "", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AtomAction$HasUsageAnalytics$UsageAnalytics create(String rawBehavior) {
            if (rawBehavior != null) {
                return new AtomAction$HasUsageAnalytics$UsageAnalytics(rawBehavior);
            }
            return null;
        }

        private Companion() {
        }
    }

    public AtomAction$HasUsageAnalytics$UsageAnalytics(@NotNull String rawBehavior) {
        Intrinsics.checkNotNullParameter(rawBehavior, "rawBehavior");
        this.rawBehavior = rawBehavior;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AtomAction$HasUsageAnalytics$UsageAnalytics) && Intrinsics.d(this.rawBehavior, ((AtomAction$HasUsageAnalytics$UsageAnalytics) other).rawBehavior);
    }

    public int hashCode() {
        return this.rawBehavior.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("UsageAnalytics(rawBehavior=", this.rawBehavior, ")");
    }
}
