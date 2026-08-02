package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.o6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3710o6 {

    /* renamed from: com.plaid.internal.o6$a */
    public static final class a extends AbstractC3710o6 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f40920a = new a();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 637371670;
        }

        @NotNull
        public final String toString() {
            return "NotReady";
        }
    }

    /* renamed from: com.plaid.internal.o6$b */
    public static final class b extends AbstractC3710o6 {
        public b(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
        }
    }

    /* renamed from: com.plaid.internal.o6$c */
    public static final class c extends AbstractC3710o6 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f40921a;

        public c(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f40921a = url;
        }

        @NotNull
        public final String a() {
            return this.f40921a;
        }
    }

    /* renamed from: com.plaid.internal.o6$d */
    public static final class d extends AbstractC3710o6 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f40922a = new d();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1655299293;
        }

        @NotNull
        public final String toString() {
            return "Ready";
        }
    }
}
