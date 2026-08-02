package ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.data;

import B90.C2616s;
import G.g;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.models.UniRadiusToken;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u000489:;Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010$J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u0088\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0010\u0010$R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006<"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO;", "", "gridType", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$GridType;", "items", "", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Item;", "backgroundColor", "", "itemsSpacing", "Lru/ozon/uni/core/models/UniPaddingToken;", "paddings", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Paddings;", "cornerRadii", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$CornerRadii;", "badgeTopRightMargin", "isTextInsideCard", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$GridType;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Paddings;Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$CornerRadii;Lru/ozon/uni/core/models/UniPaddingToken;Ljava/lang/Boolean;Ljava/util/Map;)V", "getGridType", "()Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$GridType;", "getItems", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getItemsSpacing", "()Lru/ozon/uni/core/models/UniPaddingToken;", "getPaddings", "()Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Paddings;", "getCornerRadii", "()Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$CornerRadii;", "getBadgeTopRightMargin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$GridType;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Paddings;Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$CornerRadii;Lru/ozon/uni/core/models/UniPaddingToken;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO;", "equals", "other", "hashCode", "", "toString", "Item", "CornerRadii", "Paddings", "GridType", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CommonLayoutGridDTO {
    public static final int $stable = 0;
    private final String backgroundColor;
    private final UniPaddingToken badgeTopRightMargin;
    private final CornerRadii cornerRadii;

    @NotNull
    private final GridType gridType;
    private final Boolean isTextInsideCard;

    @NotNull
    private final List<Item> items;
    private final UniPaddingToken itemsSpacing;
    private final Paddings paddings;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$CornerRadii;", "", "topLeftCornerRadius", "Lru/ozon/uni/core/models/UniRadiusToken;", "topRightCornerRadius", "bottomLeftCornerRadius", "bottomRightCornerRadius", "<init>", "(Lru/ozon/uni/core/models/UniRadiusToken;Lru/ozon/uni/core/models/UniRadiusToken;Lru/ozon/uni/core/models/UniRadiusToken;Lru/ozon/uni/core/models/UniRadiusToken;)V", "getTopLeftCornerRadius", "()Lru/ozon/uni/core/models/UniRadiusToken;", "getTopRightCornerRadius", "getBottomLeftCornerRadius", "getBottomRightCornerRadius", "isEmpty", "", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CornerRadii {
        public static final int $stable = UniRadiusToken.$stable;
        private final UniRadiusToken bottomLeftCornerRadius;
        private final UniRadiusToken bottomRightCornerRadius;
        private final boolean isEmpty;
        private final UniRadiusToken topLeftCornerRadius;
        private final UniRadiusToken topRightCornerRadius;

        public CornerRadii(UniRadiusToken uniRadiusToken, UniRadiusToken uniRadiusToken2, UniRadiusToken uniRadiusToken3, UniRadiusToken uniRadiusToken4) {
            this.topLeftCornerRadius = uniRadiusToken;
            this.topRightCornerRadius = uniRadiusToken2;
            this.bottomLeftCornerRadius = uniRadiusToken3;
            this.bottomRightCornerRadius = uniRadiusToken4;
            this.isEmpty = uniRadiusToken == null && uniRadiusToken2 == null && uniRadiusToken3 == null && uniRadiusToken4 == null;
        }

        public static /* synthetic */ CornerRadii copy$default(CornerRadii cornerRadii, UniRadiusToken uniRadiusToken, UniRadiusToken uniRadiusToken2, UniRadiusToken uniRadiusToken3, UniRadiusToken uniRadiusToken4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uniRadiusToken = cornerRadii.topLeftCornerRadius;
            }
            if ((i11 & 2) != 0) {
                uniRadiusToken2 = cornerRadii.topRightCornerRadius;
            }
            if ((i11 & 4) != 0) {
                uniRadiusToken3 = cornerRadii.bottomLeftCornerRadius;
            }
            if ((i11 & 8) != 0) {
                uniRadiusToken4 = cornerRadii.bottomRightCornerRadius;
            }
            return cornerRadii.copy(uniRadiusToken, uniRadiusToken2, uniRadiusToken3, uniRadiusToken4);
        }

        /* renamed from: component1, reason: from getter */
        public final UniRadiusToken getTopLeftCornerRadius() {
            return this.topLeftCornerRadius;
        }

        /* renamed from: component2, reason: from getter */
        public final UniRadiusToken getTopRightCornerRadius() {
            return this.topRightCornerRadius;
        }

        /* renamed from: component3, reason: from getter */
        public final UniRadiusToken getBottomLeftCornerRadius() {
            return this.bottomLeftCornerRadius;
        }

        /* renamed from: component4, reason: from getter */
        public final UniRadiusToken getBottomRightCornerRadius() {
            return this.bottomRightCornerRadius;
        }

        @NotNull
        public final CornerRadii copy(UniRadiusToken topLeftCornerRadius, UniRadiusToken topRightCornerRadius, UniRadiusToken bottomLeftCornerRadius, UniRadiusToken bottomRightCornerRadius) {
            return new CornerRadii(topLeftCornerRadius, topRightCornerRadius, bottomLeftCornerRadius, bottomRightCornerRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CornerRadii)) {
                return false;
            }
            CornerRadii cornerRadii = (CornerRadii) other;
            return Intrinsics.d(this.topLeftCornerRadius, cornerRadii.topLeftCornerRadius) && Intrinsics.d(this.topRightCornerRadius, cornerRadii.topRightCornerRadius) && Intrinsics.d(this.bottomLeftCornerRadius, cornerRadii.bottomLeftCornerRadius) && Intrinsics.d(this.bottomRightCornerRadius, cornerRadii.bottomRightCornerRadius);
        }

        public final UniRadiusToken getBottomLeftCornerRadius() {
            return this.bottomLeftCornerRadius;
        }

        public final UniRadiusToken getBottomRightCornerRadius() {
            return this.bottomRightCornerRadius;
        }

        public final UniRadiusToken getTopLeftCornerRadius() {
            return this.topLeftCornerRadius;
        }

        public final UniRadiusToken getTopRightCornerRadius() {
            return this.topRightCornerRadius;
        }

        public int hashCode() {
            UniRadiusToken uniRadiusToken = this.topLeftCornerRadius;
            int hashCode = (uniRadiusToken == null ? 0 : uniRadiusToken.hashCode()) * 31;
            UniRadiusToken uniRadiusToken2 = this.topRightCornerRadius;
            int hashCode2 = (hashCode + (uniRadiusToken2 == null ? 0 : uniRadiusToken2.hashCode())) * 31;
            UniRadiusToken uniRadiusToken3 = this.bottomLeftCornerRadius;
            int hashCode3 = (hashCode2 + (uniRadiusToken3 == null ? 0 : uniRadiusToken3.hashCode())) * 31;
            UniRadiusToken uniRadiusToken4 = this.bottomRightCornerRadius;
            return hashCode3 + (uniRadiusToken4 != null ? uniRadiusToken4.hashCode() : 0);
        }

        /* renamed from: isEmpty, reason: from getter */
        public final boolean getIsEmpty() {
            return this.isEmpty;
        }

        @NotNull
        public String toString() {
            return "CornerRadii(topLeftCornerRadius=" + this.topLeftCornerRadius + ", topRightCornerRadius=" + this.topRightCornerRadius + ", bottomLeftCornerRadius=" + this.bottomLeftCornerRadius + ", bottomRightCornerRadius=" + this.bottomRightCornerRadius + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$GridType;", "", "count", "", "<init>", "(Ljava/lang/String;II)V", "getCount", "()I", "INVALID_STATE", "GRID1", "GRID2", "GRID3", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GridType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ GridType[] $VALUES;
        private final int count;
        public static final GridType INVALID_STATE = new GridType("INVALID_STATE", 0, 0);
        public static final GridType GRID1 = new GridType("GRID1", 1, 1);
        public static final GridType GRID2 = new GridType("GRID2", 2, 2);
        public static final GridType GRID3 = new GridType("GRID3", 3, 3);

        private static final /* synthetic */ GridType[] $values() {
            return new GridType[]{INVALID_STATE, GRID1, GRID2, GRID3};
        }

        static {
            GridType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private GridType(String str, int i11, int i12) {
            this.count = i12;
        }

        public static GridType valueOf(String str) {
            return (GridType) Enum.valueOf(GridType.class, str);
        }

        public static GridType[] values() {
            return (GridType[]) $VALUES.clone();
        }

        public final int getCount() {
            return this.count;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Paddings;", "", "leftPadding", "Lru/ozon/uni/core/models/UniPaddingToken;", "rightPadding", "topPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;)V", "getLeftPadding", "()Lru/ozon/uni/core/models/UniPaddingToken;", "getRightPadding", "getTopPadding", "getBottomPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Paddings {
        public static final int $stable = UniPaddingToken.$stable;
        private final UniPaddingToken bottomPadding;
        private final UniPaddingToken leftPadding;
        private final UniPaddingToken rightPadding;
        private final UniPaddingToken topPadding;

        public Paddings(UniPaddingToken uniPaddingToken, UniPaddingToken uniPaddingToken2, UniPaddingToken uniPaddingToken3, UniPaddingToken uniPaddingToken4) {
            this.leftPadding = uniPaddingToken;
            this.rightPadding = uniPaddingToken2;
            this.topPadding = uniPaddingToken3;
            this.bottomPadding = uniPaddingToken4;
        }

        public static /* synthetic */ Paddings copy$default(Paddings paddings, UniPaddingToken uniPaddingToken, UniPaddingToken uniPaddingToken2, UniPaddingToken uniPaddingToken3, UniPaddingToken uniPaddingToken4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uniPaddingToken = paddings.leftPadding;
            }
            if ((i11 & 2) != 0) {
                uniPaddingToken2 = paddings.rightPadding;
            }
            if ((i11 & 4) != 0) {
                uniPaddingToken3 = paddings.topPadding;
            }
            if ((i11 & 8) != 0) {
                uniPaddingToken4 = paddings.bottomPadding;
            }
            return paddings.copy(uniPaddingToken, uniPaddingToken2, uniPaddingToken3, uniPaddingToken4);
        }

        /* renamed from: component1, reason: from getter */
        public final UniPaddingToken getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final UniPaddingToken getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final UniPaddingToken getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final UniPaddingToken getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings copy(UniPaddingToken leftPadding, UniPaddingToken rightPadding, UniPaddingToken topPadding, UniPaddingToken bottomPadding) {
            return new Paddings(leftPadding, rightPadding, topPadding, bottomPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Paddings)) {
                return false;
            }
            Paddings paddings = (Paddings) other;
            return Intrinsics.d(this.leftPadding, paddings.leftPadding) && Intrinsics.d(this.rightPadding, paddings.rightPadding) && Intrinsics.d(this.topPadding, paddings.topPadding) && Intrinsics.d(this.bottomPadding, paddings.bottomPadding);
        }

        public final UniPaddingToken getBottomPadding() {
            return this.bottomPadding;
        }

        public final UniPaddingToken getLeftPadding() {
            return this.leftPadding;
        }

        public final UniPaddingToken getRightPadding() {
            return this.rightPadding;
        }

        public final UniPaddingToken getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            UniPaddingToken uniPaddingToken = this.leftPadding;
            int hashCode = (uniPaddingToken == null ? 0 : uniPaddingToken.hashCode()) * 31;
            UniPaddingToken uniPaddingToken2 = this.rightPadding;
            int hashCode2 = (hashCode + (uniPaddingToken2 == null ? 0 : uniPaddingToken2.hashCode())) * 31;
            UniPaddingToken uniPaddingToken3 = this.topPadding;
            int hashCode3 = (hashCode2 + (uniPaddingToken3 == null ? 0 : uniPaddingToken3.hashCode())) * 31;
            UniPaddingToken uniPaddingToken4 = this.bottomPadding;
            return hashCode3 + (uniPaddingToken4 != null ? uniPaddingToken4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Paddings(leftPadding=" + this.leftPadding + ", rightPadding=" + this.rightPadding + ", topPadding=" + this.topPadding + ", bottomPadding=" + this.bottomPadding + ")";
        }
    }

    public CommonLayoutGridDTO(@NotNull GridType gridType, @NotNull List<Item> items, String str, UniPaddingToken uniPaddingToken, Paddings paddings, CornerRadii cornerRadii, UniPaddingToken uniPaddingToken2, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(gridType, "gridType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.gridType = gridType;
        this.items = items;
        this.backgroundColor = str;
        this.itemsSpacing = uniPaddingToken;
        this.paddings = paddings;
        this.cornerRadii = cornerRadii;
        this.badgeTopRightMargin = uniPaddingToken2;
        this.isTextInsideCard = bool;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CommonLayoutGridDTO copy$default(CommonLayoutGridDTO commonLayoutGridDTO, GridType gridType, List list, String str, UniPaddingToken uniPaddingToken, Paddings paddings, CornerRadii cornerRadii, UniPaddingToken uniPaddingToken2, Boolean bool, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gridType = commonLayoutGridDTO.gridType;
        }
        if ((i11 & 2) != 0) {
            list = commonLayoutGridDTO.items;
        }
        if ((i11 & 4) != 0) {
            str = commonLayoutGridDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            uniPaddingToken = commonLayoutGridDTO.itemsSpacing;
        }
        if ((i11 & 16) != 0) {
            paddings = commonLayoutGridDTO.paddings;
        }
        if ((i11 & 32) != 0) {
            cornerRadii = commonLayoutGridDTO.cornerRadii;
        }
        if ((i11 & 64) != 0) {
            uniPaddingToken2 = commonLayoutGridDTO.badgeTopRightMargin;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            bool = commonLayoutGridDTO.isTextInsideCard;
        }
        if ((i11 & 256) != 0) {
            map = commonLayoutGridDTO.trackingInfo;
        }
        Boolean bool2 = bool;
        Map map2 = map;
        CornerRadii cornerRadii2 = cornerRadii;
        UniPaddingToken uniPaddingToken3 = uniPaddingToken2;
        Paddings paddings2 = paddings;
        String str2 = str;
        return commonLayoutGridDTO.copy(gridType, list, str2, uniPaddingToken, paddings2, cornerRadii2, uniPaddingToken3, bool2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final GridType getGridType() {
        return this.gridType;
    }

    @NotNull
    public final List<Item> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final UniPaddingToken getItemsSpacing() {
        return this.itemsSpacing;
    }

    /* renamed from: component5, reason: from getter */
    public final Paddings getPaddings() {
        return this.paddings;
    }

    /* renamed from: component6, reason: from getter */
    public final CornerRadii getCornerRadii() {
        return this.cornerRadii;
    }

    /* renamed from: component7, reason: from getter */
    public final UniPaddingToken getBadgeTopRightMargin() {
        return this.badgeTopRightMargin;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsTextInsideCard() {
        return this.isTextInsideCard;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final CommonLayoutGridDTO copy(@NotNull GridType gridType, @NotNull List<Item> items, String backgroundColor, UniPaddingToken itemsSpacing, Paddings paddings, CornerRadii cornerRadii, UniPaddingToken badgeTopRightMargin, Boolean isTextInsideCard, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(gridType, "gridType");
        Intrinsics.checkNotNullParameter(items, "items");
        return new CommonLayoutGridDTO(gridType, items, backgroundColor, itemsSpacing, paddings, cornerRadii, badgeTopRightMargin, isTextInsideCard, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonLayoutGridDTO)) {
            return false;
        }
        CommonLayoutGridDTO commonLayoutGridDTO = (CommonLayoutGridDTO) other;
        return this.gridType == commonLayoutGridDTO.gridType && Intrinsics.d(this.items, commonLayoutGridDTO.items) && Intrinsics.d(this.backgroundColor, commonLayoutGridDTO.backgroundColor) && Intrinsics.d(this.itemsSpacing, commonLayoutGridDTO.itemsSpacing) && Intrinsics.d(this.paddings, commonLayoutGridDTO.paddings) && Intrinsics.d(this.cornerRadii, commonLayoutGridDTO.cornerRadii) && Intrinsics.d(this.badgeTopRightMargin, commonLayoutGridDTO.badgeTopRightMargin) && Intrinsics.d(this.isTextInsideCard, commonLayoutGridDTO.isTextInsideCard) && Intrinsics.d(this.trackingInfo, commonLayoutGridDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final UniPaddingToken getBadgeTopRightMargin() {
        return this.badgeTopRightMargin;
    }

    public final CornerRadii getCornerRadii() {
        return this.cornerRadii;
    }

    @NotNull
    public final GridType getGridType() {
        return this.gridType;
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    public final UniPaddingToken getItemsSpacing() {
        return this.itemsSpacing;
    }

    public final Paddings getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.gridType.hashCode() * 31, 31, this.items);
        String str = this.backgroundColor;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        UniPaddingToken uniPaddingToken = this.itemsSpacing;
        int hashCode2 = (hashCode + (uniPaddingToken == null ? 0 : uniPaddingToken.hashCode())) * 31;
        Paddings paddings = this.paddings;
        int hashCode3 = (hashCode2 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        CornerRadii cornerRadii = this.cornerRadii;
        int hashCode4 = (hashCode3 + (cornerRadii == null ? 0 : cornerRadii.hashCode())) * 31;
        UniPaddingToken uniPaddingToken2 = this.badgeTopRightMargin;
        int hashCode5 = (hashCode4 + (uniPaddingToken2 == null ? 0 : uniPaddingToken2.hashCode())) * 31;
        Boolean bool = this.isTextInsideCard;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isTextInsideCard() {
        return this.isTextInsideCard;
    }

    @NotNull
    public String toString() {
        GridType gridType = this.gridType;
        List<Item> list = this.items;
        String str = this.backgroundColor;
        UniPaddingToken uniPaddingToken = this.itemsSpacing;
        Paddings paddings = this.paddings;
        CornerRadii cornerRadii = this.cornerRadii;
        UniPaddingToken uniPaddingToken2 = this.badgeTopRightMargin;
        Boolean bool = this.isTextInsideCard;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CommonLayoutGridDTO(gridType=");
        sb2.append(gridType);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", itemsSpacing=");
        sb2.append(uniPaddingToken);
        sb2.append(", paddings=");
        sb2.append(paddings);
        sb2.append(", cornerRadii=");
        sb2.append(cornerRadii);
        sb2.append(", badgeTopRightMargin=");
        sb2.append(uniPaddingToken2);
        sb2.append(", isTextInsideCard=");
        sb2.append(bool);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Jx\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\t\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Item;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "adBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "blurPlaceholderImage", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAdBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBlurPlaceholderImage", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Item;", "equals", "other", "hashCode", "", "toString", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 0;
        private final AtomActionDTO action;
        private final BadgeDTO adBadge;
        private final String blurPlaceholderImage;

        @NotNull
        private final ImageDTO image;
        private final Boolean isAdult;
        private final TextDTO subtitle;
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Item(@NotNull ImageDTO image, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, Boolean bool, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.adBadge = badgeDTO;
            this.isAdult = bool;
            this.blurPlaceholderImage = str;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Item copy$default(Item item, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, Boolean bool, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = item.image;
            }
            if ((i11 & 2) != 0) {
                textDTO = item.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = item.subtitle;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = item.adBadge;
            }
            if ((i11 & 16) != 0) {
                bool = item.isAdult;
            }
            if ((i11 & 32) != 0) {
                str = item.blurPlaceholderImage;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = item.action;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = item.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            Boolean bool2 = bool;
            String str2 = str;
            return item.copy(imageDTO, textDTO, textDTO2, badgeDTO, bool2, str2, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getAdBadge() {
            return this.adBadge;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIsAdult() {
            return this.isAdult;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBlurPlaceholderImage() {
            return this.blurPlaceholderImage;
        }

        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final Item copy(@NotNull ImageDTO image, TextDTO title, TextDTO subtitle, BadgeDTO adBadge, Boolean isAdult, String blurPlaceholderImage, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new Item(image, title, subtitle, adBadge, isAdult, blurPlaceholderImage, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.image, item.image) && Intrinsics.d(this.title, item.title) && Intrinsics.d(this.subtitle, item.subtitle) && Intrinsics.d(this.adBadge, item.adBadge) && Intrinsics.d(this.isAdult, item.isAdult) && Intrinsics.d(this.blurPlaceholderImage, item.blurPlaceholderImage) && Intrinsics.d(this.action, item.action) && Intrinsics.d(this.trackingInfo, item.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final BadgeDTO getAdBadge() {
            return this.adBadge;
        }

        public final String getBlurPlaceholderImage() {
            return this.blurPlaceholderImage;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            BadgeDTO badgeDTO = this.adBadge;
            int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            Boolean bool = this.isAdult;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.blurPlaceholderImage;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode7 = (hashCode6 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode7 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isAdult() {
            return this.isAdult;
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            BadgeDTO badgeDTO = this.adBadge;
            Boolean bool = this.isAdult;
            String str = this.blurPlaceholderImage;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C2616s.d("Item(image=", imageDTO, ", title=", textDTO, ", subtitle=");
            d11.append(textDTO2);
            d11.append(", adBadge=");
            d11.append(badgeDTO);
            d11.append(", isAdult=");
            HY.b.c(bool, ", blurPlaceholderImage=", str, ", action=", d11);
            return D40.a.d(d11, atomActionDTO, ", trackingInfo=", map, ")");
        }

        public /* synthetic */ Item(ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, Boolean bool, String str, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageDTO, textDTO, textDTO2, badgeDTO, (i11 & 16) != 0 ? Boolean.FALSE : bool, str, atomActionDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : map);
        }
    }

    public /* synthetic */ CommonLayoutGridDTO(GridType gridType, List list, String str, UniPaddingToken uniPaddingToken, Paddings paddings, CornerRadii cornerRadii, UniPaddingToken uniPaddingToken2, Boolean bool, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(gridType, list, str, uniPaddingToken, paddings, cornerRadii, uniPaddingToken2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Boolean.FALSE : bool, (i11 & 256) != 0 ? null : map);
    }
}
