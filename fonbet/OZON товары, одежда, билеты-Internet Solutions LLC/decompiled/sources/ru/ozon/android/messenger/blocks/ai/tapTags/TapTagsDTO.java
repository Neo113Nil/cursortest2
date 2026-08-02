package ru.ozon.android.messenger.blocks.ai.tapTags;

import D3.g;
import Ef0.c;
import K1.G;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002!\"B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "tagsItems", "", "Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO$TagItemDTO;", "titleRightButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "presentationSettings", "Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO$PresentationSettingsDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO$PresentationSettingsDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTagsItems", "()Ljava/util/List;", "getTitleRightButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getPresentationSettings", "()Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO$PresentationSettingsDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TagItemDTO", "PresentationSettingsDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TapTagsDTO {
    public static final int $stable = TagButtonDTO.$stable;
    private final PresentationSettingsDTO presentationSettings;

    @NotNull
    private final List<TagItemDTO> tagsItems;
    private final TextDTO title;
    private final ButtonV3DTO titleRightButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b-\b\u0081\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJª\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0007HÖ\u0001J\t\u0010?\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b,\u0010\u001a¨\u0006@"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO$PresentationSettingsDTO;", "", "showMoreButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "hasMoreItems", "", "collapsedMaxRows", "", "lastItemMinWidth", "paddingTop", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddingRight", "paddingBottom", "paddingLeft", "rowGap", "columnGap", "backgroundColor", "", "itemsMaxPercentWidth", "", "pinToBottom", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;)V", "getShowMoreButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getHasMoreItems", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCollapsedMaxRows", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastItemMinWidth", "getPaddingTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getPaddingRight", "getPaddingBottom", "getPaddingLeft", "getRowGap", "getColumnGap", "getBackgroundColor", "()Ljava/lang/String;", "getItemsMaxPercentWidth", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPinToBottom", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;)Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO$PresentationSettingsDTO;", "equals", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PresentationSettingsDTO {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final Integer collapsedMaxRows;
        private final Paddings columnGap;
        private final Boolean hasMoreItems;
        private final Float itemsMaxPercentWidth;
        private final Integer lastItemMinWidth;
        private final Paddings paddingBottom;
        private final Paddings paddingLeft;
        private final Paddings paddingRight;
        private final Paddings paddingTop;
        private final Boolean pinToBottom;
        private final Paddings rowGap;
        private final ButtonV3DTO showMoreButton;

        public PresentationSettingsDTO(ButtonV3DTO buttonV3DTO, Boolean bool, Integer num, Integer num2, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6, String str, Float f7, Boolean bool2) {
            this.showMoreButton = buttonV3DTO;
            this.hasMoreItems = bool;
            this.collapsedMaxRows = num;
            this.lastItemMinWidth = num2;
            this.paddingTop = paddings;
            this.paddingRight = paddings2;
            this.paddingBottom = paddings3;
            this.paddingLeft = paddings4;
            this.rowGap = paddings5;
            this.columnGap = paddings6;
            this.backgroundColor = str;
            this.itemsMaxPercentWidth = f7;
            this.pinToBottom = bool2;
        }

        public static /* synthetic */ PresentationSettingsDTO copy$default(PresentationSettingsDTO presentationSettingsDTO, ButtonV3DTO buttonV3DTO, Boolean bool, Integer num, Integer num2, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6, String str, Float f7, Boolean bool2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = presentationSettingsDTO.showMoreButton;
            }
            return presentationSettingsDTO.copy(buttonV3DTO, (i11 & 2) != 0 ? presentationSettingsDTO.hasMoreItems : bool, (i11 & 4) != 0 ? presentationSettingsDTO.collapsedMaxRows : num, (i11 & 8) != 0 ? presentationSettingsDTO.lastItemMinWidth : num2, (i11 & 16) != 0 ? presentationSettingsDTO.paddingTop : paddings, (i11 & 32) != 0 ? presentationSettingsDTO.paddingRight : paddings2, (i11 & 64) != 0 ? presentationSettingsDTO.paddingBottom : paddings3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? presentationSettingsDTO.paddingLeft : paddings4, (i11 & 256) != 0 ? presentationSettingsDTO.rowGap : paddings5, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? presentationSettingsDTO.columnGap : paddings6, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? presentationSettingsDTO.backgroundColor : str, (i11 & 2048) != 0 ? presentationSettingsDTO.itemsMaxPercentWidth : f7, (i11 & 4096) != 0 ? presentationSettingsDTO.pinToBottom : bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getShowMoreButton() {
            return this.showMoreButton;
        }

        /* renamed from: component10, reason: from getter */
        public final Paddings getColumnGap() {
            return this.columnGap;
        }

        /* renamed from: component11, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component12, reason: from getter */
        public final Float getItemsMaxPercentWidth() {
            return this.itemsMaxPercentWidth;
        }

        /* renamed from: component13, reason: from getter */
        public final Boolean getPinToBottom() {
            return this.pinToBottom;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getHasMoreItems() {
            return this.hasMoreItems;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getCollapsedMaxRows() {
            return this.collapsedMaxRows;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getLastItemMinWidth() {
            return this.lastItemMinWidth;
        }

        /* renamed from: component5, reason: from getter */
        public final Paddings getPaddingTop() {
            return this.paddingTop;
        }

        /* renamed from: component6, reason: from getter */
        public final Paddings getPaddingRight() {
            return this.paddingRight;
        }

        /* renamed from: component7, reason: from getter */
        public final Paddings getPaddingBottom() {
            return this.paddingBottom;
        }

        /* renamed from: component8, reason: from getter */
        public final Paddings getPaddingLeft() {
            return this.paddingLeft;
        }

        /* renamed from: component9, reason: from getter */
        public final Paddings getRowGap() {
            return this.rowGap;
        }

        @NotNull
        public final PresentationSettingsDTO copy(ButtonV3DTO showMoreButton, Boolean hasMoreItems, Integer collapsedMaxRows, Integer lastItemMinWidth, Paddings paddingTop, Paddings paddingRight, Paddings paddingBottom, Paddings paddingLeft, Paddings rowGap, Paddings columnGap, String backgroundColor, Float itemsMaxPercentWidth, Boolean pinToBottom) {
            return new PresentationSettingsDTO(showMoreButton, hasMoreItems, collapsedMaxRows, lastItemMinWidth, paddingTop, paddingRight, paddingBottom, paddingLeft, rowGap, columnGap, backgroundColor, itemsMaxPercentWidth, pinToBottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PresentationSettingsDTO)) {
                return false;
            }
            PresentationSettingsDTO presentationSettingsDTO = (PresentationSettingsDTO) other;
            return Intrinsics.d(this.showMoreButton, presentationSettingsDTO.showMoreButton) && Intrinsics.d(this.hasMoreItems, presentationSettingsDTO.hasMoreItems) && Intrinsics.d(this.collapsedMaxRows, presentationSettingsDTO.collapsedMaxRows) && Intrinsics.d(this.lastItemMinWidth, presentationSettingsDTO.lastItemMinWidth) && this.paddingTop == presentationSettingsDTO.paddingTop && this.paddingRight == presentationSettingsDTO.paddingRight && this.paddingBottom == presentationSettingsDTO.paddingBottom && this.paddingLeft == presentationSettingsDTO.paddingLeft && this.rowGap == presentationSettingsDTO.rowGap && this.columnGap == presentationSettingsDTO.columnGap && Intrinsics.d(this.backgroundColor, presentationSettingsDTO.backgroundColor) && Intrinsics.d(this.itemsMaxPercentWidth, presentationSettingsDTO.itemsMaxPercentWidth) && Intrinsics.d(this.pinToBottom, presentationSettingsDTO.pinToBottom);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Integer getCollapsedMaxRows() {
            return this.collapsedMaxRows;
        }

        public final Paddings getColumnGap() {
            return this.columnGap;
        }

        public final Boolean getHasMoreItems() {
            return this.hasMoreItems;
        }

        public final Float getItemsMaxPercentWidth() {
            return this.itemsMaxPercentWidth;
        }

        public final Integer getLastItemMinWidth() {
            return this.lastItemMinWidth;
        }

        public final Paddings getPaddingBottom() {
            return this.paddingBottom;
        }

        public final Paddings getPaddingLeft() {
            return this.paddingLeft;
        }

        public final Paddings getPaddingRight() {
            return this.paddingRight;
        }

        public final Paddings getPaddingTop() {
            return this.paddingTop;
        }

        public final Boolean getPinToBottom() {
            return this.pinToBottom;
        }

        public final Paddings getRowGap() {
            return this.rowGap;
        }

        public final ButtonV3DTO getShowMoreButton() {
            return this.showMoreButton;
        }

        public int hashCode() {
            ButtonV3DTO buttonV3DTO = this.showMoreButton;
            int hashCode = (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode()) * 31;
            Boolean bool = this.hasMoreItems;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.collapsedMaxRows;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.lastItemMinWidth;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Paddings paddings = this.paddingTop;
            int hashCode5 = (hashCode4 + (paddings == null ? 0 : paddings.hashCode())) * 31;
            Paddings paddings2 = this.paddingRight;
            int hashCode6 = (hashCode5 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.paddingBottom;
            int hashCode7 = (hashCode6 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.paddingLeft;
            int hashCode8 = (hashCode7 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
            Paddings paddings5 = this.rowGap;
            int hashCode9 = (hashCode8 + (paddings5 == null ? 0 : paddings5.hashCode())) * 31;
            Paddings paddings6 = this.columnGap;
            int hashCode10 = (hashCode9 + (paddings6 == null ? 0 : paddings6.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
            Float f7 = this.itemsMaxPercentWidth;
            int hashCode12 = (hashCode11 + (f7 == null ? 0 : f7.hashCode())) * 31;
            Boolean bool2 = this.pinToBottom;
            return hashCode12 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ButtonV3DTO buttonV3DTO = this.showMoreButton;
            Boolean bool = this.hasMoreItems;
            Integer num = this.collapsedMaxRows;
            Integer num2 = this.lastItemMinWidth;
            Paddings paddings = this.paddingTop;
            Paddings paddings2 = this.paddingRight;
            Paddings paddings3 = this.paddingBottom;
            Paddings paddings4 = this.paddingLeft;
            Paddings paddings5 = this.rowGap;
            Paddings paddings6 = this.columnGap;
            String str = this.backgroundColor;
            Float f7 = this.itemsMaxPercentWidth;
            Boolean bool2 = this.pinToBottom;
            StringBuilder sb2 = new StringBuilder("PresentationSettingsDTO(showMoreButton=");
            sb2.append(buttonV3DTO);
            sb2.append(", hasMoreItems=");
            sb2.append(bool);
            sb2.append(", collapsedMaxRows=");
            c.e(sb2, num, ", lastItemMinWidth=", num2, ", paddingTop=");
            Lh.a.e(sb2, paddings, ", paddingRight=", paddings2, ", paddingBottom=");
            Lh.a.e(sb2, paddings3, ", paddingLeft=", paddings4, ", rowGap=");
            Lh.a.e(sb2, paddings5, ", columnGap=", paddings6, ", backgroundColor=");
            sb2.append(str);
            sb2.append(", itemsMaxPercentWidth=");
            sb2.append(f7);
            sb2.append(", pinToBottom=");
            return g.d(sb2, bool2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO$TagItemDTO;", "", "type", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.BUTTON_ITEM_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "tagButtonItem", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)V", "getType", "()Ljava/lang/String;", "getButtonItem", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTagButtonItem", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TagItemDTO {
        public static final int $stable = TagButtonDTO.$stable;
        private final ButtonV3DTO buttonItem;
        private final TagButtonDTO tagButtonItem;

        @NotNull
        private final String type;

        public TagItemDTO(@NotNull String type, ButtonV3DTO buttonV3DTO, TagButtonDTO tagButtonDTO) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.buttonItem = buttonV3DTO;
            this.tagButtonItem = tagButtonDTO;
        }

        public static /* synthetic */ TagItemDTO copy$default(TagItemDTO tagItemDTO, String str, ButtonV3DTO buttonV3DTO, TagButtonDTO tagButtonDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tagItemDTO.type;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO = tagItemDTO.buttonItem;
            }
            if ((i11 & 4) != 0) {
                tagButtonDTO = tagItemDTO.tagButtonItem;
            }
            return tagItemDTO.copy(str, buttonV3DTO, tagButtonDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getButtonItem() {
            return this.buttonItem;
        }

        /* renamed from: component3, reason: from getter */
        public final TagButtonDTO getTagButtonItem() {
            return this.tagButtonItem;
        }

        @NotNull
        public final TagItemDTO copy(@NotNull String type, ButtonV3DTO buttonItem, TagButtonDTO tagButtonItem) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new TagItemDTO(type, buttonItem, tagButtonItem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TagItemDTO)) {
                return false;
            }
            TagItemDTO tagItemDTO = (TagItemDTO) other;
            return Intrinsics.d(this.type, tagItemDTO.type) && Intrinsics.d(this.buttonItem, tagItemDTO.buttonItem) && Intrinsics.d(this.tagButtonItem, tagItemDTO.tagButtonItem);
        }

        public final ButtonV3DTO getButtonItem() {
            return this.buttonItem;
        }

        public final TagButtonDTO getTagButtonItem() {
            return this.tagButtonItem;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            ButtonV3DTO buttonV3DTO = this.buttonItem;
            int hashCode2 = (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            TagButtonDTO tagButtonDTO = this.tagButtonItem;
            return hashCode2 + (tagButtonDTO != null ? tagButtonDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TagItemDTO(type=" + this.type + ", buttonItem=" + this.buttonItem + ", tagButtonItem=" + this.tagButtonItem + ")";
        }
    }

    public TapTagsDTO(TextDTO textDTO, @NotNull List<TagItemDTO> tagsItems, ButtonV3DTO buttonV3DTO, PresentationSettingsDTO presentationSettingsDTO) {
        Intrinsics.checkNotNullParameter(tagsItems, "tagsItems");
        this.title = textDTO;
        this.tagsItems = tagsItems;
        this.titleRightButton = buttonV3DTO;
        this.presentationSettings = presentationSettingsDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TapTagsDTO copy$default(TapTagsDTO tapTagsDTO, TextDTO textDTO, List list, ButtonV3DTO buttonV3DTO, PresentationSettingsDTO presentationSettingsDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = tapTagsDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = tapTagsDTO.tagsItems;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = tapTagsDTO.titleRightButton;
        }
        if ((i11 & 8) != 0) {
            presentationSettingsDTO = tapTagsDTO.presentationSettings;
        }
        return tapTagsDTO.copy(textDTO, list, buttonV3DTO, presentationSettingsDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<TagItemDTO> component2() {
        return this.tagsItems;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getTitleRightButton() {
        return this.titleRightButton;
    }

    /* renamed from: component4, reason: from getter */
    public final PresentationSettingsDTO getPresentationSettings() {
        return this.presentationSettings;
    }

    @NotNull
    public final TapTagsDTO copy(TextDTO title, @NotNull List<TagItemDTO> tagsItems, ButtonV3DTO titleRightButton, PresentationSettingsDTO presentationSettings) {
        Intrinsics.checkNotNullParameter(tagsItems, "tagsItems");
        return new TapTagsDTO(title, tagsItems, titleRightButton, presentationSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapTagsDTO)) {
            return false;
        }
        TapTagsDTO tapTagsDTO = (TapTagsDTO) other;
        return Intrinsics.d(this.title, tapTagsDTO.title) && Intrinsics.d(this.tagsItems, tapTagsDTO.tagsItems) && Intrinsics.d(this.titleRightButton, tapTagsDTO.titleRightButton) && Intrinsics.d(this.presentationSettings, tapTagsDTO.presentationSettings);
    }

    public final PresentationSettingsDTO getPresentationSettings() {
        return this.presentationSettings;
    }

    @NotNull
    public final List<TagItemDTO> getTagsItems() {
        return this.tagsItems;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final ButtonV3DTO getTitleRightButton() {
        return this.titleRightButton;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int b11 = G.g.b((textDTO == null ? 0 : textDTO.hashCode()) * 31, 31, this.tagsItems);
        ButtonV3DTO buttonV3DTO = this.titleRightButton;
        int hashCode = (b11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        PresentationSettingsDTO presentationSettingsDTO = this.presentationSettings;
        return hashCode + (presentationSettingsDTO != null ? presentationSettingsDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<TagItemDTO> list = this.tagsItems;
        ButtonV3DTO buttonV3DTO = this.titleRightButton;
        PresentationSettingsDTO presentationSettingsDTO = this.presentationSettings;
        StringBuilder e11 = G.e("TapTagsDTO(title=", textDTO, ", tagsItems=", list, ", titleRightButton=");
        e11.append(buttonV3DTO);
        e11.append(", presentationSettings=");
        e11.append(presentationSettingsDTO);
        e11.append(")");
        return e11.toString();
    }
}
