package bo.app;

import com.braze.models.Banner;
import com.braze.models.BannerPendingDismissal;
import com.braze.storage.C2987a;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final C2987a f25779a;

    /* renamed from: b, reason: collision with root package name */
    public final ue f25780b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f25781c;

    public n(C2987a bannersDataStoreProvider, ue serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(bannersDataStoreProvider, "bannersDataStoreProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f25779a = bannersDataStoreProvider;
        this.f25780b = serverConfigStorageProvider;
        this.f25781c = new ReentrantLock();
    }

    public static final String b(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) it.next();
            arrayList.add("(id=" + bannerPendingDismissal.getBannerId() + ", timeMs=" + bannerPendingDismissal.getDismissalTimeMs() + ")");
        }
        return "Writing remaining pending dismissals: " + arrayList;
    }

    public final void a(final Banner banner, e2 brazeManager) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.j6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.n.a(Banner.this);
            }
        }, 6, (Object) null);
        y8 a10 = k1.f25630g.a(banner.getTrackingId());
        if (a10 != null) {
            brazeManager.a(a10);
        }
        BannerPendingDismissal bannerPendingDismissal = new BannerPendingDismissal(banner.getTrackingId(), banner.getStableKey(), DateTimeUtils.nowInMilliseconds());
        ReentrantLock reentrantLock = this.f25781c;
        reentrantLock.lock();
        try {
            List b10 = this.f25779a.b();
            b10.add(bannerPendingDismissal);
            a(b10, this.f25780b.m());
            this.f25779a.a(b10);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(Banner banner) {
        return "Recording dismissal for banner " + banner.getPlacementId() + " (trackingId=" + banner.getTrackingId() + ")";
    }

    public final void a(final List acknowledgedDismissals) {
        Intrinsics.checkNotNullParameter(acknowledgedDismissals, "acknowledgedDismissals");
        if (acknowledgedDismissals.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(acknowledgedDismissals, 10));
        Iterator it = acknowledgedDismissals.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            arrayList.add(TuplesKt.to(dVar.f25366a, Long.valueOf(dVar.f25367b)));
        }
        final Set set = CollectionsKt.toSet(arrayList);
        ReentrantLock reentrantLock = this.f25781c;
        reentrantLock.lock();
        try {
            final List b10 = this.f25779a.b();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.f6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.n.a(set, b10);
                }
            }, 6, (Object) null);
            final ArrayList arrayList2 = new ArrayList();
            for (Object obj : b10) {
                BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) obj;
                if (!set.contains(TuplesKt.to(bannerPendingDismissal.getBannerId(), Long.valueOf(bannerPendingDismissal.getDismissalTimeMs())))) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() == b10.size()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29469D, (Throwable) null, false, new Function0() { // from class: c3.g6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.n.a(acknowledgedDismissals, b10, set);
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.h6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.n.b(arrayList2);
                    }
                }, 6, (Object) null);
                this.f25779a.a(arrayList2);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.i6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.n.a(b10, arrayList2);
                    }
                }, 7, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String a(List list, List list2, Set set) {
        int size = list.size();
        int size2 = list2.size();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add("(id=" + pair.getFirst() + ", timeMs=" + pair.getSecond() + ")");
        }
        return "Banner dismiss sync: server acknowledged " + size + " dismissal(s) but none matched the pending cache. pendingCount=" + size2 + " acknowledged=" + arrayList;
    }

    public static final String a(List list, List list2) {
        return "Removed " + (list.size() - list2.size()) + " acknowledged dismissals from pending cache. " + list2.size() + " pending dismissals remain.";
    }

    public final void a(List list, final int i10) {
        if (i10 <= 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.k6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.n.a(i10);
                }
            }, 6, (Object) null);
            if (list.isEmpty()) {
                return;
            }
            list.clear();
            return;
        }
        if (list.size() <= i10) {
            return;
        }
        final int size = list.size();
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new m());
        }
        List takeLast = CollectionsKt.takeLast(list, i10);
        list.clear();
        list.addAll(takeLast);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.l6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.n.a(size, i10);
            }
        }, 6, (Object) null);
    }

    public static final String a(int i10) {
        return "maxSize (" + i10 + ") is non-positive; clearing all pending dismissals";
    }

    public static final String a(int i10, int i11) {
        return "Evicted " + (i10 - i11) + " oldest pending dismissals to fit cache size of " + i11;
    }

    public static final String a(Set set, List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add("(id=" + pair.getFirst() + ", timeMs=" + pair.getSecond() + ")");
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) it2.next();
            arrayList2.add("(id=" + bannerPendingDismissal.getBannerId() + ", timeMs=" + bannerPendingDismissal.getDismissalTimeMs() + ")");
        }
        return "Processing acknowledged dismissals. acknowledged=" + arrayList + ", pending=" + arrayList2;
    }
}
