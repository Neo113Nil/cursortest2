package ru.ozon.app.android.travel.molecules.view.banner;

import B0.C2454a;
import G.g;
import N3.C3660k;
import Nh.a;
import Tl.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b(\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b)\u0010\u0017R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/banner/BannerVO;", "", "", "leftImageLink", "rightImageLink", "", "height", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "gradientColor", "solidColor", "contourColor", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLeftImageLink", "getRightImageLink", "I", "getHeight", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getGradientColor", "getSolidColor", "getContourColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BannerVO {
    public static final int $stable = 8;
    private final AtomAction atomAction;
    private final IconButtonV3DTO closeButton;
    private final String contourColor;
    private final String gradientColor;
    private final int height;
    private final String leftImageLink;

    @NotNull
    private final String rightImageLink;
    private final String solidColor;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final t trackingInfo;

    public BannerVO(String str, @NotNull String rightImageLink, int i11, TextDTO textDTO, TextDTO textDTO2, String str2, String str3, String str4, AtomAction atomAction, IconButtonV3DTO iconButtonV3DTO, t tVar) {
        Intrinsics.checkNotNullParameter(rightImageLink, "rightImageLink");
        this.leftImageLink = str;
        this.rightImageLink = rightImageLink;
        this.height = i11;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.gradientColor = str2;
        this.solidColor = str3;
        this.contourColor = str4;
        this.atomAction = atomAction;
        this.closeButton = iconButtonV3DTO;
        this.trackingInfo = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerVO)) {
            return false;
        }
        BannerVO bannerVO = (BannerVO) other;
        return Intrinsics.d(this.leftImageLink, bannerVO.leftImageLink) && Intrinsics.d(this.rightImageLink, bannerVO.rightImageLink) && this.height == bannerVO.height && Intrinsics.d(this.title, bannerVO.title) && Intrinsics.d(this.subtitle, bannerVO.subtitle) && Intrinsics.d(this.gradientColor, bannerVO.gradientColor) && Intrinsics.d(this.solidColor, bannerVO.solidColor) && Intrinsics.d(this.contourColor, bannerVO.contourColor) && Intrinsics.d(this.atomAction, bannerVO.atomAction) && Intrinsics.d(this.closeButton, bannerVO.closeButton) && Intrinsics.d(this.trackingInfo, bannerVO.trackingInfo);
    }

    public final AtomAction getAtomAction() {
        return this.atomAction;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    public final String getContourColor() {
        return this.contourColor;
    }

    public final String getGradientColor() {
        return this.gradientColor;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getLeftImageLink() {
        return this.leftImageLink;
    }

    @NotNull
    public final String getRightImageLink() {
        return this.rightImageLink;
    }

    public final String getSolidColor() {
        return this.solidColor;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.leftImageLink;
        int a11 = C2454a.a(this.height, g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.rightImageLink), 31);
        TextDTO textDTO = this.title;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        String str2 = this.gradientColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.solidColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.contourColor;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AtomAction atomAction = this.atomAction;
        int hashCode6 = (hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int hashCode7 = (hashCode6 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        t tVar = this.trackingInfo;
        return hashCode7 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.leftImageLink;
        String str2 = this.rightImageLink;
        int i11 = this.height;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        String str3 = this.gradientColor;
        String str4 = this.solidColor;
        String str5 = this.contourColor;
        AtomAction atomAction = this.atomAction;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        t tVar = this.trackingInfo;
        StringBuilder d11 = C3660k.d("BannerVO(leftImageLink=", str, ", rightImageLink=", str2, ", height=");
        d11.append(i11);
        d11.append(", title=");
        d11.append(textDTO);
        d11.append(", subtitle=");
        d11.append(textDTO2);
        d11.append(", gradientColor=");
        d11.append(str3);
        d11.append(", solidColor=");
        a.h(d11, str4, ", contourColor=", str5, ", atomAction=");
        d11.append(atomAction);
        d11.append(", closeButton=");
        d11.append(iconButtonV3DTO);
        d11.append(", trackingInfo=");
        return b.d(d11, tVar, ")");
    }
}
