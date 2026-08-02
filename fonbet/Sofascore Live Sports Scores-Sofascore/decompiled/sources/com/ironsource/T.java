package com.ironsource;

import com.ironsource.Q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class T implements Q, Q.a {

    @NotNull
    private final ReadWriteLock a;

    @NotNull
    private final Map<String, P> b;

    public T(@NotNull ReadWriteLock readWriteLock) {
        readWriteLock.getClass();
        this.a = readWriteLock;
        this.b = new LinkedHashMap();
    }

    @Override // com.ironsource.Q.a
    public void a(@NotNull JSONObject jSONObject, @NotNull EnumC4225o0 enumC4225o0, @NotNull String str) {
        jSONObject.getClass();
        enumC4225o0.getClass();
        str.getClass();
        this.a.writeLock().lock();
        try {
            P p = this.b.get(str);
            if (p == null) {
                this.a.writeLock().unlock();
                return;
            }
            String optString = jSONObject.optString("bundleId");
            optString.getClass();
            if (optString.length() > 0) {
                p.a(optString);
            }
            String optString2 = jSONObject.optString("dynamicDemandSource");
            optString2.getClass();
            if (optString2.length() > 0) {
                p.a(P7.b.a(optString2));
            }
            p.a(enumC4225o0);
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ T(ReadWriteLock readWriteLock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.Q
    @NotNull
    public List<P> a() {
        this.a.readLock().lock();
        List<P> S0 = CollectionsKt.S0(this.b.values());
        this.a.readLock().unlock();
        return S0;
    }

    @Override // com.ironsource.Q.a
    public void a(@NotNull P p) {
        p.getClass();
        this.a.writeLock().lock();
        try {
            if (this.b.get(p.c()) == null) {
                this.b.put(p.c(), p);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.Q
    @Nullable
    public P a(@NotNull String str) {
        str.getClass();
        this.a.readLock().lock();
        try {
            return this.b.get(str);
        } finally {
            this.a.readLock().unlock();
        }
    }

    @Override // com.ironsource.Q.a
    public void a(@NotNull EnumC4225o0 enumC4225o0, @NotNull String str) {
        enumC4225o0.getClass();
        str.getClass();
        this.a.writeLock().lock();
        try {
            P p = this.b.get(str);
            if (p == null) {
                return;
            }
            p.a(enumC4225o0);
            p.a(System.currentTimeMillis() / 1000.0d);
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
