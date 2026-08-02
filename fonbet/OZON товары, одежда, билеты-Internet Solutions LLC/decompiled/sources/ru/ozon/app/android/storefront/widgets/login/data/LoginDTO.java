package ru.ozon.app.android.storefront.widgets.login.data;

import C.o0;
import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/login/data/LoginDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "buttonTitle", "subButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getButtonTitle", "getSubButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getBackgroundColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LoginDTO {
    public static final int $stable = ButtonV3Atom.LargeBorderlessButton.$stable;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final String buttonTitle;
    private final ButtonV3Atom.LargeBorderlessButton subButton;
    private final String subtitle;

    @NotNull
    private final String title;

    public LoginDTO(@NotNull String title, String str, @NotNull String buttonTitle, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.title = title;
        this.subtitle = str;
        this.buttonTitle = buttonTitle;
        this.subButton = largeBorderlessButton;
        this.backgroundColor = backgroundColor;
    }

    public static /* synthetic */ LoginDTO copy$default(LoginDTO loginDTO, String str, String str2, String str3, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = loginDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = loginDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            str3 = loginDTO.buttonTitle;
        }
        if ((i11 & 8) != 0) {
            largeBorderlessButton = loginDTO.subButton;
        }
        if ((i11 & 16) != 0) {
            str4 = loginDTO.backgroundColor;
        }
        String str5 = str4;
        String str6 = str3;
        return loginDTO.copy(str, str2, str6, largeBorderlessButton, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeBorderlessButton getSubButton() {
        return this.subButton;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final LoginDTO copy(@NotNull String title, String subtitle, @NotNull String buttonTitle, ButtonV3Atom.LargeBorderlessButton subButton, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new LoginDTO(title, subtitle, buttonTitle, subButton, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginDTO)) {
            return false;
        }
        LoginDTO loginDTO = (LoginDTO) other;
        return Intrinsics.d(this.title, loginDTO.title) && Intrinsics.d(this.subtitle, loginDTO.subtitle) && Intrinsics.d(this.buttonTitle, loginDTO.buttonTitle) && Intrinsics.d(this.subButton, loginDTO.subButton) && Intrinsics.d(this.backgroundColor, loginDTO.backgroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final ButtonV3Atom.LargeBorderlessButton getSubButton() {
        return this.subButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttonTitle);
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.subButton;
        return this.backgroundColor.hashCode() + ((a11 + (largeBorderlessButton != null ? largeBorderlessButton.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.buttonTitle;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.subButton;
        String str4 = this.backgroundColor;
        StringBuilder d11 = C3660k.d("LoginDTO(title=", str, ", subtitle=", str2, ", buttonTitle=");
        d11.append(str3);
        d11.append(", subButton=");
        d11.append(largeBorderlessButton);
        d11.append(", backgroundColor=");
        return o0.c(d11, str4, ")");
    }
}
