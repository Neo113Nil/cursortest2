package ru.ozon.app.android.pdp.widgets.cartButtonQuant.plain;

import Kk.C3532b;
import T7.P;
import Tl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\\\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "originalButtonText", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$AsyncFetchType;", "asyncFetchType", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "subtext", "", "hasShadow", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "style", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$AsyncFetchType;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;ZLru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;)V", "copy", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$AsyncFetchType;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;ZLru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getOriginalButtonText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$AsyncFetchType;", "getAsyncFetchType", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$AsyncFetchType;", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "getSubtext", "()Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "Z", "getHasShadow", "()Z", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "getStyle", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlainQuantVO implements c {
    private final CartButtonQuantDto.AsyncFetchType asyncFetchType;

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final boolean hasShadow;
    private final long id;

    @NotNull
    private final OzonSpannableString originalButtonText;
    private final CartButtonQuantDto.CartButtonStyle style;
    private final TextAtomWithIcon subtext;

    public PlainQuantVO(long j11, @NotNull ButtonV3Atom.LargeButton button, @NotNull OzonSpannableString originalButtonText, CartButtonQuantDto.AsyncFetchType asyncFetchType, TextAtomWithIcon textAtomWithIcon, boolean z11, CartButtonQuantDto.CartButtonStyle cartButtonStyle) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(originalButtonText, "originalButtonText");
        this.id = j11;
        this.button = button;
        this.originalButtonText = originalButtonText;
        this.asyncFetchType = asyncFetchType;
        this.subtext = textAtomWithIcon;
        this.hasShadow = z11;
        this.style = cartButtonStyle;
    }

    public static /* synthetic */ PlainQuantVO copy$default(PlainQuantVO plainQuantVO, long j11, ButtonV3Atom.LargeButton largeButton, OzonSpannableString ozonSpannableString, CartButtonQuantDto.AsyncFetchType asyncFetchType, TextAtomWithIcon textAtomWithIcon, boolean z11, CartButtonQuantDto.CartButtonStyle cartButtonStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = plainQuantVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            largeButton = plainQuantVO.button;
        }
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        if ((i11 & 4) != 0) {
            ozonSpannableString = plainQuantVO.originalButtonText;
        }
        OzonSpannableString ozonSpannableString2 = ozonSpannableString;
        if ((i11 & 8) != 0) {
            asyncFetchType = plainQuantVO.asyncFetchType;
        }
        CartButtonQuantDto.AsyncFetchType asyncFetchType2 = asyncFetchType;
        if ((i11 & 16) != 0) {
            textAtomWithIcon = plainQuantVO.subtext;
        }
        return plainQuantVO.copy(j12, largeButton2, ozonSpannableString2, asyncFetchType2, textAtomWithIcon, (i11 & 32) != 0 ? plainQuantVO.hasShadow : z11, (i11 & 64) != 0 ? plainQuantVO.style : cartButtonStyle);
    }

    @NotNull
    public final PlainQuantVO copy(long id2, @NotNull ButtonV3Atom.LargeButton button, @NotNull OzonSpannableString originalButtonText, CartButtonQuantDto.AsyncFetchType asyncFetchType, TextAtomWithIcon subtext, boolean hasShadow, CartButtonQuantDto.CartButtonStyle style) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(originalButtonText, "originalButtonText");
        return new PlainQuantVO(id2, button, originalButtonText, asyncFetchType, subtext, hasShadow, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlainQuantVO)) {
            return false;
        }
        PlainQuantVO plainQuantVO = (PlainQuantVO) other;
        return this.id == plainQuantVO.id && Intrinsics.d(this.button, plainQuantVO.button) && Intrinsics.d(this.originalButtonText, plainQuantVO.originalButtonText) && this.asyncFetchType == plainQuantVO.asyncFetchType && Intrinsics.d(this.subtext, plainQuantVO.subtext) && this.hasShadow == plainQuantVO.hasShadow && this.style == plainQuantVO.style;
    }

    public final CartButtonQuantDto.AsyncFetchType getAsyncFetchType() {
        return this.asyncFetchType;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final boolean getHasShadow() {
        return this.hasShadow;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final OzonSpannableString getOriginalButtonText() {
        return this.originalButtonText;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final CartButtonQuantDto.CartButtonStyle getStyle() {
        return this.style;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = P.c(this.originalButtonText, b.a(this.button, Long.hashCode(this.id) * 31, 31), 31);
        CartButtonQuantDto.AsyncFetchType asyncFetchType = this.asyncFetchType;
        int hashCode = (c11 + (asyncFetchType == null ? 0 : asyncFetchType.hashCode())) * 31;
        TextAtomWithIcon textAtomWithIcon = this.subtext;
        int a11 = C3532b.a((hashCode + (textAtomWithIcon == null ? 0 : textAtomWithIcon.hashCode())) * 31, 31, this.hasShadow);
        CartButtonQuantDto.CartButtonStyle cartButtonStyle = this.style;
        return a11 + (cartButtonStyle != null ? cartButtonStyle.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3Atom.LargeButton largeButton = this.button;
        OzonSpannableString ozonSpannableString = this.originalButtonText;
        CartButtonQuantDto.AsyncFetchType asyncFetchType = this.asyncFetchType;
        TextAtomWithIcon textAtomWithIcon = this.subtext;
        boolean z11 = this.hasShadow;
        CartButtonQuantDto.CartButtonStyle cartButtonStyle = this.style;
        StringBuilder h11 = Bi.b.h("PlainQuantVO(id=", j11, ", button=", largeButton);
        h11.append(", originalButtonText=");
        h11.append((Object) ozonSpannableString);
        h11.append(", asyncFetchType=");
        h11.append(asyncFetchType);
        h11.append(", subtext=");
        h11.append(textAtomWithIcon);
        h11.append(", hasShadow=");
        h11.append(z11);
        h11.append(", style=");
        h11.append(cartButtonStyle);
        h11.append(")");
        return h11.toString();
    }
}
