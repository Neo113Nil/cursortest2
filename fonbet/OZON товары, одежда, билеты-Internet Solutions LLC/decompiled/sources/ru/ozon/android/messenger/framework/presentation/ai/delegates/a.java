package ru.ozon.android.messenger.framework.presentation.ai.delegates;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC1654a f89544a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.delegates.a$a, reason: collision with other inner class name */
    public static final class EnumC1654a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC1654a[] $VALUES;
        public static final EnumC1654a CONVERSATION;

        @NotNull
        public static final C1655a Companion;
        public static final EnumC1654a EMPTY_STATE;

        @NotNull
        private final String state;

        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.delegates.a$a$a, reason: collision with other inner class name */
        public static final class C1655a {
        }

        static {
            EnumC1654a enumC1654a = new EnumC1654a("EMPTY_STATE", 0, "emptyState");
            EMPTY_STATE = enumC1654a;
            EnumC1654a enumC1654a2 = new EnumC1654a("CONVERSATION", 1, "conversation");
            CONVERSATION = enumC1654a2;
            EnumC1654a[] enumC1654aArr = {enumC1654a, enumC1654a2};
            $VALUES = enumC1654aArr;
            $ENTRIES = Xc.b.a(enumC1654aArr);
            Companion = new C1655a();
        }

        private EnumC1654a(String str, int i11, String str2) {
            this.state = str2;
        }

        @NotNull
        public static Xc.a<EnumC1654a> a() {
            return $ENTRIES;
        }

        public static EnumC1654a valueOf(String str) {
            return (EnumC1654a) Enum.valueOf(EnumC1654a.class, str);
        }

        public static EnumC1654a[] values() {
            return (EnumC1654a[]) $VALUES.clone();
        }

        @NotNull
        public final String b() {
            return this.state;
        }
    }

    public a(@NotNull EnumC1654a chatStateKey) {
        Intrinsics.checkNotNullParameter(chatStateKey, "chatStateKey");
        this.f89544a = chatStateKey;
    }

    @NotNull
    public final EnumC1654a a() {
        return this.f89544a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f89544a == ((a) obj).f89544a;
    }

    public final int hashCode() {
        return this.f89544a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AiAssistantContext(chatStateKey=" + this.f89544a + ")";
    }
}
