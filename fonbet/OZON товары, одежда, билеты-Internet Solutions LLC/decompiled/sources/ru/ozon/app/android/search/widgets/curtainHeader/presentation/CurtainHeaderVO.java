package ru.ozon.app.android.search.widgets.curtainHeader.presentation;

import Ns.b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.curtainHeader.data.CurtainHeaderDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010\u0012¨\u0006,"}, d2 = {"Lru/ozon/app/android/search/widgets/curtainHeader/presentation/CurtainHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "leftButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightButton", "Lru/ozon/app/android/search/widgets/curtainHeader/data/CurtainHeaderDTO$CurtainHeaderPaddings;", "paddings", "", "backgroundColor", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/search/widgets/curtainHeader/data/CurtainHeaderDTO$CurtainHeaderPaddings;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getLeftButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/search/widgets/curtainHeader/data/CurtainHeaderDTO$CurtainHeaderPaddings;", "getPaddings", "()Lru/ozon/app/android/search/widgets/curtainHeader/data/CurtainHeaderDTO$CurtainHeaderPaddings;", "Ljava/lang/String;", "getBackgroundColor", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurtainHeaderVO implements c {
    public static final int $stable = IconButtonV3DTO.$stable;
    private final String backgroundColor;
    private final long id;
    private final ButtonV3DTO leftButton;

    @NotNull
    private final CurtainHeaderDTO.CurtainHeaderPaddings paddings;
    private final IconButtonV3DTO rightButton;

    @NotNull
    private final TextDTO title;

    public CurtainHeaderVO(long j11, @NotNull TextDTO title, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, @NotNull CurtainHeaderDTO.CurtainHeaderPaddings paddings, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.title = title;
        this.leftButton = buttonV3DTO;
        this.rightButton = iconButtonV3DTO;
        this.paddings = paddings;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainHeaderVO)) {
            return false;
        }
        CurtainHeaderVO curtainHeaderVO = (CurtainHeaderVO) other;
        return this.id == curtainHeaderVO.id && Intrinsics.d(this.title, curtainHeaderVO.title) && Intrinsics.d(this.leftButton, curtainHeaderVO.leftButton) && Intrinsics.d(this.rightButton, curtainHeaderVO.rightButton) && Intrinsics.d(this.paddings, curtainHeaderVO.paddings) && Intrinsics.d(this.backgroundColor, curtainHeaderVO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ButtonV3DTO getLeftButton() {
        return this.leftButton;
    }

    @NotNull
    public final CurtainHeaderDTO.CurtainHeaderPaddings getPaddings() {
        return this.paddings;
    }

    public final IconButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        ButtonV3DTO buttonV3DTO = this.leftButton;
        int hashCode = (a11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.rightButton;
        int hashCode2 = (this.paddings.hashCode() + ((hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31)) * 31;
        String str = this.backgroundColor;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        ButtonV3DTO buttonV3DTO = this.leftButton;
        IconButtonV3DTO iconButtonV3DTO = this.rightButton;
        CurtainHeaderDTO.CurtainHeaderPaddings curtainHeaderPaddings = this.paddings;
        String str = this.backgroundColor;
        StringBuilder b11 = a.b("CurtainHeaderVO(id=", j11, ", title=", textDTO);
        b11.append(", leftButton=");
        b11.append(buttonV3DTO);
        b11.append(", rightButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", paddings=");
        b11.append(curtainHeaderPaddings);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(")");
        return b11.toString();
    }
}
