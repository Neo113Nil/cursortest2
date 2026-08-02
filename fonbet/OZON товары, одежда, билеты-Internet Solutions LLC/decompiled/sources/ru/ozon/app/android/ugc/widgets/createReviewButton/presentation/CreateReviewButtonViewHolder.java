package ru.ozon.app.android.ugc.widgets.createReviewButton.presentation;

import W10.c;
import WZ.t;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.utils.ComposerExtKt;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/createReviewButton/presentation/CreateReviewButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/createReviewButton/presentation/CreateReviewButtonVO;", "Landroid/widget/LinearLayout;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/widget/LinearLayout;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/widgets/createReviewButton/presentation/CreateReviewButtonVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/createReviewButton/presentation/CreateReviewButtonVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "", "subtitleTopMargin", "I", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateReviewButtonViewHolder extends k<CreateReviewButtonVO> {

    @NotNull
    private final LinearLayout containerView;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final ComposerReferences refs;
    private final int subtitleTopMargin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateReviewButtonViewHolder(@NotNull LinearLayout containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.refs = refs;
        this.onAction = new ActionHandler.Builder(refs, this).buildHandler();
        this.subtitleTopMargin = UiExtKt.toPx(12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CreateReviewButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.removeAllViews();
        LargeButtonView largeButtonView = new LargeButtonView(getContext(), null, 0, 0, 14, null);
        largeButtonView.setId(R$id.createReviewButtonV);
        largeButtonView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LargeButtonHolderKt.bindOrGone(largeButtonView, item.getWriteReviewButton(), this.onAction);
        this.containerView.addView(largeButtonView);
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        textAtomV2View.setId(R$id.createReviewSubtitleTAV);
        layoutParams.topMargin = item.getWriteReviewButton() == null ? 0 : this.subtitleTopMargin;
        textAtomV2View.setLayoutParams(layoutParams);
        TextDTO subtitle = item.getSubtitle();
        TextHolderKt.bindOrGone(textAtomV2View, subtitle != null ? ComposerExtKt.withNavigationLinksHandling(subtitle, textAtomV2View, this.onAction) : null, this.onAction);
        this.containerView.addView(textAtomV2View);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CreateReviewButtonVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CreateReviewButtonViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtKt.processViewEvents(this.refs.getTokenizedAnalytics(), tokenizedEvent);
        }
    }
}
