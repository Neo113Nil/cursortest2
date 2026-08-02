package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.movika.sdk.base.model.props.d;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import xsna.asp;
import xsna.bpn0;
import xsna.pn00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DuetType.kt */
/* loaded from: classes18.dex */
public final class DuetType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DuetType[] $VALUES;
    public static final DuetType BLUR;
    public static final DuetType CARD;
    public static final a Companion;
    public static final DuetType HOR;
    public static final DuetType VERT;
    private static final Lazy<Map<Integer, DuetType>> map$delegate;
    private final int id;

    /* compiled from: DuetType.kt */
    public static final class Wrapper extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Wrapper> CREATOR = new a();
        public final DuetType b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Wrapper> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Wrapper a(Serializer serializer) {
                return new Wrapper(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Wrapper[i];
            }
        }

        public Wrapper(DuetType duetType) {
            this.b = duetType;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            DuetType duetType = this.b;
            serializer.V(duetType != null ? Integer.valueOf(duetType.j()) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Wrapper(Serializer serializer) {
            this(r2);
            DuetType duetType;
            Integer v = serializer.v();
            if (v != null) {
                int intValue = v.intValue();
                DuetType.Companion.getClass();
                duetType = (DuetType) ((Map) DuetType.map$delegate.getValue()).get(Integer.valueOf(intValue));
            } else {
                duetType = null;
            }
        }
    }

    /* compiled from: DuetType.kt */
    public static final class a {
    }

    static {
        DuetType duetType = new DuetType("BLUR", 0, 1);
        BLUR = duetType;
        DuetType duetType2 = new DuetType("CARD", 1, 2);
        CARD = duetType2;
        DuetType duetType3 = new DuetType("VERT", 2, 3);
        VERT = duetType3;
        DuetType duetType4 = new DuetType("HOR", 3, 4);
        HOR = duetType4;
        DuetType[] duetTypeArr = {duetType, duetType2, duetType3, duetType4};
        $VALUES = duetTypeArr;
        $ENTRIES = new asp(duetTypeArr);
        Companion = new a();
        map$delegate = new bpn0(new d(21));
    }

    public DuetType(String str, int i, int i2) {
        this.id = i2;
    }

    public static Map h() {
        DuetType[] values = values();
        ArrayList arrayList = new ArrayList(values.length);
        for (DuetType duetType : values) {
            arrayList.add(new Pair(Integer.valueOf(duetType.id), duetType));
        }
        return pn00.s(arrayList);
    }

    public static DuetType valueOf(String str) {
        return (DuetType) Enum.valueOf(DuetType.class, str);
    }

    public static DuetType[] values() {
        return (DuetType[]) $VALUES.clone();
    }

    public final int j() {
        return this.id;
    }
}
