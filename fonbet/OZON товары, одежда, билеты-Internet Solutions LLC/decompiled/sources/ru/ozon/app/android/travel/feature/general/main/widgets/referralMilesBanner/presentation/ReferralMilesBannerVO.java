package ru.ozon.app.android.travel.feature.general.main.widgets.referralMilesBanner.presentation;

import De.C2859b;
import G.g;
import Nh.a;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.progress.ProgressBar;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b2\u0010,R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b3\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b4\u0010,R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b5\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b6\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b:\u0010\u001eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b;\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\b@\u0010AR\u001f\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/presentation/ReferralMilesBannerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "backgroundToken", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "bannerTitle", "userTitle", "userSubtitle", "referralTitle", "referralSubtitle", "Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "progressBar", "progressBackgroundColor", "expectedMilesTitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "expectedMilesIcon", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "shareButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/atoms/data/progress/ProgressBar;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundToken", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBannerTitle", "getUserTitle", "getUserSubtitle", "getReferralTitle", "getReferralSubtitle", "Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "getProgressBar", "()Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "getProgressBackgroundColor", "getExpectedMilesTitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getExpectedMilesIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getShareButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReferralMilesBannerVO implements c {

    @NotNull
    private final String backgroundToken;

    @NotNull
    private final TextDTO bannerTitle;
    private final IconDTO expectedMilesIcon;
    private final TextDTO expectedMilesTitle;
    private final long id;

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
    private final TextDTO userSubtitle;

    @NotNull
    private final TextDTO userTitle;
    private final t viewEvent;

    public ReferralMilesBannerVO(long j11, TextDTO textDTO, @NotNull String backgroundToken, @NotNull ImageDTO image, @NotNull TextDTO bannerTitle, @NotNull TextDTO userTitle, TextDTO textDTO2, @NotNull TextDTO referralTitle, TextDTO textDTO3, ProgressBar progressBar, String str, TextDTO textDTO4, IconDTO iconDTO, @NotNull ButtonV3DTO shareButton, t tVar) {
        Intrinsics.checkNotNullParameter(backgroundToken, "backgroundToken");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(bannerTitle, "bannerTitle");
        Intrinsics.checkNotNullParameter(userTitle, "userTitle");
        Intrinsics.checkNotNullParameter(referralTitle, "referralTitle");
        Intrinsics.checkNotNullParameter(shareButton, "shareButton");
        this.id = j11;
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
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralMilesBannerVO)) {
            return false;
        }
        ReferralMilesBannerVO referralMilesBannerVO = (ReferralMilesBannerVO) other;
        return this.id == referralMilesBannerVO.id && Intrinsics.d(this.title, referralMilesBannerVO.title) && Intrinsics.d(this.backgroundToken, referralMilesBannerVO.backgroundToken) && Intrinsics.d(this.image, referralMilesBannerVO.image) && Intrinsics.d(this.bannerTitle, referralMilesBannerVO.bannerTitle) && Intrinsics.d(this.userTitle, referralMilesBannerVO.userTitle) && Intrinsics.d(this.userSubtitle, referralMilesBannerVO.userSubtitle) && Intrinsics.d(this.referralTitle, referralMilesBannerVO.referralTitle) && Intrinsics.d(this.referralSubtitle, referralMilesBannerVO.referralSubtitle) && Intrinsics.d(this.progressBar, referralMilesBannerVO.progressBar) && Intrinsics.d(this.progressBackgroundColor, referralMilesBannerVO.progressBackgroundColor) && Intrinsics.d(this.expectedMilesTitle, referralMilesBannerVO.expectedMilesTitle) && Intrinsics.d(this.expectedMilesIcon, referralMilesBannerVO.expectedMilesIcon) && Intrinsics.d(this.shareButton, referralMilesBannerVO.shareButton) && Intrinsics.d(this.viewEvent, referralMilesBannerVO.viewEvent);
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

    @Override // l20.c
    public long getId() {
        return this.id;
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

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3DTO getShareButton() {
        return this.shareButton;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final TextDTO getUserSubtitle() {
        return this.userSubtitle;
    }

    @NotNull
    public final TextDTO getUserTitle() {
        return this.userTitle;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int a11 = b.a(this.userTitle, b.a(this.bannerTitle, a.b(this.image, g.a((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.backgroundToken), 31), 31), 31);
        TextDTO textDTO2 = this.userSubtitle;
        int a12 = b.a(this.referralTitle, (a11 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31);
        TextDTO textDTO3 = this.referralSubtitle;
        int hashCode2 = (a12 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        ProgressBar progressBar = this.progressBar;
        int hashCode3 = (hashCode2 + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        String str = this.progressBackgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        TextDTO textDTO4 = this.expectedMilesTitle;
        int hashCode5 = (hashCode4 + (textDTO4 == null ? 0 : textDTO4.hashCode())) * 31;
        IconDTO iconDTO = this.expectedMilesIcon;
        int c11 = C2859b.c(this.shareButton, (hashCode5 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31);
        t tVar = this.viewEvent;
        return c11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
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
        t tVar = this.viewEvent;
        StringBuilder b11 = TY.a.b("ReferralMilesBannerVO(id=", j11, ", title=", textDTO);
        b11.append(", backgroundToken=");
        b11.append(str);
        b11.append(", image=");
        b11.append(imageDTO);
        D3.g.i(", bannerTitle=", ", userTitle=", b11, textDTO2, textDTO3);
        D3.g.i(", userSubtitle=", ", referralTitle=", b11, textDTO4, textDTO5);
        b11.append(", referralSubtitle=");
        b11.append(textDTO6);
        b11.append(", progressBar=");
        b11.append(progressBar);
        b11.append(", progressBackgroundColor=");
        b11.append(str2);
        b11.append(", expectedMilesTitle=");
        b11.append(textDTO7);
        b11.append(", expectedMilesIcon=");
        b11.append(iconDTO);
        b11.append(", shareButton=");
        b11.append(buttonV3DTO);
        return Lh.a.b(b11, ", viewEvent=", tVar, ")");
    }
}
