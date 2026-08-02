package ru.ozon.app.android.marketing.widgets.actionProgress.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.databinding.WidgetActionProgressBinding;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManager;
import ru.ozon.composer.ui.widget.k;
import xe.B0;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "stateManager", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "widgetAsyncData", "Lxe/B0;", "observeMiniWidgetState", "(Ljava/lang/String;)Lxe/B0;", "", "onAttach", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO;Ll20/d;)V", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "Lru/ozon/app/android/composer/ComposerReferences;", "observeAsyncStateJob", "Lxe/B0;", "Lru/ozon/app/android/marketing/databinding/WidgetActionProgressBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetActionProgressBinding;", "Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressBinder;", "actionProgressBinder", "Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressBinder;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionProgressViewHolder extends k<ActionProgressVO> {

    @NotNull
    private final ActionProgressBinder actionProgressBinder;

    @NotNull
    private final WidgetActionProgressBinding binding;
    private B0 observeAsyncStateJob;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final HighlightsWrapperStateManager stateManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionProgressViewHolder(@NotNull View containerView, @NotNull HighlightsWrapperStateManager stateManager, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.stateManager = stateManager;
        this.refs = refs;
        WidgetActionProgressBinding bind = WidgetActionProgressBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionProgressBinder = new ActionProgressBinder(bind, (CardView) containerView);
    }

    private final B0 observeMiniWidgetState(String widgetAsyncData) {
        return C2399j.C(new C2408n0(C2399j.o(this.stateManager.listenState(widgetAsyncData)), new ActionProgressViewHolder$observeMiniWidgetState$1(this, null)), K.a(this));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.actionProgressBinder.onAttach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ActionProgressVO item, @NotNull d info) {
        B0 b02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.actionProgressBinder.bind(item);
        B0 b03 = this.observeAsyncStateJob;
        if (b03 == null || ((b03 != null && b03.isCancelled()) || ((b02 = this.observeAsyncStateJob) != null && b02.l0()))) {
            this.observeAsyncStateJob = observeMiniWidgetState(info.c().a());
        }
    }
}
