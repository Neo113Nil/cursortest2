package com.vk.odnoklassniki.registration.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CreatePasswordFragmentData.kt */
/* loaded from: classes4.dex */
public final class CreatePasswordFragmentData implements Parcelable {
    public static final Parcelable.Creator<CreatePasswordFragmentData> CREATOR = new a();

    @pmi0("max_messenger_hash")
    private final String maxMessengerHash;

    @pmi0("password_validation_rules")
    private final List<String> passwordValidationRules;

    @pmi0("phone_number")
    private final String phoneNumber;

    @pmi0(O6.e1)
    private final String sid;

    /* compiled from: CreatePasswordFragmentData.kt */
    public static final class a implements Parcelable.Creator<CreatePasswordFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final CreatePasswordFragmentData createFromParcel(Parcel parcel) {
            return new CreatePasswordFragmentData(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreatePasswordFragmentData[] newArray(int i) {
            return new CreatePasswordFragmentData[i];
        }
    }

    public CreatePasswordFragmentData(String str, List<String> list, String str2, String str3) {
        this.sid = str;
        this.passwordValidationRules = list;
        this.phoneNumber = str2;
        this.maxMessengerHash = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePasswordFragmentData)) {
            return false;
        }
        CreatePasswordFragmentData createPasswordFragmentData = (CreatePasswordFragmentData) obj;
        return epx.f(this.sid, createPasswordFragmentData.sid) && epx.f(this.passwordValidationRules, createPasswordFragmentData.passwordValidationRules) && epx.f(this.phoneNumber, createPasswordFragmentData.phoneNumber) && epx.f(this.maxMessengerHash, createPasswordFragmentData.maxMessengerHash);
    }

    public final int hashCode() {
        int hashCode = this.sid.hashCode() * 31;
        List<String> list = this.passwordValidationRules;
        int a2 = urd0.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.phoneNumber);
        String str = this.maxMessengerHash;
        return a2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreatePasswordFragmentData(sid=");
        sb.append(this.sid);
        sb.append(", passwordValidationRules=");
        sb.append(this.passwordValidationRules);
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", maxMessengerHash=");
        return ho8.a(sb, this.maxMessengerHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        parcel.writeStringList(this.passwordValidationRules);
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.maxMessengerHash);
    }

    public /* synthetic */ CreatePasswordFragmentData(String str, List list, String str2, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list, str2, (i & 8) != 0 ? null : str3);
    }
}
