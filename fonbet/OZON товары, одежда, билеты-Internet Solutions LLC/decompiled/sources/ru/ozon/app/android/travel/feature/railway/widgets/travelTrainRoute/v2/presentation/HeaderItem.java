package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/HeaderItem;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainListItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HeaderItem implements TrainListItem {
    public static final int $stable = TextAtom.$stable;
    private final int id;

    @NotNull
    private final TextAtom text;

    public HeaderItem(int i11, @NotNull TextAtom text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = i11;
        this.text = text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderItem)) {
            return false;
        }
        HeaderItem headerItem = (HeaderItem) other;
        return this.id == headerItem.id && Intrinsics.d(this.text, headerItem.text);
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
        return this.text.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "HeaderItem(id=" + this.id + ", text=" + this.text + ")";
    }
}
