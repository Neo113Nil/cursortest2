package ru.ozon.android.messenger.framework.data.requests;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class h extends e {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f88668c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CHAT_ACTIVE;
        public static final a CHAT_LEAVE;

        static {
            a aVar = new a("CHAT_ACTIVE", 0);
            CHAT_ACTIVE = aVar;
            a aVar2 = new a("CHAT_LEAVE", 1);
            CHAT_LEAVE = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull a currentState, @NotNull String id2, boolean z11) {
        super(d.SET_STATE, id2, 4);
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f88668c = U.j(new Pair("type", currentState), new Pair("chatId", id2), new Pair("isPushEnabled", Boolean.valueOf(z11)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // ru.ozon.android.messenger.framework.data.requests.e
    @NotNull
    public final Map<String, Object> b() {
        return this.f88668c;
    }
}
