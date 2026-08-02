package com.vk.catalog2.common.dto.ui.market;

import android.os.Parcel;
import com.vk.catalog2.common.dto.api.market.CatalogMarketGroupInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.group.Group;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import xsna.c5g;
import xsna.dfp0;
import xsna.epx;

/* compiled from: UIBlockMarketGroupInfoItem.kt */
/* loaded from: classes16.dex */
public final class UIBlockMarketGroupInfoItem extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockMarketGroupInfoItem> CREATOR = new b();
    public final List<Good> A;
    public final String B;
    public final CatalogMarketGroupInfo y;
    public final Group z;

    /* compiled from: UIBlockMarketGroupInfoItem.kt */
    public static final class a {
        public final long a;
        public final Good b;
        public final String c;
        public final String d;

        public a(long j, Good good, String str, String str2) {
            this.a = j;
            this.b = good;
            this.c = str;
            this.d = str2;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<UIBlockMarketGroupInfoItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMarketGroupInfoItem a(Serializer serializer) {
            return new UIBlockMarketGroupInfoItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMarketGroupInfoItem[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockMarketGroupInfoItem(com.vk.catalog2.common.dto.api.ui.a aVar, CatalogMarketGroupInfo catalogMarketGroupInfo, Group group, List<? extends Good> list, String str) {
        super(aVar);
        this.y = catalogMarketGroupInfo;
        this.z = group;
        this.A = list;
        this.B = str;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
        serializer.o0(this.A);
        serializer.j0(this.B);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockMarketGroupInfoItem) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem = (UIBlockMarketGroupInfoItem) obj;
        return epx.f(this.y, uIBlockMarketGroupInfoItem.y) && epx.f(this.z, uIBlockMarketGroupInfoItem.z) && epx.f(this.A, uIBlockMarketGroupInfoItem.A) && epx.f(this.B, uIBlockMarketGroupInfoItem.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A, this.B);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.B;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "MARKET_GROUP_ITEM[" + this.b + "]<" + this.d + ": " + this.e + '>';
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        CatalogMarketGroupInfo catalogMarketGroupInfo = this.y;
        CatalogMarketGroupInfo catalogMarketGroupInfo2 = new CatalogMarketGroupInfo(catalogMarketGroupInfo.b, catalogMarketGroupInfo.c, catalogMarketGroupInfo.d, catalogMarketGroupInfo.e, catalogMarketGroupInfo.f, catalogMarketGroupInfo.g);
        Group group = this.z;
        Parcel obtain = Parcel.obtain();
        try {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            Serializer.g gVar = new Serializer.g(obtain);
            gVar.i0(group);
            obtain.setDataPosition(0);
            Serializer.StreamParcelable G = gVar.G(Group.class.getClassLoader());
            obtain.recycle();
            Group group2 = (Group) G;
            List<Good> list = this.A;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (Good good : list) {
                obtain = Parcel.obtain();
                try {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                    Serializer.g gVar2 = new Serializer.g(obtain);
                    gVar2.i0(good);
                    obtain.setDataPosition(0);
                    Serializer.StreamParcelable G2 = gVar2.G(Good.class.getClassLoader());
                    obtain.recycle();
                    arrayList.add((Good) G2);
                } finally {
                }
            }
            return new UIBlockMarketGroupInfoItem(Ab, catalogMarketGroupInfo2, group2, arrayList, this.B);
        } finally {
        }
    }

    public UIBlockMarketGroupInfoItem(Serializer serializer) {
        super(serializer);
        this.y = (CatalogMarketGroupInfo) serializer.G(CatalogMarketGroupInfo.class.getClassLoader());
        this.z = (Group) serializer.G(Group.class.getClassLoader());
        this.A = serializer.j(Good.CREATOR);
        this.B = serializer.H();
    }
}
