package ru.ozon.app.android.ugc.widgets.newquestionform.presentation;

import W10.c;
import WZ.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.ugc.R$layout;
import ru.ozon.app.android.ugc.databinding.WidgetNewQuestionFormBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000b0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0014\u0010-\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormWidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;", "Ll10/i;", "container", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormViewModelImpl;", "viewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Ll10/i;Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormViewModelImpl;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", "setupView", "()V", "addViewToContainerWithTopMargin", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormViewModelImpl;", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormView;", "view", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormView;", "", "toolbarMargin", "Ljava/lang/Integer;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/ViewGroup;", "getComposerRootView", "()Landroid/view/ViewGroup;", "composerRootView", "getComposerContainer", "composerContainer", "getToolbarHeight", "()I", "toolbarHeight", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "metricView", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewQuestionFormWidgetHolder extends AbstractC6065b<NewQuestionFormVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;
    private Integer toolbarMargin;
    private NewQuestionFormView view;

    @NotNull
    private final NewQuestionFormViewModelImpl viewModel;

    public NewQuestionFormWidgetHolder(@NotNull i container, @NotNull NewQuestionFormViewModelImpl viewModel, @NotNull HandlersInhibitor inhibitor) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        this.container = container;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).enableClickThrottling(inhibitor).buildHandler();
        setupView();
        addViewToContainerWithTopMargin();
    }

    private final void addViewToContainerWithTopMargin() {
        View containerView;
        NewQuestionFormView newQuestionFormView = this.view;
        if (newQuestionFormView == null || (containerView = newQuestionFormView.getContainerView()) == null) {
            return;
        }
        Integer num = this.toolbarMargin;
        if (num == null) {
            num = Integer.valueOf(getToolbarHeight());
        }
        this.toolbarMargin = num;
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Integer num2 = this.toolbarMargin;
        marginLayoutParams.topMargin = num2 != null ? num2.intValue() : 0;
        containerView.setLayoutParams(marginLayoutParams);
        getComposerContainer().addView(containerView);
    }

    private final ViewGroup getComposerContainer() {
        return ComposerViewExtensionKt.composerContainer(getComposerRootView());
    }

    private final ViewGroup getComposerRootView() {
        return this.container.Z();
    }

    private final int getToolbarHeight() {
        Toolbar composerToolbar = ComposerViewExtensionKt.composerToolbar(getComposerRootView());
        if (composerToolbar != null) {
            return composerToolbar.getMeasuredHeight();
        }
        return 0;
    }

    private final void setupView() {
        ViewGroup composerRootView = getComposerRootView();
        int i11 = R$layout.widget_new_question_form;
        Intrinsics.checkNotNullParameter(composerRootView, "<this>");
        View inflate = LayoutInflater.from(composerRootView.getContext()).inflate(i11, composerRootView, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        WidgetNewQuestionFormBinding bind = WidgetNewQuestionFormBinding.bind(inflate);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        NewQuestionFormViewImpl newQuestionFormViewImpl = new NewQuestionFormViewImpl(bind, this.actionHandler, this.container.X(), this.container);
        new NewQuestionFormBinder(newQuestionFormViewImpl, this.viewModel, this.container.K().f());
        this.view = newQuestionFormViewImpl;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        NewQuestionFormView newQuestionFormView = this.view;
        if (newQuestionFormView != null) {
            return newQuestionFormView.getContainerView();
        }
        return null;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        ViewGroup composerContainer = getComposerContainer();
        NewQuestionFormView newQuestionFormView = this.view;
        composerContainer.removeView(newQuestionFormView != null ? newQuestionFormView.getContainerView() : null);
        this.view = null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull NewQuestionFormVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.bind(item);
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull NewQuestionFormVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((NewQuestionFormWidgetHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtKt.processViewEvents(this.container.X(), viewEvent);
        }
    }
}
