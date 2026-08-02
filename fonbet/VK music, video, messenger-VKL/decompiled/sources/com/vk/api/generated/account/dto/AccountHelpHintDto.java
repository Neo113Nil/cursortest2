package com.vk.api.generated.account.dto;

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
import xsna.sn;
import xsna.zcl;

/* compiled from: AccountHelpHintDto.kt */
/* loaded from: classes14.dex */
public final class AccountHelpHintDto implements Parcelable {
    public static final Parcelable.Creator<AccountHelpHintDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final String id;

    @pmi0("resources")
    private final List<AccountHelpHintResourceItemDto> resources;

    @pmi0("skip_show")
    private final Boolean skipShow;

    @pmi0("title")
    private final String title;

    /* compiled from: AccountHelpHintDto.kt */
    public static final class a implements Parcelable.Creator<AccountHelpHintDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountHelpHintDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(AccountHelpHintResourceItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AccountHelpHintDto(readString, readString2, readString3, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountHelpHintDto[] newArray(int i) {
            return new AccountHelpHintDto[i];
        }
    }

    public AccountHelpHintDto(String str, String str2, String str3, Boolean bool, List<AccountHelpHintResourceItemDto> list) {
        this.id = str;
        this.description = str2;
        this.title = str3;
        this.skipShow = bool;
        this.resources = list;
    }

    public final List<AccountHelpHintResourceItemDto> d() {
        return this.resources;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountHelpHintDto)) {
            return false;
        }
        AccountHelpHintDto accountHelpHintDto = (AccountHelpHintDto) obj;
        return epx.f(this.id, accountHelpHintDto.id) && epx.f(this.description, accountHelpHintDto.description) && epx.f(this.title, accountHelpHintDto.title) && epx.f(this.skipShow, accountHelpHintDto.skipShow) && epx.f(this.resources, accountHelpHintDto.resources);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.skipShow;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<AccountHelpHintResourceItemDto> list = this.resources;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountHelpHintDto(id=");
        sb.append(this.id);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", skipShow=");
        sb.append(this.skipShow);
        sb.append(", resources=");
        return ms9.a(')', sb, this.resources);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeString(this.title);
        Boolean bool = this.skipShow;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<AccountHelpHintResourceItemDto> list = this.resources;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AccountHelpHintResourceItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AccountHelpHintDto(String str, String str2, String str3, Boolean bool, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : list);
    }
}
