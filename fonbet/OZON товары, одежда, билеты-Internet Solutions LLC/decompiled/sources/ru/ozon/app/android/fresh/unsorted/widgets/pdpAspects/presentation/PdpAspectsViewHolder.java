package ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation;

import A00.a;
import Dx.b;
import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import WZ.t;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import i10.h;
import i10.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.domain.PdpAspectsVO;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation.recyclerview.AspectsItemAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010#\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R'\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/PdpAspectsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/PdpAspectsView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/PdpAspectsView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect;", "items", "Landroid/os/Parcelable;", "scrollState", "", "submitList", "(Ljava/util/List;Landroid/os/Parcelable;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "refreshWithScroll", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/PdpAspectsView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "cachedScrollState", "Landroid/os/Parcelable;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/recyclerview/AspectsItemAdapter;", "adapter$delegate", "getAdapter", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/recyclerview/AspectsItemAdapter;", "adapter", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpAspectsViewHolder extends k<PdpAspectsVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j adapter;
    private Parcelable cachedScrollState;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final PdpAspectsView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpAspectsViewHolder(@NotNull PdpAspectsView view, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = Sc.k.b(new PdpAspectsViewHolder$actionHandler$2(this));
        RecyclerView aspectsListView = view.getAspectsListView();
        this.recyclerView = aspectsListView;
        this.adapter = Sc.k.b(new PdpAspectsViewHolder$adapter$2(this));
        aspectsListView.setAdapter(getAdapter());
        aspectsListView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation.PdpAspectsViewHolder.1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                RecyclerView.o layoutManager;
                Parcelable onSaveInstanceState;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState != 0 || (layoutManager = recyclerView.getLayoutManager()) == null || (onSaveInstanceState = layoutManager.onSaveInstanceState()) == null) {
                    return;
                }
                PdpAspectsViewHolder.this.cachedScrollState = onSaveInstanceState;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(PdpAspectsViewHolder pdpAspectsViewHolder, PdpAspectsVO pdpAspectsVO) {
        pdpAspectsViewHolder.submitList(pdpAspectsVO.getItems(), pdpAspectsViewHolder.cachedScrollState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    private final AspectsItemAdapter getAdapter() {
        return (AspectsItemAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean refreshWithScroll(AtomAction action) {
        PdpAspectsVO boundData;
        l.a.b bVar = null;
        AtomAction.Refresh refresh = action instanceof AtomAction.Refresh ? (AtomAction.Refresh) action : null;
        boolean z11 = false;
        if (refresh == null || (boundData = getBoundData()) == null) {
            return false;
        }
        InterfaceC7851b.a.a(this.composerReferences.getController(), refresh.getLink(), null, null, new h.b(new a.C.d(boundData.getScrollWidgetKey().intValue(), (int) this.view.getY(), 28, z11), bVar, 2), 6);
        return true;
    }

    private final void submitList(List<PdpAspectsVO.Aspect> items, Parcelable scrollState) {
        getAdapter().submitList(items, new b(0, this, scrollState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitList$lambda$2(PdpAspectsViewHolder pdpAspectsViewHolder, Parcelable parcelable) {
        RecyclerView.o layoutManager;
        pdpAspectsViewHolder.recyclerView.stopScroll();
        if (parcelable == null || (layoutManager = pdpAspectsViewHolder.recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PdpAspectsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, getActionHandler());
        this.recyclerView.post(new Dx.a(0, this, item));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PdpAspectsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((PdpAspectsViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
