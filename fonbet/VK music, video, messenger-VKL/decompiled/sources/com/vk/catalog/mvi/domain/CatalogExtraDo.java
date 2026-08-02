package com.vk.catalog.mvi.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import kotlin.collections.EmptySet;
import xsna.epx;
import xsna.j5g;
import xsna.jgp;
import xsna.ur;
import xsna.v11;
import xsna.y5;
import xsna.zcl;

/* compiled from: CatalogExtraDo.kt */
/* loaded from: classes16.dex */
public final class CatalogExtraDo implements Parcelable {
    public static final Parcelable.Creator<CatalogExtraDo> CREATOR = new a();
    public final String b;
    public final Map<CatalogListenEvent$BlockUpdate, Set<String>> c;
    public final Set<CatalogListenEvent$SectionUpdate> d;

    /* compiled from: CatalogExtraDo.kt */
    public static final class a implements Parcelable.Creator<CatalogExtraDo> {
        @Override // android.os.Parcelable.Creator
        public final CatalogExtraDo createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                CatalogListenEvent$BlockUpdate valueOf = CatalogListenEvent$BlockUpdate.valueOf(parcel.readString());
                int readInt2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    linkedHashSet.add(parcel.readString());
                }
                linkedHashMap.put(valueOf, linkedHashSet);
            }
            int readInt3 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt3);
            for (int i3 = 0; i3 != readInt3; i3++) {
                linkedHashSet2.add(CatalogListenEvent$SectionUpdate.valueOf(parcel.readString()));
            }
            return new CatalogExtraDo(readString, linkedHashMap, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogExtraDo[] newArray(int i) {
            return new CatalogExtraDo[i];
        }
    }

    public CatalogExtraDo() {
        this(null, null, null, 7, null);
    }

    public static LinkedHashMap a(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), j5g.R0((Iterable) entry.getValue()));
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            Object key = entry2.getKey();
            final y5 y5Var = new y5(entry2, 2);
            linkedHashMap.computeIfPresent(key, new BiFunction() { // from class: xsna.m5a
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return (Set) y5.this.invoke(obj, obj2);
                }
            });
        }
        return linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogExtraDo)) {
            return false;
        }
        CatalogExtraDo catalogExtraDo = (CatalogExtraDo) obj;
        return epx.f(this.b, catalogExtraDo.b) && epx.f(this.c, catalogExtraDo.c) && epx.f(this.d, catalogExtraDo.d);
    }

    public final int hashCode() {
        String str = this.b;
        return this.d.hashCode() + v11.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogExtraDo(nextFrom=");
        sb.append(this.b);
        sb.append(", blockUpdateEvents=");
        sb.append(this.c);
        sb.append(", sectionUpdateEvents=");
        return ur.c(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Map<CatalogListenEvent$BlockUpdate, Set<String>> map = this.c;
        parcel.writeInt(map.size());
        for (Map.Entry<CatalogListenEvent$BlockUpdate, Set<String>> entry : map.entrySet()) {
            parcel.writeString(entry.getKey().name());
            Set<String> value = entry.getValue();
            parcel.writeInt(value.size());
            Iterator<String> it = value.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
        }
        Set<CatalogListenEvent$SectionUpdate> set = this.d;
        parcel.writeInt(set.size());
        Iterator<CatalogListenEvent$SectionUpdate> it2 = set.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next().name());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogExtraDo(String str, Map<CatalogListenEvent$BlockUpdate, ? extends Set<String>> map, Set<? extends CatalogListenEvent$SectionUpdate> set) {
        this.b = str;
        this.c = map;
        this.d = set;
    }

    public CatalogExtraDo(String str, Map map, Set set, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? jgp.b : map, (i & 4) != 0 ? EmptySet.b : set);
    }
}
