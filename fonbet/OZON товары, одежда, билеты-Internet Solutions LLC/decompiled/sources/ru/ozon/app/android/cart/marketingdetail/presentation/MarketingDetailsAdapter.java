package ru.ozon.app.android.cart.marketingdetail.presentation;

import Sc.o;
import Ve.C4636t5;
import Xc.a;
import Xc.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.feature.databinding.ItemMarketingDetailActionBinding;
import ru.ozon.app.android.cart.feature.databinding.ItemMarketingDetailTitleBinding;
import ru.ozon.app.android.cart.feature.databinding.ItemMarketingDetailTotalBinding;
import ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailVO;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsVH;", "<init>", "()V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsVH;", "getItemCount", "()I", "holder", "", "onBindViewHolder", "(Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsVH;I)V", "", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem;", "items", "submitList", "(Ljava/util/List;)V", "tryGetItem", "(I)Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem;", "", "Ljava/util/List;", "ViewType", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MarketingDetailsAdapter extends RecyclerView.g<MarketingDetailsVH> {

    @NotNull
    private final List<MarketingDetailVO.DetailListItem> items = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", SelectionItemDescriptionDTO.TITLE, "ACTION", "TOTAL", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        private final int value;
        public static final ViewType TITLE = new ViewType(SelectionItemDescriptionDTO.TITLE, 0, 1);
        public static final ViewType ACTION = new ViewType("ACTION", 1, 2);
        public static final ViewType TOTAL = new ViewType("TOTAL", 2, 3);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{TITLE, ACTION, TOTAL};
        }

        static {
            ViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewType(String str, int i11, int i12) {
            this.value = i12;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewType.TOTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return this.items.get(position).getViewType().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public MarketingDetailsVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        for (ViewType viewType2 : ViewType.values()) {
            if (viewType2.getValue() == viewType) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[viewType2.ordinal()];
                if (i11 == 1) {
                    ItemMarketingDetailTitleBinding inflate = ItemMarketingDetailTitleBinding.inflate(a11, parent, false);
                    Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                    return new MarketingTitleVH(inflate);
                }
                if (i11 == 2) {
                    ItemMarketingDetailActionBinding inflate2 = ItemMarketingDetailActionBinding.inflate(a11, parent, false);
                    Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
                    return new MarketingActionVH(inflate2);
                }
                if (i11 != 3) {
                    throw new o();
                }
                ItemMarketingDetailTotalBinding inflate3 = ItemMarketingDetailTotalBinding.inflate(a11, parent, false);
                Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
                return new MarketingTotalVH(inflate3);
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final void submitList(@NotNull List<? extends MarketingDetailVO.DetailListItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items.clear();
        this.items.addAll(items);
    }

    public final MarketingDetailVO.DetailListItem tryGetItem(int position) {
        if (((position < 0 || position >= getCardsCount()) ? null : this) != null) {
            return this.items.get(position);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull MarketingDetailsVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }
}
