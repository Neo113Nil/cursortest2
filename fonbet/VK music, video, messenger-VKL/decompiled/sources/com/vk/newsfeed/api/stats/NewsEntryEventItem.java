package com.vk.newsfeed.api.stats;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;

/* compiled from: NewsEntryEventItem.kt */
/* loaded from: classes3.dex */
public final class NewsEntryEventItem implements Serializer.StreamParcelable {
    public static final Serializer.c<NewsEntryEventItem> CREATOR = new a();
    public final NewsEntryEventItemType b;
    public final Long c;
    public final UserId d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NewsEntryEventItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NewsEntryEventItem a(Serializer serializer) {
            return new NewsEntryEventItem((NewsEntryEventItemType) serializer.C(), serializer.x(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.I());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewsEntryEventItem[i];
        }
    }

    public NewsEntryEventItem(NewsEntryEventItemType newsEntryEventItemType, Long l, UserId userId, String str) {
        this.b = newsEntryEventItemType;
        this.c = l;
        this.d = userId;
        this.e = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.b0(this.c);
        serializer.e0(this.d);
        serializer.m0(this.e);
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
