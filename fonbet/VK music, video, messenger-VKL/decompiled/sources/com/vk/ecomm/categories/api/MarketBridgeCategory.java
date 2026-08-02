package com.vk.ecomm.categories.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.asp;
import xsna.c5g;
import xsna.en;
import xsna.epx;
import xsna.on00;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketBridgeCategory.kt */
/* loaded from: classes18.dex */
public final class MarketBridgeCategory implements Parcelable {
    public static final Parcelable.Creator<MarketBridgeCategory> CREATOR = new a();
    public final int b;
    public final String c;
    public final Image d;
    public final List<MarketBridgeCategory> e;
    public final CategoryView f;
    public final MarketBridgeCategory g;
    public final LinkedHashMap h;

    /* compiled from: MarketBridgeCategory.kt */
    public static final class CategoryView implements Parcelable {
        public static final Parcelable.Creator<CategoryView> CREATOR = new a();
        public final Type b;
        public final Boolean c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MarketBridgeCategory.kt */
        public static final class Type implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Parcelable.Creator<Type> CREATOR;
            public static final Type SIMPLE;
            public static final Type TAB_ROOT;

            /* compiled from: MarketBridgeCategory.kt */
            public static final class a implements Parcelable.Creator<Type> {
                @Override // android.os.Parcelable.Creator
                public final Type createFromParcel(Parcel parcel) {
                    return Type.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Type[] newArray(int i) {
                    return new Type[i];
                }
            }

            static {
                Type type = new Type("SIMPLE", 0);
                SIMPLE = type;
                Type type2 = new Type("TAB_ROOT", 1);
                TAB_ROOT = type2;
                Type[] typeArr = {type, type2};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
                CREATOR = new a();
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

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: MarketBridgeCategory.kt */
        public static final class a implements Parcelable.Creator<CategoryView> {
            @Override // android.os.Parcelable.Creator
            public final CategoryView createFromParcel(Parcel parcel) {
                Boolean bool = null;
                Type createFromParcel = parcel.readInt() == 0 ? null : Type.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new CategoryView(createFromParcel, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final CategoryView[] newArray(int i) {
                return new CategoryView[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CategoryView() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryView)) {
                return false;
            }
            CategoryView categoryView = (CategoryView) obj;
            return this.b == categoryView.b && epx.f(this.c, categoryView.c);
        }

        public final int hashCode() {
            Type type = this.b;
            int hashCode = (type == null ? 0 : type.hashCode()) * 31;
            Boolean bool = this.c;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CategoryView(type=");
            sb.append(this.b);
            sb.append(", selected=");
            return tn.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Type type = this.b;
            if (type == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                type.writeToParcel(parcel, i);
            }
            Boolean bool = this.c;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
        }

        public CategoryView(Type type, Boolean bool) {
            this.b = type;
            this.c = bool;
        }

        public /* synthetic */ CategoryView(Type type, Boolean bool, int i, zcl zclVar) {
            this((i & 1) != 0 ? Type.SIMPLE : type, (i & 2) != 0 ? null : bool);
        }
    }

    /* compiled from: MarketBridgeCategory.kt */
    public static final class a implements Parcelable.Creator<MarketBridgeCategory> {
        @Override // android.os.Parcelable.Creator
        public final MarketBridgeCategory createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            Image image = (Image) parcel.readParcelable(MarketBridgeCategory.class.getClassLoader());
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MarketBridgeCategory.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketBridgeCategory(readInt, readString, image, arrayList, parcel.readInt() == 0 ? null : CategoryView.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketBridgeCategory[] newArray(int i) {
            return new MarketBridgeCategory[i];
        }
    }

    public MarketBridgeCategory(int i, String str, Image image, List<MarketBridgeCategory> list, CategoryView categoryView) {
        this.b = i;
        this.c = str;
        this.d = image;
        this.e = list;
        this.f = categoryView;
        List<MarketBridgeCategory> list2 = list;
        int e = on00.e(c5g.u(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : list2) {
            linkedHashMap.put(Integer.valueOf(((MarketBridgeCategory) obj).b), obj);
        }
        this.h = linkedHashMap;
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            ((MarketBridgeCategory) it.next()).g = this;
        }
    }

    public final MarketBridgeCategory a(int i) {
        if (this.b == i) {
            return this;
        }
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.h;
        if (linkedHashMap.containsKey(valueOf)) {
            return (MarketBridgeCategory) linkedHashMap.get(Integer.valueOf(i));
        }
        Iterator<MarketBridgeCategory> it = this.e.iterator();
        while (it.hasNext()) {
            MarketBridgeCategory a2 = it.next().a(i);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        Iterator a2 = ao.a(parcel, this.e);
        while (a2.hasNext()) {
            ((MarketBridgeCategory) a2.next()).writeToParcel(parcel, i);
        }
        CategoryView categoryView = this.f;
        if (categoryView == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            categoryView.writeToParcel(parcel, i);
        }
    }

    public MarketBridgeCategory(int i, String str, Image image, List list, CategoryView categoryView, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : image, (i2 & 8) != 0 ? EmptyList.b : list, (i2 & 16) != 0 ? null : categoryView);
    }
}
