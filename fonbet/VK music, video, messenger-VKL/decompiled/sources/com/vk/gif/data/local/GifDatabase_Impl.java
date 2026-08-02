package com.vk.gif.data.local;

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
import xsna.eyt;
import xsna.fpf0;
import xsna.k9f0;
import xsna.wnh;

/* compiled from: GifDatabase_Impl.kt */
/* loaded from: classes2.dex */
public final class GifDatabase_Impl extends GifDatabase {
    public final bpn0 m = new bpn0(new wnh(this, 14));

    @Override // androidx.room.RoomDatabase
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final e e() {
        return new e(this, new LinkedHashMap(), new LinkedHashMap(), "recent_gif");
    }

    @Override // androidx.room.RoomDatabase
    public final cmg0 f() {
        return new eyt(this);
    }

    @Override // androidx.room.RoomDatabase
    public final Set<dcy<Object>> k() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(fpf0.a(k9f0.class), EmptyList.b);
        return linkedHashMap;
    }

    @Override // com.vk.gif.data.local.GifDatabase
    public final k9f0 y() {
        return (k9f0) this.m.getValue();
    }
}
