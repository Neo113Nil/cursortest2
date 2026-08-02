package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.presentation;

import Lc0.e;
import W10.c;
import WZ.l;
import WZ.t;
import android.app.Activity;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.app.t;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.crosslink.CrosslinkV3Adapter;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.crosslink.CrosslinkV3Decoration;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.presentation.FullTextSearchHeaderV3VO;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.presentation.FullTextSearchHeaderV3ViewHolder;
import ru.ozon.app.android.search.common.BindingViewHolder;
import ru.ozon.app.android.search.databinding.WidgetFullTextSearchHeaderBinding;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u000e\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` H\u0014¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3ViewHolder;", "Lru/ozon/app/android/search/common/BindingViewHolder;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO;", "Lru/ozon/app/android/search/databinding/WidgetFullTextSearchHeaderBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "minifyLinkViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Landroid/app/Activity;", "activity", "", "shareText", "", "share", "(Landroid/app/Activity;Ljava/lang/String;)V", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO;Ll20/d;)V", "Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "vo", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/crosslink/CrosslinkV3Adapter;", "crosslinkV3Adapter", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/crosslink/CrosslinkV3Adapter;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FullTextSearchHeaderV3ViewHolder extends BindingViewHolder<FullTextSearchHeaderV3VO, WidgetFullTextSearchHeaderBinding> {

    @NotNull
    private final CrosslinkV3Adapter crosslinkV3Adapter;

    @NotNull
    private final MinifyLinkViewModel minifyLinkViewModel;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;
    private FullTextSearchHeaderV3VO vo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.presentation.FullTextSearchHeaderV3ViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetFullTextSearchHeaderBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetFullTextSearchHeaderBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/search/databinding/WidgetFullTextSearchHeaderBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetFullTextSearchHeaderBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetFullTextSearchHeaderBinding.bind(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3ViewHolder$Companion;", "", "<init>", "()V", "SHARE_DATA_TYPE", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullTextSearchHeaderV3ViewHolder(@NotNull View containerView, @NotNull MinifyLinkViewModel minifyLinkViewModel, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(minifyLinkViewModel, "minifyLinkViewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.minifyLinkViewModel = minifyLinkViewModel;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        CrosslinkV3Adapter crosslinkV3Adapter = new CrosslinkV3Adapter(this, tokenizedAnalytics, new FullTextSearchHeaderV3ViewHolder$crosslinkV3Adapter$1(this));
        this.crosslinkV3Adapter = crosslinkV3Adapter;
        WidgetFullTextSearchHeaderBinding binding = getBinding();
        RecyclerView recyclerView = binding.crosslinksRv;
        recyclerView.setAdapter(crosslinkV3Adapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new CrosslinkV3Decoration(context));
        binding.shareBtn.setOnClickListener(new e(2, this, containerView));
        binding.headerTv.setMovementMethod(LinkMovementMethod.getInstance());
        binding.headerTv.setOnTouchListener(new View.OnTouchListener() { // from class: RH.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$4$lambda$3;
                lambda$4$lambda$3 = FullTextSearchHeaderV3ViewHolder.lambda$4$lambda$3(FullTextSearchHeaderV3ViewHolder.this, view, motionEvent);
                return lambda$4$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$4$lambda$1(FullTextSearchHeaderV3ViewHolder fullTextSearchHeaderV3ViewHolder, View view, View view2) {
        String shareLink;
        String shareText;
        t tokenizedEvent;
        FullTextSearchHeaderV3VO fullTextSearchHeaderV3VO = fullTextSearchHeaderV3ViewHolder.vo;
        if (fullTextSearchHeaderV3VO == null) {
            Intrinsics.n("vo");
            throw null;
        }
        FullTextSearchHeaderV3VO.ShareData shareData = fullTextSearchHeaderV3VO.getShareData();
        if (shareData != null && (tokenizedEvent = shareData.getTokenizedEvent()) != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(fullTextSearchHeaderV3ViewHolder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        FullTextSearchHeaderV3VO fullTextSearchHeaderV3VO2 = fullTextSearchHeaderV3ViewHolder.vo;
        if (fullTextSearchHeaderV3VO2 == null) {
            Intrinsics.n("vo");
            throw null;
        }
        FullTextSearchHeaderV3VO.ShareData shareData2 = fullTextSearchHeaderV3VO2.getShareData();
        if (shareData2 == null || (shareLink = shareData2.getShareLink()) == null) {
            return;
        }
        FullTextSearchHeaderV3VO fullTextSearchHeaderV3VO3 = fullTextSearchHeaderV3ViewHolder.vo;
        if (fullTextSearchHeaderV3VO3 == null) {
            Intrinsics.n("vo");
            throw null;
        }
        FullTextSearchHeaderV3VO.ShareData shareData3 = fullTextSearchHeaderV3VO3.getShareData();
        if (shareData3 == null || (shareText = shareData3.getShareText()) == null) {
            return;
        }
        fullTextSearchHeaderV3ViewHolder.minifyLinkViewModel.onClickShare(shareLink, fullTextSearchHeaderV3ViewHolder.getTrackingData(), new FullTextSearchHeaderV3ViewHolder$2$2$2(shareText, view, fullTextSearchHeaderV3ViewHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$4$lambda$3(FullTextSearchHeaderV3ViewHolder fullTextSearchHeaderV3ViewHolder, View view, MotionEvent motionEvent) {
        t tokenizedEvent;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        FullTextSearchHeaderV3VO fullTextSearchHeaderV3VO = fullTextSearchHeaderV3ViewHolder.vo;
        if (fullTextSearchHeaderV3VO == null) {
            Intrinsics.n("vo");
            throw null;
        }
        FullTextSearchHeaderV3VO.Header header = fullTextSearchHeaderV3VO.getHeader();
        if (header == null || (tokenizedEvent = header.getTokenizedEvent()) == null) {
            return false;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(fullTextSearchHeaderV3ViewHolder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void share(Activity activity, String shareText) {
        t.a aVar = new t.a(activity);
        aVar.g("text/plain");
        aVar.f(shareText);
        aVar.c(R$string.common_action_share);
        aVar.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FullTextSearchHeaderV3VO item, @NotNull d info) {
        boolean z11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.vo = item;
        TextView textView = getBinding().headerTv;
        OzonUrlSpan.Companion companion = OzonUrlSpan.INSTANCE;
        OzonSpannableString title = item.getHeader().getTitle();
        TextView headerTv = getBinding().headerTv;
        Intrinsics.checkNotNullExpressionValue(headerTv, "headerTv");
        textView.setText(companion.setOnUrlSpanClick(title, headerTv, new FullTextSearchHeaderV3ViewHolder$bind$1$1(this)));
        textView.setTextAppearance(item.getHeader().getStyle());
        FullTextSearchHeaderV3VO.ShareData shareData = item.getShareData();
        String shareText = shareData != null ? shareData.getShareText() : null;
        if (shareText == null) {
            shareText = "";
        }
        if (!h.K(shareText)) {
            FullTextSearchHeaderV3VO.ShareData shareData2 = item.getShareData();
            String shareLink = shareData2 != null ? shareData2.getShareLink() : null;
            if (!h.K(shareLink != null ? shareLink : "")) {
                z11 = true;
                AppCompatImageButton shareBtn = getBinding().shareBtn;
                Intrinsics.checkNotNullExpressionValue(shareBtn, "shareBtn");
                ViewExtKt.showOrGone(shareBtn, Boolean.valueOf(z11));
                this.crosslinkV3Adapter.submitList(item.getCrosslinks());
            }
        }
        z11 = false;
        AppCompatImageButton shareBtn2 = getBinding().shareBtn;
        Intrinsics.checkNotNullExpressionValue(shareBtn2, "shareBtn");
        ViewExtKt.showOrGone(shareBtn2, Boolean.valueOf(z11));
        this.crosslinkV3Adapter.submitList(item.getCrosslinks());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull FullTextSearchHeaderV3VO item, @NotNull c trackingData, f viewedPond) {
        WZ.t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        WZ.t tokenizedEvent2 = item.getTokenizedEvent();
        if (tokenizedEvent2 != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent2, null, 2, null);
        }
        WZ.t tokenizedEvent3 = item.getHeader().getTokenizedEvent();
        if (tokenizedEvent3 != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent3, null, 2, null);
        }
        FullTextSearchHeaderV3VO.ShareData shareData = item.getShareData();
        if (shareData == null || (tokenizedEvent = shareData.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
