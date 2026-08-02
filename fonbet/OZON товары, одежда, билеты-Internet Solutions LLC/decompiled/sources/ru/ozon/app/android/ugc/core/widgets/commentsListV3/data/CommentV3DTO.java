package ru.ozon.app.android.ugc.core.widgets.commentsListV3.data;

import Ak.C2436a;
import B90.C2618u;
import GR.b;
import T7.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0006#$%&'(BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003JY\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO;", "", "uuid", "", "avatar", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$AvatarDTO;", "answers", "", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "items", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$AvatarDTO;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V", "getUuid", "()Ljava/lang/String;", "getAvatar", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$AvatarDTO;", "getAnswers", "()Ljava/util/List;", "getTracking", "()Ljava/util/Map;", "getItems", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "AvatarDTO", "SpacerDTO", "HeaderDTO", "FooterDTO", "Control", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommentV3DTO {

    @NotNull
    public static final String EXPANDABLE_TEXT_FIELD_NAME = "expandableText";

    @NotNull
    public static final String EXPANDABLE_TEXT_NAME = "EXPANDABLE_TEXT";

    @NotNull
    public static final String FOOTER_FIELD_NAME = "footer";

    @NotNull
    public static final String FOOTER_NAME = "FOOTER";

    @NotNull
    public static final String HEADER_FIELD_NAME = "header";

    @NotNull
    public static final String HEADER_NAME = "HEADER";

    @NotNull
    public static final String SPACER_FIELD_NAME = "spacer";

    @NotNull
    public static final String SPACER_NAME = "SPACER";

    @NotNull
    public static final String TEXT_FIELD_NAME = "text";

    @NotNull
    public static final String TEXT_NAME = "TEXT";
    private final List<CommentV3DTO> answers;
    private final AvatarDTO avatar;

    @NotNull
    private final List<Object> items;
    private final Map<String, TokenizedTrackingInfo> tracking;

    @NotNull
    private final String uuid;
    public static final int $stable = 8;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$AvatarDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AvatarDTO {
        public static final int $stable = 8;
        private final AtomActionDTO clickAction;

        @NotNull
        private final IconDTO icon;
        private final Map<String, TokenizedTrackingInfo> tracking;

        public AvatarDTO(@NotNull IconDTO icon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.clickAction = atomActionDTO;
            this.tracking = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AvatarDTO copy$default(AvatarDTO avatarDTO, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = avatarDTO.icon;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = avatarDTO.clickAction;
            }
            if ((i11 & 4) != 0) {
                map = avatarDTO.tracking;
            }
            return avatarDTO.copy(iconDTO, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.tracking;
        }

        @NotNull
        public final AvatarDTO copy(@NotNull IconDTO icon, AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> tracking) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new AvatarDTO(icon, clickAction, tracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvatarDTO)) {
                return false;
            }
            AvatarDTO avatarDTO = (AvatarDTO) other;
            return Intrinsics.d(this.icon, avatarDTO.icon) && Intrinsics.d(this.clickAction, avatarDTO.clickAction) && Intrinsics.d(this.tracking, avatarDTO.tracking);
        }

        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final Map<String, TokenizedTrackingInfo> getTracking() {
            return this.tracking;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.clickAction;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            AtomActionDTO atomActionDTO = this.clickAction;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            StringBuilder sb2 = new StringBuilder("AvatarDTO(icon=");
            sb2.append(iconDTO);
            sb2.append(", clickAction=");
            sb2.append(atomActionDTO);
            sb2.append(", tracking=");
            return P.f(sb2, map, ")");
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0006\u0010\u0019\u001a\u00020\u0000J\f\u0010\u001a\u001a\u00020\u0005*\u00020\u0005H\u0002J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JM\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;", "", "isSelected", "", "normal", "Lru/ozon/uni/atoms/data/AtomDTO;", "selected", "longTapAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "longTapTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ZLru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "()Z", "getNormal", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getSelected", "getLongTapAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getLongTapTracking", "()Ljava/util/Map;", "getCommonControl", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "disableControl", "disable", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Control {

        @NotNull
        public static final String BADGE_FIELD_NAME = "badge";

        @NotNull
        public static final String BADGE_NAME = "BADGE";

        @NotNull
        public static final String BUTTON_FIELD_NAME = "button";

        @NotNull
        public static final String BUTTON_NAME = "BUTTON";

        @NotNull
        public static final String ICON_BUTTON_FIELD_NAME = "iconButton";

        @NotNull
        public static final String ICON_BUTTON_NAME = "ICON_BUTTON";
        private final boolean isSelected;
        private final AtomActionDTO longTapAction;
        private final Map<String, TokenizedTrackingInfo> longTapTracking;

        @NotNull
        private final AtomDTO normal;
        private final AtomDTO selected;
        public static final int $stable = 8;

        public Control(boolean z11, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "button", name = "BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "iconButton", name = "ICON_BUTTON", type = IconButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "badge", name = "BADGE", type = BadgeDTO.class)}) @NotNull @ProtoOneOf(label = "type") AtomDTO normal, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "button", name = "BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "iconButton", name = "ICON_BUTTON", type = IconButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "badge", name = "BADGE", type = BadgeDTO.class)}) @ProtoOneOf(label = "type") AtomDTO atomDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(normal, "normal");
            this.isSelected = z11;
            this.normal = normal;
            this.selected = atomDTO;
            this.longTapAction = atomActionDTO;
            this.longTapTracking = map;
        }

        public static /* synthetic */ Control copy$default(Control control, boolean z11, AtomDTO atomDTO, AtomDTO atomDTO2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = control.isSelected;
            }
            if ((i11 & 2) != 0) {
                atomDTO = control.normal;
            }
            if ((i11 & 4) != 0) {
                atomDTO2 = control.selected;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = control.longTapAction;
            }
            if ((i11 & 16) != 0) {
                map = control.longTapTracking;
            }
            Map map2 = map;
            AtomDTO atomDTO3 = atomDTO2;
            return control.copy(z11, atomDTO, atomDTO3, atomActionDTO, map2);
        }

        private final AtomDTO disable(AtomDTO atomDTO) {
            return atomDTO instanceof IconButtonV3DTO ? IconButtonV3DTO.copy$default((IconButtonV3DTO) atomDTO, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, 16367, null) : atomDTO instanceof ButtonV3DTO ? ButtonV3DTO.copy$default((ButtonV3DTO) atomDTO, null, null, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, 131007, null) : atomDTO;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomDTO getNormal() {
            return this.normal;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomDTO getSelected() {
            return this.selected;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getLongTapAction() {
            return this.longTapAction;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.longTapTracking;
        }

        @NotNull
        public final Control copy(boolean isSelected, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "button", name = "BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "iconButton", name = "ICON_BUTTON", type = IconButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "badge", name = "BADGE", type = BadgeDTO.class)}) @NotNull @ProtoOneOf(label = "type") AtomDTO normal, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "button", name = "BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "iconButton", name = "ICON_BUTTON", type = IconButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "badge", name = "BADGE", type = BadgeDTO.class)}) @ProtoOneOf(label = "type") AtomDTO selected, AtomActionDTO longTapAction, Map<String, TokenizedTrackingInfo> longTapTracking) {
            Intrinsics.checkNotNullParameter(normal, "normal");
            return new Control(isSelected, normal, selected, longTapAction, longTapTracking);
        }

        @NotNull
        public final Control disableControl() {
            AtomDTO disable = disable(this.normal);
            AtomDTO atomDTO = this.selected;
            return copy$default(this, false, disable, atomDTO != null ? disable(atomDTO) : null, null, null, 25, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Control)) {
                return false;
            }
            Control control = (Control) other;
            return this.isSelected == control.isSelected && Intrinsics.d(this.normal, control.normal) && Intrinsics.d(this.selected, control.selected) && Intrinsics.d(this.longTapAction, control.longTapAction) && Intrinsics.d(this.longTapTracking, control.longTapTracking);
        }

        public final CommonControlSettings getCommonControl() {
            AtomDTO atomDTO = this.normal;
            if (atomDTO instanceof BadgeDTO) {
                return ((BadgeDTO) atomDTO).getCommon();
            }
            if (atomDTO instanceof ButtonsDTO) {
                return ((ButtonsDTO) atomDTO).getCommon();
            }
            return null;
        }

        public final AtomActionDTO getLongTapAction() {
            return this.longTapAction;
        }

        public final Map<String, TokenizedTrackingInfo> getLongTapTracking() {
            return this.longTapTracking;
        }

        @NotNull
        public final AtomDTO getNormal() {
            return this.normal;
        }

        public final AtomDTO getSelected() {
            return this.selected;
        }

        public int hashCode() {
            int hashCode = (this.normal.hashCode() + (Boolean.hashCode(this.isSelected) * 31)) * 31;
            AtomDTO atomDTO = this.selected;
            int hashCode2 = (hashCode + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.longTapAction;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.longTapTracking;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isSelected;
            AtomDTO atomDTO = this.normal;
            AtomDTO atomDTO2 = this.selected;
            AtomActionDTO atomActionDTO = this.longTapAction;
            Map<String, TokenizedTrackingInfo> map = this.longTapTracking;
            StringBuilder sb2 = new StringBuilder("Control(isSelected=");
            sb2.append(z11);
            sb2.append(", normal=");
            sb2.append(atomDTO);
            sb2.append(", selected=");
            sb2.append(atomDTO2);
            sb2.append(", longTapAction=");
            sb2.append(atomActionDTO);
            sb2.append(", longTapTracking=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$FooterDTO;", "", "leftControls", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;", "rightControls", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getLeftControls", "()Ljava/util/List;", "getRightControls", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FooterDTO {
        public static final int $stable = 8;
        private final List<Control> leftControls;
        private final List<Control> rightControls;

        public FooterDTO(List<Control> list, List<Control> list2) {
            this.leftControls = list;
            this.rightControls = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FooterDTO copy$default(FooterDTO footerDTO, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = footerDTO.leftControls;
            }
            if ((i11 & 2) != 0) {
                list2 = footerDTO.rightControls;
            }
            return footerDTO.copy(list, list2);
        }

        public final List<Control> component1() {
            return this.leftControls;
        }

        public final List<Control> component2() {
            return this.rightControls;
        }

        @NotNull
        public final FooterDTO copy(List<Control> leftControls, List<Control> rightControls) {
            return new FooterDTO(leftControls, rightControls);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FooterDTO)) {
                return false;
            }
            FooterDTO footerDTO = (FooterDTO) other;
            return Intrinsics.d(this.leftControls, footerDTO.leftControls) && Intrinsics.d(this.rightControls, footerDTO.rightControls);
        }

        public final List<Control> getLeftControls() {
            return this.leftControls;
        }

        public final List<Control> getRightControls() {
            return this.rightControls;
        }

        public int hashCode() {
            List<Control> list = this.leftControls;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<Control> list2 = this.rightControls;
            return hashCode + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return C2436a.b("FooterDTO(leftControls=", this.leftControls, ", rightControls=", ")", this.rightControls);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$HeaderDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nameIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "date", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subscribeControl", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;", "nameLeftPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "dateLeftPadding", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getName", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getNameIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getDate", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubscribeControl", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;", "getNameLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getDateLeftPadding", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderDTO {
        public static final int $stable = 8;
        private final TextDTO date;
        private final Paddings dateLeftPadding;
        private final BadgeDTO name;
        private final IconDTO nameIcon;
        private final Paddings nameLeftPadding;
        private final Control subscribeControl;

        public HeaderDTO(BadgeDTO badgeDTO, IconDTO iconDTO, TextDTO textDTO, Control control, Paddings paddings, Paddings paddings2) {
            this.name = badgeDTO;
            this.nameIcon = iconDTO;
            this.date = textDTO;
            this.subscribeControl = control;
            this.nameLeftPadding = paddings;
            this.dateLeftPadding = paddings2;
        }

        public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, BadgeDTO badgeDTO, IconDTO iconDTO, TextDTO textDTO, Control control, Paddings paddings, Paddings paddings2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                badgeDTO = headerDTO.name;
            }
            if ((i11 & 2) != 0) {
                iconDTO = headerDTO.nameIcon;
            }
            if ((i11 & 4) != 0) {
                textDTO = headerDTO.date;
            }
            if ((i11 & 8) != 0) {
                control = headerDTO.subscribeControl;
            }
            if ((i11 & 16) != 0) {
                paddings = headerDTO.nameLeftPadding;
            }
            if ((i11 & 32) != 0) {
                paddings2 = headerDTO.dateLeftPadding;
            }
            Paddings paddings3 = paddings;
            Paddings paddings4 = paddings2;
            return headerDTO.copy(badgeDTO, iconDTO, textDTO, control, paddings3, paddings4);
        }

        /* renamed from: component1, reason: from getter */
        public final BadgeDTO getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getNameIcon() {
            return this.nameIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getDate() {
            return this.date;
        }

        /* renamed from: component4, reason: from getter */
        public final Control getSubscribeControl() {
            return this.subscribeControl;
        }

        /* renamed from: component5, reason: from getter */
        public final Paddings getNameLeftPadding() {
            return this.nameLeftPadding;
        }

        /* renamed from: component6, reason: from getter */
        public final Paddings getDateLeftPadding() {
            return this.dateLeftPadding;
        }

        @NotNull
        public final HeaderDTO copy(BadgeDTO name, IconDTO nameIcon, TextDTO date, Control subscribeControl, Paddings nameLeftPadding, Paddings dateLeftPadding) {
            return new HeaderDTO(name, nameIcon, date, subscribeControl, nameLeftPadding, dateLeftPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderDTO)) {
                return false;
            }
            HeaderDTO headerDTO = (HeaderDTO) other;
            return Intrinsics.d(this.name, headerDTO.name) && Intrinsics.d(this.nameIcon, headerDTO.nameIcon) && Intrinsics.d(this.date, headerDTO.date) && Intrinsics.d(this.subscribeControl, headerDTO.subscribeControl) && this.nameLeftPadding == headerDTO.nameLeftPadding && this.dateLeftPadding == headerDTO.dateLeftPadding;
        }

        public final TextDTO getDate() {
            return this.date;
        }

        public final Paddings getDateLeftPadding() {
            return this.dateLeftPadding;
        }

        public final BadgeDTO getName() {
            return this.name;
        }

        public final IconDTO getNameIcon() {
            return this.nameIcon;
        }

        public final Paddings getNameLeftPadding() {
            return this.nameLeftPadding;
        }

        public final Control getSubscribeControl() {
            return this.subscribeControl;
        }

        public int hashCode() {
            BadgeDTO badgeDTO = this.name;
            int hashCode = (badgeDTO == null ? 0 : badgeDTO.hashCode()) * 31;
            IconDTO iconDTO = this.nameIcon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            TextDTO textDTO = this.date;
            int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            Control control = this.subscribeControl;
            int hashCode4 = (hashCode3 + (control == null ? 0 : control.hashCode())) * 31;
            Paddings paddings = this.nameLeftPadding;
            int hashCode5 = (hashCode4 + (paddings == null ? 0 : paddings.hashCode())) * 31;
            Paddings paddings2 = this.dateLeftPadding;
            return hashCode5 + (paddings2 != null ? paddings2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            BadgeDTO badgeDTO = this.name;
            IconDTO iconDTO = this.nameIcon;
            TextDTO textDTO = this.date;
            Control control = this.subscribeControl;
            Paddings paddings = this.nameLeftPadding;
            Paddings paddings2 = this.dateLeftPadding;
            StringBuilder sb2 = new StringBuilder("HeaderDTO(name=");
            sb2.append(badgeDTO);
            sb2.append(", nameIcon=");
            sb2.append(iconDTO);
            sb2.append(", date=");
            sb2.append(textDTO);
            sb2.append(", subscribeControl=");
            sb2.append(control);
            sb2.append(", nameLeftPadding=");
            return b.e(sb2, paddings, ", dateLeftPadding=", paddings2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$SpacerDTO;", "", "height", "Lru/ozon/uni/atoms/data/common/Paddings;", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;)V", "getHeight", "()Lru/ozon/uni/atoms/data/common/Paddings;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpacerDTO {
        public static final int $stable = 0;

        @NotNull
        private final Paddings height;

        public SpacerDTO(@NotNull Paddings height) {
            Intrinsics.checkNotNullParameter(height, "height");
            this.height = height;
        }

        public static /* synthetic */ SpacerDTO copy$default(SpacerDTO spacerDTO, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacerDTO.height;
            }
            return spacerDTO.copy(paddings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getHeight() {
            return this.height;
        }

        @NotNull
        public final SpacerDTO copy(@NotNull Paddings height) {
            Intrinsics.checkNotNullParameter(height, "height");
            return new SpacerDTO(height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SpacerDTO) && this.height == ((SpacerDTO) other).height;
        }

        @NotNull
        public final Paddings getHeight() {
            return this.height;
        }

        public int hashCode() {
            return this.height.hashCode();
        }

        @NotNull
        public String toString() {
            return "SpacerDTO(height=" + this.height + ")";
        }
    }

    public CommentV3DTO(@NotNull String uuid, AvatarDTO avatarDTO, List<CommentV3DTO> list, Map<String, TokenizedTrackingInfo> map, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "header", name = "HEADER", type = HeaderDTO.class), @ProtoOneOfSignature(fieldName = "footer", name = "FOOTER", type = FooterDTO.class), @ProtoOneOfSignature(fieldName = "text", name = "TEXT", type = TextDTO.class), @ProtoOneOfSignature(fieldName = "expandableText", name = "EXPANDABLE_TEXT", type = ExpandableTextDTO.class), @ProtoOneOfSignature(fieldName = "spacer", name = "SPACER", type = SpacerDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(items, "items");
        this.uuid = uuid;
        this.avatar = avatarDTO;
        this.answers = list;
        this.tracking = map;
        this.items = items;
    }

    public static /* synthetic */ CommentV3DTO copy$default(CommentV3DTO commentV3DTO, String str, AvatarDTO avatarDTO, List list, Map map, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = commentV3DTO.uuid;
        }
        if ((i11 & 2) != 0) {
            avatarDTO = commentV3DTO.avatar;
        }
        if ((i11 & 4) != 0) {
            list = commentV3DTO.answers;
        }
        if ((i11 & 8) != 0) {
            map = commentV3DTO.tracking;
        }
        if ((i11 & 16) != 0) {
            list2 = commentV3DTO.items;
        }
        List list3 = list2;
        List list4 = list;
        return commentV3DTO.copy(str, avatarDTO, list4, map, list3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final AvatarDTO getAvatar() {
        return this.avatar;
    }

    public final List<CommentV3DTO> component3() {
        return this.answers;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.tracking;
    }

    @NotNull
    public final List<Object> component5() {
        return this.items;
    }

    @NotNull
    public final CommentV3DTO copy(@NotNull String uuid, AvatarDTO avatar, List<CommentV3DTO> answers, Map<String, TokenizedTrackingInfo> tracking, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "header", name = "HEADER", type = HeaderDTO.class), @ProtoOneOfSignature(fieldName = "footer", name = "FOOTER", type = FooterDTO.class), @ProtoOneOfSignature(fieldName = "text", name = "TEXT", type = TextDTO.class), @ProtoOneOfSignature(fieldName = "expandableText", name = "EXPANDABLE_TEXT", type = ExpandableTextDTO.class), @ProtoOneOfSignature(fieldName = "spacer", name = "SPACER", type = SpacerDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(items, "items");
        return new CommentV3DTO(uuid, avatar, answers, tracking, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentV3DTO)) {
            return false;
        }
        CommentV3DTO commentV3DTO = (CommentV3DTO) other;
        return Intrinsics.d(this.uuid, commentV3DTO.uuid) && Intrinsics.d(this.avatar, commentV3DTO.avatar) && Intrinsics.d(this.answers, commentV3DTO.answers) && Intrinsics.d(this.tracking, commentV3DTO.tracking) && Intrinsics.d(this.items, commentV3DTO.items);
    }

    public final List<CommentV3DTO> getAnswers() {
        return this.answers;
    }

    public final AvatarDTO getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode = this.uuid.hashCode() * 31;
        AvatarDTO avatarDTO = this.avatar;
        int hashCode2 = (hashCode + (avatarDTO == null ? 0 : avatarDTO.hashCode())) * 31;
        List<CommentV3DTO> list = this.answers;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        return this.items.hashCode() + ((hashCode3 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        AvatarDTO avatarDTO = this.avatar;
        List<CommentV3DTO> list = this.answers;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        List<Object> list2 = this.items;
        StringBuilder sb2 = new StringBuilder("CommentV3DTO(uuid=");
        sb2.append(str);
        sb2.append(", avatar=");
        sb2.append(avatarDTO);
        sb2.append(", answers=");
        sb2.append(list);
        sb2.append(", tracking=");
        sb2.append(map);
        sb2.append(", items=");
        return C2618u.h(sb2, list2, ")");
    }
}
