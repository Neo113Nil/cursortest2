package ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.presentation;

import B90.C2618u;
import G.g;
import Ns.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b,\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/presentation/VideoConsultationBannerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", CommentV3DTO.HEADER_FIELD_NAME, "body", "", "productImage", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "mainActionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "secondaryActionButton", CommentV3DTO.FOOTER_FIELD_NAME, "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getHeader", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBody", "Ljava/lang/String;", "getProductImage", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getMainActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getSecondaryActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getFooter", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class VideoConsultationBannerVO implements c {

    @NotNull
    private final TextDTO body;
    private final TextDTO footer;

    @NotNull
    private final TextDTO header;
    private final long id;

    @NotNull
    private final ButtonV3Atom.SmallButton mainActionButton;

    @NotNull
    private final String productImage;
    private final ButtonV3Atom.SmallBorderlessButton secondaryActionButton;
    private final t tokenizedEvent;

    public VideoConsultationBannerVO(long j11, @NotNull TextDTO header, @NotNull TextDTO body, @NotNull String productImage, @NotNull ButtonV3Atom.SmallButton mainActionButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, TextDTO textDTO, t tVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(productImage, "productImage");
        Intrinsics.checkNotNullParameter(mainActionButton, "mainActionButton");
        this.id = j11;
        this.header = header;
        this.body = body;
        this.productImage = productImage;
        this.mainActionButton = mainActionButton;
        this.secondaryActionButton = smallBorderlessButton;
        this.footer = textDTO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoConsultationBannerVO)) {
            return false;
        }
        VideoConsultationBannerVO videoConsultationBannerVO = (VideoConsultationBannerVO) other;
        return this.id == videoConsultationBannerVO.id && Intrinsics.d(this.header, videoConsultationBannerVO.header) && Intrinsics.d(this.body, videoConsultationBannerVO.body) && Intrinsics.d(this.productImage, videoConsultationBannerVO.productImage) && Intrinsics.d(this.mainActionButton, videoConsultationBannerVO.mainActionButton) && Intrinsics.d(this.secondaryActionButton, videoConsultationBannerVO.secondaryActionButton) && Intrinsics.d(this.footer, videoConsultationBannerVO.footer) && Intrinsics.d(this.tokenizedEvent, videoConsultationBannerVO.tokenizedEvent);
    }

    @NotNull
    public final TextDTO getBody() {
        return this.body;
    }

    public final TextDTO getFooter() {
        return this.footer;
    }

    @NotNull
    public final TextDTO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getMainActionButton() {
        return this.mainActionButton;
    }

    @NotNull
    public final String getProductImage() {
        return this.productImage;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ButtonV3Atom.SmallBorderlessButton getSecondaryActionButton() {
        return this.secondaryActionButton;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2618u.c(this.mainActionButton, g.a(b.a(this.body, b.a(this.header, Long.hashCode(this.id) * 31, 31), 31), 31, this.productImage), 31);
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.secondaryActionButton;
        int hashCode = (c11 + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode())) * 31;
        TextDTO textDTO = this.footer;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.header;
        TextDTO textDTO2 = this.body;
        String str = this.productImage;
        ButtonV3Atom.SmallButton smallButton = this.mainActionButton;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.secondaryActionButton;
        TextDTO textDTO3 = this.footer;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("VideoConsultationBannerVO(id=", j11, ", header=", textDTO);
        b11.append(", body=");
        b11.append(textDTO2);
        b11.append(", productImage=");
        b11.append(str);
        b11.append(", mainActionButton=");
        b11.append(smallButton);
        b11.append(", secondaryActionButton=");
        b11.append(smallBorderlessButton);
        b11.append(", footer=");
        b11.append(textDTO3);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
