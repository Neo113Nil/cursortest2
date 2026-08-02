package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.presentation;

import G.g;
import TY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002%&B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO$EdoInfoVO;", "edoInfoList", "Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "addEdo", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getEdoInfoList", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "getAddEdo", "()Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "EdoInfoVO", "EdoInfoRemoveButtonVO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EdoProvidersVO implements c {
    private final DisclosureTitleSubtitleCellDTO addEdo;

    @NotNull
    private final List<EdoInfoVO> edoInfoList;
    private final long id;
    private final TextDTO title;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO$EdoInfoRemoveButtonVO;", "", "", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EdoInfoRemoveButtonVO {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction action;

        @NotNull
        private final String icon;

        public EdoInfoRemoveButtonVO(@NotNull String icon, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EdoInfoRemoveButtonVO)) {
                return false;
            }
            EdoInfoRemoveButtonVO edoInfoRemoveButtonVO = (EdoInfoRemoveButtonVO) other;
            return Intrinsics.d(this.icon, edoInfoRemoveButtonVO.icon) && Intrinsics.d(this.action, edoInfoRemoveButtonVO.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            AtomAction atomAction = this.action;
            return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            return "EdoInfoRemoveButtonVO(icon=" + this.icon + ", action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO$EdoInfoVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO$EdoInfoRemoveButtonVO;", "removeButton", "Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "edoId", "Lru/ozon/uni/atoms/data/AtomDTO;", "infoBadge", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO$EdoInfoRemoveButtonVO;Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;Lru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO$EdoInfoRemoveButtonVO;", "getRemoveButton", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO$EdoInfoRemoveButtonVO;", "Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "getEdoId", "()Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getInfoBadge", "()Lru/ozon/uni/atoms/data/AtomDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EdoInfoVO {
        public static final int $stable = (AtomDTO.$stable | DisclosureTitleSubtitleCellDTO.$stable) | AtomAction.$stable;

        @NotNull
        private final DisclosureTitleSubtitleCellDTO edoId;

        @NotNull
        private final AtomDTO infoBadge;

        @NotNull
        private final EdoInfoRemoveButtonVO removeButton;

        @NotNull
        private final TextDTO title;

        public EdoInfoVO(@NotNull TextDTO title, @NotNull EdoInfoRemoveButtonVO removeButton, @NotNull DisclosureTitleSubtitleCellDTO edoId, @NotNull AtomDTO infoBadge) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(removeButton, "removeButton");
            Intrinsics.checkNotNullParameter(edoId, "edoId");
            Intrinsics.checkNotNullParameter(infoBadge, "infoBadge");
            this.title = title;
            this.removeButton = removeButton;
            this.edoId = edoId;
            this.infoBadge = infoBadge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EdoInfoVO)) {
                return false;
            }
            EdoInfoVO edoInfoVO = (EdoInfoVO) other;
            return Intrinsics.d(this.title, edoInfoVO.title) && Intrinsics.d(this.removeButton, edoInfoVO.removeButton) && Intrinsics.d(this.edoId, edoInfoVO.edoId) && Intrinsics.d(this.infoBadge, edoInfoVO.infoBadge);
        }

        @NotNull
        public final DisclosureTitleSubtitleCellDTO getEdoId() {
            return this.edoId;
        }

        @NotNull
        public final AtomDTO getInfoBadge() {
            return this.infoBadge;
        }

        @NotNull
        public final EdoInfoRemoveButtonVO getRemoveButton() {
            return this.removeButton;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.infoBadge.hashCode() + ((this.edoId.hashCode() + ((this.removeButton.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "EdoInfoVO(title=" + this.title + ", removeButton=" + this.removeButton + ", edoId=" + this.edoId + ", infoBadge=" + this.infoBadge + ")";
        }
    }

    public EdoProvidersVO(long j11, TextDTO textDTO, @NotNull List<EdoInfoVO> edoInfoList, DisclosureTitleSubtitleCellDTO disclosureTitleSubtitleCellDTO) {
        Intrinsics.checkNotNullParameter(edoInfoList, "edoInfoList");
        this.id = j11;
        this.title = textDTO;
        this.edoInfoList = edoInfoList;
        this.addEdo = disclosureTitleSubtitleCellDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdoProvidersVO)) {
            return false;
        }
        EdoProvidersVO edoProvidersVO = (EdoProvidersVO) other;
        return this.id == edoProvidersVO.id && Intrinsics.d(this.title, edoProvidersVO.title) && Intrinsics.d(this.edoInfoList, edoProvidersVO.edoInfoList) && Intrinsics.d(this.addEdo, edoProvidersVO.addEdo);
    }

    public final DisclosureTitleSubtitleCellDTO getAddEdo() {
        return this.addEdo;
    }

    @NotNull
    public final List<EdoInfoVO> getEdoInfoList() {
        return this.edoInfoList;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int b11 = g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.edoInfoList);
        DisclosureTitleSubtitleCellDTO disclosureTitleSubtitleCellDTO = this.addEdo;
        return b11 + (disclosureTitleSubtitleCellDTO != null ? disclosureTitleSubtitleCellDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        List<EdoInfoVO> list = this.edoInfoList;
        DisclosureTitleSubtitleCellDTO disclosureTitleSubtitleCellDTO = this.addEdo;
        StringBuilder b11 = a.b("EdoProvidersVO(id=", j11, ", title=", textDTO);
        b11.append(", edoInfoList=");
        b11.append(list);
        b11.append(", addEdo=");
        b11.append(disclosureTitleSubtitleCellDTO);
        b11.append(")");
        return b11.toString();
    }
}
