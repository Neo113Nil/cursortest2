package ru.ozon.app.android.checkoutcomposer.totalV3.presentation;

import B90.C2618u;
import D3.g;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.totalV3.progressBar.ProgressBarVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001:\u0003$%&B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveActionsVO;", "interactiveActions", "Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarVO;", "progressBar", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveActionsVO;Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarVO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveActionsVO;", "getInteractiveActions", "()Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveActionsVO;", "Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarVO;", "getProgressBar", "()Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "InteractiveActionsVO", "HintVO", "InteractiveSummaryVO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TotalV3VO implements c {
    private final long id;

    @NotNull
    private final InteractiveActionsVO interactiveActions;
    private final ProgressBarVO progressBar;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$HintVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "message", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getMessage", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HintVO {
        private final TextDTO message;

        public HintVO(TextDTO textDTO) {
            this.message = textDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HintVO) && Intrinsics.d(this.message, ((HintVO) other).message);
        }

        public final TextDTO getMessage() {
            return this.message;
        }

        public int hashCode() {
            TextDTO textDTO = this.message;
            if (textDTO == null) {
                return 0;
            }
            return textDTO.hashCode();
        }

        @NotNull
        public String toString() {
            return "HintVO(message=" + this.message + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveActionsVO;", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$HintVO;", "hints", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveSummaryVO;", "interactiveSummary", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/util/List;", "getHints", "()Ljava/util/List;", "getInteractiveSummary", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InteractiveActionsVO {

        @NotNull
        private final ButtonV3DTO button;
        private final List<HintVO> hints;
        private final List<InteractiveSummaryVO> interactiveSummary;

        public InteractiveActionsVO(@NotNull ButtonV3DTO button, List<HintVO> list, List<InteractiveSummaryVO> list2) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.hints = list;
            this.interactiveSummary = list2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InteractiveActionsVO)) {
                return false;
            }
            InteractiveActionsVO interactiveActionsVO = (InteractiveActionsVO) other;
            return Intrinsics.d(this.button, interactiveActionsVO.button) && Intrinsics.d(this.hints, interactiveActionsVO.hints) && Intrinsics.d(this.interactiveSummary, interactiveActionsVO.interactiveSummary);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final List<HintVO> getHints() {
            return this.hints;
        }

        public final List<InteractiveSummaryVO> getInteractiveSummary() {
            return this.interactiveSummary;
        }

        public int hashCode() {
            int hashCode = this.button.hashCode() * 31;
            List<HintVO> list = this.hints;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<InteractiveSummaryVO> list2 = this.interactiveSummary;
            return hashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ButtonV3DTO buttonV3DTO = this.button;
            List<HintVO> list = this.hints;
            List<InteractiveSummaryVO> list2 = this.interactiveSummary;
            StringBuilder sb2 = new StringBuilder("InteractiveActionsVO(button=");
            sb2.append(buttonV3DTO);
            sb2.append(", hints=");
            sb2.append(list);
            sb2.append(", interactiveSummary=");
            return C2618u.h(sb2, list2, ")");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveSummaryVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "info", "", "backgroundColor", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getInfo", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InteractiveSummaryVO {
        public static final int $stable = IconDTO.$stable;
        private final String backgroundColor;
        private final CommonControlSettings common;
        private final IconDTO icon;
        private final TextDTO info;
        private final TextDTO subtitle;
        private final TextDTO title;

        public InteractiveSummaryVO(TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, TextDTO textDTO3, String str, CommonControlSettings commonControlSettings) {
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.icon = iconDTO;
            this.info = textDTO3;
            this.backgroundColor = str;
            this.common = commonControlSettings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InteractiveSummaryVO)) {
                return false;
            }
            InteractiveSummaryVO interactiveSummaryVO = (InteractiveSummaryVO) other;
            return Intrinsics.d(this.title, interactiveSummaryVO.title) && Intrinsics.d(this.subtitle, interactiveSummaryVO.subtitle) && Intrinsics.d(this.icon, interactiveSummaryVO.icon) && Intrinsics.d(this.info, interactiveSummaryVO.info) && Intrinsics.d(this.backgroundColor, interactiveSummaryVO.backgroundColor) && Intrinsics.d(this.common, interactiveSummaryVO.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final TextDTO getInfo() {
            return this.info;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            TextDTO textDTO3 = this.info;
            int hashCode4 = (hashCode3 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode5 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            IconDTO iconDTO = this.icon;
            TextDTO textDTO3 = this.info;
            String str = this.backgroundColor;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder g10 = g.g("InteractiveSummaryVO(title=", textDTO, ", subtitle=", textDTO2, ", icon=");
            g10.append(iconDTO);
            g10.append(", info=");
            g10.append(textDTO3);
            g10.append(", backgroundColor=");
            g10.append(str);
            g10.append(", common=");
            g10.append(commonControlSettings);
            g10.append(")");
            return g10.toString();
        }
    }

    public TotalV3VO(long j11, @NotNull InteractiveActionsVO interactiveActions, ProgressBarVO progressBarVO, t tVar) {
        Intrinsics.checkNotNullParameter(interactiveActions, "interactiveActions");
        this.id = j11;
        this.interactiveActions = interactiveActions;
        this.progressBar = progressBarVO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalV3VO)) {
            return false;
        }
        TotalV3VO totalV3VO = (TotalV3VO) other;
        return this.id == totalV3VO.id && Intrinsics.d(this.interactiveActions, totalV3VO.interactiveActions) && Intrinsics.d(this.progressBar, totalV3VO.progressBar) && Intrinsics.d(this.tokenizedEvent, totalV3VO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final InteractiveActionsVO getInteractiveActions() {
        return this.interactiveActions;
    }

    public final ProgressBarVO getProgressBar() {
        return this.progressBar;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.interactiveActions.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        ProgressBarVO progressBarVO = this.progressBar;
        int hashCode2 = (hashCode + (progressBarVO == null ? 0 : progressBarVO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TotalV3VO(id=" + this.id + ", interactiveActions=" + this.interactiveActions + ", progressBar=" + this.progressBar + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}
