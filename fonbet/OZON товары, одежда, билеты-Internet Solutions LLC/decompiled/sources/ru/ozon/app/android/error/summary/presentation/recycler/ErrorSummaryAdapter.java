package ru.ozon.app.android.error.summary.presentation.recycler;

import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.error.summary.presentation.recycler.ErrorSummaryItem;
import ru.ozon.uni.android.cell.disclosure.disclosureTitleSubtitleCell.DisclosureTitleSubtitleCellView;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem;", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryViewHolder;", "Lkotlin/Function0;", "", "navigateToAbExperimentsScreen", "navigateToFeaturesScreen", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryViewHolder;I)V", "Lkotlin/jvm/functions/Function0;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSummaryAdapter extends t<ErrorSummaryItem, ErrorSummaryViewHolder> {

    @NotNull
    private final Function0<Unit> navigateToAbExperimentsScreen;

    @NotNull
    private final Function0<Unit> navigateToFeaturesScreen;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorSummaryType.values().length];
            try {
                iArr[ErrorSummaryType.CELL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorSummaryType.EXPERIMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorSummaryType.FEATURE_FLAGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorSummaryAdapter(@NotNull Function0<Unit> navigateToAbExperimentsScreen, @NotNull Function0<Unit> navigateToFeaturesScreen) {
        super(new ErrorSummaryDiffUtilCallback());
        Intrinsics.checkNotNullParameter(navigateToAbExperimentsScreen, "navigateToAbExperimentsScreen");
        Intrinsics.checkNotNullParameter(navigateToFeaturesScreen, "navigateToFeaturesScreen");
        this.navigateToAbExperimentsScreen = navigateToAbExperimentsScreen;
        this.navigateToFeaturesScreen = navigateToFeaturesScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ErrorSummaryItem item = getItem(position);
        if (item instanceof ErrorSummaryItem.Ab.Experiments) {
            return ErrorSummaryType.EXPERIMENTS.ordinal();
        }
        if (item instanceof ErrorSummaryItem.Ab.FeatureFlags) {
            return ErrorSummaryType.FEATURE_FLAGS.ordinal();
        }
        if (item instanceof ErrorSummaryItem.Cell) {
            return ErrorSummaryType.CELL.ordinal();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ErrorSummaryViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ErrorSummaryItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ErrorSummaryViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i11 = WhenMappings.$EnumSwitchMapping$0[ErrorSummaryType.values()[viewType].ordinal()];
        if (i11 == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TitleSubtitleCellView titleSubtitleCellView = new TitleSubtitleCellView(context, null, 0, 0, null, false, 62, null);
            titleSubtitleCellView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new ErrorSummaryCellViewHolder(titleSubtitleCellView);
        }
        if (i11 == 2) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView = new DisclosureTitleSubtitleCellView(context2, null, 0, 0, null, false, 62, null);
            disclosureTitleSubtitleCellView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new ErrorSummaryAbViewHolder(disclosureTitleSubtitleCellView, this.navigateToAbExperimentsScreen);
        }
        if (i11 != 3) {
            throw new o();
        }
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView2 = new DisclosureTitleSubtitleCellView(context3, null, 0, 0, null, false, 62, null);
        disclosureTitleSubtitleCellView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new ErrorSummaryAbViewHolder(disclosureTitleSubtitleCellView2, this.navigateToFeaturesScreen);
    }
}
