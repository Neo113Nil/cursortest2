package ru.ozon.uni.atoms.data.tabs;

import Ak.b;
import B0.C2454a;
import C.J;
import C.o0;
import D40.c;
import De.C2859b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import Xc.a;
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
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002EFB}\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010.\u001a\u00020\u0007H\u0016J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0088\u0001\u00108\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00109J\u0006\u0010:\u001a\u00020\u0007J\u0013\u0010;\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u0007HÖ\u0001J\t\u0010?\u001a\u00020\u000eHÖ\u0001J\u0016\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010\"¨\u0006G"}, d2 = {"Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Landroid/os/Parcelable;", DynamicElementDTO.TABS, "", "Lru/ozon/uni/atoms/data/tabs/TabsDTO$TabDTO;", "selectedTabIndex", "", "hideSubtitle", "", "style", "Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "styleType", "round", "Lru/ozon/uni/atoms/data/common/Rounds;", "backgroundColor", "<init>", "(Ljava/util/List;ILjava/lang/Boolean;Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;Lru/ozon/uni/atoms/data/common/Rounds;Ljava/lang/String;)V", "getTabs", "()Ljava/util/List;", "getSelectedTabIndex", "()I", "getHideSubtitle", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStyle$annotations", "()V", "getStyle", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getStyleType", "getRound", "()Lru/ozon/uni/atoms/data/common/Rounds;", "getBackgroundColor", "()Ljava/lang/String;", "tabStyle", "getTabStyle", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;ILjava/lang/Boolean;Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;Lru/ozon/uni/atoms/data/common/Rounds;Ljava/lang/String;)Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TabDTO", "Style", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TabsDTO extends AtomDTO implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<TabsDTO> CREATOR = new Creator();
    private final String backgroundColor;
    private final Boolean hideSubtitle;
    private final Rounds round;
    private final int selectedTabIndex;
    private final Style style;

    @EnumNullFallback
    private final Style styleType;

    @NotNull
    private final List<TabDTO> tabs;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TabsDTO> {
        @Override // android.os.Parcelable.Creator
        public final TabsDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(TabDTO.CREATOR, parcel, arrayList, i11, 1);
            }
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Style valueOf2 = parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
                int i12 = 0;
                while (i12 != readInt3) {
                    i12 = C2859b.a(TabsDTO.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new TabsDTO(arrayList, readInt2, valueOf, valueOf2, linkedHashMap, parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString()), parcel.readInt() != 0 ? Rounds.valueOf(parcel.readString()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TabsDTO[] newArray(int i11) {
            return new TabsDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;", "", "<init>", "(Ljava/lang/String;I)V", "BASE", "ACCENT", "CUSTOM", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style BASE = new Style("BASE", 0);
        public static final Style ACCENT = new Style("ACCENT", 1);
        public static final Style CUSTOM = new Style("CUSTOM", 2);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{BASE, ACCENT, CUSTOM};
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Style(String str, int i11) {
        }

        @NotNull
        public static a<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TabsDTO(java.util.List r11, int r12, java.lang.Boolean r13, ru.ozon.uni.atoms.data.tabs.TabsDTO.Style r14, java.util.Map r15, ru.ozon.uni.atoms.data.TestInfo r16, ru.ozon.uni.atoms.data.tabs.TabsDTO.Style r17, ru.ozon.uni.atoms.data.common.Rounds r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 4
            if (r1 == 0) goto L8
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
        L8:
            r3 = r13
            r13 = r0 & 8
            if (r13 == 0) goto L11
            ru.ozon.uni.atoms.data.tabs.TabsDTO$Style r13 = ru.ozon.uni.atoms.data.tabs.TabsDTO.Style.BASE
            r4 = r13
            goto L12
        L11:
            r4 = r14
        L12:
            r13 = r0 & 16
            r1 = 0
            if (r13 == 0) goto L19
            r5 = r1
            goto L1a
        L19:
            r5 = r15
        L1a:
            r13 = r0 & 32
            if (r13 == 0) goto L20
            r6 = r1
            goto L22
        L20:
            r6 = r16
        L22:
            r13 = r0 & 64
            if (r13 == 0) goto L2a
            ru.ozon.uni.atoms.data.tabs.TabsDTO$Style r13 = ru.ozon.uni.atoms.data.tabs.TabsDTO.Style.BASE
            r7 = r13
            goto L2c
        L2a:
            r7 = r17
        L2c:
            r13 = r0 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L32
            r8 = r1
            goto L34
        L32:
            r8 = r18
        L34:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L3d
            r9 = r1
            r0 = r10
            r2 = r12
            r1 = r11
            goto L42
        L3d:
            r9 = r19
            r0 = r10
            r1 = r11
            r2 = r12
        L42:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.uni.atoms.data.tabs.TabsDTO.<init>(java.util.List, int, java.lang.Boolean, ru.ozon.uni.atoms.data.tabs.TabsDTO$Style, java.util.Map, ru.ozon.uni.atoms.data.TestInfo, ru.ozon.uni.atoms.data.tabs.TabsDTO$Style, ru.ozon.uni.atoms.data.common.Rounds, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ TabsDTO copy$default(TabsDTO tabsDTO, List list, int i11, Boolean bool, Style style, Map map, TestInfo testInfo, Style style2, Rounds rounds, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = tabsDTO.tabs;
        }
        if ((i12 & 2) != 0) {
            i11 = tabsDTO.selectedTabIndex;
        }
        if ((i12 & 4) != 0) {
            bool = tabsDTO.hideSubtitle;
        }
        if ((i12 & 8) != 0) {
            style = tabsDTO.style;
        }
        if ((i12 & 16) != 0) {
            map = tabsDTO.trackingInfo;
        }
        if ((i12 & 32) != 0) {
            testInfo = tabsDTO.testInfo;
        }
        if ((i12 & 64) != 0) {
            style2 = tabsDTO.styleType;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            rounds = tabsDTO.round;
        }
        if ((i12 & 256) != 0) {
            str = tabsDTO.backgroundColor;
        }
        Rounds rounds2 = rounds;
        String str2 = str;
        TestInfo testInfo2 = testInfo;
        Style style3 = style2;
        Map map2 = map;
        Boolean bool2 = bool;
        return tabsDTO.copy(list, i11, bool2, style, map2, testInfo2, style3, rounds2, str2);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getStyle$annotations() {
    }

    @NotNull
    public final List<TabDTO> component1() {
        return this.tabs;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHideSubtitle() {
        return this.hideSubtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final Style getStyleType() {
        return this.styleType;
    }

    /* renamed from: component8, reason: from getter */
    public final Rounds getRound() {
        return this.round;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final TabsDTO copy(@NotNull List<TabDTO> tabs, int selectedTabIndex, Boolean hideSubtitle, Style style, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, Style styleType, Rounds round, String backgroundColor) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new TabsDTO(tabs, selectedTabIndex, hideSubtitle, style, trackingInfo, testInfo, styleType, round, backgroundColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabsDTO)) {
            return false;
        }
        TabsDTO tabsDTO = (TabsDTO) other;
        return Intrinsics.d(this.tabs, tabsDTO.tabs) && this.selectedTabIndex == tabsDTO.selectedTabIndex && Intrinsics.d(this.hideSubtitle, tabsDTO.hideSubtitle) && this.style == tabsDTO.style && Intrinsics.d(this.trackingInfo, tabsDTO.trackingInfo) && Intrinsics.d(this.testInfo, tabsDTO.testInfo) && this.styleType == tabsDTO.styleType && this.round == tabsDTO.round && Intrinsics.d(this.backgroundColor, tabsDTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Boolean getHideSubtitle() {
        return this.hideSubtitle;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.tabs;
    }

    public final Rounds getRound() {
        return this.round;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final Style getStyleType() {
        return this.styleType;
    }

    @NotNull
    public final Style getTabStyle() {
        Style style = this.style;
        if (style != null) {
            return style;
        }
        Style style2 = this.styleType;
        return style2 == null ? Style.BASE : style2;
    }

    @NotNull
    public final List<TabDTO> getTabs() {
        return this.tabs;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.selectedTabIndex, this.tabs.hashCode() * 31, 31);
        Boolean bool = this.hideSubtitle;
        int hashCode = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Style style = this.style;
        int hashCode2 = (hashCode + (style == null ? 0 : style.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Style style2 = this.styleType;
        int hashCode5 = (hashCode4 + (style2 == null ? 0 : style2.hashCode())) * 31;
        Rounds rounds = this.round;
        int hashCode6 = (hashCode5 + (rounds == null ? 0 : rounds.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TabDTO> list = this.tabs;
        int i11 = this.selectedTabIndex;
        Boolean bool = this.hideSubtitle;
        Style style = this.style;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        Style style2 = this.styleType;
        Rounds rounds = this.round;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("TabsDTO(tabs=");
        sb2.append(list);
        sb2.append(", selectedTabIndex=");
        sb2.append(i11);
        sb2.append(", hideSubtitle=");
        sb2.append(bool);
        sb2.append(", style=");
        sb2.append(style);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(", styleType=");
        sb2.append(style2);
        sb2.append(", round=");
        sb2.append(rounds);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = Bi.a.c(this.tabs, dest);
        while (c11.hasNext()) {
            ((TabDTO) c11.next()).writeToParcel(dest, flags);
        }
        dest.writeInt(this.selectedTabIndex);
        Boolean bool = this.hideSubtitle;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        Style style = this.style;
        if (style == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(style.name());
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
        Style style2 = this.styleType;
        if (style2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(style2.name());
        }
        Rounds rounds = this.round;
        if (rounds == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(rounds.name());
        }
        dest.writeString(this.backgroundColor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsDTO(@NotNull List<TabDTO> tabs, int i11, Boolean bool, Style style, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, Style style2, Rounds rounds, String str) {
        super(DsAtomsType.TABS, null, map, testInfo);
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.tabs = tabs;
        this.selectedTabIndex = i11;
        this.hideSubtitle = bool;
        this.style = style;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.styleType = style2;
        this.round = rounds;
        this.backgroundColor = str;
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\"J\u0084\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010/J\u0006\u00100\u001a\u000201J\u0013\u00102\u001a\u00020\u00112\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000201HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000201R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0010\u0010\"¨\u0006<"}, d2 = {"Lru/ozon/uni/atoms/data/tabs/TabsDTO$TabDTO;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "selectedBackgroundColor", "titleColor", "subtitleColor", "isSelectionDisabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getSelectedBackgroundColor", "getTitleColor", "getSubtitleColor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/uni/atoms/data/tabs/TabsDTO$TabDTO;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabDTO implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<TabDTO> CREATOR = new Creator();
        private final BadgeDTO badge;
        private final CommonControlSettings common;
        private final CommonAtomIconDTO icon;
        private final IndicatorDTO indicator;
        private final Boolean isSelectionDisabled;
        private final String selectedBackgroundColor;
        private final String subtitle;
        private final String subtitleColor;

        @NotNull
        private final String title;
        private final String titleColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TabDTO> {
            @Override // android.os.Parcelable.Creator
            public final TabDTO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Boolean bool = null;
                BadgeDTO createFromParcel = parcel.readInt() == 0 ? null : BadgeDTO.CREATOR.createFromParcel(parcel);
                IndicatorDTO createFromParcel2 = parcel.readInt() == 0 ? null : IndicatorDTO.CREATOR.createFromParcel(parcel);
                CommonAtomIconDTO createFromParcel3 = parcel.readInt() == 0 ? null : CommonAtomIconDTO.CREATOR.createFromParcel(parcel);
                CommonControlSettings createFromParcel4 = parcel.readInt() == 0 ? null : CommonControlSettings.CREATOR.createFromParcel(parcel);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new TabDTO(readString, readString2, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, readString3, readString4, readString5, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final TabDTO[] newArray(int i11) {
                return new TabDTO[i11];
            }
        }

        public TabDTO(@NotNull String title, String str, BadgeDTO badgeDTO, IndicatorDTO indicatorDTO, CommonAtomIconDTO commonAtomIconDTO, CommonControlSettings commonControlSettings, String str2, String str3, String str4, Boolean bool) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = str;
            this.badge = badgeDTO;
            this.indicator = indicatorDTO;
            this.icon = commonAtomIconDTO;
            this.common = commonControlSettings;
            this.selectedBackgroundColor = str2;
            this.titleColor = str3;
            this.subtitleColor = str4;
            this.isSelectionDisabled = bool;
        }

        public static /* synthetic */ TabDTO copy$default(TabDTO tabDTO, String str, String str2, BadgeDTO badgeDTO, IndicatorDTO indicatorDTO, CommonAtomIconDTO commonAtomIconDTO, CommonControlSettings commonControlSettings, String str3, String str4, String str5, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tabDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = tabDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = tabDTO.badge;
            }
            if ((i11 & 8) != 0) {
                indicatorDTO = tabDTO.indicator;
            }
            if ((i11 & 16) != 0) {
                commonAtomIconDTO = tabDTO.icon;
            }
            if ((i11 & 32) != 0) {
                commonControlSettings = tabDTO.common;
            }
            if ((i11 & 64) != 0) {
                str3 = tabDTO.selectedBackgroundColor;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str4 = tabDTO.titleColor;
            }
            if ((i11 & 256) != 0) {
                str5 = tabDTO.subtitleColor;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                bool = tabDTO.isSelectionDisabled;
            }
            String str6 = str5;
            Boolean bool2 = bool;
            String str7 = str3;
            String str8 = str4;
            CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            return tabDTO.copy(str, str2, badgeDTO, indicatorDTO, commonAtomIconDTO2, commonControlSettings2, str7, str8, str6, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final Boolean getIsSelectionDisabled() {
            return this.isSelectionDisabled;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component4, reason: from getter */
        public final IndicatorDTO getIndicator() {
            return this.indicator;
        }

        /* renamed from: component5, reason: from getter */
        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component6, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSelectedBackgroundColor() {
            return this.selectedBackgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final String getTitleColor() {
            return this.titleColor;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSubtitleColor() {
            return this.subtitleColor;
        }

        @NotNull
        public final TabDTO copy(@NotNull String title, String subtitle, BadgeDTO badge, IndicatorDTO indicator, CommonAtomIconDTO icon, CommonControlSettings common, String selectedBackgroundColor, String titleColor, String subtitleColor, Boolean isSelectionDisabled) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new TabDTO(title, subtitle, badge, indicator, icon, common, selectedBackgroundColor, titleColor, subtitleColor, isSelectionDisabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabDTO)) {
                return false;
            }
            TabDTO tabDTO = (TabDTO) other;
            return Intrinsics.d(this.title, tabDTO.title) && Intrinsics.d(this.subtitle, tabDTO.subtitle) && Intrinsics.d(this.badge, tabDTO.badge) && Intrinsics.d(this.indicator, tabDTO.indicator) && Intrinsics.d(this.icon, tabDTO.icon) && Intrinsics.d(this.common, tabDTO.common) && Intrinsics.d(this.selectedBackgroundColor, tabDTO.selectedBackgroundColor) && Intrinsics.d(this.titleColor, tabDTO.titleColor) && Intrinsics.d(this.subtitleColor, tabDTO.subtitleColor) && Intrinsics.d(this.isSelectionDisabled, tabDTO.isSelectionDisabled);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        public final IndicatorDTO getIndicator() {
            return this.indicator;
        }

        public final String getSelectedBackgroundColor() {
            return this.selectedBackgroundColor;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getSubtitleColor() {
            return this.subtitleColor;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final String getTitleColor() {
            return this.titleColor;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            IndicatorDTO indicatorDTO = this.indicator;
            int hashCode4 = (hashCode3 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            int hashCode5 = (hashCode4 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            int hashCode6 = (hashCode5 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            String str2 = this.selectedBackgroundColor;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.titleColor;
            int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.subtitleColor;
            int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.isSelectionDisabled;
            return hashCode9 + (bool != null ? bool.hashCode() : 0);
        }

        public final Boolean isSelectionDisabled() {
            return this.isSelectionDisabled;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            BadgeDTO badgeDTO = this.badge;
            IndicatorDTO indicatorDTO = this.indicator;
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            CommonControlSettings commonControlSettings = this.common;
            String str3 = this.selectedBackgroundColor;
            String str4 = this.titleColor;
            String str5 = this.subtitleColor;
            Boolean bool = this.isSelectionDisabled;
            StringBuilder d11 = C3660k.d("TabDTO(title=", str, ", subtitle=", str2, ", badge=");
            d11.append(badgeDTO);
            d11.append(", indicator=");
            d11.append(indicatorDTO);
            d11.append(", icon=");
            d11.append(commonAtomIconDTO);
            d11.append(", common=");
            d11.append(commonControlSettings);
            d11.append(", selectedBackgroundColor=");
            Nh.a.h(d11, str3, ", titleColor=", str4, ", subtitleColor=");
            d11.append(str5);
            d11.append(", isSelectionDisabled=");
            d11.append(bool);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            BadgeDTO badgeDTO = this.badge;
            if (badgeDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                badgeDTO.writeToParcel(dest, flags);
            }
            IndicatorDTO indicatorDTO = this.indicator;
            if (indicatorDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                indicatorDTO.writeToParcel(dest, flags);
            }
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            if (commonAtomIconDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                commonAtomIconDTO.writeToParcel(dest, flags);
            }
            CommonControlSettings commonControlSettings = this.common;
            if (commonControlSettings == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                commonControlSettings.writeToParcel(dest, flags);
            }
            dest.writeString(this.selectedBackgroundColor);
            dest.writeString(this.titleColor);
            dest.writeString(this.subtitleColor);
            Boolean bool = this.isSelectionDisabled;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool);
            }
        }

        public /* synthetic */ TabDTO(String str, String str2, BadgeDTO badgeDTO, IndicatorDTO indicatorDTO, CommonAtomIconDTO commonAtomIconDTO, CommonControlSettings commonControlSettings, String str3, String str4, String str5, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : badgeDTO, (i11 & 8) != 0 ? null : indicatorDTO, (i11 & 16) != 0 ? null : commonAtomIconDTO, (i11 & 32) != 0 ? null : commonControlSettings, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : bool);
        }
    }
}
