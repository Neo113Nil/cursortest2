package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentricHeader;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentricHeader/MediaCentricHeaderDO;", "", "", "uuid", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "mediaCentricHeader", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "getMediaCentricHeader", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MediaCentricHeaderDO {
    public static final int $stable = SingleReviewDTO.MediaCentricHeaderDTO.$stable;
    private final SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeader;

    @NotNull
    private final String uuid;

    public MediaCentricHeaderDO(@NotNull String uuid, SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeaderDTO) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uuid = uuid;
        this.mediaCentricHeader = mediaCentricHeaderDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaCentricHeaderDO)) {
            return false;
        }
        MediaCentricHeaderDO mediaCentricHeaderDO = (MediaCentricHeaderDO) other;
        return Intrinsics.d(this.uuid, mediaCentricHeaderDO.uuid) && Intrinsics.d(this.mediaCentricHeader, mediaCentricHeaderDO.mediaCentricHeader);
    }

    public final SingleReviewDTO.MediaCentricHeaderDTO getMediaCentricHeader() {
        return this.mediaCentricHeader;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode = this.uuid.hashCode() * 31;
        SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeaderDTO = this.mediaCentricHeader;
        return hashCode + (mediaCentricHeaderDTO == null ? 0 : mediaCentricHeaderDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "MediaCentricHeaderDO(uuid=" + this.uuid + ", mediaCentricHeader=" + this.mediaCentricHeader + ")";
    }
}
