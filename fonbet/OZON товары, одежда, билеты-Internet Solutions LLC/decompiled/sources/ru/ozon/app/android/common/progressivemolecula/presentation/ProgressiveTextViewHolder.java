package ru.ozon.app.android.common.progressivemolecula.presentation;

import Bs.ViewOnClickListenerC2671b;
import W10.c;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.progressivemolecula.presentation.ProgressiveTextWidgetVO;
import ru.ozon.app.android.common.progressivemolecula.view.ProgressiveTextView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO;", "Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;", "progressiveTextView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;", "getProgressiveTextView", "()Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressiveTextViewHolder extends k<ProgressiveTextWidgetVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ProgressiveTextView progressiveTextView;

    @NotNull
    private final ComposerReferences ref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressiveTextViewHolder(@NotNull ProgressiveTextView progressiveTextView, @NotNull ComposerReferences ref) {
        super(progressiveTextView);
        Intrinsics.checkNotNullParameter(progressiveTextView, "progressiveTextView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.progressiveTextView = progressiveTextView;
        this.ref = ref;
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        progressiveTextView.setOnClickListener(new ViewOnClickListenerC2671b(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ProgressiveTextViewHolder progressiveTextViewHolder, View view) {
        ProgressiveTextWidgetVO.ProgressiveTextVO progressiveText;
        AtomAction action;
        ProgressiveTextWidgetVO boundedData = progressiveTextViewHolder.getBoundedData();
        if (boundedData == null || (progressiveText = boundedData.getProgressiveText()) == null || (action = progressiveText.getAction()) == null) {
            return;
        }
        progressiveTextViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProgressiveTextWidgetVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CommonCellSettings.LayoutPadding horizontalPadding = item.getHorizontalPadding();
        if (horizontalPadding != null) {
            int dimension = (int) getResources().getDimension(horizontalPadding.getCellLayoutPadding());
            ProgressiveTextView progressiveTextView = this.progressiveTextView;
            progressiveTextView.setPadding(dimension, progressiveTextView.getPaddingTop(), dimension, progressiveTextView.getPaddingBottom());
        }
        this.progressiveTextView.bind(item.getProgressiveText());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ProgressiveTextWidgetVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getProgressiveText().getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
