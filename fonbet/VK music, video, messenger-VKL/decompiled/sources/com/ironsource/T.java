package com.ironsource;

import com.ironsource.Q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;
import xsna.j5g;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class T implements Q, Q.a {
    private final ReadWriteLock a;
    private final Map<String, P> b;

    /* JADX WARN: Multi-variable type inference failed */
    public T() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Q
    public P a(String str) {
        this.a.readLock().lock();
        try {
            return this.b.get(str);
        } finally {
            this.a.readLock().unlock();
        }
    }

    public T(ReadWriteLock readWriteLock) {
        this.a = readWriteLock;
        this.b = new LinkedHashMap();
    }

    @Override // com.ironsource.Q
    public List<P> a() {
        this.a.readLock().lock();
        List<P> O0 = j5g.O0(this.b.values());
        this.a.readLock().unlock();
        return O0;
    }

    public /* synthetic */ T(ReadWriteLock readWriteLock, int i, zcl zclVar) {
        this((i & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.Q.a
    public void a(P p) {
        this.a.writeLock().lock();
        try {
            if (this.b.get(p.c()) == null) {
                this.b.put(p.c(), p);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.Q.a
    public void a(JSONObject jSONObject, EnumC4466o0 enumC4466o0, String str) {
        this.a.writeLock().lock();
        try {
            P p = this.b.get(str);
            if (p == null) {
                this.a.writeLock().unlock();
                return;
            }
            String optString = jSONObject.optString("bundleId");
            if (optString.length() > 0) {
                p.a(optString);
            }
            String optString2 = jSONObject.optString("dynamicDemandSource");
            if (optString2.length() > 0) {
                p.a(S7.b.a(optString2));
            }
            p.a(enumC4466o0);
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.Q.a
    public void a(EnumC4466o0 enumC4466o0, String str) {
        this.a.writeLock().lock();
        try {
            P p = this.b.get(str);
            if (p == null) {
                return;
            }
            p.a(enumC4466o0);
            p.a(System.currentTimeMillis() / 1000.0d);
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
