package ru.ozon.android.messenger.framework.data.requests;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f88659c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f88660d;

    public c() {
        this(true);
    }

    @Override // ru.ozon.android.messenger.framework.data.requests.e
    @NotNull
    public final Map<String, Object> b() {
        return this.f88660d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f88659c == ((c) obj).f88659c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88659c);
    }

    @NotNull
    public final String toString() {
        return Pk0.a.a(")", new StringBuilder("InitializeChatRequest(appendAnalytics="), this.f88659c);
    }

    public c(boolean z11) {
        super(d.INITIALIZE_CHAT, null, 6);
        this.f88659c = z11;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z11) {
            linkedHashMap.put("withAnalytics", Boolean.TRUE);
        }
        this.f88660d = linkedHashMap;
    }
}
