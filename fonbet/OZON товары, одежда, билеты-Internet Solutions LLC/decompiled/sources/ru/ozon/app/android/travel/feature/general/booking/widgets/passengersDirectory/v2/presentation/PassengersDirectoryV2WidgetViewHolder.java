package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation;

import Vg.d;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.travel.feature.general.booking.databinding.WidgetPassengersDirectoryV2Binding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.adapter.PassengersDirectoryV2Adapter;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.app.android.travel.utils.extensions.ViewsExtensionsKt;
import ru.ozon.app.android.travel.utils.utils.CornerRadiiCreationKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0018j\u0002`\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u000f018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2ViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2ViewModel;LVg/d;)V", "", "observeLiveData", "()V", "onAttach", "Ljk0/q;", "info", "onVisibleAreaChanged", "(Ljk0/q;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO;Ll20/d;)V", "onViewOutOfVisibleBounds", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2ViewModel;", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetPassengersDirectoryV2Binding;", "binding", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetPassengersDirectoryV2Binding;", "", "backgroundColor", "I", "padding", "", "radius", "F", "Landroid/graphics/drawable/GradientDrawable;", "roundedTopBackground", "Landroid/graphics/drawable/GradientDrawable;", "roundedBottomBackground", "roundedBackground", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/utils/DebouncedTextWatcher;", "textWatcher", "Lru/ozon/app/android/travel/utils/DebouncedTextWatcher;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/adapter/PassengersDirectoryV2Adapter;", "passengersAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/adapter/PassengersDirectoryV2Adapter;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV2WidgetViewHolder extends k<PassengersDirectoryV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final int backgroundColor;

    @NotNull
    private final WidgetPassengersDirectoryV2Binding binding;

    @NotNull
    private final View containerView;
    private final int padding;

    @NotNull
    private final PassengersDirectoryV2Adapter passengersAdapter;
    private final float radius;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final GradientDrawable roundedBackground;

    @NotNull
    private final GradientDrawable roundedBottomBackground;

    @NotNull
    private final GradientDrawable roundedTopBackground;

    @NotNull
    private final DebouncedTextWatcher textWatcher;

    @NotNull
    private final PassengersDirectoryV2ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengersDirectoryV2WidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull PassengersDirectoryV2ViewModel viewModel, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.refs = refs;
        this.viewModel = viewModel;
        WidgetPassengersDirectoryV2Binding bind = WidgetPassengersDirectoryV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        int themeColor = ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1);
        this.backgroundColor = themeColor;
        this.padding = ResourceExtKt.toPx(16, getContext());
        float pxF = ResourceExtKt.toPxF(20, getContext());
        this.radius = pxF;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorStateList.valueOf(themeColor));
        gradientDrawable.setCornerRadii(CornerRadiiCreationKt.createCornerRadii$default(pxF, pxF, 0.0f, 0.0f, 12, null));
        this.roundedTopBackground = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(ColorStateList.valueOf(themeColor));
        gradientDrawable2.setCornerRadii(CornerRadiiCreationKt.createCornerRadii$default(0.0f, 0.0f, pxF, pxF, 3, null));
        this.roundedBottomBackground = gradientDrawable2;
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(ColorStateList.valueOf(themeColor));
        gradientDrawable3.setCornerRadii(CornerRadiiCreationKt.createCornerRadii(pxF, pxF, pxF, pxF));
        this.roundedBackground = gradientDrawable3;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new PassengersDirectoryV2WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onClick(new PassengersDirectoryV2WidgetViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        DebouncedTextWatcher debouncedTextWatcher = new DebouncedTextWatcher(350L, null, new PassengersDirectoryV2WidgetViewHolder$textWatcher$1(viewModel), 2, null);
        this.textWatcher = debouncedTextWatcher;
        PassengersDirectoryV2Adapter passengersDirectoryV2Adapter = new PassengersDirectoryV2Adapter(buildHandler);
        this.passengersAdapter = passengersDirectoryV2Adapter;
        bind.getConstraintLayout().setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
        RecyclerView recyclerView = bind.passengersListRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(passengersDirectoryV2Adapter);
        RecyclerViewExtensionsKt.addParentTouchesInterceptor(recyclerView, true);
        bind.searchInputCTIV.setTextWatcher(debouncedTextWatcher);
    }

    private final void observeLiveData() {
        this.viewModel.submitPassengersLiveData().observe(this, new PassengersDirectoryV2WidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new PassengersDirectoryV2WidgetViewHolder$observeLiveData$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        PassengersDirectoryV2ViewModel passengersDirectoryV2ViewModel = this.viewModel;
        RecyclerView.o layoutManager = this.binding.passengersListRV.getLayoutManager();
        passengersDirectoryV2ViewModel.setLayoutManagerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        LinearLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewsExtensionsKt.updateHeightRegardingOverlapContainers$default(constraintLayout, info, false, 2, null);
        super.onVisibleAreaChanged(info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PassengersDirectoryV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getIsSelectedPassengerUnsuitable()) {
            ComposerExtKt.sendResultToTargetFragment(this.refs.getContainer(), 9001, PassengersDirectoryV2WidgetViewHolder$bind$1$1.INSTANCE);
        }
        FrameLayout searchInputContainer = this.binding.searchInputContainer;
        Intrinsics.checkNotNullExpressionValue(searchInputContainer, "searchInputContainer");
        searchInputContainer.setVisibility(item.getIsSearchInputVisible() ? 0 : 8);
        if (item.getIsSearchInputVisible()) {
            this.binding.searchInputContainer.setBackground(this.roundedTopBackground);
            RecyclerView passengersListRV = this.binding.passengersListRV;
            Intrinsics.checkNotNullExpressionValue(passengersListRV, "passengersListRV");
            ViewExtKt.updatePadding$default(passengersListRV, 0, 0, 0, 0, 13, null);
            this.binding.passengersListRV.setBackground(this.roundedBottomBackground);
        } else {
            RecyclerView passengersListRV2 = this.binding.passengersListRV;
            Intrinsics.checkNotNullExpressionValue(passengersListRV2, "passengersListRV");
            ViewExtKt.updatePadding$default(passengersListRV2, 0, this.padding, 0, 0, 13, null);
            this.binding.passengersListRV.setBackground(this.roundedBackground);
        }
        this.viewModel.bindPassengers(item.getPassengers(), item.getEmptyState());
        this.binding.searchInputCTIV.bindOrGone(item.getSearch());
    }
}
