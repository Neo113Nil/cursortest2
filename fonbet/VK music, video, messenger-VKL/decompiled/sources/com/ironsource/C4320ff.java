package com.ironsource;

import com.ironsource.N8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.j5g;
import xsna.jgp;
import xsna.pn00;

/* renamed from: com.ironsource.ff, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4320ff implements N8, N8.a {
    private Map<String, C4644y> a = new LinkedHashMap();
    private final C4478oc b = new C4478oc();
    private final ReadWriteLock c = new ReentrantReadWriteLock();

    /* renamed from: com.ironsource.ff$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4302ef.values().length];
            try {
                iArr[EnumC4302ef.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4302ef.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4302ef.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    private final void b() {
        this.b.a(a(FeaturesManager.getInstance().getSessionHistoryConfig()));
        this.b.a(a());
    }

    @Override // com.ironsource.N8.a
    public void a(AbstractC4338gf abstractC4338gf) {
        this.c.writeLock().lock();
        try {
            P a2 = abstractC4338gf.a();
            String valueOf = String.valueOf(a2 != null ? a2.b() : null);
            Map<String, C4644y> map = this.a;
            C4644y c4644y = map.get(valueOf);
            if (c4644y == null) {
                c4644y = new C4644y();
                map.put(valueOf, c4644y);
            }
            c4644y.a(abstractC4338gf.a(new C4445mf()));
            this.c.writeLock().unlock();
            b();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.N8
    public JSONObject a(EnumC4499pf enumC4499pf) {
        this.c.readLock().lock();
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, C4644y> entry : this.a.entrySet()) {
                String key = entry.getKey();
                JSONObject a2 = entry.getValue().a(enumC4499pf);
                if (a2.length() > 0) {
                    jSONObject.put(key, a2);
                }
            }
            return jSONObject;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.N8
    public int a(IronSource.a aVar) {
        this.c.readLock().lock();
        try {
            C4644y c4644y = this.a.get(aVar.toString());
            return c4644y != null ? c4644y.a() : 0;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.N8
    public List<String> a() {
        this.c.readLock().lock();
        try {
            Map<String, C4644y> map = this.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C4644y> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List<String> O0 = j5g.O0(linkedHashMap.keySet());
            this.c.readLock().unlock();
            return O0;
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.N8
    public Map<String, JSONObject> a(C4284df c4284df) {
        Map<String, JSONObject> m;
        this.c.readLock().lock();
        try {
            int i = a.a[c4284df.a().ordinal()];
            if (i == 1) {
                m = pn00.m(new Pair(O6.z1, a(EnumC4499pf.FullHistory)), new Pair(O6.A1, a(EnumC4499pf.CurrentlyLoadedAds)));
            } else if (i == 2) {
                m = pn00.m(new Pair(O6.A1, a(EnumC4499pf.CurrentlyLoadedAds)));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                m = jgp.b;
            }
            this.c.readLock().unlock();
            return m;
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }
}
