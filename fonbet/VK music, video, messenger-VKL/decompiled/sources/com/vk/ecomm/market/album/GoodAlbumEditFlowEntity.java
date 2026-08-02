package com.vk.ecomm.market.album;

import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.j5g;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GoodAlbumEditFlowEntity.kt */
/* loaded from: classes18.dex */
public final class GoodAlbumEditFlowEntity extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GoodAlbumEditFlowEntity> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final Integer d;
    public final Photo e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final List<Long> i;
    public final List<Good> j;
    public final String k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GoodAlbumEditFlowEntity> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GoodAlbumEditFlowEntity a(Serializer serializer) {
            return new GoodAlbumEditFlowEntity(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GoodAlbumEditFlowEntity[i];
        }
    }

    public /* synthetic */ GoodAlbumEditFlowEntity(UserId userId, String str, Integer num, Photo photo, int i, boolean z, boolean z2, List list, List list2, String str2, int i2, zcl zclVar) {
        this(userId, str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : photo, (i2 & 16) != 0 ? 0 : i, z, z2, list, (i2 & 256) != 0 ? new ArrayList() : list2, (i2 & 512) != 0 ? null : str2);
    }

    public static GoodAlbumEditFlowEntity zb(GoodAlbumEditFlowEntity goodAlbumEditFlowEntity, String str, Integer num, Photo photo, int i, boolean z, boolean z2, String str2, int i2) {
        UserId userId = goodAlbumEditFlowEntity.b;
        if ((i2 & 2) != 0) {
            str = goodAlbumEditFlowEntity.c;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            num = goodAlbumEditFlowEntity.d;
        }
        Integer num2 = num;
        if ((i2 & 8) != 0) {
            photo = goodAlbumEditFlowEntity.e;
        }
        Photo photo2 = photo;
        int i3 = (i2 & 16) != 0 ? goodAlbumEditFlowEntity.f : i;
        boolean z3 = (i2 & 32) != 0 ? goodAlbumEditFlowEntity.g : z;
        boolean z4 = (i2 & 64) != 0 ? goodAlbumEditFlowEntity.h : z2;
        List<Long> list = goodAlbumEditFlowEntity.i;
        List<Good> list2 = goodAlbumEditFlowEntity.j;
        String str4 = (i2 & 512) != 0 ? goodAlbumEditFlowEntity.k : str2;
        goodAlbumEditFlowEntity.getClass();
        return new GoodAlbumEditFlowEntity(userId, str3, num2, photo2, i3, z3, z4, list, list2, str4);
    }

    public final GoodAlbum Ab() {
        Integer num = this.d;
        return new GoodAlbum(num != null ? num.intValue() : 0, this.b, this.c, this.e, this.f, 0, 0, this.g, this.h);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.V(this.d);
        serializer.e0(this.e);
        serializer.S(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.Z(j5g.P0(this.i));
        serializer.W(this.j);
        serializer.j0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoodAlbumEditFlowEntity)) {
            return false;
        }
        GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = (GoodAlbumEditFlowEntity) obj;
        return epx.f(this.b, goodAlbumEditFlowEntity.b) && epx.f(this.c, goodAlbumEditFlowEntity.c) && epx.f(this.d, goodAlbumEditFlowEntity.d) && epx.f(this.e, goodAlbumEditFlowEntity.e) && this.f == goodAlbumEditFlowEntity.f && this.g == goodAlbumEditFlowEntity.g && this.h == goodAlbumEditFlowEntity.h && epx.f(this.i, goodAlbumEditFlowEntity.i) && epx.f(this.j, goodAlbumEditFlowEntity.j) && epx.f(this.k, goodAlbumEditFlowEntity.k);
    }

    public final int hashCode() {
        int a2 = urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c);
        Integer num = this.d;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Photo photo = this.e;
        int a3 = fw3.a(fw3.a(qoy.b(qoy.b(shy.a(this.f, (hashCode + (photo == null ? 0 : photo.hashCode())) * 31, 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        String str = this.k;
        return a3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodAlbumEditFlowEntity(ownerId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", albumId=");
        sb.append(this.d);
        sb.append(", photo=");
        sb.append(this.e);
        sb.append(", count=");
        sb.append(this.f);
        sb.append(", isMain=");
        sb.append(this.g);
        sb.append(", isHidden=");
        sb.append(this.h);
        sb.append(", allItemIds=");
        sb.append(this.i);
        sb.append(", diffSelectionGoodsCache=");
        sb.append(this.j);
        sb.append(", easypromoteUrl=");
        return ho8.a(sb, this.k, ')');
    }

    public GoodAlbumEditFlowEntity(UserId userId, String str, Integer num, Photo photo, int i, boolean z, boolean z2, List<Long> list, List<Good> list2, String str2) {
        this.b = userId;
        this.c = str;
        this.d = num;
        this.e = photo;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = list;
        this.j = list2;
        this.k = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GoodAlbumEditFlowEntity(Serializer serializer) {
        this(r2, r3, r4, r5, r6, r7, r8, r9, r1, serializer.H());
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        String H = serializer.H();
        Integer v = serializer.v();
        Parcelable A = serializer.A(Photo.class.getClassLoader());
        Photo photo = A instanceof Photo ? (Photo) A : null;
        int u = serializer.u();
        boolean z2 = true;
        if (serializer.p() != 0) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        boolean z3 = serializer.p() != 0 ? z : false;
        long[] e = serializer.e();
        if (e != null) {
            arrayList = new ArrayList(e.length);
            for (long j : e) {
                arrayList.add(Long.valueOf(j));
            }
        } else {
            arrayList = new ArrayList();
        }
        ArrayList k = serializer.k(Good.class);
        if (k != null) {
            arrayList2 = new ArrayList(k);
        } else {
            arrayList2 = new ArrayList();
        }
    }
}
