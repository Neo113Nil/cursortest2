package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.viewItem;

import B90.C2618u;
import Ns.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/viewItem/DisclaimerWrapper;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", CommentV3DTO.HEADER_FIELD_NAME, "body", "", "backgroundColor", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "buttons", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getHeader", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBody", "Ljava/lang/String;", "getBackgroundColor", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DisclaimerWrapper {
    private final String backgroundColor;

    @NotNull
    private final TextDTO body;
    private final List<ButtonV3Atom.SmallBorderlessButton> buttons;
    private final TextDTO header;

    @NotNull
    private final IconDTO icon;

    public DisclaimerWrapper(@NotNull IconDTO icon, TextDTO textDTO, @NotNull TextDTO body, String str, List<ButtonV3Atom.SmallBorderlessButton> list) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(body, "body");
        this.icon = icon;
        this.header = textDTO;
        this.body = body;
        this.backgroundColor = str;
        this.buttons = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerWrapper)) {
            return false;
        }
        DisclaimerWrapper disclaimerWrapper = (DisclaimerWrapper) other;
        return Intrinsics.d(this.icon, disclaimerWrapper.icon) && Intrinsics.d(this.header, disclaimerWrapper.header) && Intrinsics.d(this.body, disclaimerWrapper.body) && Intrinsics.d(this.backgroundColor, disclaimerWrapper.backgroundColor) && Intrinsics.d(this.buttons, disclaimerWrapper.buttons);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final TextDTO getBody() {
        return this.body;
    }

    public final List<ButtonV3Atom.SmallBorderlessButton> getButtons() {
        return this.buttons;
    }

    public final TextDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        TextDTO textDTO = this.header;
        int a11 = b.a(this.body, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        String str = this.backgroundColor;
        int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        List<ButtonV3Atom.SmallBorderlessButton> list = this.buttons;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.header;
        TextDTO textDTO2 = this.body;
        String str = this.backgroundColor;
        List<ButtonV3Atom.SmallBorderlessButton> list = this.buttons;
        StringBuilder i11 = Bi.b.i("DisclaimerWrapper(icon=", ", header=", ", body=", iconDTO, textDTO);
        i11.append(textDTO2);
        i11.append(", backgroundColor=");
        i11.append(str);
        i11.append(", buttons=");
        return C2618u.h(i11, list, ")");
    }
}
