package com.vk.uxpolls.data.db;

import androidx.room.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.bpn0;
import xsna.cmg0;
import xsna.dac0;
import xsna.dcy;
import xsna.fpf0;
import xsna.lnb0;
import xsna.t4r0;

/* compiled from: UxPollsDatabase_Impl.kt */
/* loaded from: classes6.dex */
public final class UxPollsDatabase_Impl extends UxPollsDatabase {
    public final bpn0 m = new bpn0(new dac0(this, 24));

    @Override // androidx.room.RoomDatabase
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final e e() {
        return new e(this, new LinkedHashMap(), new LinkedHashMap(), "polls");
    }

    @Override // androidx.room.RoomDatabase
    public final cmg0 f() {
        return new t4r0(this);
    }

    @Override // androidx.room.RoomDatabase
    public final Set<dcy<Object>> k() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(fpf0.a(lnb0.class), EmptyList.b);
        return linkedHashMap;
    }

    @Override // com.vk.uxpolls.data.db.UxPollsDatabase
    public final lnb0 y() {
        return (lnb0) this.m.getValue();
    }
}
