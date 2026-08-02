package ru.ozon.app.android.ugc.core.widgets.listreviews.presentation.sorts;

import Ez.ViewOnClickListenerC2979c;
import WZ.t;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.ListReviewSortsViewModel;
import ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.ListReviewsSortsVO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.databinding.WidgetReviewSortsBinding;
import ru.ozon.app.android.ugc.core.widgets.listreviews.presentation.sorts.ReviewsSortsBottomSheetDialogFragment;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/presentation/sorts/ListReviewsSortsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewsSortsVO;", "Lru/ozon/app/android/ugc/core/databinding/WidgetReviewSortsBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel;", "listReviewSortsViewModel", "<init>", "(Lru/ozon/app/android/ugc/core/databinding/WidgetReviewSortsBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel;)V", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewsSortsVO$Sort;", "sorts", "", "openSortsDialog", "(Ljava/util/List;)V", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "toCellWithSubtitleRadio", "(Ljava/util/List;)Ljava/util/List;", "onAttach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewsSortsVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/core/databinding/WidgetReviewSortsBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/core/widgets/listreviews/presentation/sorts/ReviewsSortsBottomSheetDialogFragment;", "sortsFragment", "Lru/ozon/app/android/ugc/core/widgets/listreviews/presentation/sorts/ReviewsSortsBottomSheetDialogFragment;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ListReviewsSortsViewHolder extends k<ListReviewsSortsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetReviewSortsBinding binding;

    @NotNull
    private final ListReviewSortsViewModel listReviewSortsViewModel;

    @NotNull
    private final ComposerReferences references;
    private ReviewsSortsBottomSheetDialogFragment sortsFragment;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ListReviewsSortsViewHolder(@NotNull WidgetReviewSortsBinding binding, @NotNull ComposerReferences references, @NotNull ListReviewSortsViewModel listReviewSortsViewModel) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(listReviewSortsViewModel, "listReviewSortsViewModel");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.references = references;
        this.listReviewSortsViewModel = listReviewSortsViewModel;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        binding.reviewSortsWidget.setOnClickListener(new ViewOnClickListenerC2979c(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ListReviewsSortsViewHolder listReviewsSortsViewHolder, View view) {
        List<ListReviewsSortsVO.Sort> sorts;
        ListReviewsSortsVO boundedData = listReviewsSortsViewHolder.getBoundedData();
        if (boundedData == null || (sorts = boundedData.getSorts()) == null) {
            return;
        }
        listReviewsSortsViewHolder.openSortsDialog(sorts);
    }

    private final void openSortsDialog(List<ListReviewsSortsVO.Sort> sorts) {
        String[] strArr;
        Object obj;
        List<ListReviewsSortsVO.Sort> sorts2;
        t tokenizedEvent;
        List<ListReviewsSortsVO.Sort> list = sorts;
        Iterator<T> it = list.iterator();
        while (true) {
            strArr = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ListReviewsSortsVO.Sort) obj).getIsSelected()) {
                    break;
                }
            }
        }
        ListReviewsSortsVO.Sort sort = (ListReviewsSortsVO.Sort) obj;
        if (sort != null && (tokenizedEvent = sort.getTokenizedEvent()) != null) {
            TokenizedAnalyticsExtKt.processClickEvents(this.references.getTokenizedAnalytics(), tokenizedEvent);
        }
        ReviewsSortsBottomSheetDialogFragment.Companion companion = ReviewsSortsBottomSheetDialogFragment.INSTANCE;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> cellWithSubtitleRadio = toCellWithSubtitleRadio(sorts);
        Intent intent = new Intent();
        ListReviewsSortsVO boundedData = getBoundedData();
        if (boundedData != null && (sorts2 = boundedData.getSorts()) != null) {
            List<ListReviewsSortsVO.Sort> list2 = sorts2;
            ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((ListReviewsSortsVO.Sort) it2.next()).getSelectAction()));
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        intent.putExtra("ru.ozon.app.android.reviews.widgets.listreviews.presentation.sorts.KEY_SORTS_IS_ACTION_ARRAY", strArr);
        ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((ListReviewsSortsVO.Sort) it3.next()).getDeeplink());
        }
        intent.putExtra("ru.ozon.app.android.commonwidgets.widgets.sortsbottomsheetdialog.KEY_SORTS_DEEPLINK_ARRAY", (String[]) arrayList2.toArray(new String[0]));
        ArrayList arrayList3 = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((ListReviewsSortsVO.Sort) it4.next()).getTokenizedEvent());
        }
        intent.putExtra("ru.ozon.app.android.commonwidgets.widgets.sortsbottomsheetdialog.KEY_SORTS_TRACKING_INFO_ARRAY", (Parcelable[]) arrayList3.toArray(new t[0]));
        Unit unit = Unit.f71690a;
        ReviewsSortsBottomSheetDialogFragment newInstance = companion.newInstance(cellWithSubtitleRadio, intent);
        newInstance.setTargetFragment(this.references.getContainer().c(), 34255);
        newInstance.show(this.references.getContainer().k(), "ReviewsSortsBottomSheetDialogFragment");
        this.sortsFragment = newInstance;
    }

    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> toCellWithSubtitleRadio(List<ListReviewsSortsVO.Sort> list) {
        List<ListReviewsSortsVO.Sort> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ListReviewsSortsVO.Sort sort = (ListReviewsSortsVO.Sort) obj;
            arrayList.add(new CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio(sort.getIsSelected(), true, false, new OzonSpannableString(sort.getName()), null, null, null, null, null, new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, String.valueOf(i11), null, 10, null), i11 == C7714v.P(list), false, null, null, null, 31220, null));
            i11 = i12;
        }
        return arrayList;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        this.listReviewSortsViewModel.actionLiveData().observe(this, new ListReviewsSortsViewHolder$sam$androidx_lifecycle_Observer$0(new ListReviewsSortsViewHolder$onAttach$1(this)));
        super.onAttach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ListReviewsSortsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.updatePadding$default(constraintLayout, 0, 0, 0, item.getBottomPaddingEnabled() ? Dimens.INSTANCE.getDP_16() : 0, 7, null);
        this.listReviewSortsViewModel.initSortItems(item.getSorts());
        this.binding.titleTv.setText(item.getSelectedSortName());
    }
}
