package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.footer;

import W10.c;
import WZ.l;
import WZ.t;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewFooterBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentAdapter;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.viewmodel.ComponentUploadPhotosViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormFooterVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00120+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/footer/DeliveryReviewFormFooterViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormFooterVO;", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewFooterBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModel;", "uploadPhotosViewModel", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "deliveryReviewFormViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "isSelect", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewFooterBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModel;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;LWZ/l;Z)V", "", "observeValidation", "()V", "", "message", "showError", "(Ljava/lang/String;)V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormFooterVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormFooterVO;Ll20/d;)V", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewFooterBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "LWZ/l;", "Z", "itemVo", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormFooterVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentAdapter;", "componentAdapter", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentAdapter;", "Companion", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryReviewFormFooterViewHolder extends k<DeliveryReviewFormFooterVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemDeliveryReviewFooterBinding binding;

    @NotNull
    private final ComponentAdapter componentAdapter;

    @NotNull
    private final DeliveryReviewFormViewModel deliveryReviewFormViewModel;
    private final boolean isSelect;
    private DeliveryReviewFormFooterVO itemVo;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/footer/DeliveryReviewFormFooterViewHolder$Companion;", "", "<init>", "()V", "SCROLL_DELAY", "", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeliveryReviewFormFooterViewHolder(@NotNull ItemDeliveryReviewFooterBinding binding, @NotNull ComposerReferences refs, @NotNull ComponentUploadPhotosViewModel uploadPhotosViewModel, @NotNull DeliveryReviewFormViewModel deliveryReviewFormViewModel, @NotNull l tokenizedAnalytics, boolean z11) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(uploadPhotosViewModel, "uploadPhotosViewModel");
        Intrinsics.checkNotNullParameter(deliveryReviewFormViewModel, "deliveryReviewFormViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.deliveryReviewFormViewModel = deliveryReviewFormViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.isSelect = z11;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        ComponentAdapter componentAdapter = new ComponentAdapter(uploadPhotosViewModel, deliveryReviewFormViewModel, refs, z11, buildHandler);
        this.componentAdapter = componentAdapter;
        RecyclerView recyclerView = binding.rvComponents;
        recyclerView.setAdapter(componentAdapter);
        recyclerView.setNestedScrollingEnabled(false);
        binding.saSendBtn.setOnAction(new DeliveryReviewFormFooterViewHolder$2$1(this, deliveryReviewFormViewModel));
        deliveryReviewFormViewModel.getLoadingState().observe(refs.getContainer().g(), new DeliveryReviewFormFooterViewHolder$sam$androidx_lifecycle_Observer$0(new DeliveryReviewFormFooterViewHolder$2$2(this)));
        deliveryReviewFormViewModel.getAction().observe(refs.getContainer().g(), new DeliveryReviewFormFooterViewHolder$sam$androidx_lifecycle_Observer$0(new DeliveryReviewFormFooterViewHolder$2$3(this)));
        deliveryReviewFormViewModel.getScroll().observe(refs.getContainer().g(), new DeliveryReviewFormFooterViewHolder$sam$androidx_lifecycle_Observer$0(new DeliveryReviewFormFooterViewHolder$2$4(this)));
    }

    private final void observeValidation() {
        this.deliveryReviewFormViewModel.getValidation().removeObservers(this.refs.getContainer().g());
        this.deliveryReviewFormViewModel.getValidation().observe(this.refs.getContainer().g(), new DeliveryReviewFormFooterViewHolder$sam$androidx_lifecycle_Observer$0(new DeliveryReviewFormFooterViewHolder$observeValidation$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(String message) {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, 6000L, null, this.refs.getContainer().g(), 42, null).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryReviewFormFooterVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.itemVo = item;
        this.deliveryReviewFormViewModel.updateGroup(item);
        this.componentAdapter.setGroupId(item.getGroupId());
        this.componentAdapter.submitList(item.getComponents());
        ButtonV3Atom.LargeButton button = item.getButton();
        if (button != null) {
            SingleAtom.bind$default(this.binding.saSendBtn, button, false, 2, null);
        }
        observeValidation();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull DeliveryReviewFormFooterVO item, @NotNull c trackingData, f viewedPond) {
        ButtonV3Atom.LargeButton button;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((DeliveryReviewFormFooterViewHolder) item, trackingData, viewedPond);
        DeliveryReviewFormFooterVO boundData = getBoundData();
        if (boundData == null || (button = boundData.getButton()) == null || (trackingInfo = button.getTrackingInfo()) == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
    }
}
