package ru.ozon.app.android.ugc.core.widgets.buttonsGroup.data;

import B3.p;
import De.C2859b;
import Ul.C4070a;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0005+,-./BS\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Ja\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00060"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO;", "", "buttons", "", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO$ButtonItem;", "itemsPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddings", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO$LayoutPaddings;", "alignment", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO$Alignment;", "backgroundColor", "", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO$LayoutPaddings;Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO$Alignment;Ljava/lang/String;Ljava/util/Map;)V", "getButtons", "()Ljava/util/List;", "getItemsPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO$LayoutPaddings;", "getAlignment", "()Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO$Alignment;", "getBackgroundColor", "()Ljava/lang/String;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "ButtonItem", "ButtonSelector", "LayoutPaddings", "Alignment", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ButtonsGroupDTO {

    @NotNull
    public static final String BUTTON = "BUTTON";

    @NotNull
    public static final String BUTTON_SELECTOR = "BUTTON_SELECTOR";

    @NotNull
    public static final String ICON_BUTTON = "ICON_BUTTON";

    @NotNull
    public static final String TYPE = "type";
    private final Alignment alignment;
    private final String backgroundColor;

    @NotNull
    private final List<ButtonItem> buttons;
    private final Paddings itemsPadding;
    private final LayoutPaddings paddings;
    private final Map<String, TokenizedTrackingInfo> tracking;
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "ALIGNMENT_INVALID", "LEFT", "CENTER", "RIGHT", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Alignment {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment ALIGNMENT_INVALID = new Alignment("ALIGNMENT_INVALID", 0);
        public static final Alignment LEFT = new Alignment("LEFT", 1);
        public static final Alignment CENTER = new Alignment("CENTER", 2);
        public static final Alignment RIGHT = new Alignment("RIGHT", 3);

        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{ALIGNMENT_INVALID, LEFT, CENTER, RIGHT};
        }

        static {
            Alignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Alignment(String str, int i11) {
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0001HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\t¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO$ButtonItem;", "", "button", "isFullWidth", "", "<init>", "(Ljava/lang/Object;Z)V", "getButton", "()Ljava/lang/Object;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonItem {
        public static final int $stable = 8;

        @NotNull
        private final Object button;
        private final boolean isFullWidth;

        public ButtonItem(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "button", name = "BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "iconButton", name = "ICON_BUTTON", type = IconButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "buttonSelector", name = "BUTTON_SELECTOR", type = ButtonSelector.class)}) @NotNull @ProtoOneOf(label = "type") Object button, boolean z11) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.isFullWidth = z11;
        }

        public static /* synthetic */ ButtonItem copy$default(ButtonItem buttonItem, Object obj, boolean z11, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = buttonItem.button;
            }
            if ((i11 & 2) != 0) {
                z11 = buttonItem.isFullWidth;
            }
            return buttonItem.copy(obj, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Object getButton() {
            return this.button;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFullWidth() {
            return this.isFullWidth;
        }

        @NotNull
        public final ButtonItem copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "button", name = "BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "iconButton", name = "ICON_BUTTON", type = IconButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "buttonSelector", name = "BUTTON_SELECTOR", type = ButtonSelector.class)}) @NotNull @ProtoOneOf(label = "type") Object button, boolean isFullWidth) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new ButtonItem(button, isFullWidth);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonItem)) {
                return false;
            }
            ButtonItem buttonItem = (ButtonItem) other;
            return Intrinsics.d(this.button, buttonItem.button) && this.isFullWidth == buttonItem.isFullWidth;
        }

        @NotNull
        public final Object getButton() {
            return this.button;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFullWidth) + (this.button.hashCode() * 31);
        }

        public final boolean isFullWidth() {
            return this.isFullWidth;
        }

        @NotNull
        public String toString() {
            return "ButtonItem(button=" + this.button + ", isFullWidth=" + this.isFullWidth + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO$ButtonSelector;", "", "isSelected", "", "normal", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "selected", "<init>", "(ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "()Z", "getNormal", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSelected", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonSelector {
        public static final int $stable = 0;
        private final boolean isSelected;

        @NotNull
        private final ButtonV3DTO normal;
        private final ButtonV3DTO selected;

        public ButtonSelector(boolean z11, @NotNull ButtonV3DTO normal, ButtonV3DTO buttonV3DTO) {
            Intrinsics.checkNotNullParameter(normal, "normal");
            this.isSelected = z11;
            this.normal = normal;
            this.selected = buttonV3DTO;
        }

        public static /* synthetic */ ButtonSelector copy$default(ButtonSelector buttonSelector, boolean z11, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = buttonSelector.isSelected;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO = buttonSelector.normal;
            }
            if ((i11 & 4) != 0) {
                buttonV3DTO2 = buttonSelector.selected;
            }
            return buttonSelector.copy(z11, buttonV3DTO, buttonV3DTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getNormal() {
            return this.normal;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonV3DTO getSelected() {
            return this.selected;
        }

        @NotNull
        public final ButtonSelector copy(boolean isSelected, @NotNull ButtonV3DTO normal, ButtonV3DTO selected) {
            Intrinsics.checkNotNullParameter(normal, "normal");
            return new ButtonSelector(isSelected, normal, selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonSelector)) {
                return false;
            }
            ButtonSelector buttonSelector = (ButtonSelector) other;
            return this.isSelected == buttonSelector.isSelected && Intrinsics.d(this.normal, buttonSelector.normal) && Intrinsics.d(this.selected, buttonSelector.selected);
        }

        @NotNull
        public final ButtonV3DTO getNormal() {
            return this.normal;
        }

        public final ButtonV3DTO getSelected() {
            return this.selected;
        }

        public int hashCode() {
            int c11 = C2859b.c(this.normal, Boolean.hashCode(this.isSelected) * 31, 31);
            ButtonV3DTO buttonV3DTO = this.selected;
            return c11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode());
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            return "ButtonSelector(isSelected=" + this.isSelected + ", normal=" + this.normal + ", selected=" + this.selected + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO$LayoutPaddings;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutPaddings {
        public static final int $stable = 0;
        private final Paddings bottomPadding;
        private final Paddings leftPadding;
        private final Paddings rightPadding;
        private final Paddings topPadding;

        public LayoutPaddings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
            this.topPadding = paddings;
            this.bottomPadding = paddings2;
            this.leftPadding = paddings3;
            this.rightPadding = paddings4;
        }

        public static /* synthetic */ LayoutPaddings copy$default(LayoutPaddings layoutPaddings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = layoutPaddings.topPadding;
            }
            if ((i11 & 2) != 0) {
                paddings2 = layoutPaddings.bottomPadding;
            }
            if ((i11 & 4) != 0) {
                paddings3 = layoutPaddings.leftPadding;
            }
            if ((i11 & 8) != 0) {
                paddings4 = layoutPaddings.rightPadding;
            }
            return layoutPaddings.copy(paddings, paddings2, paddings3, paddings4);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final LayoutPaddings copy(Paddings topPadding, Paddings bottomPadding, Paddings leftPadding, Paddings rightPadding) {
            return new LayoutPaddings(topPadding, bottomPadding, leftPadding, rightPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutPaddings)) {
                return false;
            }
            LayoutPaddings layoutPaddings = (LayoutPaddings) other;
            return this.topPadding == layoutPaddings.topPadding && this.bottomPadding == layoutPaddings.bottomPadding && this.leftPadding == layoutPaddings.leftPadding && this.rightPadding == layoutPaddings.rightPadding;
        }

        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            Paddings paddings = this.topPadding;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.bottomPadding;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.leftPadding;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.rightPadding;
            return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            return GR.b.e(p.b("LayoutPaddings(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
        }
    }

    public ButtonsGroupDTO(@NotNull List<ButtonItem> buttons, Paddings paddings, LayoutPaddings layoutPaddings, Alignment alignment, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.buttons = buttons;
        this.itemsPadding = paddings;
        this.paddings = layoutPaddings;
        this.alignment = alignment;
        this.backgroundColor = str;
        this.tracking = map;
    }

    public static /* synthetic */ ButtonsGroupDTO copy$default(ButtonsGroupDTO buttonsGroupDTO, List list, Paddings paddings, LayoutPaddings layoutPaddings, Alignment alignment, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = buttonsGroupDTO.buttons;
        }
        if ((i11 & 2) != 0) {
            paddings = buttonsGroupDTO.itemsPadding;
        }
        if ((i11 & 4) != 0) {
            layoutPaddings = buttonsGroupDTO.paddings;
        }
        if ((i11 & 8) != 0) {
            alignment = buttonsGroupDTO.alignment;
        }
        if ((i11 & 16) != 0) {
            str = buttonsGroupDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            map = buttonsGroupDTO.tracking;
        }
        String str2 = str;
        Map map2 = map;
        return buttonsGroupDTO.copy(list, paddings, layoutPaddings, alignment, str2, map2);
    }

    @NotNull
    public final List<ButtonItem> component1() {
        return this.buttons;
    }

    /* renamed from: component2, reason: from getter */
    public final Paddings getItemsPadding() {
        return this.itemsPadding;
    }

    /* renamed from: component3, reason: from getter */
    public final LayoutPaddings getPaddings() {
        return this.paddings;
    }

    /* renamed from: component4, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.tracking;
    }

    @NotNull
    public final ButtonsGroupDTO copy(@NotNull List<ButtonItem> buttons, Paddings itemsPadding, LayoutPaddings paddings, Alignment alignment, String backgroundColor, Map<String, TokenizedTrackingInfo> tracking) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new ButtonsGroupDTO(buttons, itemsPadding, paddings, alignment, backgroundColor, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsGroupDTO)) {
            return false;
        }
        ButtonsGroupDTO buttonsGroupDTO = (ButtonsGroupDTO) other;
        return Intrinsics.d(this.buttons, buttonsGroupDTO.buttons) && this.itemsPadding == buttonsGroupDTO.itemsPadding && Intrinsics.d(this.paddings, buttonsGroupDTO.paddings) && this.alignment == buttonsGroupDTO.alignment && Intrinsics.d(this.backgroundColor, buttonsGroupDTO.backgroundColor) && Intrinsics.d(this.tracking, buttonsGroupDTO.tracking);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<ButtonItem> getButtons() {
        return this.buttons;
    }

    public final Paddings getItemsPadding() {
        return this.itemsPadding;
    }

    public final LayoutPaddings getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int hashCode = this.buttons.hashCode() * 31;
        Paddings paddings = this.itemsPadding;
        int hashCode2 = (hashCode + (paddings == null ? 0 : paddings.hashCode())) * 31;
        LayoutPaddings layoutPaddings = this.paddings;
        int hashCode3 = (hashCode2 + (layoutPaddings == null ? 0 : layoutPaddings.hashCode())) * 31;
        Alignment alignment = this.alignment;
        int hashCode4 = (hashCode3 + (alignment == null ? 0 : alignment.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ButtonItem> list = this.buttons;
        Paddings paddings = this.itemsPadding;
        LayoutPaddings layoutPaddings = this.paddings;
        Alignment alignment = this.alignment;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        StringBuilder sb2 = new StringBuilder("ButtonsGroupDTO(buttons=");
        sb2.append(list);
        sb2.append(", itemsPadding=");
        sb2.append(paddings);
        sb2.append(", paddings=");
        sb2.append(layoutPaddings);
        sb2.append(", alignment=");
        sb2.append(alignment);
        sb2.append(", backgroundColor=");
        return C4070a.a(sb2, str, ", tracking=", map, ")");
    }
}
