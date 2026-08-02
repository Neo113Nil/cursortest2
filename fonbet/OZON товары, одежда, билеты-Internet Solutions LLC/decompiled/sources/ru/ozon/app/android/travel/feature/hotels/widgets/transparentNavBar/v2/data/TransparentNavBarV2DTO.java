package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.data;

import Fj.c;
import G.g;
import HY.b;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001%BO\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J^\u0010\u001e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0005\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO;", "", "leftButtons", "", "rightButtons", "isDynamicAlpha", "", "scrollAnchorId", "", "buttonIconColors", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;", "buttonShapeColors", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;)V", "getLeftButtons", "()Ljava/util/List;", "getRightButtons", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getScrollAnchorId", "()Ljava/lang/String;", "getButtonIconColors", "()Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;", "getButtonShapeColors", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;)Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO;", "equals", "other", "hashCode", "", "toString", "ButtonsColors", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TransparentNavBarV2DTO {
    public static final int $stable = 8;
    private final ButtonsColors buttonIconColors;
    private final ButtonsColors buttonShapeColors;
    private final Boolean isDynamicAlpha;

    @NotNull
    private final List<Object> leftButtons;

    @NotNull
    private final List<Object> rightButtons;
    private final String scrollAnchorId;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;", "", "withoutBackground", "", "withBackground", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getWithoutBackground", "()Ljava/lang/String;", "getWithBackground", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonsColors {
        public static final int $stable = 0;

        @NotNull
        private final String withBackground;

        @NotNull
        private final String withoutBackground;

        public ButtonsColors(@NotNull String withoutBackground, @NotNull String withBackground) {
            Intrinsics.checkNotNullParameter(withoutBackground, "withoutBackground");
            Intrinsics.checkNotNullParameter(withBackground, "withBackground");
            this.withoutBackground = withoutBackground;
            this.withBackground = withBackground;
        }

        public static /* synthetic */ ButtonsColors copy$default(ButtonsColors buttonsColors, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buttonsColors.withoutBackground;
            }
            if ((i11 & 2) != 0) {
                str2 = buttonsColors.withBackground;
            }
            return buttonsColors.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getWithoutBackground() {
            return this.withoutBackground;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getWithBackground() {
            return this.withBackground;
        }

        @NotNull
        public final ButtonsColors copy(@NotNull String withoutBackground, @NotNull String withBackground) {
            Intrinsics.checkNotNullParameter(withoutBackground, "withoutBackground");
            Intrinsics.checkNotNullParameter(withBackground, "withBackground");
            return new ButtonsColors(withoutBackground, withBackground);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonsColors)) {
                return false;
            }
            ButtonsColors buttonsColors = (ButtonsColors) other;
            return Intrinsics.d(this.withoutBackground, buttonsColors.withoutBackground) && Intrinsics.d(this.withBackground, buttonsColors.withBackground);
        }

        @NotNull
        public final String getWithBackground() {
            return this.withBackground;
        }

        @NotNull
        public final String getWithoutBackground() {
            return this.withoutBackground;
        }

        public int hashCode() {
            return this.withBackground.hashCode() + (this.withoutBackground.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ButtonsColors(withoutBackground=", this.withoutBackground, ", withBackground=", this.withBackground, ")");
        }
    }

    public TransparentNavBarV2DTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class), @ProtoOneOfSignature(name = "favoriteMolecule", type = FavoriteProductMoleculeV4.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> leftButtons, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class), @ProtoOneOfSignature(name = "favoriteMolecule", type = FavoriteProductMoleculeV4.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> rightButtons, Boolean bool, String str, ButtonsColors buttonsColors, ButtonsColors buttonsColors2) {
        Intrinsics.checkNotNullParameter(leftButtons, "leftButtons");
        Intrinsics.checkNotNullParameter(rightButtons, "rightButtons");
        this.leftButtons = leftButtons;
        this.rightButtons = rightButtons;
        this.isDynamicAlpha = bool;
        this.scrollAnchorId = str;
        this.buttonIconColors = buttonsColors;
        this.buttonShapeColors = buttonsColors2;
    }

    public static /* synthetic */ TransparentNavBarV2DTO copy$default(TransparentNavBarV2DTO transparentNavBarV2DTO, List list, List list2, Boolean bool, String str, ButtonsColors buttonsColors, ButtonsColors buttonsColors2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = transparentNavBarV2DTO.leftButtons;
        }
        if ((i11 & 2) != 0) {
            list2 = transparentNavBarV2DTO.rightButtons;
        }
        if ((i11 & 4) != 0) {
            bool = transparentNavBarV2DTO.isDynamicAlpha;
        }
        if ((i11 & 8) != 0) {
            str = transparentNavBarV2DTO.scrollAnchorId;
        }
        if ((i11 & 16) != 0) {
            buttonsColors = transparentNavBarV2DTO.buttonIconColors;
        }
        if ((i11 & 32) != 0) {
            buttonsColors2 = transparentNavBarV2DTO.buttonShapeColors;
        }
        ButtonsColors buttonsColors3 = buttonsColors;
        ButtonsColors buttonsColors4 = buttonsColors2;
        return transparentNavBarV2DTO.copy(list, list2, bool, str, buttonsColors3, buttonsColors4);
    }

    @NotNull
    public final List<Object> component1() {
        return this.leftButtons;
    }

    @NotNull
    public final List<Object> component2() {
        return this.rightButtons;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsDynamicAlpha() {
        return this.isDynamicAlpha;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScrollAnchorId() {
        return this.scrollAnchorId;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonsColors getButtonIconColors() {
        return this.buttonIconColors;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonsColors getButtonShapeColors() {
        return this.buttonShapeColors;
    }

    @NotNull
    public final TransparentNavBarV2DTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class), @ProtoOneOfSignature(name = "favoriteMolecule", type = FavoriteProductMoleculeV4.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> leftButtons, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class), @ProtoOneOfSignature(name = "favoriteMolecule", type = FavoriteProductMoleculeV4.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> rightButtons, Boolean isDynamicAlpha, String scrollAnchorId, ButtonsColors buttonIconColors, ButtonsColors buttonShapeColors) {
        Intrinsics.checkNotNullParameter(leftButtons, "leftButtons");
        Intrinsics.checkNotNullParameter(rightButtons, "rightButtons");
        return new TransparentNavBarV2DTO(leftButtons, rightButtons, isDynamicAlpha, scrollAnchorId, buttonIconColors, buttonShapeColors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransparentNavBarV2DTO)) {
            return false;
        }
        TransparentNavBarV2DTO transparentNavBarV2DTO = (TransparentNavBarV2DTO) other;
        return Intrinsics.d(this.leftButtons, transparentNavBarV2DTO.leftButtons) && Intrinsics.d(this.rightButtons, transparentNavBarV2DTO.rightButtons) && Intrinsics.d(this.isDynamicAlpha, transparentNavBarV2DTO.isDynamicAlpha) && Intrinsics.d(this.scrollAnchorId, transparentNavBarV2DTO.scrollAnchorId) && Intrinsics.d(this.buttonIconColors, transparentNavBarV2DTO.buttonIconColors) && Intrinsics.d(this.buttonShapeColors, transparentNavBarV2DTO.buttonShapeColors);
    }

    public final ButtonsColors getButtonIconColors() {
        return this.buttonIconColors;
    }

    public final ButtonsColors getButtonShapeColors() {
        return this.buttonShapeColors;
    }

    @NotNull
    public final List<Object> getLeftButtons() {
        return this.leftButtons;
    }

    @NotNull
    public final List<Object> getRightButtons() {
        return this.rightButtons;
    }

    public final String getScrollAnchorId() {
        return this.scrollAnchorId;
    }

    public int hashCode() {
        int b11 = g.b(this.leftButtons.hashCode() * 31, 31, this.rightButtons);
        Boolean bool = this.isDynamicAlpha;
        int hashCode = (b11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.scrollAnchorId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ButtonsColors buttonsColors = this.buttonIconColors;
        int hashCode3 = (hashCode2 + (buttonsColors == null ? 0 : buttonsColors.hashCode())) * 31;
        ButtonsColors buttonsColors2 = this.buttonShapeColors;
        return hashCode3 + (buttonsColors2 != null ? buttonsColors2.hashCode() : 0);
    }

    public final Boolean isDynamicAlpha() {
        return this.isDynamicAlpha;
    }

    @NotNull
    public String toString() {
        List<Object> list = this.leftButtons;
        List<Object> list2 = this.rightButtons;
        Boolean bool = this.isDynamicAlpha;
        String str = this.scrollAnchorId;
        ButtonsColors buttonsColors = this.buttonIconColors;
        ButtonsColors buttonsColors2 = this.buttonShapeColors;
        StringBuilder d11 = c.d("TransparentNavBarV2DTO(leftButtons=", list, ", rightButtons=", ", isDynamicAlpha=", list2);
        b.c(bool, ", scrollAnchorId=", str, ", buttonIconColors=", d11);
        d11.append(buttonsColors);
        d11.append(", buttonShapeColors=");
        d11.append(buttonsColors2);
        d11.append(")");
        return d11.toString();
    }

    public TransparentNavBarV2DTO(List list, List list2, Boolean bool, String str, ButtonsColors buttonsColors, ButtonsColors buttonsColors2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? K.f71697a : list2, bool, str, buttonsColors, buttonsColors2);
    }
}
