package ru.ozon.app.android.travel.molecules.dto.imageBanner;

import B3.p;
import Bl.b;
import G.g;
import Ih.a;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/imageBanner/ImageBannerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "darkImageUrl", "", "lightImageUrl", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "bgColor", "clickTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDarkImageUrl", "()Ljava/lang/String;", "getLightImageUrl", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBgColor", "getClickTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ImageBannerDTO {

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final String bgColor;
    private final Map<String, TokenizedTrackingInfo> clickTrackingInfo;

    @NotNull
    private final String darkImageUrl;

    @NotNull
    private final String lightImageUrl;

    @NotNull
    private final TextAtom title;

    public ImageBannerDTO(@NotNull TextAtom title, @NotNull String darkImageUrl, @NotNull String lightImageUrl, @NotNull AtomActionDTO action, @NotNull String bgColor, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(darkImageUrl, "darkImageUrl");
        Intrinsics.checkNotNullParameter(lightImageUrl, "lightImageUrl");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        this.title = title;
        this.darkImageUrl = darkImageUrl;
        this.lightImageUrl = lightImageUrl;
        this.action = action;
        this.bgColor = bgColor;
        this.clickTrackingInfo = map;
    }

    public static /* synthetic */ ImageBannerDTO copy$default(ImageBannerDTO imageBannerDTO, TextAtom textAtom, String str, String str2, AtomActionDTO atomActionDTO, String str3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = imageBannerDTO.title;
        }
        if ((i11 & 2) != 0) {
            str = imageBannerDTO.darkImageUrl;
        }
        if ((i11 & 4) != 0) {
            str2 = imageBannerDTO.lightImageUrl;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = imageBannerDTO.action;
        }
        if ((i11 & 16) != 0) {
            str3 = imageBannerDTO.bgColor;
        }
        if ((i11 & 32) != 0) {
            map = imageBannerDTO.clickTrackingInfo;
        }
        String str4 = str3;
        Map map2 = map;
        return imageBannerDTO.copy(textAtom, str, str2, atomActionDTO, str4, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLightImageUrl() {
        return this.lightImageUrl;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.clickTrackingInfo;
    }

    @NotNull
    public final ImageBannerDTO copy(@NotNull TextAtom title, @NotNull String darkImageUrl, @NotNull String lightImageUrl, @NotNull AtomActionDTO action, @NotNull String bgColor, Map<String, TokenizedTrackingInfo> clickTrackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(darkImageUrl, "darkImageUrl");
        Intrinsics.checkNotNullParameter(lightImageUrl, "lightImageUrl");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        return new ImageBannerDTO(title, darkImageUrl, lightImageUrl, action, bgColor, clickTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageBannerDTO)) {
            return false;
        }
        ImageBannerDTO imageBannerDTO = (ImageBannerDTO) other;
        return Intrinsics.d(this.title, imageBannerDTO.title) && Intrinsics.d(this.darkImageUrl, imageBannerDTO.darkImageUrl) && Intrinsics.d(this.lightImageUrl, imageBannerDTO.lightImageUrl) && Intrinsics.d(this.action, imageBannerDTO.action) && Intrinsics.d(this.bgColor, imageBannerDTO.bgColor) && Intrinsics.d(this.clickTrackingInfo, imageBannerDTO.clickTrackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getBgColor() {
        return this.bgColor;
    }

    public final Map<String, TokenizedTrackingInfo> getClickTrackingInfo() {
        return this.clickTrackingInfo;
    }

    @NotNull
    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    @NotNull
    public final String getLightImageUrl() {
        return this.lightImageUrl;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = g.a(a.b(this.action, g.a(g.a(this.title.hashCode() * 31, 31, this.darkImageUrl), 31, this.lightImageUrl), 31), 31, this.bgColor);
        Map<String, TokenizedTrackingInfo> map = this.clickTrackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        String str = this.darkImageUrl;
        String str2 = this.lightImageUrl;
        AtomActionDTO atomActionDTO = this.action;
        String str3 = this.bgColor;
        Map<String, TokenizedTrackingInfo> map = this.clickTrackingInfo;
        StringBuilder d11 = b.d("ImageBannerDTO(title=", ", darkImageUrl=", str, ", lightImageUrl=", textAtom);
        p.c(str2, ", action=", ", bgColor=", d11, atomActionDTO);
        return C4070a.a(d11, str3, ", clickTrackingInfo=", map, ")");
    }
}
