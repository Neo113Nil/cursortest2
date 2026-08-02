package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.presentation;

import B90.C2619v;
import Bl.C2639a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/presentation/HotelsMapCardV1VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", AppMeasurementSdk.ConditionalUserProperty.NAME, FormPageDTO.Field.FIELD_TYPE_ADDRESS, "price", "priceDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "actionButton", "<init>", "(JLru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAddress", "getPrice", "getPriceDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsMapCardV1VO implements c {

    @NotNull
    private final ButtonV3Atom.LargeButton actionButton;

    @NotNull
    private final TextAtom address;
    private final Icon icon;
    private final long id;

    @NotNull
    private final TextAtom name;
    private final TextAtom price;
    private final TextAtom priceDescription;

    public HotelsMapCardV1VO(long j11, Icon icon, @NotNull TextAtom name, @NotNull TextAtom address, TextAtom textAtom, TextAtom textAtom2, @NotNull ButtonV3Atom.LargeButton actionButton) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.id = j11;
        this.icon = icon;
        this.name = name;
        this.address = address;
        this.price = textAtom;
        this.priceDescription = textAtom2;
        this.actionButton = actionButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsMapCardV1VO)) {
            return false;
        }
        HotelsMapCardV1VO hotelsMapCardV1VO = (HotelsMapCardV1VO) other;
        return this.id == hotelsMapCardV1VO.id && Intrinsics.d(this.icon, hotelsMapCardV1VO.icon) && Intrinsics.d(this.name, hotelsMapCardV1VO.name) && Intrinsics.d(this.address, hotelsMapCardV1VO.address) && Intrinsics.d(this.price, hotelsMapCardV1VO.price) && Intrinsics.d(this.priceDescription, hotelsMapCardV1VO.priceDescription) && Intrinsics.d(this.actionButton, hotelsMapCardV1VO.actionButton);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final TextAtom getAddress() {
        return this.address;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextAtom getName() {
        return this.name;
    }

    public final TextAtom getPrice() {
        return this.price;
    }

    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Icon icon = this.icon;
        int b11 = C2619v.b(C2619v.b((hashCode + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.name), 31, this.address);
        TextAtom textAtom = this.price;
        int hashCode2 = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.priceDescription;
        return this.actionButton.hashCode() + ((hashCode2 + (textAtom2 != null ? textAtom2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Icon icon = this.icon;
        TextAtom textAtom = this.name;
        TextAtom textAtom2 = this.address;
        TextAtom textAtom3 = this.price;
        TextAtom textAtom4 = this.priceDescription;
        ButtonV3Atom.LargeButton largeButton = this.actionButton;
        StringBuilder sb2 = new StringBuilder("HotelsMapCardV1VO(id=");
        sb2.append(j11);
        sb2.append(", icon=");
        sb2.append(icon);
        C2639a.e(", name=", ", address=", sb2, textAtom, textAtom2);
        C2639a.e(", price=", ", priceDescription=", sb2, textAtom3, textAtom4);
        sb2.append(", actionButton=");
        sb2.append(largeButton);
        sb2.append(")");
        return sb2.toString();
    }
}
