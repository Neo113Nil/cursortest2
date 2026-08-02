package ru.ozon.app.android.monetization.widgets.achievementsList.data;

import C.o0;
import Kk.c;
import N3.C3660k;
import Ns.b;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB-\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;", "", "achievements", "", "Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$AchievementDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getAchievements", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AchievementDTO", "LevelDTO", "ProgressBarDTO", "ImagesDTO", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AchievementsListDTO {
    public static final int $stable = 8;
    private final List<AchievementDTO> achievements;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$AchievementDTO;", "", "images", "Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$ImagesDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "level", "Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$LevelDTO;", "progressBar", "Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$ProgressBarDTO;", "settings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$ImagesDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$LevelDTO;Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$ProgressBarDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getImages", "()Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$ImagesDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getLevel", "()Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$LevelDTO;", "getProgressBar", "()Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$ProgressBarDTO;", "getSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AchievementDTO {
        public static final int $stable = 0;

        @NotNull
        private final ImagesDTO images;
        private final LevelDTO level;
        private final ProgressBarDTO progressBar;
        private final CommonControlSettings settings;

        @NotNull
        private final TextDTO title;

        public AchievementDTO(@NotNull ImagesDTO images, @NotNull TextDTO title, LevelDTO levelDTO, ProgressBarDTO progressBarDTO, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(title, "title");
            this.images = images;
            this.title = title;
            this.level = levelDTO;
            this.progressBar = progressBarDTO;
            this.settings = commonControlSettings;
        }

        public static /* synthetic */ AchievementDTO copy$default(AchievementDTO achievementDTO, ImagesDTO imagesDTO, TextDTO textDTO, LevelDTO levelDTO, ProgressBarDTO progressBarDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imagesDTO = achievementDTO.images;
            }
            if ((i11 & 2) != 0) {
                textDTO = achievementDTO.title;
            }
            if ((i11 & 4) != 0) {
                levelDTO = achievementDTO.level;
            }
            if ((i11 & 8) != 0) {
                progressBarDTO = achievementDTO.progressBar;
            }
            if ((i11 & 16) != 0) {
                commonControlSettings = achievementDTO.settings;
            }
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            LevelDTO levelDTO2 = levelDTO;
            return achievementDTO.copy(imagesDTO, textDTO, levelDTO2, progressBarDTO, commonControlSettings2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImagesDTO getImages() {
            return this.images;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final LevelDTO getLevel() {
            return this.level;
        }

        /* renamed from: component4, reason: from getter */
        public final ProgressBarDTO getProgressBar() {
            return this.progressBar;
        }

        /* renamed from: component5, reason: from getter */
        public final CommonControlSettings getSettings() {
            return this.settings;
        }

        @NotNull
        public final AchievementDTO copy(@NotNull ImagesDTO images, @NotNull TextDTO title, LevelDTO level, ProgressBarDTO progressBar, CommonControlSettings settings) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(title, "title");
            return new AchievementDTO(images, title, level, progressBar, settings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AchievementDTO)) {
                return false;
            }
            AchievementDTO achievementDTO = (AchievementDTO) other;
            return Intrinsics.d(this.images, achievementDTO.images) && Intrinsics.d(this.title, achievementDTO.title) && Intrinsics.d(this.level, achievementDTO.level) && Intrinsics.d(this.progressBar, achievementDTO.progressBar) && Intrinsics.d(this.settings, achievementDTO.settings);
        }

        @NotNull
        public final ImagesDTO getImages() {
            return this.images;
        }

        public final LevelDTO getLevel() {
            return this.level;
        }

        public final ProgressBarDTO getProgressBar() {
            return this.progressBar;
        }

        public final CommonControlSettings getSettings() {
            return this.settings;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.images.hashCode() * 31, 31);
            LevelDTO levelDTO = this.level;
            int hashCode = (a11 + (levelDTO == null ? 0 : levelDTO.hashCode())) * 31;
            ProgressBarDTO progressBarDTO = this.progressBar;
            int hashCode2 = (hashCode + (progressBarDTO == null ? 0 : progressBarDTO.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.settings;
            return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImagesDTO imagesDTO = this.images;
            TextDTO textDTO = this.title;
            LevelDTO levelDTO = this.level;
            ProgressBarDTO progressBarDTO = this.progressBar;
            CommonControlSettings commonControlSettings = this.settings;
            StringBuilder sb2 = new StringBuilder("AchievementDTO(images=");
            sb2.append(imagesDTO);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", level=");
            sb2.append(levelDTO);
            sb2.append(", progressBar=");
            sb2.append(progressBarDTO);
            sb2.append(", settings=");
            return Ak.b.g(sb2, commonControlSettings, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$ImagesDTO;", "", "defaultImageLink", "", "darkThemeImageLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDefaultImageLink", "()Ljava/lang/String;", "getDarkThemeImageLink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$LevelDTO;", "", "backgroundColor", "", "borderColor", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            return Tl.b.e(C3660k.d("LevelDTO(backgroundColor=", str, ", borderColor=", str2, ", text="), this.text, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$ProgressBarDTO;", "", "progress", "", "progressGradient", "", "progressBackgroundColor", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getProgress", "()I", "getProgressGradient", "()Ljava/lang/String;", "getProgressBackgroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressBarDTO {
        public static final int $stable = 0;
        private final int progress;
        private final String progressBackgroundColor;
        private final String progressGradient;

        public ProgressBarDTO(int i11, String str, String str2) {
            this.progress = i11;
            this.progressGradient = str;
            this.progressBackgroundColor = str2;
        }

        public static /* synthetic */ ProgressBarDTO copy$default(ProgressBarDTO progressBarDTO, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = progressBarDTO.progress;
            }
            if ((i12 & 2) != 0) {
                str = progressBarDTO.progressGradient;
            }
            if ((i12 & 4) != 0) {
                str2 = progressBarDTO.progressBackgroundColor;
            }
            return progressBarDTO.copy(i11, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getProgress() {
            return this.progress;
        }

        /* renamed from: component2, reason: from getter */
        public final String getProgressGradient() {
            return this.progressGradient;
        }

        /* renamed from: component3, reason: from getter */
        public final String getProgressBackgroundColor() {
            return this.progressBackgroundColor;
        }

        @NotNull
        public final ProgressBarDTO copy(int progress, String progressGradient, String progressBackgroundColor) {
            return new ProgressBarDTO(progress, progressGradient, progressBackgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressBarDTO)) {
                return false;
            }
            ProgressBarDTO progressBarDTO = (ProgressBarDTO) other;
            return this.progress == progressBarDTO.progress && Intrinsics.d(this.progressGradient, progressBarDTO.progressGradient) && Intrinsics.d(this.progressBackgroundColor, progressBarDTO.progressBackgroundColor);
        }

        public final int getProgress() {
            return this.progress;
        }

        public final String getProgressBackgroundColor() {
            return this.progressBackgroundColor;
        }

        public final String getProgressGradient() {
            return this.progressGradient;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.progress) * 31;
            String str = this.progressGradient;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.progressBackgroundColor;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.progress;
            String str = this.progressGradient;
            return o0.c(Cm.e.g(i11, "ProgressBarDTO(progress=", ", progressGradient=", str, ", progressBackgroundColor="), this.progressBackgroundColor, ")");
        }
    }

    public AchievementsListDTO(List<AchievementDTO> list, Map<String, TokenizedTrackingInfo> map) {
        this.achievements = list;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AchievementsListDTO copy$default(AchievementsListDTO achievementsListDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = achievementsListDTO.achievements;
        }
        if ((i11 & 2) != 0) {
            map = achievementsListDTO.trackingInfo;
        }
        return achievementsListDTO.copy(list, map);
    }

    public final List<AchievementDTO> component1() {
        return this.achievements;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final AchievementsListDTO copy(List<AchievementDTO> achievements, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new AchievementsListDTO(achievements, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchievementsListDTO)) {
            return false;
        }
        AchievementsListDTO achievementsListDTO = (AchievementsListDTO) other;
        return Intrinsics.d(this.achievements, achievementsListDTO.achievements) && Intrinsics.d(this.trackingInfo, achievementsListDTO.trackingInfo);
    }

    public final List<AchievementDTO> getAchievements() {
        return this.achievements;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        List<AchievementDTO> list = this.achievements;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return c.d("AchievementsListDTO(achievements=", ", trackingInfo=", ")", this.achievements, this.trackingInfo);
    }
}
