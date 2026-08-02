package com.plaid.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class I2 {

    public static final class a extends I2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f39291a;

        public a(int i10) {
            this.f39291a = i10;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f39291a == ((a) obj).f39291a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f39291a);
        }

        @NotNull
        public final String toString() {
            return "Delay(delayMillis=" + this.f39291a + ")";
        }
    }

    public static final class b extends I2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f39292a = new b();
    }

    public static final class c extends I2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f39293a = new c();
    }

    public static final class d extends I2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f39294a = new d();
    }
}
