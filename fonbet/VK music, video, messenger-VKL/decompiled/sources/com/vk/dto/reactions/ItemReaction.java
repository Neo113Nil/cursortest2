package com.vk.dto.reactions;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.vu5;

/* compiled from: ItemReaction.kt */
/* loaded from: classes18.dex */
public final class ItemReaction implements Serializer.StreamParcelable {
    public static final Serializer.c<ItemReaction> CREATOR = new a();
    public final int b;
    public int c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ItemReaction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ItemReaction a(Serializer serializer) {
            return new ItemReaction(serializer.u(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ItemReaction[i];
        }
    }

    public ItemReaction(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemReaction)) {
            return false;
        }
        ItemReaction itemReaction = (ItemReaction) obj;
        return this.b == itemReaction.b && this.c == itemReaction.c;
    }

    public final int getCount() {
        return this.c;
    }

    public final int getId() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemReaction(id=");
        sb.append(this.b);
        sb.append(", count=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
