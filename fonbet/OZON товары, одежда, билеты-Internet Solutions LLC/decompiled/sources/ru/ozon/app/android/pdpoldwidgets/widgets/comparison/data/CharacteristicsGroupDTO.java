package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data;

import An.C2439a;
import H3.c;
import Nh.a;
import V.e;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.rating.RatingAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "characteristics", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO$Characteristic;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getCharacteristics", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Characteristic", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CharacteristicsGroupDTO {

    @NotNull
    private final List<Characteristic> characteristics;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO$Characteristic;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "columns", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getColumns", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Color", "Image", "Rating", "TextCharacteristics", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Characteristic {

        @NotNull
        private final List<Object> columns;

        @NotNull
        private final String title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO$Characteristic$Color;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "colors", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getColors", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Color {
            private final List<String> colors;

            @NotNull
            private final String title;

            public Color(@NotNull String title, List<String> list) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.colors = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Color copy$default(Color color, String str, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = color.title;
                }
                if ((i11 & 2) != 0) {
                    list = color.colors;
                }
                return color.copy(str, list);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<String> component2() {
                return this.colors;
            }

            @NotNull
            public final Color copy(@NotNull String title, List<String> colors) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new Color(title, colors);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Color)) {
                    return false;
                }
                Color color = (Color) other;
                return Intrinsics.d(this.title, color.title) && Intrinsics.d(this.colors, color.colors);
            }

            public final List<String> getColors() {
                return this.colors;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                List<String> list = this.colors;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            @NotNull
            public String toString() {
                return C2439a.a("Color(title=", this.title, ", colors=", ")", this.colors);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO$Characteristic$Image;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", ImagesContract.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image {

            @NotNull
            private final String title;
            private final String url;

            public Image(@NotNull String title, String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.url = str;
            }

            public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = image.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = image.url;
                }
                return image.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            @NotNull
            public final Image copy(@NotNull String title, String url) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new Image(title, url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.d(this.title, image.title) && Intrinsics.d(this.url, image.url);
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.url;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return e.a("Image(title=", this.title, ", url=", this.url, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO$Characteristic$Rating;", "", "ratingAtom", "Lru/ozon/uni/atoms/data/rating/RatingAtom;", "deeplink", "", "<init>", "(Lru/ozon/uni/atoms/data/rating/RatingAtom;Ljava/lang/String;)V", "getRatingAtom", "()Lru/ozon/uni/atoms/data/rating/RatingAtom;", "getDeeplink", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Rating {

            @NotNull
            private final String deeplink;

            @NotNull
            private final RatingAtom ratingAtom;

            public Rating(@NotNull RatingAtom ratingAtom, @NotNull String deeplink) {
                Intrinsics.checkNotNullParameter(ratingAtom, "ratingAtom");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.ratingAtom = ratingAtom;
                this.deeplink = deeplink;
            }

            public static /* synthetic */ Rating copy$default(Rating rating, RatingAtom ratingAtom, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ratingAtom = rating.ratingAtom;
                }
                if ((i11 & 2) != 0) {
                    str = rating.deeplink;
                }
                return rating.copy(ratingAtom, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final RatingAtom getRatingAtom() {
                return this.ratingAtom;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            @NotNull
            public final Rating copy(@NotNull RatingAtom ratingAtom, @NotNull String deeplink) {
                Intrinsics.checkNotNullParameter(ratingAtom, "ratingAtom");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return new Rating(ratingAtom, deeplink);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Rating)) {
                    return false;
                }
                Rating rating = (Rating) other;
                return Intrinsics.d(this.ratingAtom, rating.ratingAtom) && Intrinsics.d(this.deeplink, rating.deeplink);
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            @NotNull
            public final RatingAtom getRatingAtom() {
                return this.ratingAtom;
            }

            public int hashCode() {
                return this.deeplink.hashCode() + (this.ratingAtom.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Rating(ratingAtom=" + this.ratingAtom + ", deeplink=" + this.deeplink + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO$Characteristic$TextCharacteristics;", "", "values", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO$Characteristic$TextCharacteristics$Text;", "<init>", "(Ljava/util/List;)V", "getValues", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Text", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class TextCharacteristics {

            @NotNull
            private final List<Text> values;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO$Characteristic$TextCharacteristics$Text;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getValue", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Text {
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                @NotNull
                private final String value;

                public Text(@NotNull String value, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                    this.trackingInfo = map;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Text copy$default(Text text, String str, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = text.value;
                    }
                    if ((i11 & 2) != 0) {
                        map = text.trackingInfo;
                    }
                    return text.copy(str, map);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public final Map<String, TokenizedTrackingInfo> component2() {
                    return this.trackingInfo;
                }

                @NotNull
                public final Text copy(@NotNull String value, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return new Text(value, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) other;
                    return Intrinsics.d(this.value, text.value) && Intrinsics.d(this.trackingInfo, text.trackingInfo);
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                @NotNull
                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    int hashCode = this.value.hashCode() * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode + (map == null ? 0 : map.hashCode());
                }

                @NotNull
                public String toString() {
                    return a.d("Text(value=", this.value, ", trackingInfo=", ")", this.trackingInfo);
                }
            }

            public TextCharacteristics(@NotNull List<Text> values) {
                Intrinsics.checkNotNullParameter(values, "values");
                this.values = values;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TextCharacteristics copy$default(TextCharacteristics textCharacteristics, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = textCharacteristics.values;
                }
                return textCharacteristics.copy(list);
            }

            @NotNull
            public final List<Text> component1() {
                return this.values;
            }

            @NotNull
            public final TextCharacteristics copy(@NotNull List<Text> values) {
                Intrinsics.checkNotNullParameter(values, "values");
                return new TextCharacteristics(values);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextCharacteristics) && Intrinsics.d(this.values, ((TextCharacteristics) other).values);
            }

            @NotNull
            public final List<Text> getValues() {
                return this.values;
            }

            public int hashCode() {
                return this.values.hashCode();
            }

            @NotNull
            public String toString() {
                return c.a("TextCharacteristics(values=", ")", this.values);
            }
        }

        public Characteristic(@NotNull String title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "badgeAtom", type = Badge.class), @ProtoOneOfSignature(name = "color", type = Color.class), @ProtoOneOfSignature(name = "image", type = Image.class), @ProtoOneOfSignature(name = "rating", type = Rating.class), @ProtoOneOfSignature(name = "textCharacteristics", type = TextCharacteristics.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> columns) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(columns, "columns");
            this.title = title;
            this.columns = columns;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Characteristic copy$default(Characteristic characteristic, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = characteristic.title;
            }
            if ((i11 & 2) != 0) {
                list = characteristic.columns;
            }
            return characteristic.copy(str, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<Object> component2() {
            return this.columns;
        }

        @NotNull
        public final Characteristic copy(@NotNull String title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "badgeAtom", type = Badge.class), @ProtoOneOfSignature(name = "color", type = Color.class), @ProtoOneOfSignature(name = "image", type = Image.class), @ProtoOneOfSignature(name = "rating", type = Rating.class), @ProtoOneOfSignature(name = "textCharacteristics", type = TextCharacteristics.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> columns) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(columns, "columns");
            return new Characteristic(title, columns);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Characteristic)) {
                return false;
            }
            Characteristic characteristic = (Characteristic) other;
            return Intrinsics.d(this.title, characteristic.title) && Intrinsics.d(this.columns, characteristic.columns);
        }

        @NotNull
        public final List<Object> getColumns() {
            return this.columns;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.columns.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2439a.a("Characteristic(title=", this.title, ", columns=", ")", this.columns);
        }
    }

    public CharacteristicsGroupDTO(@NotNull String title, @NotNull List<Characteristic> characteristics) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        this.title = title;
        this.characteristics = characteristics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CharacteristicsGroupDTO copy$default(CharacteristicsGroupDTO characteristicsGroupDTO, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = characteristicsGroupDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = characteristicsGroupDTO.characteristics;
        }
        return characteristicsGroupDTO.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<Characteristic> component2() {
        return this.characteristics;
    }

    @NotNull
    public final CharacteristicsGroupDTO copy(@NotNull String title, @NotNull List<Characteristic> characteristics) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        return new CharacteristicsGroupDTO(title, characteristics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharacteristicsGroupDTO)) {
            return false;
        }
        CharacteristicsGroupDTO characteristicsGroupDTO = (CharacteristicsGroupDTO) other;
        return Intrinsics.d(this.title, characteristicsGroupDTO.title) && Intrinsics.d(this.characteristics, characteristicsGroupDTO.characteristics);
    }

    @NotNull
    public final List<Characteristic> getCharacteristics() {
        return this.characteristics;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.characteristics.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2439a.a("CharacteristicsGroupDTO(title=", this.title, ", characteristics=", ")", this.characteristics);
    }
}
