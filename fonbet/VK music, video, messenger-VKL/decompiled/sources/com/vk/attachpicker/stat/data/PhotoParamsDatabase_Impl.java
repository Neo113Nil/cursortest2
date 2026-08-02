package com.vk.attachpicker.stat.data;

import androidx.room.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.b990;
import xsna.bpn0;
import xsna.cmg0;
import xsna.dcy;
import xsna.dj60;
import xsna.fdu;
import xsna.fpf0;
import xsna.gko0;
import xsna.iaa0;
import xsna.jaa0;
import xsna.kaa0;
import xsna.r5l0;
import xsna.rfc;
import xsna.tu80;

/* compiled from: PhotoParamsDatabase_Impl.kt */
/* loaded from: classes15.dex */
public final class PhotoParamsDatabase_Impl extends PhotoParamsDatabase {
    public final bpn0 m = new bpn0(new jaa0(this, 0));
    public final bpn0 n = new bpn0(new b990(this, 1));
    public final bpn0 o = new bpn0(new tu80(this, 3));
    public final bpn0 p = new bpn0(new dj60(this, 6));

    @Override // com.vk.attachpicker.stat.data.PhotoParamsDatabase
    public final r5l0 A() {
        return (r5l0) this.n.getValue();
    }

    @Override // com.vk.attachpicker.stat.data.PhotoParamsDatabase
    public final gko0 B() {
        return (gko0) this.o.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final e e() {
        return new e(this, new LinkedHashMap(), new LinkedHashMap(), "photo_params", "sticker_params", "text_params", "graffity_params");
    }

    @Override // androidx.room.RoomDatabase
    public final cmg0 f() {
        return new kaa0(this);
    }

    @Override // androidx.room.RoomDatabase
    public final Set<dcy<Object>> k() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        rfc a = fpf0.a(iaa0.class);
        EmptyList emptyList = EmptyList.b;
        linkedHashMap.put(a, emptyList);
        linkedHashMap.put(fpf0.a(r5l0.class), emptyList);
        linkedHashMap.put(fpf0.a(gko0.class), emptyList);
        linkedHashMap.put(fpf0.a(fdu.class), emptyList);
        return linkedHashMap;
    }

    @Override // com.vk.attachpicker.stat.data.PhotoParamsDatabase
    public final fdu y() {
        return (fdu) this.p.getValue();
    }

    @Override // com.vk.attachpicker.stat.data.PhotoParamsDatabase
    public final iaa0 z() {
        return (iaa0) this.m.getValue();
    }
}
