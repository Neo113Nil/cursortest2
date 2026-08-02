package ru.ozon.app.android.pdp.widgets.aspectsV4.presentation;

import C.g0;
import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.aspectsV4.AspectsV4ScrollToSelectedDelegateImpl;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv.AspectsV4ImageAdapter;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv.AspectsV4ImageConst;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010 \u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R&\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00140&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageListViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO;", "", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "isFlexbox", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst;", "imageSizes", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;ZLru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "", "index", "itemWidth", "scrollToSelectedAspect", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst;", "LSc/j;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "LSc/j;", "Landroid/graphics/drawable/LayerDrawable;", "fgImageDrawable", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageAdapter;", "adapter", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageAdapter;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV4ImageListViewHolder extends k<AspectsV4ImageVO> {
    private final /* synthetic */ AspectsV4ScrollToSelectedDelegateImpl $$delegate_0;

    @NotNull
    private final InterfaceC4008j<Function1<AtomAction, Unit>> actionHandler;

    @NotNull
    private final AspectsV4ImageAdapter adapter;

    @NotNull
    private final InterfaceC4008j<LayerDrawable> fgImageDrawable;

    @NotNull
    private final AspectsV4ImageConst imageSizes;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Parcelable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.AspectsV4ImageListViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Parcelable> {
        final /* synthetic */ RecyclerView $recyclerView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RecyclerView recyclerView) {
            super(0);
            this.$recyclerView = recyclerView;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Parcelable invoke() {
            RecyclerView.o layoutManager = this.$recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                return linearLayoutManager.onSaveInstanceState();
            }
            return null;
        }
    }

    public /* synthetic */ AspectsV4ImageListViewHolder(RecyclerView recyclerView, ComposerReferences composerReferences, l lVar, boolean z11, AspectsV4ImageConst aspectsV4ImageConst, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(recyclerView, composerReferences, lVar, (i11 & 8) != 0 ? false : z11, aspectsV4ImageConst);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(AspectsV4ImageListViewHolder aspectsV4ImageListViewHolder, AspectsV4ImageVO aspectsV4ImageVO) {
        aspectsV4ImageListViewHolder.scrollToSelectedAspect(aspectsV4ImageListViewHolder.recyclerView, aspectsV4ImageVO.getScrollPosition(), aspectsV4ImageListViewHolder.imageSizes.getImageWidth());
    }

    public void scrollToSelectedAspect(@NotNull RecyclerView recyclerView, int i11, int i12) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        this.$$delegate_0.scrollToSelectedAspect(recyclerView, i11, i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsV4ImageListViewHolder(@NotNull RecyclerView recyclerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, boolean z11, @NotNull AspectsV4ImageConst imageSizes) {
        super(recyclerView);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(imageSizes, "imageSizes");
        this.$$delegate_0 = new AspectsV4ScrollToSelectedDelegateImpl(0, new AnonymousClass1(recyclerView), 1, null);
        this.recyclerView = recyclerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.imageSizes = imageSizes;
        InterfaceC4008j<Function1<AtomAction, Unit>> unsafeLazy = LazyUtilsKt.unsafeLazy(new AspectsV4ImageListViewHolder$actionHandler$1(refs, this));
        this.actionHandler = unsafeLazy;
        InterfaceC4008j<LayerDrawable> unsafeLazy2 = LazyUtilsKt.unsafeLazy(new AspectsV4ImageListViewHolder$fgImageDrawable$1(this));
        this.fgImageDrawable = unsafeLazy2;
        AspectsV4ImageAdapter aspectsV4ImageAdapter = new AspectsV4ImageAdapter(tokenizedAnalytics, refs.getController(), unsafeLazy, unsafeLazy2, z11, imageSizes);
        this.adapter = aspectsV4ImageAdapter;
        recyclerView.setAdapter(aspectsV4ImageAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AspectsV4ImageVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.submitList(item.getVariants(), new g0(5, this, item));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AspectsV4ImageVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getWidgetTokenizedEvent());
    }
}
