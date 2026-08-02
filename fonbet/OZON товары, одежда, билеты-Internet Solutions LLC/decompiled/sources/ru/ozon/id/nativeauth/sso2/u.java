package ru.ozon.id.nativeauth.sso2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f97476a;

    public static final class a extends u {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Throwable f97477b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String domain, @NotNull Throwable throwable) {
            super(domain);
            Intrinsics.checkNotNullParameter(domain, "domain");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f97477b = throwable;
        }

        @NotNull
        public final Throwable b() {
            return this.f97477b;
        }
    }

    public static final class b extends u {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String domain) {
            super(domain);
            Intrinsics.checkNotNullParameter(domain, "domain");
        }
    }

    public static final class c extends u {

        /* renamed from: b, reason: collision with root package name */
        private final String f97478b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f97479c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String domain, String str, boolean z11) {
            super(domain);
            Intrinsics.checkNotNullParameter(domain, "domain");
            this.f97478b = str;
            this.f97479c = z11;
        }

        public final String b() {
            return this.f97478b;
        }

        public final boolean c() {
            return this.f97479c;
        }
    }

    public static final class d extends u {
    }

    public u(String str) {
        this.f97476a = str;
    }

    @NotNull
    public final String a() {
        return this.f97476a;
    }
}
