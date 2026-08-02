package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class D6 {

    public static final class a extends D6 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f39206a;

        public a(@NotNull String receivedRedirectUri) {
            Intrinsics.checkNotNullParameter(receivedRedirectUri, "receivedRedirectUri");
            this.f39206a = receivedRedirectUri;
        }

        @NotNull
        public final String a() {
            return this.f39206a;
        }

        @NotNull
        public final String toString() {
            return "OAuth";
        }
    }

    public static final class b extends D6 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f39207a;

        public b(@NotNull String receivedRedirectUri) {
            Intrinsics.checkNotNullParameter(receivedRedirectUri, "receivedRedirectUri");
            this.f39207a = receivedRedirectUri;
        }

        @NotNull
        public final String toString() {
            return "OutOfProcess";
        }
    }

    public static final class c extends D6 {
        @NotNull
        public final String toString() {
            return "OutOfProcessClosed";
        }
    }

    public static final class d extends D6 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final Exception f39208a;

        public d(@NotNull Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f39208a = exception;
        }

        @NotNull
        public final Exception a() {
            return this.f39208a;
        }

        @NotNull
        public final String toString() {
            return "RedirectError";
        }
    }

    public static final class e extends D6 {
        @NotNull
        public final String toString() {
            return "ResumeInProcess";
        }
    }
}
