package ru.ozon.app.android.ugc.core.widgets.selectionReactions.data;

import H3.c;
import Nh.a;
import T7.P;
import Ul.C4070a;
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
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0004&'()BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J[\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO;", "", "reactions", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$Reactions;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "backgroundColor", "", "strokeColor", "scrollGradientColor", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$Reactions;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getReactions", "()Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$Reactions;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBackgroundColor", "()Ljava/lang/String;", "getStrokeColor", "getScrollGradientColor", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "Reactions", "ReactionsBlock", "ReactionsControl", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionReactionsDTO {

    @NotNull
    public static final String BUTTON_FIELD_NAME = "button";

    @NotNull
    public static final String BUTTON_NAME = "BUTTON";

    @NotNull
    public static final String ICON_BUTTON_FIELD_NAME = "iconButton";

    @NotNull
    public static final String ICON_BUTTON_NAME = "ICON_BUTTON";
    private final String backgroundColor;
    private final CornerRadius cornerRadius;

    @NotNull
    private final Reactions reactions;
    private final String scrollGradientColor;
    private final String strokeColor;
    private final Map<String, TokenizedTrackingInfo> tracking;
    public static final int $stable = 8;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$Reactions;", "", "leftBlock", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$ReactionsBlock;", "rightBlock", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$ReactionsBlock;Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$ReactionsBlock;)V", "getLeftBlock", "()Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$ReactionsBlock;", "getRightBlock", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Reactions {
        public static final int $stable = 8;
        private final ReactionsBlock leftBlock;
        private final ReactionsBlock rightBlock;

        public Reactions(ReactionsBlock reactionsBlock, ReactionsBlock reactionsBlock2) {
            this.leftBlock = reactionsBlock;
            this.rightBlock = reactionsBlock2;
        }

        public static /* synthetic */ Reactions copy$default(Reactions reactions, ReactionsBlock reactionsBlock, ReactionsBlock reactionsBlock2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                reactionsBlock = reactions.leftBlock;
            }
            if ((i11 & 2) != 0) {
                reactionsBlock2 = reactions.rightBlock;
            }
            return reactions.copy(reactionsBlock, reactionsBlock2);
        }

        /* renamed from: component1, reason: from getter */
        public final ReactionsBlock getLeftBlock() {
            return this.leftBlock;
        }

        /* renamed from: component2, reason: from getter */
        public final ReactionsBlock getRightBlock() {
            return this.rightBlock;
        }

        @NotNull
        public final Reactions copy(ReactionsBlock leftBlock, ReactionsBlock rightBlock) {
            return new Reactions(leftBlock, rightBlock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reactions)) {
                return false;
            }
            Reactions reactions = (Reactions) other;
            return Intrinsics.d(this.leftBlock, reactions.leftBlock) && Intrinsics.d(this.rightBlock, reactions.rightBlock);
        }

        public final ReactionsBlock getLeftBlock() {
            return this.leftBlock;
        }

        public final ReactionsBlock getRightBlock() {
            return this.rightBlock;
        }

        public int hashCode() {
            ReactionsBlock reactionsBlock = this.leftBlock;
            int hashCode = (reactionsBlock == null ? 0 : reactionsBlock.hashCode()) * 31;
            ReactionsBlock reactionsBlock2 = this.rightBlock;
            return hashCode + (reactionsBlock2 != null ? reactionsBlock2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Reactions(leftBlock=" + this.leftBlock + ", rightBlock=" + this.rightBlock + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$ReactionsBlock;", "", "controls", "", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$ReactionsControl;", "<init>", "(Ljava/util/List;)V", "getControls", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReactionsBlock {
        public static final int $stable = 8;

        @NotNull
        private final List<ReactionsControl> controls;

        public ReactionsBlock(@NotNull List<ReactionsControl> controls) {
            Intrinsics.checkNotNullParameter(controls, "controls");
            this.controls = controls;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReactionsBlock copy$default(ReactionsBlock reactionsBlock, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = reactionsBlock.controls;
            }
            return reactionsBlock.copy(list);
        }

        @NotNull
        public final List<ReactionsControl> component1() {
            return this.controls;
        }

        @NotNull
        public final ReactionsBlock copy(@NotNull List<ReactionsControl> controls) {
            Intrinsics.checkNotNullParameter(controls, "controls");
            return new ReactionsBlock(controls);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReactionsBlock) && Intrinsics.d(this.controls, ((ReactionsBlock) other).controls);
        }

        @NotNull
        public final List<ReactionsControl> getControls() {
            return this.controls;
        }

        public int hashCode() {
            return this.controls.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("ReactionsBlock(controls=", ")", this.controls);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$ReactionsControl;", "", "isSelected", "", "normal", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "selected", "longTapAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "longTapTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ZLru/ozon/uni/atoms/data/controls/button/ButtonsDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "()Z", "getNormal", "()Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "getSelected", "getLongTapAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getLongTapTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReactionsControl {
        public static final int $stable = 8;
        private final boolean isSelected;
        private final AtomActionDTO longTapAction;
        private final Map<String, TokenizedTrackingInfo> longTapTracking;

        @NotNull
        private final ButtonsDTO normal;
        private final ButtonsDTO selected;

        public ReactionsControl(boolean z11, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "button", name = "BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "iconButton", name = "ICON_BUTTON", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") ButtonsDTO normal, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "button", name = "BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "iconButton", name = "ICON_BUTTON", type = IconButtonV3DTO.class)}) @ProtoOneOf(label = "type") ButtonsDTO buttonsDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(normal, "normal");
            this.isSelected = z11;
            this.normal = normal;
            this.selected = buttonsDTO;
            this.longTapAction = atomActionDTO;
            this.longTapTracking = map;
        }

        public static /* synthetic */ ReactionsControl copy$default(ReactionsControl reactionsControl, boolean z11, ButtonsDTO buttonsDTO, ButtonsDTO buttonsDTO2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = reactionsControl.isSelected;
            }
            if ((i11 & 2) != 0) {
                buttonsDTO = reactionsControl.normal;
            }
            if ((i11 & 4) != 0) {
                buttonsDTO2 = reactionsControl.selected;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = reactionsControl.longTapAction;
            }
            if ((i11 & 16) != 0) {
                map = reactionsControl.longTapTracking;
            }
            Map map2 = map;
            ButtonsDTO buttonsDTO3 = buttonsDTO2;
            return reactionsControl.copy(z11, buttonsDTO, buttonsDTO3, atomActionDTO, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonsDTO getNormal() {
            return this.normal;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonsDTO getSelected() {
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
        public final ReactionsControl copy(boolean isSelected, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "button", name = "BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "iconButton", name = "ICON_BUTTON", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") ButtonsDTO normal, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "button", name = "BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "iconButton", name = "ICON_BUTTON", type = IconButtonV3DTO.class)}) @ProtoOneOf(label = "type") ButtonsDTO selected, AtomActionDTO longTapAction, Map<String, TokenizedTrackingInfo> longTapTracking) {
            Intrinsics.checkNotNullParameter(normal, "normal");
            return new ReactionsControl(isSelected, normal, selected, longTapAction, longTapTracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReactionsControl)) {
                return false;
            }
            ReactionsControl reactionsControl = (ReactionsControl) other;
            return this.isSelected == reactionsControl.isSelected && Intrinsics.d(this.normal, reactionsControl.normal) && Intrinsics.d(this.selected, reactionsControl.selected) && Intrinsics.d(this.longTapAction, reactionsControl.longTapAction) && Intrinsics.d(this.longTapTracking, reactionsControl.longTapTracking);
        }

        public final AtomActionDTO getLongTapAction() {
            return this.longTapAction;
        }

        public final Map<String, TokenizedTrackingInfo> getLongTapTracking() {
            return this.longTapTracking;
        }

        @NotNull
        public final ButtonsDTO getNormal() {
            return this.normal;
        }

        public final ButtonsDTO getSelected() {
            return this.selected;
        }

        public int hashCode() {
            int hashCode = (this.normal.hashCode() + (Boolean.hashCode(this.isSelected) * 31)) * 31;
            ButtonsDTO buttonsDTO = this.selected;
            int hashCode2 = (hashCode + (buttonsDTO == null ? 0 : buttonsDTO.hashCode())) * 31;
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
            ButtonsDTO buttonsDTO = this.normal;
            ButtonsDTO buttonsDTO2 = this.selected;
            AtomActionDTO atomActionDTO = this.longTapAction;
            Map<String, TokenizedTrackingInfo> map = this.longTapTracking;
            StringBuilder sb2 = new StringBuilder("ReactionsControl(isSelected=");
            sb2.append(z11);
            sb2.append(", normal=");
            sb2.append(buttonsDTO);
            sb2.append(", selected=");
            sb2.append(buttonsDTO2);
            sb2.append(", longTapAction=");
            sb2.append(atomActionDTO);
            sb2.append(", longTapTracking=");
            return P.f(sb2, map, ")");
        }
    }

    public SelectionReactionsDTO(@NotNull Reactions reactions, CornerRadius cornerRadius, String str, String str2, String str3, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        this.reactions = reactions;
        this.cornerRadius = cornerRadius;
        this.backgroundColor = str;
        this.strokeColor = str2;
        this.scrollGradientColor = str3;
        this.tracking = map;
    }

    public static /* synthetic */ SelectionReactionsDTO copy$default(SelectionReactionsDTO selectionReactionsDTO, Reactions reactions, CornerRadius cornerRadius, String str, String str2, String str3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            reactions = selectionReactionsDTO.reactions;
        }
        if ((i11 & 2) != 0) {
            cornerRadius = selectionReactionsDTO.cornerRadius;
        }
        if ((i11 & 4) != 0) {
            str = selectionReactionsDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            str2 = selectionReactionsDTO.strokeColor;
        }
        if ((i11 & 16) != 0) {
            str3 = selectionReactionsDTO.scrollGradientColor;
        }
        if ((i11 & 32) != 0) {
            map = selectionReactionsDTO.tracking;
        }
        String str4 = str3;
        Map map2 = map;
        return selectionReactionsDTO.copy(reactions, cornerRadius, str, str2, str4, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Reactions getReactions() {
        return this.reactions;
    }

    /* renamed from: component2, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStrokeColor() {
        return this.strokeColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScrollGradientColor() {
        return this.scrollGradientColor;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.tracking;
    }

    @NotNull
    public final SelectionReactionsDTO copy(@NotNull Reactions reactions, CornerRadius cornerRadius, String backgroundColor, String strokeColor, String scrollGradientColor, Map<String, TokenizedTrackingInfo> tracking) {
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        return new SelectionReactionsDTO(reactions, cornerRadius, backgroundColor, strokeColor, scrollGradientColor, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionReactionsDTO)) {
            return false;
        }
        SelectionReactionsDTO selectionReactionsDTO = (SelectionReactionsDTO) other;
        return Intrinsics.d(this.reactions, selectionReactionsDTO.reactions) && this.cornerRadius == selectionReactionsDTO.cornerRadius && Intrinsics.d(this.backgroundColor, selectionReactionsDTO.backgroundColor) && Intrinsics.d(this.strokeColor, selectionReactionsDTO.strokeColor) && Intrinsics.d(this.scrollGradientColor, selectionReactionsDTO.scrollGradientColor) && Intrinsics.d(this.tracking, selectionReactionsDTO.tracking);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final Reactions getReactions() {
        return this.reactions;
    }

    public final String getScrollGradientColor() {
        return this.scrollGradientColor;
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int hashCode = this.reactions.hashCode() * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.strokeColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scrollGradientColor;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Reactions reactions = this.reactions;
        CornerRadius cornerRadius = this.cornerRadius;
        String str = this.backgroundColor;
        String str2 = this.strokeColor;
        String str3 = this.scrollGradientColor;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        StringBuilder sb2 = new StringBuilder("SelectionReactionsDTO(reactions=");
        sb2.append(reactions);
        sb2.append(", cornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", backgroundColor=");
        a.h(sb2, str, ", strokeColor=", str2, ", scrollGradientColor=");
        return C4070a.a(sb2, str3, ", tracking=", map, ")");
    }
}
