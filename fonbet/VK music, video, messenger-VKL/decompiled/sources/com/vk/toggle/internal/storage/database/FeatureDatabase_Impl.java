package com.vk.toggle.internal.storage.database;

import androidx.room.e;
import com.coremedia.iso.boxes.MetaBox;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.bpn0;
import xsna.ci20;
import xsna.cmg0;
import xsna.cuq;
import xsna.da3;
import xsna.dcy;
import xsna.duq;
import xsna.e0r0;
import xsna.euq;
import xsna.fpf0;
import xsna.rfc;
import xsna.yaa;

/* compiled from: FeatureDatabase_Impl.kt */
/* loaded from: classes11.dex */
public final class FeatureDatabase_Impl extends FeatureDatabase {
    public final bpn0 m = new bpn0(new yaa(this, 2));
    public final bpn0 n = new bpn0(new cuq(this, 0));
    public final bpn0 o = new bpn0(new duq(this, 0));

    @Override // com.vk.toggle.internal.storage.database.FeatureDatabase
    public final e0r0 A() {
        return (e0r0) this.o.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final e e() {
        return new e(this, new LinkedHashMap(), new LinkedHashMap(), MetaBox.TYPE, "app_values", "user_values");
    }

    @Override // androidx.room.RoomDatabase
    public final cmg0 f() {
        return new euq(this);
    }

    @Override // androidx.room.RoomDatabase
    public final Set<dcy<Object>> k() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        rfc a = fpf0.a(ci20.class);
        EmptyList emptyList = EmptyList.b;
        linkedHashMap.put(a, emptyList);
        linkedHashMap.put(fpf0.a(da3.class), emptyList);
        linkedHashMap.put(fpf0.a(e0r0.class), emptyList);
        return linkedHashMap;
    }

    @Override // com.vk.toggle.internal.storage.database.FeatureDatabase
    public final da3 y() {
        return (da3) this.n.getValue();
    }

    @Override // com.vk.toggle.internal.storage.database.FeatureDatabase
    public final ci20 z() {
        return (ci20) this.m.getValue();
    }
}
