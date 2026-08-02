package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation;

import B90.C2619v;
import K00.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/DropDownItem;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainListItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "iconRes", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIconRes", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DropDownItem implements TrainListItem {
    public static final int $stable = TextAtom.$stable;
    private final int iconRes;
    private final int id;

    @NotNull
    private final TextAtom text;

    public DropDownItem(int i11, @NotNull TextAtom text, int i12) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = i11;
        this.text = text;
        this.iconRes = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropDownItem)) {
            return false;
        }
        DropDownItem dropDownItem = (DropDownItem) other;
        return this.id == dropDownItem.id && Intrinsics.d(this.text, dropDownItem.text) && this.iconRes == dropDownItem.iconRes;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TrainListItem
    public int getId() {
        return this.id;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public int hashCode() {
        return Integer.hashCode(this.iconRes) + C2619v.b(Integer.hashCode(this.id) * 31, 31, this.text);
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        TextAtom textAtom = this.text;
        int i12 = this.iconRes;
        StringBuilder sb2 = new StringBuilder("DropDownItem(id=");
        sb2.append(i11);
        sb2.append(", text=");
        sb2.append(textAtom);
        sb2.append(", iconRes=");
        return b.e(i12, ")", sb2);
    }
}
