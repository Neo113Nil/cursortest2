package ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.header;

import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleToggleHolderKt;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.b2b.databinding.WidgetTravelDocumentsToEmailHeaderBinding;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.TravelDocumentsToEmailViewModel;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleToggleView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/header/TravelDocumentsToEmailHeaderWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/header/TravelDocumentsToEmailHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/TravelDocumentsToEmailViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/TravelDocumentsToEmailViewModel;)V", "", "observeLiveData", "()V", "showError", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/header/TravelDocumentsToEmailHeaderVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/TravelDocumentsToEmailViewModel;", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetTravelDocumentsToEmailHeaderBinding;", "binding", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetTravelDocumentsToEmailHeaderBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TravelDocumentsToEmailHeaderWidgetViewHolder extends k<TravelDocumentsToEmailHeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTravelDocumentsToEmailHeaderBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final TravelDocumentsToEmailViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelDocumentsToEmailHeaderWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull TravelDocumentsToEmailViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.references = references;
        this.viewModel = viewModel;
        WidgetTravelDocumentsToEmailHeaderBinding bind = WidgetTravelDocumentsToEmailHeaderBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).onComposerAction(new TravelDocumentsToEmailHeaderWidgetViewHolder$actionHandler$1(this)).buildHandler();
    }

    private final void observeLiveData() {
        this.viewModel.errorLiveData().observe(this, new TravelDocumentsToEmailHeaderWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelDocumentsToEmailHeaderWidgetViewHolder$observeLiveData$1$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        ViewGroup rootView;
        C4911f container = this.references.getContainer();
        ComponentCallbacksC5392m c11 = container.c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelDocumentsToEmailHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        DisclaimerContainer documentsToEmailHeaderAnnotation = this.binding.documentsToEmailHeaderAnnotation;
        Intrinsics.checkNotNullExpressionValue(documentsToEmailHeaderAnnotation, "documentsToEmailHeaderAnnotation");
        DisclaimerHolderKt.bind(documentsToEmailHeaderAnnotation, item.getAnnotation(), this.actionHandler);
        CellWithSubtitleToggleView documentsToEmailHeaderEmailToggle = this.binding.documentsToEmailHeaderEmailToggle;
        Intrinsics.checkNotNullExpressionValue(documentsToEmailHeaderEmailToggle, "documentsToEmailHeaderEmailToggle");
        CellWithSubtitleToggleHolderKt.bind(documentsToEmailHeaderEmailToggle, item.getReceiveEmailToggle(), this.actionHandler);
    }
}
