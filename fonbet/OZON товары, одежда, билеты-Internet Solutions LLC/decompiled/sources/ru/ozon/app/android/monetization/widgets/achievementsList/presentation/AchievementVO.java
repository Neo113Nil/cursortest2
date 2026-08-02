package ru.ozon.app.android.monetization.widgets.achievementsList.presentation;

import C.o0;
import D3.h;
import N3.C3660k;
import Tl.b;
import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001:\u0003012BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u0010\u0016¨\u00063"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ImagesVO;", "images", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$LevelVO;", "level", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ProgressBarVO;", "progressBar", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "index", "<init>", "(JLru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ImagesVO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$LevelVO;Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ProgressBarVO;Lru/ozon/uni/atoms/af/AtomAction;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ImagesVO;", "getImages", "()Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ImagesVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$LevelVO;", "getLevel", "()Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$LevelVO;", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ProgressBarVO;", "getProgressBar", "()Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ProgressBarVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "I", "getIndex", "LevelVO", "ProgressBarVO", "ImagesVO", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AchievementVO implements c {
    public static final int $stable = AtomAction.$stable;
    private final AtomAction action;
    private final long id;

    @NotNull
    private final ImagesVO images;
    private final int index;
    private final LevelVO level;
    private final ProgressBarVO progressBar;

    @NotNull
    private final TextDTO title;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ImagesVO;", "", "", "defaultImageLink", "darkThemeImageLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDefaultImageLink", "getDarkThemeImageLink", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$LevelVO;", "", "", "backgroundColor", "borderColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBorderColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ProgressBarVO;", "", "", "progress", "", "progressGradient", "progressBackgroundColor", "<init>", "(FLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getProgress", "()F", "Ljava/lang/String;", "getProgressGradient", "getProgressBackgroundColor", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressBarVO {
        private final float progress;
        private final String progressBackgroundColor;
        private final String progressGradient;

        public ProgressBarVO(float f7, String str, String str2) {
            this.progress = f7;
            this.progressGradient = str;
            this.progressBackgroundColor = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressBarVO)) {
                return false;
            }
            ProgressBarVO progressBarVO = (ProgressBarVO) other;
            return Float.compare(this.progress, progressBarVO.progress) == 0 && Intrinsics.d(this.progressGradient, progressBarVO.progressGradient) && Intrinsics.d(this.progressBackgroundColor, progressBarVO.progressBackgroundColor);
        }

        public final float getProgress() {
            return this.progress;
        }

        public final String getProgressBackgroundColor() {
            return this.progressBackgroundColor;
        }

        public final String getProgressGradient() {
            return this.progressGradient;
        }

        public int hashCode() {
            int hashCode = Float.hashCode(this.progress) * 31;
            String str = this.progressGradient;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.progressBackgroundColor;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            float f7 = this.progress;
            String str = this.progressGradient;
            String str2 = this.progressBackgroundColor;
            StringBuilder sb2 = new StringBuilder("ProgressBarVO(progress=");
            sb2.append(f7);
            sb2.append(", progressGradient=");
            sb2.append(str);
            sb2.append(", progressBackgroundColor=");
            return o0.c(sb2, str2, ")");
        }
    }

    public AchievementVO(long j11, @NotNull ImagesVO images, @NotNull TextDTO title, LevelVO levelVO, ProgressBarVO progressBarVO, AtomAction atomAction, int i11) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.images = images;
        this.title = title;
        this.level = levelVO;
        this.progressBar = progressBarVO;
        this.action = atomAction;
        this.index = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchievementVO)) {
            return false;
        }
        AchievementVO achievementVO = (AchievementVO) other;
        return this.id == achievementVO.id && Intrinsics.d(this.images, achievementVO.images) && Intrinsics.d(this.title, achievementVO.title) && Intrinsics.d(this.level, achievementVO.level) && Intrinsics.d(this.progressBar, achievementVO.progressBar) && Intrinsics.d(this.action, achievementVO.action) && this.index == achievementVO.index;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImagesVO getImages() {
        return this.images;
    }

    public final int getIndex() {
        return this.index;
    }

    public final LevelVO getLevel() {
        return this.level;
    }

    public final ProgressBarVO getProgressBar() {
        return this.progressBar;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Ns.b.a(this.title, (this.images.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        LevelVO levelVO = this.level;
        int hashCode = (a11 + (levelVO == null ? 0 : levelVO.hashCode())) * 31;
        ProgressBarVO progressBarVO = this.progressBar;
        int hashCode2 = (hashCode + (progressBarVO == null ? 0 : progressBarVO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        return Integer.hashCode(this.index) + ((hashCode2 + (atomAction != null ? atomAction.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImagesVO imagesVO = this.images;
        TextDTO textDTO = this.title;
        LevelVO levelVO = this.level;
        ProgressBarVO progressBarVO = this.progressBar;
        AtomAction atomAction = this.action;
        int i11 = this.index;
        StringBuilder sb2 = new StringBuilder("AchievementVO(id=");
        sb2.append(j11);
        sb2.append(", images=");
        sb2.append(imagesVO);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", level=");
        sb2.append(levelVO);
        sb2.append(", progressBar=");
        sb2.append(progressBarVO);
        sb2.append(", action=");
        sb2.append(atomAction);
        return h.b(sb2, ", index=", i11, ")");
    }
}
