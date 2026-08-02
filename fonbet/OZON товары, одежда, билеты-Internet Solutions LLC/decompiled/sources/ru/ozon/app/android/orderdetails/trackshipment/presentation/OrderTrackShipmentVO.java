package ru.ozon.app.android.orderdetails.trackshipment.presentation;

import Ak.C2436a;
import D3.h;
import G.g;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"Lru/ozon/app/android/orderdetails/trackshipment/presentation/OrderTrackShipmentVO;", "Ll20/c;", "", "id", "", "prefix", "trackNumber", "notificationText", "icon", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "button", "", "iconColor", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getPrefix", "getTrackNumber", "getNotificationText", "getIcon", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "I", "getIconColor", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderTrackShipmentVO implements c {
    public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable;
    private final ButtonV3Atom.SmallBorderlessButton button;
    private final String icon;
    private final int iconColor;
    private final long id;

    @NotNull
    private final String notificationText;

    @NotNull
    private final String prefix;

    @NotNull
    private final String trackNumber;

    public OrderTrackShipmentVO(long j11, @NotNull String prefix, @NotNull String trackNumber, @NotNull String notificationText, String str, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(trackNumber, "trackNumber");
        Intrinsics.checkNotNullParameter(notificationText, "notificationText");
        this.id = j11;
        this.prefix = prefix;
        this.trackNumber = trackNumber;
        this.notificationText = notificationText;
        this.icon = str;
        this.button = smallBorderlessButton;
        this.iconColor = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTrackShipmentVO)) {
            return false;
        }
        OrderTrackShipmentVO orderTrackShipmentVO = (OrderTrackShipmentVO) other;
        return this.id == orderTrackShipmentVO.id && Intrinsics.d(this.prefix, orderTrackShipmentVO.prefix) && Intrinsics.d(this.trackNumber, orderTrackShipmentVO.trackNumber) && Intrinsics.d(this.notificationText, orderTrackShipmentVO.notificationText) && Intrinsics.d(this.icon, orderTrackShipmentVO.icon) && Intrinsics.d(this.button, orderTrackShipmentVO.button) && this.iconColor == orderTrackShipmentVO.iconColor;
    }

    public final ButtonV3Atom.SmallBorderlessButton getButton() {
        return this.button;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getIconColor() {
        return this.iconColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getNotificationText() {
        return this.notificationText;
    }

    @NotNull
    public final String getPrefix() {
        return this.prefix;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getTrackNumber() {
        return this.trackNumber;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.prefix), 31, this.trackNumber), 31, this.notificationText);
        String str = this.icon;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
        return Integer.hashCode(this.iconColor) + ((hashCode + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.prefix;
        String str2 = this.trackNumber;
        String str3 = this.notificationText;
        String str4 = this.icon;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
        int i11 = this.iconColor;
        StringBuilder c11 = C2436a.c(j11, "OrderTrackShipmentVO(id=", ", prefix=", str);
        a.h(c11, ", trackNumber=", str2, ", notificationText=", str3);
        c11.append(", icon=");
        c11.append(str4);
        c11.append(", button=");
        c11.append(smallBorderlessButton);
        return h.b(c11, ", iconColor=", i11, ")");
    }
}
