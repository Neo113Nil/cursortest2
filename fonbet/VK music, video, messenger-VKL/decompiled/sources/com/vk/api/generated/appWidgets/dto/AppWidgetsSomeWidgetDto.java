package com.vk.api.generated.appWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppWidgetsSomeWidgetDto.kt */
/* loaded from: classes14.dex */
public final class AppWidgetsSomeWidgetDto implements Parcelable {
    public static final Parcelable.Creator<AppWidgetsSomeWidgetDto> CREATOR = new a();

    @pmi0("backers")
    private final Integer backers;

    @pmi0("button")
    private final String button;

    @pmi0("button_action")
    private final AppWidgetsActionDto buttonAction;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final String currency;

    @pmi0("funded")
    private final Float funded;

    @pmi0("goal")
    private final Float goal;

    @pmi0("more")
    private final String more;

    @pmi0("more_action")
    private final AppWidgetsActionDto moreAction;

    @pmi0("text")
    private final String text;

    @pmi0("text_action")
    private final AppWidgetsActionDto textAction;

    @pmi0("title")
    private final String title;

    @pmi0("title_action")
    private final AppWidgetsActionDto titleAction;

    @pmi0("title_counter")
    private final Integer titleCounter;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppWidgetsSomeWidgetDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("donation_widget")
        public static final TypeDto DONATION_WIDGET;
        private final String value;

        /* compiled from: AppWidgetsSomeWidgetDto.kt */
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
            TypeDto typeDto = new TypeDto("DONATION_WIDGET", 0, "donation_widget");
            DONATION_WIDGET = typeDto;
            TypeDto[] typeDtoArr = {typeDto};
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

    /* compiled from: AppWidgetsSomeWidgetDto.kt */
    public static final class a implements Parcelable.Creator<AppWidgetsSomeWidgetDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final AppWidgetsSomeWidgetDto createFromParcel(Parcel parcel) {
            Float valueOf;
            AppWidgetsActionDto appWidgetsActionDto;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            AppWidgetsActionDto createFromParcel2 = parcel.readInt() == 0 ? null : AppWidgetsActionDto.CREATOR.createFromParcel(parcel);
            Integer num = valueOf2;
            String readString2 = parcel.readString();
            Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                valueOf = null;
                appWidgetsActionDto = null;
            } else {
                valueOf = Float.valueOf(parcel.readFloat());
                appWidgetsActionDto = null;
            }
            Float f = valueOf3;
            String readString3 = parcel.readString();
            AppWidgetsActionDto createFromParcel3 = parcel.readInt() == 0 ? appWidgetsActionDto : AppWidgetsActionDto.CREATOR.createFromParcel(parcel);
            AppWidgetsActionDto appWidgetsActionDto2 = appWidgetsActionDto;
            String readString4 = parcel.readString();
            AppWidgetsActionDto createFromParcel4 = parcel.readInt() == 0 ? appWidgetsActionDto2 : AppWidgetsActionDto.CREATOR.createFromParcel(parcel);
            AppWidgetsActionDto appWidgetsActionDto3 = appWidgetsActionDto2;
            String readString5 = parcel.readString();
            AppWidgetsActionDto createFromParcel5 = parcel.readInt() == 0 ? appWidgetsActionDto3 : AppWidgetsActionDto.CREATOR.createFromParcel(parcel);
            Integer valueOf4 = appWidgetsActionDto3;
            if (parcel.readInt() != 0) {
                valueOf4 = Integer.valueOf(parcel.readInt());
            }
            return new AppWidgetsSomeWidgetDto(createFromParcel, num, readString, createFromParcel2, readString2, f, valueOf, readString3, createFromParcel3, readString4, createFromParcel4, readString5, createFromParcel5, valueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final AppWidgetsSomeWidgetDto[] newArray(int i) {
            return new AppWidgetsSomeWidgetDto[i];
        }
    }

