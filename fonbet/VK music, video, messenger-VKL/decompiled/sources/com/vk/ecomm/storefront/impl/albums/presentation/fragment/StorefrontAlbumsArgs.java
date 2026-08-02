package com.vk.ecomm.storefront.impl.albums.presentation.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: StorefrontAlbumsArgs.kt */
/* loaded from: classes18.dex */
public final class StorefrontAlbumsArgs implements Parcelable {
    public static final Parcelable.Creator<StorefrontAlbumsArgs> CREATOR = new a();
    public final UserId b;

    /* compiled from: StorefrontAlbumsArgs.kt */
    public static final class a implements Parcelable.Creator<StorefrontAlbumsArgs> {
        @Override // android.os.Parcelable.Creator
        public final StorefrontAlbumsArgs createFromParcel(Parcel parcel) {
            return new StorefrontAlbumsArgs((UserId) parcel.readParcelable(StorefrontAlbumsArgs.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StorefrontAlbumsArgs[] newArray(int i) {
            return new StorefrontAlbumsArgs[i];
        }
    }

    public StorefrontAlbumsArgs(UserId userId) {
        this.b = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StorefrontAlbumsArgs) && epx.f(this.b, ((StorefrontAlbumsArgs) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("StorefrontAlbumsArgs(ownerId="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
