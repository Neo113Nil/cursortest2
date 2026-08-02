package ru.ozon.app.android.travel.feature.general.main.widgets.referralMilesBanner.data;

import D40.d;
import De.C2859b;
import F3.G;
import G.g;
import Nh.a;
import Ns.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.progress.ProgressBar;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010;\u001a\u00020\u0014HÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J±\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006D"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/data/ReferralMilesBannerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundToken", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "bannerTitle", "userTitle", "userSubtitle", "referralTitle", "referralSubtitle", "progressBar", "Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "progressBackgroundColor", "expectedMilesTitle", "expectedMilesIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "shareButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/atoms/data/progress/ProgressBar;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundToken", "()Ljava/lang/String;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBannerTitle", "getUserTitle", "getUserSubtitle", "getReferralTitle", "getReferralSubtitle", "getProgressBar", "()Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "getProgressBackgroundColor", "getExpectedMilesTitle", "getExpectedMilesIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getShareButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "", "toString", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReferralMilesBannerDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundToken;

    @NotNull
    private final TextDTO bannerTitle;
    private final IconDTO expectedMilesIcon;
    private final TextDTO expectedMilesTitle;

    @NotNull
    private final ImageDTO image;
    private final String progressBackgroundColor;
    private final ProgressBar progressBar;
    private final TextDTO referralSubtitle;

    @NotNull
    private final TextDTO referralTitle;

    @NotNull
    private final ButtonV3DTO shareButton;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final TextDTO userSubtitle;

    @NotNull
    private final TextDTO userTitle;

    public ReferralMilesBannerDTO(TextDTO textDTO, @NotNull String backgroundToken, @NotNull ImageDTO image, @NotNull TextDTO bannerTitle, @NotNull TextDTO userTitle, TextDTO textDTO2, @NotNull TextDTO referralTitle, TextDTO textDTO3, ProgressBar progressBar, String str, TextDTO textDTO4, IconDTO iconDTO, @NotNull ButtonV3DTO shareButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(backgroundToken, "backgroundToken");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(bannerTitle, "bannerTitle");
        Intrinsics.checkNotNullParameter(userTitle, "userTitle");
        Intrinsics.checkNotNullParameter(referralTitle, "referralTitle");
        Intrinsics.checkNotNullParameter(shareButton, "shareButton");
        this.title = textDTO;
        this.backgroundToken = backgroundToken;
        this.image = image;
        this.bannerTitle = bannerTitle;
        this.userTitle = userTitle;
        this.userSubtitle = textDTO2;
        this.referralTitle = referralTitle;
        this.referralSubtitle = textDTO3;
        this.progressBar = progressBar;
        this.progressBackgroundColor = str;
        this.expectedMilesTitle = textDTO4;
        this.expectedMilesIcon = iconDTO;
        this.shareButton = shareButton;
        this.trackingInfo = map;
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getProgressBackgroundColor() {
        return this.progressBackgroundColor;
    }

    /* renamed from: component11, reason: from getter */
    public final TextDTO getExpectedMilesTitle() {
        return this.expectedMilesTitle;
    }

    /* renamed from: component12, reason: from getter */
    public final IconDTO getExpectedMilesIcon() {
        return this.expectedMilesIcon;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final ButtonV3DTO getShareButton() {
        return this.shareButton;
    }

    public final Map<String, TokenizedTrackingInfo> component14() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundToken() {
        return this.backgroundToken;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getBannerTitle() {
        return this.bannerTitle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextDTO getUserTitle() {
        return this.userTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final TextDTO getUserSubtitle() {
        return this.userSubtitle;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TextDTO getReferralTitle() {
        return this.referralTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final TextDTO getReferralSubtitle() {
        return this.referralSubtitle;
    }

    /* renamed from: component9, reason: from getter */
    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    @NotNull
    public final ReferralMilesBannerDTO copy(TextDTO title, @NotNull String backgroundToken, @NotNull ImageDTO image, @NotNull TextDTO bannerTitle, @NotNull TextDTO userTitle, TextDTO userSubtitle, @NotNull TextDTO referralTitle, TextDTO referralSubtitle, ProgressBar progressBar, String progressBackgroundColor, TextDTO expectedMilesTitle, IconDTO expectedMilesIcon, @NotNull ButtonV3DTO shareButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(backgroundToken, "backgroundToken");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(bannerTitle, "bannerTitle");
        Intrinsics.checkNotNullParameter(userTitle, "userTitle");
        Intrinsics.checkNotNullParameter(referralTitle, "referralTitle");
        Intrinsics.checkNotNullParameter(shareButton, "shareButton");
        return new ReferralMilesBannerDTO(title, backgroundToken, image, bannerTitle, userTitle, userSubtitle, referralTitle, referralSubtitle, progressBar, progressBackgroundColor, expectedMilesTitle, expectedMilesIcon, shareButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralMilesBannerDTO)) {
            return false;
        }
        ReferralMilesBannerDTO referralMilesBannerDTO = (ReferralMilesBannerDTO) other;
        return Intrinsics.d(this.title, referralMilesBannerDTO.title) && Intrinsics.d(this.backgroundToken, referralMilesBannerDTO.backgroundToken) && Intrinsics.d(this.image, referralMilesBannerDTO.image) && Intrinsics.d(this.bannerTitle, referralMilesBannerDTO.bannerTitle) && Intrinsics.d(this.userTitle, referralMilesBannerDTO.userTitle) && Intrinsics.d(this.userSubtitle, referralMilesBannerDTO.userSubtitle) && Intrinsics.d(this.referralTitle, referralMilesBannerDTO.referralTitle) && Intrinsics.d(this.referralSubtitle, referralMilesBannerDTO.referralSubtitle) && Intrinsics.d(this.progressBar, referralMilesBannerDTO.progressBar) && Intrinsics.d(this.progressBackgroundColor, referralMilesBannerDTO.progressBackgroundColor) && Intrinsics.d(this.expectedMilesTitle, referralMilesBannerDTO.expectedMilesTitle) && Intrinsics.d(this.expectedMilesIcon, referralMilesBannerDTO.expectedMilesIcon) && Intrinsics.d(this.shareButton, referralMilesBannerDTO.shareButton) && Intrinsics.d(this.trackingInfo, referralMilesBannerDTO.trackingInfo);
    }

    @NotNull
    public final String getBackgroundToken() {
        return this.backgroundToken;
    }

    @NotNull
    public final TextDTO getBannerTitle() {
        return this.bannerTitle;
    }

    public final IconDTO getExpectedMilesIcon() {
        return this.expectedMilesIcon;
    }

    public final TextDTO getExpectedMilesTitle() {
        return this.expectedMilesTitle;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final String getProgressBackgroundColor() {
        return this.progressBackgroundColor;
    }

    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    public final TextDTO getReferralSubtitle() {
        return this.referralSubtitle;
    }

    @NotNull
    public final TextDTO getReferralTitle() {
        return this.referralTitle;
    }

    @NotNull
    public final ButtonV3DTO getShareButton() {
        return this.shareButton;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final TextDTO getUserSubtitle() {
        return this.userSubtitle;
    }

    @NotNull
    public final TextDTO getUserTitle() {
        return this.userTitle;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int a11 = b.a(this.userTitle, b.a(this.bannerTitle, a.b(this.image, g.a((textDTO == null ? 0 : textDTO.hashCode()) * 31, 31, this.backgroundToken), 31), 31), 31);
        TextDTO textDTO2 = this.userSubtitle;
        int a12 = b.a(this.referralTitle, (a11 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31);
        TextDTO textDTO3 = this.referralSubtitle;
        int hashCode = (a12 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        ProgressBar progressBar = this.progressBar;
        int hashCode2 = (hashCode + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        String str = this.progressBackgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        TextDTO textDTO4 = this.expectedMilesTitle;
        int hashCode4 = (hashCode3 + (textDTO4 == null ? 0 : textDTO4.hashCode())) * 31;
        IconDTO iconDTO = this.expectedMilesIcon;
        int c11 = C2859b.c(this.shareButton, (hashCode4 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return c11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        String str = this.backgroundToken;
        ImageDTO imageDTO = this.image;
        TextDTO textDTO2 = this.bannerTitle;
        TextDTO textDTO3 = this.userTitle;
        TextDTO textDTO4 = this.userSubtitle;
        TextDTO textDTO5 = this.referralTitle;
        TextDTO textDTO6 = this.referralSubtitle;
        ProgressBar progressBar = this.progressBar;
        String str2 = this.progressBackgroundColor;
        TextDTO textDTO7 = this.expectedMilesTitle;
        IconDTO iconDTO = this.expectedMilesIcon;
        ButtonV3DTO buttonV3DTO = this.shareButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder f7 = D3.g.f("ReferralMilesBannerDTO(title=", textDTO, ", backgroundToken=", str, ", image=");
        f7.append(imageDTO);
        f7.append(", bannerTitle=");
        f7.append(textDTO2);
        f7.append(", userTitle=");
        d.e(", userSubtitle=", ", referralTitle=", f7, textDTO3, textDTO4);
        d.e(", referralSubtitle=", ", progressBar=", f7, textDTO5, textDTO6);
        f7.append(progressBar);
        f7.append(", progressBackgroundColor=");
        f7.append(str2);
        f7.append(", expectedMilesTitle=");
        G.f(f7, textDTO7, ", expectedMilesIcon=", iconDTO, ", shareButton=");
        f7.append(buttonV3DTO);
        f7.append(", trackingInfo=");
        f7.append(map);
        f7.append(")");
        return f7.toString();
    }
}
