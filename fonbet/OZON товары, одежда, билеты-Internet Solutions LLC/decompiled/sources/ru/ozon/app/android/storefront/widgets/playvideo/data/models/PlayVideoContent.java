package ru.ozon.app.android.storefront.widgets.playvideo.data.models;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoContent;", "", "closeButton", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;", "rightPanel", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoTitle;", "productList", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelDTO;Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoTitle;Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;)V", "getCloseButton", "()Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;", "getRightPanel", "()Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelDTO;", "getTitle", "()Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoTitle;", "getProductList", "()Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlayVideoContent {
    public static final int $stable = 8;

    @NotNull
    private final SocialIconButtonDTO closeButton;
    private final SocialProductListDTO productList;
    private final RightPanelDTO rightPanel;
    private final PlayVideoTitle title;

    public PlayVideoContent(@NotNull SocialIconButtonDTO closeButton, RightPanelDTO rightPanelDTO, PlayVideoTitle playVideoTitle, SocialProductListDTO socialProductListDTO) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.closeButton = closeButton;
        this.rightPanel = rightPanelDTO;
        this.title = playVideoTitle;
        this.productList = socialProductListDTO;
    }

    public static /* synthetic */ PlayVideoContent copy$default(PlayVideoContent playVideoContent, SocialIconButtonDTO socialIconButtonDTO, RightPanelDTO rightPanelDTO, PlayVideoTitle playVideoTitle, SocialProductListDTO socialProductListDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            socialIconButtonDTO = playVideoContent.closeButton;
        }
        if ((i11 & 2) != 0) {
            rightPanelDTO = playVideoContent.rightPanel;
        }
        if ((i11 & 4) != 0) {
            playVideoTitle = playVideoContent.title;
        }
        if ((i11 & 8) != 0) {
            socialProductListDTO = playVideoContent.productList;
        }
        return playVideoContent.copy(socialIconButtonDTO, rightPanelDTO, playVideoTitle, socialProductListDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SocialIconButtonDTO getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component2, reason: from getter */
    public final RightPanelDTO getRightPanel() {
        return this.rightPanel;
    }

    /* renamed from: component3, reason: from getter */
    public final PlayVideoTitle getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final SocialProductListDTO getProductList() {
        return this.productList;
    }

    @NotNull
    public final PlayVideoContent copy(@NotNull SocialIconButtonDTO closeButton, RightPanelDTO rightPanel, PlayVideoTitle title, SocialProductListDTO productList) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        return new PlayVideoContent(closeButton, rightPanel, title, productList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayVideoContent)) {
            return false;
        }
        PlayVideoContent playVideoContent = (PlayVideoContent) other;
        return Intrinsics.d(this.closeButton, playVideoContent.closeButton) && Intrinsics.d(this.rightPanel, playVideoContent.rightPanel) && Intrinsics.d(this.title, playVideoContent.title) && Intrinsics.d(this.productList, playVideoContent.productList);
    }

    @NotNull
    public final SocialIconButtonDTO getCloseButton() {
        return this.closeButton;
    }

    public final SocialProductListDTO getProductList() {
        return this.productList;
    }

    public final RightPanelDTO getRightPanel() {
        return this.rightPanel;
    }

    public final PlayVideoTitle getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.closeButton.hashCode() * 31;
        RightPanelDTO rightPanelDTO = this.rightPanel;
        int hashCode2 = (hashCode + (rightPanelDTO == null ? 0 : rightPanelDTO.hashCode())) * 31;
        PlayVideoTitle playVideoTitle = this.title;
        int hashCode3 = (hashCode2 + (playVideoTitle == null ? 0 : playVideoTitle.hashCode())) * 31;
        SocialProductListDTO socialProductListDTO = this.productList;
        return hashCode3 + (socialProductListDTO != null ? socialProductListDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PlayVideoContent(closeButton=" + this.closeButton + ", rightPanel=" + this.rightPanel + ", title=" + this.title + ", productList=" + this.productList + ")";
    }
}
