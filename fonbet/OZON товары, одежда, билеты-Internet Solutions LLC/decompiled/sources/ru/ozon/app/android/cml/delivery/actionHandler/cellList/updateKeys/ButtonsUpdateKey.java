package ru.ozon.app.android.cml.delivery.actionHandler.cellList.updateKeys;

import A00.a;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/cellList/updateKeys/ButtonsUpdateKey;", "LA00/a$J$a;", "", "itemId", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getItemId", "()J", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ButtonsUpdateKey implements a.J.InterfaceC0007a {

    @NotNull
    private final List<ButtonV3DTO> buttons;
    private final long itemId;

    public ButtonsUpdateKey(long j11, @NotNull List<ButtonV3DTO> buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.itemId = j11;
        this.buttons = buttons;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsUpdateKey)) {
            return false;
        }
        ButtonsUpdateKey buttonsUpdateKey = (ButtonsUpdateKey) other;
        return this.itemId == buttonsUpdateKey.itemId && Intrinsics.d(this.buttons, buttonsUpdateKey.buttons);
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public int hashCode() {
        return this.buttons.hashCode() + (Long.hashCode(this.itemId) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = b.b(this.itemId, "ButtonsUpdateKey(itemId=", ", buttons=", this.buttons);
        b11.append(")");
        return b11.toString();
    }
}
