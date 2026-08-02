package com.vk.feed.core.models;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;

/* compiled from: NewsfeedResearch.kt */
/* loaded from: classes18.dex */
public final class NewsfeedResearchEvent implements Serializer.StreamParcelable {
    public static final Serializer.c<NewsfeedResearchEvent> CREATOR = new a();
    public final UserId b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NewsfeedResearchEvent> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NewsfeedResearchEvent a(Serializer serializer) {
            UserId userId = new UserId(serializer.w());
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new NewsfeedResearchEvent(userId, H);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewsfeedResearchEvent[i];
        }
    }

    public NewsfeedResearchEvent(UserId userId, String str) {
        this.b = userId;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b.b);
        serializer.j0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedResearchEvent)) {
            return false;
        }
        NewsfeedResearchEvent newsfeedResearchEvent = (NewsfeedResearchEvent) obj;
        return epx.f(this.b, newsfeedResearchEvent.b) && epx.f(this.c, newsfeedResearchEvent.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedResearchEvent(sourceId=");
        sb.append(this.b);
        sb.append(", itemId=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
