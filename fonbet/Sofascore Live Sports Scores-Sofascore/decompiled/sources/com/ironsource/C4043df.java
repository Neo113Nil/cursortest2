package com.ironsource;

import com.ironsource.K8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import defpackage.lm5;
import defpackage.ndd;
import defpackage.tub;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.df, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4043df implements K8, K8.a {

    @NotNull
    private Map<String, C4403y> a = new LinkedHashMap();

    @NotNull
    private final C4219nc b = new C4219nc();

    @NotNull
    private final ReadWriteLock c = new ReentrantReadWriteLock();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.df$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4025cf.values().length];
            try {
                iArr[EnumC4025cf.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4025cf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4025cf.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    private final void b() {
        C4007bf sessionHistoryConfig = FeaturesManager.getInstance().getSessionHistoryConfig();
        C4219nc c4219nc = this.b;
        sessionHistoryConfig.getClass();
        c4219nc.a(a(sessionHistoryConfig));
        this.b.a(a());
    }

    @Override // com.ironsource.K8
    @NotNull
    public Map<String, JSONObject> a(@NotNull C4007bf c4007bf) {
        Map<String, JSONObject> i;
        c4007bf.getClass();
        this.c.readLock().lock();
        try {
            int i2 = a.a[c4007bf.a().ordinal()];
            if (i2 == 1) {
                i = tub.i(new Pair(L6.z1, a(EnumC4222nf.FullHistory)), new Pair(L6.A1, a(EnumC4222nf.CurrentlyLoadedAds)));
            } else if (i2 == 2) {
                i = tub.i(new Pair(L6.A1, a(EnumC4222nf.CurrentlyLoadedAds)));
            } else {
                if (i2 != 3) {
                    throw new ndd();
                }
                i = lm5.a;
                i.getClass();
            }
            this.c.readLock().unlock();
            return i;
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.K8
    @NotNull
    public JSONObject a(@NotNull EnumC4222nf enumC4222nf) {
        enumC4222nf.getClass();
        this.c.readLock().lock();
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, C4403y> entry : this.a.entrySet()) {
                String key = entry.getKey();
                JSONObject a2 = entry.getValue().a(enumC4222nf);
                if (a2.length() > 0) {
                    jSONObject.put(key, a2);
                }
            }
            return jSONObject;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.K8
    public int a(@NotNull IronSource.a aVar) {
        aVar.getClass();
        this.c.readLock().lock();
        try {
            C4403y c4403y = this.a.get(aVar.toString());
            return c4403y != null ? c4403y.a() : 0;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.K8
    @NotNull
    public List<String> a() {
        this.c.readLock().lock();
        try {
            Map<String, C4403y> map = this.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C4403y> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List<String> S0 = CollectionsKt.S0(linkedHashMap.keySet());
            this.c.readLock().unlock();
            return S0;
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.K8.a
    public void a(@NotNull AbstractC4061ef abstractC4061ef) {
        abstractC4061ef.getClass();
        this.c.writeLock().lock();
        try {
            P a2 = abstractC4061ef.a();
            String valueOf = String.valueOf(a2 != null ? a2.b() : null);
            Map<String, C4403y> map = this.a;
            C4403y c4403y = map.get(valueOf);
            if (c4403y == null) {
                c4403y = new C4403y();
                map.put(valueOf, c4403y);
            }
            c4403y.a(abstractC4061ef.a(new C4168kf()));
            this.c.writeLock().unlock();
            b();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }
}
