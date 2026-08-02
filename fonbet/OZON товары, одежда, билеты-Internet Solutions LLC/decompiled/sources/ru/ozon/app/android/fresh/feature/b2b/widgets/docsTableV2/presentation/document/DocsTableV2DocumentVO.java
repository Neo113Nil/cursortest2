package ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.presentation.document;

import D3.g;
import D3.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00015BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b+\u0010'R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/presentation/document/DocsTableV2DocumentVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "sum", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/presentation/document/DocsTableV2DocumentVO$Status;", "status", "dateInfo", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "showSeparator", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/presentation/document/DocsTableV2DocumentVO$Status;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getHeader", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getSum", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/presentation/document/DocsTableV2DocumentVO$Status;", "getStatus", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/presentation/document/DocsTableV2DocumentVO$Status;", "getDateInfo", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Z", "getShowSeparator", "()Z", "Status", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DocsTableV2DocumentVO implements c {
    private final BadgeDTO badge;
    private final List<ButtonV3DTO> buttons;
    private final TextDTO dateInfo;
    private final CellDTO header;
    private final long id;
    private final boolean showSeparator;
    private final Status status;
    private final TextDTO sum;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/presentation/document/DocsTableV2DocumentVO$Status;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "statusInfo", "statusTitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "statusIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getStatusInfo", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getStatusTitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getStatusIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = AtomAction.$stable | IconDTO.$stable;
        private final AtomAction action;
        private final IconDTO statusIcon;
        private final TextDTO statusInfo;
        private final TextDTO statusTitle;

        public Status(TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, AtomAction atomAction) {
            this.statusInfo = textDTO;
            this.statusTitle = textDTO2;
            this.statusIcon = iconDTO;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            return Intrinsics.d(this.statusInfo, status.statusInfo) && Intrinsics.d(this.statusTitle, status.statusTitle) && Intrinsics.d(this.statusIcon, status.statusIcon) && Intrinsics.d(this.action, status.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final IconDTO getStatusIcon() {
            return this.statusIcon;
        }

        public final TextDTO getStatusInfo() {
            return this.statusInfo;
        }

        public final TextDTO getStatusTitle() {
            return this.statusTitle;
        }

        public int hashCode() {
            TextDTO textDTO = this.statusInfo;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.statusTitle;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            IconDTO iconDTO = this.statusIcon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            return hashCode3 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.statusInfo;
            TextDTO textDTO2 = this.statusTitle;
            IconDTO iconDTO = this.statusIcon;
            AtomAction atomAction = this.action;
            StringBuilder g10 = g.g("Status(statusInfo=", textDTO, ", statusTitle=", textDTO2, ", statusIcon=");
            g10.append(iconDTO);
            g10.append(", action=");
            g10.append(atomAction);
            g10.append(")");
            return g10.toString();
        }
    }

    public DocsTableV2DocumentVO(long j11, CellDTO cellDTO, TextDTO textDTO, Status status, TextDTO textDTO2, List<ButtonV3DTO> list, BadgeDTO badgeDTO, boolean z11) {
        this.id = j11;
        this.header = cellDTO;
        this.sum = textDTO;
        this.status = status;
        this.dateInfo = textDTO2;
        this.buttons = list;
        this.badge = badgeDTO;
        this.showSeparator = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocsTableV2DocumentVO)) {
            return false;
        }
        DocsTableV2DocumentVO docsTableV2DocumentVO = (DocsTableV2DocumentVO) other;
        return this.id == docsTableV2DocumentVO.id && Intrinsics.d(this.header, docsTableV2DocumentVO.header) && Intrinsics.d(this.sum, docsTableV2DocumentVO.sum) && Intrinsics.d(this.status, docsTableV2DocumentVO.status) && Intrinsics.d(this.dateInfo, docsTableV2DocumentVO.dateInfo) && Intrinsics.d(this.buttons, docsTableV2DocumentVO.buttons) && Intrinsics.d(this.badge, docsTableV2DocumentVO.badge) && this.showSeparator == docsTableV2DocumentVO.showSeparator;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final TextDTO getDateInfo() {
        return this.dateInfo;
    }

    public final CellDTO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final TextDTO getSum() {
        return this.sum;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        CellDTO cellDTO = this.header;
        int hashCode2 = (hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        TextDTO textDTO = this.sum;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Status status = this.status;
        int hashCode4 = (hashCode3 + (status == null ? 0 : status.hashCode())) * 31;
        TextDTO textDTO2 = this.dateInfo;
        int hashCode5 = (hashCode4 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        List<ButtonV3DTO> list = this.buttons;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        return Boolean.hashCode(this.showSeparator) + ((hashCode6 + (badgeDTO != null ? badgeDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.header;
        TextDTO textDTO = this.sum;
        Status status = this.status;
        TextDTO textDTO2 = this.dateInfo;
        List<ButtonV3DTO> list = this.buttons;
        BadgeDTO badgeDTO = this.badge;
        boolean z11 = this.showSeparator;
        StringBuilder e11 = h.e("DocsTableV2DocumentVO(id=", j11, ", header=", cellDTO);
        e11.append(", sum=");
        e11.append(textDTO);
        e11.append(", status=");
        e11.append(status);
        e11.append(", dateInfo=");
        e11.append(textDTO2);
        e11.append(", buttons=");
        e11.append(list);
        e11.append(", badge=");
        e11.append(badgeDTO);
        e11.append(", showSeparator=");
        e11.append(z11);
        e11.append(")");
        return e11.toString();
    }
}
