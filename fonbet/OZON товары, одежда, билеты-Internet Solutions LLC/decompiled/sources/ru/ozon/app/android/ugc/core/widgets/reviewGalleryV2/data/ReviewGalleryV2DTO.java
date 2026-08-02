package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data;

import B0.A0;
import B0.C2454a;
import B3.p;
import D3.g;
import H3.c;
import Ns.b;
import T7.E;
import T7.P;
import Xc.a;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import ed.InterfaceC6346b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile.ReviewProductTileDTO;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u001f !\"B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J6\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO;", "", "items", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item;", "selectedIndex", "", "onBackConfig", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$OnBackConfigDTO;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$OnBackConfigDTO;)V", "getItems$annotations", "()V", "getItems", "()Ljava/util/List;", "getSelectedIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOnBackConfig", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$OnBackConfigDTO;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$OnBackConfigDTO;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO;", "equals", "", "other", "hashCode", "toString", "", "OnBackConfigDTO", "ReviewGalleryV2Item", "SideButtonsDTO", "OnBoardingDTO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReviewGalleryV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ReviewGalleryV2Item> items;
    private final OnBackConfigDTO onBackConfig;
    private final Integer selectedIndex;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$OnBackConfigDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "onBackConfigKey", "", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getOnBackConfigKey", "()Ljava/lang/String;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBackConfigDTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final String onBackConfigKey;
        private final Map<String, TokenizedTrackingInfo> tracking;

        public OnBackConfigDTO(@NotNull AtomActionDTO action, String str, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.onBackConfigKey = str;
            this.tracking = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnBackConfigDTO copy$default(OnBackConfigDTO onBackConfigDTO, AtomActionDTO atomActionDTO, String str, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = onBackConfigDTO.action;
            }
            if ((i11 & 2) != 0) {
                str = onBackConfigDTO.onBackConfigKey;
            }
            if ((i11 & 4) != 0) {
                map = onBackConfigDTO.tracking;
            }
            return onBackConfigDTO.copy(atomActionDTO, str, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOnBackConfigKey() {
            return this.onBackConfigKey;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.tracking;
        }

        @NotNull
        public final OnBackConfigDTO copy(@NotNull AtomActionDTO action, String onBackConfigKey, Map<String, TokenizedTrackingInfo> tracking) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new OnBackConfigDTO(action, onBackConfigKey, tracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnBackConfigDTO)) {
                return false;
            }
            OnBackConfigDTO onBackConfigDTO = (OnBackConfigDTO) other;
            return Intrinsics.d(this.action, onBackConfigDTO.action) && Intrinsics.d(this.onBackConfigKey, onBackConfigDTO.onBackConfigKey) && Intrinsics.d(this.tracking, onBackConfigDTO.tracking);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getOnBackConfigKey() {
            return this.onBackConfigKey;
        }

        public final Map<String, TokenizedTrackingInfo> getTracking() {
            return this.tracking;
        }

        public int hashCode() {
            int hashCode = this.action.hashCode() * 31;
            String str = this.onBackConfigKey;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            AtomActionDTO atomActionDTO = this.action;
            String str = this.onBackConfigKey;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            StringBuilder sb2 = new StringBuilder("OnBackConfigDTO(action=");
            sb2.append(atomActionDTO);
            sb2.append(", onBackConfigKey=");
            sb2.append(str);
            sb2.append(", tracking=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$OnBoardingDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class OnBoardingDTO {
        public static final int $stable = 8;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public OnBoardingDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.title = title;
            this.subtitle = subtitle;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnBoardingDTO copy$default(OnBoardingDTO onBoardingDTO, TextDTO textDTO, TextDTO textDTO2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = onBoardingDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = onBoardingDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                map = onBoardingDTO.trackingInfo;
            }
            return onBoardingDTO.copy(textDTO, textDTO2, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final OnBoardingDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new OnBoardingDTO(title, subtitle, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnBoardingDTO)) {
                return false;
            }
            OnBoardingDTO onBoardingDTO = (OnBoardingDTO) other;
            return Intrinsics.d(this.title, onBoardingDTO.title) && Intrinsics.d(this.subtitle, onBoardingDTO.subtitle) && Intrinsics.d(this.trackingInfo, onBoardingDTO.trackingInfo);
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.subtitle, this.title.hashCode() * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            return P.f(g.g("OnBoardingDTO(title=", textDTO, ", subtitle=", textDTO2, ", trackingInfo="), this.trackingInfo, ")");
        }
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0010]^_`abcdefghijklBÑ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003J\u0017\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003J\u0017\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010Q\u001a\u00020\u0010HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010V\u001a\u00020 HÆ\u0003Jó\u0001\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020 HÆ\u0001J\u0013\u0010X\u001a\u00020B2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020[HÖ\u0001J\t\u0010\\\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0018\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010A\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bA\u0010CR\u0011\u0010D\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bD\u0010CR\u0011\u0010E\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bE\u0010C¨\u0006m"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item;", "", "content", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ContentWrapper;", "user", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewUser;", ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;", "rating", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;", "rightPanel", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;", "closeButton", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "prevTrackingInfo", "nextTrackingInfo", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", ItemsContainerDTO.SOCIAL_USER_FIELD_NAME, "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;", "reviewUuid", "contentViewAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "topMediaItems", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;", "bottomMediaItems", "bottomItems", "videoControlsMode", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$VideoControlsMode;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ContentWrapper;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewUser;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$VideoControlsMode;)V", "getContent", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ContentWrapper;", "getUser", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewUser;", "getProduct", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;", "getRating", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;", "getRightPanel", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;", "getCloseButton", "()Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getPrevTrackingInfo", "getNextTrackingInfo", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSocialUser", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;", "getReviewUuid", "()Ljava/lang/String;", "getContentViewAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTopMediaItems", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;", "getBottomMediaItems", "getBottomItems", "getVideoControlsMode", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$VideoControlsMode;", "isFillMode", "", "()Z", "isCompactControls", "isVideo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "", "toString", "FitType", "VideoControlsMode", "ContentWrapper", "ReviewImage", "ReviewUser", "SocialUser", "ProductRatingDTO", "ReviewsRightPanelDTO", "CommentFooterDTO", "CommentButtonFooterDTO", "CommentButtonDTO", "SpacerDTO", "ProductItemsContainerDTO", "ProductItemContentDTO", "ProductItemToggleButton", "ItemsContainerDTO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ReviewGalleryV2Item {
        public static final int $stable = 8;
        private final BadgeDTO badge;
        private final ItemsContainerDTO bottomItems;
        private final ItemsContainerDTO bottomMediaItems;
        private final SocialIconButtonDTO closeButton;

        @NotNull
        private final ContentWrapper content;
        private final AtomActionDTO contentViewAction;
        private final Map<String, TokenizedTrackingInfo> nextTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> prevTrackingInfo;
        private final ReviewProductTileDTO product;
        private final ProductRatingDTO rating;

        @NotNull
        private final String reviewUuid;
        private final ReviewsRightPanelDTO rightPanel;
        private final SocialUser socialUser;
        private final ItemsContainerDTO topMediaItems;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final ReviewUser user;

        @NotNull
        private final VideoControlsMode videoControlsMode;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "leftPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CommentButtonDTO {
            public static final int $stable = 0;

            @NotNull
            private final ButtonV3DTO button;
            private final Paddings leftPadding;
            private final Paddings rightPadding;

            public CommentButtonDTO(@NotNull ButtonV3DTO button, Paddings paddings, Paddings paddings2) {
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
                this.leftPadding = paddings;
                this.rightPadding = paddings2;
            }

            public static /* synthetic */ CommentButtonDTO copy$default(CommentButtonDTO commentButtonDTO, ButtonV3DTO buttonV3DTO, Paddings paddings, Paddings paddings2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    buttonV3DTO = commentButtonDTO.button;
                }
                if ((i11 & 2) != 0) {
                    paddings = commentButtonDTO.leftPadding;
                }
                if ((i11 & 4) != 0) {
                    paddings2 = commentButtonDTO.rightPadding;
                }
                return commentButtonDTO.copy(buttonV3DTO, paddings, paddings2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            /* renamed from: component2, reason: from getter */
            public final Paddings getLeftPadding() {
                return this.leftPadding;
            }

            /* renamed from: component3, reason: from getter */
            public final Paddings getRightPadding() {
                return this.rightPadding;
            }

            @NotNull
            public final CommentButtonDTO copy(@NotNull ButtonV3DTO button, Paddings leftPadding, Paddings rightPadding) {
                Intrinsics.checkNotNullParameter(button, "button");
                return new CommentButtonDTO(button, leftPadding, rightPadding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CommentButtonDTO)) {
                    return false;
                }
                CommentButtonDTO commentButtonDTO = (CommentButtonDTO) other;
                return Intrinsics.d(this.button, commentButtonDTO.button) && this.leftPadding == commentButtonDTO.leftPadding && this.rightPadding == commentButtonDTO.rightPadding;
            }

            @NotNull
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            public final Paddings getLeftPadding() {
                return this.leftPadding;
            }

            public final Paddings getRightPadding() {
                return this.rightPadding;
            }

            public int hashCode() {
                int hashCode = this.button.hashCode() * 31;
                Paddings paddings = this.leftPadding;
                int hashCode2 = (hashCode + (paddings == null ? 0 : paddings.hashCode())) * 31;
                Paddings paddings2 = this.rightPadding;
                return hashCode2 + (paddings2 != null ? paddings2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                ButtonV3DTO buttonV3DTO = this.button;
                Paddings paddings = this.leftPadding;
                Paddings paddings2 = this.rightPadding;
                StringBuilder sb2 = new StringBuilder("CommentButtonDTO(button=");
                sb2.append(buttonV3DTO);
                sb2.append(", leftPadding=");
                sb2.append(paddings);
                sb2.append(", rightPadding=");
                return D40.b.b(sb2, paddings2, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentButtonFooterDTO;", "", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;", "button", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentButtonDTO;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentButtonDTO;)V", "getFooter", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;", "getButton", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentButtonDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CommentButtonFooterDTO {
            public static final int $stable = 8;

            @NotNull
            private final CommentButtonDTO button;

            @NotNull
            private final CommentFooterDTO footer;

            public CommentButtonFooterDTO(@NotNull CommentFooterDTO footer, @NotNull CommentButtonDTO button) {
                Intrinsics.checkNotNullParameter(footer, "footer");
                Intrinsics.checkNotNullParameter(button, "button");
                this.footer = footer;
                this.button = button;
            }

            public static /* synthetic */ CommentButtonFooterDTO copy$default(CommentButtonFooterDTO commentButtonFooterDTO, CommentFooterDTO commentFooterDTO, CommentButtonDTO commentButtonDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    commentFooterDTO = commentButtonFooterDTO.footer;
                }
                if ((i11 & 2) != 0) {
                    commentButtonDTO = commentButtonFooterDTO.button;
                }
                return commentButtonFooterDTO.copy(commentFooterDTO, commentButtonDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final CommentFooterDTO getFooter() {
                return this.footer;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final CommentButtonDTO getButton() {
                return this.button;
            }

            @NotNull
            public final CommentButtonFooterDTO copy(@NotNull CommentFooterDTO footer, @NotNull CommentButtonDTO button) {
                Intrinsics.checkNotNullParameter(footer, "footer");
                Intrinsics.checkNotNullParameter(button, "button");
                return new CommentButtonFooterDTO(footer, button);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CommentButtonFooterDTO)) {
                    return false;
                }
                CommentButtonFooterDTO commentButtonFooterDTO = (CommentButtonFooterDTO) other;
                return Intrinsics.d(this.footer, commentButtonFooterDTO.footer) && Intrinsics.d(this.button, commentButtonFooterDTO.button);
            }

            @NotNull
            public final CommentButtonDTO getButton() {
                return this.button;
            }

            @NotNull
            public final CommentFooterDTO getFooter() {
                return this.footer;
            }

            public int hashCode() {
                return this.button.hashCode() + (this.footer.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "CommentButtonFooterDTO(footer=" + this.footer + ", button=" + this.button + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CommentFooterDTO {
            public static final int $stable = 8;
            private final String backgroundColor;
            private final AtomActionDTO clickAction;
            private final CornerRadius cornerRadius;
            private final IconDTO icon;

            @NotNull
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public CommentFooterDTO(@NotNull TextDTO title, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, IconDTO iconDTO, CornerRadius cornerRadius) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.backgroundColor = str;
                this.clickAction = atomActionDTO;
                this.trackingInfo = map;
                this.icon = iconDTO;
                this.cornerRadius = cornerRadius;
            }

            public static /* synthetic */ CommentFooterDTO copy$default(CommentFooterDTO commentFooterDTO, TextDTO textDTO, String str, AtomActionDTO atomActionDTO, Map map, IconDTO iconDTO, CornerRadius cornerRadius, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = commentFooterDTO.title;
                }
                if ((i11 & 2) != 0) {
                    str = commentFooterDTO.backgroundColor;
                }
                if ((i11 & 4) != 0) {
                    atomActionDTO = commentFooterDTO.clickAction;
                }
                if ((i11 & 8) != 0) {
                    map = commentFooterDTO.trackingInfo;
                }
                if ((i11 & 16) != 0) {
                    iconDTO = commentFooterDTO.icon;
                }
                if ((i11 & 32) != 0) {
                    cornerRadius = commentFooterDTO.cornerRadius;
                }
                IconDTO iconDTO2 = iconDTO;
                CornerRadius cornerRadius2 = cornerRadius;
                return commentFooterDTO.copy(textDTO, str, atomActionDTO, map, iconDTO2, cornerRadius2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component3, reason: from getter */
            public final AtomActionDTO getClickAction() {
                return this.clickAction;
            }

            public final Map<String, TokenizedTrackingInfo> component4() {
                return this.trackingInfo;
            }

            /* renamed from: component5, reason: from getter */
            public final IconDTO getIcon() {
                return this.icon;
            }

            /* renamed from: component6, reason: from getter */
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            public final CommentFooterDTO copy(@NotNull TextDTO title, String backgroundColor, AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> trackingInfo, IconDTO icon, CornerRadius cornerRadius) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new CommentFooterDTO(title, backgroundColor, clickAction, trackingInfo, icon, cornerRadius);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CommentFooterDTO)) {
                    return false;
                }
                CommentFooterDTO commentFooterDTO = (CommentFooterDTO) other;
                return Intrinsics.d(this.title, commentFooterDTO.title) && Intrinsics.d(this.backgroundColor, commentFooterDTO.backgroundColor) && Intrinsics.d(this.clickAction, commentFooterDTO.clickAction) && Intrinsics.d(this.trackingInfo, commentFooterDTO.trackingInfo) && Intrinsics.d(this.icon, commentFooterDTO.icon) && this.cornerRadius == commentFooterDTO.cornerRadius;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final AtomActionDTO getClickAction() {
                return this.clickAction;
            }

            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            public final IconDTO getIcon() {
                return this.icon;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.backgroundColor;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.clickAction;
                int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
                IconDTO iconDTO = this.icon;
                int hashCode5 = (hashCode4 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                CornerRadius cornerRadius = this.cornerRadius;
                return hashCode5 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                String str = this.backgroundColor;
                AtomActionDTO atomActionDTO = this.clickAction;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                IconDTO iconDTO = this.icon;
                CornerRadius cornerRadius = this.cornerRadius;
                StringBuilder f7 = g.f("CommentFooterDTO(title=", textDTO, ", backgroundColor=", str, ", clickAction=");
                Sh.b.f(f7, atomActionDTO, ", trackingInfo=", map, ", icon=");
                f7.append(iconDTO);
                f7.append(", cornerRadius=");
                f7.append(cornerRadius);
                f7.append(")");
                return f7.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ContentWrapper;", "", "image", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewImage;", "video", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "fitType", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$FitType;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewImage;Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$FitType;)V", "getImage", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewImage;", "getVideo", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getFitType", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$FitType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ContentWrapper {
            public static final int $stable = 8;
            private final FitType fitType;
            private final ReviewImage image;
            private final VideoMolecule video;

            public ContentWrapper(ReviewImage reviewImage, VideoMolecule videoMolecule, FitType fitType) {
                this.image = reviewImage;
                this.video = videoMolecule;
                this.fitType = fitType;
            }

            public static /* synthetic */ ContentWrapper copy$default(ContentWrapper contentWrapper, ReviewImage reviewImage, VideoMolecule videoMolecule, FitType fitType, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    reviewImage = contentWrapper.image;
                }
                if ((i11 & 2) != 0) {
                    videoMolecule = contentWrapper.video;
                }
                if ((i11 & 4) != 0) {
                    fitType = contentWrapper.fitType;
                }
                return contentWrapper.copy(reviewImage, videoMolecule, fitType);
            }

            /* renamed from: component1, reason: from getter */
            public final ReviewImage getImage() {
                return this.image;
            }

            /* renamed from: component2, reason: from getter */
            public final VideoMolecule getVideo() {
                return this.video;
            }

            /* renamed from: component3, reason: from getter */
            public final FitType getFitType() {
                return this.fitType;
            }

            @NotNull
            public final ContentWrapper copy(ReviewImage image, VideoMolecule video, FitType fitType) {
                return new ContentWrapper(image, video, fitType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ContentWrapper)) {
                    return false;
                }
                ContentWrapper contentWrapper = (ContentWrapper) other;
                return Intrinsics.d(this.image, contentWrapper.image) && Intrinsics.d(this.video, contentWrapper.video) && this.fitType == contentWrapper.fitType;
            }

            public final FitType getFitType() {
                return this.fitType;
            }

            public final ReviewImage getImage() {
                return this.image;
            }

            public final VideoMolecule getVideo() {
                return this.video;
            }

            public int hashCode() {
                ReviewImage reviewImage = this.image;
                int hashCode = (reviewImage == null ? 0 : reviewImage.hashCode()) * 31;
                VideoMolecule videoMolecule = this.video;
                int hashCode2 = (hashCode + (videoMolecule == null ? 0 : videoMolecule.hashCode())) * 31;
                FitType fitType = this.fitType;
                return hashCode2 + (fitType != null ? fitType.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "ContentWrapper(image=" + this.image + ", video=" + this.video + ", fitType=" + this.fitType + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$FitType;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "FILL", "FIT", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class FitType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ FitType[] $VALUES;
            public static final FitType INVALID = new FitType("INVALID", 0);
            public static final FitType FILL = new FitType("FILL", 1);
            public static final FitType FIT = new FitType("FIT", 2);

            private static final /* synthetic */ FitType[] $values() {
                return new FitType[]{INVALID, FILL, FIT};
            }

            static {
                FitType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private FitType(String str, int i11) {
            }

            public static FitType valueOf(String str) {
                return (FitType) Enum.valueOf(FitType.class, str);
            }

            public static FitType[] values() {
                return (FitType[]) $VALUES.clone();
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;", "", "items", "", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class ItemsContainerDTO {

            @NotNull
            public static final String BADGE_FIELD_NAME = "badge";

            @NotNull
            public static final String BADGE_NAME = "BADGE";

            @NotNull
            public static final String COMMENT_BUTTON_FOOTER_FIELD_NAME = "commentButtonFooter";

            @NotNull
            public static final String COMMENT_BUTTON_FOOTER_NAME = "COMMENT_BUTTON_FOOTER";

            @NotNull
            public static final String COMMENT_FOOTER_FIELD_NAME = "commentFooter";

            @NotNull
            public static final String COMMENT_FOOTER_NAME = "COMMENT_FOOTER";

            @NotNull
            public static final String PRODUCT_FIELD_NAME = "product";

            @NotNull
            public static final String PRODUCT_ITEMS_CONTAINER_FIELD_NAME = "productItemsContainer";

            @NotNull
            public static final String PRODUCT_ITEMS_CONTAINER_NAME = "PRODUCT_ITEMS_CONTAINER";

            @NotNull
            public static final String PRODUCT_NAME = "PRODUCT";

            @NotNull
            public static final String PRODUCT_RATING_FIELD_NAME = "productRating";

            @NotNull
            public static final String PRODUCT_RATING_NAME = "PRODUCT_RATING";

            @NotNull
            public static final String SIDE_BUTTONS = "SIDE_BUTTONS";

            @NotNull
            public static final String SIDE_BUTTONS_FIELD_NAME = "sideButtons";

            @NotNull
            public static final String SOCIAL_USER_FIELD_NAME = "socialUser";

            @NotNull
            public static final String SOCIAL_USER_NAME = "SOCIAL_USER";

            @NotNull
            public static final String SPACER_FIELD_NAME = "spacer";

            @NotNull
            public static final String SPACER_NAME = "SPACER";

            @NotNull
            private final List<Object> items;
            public static final int $stable = 8;

            public ItemsContainerDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "socialUser", name = "SOCIAL_USER", type = SocialUser.class), @ProtoOneOfSignature(fieldName = "productRating", name = "PRODUCT_RATING", type = ProductRatingDTO.class), @ProtoOneOfSignature(fieldName = "product", name = "PRODUCT", type = ReviewProductTileDTO.class), @ProtoOneOfSignature(fieldName = "commentFooter", name = "COMMENT_FOOTER", type = CommentFooterDTO.class), @ProtoOneOfSignature(fieldName = "spacer", name = "SPACER", type = SpacerDTO.class), @ProtoOneOfSignature(fieldName = "badge", name = "BADGE", type = BadgeDTO.class), @ProtoOneOfSignature(fieldName = "productItemsContainer", name = "PRODUCT_ITEMS_CONTAINER", type = ProductItemsContainerDTO.class), @ProtoOneOfSignature(fieldName = "commentButtonFooter", name = "COMMENT_BUTTON_FOOTER", type = CommentButtonFooterDTO.class), @ProtoOneOfSignature(fieldName = "sideButtons", name = "SIDE_BUTTONS", type = SideButtonsDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items) {
                Intrinsics.checkNotNullParameter(items, "items");
                this.items = items;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ItemsContainerDTO copy$default(ItemsContainerDTO itemsContainerDTO, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = itemsContainerDTO.items;
                }
                return itemsContainerDTO.copy(list);
            }

            @NotNull
            public final List<Object> component1() {
                return this.items;
            }

            @NotNull
            public final ItemsContainerDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "socialUser", name = "SOCIAL_USER", type = SocialUser.class), @ProtoOneOfSignature(fieldName = "productRating", name = "PRODUCT_RATING", type = ProductRatingDTO.class), @ProtoOneOfSignature(fieldName = "product", name = "PRODUCT", type = ReviewProductTileDTO.class), @ProtoOneOfSignature(fieldName = "commentFooter", name = "COMMENT_FOOTER", type = CommentFooterDTO.class), @ProtoOneOfSignature(fieldName = "spacer", name = "SPACER", type = SpacerDTO.class), @ProtoOneOfSignature(fieldName = "badge", name = "BADGE", type = BadgeDTO.class), @ProtoOneOfSignature(fieldName = "productItemsContainer", name = "PRODUCT_ITEMS_CONTAINER", type = ProductItemsContainerDTO.class), @ProtoOneOfSignature(fieldName = "commentButtonFooter", name = "COMMENT_BUTTON_FOOTER", type = CommentButtonFooterDTO.class), @ProtoOneOfSignature(fieldName = "sideButtons", name = "SIDE_BUTTONS", type = SideButtonsDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items) {
                Intrinsics.checkNotNullParameter(items, "items");
                return new ItemsContainerDTO(items);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ItemsContainerDTO) && Intrinsics.d(this.items, ((ItemsContainerDTO) other).items);
            }

            @NotNull
            public final List<Object> getItems() {
                return this.items;
            }

            public int hashCode() {
                return this.items.hashCode();
            }

            @NotNull
            public String toString() {
                return c.a("ItemsContainerDTO(items=", ")", this.items);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO;", "", "<init>", "()V", "Companion", "ButtonItem", "ProductInfo", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO$ButtonItem;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO$ProductInfo;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class ProductItemContentDTO {
            public static final int $stable = 0;

            @NotNull
            public static final String BUTTON_ITEM = "BUTTON_ITEM";

            @NotNull
            public static final String BUTTON_ITEM_FIELD_NAME = "buttonItem";

            @NotNull
            public static final String FAVORITE_MOLECULE = "FAVORITE_MOLECULE";

            @NotNull
            public static final String FAVORITE_MOLECULE_FIELD_NAME = "favoriteMolecule";

            @NotNull
            public static final String PRODUCT_INFO = "PRODUCT_INFO";

            @NotNull
            public static final String PRODUCT_INFO_FIELD_NAME = "productInfo";

            @NotNull
            public static final String TOGGLE_BUTTON = "TOGGLE_BUTTON";

            @NotNull
            public static final String TOGGLE_BUTTON_FIELD_NAME = "toggleButton";

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO$ButtonItem;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ButtonItem extends ProductItemContentDTO {
                public static final int $stable = 8;
                private final AtomActionDTO action;
                private final String backgroundColor;
                private final IndicatorDTO indicator;

                @NotNull
                private final TextDTO text;
                private final Map<String, TokenizedTrackingInfo> tracking;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ButtonItem(@NotNull TextDTO text, String str, IndicatorDTO indicatorDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                    super(null);
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                    this.backgroundColor = str;
                    this.indicator = indicatorDTO;
                    this.action = atomActionDTO;
                    this.tracking = map;
                }

                public static /* synthetic */ ButtonItem copy$default(ButtonItem buttonItem, TextDTO textDTO, String str, IndicatorDTO indicatorDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = buttonItem.text;
                    }
                    if ((i11 & 2) != 0) {
                        str = buttonItem.backgroundColor;
                    }
                    if ((i11 & 4) != 0) {
                        indicatorDTO = buttonItem.indicator;
                    }
                    if ((i11 & 8) != 0) {
                        atomActionDTO = buttonItem.action;
                    }
                    if ((i11 & 16) != 0) {
                        map = buttonItem.tracking;
                    }
                    Map map2 = map;
                    IndicatorDTO indicatorDTO2 = indicatorDTO;
                    return buttonItem.copy(textDTO, str, indicatorDTO2, atomActionDTO, map2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getText() {
                    return this.text;
                }

                /* renamed from: component2, reason: from getter */
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                /* renamed from: component3, reason: from getter */
                public final IndicatorDTO getIndicator() {
                    return this.indicator;
                }

                /* renamed from: component4, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component5() {
                    return this.tracking;
                }

                @NotNull
                public final ButtonItem copy(@NotNull TextDTO text, String backgroundColor, IndicatorDTO indicator, AtomActionDTO action, Map<String, TokenizedTrackingInfo> tracking) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new ButtonItem(text, backgroundColor, indicator, action, tracking);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ButtonItem)) {
                        return false;
                    }
                    ButtonItem buttonItem = (ButtonItem) other;
                    return Intrinsics.d(this.text, buttonItem.text) && Intrinsics.d(this.backgroundColor, buttonItem.backgroundColor) && Intrinsics.d(this.indicator, buttonItem.indicator) && Intrinsics.d(this.action, buttonItem.action) && Intrinsics.d(this.tracking, buttonItem.tracking);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final IndicatorDTO getIndicator() {
                    return this.indicator;
                }

                @NotNull
                public final TextDTO getText() {
                    return this.text;
                }

                public final Map<String, TokenizedTrackingInfo> getTracking() {
                    return this.tracking;
                }

                public int hashCode() {
                    int hashCode = this.text.hashCode() * 31;
                    String str = this.backgroundColor;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    IndicatorDTO indicatorDTO = this.indicator;
                    int hashCode3 = (hashCode2 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.tracking;
                    return hashCode4 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    TextDTO textDTO = this.text;
                    String str = this.backgroundColor;
                    IndicatorDTO indicatorDTO = this.indicator;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.tracking;
                    StringBuilder f7 = g.f("ButtonItem(text=", textDTO, ", backgroundColor=", str, ", indicator=");
                    f7.append(indicatorDTO);
                    f7.append(", action=");
                    f7.append(atomActionDTO);
                    f7.append(", tracking=");
                    return P.f(f7, map, ")");
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Jk\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00060"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO$ProductInfo;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO;", "productMedia", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "productButtons", "", "", "backgroundColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getProductMedia", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getProductButtons", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ProductInfo extends ProductItemContentDTO {
                public static final int $stable = 8;
                private final AtomActionDTO action;
                private final String backgroundColor;
                private final PriceDTO price;
                private final List<Object> productButtons;

                @NotNull
                private final ProductMediaDTO productMedia;

                @NotNull
                private final TextDTO text;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ProductInfo(@NotNull ProductMediaDTO productMedia, @NotNull TextDTO text, PriceDTO priceDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "toggleButton", name = "TOGGLE_BUTTON", type = ProductItemToggleButton.class), @ProtoOneOfSignature(fieldName = "favoriteMolecule", name = "FAVORITE_MOLECULE", type = FavoriteProductMoleculeV4.class)}) @ProtoOneOf(label = "type") List<? extends Object> list, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                    super(null);
                    Intrinsics.checkNotNullParameter(productMedia, "productMedia");
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.productMedia = productMedia;
                    this.text = text;
                    this.price = priceDTO;
                    this.productButtons = list;
                    this.backgroundColor = str;
                    this.action = atomActionDTO;
                    this.trackingInfo = map;
                }

                public static /* synthetic */ ProductInfo copy$default(ProductInfo productInfo, ProductMediaDTO productMediaDTO, TextDTO textDTO, PriceDTO priceDTO, List list, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        productMediaDTO = productInfo.productMedia;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO = productInfo.text;
                    }
                    if ((i11 & 4) != 0) {
                        priceDTO = productInfo.price;
                    }
                    if ((i11 & 8) != 0) {
                        list = productInfo.productButtons;
                    }
                    if ((i11 & 16) != 0) {
                        str = productInfo.backgroundColor;
                    }
                    if ((i11 & 32) != 0) {
                        atomActionDTO = productInfo.action;
                    }
                    if ((i11 & 64) != 0) {
                        map = productInfo.trackingInfo;
                    }
                    AtomActionDTO atomActionDTO2 = atomActionDTO;
                    Map map2 = map;
                    String str2 = str;
                    PriceDTO priceDTO2 = priceDTO;
                    return productInfo.copy(productMediaDTO, textDTO, priceDTO2, list, str2, atomActionDTO2, map2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final ProductMediaDTO getProductMedia() {
                    return this.productMedia;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final TextDTO getText() {
                    return this.text;
                }

                /* renamed from: component3, reason: from getter */
                public final PriceDTO getPrice() {
                    return this.price;
                }

                public final List<Object> component4() {
                    return this.productButtons;
                }

                /* renamed from: component5, reason: from getter */
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                /* renamed from: component6, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component7() {
                    return this.trackingInfo;
                }

                @NotNull
                public final ProductInfo copy(@NotNull ProductMediaDTO productMedia, @NotNull TextDTO text, PriceDTO price, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "toggleButton", name = "TOGGLE_BUTTON", type = ProductItemToggleButton.class), @ProtoOneOfSignature(fieldName = "favoriteMolecule", name = "FAVORITE_MOLECULE", type = FavoriteProductMoleculeV4.class)}) @ProtoOneOf(label = "type") List<? extends Object> productButtons, String backgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(productMedia, "productMedia");
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new ProductInfo(productMedia, text, price, productButtons, backgroundColor, action, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ProductInfo)) {
                        return false;
                    }
                    ProductInfo productInfo = (ProductInfo) other;
                    return Intrinsics.d(this.productMedia, productInfo.productMedia) && Intrinsics.d(this.text, productInfo.text) && Intrinsics.d(this.price, productInfo.price) && Intrinsics.d(this.productButtons, productInfo.productButtons) && Intrinsics.d(this.backgroundColor, productInfo.backgroundColor) && Intrinsics.d(this.action, productInfo.action) && Intrinsics.d(this.trackingInfo, productInfo.trackingInfo);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final PriceDTO getPrice() {
                    return this.price;
                }

                public final List<Object> getProductButtons() {
                    return this.productButtons;
                }

                @NotNull
                public final ProductMediaDTO getProductMedia() {
                    return this.productMedia;
                }

                @NotNull
                public final TextDTO getText() {
                    return this.text;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int a11 = b.a(this.text, this.productMedia.hashCode() * 31, 31);
                    PriceDTO priceDTO = this.price;
                    int hashCode = (a11 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
                    List<Object> list = this.productButtons;
                    int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                    String str = this.backgroundColor;
                    int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode4 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    ProductMediaDTO productMediaDTO = this.productMedia;
                    TextDTO textDTO = this.text;
                    PriceDTO priceDTO = this.price;
                    List<Object> list = this.productButtons;
                    String str = this.backgroundColor;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder sb2 = new StringBuilder("ProductInfo(productMedia=");
                    sb2.append(productMediaDTO);
                    sb2.append(", text=");
                    sb2.append(textDTO);
                    sb2.append(", price=");
                    sb2.append(priceDTO);
                    sb2.append(", productButtons=");
                    sb2.append(list);
                    sb2.append(", backgroundColor=");
                    p.c(str, ", action=", ", trackingInfo=", sb2, atomActionDTO);
                    return P.f(sb2, map, ")");
                }
            }

            public /* synthetic */ ProductItemContentDTO(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ProductItemContentDTO() {
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemToggleButton;", "", "isSelected", "", "normal", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "selected", "<init>", "(ZLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "()Z", "getNormal", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSelected", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProductItemToggleButton {
            public static final int $stable = IconButtonV3DTO.$stable;
            private final boolean isSelected;

            @NotNull
            private final IconButtonV3DTO normal;
            private final IconButtonV3DTO selected;

            public ProductItemToggleButton(boolean z11, @NotNull IconButtonV3DTO normal, IconButtonV3DTO iconButtonV3DTO) {
                Intrinsics.checkNotNullParameter(normal, "normal");
                this.isSelected = z11;
                this.normal = normal;
                this.selected = iconButtonV3DTO;
            }

            public static /* synthetic */ ProductItemToggleButton copy$default(ProductItemToggleButton productItemToggleButton, boolean z11, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = productItemToggleButton.isSelected;
                }
                if ((i11 & 2) != 0) {
                    iconButtonV3DTO = productItemToggleButton.normal;
                }
                if ((i11 & 4) != 0) {
                    iconButtonV3DTO2 = productItemToggleButton.selected;
                }
                return productItemToggleButton.copy(z11, iconButtonV3DTO, iconButtonV3DTO2);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final IconButtonV3DTO getNormal() {
                return this.normal;
            }

            /* renamed from: component3, reason: from getter */
            public final IconButtonV3DTO getSelected() {
                return this.selected;
            }

            @NotNull
            public final ProductItemToggleButton copy(boolean isSelected, @NotNull IconButtonV3DTO normal, IconButtonV3DTO selected) {
                Intrinsics.checkNotNullParameter(normal, "normal");
                return new ProductItemToggleButton(isSelected, normal, selected);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProductItemToggleButton)) {
                    return false;
                }
                ProductItemToggleButton productItemToggleButton = (ProductItemToggleButton) other;
                return this.isSelected == productItemToggleButton.isSelected && Intrinsics.d(this.normal, productItemToggleButton.normal) && Intrinsics.d(this.selected, productItemToggleButton.selected);
            }

            @NotNull
            public final IconButtonV3DTO getNormal() {
                return this.normal;
            }

            public final IconButtonV3DTO getSelected() {
                return this.selected;
            }

            public int hashCode() {
                int c11 = GR.b.c(this.normal, Boolean.hashCode(this.isSelected) * 31, 31);
                IconButtonV3DTO iconButtonV3DTO = this.selected;
                return c11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode());
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                return "ProductItemToggleButton(isSelected=" + this.isSelected + ", normal=" + this.normal + ", selected=" + this.selected + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemsContainerDTO;", "", "productItems", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO;", "<init>", "(Ljava/util/List;)V", "getProductItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProductItemsContainerDTO {
            public static final int $stable = 8;

            @NotNull
            private final List<ProductItemContentDTO> productItems;

            /* JADX WARN: Multi-variable type inference failed */
            public ProductItemsContainerDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "buttonItem", name = "BUTTON_ITEM", type = ProductItemContentDTO.ButtonItem.class), @ProtoOneOfSignature(fieldName = "productInfo", name = "PRODUCT_INFO", type = ProductItemContentDTO.ProductInfo.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends ProductItemContentDTO> productItems) {
                Intrinsics.checkNotNullParameter(productItems, "productItems");
                this.productItems = productItems;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ProductItemsContainerDTO copy$default(ProductItemsContainerDTO productItemsContainerDTO, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = productItemsContainerDTO.productItems;
                }
                return productItemsContainerDTO.copy(list);
            }

            @NotNull
            public final List<ProductItemContentDTO> component1() {
                return this.productItems;
            }

            @NotNull
            public final ProductItemsContainerDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "buttonItem", name = "BUTTON_ITEM", type = ProductItemContentDTO.ButtonItem.class), @ProtoOneOfSignature(fieldName = "productInfo", name = "PRODUCT_INFO", type = ProductItemContentDTO.ProductInfo.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends ProductItemContentDTO> productItems) {
                Intrinsics.checkNotNullParameter(productItems, "productItems");
                return new ProductItemsContainerDTO(productItems);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProductItemsContainerDTO) && Intrinsics.d(this.productItems, ((ProductItemsContainerDTO) other).productItems);
            }

            @NotNull
            public final List<ProductItemContentDTO> getProductItems() {
                return this.productItems;
            }

            public int hashCode() {
                return this.productItems.hashCode();
            }

            @NotNull
            public String toString() {
                return c.a("ProductItemsContainerDTO(productItems=", ")", this.productItems);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewImage;", "", ImagesContract.URL, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReviewImage {
            public static final int $stable = 0;

            @NotNull
            private final String url;

            public ReviewImage(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public static /* synthetic */ ReviewImage copy$default(ReviewImage reviewImage, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = reviewImage.url;
                }
                return reviewImage.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            @NotNull
            public final ReviewImage copy(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new ReviewImage(url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReviewImage) && Intrinsics.d(this.url, ((ReviewImage) other).url);
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("ReviewImage(url=", this.url, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewUser;", "", "username", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "avatar", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/avatar/Avatar;)V", "getUsername", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAvatar", "()Lru/ozon/uni/atoms/data/avatar/Avatar;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReviewUser {
            public static final int $stable = Avatar.$stable | TextAtom.$stable;

            @NotNull
            private final Avatar avatar;

            @NotNull
            private final TextAtom username;

            public ReviewUser(@NotNull TextAtom username, @NotNull Avatar avatar) {
                Intrinsics.checkNotNullParameter(username, "username");
                Intrinsics.checkNotNullParameter(avatar, "avatar");
                this.username = username;
                this.avatar = avatar;
            }

            public static /* synthetic */ ReviewUser copy$default(ReviewUser reviewUser, TextAtom textAtom, Avatar avatar, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = reviewUser.username;
                }
                if ((i11 & 2) != 0) {
                    avatar = reviewUser.avatar;
                }
                return reviewUser.copy(textAtom, avatar);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getUsername() {
                return this.username;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Avatar getAvatar() {
                return this.avatar;
            }

            @NotNull
            public final ReviewUser copy(@NotNull TextAtom username, @NotNull Avatar avatar) {
                Intrinsics.checkNotNullParameter(username, "username");
                Intrinsics.checkNotNullParameter(avatar, "avatar");
                return new ReviewUser(username, avatar);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewUser)) {
                    return false;
                }
                ReviewUser reviewUser = (ReviewUser) other;
                return Intrinsics.d(this.username, reviewUser.username) && Intrinsics.d(this.avatar, reviewUser.avatar);
            }

            @NotNull
            public final Avatar getAvatar() {
                return this.avatar;
            }

            @NotNull
            public final TextAtom getUsername() {
                return this.username;
            }

            public int hashCode() {
                return this.avatar.hashCode() + (this.username.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "ReviewUser(username=" + this.username + ", avatar=" + this.avatar + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;", "", "subscribe", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "subscribed", "isSubscribed", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)V", "getSubscribe", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSubscribed", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SocialUser {
            public static final int $stable = CellDTO.$stable;
            private final boolean isSubscribed;

            @NotNull
            private final CellDTO subscribe;

            @NotNull
            private final CellDTO subscribed;

            public SocialUser(@NotNull CellDTO subscribe, @NotNull CellDTO subscribed, boolean z11) {
                Intrinsics.checkNotNullParameter(subscribe, "subscribe");
                Intrinsics.checkNotNullParameter(subscribed, "subscribed");
                this.subscribe = subscribe;
                this.subscribed = subscribed;
                this.isSubscribed = z11;
            }

            public static /* synthetic */ SocialUser copy$default(SocialUser socialUser, CellDTO cellDTO, CellDTO cellDTO2, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    cellDTO = socialUser.subscribe;
                }
                if ((i11 & 2) != 0) {
                    cellDTO2 = socialUser.subscribed;
                }
                if ((i11 & 4) != 0) {
                    z11 = socialUser.isSubscribed;
                }
                return socialUser.copy(cellDTO, cellDTO2, z11);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final CellDTO getSubscribe() {
                return this.subscribe;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final CellDTO getSubscribed() {
                return this.subscribed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsSubscribed() {
                return this.isSubscribed;
            }

            @NotNull
            public final SocialUser copy(@NotNull CellDTO subscribe, @NotNull CellDTO subscribed, boolean isSubscribed) {
                Intrinsics.checkNotNullParameter(subscribe, "subscribe");
                Intrinsics.checkNotNullParameter(subscribed, "subscribed");
                return new SocialUser(subscribe, subscribed, isSubscribed);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SocialUser)) {
                    return false;
                }
                SocialUser socialUser = (SocialUser) other;
                return Intrinsics.d(this.subscribe, socialUser.subscribe) && Intrinsics.d(this.subscribed, socialUser.subscribed) && this.isSubscribed == socialUser.isSubscribed;
            }

            @NotNull
            public final CellDTO getSubscribe() {
                return this.subscribe;
            }

            @NotNull
            public final CellDTO getSubscribed() {
                return this.subscribed;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSubscribed) + Bi.b.c(this.subscribed, this.subscribe.hashCode() * 31, 31);
            }

            public final boolean isSubscribed() {
                return this.isSubscribed;
            }

            @NotNull
            public String toString() {
                CellDTO cellDTO = this.subscribe;
                CellDTO cellDTO2 = this.subscribed;
                boolean z11 = this.isSubscribed;
                StringBuilder sb2 = new StringBuilder("SocialUser(subscribe=");
                sb2.append(cellDTO);
                sb2.append(", subscribed=");
                sb2.append(cellDTO2);
                sb2.append(", isSubscribed=");
                return Pk0.a.a(")", sb2, z11);
            }
        }

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SpacerDTO;", "", "height", "", "constructor-impl", "(I)I", "getHeight", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final class SpacerDTO {
            private final int height;

            private /* synthetic */ SpacerDTO(int i11) {
                this.height = i11;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ SpacerDTO m1498boximpl(int i11) {
                return new SpacerDTO(i11);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static int m1499constructorimpl(int i11) {
                return i11;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1500equalsimpl(int i11, Object obj) {
                return (obj instanceof SpacerDTO) && i11 == ((SpacerDTO) obj).m1504unboximpl();
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m1501equalsimpl0(int i11, int i12) {
                return i11 == i12;
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1502hashCodeimpl(int i11) {
                return Integer.hashCode(i11);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1503toStringimpl(int i11) {
                return E.a(i11, "SpacerDTO(height=", ")");
            }

            public boolean equals(Object obj) {
                return m1500equalsimpl(this.height, obj);
            }

            public final int getHeight() {
                return this.height;
            }

            public int hashCode() {
                return m1502hashCodeimpl(this.height);
            }

            public String toString() {
                return m1503toStringimpl(this.height);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ int m1504unboximpl() {
                return this.height;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$VideoControlsMode;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "FULL", "COMPACT", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class VideoControlsMode {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ VideoControlsMode[] $VALUES;
            public static final VideoControlsMode INVALID = new VideoControlsMode("INVALID", 0);
            public static final VideoControlsMode FULL = new VideoControlsMode("FULL", 1);
            public static final VideoControlsMode COMPACT = new VideoControlsMode("COMPACT", 2);

            private static final /* synthetic */ VideoControlsMode[] $values() {
                return new VideoControlsMode[]{INVALID, FULL, COMPACT};
            }

            static {
                VideoControlsMode[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private VideoControlsMode(String str, int i11) {
            }

            public static VideoControlsMode valueOf(String str) {
                return (VideoControlsMode) Enum.valueOf(VideoControlsMode.class, str);
            }

            public static VideoControlsMode[] values() {
                return (VideoControlsMode[]) $VALUES.clone();
            }
        }

        public ReviewGalleryV2Item(@NotNull ContentWrapper content, ReviewUser reviewUser, ReviewProductTileDTO reviewProductTileDTO, ProductRatingDTO productRatingDTO, ReviewsRightPanelDTO reviewsRightPanelDTO, SocialIconButtonDTO socialIconButtonDTO, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, BadgeDTO badgeDTO, SocialUser socialUser, @NotNull String reviewUuid, AtomActionDTO atomActionDTO, ItemsContainerDTO itemsContainerDTO, ItemsContainerDTO itemsContainerDTO2, ItemsContainerDTO itemsContainerDTO3, @NotNull VideoControlsMode videoControlsMode) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
            Intrinsics.checkNotNullParameter(videoControlsMode, "videoControlsMode");
            this.content = content;
            this.user = reviewUser;
            this.product = reviewProductTileDTO;
            this.rating = productRatingDTO;
            this.rightPanel = reviewsRightPanelDTO;
            this.closeButton = socialIconButtonDTO;
            this.trackingInfo = map;
            this.prevTrackingInfo = map2;
            this.nextTrackingInfo = map3;
            this.badge = badgeDTO;
            this.socialUser = socialUser;
            this.reviewUuid = reviewUuid;
            this.contentViewAction = atomActionDTO;
            this.topMediaItems = itemsContainerDTO;
            this.bottomMediaItems = itemsContainerDTO2;
            this.bottomItems = itemsContainerDTO3;
            this.videoControlsMode = videoControlsMode;
        }

        public static /* synthetic */ ReviewGalleryV2Item copy$default(ReviewGalleryV2Item reviewGalleryV2Item, ContentWrapper contentWrapper, ReviewUser reviewUser, ReviewProductTileDTO reviewProductTileDTO, ProductRatingDTO productRatingDTO, ReviewsRightPanelDTO reviewsRightPanelDTO, SocialIconButtonDTO socialIconButtonDTO, Map map, Map map2, Map map3, BadgeDTO badgeDTO, SocialUser socialUser, String str, AtomActionDTO atomActionDTO, ItemsContainerDTO itemsContainerDTO, ItemsContainerDTO itemsContainerDTO2, ItemsContainerDTO itemsContainerDTO3, VideoControlsMode videoControlsMode, int i11, Object obj) {
            VideoControlsMode videoControlsMode2;
            ItemsContainerDTO itemsContainerDTO4;
            ContentWrapper contentWrapper2;
            ReviewGalleryV2Item reviewGalleryV2Item2;
            ItemsContainerDTO itemsContainerDTO5;
            ReviewUser reviewUser2;
            ReviewProductTileDTO reviewProductTileDTO2;
            ProductRatingDTO productRatingDTO2;
            ReviewsRightPanelDTO reviewsRightPanelDTO2;
            SocialIconButtonDTO socialIconButtonDTO2;
            Map map4;
            Map map5;
            Map map6;
            BadgeDTO badgeDTO2;
            SocialUser socialUser2;
            String str2;
            AtomActionDTO atomActionDTO2;
            ItemsContainerDTO itemsContainerDTO6;
            ContentWrapper contentWrapper3 = (i11 & 1) != 0 ? reviewGalleryV2Item.content : contentWrapper;
            ReviewUser reviewUser3 = (i11 & 2) != 0 ? reviewGalleryV2Item.user : reviewUser;
            ReviewProductTileDTO reviewProductTileDTO3 = (i11 & 4) != 0 ? reviewGalleryV2Item.product : reviewProductTileDTO;
            ProductRatingDTO productRatingDTO3 = (i11 & 8) != 0 ? reviewGalleryV2Item.rating : productRatingDTO;
            ReviewsRightPanelDTO reviewsRightPanelDTO3 = (i11 & 16) != 0 ? reviewGalleryV2Item.rightPanel : reviewsRightPanelDTO;
            SocialIconButtonDTO socialIconButtonDTO3 = (i11 & 32) != 0 ? reviewGalleryV2Item.closeButton : socialIconButtonDTO;
            Map map7 = (i11 & 64) != 0 ? reviewGalleryV2Item.trackingInfo : map;
            Map map8 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewGalleryV2Item.prevTrackingInfo : map2;
            Map map9 = (i11 & 256) != 0 ? reviewGalleryV2Item.nextTrackingInfo : map3;
            BadgeDTO badgeDTO3 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? reviewGalleryV2Item.badge : badgeDTO;
            SocialUser socialUser3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? reviewGalleryV2Item.socialUser : socialUser;
            String str3 = (i11 & 2048) != 0 ? reviewGalleryV2Item.reviewUuid : str;
            AtomActionDTO atomActionDTO3 = (i11 & 4096) != 0 ? reviewGalleryV2Item.contentViewAction : atomActionDTO;
            ItemsContainerDTO itemsContainerDTO7 = (i11 & 8192) != 0 ? reviewGalleryV2Item.topMediaItems : itemsContainerDTO;
            ContentWrapper contentWrapper4 = contentWrapper3;
            ItemsContainerDTO itemsContainerDTO8 = (i11 & 16384) != 0 ? reviewGalleryV2Item.bottomMediaItems : itemsContainerDTO2;
            ItemsContainerDTO itemsContainerDTO9 = (i11 & 32768) != 0 ? reviewGalleryV2Item.bottomItems : itemsContainerDTO3;
            if ((i11 & 65536) != 0) {
                itemsContainerDTO4 = itemsContainerDTO9;
                videoControlsMode2 = reviewGalleryV2Item.videoControlsMode;
                itemsContainerDTO5 = itemsContainerDTO8;
                reviewUser2 = reviewUser3;
                reviewProductTileDTO2 = reviewProductTileDTO3;
                productRatingDTO2 = productRatingDTO3;
                reviewsRightPanelDTO2 = reviewsRightPanelDTO3;
                socialIconButtonDTO2 = socialIconButtonDTO3;
                map4 = map7;
                map5 = map8;
                map6 = map9;
                badgeDTO2 = badgeDTO3;
                socialUser2 = socialUser3;
                str2 = str3;
                atomActionDTO2 = atomActionDTO3;
                itemsContainerDTO6 = itemsContainerDTO7;
                contentWrapper2 = contentWrapper4;
                reviewGalleryV2Item2 = reviewGalleryV2Item;
            } else {
                videoControlsMode2 = videoControlsMode;
                itemsContainerDTO4 = itemsContainerDTO9;
                contentWrapper2 = contentWrapper4;
                reviewGalleryV2Item2 = reviewGalleryV2Item;
                itemsContainerDTO5 = itemsContainerDTO8;
                reviewUser2 = reviewUser3;
                reviewProductTileDTO2 = reviewProductTileDTO3;
                productRatingDTO2 = productRatingDTO3;
                reviewsRightPanelDTO2 = reviewsRightPanelDTO3;
                socialIconButtonDTO2 = socialIconButtonDTO3;
                map4 = map7;
                map5 = map8;
                map6 = map9;
                badgeDTO2 = badgeDTO3;
                socialUser2 = socialUser3;
                str2 = str3;
                atomActionDTO2 = atomActionDTO3;
                itemsContainerDTO6 = itemsContainerDTO7;
            }
            return reviewGalleryV2Item2.copy(contentWrapper2, reviewUser2, reviewProductTileDTO2, productRatingDTO2, reviewsRightPanelDTO2, socialIconButtonDTO2, map4, map5, map6, badgeDTO2, socialUser2, str2, atomActionDTO2, itemsContainerDTO6, itemsContainerDTO5, itemsContainerDTO4, videoControlsMode2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ContentWrapper getContent() {
            return this.content;
        }

        /* renamed from: component10, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component11, reason: from getter */
        public final SocialUser getSocialUser() {
            return this.socialUser;
        }

        @NotNull
        /* renamed from: component12, reason: from getter */
        public final String getReviewUuid() {
            return this.reviewUuid;
        }

        /* renamed from: component13, reason: from getter */
        public final AtomActionDTO getContentViewAction() {
            return this.contentViewAction;
        }

        /* renamed from: component14, reason: from getter */
        public final ItemsContainerDTO getTopMediaItems() {
            return this.topMediaItems;
        }

        /* renamed from: component15, reason: from getter */
        public final ItemsContainerDTO getBottomMediaItems() {
            return this.bottomMediaItems;
        }

        /* renamed from: component16, reason: from getter */
        public final ItemsContainerDTO getBottomItems() {
            return this.bottomItems;
        }

        @NotNull
        /* renamed from: component17, reason: from getter */
        public final VideoControlsMode getVideoControlsMode() {
            return this.videoControlsMode;
        }

        /* renamed from: component2, reason: from getter */
        public final ReviewUser getUser() {
            return this.user;
        }

        /* renamed from: component3, reason: from getter */
        public final ReviewProductTileDTO getProduct() {
            return this.product;
        }

        /* renamed from: component4, reason: from getter */
        public final ProductRatingDTO getRating() {
            return this.rating;
        }

        /* renamed from: component5, reason: from getter */
        public final ReviewsRightPanelDTO getRightPanel() {
            return this.rightPanel;
        }

        /* renamed from: component6, reason: from getter */
        public final SocialIconButtonDTO getCloseButton() {
            return this.closeButton;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.prevTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.nextTrackingInfo;
        }

        @NotNull
        public final ReviewGalleryV2Item copy(@NotNull ContentWrapper content, ReviewUser user, ReviewProductTileDTO product, ProductRatingDTO rating, ReviewsRightPanelDTO rightPanel, SocialIconButtonDTO closeButton, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> prevTrackingInfo, Map<String, TokenizedTrackingInfo> nextTrackingInfo, BadgeDTO badge, SocialUser socialUser, @NotNull String reviewUuid, AtomActionDTO contentViewAction, ItemsContainerDTO topMediaItems, ItemsContainerDTO bottomMediaItems, ItemsContainerDTO bottomItems, @NotNull VideoControlsMode videoControlsMode) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
            Intrinsics.checkNotNullParameter(videoControlsMode, "videoControlsMode");
            return new ReviewGalleryV2Item(content, user, product, rating, rightPanel, closeButton, trackingInfo, prevTrackingInfo, nextTrackingInfo, badge, socialUser, reviewUuid, contentViewAction, topMediaItems, bottomMediaItems, bottomItems, videoControlsMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewGalleryV2Item)) {
                return false;
            }
            ReviewGalleryV2Item reviewGalleryV2Item = (ReviewGalleryV2Item) other;
            return Intrinsics.d(this.content, reviewGalleryV2Item.content) && Intrinsics.d(this.user, reviewGalleryV2Item.user) && Intrinsics.d(this.product, reviewGalleryV2Item.product) && Intrinsics.d(this.rating, reviewGalleryV2Item.rating) && Intrinsics.d(this.rightPanel, reviewGalleryV2Item.rightPanel) && Intrinsics.d(this.closeButton, reviewGalleryV2Item.closeButton) && Intrinsics.d(this.trackingInfo, reviewGalleryV2Item.trackingInfo) && Intrinsics.d(this.prevTrackingInfo, reviewGalleryV2Item.prevTrackingInfo) && Intrinsics.d(this.nextTrackingInfo, reviewGalleryV2Item.nextTrackingInfo) && Intrinsics.d(this.badge, reviewGalleryV2Item.badge) && Intrinsics.d(this.socialUser, reviewGalleryV2Item.socialUser) && Intrinsics.d(this.reviewUuid, reviewGalleryV2Item.reviewUuid) && Intrinsics.d(this.contentViewAction, reviewGalleryV2Item.contentViewAction) && Intrinsics.d(this.topMediaItems, reviewGalleryV2Item.topMediaItems) && Intrinsics.d(this.bottomMediaItems, reviewGalleryV2Item.bottomMediaItems) && Intrinsics.d(this.bottomItems, reviewGalleryV2Item.bottomItems) && this.videoControlsMode == reviewGalleryV2Item.videoControlsMode;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final ItemsContainerDTO getBottomItems() {
            return this.bottomItems;
        }

        public final ItemsContainerDTO getBottomMediaItems() {
            return this.bottomMediaItems;
        }

        public final SocialIconButtonDTO getCloseButton() {
            return this.closeButton;
        }

        @NotNull
        public final ContentWrapper getContent() {
            return this.content;
        }

        public final AtomActionDTO getContentViewAction() {
            return this.contentViewAction;
        }

        public final Map<String, TokenizedTrackingInfo> getNextTrackingInfo() {
            return this.nextTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getPrevTrackingInfo() {
            return this.prevTrackingInfo;
        }

        public final ReviewProductTileDTO getProduct() {
            return this.product;
        }

        public final ProductRatingDTO getRating() {
            return this.rating;
        }

        @NotNull
        public final String getReviewUuid() {
            return this.reviewUuid;
        }

        public final ReviewsRightPanelDTO getRightPanel() {
            return this.rightPanel;
        }

        public final SocialUser getSocialUser() {
            return this.socialUser;
        }

        public final ItemsContainerDTO getTopMediaItems() {
            return this.topMediaItems;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final ReviewUser getUser() {
            return this.user;
        }

        @NotNull
        public final VideoControlsMode getVideoControlsMode() {
            return this.videoControlsMode;
        }

        public int hashCode() {
            int hashCode = this.content.hashCode() * 31;
            ReviewUser reviewUser = this.user;
            int hashCode2 = (hashCode + (reviewUser == null ? 0 : reviewUser.hashCode())) * 31;
            ReviewProductTileDTO reviewProductTileDTO = this.product;
            int hashCode3 = (hashCode2 + (reviewProductTileDTO == null ? 0 : reviewProductTileDTO.hashCode())) * 31;
            ProductRatingDTO productRatingDTO = this.rating;
            int hashCode4 = (hashCode3 + (productRatingDTO == null ? 0 : productRatingDTO.hashCode())) * 31;
            ReviewsRightPanelDTO reviewsRightPanelDTO = this.rightPanel;
            int hashCode5 = (hashCode4 + (reviewsRightPanelDTO == null ? 0 : reviewsRightPanelDTO.hashCode())) * 31;
            SocialIconButtonDTO socialIconButtonDTO = this.closeButton;
            int hashCode6 = (hashCode5 + (socialIconButtonDTO == null ? 0 : socialIconButtonDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.prevTrackingInfo;
            int hashCode8 = (hashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map3 = this.nextTrackingInfo;
            int hashCode9 = (hashCode8 + (map3 == null ? 0 : map3.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode10 = (hashCode9 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            SocialUser socialUser = this.socialUser;
            int a11 = G.g.a((hashCode10 + (socialUser == null ? 0 : socialUser.hashCode())) * 31, 31, this.reviewUuid);
            AtomActionDTO atomActionDTO = this.contentViewAction;
            int hashCode11 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            ItemsContainerDTO itemsContainerDTO = this.topMediaItems;
            int hashCode12 = (hashCode11 + (itemsContainerDTO == null ? 0 : itemsContainerDTO.hashCode())) * 31;
            ItemsContainerDTO itemsContainerDTO2 = this.bottomMediaItems;
            int hashCode13 = (hashCode12 + (itemsContainerDTO2 == null ? 0 : itemsContainerDTO2.hashCode())) * 31;
            ItemsContainerDTO itemsContainerDTO3 = this.bottomItems;
            return this.videoControlsMode.hashCode() + ((hashCode13 + (itemsContainerDTO3 != null ? itemsContainerDTO3.hashCode() : 0)) * 31);
        }

        public final boolean isCompactControls() {
            return this.videoControlsMode == VideoControlsMode.COMPACT;
        }

        public final boolean isFillMode() {
            return this.content.getFitType() == FitType.FILL;
        }

        public final boolean isVideo() {
            return this.content.getVideo() != null;
        }

        @NotNull
        public String toString() {
            ContentWrapper contentWrapper = this.content;
            ReviewUser reviewUser = this.user;
            ReviewProductTileDTO reviewProductTileDTO = this.product;
            ProductRatingDTO productRatingDTO = this.rating;
            ReviewsRightPanelDTO reviewsRightPanelDTO = this.rightPanel;
            SocialIconButtonDTO socialIconButtonDTO = this.closeButton;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.prevTrackingInfo;
            Map<String, TokenizedTrackingInfo> map3 = this.nextTrackingInfo;
            BadgeDTO badgeDTO = this.badge;
            SocialUser socialUser = this.socialUser;
            String str = this.reviewUuid;
            AtomActionDTO atomActionDTO = this.contentViewAction;
            ItemsContainerDTO itemsContainerDTO = this.topMediaItems;
            ItemsContainerDTO itemsContainerDTO2 = this.bottomMediaItems;
            ItemsContainerDTO itemsContainerDTO3 = this.bottomItems;
            VideoControlsMode videoControlsMode = this.videoControlsMode;
            StringBuilder sb2 = new StringBuilder("ReviewGalleryV2Item(content=");
            sb2.append(contentWrapper);
            sb2.append(", user=");
            sb2.append(reviewUser);
            sb2.append(", product=");
            sb2.append(reviewProductTileDTO);
            sb2.append(", rating=");
            sb2.append(productRatingDTO);
            sb2.append(", rightPanel=");
            sb2.append(reviewsRightPanelDTO);
            sb2.append(", closeButton=");
            sb2.append(socialIconButtonDTO);
            sb2.append(", trackingInfo=");
            Tl.b.g(sb2, map, ", prevTrackingInfo=", map2, ", nextTrackingInfo=");
            sb2.append(map3);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", socialUser=");
            sb2.append(socialUser);
            sb2.append(", reviewUuid=");
            sb2.append(str);
            sb2.append(", contentViewAction=");
            sb2.append(atomActionDTO);
            sb2.append(", topMediaItems=");
            sb2.append(itemsContainerDTO);
            sb2.append(", bottomMediaItems=");
            sb2.append(itemsContainerDTO2);
            sb2.append(", bottomItems=");
            sb2.append(itemsContainerDTO3);
            sb2.append(", videoControlsMode=");
            sb2.append(videoControlsMode);
            sb2.append(")");
            return sb2.toString();
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J6\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;", "", "buttons", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/RightPanelButtonDTO;", "soundControl", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/SocialSoundControlDTO;", "bottomPadding", "", "<init>", "(Ljava/util/List;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/SocialSoundControlDTO;Ljava/lang/Integer;)V", "getButtons", "()Ljava/util/List;", "getSoundControl", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/SocialSoundControlDTO;", "getBottomPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/SocialSoundControlDTO;Ljava/lang/Integer;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;", "equals", "", "other", "hashCode", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReviewsRightPanelDTO {
            public static final int $stable = 8;
            private final Integer bottomPadding;

            @NotNull
            private final List<RightPanelButtonDTO> buttons;
            private final SocialSoundControlDTO soundControl;

            public ReviewsRightPanelDTO(List list, SocialSoundControlDTO socialSoundControlDTO, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? K.f71697a : list, socialSoundControlDTO, num);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ReviewsRightPanelDTO copy$default(ReviewsRightPanelDTO reviewsRightPanelDTO, List list, SocialSoundControlDTO socialSoundControlDTO, Integer num, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = reviewsRightPanelDTO.buttons;
                }
                if ((i11 & 2) != 0) {
                    socialSoundControlDTO = reviewsRightPanelDTO.soundControl;
                }
                if ((i11 & 4) != 0) {
                    num = reviewsRightPanelDTO.bottomPadding;
                }
                return reviewsRightPanelDTO.copy(list, socialSoundControlDTO, num);
            }

            @NotNull
            public final List<RightPanelButtonDTO> component1() {
                return this.buttons;
            }

            /* renamed from: component2, reason: from getter */
            public final SocialSoundControlDTO getSoundControl() {
                return this.soundControl;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getBottomPadding() {
                return this.bottomPadding;
            }

            @NotNull
            public final ReviewsRightPanelDTO copy(@NotNull List<RightPanelButtonDTO> buttons, SocialSoundControlDTO soundControl, Integer bottomPadding) {
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                return new ReviewsRightPanelDTO(buttons, soundControl, bottomPadding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewsRightPanelDTO)) {
                    return false;
                }
                ReviewsRightPanelDTO reviewsRightPanelDTO = (ReviewsRightPanelDTO) other;
                return Intrinsics.d(this.buttons, reviewsRightPanelDTO.buttons) && Intrinsics.d(this.soundControl, reviewsRightPanelDTO.soundControl) && Intrinsics.d(this.bottomPadding, reviewsRightPanelDTO.bottomPadding);
            }

            public final Integer getBottomPadding() {
                return this.bottomPadding;
            }

            @NotNull
            public final List<RightPanelButtonDTO> getButtons() {
                return this.buttons;
            }

            public final SocialSoundControlDTO getSoundControl() {
                return this.soundControl;
            }

            public int hashCode() {
                int hashCode = this.buttons.hashCode() * 31;
                SocialSoundControlDTO socialSoundControlDTO = this.soundControl;
                int hashCode2 = (hashCode + (socialSoundControlDTO == null ? 0 : socialSoundControlDTO.hashCode())) * 31;
                Integer num = this.bottomPadding;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                List<RightPanelButtonDTO> list = this.buttons;
                SocialSoundControlDTO socialSoundControlDTO = this.soundControl;
                Integer num = this.bottomPadding;
                StringBuilder sb2 = new StringBuilder("ReviewsRightPanelDTO(buttons=");
                sb2.append(list);
                sb2.append(", soundControl=");
                sb2.append(socialSoundControlDTO);
                sb2.append(", bottomPadding=");
                return Ep.a.c(sb2, num, ")");
            }

            public ReviewsRightPanelDTO(@NotNull List<RightPanelButtonDTO> buttons, SocialSoundControlDTO socialSoundControlDTO, Integer num) {
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                this.buttons = buttons;
                this.soundControl = socialSoundControlDTO;
                this.bottomPadding = num;
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003Jz\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u000eHÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001f¨\u00062"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;", "", "mark", "", "text", "", "textStyle", "textColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "iconSize", "", "contentSpacing", "maxLines", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;III)V", "getMark", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getText", "()Ljava/lang/String;", "getTextStyle", "getTextColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getIconSize", "()I", "getContentSpacing", "getMaxLines", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;III)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;", "equals", "", "other", "hashCode", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProductRatingDTO {
            public static final int $stable = 8;
            private final AtomActionDTO action;
            private final int contentSpacing;
            private final int iconSize;
            private final Float mark;
            private final int maxLines;

            @NotNull
            private final String text;

            @NotNull
            private final String textColor;

            @NotNull
            private final String textStyle;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public ProductRatingDTO(Float f7, @NotNull String text, @NotNull String textStyle, @NotNull String textColor, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, int i11, int i12, int i13) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(textStyle, "textStyle");
                Intrinsics.checkNotNullParameter(textColor, "textColor");
                this.mark = f7;
                this.text = text;
                this.textStyle = textStyle;
                this.textColor = textColor;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.iconSize = i11;
                this.contentSpacing = i12;
                this.maxLines = i13;
            }

            public static /* synthetic */ ProductRatingDTO copy$default(ProductRatingDTO productRatingDTO, Float f7, String str, String str2, String str3, AtomActionDTO atomActionDTO, Map map, int i11, int i12, int i13, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    f7 = productRatingDTO.mark;
                }
                if ((i14 & 2) != 0) {
                    str = productRatingDTO.text;
                }
                if ((i14 & 4) != 0) {
                    str2 = productRatingDTO.textStyle;
                }
                if ((i14 & 8) != 0) {
                    str3 = productRatingDTO.textColor;
                }
                if ((i14 & 16) != 0) {
                    atomActionDTO = productRatingDTO.action;
                }
                if ((i14 & 32) != 0) {
                    map = productRatingDTO.trackingInfo;
                }
                if ((i14 & 64) != 0) {
                    i11 = productRatingDTO.iconSize;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    i12 = productRatingDTO.contentSpacing;
                }
                if ((i14 & 256) != 0) {
                    i13 = productRatingDTO.maxLines;
                }
                int i15 = i12;
                int i16 = i13;
                Map map2 = map;
                int i17 = i11;
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                String str4 = str2;
                return productRatingDTO.copy(f7, str, str4, str3, atomActionDTO2, map2, i17, i15, i16);
            }

            /* renamed from: component1, reason: from getter */
            public final Float getMark() {
                return this.mark;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getTextStyle() {
                return this.textStyle;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getTextColor() {
                return this.textColor;
            }

            /* renamed from: component5, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component6() {
                return this.trackingInfo;
            }

            /* renamed from: component7, reason: from getter */
            public final int getIconSize() {
                return this.iconSize;
            }

            /* renamed from: component8, reason: from getter */
            public final int getContentSpacing() {
                return this.contentSpacing;
            }

            /* renamed from: component9, reason: from getter */
            public final int getMaxLines() {
                return this.maxLines;
            }

            @NotNull
            public final ProductRatingDTO copy(Float mark, @NotNull String text, @NotNull String textStyle, @NotNull String textColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, int iconSize, int contentSpacing, int maxLines) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(textStyle, "textStyle");
                Intrinsics.checkNotNullParameter(textColor, "textColor");
                return new ProductRatingDTO(mark, text, textStyle, textColor, action, trackingInfo, iconSize, contentSpacing, maxLines);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProductRatingDTO)) {
                    return false;
                }
                ProductRatingDTO productRatingDTO = (ProductRatingDTO) other;
                return Intrinsics.d(this.mark, productRatingDTO.mark) && Intrinsics.d(this.text, productRatingDTO.text) && Intrinsics.d(this.textStyle, productRatingDTO.textStyle) && Intrinsics.d(this.textColor, productRatingDTO.textColor) && Intrinsics.d(this.action, productRatingDTO.action) && Intrinsics.d(this.trackingInfo, productRatingDTO.trackingInfo) && this.iconSize == productRatingDTO.iconSize && this.contentSpacing == productRatingDTO.contentSpacing && this.maxLines == productRatingDTO.maxLines;
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final int getContentSpacing() {
                return this.contentSpacing;
            }

            public final int getIconSize() {
                return this.iconSize;
            }

            public final Float getMark() {
                return this.mark;
            }

            public final int getMaxLines() {
                return this.maxLines;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            @NotNull
            public final String getTextColor() {
                return this.textColor;
            }

            @NotNull
            public final String getTextStyle() {
                return this.textStyle;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                Float f7 = this.mark;
                int a11 = G.g.a(G.g.a(G.g.a((f7 == null ? 0 : f7.hashCode()) * 31, 31, this.text), 31, this.textStyle), 31, this.textColor);
                AtomActionDTO atomActionDTO = this.action;
                int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return Integer.hashCode(this.maxLines) + C2454a.a(this.contentSpacing, C2454a.a(this.iconSize, (hashCode + (map != null ? map.hashCode() : 0)) * 31, 31), 31);
            }

            @NotNull
            public String toString() {
                Float f7 = this.mark;
                String str = this.text;
                String str2 = this.textStyle;
                String str3 = this.textColor;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int i11 = this.iconSize;
                int i12 = this.contentSpacing;
                int i13 = this.maxLines;
                StringBuilder sb2 = new StringBuilder("ProductRatingDTO(mark=");
                sb2.append(f7);
                sb2.append(", text=");
                sb2.append(str);
                sb2.append(", textStyle=");
                Nh.a.h(sb2, str2, ", textColor=", str3, ", action=");
                Sh.b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", iconSize=");
                Ek.a.f(i11, i12, ", contentSpacing=", ", maxLines=", sb2);
                return K00.b.e(i13, ")", sb2);
            }

            public /* synthetic */ ProductRatingDTO(Float f7, String str, String str2, String str3, AtomActionDTO atomActionDTO, Map map, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                this(f7, str, (i14 & 4) != 0 ? StyleParser.TextStyle.HEAD_M_ITALIC.getStyleName() : str2, (i14 & 8) != 0 ? UniColors.TEXT_LIGHT_KEY.getToken() : str3, atomActionDTO, map, (i14 & 64) != 0 ? 24 : i11, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 4 : i12, (i14 & 256) != 0 ? 2 : i13);
            }
        }

        public /* synthetic */ ReviewGalleryV2Item(ContentWrapper contentWrapper, ReviewUser reviewUser, ReviewProductTileDTO reviewProductTileDTO, ProductRatingDTO productRatingDTO, ReviewsRightPanelDTO reviewsRightPanelDTO, SocialIconButtonDTO socialIconButtonDTO, Map map, Map map2, Map map3, BadgeDTO badgeDTO, SocialUser socialUser, String str, AtomActionDTO atomActionDTO, ItemsContainerDTO itemsContainerDTO, ItemsContainerDTO itemsContainerDTO2, ItemsContainerDTO itemsContainerDTO3, VideoControlsMode videoControlsMode, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(contentWrapper, reviewUser, reviewProductTileDTO, productRatingDTO, reviewsRightPanelDTO, socialIconButtonDTO, map, map2, map3, badgeDTO, socialUser, str, atomActionDTO, itemsContainerDTO, itemsContainerDTO2, itemsContainerDTO3, (i11 & 65536) != 0 ? VideoControlsMode.FULL : videoControlsMode);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$SideButtonsDTO;", "", "leftButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightButton", "leftMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightMargin", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeftButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightButton", "getLeftMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightMargin", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SideButtonsDTO {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final IconButtonV3DTO leftButton;

        @EnumNullFallback
        private final Paddings leftMargin;
        private final IconButtonV3DTO rightButton;

        @EnumNullFallback
        private final Paddings rightMargin;

        public SideButtonsDTO(IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, Paddings paddings, Paddings paddings2) {
            this.leftButton = iconButtonV3DTO;
            this.rightButton = iconButtonV3DTO2;
            this.leftMargin = paddings;
            this.rightMargin = paddings2;
        }

        public static /* synthetic */ SideButtonsDTO copy$default(SideButtonsDTO sideButtonsDTO, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, Paddings paddings, Paddings paddings2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonV3DTO = sideButtonsDTO.leftButton;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO2 = sideButtonsDTO.rightButton;
            }
            if ((i11 & 4) != 0) {
                paddings = sideButtonsDTO.leftMargin;
            }
            if ((i11 & 8) != 0) {
                paddings2 = sideButtonsDTO.rightMargin;
            }
            return sideButtonsDTO.copy(iconButtonV3DTO, iconButtonV3DTO2, paddings, paddings2);
        }

        /* renamed from: component1, reason: from getter */
        public final IconButtonV3DTO getLeftButton() {
            return this.leftButton;
        }

        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getRightButton() {
            return this.rightButton;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getLeftMargin() {
            return this.leftMargin;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRightMargin() {
            return this.rightMargin;
        }

        @NotNull
        public final SideButtonsDTO copy(IconButtonV3DTO leftButton, IconButtonV3DTO rightButton, Paddings leftMargin, Paddings rightMargin) {
            return new SideButtonsDTO(leftButton, rightButton, leftMargin, rightMargin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SideButtonsDTO)) {
                return false;
            }
            SideButtonsDTO sideButtonsDTO = (SideButtonsDTO) other;
            return Intrinsics.d(this.leftButton, sideButtonsDTO.leftButton) && Intrinsics.d(this.rightButton, sideButtonsDTO.rightButton) && this.leftMargin == sideButtonsDTO.leftMargin && this.rightMargin == sideButtonsDTO.rightMargin;
        }

        public final IconButtonV3DTO getLeftButton() {
            return this.leftButton;
        }

        public final Paddings getLeftMargin() {
            return this.leftMargin;
        }

        public final IconButtonV3DTO getRightButton() {
            return this.rightButton;
        }

        public final Paddings getRightMargin() {
            return this.rightMargin;
        }

        public int hashCode() {
            IconButtonV3DTO iconButtonV3DTO = this.leftButton;
            int hashCode = (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode()) * 31;
            IconButtonV3DTO iconButtonV3DTO2 = this.rightButton;
            int hashCode2 = (hashCode + (iconButtonV3DTO2 == null ? 0 : iconButtonV3DTO2.hashCode())) * 31;
            Paddings paddings = this.leftMargin;
            int hashCode3 = (hashCode2 + (paddings == null ? 0 : paddings.hashCode())) * 31;
            Paddings paddings2 = this.rightMargin;
            return hashCode3 + (paddings2 != null ? paddings2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconButtonV3DTO iconButtonV3DTO = this.leftButton;
            IconButtonV3DTO iconButtonV3DTO2 = this.rightButton;
            Paddings paddings = this.leftMargin;
            Paddings paddings2 = this.rightMargin;
            StringBuilder sb2 = new StringBuilder("SideButtonsDTO(leftButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", rightButton=");
            sb2.append(iconButtonV3DTO2);
            sb2.append(", leftMargin=");
            return GR.b.e(sb2, paddings, ", rightMargin=", paddings2, ")");
        }
    }

    public ReviewGalleryV2DTO(@NotNull List<ReviewGalleryV2Item> items, Integer num, OnBackConfigDTO onBackConfigDTO) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.selectedIndex = num;
        this.onBackConfig = onBackConfigDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewGalleryV2DTO copy$default(ReviewGalleryV2DTO reviewGalleryV2DTO, List list, Integer num, OnBackConfigDTO onBackConfigDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = reviewGalleryV2DTO.items;
        }
        if ((i11 & 2) != 0) {
            num = reviewGalleryV2DTO.selectedIndex;
        }
        if ((i11 & 4) != 0) {
            onBackConfigDTO = reviewGalleryV2DTO.onBackConfig;
        }
        return reviewGalleryV2DTO.copy(list, num, onBackConfigDTO);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getItems$annotations() {
    }

    @NotNull
    public final List<ReviewGalleryV2Item> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final OnBackConfigDTO getOnBackConfig() {
        return this.onBackConfig;
    }

    @NotNull
    public final ReviewGalleryV2DTO copy(@NotNull List<ReviewGalleryV2Item> items, Integer selectedIndex, OnBackConfigDTO onBackConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new ReviewGalleryV2DTO(items, selectedIndex, onBackConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGalleryV2DTO)) {
            return false;
        }
        ReviewGalleryV2DTO reviewGalleryV2DTO = (ReviewGalleryV2DTO) other;
        return Intrinsics.d(this.items, reviewGalleryV2DTO.items) && Intrinsics.d(this.selectedIndex, reviewGalleryV2DTO.selectedIndex) && Intrinsics.d(this.onBackConfig, reviewGalleryV2DTO.onBackConfig);
    }

    @NotNull
    public final List<ReviewGalleryV2Item> getItems() {
        return this.items;
    }

    public final OnBackConfigDTO getOnBackConfig() {
        return this.onBackConfig;
    }

    public final Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Integer num = this.selectedIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        OnBackConfigDTO onBackConfigDTO = this.onBackConfig;
        return hashCode2 + (onBackConfigDTO != null ? onBackConfigDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReviewGalleryV2DTO(items=" + this.items + ", selectedIndex=" + this.selectedIndex + ", onBackConfig=" + this.onBackConfig + ")";
    }
}
