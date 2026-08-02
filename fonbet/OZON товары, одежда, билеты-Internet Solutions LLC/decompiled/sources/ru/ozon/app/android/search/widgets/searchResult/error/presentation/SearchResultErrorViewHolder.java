package ru.ozon.app.android.search.widgets.searchResult.error.presentation;

import Dy.ViewOnClickListenerC2883a;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.search.common.BindingViewHolder;
import ru.ozon.app.android.search.databinding.WidgetSearchResultErrorLayoutBinding;
import ru.ozon.app.android.search.widgets.searchResult.error.presentation.SearchResultErrorVO;
import ru.ozon.app.android.utils.UriExtKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/error/presentation/SearchResultErrorViewHolder;", "Lru/ozon/app/android/search/common/BindingViewHolder;", "Lru/ozon/app/android/search/widgets/searchResult/error/presentation/SearchResultErrorVO;", "Lru/ozon/app/android/search/databinding/WidgetSearchResultErrorLayoutBinding;", "Landroid/view/View;", "itemView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "", "trackView", "(Lru/ozon/app/android/search/widgets/searchResult/error/presentation/SearchResultErrorVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/searchResult/error/presentation/SearchResultErrorVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultErrorViewHolder extends BindingViewHolder<SearchResultErrorVO, WidgetSearchResultErrorLayoutBinding> {

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.widgets.searchResult.error.presentation.SearchResultErrorViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetSearchResultErrorLayoutBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetSearchResultErrorLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/search/databinding/WidgetSearchResultErrorLayoutBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetSearchResultErrorLayoutBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetSearchResultErrorLayoutBinding.bind(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchResultErrorVO.DeeplinkType.values().length];
            try {
                iArr[SearchResultErrorVO.DeeplinkType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchResultErrorVO.DeeplinkType.REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultErrorViewHolder(@NotNull View itemView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(itemView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(SearchResultErrorVO searchResultErrorVO, SearchResultErrorViewHolder searchResultErrorViewHolder, View view) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[searchResultErrorVO.getType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new o();
            }
            InterfaceC7851b.a.a(searchResultErrorViewHolder.refs.getController(), UriExtKt.removeSchema(searchResultErrorVO.getDeeplink()), null, null, null, 14);
        } else {
            t tokenizedEvent = searchResultErrorVO.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(searchResultErrorViewHolder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
            }
            ComposerNavigator.DefaultImpls.openDeeplink$default(searchResultErrorViewHolder.refs.getNavigator(), searchResultErrorVO.getDeeplink(), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchResultErrorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetSearchResultErrorLayoutBinding binding = getBinding();
        ImageView errorIv = binding.errorIv;
        Intrinsics.checkNotNullExpressionValue(errorIv, "errorIv");
        ImageViewExtKt.load$default(errorIv, item.getImage(), null, null, null, null, false, null, 126, null);
        binding.errorTv.setText(item.getMessage());
        if (h.K(item.getAction()) || h.K(item.getDeeplink())) {
            TextView errorActionTv = binding.errorActionTv;
            Intrinsics.checkNotNullExpressionValue(errorActionTv, "errorActionTv");
            ViewExtKt.gone(errorActionTv);
        } else {
            binding.errorActionTv.setText(item.getAction());
            binding.errorActionTv.setOnClickListener(new ViewOnClickListenerC2883a(4, item, this));
            TextView errorActionTv2 = binding.errorActionTv;
            Intrinsics.checkNotNullExpressionValue(errorActionTv2, "errorActionTv");
            ViewExtKt.show(errorActionTv2);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SearchResultErrorVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
