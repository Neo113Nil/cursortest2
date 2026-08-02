package com.vk.api.generated.actionLinks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ActionLinksActionSnippetDto.kt */
/* loaded from: classes14.dex */
public final class ActionLinksActionSnippetDto implements Parcelable {
    public static final Parcelable.Creator<ActionLinksActionSnippetDto> CREATOR = new a();

    @pmi0("app_deeplink")
    private final String appDeeplink;

    @pmi0("app_package_name")
    private final String appPackageName;

    @pmi0("date")
    private final Integer date;

    @pmi0("description")
    private final String description;

    @pmi0("hide_ts")
    private final Integer hideTs;

    @pmi0("icon")
    private final IconDto icon;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("market_item")
    private final MarketMarketItemDto marketItem;

    @pmi0("open_title")
    private final String openTitle;

    @pmi0("show_ts")
    private final Integer showTs;

    @pmi0(TtmlNode.TAG_STYLE)
    private final ActionLinksActionSnippetStyleDto style;

    @pmi0("target")
    private final String target;

    @pmi0("title")
    private final String title;

    @pmi0("type_name")
    private final String typeName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionLinksActionSnippetDto.kt */
    public static final class IconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconDto[] $VALUES;
        public static final Parcelable.Creator<IconDto> CREATOR;

        @pmi0("live_finished")
        public static final IconDto LIVE_FINISHED;

        @pmi0("live_started")
        public static final IconDto LIVE_STARTED;

        @pmi0("live_upcoming")
        public static final IconDto LIVE_UPCOMING;
        private final String value;

        /* compiled from: ActionLinksActionSnippetDto.kt */
        public static final class a implements Parcelable.Creator<IconDto> {
            @Override // android.os.Parcelable.Creator
            public final IconDto createFromParcel(Parcel parcel) {
                return IconDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IconDto[] newArray(int i) {
                return new IconDto[i];
            }
        }

        static {
            IconDto iconDto = new IconDto("LIVE_STARTED", 0, "live_started");
            LIVE_STARTED = iconDto;
            IconDto iconDto2 = new IconDto("LIVE_UPCOMING", 1, "live_upcoming");
            LIVE_UPCOMING = iconDto2;
            IconDto iconDto3 = new IconDto("LIVE_FINISHED", 2, "live_finished");
            LIVE_FINISHED = iconDto3;
            IconDto[] iconDtoArr = {iconDto, iconDto2, iconDto3};
            $VALUES = iconDtoArr;
            $ENTRIES = new asp(iconDtoArr);
            CREATOR = new a();
        }

        private IconDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static IconDto valueOf(String str) {
            return (IconDto) Enum.valueOf(IconDto.class, str);
        }

        public static IconDto[] values() {
            return (IconDto[]) $VALUES.clone();
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

    /* compiled from: ActionLinksActionSnippetDto.kt */
    public static final class a implements Parcelable.Creator<ActionLinksActionSnippetDto> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinksActionSnippetDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ActionLinksActionSnippetStyleDto createFromParcel = parcel.readInt() == 0 ? null : ActionLinksActionSnippetStyleDto.CREATOR.createFromParcel(parcel);
            MarketMarketItemDto createFromParcel2 = parcel.readInt() == 0 ? null : MarketMarketItemDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList2 = arrayList;
            Integer num = valueOf3;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            IconDto iconDto = null;
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                iconDto = IconDto.CREATOR.createFromParcel(parcel);
            }
            return new ActionLinksActionSnippetDto(readString, readString2, readString3, readString4, valueOf, arrayList2, valueOf2, num, createFromParcel, createFromParcel2, readString5, readString6, readString7, iconDto);
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinksActionSnippetDto[] newArray(int i) {
            return new ActionLinksActionSnippetDto[i];
        }
    }

    public ActionLinksActionSnippetDto(String str, String str2, String str3, String str4, Integer num, List<BaseImageDto> list, Integer num2, Integer num3, ActionLinksActionSnippetStyleDto actionLinksActionSnippetStyleDto, MarketMarketItemDto marketMarketItemDto, String str5, String str6, String str7, IconDto iconDto) {
        this.description = str;
        this.openTitle = str2;
        this.title = str3;
        this.typeName = str4;
        this.date = num;
        this.image = list;
        this.showTs = num2;
        this.hideTs = num3;
        this.style = actionLinksActionSnippetStyleDto;
        this.marketItem = marketMarketItemDto;
        this.target = str5;
        this.appPackageName = str6;
        this.appDeeplink = str7;
        this.icon = iconDto;
    }

