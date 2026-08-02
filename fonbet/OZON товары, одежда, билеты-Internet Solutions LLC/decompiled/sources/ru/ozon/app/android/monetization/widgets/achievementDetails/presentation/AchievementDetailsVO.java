package ru.ozon.app.android.monetization.widgets.achievementDetails.presentation;

import N3.C3660k;
import TY.a;
import Tl.b;
import V.e;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001:\u0002+,BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$ImagesVO;", "images", "Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$LevelVO;", "level", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewTokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$ImagesVO;Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$LevelVO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$ImagesVO;", "getImages", "()Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$ImagesVO;", "Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$LevelVO;", "getLevel", "()Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$LevelVO;", "LWZ/t;", "getViewTokenizedEvent", "()LWZ/t;", "LevelVO", "ImagesVO", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AchievementDetailsVO implements c {
    private final long id;

    @NotNull
    private final ImagesVO images;
    private final LevelVO level;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final t viewTokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$ImagesVO;", "", "", "defaultImageLink", "darkThemeImageLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDefaultImageLink", "getDarkThemeImageLink", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImagesVO {

        @NotNull
        private final String darkThemeImageLink;

        @NotNull
        private final String defaultImageLink;

        public ImagesVO(@NotNull String defaultImageLink, @NotNull String darkThemeImageLink) {
            Intrinsics.checkNotNullParameter(defaultImageLink, "defaultImageLink");
            Intrinsics.checkNotNullParameter(darkThemeImageLink, "darkThemeImageLink");
            this.defaultImageLink = defaultImageLink;
            this.darkThemeImageLink = darkThemeImageLink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImagesVO)) {
                return false;
            }
            ImagesVO imagesVO = (ImagesVO) other;
            return Intrinsics.d(this.defaultImageLink, imagesVO.defaultImageLink) && Intrinsics.d(this.darkThemeImageLink, imagesVO.darkThemeImageLink);
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
            return e.a("ImagesVO(defaultImageLink=", this.defaultImageLink, ", darkThemeImageLink=", this.darkThemeImageLink, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$LevelVO;", "", "", "backgroundColor", "borderColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBorderColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LevelVO {
        private final String backgroundColor;
        private final String borderColor;

        @NotNull
        private final TextDTO text;

        public LevelVO(String str, String str2, @NotNull TextDTO text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.backgroundColor = str;
            this.borderColor = str2;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LevelVO)) {
                return false;
            }
            LevelVO levelVO = (LevelVO) other;
            return Intrinsics.d(this.backgroundColor, levelVO.backgroundColor) && Intrinsics.d(this.borderColor, levelVO.borderColor) && Intrinsics.d(this.text, levelVO.text);
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
            return b.e(C3660k.d("LevelVO(backgroundColor=", str, ", borderColor=", str2, ", text="), this.text, ")");
        }
    }

    public AchievementDetailsVO(long j11, TextDTO textDTO, TextDTO textDTO2, @NotNull ImagesVO images, LevelVO levelVO, t tVar) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.id = j11;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.images = images;
        this.level = levelVO;
        this.viewTokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchievementDetailsVO)) {
            return false;
        }
        AchievementDetailsVO achievementDetailsVO = (AchievementDetailsVO) other;
        return this.id == achievementDetailsVO.id && Intrinsics.d(this.title, achievementDetailsVO.title) && Intrinsics.d(this.subtitle, achievementDetailsVO.subtitle) && Intrinsics.d(this.images, achievementDetailsVO.images) && Intrinsics.d(this.level, achievementDetailsVO.level) && Intrinsics.d(this.viewTokenizedEvent, achievementDetailsVO.viewTokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImagesVO getImages() {
        return this.images;
    }

    public final LevelVO getLevel() {
        return this.level;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final t getViewTokenizedEvent() {
        return this.viewTokenizedEvent;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode3 = (this.images.hashCode() + ((hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31)) * 31;
        LevelVO levelVO = this.level;
        int hashCode4 = (hashCode3 + (levelVO == null ? 0 : levelVO.hashCode())) * 31;
        t tVar = this.viewTokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        ImagesVO imagesVO = this.images;
        LevelVO levelVO = this.level;
        t tVar = this.viewTokenizedEvent;
        StringBuilder b11 = a.b("AchievementDetailsVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", images=");
        b11.append(imagesVO);
        b11.append(", level=");
        b11.append(levelVO);
        b11.append(", viewTokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
