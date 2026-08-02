package ru.ozon.app.android.pdp.widgets.textDescription.data;

import Bl.b;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JV\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b'\u0010\u0011R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0016¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/textDescription/data/TextDescriptionDTO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "", "backgroundColor", "Lru/ozon/app/android/pdp/widgets/textDescription/data/ShortHeightButton;", "shortHeightButton", "tabGroupId", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/textDescription/data/ShortHeightButton;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component2", "()Ljava/lang/String;", "component3", "()Lru/ozon/app/android/pdp/widgets/textDescription/data/ShortHeightButton;", "component4", "component5", "()Ljava/util/Map;", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/textDescription/data/ShortHeightButton;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/pdp/widgets/textDescription/data/TextDescriptionDTO;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/pdp/widgets/textDescription/data/ShortHeightButton;", "getShortHeightButton", "getTabGroupId", "Ljava/util/Map;", "getTrackingInfo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TextDescriptionDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final ShortHeightButton shortHeightButton;
    private final String tabGroupId;

    @NotNull
    private final TextAtom text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TextDescriptionDTO(@NotNull TextAtom text, String str, ShortHeightButton shortHeightButton, String str2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.backgroundColor = str;
        this.shortHeightButton = shortHeightButton;
        this.tabGroupId = str2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ TextDescriptionDTO copy$default(TextDescriptionDTO textDescriptionDTO, TextAtom textAtom, String str, ShortHeightButton shortHeightButton, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = textDescriptionDTO.text;
        }
        if ((i11 & 2) != 0) {
            str = textDescriptionDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            shortHeightButton = textDescriptionDTO.shortHeightButton;
        }
        if ((i11 & 8) != 0) {
            str2 = textDescriptionDTO.tabGroupId;
        }
        if ((i11 & 16) != 0) {
            map = textDescriptionDTO.trackingInfo;
        }
        Map map2 = map;
        ShortHeightButton shortHeightButton2 = shortHeightButton;
        return textDescriptionDTO.copy(textAtom, str, shortHeightButton2, str2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final ShortHeightButton getShortHeightButton() {
        return this.shortHeightButton;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final TextDescriptionDTO copy(@NotNull TextAtom text, String backgroundColor, ShortHeightButton shortHeightButton, String tabGroupId, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextDescriptionDTO(text, backgroundColor, shortHeightButton, tabGroupId, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextDescriptionDTO)) {
            return false;
        }
        TextDescriptionDTO textDescriptionDTO = (TextDescriptionDTO) other;
        return Intrinsics.d(this.text, textDescriptionDTO.text) && Intrinsics.d(this.backgroundColor, textDescriptionDTO.backgroundColor) && Intrinsics.d(this.shortHeightButton, textDescriptionDTO.shortHeightButton) && Intrinsics.d(this.tabGroupId, textDescriptionDTO.tabGroupId) && Intrinsics.d(this.trackingInfo, textDescriptionDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ShortHeightButton getShortHeightButton() {
        return this.shortHeightButton;
    }

    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ShortHeightButton shortHeightButton = this.shortHeightButton;
        int hashCode3 = (hashCode2 + (shortHeightButton == null ? 0 : shortHeightButton.hashCode())) * 31;
        String str2 = this.tabGroupId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.text;
        String str = this.backgroundColor;
        ShortHeightButton shortHeightButton = this.shortHeightButton;
        String str2 = this.tabGroupId;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = b.d("TextDescriptionDTO(text=", ", backgroundColor=", str, ", shortHeightButton=", textAtom);
        d11.append(shortHeightButton);
        d11.append(", tabGroupId=");
        d11.append(str2);
        d11.append(", trackingInfo=");
        return P.f(d11, map, ")");
    }
}
