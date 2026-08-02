package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation;

import B90.C2619v;
import Bi.b;
import Lc.a;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TransferItem;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainListItem;", "", "id", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "time", "stationTransition", "<init>", "(ILru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTime", "getStationTransition", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TransferItem implements TrainListItem {
    public static final int $stable = TextAtom.$stable | Icon.$stable;

    @NotNull
    private final Icon icon;
    private final int id;
    private final TextAtom stationTransition;

    @NotNull
    private final TextAtom time;

    @NotNull
    private final TextAtom title;

    public TransferItem(int i11, @NotNull Icon icon, @NotNull TextAtom title, @NotNull TextAtom time, TextAtom textAtom) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(time, "time");
        this.id = i11;
        this.icon = icon;
        this.title = title;
        this.time = time;
        this.stationTransition = textAtom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferItem)) {
            return false;
        }
        TransferItem transferItem = (TransferItem) other;
        return this.id == transferItem.id && Intrinsics.d(this.icon, transferItem.icon) && Intrinsics.d(this.title, transferItem.title) && Intrinsics.d(this.time, transferItem.time) && Intrinsics.d(this.stationTransition, transferItem.stationTransition);
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TrainListItem
    public int getId() {
        return this.id;
    }

    public final TextAtom getStationTransition() {
        return this.stationTransition;
    }

    @NotNull
    public final TextAtom getTime() {
        return this.time;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = C2619v.b(C2619v.b(a.a(this.icon, Integer.hashCode(this.id) * 31, 31), 31, this.title), 31, this.time);
        TextAtom textAtom = this.stationTransition;
        return b11 + (textAtom == null ? 0 : textAtom.hashCode());
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        Icon icon = this.icon;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.time;
        TextAtom textAtom3 = this.stationTransition;
        StringBuilder sb2 = new StringBuilder("TransferItem(id=");
        sb2.append(i11);
        sb2.append(", icon=");
        sb2.append(icon);
        sb2.append(", title=");
        C4636t5.c(", time=", ", stationTransition=", sb2, textAtom, textAtom2);
        return b.g(sb2, textAtom3, ")");
    }
}