    public final String d() {
        return this.appDeeplink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.appPackageName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionLinksActionSnippetDto)) {
            return false;
        }
        ActionLinksActionSnippetDto actionLinksActionSnippetDto = (ActionLinksActionSnippetDto) obj;
        return epx.f(this.description, actionLinksActionSnippetDto.description) && epx.f(this.openTitle, actionLinksActionSnippetDto.openTitle) && epx.f(this.title, actionLinksActionSnippetDto.title) && epx.f(this.typeName, actionLinksActionSnippetDto.typeName) && epx.f(this.date, actionLinksActionSnippetDto.date) && epx.f(this.image, actionLinksActionSnippetDto.image) && epx.f(this.showTs, actionLinksActionSnippetDto.showTs) && epx.f(this.hideTs, actionLinksActionSnippetDto.hideTs) && epx.f(this.style, actionLinksActionSnippetDto.style) && epx.f(this.marketItem, actionLinksActionSnippetDto.marketItem) && epx.f(this.target, actionLinksActionSnippetDto.target) && epx.f(this.appPackageName, actionLinksActionSnippetDto.appPackageName) && epx.f(this.appDeeplink, actionLinksActionSnippetDto.appDeeplink) && this.icon == actionLinksActionSnippetDto.icon;
    }

    public final Integer f() {
        return this.hideTs;
    }

    public final List<BaseImageDto> g() {
        return this.image;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.description.hashCode() * 31, 31, this.openTitle), 31, this.title), 31, this.typeName);
        Integer num = this.date;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list = this.image;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.showTs;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.hideTs;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ActionLinksActionSnippetStyleDto actionLinksActionSnippetStyleDto = this.style;
        int hashCode5 = (hashCode4 + (actionLinksActionSnippetStyleDto == null ? 0 : actionLinksActionSnippetStyleDto.hashCode())) * 31;
        MarketMarketItemDto marketMarketItemDto = this.marketItem;
        int hashCode6 = (hashCode5 + (marketMarketItemDto == null ? 0 : marketMarketItemDto.hashCode())) * 31;
        String str = this.target;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appPackageName;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appDeeplink;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        IconDto iconDto = this.icon;
        return hashCode9 + (iconDto != null ? iconDto.hashCode() : 0);
    }

    public final MarketMarketItemDto i() {
        return this.marketItem;
    }

    public final String j() {
        return this.openTitle;
    }

    public final Integer k() {
        return this.showTs;
    }

    public final ActionLinksActionSnippetStyleDto l() {
        return this.style;
    }

    public final String n() {
        return this.target;
    }

    public final String o() {
        return this.typeName;
    }

    public final String toString() {
        return "ActionLinksActionSnippetDto(description=" + this.description + ", openTitle=" + this.openTitle + ", title=" + this.title + ", typeName=" + this.typeName + ", date=" + this.date + ", image=" + this.image + ", showTs=" + this.showTs + ", hideTs=" + this.hideTs + ", style=" + this.style + ", marketItem=" + this.marketItem + ", target=" + this.target + ", appPackageName=" + this.appPackageName + ", appDeeplink=" + this.appDeeplink + ", icon=" + this.icon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        parcel.writeString(this.openTitle);
        parcel.writeString(this.title);
        parcel.writeString(this.typeName);
        Integer num = this.date;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.showTs;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.hideTs;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        ActionLinksActionSnippetStyleDto actionLinksActionSnippetStyleDto = this.style;
        if (actionLinksActionSnippetStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionLinksActionSnippetStyleDto.writeToParcel(parcel, i);
        }
        MarketMarketItemDto marketMarketItemDto = this.marketItem;
        if (marketMarketItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketItemDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.target);
        parcel.writeString(this.appPackageName);
        parcel.writeString(this.appDeeplink);
        IconDto iconDto = this.icon;
        if (iconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ActionLinksActionSnippetDto(String str, String str2, String str3, String str4, Integer num, List list, Integer num2, Integer num3, ActionLinksActionSnippetStyleDto actionLinksActionSnippetStyleDto, MarketMarketItemDto marketMarketItemDto, String str5, String str6, String str7, IconDto iconDto, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : actionLinksActionSnippetStyleDto, (i & 512) != 0 ? null : marketMarketItemDto, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : iconDto);
    }
}
