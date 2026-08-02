package ru.ozon.app.android.bank.widgets.cbottom.data;

import B90.C2616s;
import Hj.C3143a;
import N3.C3660k;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Jo\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R$\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/bank/widgets/cbottom/data/CbottomWidgetDTO;", "", "widgets", "", "backgroundColor", "widgetPadding", "", "", "widgetMargin", "backgroundRadius", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getWidgets", "()Ljava/lang/String;", "getBackgroundColor", "getWidgetPadding", "()Ljava/util/List;", "getWidgetMargin", "getBackgroundRadius", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CbottomWidgetDTO {

    @i(name = "backgroundColor")
    private final String backgroundColor;

    @i(name = "backgroundRadius")
    private final List<Integer> backgroundRadius;

    @i(name = "trackingInfo")
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @i(name = "widgetMargin")
    private final List<Integer> widgetMargin;

    @i(name = "widgetPadding")
    private final List<Integer> widgetPadding;
    private final transient String widgets;

    public CbottomWidgetDTO() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ CbottomWidgetDTO copy$default(CbottomWidgetDTO cbottomWidgetDTO, String str, String str2, List list, List list2, List list3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cbottomWidgetDTO.widgets;
        }
        if ((i11 & 2) != 0) {
            str2 = cbottomWidgetDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            list = cbottomWidgetDTO.widgetPadding;
        }
        if ((i11 & 8) != 0) {
            list2 = cbottomWidgetDTO.widgetMargin;
        }
        if ((i11 & 16) != 0) {
            list3 = cbottomWidgetDTO.backgroundRadius;
        }
        if ((i11 & 32) != 0) {
            map = cbottomWidgetDTO.trackingInfo;
        }
        List list4 = list3;
        Map map2 = map;
        return cbottomWidgetDTO.copy(str, str2, list, list2, list4, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgets() {
        return this.widgets;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<Integer> component3() {
        return this.widgetPadding;
    }

    public final List<Integer> component4() {
        return this.widgetMargin;
    }

    public final List<Integer> component5() {
        return this.backgroundRadius;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final CbottomWidgetDTO copy(String widgets, String backgroundColor, List<Integer> widgetPadding, List<Integer> widgetMargin, List<Integer> backgroundRadius, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new CbottomWidgetDTO(widgets, backgroundColor, widgetPadding, widgetMargin, backgroundRadius, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CbottomWidgetDTO)) {
            return false;
        }
        CbottomWidgetDTO cbottomWidgetDTO = (CbottomWidgetDTO) other;
        return Intrinsics.d(this.widgets, cbottomWidgetDTO.widgets) && Intrinsics.d(this.backgroundColor, cbottomWidgetDTO.backgroundColor) && Intrinsics.d(this.widgetPadding, cbottomWidgetDTO.widgetPadding) && Intrinsics.d(this.widgetMargin, cbottomWidgetDTO.widgetMargin) && Intrinsics.d(this.backgroundRadius, cbottomWidgetDTO.backgroundRadius) && Intrinsics.d(this.trackingInfo, cbottomWidgetDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<Integer> getBackgroundRadius() {
        return this.backgroundRadius;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final List<Integer> getWidgetMargin() {
        return this.widgetMargin;
    }

    public final List<Integer> getWidgetPadding() {
        return this.widgetPadding;
    }

    public final String getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        String str = this.widgets;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backgroundColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.widgetPadding;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.widgetMargin;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.backgroundRadius;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.widgets;
        String str2 = this.backgroundColor;
        List<Integer> list = this.widgetPadding;
        List<Integer> list2 = this.widgetMargin;
        List<Integer> list3 = this.backgroundRadius;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("CbottomWidgetDTO(widgets=", str, ", backgroundColor=", str2, ", widgetPadding=");
        C2616s.g(", widgetMargin=", ", backgroundRadius=", d11, list, list2);
        return C3143a.h(d11, list3, ", trackingInfo=", map, ")");
    }

    public CbottomWidgetDTO(String str, String str2, List<Integer> list, List<Integer> list2, List<Integer> list3, Map<String, TokenizedTrackingInfo> map) {
        this.widgets = str;
        this.backgroundColor = str2;
        this.widgetPadding = list;
        this.widgetMargin = list2;
        this.backgroundRadius = list3;
        this.trackingInfo = map;
    }

    public /* synthetic */ CbottomWidgetDTO(String str, String str2, List list, List list2, List list3, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : list2, (i11 & 16) != 0 ? null : list3, (i11 & 32) != 0 ? null : map);
    }
}
