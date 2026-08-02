package ru.ozon.uni.ozi.components.heading;

import B90.C2618u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/components/heading/OziHeadingStatus;", "", "<init>", "()V", "Default", "Error", "Lru/ozon/uni/ozi/components/heading/OziHeadingStatus$Default;", "Lru/ozon/uni/ozi/components/heading/OziHeadingStatus$Error;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OziHeadingStatus {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/ozi/components/heading/OziHeadingStatus$Default;", "Lru/ozon/uni/ozi/components/heading/OziHeadingStatus;", "<init>", "()V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default extends OziHeadingStatus {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/ozi/components/heading/OziHeadingStatus$Error;", "Lru/ozon/uni/ozi/components/heading/OziHeadingStatus;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "message", "Ljava/lang/String;", "getMessage", "errorLineLimit", "I", "getErrorLineLimit", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends OziHeadingStatus {
        private final int errorLineLimit;

        @NotNull
        private final String message;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.d(this.message, error.message) && this.errorLineLimit == error.errorLineLimit;
        }

        public final int getErrorLineLimit() {
            return this.errorLineLimit;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return Integer.hashCode(this.errorLineLimit) + (this.message.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2618u.f(this.errorLineLimit, "Error(message=", this.message, ", errorLineLimit=", ")");
        }
    }

    public /* synthetic */ OziHeadingStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OziHeadingStatus() {
    }
}
