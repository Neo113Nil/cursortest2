package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderLinks.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderLinks/data/TravelOrderLinksDTO;", "", "status", "Lru/ozon/uni/atoms/data/badge/Badge;", "buttons", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "<init>", "(Lru/ozon/uni/atoms/data/badge/Badge;Ljava/util/List;)V", "getStatus", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getButtons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelOrderLinksDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ButtonV3Atom.SmallBorderlessButton> buttons;
    private final Badge status;

    public TravelOrderLinksDTO(Badge badge, @NotNull List<ButtonV3Atom.SmallBorderlessButton> buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.status = badge;
        this.buttons = buttons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelOrderLinksDTO copy$default(TravelOrderLinksDTO travelOrderLinksDTO, Badge badge, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badge = travelOrderLinksDTO.status;
        }
        if ((i11 & 2) != 0) {
            list = travelOrderLinksDTO.buttons;
        }
        return travelOrderLinksDTO.copy(badge, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Badge getStatus() {
        return this.status;
    }

    @NotNull
    public final List<ButtonV3Atom.SmallBorderlessButton> component2() {
        return this.buttons;
    }

    @NotNull
    public final TravelOrderLinksDTO copy(Badge status, @NotNull List<ButtonV3Atom.SmallBorderlessButton> buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new TravelOrderLinksDTO(status, buttons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelOrderLinksDTO)) {
            return false;
        }
        TravelOrderLinksDTO travelOrderLinksDTO = (TravelOrderLinksDTO) other;
        return Intrinsics.d(this.status, travelOrderLinksDTO.status) && Intrinsics.d(this.buttons, travelOrderLinksDTO.buttons);
    }

    @NotNull
    public final List<ButtonV3Atom.SmallBorderlessButton> getButtons() {
        return this.buttons;
    }

    public final Badge getStatus() {
        return this.status;
    }

    public int hashCode() {
        Badge badge = this.status;
        return this.buttons.hashCode() + ((badge == null ? 0 : badge.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "TravelOrderLinksDTO(status=" + this.status + ", buttons=" + this.buttons + ")";
    }

    public TravelOrderLinksDTO(Badge badge, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(badge, (i11 & 2) != 0 ? K.f71697a : list);
    }
}
