package ru.ozon.app.android.ugc.widgets.selectionsList.data;

import T7.P;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.TileFooterContentDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002&'BI\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO;", "", "items", "", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO;", "horizontalPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "layout", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$LayoutType;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$LayoutType;Ljava/lang/String;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getLayout", "()Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$LayoutType;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "LayoutType", "SelectionsListItemDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionsListDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final CommonCellSettings.LayoutPadding horizontalPadding;

    @NotNull
    private final List<SelectionsListItemDTO> items;

    @NotNull
    private final LayoutType layout;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$LayoutType;", "", "<init>", "(Ljava/lang/String;I)V", "LAYOUT_UNKNOWN", "LAYOUT_SCROLL", "LAYOUT_GRID_2", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LayoutType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LayoutType[] $VALUES;
        public static final LayoutType LAYOUT_UNKNOWN = new LayoutType("LAYOUT_UNKNOWN", 0);
        public static final LayoutType LAYOUT_SCROLL = new LayoutType("LAYOUT_SCROLL", 1);
        public static final LayoutType LAYOUT_GRID_2 = new LayoutType("LAYOUT_GRID_2", 2);

        private static final /* synthetic */ LayoutType[] $values() {
            return new LayoutType[]{LAYOUT_UNKNOWN, LAYOUT_SCROLL, LAYOUT_GRID_2};
        }

        static {
            LayoutType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private LayoutType(String str, int i11) {
        }

        public static LayoutType valueOf(String str) {
            return (LayoutType) Enum.valueOf(LayoutType.class, str);
        }

        public static LayoutType[] values() {
            return (LayoutType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO;", "", "<init>", "()V", "Companion", "TileItem", "EmptyItem", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO$EmptyItem;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO$TileItem;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SelectionsListItemDTO {
        public static final int $stable = 0;

        @NotNull
        public static final String CONTENT_TYPE_BADGE = "CONTENT_TYPE_BADGE";

        @NotNull
        public static final String CONTENT_TYPE_EMPTY = "CONTENT_TYPE_EMPTY";

        @NotNull
        public static final String CONTENT_TYPE_FAVORITE_MOLECULE = "CONTENT_TYPE_FAVORITE_MOLECULE";

        @NotNull
        public static final String CONTENT_TYPE_PLAY_ICON = "CONTENT_TYPE_PLAY_ICON";

        @NotNull
        public static final String CONTENT_TYPE_SOCIAL_HEADER = "CONTENT_TYPE_SOCIAL_HEADER";

        @NotNull
        public static final String CONTENT_TYPE_TILE_ITEM = "CONTENT_TYPE_TILE_ITEM";

        @NotNull
        public static final String TYPE = "type";

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO$EmptyItem;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "overlayColor", "", "selectionItemCommon", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionItemCommon;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionItemCommon;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getOverlayColor", "()Ljava/lang/String;", "getSelectionItemCommon", "()Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionItemCommon;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EmptyItem extends SelectionsListItemDTO {
            public static final int $stable = 8;

            @NotNull
            private final IconDTO icon;
            private final String overlayColor;
            private final SelectionItemCommon selectionItemCommon;

            @NotNull
            private final TextDTO title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmptyItem(@NotNull IconDTO icon, @NotNull TextDTO title, String str, SelectionItemCommon selectionItemCommon) {
                super(null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                this.icon = icon;
                this.title = title;
                this.overlayColor = str;
                this.selectionItemCommon = selectionItemCommon;
            }

            public static /* synthetic */ EmptyItem copy$default(EmptyItem emptyItem, IconDTO iconDTO, TextDTO textDTO, String str, SelectionItemCommon selectionItemCommon, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    iconDTO = emptyItem.icon;
                }
                if ((i11 & 2) != 0) {
                    textDTO = emptyItem.title;
                }
                if ((i11 & 4) != 0) {
                    str = emptyItem.overlayColor;
                }
                if ((i11 & 8) != 0) {
                    selectionItemCommon = emptyItem.selectionItemCommon;
                }
                return emptyItem.copy(iconDTO, textDTO, str, selectionItemCommon);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final IconDTO getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final String getOverlayColor() {
                return this.overlayColor;
            }

            /* renamed from: component4, reason: from getter */
            public final SelectionItemCommon getSelectionItemCommon() {
                return this.selectionItemCommon;
            }

            @NotNull
            public final EmptyItem copy(@NotNull IconDTO icon, @NotNull TextDTO title, String overlayColor, SelectionItemCommon selectionItemCommon) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                return new EmptyItem(icon, title, overlayColor, selectionItemCommon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EmptyItem)) {
                    return false;
                }
                EmptyItem emptyItem = (EmptyItem) other;
                return Intrinsics.d(this.icon, emptyItem.icon) && Intrinsics.d(this.title, emptyItem.title) && Intrinsics.d(this.overlayColor, emptyItem.overlayColor) && Intrinsics.d(this.selectionItemCommon, emptyItem.selectionItemCommon);
            }

            @NotNull
            public final IconDTO getIcon() {
                return this.icon;
            }

            public final String getOverlayColor() {
                return this.overlayColor;
            }

            public final SelectionItemCommon getSelectionItemCommon() {
                return this.selectionItemCommon;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = Ns.b.a(this.title, this.icon.hashCode() * 31, 31);
                String str = this.overlayColor;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                SelectionItemCommon selectionItemCommon = this.selectionItemCommon;
                return hashCode + (selectionItemCommon != null ? selectionItemCommon.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                IconDTO iconDTO = this.icon;
                TextDTO textDTO = this.title;
                String str = this.overlayColor;
                SelectionItemCommon selectionItemCommon = this.selectionItemCommon;
                StringBuilder i11 = Bi.b.i("EmptyItem(icon=", ", title=", ", overlayColor=", iconDTO, textDTO);
                i11.append(str);
                i11.append(", selectionItemCommon=");
                i11.append(selectionItemCommon);
                i11.append(")");
                return i11.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO$TileItem;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO;", "footerItems", "", "", "mediaContent", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/MediaContentDTO;", CommentV3DTO.HEADER_FIELD_NAME, "selectionItemCommon", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionItemCommon;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/ugc/widgets/selectionsList/data/MediaContentDTO;Ljava/lang/Object;Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionItemCommon;)V", "getFooterItems", "()Ljava/util/List;", "getMediaContent", "()Lru/ozon/app/android/ugc/widgets/selectionsList/data/MediaContentDTO;", "getHeader", "()Ljava/lang/Object;", "getSelectionItemCommon", "()Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionItemCommon;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TileItem extends SelectionsListItemDTO {
            public static final int $stable = 8;

            @NotNull
            private final List<Object> footerItems;
            private final Object header;

            @NotNull
            private final MediaContentDTO mediaContent;
            private final SelectionItemCommon selectionItemCommon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TileItem(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "selectionItemInfo", name = "CONTENT_TYPE_SELECTION_ITEM_INFO", type = TileFooterContentDTO.SelectionInfo.class), @ProtoOneOfSignature(fieldName = "selectionItemFooter", name = "CONTENT_TYPE_SELECTION_ITEM_FOOTER", type = TileFooterContentDTO.SelectionItemFooter.class), @ProtoOneOfSignature(fieldName = "reviewPreviewPrice", name = "CONTENT_TYPE_REVIEW_PREVIEW_PRICE", type = PriceDTO.class), @ProtoOneOfSignature(fieldName = "reviewPreviewTitleRating", name = "CONTENT_TYPE_REVIEW_PREVIEW_TITLE_RATING", type = TileFooterContentDTO.ReviewPreviewTitleRating.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> footerItems, @NotNull MediaContentDTO mediaContent, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "socialHeader", name = "CONTENT_TYPE_SOCIAL_HEADER", type = SocialHeader.class), @ProtoOneOfSignature(fieldName = "badge", name = "CONTENT_TYPE_BADGE", type = BadgeDTO.class)}) @ProtoOneOf(label = "type") Object obj, SelectionItemCommon selectionItemCommon) {
                super(null);
                Intrinsics.checkNotNullParameter(footerItems, "footerItems");
                Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
                this.footerItems = footerItems;
                this.mediaContent = mediaContent;
                this.header = obj;
                this.selectionItemCommon = selectionItemCommon;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TileItem copy$default(TileItem tileItem, List list, MediaContentDTO mediaContentDTO, Object obj, SelectionItemCommon selectionItemCommon, int i11, Object obj2) {
                if ((i11 & 1) != 0) {
                    list = tileItem.footerItems;
                }
                if ((i11 & 2) != 0) {
                    mediaContentDTO = tileItem.mediaContent;
                }
                if ((i11 & 4) != 0) {
                    obj = tileItem.header;
                }
                if ((i11 & 8) != 0) {
                    selectionItemCommon = tileItem.selectionItemCommon;
                }
                return tileItem.copy(list, mediaContentDTO, obj, selectionItemCommon);
            }

            @NotNull
            public final List<Object> component1() {
                return this.footerItems;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final MediaContentDTO getMediaContent() {
                return this.mediaContent;
            }

            /* renamed from: component3, reason: from getter */
            public final Object getHeader() {
                return this.header;
            }

            /* renamed from: component4, reason: from getter */
            public final SelectionItemCommon getSelectionItemCommon() {
                return this.selectionItemCommon;
            }

            @NotNull
            public final TileItem copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "selectionItemInfo", name = "CONTENT_TYPE_SELECTION_ITEM_INFO", type = TileFooterContentDTO.SelectionInfo.class), @ProtoOneOfSignature(fieldName = "selectionItemFooter", name = "CONTENT_TYPE_SELECTION_ITEM_FOOTER", type = TileFooterContentDTO.SelectionItemFooter.class), @ProtoOneOfSignature(fieldName = "reviewPreviewPrice", name = "CONTENT_TYPE_REVIEW_PREVIEW_PRICE", type = PriceDTO.class), @ProtoOneOfSignature(fieldName = "reviewPreviewTitleRating", name = "CONTENT_TYPE_REVIEW_PREVIEW_TITLE_RATING", type = TileFooterContentDTO.ReviewPreviewTitleRating.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> footerItems, @NotNull MediaContentDTO mediaContent, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "socialHeader", name = "CONTENT_TYPE_SOCIAL_HEADER", type = SocialHeader.class), @ProtoOneOfSignature(fieldName = "badge", name = "CONTENT_TYPE_BADGE", type = BadgeDTO.class)}) @ProtoOneOf(label = "type") Object header, SelectionItemCommon selectionItemCommon) {
                Intrinsics.checkNotNullParameter(footerItems, "footerItems");
                Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
                return new TileItem(footerItems, mediaContent, header, selectionItemCommon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TileItem)) {
                    return false;
                }
                TileItem tileItem = (TileItem) other;
                return Intrinsics.d(this.footerItems, tileItem.footerItems) && Intrinsics.d(this.mediaContent, tileItem.mediaContent) && Intrinsics.d(this.header, tileItem.header) && Intrinsics.d(this.selectionItemCommon, tileItem.selectionItemCommon);
            }

            @NotNull
            public final List<Object> getFooterItems() {
                return this.footerItems;
            }

            public final Object getHeader() {
                return this.header;
            }

            @NotNull
            public final MediaContentDTO getMediaContent() {
                return this.mediaContent;
            }

            public final SelectionItemCommon getSelectionItemCommon() {
                return this.selectionItemCommon;
            }

            public int hashCode() {
                int hashCode = (this.mediaContent.hashCode() + (this.footerItems.hashCode() * 31)) * 31;
                Object obj = this.header;
                int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
                SelectionItemCommon selectionItemCommon = this.selectionItemCommon;
                return hashCode2 + (selectionItemCommon != null ? selectionItemCommon.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "TileItem(footerItems=" + this.footerItems + ", mediaContent=" + this.mediaContent + ", header=" + this.header + ", selectionItemCommon=" + this.selectionItemCommon + ")";
            }
        }

        public /* synthetic */ SelectionsListItemDTO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private SelectionsListItemDTO() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectionsListDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "tileItem", name = "CONTENT_TYPE_TILE_ITEM", type = SelectionsListItemDTO.TileItem.class), @ProtoOneOfSignature(fieldName = "emptyItem", name = "CONTENT_TYPE_EMPTY", type = SelectionsListItemDTO.EmptyItem.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends SelectionsListItemDTO> items, CommonCellSettings.LayoutPadding layoutPadding, @NotNull LayoutType layout, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.items = items;
        this.horizontalPadding = layoutPadding;
        this.layout = layout;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SelectionsListDTO copy$default(SelectionsListDTO selectionsListDTO, List list, CommonCellSettings.LayoutPadding layoutPadding, LayoutType layoutType, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = selectionsListDTO.items;
        }
        if ((i11 & 2) != 0) {
            layoutPadding = selectionsListDTO.horizontalPadding;
        }
        if ((i11 & 4) != 0) {
            layoutType = selectionsListDTO.layout;
        }
        if ((i11 & 8) != 0) {
            str = selectionsListDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            map = selectionsListDTO.trackingInfo;
        }
        Map map2 = map;
        LayoutType layoutType2 = layoutType;
        return selectionsListDTO.copy(list, layoutPadding, layoutType2, str, map2);
    }

    @NotNull
    public final List<SelectionsListItemDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonCellSettings.LayoutPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final LayoutType getLayout() {
        return this.layout;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final SelectionsListDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "tileItem", name = "CONTENT_TYPE_TILE_ITEM", type = SelectionsListItemDTO.TileItem.class), @ProtoOneOfSignature(fieldName = "emptyItem", name = "CONTENT_TYPE_EMPTY", type = SelectionsListItemDTO.EmptyItem.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends SelectionsListItemDTO> items, CommonCellSettings.LayoutPadding horizontalPadding, @NotNull LayoutType layout, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(layout, "layout");
        return new SelectionsListDTO(items, horizontalPadding, layout, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionsListDTO)) {
            return false;
        }
        SelectionsListDTO selectionsListDTO = (SelectionsListDTO) other;
        return Intrinsics.d(this.items, selectionsListDTO.items) && this.horizontalPadding == selectionsListDTO.horizontalPadding && this.layout == selectionsListDTO.layout && Intrinsics.d(this.backgroundColor, selectionsListDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, selectionsListDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonCellSettings.LayoutPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final List<SelectionsListItemDTO> getItems() {
        return this.items;
    }

    @NotNull
    public final LayoutType getLayout() {
        return this.layout;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        CommonCellSettings.LayoutPadding layoutPadding = this.horizontalPadding;
        int hashCode2 = (this.layout.hashCode() + ((hashCode + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<SelectionsListItemDTO> list = this.items;
        CommonCellSettings.LayoutPadding layoutPadding = this.horizontalPadding;
        LayoutType layoutType = this.layout;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("SelectionsListDTO(items=");
        sb2.append(list);
        sb2.append(", horizontalPadding=");
        sb2.append(layoutPadding);
        sb2.append(", layout=");
        sb2.append(layoutType);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
