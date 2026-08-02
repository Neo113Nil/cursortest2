package ru.ozon.app.android.returns.common.data.dto;

import GR.b;
import HY.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0003\u0010\f\u001a\u00020\r\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\b\b\u0003\u0010\u000f\u001a\u00020\r\u0012\b\b\u0003\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003Jy\u0010,\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\rHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001e¨\u00063"}, d2 = {"Lru/ozon/app/android/returns/common/data/dto/ReturnStatusMessage;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "caption", "actionButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "radius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "backgroundColor", "", "leftPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "rightPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "getCaption", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBackgroundColor", "()Ljava/lang/String;", "getLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "getRightPadding", "getBottomPadding", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnStatusMessage {
    public static final int $stable = TextAtom.$stable;
    private final ButtonV3DTO actionButton;
    private final String backgroundColor;

    @NotNull
    private final Paddings bottomPadding;
    private final TextAtom caption;
    private final TextAtom header;

    @NotNull
    private final Paddings leftPadding;
    private final CornerRadius radius;

    @NotNull
    private final Paddings rightPadding;
    private final TextAtom text;

    @NotNull
    private final Paddings topPadding;

    public ReturnStatusMessage(@i(name = "header") TextAtom textAtom, @i(name = "text") TextAtom textAtom2, @i(name = "caption") TextAtom textAtom3, @i(name = "actionButton") ButtonV3DTO buttonV3DTO, @i(name = "radius") CornerRadius cornerRadius, @i(name = "backgroundColor") String str, @i(name = "leftPadding") @NotNull Paddings leftPadding, @i(name = "topPadding") @NotNull Paddings topPadding, @i(name = "rightPadding") @NotNull Paddings rightPadding, @i(name = "bottomPadding") @NotNull Paddings bottomPadding) {
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        this.header = textAtom;
        this.text = textAtom2;
        this.caption = textAtom3;
        this.actionButton = buttonV3DTO;
        this.radius = cornerRadius;
        this.backgroundColor = str;
        this.leftPadding = leftPadding;
        this.topPadding = topPadding;
        this.rightPadding = rightPadding;
        this.bottomPadding = bottomPadding;
    }

    public static /* synthetic */ ReturnStatusMessage copy$default(ReturnStatusMessage returnStatusMessage, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, ButtonV3DTO buttonV3DTO, CornerRadius cornerRadius, String str, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = returnStatusMessage.header;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = returnStatusMessage.text;
        }
        if ((i11 & 4) != 0) {
            textAtom3 = returnStatusMessage.caption;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = returnStatusMessage.actionButton;
        }
        if ((i11 & 16) != 0) {
            cornerRadius = returnStatusMessage.radius;
        }
        if ((i11 & 32) != 0) {
            str = returnStatusMessage.backgroundColor;
        }
        if ((i11 & 64) != 0) {
            paddings = returnStatusMessage.leftPadding;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            paddings2 = returnStatusMessage.topPadding;
        }
        if ((i11 & 256) != 0) {
            paddings3 = returnStatusMessage.rightPadding;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            paddings4 = returnStatusMessage.bottomPadding;
        }
        Paddings paddings5 = paddings3;
        Paddings paddings6 = paddings4;
        Paddings paddings7 = paddings;
        Paddings paddings8 = paddings2;
        CornerRadius cornerRadius2 = cornerRadius;
        String str2 = str;
        return returnStatusMessage.copy(textAtom, textAtom2, textAtom3, buttonV3DTO, cornerRadius2, str2, paddings7, paddings8, paddings5, paddings6);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getCaption() {
        return this.caption;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getActionButton() {
        return this.actionButton;
    }

    /* renamed from: component5, reason: from getter */
    public final CornerRadius getRadius() {
        return this.radius;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    @NotNull
    public final ReturnStatusMessage copy(@i(name = "header") TextAtom header, @i(name = "text") TextAtom text, @i(name = "caption") TextAtom caption, @i(name = "actionButton") ButtonV3DTO actionButton, @i(name = "radius") CornerRadius radius, @i(name = "backgroundColor") String backgroundColor, @i(name = "leftPadding") @NotNull Paddings leftPadding, @i(name = "topPadding") @NotNull Paddings topPadding, @i(name = "rightPadding") @NotNull Paddings rightPadding, @i(name = "bottomPadding") @NotNull Paddings bottomPadding) {
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        return new ReturnStatusMessage(header, text, caption, actionButton, radius, backgroundColor, leftPadding, topPadding, rightPadding, bottomPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnStatusMessage)) {
            return false;
        }
        ReturnStatusMessage returnStatusMessage = (ReturnStatusMessage) other;
        return Intrinsics.d(this.header, returnStatusMessage.header) && Intrinsics.d(this.text, returnStatusMessage.text) && Intrinsics.d(this.caption, returnStatusMessage.caption) && Intrinsics.d(this.actionButton, returnStatusMessage.actionButton) && this.radius == returnStatusMessage.radius && Intrinsics.d(this.backgroundColor, returnStatusMessage.backgroundColor) && this.leftPadding == returnStatusMessage.leftPadding && this.topPadding == returnStatusMessage.topPadding && this.rightPadding == returnStatusMessage.rightPadding && this.bottomPadding == returnStatusMessage.bottomPadding;
    }

    public final ButtonV3DTO getActionButton() {
        return this.actionButton;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    public final TextAtom getCaption() {
        return this.caption;
    }

    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    public final CornerRadius getRadius() {
        return this.radius;
    }

    @NotNull
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    public final TextAtom getText() {
        return this.text;
    }

    @NotNull
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        TextAtom textAtom = this.header;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        TextAtom textAtom2 = this.text;
        int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        TextAtom textAtom3 = this.caption;
        int hashCode3 = (hashCode2 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.actionButton;
        int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        CornerRadius cornerRadius = this.radius;
        int hashCode5 = (hashCode4 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        String str = this.backgroundColor;
        return this.bottomPadding.hashCode() + b.b(this.rightPadding, b.b(this.topPadding, b.b(this.leftPadding, (hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.header;
        TextAtom textAtom2 = this.text;
        TextAtom textAtom3 = this.caption;
        ButtonV3DTO buttonV3DTO = this.actionButton;
        CornerRadius cornerRadius = this.radius;
        String str = this.backgroundColor;
        Paddings paddings = this.leftPadding;
        Paddings paddings2 = this.topPadding;
        Paddings paddings3 = this.rightPadding;
        Paddings paddings4 = this.bottomPadding;
        StringBuilder a11 = a.a("ReturnStatusMessage(header=", textAtom, ", text=", textAtom2, ", caption=");
        a11.append(textAtom3);
        a11.append(", actionButton=");
        a11.append(buttonV3DTO);
        a11.append(", radius=");
        a11.append(cornerRadius);
        a11.append(", backgroundColor=");
        a11.append(str);
        a11.append(", leftPadding=");
        Lh.a.e(a11, paddings, ", topPadding=", paddings2, ", rightPadding=");
        return b.e(a11, paddings3, ", bottomPadding=", paddings4, ")");
    }

    public /* synthetic */ ReturnStatusMessage(TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, ButtonV3DTO buttonV3DTO, CornerRadius cornerRadius, String str, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, textAtom2, textAtom3, buttonV3DTO, (i11 & 16) != 0 ? CornerRadius.RADIUS_500 : cornerRadius, str, (i11 & 64) != 0 ? Paddings.NONE : paddings, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Paddings.NONE : paddings2, (i11 & 256) != 0 ? Paddings.NONE : paddings3, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? Paddings.NONE : paddings4);
    }
}
