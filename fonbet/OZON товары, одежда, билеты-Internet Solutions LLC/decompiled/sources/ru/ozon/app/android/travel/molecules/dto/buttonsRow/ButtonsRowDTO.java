package ru.ozon.app.android.travel.molecules.dto.buttonsRow;

import GR.b;
import Lh.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/buttonsRow/ButtonsRowDTO;", "", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "horizontalPadding", "buttonsMargin", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getButtons", "()Ljava/util/List;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getHorizontalPadding", "getButtonsMargin", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ButtonsRowDTO {

    @EnumNullFallback
    @NotNull
    private final Paddings bottomPadding;

    @NotNull
    private final List<ButtonsDTO> buttons;

    @EnumNullFallback
    @NotNull
    private final Paddings buttonsMargin;

    @EnumNullFallback
    @NotNull
    private final Paddings horizontalPadding;

    @EnumNullFallback
    @NotNull
    private final Paddings topPadding;

    /* JADX WARN: Multi-variable type inference failed */
    public ButtonsRowDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends ButtonsDTO> buttons, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings horizontalPadding, @NotNull Paddings buttonsMargin) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.checkNotNullParameter(buttonsMargin, "buttonsMargin");
        this.buttons = buttons;
        this.topPadding = topPadding;
        this.bottomPadding = bottomPadding;
        this.horizontalPadding = horizontalPadding;
        this.buttonsMargin = buttonsMargin;
    }

    public static /* synthetic */ ButtonsRowDTO copy$default(ButtonsRowDTO buttonsRowDTO, List list, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = buttonsRowDTO.buttons;
        }
        if ((i11 & 2) != 0) {
            paddings = buttonsRowDTO.topPadding;
        }
        if ((i11 & 4) != 0) {
            paddings2 = buttonsRowDTO.bottomPadding;
        }
        if ((i11 & 8) != 0) {
            paddings3 = buttonsRowDTO.horizontalPadding;
        }
        if ((i11 & 16) != 0) {
            paddings4 = buttonsRowDTO.buttonsMargin;
        }
        Paddings paddings5 = paddings4;
        Paddings paddings6 = paddings2;
        return buttonsRowDTO.copy(list, paddings, paddings6, paddings3, paddings5);
    }

    @NotNull
    public final List<ButtonsDTO> component1() {
        return this.buttons;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Paddings getButtonsMargin() {
        return this.buttonsMargin;
    }

    @NotNull
    public final ButtonsRowDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends ButtonsDTO> buttons, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings horizontalPadding, @NotNull Paddings buttonsMargin) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.checkNotNullParameter(buttonsMargin, "buttonsMargin");
        return new ButtonsRowDTO(buttons, topPadding, bottomPadding, horizontalPadding, buttonsMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsRowDTO)) {
            return false;
        }
        ButtonsRowDTO buttonsRowDTO = (ButtonsRowDTO) other;
        return Intrinsics.d(this.buttons, buttonsRowDTO.buttons) && this.topPadding == buttonsRowDTO.topPadding && this.bottomPadding == buttonsRowDTO.bottomPadding && this.horizontalPadding == buttonsRowDTO.horizontalPadding && this.buttonsMargin == buttonsRowDTO.buttonsMargin;
    }

    @NotNull
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final List<ButtonsDTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final Paddings getButtonsMargin() {
        return this.buttonsMargin;
    }

    @NotNull
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        return this.buttonsMargin.hashCode() + b.b(this.horizontalPadding, b.b(this.bottomPadding, b.b(this.topPadding, this.buttons.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        List<ButtonsDTO> list = this.buttons;
        Paddings paddings = this.topPadding;
        Paddings paddings2 = this.bottomPadding;
        Paddings paddings3 = this.horizontalPadding;
        Paddings paddings4 = this.buttonsMargin;
        StringBuilder sb2 = new StringBuilder("ButtonsRowDTO(buttons=");
        sb2.append(list);
        sb2.append(", topPadding=");
        sb2.append(paddings);
        sb2.append(", bottomPadding=");
        a.e(sb2, paddings2, ", horizontalPadding=", paddings3, ", buttonsMargin=");
        return D40.b.b(sb2, paddings4, ")");
    }

    public /* synthetic */ ButtonsRowDTO(List list, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? Paddings.PADDING_500 : paddings, (i11 & 4) != 0 ? Paddings.PADDING_500 : paddings2, (i11 & 8) != 0 ? Paddings.PADDING_500 : paddings3, (i11 & 16) != 0 ? Paddings.PADDING_300 : paddings4);
    }
}
