package ru.ozon.android.messenger.framework.data.requests.ai;

import Xc.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.requests.d;
import ru.ozon.android.messenger.framework.data.requests.e;

/* loaded from: classes10.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f88649c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ru.ozon.android.messenger.framework.data.requests.ai.a$a, reason: collision with other inner class name */
    public static final class EnumC1632a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC1632a[] $VALUES;
        public static final EnumC1632a CHAT_ACTIVE;
        public static final EnumC1632a CHAT_LEAVE;

        static {
            EnumC1632a enumC1632a = new EnumC1632a("CHAT_ACTIVE", 0);
            CHAT_ACTIVE = enumC1632a;
            EnumC1632a enumC1632a2 = new EnumC1632a("CHAT_LEAVE", 1);
            CHAT_LEAVE = enumC1632a2;
            EnumC1632a[] enumC1632aArr = {enumC1632a, enumC1632a2};
            $VALUES = enumC1632aArr;
            $ENTRIES = b.a(enumC1632aArr);
        }

        private EnumC1632a() {
            throw null;
        }

        public static EnumC1632a valueOf(String str) {
            return (EnumC1632a) Enum.valueOf(EnumC1632a.class, str);
        }

        public static EnumC1632a[] values() {
            return (EnumC1632a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull EnumC1632a currentState, Map<String, String> map) {
        super(d.SET_STATE, null, 6);
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        this.f88649c = U.m(U.i(new Pair("type", currentState)), map == null ? U.c() : map);
    }

    @Override // ru.ozon.android.messenger.framework.data.requests.e
    @NotNull
    public final Map<String, Object> b() {
        return this.f88649c;
    }
}
