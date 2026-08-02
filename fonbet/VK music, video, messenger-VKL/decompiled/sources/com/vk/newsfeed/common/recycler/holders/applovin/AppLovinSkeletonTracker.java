package com.vk.newsfeed.common.recycler.holders.applovin;

import android.os.SystemClock;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.ads.dto.VkOptionalNativeAdType;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import xsna.asp;
import xsna.b5r;
import xsna.bwt0;
import xsna.l5m;
import xsna.o73;
import xsna.rp6;
import xsna.syj0;
import xsna.u1c0;
import xsna.zrp;

/* compiled from: AppLovinSkeletonTracker.kt */
/* loaded from: classes4.dex */
public final class AppLovinSkeletonTracker implements b5r {
    public final NewsfeedOptionalAdsComponent a;
    public final SparseArray<o73> b = new SparseArray<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppLovinSkeletonTracker.kt */
    public static final class EventTrigger {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventTrigger[] $VALUES;
        public static final EventTrigger REPLACE;
        public static final EventTrigger SCROLL;

        static {
            EventTrigger eventTrigger = new EventTrigger("SCROLL", 0);
            SCROLL = eventTrigger;
            EventTrigger eventTrigger2 = new EventTrigger("REPLACE", 1);
            REPLACE = eventTrigger2;
            EventTrigger[] eventTriggerArr = {eventTrigger, eventTrigger2};
            $VALUES = eventTriggerArr;
            $ENTRIES = new asp(eventTriggerArr);
        }

        public EventTrigger() {
            throw null;
        }

        public static EventTrigger valueOf(String str) {
            return (EventTrigger) Enum.valueOf(EventTrigger.class, str);
        }

        public static EventTrigger[] values() {
            return (EventTrigger[]) $VALUES.clone();
        }
    }

    public AppLovinSkeletonTracker(NewsfeedOptionalAdsComponent newsfeedOptionalAdsComponent) {
        this.a = newsfeedOptionalAdsComponent;
    }

    @Override // xsna.b5r
    public final void a(RecyclerView.e0 e0Var, int i) {
        String c;
        boolean z = e0Var instanceof syj0;
        SparseArray<o73> sparseArray = this.b;
        boolean z2 = sparseArray.indexOfKey(i) >= 0;
        if (!z) {
            if (z2) {
                o73 o73Var = sparseArray.get(i);
                o73Var.b = SystemClock.elapsedRealtime() - o73Var.a;
                c(o73Var, EventTrigger.REPLACE);
                sparseArray.remove(i);
                return;
            }
            return;
        }
        if (z2 || sparseArray.indexOfKey(i) >= 0) {
            return;
        }
        rp6 rp6Var = (rp6) e0Var;
        String str = rp6Var.v;
        if (str == null || str.length() == 0) {
            u1c0 J0 = rp6Var.J0();
            c = J0 != null ? J0.c() : null;
        } else {
            c = rp6Var.v;
        }
        if (bwt0.D(e0Var.itemView) >= 0.05d) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (c == null) {
                c = "";
            }
            String str2 = c;
            u1c0 J02 = rp6Var.J0();
            sparseArray.put(i, new o73(J02 != null ? J02.k : -1, elapsedRealtime, 2, str2));
        }
    }

    @Override // xsna.b5r
    public final void b(int i, int i2) {
        SparseArray<o73> sparseArray = this.b;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            int keyAt = sparseArray.keyAt(size);
            if (i > keyAt || keyAt > i2) {
                o73 valueAt = sparseArray.valueAt(size);
                valueAt.b = SystemClock.elapsedRealtime() - valueAt.a;
                c(valueAt, EventTrigger.SCROLL);
                sparseArray.removeAt(size);
            }
        }
    }

    public final void c(o73 o73Var, EventTrigger eventTrigger) {
        l5m l5mVar = new l5m(null, null, 3);
        String h = DevNullEventKey.FEED_APPLOVIN_SKELETON_TIMING.h();
        int i = (int) o73Var.b;
        int i2 = o73Var.d;
        boolean T1 = this.a.T1(VkOptionalNativeAdType.APPLOVIN);
        l5mVar.g = new SchemeStat$TypeDevNullItem(h, null, o73Var.c, Integer.valueOf(i), eventTrigger.toString(), Integer.valueOf(i2), null, Integer.valueOf(T1 ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -190, 3, null);
        l5mVar.q();
    }
}
