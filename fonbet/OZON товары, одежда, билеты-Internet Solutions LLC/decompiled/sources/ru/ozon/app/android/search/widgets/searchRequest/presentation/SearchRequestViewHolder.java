package ru.ozon.app.android.search.widgets.searchRequest.presentation;

import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.common.BindingViewHolder;
import ru.ozon.app.android.search.databinding.PdpWidgetSearchRequestBinding;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestViewHolder;", "Lru/ozon/app/android/search/common/BindingViewHolder;", "Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestVO;", "Lru/ozon/app/android/search/databinding/PdpWidgetSearchRequestBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestAdapter;", "screenAdapter", "Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestAdapter;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchRequestViewHolder extends BindingViewHolder<SearchRequestVO, PdpWidgetSearchRequestBinding> {

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final SearchRequestAdapter screenAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.widgets.searchRequest.presentation.SearchRequestViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, PdpWidgetSearchRequestBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, PdpWidgetSearchRequestBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/search/databinding/PdpWidgetSearchRequestBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PdpWidgetSearchRequestBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return PdpWidgetSearchRequestBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRequestViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        SearchRequestAdapter searchRequestAdapter = new SearchRequestAdapter(composerReferences.getContainer().g(), new SearchRequestViewHolder$screenAdapter$1(this), new SearchRequestViewHolder$screenAdapter$2(this));
        this.screenAdapter = searchRequestAdapter;
        PdpWidgetSearchRequestBinding binding = getBinding();
        binding.searchRequestsRv.setAdapter(searchRequestAdapter);
        binding.searchRequestsRv.addItemDecoration(new SearchRequestItemDecoration());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchRequestVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        getBinding().titleTv.setText(item.getTitle());
        this.screenAdapter.setItems(item.getItems());
    }
}
