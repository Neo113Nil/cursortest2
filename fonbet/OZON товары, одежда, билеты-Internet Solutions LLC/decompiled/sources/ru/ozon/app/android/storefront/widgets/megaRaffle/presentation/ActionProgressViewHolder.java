package ru.ozon.app.android.storefront.widgets.megaRaffle.presentation;

import CG.b;
import W10.c;
import WZ.t;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.storefront.databinding.WidgetMegadrawActionProgressBinding;
import ru.ozon.app.android.storefront.widgets.megaRaffle.data.HeaderDTO;
import ru.ozon.app.android.storefront.widgets.megaRaffle.data.HeaderSubtitleDTO;
import ru.ozon.app.android.storefront.widgets.megaRaffle.data.ProgressItemDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000e0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/storefront/widgets/megaRaffle/presentation/ActionProgressViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/megaRaffle/presentation/ActionProgressVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/megaRaffle/presentation/ActionProgressVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/megaRaffle/presentation/ActionProgressVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/databinding/WidgetMegadrawActionProgressBinding;", "binding", "Lru/ozon/app/android/storefront/databinding/WidgetMegadrawActionProgressBinding;", "", "dp4", "I", "dp8", "dp12", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View$OnClickListener;", "clickListener", "Landroid/view/View$OnClickListener;", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$RoundedCorners;", "roundCorners", "Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActionProgressViewHolder extends k<ActionProgressVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetMegadrawActionProgressBinding binding;

    @NotNull
    private final View.OnClickListener clickListener;

    @NotNull
    private final View containerView;
    private final int dp12;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final List<ImageTransformation.RoundedCorners> roundCorners;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActionProgressViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.refs = refs;
        WidgetMegadrawActionProgressBinding bind = WidgetMegadrawActionProgressBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.dp4 = ResourceExtKt.toPx(4, getContext());
        this.dp8 = ResourceExtKt.toPx(8, getContext());
        this.dp12 = ResourceExtKt.toPx(12, getContext());
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        b bVar = new b(this, 10);
        this.clickListener = bVar;
        this.roundCorners = C7714v.a0(new ImageTransformation.RoundedCorners(ResourceExtKt.toDp(16), null, 2, 0 == true ? 1 : 0));
        ConstraintLayout constraintLayout = bind.getConstraintLayout();
        constraintLayout.setOnClickListener(bVar);
        constraintLayout.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$0(ActionProgressViewHolder actionProgressViewHolder, View view) {
        AtomAction action;
        ActionProgressVO boundedData = actionProgressViewHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        actionProgressViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ActionProgressVO item, @NotNull d info) {
        HeaderSubtitleDTO subtitle;
        HeaderSubtitleDTO subtitle2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetMegadrawActionProgressBinding widgetMegadrawActionProgressBinding = this.binding;
        if (item.getBackground() == null) {
            ConstraintLayout constraintLayout = widgetMegadrawActionProgressBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(this.dp4);
            marginLayoutParams.setMarginEnd(this.dp4);
            constraintLayout.setLayoutParams(marginLayoutParams);
        } else {
            AppCompatImageView backgroundIv = widgetMegadrawActionProgressBinding.backgroundIv;
            Intrinsics.checkNotNullExpressionValue(backgroundIv, "backgroundIv");
            ImageViewExtKt.load$default(backgroundIv, item.getBackground(), this.roundCorners, null, null, null, false, null, 124, null);
        }
        TextAtomView mainTitleTv = widgetMegadrawActionProgressBinding.mainTitleTv;
        Intrinsics.checkNotNullExpressionValue(mainTitleTv, "mainTitleTv");
        HeaderDTO header = item.getHeader();
        TextAtomHolderKt.bindOrGone$default(mainTitleTv, header != null ? header.getTitle() : null, null, 2, null);
        widgetMegadrawActionProgressBinding.mainTitleTv.setMaxLines(1);
        TextAtomView textAtomView = widgetMegadrawActionProgressBinding.mainTitleTv;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textAtomView.setEllipsize(truncateAt);
        boolean z11 = item.getHeader() == null;
        AppCompatImageView mainTitleArrowIv = widgetMegadrawActionProgressBinding.mainTitleArrowIv;
        Intrinsics.checkNotNullExpressionValue(mainTitleArrowIv, "mainTitleArrowIv");
        mainTitleArrowIv.setVisibility(!z11 ? 0 : 8);
        MegaDrawProductProgressView actionFirstItemProgress = widgetMegadrawActionProgressBinding.actionFirstItemProgress;
        Intrinsics.checkNotNullExpressionValue(actionFirstItemProgress, "actionFirstItemProgress");
        ViewGroup.LayoutParams layoutParams2 = actionFirstItemProgress.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = z11 ? this.dp8 : this.dp12;
        actionFirstItemProgress.setLayoutParams(marginLayoutParams2);
        TextAtomView mainSubtitleTv = widgetMegadrawActionProgressBinding.mainSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(mainSubtitleTv, "mainSubtitleTv");
        HeaderDTO header2 = item.getHeader();
        TextAtomHolderKt.bindOrGone$default(mainSubtitleTv, (header2 == null || (subtitle2 = header2.getSubtitle()) == null) ? null : subtitle2.getText(), null, 2, null);
        widgetMegadrawActionProgressBinding.mainSubtitleTv.setMaxLines(1);
        widgetMegadrawActionProgressBinding.mainSubtitleTv.setEllipsize(truncateAt);
        TextAtomView subtitleCounterTv = widgetMegadrawActionProgressBinding.subtitleCounterTv;
        Intrinsics.checkNotNullExpressionValue(subtitleCounterTv, "subtitleCounterTv");
        HeaderDTO header3 = item.getHeader();
        TextAtomHolderKt.bindOrGone$default(subtitleCounterTv, (header3 == null || (subtitle = header3.getSubtitle()) == null) ? null : subtitle.getCounterText(), null, 2, null);
        widgetMegadrawActionProgressBinding.subtitleCounterTv.setMaxLines(1);
        widgetMegadrawActionProgressBinding.subtitleCounterTv.setEllipsize(truncateAt);
        widgetMegadrawActionProgressBinding.actionFirstItemProgress.bindItemOrGone((ProgressItemDTO) C7714v.Q(0, item.getItems()));
        widgetMegadrawActionProgressBinding.actionSecondItemProgress.bindItemOrGone((ProgressItemDTO) C7714v.Q(1, item.getItems()));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ActionProgressVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ActionProgressViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
