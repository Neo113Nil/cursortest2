package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.di;

import AO.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.di.CmlDeliveryComponentApi;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.data.ParcelPhotoAddMapper;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.AttachedPhotoResizer;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.PickedPhotosMapper;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.viewmodel.ParcelPhotoAddViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.image.ImageResizer;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/di/ParcelPhotoAddComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddMapper;", "getParcelPhotoAddMapper", "()Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddMapper;", "parcelPhotoAddMapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/viewmodel/ParcelPhotoAddViewModel;", "getViewModel", "()Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/viewmodel/ParcelPhotoAddViewModel;", "viewModel", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ParcelPhotoAddComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/di/ParcelPhotoAddComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/di/ParcelPhotoAddComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ParcelPhotoAddComponent create$lambda$0(final C7475g c7475g) {
            return new ParcelPhotoAddComponent() { // from class: ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.di.ParcelPhotoAddComponent$Companion$create$1$1
                private final CmlDeliveryComponentApi cmlPhotoComponentApi;
                private final ImageResizer imageResizer;

                /* renamed from: parcelPhotoAddMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j parcelPhotoAddMapper = k.b(ParcelPhotoAddComponent$Companion$create$1$1$parcelPhotoAddMapper$2.INSTANCE);

                {
                    this.imageResizer = ((AndroidPlatformComponentApi) C7475g.this.getComponent(AndroidPlatformComponentApi.class)).getImageResizer();
                    this.cmlPhotoComponentApi = (CmlDeliveryComponentApi) C7475g.this.getComponent(CmlDeliveryComponentApi.class);
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.di.ParcelPhotoAddComponent
                public ParcelPhotoAddMapper getParcelPhotoAddMapper() {
                    return (ParcelPhotoAddMapper) this.parcelPhotoAddMapper.getValue();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.di.ParcelPhotoAddComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.di.ParcelPhotoAddComponent
                public ParcelPhotoAddViewModel getViewModel() {
                    return new ParcelPhotoAddViewModel(new PickedPhotosMapper(), new AttachedPhotoResizer(this.imageResizer), this.cmlPhotoComponentApi.getUploadPhotoUseCase(), this.cmlPhotoComponentApi.getDeletePhotoUseCase());
                }
            };
        }

        @NotNull
        public final C7473e<ParcelPhotoAddComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ParcelPhotoAddComponent.class), new a(storage, 5));
        }
    }

    @NotNull
    ParcelPhotoAddMapper getParcelPhotoAddMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    ParcelPhotoAddViewModel getViewModel();
}
