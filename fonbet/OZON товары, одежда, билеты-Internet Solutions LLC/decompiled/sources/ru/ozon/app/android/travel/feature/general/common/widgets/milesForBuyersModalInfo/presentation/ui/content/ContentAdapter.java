package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.content;

import Ej.b;
import Sc.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.MilesForBuyersModalInfoVO;
import ru.ozon.app.android.travel.molecules.view.progressView.TravelHorizontalProgressView;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u001f\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0007¢\u0006\u0004\b,\u0010-R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020*0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00069²\u0006\f\u00104\u001a\u0002038\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u0002058\nX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/ContentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/BaseContentItemHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/TextHolder;", "createTextHolder", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/TextHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/IconHolder;", "createIconHolder", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/IconHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/ProgressHolder;", "createProgressHolder", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/ProgressHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/SeparatorHolder;", "createSeparatorHolder", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/SeparatorHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/CellHolder;", "createCellHolder", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/CellHolder;", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/BaseContentItemHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/BaseContentItemHolder;I)V", "getItemCount", "()I", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem;", "list", "submitList", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "", "items", "Ljava/util/List;", "Companion", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "Lru/ozon/uni/android/cell/CellView;", "cellView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentAdapter extends RecyclerView.g<BaseContentItemHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final List<MilesForBuyersModalInfoVO.ContentItem> items;
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {N.g(new C(ContentAdapter.class, "textView", "<v#0>", 0)), N.g(new C(ContentAdapter.class, "iconView", "<v#1>", 0)), N.g(new C(ContentAdapter.class, "cellView", "<v#2>", 0))};

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/ContentAdapter$Companion;", "", "<init>", "()V", "VIEW_TYPE_TEXT_ITEM", "", "VIEW_TYPE_ICON_ITEM", "VIEW_TYPE_PROGRESS_ITEM", "VIEW_TYPE_SEPARATOR_ITEM", "VIEW_TYPE_CELL_ITEM", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.items = new ArrayList();
    }

    private final CellHolder createCellHolder(Context context) {
        return new CellHolder(createCellHolder$lambda$8(new PreCreationViewPoolDelegate(context, N.b(CellView.class), new ContentAdapter$createCellHolder$$inlined$preCreationViewPool$default$1(context), new ContentAdapter$createCellHolder$$inlined$preCreationViewPool$default$2())), this.actionHandler);
    }

    private static final CellView createCellHolder$lambda$8(PreCreationViewPoolDelegate<CellView> preCreationViewPoolDelegate) {
        return preCreationViewPoolDelegate.getValue(null, $$delegatedProperties[2]);
    }

    private final IconHolder createIconHolder(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        PreCreationViewPoolDelegate preCreationViewPoolDelegate = new PreCreationViewPoolDelegate(context, N.b(IconView.class), new ContentAdapter$createIconHolder$$inlined$preCreationViewPool$default$1(context), new ContentAdapter$createIconHolder$$inlined$preCreationViewPool$default$2());
        frameLayout.addView(createIconHolder$lambda$4(preCreationViewPoolDelegate));
        return new IconHolder(frameLayout, createIconHolder$lambda$4(preCreationViewPoolDelegate));
    }

    private static final IconView createIconHolder$lambda$4(PreCreationViewPoolDelegate<IconView> preCreationViewPoolDelegate) {
        return preCreationViewPoolDelegate.getValue(null, $$delegatedProperties[1]);
    }

    private final ProgressHolder createProgressHolder(Context context) {
        TravelHorizontalProgressView travelHorizontalProgressView = new TravelHorizontalProgressView(context);
        travelHorizontalProgressView.setLayoutParams(new ViewGroup.LayoutParams(-1, ResourceExtKt.toPx(26, context)));
        return new ProgressHolder(travelHorizontalProgressView);
    }

    private final SeparatorHolder createSeparatorHolder(Context context) {
        Space space = new Space(context);
        space.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        return new SeparatorHolder(space);
    }

    private final TextHolder createTextHolder(Context context) {
        return new TextHolder(createTextHolder$lambda$1(new PreCreationViewPoolDelegate(context, N.b(TextAtomV2View.class), new ContentAdapter$createTextHolder$$inlined$preCreationViewPool$default$1(context), new ContentAdapter$createTextHolder$$inlined$preCreationViewPool$default$2())));
    }

    private static final TextAtomV2View createTextHolder$lambda$1(PreCreationViewPoolDelegate<? extends TextAtomV2View> preCreationViewPoolDelegate) {
        return preCreationViewPoolDelegate.getValue(null, $$delegatedProperties[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        MilesForBuyersModalInfoVO.ContentItem contentItem = this.items.get(position);
        if (contentItem instanceof MilesForBuyersModalInfoVO.ContentItem.TextItem) {
            return 0;
        }
        if (contentItem instanceof MilesForBuyersModalInfoVO.ContentItem.IconItem) {
            return 1;
        }
        if (contentItem instanceof MilesForBuyersModalInfoVO.ContentItem.ProgressItem) {
            return 2;
        }
        if (contentItem instanceof MilesForBuyersModalInfoVO.ContentItem.SeparatorItem) {
            return 3;
        }
        if (contentItem instanceof MilesForBuyersModalInfoVO.ContentItem.CellItem) {
            return 4;
        }
        throw new o();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(@NotNull List<? extends MilesForBuyersModalInfoVO.ContentItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.items.clear();
        this.items.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseContentItemHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseContentItemHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        if (viewType == 0) {
            Intrinsics.f(context);
            return createTextHolder(context);
        }
        if (viewType == 1) {
            Intrinsics.f(context);
            return createIconHolder(context);
        }
        if (viewType == 2) {
            Intrinsics.f(context);
            return createProgressHolder(context);
        }
        if (viewType == 3) {
            Intrinsics.f(context);
            return createSeparatorHolder(context);
        }
        if (viewType != 4) {
            throw new IllegalArgumentException(b.a(viewType, "Unknown viewType: "));
        }
        Intrinsics.f(context);
        return createCellHolder(context);
    }
}
