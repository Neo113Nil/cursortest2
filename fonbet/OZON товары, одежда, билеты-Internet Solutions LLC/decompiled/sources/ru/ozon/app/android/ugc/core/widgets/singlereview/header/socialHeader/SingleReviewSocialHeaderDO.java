package ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader;

import Kk.C3532b;
import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0007\u0010\u001cR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderDO;", "", "", "uuid", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;", "socialHeader", "", "isPaddingBottomEnabled", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "tileReviewTracking", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;ZLjava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;", "getSocialHeader", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;", "Z", "()Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getTileReviewTracking", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewSocialHeaderDO {
    private final boolean isPaddingBottomEnabled;
    private final SingleReviewDTO.HeaderDTO.SocialHeader socialHeader;
    private final Map<String, TokenizedTrackingInfo> tileReviewTracking;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final String uuid;

    public SingleReviewSocialHeaderDO(@NotNull String uuid, SingleReviewDTO.HeaderDTO.SocialHeader socialHeader, boolean z11, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uuid = uuid;
        this.socialHeader = socialHeader;
        this.isPaddingBottomEnabled = z11;
        this.trackingInfo = map;
        this.tileReviewTracking = map2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewSocialHeaderDO)) {
            return false;
        }
        SingleReviewSocialHeaderDO singleReviewSocialHeaderDO = (SingleReviewSocialHeaderDO) other;
        return Intrinsics.d(this.uuid, singleReviewSocialHeaderDO.uuid) && Intrinsics.d(this.socialHeader, singleReviewSocialHeaderDO.socialHeader) && this.isPaddingBottomEnabled == singleReviewSocialHeaderDO.isPaddingBottomEnabled && Intrinsics.d(this.trackingInfo, singleReviewSocialHeaderDO.trackingInfo) && Intrinsics.d(this.tileReviewTracking, singleReviewSocialHeaderDO.tileReviewTracking);
    }

    public final SingleReviewDTO.HeaderDTO.SocialHeader getSocialHeader() {
        return this.socialHeader;
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
        SingleReviewDTO.HeaderDTO.SocialHeader socialHeader = this.socialHeader;
        int a11 = C3532b.a((hashCode + (socialHeader == null ? 0 : socialHeader.hashCode())) * 31, 31, this.isPaddingBottomEnabled);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.tileReviewTracking;
        return hashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    /* renamed from: isPaddingBottomEnabled, reason: from getter */
    public final boolean getIsPaddingBottomEnabled() {
        return this.isPaddingBottomEnabled;
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        SingleReviewDTO.HeaderDTO.SocialHeader socialHeader = this.socialHeader;
        boolean z11 = this.isPaddingBottomEnabled;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.tileReviewTracking;
        StringBuilder sb2 = new StringBuilder("SingleReviewSocialHeaderDO(uuid=");
        sb2.append(str);
        sb2.append(", socialHeader=");
        sb2.append(socialHeader);
        sb2.append(", isPaddingBottomEnabled=");
        sb2.append(z11);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", tileReviewTracking=");
        return P.f(sb2, map2, ")");
    }
}
