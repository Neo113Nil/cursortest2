package com.vk.feed.core.models.header;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ImageStatus;
import com.vk.feed.core.models.Text;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.dq;
import xsna.j5g;
import xsna.zcl;

/* compiled from: HeaderTitle.kt */
/* loaded from: classes18.dex */
public final class HeaderTitle implements Serializer.StreamParcelable {
    public static final Serializer.c<HeaderTitle> CREATOR = new a();
    public final List<UserId> b;
    public final List<Text> c;
    public final ImageStatus d;
    public final VerifyInfo e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<HeaderTitle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final HeaderTitle a(Serializer serializer) {
            ArrayList arrayList;
            ArrayList<Long> f = serializer.f();
            if (f != null) {
                arrayList = new ArrayList(c5g.u(f, 10));
                Iterator<Long> it = f.iterator();
                while (it.hasNext()) {
                    dq.h(it.next().longValue(), arrayList);
                }
            } else {
                arrayList = null;
            }
            return new HeaderTitle(arrayList, serializer.j(Text.CREATOR), (ImageStatus) serializer.G(ImageStatus.class.getClassLoader()), VerifyInfo.CREATOR.a(serializer), serializer.m(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HeaderTitle[i];
        }
    }

    public HeaderTitle(List<UserId> list, List<Text> list2, ImageStatus imageStatus, VerifyInfo verifyInfo, boolean z, boolean z2, boolean z3) {
        this.b = list;
        this.c = list2;
        this.d = imageStatus;
        this.e = verifyInfo;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        ArrayList arrayList;
        List<UserId> list = this.b;
        if (list != null) {
            List<UserId> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((UserId) it.next()).b));
            }
        } else {
            arrayList = null;
        }
        serializer.a0(arrayList);
        serializer.o0(this.c);
        serializer.i0(this.d);
        this.e.O7(serializer);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
    }

    public final UserId d() {
        List<UserId> list = this.b;
        if (list != null) {
            return (UserId) j5g.a0(list);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ HeaderTitle(List list, List list2, ImageStatus imageStatus, VerifyInfo verifyInfo, boolean z, boolean z2, boolean z3, int i, zcl zclVar) {
        this(list, list2, imageStatus, verifyInfo, z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3);
    }
}
