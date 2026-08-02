package ru.ozon.app.android.returns.actionModal.di;

import AL.a;
import Bi.k;
import Sc.InterfaceC4008j;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.di.MediaUploadComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.returns.actionModal.data.ReturnActionModalParser;
import ru.ozon.app.android.returns.actionModal.presentation.viewModel.ReturnActionModalViewModelFactory;
import ru.ozon.app.android.returns.actionModal.viewMapper.ReturnActionModalViewMapperCompose;
import ru.ozon.app.android.uploadPhotos.di.viewModelFactory.UploadPhotosViewModelFactory;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00168&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/actionModal/di/ReturnActionModalComposeComponent;", "Lhi/a;", "Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionModalViewModelFactory;", "getReturnActionModalViewModelFactory", "()Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionModalViewModelFactory;", "returnActionModalViewModelFactory", "Lru/ozon/app/android/uploadPhotos/di/viewModelFactory/UploadPhotosViewModelFactory;", "getUploadPhotosViewModelFactory", "()Lru/ozon/app/android/uploadPhotos/di/viewModelFactory/UploadPhotosViewModelFactory;", "uploadPhotosViewModelFactory", "Lru/ozon/app/android/returns/actionModal/viewMapper/ReturnActionModalViewMapperCompose;", "getMapper", "()Lru/ozon/app/android/returns/actionModal/viewMapper/ReturnActionModalViewMapperCompose;", "mapper", "Lru/ozon/app/android/returns/actionModal/data/ReturnActionModalParser;", "getParser", "()Lru/ozon/app/android/returns/actionModal/data/ReturnActionModalParser;", "parser", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "LBi/k;", "getGalleryLauncher", "()LBi/k;", "setGalleryLauncher", "(LBi/k;)V", "galleryLauncher", "Companion", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReturnActionModalComposeComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/returns/actionModal/di/ReturnActionModalComposeComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/returns/actionModal/di/ReturnActionModalComposeComponent;", "create", "(Lk20/g;)Lk20/e;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReturnActionModalComposeComponent create$lambda$0(final C7475g c7475g) {
            final NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
            final AndroidPlatformComponentApi androidPlatformComponentApi = (AndroidPlatformComponentApi) c7475g.getComponent(AndroidPlatformComponentApi.class);
            final MediaUploadComponentApi mediaUploadComponentApi = (MediaUploadComponentApi) c7475g.getComponent(MediaUploadComponentApi.class);
            return new ReturnActionModalComposeComponent(c7475g, networkComponentApi, androidPlatformComponentApi, mediaUploadComponentApi) { // from class: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalComposeComponent$Companion$create$1$1
                private final AppType appType;
                private k galleryLauncher;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = Sc.k.b(ReturnActionModalComposeComponent$Companion$create$1$1$mapper$2.INSTANCE);

                /* renamed from: parser$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j parser;

                /* renamed from: returnActionModalViewModelFactory$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j returnActionModalViewModelFactory;

                /* renamed from: uploadPhotosViewModelFactory$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j uploadPhotosViewModelFactory;

                {
                    this.returnActionModalViewModelFactory = Sc.k.b(new ReturnActionModalComposeComponent$Companion$create$1$1$returnActionModalViewModelFactory$2(networkComponentApi));
                    this.uploadPhotosViewModelFactory = Sc.k.b(new ReturnActionModalComposeComponent$Companion$create$1$1$uploadPhotosViewModelFactory$2(androidPlatformComponentApi, mediaUploadComponentApi));
                    this.parser = Sc.k.b(new ReturnActionModalComposeComponent$Companion$create$1$1$parser$2(networkComponentApi));
                    this.appType = ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
                }

                @Override // ru.ozon.app.android.returns.actionModal.di.ReturnActionModalComposeComponent
                public AppType getAppType() {
                    return this.appType;
                }

                @Override // ru.ozon.app.android.returns.actionModal.di.ReturnActionModalComposeComponent
                public k getGalleryLauncher() {
                    return this.galleryLauncher;
                }

                @Override // ru.ozon.app.android.returns.actionModal.di.ReturnActionModalComposeComponent
                public ReturnActionModalViewMapperCompose getMapper() {
                    return (ReturnActionModalViewMapperCompose) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.returns.actionModal.di.ReturnActionModalComposeComponent
                public ReturnActionModalParser getParser() {
                    return (ReturnActionModalParser) this.parser.getValue();
                }

                @Override // ru.ozon.app.android.returns.actionModal.di.ReturnActionModalComposeComponent
                public ReturnActionModalViewModelFactory getReturnActionModalViewModelFactory() {
                    return (ReturnActionModalViewModelFactory) this.returnActionModalViewModelFactory.getValue();
                }

                @Override // ru.ozon.app.android.returns.actionModal.di.ReturnActionModalComposeComponent
                public UploadPhotosViewModelFactory getUploadPhotosViewModelFactory() {
                    return (UploadPhotosViewModelFactory) this.uploadPhotosViewModelFactory.getValue();
                }

                @Override // ru.ozon.app.android.returns.actionModal.di.ReturnActionModalComposeComponent
                public void setGalleryLauncher(k kVar) {
                    this.galleryLauncher = kVar;
                }
            };
        }

        @NotNull
        public final C7473e<ReturnActionModalComposeComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ReturnActionModalComposeComponent.class), new a(storage, 18));
        }
    }

    @NotNull
    AppType getAppType();

    k getGalleryLauncher();

    @NotNull
    ReturnActionModalViewMapperCompose getMapper();

    @NotNull
    ReturnActionModalParser getParser();

    @NotNull
    ReturnActionModalViewModelFactory getReturnActionModalViewModelFactory();

    @NotNull
    UploadPhotosViewModelFactory getUploadPhotosViewModelFactory();

    void setGalleryLauncher(k kVar);
}
