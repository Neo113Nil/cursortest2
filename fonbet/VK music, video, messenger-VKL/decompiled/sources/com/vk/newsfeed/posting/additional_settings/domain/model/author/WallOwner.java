package com.vk.newsfeed.posting.additional_settings.domain.model.author;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;

/* compiled from: WallOwner.kt */
/* loaded from: classes4.dex */
public final class WallOwner implements Serializer.StreamParcelable {
    public static final Serializer.c<WallOwner> CREATOR = new a();
    public final UserId b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WallOwner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WallOwner a(Serializer serializer) {
            return new WallOwner((UserId) serializer.A(UserId.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WallOwner[i];
        }
    }

    public WallOwner(UserId userId) {
        this.b = userId;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
