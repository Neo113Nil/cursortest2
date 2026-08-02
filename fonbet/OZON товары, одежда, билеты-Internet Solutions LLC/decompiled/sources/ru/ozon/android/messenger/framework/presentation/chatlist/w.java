package ru.ozon.android.messenger.framework.presentation.chatlist;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class w {

    public static final class a extends w {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f90759a;

        public a(boolean z11) {
            super(z11);
            this.f90759a = z11;
        }

        @Override // ru.ozon.android.messenger.framework.presentation.chatlist.w
        public final boolean a() {
            return this.f90759a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f90759a == ((a) obj).f90759a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f90759a);
        }

        @NotNull
        public final String toString() {
            return Pk0.a.a(")", new StringBuilder("Default(isLoading="), this.f90759a);
        }
    }

    public static final class b extends w {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f90760a;

        public b(boolean z11) {
            super(z11);
            this.f90760a = z11;
        }

        @Override // ru.ozon.android.messenger.framework.presentation.chatlist.w
        public final boolean a() {
            return this.f90760a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f90760a == ((b) obj).f90760a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f90760a);
        }

        @NotNull
        public final String toString() {
            return Pk0.a.a(")", new StringBuilder("Transparent(isLoading="), this.f90760a);
        }
    }

    public w(boolean z11) {
    }

    public abstract boolean a();
}
