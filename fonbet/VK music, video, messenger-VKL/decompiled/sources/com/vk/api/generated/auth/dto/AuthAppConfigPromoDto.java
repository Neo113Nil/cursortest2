package com.vk.api.generated.auth.dto;

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

/* compiled from: AuthAppConfigPromoDto.kt */
/* loaded from: classes14.dex */
public final class AuthAppConfigPromoDto implements Parcelable {
    public static final Parcelable.Creator<AuthAppConfigPromoDto> CREATOR = new a();

    @pmi0("items")
    private final List<AuthAppConfigPromoItemsDto> items;

    @pmi0("text")
    private final String text;

    /* compiled from: AuthAppConfigPromoDto.kt */
    public static final class a implements Parcelable.Creator<AuthAppConfigPromoDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigPromoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AuthAppConfigPromoItemsDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AuthAppConfigPromoDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigPromoDto[] newArray(int i) {
            return new AuthAppConfigPromoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthAppConfigPromoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthAppConfigPromoDto)) {
            return false;
        }
        AuthAppConfigPromoDto authAppConfigPromoDto = (AuthAppConfigPromoDto) obj;
        return epx.f(this.text, authAppConfigPromoDto.text) && epx.f(this.items, authAppConfigPromoDto.items);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<AuthAppConfigPromoItemsDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthAppConfigPromoDto(text=");
        sb.append(this.text);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        List<AuthAppConfigPromoItemsDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AuthAppConfigPromoItemsDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public AuthAppConfigPromoDto(String str, List<AuthAppConfigPromoItemsDto> list) {
        this.text = str;
        this.items = list;
    }

    public /* synthetic */ AuthAppConfigPromoDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
