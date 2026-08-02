package ru.ozon.app.android.storefront.widgets.financeWidgetV2.data;

import Ak.b;
import G.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003JW\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;", "", "mainText", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "chevronIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "actionButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "backgroundColor", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getMainText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "getChevronIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBackgroundColor", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FinanceWidgetCardDTO {
    public static final int $stable = IconDTO.$stable;
    private final ButtonV3DTO actionButton;

    @NotNull
    private final String backgroundColor;
    private final IconDTO chevronIcon;

    @NotNull
    private final CommonControlSettings common;
    private final ImageDTO image;

    @NotNull
    private final TextDTO mainText;
    private final TextDTO title;

    public FinanceWidgetCardDTO(@NotNull TextDTO mainText, TextDTO textDTO, IconDTO iconDTO, ImageDTO imageDTO, ButtonV3DTO buttonV3DTO, @NotNull String backgroundColor, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(common, "common");
        this.mainText = mainText;
        this.title = textDTO;
        this.chevronIcon = iconDTO;
        this.image = imageDTO;
        this.actionButton = buttonV3DTO;
        this.backgroundColor = backgroundColor;
        this.common = common;
    }

    public static /* synthetic */ FinanceWidgetCardDTO copy$default(FinanceWidgetCardDTO financeWidgetCardDTO, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, ImageDTO imageDTO, ButtonV3DTO buttonV3DTO, String str, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = financeWidgetCardDTO.mainText;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = financeWidgetCardDTO.title;
        }
        if ((i11 & 4) != 0) {
            iconDTO = financeWidgetCardDTO.chevronIcon;
        }
        if ((i11 & 8) != 0) {
            imageDTO = financeWidgetCardDTO.image;
        }
        if ((i11 & 16) != 0) {
            buttonV3DTO = financeWidgetCardDTO.actionButton;
        }
        if ((i11 & 32) != 0) {
            str = financeWidgetCardDTO.backgroundColor;
        }
        if ((i11 & 64) != 0) {
            commonControlSettings = financeWidgetCardDTO.common;
        }
        String str2 = str;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        IconDTO iconDTO2 = iconDTO;
        return financeWidgetCardDTO.copy(textDTO, textDTO2, iconDTO2, imageDTO, buttonV3DTO2, str2, commonControlSettings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getMainText() {
        return this.mainText;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final IconDTO getChevronIcon() {
        return this.chevronIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getActionButton() {
        return this.actionButton;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final FinanceWidgetCardDTO copy(@NotNull TextDTO mainText, TextDTO title, IconDTO chevronIcon, ImageDTO image, ButtonV3DTO actionButton, @NotNull String backgroundColor, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(common, "common");
        return new FinanceWidgetCardDTO(mainText, title, chevronIcon, image, actionButton, backgroundColor, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinanceWidgetCardDTO)) {
            return false;
        }
        FinanceWidgetCardDTO financeWidgetCardDTO = (FinanceWidgetCardDTO) other;
        return Intrinsics.d(this.mainText, financeWidgetCardDTO.mainText) && Intrinsics.d(this.title, financeWidgetCardDTO.title) && Intrinsics.d(this.chevronIcon, financeWidgetCardDTO.chevronIcon) && Intrinsics.d(this.image, financeWidgetCardDTO.image) && Intrinsics.d(this.actionButton, financeWidgetCardDTO.actionButton) && Intrinsics.d(this.backgroundColor, financeWidgetCardDTO.backgroundColor) && Intrinsics.d(this.common, financeWidgetCardDTO.common);
    }

    public final ButtonV3DTO getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final IconDTO getChevronIcon() {
        return this.chevronIcon;
    }

    @NotNull
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final TextDTO getMainText() {
        return this.mainText;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.mainText.hashCode() * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        IconDTO iconDTO = this.chevronIcon;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        ImageDTO imageDTO = this.image;
        int hashCode4 = (hashCode3 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.actionButton;
        return this.common.hashCode() + g.a((hashCode4 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0)) * 31, 31, this.backgroundColor);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.mainText;
        TextDTO textDTO2 = this.title;
        IconDTO iconDTO = this.chevronIcon;
        ImageDTO imageDTO = this.image;
        ButtonV3DTO buttonV3DTO = this.actionButton;
        String str = this.backgroundColor;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder g10 = D3.g.g("FinanceWidgetCardDTO(mainText=", textDTO, ", title=", textDTO2, ", chevronIcon=");
        g10.append(iconDTO);
        g10.append(", image=");
        g10.append(imageDTO);
        g10.append(", actionButton=");
        g10.append(buttonV3DTO);
        g10.append(", backgroundColor=");
        g10.append(str);
        g10.append(", common=");
        return b.g(g10, commonControlSettings, ")");
    }
}
