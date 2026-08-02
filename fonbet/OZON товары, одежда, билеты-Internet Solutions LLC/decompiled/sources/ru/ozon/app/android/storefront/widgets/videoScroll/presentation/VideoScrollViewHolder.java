package ru.ozon.app.android.storefront.widgets.videoScroll.presentation;

import GS.a;
import W10.c;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.disclosure.DisclosureHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.databinding.VideoScrollBinding;
import ru.ozon.app.android.storefront.widgets.videoScroll.presentation.rv.MarginDecorator;
import ru.ozon.app.android.storefront.widgets.videoScroll.presentation.rv.VideoAdapter;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.uikit.view.atoms.disclosure.DisclosureView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/VideoScrollViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/VideoScrollVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/Header;", CommentV3DTO.HEADER_FIELD_NAME, "", "bindHeader", "(Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/Header;)V", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/VideoScrollVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/VideoScrollVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/databinding/VideoScrollBinding;", "binding", "Lru/ozon/app/android/storefront/databinding/VideoScrollBinding;", "", "dp8", "I", "dp16", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/rv/VideoAdapter;", "videosAdapter", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/rv/VideoAdapter;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoScrollViewHolder extends k<VideoScrollVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final VideoScrollBinding binding;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final VideoAdapter videosAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoScrollViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
        VideoScrollBinding bind = VideoScrollBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.dp8 = ResourceExtKt.toPx(8);
        this.dp16 = ResourceExtKt.toPx(16);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        VideoAdapter videoAdapter = new VideoAdapter(buildHandler, refs.getTokenizedAnalytics(), this);
        this.videosAdapter = videoAdapter;
        bind.containerHeader.setOnClickListener(new a(this, 3));
        bind.rvVideos.setAdapter(videoAdapter);
        bind.rvVideos.addItemDecoration(new MarginDecorator(getContext()));
    }

    private final void bindHeader(Header header) {
        VideoScrollBinding videoScrollBinding = this.binding;
        LinearLayout containerHeader = videoScrollBinding.containerHeader;
        Intrinsics.checkNotNullExpressionValue(containerHeader, "containerHeader");
        containerHeader.setVisibility(header != null ? 0 : 8);
        TextAtomView tvHeader = videoScrollBinding.tvHeader;
        Intrinsics.checkNotNullExpressionValue(tvHeader, "tvHeader");
        TextAtomHolderKt.bindOrGone$default(tvHeader, header != null ? header.getTitle() : null, null, 2, null);
        TextAtomView tvHeader2 = videoScrollBinding.tvHeader;
        Intrinsics.checkNotNullExpressionValue(tvHeader2, "tvHeader");
        ViewGroup.LayoutParams layoutParams = tvHeader2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd((header == null || header.getDisclosure() == null) ? this.dp16 : Integer.valueOf(this.dp8).intValue());
        tvHeader2.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(VideoScrollViewHolder videoScrollViewHolder, View view) {
        Header header;
        AtomAction action;
        VideoScrollVO boundedData = videoScrollViewHolder.getBoundedData();
        if (boundedData == null || (header = boundedData.getHeader()) == null || (action = header.getAction()) == null) {
            return;
        }
        videoScrollViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull VideoScrollVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindHeader(item.getHeader());
        DisclosureView headerDisclosure = this.binding.headerDisclosure;
        Intrinsics.checkNotNullExpressionValue(headerDisclosure, "headerDisclosure");
        Header header = item.getHeader();
        DisclosureHolderKt.bindOrGone$default(headerDisclosure, header != null ? header.getDisclosure() : null, null, 2, null);
        this.videosAdapter.submitList(item.getItems());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull VideoScrollVO item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Header header = item.getHeader();
        if (header == null || (tokenizedEvent = header.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }
}
