package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.data;

import G.g;
import K1.G;
import Ql.c;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001c\u001d\u001eB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "edoInfoList", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO$EdoInfoDTO;", "addEdo", "Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getEdoInfoList", "()Ljava/util/List;", "getAddEdo", "()Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "EdoInfoDTO", "EdoInfoRemoveButtonDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EdoProvidersDTO {

    @Deprecated
    @NotNull
    public static final String TYPE = "type";

    @Deprecated
    @NotNull
    public static final String TYPE_BADGE = "badge";

    @Deprecated
    @NotNull
    public static final String TYPE_BUTTON = "button";
    private final DisclosureTitleSubtitleCellDTO addEdo;

    @NotNull
    private final List<EdoInfoDTO> edoInfoList;
    private final TextDTO title;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO$Companion;", "", "<init>", "()V", "TYPE", "", "TYPE_BADGE", "TYPE_BUTTON", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO$EdoInfoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "removeButton", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO$EdoInfoRemoveButtonDTO;", "edoId", "Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "infoBadge", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO$EdoInfoRemoveButtonDTO;Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;Lru/ozon/uni/atoms/data/AtomDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRemoveButton", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO$EdoInfoRemoveButtonDTO;", "getEdoId", "()Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "getInfoBadge", "()Lru/ozon/uni/atoms/data/AtomDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EdoInfoDTO {
        public static final int $stable = 8;

        @NotNull
        private final DisclosureTitleSubtitleCellDTO edoId;

        @NotNull
        private final AtomDTO infoBadge;

        @NotNull
        private final EdoInfoRemoveButtonDTO removeButton;

        @NotNull
        private final TextDTO title;

        public EdoInfoDTO(@NotNull TextDTO title, @NotNull EdoInfoRemoveButtonDTO removeButton, @NotNull DisclosureTitleSubtitleCellDTO edoId, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "badge", type = BadgeDTO.class), @ProtoOneOfSignature(name = "button", type = ButtonDTO.class)}) @NotNull @ProtoOneOf(label = "type") AtomDTO infoBadge) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(removeButton, "removeButton");
            Intrinsics.checkNotNullParameter(edoId, "edoId");
            Intrinsics.checkNotNullParameter(infoBadge, "infoBadge");
            this.title = title;
            this.removeButton = removeButton;
            this.edoId = edoId;
            this.infoBadge = infoBadge;
        }

        public static /* synthetic */ EdoInfoDTO copy$default(EdoInfoDTO edoInfoDTO, TextDTO textDTO, EdoInfoRemoveButtonDTO edoInfoRemoveButtonDTO, DisclosureTitleSubtitleCellDTO disclosureTitleSubtitleCellDTO, AtomDTO atomDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = edoInfoDTO.title;
            }
            if ((i11 & 2) != 0) {
                edoInfoRemoveButtonDTO = edoInfoDTO.removeButton;
            }
            if ((i11 & 4) != 0) {
                disclosureTitleSubtitleCellDTO = edoInfoDTO.edoId;
            }
            if ((i11 & 8) != 0) {
                atomDTO = edoInfoDTO.infoBadge;
            }
            return edoInfoDTO.copy(textDTO, edoInfoRemoveButtonDTO, disclosureTitleSubtitleCellDTO, atomDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final EdoInfoRemoveButtonDTO getRemoveButton() {
            return this.removeButton;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final DisclosureTitleSubtitleCellDTO getEdoId() {
            return this.edoId;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AtomDTO getInfoBadge() {
            return this.infoBadge;
        }

        @NotNull
        public final EdoInfoDTO copy(@NotNull TextDTO title, @NotNull EdoInfoRemoveButtonDTO removeButton, @NotNull DisclosureTitleSubtitleCellDTO edoId, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "badge", type = BadgeDTO.class), @ProtoOneOfSignature(name = "button", type = ButtonDTO.class)}) @NotNull @ProtoOneOf(label = "type") AtomDTO infoBadge) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(removeButton, "removeButton");
            Intrinsics.checkNotNullParameter(edoId, "edoId");
            Intrinsics.checkNotNullParameter(infoBadge, "infoBadge");
            return new EdoInfoDTO(title, removeButton, edoId, infoBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EdoInfoDTO)) {
                return false;
            }
            EdoInfoDTO edoInfoDTO = (EdoInfoDTO) other;
            return Intrinsics.d(this.title, edoInfoDTO.title) && Intrinsics.d(this.removeButton, edoInfoDTO.removeButton) && Intrinsics.d(this.edoId, edoInfoDTO.edoId) && Intrinsics.d(this.infoBadge, edoInfoDTO.infoBadge);
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
        public final EdoInfoRemoveButtonDTO getRemoveButton() {
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
            return "EdoInfoDTO(title=" + this.title + ", removeButton=" + this.removeButton + ", edoId=" + this.edoId + ", infoBadge=" + this.infoBadge + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO$EdoInfoRemoveButtonDTO;", "", "icon", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EdoInfoRemoveButtonDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final String icon;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public EdoInfoRemoveButtonDTO(@NotNull String icon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EdoInfoRemoveButtonDTO copy$default(EdoInfoRemoveButtonDTO edoInfoRemoveButtonDTO, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = edoInfoRemoveButtonDTO.icon;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = edoInfoRemoveButtonDTO.action;
            }
            if ((i11 & 4) != 0) {
                map = edoInfoRemoveButtonDTO.trackingInfo;
            }
            return edoInfoRemoveButtonDTO.copy(str, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final EdoInfoRemoveButtonDTO copy(@NotNull String icon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new EdoInfoRemoveButtonDTO(icon, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EdoInfoRemoveButtonDTO)) {
                return false;
            }
            EdoInfoRemoveButtonDTO edoInfoRemoveButtonDTO = (EdoInfoRemoveButtonDTO) other;
            return Intrinsics.d(this.icon, edoInfoRemoveButtonDTO.icon) && Intrinsics.d(this.action, edoInfoRemoveButtonDTO.action) && Intrinsics.d(this.trackingInfo, edoInfoRemoveButtonDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            return P.f(c.c("EdoInfoRemoveButtonDTO(icon=", str, ", action=", atomActionDTO, ", trackingInfo="), this.trackingInfo, ")");
        }
    }

    public EdoProvidersDTO(TextDTO textDTO, @NotNull List<EdoInfoDTO> edoInfoList, DisclosureTitleSubtitleCellDTO disclosureTitleSubtitleCellDTO) {
        Intrinsics.checkNotNullParameter(edoInfoList, "edoInfoList");
        this.title = textDTO;
        this.edoInfoList = edoInfoList;
        this.addEdo = disclosureTitleSubtitleCellDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EdoProvidersDTO copy$default(EdoProvidersDTO edoProvidersDTO, TextDTO textDTO, List list, DisclosureTitleSubtitleCellDTO disclosureTitleSubtitleCellDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = edoProvidersDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = edoProvidersDTO.edoInfoList;
        }
        if ((i11 & 4) != 0) {
            disclosureTitleSubtitleCellDTO = edoProvidersDTO.addEdo;
        }
        return edoProvidersDTO.copy(textDTO, list, disclosureTitleSubtitleCellDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<EdoInfoDTO> component2() {
        return this.edoInfoList;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclosureTitleSubtitleCellDTO getAddEdo() {
        return this.addEdo;
    }

    @NotNull
    public final EdoProvidersDTO copy(TextDTO title, @NotNull List<EdoInfoDTO> edoInfoList, DisclosureTitleSubtitleCellDTO addEdo) {
        Intrinsics.checkNotNullParameter(edoInfoList, "edoInfoList");
        return new EdoProvidersDTO(title, edoInfoList, addEdo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdoProvidersDTO)) {
            return false;
        }
        EdoProvidersDTO edoProvidersDTO = (EdoProvidersDTO) other;
        return Intrinsics.d(this.title, edoProvidersDTO.title) && Intrinsics.d(this.edoInfoList, edoProvidersDTO.edoInfoList) && Intrinsics.d(this.addEdo, edoProvidersDTO.addEdo);
    }

    public final DisclosureTitleSubtitleCellDTO getAddEdo() {
        return this.addEdo;
    }

    @NotNull
    public final List<EdoInfoDTO> getEdoInfoList() {
        return this.edoInfoList;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int b11 = g.b((textDTO == null ? 0 : textDTO.hashCode()) * 31, 31, this.edoInfoList);
        DisclosureTitleSubtitleCellDTO disclosureTitleSubtitleCellDTO = this.addEdo;
        return b11 + (disclosureTitleSubtitleCellDTO != null ? disclosureTitleSubtitleCellDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<EdoInfoDTO> list = this.edoInfoList;
        DisclosureTitleSubtitleCellDTO disclosureTitleSubtitleCellDTO = this.addEdo;
        StringBuilder e11 = G.e("EdoProvidersDTO(title=", textDTO, ", edoInfoList=", list, ", addEdo=");
        e11.append(disclosureTitleSubtitleCellDTO);
        e11.append(")");
        return e11.toString();
    }
}
