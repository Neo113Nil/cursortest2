package com.vk.newsfeed.posting.impl.data.db;

import androidx.room.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.aec0;
import xsna.bec0;
import xsna.bpn0;
import xsna.cec0;
import xsna.cmg0;
import xsna.dcy;
import xsna.dec0;
import xsna.eec0;
import xsna.fec0;
import xsna.fpf0;
import xsna.kr50;
import xsna.mec0;
import xsna.zdc0;

/* compiled from: PostingDatabase_Impl.kt */
/* loaded from: classes4.dex */
public final class PostingDatabase_Impl extends PostingDatabase {
    public final bpn0 m = new bpn0(new kr50(this, 13));

    @Override // androidx.room.RoomDatabase
    public final List d(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zdc0(1, 2));
        arrayList.add(new aec0(2, 3));
        arrayList.add(new bec0(3, 4));
        arrayList.add(new cec0(4, 5));
        arrayList.add(new dec0(5, 6));
        arrayList.add(new eec0(6, 7));
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final e e() {
        return new e(this, new LinkedHashMap(), new LinkedHashMap(), "posting_draft");
    }

    @Override // androidx.room.RoomDatabase
    public final cmg0 f() {
        return new fec0(this);
    }

    @Override // androidx.room.RoomDatabase
    public final Set<dcy<Object>> k() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(fpf0.a(mec0.class), EmptyList.b);
        return linkedHashMap;
    }

    @Override // com.vk.newsfeed.posting.impl.data.db.PostingDatabase
    public final mec0 y() {
        return (mec0) this.m.getValue();
    }
}
