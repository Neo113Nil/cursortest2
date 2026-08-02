package ru.ozon.android.messenger.blocks.input.pickerlauncher;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f85555a = new a(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1110294505;
        }

        @NotNull
        public final String toString() {
            return "FileSizeExceeded";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f85556a = new b(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1307288455;
        }

        @NotNull
        public final String toString() {
            return "LimitExceeded";
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Throwable f85557a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Throwable throwable) {
            super(0);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f85557a = throwable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f85557a, ((c) obj).f85557a);
        }

        public final int hashCode() {
            return this.f85557a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Other(throwable=" + this.f85557a + ")";
        }
    }

    public static final class d extends e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f85558a = new d(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1157901292;
        }

        @NotNull
        public final String toString() {
            return "ZeroFileSize";
        }
    }

    public /* synthetic */ e(int i11) {
        this();
    }

    private e() {
    }
}
