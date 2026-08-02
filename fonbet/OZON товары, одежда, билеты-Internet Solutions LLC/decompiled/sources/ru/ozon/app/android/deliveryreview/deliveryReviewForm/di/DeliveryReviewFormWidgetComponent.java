package ru.ozon.app.android.deliveryreview.deliveryReviewForm.di;

import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.mapper.SendDeliveryReviewFormRequestMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.CheckboxAndTextareaValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.DeliveryReviewComponentValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.DeliveryReviewFormValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.DeliveryReviewGroupValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModelImpl;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.viewmodel.ComponentUploadPhotosViewModelImpl;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormFooterVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormItemUpdateConsumer;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormItemVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.CarouselUpdateDelegate;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.CheckboxUpdateDelegate;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.GroupCollapseUpdateDelegate;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.RadioUpdateDelegate;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.TextAreaUpdateDelegate;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.ToggleUpdateDelegate;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.mediaupload.di.MediaUploadComponentApi;
import ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCase;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/di/DeliveryReviewFormWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemUpdateConsumer;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemVO;", "getUpdateFormItemHandler", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemUpdateConsumer;", "updateFormItemHandler", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormFooterVO;", "getUpdateFooterHandler", "updateFooterHandler", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModelImpl;", "getUploadPhotosViewModel", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModelImpl;", "uploadPhotosViewModel", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModelImpl;", "getDeliveryReviewFormViewModel", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModelImpl;", "deliveryReviewFormViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Companion", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DeliveryReviewFormWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/di/DeliveryReviewFormWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/di/DeliveryReviewFormWidgetComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/di/DeliveryReviewFormWidgetComponent;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final DeliveryReviewFormWidgetComponent create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new DeliveryReviewFormWidgetComponent() { // from class: ru.ozon.app.android.deliveryreview.deliveryReviewForm.di.DeliveryReviewFormWidgetComponent$Companion$create$1
                private final AndroidPlatformComponentApi androidPlatformComponentApi;
                private final CarouselUpdateDelegate carouselUpdateDelegate;
                private final CheckboxAndTextareaValidator checkboxAndTextAreaValidator;
                private final CheckboxUpdateDelegate checkboxUpdateDelegate;
                private final DeliveryReviewComponentValidator componentsValidator;
                private final DeliveryReviewComponentValidator deliveryReviewComponentValidator;
                private final DeliveryReviewFormValidator formValidator;
                private final GroupCollapseUpdateDelegate groupCollapseUpdateDelegate;
                private final DeliveryReviewGroupValidator groupValidator;
                private final ImageResizer imageResizer;
                private final OrderChangePreferences orderChangePreferences;
                private final PickedAttachmentsMapper.ReviewAttachmentsMapper pickedImagesMapper;
                private final RadioUpdateDelegate radioUpdateDelegate;
                private final ActionV2Repository repository;
                private final SendDeliveryReviewFormRequestMapper requestMapper;
                private final TextAreaUpdateDelegate textAreaUpdateDelegate;
                private final ToggleUpdateDelegate toggleUpdateDelegate;
                private final DeliveryReviewFormItemUpdateConsumer<DeliveryReviewFormFooterVO> updateFooterHandler;
                private final DeliveryReviewFormItemUpdateConsumer<DeliveryReviewFormItemVO> updateFormItemHandler;
                private final UploadImageUseCase uploadImageUseCase;

                {
                    DeliveryReviewComponentValidator deliveryReviewComponentValidator = new DeliveryReviewComponentValidator();
                    this.componentsValidator = deliveryReviewComponentValidator;
                    DeliveryReviewGroupValidator deliveryReviewGroupValidator = new DeliveryReviewGroupValidator();
                    this.groupValidator = deliveryReviewGroupValidator;
                    GroupCollapseUpdateDelegate groupCollapseUpdateDelegate = new GroupCollapseUpdateDelegate(deliveryReviewComponentValidator, deliveryReviewGroupValidator);
                    this.groupCollapseUpdateDelegate = groupCollapseUpdateDelegate;
                    CheckboxUpdateDelegate checkboxUpdateDelegate = new CheckboxUpdateDelegate(deliveryReviewComponentValidator, deliveryReviewGroupValidator);
                    this.checkboxUpdateDelegate = checkboxUpdateDelegate;
                    RadioUpdateDelegate radioUpdateDelegate = new RadioUpdateDelegate(deliveryReviewComponentValidator, deliveryReviewGroupValidator);
                    this.radioUpdateDelegate = radioUpdateDelegate;
                    CarouselUpdateDelegate carouselUpdateDelegate = new CarouselUpdateDelegate(deliveryReviewComponentValidator, deliveryReviewGroupValidator);
                    this.carouselUpdateDelegate = carouselUpdateDelegate;
                    TextAreaUpdateDelegate textAreaUpdateDelegate = new TextAreaUpdateDelegate(deliveryReviewComponentValidator, deliveryReviewGroupValidator);
                    this.textAreaUpdateDelegate = textAreaUpdateDelegate;
                    ToggleUpdateDelegate toggleUpdateDelegate = new ToggleUpdateDelegate(deliveryReviewComponentValidator, deliveryReviewGroupValidator);
                    this.toggleUpdateDelegate = toggleUpdateDelegate;
                    this.pickedImagesMapper = new PickedAttachmentsMapper.ReviewAttachmentsMapper();
                    AndroidPlatformComponentApi androidPlatformComponentApi = (AndroidPlatformComponentApi) C7475g.this.getComponent(AndroidPlatformComponentApi.class);
                    this.androidPlatformComponentApi = androidPlatformComponentApi;
                    this.imageResizer = androidPlatformComponentApi.getImageResizer();
                    this.uploadImageUseCase = ((MediaUploadComponentApi) C7475g.this.getComponent(MediaUploadComponentApi.class)).getUploadImageUseCase();
                    this.deliveryReviewComponentValidator = new DeliveryReviewComponentValidator();
                    this.formValidator = new DeliveryReviewFormValidator();
                    this.checkboxAndTextAreaValidator = new CheckboxAndTextareaValidator();
                    this.repository = ((ActionComponentApi) C7475g.this.getComponent(ActionComponentApi.class)).getActionRepository();
                    this.requestMapper = new SendDeliveryReviewFormRequestMapper();
                    this.orderChangePreferences = ((AccountComponentApi) ComposerWidgetComponentStorageKt.findComponentDependency(C7475g.this, AccountComponentApi.class)).getOrderChangePreferences();
                    this.updateFormItemHandler = new DeliveryReviewFormItemUpdateConsumer<>(groupCollapseUpdateDelegate, checkboxUpdateDelegate, radioUpdateDelegate, carouselUpdateDelegate, textAreaUpdateDelegate, toggleUpdateDelegate);
                    this.updateFooterHandler = new DeliveryReviewFormItemUpdateConsumer<>(groupCollapseUpdateDelegate, checkboxUpdateDelegate, radioUpdateDelegate, carouselUpdateDelegate, textAreaUpdateDelegate, toggleUpdateDelegate);
                }

                @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.di.DeliveryReviewFormWidgetComponent
                public AppType getAppType() {
                    return ((AndroidPlatformComponentDependencies) C7475g.this.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
                }

                @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.di.DeliveryReviewFormWidgetComponent
                public DeliveryReviewFormViewModelImpl getDeliveryReviewFormViewModel() {
                    return new DeliveryReviewFormViewModelImpl(this.deliveryReviewComponentValidator, this.formValidator, this.groupValidator, this.checkboxAndTextAreaValidator, this.repository, this.requestMapper, this.orderChangePreferences);
                }

                @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.di.DeliveryReviewFormWidgetComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.di.DeliveryReviewFormWidgetComponent
                public DeliveryReviewFormItemUpdateConsumer<DeliveryReviewFormFooterVO> getUpdateFooterHandler() {
                    return this.updateFooterHandler;
                }

                @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.di.DeliveryReviewFormWidgetComponent
                public DeliveryReviewFormItemUpdateConsumer<DeliveryReviewFormItemVO> getUpdateFormItemHandler() {
                    return this.updateFormItemHandler;
                }

                @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.di.DeliveryReviewFormWidgetComponent
                public ComponentUploadPhotosViewModelImpl getUploadPhotosViewModel() {
                    return new ComponentUploadPhotosViewModelImpl(this.pickedImagesMapper, this.imageResizer, this.uploadImageUseCase);
                }
            };
        }
    }

    @NotNull
    AppType getAppType();

    @NotNull
    DeliveryReviewFormViewModelImpl getDeliveryReviewFormViewModel();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    DeliveryReviewFormItemUpdateConsumer<DeliveryReviewFormFooterVO> getUpdateFooterHandler();

    @NotNull
    DeliveryReviewFormItemUpdateConsumer<DeliveryReviewFormItemVO> getUpdateFormItemHandler();

    @NotNull
    ComponentUploadPhotosViewModelImpl getUploadPhotosViewModel();
}
