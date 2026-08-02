package com.plaid.internal;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.i4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3654i4<T, U> {

    /* renamed from: com.plaid.internal.i4$a */
    public static final class a<U> extends AbstractC3654i4 {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public final U f40673a;

        /* renamed from: b, reason: collision with root package name */
        public final int f40674b;

        public a(@Nullable U u10, int i10) {
            this.f40673a = u10;
            this.f40674b = i10;
        }

        public final int b() {
            return this.f40674b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f40673a, aVar.f40673a) && this.f40674b == aVar.f40674b;
        }

        public final int hashCode() {
            U u10 = this.f40673a;
            return Integer.hashCode(this.f40674b) + ((u10 == null ? 0 : u10.hashCode()) * 31);
        }

        @NotNull
        public final String toString() {
            return "HttpError(body=" + this.f40673a + ", code=" + this.f40674b + ")";
        }
    }

    /* renamed from: com.plaid.internal.i4$b */
    public static final class b extends AbstractC3654i4 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final IOException f40675a;

        public b(@NotNull IOException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f40675a = error;
        }

        @NotNull
        public final IOException b() {
            return this.f40675a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f40675a, ((b) obj).f40675a);
        }

        public final int hashCode() {
            return this.f40675a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "NetworkError(error=" + this.f40675a + ")";
        }
    }

    /* renamed from: com.plaid.internal.i4$c */
    public static final class c<T> extends AbstractC3654i4 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final T f40676a;

        public c(@NotNull T body) {
            Intrinsics.checkNotNullParameter(body, "body");
            this.f40676a = body;
        }

        @NotNull
        public final T b() {
            return this.f40676a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f40676a, ((c) obj).f40676a);
        }

        public final int hashCode() {
            return this.f40676a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(body=" + this.f40676a + ")";
        }
    }

    /* renamed from: com.plaid.internal.i4$d */
    public static final class d extends AbstractC3654i4 {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public final Throwable f40677a;

        public d(@Nullable Throwable th2) {
            this.f40677a = th2;
        }

        @Nullable
        public final Throwable b() {
            return this.f40677a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f40677a, ((d) obj).f40677a);
        }

        public final int hashCode() {
            Throwable th2 = this.f40677a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @NotNull
        public final String toString() {
            return "UnknownError(error=" + this.f40677a + ")";
        }
    }

    public final boolean a() {
        return !(this instanceof c);
    }
}
