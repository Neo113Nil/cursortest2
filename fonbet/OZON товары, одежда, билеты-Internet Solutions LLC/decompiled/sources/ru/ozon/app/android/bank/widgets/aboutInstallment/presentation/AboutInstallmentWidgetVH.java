package ru.ozon.app.android.bank.widgets.aboutInstallment.presentation;

import FX.a;
import W10.c;
import WZ.t;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.disclosure.DisclosureHolderKt;
import ru.ozon.app.android.bank.databinding.WidgetInstallmentAboutBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.uikit.view.atoms.disclosure.DisclosureView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001$B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/AboutInstallmentWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/AboutInstallmentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/AboutInstallmentVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/AboutInstallmentVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/bank/databinding/WidgetInstallmentAboutBinding;", "binding", "Lru/ozon/app/android/bank/databinding/WidgetInstallmentAboutBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/AboutItemsAdapter;", "aboutsAdapter", "Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/AboutItemsAdapter;", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AboutInstallmentWidgetVH extends k<AboutInstallmentVO> {
    private static int SPACE_ITEM = ResourceExtKt.toPx(4);
    private static int SPACE_ITEM_LARGE = ResourceExtKt.toPx(16);

    @NotNull
    private final AboutItemsAdapter aboutsAdapter;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetInstallmentAboutBinding binding;

    @NotNull
    private final ComposerReferences ref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutInstallmentWidgetVH(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.ref = ref;
        WidgetInstallmentAboutBinding bind = WidgetInstallmentAboutBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        AboutItemsAdapter aboutItemsAdapter = new AboutItemsAdapter(this);
        this.aboutsAdapter = aboutItemsAdapter;
        bind.moreDv.setOnClickListener(new a(this, 10));
        RecyclerView recyclerView = bind.itemsRv;
        recyclerView.setAdapter(aboutItemsAdapter);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new RecyclerView.n() { // from class: ru.ozon.app.android.bank.widgets.aboutInstallment.presentation.AboutInstallmentWidgetVH$2$1
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.A state) {
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
                if (valueOf.intValue() == -1) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    if (intValue == 0) {
                        i15 = AboutInstallmentWidgetVH.SPACE_ITEM_LARGE;
                        outRect.left = i15;
                        i16 = AboutInstallmentWidgetVH.SPACE_ITEM;
                        outRect.right = i16;
                        return;
                    }
                    if (intValue == state.b() - 1) {
                        i13 = AboutInstallmentWidgetVH.SPACE_ITEM;
                        outRect.left = i13;
                        i14 = AboutInstallmentWidgetVH.SPACE_ITEM_LARGE;
                        outRect.right = i14;
                        return;
                    }
                    i11 = AboutInstallmentWidgetVH.SPACE_ITEM;
                    outRect.left = i11;
                    i12 = AboutInstallmentWidgetVH.SPACE_ITEM;
                    outRect.right = i12;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(AboutInstallmentWidgetVH aboutInstallmentWidgetVH, View view) {
        AtomAction action;
        AboutInstallmentVO boundedData = aboutInstallmentWidgetVH.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        aboutInstallmentWidgetVH.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AboutInstallmentVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView titleTv = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextAtomHolderKt.bind$default(titleTv, item.getTitle(), null, 2, null);
        TextAtomView subTitleTv = this.binding.subTitleTv;
        Intrinsics.checkNotNullExpressionValue(subTitleTv, "subTitleTv");
        TextAtomHolderKt.bind$default(subTitleTv, item.getSubTitle(), null, 2, null);
        if (item.getMoreDisclosure() == null) {
            DisclosureView moreDv = this.binding.moreDv;
            Intrinsics.checkNotNullExpressionValue(moreDv, "moreDv");
            ViewExtKt.invisible(moreDv);
        } else {
            DisclosureView moreDv2 = this.binding.moreDv;
            Intrinsics.checkNotNullExpressionValue(moreDv2, "moreDv");
            DisclosureHolderKt.bind$default(moreDv2, item.getMoreDisclosure(), null, 2, null);
        }
        this.aboutsAdapter.submitList(item.getItems());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AboutInstallmentVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
