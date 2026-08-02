package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesMediascopeResearchDto.kt */
/* loaded from: classes15.dex */
public final class StoriesMediascopeResearchDto implements Parcelable {
    public static final Parcelable.Creator<StoriesMediascopeResearchDto> CREATOR = new a();

    @pmi0("events")
    private final List<StoriesMediascopeResearchEventDto> events;

    @pmi0("urls")
    private final List<String> urls;

    /* compiled from: StoriesMediascopeResearchDto.kt */
    public static final class a implements Parcelable.Creator<StoriesMediascopeResearchDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesMediascopeResearchDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(StoriesMediascopeResearchEventDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StoriesMediascopeResearchDto(createStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesMediascopeResearchDto[] newArray(int i) {
            return new StoriesMediascopeResearchDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoriesMediascopeResearchDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<StoriesMediascopeResearchEventDto> d() {
        return this.events;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.urls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesMediascopeResearchDto)) {
            return false;
        }
        StoriesMediascopeResearchDto storiesMediascopeResearchDto = (StoriesMediascopeResearchDto) obj;
        return epx.f(this.urls, storiesMediascopeResearchDto.urls) && epx.f(this.events, storiesMediascopeResearchDto.events);
    }

    public final int hashCode() {
        List<String> list = this.urls;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StoriesMediascopeResearchEventDto> list2 = this.events;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesMediascopeResearchDto(urls=");
        sb.append(this.urls);
        sb.append(", events=");
        return ms9.a(')', sb, this.events);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.urls);
        List<StoriesMediascopeResearchEventDto> list = this.events;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((StoriesMediascopeResearchEventDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public StoriesMediascopeResearchDto(List<String> list, List<StoriesMediascopeResearchEventDto> list2) {
        this.urls = list;
        this.events = list2;
    }

    public /* synthetic */ StoriesMediascopeResearchDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
