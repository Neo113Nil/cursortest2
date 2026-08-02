package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data;

import B0.A0;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0001HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO;", "", "cell", "cellData", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData;", "<init>", "(Ljava/lang/Object;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData;)V", "getCell", "()Ljava/lang/Object;", "getCellData", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CellData", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CharacteristicsPickDTO {

    @NotNull
    private final Object cell;

    @NotNull
    private final CellData cellData;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\"#B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData$Header;", "values", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData$CellDataValue;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData$Header;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "getHeader", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData$Header;", "getValues", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Header", "CellDataValue", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CellData {

        @NotNull
        private final ButtonV3Atom.LargeButton button;

        @NotNull
        private final Header header;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final List<CellDataValue> values;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData$CellDataValue;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "isSelected", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CellDataValue {

            @NotNull
            private final String id;
            private final boolean isSelected;

            @NotNull
            private final String title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public CellDataValue(@NotNull String id2, @NotNull String title, boolean z11, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                this.id = id2;
                this.title = title;
                this.isSelected = z11;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ CellDataValue copy$default(CellDataValue cellDataValue, String str, String str2, boolean z11, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = cellDataValue.id;
                }
                if ((i11 & 2) != 0) {
                    str2 = cellDataValue.title;
                }
                if ((i11 & 4) != 0) {
                    z11 = cellDataValue.isSelected;
                }
                if ((i11 & 8) != 0) {
                    map = cellDataValue.trackingInfo;
                }
                return cellDataValue.copy(str, str2, z11, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            public final Map<String, TokenizedTrackingInfo> component4() {
                return this.trackingInfo;
            }

            @NotNull
            public final CellDataValue copy(@NotNull String id2, @NotNull String title, boolean isSelected, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                return new CellDataValue(id2, title, isSelected, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellDataValue)) {
                    return false;
                }
                CellDataValue cellDataValue = (CellDataValue) other;
                return Intrinsics.d(this.id, cellDataValue.id) && Intrinsics.d(this.title, cellDataValue.title) && this.isSelected == cellDataValue.isSelected && Intrinsics.d(this.trackingInfo, cellDataValue.trackingInfo);
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = C3532b.a(g.a(this.id.hashCode() * 31, 31, this.title), 31, this.isSelected);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return a11 + (map == null ? 0 : map.hashCode());
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                String str = this.id;
                String str2 = this.title;
                boolean z11 = this.isSelected;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("CellDataValue(id=", str, ", title=", str2, ", isSelected=");
                d11.append(z11);
                d11.append(", trackingInfo=");
                d11.append(map);
                d11.append(")");
                return d11.toString();
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData$Header;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "search", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData$Header$HeaderSearch;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData$Header$HeaderSearch;)V", "getTitle", "()Ljava/lang/String;", "getSearch", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData$Header$HeaderSearch;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "HeaderSearch", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Header {

            @NotNull
            private final HeaderSearch search;

            @NotNull
            private final String title;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData$Header$HeaderSearch;", "", HammersV3BodyDTO.PLACEHOLDER, "", "<init>", "(Ljava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class HeaderSearch {

                @NotNull
                private final String placeholder;

                public HeaderSearch(@NotNull String placeholder) {
                    Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                    this.placeholder = placeholder;
                }

                public static /* synthetic */ HeaderSearch copy$default(HeaderSearch headerSearch, String str, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = headerSearch.placeholder;
                    }
                    return headerSearch.copy(str);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                @NotNull
                public final HeaderSearch copy(@NotNull String placeholder) {
                    Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                    return new HeaderSearch(placeholder);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof HeaderSearch) && Intrinsics.d(this.placeholder, ((HeaderSearch) other).placeholder);
                }

                @NotNull
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                public int hashCode() {
                    return this.placeholder.hashCode();
                }

                @NotNull
                public String toString() {
                    return A0.b("HeaderSearch(placeholder=", this.placeholder, ")");
                }
            }

            public Header(@NotNull String title, @NotNull HeaderSearch search) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(search, "search");
                this.title = title;
                this.search = search;
            }

            public static /* synthetic */ Header copy$default(Header header, String str, HeaderSearch headerSearch, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = header.title;
                }
                if ((i11 & 2) != 0) {
                    headerSearch = header.search;
                }
                return header.copy(str, headerSearch);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final HeaderSearch getSearch() {
                return this.search;
            }

            @NotNull
            public final Header copy(@NotNull String title, @NotNull HeaderSearch search) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(search, "search");
                return new Header(title, search);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Header)) {
                    return false;
                }
                Header header = (Header) other;
                return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.search, header.search);
            }

            @NotNull
            public final HeaderSearch getSearch() {
                return this.search;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.search.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Header(title=" + this.title + ", search=" + this.search + ")";
            }
        }

        public CellData(@NotNull Header header, List<CellDataValue> list, @NotNull ButtonV3Atom.LargeButton button, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(button, "button");
            this.header = header;
            this.values = list;
            this.button = button;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CellData copy$default(CellData cellData, Header header, List list, ButtonV3Atom.LargeButton largeButton, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                header = cellData.header;
            }
            if ((i11 & 2) != 0) {
                list = cellData.values;
            }
            if ((i11 & 4) != 0) {
                largeButton = cellData.button;
            }
            if ((i11 & 8) != 0) {
                map = cellData.trackingInfo;
            }
            return cellData.copy(header, list, largeButton, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Header getHeader() {
            return this.header;
        }

        public final List<CellDataValue> component2() {
            return this.values;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.LargeButton getButton() {
            return this.button;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final CellData copy(@NotNull Header header, List<CellDataValue> values, @NotNull ButtonV3Atom.LargeButton button, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(button, "button");
            return new CellData(header, values, button, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellData)) {
                return false;
            }
            CellData cellData = (CellData) other;
            return Intrinsics.d(this.header, cellData.header) && Intrinsics.d(this.values, cellData.values) && Intrinsics.d(this.button, cellData.button) && Intrinsics.d(this.trackingInfo, cellData.trackingInfo);
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getButton() {
            return this.button;
        }

        @NotNull
        public final Header getHeader() {
            return this.header;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final List<CellDataValue> getValues() {
            return this.values;
        }

        public int hashCode() {
            int hashCode = this.header.hashCode() * 31;
            List<CellDataValue> list = this.values;
            int a11 = b.a(this.button, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CellData(header=" + this.header + ", values=" + this.values + ", button=" + this.button + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    public CharacteristicsPickDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellWithSubtitleCounter", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter.class), @ProtoOneOfSignature(name = "cellWithSubtitleDefault", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault.class)}) @NotNull @ProtoOneOf(label = "type") Object cell, @NotNull CellData cellData) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(cellData, "cellData");
        this.cell = cell;
        this.cellData = cellData;
    }

    public static /* synthetic */ CharacteristicsPickDTO copy$default(CharacteristicsPickDTO characteristicsPickDTO, Object obj, CellData cellData, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = characteristicsPickDTO.cell;
        }
        if ((i11 & 2) != 0) {
            cellData = characteristicsPickDTO.cellData;
        }
        return characteristicsPickDTO.copy(obj, cellData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Object getCell() {
        return this.cell;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CellData getCellData() {
        return this.cellData;
    }

    @NotNull
    public final CharacteristicsPickDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellWithSubtitleCounter", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter.class), @ProtoOneOfSignature(name = "cellWithSubtitleDefault", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault.class)}) @NotNull @ProtoOneOf(label = "type") Object cell, @NotNull CellData cellData) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(cellData, "cellData");
        return new CharacteristicsPickDTO(cell, cellData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharacteristicsPickDTO)) {
            return false;
        }
        CharacteristicsPickDTO characteristicsPickDTO = (CharacteristicsPickDTO) other;
        return Intrinsics.d(this.cell, characteristicsPickDTO.cell) && Intrinsics.d(this.cellData, characteristicsPickDTO.cellData);
    }

    @NotNull
    public final Object getCell() {
        return this.cell;
    }

    @NotNull
    public final CellData getCellData() {
        return this.cellData;
    }

    public int hashCode() {
        return this.cellData.hashCode() + (this.cell.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CharacteristicsPickDTO(cell=" + this.cell + ", cellData=" + this.cellData + ")";
    }
}
