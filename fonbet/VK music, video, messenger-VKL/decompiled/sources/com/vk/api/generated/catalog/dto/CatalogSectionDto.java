package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogSectionDto.kt */
/* loaded from: classes14.dex */
public final class CatalogSectionDto implements Parcelable {
    public static final Parcelable.Creator<CatalogSectionDto> CREATOR = new a();

    @pmi0("actions")
    private final List<CatalogButtonDto> actions;

    @pmi0("ad_banner")
    private final CatalogAdBannerDto adBanner;

    @pmi0("animated_icon_url")
    private final String animatedIconUrl;

    @pmi0("artist_promo")
    private final CatalogArtistPromoDto artistPromo;

    @pmi0("badge")
    private final CatalogBadgeDto badge;

    @pmi0("blocks")
    private final List<CatalogBlockDto> blocks;

    @pmi0("breadcrumbs")
    private final List<CatalogBreadcrumbDto> breadcrumbs;

    @pmi0("data_type")
    private final CatalogSectionDataTypeDto dataType;

    @pmi0("header")
    private final CatalogSectionHeaderDto header;

    @pmi0("header_style")
    private final CatalogSectionHeaderStyleDto headerStyle;

    @pmi0("hint")
    private final CatalogHintDto hint;

    @pmi0("icon")
    private final String icon;

    @pmi0(CampaignEx.JSON_KEY_ICON_URL)
    private final String iconUrl;

    @pmi0("id")
    private final String id;

    @pmi0("listen_events")
    private final List<String> listenEvents;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("session_id")
    private final String sessionId;

    @pmi0("stub_blocks")
    private final List<CatalogStubBlockDto> stubBlocks;

    @pmi0(TtmlNode.TAG_STYLE)
    private final CatalogSectionStyleDto style;

