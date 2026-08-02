package com.vk.donut.video.subscription.impl.data.db;

import androidx.room.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.bpn0;
import xsna.cmg0;
import xsna.dcy;
import xsna.fpf0;
import xsna.qy8;
import xsna.ry8;
import xsna.yxm0;

/* compiled from: CachedSubscriptionsDb_Impl.kt */
/* loaded from: classes.dex */
public final class CachedSubscriptionsDb_Impl extends CachedSubscriptionsDb {
    public final bpn0 m = new bpn0(new qy8(this, 0));

    @Override // androidx.room.RoomDatabase
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final e e() {
        return new e(this, new LinkedHashMap(), new LinkedHashMap(), "cached_subscription");
    }

    @Override // androidx.room.RoomDatabase
    public final cmg0 f() {
        return new ry8(this);
    }

    @Override // androidx.room.RoomDatabase
    public final Set<dcy<Object>> k() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(fpf0.a(yxm0.class), EmptyList.b);
        return linkedHashMap;
    }

    @Override // com.vk.donut.video.subscription.impl.data.db.CachedSubscriptionsDb
    public final yxm0 y() {
        return (yxm0) this.m.getValue();
    }
}
