package com.vk.geo.impl.presentation;

import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.akt;
import xsna.asp;
import xsna.dgu;
import xsna.do00;
import xsna.gu0;
import xsna.gzs;
import xsna.msy;
import xsna.oq;
import xsna.sni;
import xsna.tqg0;
import xsna.ucy;
import xsna.wnh;
import xsna.wqf;
import xsna.zk3;
import xsna.zrp;

/* compiled from: GeoDataSet.kt */
/* loaded from: classes2.dex */
public final class GeoDataSet {
    public final wqf a;
    public final a b;
    public final a c;
    public final a d;
    public final a e = new a(new wnh(this, 13));
    public final ucy f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GeoDataSet.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ADDRESSES;
        public static final Type FEED;
        public static final Type PLACES;
        public static final Type SEARCH;

        static {
            Type type = new Type("FEED", 0);
            FEED = type;
            Type type2 = new Type("SEARCH", 1);
            SEARCH = type2;
            Type type3 = new Type("ADDRESSES", 2);
            ADDRESSES = type3;
            Type type4 = new Type("PLACES", 3);
            PLACES = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: GeoDataSet.kt */
    public final class a {
        public Set<do00> a = EmptySet.b;
        public final ConcurrentHashMap<StringId, do00> b = new ConcurrentHashMap<>(100);
        public final ConcurrentHashMap c = new ConcurrentHashMap(100);
        public Map<StringId, akt> d = sni.d(100, 2);
        public zk3<StringId, VisibleStyle> e = new zk3<>(100);
        public tqg0 f;
        public dgu g;
        public final Object h;

        public a(gzs gzsVar) {
            this.h = msy.a(LazyThreadSafetyMode.PUBLICATION, gzsVar);
        }
    }

    /* compiled from: GeoDataSet.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.FEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.ADDRESSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.PLACES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GeoDataSet(wqf wqfVar, gu0 gu0Var) {
        this.a = wqfVar;
        this.b = new a(wqfVar);
        this.c = new a(wqfVar);
        this.d = new a(wqfVar);
        this.f = new ucy(gu0Var);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append("@");
        sb.append(Integer.toHexString(b().hashCode()));
        sb.append("(simplifiedMarkers.size=");
        sb.append(b().a.size());
        sb.append(";allMarkers.size=");
        sb.append(b().b.size());
        sb.append(";hidden.size=");
        sb.append(b().c.size());
        sb.append(";clusters.size=");
        sb.append(b().d.size());
        sb.append(";visibleStyles.size=");
        sb.append(b().e.d);
        sb.append(";rtree.size=");
        tqg0 tqg0Var = b().f;
        return oq.b(sb, tqg0Var != null ? Integer.valueOf(tqg0Var.b) : null, ";)");
    }

    public final a b() {
        int i = b.$EnumSwitchMapping$0[((Type) this.f.b.invoke()).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return this.d;
        }
        if (i == 4) {
            return this.e;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return "GeoDataSet." + ((Type) this.f.b.invoke());
    }
}
