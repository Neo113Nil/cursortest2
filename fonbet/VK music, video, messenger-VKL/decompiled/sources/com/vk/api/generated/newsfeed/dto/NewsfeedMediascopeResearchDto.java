package com.vk.api.generated.newsfeed.dto;

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

/* compiled from: NewsfeedMediascopeResearchDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedMediascopeResearchDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedMediascopeResearchDto> CREATOR = new a();

    @pmi0("events")
    private final List<NewsfeedMediascopeResearchEventDto> events;

    @pmi0("urls")
    private final List<String> urls;

    /* compiled from: NewsfeedMediascopeResearchDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedMediascopeResearchDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedMediascopeResearchDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(NewsfeedMediascopeResearchEventDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new NewsfeedMediascopeResearchDto(createStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedMediascopeResearchDto[] newArray(int i) {
            return new NewsfeedMediascopeResearchDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedMediascopeResearchDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<NewsfeedMediascopeResearchEventDto> d() {
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
        if (!(obj instanceof NewsfeedMediascopeResearchDto)) {
            return false;
        }
        NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = (NewsfeedMediascopeResearchDto) obj;
        return epx.f(this.urls, newsfeedMediascopeResearchDto.urls) && epx.f(this.events, newsfeedMediascopeResearchDto.events);
    }

    public final int hashCode() {
        List<String> list = this.urls;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<NewsfeedMediascopeResearchEventDto> list2 = this.events;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedMediascopeResearchDto(urls=");
        sb.append(this.urls);
        sb.append(", events=");
        return ms9.a(')', sb, this.events);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.urls);
        List<NewsfeedMediascopeResearchEventDto> list = this.events;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((NewsfeedMediascopeResearchEventDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public NewsfeedMediascopeResearchDto(List<String> list, List<NewsfeedMediascopeResearchEventDto> list2) {
        this.urls = list;
        this.events = list2;
    }

    public /* synthetic */ NewsfeedMediascopeResearchDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