    @pmi0("subsections")
    private final List<CatalogSectionDto> subsections;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: CatalogSectionDto.kt */
    public static final class a implements Parcelable.Creator<CatalogSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSectionDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            CatalogAdBannerDto catalogAdBannerDto;
            String str;
            ArrayList arrayList4;
            String str2;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            CatalogSectionHeaderDto catalogSectionHeaderDto;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(CatalogBreadcrumbDto.CREATOR, parcel, arrayList8, i, 1);
                }
                arrayList = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(CatalogStubBlockDto.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                catalogAdBannerDto = null;
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(CatalogBlockDto.CREATOR, parcel, arrayList3, i3, 1);
                }
                catalogAdBannerDto = null;
            }
            String readString3 = parcel.readString();
            CatalogAdBannerDto catalogAdBannerDto2 = catalogAdBannerDto;
            String readString4 = parcel.readString();
            ArrayList arrayList9 = arrayList2;
            String readString5 = parcel.readString();
            ArrayList arrayList10 = arrayList3;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            CatalogAdBannerDto catalogAdBannerDto3 = catalogAdBannerDto2;
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            CatalogBadgeDto catalogBadgeDto = (CatalogBadgeDto) (parcel.readInt() == 0 ? catalogAdBannerDto3 : CatalogBadgeDto.CREATOR.createFromParcel(parcel));
            CatalogHintDto catalogHintDto = (CatalogHintDto) (parcel.readInt() == 0 ? catalogAdBannerDto3 : CatalogHintDto.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() != 0) {
                catalogAdBannerDto3 = CatalogAdBannerDto.CREATOR.createFromParcel(parcel);
            }
            CatalogAdBannerDto catalogAdBannerDto4 = catalogAdBannerDto3;
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                str = readString;
                arrayList4 = new ArrayList(readInt4);
                str2 = readString2;
                int i4 = 0;
                while (true) {
                    arrayList5 = arrayList;
                    if (i4 == readInt4) {
                        break;
                    }
                    i4 = en.a(CatalogButtonDto.CREATOR, parcel, arrayList4, i4, 1);
                    arrayList = arrayList5;
                    readInt4 = readInt4;
                }
            } else {
                str = readString;
                str2 = readString2;
                arrayList4 = null;
                arrayList5 = arrayList;
            }
            CatalogSectionHeaderDto createFromParcel = parcel.readInt() == 0 ? null : CatalogSectionHeaderDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList6 = new ArrayList(readInt5);
                arrayList7 = arrayList4;
                int i5 = 0;
                while (true) {
                    catalogSectionHeaderDto = createFromParcel;
                    if (i5 == readInt5) {
                        break;
                    }
                    i5 = en.a(CatalogSectionDto.CREATOR, parcel, arrayList6, i5, 1);
                    createFromParcel = catalogSectionHeaderDto;
                    readInt5 = readInt5;
                }
            } else {
                arrayList7 = arrayList4;
                arrayList6 = null;
                catalogSectionHeaderDto = createFromParcel;
            }
            return new CatalogSectionDto(str, str2, arrayList5, arrayList9, arrayList10, readString3, readString4, readString5, createStringArrayList, readString6, readString7, catalogBadgeDto, catalogHintDto, catalogAdBannerDto4, arrayList7, catalogSectionHeaderDto, arrayList6, parcel.readInt() == 0 ? null : CatalogSectionDataTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CatalogSectionStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CatalogSectionHeaderStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CatalogArtistPromoDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSectionDto[] newArray(int i) {
            return new CatalogSectionDto[i];
        }
    }

    public CatalogSectionDto(String str, String str2, List<CatalogBreadcrumbDto> list, List<CatalogStubBlockDto> list2, List<CatalogBlockDto> list3, String str3, String str4, String str5, List<String> list4, String str6, String str7, CatalogBadgeDto catalogBadgeDto, CatalogHintDto catalogHintDto, CatalogAdBannerDto catalogAdBannerDto, List<CatalogButtonDto> list5, CatalogSectionHeaderDto catalogSectionHeaderDto, List<CatalogSectionDto> list6, CatalogSectionDataTypeDto catalogSectionDataTypeDto, CatalogSectionStyleDto catalogSectionStyleDto, CatalogSectionHeaderStyleDto catalogSectionHeaderStyleDto, CatalogArtistPromoDto catalogArtistPromoDto, String str8) {
        this.id = str;
        this.title = str2;
        this.breadcrumbs = list;
        this.stubBlocks = list2;
        this.blocks = list3;
        this.icon = str3;
        this.iconUrl = str4;
        this.animatedIconUrl = str5;
        this.listenEvents = list4;
        this.nextFrom = str6;
        this.url = str7;
        this.badge = catalogBadgeDto;
        this.hint = catalogHintDto;
        this.adBanner = catalogAdBannerDto;
        this.actions = list5;
        this.header = catalogSectionHeaderDto;
        this.subsections = list6;
        this.dataType = catalogSectionDataTypeDto;
        this.style = catalogSectionStyleDto;
        this.headerStyle = catalogSectionHeaderStyleDto;
        this.artistPromo = catalogArtistPromoDto;
        this.sessionId = str8;
    }

    public final List<CatalogButtonDto> d() {
        return this.actions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final CatalogAdBannerDto e() {
        return this.adBanner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSectionDto)) {
            return false;
        }
        CatalogSectionDto catalogSectionDto = (CatalogSectionDto) obj;
        return epx.f(this.id, catalogSectionDto.id) && epx.f(this.title, catalogSectionDto.title) && epx.f(this.breadcrumbs, catalogSectionDto.breadcrumbs) && epx.f(this.stubBlocks, catalogSectionDto.stubBlocks) && epx.f(this.blocks, catalogSectionDto.blocks) && epx.f(this.icon, catalogSectionDto.icon) && epx.f(this.iconUrl, catalogSectionDto.iconUrl) && epx.f(this.animatedIconUrl, catalogSectionDto.animatedIconUrl) && epx.f(this.listenEvents, catalogSectionDto.listenEvents) && epx.f(this.nextFrom, catalogSectionDto.nextFrom) && epx.f(this.url, catalogSectionDto.url) && epx.f(this.badge, catalogSectionDto.badge) && epx.f(this.hint, catalogSectionDto.hint) && epx.f(this.adBanner, catalogSectionDto.adBanner) && epx.f(this.actions, catalogSectionDto.actions) && epx.f(this.header, catalogSectionDto.header) && epx.f(this.subsections, catalogSectionDto.subsections) && this.dataType == catalogSectionDto.dataType && epx.f(this.style, catalogSectionDto.style) && epx.f(this.headerStyle, catalogSectionDto.headerStyle) && epx.f(this.artistPromo, catalogSectionDto.artistPromo) && epx.f(this.sessionId, catalogSectionDto.sessionId);
    }

    public final CatalogBadgeDto f() {
        return this.badge;
    }

    public final List<CatalogBlockDto> g() {
        return this.blocks;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.id.hashCode() * 31, 31, this.title);
        List<CatalogBreadcrumbDto> list = this.breadcrumbs;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<CatalogStubBlockDto> list2 = this.stubBlocks;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CatalogBlockDto> list3 = this.blocks;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.icon;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.animatedIconUrl;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list4 = this.listenEvents;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str4 = this.nextFrom;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        CatalogBadgeDto catalogBadgeDto = this.badge;
        int hashCode10 = (hashCode9 + (catalogBadgeDto == null ? 0 : catalogBadgeDto.hashCode())) * 31;
        CatalogHintDto catalogHintDto = this.hint;
        int hashCode11 = (hashCode10 + (catalogHintDto == null ? 0 : catalogHintDto.hashCode())) * 31;
        CatalogAdBannerDto catalogAdBannerDto = this.adBanner;
        int hashCode12 = (hashCode11 + (catalogAdBannerDto == null ? 0 : catalogAdBannerDto.hashCode())) * 31;
        List<CatalogButtonDto> list5 = this.actions;
        int hashCode13 = (hashCode12 + (list5 == null ? 0 : list5.hashCode())) * 31;
        CatalogSectionHeaderDto catalogSectionHeaderDto = this.header;
        int hashCode14 = (hashCode13 + (catalogSectionHeaderDto == null ? 0 : catalogSectionHeaderDto.hashCode())) * 31;
        List<CatalogSectionDto> list6 = this.subsections;
        int hashCode15 = (hashCode14 + (list6 == null ? 0 : list6.hashCode())) * 31;
        CatalogSectionDataTypeDto catalogSectionDataTypeDto = this.dataType;
        int hashCode16 = (hashCode15 + (catalogSectionDataTypeDto == null ? 0 : catalogSectionDataTypeDto.hashCode())) * 31;
        CatalogSectionStyleDto catalogSectionStyleDto = this.style;
        int hashCode17 = (hashCode16 + (catalogSectionStyleDto == null ? 0 : catalogSectionStyleDto.hashCode())) * 31;
        CatalogSectionHeaderStyleDto catalogSectionHeaderStyleDto = this.headerStyle;
        int hashCode18 = (hashCode17 + (catalogSectionHeaderStyleDto == null ? 0 : catalogSectionHeaderStyleDto.hashCode())) * 31;
        CatalogArtistPromoDto catalogArtistPromoDto = this.artistPromo;
        int hashCode19 = (hashCode18 + (catalogArtistPromoDto == null ? 0 : catalogArtistPromoDto.hashCode())) * 31;
        String str6 = this.sessionId;
        return hashCode19 + (str6 != null ? str6.hashCode() : 0);
    }

    public final CatalogSectionDataTypeDto i() {
        return this.dataType;
    }

    public final CatalogHintDto j() {
        return this.hint;
    }

    public final List<String> k() {
        return this.listenEvents;
    }

    public final String l() {
        return this.nextFrom;
    }

    public final CatalogSectionStyleDto n() {
        return this.style;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogSectionDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", breadcrumbs=");
        sb.append(this.breadcrumbs);
        sb.append(", stubBlocks=");
        sb.append(this.stubBlocks);
        sb.append(", blocks=");
        sb.append(this.blocks);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", animatedIconUrl=");
        sb.append(this.animatedIconUrl);
        sb.append(", listenEvents=");
        sb.append(this.listenEvents);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", hint=");
        sb.append(this.hint);
        sb.append(", adBanner=");
        sb.append(this.adBanner);
        sb.append(", actions=");
        sb.append(this.actions);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", subsections=");
        sb.append(this.subsections);
        sb.append(", dataType=");
        sb.append(this.dataType);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", headerStyle=");
        sb.append(this.headerStyle);
        sb.append(", artistPromo=");
        sb.append(this.artistPromo);
        sb.append(", sessionId=");
        return ho8.a(sb, this.sessionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        List<CatalogBreadcrumbDto> list = this.breadcrumbs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((CatalogBreadcrumbDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogStubBlockDto> list2 = this.stubBlocks;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((CatalogStubBlockDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogBlockDto> list3 = this.blocks;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((CatalogBlockDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.icon);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.animatedIconUrl);
        parcel.writeStringList(this.listenEvents);
        parcel.writeString(this.nextFrom);
        parcel.writeString(this.url);
        CatalogBadgeDto catalogBadgeDto = this.badge;
        if (catalogBadgeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogBadgeDto.writeToParcel(parcel, i);
        }
        CatalogHintDto catalogHintDto = this.hint;
        if (catalogHintDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogHintDto.writeToParcel(parcel, i);
        }
        CatalogAdBannerDto catalogAdBannerDto = this.adBanner;
        if (catalogAdBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogAdBannerDto.writeToParcel(parcel, i);
        }
        List<CatalogButtonDto> list4 = this.actions;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((CatalogButtonDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        CatalogSectionHeaderDto catalogSectionHeaderDto = this.header;
        if (catalogSectionHeaderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogSectionHeaderDto.writeToParcel(parcel, i);
        }
        List<CatalogSectionDto> list5 = this.subsections;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((CatalogSectionDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        CatalogSectionDataTypeDto catalogSectionDataTypeDto = this.dataType;
        if (catalogSectionDataTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogSectionDataTypeDto.writeToParcel(parcel, i);
        }
        CatalogSectionStyleDto catalogSectionStyleDto = this.style;
        if (catalogSectionStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogSectionStyleDto.writeToParcel(parcel, i);
        }
        CatalogSectionHeaderStyleDto catalogSectionHeaderStyleDto = this.headerStyle;
        if (catalogSectionHeaderStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogSectionHeaderStyleDto.writeToParcel(parcel, i);
        }
        CatalogArtistPromoDto catalogArtistPromoDto = this.artistPromo;
        if (catalogArtistPromoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogArtistPromoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.sessionId);
    }

    public /* synthetic */ CatalogSectionDto(String str, String str2, List list, List list2, List list3, String str3, String str4, String str5, List list4, String str6, String str7, CatalogBadgeDto catalogBadgeDto, CatalogHintDto catalogHintDto, CatalogAdBannerDto catalogAdBannerDto, List list5, CatalogSectionHeaderDto catalogSectionHeaderDto, List list6, CatalogSectionDataTypeDto catalogSectionDataTypeDto, CatalogSectionStyleDto catalogSectionStyleDto, CatalogSectionHeaderStyleDto catalogSectionHeaderStyleDto, CatalogArtistPromoDto catalogArtistPromoDto, String str8, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : list4, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : catalogBadgeDto, (i & 4096) != 0 ? null : catalogHintDto, (i & 8192) != 0 ? null : catalogAdBannerDto, (i & 16384) != 0 ? null : list5, (32768 & i) != 0 ? null : catalogSectionHeaderDto, (65536 & i) != 0 ? null : list6, (131072 & i) != 0 ? null : catalogSectionDataTypeDto, (262144 & i) != 0 ? null : catalogSectionStyleDto, (524288 & i) != 0 ? null : catalogSectionHeaderStyleDto, (1048576 & i) != 0 ? null : catalogArtistPromoDto, (i & 2097152) != 0 ? null : str8);
    }
}
