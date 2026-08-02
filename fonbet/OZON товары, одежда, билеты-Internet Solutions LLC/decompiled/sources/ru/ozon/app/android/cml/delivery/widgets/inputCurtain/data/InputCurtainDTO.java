package ru.ozon.app.android.cml.delivery.widgets.inputCurtain.data;

import De.C2859b;
import G.g;
import K1.G;
import Nh.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Ji\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/data/InputCurtainDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "", "input", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;", "saveButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "backgroundColor", "", "tab", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Ljava/util/List;", "getInput", "()Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;", "getSaveButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBackgroundColor", "()Ljava/lang/String;", "getTab", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InputCurtainDTO {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final InputMoleculeDTO input;

    @NotNull
    private final ButtonV3DTO saveButton;
    private final List<TextDTO> subtitle;
    private final String tab;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public InputCurtainDTO(TextDTO textDTO, List<TextDTO> list, @NotNull InputMoleculeDTO input, @NotNull ButtonV3DTO saveButton, @NotNull String backgroundColor, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.title = textDTO;
        this.subtitle = list;
        this.input = input;
        this.saveButton = saveButton;
        this.backgroundColor = backgroundColor;
        this.tab = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ InputCurtainDTO copy$default(InputCurtainDTO inputCurtainDTO, TextDTO textDTO, List list, InputMoleculeDTO inputMoleculeDTO, ButtonV3DTO buttonV3DTO, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = inputCurtainDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = inputCurtainDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            inputMoleculeDTO = inputCurtainDTO.input;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = inputCurtainDTO.saveButton;
        }
        if ((i11 & 16) != 0) {
            str = inputCurtainDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            str2 = inputCurtainDTO.tab;
        }
        if ((i11 & 64) != 0) {
            map = inputCurtainDTO.trackingInfo;
        }
        String str3 = str2;
        Map map2 = map;
        String str4 = str;
        InputMoleculeDTO inputMoleculeDTO2 = inputMoleculeDTO;
        return inputCurtainDTO.copy(textDTO, list, inputMoleculeDTO2, buttonV3DTO, str4, str3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    public final List<TextDTO> component2() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InputMoleculeDTO getInput() {
        return this.input;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getSaveButton() {
        return this.saveButton;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTab() {
        return this.tab;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final InputCurtainDTO copy(TextDTO title, List<TextDTO> subtitle, @NotNull InputMoleculeDTO input, @NotNull ButtonV3DTO saveButton, @NotNull String backgroundColor, String tab, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new InputCurtainDTO(title, subtitle, input, saveButton, backgroundColor, tab, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCurtainDTO)) {
            return false;
        }
        InputCurtainDTO inputCurtainDTO = (InputCurtainDTO) other;
        return Intrinsics.d(this.title, inputCurtainDTO.title) && Intrinsics.d(this.subtitle, inputCurtainDTO.subtitle) && Intrinsics.d(this.input, inputCurtainDTO.input) && Intrinsics.d(this.saveButton, inputCurtainDTO.saveButton) && Intrinsics.d(this.backgroundColor, inputCurtainDTO.backgroundColor) && Intrinsics.d(this.tab, inputCurtainDTO.tab) && Intrinsics.d(this.trackingInfo, inputCurtainDTO.trackingInfo);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final InputMoleculeDTO getInput() {
        return this.input;
    }

    @NotNull
    public final ButtonV3DTO getSaveButton() {
        return this.saveButton;
    }

    public final List<TextDTO> getSubtitle() {
        return this.subtitle;
    }

    public final String getTab() {
        return this.tab;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        List<TextDTO> list = this.subtitle;
        int a11 = g.a(C2859b.c(this.saveButton, (this.input.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31), 31, this.backgroundColor);
        String str = this.tab;
        int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<TextDTO> list = this.subtitle;
        InputMoleculeDTO inputMoleculeDTO = this.input;
        ButtonV3DTO buttonV3DTO = this.saveButton;
        String str = this.backgroundColor;
        String str2 = this.tab;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder e11 = G.e("InputCurtainDTO(title=", textDTO, ", subtitle=", list, ", input=");
        e11.append(inputMoleculeDTO);
        e11.append(", saveButton=");
        e11.append(buttonV3DTO);
        e11.append(", backgroundColor=");
        a.h(e11, str, ", tab=", str2, ", trackingInfo=");
        return P.f(e11, map, ")");
    }
}
