package ru.ozon.app.android.search.widgets.curtainHeader.data;

import B3.p;
import C.o0;
import GR.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001$B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/search/widgets/curtainHeader/data/CurtainHeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "leftButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "rightButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "paddings", "Lru/ozon/app/android/search/widgets/curtainHeader/data/CurtainHeaderDTO$CurtainHeaderPaddings;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/search/widgets/curtainHeader/data/CurtainHeaderDTO$CurtainHeaderPaddings;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getLeftButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getPaddings", "()Lru/ozon/app/android/search/widgets/curtainHeader/data/CurtainHeaderDTO$CurtainHeaderPaddings;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "CurtainHeaderPaddings", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurtainHeaderDTO {
    public static final int $stable = IconButtonV3DTO.$stable;
    private final String backgroundColor;
    private final ButtonV3DTO leftButton;

    @NotNull
    private final CurtainHeaderPaddings paddings;
    private final IconButtonV3DTO rightButton;

    @NotNull
    private final TextDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/curtainHeader/data/CurtainHeaderDTO$CurtainHeaderPaddings;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "left", "bottom", "right", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getLeft", "getBottom", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CurtainHeaderPaddings {
        public static final int $stable = 0;

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final Paddings left;

        @NotNull
        private final Paddings right;

        @NotNull
        private final Paddings top;

        public CurtainHeaderPaddings() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ CurtainHeaderPaddings copy$default(CurtainHeaderPaddings curtainHeaderPaddings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = curtainHeaderPaddings.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = curtainHeaderPaddings.left;
            }
            if ((i11 & 4) != 0) {
                paddings3 = curtainHeaderPaddings.bottom;
            }
            if ((i11 & 8) != 0) {
                paddings4 = curtainHeaderPaddings.right;
            }
            return curtainHeaderPaddings.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final CurtainHeaderPaddings copy(@NotNull Paddings top, @NotNull Paddings left, @NotNull Paddings bottom, @NotNull Paddings right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(right, "right");
            return new CurtainHeaderPaddings(top, left, bottom, right);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurtainHeaderPaddings)) {
                return false;
            }
            CurtainHeaderPaddings curtainHeaderPaddings = (CurtainHeaderPaddings) other;
            return this.top == curtainHeaderPaddings.top && this.left == curtainHeaderPaddings.left && this.bottom == curtainHeaderPaddings.bottom && this.right == curtainHeaderPaddings.right;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.right.hashCode() + b.b(this.bottom, b.b(this.left, this.top.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.left;
            return b.e(p.b("CurtainHeaderPaddings(top=", paddings, ", left=", paddings2, ", bottom="), this.bottom, ", right=", this.right, ")");
        }

        public CurtainHeaderPaddings(@NotNull Paddings top, @NotNull Paddings left, @NotNull Paddings bottom, @NotNull Paddings right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(right, "right");
            this.top = top;
            this.left = left;
            this.bottom = bottom;
            this.right = right;
        }

        public /* synthetic */ CurtainHeaderPaddings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_350 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_200 : paddings2, (i11 & 4) != 0 ? Paddings.NONE : paddings3, (i11 & 8) != 0 ? Paddings.PADDING_500 : paddings4);
        }
    }

    public CurtainHeaderDTO(@NotNull TextDTO title, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, @NotNull CurtainHeaderPaddings paddings, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.title = title;
        this.leftButton = buttonV3DTO;
        this.rightButton = iconButtonV3DTO;
        this.paddings = paddings;
        this.backgroundColor = str;
    }

    public static /* synthetic */ CurtainHeaderDTO copy$default(CurtainHeaderDTO curtainHeaderDTO, TextDTO textDTO, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, CurtainHeaderPaddings curtainHeaderPaddings, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = curtainHeaderDTO.title;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = curtainHeaderDTO.leftButton;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = curtainHeaderDTO.rightButton;
        }
        if ((i11 & 8) != 0) {
            curtainHeaderPaddings = curtainHeaderDTO.paddings;
        }
        if ((i11 & 16) != 0) {
            str = curtainHeaderDTO.backgroundColor;
        }
        String str2 = str;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        return curtainHeaderDTO.copy(textDTO, buttonV3DTO, iconButtonV3DTO2, curtainHeaderPaddings, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getLeftButton() {
        return this.leftButton;
    }

    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CurtainHeaderPaddings getPaddings() {
        return this.paddings;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CurtainHeaderDTO copy(@NotNull TextDTO title, ButtonV3DTO leftButton, IconButtonV3DTO rightButton, @NotNull CurtainHeaderPaddings paddings, String backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new CurtainHeaderDTO(title, leftButton, rightButton, paddings, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainHeaderDTO)) {
            return false;
        }
        CurtainHeaderDTO curtainHeaderDTO = (CurtainHeaderDTO) other;
        return Intrinsics.d(this.title, curtainHeaderDTO.title) && Intrinsics.d(this.leftButton, curtainHeaderDTO.leftButton) && Intrinsics.d(this.rightButton, curtainHeaderDTO.rightButton) && Intrinsics.d(this.paddings, curtainHeaderDTO.paddings) && Intrinsics.d(this.backgroundColor, curtainHeaderDTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonV3DTO getLeftButton() {
        return this.leftButton;
    }

    @NotNull
    public final CurtainHeaderPaddings getPaddings() {
        return this.paddings;
    }

    public final IconButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ButtonV3DTO buttonV3DTO = this.leftButton;
        int hashCode2 = (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.rightButton;
        int hashCode3 = (this.paddings.hashCode() + ((hashCode2 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31)) * 31;
        String str = this.backgroundColor;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        ButtonV3DTO buttonV3DTO = this.leftButton;
        IconButtonV3DTO iconButtonV3DTO = this.rightButton;
        CurtainHeaderPaddings curtainHeaderPaddings = this.paddings;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("CurtainHeaderDTO(title=");
        sb2.append(textDTO);
        sb2.append(", leftButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", rightButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", paddings=");
        sb2.append(curtainHeaderPaddings);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, str, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CurtainHeaderDTO(TextDTO textDTO, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, CurtainHeaderPaddings curtainHeaderPaddings, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, buttonV3DTO, iconButtonV3DTO, r12, r13);
        String str2;
        CurtainHeaderPaddings curtainHeaderPaddings2;
        if ((i11 & 8) != 0) {
            str2 = str;
            curtainHeaderPaddings2 = new CurtainHeaderPaddings(null, null, null, null, 15, null);
        } else {
            str2 = str;
            curtainHeaderPaddings2 = curtainHeaderPaddings;
        }
    }
}
