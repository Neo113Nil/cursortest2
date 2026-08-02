package ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.data;

import B90.C2618u;
import B90.C2619v;
import G.g;
import HY.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Ja\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/data/VideoConsultationBannerDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "body", "productImage", "", "mainActionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "secondaryActionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", CommentV3DTO.FOOTER_FIELD_NAME, "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/Map;)V", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBody", "getProductImage", "()Ljava/lang/String;", "getMainActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getSecondaryActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getFooter", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class VideoConsultationBannerDTO {

    @NotNull
    private final TextAtom body;
    private final TextAtom footer;

    @NotNull
    private final TextAtom header;

    @NotNull
    private final ButtonV3Atom.SmallButton mainActionButton;

    @NotNull
    private final String productImage;
    private final ButtonV3Atom.SmallBorderlessButton secondaryActionButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public VideoConsultationBannerDTO(@NotNull TextAtom header, @NotNull TextAtom body, @NotNull String productImage, @NotNull ButtonV3Atom.SmallButton mainActionButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, TextAtom textAtom, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(productImage, "productImage");
        Intrinsics.checkNotNullParameter(mainActionButton, "mainActionButton");
        this.header = header;
        this.body = body;
        this.productImage = productImage;
        this.mainActionButton = mainActionButton;
        this.secondaryActionButton = smallBorderlessButton;
        this.footer = textAtom;
        this.trackingInfo = map;
    }

    public static /* synthetic */ VideoConsultationBannerDTO copy$default(VideoConsultationBannerDTO videoConsultationBannerDTO, TextAtom textAtom, TextAtom textAtom2, String str, ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, TextAtom textAtom3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = videoConsultationBannerDTO.header;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = videoConsultationBannerDTO.body;
        }
        if ((i11 & 4) != 0) {
            str = videoConsultationBannerDTO.productImage;
        }
        if ((i11 & 8) != 0) {
            smallButton = videoConsultationBannerDTO.mainActionButton;
        }
        if ((i11 & 16) != 0) {
            smallBorderlessButton = videoConsultationBannerDTO.secondaryActionButton;
        }
        if ((i11 & 32) != 0) {
            textAtom3 = videoConsultationBannerDTO.footer;
        }
        if ((i11 & 64) != 0) {
            map = videoConsultationBannerDTO.trackingInfo;
        }
        TextAtom textAtom4 = textAtom3;
        Map map2 = map;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2 = smallBorderlessButton;
        String str2 = str;
        return videoConsultationBannerDTO.copy(textAtom, textAtom2, str2, smallButton, smallBorderlessButton2, textAtom4, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getBody() {
        return this.body;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getProductImage() {
        return this.productImage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallButton getMainActionButton() {
        return this.mainActionButton;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButton getSecondaryActionButton() {
        return this.secondaryActionButton;
    }

    /* renamed from: component6, reason: from getter */
    public final TextAtom getFooter() {
        return this.footer;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final VideoConsultationBannerDTO copy(@NotNull TextAtom header, @NotNull TextAtom body, @NotNull String productImage, @NotNull ButtonV3Atom.SmallButton mainActionButton, ButtonV3Atom.SmallBorderlessButton secondaryActionButton, TextAtom footer, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(productImage, "productImage");
        Intrinsics.checkNotNullParameter(mainActionButton, "mainActionButton");
        return new VideoConsultationBannerDTO(header, body, productImage, mainActionButton, secondaryActionButton, footer, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoConsultationBannerDTO)) {
            return false;
        }
        VideoConsultationBannerDTO videoConsultationBannerDTO = (VideoConsultationBannerDTO) other;
        return Intrinsics.d(this.header, videoConsultationBannerDTO.header) && Intrinsics.d(this.body, videoConsultationBannerDTO.body) && Intrinsics.d(this.productImage, videoConsultationBannerDTO.productImage) && Intrinsics.d(this.mainActionButton, videoConsultationBannerDTO.mainActionButton) && Intrinsics.d(this.secondaryActionButton, videoConsultationBannerDTO.secondaryActionButton) && Intrinsics.d(this.footer, videoConsultationBannerDTO.footer) && Intrinsics.d(this.trackingInfo, videoConsultationBannerDTO.trackingInfo);
    }

    @NotNull
    public final TextAtom getBody() {
        return this.body;
    }

    public final TextAtom getFooter() {
        return this.footer;
    }

    @NotNull
    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getMainActionButton() {
        return this.mainActionButton;
    }

    @NotNull
    public final String getProductImage() {
        return this.productImage;
    }

    public final ButtonV3Atom.SmallBorderlessButton getSecondaryActionButton() {
        return this.secondaryActionButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2618u.c(this.mainActionButton, g.a(C2619v.b(this.header.hashCode() * 31, 31, this.body), 31, this.productImage), 31);
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.secondaryActionButton;
        int hashCode = (c11 + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode())) * 31;
        TextAtom textAtom = this.footer;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.header;
        TextAtom textAtom2 = this.body;
        String str = this.productImage;
        ButtonV3Atom.SmallButton smallButton = this.mainActionButton;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.secondaryActionButton;
        TextAtom textAtom3 = this.footer;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = a.a("VideoConsultationBannerDTO(header=", textAtom, ", body=", textAtom2, ", productImage=");
        a11.append(str);
        a11.append(", mainActionButton=");
        a11.append(smallButton);
        a11.append(", secondaryActionButton=");
        a11.append(smallBorderlessButton);
        a11.append(", footer=");
        a11.append(textAtom3);
        a11.append(", trackingInfo=");
        return P.f(a11, map, ")");
    }
}
