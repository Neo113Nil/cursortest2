package ru.ozon.app.android.monetization.widgets.achievementDetails.data;

import D3.g;
import N3.C3660k;
import T7.P;
import Tl.b;
import V.e;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002$%BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "images", "Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO$ImagesDTO;", "level", "Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO$LevelDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO$ImagesDTO;Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO$LevelDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getImages", "()Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO$ImagesDTO;", "getLevel", "()Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO$LevelDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "LevelDTO", "ImagesDTO", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AchievementDetailsDTO {
    public static final int $stable = 8;

    @NotNull
    private final ImagesDTO images;
    private final LevelDTO level;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO$ImagesDTO;", "", "defaultImageLink", "", "darkThemeImageLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDefaultImageLink", "()Ljava/lang/String;", "getDarkThemeImageLink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImagesDTO {
        public static final int $stable = 0;

        @NotNull
        private final String darkThemeImageLink;

        @NotNull
        private final String defaultImageLink;

        public ImagesDTO(@NotNull String defaultImageLink, @NotNull String darkThemeImageLink) {
            Intrinsics.checkNotNullParameter(defaultImageLink, "defaultImageLink");
            Intrinsics.checkNotNullParameter(darkThemeImageLink, "darkThemeImageLink");
            this.defaultImageLink = defaultImageLink;
            this.darkThemeImageLink = darkThemeImageLink;
        }

        public static /* synthetic */ ImagesDTO copy$default(ImagesDTO imagesDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = imagesDTO.defaultImageLink;
            }
            if ((i11 & 2) != 0) {
                str2 = imagesDTO.darkThemeImageLink;
            }
            return imagesDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDefaultImageLink() {
            return this.defaultImageLink;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDarkThemeImageLink() {
            return this.darkThemeImageLink;
        }

        @NotNull
        public final ImagesDTO copy(@NotNull String defaultImageLink, @NotNull String darkThemeImageLink) {
            Intrinsics.checkNotNullParameter(defaultImageLink, "defaultImageLink");
            Intrinsics.checkNotNullParameter(darkThemeImageLink, "darkThemeImageLink");
            return new ImagesDTO(defaultImageLink, darkThemeImageLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImagesDTO)) {
                return false;
            }
            ImagesDTO imagesDTO = (ImagesDTO) other;
            return Intrinsics.d(this.defaultImageLink, imagesDTO.defaultImageLink) && Intrinsics.d(this.darkThemeImageLink, imagesDTO.darkThemeImageLink);
        }

        @NotNull
        public final String getDarkThemeImageLink() {
            return this.darkThemeImageLink;
        }

        @NotNull
        public final String getDefaultImageLink() {
            return this.defaultImageLink;
        }

        public int hashCode() {
            return this.darkThemeImageLink.hashCode() + (this.defaultImageLink.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ImagesDTO(defaultImageLink=", this.defaultImageLink, ", darkThemeImageLink=", this.darkThemeImageLink, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO$LevelDTO;", "", "backgroundColor", "", "borderColor", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LevelDTO {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final String borderColor;

        @NotNull
        private final TextDTO text;

        public LevelDTO(String str, String str2, @NotNull TextDTO text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.backgroundColor = str;
            this.borderColor = str2;
            this.text = text;
        }

        public static /* synthetic */ LevelDTO copy$default(LevelDTO levelDTO, String str, String str2, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = levelDTO.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = levelDTO.borderColor;
            }
            if ((i11 & 4) != 0) {
                textDTO = levelDTO.text;
            }
            return levelDTO.copy(str, str2, textDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        public final LevelDTO copy(String backgroundColor, String borderColor, @NotNull TextDTO text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new LevelDTO(backgroundColor, borderColor, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LevelDTO)) {
                return false;
            }
            LevelDTO levelDTO = (LevelDTO) other;
            return Intrinsics.d(this.backgroundColor, levelDTO.backgroundColor) && Intrinsics.d(this.borderColor, levelDTO.borderColor) && Intrinsics.d(this.text, levelDTO.text);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.borderColor;
            return this.text.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.borderColor;
            return b.e(C3660k.d("LevelDTO(backgroundColor=", str, ", borderColor=", str2, ", text="), this.text, ")");
        }
    }

    public AchievementDetailsDTO(TextDTO textDTO, TextDTO textDTO2, @NotNull ImagesDTO images, LevelDTO levelDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.images = images;
        this.level = levelDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AchievementDetailsDTO copy$default(AchievementDetailsDTO achievementDetailsDTO, TextDTO textDTO, TextDTO textDTO2, ImagesDTO imagesDTO, LevelDTO levelDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = achievementDetailsDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = achievementDetailsDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            imagesDTO = achievementDetailsDTO.images;
        }
        if ((i11 & 8) != 0) {
            levelDTO = achievementDetailsDTO.level;
        }
        if ((i11 & 16) != 0) {
            map = achievementDetailsDTO.trackingInfo;
        }
        Map map2 = map;
        ImagesDTO imagesDTO2 = imagesDTO;
        return achievementDetailsDTO.copy(textDTO, textDTO2, imagesDTO2, levelDTO, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ImagesDTO getImages() {
        return this.images;
    }

    /* renamed from: component4, reason: from getter */
    public final LevelDTO getLevel() {
        return this.level;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final AchievementDetailsDTO copy(TextDTO title, TextDTO subtitle, @NotNull ImagesDTO images, LevelDTO level, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(images, "images");
        return new AchievementDetailsDTO(title, subtitle, images, level, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchievementDetailsDTO)) {
            return false;
        }
        AchievementDetailsDTO achievementDetailsDTO = (AchievementDetailsDTO) other;
        return Intrinsics.d(this.title, achievementDetailsDTO.title) && Intrinsics.d(this.subtitle, achievementDetailsDTO.subtitle) && Intrinsics.d(this.images, achievementDetailsDTO.images) && Intrinsics.d(this.level, achievementDetailsDTO.level) && Intrinsics.d(this.trackingInfo, achievementDetailsDTO.trackingInfo);
    }

    @NotNull
    public final ImagesDTO getImages() {
        return this.images;
    }

    public final LevelDTO getLevel() {
        return this.level;
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
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode2 = (this.images.hashCode() + ((hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31)) * 31;
        LevelDTO levelDTO = this.level;
        int hashCode3 = (hashCode2 + (levelDTO == null ? 0 : levelDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        ImagesDTO imagesDTO = this.images;
        LevelDTO levelDTO = this.level;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = g.g("AchievementDetailsDTO(title=", textDTO, ", subtitle=", textDTO2, ", images=");
        g10.append(imagesDTO);
        g10.append(", level=");
        g10.append(levelDTO);
        g10.append(", trackingInfo=");
        return P.f(g10, map, ")");
    }
}
