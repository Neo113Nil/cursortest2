package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsUserStackDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsActionAttachmentDto.kt */
/* loaded from: classes14.dex */
public final class AppsActionAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<AppsActionAttachmentDto> CREATOR = new a();

    @pmi0("application")
    private final AppsAppDto application;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("description")
    private final String description;

    @pmi0("footer")
    private final ExploreWidgetsUserStackDto footer;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("launch_url")
    private final String launchUrl;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsActionAttachmentDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("game")
        public static final TypeDto GAME;

        @pmi0("mini_app")
        public static final TypeDto MINI_APP;
        private final String value;

        /* compiled from: AppsActionAttachmentDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("GAME", 0, "game");
            GAME = typeDto;
            TypeDto typeDto2 = new TypeDto("MINI_APP", 1, "mini_app");
            MINI_APP = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AppsActionAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<AppsActionAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsActionAttachmentDto createFromParcel(Parcel parcel) {
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AppsActionAttachmentDto.class, parcel, arrayList, i, 1);
            }
            return new AppsActionAttachmentDto(createFromParcel, readString, readString2, arrayList, parcel.readString(), (AppsAppDto) parcel.readParcelable(AppsActionAttachmentDto.class.getClassLoader()), parcel.readString(), (ExploreWidgetsUserStackDto) parcel.readParcelable(AppsActionAttachmentDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsActionAttachmentDto[] newArray(int i) {
            return new AppsActionAttachmentDto[i];
        }
    }

    public AppsActionAttachmentDto(TypeDto typeDto, String str, String str2, List<BaseImageDto> list, String str3, AppsAppDto appsAppDto, String str4, ExploreWidgetsUserStackDto exploreWidgetsUserStackDto) {
        this.type = typeDto;
        this.title = str;
        this.description = str2;
        this.icons = list;
        this.buttonText = str3;
        this.application = appsAppDto;
        this.launchUrl = str4;
        this.footer = exploreWidgetsUserStackDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsActionAttachmentDto)) {
            return false;
        }
        AppsActionAttachmentDto appsActionAttachmentDto = (AppsActionAttachmentDto) obj;
        return this.type == appsActionAttachmentDto.type && epx.f(this.title, appsActionAttachmentDto.title) && epx.f(this.description, appsActionAttachmentDto.description) && epx.f(this.icons, appsActionAttachmentDto.icons) && epx.f(this.buttonText, appsActionAttachmentDto.buttonText) && epx.f(this.application, appsActionAttachmentDto.application) && epx.f(this.launchUrl, appsActionAttachmentDto.launchUrl) && epx.f(this.footer, appsActionAttachmentDto.footer);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.title), 31, this.description), 31, this.icons);
        String str = this.buttonText;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        AppsAppDto appsAppDto = this.application;
        int hashCode2 = (hashCode + (appsAppDto == null ? 0 : appsAppDto.hashCode())) * 31;
        String str2 = this.launchUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ExploreWidgetsUserStackDto exploreWidgetsUserStackDto = this.footer;
        return hashCode3 + (exploreWidgetsUserStackDto != null ? exploreWidgetsUserStackDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsActionAttachmentDto(type=" + this.type + ", title=" + this.title + ", description=" + this.description + ", icons=" + this.icons + ", buttonText=" + this.buttonText + ", application=" + this.application + ", launchUrl=" + this.launchUrl + ", footer=" + this.footer + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Iterator a2 = ao.a(parcel, this.icons);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.buttonText);
        parcel.writeParcelable(this.application, i);
        parcel.writeString(this.launchUrl);
        parcel.writeParcelable(this.footer, i);
    }

    public /* synthetic */ AppsActionAttachmentDto(TypeDto typeDto, String str, String str2, List list, String str3, AppsAppDto appsAppDto, String str4, ExploreWidgetsUserStackDto exploreWidgetsUserStackDto, int i, zcl zclVar) {
        this(typeDto, str, str2, list, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : appsAppDto, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : exploreWidgetsUserStackDto);
    }
}
