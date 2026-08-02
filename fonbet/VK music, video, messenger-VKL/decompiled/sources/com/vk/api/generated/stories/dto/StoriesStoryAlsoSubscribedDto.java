package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesStoryAlsoSubscribedDto.kt */
/* loaded from: classes15.dex */
public final class StoriesStoryAlsoSubscribedDto implements Parcelable {
    public static final Parcelable.Creator<StoriesStoryAlsoSubscribedDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("label")
    private final String label;

    @pmi0("user_ids")
    private final List<Integer> userIds;

    /* compiled from: StoriesStoryAlsoSubscribedDto.kt */
    public static final class a implements Parcelable.Creator<StoriesStoryAlsoSubscribedDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesStoryAlsoSubscribedDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StoriesStoryAlsoSubscribedDto(valueOf, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesStoryAlsoSubscribedDto[] newArray(int i) {
            return new StoriesStoryAlsoSubscribedDto[i];
        }
    }

    public StoriesStoryAlsoSubscribedDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Integer> e() {
        return this.userIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStoryAlsoSubscribedDto)) {
            return false;
        }
        StoriesStoryAlsoSubscribedDto storiesStoryAlsoSubscribedDto = (StoriesStoryAlsoSubscribedDto) obj;
        return epx.f(this.count, storiesStoryAlsoSubscribedDto.count) && epx.f(this.userIds, storiesStoryAlsoSubscribedDto.userIds) && epx.f(this.label, storiesStoryAlsoSubscribedDto.label);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<Integer> list = this.userIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.label;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesStoryAlsoSubscribedDto(count=");
        sb.append(this.count);
        sb.append(", userIds=");
        sb.append(this.userIds);
        sb.append(", label=");
        return ho8.a(sb, this.label, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<Integer> list = this.userIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeString(this.label);
    }

    public StoriesStoryAlsoSubscribedDto(Integer num, List<Integer> list, String str) {
        this.count = num;
        this.userIds = list;
        this.label = str;
    }

    public /* synthetic */ StoriesStoryAlsoSubscribedDto(Integer num, List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str);
    }
}
