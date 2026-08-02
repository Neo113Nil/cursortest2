package ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation;

import Sc.o;
import Ve.C4636t5;
import WZ.l;
import Xc.a;
import Xc.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.databinding.ItemSplitDetailHorizontalBinding;
import ru.ozon.app.android.checkout.databinding.ItemSplitDetailVerticalBinding;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitDetailV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001e\u001fB/\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;LWZ/l;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Landroidx/lifecycle/J;", "Companion", "SplitsDiffUtilCallback", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitsAdapter extends t<SplitDetailV2VO.Split, RecyclerView.C> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitsAdapter$Companion;", "", "<init>", "()V", "SplitViewType", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitsAdapter$Companion$SplitViewType;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL_TYPE", "VERTICAL_TYPE", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SplitViewType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ SplitViewType[] $VALUES;
            public static final SplitViewType HORIZONTAL_TYPE = new SplitViewType("HORIZONTAL_TYPE", 0);
            public static final SplitViewType VERTICAL_TYPE = new SplitViewType("VERTICAL_TYPE", 1);

            private static final /* synthetic */ SplitViewType[] $values() {
                return new SplitViewType[]{HORIZONTAL_TYPE, VERTICAL_TYPE};
            }

            static {
                SplitViewType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private SplitViewType(String str, int i11) {
            }

            public static SplitViewType valueOf(String str) {
                return (SplitViewType) Enum.valueOf(SplitViewType.class, str);
            }

            public static SplitViewType[] values() {
                return (SplitViewType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitsAdapter$SplitsDiffUtilCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split;Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split;)Z", "areContentsTheSame", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class SplitsDiffUtilCallback extends i.d<SplitDetailV2VO.Split> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull SplitDetailV2VO.Split oldItem, @NotNull SplitDetailV2VO.Split newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull SplitDetailV2VO.Split oldItem, @NotNull SplitDetailV2VO.Split newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof SplitDetailV2VO.Split.Horizontal) && (newItem instanceof SplitDetailV2VO.Split.Horizontal)) {
                return Intrinsics.d(((SplitDetailV2VO.Split.Horizontal) oldItem).getTitle(), ((SplitDetailV2VO.Split.Horizontal) newItem).getTitle());
            }
            if ((oldItem instanceof SplitDetailV2VO.Split.Vertical) && (newItem instanceof SplitDetailV2VO.Split.Vertical)) {
                return Intrinsics.d(((SplitDetailV2VO.Split.Vertical) oldItem).getImage(), ((SplitDetailV2VO.Split.Vertical) newItem).getImage());
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SplitsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull J lifecycleOwner) {
        super(new SplitsDiffUtilCallback());
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.lifecycleOwner = lifecycleOwner;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        SplitDetailV2VO.Split item = getItem(position);
        if (item instanceof SplitDetailV2VO.Split.Horizontal) {
            return Companion.SplitViewType.HORIZONTAL_TYPE.ordinal();
        }
        if (item instanceof SplitDetailV2VO.Split.Vertical) {
            return Companion.SplitViewType.VERTICAL_TYPE.ordinal();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SplitDetailV2VO.Split item = getItem(position);
        if (holder instanceof SplitHorizontalViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitDetailV2VO.Split.Horizontal");
            ((SplitHorizontalViewHolder) holder).bind((SplitDetailV2VO.Split.Horizontal) item);
        } else {
            if (!(holder instanceof SplitVerticalViewHolder)) {
                throw new IllegalStateException("Rfbs Split Error: Unknown split type");
            }
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitDetailV2VO.Split.Vertical");
            ((SplitVerticalViewHolder) holder).bind((SplitDetailV2VO.Split.Vertical) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == Companion.SplitViewType.HORIZONTAL_TYPE.ordinal()) {
            ItemSplitDetailHorizontalBinding inflate = ItemSplitDetailHorizontalBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new SplitHorizontalViewHolder(inflate);
        }
        if (viewType != Companion.SplitViewType.VERTICAL_TYPE.ordinal()) {
            throw new IllegalStateException("Rfbs Split Error: Unknown split type");
        }
        ItemSplitDetailVerticalBinding inflate2 = ItemSplitDetailVerticalBinding.inflate(a11, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
        return new SplitVerticalViewHolder(inflate2, this.actionHandler, this.tokenizedAnalytics, this.lifecycleOwner);
    }
}
