package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AuthAppConfigAgreementsDto.kt */
/* loaded from: classes14.dex */
public final class AuthAppConfigAgreementsDto implements Parcelable {
    public static final Parcelable.Creator<AuthAppConfigAgreementsDto> CREATOR = new a();

    @pmi0("items")
    private final List<List<String>> items;

    @pmi0("text")
    private final String text;

    /* compiled from: AuthAppConfigAgreementsDto.kt */
    public static final class a implements Parcelable.Creator<AuthAppConfigAgreementsDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigAgreementsDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.createStringArrayList());
            }
            return new AuthAppConfigAgreementsDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigAgreementsDto[] newArray(int i) {
            return new AuthAppConfigAgreementsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthAppConfigAgreementsDto(String str, List<? extends List<String>> list) {
        this.text = str;
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
        if (!(obj instanceof AuthAppConfigAgreementsDto)) {
            return false;
        }
        AuthAppConfigAgreementsDto authAppConfigAgreementsDto = (AuthAppConfigAgreementsDto) obj;
        return epx.f(this.text, authAppConfigAgreementsDto.text) && epx.f(this.items, authAppConfigAgreementsDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthAppConfigAgreementsDto(text=");
        sb.append(this.text);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeStringList((List) a2.next());
        }
    }
}
