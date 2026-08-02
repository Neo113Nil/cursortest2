package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.w7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3782w7 extends Exception {

    /* renamed from: com.plaid.internal.w7$a */
    public static final class a extends AbstractC3782w7 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f41171a = new a();

        public a() {
            super("Cellular network not available.", "ConnectivityManager established that a cellular network is not available, running on a simulator or a device with no sim card is no supported.", null, 4);
        }
    }

    /* renamed from: com.plaid.internal.w7$b */
    public static final class b extends AbstractC3782w7 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f41172a = new b();

        public b() {
            super("Invalid URL, please check the format.", "Unable to convert the URL string to an URL object.", null, 4);
        }
    }

    /* renamed from: com.plaid.internal.w7$c */
    public static final class c extends AbstractC3782w7 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final Exception f41173a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Exception exception) {
            super("Networking error, cause: " + exception.getMessage(), null, exception, 2);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f41173a = exception;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f41173a, ((c) obj).f41173a);
        }

        public final int hashCode() {
            return this.f41173a.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public final String toString() {
            return "NetworkRequestException(exception=" + this.f41173a + ')';
        }
    }

    /* renamed from: com.plaid.internal.w7$d */
    public static final class d extends AbstractC3782w7 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f41174a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String result) {
            super("Unable to get a valid result from the requested URL (" + result + ").", "Unable to get a redirection path or a result path from the URL, probably the SNAURL is corrupted (or maybe expired).", null, 4);
            Intrinsics.checkNotNullParameter(result, "result");
            this.f41174a = result;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f41174a, ((d) obj).f41174a);
        }

        public final int hashCode() {
            return this.f41174a.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public final String toString() {
            return "NoResultFromUrl(result=" + this.f41174a + ')';
        }
    }

    /* renamed from: com.plaid.internal.w7$e */
    public static final class e extends AbstractC3782w7 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f41175a = new e();

        public e() {
            super("Can't run inside main thread.", null, null, 6);
        }
    }

    /* renamed from: com.plaid.internal.w7$f */
    public static final class f extends AbstractC3782w7 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final Exception f41176a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull Exception exception) {
            super("Unexpected error happened: " + exception.getMessage() + '.', null, null, 6);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f41176a = exception;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f41176a, ((f) obj).f41176a);
        }

        public final int hashCode() {
            return this.f41176a.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public final String toString() {
            return "UnexpectedException(exception=" + this.f41176a + ')';
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC3782w7(String str, String str2, Exception exc, int i10) {
        super(StringsKt.trimIndent(r6.toString()), exc);
        str2 = (i10 & 2) != 0 ? null : str2;
        exc = (i10 & 4) != 0 ? null : exc;
        StringBuilder sb2 = new StringBuilder("\n    ");
        sb2.append(str);
        sb2.append("\n    TechnicalError: ");
        sb2.append(str2 == null ? "Undefined" : str2);
        sb2.append("\n  ");
    }
}
