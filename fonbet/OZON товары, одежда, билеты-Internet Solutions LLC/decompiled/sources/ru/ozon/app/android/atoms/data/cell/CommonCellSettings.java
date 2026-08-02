package ru.ozon.app.android.atoms.data.cell;

import C.J;
import D40.c;
import De.C2859b;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.AtomActionDTO;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00015Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jn\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020*J\u0013\u0010+\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\bHÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00066"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "Landroid/os/Parcelable;", "layoutPaddingLeft", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;", "layoutPaddingRight", "hasSeparator", "", "separatorColor", "", "action", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/app/android/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/atoms/data/TestInfo;)V", "getLayoutPaddingLeft", "()Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getLayoutPaddingRight", "getHasSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSeparatorColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/app/android/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/app/android/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/atoms/data/TestInfo;)Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LayoutPadding", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CommonCellSettings implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CommonCellSettings> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final Boolean hasSeparator;

    @EnumNullFallback
    private final LayoutPadding layoutPaddingLeft;

    @EnumNullFallback
    private final LayoutPadding layoutPaddingRight;
    private final String separatorColor;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CommonCellSettings> {
        @Override // android.os.Parcelable.Creator
        public final CommonCellSettings createFromParcel(Parcel parcel) {
            Boolean valueOf;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LayoutPadding valueOf2 = parcel.readInt() == 0 ? null : LayoutPadding.valueOf(parcel.readString());
            LayoutPadding valueOf3 = parcel.readInt() == 0 ? null : LayoutPadding.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(CommonCellSettings.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CommonCellSettings(valueOf2, valueOf3, valueOf, readString, createFromParcel, linkedHashMap, parcel.readInt() != 0 ? TestInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CommonCellSettings[] newArray(int i11) {
            return new CommonCellSettings[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;", "", "cellLayoutPadding", "Lru/ozon/app/android/atoms/data/cell/CellLayoutPadding;", "<init>", "(Ljava/lang/String;II)V", "getCellLayoutPadding-KNLzWH8", "()I", "I", "NONE", "PADDING_100", "PADDING_200", "PADDING_250", "PADDING_300", "PADDING_350", "PADDING_400", "PADDING_450", "PADDING_500", "PADDING_550", "PADDING_600", "PADDING_700", "PADDING_750", "PADDING_800", "PADDING_900", "PADDING_950", "PADDING_1000", "PADDING_1050", "PADDING_1100", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LayoutPadding {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LayoutPadding[] $VALUES;
        private final int cellLayoutPadding;
        public static final LayoutPadding NONE = new LayoutPadding("NONE", 0, CommonCellSettingsKt.getNone());
        public static final LayoutPadding PADDING_100 = new LayoutPadding("PADDING_100", 1, CommonCellSettingsKt.getPadding100());
        public static final LayoutPadding PADDING_200 = new LayoutPadding("PADDING_200", 2, CommonCellSettingsKt.getPadding200());
        public static final LayoutPadding PADDING_250 = new LayoutPadding("PADDING_250", 3, CommonCellSettingsKt.getPadding250());
        public static final LayoutPadding PADDING_300 = new LayoutPadding("PADDING_300", 4, CommonCellSettingsKt.getPadding300());
        public static final LayoutPadding PADDING_350 = new LayoutPadding("PADDING_350", 5, CommonCellSettingsKt.getPadding350());
        public static final LayoutPadding PADDING_400 = new LayoutPadding("PADDING_400", 6, CommonCellSettingsKt.getPadding400());
        public static final LayoutPadding PADDING_450 = new LayoutPadding("PADDING_450", 7, CommonCellSettingsKt.getPadding450());
        public static final LayoutPadding PADDING_500 = new LayoutPadding("PADDING_500", 8, CommonCellSettingsKt.getPadding500());
        public static final LayoutPadding PADDING_550 = new LayoutPadding("PADDING_550", 9, CommonCellSettingsKt.getPadding550());
        public static final LayoutPadding PADDING_600 = new LayoutPadding("PADDING_600", 10, CommonCellSettingsKt.getPadding600());
        public static final LayoutPadding PADDING_700 = new LayoutPadding("PADDING_700", 11, CommonCellSettingsKt.getPadding700());

        @InterfaceC3999a
        public static final LayoutPadding PADDING_750 = new LayoutPadding("PADDING_750", 12, CommonCellSettingsKt.getPadding750());
        public static final LayoutPadding PADDING_800 = new LayoutPadding("PADDING_800", 13, CommonCellSettingsKt.getPadding800());
        public static final LayoutPadding PADDING_900 = new LayoutPadding("PADDING_900", 14, CommonCellSettingsKt.getPadding900());
        public static final LayoutPadding PADDING_950 = new LayoutPadding("PADDING_950", 15, CommonCellSettingsKt.getPadding950());
        public static final LayoutPadding PADDING_1000 = new LayoutPadding("PADDING_1000", 16, CommonCellSettingsKt.getPadding1000());
        public static final LayoutPadding PADDING_1050 = new LayoutPadding("PADDING_1050", 17, CommonCellSettingsKt.getPadding1050());
        public static final LayoutPadding PADDING_1100 = new LayoutPadding("PADDING_1100", 18, CommonCellSettingsKt.getPadding1100());

        private static final /* synthetic */ LayoutPadding[] $values() {
            return new LayoutPadding[]{NONE, PADDING_100, PADDING_200, PADDING_250, PADDING_300, PADDING_350, PADDING_400, PADDING_450, PADDING_500, PADDING_550, PADDING_600, PADDING_700, PADDING_750, PADDING_800, PADDING_900, PADDING_950, PADDING_1000, PADDING_1050, PADDING_1100};
        }

        static {
            LayoutPadding[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private LayoutPadding(String str, int i11, int i12) {
            this.cellLayoutPadding = i12;
        }

        @NotNull
        public static a<LayoutPadding> getEntries() {
            return $ENTRIES;
        }

        public static LayoutPadding valueOf(String str) {
            return (LayoutPadding) Enum.valueOf(LayoutPadding.class, str);
        }

        public static LayoutPadding[] values() {
            return (LayoutPadding[]) $VALUES.clone();
        }

        /* renamed from: getCellLayoutPadding-KNLzWH8, reason: not valid java name and from getter */
        public final int getCellLayoutPadding() {
            return this.cellLayoutPadding;
        }
    }

    public CommonCellSettings(LayoutPadding layoutPadding, LayoutPadding layoutPadding2, Boolean bool, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        this.layoutPaddingLeft = layoutPadding;
        this.layoutPaddingRight = layoutPadding2;
        this.hasSeparator = bool;
        this.separatorColor = str;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ CommonCellSettings copy$default(CommonCellSettings commonCellSettings, LayoutPadding layoutPadding, LayoutPadding layoutPadding2, Boolean bool, String str, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            layoutPadding = commonCellSettings.layoutPaddingLeft;
        }
        if ((i11 & 2) != 0) {
            layoutPadding2 = commonCellSettings.layoutPaddingRight;
        }
        if ((i11 & 4) != 0) {
            bool = commonCellSettings.hasSeparator;
        }
        if ((i11 & 8) != 0) {
            str = commonCellSettings.separatorColor;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = commonCellSettings.action;
        }
        if ((i11 & 32) != 0) {
            map = commonCellSettings.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            testInfo = commonCellSettings.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Boolean bool2 = bool;
        return commonCellSettings.copy(layoutPadding, layoutPadding2, bool2, str, atomActionDTO2, map2, testInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final LayoutPadding getLayoutPaddingLeft() {
        return this.layoutPaddingLeft;
    }

    /* renamed from: component2, reason: from getter */
    public final LayoutPadding getLayoutPaddingRight() {
        return this.layoutPaddingRight;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHasSeparator() {
        return this.hasSeparator;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSeparatorColor() {
        return this.separatorColor;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final CommonCellSettings copy(LayoutPadding layoutPaddingLeft, LayoutPadding layoutPaddingRight, Boolean hasSeparator, String separatorColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        return new CommonCellSettings(layoutPaddingLeft, layoutPaddingRight, hasSeparator, separatorColor, action, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonCellSettings)) {
            return false;
        }
        CommonCellSettings commonCellSettings = (CommonCellSettings) other;
        return this.layoutPaddingLeft == commonCellSettings.layoutPaddingLeft && this.layoutPaddingRight == commonCellSettings.layoutPaddingRight && Intrinsics.d(this.hasSeparator, commonCellSettings.hasSeparator) && Intrinsics.d(this.separatorColor, commonCellSettings.separatorColor) && Intrinsics.d(this.action, commonCellSettings.action) && Intrinsics.d(this.trackingInfo, commonCellSettings.trackingInfo) && Intrinsics.d(this.testInfo, commonCellSettings.testInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Boolean getHasSeparator() {
        return this.hasSeparator;
    }

    public final LayoutPadding getLayoutPaddingLeft() {
        return this.layoutPaddingLeft;
    }

    public final LayoutPadding getLayoutPaddingRight() {
        return this.layoutPaddingRight;
    }

    public final String getSeparatorColor() {
        return this.separatorColor;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        LayoutPadding layoutPadding = this.layoutPaddingLeft;
        int hashCode = (layoutPadding == null ? 0 : layoutPadding.hashCode()) * 31;
        LayoutPadding layoutPadding2 = this.layoutPaddingRight;
        int hashCode2 = (hashCode + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
        Boolean bool = this.hasSeparator;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.separatorColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode6 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        LayoutPadding layoutPadding = this.layoutPaddingLeft;
        LayoutPadding layoutPadding2 = this.layoutPaddingRight;
        Boolean bool = this.hasSeparator;
        String str = this.separatorColor;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("CommonCellSettings(layoutPaddingLeft=");
        sb2.append(layoutPadding);
        sb2.append(", layoutPaddingRight=");
        sb2.append(layoutPadding2);
        sb2.append(", hasSeparator=");
        HY.b.c(bool, ", separatorColor=", str, ", action=", sb2);
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        LayoutPadding layoutPadding = this.layoutPaddingLeft;
        if (layoutPadding == null) {
            dest.writeInt(0);
        } else {
            GR.b.g(dest, 1, layoutPadding);
        }
        LayoutPadding layoutPadding2 = this.layoutPaddingRight;
        if (layoutPadding2 == null) {
            dest.writeInt(0);
        } else {
            GR.b.g(dest, 1, layoutPadding2);
        }
        Boolean bool = this.hasSeparator;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        dest.writeString(this.separatorColor);
        AtomActionDTO atomActionDTO = this.action;
        if (atomActionDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            atomActionDTO.writeToParcel(dest, flags);
        }
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

    public /* synthetic */ CommonCellSettings(LayoutPadding layoutPadding, LayoutPadding layoutPadding2, Boolean bool, String str, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? LayoutPadding.NONE : layoutPadding, (i11 & 2) != 0 ? LayoutPadding.NONE : layoutPadding2, (i11 & 4) != 0 ? Boolean.FALSE : bool, (i11 & 8) != 0 ? null : str, atomActionDTO, map, testInfo);
    }
}
