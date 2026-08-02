package com.vk.api.generated.friends.dto;

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
import xsna.urd0;
import xsna.zcl;

/* compiled from: FriendsEntrypointsDto.kt */
/* loaded from: classes14.dex */
public final class FriendsEntrypointsDto implements Parcelable {
    public static final Parcelable.Creator<FriendsEntrypointsDto> CREATOR = new a();

    @pmi0("items")
    private final List<FriendsEntrypointDto> items;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: FriendsEntrypointsDto.kt */
    public static final class a implements Parcelable.Creator<FriendsEntrypointsDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsEntrypointsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(FriendsEntrypointDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new FriendsEntrypointsDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsEntrypointsDto[] newArray(int i) {
            return new FriendsEntrypointsDto[i];
        }
    }

    public FriendsEntrypointsDto(String str, String str2, List<FriendsEntrypointDto> list) {
        this.title = str;
        this.trackCode = str2;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsEntrypointsDto)) {
            return false;
        }
        FriendsEntrypointsDto friendsEntrypointsDto = (FriendsEntrypointsDto) obj;
        return epx.f(this.title, friendsEntrypointsDto.title) && epx.f(this.trackCode, friendsEntrypointsDto.trackCode) && epx.f(this.items, friendsEntrypointsDto.items);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.title.hashCode() * 31, 31, this.trackCode);
        List<FriendsEntrypointDto> list = this.items;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsEntrypointsDto(title=");
        sb.append(this.title);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.trackCode);
        List<FriendsEntrypointDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((FriendsEntrypointDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FriendsEntrypointsDto(String str, String str2, List list, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : list);
    }
}
