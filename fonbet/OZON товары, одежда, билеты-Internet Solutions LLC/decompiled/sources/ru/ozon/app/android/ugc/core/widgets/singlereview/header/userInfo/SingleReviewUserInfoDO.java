package ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo;

import B4.V;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoDO;", "", "", "uuid", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "tileReviewTracking", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;", "getHeader", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getTileReviewTracking", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewUserInfoDO {
    private final SingleReviewDTO.HeaderDTO header;
    private final Map<String, TokenizedTrackingInfo> tileReviewTracking;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final String uuid;

    public SingleReviewUserInfoDO(@NotNull String uuid, SingleReviewDTO.HeaderDTO headerDTO, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uuid = uuid;
        this.header = headerDTO;
        this.trackingInfo = map;
        this.tileReviewTracking = map2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewUserInfoDO)) {
            return false;
        }
        SingleReviewUserInfoDO singleReviewUserInfoDO = (SingleReviewUserInfoDO) other;
        return Intrinsics.d(this.uuid, singleReviewUserInfoDO.uuid) && Intrinsics.d(this.header, singleReviewUserInfoDO.header) && Intrinsics.d(this.trackingInfo, singleReviewUserInfoDO.trackingInfo) && Intrinsics.d(this.tileReviewTracking, singleReviewUserInfoDO.tileReviewTracking);
    }

    public final SingleReviewDTO.HeaderDTO getHeader() {
        return this.header;
    }

    public final Map<String, TokenizedTrackingInfo> getTileReviewTracking() {
        return this.tileReviewTracking;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode = this.uuid.hashCode() * 31;
        SingleReviewDTO.HeaderDTO headerDTO = this.header;
        int hashCode2 = (hashCode + (headerDTO == null ? 0 : headerDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.tileReviewTracking;
        return hashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        SingleReviewDTO.HeaderDTO headerDTO = this.header;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.tileReviewTracking;
        StringBuilder sb2 = new StringBuilder("SingleReviewUserInfoDO(uuid=");
        sb2.append(str);
        sb2.append(", header=");
        sb2.append(headerDTO);
        sb2.append(", trackingInfo=");
        return V.c(sb2, map, ", tileReviewTracking=", map2, ")");
    }
}
