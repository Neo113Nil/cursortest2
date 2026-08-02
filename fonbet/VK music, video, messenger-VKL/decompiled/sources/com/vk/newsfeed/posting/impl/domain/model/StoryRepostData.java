package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;

/* compiled from: StoryRepostData.kt */
/* loaded from: classes4.dex */
public final class StoryRepostData implements Parcelable {
    public static final Parcelable.Creator<StoryRepostData> CREATOR = new a();
    public final UserId b;
    public final PrivacyPostType c;
    public final List<PostingAttachment> d;

    /* compiled from: StoryRepostData.kt */
    public static final class a implements Parcelable.Creator<StoryRepostData> {
        @Override // android.os.Parcelable.Creator
        public final StoryRepostData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            UserId userId = (UserId) parcel.readParcelable(StoryRepostData.class.getClassLoader());
            PrivacyPostType privacyPostType = (PrivacyPostType) parcel.readParcelable(StoryRepostData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(StoryRepostData.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StoryRepostData(userId, privacyPostType, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoryRepostData[] newArray(int i) {
            return new StoryRepostData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoryRepostData(UserId userId, PrivacyPostType privacyPostType, List<? extends PostingAttachment> list) {
        this.b = userId;
        this.c = privacyPostType;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryRepostData)) {
            return false;
        }
        StoryRepostData storyRepostData = (StoryRepostData) obj;
        return epx.f(this.b, storyRepostData.b) && epx.f(this.c, storyRepostData.c) && epx.f(this.d, storyRepostData.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31;
        List<PostingAttachment> list = this.d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryRepostData(ownerId=");
        sb.append(this.b);
        sb.append(", privacy=");
        sb.append(this.c);
        sb.append(", attachments=");
        return ms9.a(')', sb, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        List<PostingAttachment> list = this.d;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }
}
