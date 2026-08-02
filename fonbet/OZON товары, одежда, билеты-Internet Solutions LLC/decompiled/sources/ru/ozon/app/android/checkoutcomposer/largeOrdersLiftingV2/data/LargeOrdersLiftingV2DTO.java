package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.data;

import B90.C2616s;
import De.C2859b;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003Jg\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/LargeOrdersLiftingV2DTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "input", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/InputDTO;", "optionsBlock", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/OptionsBlockDTO;", "confirmButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "cancelButton", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/InputDTO;Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/OptionsBlockDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getInput", "()Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/InputDTO;", "getOptionsBlock", "()Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/OptionsBlockDTO;", "getConfirmButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getCancelButton", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LargeOrdersLiftingV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO cancelButton;

    @NotNull
    private final ButtonV3DTO confirmButton;

    @NotNull
    private final ImageDTO image;

    @NotNull
    private final InputDTO input;

    @NotNull
    private final OptionsBlockDTO optionsBlock;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public LargeOrdersLiftingV2DTO(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull InputDTO input, @NotNull OptionsBlockDTO optionsBlock, @NotNull ButtonV3DTO confirmButton, @NotNull ButtonV3DTO cancelButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(optionsBlock, "optionsBlock");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.input = input;
        this.optionsBlock = optionsBlock;
        this.confirmButton = confirmButton;
        this.cancelButton = cancelButton;
        this.trackingInfo = map;
    }

    public static /* synthetic */ LargeOrdersLiftingV2DTO copy$default(LargeOrdersLiftingV2DTO largeOrdersLiftingV2DTO, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, InputDTO inputDTO, OptionsBlockDTO optionsBlockDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = largeOrdersLiftingV2DTO.image;
        }
        if ((i11 & 2) != 0) {
            textDTO = largeOrdersLiftingV2DTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = largeOrdersLiftingV2DTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            inputDTO = largeOrdersLiftingV2DTO.input;
        }
        if ((i11 & 16) != 0) {
            optionsBlockDTO = largeOrdersLiftingV2DTO.optionsBlock;
        }
        if ((i11 & 32) != 0) {
            buttonV3DTO = largeOrdersLiftingV2DTO.confirmButton;
        }
        if ((i11 & 64) != 0) {
            buttonV3DTO2 = largeOrdersLiftingV2DTO.cancelButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = largeOrdersLiftingV2DTO.trackingInfo;
        }
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO2;
        Map map2 = map;
        OptionsBlockDTO optionsBlockDTO2 = optionsBlockDTO;
        ButtonV3DTO buttonV3DTO4 = buttonV3DTO;
        return largeOrdersLiftingV2DTO.copy(imageDTO, textDTO, textDTO2, inputDTO, optionsBlockDTO2, buttonV3DTO4, buttonV3DTO3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final InputDTO getInput() {
        return this.input;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final OptionsBlockDTO getOptionsBlock() {
        return this.optionsBlock;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ButtonV3DTO getConfirmButton() {
        return this.confirmButton;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final ButtonV3DTO getCancelButton() {
        return this.cancelButton;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final LargeOrdersLiftingV2DTO copy(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull InputDTO input, @NotNull OptionsBlockDTO optionsBlock, @NotNull ButtonV3DTO confirmButton, @NotNull ButtonV3DTO cancelButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(optionsBlock, "optionsBlock");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        return new LargeOrdersLiftingV2DTO(image, title, subtitle, input, optionsBlock, confirmButton, cancelButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LargeOrdersLiftingV2DTO)) {
            return false;
        }
        LargeOrdersLiftingV2DTO largeOrdersLiftingV2DTO = (LargeOrdersLiftingV2DTO) other;
        return Intrinsics.d(this.image, largeOrdersLiftingV2DTO.image) && Intrinsics.d(this.title, largeOrdersLiftingV2DTO.title) && Intrinsics.d(this.subtitle, largeOrdersLiftingV2DTO.subtitle) && Intrinsics.d(this.input, largeOrdersLiftingV2DTO.input) && Intrinsics.d(this.optionsBlock, largeOrdersLiftingV2DTO.optionsBlock) && Intrinsics.d(this.confirmButton, largeOrdersLiftingV2DTO.confirmButton) && Intrinsics.d(this.cancelButton, largeOrdersLiftingV2DTO.cancelButton) && Intrinsics.d(this.trackingInfo, largeOrdersLiftingV2DTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3DTO getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final ButtonV3DTO getConfirmButton() {
        return this.confirmButton;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final InputDTO getInput() {
        return this.input;
    }

    @NotNull
    public final OptionsBlockDTO getOptionsBlock() {
        return this.optionsBlock;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.cancelButton, C2859b.c(this.confirmButton, (this.optionsBlock.hashCode() + ((this.input.hashCode() + b.a(this.subtitle, b.a(this.title, this.image.hashCode() * 31, 31), 31)) * 31)) * 31, 31), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return c11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        InputDTO inputDTO = this.input;
        OptionsBlockDTO optionsBlockDTO = this.optionsBlock;
        ButtonV3DTO buttonV3DTO = this.confirmButton;
        ButtonV3DTO buttonV3DTO2 = this.cancelButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C2616s.d("LargeOrdersLiftingV2DTO(image=", imageDTO, ", title=", textDTO, ", subtitle=");
        d11.append(textDTO2);
        d11.append(", input=");
        d11.append(inputDTO);
        d11.append(", optionsBlock=");
        d11.append(optionsBlockDTO);
        d11.append(", confirmButton=");
        d11.append(buttonV3DTO);
        d11.append(", cancelButton=");
        d11.append(buttonV3DTO2);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}
