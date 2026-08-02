package ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.photos;

import Ih.a;
import S0.A1;
import S0.InterfaceC3967k;
import S0.Q;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b00.f;
import e3.C6285b;
import fd.InterfaceC6512o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFile;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.SignedLink;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.UploadingState;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.PickerViewModel;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedComponent;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.data.PhotosModel;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/presentation/photos/PhotosVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class PhotosViewMapperKt$photosViewMapper$1 extends AbstractC7737t implements Function1<j<Object, PhotosVI>, Unit> {
    public static final PhotosViewMapperKt$photosViewMapper$1 INSTANCE = new PhotosViewMapperKt$photosViewMapper$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.photos.PhotosViewMapperKt$photosViewMapper$1$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof PhotosModel);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "state", "Ll20/d;", "info", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/presentation/photos/PhotosVI;", "invoke", "(Ljava/lang/Object;Ll20/d;)Lru/ozon/app/android/returns/creation/widgets/photopickerunified/presentation/photos/PhotosVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.photos.PhotosViewMapperKt$photosViewMapper$1$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<Object, d, PhotosVI> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final PhotosVI invoke(Object state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            PhotosModel photosModel = (PhotosModel) state;
            long a11 = a.a("photos_", info.d());
            int scrollWidgetKey = photosModel.getScrollWidgetKey();
            List<SignedLinkDTO> existingImages = photosModel.getExistingImages();
            ArrayList arrayList = new ArrayList(C7714v.z(existingImages, 10));
            Iterator<T> it = existingImages.iterator();
            while (it.hasNext()) {
                arrayList.add(new MediaFile(r3.getImageLocation().hashCode(), null, SignedLink.INSTANCE.fromDTO((SignedLinkDTO) it.next()), UploadingState.Uploaded.INSTANCE, 2, null));
            }
            return new PhotosVI(a11, scrollWidgetKey, arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/presentation/photos/PhotosVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.photos.PhotosViewMapperKt$photosViewMapper$1$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<PhotosVI>, Unit> {
        final /* synthetic */ ReturnCreationPhotoPickerUnifiedComponent $component;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/presentation/photos/PhotosVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.photos.PhotosViewMapperKt$photosViewMapper$1$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<PhotosVI>, g.a, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ ReturnCreationPhotoPickerUnifiedComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ReturnCreationPhotoPickerUnifiedComponent returnCreationPhotoPickerUnifiedComponent) {
                super(4);
                this.$component = returnCreationPhotoPickerUnifiedComponent;
            }

            private static final List<PhotoItem> invoke$lambda$2(A1<? extends List<PhotoItem>> a12) {
                return a12.getValue();
            }

            @Override // fd.InterfaceC6512o
            public /* bridge */ /* synthetic */ Unit invoke(i<PhotosVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(iVar, aVar, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(i<PhotosVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                Intrinsics.checkNotNullParameter(content, "$this$content");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i11 & 6) == 0) {
                    i11 |= interfaceC3967k.n(content) ? 4 : 2;
                }
                if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                    return;
                }
                h hVar = (h) interfaceC3967k.m(f.f());
                final ReturnCreationPhotoPickerUnifiedComponent returnCreationPhotoPickerUnifiedComponent = this.$component;
                PickerViewModel pickerViewModel = (PickerViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.photos.PhotosViewMapperKt$photosViewMapper$1$3$1$invoke$$inlined$viewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        PickerViewModel viewModel = ReturnCreationPhotoPickerUnifiedComponent.this.getViewModel();
                        Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return viewModel;
                    }
                }).a(PickerViewModel.class);
                List<MediaFile> existingImages = content.b().getExistingImages();
                interfaceC3967k.o(1517228971);
                boolean F11 = ((i11 & 14) == 4) | interfaceC3967k.F(pickerViewModel);
                Object C11 = interfaceC3967k.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new PhotosViewMapperKt$photosViewMapper$1$3$1$1$1(pickerViewModel, content, null);
                    interfaceC3967k.x(C11);
                }
                interfaceC3967k.k();
                Q.e(interfaceC3967k, existingImages, (Function2) C11);
                List<PhotoItem> invoke$lambda$2 = invoke$lambda$2(C6285b.a(pickerViewModel.observeMedia(), K.f71697a, interfaceC3967k, 48));
                interfaceC3967k.o(1517239256);
                boolean F12 = interfaceC3967k.F(pickerViewModel);
                Object C12 = interfaceC3967k.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new PhotosViewMapperKt$photosViewMapper$1$3$1$2$1(pickerViewModel);
                    interfaceC3967k.x(C12);
                }
                Function1 function1 = (Function1) C12;
                interfaceC3967k.k();
                interfaceC3967k.o(1517241202);
                boolean F13 = interfaceC3967k.F(pickerViewModel);
                Object C13 = interfaceC3967k.C();
                if (F13 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new PhotosViewMapperKt$photosViewMapper$1$3$1$3$1(pickerViewModel);
                    interfaceC3967k.x(C13);
                }
                interfaceC3967k.k();
                PhotosComposableKt.PhotosComposable(invoke$lambda$2, function1, (Function1) C13, interfaceC3967k, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ReturnCreationPhotoPickerUnifiedComponent returnCreationPhotoPickerUnifiedComponent) {
            super(1);
            this.$component = returnCreationPhotoPickerUnifiedComponent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k<PhotosVI> kVar) {
            invoke2(kVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(k<PhotosVI> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(new C4912a(true, 1209800692, new AnonymousClass1(this.$component)));
        }
    }

    PhotosViewMapperKt$photosViewMapper$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j<Object, PhotosVI> jVar) {
        invoke2(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(j<Object, PhotosVI> jVar) {
        ReturnCreationPhotoPickerUnifiedComponent returnCreationPhotoPickerUnifiedComponent = (ReturnCreationPhotoPickerUnifiedComponent) Ek.a.c(jVar, "$this$viewMapper", ReturnCreationPhotoPickerUnifiedComponent.class);
        jVar.k(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
        jVar.G(new AnonymousClass3(returnCreationPhotoPickerUnifiedComponent));
    }
}
