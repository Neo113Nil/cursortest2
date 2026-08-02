package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation;

import B90.C2619v;
import Lc.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainItem;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainListItem;", "", "id", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "<init>", "(ILru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TrainItem implements TrainListItem {
    public static final int $stable = TextAtom.$stable | Icon.$stable;
    private final TextAtom description;

    @NotNull
    private final Icon icon;
    private final int id;

    @NotNull
    private final TextAtom name;

    public TrainItem(int i11, @NotNull Icon icon, @NotNull TextAtom name, TextAtom textAtom) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i11;
        this.icon = icon;
        this.name = name;
        this.description = textAtom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainItem)) {
            return false;
        }
        TrainItem trainItem = (TrainItem) other;
        return this.id == trainItem.id && Intrinsics.d(this.icon, trainItem.icon) && Intrinsics.d(this.name, trainItem.name) && Intrinsics.d(this.description, trainItem.description);
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TrainListItem
    public int getId() {
        return this.id;
    }

    @NotNull
    public final TextAtom getName() {
        return this.name;
    }

    public int hashCode() {
        int b11 = C2619v.b(a.a(this.icon, Integer.hashCode(this.id) * 31, 31), 31, this.name);
        TextAtom textAtom = this.description;
        return b11 + (textAtom == null ? 0 : textAtom.hashCode());
    }

    @NotNull
    public String toString() {
        return "TrainItem(id=" + this.id + ", icon=" + this.icon + ", name=" + this.name + ", description=" + this.description + ")";
    }
}