    public AppWidgetsSomeWidgetDto(TypeDto typeDto, Integer num, String str, AppWidgetsActionDto appWidgetsActionDto, String str2, Float f, Float f2, String str3, AppWidgetsActionDto appWidgetsActionDto2, String str4, AppWidgetsActionDto appWidgetsActionDto3, String str5, AppWidgetsActionDto appWidgetsActionDto4, Integer num2) {
        this.type = typeDto;
        this.backers = num;
        this.button = str;
        this.buttonAction = appWidgetsActionDto;
        this.currency = str2;
        this.funded = f;
        this.goal = f2;
        this.more = str3;
        this.moreAction = appWidgetsActionDto2;
        this.text = str4;
        this.textAction = appWidgetsActionDto3;
        this.title = str5;
        this.titleAction = appWidgetsActionDto4;
        this.titleCounter = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppWidgetsSomeWidgetDto)) {
            return false;
        }
        AppWidgetsSomeWidgetDto appWidgetsSomeWidgetDto = (AppWidgetsSomeWidgetDto) obj;
        return this.type == appWidgetsSomeWidgetDto.type && epx.f(this.backers, appWidgetsSomeWidgetDto.backers) && epx.f(this.button, appWidgetsSomeWidgetDto.button) && epx.f(this.buttonAction, appWidgetsSomeWidgetDto.buttonAction) && epx.f(this.currency, appWidgetsSomeWidgetDto.currency) && epx.f(this.funded, appWidgetsSomeWidgetDto.funded) && epx.f(this.goal, appWidgetsSomeWidgetDto.goal) && epx.f(this.more, appWidgetsSomeWidgetDto.more) && epx.f(this.moreAction, appWidgetsSomeWidgetDto.moreAction) && epx.f(this.text, appWidgetsSomeWidgetDto.text) && epx.f(this.textAction, appWidgetsSomeWidgetDto.textAction) && epx.f(this.title, appWidgetsSomeWidgetDto.title) && epx.f(this.titleAction, appWidgetsSomeWidgetDto.titleAction) && epx.f(this.titleCounter, appWidgetsSomeWidgetDto.titleCounter);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Integer num = this.backers;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.button;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AppWidgetsActionDto appWidgetsActionDto = this.buttonAction;
        int hashCode4 = (hashCode3 + (appWidgetsActionDto == null ? 0 : appWidgetsActionDto.hashCode())) * 31;
        String str2 = this.currency;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.funded;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.goal;
        int hashCode7 = (hashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str3 = this.more;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AppWidgetsActionDto appWidgetsActionDto2 = this.moreAction;
        int hashCode9 = (hashCode8 + (appWidgetsActionDto2 == null ? 0 : appWidgetsActionDto2.hashCode())) * 31;
        String str4 = this.text;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AppWidgetsActionDto appWidgetsActionDto3 = this.textAction;
        int hashCode11 = (hashCode10 + (appWidgetsActionDto3 == null ? 0 : appWidgetsActionDto3.hashCode())) * 31;
        String str5 = this.title;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AppWidgetsActionDto appWidgetsActionDto4 = this.titleAction;
        int hashCode13 = (hashCode12 + (appWidgetsActionDto4 == null ? 0 : appWidgetsActionDto4.hashCode())) * 31;
        Integer num2 = this.titleCounter;
        return hashCode13 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppWidgetsSomeWidgetDto(type=");
        sb.append(this.type);
        sb.append(", backers=");
        sb.append(this.backers);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", buttonAction=");
        sb.append(this.buttonAction);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", funded=");
        sb.append(this.funded);
        sb.append(", goal=");
        sb.append(this.goal);
        sb.append(", more=");
        sb.append(this.more);
        sb.append(", moreAction=");
        sb.append(this.moreAction);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", textAction=");
        sb.append(this.textAction);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", titleAction=");
        sb.append(this.titleAction);
        sb.append(", titleCounter=");
        return uqi.b(sb, this.titleCounter, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        Integer num = this.backers;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.button);
        AppWidgetsActionDto appWidgetsActionDto = this.buttonAction;
        if (appWidgetsActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appWidgetsActionDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.currency);
        Float f = this.funded;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.goal;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        parcel.writeString(this.more);
        AppWidgetsActionDto appWidgetsActionDto2 = this.moreAction;
        if (appWidgetsActionDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appWidgetsActionDto2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.text);
        AppWidgetsActionDto appWidgetsActionDto3 = this.textAction;
        if (appWidgetsActionDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appWidgetsActionDto3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        AppWidgetsActionDto appWidgetsActionDto4 = this.titleAction;
        if (appWidgetsActionDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appWidgetsActionDto4.writeToParcel(parcel, i);
        }
        Integer num2 = this.titleCounter;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ AppWidgetsSomeWidgetDto(TypeDto typeDto, Integer num, String str, AppWidgetsActionDto appWidgetsActionDto, String str2, Float f, Float f2, String str3, AppWidgetsActionDto appWidgetsActionDto2, String str4, AppWidgetsActionDto appWidgetsActionDto3, String str5, AppWidgetsActionDto appWidgetsActionDto4, Integer num2, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : appWidgetsActionDto, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : f2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : appWidgetsActionDto2, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : appWidgetsActionDto3, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : appWidgetsActionDto4, (i & 8192) != 0 ? null : num2);
    }
}
