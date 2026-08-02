package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsScopeDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.sdk.SharedKt;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AuthCodeAuthClientInfoDto.kt */
/* loaded from: classes14.dex */
public final class AuthCodeAuthClientInfoDto implements Parcelable {
    public static final Parcelable.Creator<AuthCodeAuthClientInfoDto> CREATOR = new a();

    @pmi0("agreements")
    private final List<AuthAgreementLinkDto> agreements;

    @pmi0("icon_150")
    private final String icon150;

    @pmi0("icon_75")
    private final String icon75;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_official")
    private final Boolean isOfficial;

    @pmi0("name")
    private final String name;

    @pmi0(SharedKt.PARAM_SCOPES)
    private final List<AppsScopeDto> scopes;

    /* compiled from: AuthCodeAuthClientInfoDto.kt */
    public static final class a implements Parcelable.Creator<AuthCodeAuthClientInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthCodeAuthClientInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
                ArrayList arrayList3 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(AppsScopeDto.CREATOR, parcel, arrayList3, i2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(AuthAgreementLinkDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new AuthCodeAuthClientInfoDto(valueOf2, readString, readString2, readString3, valueOf, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthCodeAuthClientInfoDto[] newArray(int i) {
            return new AuthCodeAuthClientInfoDto[i];
        }
    }

    public AuthCodeAuthClientInfoDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final List<AuthAgreementLinkDto> d() {
        return this.agreements;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.icon150;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthCodeAuthClientInfoDto)) {
            return false;
        }
        AuthCodeAuthClientInfoDto authCodeAuthClientInfoDto = (AuthCodeAuthClientInfoDto) obj;
        return epx.f(this.id, authCodeAuthClientInfoDto.id) && epx.f(this.name, authCodeAuthClientInfoDto.name) && epx.f(this.icon75, authCodeAuthClientInfoDto.icon75) && epx.f(this.icon150, authCodeAuthClientInfoDto.icon150) && epx.f(this.isOfficial, authCodeAuthClientInfoDto.isOfficial) && epx.f(this.scopes, authCodeAuthClientInfoDto.scopes) && epx.f(this.agreements, authCodeAuthClientInfoDto.agreements);
    }

    public final String f() {
        return this.icon75;
    }

    public final Integer g() {
        return this.id;
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon75;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon150;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isOfficial;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<AppsScopeDto> list = this.scopes;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<AuthAgreementLinkDto> list2 = this.agreements;
        return hashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String i() {
        return this.name;
    }

    public final List<AppsScopeDto> j() {
        return this.scopes;
    }

    public final Boolean k() {
        return this.isOfficial;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCodeAuthClientInfoDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", icon75=");
        sb.append(this.icon75);
        sb.append(", icon150=");
        sb.append(this.icon150);
        sb.append(", isOfficial=");
        sb.append(this.isOfficial);
        sb.append(", scopes=");
        sb.append(this.scopes);
        sb.append(", agreements=");
        return ms9.a(')', sb, this.agreements);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.icon75);
        parcel.writeString(this.icon150);
        Boolean bool = this.isOfficial;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<AppsScopeDto> list = this.scopes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AppsScopeDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<AuthAgreementLinkDto> list2 = this.agreements;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((AuthAgreementLinkDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public AuthCodeAuthClientInfoDto(Integer num, String str, String str2, String str3, Boolean bool, List<AppsScopeDto> list, List<AuthAgreementLinkDto> list2) {
        this.id = num;
        this.name = str;
        this.icon75 = str2;
        this.icon150 = str3;
        this.isOfficial = bool;
        this.scopes = list;
        this.agreements = list2;
    }

    public /* synthetic */ AuthCodeAuthClientInfoDto(Integer num, String str, String str2, String str3, Boolean bool, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2);
    }
}
