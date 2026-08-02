package com.vk.api.generated.storiesIdeas.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesIdeasIdeasBlockDto.kt */
/* loaded from: classes15.dex */
public final class StoriesIdeasIdeasBlockDto implements Parcelable {
    public static final Parcelable.Creator<StoriesIdeasIdeasBlockDto> CREATOR = new a();

    @pmi0(L2.g)
    private final String background;

    @pmi0("items")
    private final List<StoriesIdeasIdeaItemDto> items;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("thumb_hash")
    private final String thumbHash;

    /* compiled from: StoriesIdeasIdeasBlockDto.kt */
    public static final class a implements Parcelable.Creator<StoriesIdeasIdeasBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasIdeasBlockDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(StoriesIdeasIdeaItemDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new StoriesIdeasIdeasBlockDto(readString, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasIdeasBlockDto[] newArray(int i) {
            return new StoriesIdeasIdeasBlockDto[i];
        }
    }

    public StoriesIdeasIdeasBlockDto(String str, List<StoriesIdeasIdeaItemDto> list, Integer num, String str2) {
        this.background = str;
        this.items = list;
        this.position = num;
        this.thumbHash = str2;
    }

    public final String F5() {
        return this.thumbHash;
    }

    public final String d() {
        return this.background;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<StoriesIdeasIdeaItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesIdeasIdeasBlockDto)) {
            return false;
        }
        StoriesIdeasIdeasBlockDto storiesIdeasIdeasBlockDto = (StoriesIdeasIdeasBlockDto) obj;
        return epx.f(this.background, storiesIdeasIdeasBlockDto.background) && epx.f(this.items, storiesIdeasIdeasBlockDto.items) && epx.f(this.position, storiesIdeasIdeasBlockDto.position) && epx.f(this.thumbHash, storiesIdeasIdeasBlockDto.thumbHash);
    }

    public final Integer f() {
        return this.position;
    }

    public final int hashCode() {
        int hashCode = this.background.hashCode() * 31;
        List<StoriesIdeasIdeaItemDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.position;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.thumbHash;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesIdeasIdeasBlockDto(background=");
        sb.append(this.background);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", thumbHash=");
        return ho8.a(sb, this.thumbHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.background);
        List<StoriesIdeasIdeaItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((StoriesIdeasIdeaItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.position;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.thumbHash);
    }

    public /* synthetic */ StoriesIdeasIdeasBlockDto(String str, List list, Integer num, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2);
    }
}
