package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems;

import Lc.a;
import Ns.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/LegendV2VI;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2Item;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "price", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "image", "Lru/ozon/uni/atoms/data/button/Icon;", "selectionIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "getImage", "()Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "Lru/ozon/uni/atoms/data/button/Icon;", "getSelectionIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LegendV2VI implements FlightSeatsSchemeV2Item {
    public static final int $stable = (AtomAction.$stable | Icon.$stable) | ThemeImageV1VO.$stable;
    private final AtomAction action;

    @NotNull
    private final String id;

    @NotNull
    private final ThemeImageV1VO image;

    @NotNull
    private final TextDTO price;

    @NotNull
    private final Icon selectionIcon;

    @NotNull
    private final TextDTO title;

    public LegendV2VI(@NotNull String id2, @NotNull TextDTO title, @NotNull TextDTO price, @NotNull ThemeImageV1VO image, @NotNull Icon selectionIcon, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(selectionIcon, "selectionIcon");
        this.id = id2;
        this.title = title;
        this.price = price;
        this.image = image;
        this.selectionIcon = selectionIcon;
        this.action = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegendV2VI)) {
            return false;
        }
        LegendV2VI legendV2VI = (LegendV2VI) other;
        return Intrinsics.d(this.id, legendV2VI.id) && Intrinsics.d(this.title, legendV2VI.title) && Intrinsics.d(this.price, legendV2VI.price) && Intrinsics.d(this.image, legendV2VI.image) && Intrinsics.d(this.selectionIcon, legendV2VI.selectionIcon) && Intrinsics.d(this.action, legendV2VI.action);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2Item
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final ThemeImageV1VO getImage() {
        return this.image;
    }

    @NotNull
    public final TextDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final Icon getSelectionIcon() {
        return this.selectionIcon;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = a.a(this.selectionIcon, (this.image.hashCode() + b.a(this.price, b.a(this.title, this.id.hashCode() * 31, 31), 31)) * 31, 31);
        AtomAction atomAction = this.action;
        return a11 + (atomAction == null ? 0 : atomAction.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.price;
        ThemeImageV1VO themeImageV1VO = this.image;
        Icon icon = this.selectionIcon;
        AtomAction atomAction = this.action;
        StringBuilder b11 = Co.a.b("LegendV2VI(id=", textDTO, str, ", title=", ", price=");
        b11.append(textDTO2);
        b11.append(", image=");
        b11.append(themeImageV1VO);
        b11.append(", selectionIcon=");
        b11.append(icon);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(")");
        return b11.toString();
    }
}
