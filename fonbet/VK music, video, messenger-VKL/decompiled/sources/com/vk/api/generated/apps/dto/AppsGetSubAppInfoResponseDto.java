package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.sdk.SharedKt;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsGetSubAppInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetSubAppInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetSubAppInfoResponseDto> CREATOR = new a();

    @pmi0("icon_139")
    private final String icon139;

    @pmi0("icon_150")
    private final String icon150;

    @pmi0("icon_278")
    private final String icon278;

    @pmi0("icon_576")
    private final String icon576;

    @pmi0("icon_75")
    private final String icon75;

    @pmi0("items")
    private final List<AppsScopeDto> items;

    @pmi0("name")
    private final String name;

    @pmi0(SharedKt.PARAM_SCOPES)
    private final List<AppsScopeDto> scopes;

    @pmi0("show_underlay")
    private final boolean showUnderlay;

    /* compiled from: AppsGetSubAppInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetSubAppInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetSubAppInfoResponseDto createFromParcel(Parcel parcel) {
            int i = 0;
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(AppsScopeDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(AppsScopeDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new AppsGetSubAppInfoResponseDto(z, arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetSubAppInfoResponseDto[] newArray(int i) {
            return new AppsGetSubAppInfoResponseDto[i];
        }
    }

    public AppsGetSubAppInfoResponseDto(boolean z, List<AppsScopeDto> list, List<AppsScopeDto> list2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.showUnderlay = z;
        this.items = list;
        this.scopes = list2;
        this.name = str;
        this.icon75 = str2;
        this.icon139 = str3;
        this.icon150 = str4;
        this.icon278 = str5;
        this.icon576 = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetSubAppInfoResponseDto)) {
            return false;
        }
        AppsGetSubAppInfoResponseDto appsGetSubAppInfoResponseDto = (AppsGetSubAppInfoResponseDto) obj;
        return this.showUnderlay == appsGetSubAppInfoResponseDto.showUnderlay && epx.f(this.items, appsGetSubAppInfoResponseDto.items) && epx.f(this.scopes, appsGetSubAppInfoResponseDto.scopes) && epx.f(this.name, appsGetSubAppInfoResponseDto.name) && epx.f(this.icon75, appsGetSubAppInfoResponseDto.icon75) && epx.f(this.icon139, appsGetSubAppInfoResponseDto.icon139) && epx.f(this.icon150, appsGetSubAppInfoResponseDto.icon150) && epx.f(this.icon278, appsGetSubAppInfoResponseDto.icon278) && epx.f(this.icon576, appsGetSubAppInfoResponseDto.icon576);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(Boolean.hashCode(this.showUnderlay) * 31, 31, this.items), 31, this.scopes);
        String str = this.name;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon75;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon139;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon150;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.icon278;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.icon576;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetSubAppInfoResponseDto(showUnderlay=");
        sb.append(this.showUnderlay);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", scopes=");
        sb.append(this.scopes);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", icon75=");
        sb.append(this.icon75);
        sb.append(", icon139=");
        sb.append(this.icon139);
        sb.append(", icon150=");
        sb.append(this.icon150);
        sb.append(", icon278=");
        sb.append(this.icon278);
        sb.append(", icon576=");
        return ho8.a(sb, this.icon576, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.showUnderlay ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsScopeDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.scopes);
        while (a3.hasNext()) {
            ((AppsScopeDto) a3.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.icon75);
        parcel.writeString(this.icon139);
        parcel.writeString(this.icon150);
        parcel.writeString(this.icon278);
        parcel.writeString(this.icon576);
    }

    public /* synthetic */ AppsGetSubAppInfoResponseDto(boolean z, List list, List list2, String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this(z, list, list2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6);
    }
}
