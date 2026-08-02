package ru.ozon.android.messenger.framework.navigation.action;

import C.o0;
import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class c {

    public static final class a extends c {
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, String> f89163a;

        public b(Map<String, String> map) {
            super(0);
            this.f89163a = map;
        }

        public final Map<String, String> a() {
            return this.f89163a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f89163a, ((b) obj).f89163a);
        }

        public final int hashCode() {
            Map<String, String> map = this.f89163a;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @NotNull
        public final String toString() {
            return P.f(new StringBuilder("PerformAiRefresh(params="), this.f89163a, ")");
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.navigation.action.c$c, reason: collision with other inner class name */
    public static final class C1640c extends c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f89164a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1640c(@NotNull String itemId) {
            super(0);
            Intrinsics.checkNotNullParameter(itemId, "itemId");
            this.f89164a = itemId;
        }

        @NotNull
        public final String a() {
            return this.f89164a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1640c) && Intrinsics.d(this.f89164a, ((C1640c) obj).f89164a);
        }

        public final int hashCode() {
            return this.f89164a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("ProductAddedToCart(itemId="), this.f89164a, ")");
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f89165a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String itemId) {
            super(0);
            Intrinsics.checkNotNullParameter(itemId, "itemId");
            this.f89165a = itemId;
        }

        @NotNull
        public final String a() {
            return this.f89165a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.d(this.f89165a, ((d) obj).f89165a);
        }

        public final int hashCode() {
            return this.f89165a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("ProductAddedToFavorite(itemId="), this.f89165a, ")");
        }
    }

    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f89166a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f89167b;

        /* renamed from: c, reason: collision with root package name */
        private final String f89168c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull String message, Integer num, String str) {
            super(0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f89166a = message;
            this.f89167b = num;
            this.f89168c = str;
        }

        public final Integer a() {
            return this.f89167b;
        }

        @NotNull
        public final CharSequence b() {
            return this.f89166a;
        }

        public final String c() {
            return this.f89168c;
        }
    }

    public c(int i11) {
    }
}
