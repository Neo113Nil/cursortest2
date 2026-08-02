package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation;

import WZ.l;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
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
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.fresh.feature.b2b.R$drawable;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetFaqBinding;
import ru.ozon.app.android.fresh.feature.b2b.utils.UtilsKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.data.FaqAnswerExpandedInfo;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqViewHolder;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.uikit.view.recycler.decoration.SkipLastDividerItemDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.controls.chip.ChipView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u00013\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001c\u0010 J\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetFaqBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetFaqBinding;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqViewModel;)V", "", "saveTabsScrollPosition", "()V", "item", "updateUi", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqVO;)V", "submitItemsAdapter", "", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", DynamicElementDTO.TABS, "setupTabsActions", "(Ljava/util/List;)V", "removeRunnables", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqVO;Ll20/d;Ljava/lang/Object;)V", "onDetach", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetFaqBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandlerTabs", "Lkotlin/jvm/functions/Function1;", "actionHandlerLinks", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqItemsAdapter;", "itemsAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqItemsAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "tabsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/uikit/view/recycler/decoration/SkipLastDividerItemDecoration;", "itemsBlockDecoration", "Lru/ozon/app/android/uikit/view/recycler/decoration/SkipLastDividerItemDecoration;", "ru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqViewHolder$tabsHorizontalDecorator$1", "tabsHorizontalDecorator", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqViewHolder$tabsHorizontalDecorator$1;", "Ljava/lang/Runnable;", "scrollTabsToLastPositionRunnable", "Ljava/lang/Runnable;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FaqViewHolder extends k<FaqVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandlerLinks;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandlerTabs;

    @NotNull
    private final WidgetFaqBinding binding;

    @NotNull
    private final FaqItemsAdapter itemsAdapter;

    @NotNull
    private final SkipLastDividerItemDecoration itemsBlockDecoration;

    @NotNull
    private final ComposerReferences references;
    private Runnable scrollTabsToLastPositionRunnable;

    @NotNull
    private final AtomsAdapter tabsAdapter;

    @NotNull
    private final FaqViewHolder$tabsHorizontalDecorator$1 tabsHorizontalDecorator;

    @NotNull
    private final FaqViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqViewHolder$tabsHorizontalDecorator$1, ru.ozon.uni.atoms.af.HorizontalAtomsDecorator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FaqViewHolder(@NotNull WidgetFaqBinding binding, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics, @NotNull FaqViewModel viewModel) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.references = references;
        this.viewModel = viewModel;
        this.actionHandlerTabs = new ActionHandler.Builder(references, this).onPreProcess(new FaqViewHolder$actionHandlerTabs$1(this)).buildHandler();
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).onPreProcess(new FaqViewHolder$actionHandlerLinks$1(this)).buildHandler();
        this.actionHandlerLinks = buildHandler;
        FaqItemsAdapter faqItemsAdapter = new FaqItemsAdapter(buildHandler, new FaqViewHolder$itemsAdapter$1(viewModel), tokenizedAnalytics);
        this.itemsAdapter = faqItemsAdapter;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.tabsAdapter = atomsAdapter;
        SkipLastDividerItemDecoration skipLastDividerItemDecoration = new SkipLastDividerItemDecoration(getContext(), 1);
        Drawable drawable = a.getDrawable(getContext(), R$drawable.item_divider);
        if (drawable != null) {
            skipLastDividerItemDecoration.setDrawable(drawable);
        }
        this.itemsBlockDecoration = skipLastDividerItemDecoration;
        ?? r12 = new HorizontalAtomsDecorator() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqViewHolder$tabsHorizontalDecorator$1
            @Override // ru.ozon.uni.atoms.af.CommonAtomDecorator
            public void decorate(Canvas canvas, Rect rect, int i11, boolean z11) {
                HorizontalAtomsDecorator.DefaultImpls.decorate(this, canvas, rect, i11, z11);
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalAtomsDecorator
            public LinearLayout.LayoutParams modifyHorizontalLayoutParams(LinearLayout.LayoutParams lp, AtomDTO data, int position, boolean last) {
                Intrinsics.checkNotNullParameter(lp, "lp");
                Intrinsics.checkNotNullParameter(data, "data");
                if (position != 0) {
                    lp.leftMargin = Dimens.INSTANCE.getDP_8();
                }
                return lp;
            }
        };
        this.tabsHorizontalDecorator = r12;
        RecyclerView recyclerView = binding.recyclerView;
        Intrinsics.f(recyclerView);
        UtilsKt.setColoredDrawableBackground(recyclerView, R$color.bg_secondary, ResourceExtKt.toPxF(20));
        recyclerView.setAdapter(faqItemsAdapter);
        recyclerView.addItemDecoration(skipLastDividerItemDecoration);
        HorizontalAtomsLayout horizontalAtomsLayout = binding.tabs;
        horizontalAtomsLayout.setDecorator(r12);
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        binding.tabsHSV.setOverScrollMode(2);
    }

    private final void removeRunnables() {
        Runnable runnable = this.scrollTabsToLastPositionRunnable;
        if (runnable != null) {
            this.binding.tabsHSV.removeCallbacks(runnable);
            this.scrollTabsToLastPositionRunnable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveTabsScrollPosition() {
        this.viewModel.saveLastTabsScrollPosition(this.binding.tabsHSV.getScrollX());
    }

    private final void setupTabsActions(List<ChipDTO> tabs) {
        HorizontalAtomsLayout tabs2 = this.binding.tabs;
        Intrinsics.checkNotNullExpressionValue(tabs2, "tabs");
        int childCount = tabs2.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = tabs2.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            ChipView chipView = childAt instanceof ChipView ? (ChipView) childAt : null;
            if (chipView != null) {
                chipView.setOnSelect(new FaqViewHolder$setupTabsActions$1$1$1(tabs, i11, this));
                chipView.setUnselectByClick(false);
            }
        }
    }

    private final void submitItemsAdapter(FaqVO item) {
        List<FaqAnswerExpandedInfo> faqExpandedInfoList = this.viewModel.getFaqExpandedInfoList();
        ArrayList arrayList = new ArrayList(C7714v.z(faqExpandedInfoList, 10));
        Iterator<T> it = faqExpandedInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(((FaqAnswerExpandedInfo) it.next()).getFaqItem());
        }
        FaqItemsAdapter faqItemsAdapter = this.itemsAdapter;
        List<FaqVO.FaqItemVO> items = item.getItems();
        ArrayList arrayList2 = new ArrayList(C7714v.z(items, 10));
        for (FaqVO.FaqItemVO faqItemVO : items) {
            arrayList2.add(new FaqAnswerExpandedInfo(faqItemVO, arrayList.contains(faqItemVO)));
        }
        faqItemsAdapter.submitList(arrayList2);
    }

    private final void updateUi(FaqVO item) {
        submitItemsAdapter(item);
        this.tabsAdapter.bind(getContext(), item.getTabs());
        final int lastTabsScrollPosition = this.viewModel.getLastTabsScrollPosition();
        if (lastTabsScrollPosition != 0) {
            removeRunnables();
            Runnable runnable = new Runnable() { // from class: Vu.a
                @Override // java.lang.Runnable
                public final void run() {
                    FaqViewHolder.updateUi$lambda$4(FaqViewHolder.this, lastTabsScrollPosition);
                }
            };
            this.scrollTabsToLastPositionRunnable = runnable;
            this.binding.tabsHSV.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUi$lambda$4(FaqViewHolder faqViewHolder, int i11) {
        faqViewHolder.binding.tabsHSV.scrollTo(i11, 0);
        faqViewHolder.viewModel.discardLastTabsScrollPosition();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        saveTabsScrollPosition();
        removeRunnables();
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FaqVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FaqVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            updateUi(item);
            setupTabsActions(item.getTabs());
        }
    }
}
