package ru.ozon.android.messenger.framework.domain.model;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface f {

    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f88808a;

        public a(@NotNull String chatId) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            this.f88808a = chatId;
        }

        @NotNull
        public final String a() {
            return this.f88808a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f88808a, ((a) obj).f88808a);
        }

        public final int hashCode() {
            return this.f88808a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("ByChatId(chatId="), this.f88808a, ")");
        }
    }

    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f88809a;

        public b(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f88809a = id2;
        }

        @NotNull
        public final String a() {
            return this.f88809a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f88809a, ((b) obj).f88809a);
        }

        public final int hashCode() {
            return this.f88809a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("ById(id="), this.f88809a, ")");
        }
    }

    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f88810a;

        public c(@NotNull String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            this.f88810a = messageId;
        }

        @NotNull
        public final String a() {
            return this.f88810a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f88810a, ((c) obj).f88810a);
        }

        public final int hashCode() {
            return this.f88810a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("UndeliveredById(messageId="), this.f88810a, ")");
        }
    }
}
