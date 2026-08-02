package ru.ozon.app.android.monetization.widgets.progressCellList.presentation;

import C.o0;
import Co.a;
import G.g;
import Ns.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001:\u0002 !B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressCellVO;", "progressCellList", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewTokenizedEvent", "<init>", "(JLjava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getProgressCellList", "()Ljava/util/List;", "LWZ/t;", "getViewTokenizedEvent", "()LWZ/t;", "ProgressCellVO", "ProgressBarVO", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProgressCellListVO implements c {
    private final long id;

    @NotNull
    private final List<ProgressCellVO> progressCellList;
    private final t viewTokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressBarVO;", "", "", "progress", "", "progressGradient", "progressBackgroundColor", "<init>", "(FLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getProgress", "()F", "Ljava/lang/String;", "getProgressGradient", "getProgressBackgroundColor", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressCellVO;", "", "", "backgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressBarVO;", "progressBar", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressBarVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressBarVO;", "getProgressBar", "()Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressBarVO;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressCellVO {
        private final String backgroundColor;
        private final List<BadgeDTO> badges;
        private final IconDTO icon;
        private final ProgressBarVO progressBar;

        @NotNull
        private final TextDTO title;

        public ProgressCellVO(String str, @NotNull TextDTO title, IconDTO iconDTO, List<BadgeDTO> list, ProgressBarVO progressBarVO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.backgroundColor = str;
            this.title = title;
            this.icon = iconDTO;
            this.badges = list;
            this.progressBar = progressBarVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressCellVO)) {
                return false;
            }
            ProgressCellVO progressCellVO = (ProgressCellVO) other;
            return Intrinsics.d(this.backgroundColor, progressCellVO.backgroundColor) && Intrinsics.d(this.title, progressCellVO.title) && Intrinsics.d(this.icon, progressCellVO.icon) && Intrinsics.d(this.badges, progressCellVO.badges) && Intrinsics.d(this.progressBar, progressCellVO.progressBar);
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

        public final ProgressBarVO getProgressBar() {
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
            ProgressBarVO progressBarVO = this.progressBar;
            return hashCode2 + (progressBarVO != null ? progressBarVO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.icon;
            List<BadgeDTO> list = this.badges;
            ProgressBarVO progressBarVO = this.progressBar;
            StringBuilder b11 = a.b("ProgressCellVO(backgroundColor=", textDTO, str, ", title=", ", icon=");
            b11.append(iconDTO);
            b11.append(", badges=");
            b11.append(list);
            b11.append(", progressBar=");
            b11.append(progressBarVO);
            b11.append(")");
            return b11.toString();
        }
    }

    public ProgressCellListVO(long j11, @NotNull List<ProgressCellVO> progressCellList, t tVar) {
        Intrinsics.checkNotNullParameter(progressCellList, "progressCellList");
        this.id = j11;
        this.progressCellList = progressCellList;
        this.viewTokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressCellListVO)) {
            return false;
        }
        ProgressCellListVO progressCellListVO = (ProgressCellListVO) other;
        return this.id == progressCellListVO.id && Intrinsics.d(this.progressCellList, progressCellListVO.progressCellList) && Intrinsics.d(this.viewTokenizedEvent, progressCellListVO.viewTokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ProgressCellVO> getProgressCellList() {
        return this.progressCellList;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final t getViewTokenizedEvent() {
        return this.viewTokenizedEvent;
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.progressCellList);
        t tVar = this.viewTokenizedEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ProgressCellVO> list = this.progressCellList;
        return Lh.a.b(Lh.b.b(j11, "ProgressCellListVO(id=", ", progressCellList=", list), ", viewTokenizedEvent=", this.viewTokenizedEvent, ")");
    }
}
