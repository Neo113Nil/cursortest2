package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.data;

import Bi.a;
import Bi.b;
import Ds.C2880a;
import Kk.C3532b;
import Pk0.f;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eHÆ\u0003J\u0097\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eHÆ\u0001J\u0013\u0010/\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001dR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001f¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/data/AdditionalReturnServiceCellDTO;", "", "returnCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "infoCell", "clickControl", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "backgroundColor", "", "borderColor", "isCellClickable", "", "isNotShaded", "viewTracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "shouldFetchState", "shouldShowSkeleton", "asyncParams", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;ZZLjava/util/Map;)V", "getReturnCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getInfoCell", "getClickControl", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "()Z", "getViewTracking", "()Ljava/util/Map;", "getShouldFetchState", "getShouldShowSkeleton", "getAsyncParams", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalReturnServiceCellDTO {
    public static final int $stable = 8;
    private final Map<String, String> asyncParams;
    private final String backgroundColor;
    private final String borderColor;

    @NotNull
    private final CommonControlSettings clickControl;

    @NotNull
    private final CellDTO infoCell;
    private final boolean isCellClickable;
    private final boolean isNotShaded;

    @NotNull
    private final CellDTO returnCell;
    private final boolean shouldFetchState;
    private final boolean shouldShowSkeleton;
    private final Map<String, TokenizedTrackingInfo> viewTracking;

    public AdditionalReturnServiceCellDTO(@NotNull CellDTO returnCell, @NotNull CellDTO infoCell, @NotNull CommonControlSettings clickControl, String str, String str2, boolean z11, boolean z12, Map<String, TokenizedTrackingInfo> map, boolean z13, boolean z14, Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(returnCell, "returnCell");
        Intrinsics.checkNotNullParameter(infoCell, "infoCell");
        Intrinsics.checkNotNullParameter(clickControl, "clickControl");
        this.returnCell = returnCell;
        this.infoCell = infoCell;
        this.clickControl = clickControl;
        this.backgroundColor = str;
        this.borderColor = str2;
        this.isCellClickable = z11;
        this.isNotShaded = z12;
        this.viewTracking = map;
        this.shouldFetchState = z13;
        this.shouldShowSkeleton = z14;
        this.asyncParams = map2;
    }

    public static /* synthetic */ AdditionalReturnServiceCellDTO copy$default(AdditionalReturnServiceCellDTO additionalReturnServiceCellDTO, CellDTO cellDTO, CellDTO cellDTO2, CommonControlSettings commonControlSettings, String str, String str2, boolean z11, boolean z12, Map map, boolean z13, boolean z14, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = additionalReturnServiceCellDTO.returnCell;
        }
        if ((i11 & 2) != 0) {
            cellDTO2 = additionalReturnServiceCellDTO.infoCell;
        }
        if ((i11 & 4) != 0) {
            commonControlSettings = additionalReturnServiceCellDTO.clickControl;
        }
        if ((i11 & 8) != 0) {
            str = additionalReturnServiceCellDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            str2 = additionalReturnServiceCellDTO.borderColor;
        }
        if ((i11 & 32) != 0) {
            z11 = additionalReturnServiceCellDTO.isCellClickable;
        }
        if ((i11 & 64) != 0) {
            z12 = additionalReturnServiceCellDTO.isNotShaded;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = additionalReturnServiceCellDTO.viewTracking;
        }
        if ((i11 & 256) != 0) {
            z13 = additionalReturnServiceCellDTO.shouldFetchState;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            z14 = additionalReturnServiceCellDTO.shouldShowSkeleton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map2 = additionalReturnServiceCellDTO.asyncParams;
        }
        boolean z15 = z14;
        Map map3 = map2;
        Map map4 = map;
        boolean z16 = z13;
        boolean z17 = z11;
        boolean z18 = z12;
        String str3 = str2;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return additionalReturnServiceCellDTO.copy(cellDTO, cellDTO2, commonControlSettings2, str, str3, z17, z18, map4, z16, z15, map3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getReturnCell() {
        return this.returnCell;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShouldShowSkeleton() {
        return this.shouldShowSkeleton;
    }

    public final Map<String, String> component11() {
        return this.asyncParams;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CellDTO getInfoCell() {
        return this.infoCell;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CommonControlSettings getClickControl() {
        return this.clickControl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCellClickable() {
        return this.isCellClickable;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsNotShaded() {
        return this.isNotShaded;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.viewTracking;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShouldFetchState() {
        return this.shouldFetchState;
    }

    @NotNull
    public final AdditionalReturnServiceCellDTO copy(@NotNull CellDTO returnCell, @NotNull CellDTO infoCell, @NotNull CommonControlSettings clickControl, String backgroundColor, String borderColor, boolean isCellClickable, boolean isNotShaded, Map<String, TokenizedTrackingInfo> viewTracking, boolean shouldFetchState, boolean shouldShowSkeleton, Map<String, String> asyncParams) {
        Intrinsics.checkNotNullParameter(returnCell, "returnCell");
        Intrinsics.checkNotNullParameter(infoCell, "infoCell");
        Intrinsics.checkNotNullParameter(clickControl, "clickControl");
        return new AdditionalReturnServiceCellDTO(returnCell, infoCell, clickControl, backgroundColor, borderColor, isCellClickable, isNotShaded, viewTracking, shouldFetchState, shouldShowSkeleton, asyncParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalReturnServiceCellDTO)) {
            return false;
        }
        AdditionalReturnServiceCellDTO additionalReturnServiceCellDTO = (AdditionalReturnServiceCellDTO) other;
        return Intrinsics.d(this.returnCell, additionalReturnServiceCellDTO.returnCell) && Intrinsics.d(this.infoCell, additionalReturnServiceCellDTO.infoCell) && Intrinsics.d(this.clickControl, additionalReturnServiceCellDTO.clickControl) && Intrinsics.d(this.backgroundColor, additionalReturnServiceCellDTO.backgroundColor) && Intrinsics.d(this.borderColor, additionalReturnServiceCellDTO.borderColor) && this.isCellClickable == additionalReturnServiceCellDTO.isCellClickable && this.isNotShaded == additionalReturnServiceCellDTO.isNotShaded && Intrinsics.d(this.viewTracking, additionalReturnServiceCellDTO.viewTracking) && this.shouldFetchState == additionalReturnServiceCellDTO.shouldFetchState && this.shouldShowSkeleton == additionalReturnServiceCellDTO.shouldShowSkeleton && Intrinsics.d(this.asyncParams, additionalReturnServiceCellDTO.asyncParams);
    }

    public final Map<String, String> getAsyncParams() {
        return this.asyncParams;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final CommonControlSettings getClickControl() {
        return this.clickControl;
    }

    @NotNull
    public final CellDTO getInfoCell() {
        return this.infoCell;
    }

    @NotNull
    public final CellDTO getReturnCell() {
        return this.returnCell;
    }

    public final boolean getShouldFetchState() {
        return this.shouldFetchState;
    }

    public final boolean getShouldShowSkeleton() {
        return this.shouldShowSkeleton;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTracking() {
        return this.viewTracking;
    }

    public int hashCode() {
        int a11 = a.a(this.clickControl, b.c(this.infoCell, this.returnCell.hashCode() * 31, 31), 31);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.borderColor;
        int a12 = C3532b.a(C3532b.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isCellClickable), 31, this.isNotShaded);
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        int a13 = C3532b.a(C3532b.a((a12 + (map == null ? 0 : map.hashCode())) * 31, 31, this.shouldFetchState), 31, this.shouldShowSkeleton);
        Map<String, String> map2 = this.asyncParams;
        return a13 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isCellClickable() {
        return this.isCellClickable;
    }

    public final boolean isNotShaded() {
        return this.isNotShaded;
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.returnCell;
        CellDTO cellDTO2 = this.infoCell;
        CommonControlSettings commonControlSettings = this.clickControl;
        String str = this.backgroundColor;
        String str2 = this.borderColor;
        boolean z11 = this.isCellClickable;
        boolean z12 = this.isNotShaded;
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        boolean z13 = this.shouldFetchState;
        boolean z14 = this.shouldShowSkeleton;
        Map<String, String> map2 = this.asyncParams;
        StringBuilder sb2 = new StringBuilder("AdditionalReturnServiceCellDTO(returnCell=");
        sb2.append(cellDTO);
        sb2.append(", infoCell=");
        sb2.append(cellDTO2);
        sb2.append(", clickControl=");
        sb2.append(commonControlSettings);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", borderColor=");
        C2880a.c(str2, ", isCellClickable=", ", isNotShaded=", sb2, z11);
        sb2.append(z12);
        sb2.append(", viewTracking=");
        sb2.append(map);
        sb2.append(", shouldFetchState=");
        f.c(", shouldShowSkeleton=", ", asyncParams=", sb2, z13, z14);
        return P.f(sb2, map2, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AdditionalReturnServiceCellDTO(CellDTO cellDTO, CellDTO cellDTO2, CommonControlSettings commonControlSettings, String str, String str2, boolean z11, boolean z12, Map map, boolean z13, boolean z14, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cellDTO, cellDTO2, commonControlSettings, str, str2, z11, z12, map, z13, r12, r13);
        Map map3;
        boolean z15;
        z11 = (i11 & 32) != 0 ? false : z11;
        z12 = (i11 & 64) != 0 ? false : z12;
        z13 = (i11 & 256) != 0 ? false : z13;
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map3 = map2;
            z15 = false;
        } else {
            map3 = map2;
            z15 = z14;
        }
    }
}
