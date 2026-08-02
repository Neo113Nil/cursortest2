package ru.ozon.android.messenger.framework.data.requests;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f88661a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f88662b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NO_RECONNECT_NO_RETRY;
        public static final a RECONNECT_AND_RETRY;
        public static final a RECONNECT_WITHOUT_RETRY;

        static {
            a aVar = new a("RECONNECT_AND_RETRY", 0);
            RECONNECT_AND_RETRY = aVar;
            a aVar2 = new a("RECONNECT_WITHOUT_RETRY", 1);
            RECONNECT_WITHOUT_RETRY = aVar2;
            a aVar3 = new a("NO_RECONNECT_NO_RETRY", 2);
            NO_RECONNECT_NO_RETRY = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
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

    public e(d method, String key, int i11) {
        key = (i11 & 2) != 0 ? "" : key;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f88661a = method;
        this.f88662b = a.RECONNECT_AND_RETRY;
    }

    @NotNull
    public final d a() {
        return this.f88661a;
    }

    @NotNull
    public abstract Map<String, Object> b();

    @NotNull
    public a c() {
        return this.f88662b;
    }
}
