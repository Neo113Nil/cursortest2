package ru.ozon.app.android.geo.addressEditForm.presentation;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.helper.FormBuilderHelper;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBlocksAdapter;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormConfig;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormDataUpdate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.geo.addressEditForm.presentation.AddressEditFormVH;
import ru.ozon.app.android.geo.common.UtilsKt;
import ru.ozon.app.android.geo.databinding.WidgetAddressEditFormBinding;
import ru.ozon.app.android.utils.SoftInputChangeDelegate;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormOnBoardingViewModel;", "onBoardingViewModel", "Lru/ozon/app/android/geo/databinding/WidgetAddressEditFormBinding;", "binding", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "yandexSearchSheetSharedViewModel", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormOnBoardingViewModel;Lru/ozon/app/android/geo/databinding/WidgetAddressEditFormBinding;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "Landroid/view/View;", "view", "", "onOnboardingShow", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Landroid/view/View;)V", "onBoarding", "initDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormOnBoardingViewModel;", "Lru/ozon/app/android/geo/databinding/WidgetAddressEditFormBinding;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/helper/FormBuilderHelper$Handling;", "formHandlingHelper", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/helper/FormBuilderHelper$Handling;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlocksAdapter;", "formBlocksAdapter", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlocksAdapter;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditFormVH extends k<AddressEditFormVO> {

    @NotNull
    private final WidgetAddressEditFormBinding binding;

    @NotNull
    private final FormBlocksAdapter formBlocksAdapter;

    @NotNull
    private final FormBuilderHelper.Handling formHandlingHelper;
    private OnBoardingDelegate onBoardingDelegate;

    @NotNull
    private final AddressEditFormOnBoardingViewModel onBoardingViewModel;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_8 = UiExtKt.toPx(8);
    private static final int DP_24 = UiExtKt.toPx(24);
    private static final float onBoardingCornerRadius = UiExtKt.toPxF(16);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormVH$Companion;", "", "<init>", "()V", "ONBOARDING_KEY", "", "DP_8", "", "getDP_8", "()I", "DP_24", "getDP_24", "onBoardingCornerRadius", "", "getOnBoardingCornerRadius", "()F", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDP_24() {
            return AddressEditFormVH.DP_24;
        }

        public final int getDP_8() {
            return AddressEditFormVH.DP_8;
        }

        public final float getOnBoardingCornerRadius() {
            return AddressEditFormVH.onBoardingCornerRadius;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddressEditFormVH(@NotNull ComposerReferences ref, @NotNull AddressEditFormOnBoardingViewModel onBoardingViewModel, @NotNull WidgetAddressEditFormBinding binding, @NotNull HandlersInhibitor handlersInhibitor, @NotNull YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel) {
        super(r2);
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(yandexSearchSheetSharedViewModel, "yandexSearchSheetSharedViewModel");
        RecyclerView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.ref = ref;
        this.onBoardingViewModel = onBoardingViewModel;
        this.binding = binding;
        this.yandexSearchSheetSharedViewModel = yandexSearchSheetSharedViewModel;
        FormBuilderHelper.Handling handling = new FormBuilderHelper.Handling(getContext(), this, ref, handlersInhibitor, new AddressEditFormVH$formHandlingHelper$1(this));
        this.formHandlingHelper = handling;
        FormBlocksAdapter formBlocksAdapter = new FormBlocksAdapter(new FormConfig(FormConfig.Mode.BORDER_FIELD), new AddressEditFormVH$formBlocksAdapter$1(handling), new AddressEditFormVH$formBlocksAdapter$2(handling), false, new AddressEditFormVH$formBlocksAdapter$3(this), 8, null);
        this.formBlocksAdapter = formBlocksAdapter;
        binding.formBlocksRv.setAdapter(formBlocksAdapter);
        new SoftInputChangeDelegate(32).register(ref.getContainer().i(), ref.getContainer().j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding) {
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl("address_edit_form_onboarding_is_shown", this.ref, this.binding.getConstraintLayout(), onBoarding, this, this.onBoardingViewModel, null, 0.0f, 192, null);
        onBoardingDelegateImpl.setOnShownListener(new AddressEditFormVH$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOnboardingShow(final OnBoardingDTO onboarding, final View view) {
        final RecyclerView recyclerView = this.binding.formBlocksRv;
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.geo.addressEditForm.presentation.AddressEditFormVH$onOnboardingShow$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                OnBoardingDelegate onBoardingDelegate;
                if (recyclerView.getMeasuredWidth() <= 0 || recyclerView.getMeasuredHeight() <= 0) {
                    return;
                }
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                onBoardingDelegate = this.onBoardingDelegate;
                if (onBoardingDelegate == null) {
                    this.initDelegate(onboarding);
                }
                final View itemView = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                final int relativeTopPositionViewInRoot = UtilsKt.getRelativeTopPositionViewInRoot(itemView, view);
                final AddressEditFormVH addressEditFormVH = this;
                final View view2 = view;
                itemView.post(new Runnable() { // from class: ru.ozon.app.android.geo.addressEditForm.presentation.AddressEditFormVH$onOnboardingShow$1$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        OnBoardingDelegate onBoardingDelegate2;
                        AddressEditFormVH.Companion companion;
                        AddressEditFormVH.Companion companion2;
                        AddressEditFormVH.Companion companion3;
                        AddressEditFormVH.Companion companion4;
                        AddressEditFormVH.Companion companion5;
                        onBoardingDelegate2 = AddressEditFormVH.this.onBoardingDelegate;
                        if (onBoardingDelegate2 != null) {
                            AddressEditFormVH addressEditFormVH2 = AddressEditFormVH.this;
                            int i11 = relativeTopPositionViewInRoot;
                            companion = AddressEditFormVH.Companion;
                            int dp_8 = i11 - companion.getDP_8();
                            companion2 = AddressEditFormVH.Companion;
                            int dp_82 = companion2.getDP_8();
                            int width = itemView.getWidth() - view2.getWidth();
                            companion3 = AddressEditFormVH.Companion;
                            int dp_24 = width - companion3.getDP_24();
                            int height = (itemView.getHeight() - view2.getHeight()) - relativeTopPositionViewInRoot;
                            companion4 = AddressEditFormVH.Companion;
                            int dp_83 = height - companion4.getDP_8();
                            companion5 = AddressEditFormVH.Companion;
                            OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, addressEditFormVH2, new OnBoardingCutConfig(Integer.valueOf(dp_82), Integer.valueOf(dp_8), Integer.valueOf(dp_24), Integer.valueOf(dp_83), null, null, Float.valueOf(companion5.getOnBoardingCornerRadius()), false, 48, null), null, 4, null);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddressEditFormVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.formBlocksAdapter.submitList(item.getFormBlocks());
        if (item.getIsInitialStateNotSent()) {
            this.ref.getController().d(new FormDataUpdate(item.getDataForSend()));
        }
    }
}
