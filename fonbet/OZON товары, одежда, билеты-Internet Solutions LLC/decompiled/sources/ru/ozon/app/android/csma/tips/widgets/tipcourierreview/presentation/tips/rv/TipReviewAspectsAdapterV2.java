package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips.rv;

import Sc.o;
import Xc.a;
import Xc.b;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.R$layout;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewVO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewViewModel;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleListAdapter;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB3\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/tips/rv/TipReviewAspectsAdapterV2;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleListAdapter;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/tips/rv/BaseTipsReviewVH;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModel;", "viewModel", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewMapper;", "mapper", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModel;Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewMapper;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/tips/rv/BaseTipsReviewVH;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/tips/rv/BaseTipsReviewVH;I)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModel;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewMapper;", "TipsItemType", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipReviewAspectsAdapterV2 extends LifecycleListAdapter<TipCourierReviewVO.BaseCourierTipVO, BaseTipsReviewVH> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TipCourierReviewMapper mapper;

    @NotNull
    private final TipCourierReviewViewModel viewModel;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/tips/rv/TipReviewAspectsAdapterV2$TipsItemType;", "", "type", "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "TIP", "INPUT", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TipsItemType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TipsItemType[] $VALUES;
        private final int type;
        public static final TipsItemType TIP = new TipsItemType("TIP", 0, 0);
        public static final TipsItemType INPUT = new TipsItemType("INPUT", 1, 1);

        private static final /* synthetic */ TipsItemType[] $values() {
            return new TipsItemType[]{TIP, INPUT};
        }

        static {
            TipsItemType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TipsItemType(String str, int i11, int i12) {
            this.type = i12;
        }

        public static TipsItemType valueOf(String str) {
            return (TipsItemType) Enum.valueOf(TipsItemType.class, str);
        }

        public static TipsItemType[] values() {
            return (TipsItemType[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TipReviewAspectsAdapterV2(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull TipCourierReviewViewModel viewModel, @NotNull TipCourierReviewMapper mapper, @NotNull J containerViewLifecycleOwner) {
        super(new TipsDiffCallback(), containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        this.actionHandler = actionHandler;
        this.viewModel = viewModel;
        this.mapper = mapper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        TipCourierReviewVO.BaseCourierTipVO item = getItem(position);
        if (item instanceof TipCourierReviewVO.BaseCourierTipVO.CourierTipVariant) {
            return TipsItemType.TIP.getType();
        }
        if (item instanceof TipCourierReviewVO.BaseCourierTipVO.CourierTipInputStub) {
            return TipsItemType.INPUT.getType();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseTipsReviewVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TipCourierReviewVO.BaseCourierTipVO item = getItem(position);
        Intrinsics.f(item);
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseTipsReviewVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return viewType == TipsItemType.INPUT.getType() ? new TipReviewItemInputV2ViewHolder(ViewGroupExtKt.inflate(parent, R$layout.item_tips_input), this.viewModel, this.mapper) : new TipReviewItemV2ViewHolder(ViewGroupExtKt.inflate(parent, R$layout.item_tips_text), this.actionHandler);
    }
}
