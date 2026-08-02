package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.data;

import B90.C2618u;
import G.g;
import H3.c;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import T7.E;
import T7.P;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.fresh.main.ui.molecules.oldHeader.FreshHeaderDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0016B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO;", "", "sections", "", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Section;", "<init>", "(Ljava/util/List;)V", "getSections", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Section", "SeparatorDTO", "Items", "Item", "PositionType", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ExpressNavigationSliderV2DTO {

    @NotNull
    private final List<Section> sections;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item;", "", "settings", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item$Settings;", "data", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item$Data;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item$Settings;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item$Data;Ljava/util/Map;)V", "getSettings", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item$Settings;", "getData", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item$Data;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Settings", "Data", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Item {

        @NotNull
        private final Data data;

        @NotNull
        private final Settings settings;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item$Data;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "image", "link", "deeplink", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getImage", "getLink", "getDeeplink", "()Z", "getBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Data {
            private final String backgroundColor;

            @NotNull
            private final String deeplink;

            @NotNull
            private final String image;
            private final boolean isAdult;

            @NotNull
            private final String link;
            private final String title;

            public Data(String str, @NotNull String image, @NotNull String link, @NotNull String deeplink, boolean z11, String str2) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(link, "link");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.title = str;
                this.image = image;
                this.link = link;
                this.deeplink = deeplink;
                this.isAdult = z11;
                this.backgroundColor = str2;
            }

            public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, boolean z11, String str5, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = data.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = data.image;
                }
                if ((i11 & 4) != 0) {
                    str3 = data.link;
                }
                if ((i11 & 8) != 0) {
                    str4 = data.deeplink;
                }
                if ((i11 & 16) != 0) {
                    z11 = data.isAdult;
                }
                if ((i11 & 32) != 0) {
                    str5 = data.backgroundColor;
                }
                boolean z12 = z11;
                String str6 = str5;
                return data.copy(str, str2, str3, str4, z12, str6);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsAdult() {
                return this.isAdult;
            }

            /* renamed from: component6, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final Data copy(String title, @NotNull String image, @NotNull String link, @NotNull String deeplink, boolean isAdult, String backgroundColor) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(link, "link");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return new Data(title, image, link, deeplink, isAdult, backgroundColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return Intrinsics.d(this.title, data.title) && Intrinsics.d(this.image, data.image) && Intrinsics.d(this.link, data.link) && Intrinsics.d(this.deeplink, data.deeplink) && this.isAdult == data.isAdult && Intrinsics.d(this.backgroundColor, data.backgroundColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int a11 = C3532b.a(g.a(g.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.image), 31, this.link), 31, this.deeplink), 31, this.isAdult);
                String str2 = this.backgroundColor;
                return a11 + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean isAdult() {
                return this.isAdult;
            }

            @NotNull
            public String toString() {
                String str = this.title;
                String str2 = this.image;
                String str3 = this.link;
                String str4 = this.deeplink;
                boolean z11 = this.isAdult;
                String str5 = this.backgroundColor;
                StringBuilder d11 = C3660k.d("Data(title=", str, ", image=", str2, ", link=");
                a.h(d11, str3, ", deeplink=", str4, ", isAdult=");
                d11.append(z11);
                d11.append(", backgroundColor=");
                d11.append(str5);
                d11.append(")");
                return d11.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item$Settings;", "", "position", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$PositionType;", "rightIndent", "", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$PositionType;I)V", "getPosition", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$PositionType;", "getRightIndent", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Settings {

            @NotNull
            private final PositionType position;
            private final int rightIndent;

            public Settings(@NotNull PositionType position, int i11) {
                Intrinsics.checkNotNullParameter(position, "position");
                this.position = position;
                this.rightIndent = i11;
            }

            public static /* synthetic */ Settings copy$default(Settings settings, PositionType positionType, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    positionType = settings.position;
                }
                if ((i12 & 2) != 0) {
                    i11 = settings.rightIndent;
                }
                return settings.copy(positionType, i11);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final PositionType getPosition() {
                return this.position;
            }

            /* renamed from: component2, reason: from getter */
            public final int getRightIndent() {
                return this.rightIndent;
            }

            @NotNull
            public final Settings copy(@NotNull PositionType position, int rightIndent) {
                Intrinsics.checkNotNullParameter(position, "position");
                return new Settings(position, rightIndent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Settings)) {
                    return false;
                }
                Settings settings = (Settings) other;
                return this.position == settings.position && this.rightIndent == settings.rightIndent;
            }

            @NotNull
            public final PositionType getPosition() {
                return this.position;
            }

            public final int getRightIndent() {
                return this.rightIndent;
            }

            public int hashCode() {
                return Integer.hashCode(this.rightIndent) + (this.position.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Settings(position=" + this.position + ", rightIndent=" + this.rightIndent + ")";
            }
        }

        public Item(@NotNull Settings settings, @NotNull Data data, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(data, "data");
            this.settings = settings;
            this.data = data;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Item copy$default(Item item, Settings settings, Data data, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                settings = item.settings;
            }
            if ((i11 & 2) != 0) {
                data = item.data;
            }
            if ((i11 & 4) != 0) {
                map = item.trackingInfo;
            }
            return item.copy(settings, data, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Settings getSettings() {
            return this.settings;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Data getData() {
            return this.data;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final Item copy(@NotNull Settings settings, @NotNull Data data, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(data, "data");
            return new Item(settings, data, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.settings, item.settings) && Intrinsics.d(this.data, item.data) && Intrinsics.d(this.trackingInfo, item.trackingInfo);
        }

        @NotNull
        public final Data getData() {
            return this.data;
        }

        @NotNull
        public final Settings getSettings() {
            return this.settings;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.data.hashCode() + (this.settings.hashCode() * 31)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            Settings settings = this.settings;
            Data data = this.data;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("Item(settings=");
            sb2.append(settings);
            sb2.append(", data=");
            sb2.append(data);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Items;", "", "items", "", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Items {

        @NotNull
        private final List<Item> items;

        public Items(@NotNull List<Item> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Items copy$default(Items items, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = items.items;
            }
            return items.copy(list);
        }

        @NotNull
        public final List<Item> component1() {
            return this.items;
        }

        @NotNull
        public final Items copy(@NotNull List<Item> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new Items(items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Items) && Intrinsics.d(this.items, ((Items) other).items);
        }

        @NotNull
        public final List<Item> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("Items(items=", ")", this.items);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$PositionType;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "FULL_WIDTH", "HALF_WIDTH_LEFT", "HALF_WIDTH_RIGHT", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PositionType {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ PositionType[] $VALUES;

        @i(name = "INVALID")
        public static final PositionType INVALID = new PositionType("INVALID", 0);

        @i(name = "FULL_WIDTH")
        public static final PositionType FULL_WIDTH = new PositionType("FULL_WIDTH", 1);

        @i(name = "HALF_WIDTH_LEFT")
        public static final PositionType HALF_WIDTH_LEFT = new PositionType("HALF_WIDTH_LEFT", 2);

        @i(name = "HALF_WIDTH_RIGHT")
        public static final PositionType HALF_WIDTH_RIGHT = new PositionType("HALF_WIDTH_RIGHT", 3);

        private static final /* synthetic */ PositionType[] $values() {
            return new PositionType[]{INVALID, FULL_WIDTH, HALF_WIDTH_LEFT, HALF_WIDTH_RIGHT};
        }

        static {
            PositionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private PositionType(String str, int i11) {
        }

        public static PositionType valueOf(String str) {
            return (PositionType) Enum.valueOf(PositionType.class, str);
        }

        public static PositionType[] values() {
            return (PositionType[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Section;", "", "separatorHeight", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/main/ui/molecules/oldHeader/FreshHeaderDTO;", "items", "", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item;", "<init>", "(Ljava/lang/Integer;Lru/ozon/app/android/fresh/main/ui/molecules/oldHeader/FreshHeaderDTO;Ljava/util/List;)V", "getSeparatorHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeader", "()Lru/ozon/app/android/fresh/main/ui/molecules/oldHeader/FreshHeaderDTO;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lru/ozon/app/android/fresh/main/ui/molecules/oldHeader/FreshHeaderDTO;Ljava/util/List;)Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Section;", "equals", "", "other", "hashCode", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Section {
        private final FreshHeaderDTO header;
        private final List<Item> items;
        private final Integer separatorHeight;

        public Section(Integer num, FreshHeaderDTO freshHeaderDTO, List<Item> list) {
            this.separatorHeight = num;
            this.header = freshHeaderDTO;
            this.items = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Section copy$default(Section section, Integer num, FreshHeaderDTO freshHeaderDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = section.separatorHeight;
            }
            if ((i11 & 2) != 0) {
                freshHeaderDTO = section.header;
            }
            if ((i11 & 4) != 0) {
                list = section.items;
            }
            return section.copy(num, freshHeaderDTO, list);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getSeparatorHeight() {
            return this.separatorHeight;
        }

        /* renamed from: component2, reason: from getter */
        public final FreshHeaderDTO getHeader() {
            return this.header;
        }

        public final List<Item> component3() {
            return this.items;
        }

        @NotNull
        public final Section copy(Integer separatorHeight, FreshHeaderDTO header, List<Item> items) {
            return new Section(separatorHeight, header, items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return Intrinsics.d(this.separatorHeight, section.separatorHeight) && Intrinsics.d(this.header, section.header) && Intrinsics.d(this.items, section.items);
        }

        public final FreshHeaderDTO getHeader() {
            return this.header;
        }

        public final List<Item> getItems() {
            return this.items;
        }

        public final Integer getSeparatorHeight() {
            return this.separatorHeight;
        }

        public int hashCode() {
            Integer num = this.separatorHeight;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            FreshHeaderDTO freshHeaderDTO = this.header;
            int hashCode2 = (hashCode + (freshHeaderDTO == null ? 0 : freshHeaderDTO.hashCode())) * 31;
            List<Item> list = this.items;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.separatorHeight;
            FreshHeaderDTO freshHeaderDTO = this.header;
            List<Item> list = this.items;
            StringBuilder sb2 = new StringBuilder("Section(separatorHeight=");
            sb2.append(num);
            sb2.append(", header=");
            sb2.append(freshHeaderDTO);
            sb2.append(", items=");
            return C2618u.h(sb2, list, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$SeparatorDTO;", "", "separatorHeight", "", "<init>", "(I)V", "getSeparatorHeight", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeparatorDTO {
        private final int separatorHeight;

        public SeparatorDTO(int i11) {
            this.separatorHeight = i11;
        }

        public static /* synthetic */ SeparatorDTO copy$default(SeparatorDTO separatorDTO, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = separatorDTO.separatorHeight;
            }
            return separatorDTO.copy(i11);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSeparatorHeight() {
            return this.separatorHeight;
        }

        @NotNull
        public final SeparatorDTO copy(int separatorHeight) {
            return new SeparatorDTO(separatorHeight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SeparatorDTO) && this.separatorHeight == ((SeparatorDTO) other).separatorHeight;
        }

        public final int getSeparatorHeight() {
            return this.separatorHeight;
        }

        public int hashCode() {
            return Integer.hashCode(this.separatorHeight);
        }

        @NotNull
        public String toString() {
            return E.a(this.separatorHeight, "SeparatorDTO(separatorHeight=", ")");
        }
    }

    public ExpressNavigationSliderV2DTO(@NotNull List<Section> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.sections = sections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpressNavigationSliderV2DTO copy$default(ExpressNavigationSliderV2DTO expressNavigationSliderV2DTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = expressNavigationSliderV2DTO.sections;
        }
        return expressNavigationSliderV2DTO.copy(list);
    }

    @NotNull
    public final List<Section> component1() {
        return this.sections;
    }

    @NotNull
    public final ExpressNavigationSliderV2DTO copy(@NotNull List<Section> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new ExpressNavigationSliderV2DTO(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExpressNavigationSliderV2DTO) && Intrinsics.d(this.sections, ((ExpressNavigationSliderV2DTO) other).sections);
    }

    @NotNull
    public final List<Section> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("ExpressNavigationSliderV2DTO(sections=", ")", this.sections);
    }
}
