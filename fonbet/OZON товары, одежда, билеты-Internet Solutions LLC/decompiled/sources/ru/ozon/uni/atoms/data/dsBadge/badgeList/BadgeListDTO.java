package ru.ozon.uni.atoms.data.dsBadge.badgeList;

import Ak.b;
import Bk.C2638a;
import C.J;
import D40.d;
import De.C2859b;
import Ep.a;
import Pk0.h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010*\u001a\u00020+H\u0016J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u009d\u0001\u00107\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0006\u00108\u001a\u00020+J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020+HÖ\u0001J\t\u0010>\u001a\u00020\u0010HÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020+R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006D"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgesSize", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "badgesStyle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "leftPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topPadding", "rightPadding", "bottomPadding", "gap", "context", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getBadges", "()Ljava/util/List;", "getBadgesSize", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "getBadgesStyle", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "getLeftPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTopPadding", "getRightPadding", "getBottomPadding", "getGap", "getContext", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BadgeListDTO extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BadgeListDTO> CREATOR = new Creator();

    @NotNull
    private final List<BadgeDTO> badges;

    @EnumNullFallback
    private final BadgeDTO.BadgeSize badgesSize;

    @EnumNullFallback
    private final BadgeDTO.Style badgesStyle;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding bottomPadding;
    private final String context;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding gap;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding leftPadding;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding rightPadding;
    private final TestInfo testInfo;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding topPadding;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BadgeListDTO> {
        @Override // android.os.Parcelable.Creator
        public final BadgeListDTO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(BadgeDTO.CREATOR, parcel, arrayList, i11, 1);
            }
            BadgeDTO.BadgeSize valueOf = parcel.readInt() == 0 ? null : BadgeDTO.BadgeSize.valueOf(parcel.readString());
            BadgeDTO.Style valueOf2 = parcel.readInt() == 0 ? null : BadgeDTO.Style.valueOf(parcel.readString());
            CommonCellSettings.LayoutPadding valueOf3 = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
            CommonCellSettings.LayoutPadding valueOf4 = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
            CommonCellSettings.LayoutPadding valueOf5 = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
            CommonCellSettings.LayoutPadding valueOf6 = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
            CommonCellSettings.LayoutPadding valueOf7 = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
            CommonCellSettings.LayoutPadding layoutPadding = valueOf3;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(BadgeListDTO.class, parcel, linkedHashMap, parcel.readString(), i12, 1);
                    readInt2 = readInt2;
                }
            }
            return new BadgeListDTO(arrayList, valueOf, valueOf2, layoutPadding, valueOf4, valueOf5, valueOf6, valueOf7, readString, linkedHashMap, parcel.readInt() != 0 ? TestInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeListDTO[] newArray(int i11) {
            return new BadgeListDTO[i11];
        }
    }

    public /* synthetic */ BadgeListDTO(List list, BadgeDTO.BadgeSize badgeSize, BadgeDTO.Style style, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, CommonCellSettings.LayoutPadding layoutPadding5, String str, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? BadgeDTO.BadgeSize.SIZE_500 : badgeSize, (i11 & 4) != 0 ? null : style, (i11 & 8) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding, (i11 & 16) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i11 & 32) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding3, (i11 & 64) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding4, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? CommonCellSettings.LayoutPadding.PADDING_200 : layoutPadding5, (i11 & 256) != 0 ? null : str, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo);
    }

    public static /* synthetic */ BadgeListDTO copy$default(BadgeListDTO badgeListDTO, List list, BadgeDTO.BadgeSize badgeSize, BadgeDTO.Style style, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, CommonCellSettings.LayoutPadding layoutPadding5, String str, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = badgeListDTO.badges;
        }
        if ((i11 & 2) != 0) {
            badgeSize = badgeListDTO.badgesSize;
        }
        if ((i11 & 4) != 0) {
            style = badgeListDTO.badgesStyle;
        }
        if ((i11 & 8) != 0) {
            layoutPadding = badgeListDTO.leftPadding;
        }
        if ((i11 & 16) != 0) {
            layoutPadding2 = badgeListDTO.topPadding;
        }
        if ((i11 & 32) != 0) {
            layoutPadding3 = badgeListDTO.rightPadding;
        }
        if ((i11 & 64) != 0) {
            layoutPadding4 = badgeListDTO.bottomPadding;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            layoutPadding5 = badgeListDTO.gap;
        }
        if ((i11 & 256) != 0) {
            str = badgeListDTO.context;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = badgeListDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            testInfo = badgeListDTO.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        CommonCellSettings.LayoutPadding layoutPadding6 = layoutPadding5;
        String str2 = str;
        CommonCellSettings.LayoutPadding layoutPadding7 = layoutPadding3;
        CommonCellSettings.LayoutPadding layoutPadding8 = layoutPadding4;
        CommonCellSettings.LayoutPadding layoutPadding9 = layoutPadding2;
        BadgeDTO.Style style2 = style;
        return badgeListDTO.copy(list, badgeSize, style2, layoutPadding, layoutPadding9, layoutPadding7, layoutPadding8, layoutPadding6, str2, map2, testInfo2);
    }

    @NotNull
    public final List<BadgeDTO> component1() {
        return this.badges;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    /* renamed from: component11, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO.BadgeSize getBadgesSize() {
        return this.badgesSize;
    }

    /* renamed from: component3, reason: from getter */
    public final BadgeDTO.Style getBadgesStyle() {
        return this.badgesStyle;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonCellSettings.LayoutPadding getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonCellSettings.LayoutPadding getGap() {
        return this.gap;
    }

    /* renamed from: component9, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final BadgeListDTO copy(@NotNull List<BadgeDTO> badges, BadgeDTO.BadgeSize badgesSize, BadgeDTO.Style badgesStyle, CommonCellSettings.LayoutPadding leftPadding, CommonCellSettings.LayoutPadding topPadding, CommonCellSettings.LayoutPadding rightPadding, CommonCellSettings.LayoutPadding bottomPadding, CommonCellSettings.LayoutPadding gap, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        return new BadgeListDTO(badges, badgesSize, badgesStyle, leftPadding, topPadding, rightPadding, bottomPadding, gap, context, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeListDTO)) {
            return false;
        }
        BadgeListDTO badgeListDTO = (BadgeListDTO) other;
        return Intrinsics.d(this.badges, badgeListDTO.badges) && this.badgesSize == badgeListDTO.badgesSize && this.badgesStyle == badgeListDTO.badgesStyle && this.leftPadding == badgeListDTO.leftPadding && this.topPadding == badgeListDTO.topPadding && this.rightPadding == badgeListDTO.rightPadding && this.bottomPadding == badgeListDTO.bottomPadding && this.gap == badgeListDTO.gap && Intrinsics.d(this.context, badgeListDTO.context) && Intrinsics.d(this.trackingInfo, badgeListDTO.trackingInfo) && Intrinsics.d(this.testInfo, badgeListDTO.testInfo);
    }

    @NotNull
    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    public final BadgeDTO.BadgeSize getBadgesSize() {
        return this.badgesSize;
    }

    public final BadgeDTO.Style getBadgesStyle() {
        return this.badgesStyle;
    }

    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final CommonCellSettings.LayoutPadding getGap() {
        return this.gap;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.ds_badge_list;
    }

    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final CommonCellSettings.LayoutPadding getTopPadding() {
        return this.topPadding;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.badges.hashCode() * 31;
        BadgeDTO.BadgeSize badgeSize = this.badgesSize;
        int hashCode2 = (hashCode + (badgeSize == null ? 0 : badgeSize.hashCode())) * 31;
        BadgeDTO.Style style = this.badgesStyle;
        int hashCode3 = (hashCode2 + (style == null ? 0 : style.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding = this.leftPadding;
        int hashCode4 = (hashCode3 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.topPadding;
        int hashCode5 = (hashCode4 + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.rightPadding;
        int hashCode6 = (hashCode5 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomPadding;
        int hashCode7 = (hashCode6 + (layoutPadding4 == null ? 0 : layoutPadding4.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding5 = this.gap;
        int hashCode8 = (hashCode7 + (layoutPadding5 == null ? 0 : layoutPadding5.hashCode())) * 31;
        String str = this.context;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode10 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<BadgeDTO> list = this.badges;
        BadgeDTO.BadgeSize badgeSize = this.badgesSize;
        BadgeDTO.Style style = this.badgesStyle;
        CommonCellSettings.LayoutPadding layoutPadding = this.leftPadding;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.topPadding;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.rightPadding;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomPadding;
        CommonCellSettings.LayoutPadding layoutPadding5 = this.gap;
        String str = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("BadgeListDTO(badges=");
        sb2.append(list);
        sb2.append(", badgesSize=");
        sb2.append(badgeSize);
        sb2.append(", badgesStyle=");
        sb2.append(style);
        sb2.append(", leftPadding=");
        sb2.append(layoutPadding);
        sb2.append(", topPadding=");
        a.f(sb2, layoutPadding2, ", rightPadding=", layoutPadding3, ", bottomPadding=");
        a.f(sb2, layoutPadding4, ", gap=", layoutPadding5, ", context=");
        C2638a.e(sb2, str, ", trackingInfo=", map, ", testInfo=");
        return h.c(sb2, testInfo, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = Bi.a.c(this.badges, dest);
        while (c11.hasNext()) {
            ((BadgeDTO) c11.next()).writeToParcel(dest, flags);
        }
        BadgeDTO.BadgeSize badgeSize = this.badgesSize;
        if (badgeSize == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(badgeSize.name());
        }
        BadgeDTO.Style style = this.badgesStyle;
        if (style == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(style.name());
        }
        CommonCellSettings.LayoutPadding layoutPadding = this.leftPadding;
        if (layoutPadding == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding);
        }
        CommonCellSettings.LayoutPadding layoutPadding2 = this.topPadding;
        if (layoutPadding2 == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding2);
        }
        CommonCellSettings.LayoutPadding layoutPadding3 = this.rightPadding;
        if (layoutPadding3 == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding3);
        }
        CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomPadding;
        if (layoutPadding4 == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding4);
        }
        CommonCellSettings.LayoutPadding layoutPadding5 = this.gap;
        if (layoutPadding5 == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding5);
        }
        dest.writeString(this.context);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        TestInfo testInfo = this.testInfo;
        if (testInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            testInfo.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeListDTO(@NotNull List<BadgeDTO> badges, BadgeDTO.BadgeSize badgeSize, BadgeDTO.Style style, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, CommonCellSettings.LayoutPadding layoutPadding5, String str, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(DsAtomsType.BADGE_LIST, str, map, testInfo);
        Intrinsics.checkNotNullParameter(badges, "badges");
        this.badges = badges;
        this.badgesSize = badgeSize;
        this.badgesStyle = style;
        this.leftPadding = layoutPadding;
        this.topPadding = layoutPadding2;
        this.rightPadding = layoutPadding3;
        this.bottomPadding = layoutPadding4;
        this.gap = layoutPadding5;
        this.context = str;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
