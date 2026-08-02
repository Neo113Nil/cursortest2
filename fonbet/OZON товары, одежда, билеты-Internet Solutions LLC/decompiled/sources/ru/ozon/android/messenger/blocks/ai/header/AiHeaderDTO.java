package ru.ozon.android.messenger.blocks.ai.header;

import B90.C2616s;
import K1.G;
import T7.P;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003./0Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Ju\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00061"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/header/AiHeaderDTO;", "", "backgroundColor", "", "mainItem", "Lru/ozon/android/messenger/blocks/ai/header/AiHeaderDTO$Item;", "leadingButtons", "", "Lru/ozon/android/messenger/blocks/ai/header/AiHeaderDTO$ButtonItem;", "trailingButtons", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/android/messenger/blocks/ai/header/AiHeaderDTO$Item;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getMainItem", "()Lru/ozon/android/messenger/blocks/ai/header/AiHeaderDTO$Item;", "getLeadingButtons", "()Ljava/util/List;", "getTrailingButtons", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Item", "TitleSubtitle", "ButtonItem", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AiHeaderDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final CornerRadius cornerRadius;
    private final List<ButtonItem> leadingButtons;
    private final Item mainItem;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final List<ButtonItem> trailingButtons;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/header/AiHeaderDTO$ButtonItem;", "", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "textButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTextButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonItem {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final IconButtonV3DTO iconButton;
        private final ButtonV3DTO textButton;

        public ButtonItem(IconButtonV3DTO iconButtonV3DTO, ButtonV3DTO buttonV3DTO) {
            this.iconButton = iconButtonV3DTO;
            this.textButton = buttonV3DTO;
        }

        public static /* synthetic */ ButtonItem copy$default(ButtonItem buttonItem, IconButtonV3DTO iconButtonV3DTO, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonV3DTO = buttonItem.iconButton;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO = buttonItem.textButton;
            }
            return buttonItem.copy(iconButtonV3DTO, buttonV3DTO);
        }

        /* renamed from: component1, reason: from getter */
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getTextButton() {
            return this.textButton;
        }

        @NotNull
        public final ButtonItem copy(IconButtonV3DTO iconButton, ButtonV3DTO textButton) {
            return new ButtonItem(iconButton, textButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonItem)) {
                return false;
            }
            ButtonItem buttonItem = (ButtonItem) other;
            return Intrinsics.d(this.iconButton, buttonItem.iconButton) && Intrinsics.d(this.textButton, buttonItem.textButton);
        }

        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        public final ButtonV3DTO getTextButton() {
            return this.textButton;
        }

        public int hashCode() {
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            int hashCode = (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode()) * 31;
            ButtonV3DTO buttonV3DTO = this.textButton;
            return hashCode + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ButtonItem(iconButton=" + this.iconButton + ", textButton=" + this.textButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/header/AiHeaderDTO$Item;", "", "type", "", "actionButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "titleSubtitle", "Lru/ozon/android/messenger/blocks/ai/header/AiHeaderDTO$TitleSubtitle;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/android/messenger/blocks/ai/header/AiHeaderDTO$TitleSubtitle;)V", "getType", "()Ljava/lang/String;", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTitleSubtitle", "()Lru/ozon/android/messenger/blocks/ai/header/AiHeaderDTO$TitleSubtitle;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 0;
        private final ButtonV3DTO actionButton;
        private final TitleSubtitle titleSubtitle;

        @NotNull
        private final String type;

        public Item(@NotNull String type, ButtonV3DTO buttonV3DTO, TitleSubtitle titleSubtitle) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.actionButton = buttonV3DTO;
            this.titleSubtitle = titleSubtitle;
        }

        public static /* synthetic */ Item copy$default(Item item, String str, ButtonV3DTO buttonV3DTO, TitleSubtitle titleSubtitle, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = item.type;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO = item.actionButton;
            }
            if ((i11 & 4) != 0) {
                titleSubtitle = item.titleSubtitle;
            }
            return item.copy(str, buttonV3DTO, titleSubtitle);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getActionButton() {
            return this.actionButton;
        }

        /* renamed from: component3, reason: from getter */
        public final TitleSubtitle getTitleSubtitle() {
            return this.titleSubtitle;
        }

        @NotNull
        public final Item copy(@NotNull String type, ButtonV3DTO actionButton, TitleSubtitle titleSubtitle) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new Item(type, actionButton, titleSubtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.type, item.type) && Intrinsics.d(this.actionButton, item.actionButton) && Intrinsics.d(this.titleSubtitle, item.titleSubtitle);
        }

        public final ButtonV3DTO getActionButton() {
            return this.actionButton;
        }

        public final TitleSubtitle getTitleSubtitle() {
            return this.titleSubtitle;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            ButtonV3DTO buttonV3DTO = this.actionButton;
            int hashCode2 = (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            TitleSubtitle titleSubtitle = this.titleSubtitle;
            return hashCode2 + (titleSubtitle != null ? titleSubtitle.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Item(type=" + this.type + ", actionButton=" + this.actionButton + ", titleSubtitle=" + this.titleSubtitle + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Lru/ozon/android/messenger/blocks/ai/header/AiHeaderDTO$TitleSubtitle;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitleSubtitle implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<TitleSubtitle> CREATOR = new a();
        private final AtomActionDTO action;
        private final TextDTO subtitle;
        private final TextDTO title;

        public static final class a implements Parcelable.Creator<TitleSubtitle> {
            @Override // android.os.Parcelable.Creator
            public final TitleSubtitle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TitleSubtitle((TextDTO) parcel.readParcelable(TitleSubtitle.class.getClassLoader()), (TextDTO) parcel.readParcelable(TitleSubtitle.class.getClassLoader()), (AtomActionDTO) parcel.readParcelable(TitleSubtitle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final TitleSubtitle[] newArray(int i11) {
                return new TitleSubtitle[i11];
            }
        }

        public TitleSubtitle(TextDTO textDTO, TextDTO textDTO2, AtomActionDTO atomActionDTO) {
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ TitleSubtitle copy$default(TitleSubtitle titleSubtitle, TextDTO textDTO, TextDTO textDTO2, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = titleSubtitle.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = titleSubtitle.subtitle;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = titleSubtitle.action;
            }
            return titleSubtitle.copy(textDTO, textDTO2, atomActionDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final TitleSubtitle copy(TextDTO title, TextDTO subtitle, AtomActionDTO action) {
            return new TitleSubtitle(title, subtitle, action);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleSubtitle)) {
                return false;
            }
            TitleSubtitle titleSubtitle = (TitleSubtitle) other;
            return Intrinsics.d(this.title, titleSubtitle.title) && Intrinsics.d(this.subtitle, titleSubtitle.subtitle) && Intrinsics.d(this.action, titleSubtitle.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
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
            AtomActionDTO atomActionDTO = this.action;
            return hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            return G.c(D3.g.g("TitleSubtitle(title=", textDTO, ", subtitle=", textDTO2, ", action="), this.action, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.title, flags);
            dest.writeParcelable(this.subtitle, flags);
            dest.writeParcelable(this.action, flags);
        }
    }

    public AiHeaderDTO(String str, Item item, List<ButtonItem> list, List<ButtonItem> list2, CornerRadius cornerRadius, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        this.backgroundColor = str;
        this.mainItem = item;
        this.leadingButtons = list;
        this.trailingButtons = list2;
        this.cornerRadius = cornerRadius;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AiHeaderDTO copy$default(AiHeaderDTO aiHeaderDTO, String str, Item item, List list, List list2, CornerRadius cornerRadius, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aiHeaderDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            item = aiHeaderDTO.mainItem;
        }
        if ((i11 & 4) != 0) {
            list = aiHeaderDTO.leadingButtons;
        }
        if ((i11 & 8) != 0) {
            list2 = aiHeaderDTO.trailingButtons;
        }
        if ((i11 & 16) != 0) {
            cornerRadius = aiHeaderDTO.cornerRadius;
        }
        if ((i11 & 32) != 0) {
            testInfo = aiHeaderDTO.testInfo;
        }
        if ((i11 & 64) != 0) {
            map = aiHeaderDTO.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        CornerRadius cornerRadius2 = cornerRadius;
        List list3 = list;
        return aiHeaderDTO.copy(str, item, list3, list2, cornerRadius2, testInfo2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final Item getMainItem() {
        return this.mainItem;
    }

    public final List<ButtonItem> component3() {
        return this.leadingButtons;
    }

    public final List<ButtonItem> component4() {
        return this.trailingButtons;
    }

    /* renamed from: component5, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final AiHeaderDTO copy(String backgroundColor, Item mainItem, List<ButtonItem> leadingButtons, List<ButtonItem> trailingButtons, CornerRadius cornerRadius, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new AiHeaderDTO(backgroundColor, mainItem, leadingButtons, trailingButtons, cornerRadius, testInfo, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiHeaderDTO)) {
            return false;
        }
        AiHeaderDTO aiHeaderDTO = (AiHeaderDTO) other;
        return Intrinsics.d(this.backgroundColor, aiHeaderDTO.backgroundColor) && Intrinsics.d(this.mainItem, aiHeaderDTO.mainItem) && Intrinsics.d(this.leadingButtons, aiHeaderDTO.leadingButtons) && Intrinsics.d(this.trailingButtons, aiHeaderDTO.trailingButtons) && this.cornerRadius == aiHeaderDTO.cornerRadius && Intrinsics.d(this.testInfo, aiHeaderDTO.testInfo) && Intrinsics.d(this.trackingInfo, aiHeaderDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final List<ButtonItem> getLeadingButtons() {
        return this.leadingButtons;
    }

    public final Item getMainItem() {
        return this.mainItem;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final List<ButtonItem> getTrailingButtons() {
        return this.trailingButtons;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Item item = this.mainItem;
        int hashCode2 = (hashCode + (item == null ? 0 : item.hashCode())) * 31;
        List<ButtonItem> list = this.leadingButtons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ButtonItem> list2 = this.trailingButtons;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode5 = (hashCode4 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        Item item = this.mainItem;
        List<ButtonItem> list = this.leadingButtons;
        List<ButtonItem> list2 = this.trailingButtons;
        CornerRadius cornerRadius = this.cornerRadius;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("AiHeaderDTO(backgroundColor=");
        sb2.append(str);
        sb2.append(", mainItem=");
        sb2.append(item);
        sb2.append(", leadingButtons=");
        C2616s.g(", trailingButtons=", ", cornerRadius=", sb2, list, list2);
        sb2.append(cornerRadius);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ AiHeaderDTO(String str, Item item, List list, List list2, CornerRadius cornerRadius, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, item, list, list2, cornerRadius, testInfo, (i11 & 64) != 0 ? null : map);
    }
}
