package com.vk.newsfeed.api.data.discover;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.discover.DiscoverCategory;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;

/* compiled from: DiscoverCategoriesContainer.kt */
/* loaded from: classes3.dex */
public final class DiscoverCategoriesContainer implements Serializer.StreamParcelable {
    public static final Serializer.c<DiscoverCategoriesContainer> CREATOR = new a();
    public final List<DiscoverCategory> b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DiscoverCategoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DiscoverCategoriesContainer a(Serializer serializer) {
            return new DiscoverCategoriesContainer(serializer.j(DiscoverCategory.CREATOR));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DiscoverCategoriesContainer[i];
        }
    }

    static {
        new DiscoverCategoriesContainer(EmptyList.b);
    }

    public DiscoverCategoriesContainer(List<DiscoverCategory> list) {
        this.b = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return DiscoverCategoriesContainer.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.b, ((DiscoverCategoriesContainer) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
