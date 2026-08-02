package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.CarText;
import com.ironsource.X3;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.n23;
import xsna.rs9;

/* loaded from: classes11.dex */
public final class SectionedItemList {

    @Nullable
    private final CarText mHeader;

    @Nullable
    private final ItemList mItemList;

    private SectionedItemList(@Nullable ItemList itemList, @Nullable CarText carText) {
        this.mItemList = itemList;
        this.mHeader = carText;
    }

    @NonNull
    public static SectionedItemList create(@NonNull ItemList itemList, @NonNull CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        CarText create = CarText.create(charSequence);
        rs9 rs9Var = rs9.b;
        rs9Var.getClass();
        rs9Var.a(create.getSpans());
        Iterator<List<CarText.SpanWrapper>> it = create.getSpansForVariants().iterator();
        while (it.hasNext()) {
            rs9Var.a(it.next());
        }
        Objects.requireNonNull(itemList);
        return new SectionedItemList(itemList, create);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionedItemList)) {
            return false;
        }
        SectionedItemList sectionedItemList = (SectionedItemList) obj;
        return Objects.equals(this.mItemList, sectionedItemList.mItemList) && Objects.equals(this.mHeader, sectionedItemList.mHeader);
    }

    @NonNull
    public CarText getHeader() {
        CarText carText = this.mHeader;
        Objects.requireNonNull(carText);
        return carText;
    }

    @NonNull
    public ItemList getItemList() {
        ItemList itemList = this.mItemList;
        Objects.requireNonNull(itemList);
        return itemList;
    }

    public int hashCode() {
        return Objects.hash(this.mItemList, this.mHeader);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        sb.append(this.mItemList);
        sb.append(", has header: ");
        return n23.b(sb, this.mHeader != null, X3.j.e);
    }

    private SectionedItemList() {
        this.mItemList = null;
        this.mHeader = null;
    }
}
