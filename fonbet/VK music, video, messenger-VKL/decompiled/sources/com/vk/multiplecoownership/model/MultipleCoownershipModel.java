package com.vk.multiplecoownership.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.gp;

/* compiled from: MultipleCoownershipModel.kt */
/* loaded from: classes3.dex */
public final class MultipleCoownershipModel implements Parcelable {
    public static final Parcelable.Creator<MultipleCoownershipModel> CREATOR = new a();
    public final List<NewsfeedCoowners.CoownerRequest> b;
    public final MultipleCoownershipType c;
    public final Post d;
    public final UserId e;

    /* compiled from: MultipleCoownershipModel.kt */
    public static final class a implements Parcelable.Creator<MultipleCoownershipModel> {
        @Override // android.os.Parcelable.Creator
        public final MultipleCoownershipModel createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MultipleCoownershipModel.class, parcel, arrayList, i, 1);
            }
            return new MultipleCoownershipModel(arrayList, MultipleCoownershipType.valueOf(parcel.readString()), (Post) parcel.readParcelable(MultipleCoownershipModel.class.getClassLoader()), (UserId) parcel.readParcelable(MultipleCoownershipModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MultipleCoownershipModel[] newArray(int i) {
            return new MultipleCoownershipModel[i];
        }
    }

    public MultipleCoownershipModel(List<NewsfeedCoowners.CoownerRequest> list, MultipleCoownershipType multipleCoownershipType, Post post, UserId userId) {
        this.b = list;
        this.c = multipleCoownershipType;
        this.d = post;
        this.e = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultipleCoownershipModel)) {
            return false;
        }
        MultipleCoownershipModel multipleCoownershipModel = (MultipleCoownershipModel) obj;
        return epx.f(this.b, multipleCoownershipModel.b) && this.c == multipleCoownershipModel.c && epx.f(this.d, multipleCoownershipModel.d) && epx.f(this.e, multipleCoownershipModel.e);
    }

    public final int hashCode() {
        return Long.hashCode(this.e.b) + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultipleCoownershipModel(requests=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", post=");
        sb.append(this.d);
        sb.append(", ownerId=");
        return gp.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.c.name());
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
    }
}
