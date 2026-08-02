package com.vk.newsfeed.posting.additional_settings.domain.model.author;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;

/* compiled from: Publisher.kt */
/* loaded from: classes4.dex */
public final class Publisher implements Serializer.StreamParcelable {
    public static final Serializer.c<Publisher> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Publisher> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Publisher a(Serializer serializer) {
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new Publisher(userId, H, H2 != null ? H2 : "");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Publisher[i];
        }
    }

    public Publisher(UserId userId, String str, String str2) {
        this.b = userId;
        this.c = str;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
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
