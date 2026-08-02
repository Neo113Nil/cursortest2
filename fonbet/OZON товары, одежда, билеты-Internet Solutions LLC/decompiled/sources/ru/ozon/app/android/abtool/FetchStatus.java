package ru.ozon.app.android.abtool;

import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/abtool/FetchStatus;", "", "<init>", "()V", "None", "Succeed", "Error", "abzone-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class FetchStatus {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/abtool/FetchStatus$Error;", "Lru/ozon/app/android/abtool/FetchStatus;", "", "t", "<init>", "(Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getT", "()Ljava/lang/Throwable;", "abzone-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Error extends FetchStatus {
        private final Throwable t;

        public Error(Throwable th2) {
            this.t = th2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Error) {
                return Intrinsics.d(this.t, ((Error) other).t);
            }
            return false;
        }

        public int hashCode() {
            Throwable th2 = this.t;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            Class superclass = Error.class.getSuperclass();
            return (superclass != null ? superclass.getSimpleName() : null) + "." + Error.class.getSimpleName() + "(t=" + this.t + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/abtool/FetchStatus$None;", "Lru/ozon/app/android/abtool/FetchStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "abzone-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends FetchStatus {
        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return 0;
        }

        @NotNull
        public String toString() {
            Class superclass = None.class.getSuperclass();
            return g.c(superclass != null ? superclass.getSimpleName() : null, ".", None.class.getSimpleName());
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/abtool/FetchStatus$Succeed;", "Lru/ozon/app/android/abtool/FetchStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "abzone-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Succeed extends FetchStatus {
        public boolean equals(Object other) {
            return this == other || (other instanceof Succeed);
        }

        public int hashCode() {
            return 1;
        }

        @NotNull
        public String toString() {
            Class superclass = Succeed.class.getSuperclass();
            return g.c(superclass != null ? superclass.getSimpleName() : null, ".", Succeed.class.getSimpleName());
        }
    }
}
