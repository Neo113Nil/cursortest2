package ru.ozon.app.android.storefront.widgets.login.presentation;

import Ak.C2436a;
import De.C2859b;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b%\u0010\u0010¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/login/presentation/LoginVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "subButton", "backgroundColor", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getSubButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getBackgroundColor", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LoginVO implements c {
    public static final int $stable = ButtonV3Atom.LargeBorderlessButton.$stable;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final ButtonV3DTO button;
    private final long id;
    private final ButtonV3Atom.LargeBorderlessButton subButton;
    private final String subtitle;

    @NotNull
    private final String title;

    public LoginVO(long j11, @NotNull String title, String str, @NotNull ButtonV3DTO button, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.title = title;
        this.subtitle = str;
        this.button = button;
        this.subButton = largeBorderlessButton;
        this.backgroundColor = backgroundColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginVO)) {
            return false;
        }
        LoginVO loginVO = (LoginVO) other;
        return this.id == loginVO.id && Intrinsics.d(this.title, loginVO.title) && Intrinsics.d(this.subtitle, loginVO.subtitle) && Intrinsics.d(this.button, loginVO.button) && Intrinsics.d(this.subButton, loginVO.subButton) && Intrinsics.d(this.backgroundColor, loginVO.backgroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.subtitle;
        int c11 = C2859b.c(this.button, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31);
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.subButton;
        return this.backgroundColor.hashCode() + ((c11 + (largeBorderlessButton != null ? largeBorderlessButton.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        ButtonV3DTO buttonV3DTO = this.button;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.subButton;
        String str3 = this.backgroundColor;
        StringBuilder c11 = C2436a.c(j11, "LoginVO(id=", ", title=", str);
        c11.append(", subtitle=");
        c11.append(str2);
        c11.append(", button=");
        c11.append(buttonV3DTO);
        c11.append(", subButton=");
        c11.append(largeBorderlessButton);
        c11.append(", backgroundColor=");
        c11.append(str3);
        c11.append(")");
        return c11.toString();
    }
}
