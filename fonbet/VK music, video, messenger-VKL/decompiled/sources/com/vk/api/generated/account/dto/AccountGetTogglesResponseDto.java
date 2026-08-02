package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AccountGetTogglesResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetTogglesResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetTogglesResponseDto> CREATOR = new a();

    @pmi0("ab_tests")
    private final List<String> abTests;

    @pmi0("toggles")
    private final List<AccountToggleDto> toggles;

    @pmi0(LoginApiConstants.PARAM_NAME_USERNAME)
    private final String userName;

    @pmi0("version")
    private final int version;

    /* compiled from: AccountGetTogglesResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetTogglesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetTogglesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AccountToggleDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AccountGetTogglesResponseDto(arrayList, parcel.readInt(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetTogglesResponseDto[] newArray(int i) {
            return new AccountGetTogglesResponseDto[i];
        }
    }

    public AccountGetTogglesResponseDto(List<AccountToggleDto> list, int i, List<String> list2, String str) {
        this.toggles = list;
        this.version = i;
        this.abTests = list2;
        this.userName = str;
    }

    public final List<AccountToggleDto> d() {
        return this.toggles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.version;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetTogglesResponseDto)) {
            return false;
        }
        AccountGetTogglesResponseDto accountGetTogglesResponseDto = (AccountGetTogglesResponseDto) obj;
        return epx.f(this.toggles, accountGetTogglesResponseDto.toggles) && this.version == accountGetTogglesResponseDto.version && epx.f(this.abTests, accountGetTogglesResponseDto.abTests) && epx.f(this.userName, accountGetTogglesResponseDto.userName);
    }

    public final int hashCode() {
        int a2 = shy.a(this.version, this.toggles.hashCode() * 31, 31);
        List<String> list = this.abTests;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.userName;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetTogglesResponseDto(toggles=");
        sb.append(this.toggles);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", abTests=");
        sb.append(this.abTests);
        sb.append(", userName=");
        return ho8.a(sb, this.userName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.toggles);
        while (a2.hasNext()) {
            ((AccountToggleDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.version);
        parcel.writeStringList(this.abTests);
        parcel.writeString(this.userName);
    }

    public /* synthetic */ AccountGetTogglesResponseDto(List list, int i, List list2, String str, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : str);
    }
}
