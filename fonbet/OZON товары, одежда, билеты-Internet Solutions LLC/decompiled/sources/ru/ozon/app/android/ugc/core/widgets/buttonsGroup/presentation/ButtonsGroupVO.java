package ru.ozon.app.android.ugc.core.widgets.buttonsGroup.presentation;

import B3.p;
import De.C2859b;
import F3.G;
import G.g;
import GR.b;
import Lh.a;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001:\u0003456BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jf\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u0010\u0017R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ButtonItem;", "buttons", "Lru/ozon/uni/atoms/data/common/Paddings;", "itemsPadding", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$LayoutPaddingsVO;", "paddings", "Landroidx/compose/foundation/layout/b$e;", "arrangement", "", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$LayoutPaddingsVO;Landroidx/compose/foundation/layout/b$e;Ljava/lang/String;LWZ/t;)V", "copy", "(JLjava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$LayoutPaddingsVO;Landroidx/compose/foundation/layout/b$e;Ljava/lang/String;LWZ/t;)Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getItemsPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$LayoutPaddingsVO;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$LayoutPaddingsVO;", "Landroidx/compose/foundation/layout/b$e;", "getArrangement", "()Landroidx/compose/foundation/layout/b$e;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ItemVO", "LayoutPaddingsVO", "ButtonItem", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ButtonsGroupVO implements c {

    @NotNull
    private final C5179b.e arrangement;
    private final String backgroundColor;

    @NotNull
    private final List<ButtonItem> buttons;
    private final long id;

    @NotNull
    private final Paddings itemsPadding;

    @NotNull
    private final LayoutPaddingsVO paddings;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ButtonItem;", "", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO;", "item", "", "isFullWidth", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO;Z)V", "copy", "(Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO;Z)Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ButtonItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO;", "getItem", "()Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO;", "Z", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonItem {
        private final boolean isFullWidth;
        private final ItemVO item;

        public ButtonItem(ItemVO itemVO, boolean z11) {
            this.item = itemVO;
            this.isFullWidth = z11;
        }

        public static /* synthetic */ ButtonItem copy$default(ButtonItem buttonItem, ItemVO itemVO, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                itemVO = buttonItem.item;
            }
            if ((i11 & 2) != 0) {
                z11 = buttonItem.isFullWidth;
            }
            return buttonItem.copy(itemVO, z11);
        }

        @NotNull
        public final ButtonItem copy(ItemVO item, boolean isFullWidth) {
            return new ButtonItem(item, isFullWidth);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonItem)) {
                return false;
            }
            ButtonItem buttonItem = (ButtonItem) other;
            return Intrinsics.d(this.item, buttonItem.item) && this.isFullWidth == buttonItem.isFullWidth;
        }

        public final ItemVO getItem() {
            return this.item;
        }

        public int hashCode() {
            ItemVO itemVO = this.item;
            return Boolean.hashCode(this.isFullWidth) + ((itemVO == null ? 0 : itemVO.hashCode()) * 31);
        }

        /* renamed from: isFullWidth, reason: from getter */
        public final boolean getIsFullWidth() {
            return this.isFullWidth;
        }

        @NotNull
        public String toString() {
            return "ButtonItem(item=" + this.item + ", isFullWidth=" + this.isFullWidth + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO;", "", "ButtonWrapper", "IconButtonWrapper", "ButtonSelector", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO$ButtonSelector;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO$ButtonWrapper;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO$IconButtonWrapper;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ItemVO {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO$ButtonSelector;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO;", "", "isSelected", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "normal", "selected", "<init>", "(ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "copy", "(ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO$ButtonSelector;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNormal", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSelected", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ButtonSelector implements ItemVO {
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

            /* renamed from: isSelected, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                return "ButtonSelector(isSelected=" + this.isSelected + ", normal=" + this.normal + ", selected=" + this.selected + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO$ButtonWrapper;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ButtonWrapper implements ItemVO {

            @NotNull
            private final ButtonV3DTO button;

            public ButtonWrapper(@NotNull ButtonV3DTO button) {
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ButtonWrapper) && Intrinsics.d(this.button, ((ButtonWrapper) other).button);
            }

            @NotNull
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            public int hashCode() {
                return this.button.hashCode();
            }

            @NotNull
            public String toString() {
                return G.b(this.button, "ButtonWrapper(button=", ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO$IconButtonWrapper;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class IconButtonWrapper implements ItemVO {
            public static final int $stable = IconButtonV3DTO.$stable;

            @NotNull
            private final IconButtonV3DTO iconButton;

            public IconButtonWrapper(@NotNull IconButtonV3DTO iconButton) {
                Intrinsics.checkNotNullParameter(iconButton, "iconButton");
                this.iconButton = iconButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IconButtonWrapper) && Intrinsics.d(this.iconButton, ((IconButtonWrapper) other).iconButton);
            }

            @NotNull
            public final IconButtonV3DTO getIconButton() {
                return this.iconButton;
            }

            public int hashCode() {
                return this.iconButton.hashCode();
            }

            @NotNull
            public String toString() {
                return "IconButtonWrapper(iconButton=" + this.iconButton + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$LayoutPaddingsVO;", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutPaddingsVO {

        @NotNull
        private final Paddings bottomPadding;

        @NotNull
        private final Paddings leftPadding;

        @NotNull
        private final Paddings rightPadding;

        @NotNull
        private final Paddings topPadding;

        public LayoutPaddingsVO(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding) {
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
            this.leftPadding = leftPadding;
            this.rightPadding = rightPadding;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutPaddingsVO)) {
                return false;
            }
            LayoutPaddingsVO layoutPaddingsVO = (LayoutPaddingsVO) other;
            return this.topPadding == layoutPaddingsVO.topPadding && this.bottomPadding == layoutPaddingsVO.bottomPadding && this.leftPadding == layoutPaddingsVO.leftPadding && this.rightPadding == layoutPaddingsVO.rightPadding;
        }

        @NotNull
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return this.rightPadding.hashCode() + b.b(this.leftPadding, b.b(this.bottomPadding, this.topPadding.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            return b.e(p.b("LayoutPaddingsVO(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
        }
    }

    public ButtonsGroupVO(long j11, @NotNull List<ButtonItem> buttons, @NotNull Paddings itemsPadding, @NotNull LayoutPaddingsVO paddings, @NotNull C5179b.e arrangement, String str, t tVar) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(itemsPadding, "itemsPadding");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        this.id = j11;
        this.buttons = buttons;
        this.itemsPadding = itemsPadding;
        this.paddings = paddings;
        this.arrangement = arrangement;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ ButtonsGroupVO copy$default(ButtonsGroupVO buttonsGroupVO, long j11, List list, Paddings paddings, LayoutPaddingsVO layoutPaddingsVO, C5179b.e eVar, String str, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = buttonsGroupVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = buttonsGroupVO.buttons;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            paddings = buttonsGroupVO.itemsPadding;
        }
        Paddings paddings2 = paddings;
        if ((i11 & 8) != 0) {
            layoutPaddingsVO = buttonsGroupVO.paddings;
        }
        LayoutPaddingsVO layoutPaddingsVO2 = layoutPaddingsVO;
        if ((i11 & 16) != 0) {
            eVar = buttonsGroupVO.arrangement;
        }
        return buttonsGroupVO.copy(j12, list2, paddings2, layoutPaddingsVO2, eVar, (i11 & 32) != 0 ? buttonsGroupVO.backgroundColor : str, (i11 & 64) != 0 ? buttonsGroupVO.tokenizedEvent : tVar);
    }

    @NotNull
    public final ButtonsGroupVO copy(long id2, @NotNull List<ButtonItem> buttons, @NotNull Paddings itemsPadding, @NotNull LayoutPaddingsVO paddings, @NotNull C5179b.e arrangement, String backgroundColor, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(itemsPadding, "itemsPadding");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        return new ButtonsGroupVO(id2, buttons, itemsPadding, paddings, arrangement, backgroundColor, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsGroupVO)) {
            return false;
        }
        ButtonsGroupVO buttonsGroupVO = (ButtonsGroupVO) other;
        return this.id == buttonsGroupVO.id && Intrinsics.d(this.buttons, buttonsGroupVO.buttons) && this.itemsPadding == buttonsGroupVO.itemsPadding && Intrinsics.d(this.paddings, buttonsGroupVO.paddings) && Intrinsics.d(this.arrangement, buttonsGroupVO.arrangement) && Intrinsics.d(this.backgroundColor, buttonsGroupVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, buttonsGroupVO.tokenizedEvent);
    }

    @NotNull
    public final C5179b.e getArrangement() {
        return this.arrangement;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<ButtonItem> getButtons() {
        return this.buttons;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final LayoutPaddingsVO getPaddings() {
        return this.paddings;
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
        int hashCode = (this.arrangement.hashCode() + ((this.paddings.hashCode() + b.b(this.itemsPadding, g.b(Long.hashCode(this.id) * 31, 31, this.buttons), 31)) * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ButtonItem> list = this.buttons;
        Paddings paddings = this.itemsPadding;
        LayoutPaddingsVO layoutPaddingsVO = this.paddings;
        C5179b.e eVar = this.arrangement;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = Lh.b.b(j11, "ButtonsGroupVO(id=", ", buttons=", list);
        b11.append(", itemsPadding=");
        b11.append(paddings);
        b11.append(", paddings=");
        b11.append(layoutPaddingsVO);
        b11.append(", arrangement=");
        b11.append(eVar);
        b11.append(", backgroundColor=");
        b11.append(str);
        return a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
