package ru.ozon.app.android.autopicker.view.productpickersearch.data;

import B0.A0;
import C.o0;
import G.g;
import K1.G;
import Kk.C3532b;
import Lh.a;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.data.ProductPickerDetailsDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004-./0BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003JW\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO;", "", "hasSectionTitles", "", "hasMultiselection", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Header;", "values", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Value;", "button", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Button;", "currentState", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;", "trackingInfo", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$TrackingInfo;", "<init>", "(ZZLru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Header;Ljava/util/List;Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Button;Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$TrackingInfo;)V", "getHasSectionTitles", "()Z", "getHasMultiselection", "getHeader", "()Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Header;", "getValues", "()Ljava/util/List;", "getButton", "()Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Button;", "getCurrentState", "()Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;", "getTrackingInfo", "()Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$TrackingInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "Header", "Value", "Button", "TrackingInfo", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductPickerSearchDTO {

    @NotNull
    private final Button button;

    @NotNull
    private final ProductPickerDetailsDTO.CurrentState currentState;
    private final boolean hasMultiselection;
    private final boolean hasSectionTitles;

    @NotNull
    private final Header header;
    private final TrackingInfo trackingInfo;

    @NotNull
    private final List<Value> values;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Button;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "keyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getKeyName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {
        private final String keyName;
        private final String subtitle;

        @NotNull
        private final String title;

        public Button(@NotNull String title, String str, String str2) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = str;
            this.keyName = str2;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = button.title;
            }
            if ((i11 & 2) != 0) {
                str2 = button.subtitle;
            }
            if ((i11 & 4) != 0) {
                str3 = button.keyName;
            }
            return button.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getKeyName() {
            return this.keyName;
        }

        @NotNull
        public final Button copy(@NotNull String title, String subtitle, String keyName) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Button(title, subtitle, keyName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.d(this.title, button.title) && Intrinsics.d(this.subtitle, button.subtitle) && Intrinsics.d(this.keyName, button.keyName);
        }

        public final String getKeyName() {
            return this.keyName;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.keyName;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            return o0.c(C3660k.d("Button(title=", str, ", subtitle=", str2, ", keyName="), this.keyName, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Header;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "search", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Header$Search;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Header$Search;)V", "getTitle", "()Ljava/lang/String;", "getSearch", "()Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Header$Search;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Search", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Header {
        private final Search search;

        @NotNull
        private final String title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Header$Search;", "", HammersV3BodyDTO.PLACEHOLDER, "", "<init>", "(Ljava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Search {

            @NotNull
            private final String placeholder;

            public Search(@NotNull String placeholder) {
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                this.placeholder = placeholder;
            }

            public static /* synthetic */ Search copy$default(Search search, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = search.placeholder;
                }
                return search.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            @NotNull
            public final Search copy(@NotNull String placeholder) {
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                return new Search(placeholder);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Search) && Intrinsics.d(this.placeholder, ((Search) other).placeholder);
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
                return A0.b("Search(placeholder=", this.placeholder, ")");
            }
        }

        public Header(@NotNull String title, Search search) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.search = search;
        }

        public static /* synthetic */ Header copy$default(Header header, String str, Search search, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = header.title;
            }
            if ((i11 & 2) != 0) {
                search = header.search;
            }
            return header.copy(str, search);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final Search getSearch() {
            return this.search;
        }

        @NotNull
        public final Header copy(@NotNull String title, Search search) {
            Intrinsics.checkNotNullParameter(title, "title");
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

        public final Search getSearch() {
            return this.search;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Search search = this.search;
            return hashCode + (search == null ? 0 : search.hashCode());
        }

        @NotNull
        public String toString() {
            return "Header(title=" + this.title + ", search=" + this.search + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$TrackingInfo;", "", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackingInfo {
        private final String id;

        public TrackingInfo(String str) {
            this.id = str;
        }

        public static /* synthetic */ TrackingInfo copy$default(TrackingInfo trackingInfo, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = trackingInfo.id;
            }
            return trackingInfo.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final TrackingInfo copy(String id2) {
            return new TrackingInfo(id2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TrackingInfo) && Intrinsics.d(this.id, ((TrackingInfo) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("TrackingInfo(id=", this.id, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Value;", "", "isSelected", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", SelectionItemFormDTO.TITLE_FIELD_NAME, "values", "", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "()Z", "getValue", "()Ljava/lang/String;", "getTitle", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Value {
        private final boolean isSelected;

        @NotNull
        private final String title;
        private final String value;
        private final List<Value> values;

        public Value(boolean z11, String str, @NotNull String title, List<Value> list) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.isSelected = z11;
            this.value = str;
            this.title = title;
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Value copy$default(Value value, boolean z11, String str, String str2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = value.isSelected;
            }
            if ((i11 & 2) != 0) {
                str = value.value;
            }
            if ((i11 & 4) != 0) {
                str2 = value.title;
            }
            if ((i11 & 8) != 0) {
                list = value.values;
            }
            return value.copy(z11, str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<Value> component4() {
            return this.values;
        }

        @NotNull
        public final Value copy(boolean isSelected, String value, @NotNull String title, List<Value> values) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Value(isSelected, value, title, values);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return this.isSelected == value.isSelected && Intrinsics.d(this.value, value.value) && Intrinsics.d(this.title, value.title) && Intrinsics.d(this.values, value.values);
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final String getValue() {
            return this.value;
        }

        public final List<Value> getValues() {
            return this.values;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.isSelected) * 31;
            String str = this.value;
            int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title);
            List<Value> list = this.values;
            return a11 + (list != null ? list.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isSelected;
            String str = this.value;
            String str2 = this.title;
            List<Value> list = this.values;
            StringBuilder d11 = G.d("Value(isSelected=", ", value=", str, ", title=", z11);
            d11.append(str2);
            d11.append(", values=");
            d11.append(list);
            d11.append(")");
            return d11.toString();
        }
    }

    public ProductPickerSearchDTO(boolean z11, boolean z12, @NotNull Header header, @NotNull List<Value> values, @NotNull Button button, @NotNull ProductPickerDetailsDTO.CurrentState currentState, TrackingInfo trackingInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        this.hasSectionTitles = z11;
        this.hasMultiselection = z12;
        this.header = header;
        this.values = values;
        this.button = button;
        this.currentState = currentState;
        this.trackingInfo = trackingInfo;
    }

    public static /* synthetic */ ProductPickerSearchDTO copy$default(ProductPickerSearchDTO productPickerSearchDTO, boolean z11, boolean z12, Header header, List list, Button button, ProductPickerDetailsDTO.CurrentState currentState, TrackingInfo trackingInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = productPickerSearchDTO.hasSectionTitles;
        }
        if ((i11 & 2) != 0) {
            z12 = productPickerSearchDTO.hasMultiselection;
        }
        if ((i11 & 4) != 0) {
            header = productPickerSearchDTO.header;
        }
        if ((i11 & 8) != 0) {
            list = productPickerSearchDTO.values;
        }
        if ((i11 & 16) != 0) {
            button = productPickerSearchDTO.button;
        }
        if ((i11 & 32) != 0) {
            currentState = productPickerSearchDTO.currentState;
        }
        if ((i11 & 64) != 0) {
            trackingInfo = productPickerSearchDTO.trackingInfo;
        }
        ProductPickerDetailsDTO.CurrentState currentState2 = currentState;
        TrackingInfo trackingInfo2 = trackingInfo;
        Button button2 = button;
        Header header2 = header;
        return productPickerSearchDTO.copy(z11, z12, header2, list, button2, currentState2, trackingInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasSectionTitles() {
        return this.hasSectionTitles;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasMultiselection() {
        return this.hasMultiselection;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final List<Value> component4() {
        return this.values;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ProductPickerDetailsDTO.CurrentState getCurrentState() {
        return this.currentState;
    }

    /* renamed from: component7, reason: from getter */
    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final ProductPickerSearchDTO copy(boolean hasSectionTitles, boolean hasMultiselection, @NotNull Header header, @NotNull List<Value> values, @NotNull Button button, @NotNull ProductPickerDetailsDTO.CurrentState currentState, TrackingInfo trackingInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new ProductPickerSearchDTO(hasSectionTitles, hasMultiselection, header, values, button, currentState, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductPickerSearchDTO)) {
            return false;
        }
        ProductPickerSearchDTO productPickerSearchDTO = (ProductPickerSearchDTO) other;
        return this.hasSectionTitles == productPickerSearchDTO.hasSectionTitles && this.hasMultiselection == productPickerSearchDTO.hasMultiselection && Intrinsics.d(this.header, productPickerSearchDTO.header) && Intrinsics.d(this.values, productPickerSearchDTO.values) && Intrinsics.d(this.button, productPickerSearchDTO.button) && Intrinsics.d(this.currentState, productPickerSearchDTO.currentState) && Intrinsics.d(this.trackingInfo, productPickerSearchDTO.trackingInfo);
    }

    @NotNull
    public final Button getButton() {
        return this.button;
    }

    @NotNull
    public final ProductPickerDetailsDTO.CurrentState getCurrentState() {
        return this.currentState;
    }

    public final boolean getHasMultiselection() {
        return this.hasMultiselection;
    }

    public final boolean getHasSectionTitles() {
        return this.hasSectionTitles;
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<Value> getValues() {
        return this.values;
    }

    public int hashCode() {
        int hashCode = (this.currentState.hashCode() + ((this.button.hashCode() + g.b((this.header.hashCode() + C3532b.a(Boolean.hashCode(this.hasSectionTitles) * 31, 31, this.hasMultiselection)) * 31, 31, this.values)) * 31)) * 31;
        TrackingInfo trackingInfo = this.trackingInfo;
        return hashCode + (trackingInfo == null ? 0 : trackingInfo.hashCode());
    }

    @NotNull
    public String toString() {
        boolean z11 = this.hasSectionTitles;
        boolean z12 = this.hasMultiselection;
        Header header = this.header;
        List<Value> list = this.values;
        Button button = this.button;
        ProductPickerDetailsDTO.CurrentState currentState = this.currentState;
        TrackingInfo trackingInfo = this.trackingInfo;
        StringBuilder d11 = a.d("ProductPickerSearchDTO(hasSectionTitles=", ", hasMultiselection=", ", header=", z11, z12);
        d11.append(header);
        d11.append(", values=");
        d11.append(list);
        d11.append(", button=");
        d11.append(button);
        d11.append(", currentState=");
        d11.append(currentState);
        d11.append(", trackingInfo=");
        d11.append(trackingInfo);
        d11.append(")");
        return d11.toString();
    }
}
