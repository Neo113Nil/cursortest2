package ru.ozon.android.messenger.framework.domain.model;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface h {

    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f88844a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1752948434;
        }

        @NotNull
        public final String toString() {
            return "NothingToSend";
        }
    }

    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f88845a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -438178167;
        }

        @NotNull
        public final String toString() {
            return "Resent";
        }
    }

    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f88846a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f88847b;

        public c(boolean z11, boolean z12) {
            this.f88846a = z11;
            this.f88847b = z12;
        }

        public final boolean a() {
            return this.f88846a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f88846a == cVar.f88846a && this.f88847b == cVar.f88847b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f88847b) + (Boolean.hashCode(this.f88846a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Sent(lastBlockInserted=");
            sb2.append(this.f88846a);
            sb2.append(", nonLastItemInserted=");
            return Pk0.a.a(")", sb2, this.f88847b);
        }
    }
}
