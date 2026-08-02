package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.alk;
import xsna.h5s;
import xsna.ktx;
import xsna.nb80;
import xsna.u680;
import xsna.z280;

/* loaded from: classes11.dex */
public final class ItemList {
    private final List<ktx> mItems;

    @Nullable
    private final CarText mNoItemsMessage;

    @Nullable
    private final u680 mOnItemVisibilityChangedDelegate;

    @Nullable
    private final nb80 mOnSelectedDelegate;
    private final int mSelectedIndex;

    public static final class a {
        public final ArrayList a;
        public final int b;

        @Nullable
        public final nb80 c;

        @Nullable
        public final u680 d;

        @Nullable
        public final CarText e;

        public a(@NonNull ItemList itemList) {
            this.b = itemList.getSelectedIndex();
            this.c = itemList.getOnSelectedDelegate();
            this.d = itemList.getOnItemVisibilityChangedDelegate();
            this.e = itemList.getNoItemsMessage();
            this.a = new ArrayList(itemList.getItems());
        }
    }

    public interface b {
    }

    public interface c {
    }

    public ItemList(a aVar) {
        this.mSelectedIndex = aVar.b;
        this.mItems = alk.H(aVar.a);
        this.mNoItemsMessage = aVar.e;
        this.mOnSelectedDelegate = aVar.c;
        this.mOnItemVisibilityChangedDelegate = aVar.d;
    }

    @Nullable
    public static z280 getOnClickDelegate(ktx ktxVar) {
        if (ktxVar instanceof Row) {
            return ((Row) ktxVar).getOnClickDelegate();
        }
        if (ktxVar instanceof GridItem) {
            return ((GridItem) ktxVar).getOnClickDelegate();
        }
        return null;
    }

    @Nullable
    public static Toggle getToggle(ktx ktxVar) {
        if (ktxVar instanceof Row) {
            return ((Row) ktxVar).getToggle();
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemList)) {
            return false;
        }
        ItemList itemList = (ItemList) obj;
        if (this.mSelectedIndex == itemList.mSelectedIndex && Objects.equals(this.mItems, itemList.mItems)) {
            if (Boolean.valueOf(this.mOnSelectedDelegate == null).equals(Boolean.valueOf(itemList.mOnSelectedDelegate == null))) {
                if (Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null).equals(Boolean.valueOf(itemList.mOnItemVisibilityChangedDelegate == null)) && Objects.equals(this.mNoItemsMessage, itemList.mNoItemsMessage)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NonNull
    public List<ktx> getItems() {
        List<ktx> list = this.mItems;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    @Nullable
    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    @Nullable
    public u680 getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    @Nullable
    public nb80 getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    @NonNull
    public a toBuilder() {
        return new a(this);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        List<ktx> list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        return h5s.c(this.mSelectedIndex, X3.j.e, sb);
    }

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
