package ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListDTO;
import ru.ozon.app.android.storefront.stories.story.data.StorySoundControlDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b$\u0010%Jx\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0017R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010!R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b>\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\b@\u0010%¨\u0006A"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemDTO;", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemAssetDTO;", "asset", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ContentDTO;", "content", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "button", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "productsList", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3TabBarDTO;", "tabBar", "Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "soundControl", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemAssetDTO;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ContentDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3TabBarDTO;Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;)V", "component1", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component2", "()Ljava/util/Map;", "component3", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemAssetDTO;", "component4", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ContentDTO;", "component5", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "component6", "()Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "component7", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3TabBarDTO;", "component8", "()Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "copy", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemAssetDTO;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ContentDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3TabBarDTO;Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;)Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemDTO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "Ljava/util/Map;", "getTrackingInfo", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemAssetDTO;", "getAsset", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ContentDTO;", "getContent", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getButton", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "getProductsList", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3TabBarDTO;", "getTabBar", "Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "getSoundControl", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryV3ItemDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final StoryV3ItemAssetDTO asset;
    private final ButtonDTO button;
    private final StoryV3ContentDTO content;
    private final SocialProductListDTO productsList;
    private final StorySoundControlDTO soundControl;

    @NotNull
    private final StoryV3TabBarDTO tabBar;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public StoryV3ItemDTO(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, @NotNull StoryV3ItemAssetDTO asset, StoryV3ContentDTO storyV3ContentDTO, ButtonDTO buttonDTO, SocialProductListDTO socialProductListDTO, @NotNull StoryV3TabBarDTO tabBar, StorySoundControlDTO storySoundControlDTO) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(tabBar, "tabBar");
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.asset = asset;
        this.content = storyV3ContentDTO;
        this.button = buttonDTO;
        this.productsList = socialProductListDTO;
        this.tabBar = tabBar;
        this.soundControl = storySoundControlDTO;
    }

    public static /* synthetic */ StoryV3ItemDTO copy$default(StoryV3ItemDTO storyV3ItemDTO, AtomActionDTO atomActionDTO, Map map, StoryV3ItemAssetDTO storyV3ItemAssetDTO, StoryV3ContentDTO storyV3ContentDTO, ButtonDTO buttonDTO, SocialProductListDTO socialProductListDTO, StoryV3TabBarDTO storyV3TabBarDTO, StorySoundControlDTO storySoundControlDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = storyV3ItemDTO.action;
        }
        if ((i11 & 2) != 0) {
            map = storyV3ItemDTO.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            storyV3ItemAssetDTO = storyV3ItemDTO.asset;
        }
        if ((i11 & 8) != 0) {
            storyV3ContentDTO = storyV3ItemDTO.content;
        }
        if ((i11 & 16) != 0) {
            buttonDTO = storyV3ItemDTO.button;
        }
        if ((i11 & 32) != 0) {
            socialProductListDTO = storyV3ItemDTO.productsList;
        }
        if ((i11 & 64) != 0) {
            storyV3TabBarDTO = storyV3ItemDTO.tabBar;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            storySoundControlDTO = storyV3ItemDTO.soundControl;
        }
        StoryV3TabBarDTO storyV3TabBarDTO2 = storyV3TabBarDTO;
        StorySoundControlDTO storySoundControlDTO2 = storySoundControlDTO;
        ButtonDTO buttonDTO2 = buttonDTO;
        SocialProductListDTO socialProductListDTO2 = socialProductListDTO;
        return storyV3ItemDTO.copy(atomActionDTO, map, storyV3ItemAssetDTO, storyV3ContentDTO, buttonDTO2, socialProductListDTO2, storyV3TabBarDTO2, storySoundControlDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final StoryV3ItemAssetDTO getAsset() {
        return this.asset;
    }

    /* renamed from: component4, reason: from getter */
    public final StoryV3ContentDTO getContent() {
        return this.content;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonDTO getButton() {
        return this.button;
    }

    /* renamed from: component6, reason: from getter */
    public final SocialProductListDTO getProductsList() {
        return this.productsList;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final StoryV3TabBarDTO getTabBar() {
        return this.tabBar;
    }

    /* renamed from: component8, reason: from getter */
    public final StorySoundControlDTO getSoundControl() {
        return this.soundControl;
    }

    @NotNull
    public final StoryV3ItemDTO copy(AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull StoryV3ItemAssetDTO asset, StoryV3ContentDTO content, ButtonDTO button, SocialProductListDTO productsList, @NotNull StoryV3TabBarDTO tabBar, StorySoundControlDTO soundControl) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(tabBar, "tabBar");
        return new StoryV3ItemDTO(action, trackingInfo, asset, content, button, productsList, tabBar, soundControl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryV3ItemDTO)) {
            return false;
        }
        StoryV3ItemDTO storyV3ItemDTO = (StoryV3ItemDTO) other;
        return Intrinsics.d(this.action, storyV3ItemDTO.action) && Intrinsics.d(this.trackingInfo, storyV3ItemDTO.trackingInfo) && Intrinsics.d(this.asset, storyV3ItemDTO.asset) && Intrinsics.d(this.content, storyV3ItemDTO.content) && Intrinsics.d(this.button, storyV3ItemDTO.button) && Intrinsics.d(this.productsList, storyV3ItemDTO.productsList) && Intrinsics.d(this.tabBar, storyV3ItemDTO.tabBar) && Intrinsics.d(this.soundControl, storyV3ItemDTO.soundControl);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final StoryV3ItemAssetDTO getAsset() {
        return this.asset;
    }

    public final ButtonDTO getButton() {
        return this.button;
    }

    public final StoryV3ContentDTO getContent() {
        return this.content;
    }

    public final SocialProductListDTO getProductsList() {
        return this.productsList;
    }

    public final StorySoundControlDTO getSoundControl() {
        return this.soundControl;
    }

    @NotNull
    public final StoryV3TabBarDTO getTabBar() {
        return this.tabBar;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (this.asset.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        StoryV3ContentDTO storyV3ContentDTO = this.content;
        int hashCode3 = (hashCode2 + (storyV3ContentDTO == null ? 0 : storyV3ContentDTO.hashCode())) * 31;
        ButtonDTO buttonDTO = this.button;
        int hashCode4 = (hashCode3 + (buttonDTO == null ? 0 : buttonDTO.hashCode())) * 31;
        SocialProductListDTO socialProductListDTO = this.productsList;
        int hashCode5 = (this.tabBar.hashCode() + ((hashCode4 + (socialProductListDTO == null ? 0 : socialProductListDTO.hashCode())) * 31)) * 31;
        StorySoundControlDTO storySoundControlDTO = this.soundControl;
        return hashCode5 + (storySoundControlDTO != null ? storySoundControlDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StoryV3ItemDTO(action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", asset=" + this.asset + ", content=" + this.content + ", button=" + this.button + ", productsList=" + this.productsList + ", tabBar=" + this.tabBar + ", soundControl=" + this.soundControl + ")";
    }
}
