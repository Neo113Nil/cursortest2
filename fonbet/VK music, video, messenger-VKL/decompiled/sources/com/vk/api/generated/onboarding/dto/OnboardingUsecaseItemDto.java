package com.vk.api.generated.onboarding.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: OnboardingUsecaseItemDto.kt */
/* loaded from: classes15.dex */
public final class OnboardingUsecaseItemDto implements Parcelable {
    public static final Parcelable.Creator<OnboardingUsecaseItemDto> CREATOR = new a();

    @pmi0("icon")
    private final String icon;

    @pmi0("icon_token")
    private final String iconToken;

    @pmi0("icons_dark")
    private final List<BaseImageDto> iconsDark;

    @pmi0("icons_light")
    private final List<BaseImageDto> iconsLight;

    @pmi0("id")
    private final String id;

    @pmi0("question")
    private final String question;

    @pmi0("selected")
    private final boolean selected;

    @pmi0("title")
    private final String title;

    /* compiled from: OnboardingUsecaseItemDto.kt */
    public static final class a implements Parcelable.Creator<OnboardingUsecaseItemDto> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingUsecaseItemDto createFromParcel(Parcel parcel) {
            int i;
            int i2;
            ArrayList arrayList;
            String readString = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
                i2 = 1;
            } else {
                i = 0;
                i2 = 1;
            }
            String readString2 = parcel.readString();
            int i3 = i2;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i4 = i;
                while (i4 != readInt) {
                    i4 = bo.b(OnboardingUsecaseItemDto.class, parcel, arrayList, i4, i3);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(OnboardingUsecaseItemDto.class, parcel, arrayList2, i, i3);
                }
            }
            return new OnboardingUsecaseItemDto(readString, z, readString2, readString3, readString4, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingUsecaseItemDto[] newArray(int i) {
            return new OnboardingUsecaseItemDto[i];
        }
    }

    public OnboardingUsecaseItemDto(String str, boolean z, String str2, String str3, String str4, List<BaseImageDto> list, List<BaseImageDto> list2, String str5) {
        this.id = str;
        this.selected = z;
        this.title = str2;
        this.icon = str3;
        this.iconToken = str4;
        this.iconsLight = list;
        this.iconsDark = list2;
        this.question = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingUsecaseItemDto)) {
            return false;
        }
        OnboardingUsecaseItemDto onboardingUsecaseItemDto = (OnboardingUsecaseItemDto) obj;
        return epx.f(this.id, onboardingUsecaseItemDto.id) && this.selected == onboardingUsecaseItemDto.selected && epx.f(this.title, onboardingUsecaseItemDto.title) && epx.f(this.icon, onboardingUsecaseItemDto.icon) && epx.f(this.iconToken, onboardingUsecaseItemDto.iconToken) && epx.f(this.iconsLight, onboardingUsecaseItemDto.iconsLight) && epx.f(this.iconsDark, onboardingUsecaseItemDto.iconsDark) && epx.f(this.question, onboardingUsecaseItemDto.question);
    }

    public final int hashCode() {
        int a2 = urd0.a(qoy.b(this.id.hashCode() * 31, 31, this.selected), 31, this.title);
        String str = this.icon;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseImageDto> list = this.iconsLight;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.iconsDark;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.question;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingUsecaseItemDto(id=");
        sb.append(this.id);
        sb.append(", selected=");
        sb.append(this.selected);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", iconToken=");
        sb.append(this.iconToken);
        sb.append(", iconsLight=");
        sb.append(this.iconsLight);
        sb.append(", iconsDark=");
        sb.append(this.iconsDark);
        sb.append(", question=");
        return ho8.a(sb, this.question, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.selected ? 1 : 0);
        parcel.writeString(this.title);
        parcel.writeString(this.icon);
        parcel.writeString(this.iconToken);
        List<BaseImageDto> list = this.iconsLight;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<BaseImageDto> list2 = this.iconsDark;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.question);
    }

    public /* synthetic */ OnboardingUsecaseItemDto(String str, boolean z, String str2, String str3, String str4, List list, List list2, String str5, int i, zcl zclVar) {
        this(str, z, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : str5);
    }
}
