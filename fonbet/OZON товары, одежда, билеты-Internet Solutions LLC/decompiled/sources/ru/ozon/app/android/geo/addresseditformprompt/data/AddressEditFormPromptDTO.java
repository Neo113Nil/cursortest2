package ru.ozon.app.android.geo.addresseditformprompt.data;

import Fj.c;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.geo.options.data.Options;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/data/AddressEditFormPromptDTO;", "", "elements", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "buttonsApp", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "openSearchOptions", "Lru/ozon/app/android/geo/options/data/Options;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/geo/options/data/Options;Ljava/util/Map;)V", "getElements", "()Ljava/util/List;", "getButtonsApp", "getOpenSearchOptions", "()Lru/ozon/app/android/geo/options/data/Options;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditFormPromptDTO {
    private final List<ButtonV3Atom.LargeButton> buttonsApp;

    @NotNull
    private final List<TextAtom> elements;
    private final Options openSearchOptions;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public AddressEditFormPromptDTO(@NotNull List<TextAtom> elements, List<ButtonV3Atom.LargeButton> list, Options options, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.elements = elements;
        this.buttonsApp = list;
        this.openSearchOptions = options;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressEditFormPromptDTO copy$default(AddressEditFormPromptDTO addressEditFormPromptDTO, List list, List list2, Options options, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = addressEditFormPromptDTO.elements;
        }
        if ((i11 & 2) != 0) {
            list2 = addressEditFormPromptDTO.buttonsApp;
        }
        if ((i11 & 4) != 0) {
            options = addressEditFormPromptDTO.openSearchOptions;
        }
        if ((i11 & 8) != 0) {
            map = addressEditFormPromptDTO.trackingInfo;
        }
        return addressEditFormPromptDTO.copy(list, list2, options, map);
    }

    @NotNull
    public final List<TextAtom> component1() {
        return this.elements;
    }

    public final List<ButtonV3Atom.LargeButton> component2() {
        return this.buttonsApp;
    }

    /* renamed from: component3, reason: from getter */
    public final Options getOpenSearchOptions() {
        return this.openSearchOptions;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final AddressEditFormPromptDTO copy(@NotNull List<TextAtom> elements, List<ButtonV3Atom.LargeButton> buttonsApp, Options openSearchOptions, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new AddressEditFormPromptDTO(elements, buttonsApp, openSearchOptions, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditFormPromptDTO)) {
            return false;
        }
        AddressEditFormPromptDTO addressEditFormPromptDTO = (AddressEditFormPromptDTO) other;
        return Intrinsics.d(this.elements, addressEditFormPromptDTO.elements) && Intrinsics.d(this.buttonsApp, addressEditFormPromptDTO.buttonsApp) && Intrinsics.d(this.openSearchOptions, addressEditFormPromptDTO.openSearchOptions) && Intrinsics.d(this.trackingInfo, addressEditFormPromptDTO.trackingInfo);
    }

    public final List<ButtonV3Atom.LargeButton> getButtonsApp() {
        return this.buttonsApp;
    }

    @NotNull
    public final List<TextAtom> getElements() {
        return this.elements;
    }

    public final Options getOpenSearchOptions() {
        return this.openSearchOptions;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.elements.hashCode() * 31;
        List<ButtonV3Atom.LargeButton> list = this.buttonsApp;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Options options = this.openSearchOptions;
        int hashCode3 = (hashCode2 + (options == null ? 0 : options.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TextAtom> list = this.elements;
        List<ButtonV3Atom.LargeButton> list2 = this.buttonsApp;
        Options options = this.openSearchOptions;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = c.d("AddressEditFormPromptDTO(elements=", list, ", buttonsApp=", ", openSearchOptions=", list2);
        d11.append(options);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}
