package ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto;

import Pk0.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3WithVideoDTO;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemAssetDTO;", "link", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "hasAudio", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;Z)V", "getLink", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getHasAudio", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryV3WithVideoDTO extends StoryV3ItemAssetDTO {
    public static final int $stable = 8;
    private final boolean hasAudio;

    @NotNull
    private final String link;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryV3WithVideoDTO(@NotNull String link, Map<String, TokenizedTrackingInfo> map, boolean z11) {
        super(null);
        Intrinsics.checkNotNullParameter(link, "link");
        this.link = link;
        this.trackingInfo = map;
        this.hasAudio = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryV3WithVideoDTO copy$default(StoryV3WithVideoDTO storyV3WithVideoDTO, String str, Map map, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = storyV3WithVideoDTO.link;
        }
        if ((i11 & 2) != 0) {
            map = storyV3WithVideoDTO.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            z11 = storyV3WithVideoDTO.hasAudio;
        }
        return storyV3WithVideoDTO.copy(str, map, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasAudio() {
        return this.hasAudio;
    }

    @NotNull
    public final StoryV3WithVideoDTO copy(@NotNull String link, Map<String, TokenizedTrackingInfo> trackingInfo, boolean hasAudio) {
        Intrinsics.checkNotNullParameter(link, "link");
        return new StoryV3WithVideoDTO(link, trackingInfo, hasAudio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryV3WithVideoDTO)) {
            return false;
        }
        StoryV3WithVideoDTO storyV3WithVideoDTO = (StoryV3WithVideoDTO) other;
        return Intrinsics.d(this.link, storyV3WithVideoDTO.link) && Intrinsics.d(this.trackingInfo, storyV3WithVideoDTO.trackingInfo) && this.hasAudio == storyV3WithVideoDTO.hasAudio;
    }

    public final boolean getHasAudio() {
        return this.hasAudio;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.link.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return Boolean.hashCode(this.hasAudio) + ((hashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.link;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        boolean z11 = this.hasAudio;
        StringBuilder sb2 = new StringBuilder("StoryV3WithVideoDTO(link=");
        sb2.append(str);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", hasAudio=");
        return a.a(")", sb2, z11);
    }
}
