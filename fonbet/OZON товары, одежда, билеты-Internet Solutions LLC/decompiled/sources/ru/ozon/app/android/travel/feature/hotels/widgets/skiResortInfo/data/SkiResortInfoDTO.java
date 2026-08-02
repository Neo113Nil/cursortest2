package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.data;

import Ak.b;
import B90.C2618u;
import Cm.e;
import G.g;
import H00.a;
import H3.c;
import com.squareup.moshi.j;
import ed.InterfaceC6346b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001:\n*+,-./0123B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JM\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", DynamicElementDTO.TABS, "Lru/ozon/uni/atoms/data/tabs/Tabs;", "topics", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TopicDTO;", "backgroundColor", "", "themeImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/tabs/Tabs;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTabs", "()Lru/ozon/uni/atoms/data/tabs/Tabs;", "getTopics", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getThemeImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "TopicDTO", "AboutDTO", "TrailsDTO", "TrailItemDTO", "TrailCategoryDetailItemDTO", "TrailCategoryDetailItemTypeDTO", "MapDTO", "TrailLiftTypeDetailItemDTO", "WeatherDTO", "WeatherItemDTO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SkiResortInfoDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;
    private final CommonControlSettings common;

    @NotNull
    private final Tabs tabs;

    @NotNull
    private final ImageDTO themeImage;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final List<TopicDTO> topics;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$AboutDTO;", "", "general", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getGeneral", "()Ljava/util/List;", "getDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AboutDTO {
        public static final int $stable = 8;

        @NotNull
        private final TextDTO description;

        @NotNull
        private final List<TextDTO> general;

        public AboutDTO(@NotNull List<TextDTO> general, @NotNull TextDTO description) {
            Intrinsics.checkNotNullParameter(general, "general");
            Intrinsics.checkNotNullParameter(description, "description");
            this.general = general;
            this.description = description;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AboutDTO copy$default(AboutDTO aboutDTO, List list, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = aboutDTO.general;
            }
            if ((i11 & 2) != 0) {
                textDTO = aboutDTO.description;
            }
            return aboutDTO.copy(list, textDTO);
        }

        @NotNull
        public final List<TextDTO> component1() {
            return this.general;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getDescription() {
            return this.description;
        }

        @NotNull
        public final AboutDTO copy(@NotNull List<TextDTO> general, @NotNull TextDTO description) {
            Intrinsics.checkNotNullParameter(general, "general");
            Intrinsics.checkNotNullParameter(description, "description");
            return new AboutDTO(general, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AboutDTO)) {
                return false;
            }
            AboutDTO aboutDTO = (AboutDTO) other;
            return Intrinsics.d(this.general, aboutDTO.general) && Intrinsics.d(this.description, aboutDTO.description);
        }

        @NotNull
        public final TextDTO getDescription() {
            return this.description;
        }

        @NotNull
        public final List<TextDTO> getGeneral() {
            return this.general;
        }

        public int hashCode() {
            return this.description.hashCode() + (this.general.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AboutDTO(general=" + this.general + ", description=" + this.description + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$MapDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapDTO {
        public static final int $stable = 0;

        @NotNull
        private final ButtonV3DTO button;

        @NotNull
        private final ImageDTO image;

        public MapDTO(@NotNull ImageDTO image, @NotNull ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(button, "button");
            this.image = image;
            this.button = button;
        }

        public static /* synthetic */ MapDTO copy$default(MapDTO mapDTO, ImageDTO imageDTO, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = mapDTO.image;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO = mapDTO.button;
            }
            return mapDTO.copy(imageDTO, buttonV3DTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final MapDTO copy(@NotNull ImageDTO image, @NotNull ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(button, "button");
            return new MapDTO(image, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapDTO)) {
                return false;
            }
            MapDTO mapDTO = (MapDTO) other;
            return Intrinsics.d(this.image, mapDTO.image) && Intrinsics.d(this.button, mapDTO.button);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public int hashCode() {
            return this.button.hashCode() + (this.image.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "MapDTO(image=" + this.image + ", button=" + this.button + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0001HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TopicDTO;", "", "id", "", "content", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getId", "()Ljava/lang/String;", "getContent", "()Ljava/lang/Object;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TopicDTO {
        public static final int $stable = 8;
        private final CommonControlSettings common;

        @NotNull
        private final Object content;

        @NotNull
        private final String id;

        public TopicDTO(@NotNull String id2, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "about", type = AboutDTO.class), @ProtoOneOfSignature(name = "trails", type = TrailsDTO.class), @ProtoOneOfSignature(name = "weather", type = WeatherDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object content, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            this.id = id2;
            this.content = content;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ TopicDTO copy$default(TopicDTO topicDTO, String str, Object obj, CommonControlSettings commonControlSettings, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                str = topicDTO.id;
            }
            if ((i11 & 2) != 0) {
                obj = topicDTO.content;
            }
            if ((i11 & 4) != 0) {
                commonControlSettings = topicDTO.common;
            }
            return topicDTO.copy(str, obj, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Object getContent() {
            return this.content;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TopicDTO copy(@NotNull String id2, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "about", type = AboutDTO.class), @ProtoOneOfSignature(name = "trails", type = TrailsDTO.class), @ProtoOneOfSignature(name = "weather", type = WeatherDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object content, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            return new TopicDTO(id2, content, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopicDTO)) {
                return false;
            }
            TopicDTO topicDTO = (TopicDTO) other;
            return Intrinsics.d(this.id, topicDTO.id) && Intrinsics.d(this.content, topicDTO.content) && Intrinsics.d(this.common, topicDTO.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final Object getContent() {
            return this.content;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int c11 = a.c(this.id.hashCode() * 31, 31, this.content);
            CommonControlSettings commonControlSettings = this.common;
            return c11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.id;
            Object obj = this.content;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder sb2 = new StringBuilder("TopicDTO(id=");
            sb2.append(str);
            sb2.append(", content=");
            sb2.append(obj);
            sb2.append(", common=");
            return b.g(sb2, commonControlSettings, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailCategoryDetailItemTypeDTO;", "", "<init>", "(Ljava/lang/String;I)V", "SPACE", "CONTENT", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class TrailCategoryDetailItemTypeDTO {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ TrailCategoryDetailItemTypeDTO[] $VALUES;
        public static final TrailCategoryDetailItemTypeDTO SPACE = new TrailCategoryDetailItemTypeDTO("SPACE", 0);
        public static final TrailCategoryDetailItemTypeDTO CONTENT = new TrailCategoryDetailItemTypeDTO("CONTENT", 1);

        private static final /* synthetic */ TrailCategoryDetailItemTypeDTO[] $values() {
            return new TrailCategoryDetailItemTypeDTO[]{SPACE, CONTENT};
        }

        static {
            TrailCategoryDetailItemTypeDTO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private TrailCategoryDetailItemTypeDTO(String str, int i11) {
        }

        @NotNull
        public static Xc.a<TrailCategoryDetailItemTypeDTO> getEntries() {
            return $ENTRIES;
        }

        public static TrailCategoryDetailItemTypeDTO valueOf(String str) {
            return (TrailCategoryDetailItemTypeDTO) Enum.valueOf(TrailCategoryDetailItemTypeDTO.class, str);
        }

        public static TrailCategoryDetailItemTypeDTO[] values() {
            return (TrailCategoryDetailItemTypeDTO[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailItemDTO;", "", "trailColorToken", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "categoryDetailItems", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailCategoryDetailItemDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTrailColorToken", "()Ljava/lang/String;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCategoryDetailItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrailItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<TrailCategoryDetailItemDTO> categoryDetailItems;

        @NotNull
        private final TextDTO text;

        @NotNull
        private final String trailColorToken;

        public TrailItemDTO(@NotNull String trailColorToken, @NotNull TextDTO text, @NotNull List<TrailCategoryDetailItemDTO> categoryDetailItems) {
            Intrinsics.checkNotNullParameter(trailColorToken, "trailColorToken");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(categoryDetailItems, "categoryDetailItems");
            this.trailColorToken = trailColorToken;
            this.text = text;
            this.categoryDetailItems = categoryDetailItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TrailItemDTO copy$default(TrailItemDTO trailItemDTO, String str, TextDTO textDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = trailItemDTO.trailColorToken;
            }
            if ((i11 & 2) != 0) {
                textDTO = trailItemDTO.text;
            }
            if ((i11 & 4) != 0) {
                list = trailItemDTO.categoryDetailItems;
            }
            return trailItemDTO.copy(str, textDTO, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTrailColorToken() {
            return this.trailColorToken;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        public final List<TrailCategoryDetailItemDTO> component3() {
            return this.categoryDetailItems;
        }

        @NotNull
        public final TrailItemDTO copy(@NotNull String trailColorToken, @NotNull TextDTO text, @NotNull List<TrailCategoryDetailItemDTO> categoryDetailItems) {
            Intrinsics.checkNotNullParameter(trailColorToken, "trailColorToken");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(categoryDetailItems, "categoryDetailItems");
            return new TrailItemDTO(trailColorToken, text, categoryDetailItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrailItemDTO)) {
                return false;
            }
            TrailItemDTO trailItemDTO = (TrailItemDTO) other;
            return Intrinsics.d(this.trailColorToken, trailItemDTO.trailColorToken) && Intrinsics.d(this.text, trailItemDTO.text) && Intrinsics.d(this.categoryDetailItems, trailItemDTO.categoryDetailItems);
        }

        @NotNull
        public final List<TrailCategoryDetailItemDTO> getCategoryDetailItems() {
            return this.categoryDetailItems;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        public final String getTrailColorToken() {
            return this.trailColorToken;
        }

        public int hashCode() {
            return this.categoryDetailItems.hashCode() + Ns.b.a(this.text, this.trailColorToken.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.trailColorToken;
            TextDTO textDTO = this.text;
            return C2618u.h(Co.a.b("TrailItemDTO(trailColorToken=", textDTO, str, ", text=", ", categoryDetailItems="), this.categoryDetailItems, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailLiftTypeDetailItemDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrailLiftTypeDetailItemDTO {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO text;

        public TrailLiftTypeDetailItemDTO(@NotNull IconDTO icon, @NotNull TextDTO text) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            this.icon = icon;
            this.text = text;
        }

        public static /* synthetic */ TrailLiftTypeDetailItemDTO copy$default(TrailLiftTypeDetailItemDTO trailLiftTypeDetailItemDTO, IconDTO iconDTO, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = trailLiftTypeDetailItemDTO.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = trailLiftTypeDetailItemDTO.text;
            }
            return trailLiftTypeDetailItemDTO.copy(iconDTO, textDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        public final TrailLiftTypeDetailItemDTO copy(@NotNull IconDTO icon, @NotNull TextDTO text) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            return new TrailLiftTypeDetailItemDTO(icon, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrailLiftTypeDetailItemDTO)) {
                return false;
            }
            TrailLiftTypeDetailItemDTO trailLiftTypeDetailItemDTO = (TrailLiftTypeDetailItemDTO) other;
            return Intrinsics.d(this.icon, trailLiftTypeDetailItemDTO.icon) && Intrinsics.d(this.text, trailLiftTypeDetailItemDTO.text);
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TrailLiftTypeDetailItemDTO(icon=" + this.icon + ", text=" + this.text + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailsDTO;", "", "items", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailItemDTO;", "map", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$MapDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "liftTypeDetailItems", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailLiftTypeDetailItemDTO;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$MapDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getMap", "()Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$MapDTO;", "getHeader", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getLiftTypeDetailItems", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrailsDTO {
        public static final int $stable = 8;

        @NotNull
        private final TextDTO header;

        @NotNull
        private final List<TrailItemDTO> items;

        @NotNull
        private final List<TrailLiftTypeDetailItemDTO> liftTypeDetailItems;
        private final MapDTO map;

        public TrailsDTO(@NotNull List<TrailItemDTO> items, MapDTO mapDTO, @NotNull TextDTO header, @NotNull List<TrailLiftTypeDetailItemDTO> liftTypeDetailItems) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(liftTypeDetailItems, "liftTypeDetailItems");
            this.items = items;
            this.map = mapDTO;
            this.header = header;
            this.liftTypeDetailItems = liftTypeDetailItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TrailsDTO copy$default(TrailsDTO trailsDTO, List list, MapDTO mapDTO, TextDTO textDTO, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = trailsDTO.items;
            }
            if ((i11 & 2) != 0) {
                mapDTO = trailsDTO.map;
            }
            if ((i11 & 4) != 0) {
                textDTO = trailsDTO.header;
            }
            if ((i11 & 8) != 0) {
                list2 = trailsDTO.liftTypeDetailItems;
            }
            return trailsDTO.copy(list, mapDTO, textDTO, list2);
        }

        @NotNull
        public final List<TrailItemDTO> component1() {
            return this.items;
        }

        /* renamed from: component2, reason: from getter */
        public final MapDTO getMap() {
            return this.map;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getHeader() {
            return this.header;
        }

        @NotNull
        public final List<TrailLiftTypeDetailItemDTO> component4() {
            return this.liftTypeDetailItems;
        }

        @NotNull
        public final TrailsDTO copy(@NotNull List<TrailItemDTO> items, MapDTO map, @NotNull TextDTO header, @NotNull List<TrailLiftTypeDetailItemDTO> liftTypeDetailItems) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(liftTypeDetailItems, "liftTypeDetailItems");
            return new TrailsDTO(items, map, header, liftTypeDetailItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrailsDTO)) {
                return false;
            }
            TrailsDTO trailsDTO = (TrailsDTO) other;
            return Intrinsics.d(this.items, trailsDTO.items) && Intrinsics.d(this.map, trailsDTO.map) && Intrinsics.d(this.header, trailsDTO.header) && Intrinsics.d(this.liftTypeDetailItems, trailsDTO.liftTypeDetailItems);
        }

        @NotNull
        public final TextDTO getHeader() {
            return this.header;
        }

        @NotNull
        public final List<TrailItemDTO> getItems() {
            return this.items;
        }

        @NotNull
        public final List<TrailLiftTypeDetailItemDTO> getLiftTypeDetailItems() {
            return this.liftTypeDetailItems;
        }

        public final MapDTO getMap() {
            return this.map;
        }

        public int hashCode() {
            int hashCode = this.items.hashCode() * 31;
            MapDTO mapDTO = this.map;
            return this.liftTypeDetailItems.hashCode() + Ns.b.a(this.header, (hashCode + (mapDTO == null ? 0 : mapDTO.hashCode())) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "TrailsDTO(items=" + this.items + ", map=" + this.map + ", header=" + this.header + ", liftTypeDetailItems=" + this.liftTypeDetailItems + ")";
        }
    }

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$WeatherDTO;", "", "items", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$WeatherItemDTO;", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getItems", "()Ljava/util/List;", "equals", "", "other", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final class WeatherDTO {

        @NotNull
        private final List<WeatherItemDTO> items;

        private /* synthetic */ WeatherDTO(List list) {
            this.items = list;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WeatherDTO m1417boximpl(List list) {
            return new WeatherDTO(list);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static List<? extends WeatherItemDTO> m1418constructorimpl(@NotNull List<WeatherItemDTO> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return items;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1419equalsimpl(List<? extends WeatherItemDTO> list, Object obj) {
            return (obj instanceof WeatherDTO) && Intrinsics.d(list, ((WeatherDTO) obj).getItems());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1420equalsimpl0(List<? extends WeatherItemDTO> list, List<? extends WeatherItemDTO> list2) {
            return Intrinsics.d(list, list2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1421hashCodeimpl(List<? extends WeatherItemDTO> list) {
            return list.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1422toStringimpl(List<? extends WeatherItemDTO> list) {
            return c.a("WeatherDTO(items=", ")", list);
        }

        public boolean equals(Object obj) {
            return m1419equalsimpl(this.items, obj);
        }

        @NotNull
        public final List<WeatherItemDTO> getItems() {
            return this.items;
        }

        public int hashCode() {
            return m1421hashCodeimpl(this.items);
        }

        public String toString() {
            return m1422toStringimpl(this.items);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ List getItems() {
            return this.items;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$WeatherItemDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "details", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/List;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getDetails", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WeatherItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<TextDTO> details;

        @NotNull
        private final ImageDTO image;

        public WeatherItemDTO(@NotNull ImageDTO image, @NotNull List<TextDTO> details) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(details, "details");
            this.image = image;
            this.details = details;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WeatherItemDTO copy$default(WeatherItemDTO weatherItemDTO, ImageDTO imageDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = weatherItemDTO.image;
            }
            if ((i11 & 2) != 0) {
                list = weatherItemDTO.details;
            }
            return weatherItemDTO.copy(imageDTO, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final List<TextDTO> component2() {
            return this.details;
        }

        @NotNull
        public final WeatherItemDTO copy(@NotNull ImageDTO image, @NotNull List<TextDTO> details) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(details, "details");
            return new WeatherItemDTO(image, details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeatherItemDTO)) {
                return false;
            }
            WeatherItemDTO weatherItemDTO = (WeatherItemDTO) other;
            return Intrinsics.d(this.image, weatherItemDTO.image) && Intrinsics.d(this.details, weatherItemDTO.details);
        }

        @NotNull
        public final List<TextDTO> getDetails() {
            return this.details;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public int hashCode() {
            return this.details.hashCode() + (this.image.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "WeatherItemDTO(image=" + this.image + ", details=" + this.details + ")";
        }
    }

    public SkiResortInfoDTO(@NotNull TextDTO title, @NotNull Tabs tabs, @NotNull List<TopicDTO> topics, @NotNull String backgroundColor, @NotNull ImageDTO themeImage, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(topics, "topics");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(themeImage, "themeImage");
        this.title = title;
        this.tabs = tabs;
        this.topics = topics;
        this.backgroundColor = backgroundColor;
        this.themeImage = themeImage;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ SkiResortInfoDTO copy$default(SkiResortInfoDTO skiResortInfoDTO, TextDTO textDTO, Tabs tabs, List list, String str, ImageDTO imageDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = skiResortInfoDTO.title;
        }
        if ((i11 & 2) != 0) {
            tabs = skiResortInfoDTO.tabs;
        }
        if ((i11 & 4) != 0) {
            list = skiResortInfoDTO.topics;
        }
        if ((i11 & 8) != 0) {
            str = skiResortInfoDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            imageDTO = skiResortInfoDTO.themeImage;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = skiResortInfoDTO.common;
        }
        ImageDTO imageDTO2 = imageDTO;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return skiResortInfoDTO.copy(textDTO, tabs, list, str, imageDTO2, commonControlSettings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Tabs getTabs() {
        return this.tabs;
    }

    @NotNull
    public final List<TopicDTO> component3() {
        return this.topics;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ImageDTO getThemeImage() {
        return this.themeImage;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final SkiResortInfoDTO copy(@NotNull TextDTO title, @NotNull Tabs tabs, @NotNull List<TopicDTO> topics, @NotNull String backgroundColor, @NotNull ImageDTO themeImage, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(topics, "topics");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(themeImage, "themeImage");
        return new SkiResortInfoDTO(title, tabs, topics, backgroundColor, themeImage, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkiResortInfoDTO)) {
            return false;
        }
        SkiResortInfoDTO skiResortInfoDTO = (SkiResortInfoDTO) other;
        return Intrinsics.d(this.title, skiResortInfoDTO.title) && Intrinsics.d(this.tabs, skiResortInfoDTO.tabs) && Intrinsics.d(this.topics, skiResortInfoDTO.topics) && Intrinsics.d(this.backgroundColor, skiResortInfoDTO.backgroundColor) && Intrinsics.d(this.themeImage, skiResortInfoDTO.themeImage) && Intrinsics.d(this.common, skiResortInfoDTO.common);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final Tabs getTabs() {
        return this.tabs;
    }

    @NotNull
    public final ImageDTO getThemeImage() {
        return this.themeImage;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<TopicDTO> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        int b11 = Nh.a.b(this.themeImage, g.a(g.b((this.tabs.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.topics), 31, this.backgroundColor), 31);
        CommonControlSettings commonControlSettings = this.common;
        return b11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        Tabs tabs = this.tabs;
        List<TopicDTO> list = this.topics;
        String str = this.backgroundColor;
        ImageDTO imageDTO = this.themeImage;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("SkiResortInfoDTO(title=");
        sb2.append(textDTO);
        sb2.append(", tabs=");
        sb2.append(tabs);
        sb2.append(", topics=");
        e.i(", backgroundColor=", str, ", themeImage=", sb2, list);
        sb2.append(imageDTO);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(")");
        return sb2.toString();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailCategoryDetailItemDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "itemType", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailCategoryDetailItemTypeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailCategoryDetailItemTypeDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getItemType", "()Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailCategoryDetailItemTypeDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrailCategoryDetailItemDTO {
        public static final int $stable = IconDTO.$stable;
        private final IconDTO icon;

        @EnumNullFallback
        @NotNull
        private final TrailCategoryDetailItemTypeDTO itemType;
        private final TextDTO text;

        public TrailCategoryDetailItemDTO(IconDTO iconDTO, TextDTO textDTO, @NotNull TrailCategoryDetailItemTypeDTO itemType) {
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            this.icon = iconDTO;
            this.text = textDTO;
            this.itemType = itemType;
        }

        public static /* synthetic */ TrailCategoryDetailItemDTO copy$default(TrailCategoryDetailItemDTO trailCategoryDetailItemDTO, IconDTO iconDTO, TextDTO textDTO, TrailCategoryDetailItemTypeDTO trailCategoryDetailItemTypeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = trailCategoryDetailItemDTO.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = trailCategoryDetailItemDTO.text;
            }
            if ((i11 & 4) != 0) {
                trailCategoryDetailItemTypeDTO = trailCategoryDetailItemDTO.itemType;
            }
            return trailCategoryDetailItemDTO.copy(iconDTO, textDTO, trailCategoryDetailItemTypeDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TrailCategoryDetailItemTypeDTO getItemType() {
            return this.itemType;
        }

        @NotNull
        public final TrailCategoryDetailItemDTO copy(IconDTO icon, TextDTO text, @NotNull TrailCategoryDetailItemTypeDTO itemType) {
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            return new TrailCategoryDetailItemDTO(icon, text, itemType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrailCategoryDetailItemDTO)) {
                return false;
            }
            TrailCategoryDetailItemDTO trailCategoryDetailItemDTO = (TrailCategoryDetailItemDTO) other;
            return Intrinsics.d(this.icon, trailCategoryDetailItemDTO.icon) && Intrinsics.d(this.text, trailCategoryDetailItemDTO.text) && this.itemType == trailCategoryDetailItemDTO.itemType;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TrailCategoryDetailItemTypeDTO getItemType() {
            return this.itemType;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            IconDTO iconDTO = this.icon;
            int hashCode = (iconDTO == null ? 0 : iconDTO.hashCode()) * 31;
            TextDTO textDTO = this.text;
            return this.itemType.hashCode() + ((hashCode + (textDTO != null ? textDTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.text;
            TrailCategoryDetailItemTypeDTO trailCategoryDetailItemTypeDTO = this.itemType;
            StringBuilder i11 = Bi.b.i("TrailCategoryDetailItemDTO(icon=", ", text=", ", itemType=", iconDTO, textDTO);
            i11.append(trailCategoryDetailItemTypeDTO);
            i11.append(")");
            return i11.toString();
        }

        public /* synthetic */ TrailCategoryDetailItemDTO(IconDTO iconDTO, TextDTO textDTO, TrailCategoryDetailItemTypeDTO trailCategoryDetailItemTypeDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(iconDTO, textDTO, (i11 & 4) != 0 ? TrailCategoryDetailItemTypeDTO.SPACE : trailCategoryDetailItemTypeDTO);
        }
    }
}
