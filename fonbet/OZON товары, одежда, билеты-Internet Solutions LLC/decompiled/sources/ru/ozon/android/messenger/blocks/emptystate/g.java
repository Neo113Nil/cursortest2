package ru.ozon.android.messenger.blocks.emptystate;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface g {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        private final String f85100a;

        public a(String str) {
            this.f85100a = str;
        }

        public final String a() {
            return this.f85100a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f85100a, ((a) obj).f85100a);
        }

        public final int hashCode() {
            String str = this.f85100a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("AiAssistant(chatId="), this.f85100a, ")");
        }
    }
}
