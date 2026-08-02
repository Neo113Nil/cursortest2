package com.vk.vmoji.storage.impl.database;

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
import xsna.hbw0;
import xsna.ibw0;
import xsna.t8w0;

/* compiled from: VmojiStorageDatabase_Impl.kt */
/* loaded from: classes7.dex */
public final class VmojiStorageDatabase_Impl extends VmojiStorageDatabase {
    public final bpn0 m = new bpn0(new hbw0(this, 0));

    @Override // androidx.room.RoomDatabase
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final e e() {
        return new e(this, new LinkedHashMap(), new LinkedHashMap(), "user_vmoji_files");
    }

    @Override // androidx.room.RoomDatabase
    public final cmg0 f() {
        return new ibw0(this);
    }

    @Override // androidx.room.RoomDatabase
    public final Set<dcy<Object>> k() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(fpf0.a(t8w0.class), EmptyList.b);
        return linkedHashMap;
    }

    @Override // com.vk.vmoji.storage.impl.database.VmojiStorageDatabase
    public final t8w0 y() {
        return (t8w0) this.m.getValue();
    }
}
