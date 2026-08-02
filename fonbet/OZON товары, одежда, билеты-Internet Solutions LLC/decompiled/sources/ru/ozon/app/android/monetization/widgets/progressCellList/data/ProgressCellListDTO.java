package ru.ozon.app.android.monetization.widgets.progressCellList.data;

import C.o0;
import Cm.e;
import Co.a;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/monetization/widgets/progressCellList/data/ProgressCellListDTO;", "", "progressCellList", "", "Lru/ozon/app/android/monetization/widgets/progressCellList/data/ProgressCellListDTO$ProgressCellDTO;", "settings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getProgressCellList", "()Ljava/util/List;", "getSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ProgressCellDTO", "ProgressBarDTO", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProgressCellListDTO {
    public static final int $stable = 8;
    private final List<ProgressCellDTO> progressCellList;
    private final CommonControlSettings settings;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/monetization/widgets/progressCellList/data/ProgressCellListDTO$ProgressBarDTO;", "", "progress", "", "progressGradient", "", "progressBackgroundColor", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getProgress", "()I", "getProgressGradient", "()Ljava/lang/String;", "getProgressBackgroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            return o0.c(e.g(i11, "ProgressBarDTO(progress=", ", progressGradient=", str, ", progressBackgroundColor="), this.progressBackgroundColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/monetization/widgets/progressCellList/data/ProgressCellListDTO$ProgressCellDTO;", "", "backgroundColor", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "progressBar", "Lru/ozon/app/android/monetization/widgets/progressCellList/data/ProgressCellListDTO$ProgressBarDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Lru/ozon/app/android/monetization/widgets/progressCellList/data/ProgressCellListDTO$ProgressBarDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBadges", "()Ljava/util/List;", "getProgressBar", "()Lru/ozon/app/android/monetization/widgets/progressCellList/data/ProgressCellListDTO$ProgressBarDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressCellDTO {
        public static final int $stable = 8;
        private final String backgroundColor;
        private final List<BadgeDTO> badges;
        private final IconDTO icon;
        private final ProgressBarDTO progressBar;

        @NotNull
        private final TextDTO title;

        public ProgressCellDTO(String str, @NotNull TextDTO title, IconDTO iconDTO, List<BadgeDTO> list, ProgressBarDTO progressBarDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.backgroundColor = str;
            this.title = title;
            this.icon = iconDTO;
            this.badges = list;
            this.progressBar = progressBarDTO;
        }

        public static /* synthetic */ ProgressCellDTO copy$default(ProgressCellDTO progressCellDTO, String str, TextDTO textDTO, IconDTO iconDTO, List list, ProgressBarDTO progressBarDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = progressCellDTO.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                textDTO = progressCellDTO.title;
            }
            if ((i11 & 4) != 0) {
                iconDTO = progressCellDTO.icon;
            }
            if ((i11 & 8) != 0) {
                list = progressCellDTO.badges;
            }
            if ((i11 & 16) != 0) {
                progressBarDTO = progressCellDTO.progressBar;
            }
            ProgressBarDTO progressBarDTO2 = progressBarDTO;
            IconDTO iconDTO2 = iconDTO;
            return progressCellDTO.copy(str, textDTO, iconDTO2, list, progressBarDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final List<BadgeDTO> component4() {
            return this.badges;
        }

        /* renamed from: component5, reason: from getter */
        public final ProgressBarDTO getProgressBar() {
            return this.progressBar;
        }

        @NotNull
        public final ProgressCellDTO copy(String backgroundColor, @NotNull TextDTO title, IconDTO icon, List<BadgeDTO> badges, ProgressBarDTO progressBar) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new ProgressCellDTO(backgroundColor, title, icon, badges, progressBar);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressCellDTO)) {
                return false;
            }
            ProgressCellDTO progressCellDTO = (ProgressCellDTO) other;
            return Intrinsics.d(this.backgroundColor, progressCellDTO.backgroundColor) && Intrinsics.d(this.title, progressCellDTO.title) && Intrinsics.d(this.icon, progressCellDTO.icon) && Intrinsics.d(this.badges, progressCellDTO.badges) && Intrinsics.d(this.progressBar, progressCellDTO.progressBar);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final ProgressBarDTO getProgressBar() {
            return this.progressBar;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int a11 = b.a(this.title, (str == null ? 0 : str.hashCode()) * 31, 31);
            IconDTO iconDTO = this.icon;
            int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            List<BadgeDTO> list = this.badges;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            ProgressBarDTO progressBarDTO = this.progressBar;
            return hashCode2 + (progressBarDTO != null ? progressBarDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.icon;
            List<BadgeDTO> list = this.badges;
            ProgressBarDTO progressBarDTO = this.progressBar;
            StringBuilder b11 = a.b("ProgressCellDTO(backgroundColor=", textDTO, str, ", title=", ", icon=");
            b11.append(iconDTO);
            b11.append(", badges=");
            b11.append(list);
            b11.append(", progressBar=");
            b11.append(progressBarDTO);
            b11.append(")");
            return b11.toString();
        }
    }

    public ProgressCellListDTO(List<ProgressCellDTO> list, CommonControlSettings commonControlSettings) {
        this.progressCellList = list;
        this.settings = commonControlSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProgressCellListDTO copy$default(ProgressCellListDTO progressCellListDTO, List list, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = progressCellListDTO.progressCellList;
        }
        if ((i11 & 2) != 0) {
            commonControlSettings = progressCellListDTO.settings;
        }
        return progressCellListDTO.copy(list, commonControlSettings);
    }

    public final List<ProgressCellDTO> component1() {
        return this.progressCellList;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonControlSettings getSettings() {
        return this.settings;
    }

    @NotNull
    public final ProgressCellListDTO copy(List<ProgressCellDTO> progressCellList, CommonControlSettings settings) {
        return new ProgressCellListDTO(progressCellList, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressCellListDTO)) {
            return false;
        }
        ProgressCellListDTO progressCellListDTO = (ProgressCellListDTO) other;
        return Intrinsics.d(this.progressCellList, progressCellListDTO.progressCellList) && Intrinsics.d(this.settings, progressCellListDTO.settings);
    }

    public final List<ProgressCellDTO> getProgressCellList() {
        return this.progressCellList;
    }

    public final CommonControlSettings getSettings() {
        return this.settings;
    }

    public int hashCode() {
        List<ProgressCellDTO> list = this.progressCellList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        CommonControlSettings commonControlSettings = this.settings;
        return hashCode + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProgressCellListDTO(progressCellList=" + this.progressCellList + ", settings=" + this.settings + ")";
    }
}
