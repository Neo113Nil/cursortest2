package com.vk.dto.badges;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;

/* compiled from: BadgePostItem.kt */
/* loaded from: classes18.dex */
public final class BadgePostItem implements Serializer.StreamParcelable {
    public static final Serializer.c<BadgePostItem> CREATOR = new a();
    public final BadgeItem b;
    public final int c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BadgePostItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BadgePostItem a(Serializer serializer) {
            return new BadgePostItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BadgePostItem[i];
        }
    }

    public BadgePostItem(BadgeItem badgeItem, int i) {
        this.b = badgeItem;
        this.c = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.S(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public BadgePostItem(Serializer serializer) {
        this((BadgeItem) serializer.G(BadgeItem.class.getClassLoader()), serializer.u());
    }
}
