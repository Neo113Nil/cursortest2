package ru.ozon.uni.atoms.data.tabs;

import Ak.b;
import Bi.a;
import Bl.C2639a;
import C.J;
import De.C2859b;
import Ds.C2880a;
import Kk.C3532b;
import Sc.InterfaceC3999a;
import T7.P;
import Tz.C4055a;
import Ul.C4070a;
import android.os.Parcel;
import android.os.Parcelable;
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
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00013Bg\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jk\u0010'\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0006\u0010(\u001a\u00020\u001fJ\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u001fHÖ\u0001J\t\u0010-\u001a\u00020\u0006HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00064"}, d2 = {"Lru/ozon/uni/atoms/data/tabs/Tabs;", "Lru/ozon/uni/atoms/data/AtomDTO;", "tabItems", "", "Lru/ozon/uni/atoms/data/tabs/Tabs$TabsItem;", "backgroundColor", "", "selectedBackgroundColor", "disableDefaultHorizontalMargins", "", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getTabItems", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getSelectedBackgroundColor", "getDisableDefaultHorizontalMargins", "()Z", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TabsItem", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Tabs extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Tabs> CREATOR = new Creator();
    private final String backgroundColor;
    private final String context;
    private final boolean disableDefaultHorizontalMargins;
    private final String selectedBackgroundColor;

    @NotNull
    private final List<TabsItem> tabItems;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Tabs> {
        @Override // android.os.Parcelable.Creator
        public final Tabs createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(TabsItem.CREATOR, parcel, arrayList, i11, 1);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            String readString3 = parcel.readString();
            TestInfo createFromParcel = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(Tabs.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Tabs(arrayList, readString, readString2, z11, readString3, createFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Tabs[] newArray(int i11) {
            return new Tabs[i11];
        }
    }

    public /* synthetic */ Tabs(List list, String str, String str2, boolean z11, String str3, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : testInfo, (i11 & 64) != 0 ? null : map);
    }

    public static /* synthetic */ Tabs copy$default(Tabs tabs, List list, String str, String str2, boolean z11, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tabs.tabItems;
        }
        if ((i11 & 2) != 0) {
            str = tabs.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            str2 = tabs.selectedBackgroundColor;
        }
        if ((i11 & 8) != 0) {
            z11 = tabs.disableDefaultHorizontalMargins;
        }
        if ((i11 & 16) != 0) {
            str3 = tabs.context;
        }
        if ((i11 & 32) != 0) {
            testInfo = tabs.testInfo;
        }
        if ((i11 & 64) != 0) {
            map = tabs.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        String str4 = str3;
        String str5 = str2;
        return tabs.copy(list, str, str5, z11, str4, testInfo2, map2);
    }

    @NotNull
    public final List<TabsItem> component1() {
        return this.tabItems;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedBackgroundColor() {
        return this.selectedBackgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getDisableDefaultHorizontalMargins() {
        return this.disableDefaultHorizontalMargins;
    }

    /* renamed from: component5, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final Tabs copy(@NotNull List<TabsItem> tabItems, String backgroundColor, String selectedBackgroundColor, boolean disableDefaultHorizontalMargins, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        return new Tabs(tabItems, backgroundColor, selectedBackgroundColor, disableDefaultHorizontalMargins, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tabs)) {
            return false;
        }
        Tabs tabs = (Tabs) other;
        return Intrinsics.d(this.tabItems, tabs.tabItems) && Intrinsics.d(this.backgroundColor, tabs.backgroundColor) && Intrinsics.d(this.selectedBackgroundColor, tabs.selectedBackgroundColor) && this.disableDefaultHorizontalMargins == tabs.disableDefaultHorizontalMargins && Intrinsics.d(this.context, tabs.context) && Intrinsics.d(this.testInfo, tabs.testInfo) && Intrinsics.d(this.trackingInfo, tabs.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final boolean getDisableDefaultHorizontalMargins() {
        return this.disableDefaultHorizontalMargins;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_tabs;
    }

    public final String getSelectedBackgroundColor() {
        return this.selectedBackgroundColor;
    }

    @NotNull
    public final List<TabsItem> getTabItems() {
        return this.tabItems;
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
        int hashCode = this.tabItems.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedBackgroundColor;
        int a11 = C3532b.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.disableDefaultHorizontalMargins);
        String str3 = this.context;
        int hashCode3 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TabsItem> list = this.tabItems;
        String str = this.backgroundColor;
        String str2 = this.selectedBackgroundColor;
        boolean z11 = this.disableDefaultHorizontalMargins;
        String str3 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = C4055a.a("Tabs(tabItems=", ", backgroundColor=", str, ", selectedBackgroundColor=", list);
        C2880a.c(str2, ", disableDefaultHorizontalMargins=", ", context=", a11, z11);
        C4070a.b(a11, str3, ", testInfo=", testInfo, ", trackingInfo=");
        return P.f(a11, map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = a.c(this.tabItems, dest);
        while (c11.hasNext()) {
            ((TabsItem) c11.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.backgroundColor);
        dest.writeString(this.selectedBackgroundColor);
        dest.writeInt(this.disableDefaultHorizontalMargins ? 1 : 0);
        dest.writeString(this.context);
        TestInfo testInfo = this.testInfo;
        if (testInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            testInfo.writeToParcel(dest, flags);
        }
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator e11 = J.e(map, dest, 1);
        while (e11.hasNext()) {
            Map.Entry entry = (Map.Entry) e11.next();
            dest.writeString((String) entry.getKey());
            dest.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tabs(@NotNull List<TabsItem> tabItems, String str, String str2, boolean z11, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(Type.TABS, str3, map, testInfo);
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        this.tabItems = tabItems;
        this.backgroundColor = str;
        this.selectedBackgroundColor = str2;
        this.disableDefaultHorizontalMargins = z11;
        this.context = str3;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020\tHÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Lru/ozon/uni/atoms/data/tabs/Tabs$TabsItem;", "Landroid/os/Parcelable;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabsItem implements Parcelable {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<TabsItem> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final boolean isSelected;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<TabsItem> {
            @Override // android.os.Parcelable.Creator
            public final TabsItem createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                boolean z11 = parcel.readInt() != 0;
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(TabsItem.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new TabsItem(create, z11, createFromParcel, readString, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final TabsItem[] newArray(int i11) {
                return new TabsItem[i11];
            }
        }

        public TabsItem(@NotNull OzonSpannableString text, boolean z11, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.isSelected = z11;
            this.action = atomActionDTO;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }

        public static /* synthetic */ TabsItem copy$default(TabsItem tabsItem, OzonSpannableString ozonSpannableString, boolean z11, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = tabsItem.text;
            }
            if ((i11 & 2) != 0) {
                z11 = tabsItem.isSelected;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = tabsItem.action;
            }
            if ((i11 & 8) != 0) {
                str = tabsItem.context;
            }
            if ((i11 & 16) != 0) {
                testInfo = tabsItem.testInfo;
            }
            if ((i11 & 32) != 0) {
                map = tabsItem.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            return tabsItem.copy(ozonSpannableString, z11, atomActionDTO, str, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component5, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final TabsItem copy(@NotNull OzonSpannableString text, boolean isSelected, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TabsItem(text, isSelected, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabsItem)) {
                return false;
            }
            TabsItem tabsItem = (TabsItem) other;
            return Intrinsics.d(this.text, tabsItem.text) && this.isSelected == tabsItem.isSelected && Intrinsics.d(this.action, tabsItem.action) && Intrinsics.d(this.context, tabsItem.context) && Intrinsics.d(this.testInfo, tabsItem.testInfo) && Intrinsics.d(this.trackingInfo, tabsItem.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getContext() {
            return this.context;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.text.hashCode() * 31, 31, this.isSelected);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.context;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            boolean z11 = this.isSelected;
            AtomActionDTO atomActionDTO = this.action;
            String str = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("TabsItem(text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", isSelected=");
            sb2.append(z11);
            sb2.append(", action=");
            HY.b.d(", context=", str, ", testInfo=", sb2, atomActionDTO);
            return C2639a.a(", trackingInfo=", ")", sb2, map, testInfo);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            dest.writeInt(this.isSelected ? 1 : 0);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        public /* synthetic */ TabsItem(OzonSpannableString ozonSpannableString, boolean z11, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, z11, (i11 & 4) != 0 ? null : atomActionDTO, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : testInfo, (i11 & 32) != 0 ? null : map);
        }
    }
}
