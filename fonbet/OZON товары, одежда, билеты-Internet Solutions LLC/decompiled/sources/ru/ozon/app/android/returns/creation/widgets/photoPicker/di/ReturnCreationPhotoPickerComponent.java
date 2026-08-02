package ru.ozon.app.android.returns.creation.widgets.photoPicker.di;

import Av.C2447a;
import Bi.k;
import Pc.a;
import Vg.d;
import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.ImageUploadingLogger;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewMapper.ButtonsMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewMapper.PhotosMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.title.viewMapper.TitleMapper;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 *2\u00060\u0001j\u0002`\u0002:\u0001*R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010 \u001a\u0004\u0018\u00010\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010%\u001a\u00060!j\u0002`\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/di/ReturnCreationPhotoPickerComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/title/viewMapper/TitleMapper;", "getTitleMapper", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/title/viewMapper/TitleMapper;", "titleMapper", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewMapper/ButtonsMapper;", "getPhotoPickerButtonsMapper", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewMapper/ButtonsMapper;", "photoPickerButtonsMapper", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewMapper/PhotosMapper;", "getPhotosMapper", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewMapper/PhotosMapper;", "photosMapper", "LPc/a;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewModel;", "getPhotoViewModel", "()LPc/a;", "photoViewModel", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel;", "getButtonsViewModel", "buttonsViewModel", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/ImageUploadingLogger;", "getLogger", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/ImageUploadingLogger;", "logger", "LBi/k;", "getGalleryLauncher", "()LBi/k;", "setGalleryLauncher", "(LBi/k;)V", "galleryLauncher", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReturnCreationPhotoPickerComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/di/ReturnCreationPhotoPickerComponent$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lk20/e;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/di/ReturnCreationPhotoPickerComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Landroid/content/Context;)Lk20/e;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReturnCreationPhotoPickerComponent create$lambda$0(Context context) {
            return new ReturnCreationPhotoPickerComponent$Companion$create$1$1(context);
        }

        @NotNull
        public final C7473e<ReturnCreationPhotoPickerComponent> create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C7473e<>(N.b(ReturnCreationPhotoPickerComponent.class), new C2447a(context, 17));
        }
    }

    @NotNull
    AppType getAppType();

    @NotNull
    a<ButtonsViewModel> getButtonsViewModel();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    k getGalleryLauncher();

    @NotNull
    ImageUploadingLogger getLogger();

    @NotNull
    ButtonsMapper getPhotoPickerButtonsMapper();

    @NotNull
    a<PhotosViewModel> getPhotoViewModel();

    @NotNull
    PhotosMapper getPhotosMapper();

    @NotNull
    TitleMapper getTitleMapper();

    void setGalleryLauncher(k kVar);
}
