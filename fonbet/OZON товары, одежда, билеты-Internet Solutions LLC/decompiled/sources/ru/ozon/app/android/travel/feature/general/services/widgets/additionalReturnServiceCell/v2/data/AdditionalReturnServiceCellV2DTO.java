package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.data;

import Kk.C3532b;
import Nh.a;
import Pk0.f;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u007f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\rHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rHÆ\u0003J\u008b\u0001\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rHÆ\u0001J\u0013\u0010,\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001e¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/data/AdditionalReturnServiceCellV2DTO;", "", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "backgroundColor", "", "borderColor", "shouldFetchState", "", "asyncParams", "", "shouldShowSkeleton", "showBookingSkeleton", "viewTracking", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZZLjava/util/Map;)V", "getCells", "()Ljava/util/List;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "getShouldFetchState", "()Z", "getAsyncParams", "()Ljava/util/Map;", "getShouldShowSkeleton", "getShowBookingSkeleton", "getViewTracking", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalReturnServiceCellV2DTO {
    public static final int $stable = 8;
    private final Map<String, String> asyncParams;
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final String borderColor;

    @NotNull
    private final List<CellDTO> cells;
    private final boolean shouldFetchState;
    private final boolean shouldShowSkeleton;
    private final boolean showBookingSkeleton;
    private final Map<String, TokenizedTrackingInfo> viewTracking;

    public AdditionalReturnServiceCellV2DTO(@NotNull List<CellDTO> cells, BadgeDTO badgeDTO, String str, String str2, boolean z11, Map<String, String> map, boolean z12, boolean z13, Map<String, TokenizedTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.cells = cells;
        this.badge = badgeDTO;
        this.backgroundColor = str;
        this.borderColor = str2;
        this.shouldFetchState = z11;
        this.asyncParams = map;
        this.shouldShowSkeleton = z12;
        this.showBookingSkeleton = z13;
        this.viewTracking = map2;
    }

    public static /* synthetic */ AdditionalReturnServiceCellV2DTO copy$default(AdditionalReturnServiceCellV2DTO additionalReturnServiceCellV2DTO, List list, BadgeDTO badgeDTO, String str, String str2, boolean z11, Map map, boolean z12, boolean z13, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = additionalReturnServiceCellV2DTO.cells;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = additionalReturnServiceCellV2DTO.badge;
        }
        if ((i11 & 4) != 0) {
            str = additionalReturnServiceCellV2DTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            str2 = additionalReturnServiceCellV2DTO.borderColor;
        }
        if ((i11 & 16) != 0) {
            z11 = additionalReturnServiceCellV2DTO.shouldFetchState;
        }
        if ((i11 & 32) != 0) {
            map = additionalReturnServiceCellV2DTO.asyncParams;
        }
        if ((i11 & 64) != 0) {
            z12 = additionalReturnServiceCellV2DTO.shouldShowSkeleton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z13 = additionalReturnServiceCellV2DTO.showBookingSkeleton;
        }
        if ((i11 & 256) != 0) {
            map2 = additionalReturnServiceCellV2DTO.viewTracking;
        }
        boolean z14 = z13;
        Map map3 = map2;
        Map map4 = map;
        boolean z15 = z12;
        boolean z16 = z11;
        String str3 = str;
        return additionalReturnServiceCellV2DTO.copy(list, badgeDTO, str3, str2, z16, map4, z15, z14, map3);
    }

    @NotNull
    public final List<CellDTO> component1() {
        return this.cells;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShouldFetchState() {
        return this.shouldFetchState;
    }

    public final Map<String, String> component6() {
        return this.asyncParams;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShouldShowSkeleton() {
        return this.shouldShowSkeleton;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowBookingSkeleton() {
        return this.showBookingSkeleton;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.viewTracking;
    }

    @NotNull
    public final AdditionalReturnServiceCellV2DTO copy(@NotNull List<CellDTO> cells, BadgeDTO badge, String backgroundColor, String borderColor, boolean shouldFetchState, Map<String, String> asyncParams, boolean shouldShowSkeleton, boolean showBookingSkeleton, Map<String, TokenizedTrackingInfo> viewTracking) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new AdditionalReturnServiceCellV2DTO(cells, badge, backgroundColor, borderColor, shouldFetchState, asyncParams, shouldShowSkeleton, showBookingSkeleton, viewTracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalReturnServiceCellV2DTO)) {
            return false;
        }
        AdditionalReturnServiceCellV2DTO additionalReturnServiceCellV2DTO = (AdditionalReturnServiceCellV2DTO) other;
        return Intrinsics.d(this.cells, additionalReturnServiceCellV2DTO.cells) && Intrinsics.d(this.badge, additionalReturnServiceCellV2DTO.badge) && Intrinsics.d(this.backgroundColor, additionalReturnServiceCellV2DTO.backgroundColor) && Intrinsics.d(this.borderColor, additionalReturnServiceCellV2DTO.borderColor) && this.shouldFetchState == additionalReturnServiceCellV2DTO.shouldFetchState && Intrinsics.d(this.asyncParams, additionalReturnServiceCellV2DTO.asyncParams) && this.shouldShowSkeleton == additionalReturnServiceCellV2DTO.shouldShowSkeleton && this.showBookingSkeleton == additionalReturnServiceCellV2DTO.showBookingSkeleton && Intrinsics.d(this.viewTracking, additionalReturnServiceCellV2DTO.viewTracking);
    }

    public final Map<String, String> getAsyncParams() {
        return this.asyncParams;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    public final boolean getShouldFetchState() {
        return this.shouldFetchState;
    }

    public final boolean getShouldShowSkeleton() {
        return this.shouldShowSkeleton;
    }

    public final boolean getShowBookingSkeleton() {
        return this.showBookingSkeleton;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTracking() {
        return this.viewTracking;
    }

    public int hashCode() {
        int hashCode = this.cells.hashCode() * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.borderColor;
        int a11 = C3532b.a((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.shouldFetchState);
        Map<String, String> map = this.asyncParams;
        int a12 = C3532b.a(C3532b.a((a11 + (map == null ? 0 : map.hashCode())) * 31, 31, this.shouldShowSkeleton), 31, this.showBookingSkeleton);
        Map<String, TokenizedTrackingInfo> map2 = this.viewTracking;
        return a12 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<CellDTO> list = this.cells;
        BadgeDTO badgeDTO = this.badge;
        String str = this.backgroundColor;
        String str2 = this.borderColor;
        boolean z11 = this.shouldFetchState;
        Map<String, String> map = this.asyncParams;
        boolean z12 = this.shouldShowSkeleton;
        boolean z13 = this.showBookingSkeleton;
        Map<String, TokenizedTrackingInfo> map2 = this.viewTracking;
        StringBuilder sb2 = new StringBuilder("AdditionalReturnServiceCellV2DTO(cells=");
        sb2.append(list);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", backgroundColor=");
        a.h(sb2, str, ", borderColor=", str2, ", shouldFetchState=");
        sb2.append(z11);
        sb2.append(", asyncParams=");
        sb2.append(map);
        sb2.append(", shouldShowSkeleton=");
        f.c(", showBookingSkeleton=", ", viewTracking=", sb2, z12, z13);
        return P.f(sb2, map2, ")");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AdditionalReturnServiceCellV2DTO(java.util.List r2, ru.ozon.uni.atoms.data.dsBadge.BadgeDTO r3, java.lang.String r4, java.lang.String r5, boolean r6, java.util.Map r7, boolean r8, boolean r9, java.util.Map r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L6
            kotlin.collections.K r2 = kotlin.collections.K.f71697a
        L6:
            r12 = r11 & 16
            r0 = 0
            if (r12 == 0) goto Lc
            r6 = r0
        Lc:
            r12 = r11 & 64
            if (r12 == 0) goto L11
            r8 = r0
        L11:
            r11 = r11 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L20
            r11 = r0
            r9 = r7
            r12 = r10
            r7 = r5
            r10 = r8
            r5 = r3
            r8 = r6
            r3 = r1
            r6 = r4
        L1e:
            r4 = r2
            goto L2a
        L20:
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            goto L1e
        L2a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.data.AdditionalReturnServiceCellV2DTO.<init>(java.util.List, ru.ozon.uni.atoms.data.dsBadge.BadgeDTO, java.lang.String, java.lang.String, boolean, java.util.Map, boolean, boolean, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
