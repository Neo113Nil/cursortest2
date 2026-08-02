package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric;

import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/MediaCentricDO;", "", "", "uuid", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;", "mediaCentric", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;", "getMediaCentric", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MediaCentricDO {
    private final SingleReviewDTO.MediaCentricDTO mediaCentric;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final String uuid;

    public MediaCentricDO(@NotNull String uuid, SingleReviewDTO.MediaCentricDTO mediaCentricDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uuid = uuid;
        this.mediaCentric = mediaCentricDTO;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaCentricDO)) {
            return false;
        }
        MediaCentricDO mediaCentricDO = (MediaCentricDO) other;
        return Intrinsics.d(this.uuid, mediaCentricDO.uuid) && Intrinsics.d(this.mediaCentric, mediaCentricDO.mediaCentric) && Intrinsics.d(this.trackingInfo, mediaCentricDO.trackingInfo);
    }

    public final SingleReviewDTO.MediaCentricDTO getMediaCentric() {
        return this.mediaCentric;
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
        SingleReviewDTO.MediaCentricDTO mediaCentricDTO = this.mediaCentric;
        int hashCode2 = (hashCode + (mediaCentricDTO == null ? 0 : mediaCentricDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        SingleReviewDTO.MediaCentricDTO mediaCentricDTO = this.mediaCentric;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("MediaCentricDO(uuid=");
        sb2.append(str);
        sb2.append(", mediaCentric=");
        sb2.append(mediaCentricDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
