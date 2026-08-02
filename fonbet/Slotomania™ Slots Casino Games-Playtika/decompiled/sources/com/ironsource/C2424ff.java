package com.ironsource;

import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.ff, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2424ff implements M8, M8.a {
    private Map<String, C2748y> a = new LinkedHashMap();
    private final C2564nc b = new C2564nc();
    private final ReadWriteLock c = new ReentrantReadWriteLock();

    /* renamed from: com.ironsource.ff$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC2406ef.values().length];
            try {
                iArr[EnumC2406ef.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2406ef.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2406ef.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    private final void b() {
        C2388df configuration = FeaturesManager.getInstance().getSessionHistoryConfig();
        C2564nc c2564nc = this.b;
        Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
        c2564nc.a(a(configuration));
        this.b.a(a());
    }

    @Override // com.ironsource.M8.a
    public void a(AbstractC2442gf historyRecord) {
        Intrinsics.checkNotNullParameter(historyRecord, "historyRecord");
        this.c.writeLock().lock();
        try {
            P a2 = historyRecord.a();
            String valueOf = String.valueOf(a2 != null ? a2.b() : null);
            Map<String, C2748y> map = this.a;
            C2748y c2748y = map.get(valueOf);
            if (c2748y == null) {
                c2748y = new C2748y();
                map.put(valueOf, c2748y);
            }
            c2748y.a(historyRecord.a(new C2549mf()));
            this.c.writeLock().unlock();
            b();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.M8
    public JSONObject a(EnumC2603pf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.c.readLock().lock();
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            for (Map.Entry<String, C2748y> entry : this.a.entrySet()) {
                String key = entry.getKey();
                JSONObject a2 = entry.getValue().a(mode);
                if (a2.length() > 0) {
                    jsonObjectInit.put(key, a2);
                }
            }
            return jsonObjectInit;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.M8
    public int a(IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.c.readLock().lock();
        try {
            C2748y c2748y = this.a.get(adFormat.toString());
            return c2748y != null ? c2748y.a() : 0;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.M8
    public List<String> a() {
        this.c.readLock().lock();
        try {
            Map<String, C2748y> map = this.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C2748y> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return CollectionsKt.toList(linkedHashMap.keySet());
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.M8
    public Map<String, JSONObject> a(C2388df configuration) {
        Map<String, JSONObject> mutableMapOf;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.c.readLock().lock();
        try {
            int i = a.a[configuration.a().ordinal()];
            if (i == 1) {
                mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(M6.B1, a(EnumC2603pf.FullHistory)), TuplesKt.to(M6.C1, a(EnumC2603pf.CurrentlyLoadedAds)));
            } else if (i == 2) {
                mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(M6.C1, a(EnumC2603pf.CurrentlyLoadedAds)));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                mutableMapOf = MapsKt.emptyMap();
            }
            return mutableMapOf;
        } finally {
            this.c.readLock().unlock();
        }
    }
}
