package ru.ozon.app.android.checkoutcomposer.addressPartsInput.data;

import B90.C2619v;
import HY.a;
import T7.P;
import Tl.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/PostIndexChangerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "inputField", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/InputFieldData;", "submitButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/InputFieldData;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getInputField", "()Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/InputFieldData;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PostIndexChangerDTO {
    public static final int $stable = 8;

    @NotNull
    private final InputFieldData inputField;

    @NotNull
    private final ButtonV3Atom.LargeButton submitButton;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public PostIndexChangerDTO(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull InputFieldData inputField, @NotNull ButtonV3Atom.LargeButton submitButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.title = title;
        this.subtitle = subtitle;
        this.inputField = inputField;
        this.submitButton = submitButton;
        this.trackingInfo = map;
    }

    public static /* synthetic */ PostIndexChangerDTO copy$default(PostIndexChangerDTO postIndexChangerDTO, TextAtom textAtom, TextAtom textAtom2, InputFieldData inputFieldData, ButtonV3Atom.LargeButton largeButton, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = postIndexChangerDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = postIndexChangerDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            inputFieldData = postIndexChangerDTO.inputField;
        }
        if ((i11 & 8) != 0) {
            largeButton = postIndexChangerDTO.submitButton;
        }
        if ((i11 & 16) != 0) {
            map = postIndexChangerDTO.trackingInfo;
        }
        Map map2 = map;
        InputFieldData inputFieldData2 = inputFieldData;
        return postIndexChangerDTO.copy(textAtom, textAtom2, inputFieldData2, largeButton, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InputFieldData getInputField() {
        return this.inputField;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final PostIndexChangerDTO copy(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull InputFieldData inputField, @NotNull ButtonV3Atom.LargeButton submitButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new PostIndexChangerDTO(title, subtitle, inputField, submitButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostIndexChangerDTO)) {
            return false;
        }
        PostIndexChangerDTO postIndexChangerDTO = (PostIndexChangerDTO) other;
        return Intrinsics.d(this.title, postIndexChangerDTO.title) && Intrinsics.d(this.subtitle, postIndexChangerDTO.subtitle) && Intrinsics.d(this.inputField, postIndexChangerDTO.inputField) && Intrinsics.d(this.submitButton, postIndexChangerDTO.submitButton) && Intrinsics.d(this.trackingInfo, postIndexChangerDTO.trackingInfo);
    }

    @NotNull
    public final InputFieldData getInputField() {
        return this.inputField;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.submitButton, (this.inputField.hashCode() + C2619v.b(this.title.hashCode() * 31, 31, this.subtitle)) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        InputFieldData inputFieldData = this.inputField;
        ButtonV3Atom.LargeButton largeButton = this.submitButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = a.a("PostIndexChangerDTO(title=", textAtom, ", subtitle=", textAtom2, ", inputField=");
        a11.append(inputFieldData);
        a11.append(", submitButton=");
        a11.append(largeButton);
        a11.append(", trackingInfo=");
        return P.f(a11, map, ")");
    }
}
