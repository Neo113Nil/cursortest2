package ru.ozon.app.android.ugc.widgets.rateItemsV2.data;

import B3.p;
import B4.V;
import B90.C2618u;
import D3.g;
import Ns.b;
import Xc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.pdp.common.ugc.timer.TimerDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import spay.sdk.domain.model.FraudMonInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\u0006/01234Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jt\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\bHÖ\u0001J\t\u0010.\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00065"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItemsHeader;", "items", "", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItem;", "separatorHeight", "", "widgetPageKey", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "strokeColor", "scrollType", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;", "<init>", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItemsHeader;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;)V", "getHeader", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItemsHeader;", "getItems", "()Ljava/util/List;", "getSeparatorHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidgetPageKey", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getStrokeColor", "getScrollType", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItemsHeader;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;)Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO;", "equals", "", "other", "hashCode", "toString", "RateItem", "RatingActionDTO", "RateItemCommon", "RateItemsHeader", "HideButtonDTO", "ScrollType", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RateItemsV2DTO {
    public static final int $stable = 8;
    private final RateItemsHeader header;

    @NotNull
    private final List<RateItem> items;
    private final ScrollType scrollType;
    private final Integer separatorHeight;
    private final String strokeColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final String widgetPageKey;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$HideButtonDTO;", "", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "leftPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HideButtonDTO {
        public static final int $stable = IconButtonV3DTO.$stable;

        @NotNull
        private final IconButtonV3DTO iconButton;
        private final Paddings leftPadding;

        @NotNull
        private final TextDTO title;

        public HideButtonDTO(@NotNull IconButtonV3DTO iconButton, @NotNull TextDTO title, Paddings paddings) {
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            Intrinsics.checkNotNullParameter(title, "title");
            this.iconButton = iconButton;
            this.title = title;
            this.leftPadding = paddings;
        }

        public static /* synthetic */ HideButtonDTO copy$default(HideButtonDTO hideButtonDTO, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonV3DTO = hideButtonDTO.iconButton;
            }
            if ((i11 & 2) != 0) {
                textDTO = hideButtonDTO.title;
            }
            if ((i11 & 4) != 0) {
                paddings = hideButtonDTO.leftPadding;
            }
            return hideButtonDTO.copy(iconButtonV3DTO, textDTO, paddings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final HideButtonDTO copy(@NotNull IconButtonV3DTO iconButton, @NotNull TextDTO title, Paddings leftPadding) {
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            Intrinsics.checkNotNullParameter(title, "title");
            return new HideButtonDTO(iconButton, title, leftPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HideButtonDTO)) {
                return false;
            }
            HideButtonDTO hideButtonDTO = (HideButtonDTO) other;
            return Intrinsics.d(this.iconButton, hideButtonDTO.iconButton) && Intrinsics.d(this.title, hideButtonDTO.title) && this.leftPadding == hideButtonDTO.leftPadding;
        }

        @NotNull
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.iconButton.hashCode() * 31, 31);
            Paddings paddings = this.leftPadding;
            return a11 + (paddings == null ? 0 : paddings.hashCode());
        }

        @NotNull
        public String toString() {
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            TextDTO textDTO = this.title;
            Paddings paddings = this.leftPadding;
            StringBuilder sb2 = new StringBuilder("HideButtonDTO(iconButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", leftPadding=");
            return D40.b.b(sb2, paddings, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItem;", "", "<init>", "()V", "RateProductItem", "RateReviewsItem", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItem$RateProductItem;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItem$RateReviewsItem;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class RateItem {
        public static final int $stable = 0;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003Jw\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItem$RateProductItem;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItem;", "productMedia", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "rating", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "sku", "", "rateItemCommon", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItemCommon;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "hideButton", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$HideButtonDTO;", "headerTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/pdp/common/ugc/timer/TimerDTO;", "ratingActions", "", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RatingActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItemCommon;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$HideButtonDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/common/ugc/timer/TimerDTO;Ljava/util/List;)V", "getProductMedia", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getSku", "()Ljava/lang/String;", "getRateItemCommon", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItemCommon;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getHideButton", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$HideButtonDTO;", "getHeaderTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTimer", "()Lru/ozon/app/android/pdp/common/ugc/timer/TimerDTO;", "getRatingActions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RateProductItem extends RateItem {
            public static final int $stable = 8;
            private final BadgeDTO badge;
            private final TextDTO headerTitle;
            private final HideButtonDTO hideButton;

            @NotNull
            private final ProductMediaDTO productMedia;
            private final RateItemCommon rateItemCommon;

            @NotNull
            private final RatingDTO rating;
            private final List<RatingActionDTO> ratingActions;
            private final String sku;
            private final TimerDTO timer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RateProductItem(@NotNull ProductMediaDTO productMedia, @NotNull RatingDTO rating, String str, RateItemCommon rateItemCommon, BadgeDTO badgeDTO, HideButtonDTO hideButtonDTO, TextDTO textDTO, TimerDTO timerDTO, List<RatingActionDTO> list) {
                super(null);
                Intrinsics.checkNotNullParameter(productMedia, "productMedia");
                Intrinsics.checkNotNullParameter(rating, "rating");
                this.productMedia = productMedia;
                this.rating = rating;
                this.sku = str;
                this.rateItemCommon = rateItemCommon;
                this.badge = badgeDTO;
                this.hideButton = hideButtonDTO;
                this.headerTitle = textDTO;
                this.timer = timerDTO;
                this.ratingActions = list;
            }

            public static /* synthetic */ RateProductItem copy$default(RateProductItem rateProductItem, ProductMediaDTO productMediaDTO, RatingDTO ratingDTO, String str, RateItemCommon rateItemCommon, BadgeDTO badgeDTO, HideButtonDTO hideButtonDTO, TextDTO textDTO, TimerDTO timerDTO, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    productMediaDTO = rateProductItem.productMedia;
                }
                if ((i11 & 2) != 0) {
                    ratingDTO = rateProductItem.rating;
                }
                if ((i11 & 4) != 0) {
                    str = rateProductItem.sku;
                }
                if ((i11 & 8) != 0) {
                    rateItemCommon = rateProductItem.rateItemCommon;
                }
                if ((i11 & 16) != 0) {
                    badgeDTO = rateProductItem.badge;
                }
                if ((i11 & 32) != 0) {
                    hideButtonDTO = rateProductItem.hideButton;
                }
                if ((i11 & 64) != 0) {
                    textDTO = rateProductItem.headerTitle;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    timerDTO = rateProductItem.timer;
                }
                if ((i11 & 256) != 0) {
                    list = rateProductItem.ratingActions;
                }
                TimerDTO timerDTO2 = timerDTO;
                List list2 = list;
                HideButtonDTO hideButtonDTO2 = hideButtonDTO;
                TextDTO textDTO2 = textDTO;
                BadgeDTO badgeDTO2 = badgeDTO;
                String str2 = str;
                return rateProductItem.copy(productMediaDTO, ratingDTO, str2, rateItemCommon, badgeDTO2, hideButtonDTO2, textDTO2, timerDTO2, list2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ProductMediaDTO getProductMedia() {
                return this.productMedia;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final RatingDTO getRating() {
                return this.rating;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSku() {
                return this.sku;
            }

            /* renamed from: component4, reason: from getter */
            public final RateItemCommon getRateItemCommon() {
                return this.rateItemCommon;
            }

            /* renamed from: component5, reason: from getter */
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            /* renamed from: component6, reason: from getter */
            public final HideButtonDTO getHideButton() {
                return this.hideButton;
            }

            /* renamed from: component7, reason: from getter */
            public final TextDTO getHeaderTitle() {
                return this.headerTitle;
            }

            /* renamed from: component8, reason: from getter */
            public final TimerDTO getTimer() {
                return this.timer;
            }

            public final List<RatingActionDTO> component9() {
                return this.ratingActions;
            }

            @NotNull
            public final RateProductItem copy(@NotNull ProductMediaDTO productMedia, @NotNull RatingDTO rating, String sku, RateItemCommon rateItemCommon, BadgeDTO badge, HideButtonDTO hideButton, TextDTO headerTitle, TimerDTO timer, List<RatingActionDTO> ratingActions) {
                Intrinsics.checkNotNullParameter(productMedia, "productMedia");
                Intrinsics.checkNotNullParameter(rating, "rating");
                return new RateProductItem(productMedia, rating, sku, rateItemCommon, badge, hideButton, headerTitle, timer, ratingActions);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RateProductItem)) {
                    return false;
                }
                RateProductItem rateProductItem = (RateProductItem) other;
                return Intrinsics.d(this.productMedia, rateProductItem.productMedia) && Intrinsics.d(this.rating, rateProductItem.rating) && Intrinsics.d(this.sku, rateProductItem.sku) && Intrinsics.d(this.rateItemCommon, rateProductItem.rateItemCommon) && Intrinsics.d(this.badge, rateProductItem.badge) && Intrinsics.d(this.hideButton, rateProductItem.hideButton) && Intrinsics.d(this.headerTitle, rateProductItem.headerTitle) && Intrinsics.d(this.timer, rateProductItem.timer) && Intrinsics.d(this.ratingActions, rateProductItem.ratingActions);
            }

            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public final TextDTO getHeaderTitle() {
                return this.headerTitle;
            }

            public final HideButtonDTO getHideButton() {
                return this.hideButton;
            }

            @NotNull
            public final ProductMediaDTO getProductMedia() {
                return this.productMedia;
            }

            public final RateItemCommon getRateItemCommon() {
                return this.rateItemCommon;
            }

            @NotNull
            public final RatingDTO getRating() {
                return this.rating;
            }

            public final List<RatingActionDTO> getRatingActions() {
                return this.ratingActions;
            }

            public final String getSku() {
                return this.sku;
            }

            public final TimerDTO getTimer() {
                return this.timer;
            }

            public int hashCode() {
                int hashCode = (this.rating.hashCode() + (this.productMedia.hashCode() * 31)) * 31;
                String str = this.sku;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                RateItemCommon rateItemCommon = this.rateItemCommon;
                int hashCode3 = (hashCode2 + (rateItemCommon == null ? 0 : rateItemCommon.hashCode())) * 31;
                BadgeDTO badgeDTO = this.badge;
                int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
                HideButtonDTO hideButtonDTO = this.hideButton;
                int hashCode5 = (hashCode4 + (hideButtonDTO == null ? 0 : hideButtonDTO.hashCode())) * 31;
                TextDTO textDTO = this.headerTitle;
                int hashCode6 = (hashCode5 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                TimerDTO timerDTO = this.timer;
                int hashCode7 = (hashCode6 + (timerDTO == null ? 0 : timerDTO.hashCode())) * 31;
                List<RatingActionDTO> list = this.ratingActions;
                return hashCode7 + (list != null ? list.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                ProductMediaDTO productMediaDTO = this.productMedia;
                RatingDTO ratingDTO = this.rating;
                String str = this.sku;
                RateItemCommon rateItemCommon = this.rateItemCommon;
                BadgeDTO badgeDTO = this.badge;
                HideButtonDTO hideButtonDTO = this.hideButton;
                TextDTO textDTO = this.headerTitle;
                TimerDTO timerDTO = this.timer;
                List<RatingActionDTO> list = this.ratingActions;
                StringBuilder sb2 = new StringBuilder("RateProductItem(productMedia=");
                sb2.append(productMediaDTO);
                sb2.append(", rating=");
                sb2.append(ratingDTO);
                sb2.append(", sku=");
                sb2.append(str);
                sb2.append(", rateItemCommon=");
                sb2.append(rateItemCommon);
                sb2.append(", badge=");
                sb2.append(badgeDTO);
                sb2.append(", hideButton=");
                sb2.append(hideButtonDTO);
                sb2.append(", headerTitle=");
                sb2.append(textDTO);
                sb2.append(", timer=");
                sb2.append(timerDTO);
                sb2.append(", ratingActions=");
                return C2618u.h(sb2, list, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItem$RateReviewsItem;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItem;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "rateItemCommon", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItemCommon;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItemCommon;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRateItemCommon", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItemCommon;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RateReviewsItem extends RateItem {
            public static final int $stable = 8;

            @NotNull
            private final IconDTO icon;
            private final RateItemCommon rateItemCommon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RateReviewsItem(@NotNull IconDTO icon, RateItemCommon rateItemCommon) {
                super(null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.rateItemCommon = rateItemCommon;
            }

            public static /* synthetic */ RateReviewsItem copy$default(RateReviewsItem rateReviewsItem, IconDTO iconDTO, RateItemCommon rateItemCommon, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    iconDTO = rateReviewsItem.icon;
                }
                if ((i11 & 2) != 0) {
                    rateItemCommon = rateReviewsItem.rateItemCommon;
                }
                return rateReviewsItem.copy(iconDTO, rateItemCommon);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final IconDTO getIcon() {
                return this.icon;
            }

            /* renamed from: component2, reason: from getter */
            public final RateItemCommon getRateItemCommon() {
                return this.rateItemCommon;
            }

            @NotNull
            public final RateReviewsItem copy(@NotNull IconDTO icon, RateItemCommon rateItemCommon) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                return new RateReviewsItem(icon, rateItemCommon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RateReviewsItem)) {
                    return false;
                }
                RateReviewsItem rateReviewsItem = (RateReviewsItem) other;
                return Intrinsics.d(this.icon, rateReviewsItem.icon) && Intrinsics.d(this.rateItemCommon, rateReviewsItem.rateItemCommon);
            }

            @NotNull
            public final IconDTO getIcon() {
                return this.icon;
            }

            public final RateItemCommon getRateItemCommon() {
                return this.rateItemCommon;
            }

            public int hashCode() {
                int hashCode = this.icon.hashCode() * 31;
                RateItemCommon rateItemCommon = this.rateItemCommon;
                return hashCode + (rateItemCommon == null ? 0 : rateItemCommon.hashCode());
            }

            @NotNull
            public String toString() {
                return "RateReviewsItem(icon=" + this.icon + ", rateItemCommon=" + this.rateItemCommon + ")";
            }
        }

        public /* synthetic */ RateItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private RateItem() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jg\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItemCommon;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "strokeColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "titleAction", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getStrokeColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTitleAction", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RateItemCommon {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final CellDTO cell;
        private final String strokeColor;

        @NotNull
        private final TextDTO title;
        private final AtomActionDTO titleAction;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public RateItemCommon(@NotNull TextDTO title, String str, String str2, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, AtomActionDTO atomActionDTO2, CellDTO cellDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.backgroundColor = str;
            this.strokeColor = str2;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.titleAction = atomActionDTO2;
            this.cell = cellDTO;
        }

        public static /* synthetic */ RateItemCommon copy$default(RateItemCommon rateItemCommon, TextDTO textDTO, String str, String str2, AtomActionDTO atomActionDTO, Map map, AtomActionDTO atomActionDTO2, CellDTO cellDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = rateItemCommon.title;
            }
            if ((i11 & 2) != 0) {
                str = rateItemCommon.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                str2 = rateItemCommon.strokeColor;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = rateItemCommon.action;
            }
            if ((i11 & 16) != 0) {
                map = rateItemCommon.trackingInfo;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO2 = rateItemCommon.titleAction;
            }
            if ((i11 & 64) != 0) {
                cellDTO = rateItemCommon.cell;
            }
            AtomActionDTO atomActionDTO3 = atomActionDTO2;
            CellDTO cellDTO2 = cellDTO;
            Map map2 = map;
            String str3 = str2;
            return rateItemCommon.copy(textDTO, str, str3, atomActionDTO, map2, atomActionDTO3, cellDTO2);
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
        public final String getStrokeColor() {
            return this.strokeColor;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getTitleAction() {
            return this.titleAction;
        }

        /* renamed from: component7, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        @NotNull
        public final RateItemCommon copy(@NotNull TextDTO title, String backgroundColor, String strokeColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, AtomActionDTO titleAction, CellDTO cell) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new RateItemCommon(title, backgroundColor, strokeColor, action, trackingInfo, titleAction, cell);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RateItemCommon)) {
                return false;
            }
            RateItemCommon rateItemCommon = (RateItemCommon) other;
            return Intrinsics.d(this.title, rateItemCommon.title) && Intrinsics.d(this.backgroundColor, rateItemCommon.backgroundColor) && Intrinsics.d(this.strokeColor, rateItemCommon.strokeColor) && Intrinsics.d(this.action, rateItemCommon.action) && Intrinsics.d(this.trackingInfo, rateItemCommon.trackingInfo) && Intrinsics.d(this.titleAction, rateItemCommon.titleAction) && Intrinsics.d(this.cell, rateItemCommon.cell);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CellDTO getCell() {
            return this.cell;
        }

        public final String getStrokeColor() {
            return this.strokeColor;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final AtomActionDTO getTitleAction() {
            return this.titleAction;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.strokeColor;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            AtomActionDTO atomActionDTO2 = this.titleAction;
            int hashCode6 = (hashCode5 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
            CellDTO cellDTO = this.cell;
            return hashCode6 + (cellDTO != null ? cellDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            String str = this.backgroundColor;
            String str2 = this.strokeColor;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            AtomActionDTO atomActionDTO2 = this.titleAction;
            CellDTO cellDTO = this.cell;
            StringBuilder f7 = g.f("RateItemCommon(title=", textDTO, ", backgroundColor=", str, ", strokeColor=");
            p.c(str2, ", action=", ", trackingInfo=", f7, atomActionDTO);
            f7.append(map);
            f7.append(", titleAction=");
            f7.append(atomActionDTO2);
            f7.append(", cell=");
            f7.append(cellDTO);
            f7.append(")");
            return f7.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItemsHeader;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RateItemsHeader {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final IconButtonV3DTO iconButton;

        @NotNull
        private final TextDTO title;

        public RateItemsHeader(@NotNull TextDTO title, IconButtonV3DTO iconButtonV3DTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.iconButton = iconButtonV3DTO;
        }

        public static /* synthetic */ RateItemsHeader copy$default(RateItemsHeader rateItemsHeader, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = rateItemsHeader.title;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO = rateItemsHeader.iconButton;
            }
            return rateItemsHeader.copy(textDTO, iconButtonV3DTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        public final RateItemsHeader copy(@NotNull TextDTO title, IconButtonV3DTO iconButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new RateItemsHeader(title, iconButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RateItemsHeader)) {
                return false;
            }
            RateItemsHeader rateItemsHeader = (RateItemsHeader) other;
            return Intrinsics.d(this.title, rateItemsHeader.title) && Intrinsics.d(this.iconButton, rateItemsHeader.iconButton);
        }

        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            return hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "RateItemsHeader(title=" + this.title + ", iconButton=" + this.iconButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RatingActionDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RatingActionDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final Map<String, TokenizedTrackingInfo> tracking;

        public RatingActionDTO(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            this.action = atomActionDTO;
            this.tracking = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RatingActionDTO copy$default(RatingActionDTO ratingActionDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = ratingActionDTO.action;
            }
            if ((i11 & 2) != 0) {
                map = ratingActionDTO.tracking;
            }
            return ratingActionDTO.copy(atomActionDTO, map);
        }

        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.tracking;
        }

        @NotNull
        public final RatingActionDTO copy(AtomActionDTO action, Map<String, TokenizedTrackingInfo> tracking) {
            return new RatingActionDTO(action, tracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RatingActionDTO)) {
                return false;
            }
            RatingActionDTO ratingActionDTO = (RatingActionDTO) other;
            return Intrinsics.d(this.action, ratingActionDTO.action) && Intrinsics.d(this.tracking, ratingActionDTO.tracking);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> getTracking() {
            return this.tracking;
        }

        public int hashCode() {
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "RatingActionDTO(action=" + this.action + ", tracking=" + this.tracking + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;", "", "<init>", "(Ljava/lang/String;I)V", FraudMonInfo.UNKNOWN, "PINNED_SCROLL", "ONE_BY_ONE", "ONE_BY_ONE_WITH_SCROLL", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ScrollType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ScrollType[] $VALUES;
        public static final ScrollType UNKNOWN = new ScrollType(FraudMonInfo.UNKNOWN, 0);
        public static final ScrollType PINNED_SCROLL = new ScrollType("PINNED_SCROLL", 1);
        public static final ScrollType ONE_BY_ONE = new ScrollType("ONE_BY_ONE", 2);
        public static final ScrollType ONE_BY_ONE_WITH_SCROLL = new ScrollType("ONE_BY_ONE_WITH_SCROLL", 3);

        private static final /* synthetic */ ScrollType[] $values() {
            return new ScrollType[]{UNKNOWN, PINNED_SCROLL, ONE_BY_ONE, ONE_BY_ONE_WITH_SCROLL};
        }

        static {
            ScrollType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private ScrollType(String str, int i11) {
        }

        public static ScrollType valueOf(String str) {
            return (ScrollType) Enum.valueOf(ScrollType.class, str);
        }

        public static ScrollType[] values() {
            return (ScrollType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RateItemsV2DTO(RateItemsHeader rateItemsHeader, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "productItem", name = "CONTENT_TYPE_PRODUCT_ITEM", type = RateItem.RateProductItem.class), @ProtoOneOfSignature(fieldName = "reviewsItem", name = "CONTENT_TYPE_REVIEWS_ITEM", type = RateItem.RateReviewsItem.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends RateItem> items, Integer num, String str, Map<String, TokenizedTrackingInfo> map, String str2, ScrollType scrollType) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.header = rateItemsHeader;
        this.items = items;
        this.separatorHeight = num;
        this.widgetPageKey = str;
        this.trackingInfo = map;
        this.strokeColor = str2;
        this.scrollType = scrollType;
    }

    public static /* synthetic */ RateItemsV2DTO copy$default(RateItemsV2DTO rateItemsV2DTO, RateItemsHeader rateItemsHeader, List list, Integer num, String str, Map map, String str2, ScrollType scrollType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rateItemsHeader = rateItemsV2DTO.header;
        }
        if ((i11 & 2) != 0) {
            list = rateItemsV2DTO.items;
        }
        if ((i11 & 4) != 0) {
            num = rateItemsV2DTO.separatorHeight;
        }
        if ((i11 & 8) != 0) {
            str = rateItemsV2DTO.widgetPageKey;
        }
        if ((i11 & 16) != 0) {
            map = rateItemsV2DTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            str2 = rateItemsV2DTO.strokeColor;
        }
        if ((i11 & 64) != 0) {
            scrollType = rateItemsV2DTO.scrollType;
        }
        String str3 = str2;
        ScrollType scrollType2 = scrollType;
        Map map2 = map;
        Integer num2 = num;
        return rateItemsV2DTO.copy(rateItemsHeader, list, num2, str, map2, str3, scrollType2);
    }

    /* renamed from: component1, reason: from getter */
    public final RateItemsHeader getHeader() {
        return this.header;
    }

    @NotNull
    public final List<RateItem> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getSeparatorHeight() {
        return this.separatorHeight;
    }

    /* renamed from: component4, reason: from getter */
    public final String getWidgetPageKey() {
        return this.widgetPageKey;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStrokeColor() {
        return this.strokeColor;
    }

    /* renamed from: component7, reason: from getter */
    public final ScrollType getScrollType() {
        return this.scrollType;
    }

    @NotNull
    public final RateItemsV2DTO copy(RateItemsHeader header, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "productItem", name = "CONTENT_TYPE_PRODUCT_ITEM", type = RateItem.RateProductItem.class), @ProtoOneOfSignature(fieldName = "reviewsItem", name = "CONTENT_TYPE_REVIEWS_ITEM", type = RateItem.RateReviewsItem.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends RateItem> items, Integer separatorHeight, String widgetPageKey, Map<String, TokenizedTrackingInfo> trackingInfo, String strokeColor, ScrollType scrollType) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new RateItemsV2DTO(header, items, separatorHeight, widgetPageKey, trackingInfo, strokeColor, scrollType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateItemsV2DTO)) {
            return false;
        }
        RateItemsV2DTO rateItemsV2DTO = (RateItemsV2DTO) other;
        return Intrinsics.d(this.header, rateItemsV2DTO.header) && Intrinsics.d(this.items, rateItemsV2DTO.items) && Intrinsics.d(this.separatorHeight, rateItemsV2DTO.separatorHeight) && Intrinsics.d(this.widgetPageKey, rateItemsV2DTO.widgetPageKey) && Intrinsics.d(this.trackingInfo, rateItemsV2DTO.trackingInfo) && Intrinsics.d(this.strokeColor, rateItemsV2DTO.strokeColor) && this.scrollType == rateItemsV2DTO.scrollType;
    }

    public final RateItemsHeader getHeader() {
        return this.header;
    }

    @NotNull
    public final List<RateItem> getItems() {
        return this.items;
    }

    public final ScrollType getScrollType() {
        return this.scrollType;
    }

    public final Integer getSeparatorHeight() {
        return this.separatorHeight;
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final String getWidgetPageKey() {
        return this.widgetPageKey;
    }

    public int hashCode() {
        RateItemsHeader rateItemsHeader = this.header;
        int b11 = G.g.b((rateItemsHeader == null ? 0 : rateItemsHeader.hashCode()) * 31, 31, this.items);
        Integer num = this.separatorHeight;
        int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.widgetPageKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.strokeColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ScrollType scrollType = this.scrollType;
        return hashCode4 + (scrollType != null ? scrollType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        RateItemsHeader rateItemsHeader = this.header;
        List<RateItem> list = this.items;
        Integer num = this.separatorHeight;
        String str = this.widgetPageKey;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str2 = this.strokeColor;
        ScrollType scrollType = this.scrollType;
        StringBuilder sb2 = new StringBuilder("RateItemsV2DTO(header=");
        sb2.append(rateItemsHeader);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", separatorHeight=");
        V.f(num, ", widgetPageKey=", str, ", trackingInfo=", sb2);
        sb2.append(map);
        sb2.append(", strokeColor=");
        sb2.append(str2);
        sb2.append(", scrollType=");
        sb2.append(scrollType);
        sb2.append(")");
        return sb2.toString();
    }
}
