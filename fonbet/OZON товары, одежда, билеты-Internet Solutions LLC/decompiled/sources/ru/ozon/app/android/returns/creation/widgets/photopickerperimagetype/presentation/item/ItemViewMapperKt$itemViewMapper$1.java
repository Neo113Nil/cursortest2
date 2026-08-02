package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.item;

import A00.a;
import Ae.O0;
import Ek.a;
import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import Tg.b;
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
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFile;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploader;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.SignedLink;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.UploadingState;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.ChangeErrorVisibility;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.data.ItemDTO;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.di.ReturnCreationPhotoPickerPerImageTypeComponent;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.PickerViewModel;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepository;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepositoryImpl;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/item/ItemVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ItemViewMapperKt$itemViewMapper$1 extends AbstractC7737t implements Function1<j<Object, ItemVI>, Unit> {
    public static final ItemViewMapperKt$itemViewMapper$1 INSTANCE = new ItemViewMapperKt$itemViewMapper$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.item.ItemViewMapperKt$itemViewMapper$1$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ItemDTO);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "state", "Ll20/d;", "info", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/item/ItemVI;", "invoke", "(Ljava/lang/Object;Ll20/d;)Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/item/ItemVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.item.ItemViewMapperKt$itemViewMapper$1$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<Object, d, ItemVI> {
        final /* synthetic */ ReturnCreationPhotoPickerPerImageTypeComponent $component;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ReturnCreationPhotoPickerPerImageTypeComponent returnCreationPhotoPickerPerImageTypeComponent) {
            super(2);
            this.$component = returnCreationPhotoPickerPerImageTypeComponent;
        }

        @Override // kotlin.jvm.functions.Function2
        public final ItemVI invoke(Object state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            ItemDTO itemDTO = (ItemDTO) state;
            Map<Integer, ReturnCreationPhotoPickerRepository> repositories = this.$component.getRepositories();
            Integer valueOf = Integer.valueOf(itemDTO.getGroupId());
            MediaFilesUploader mediaFilesUploader = this.$component.getMediaFilesUploader();
            List<SignedLinkDTO> existingImages = itemDTO.getExistingImages();
            if (existingImages == null) {
                existingImages = K.f71697a;
            }
            List<SignedLinkDTO> list = existingImages;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new MediaFile(r8.getImageLocation().hashCode(), null, SignedLink.INSTANCE.fromDTO((SignedLinkDTO) it.next()), UploadingState.Uploaded.INSTANCE, 2, null));
            }
            repositories.put(valueOf, new ReturnCreationPhotoPickerRepositoryImpl(mediaFilesUploader, O0.a(C7714v.S0(arrayList))));
            int groupId = itemDTO.getGroupId();
            String d11 = info.d();
            return new ItemVI(("item_" + groupId + "_" + d11).hashCode(), itemDTO.getGroupId(), itemDTO.getCell(), itemDTO.getSubtitle(), itemDTO.getAddPhotoButton(), itemDTO.getUploadImageAction(), itemDTO.getErrorDescription(), itemDTO.getSettings().getMaxCount(), false, 256, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/item/ItemVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.item.ItemViewMapperKt$itemViewMapper$1$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<k<ItemVI>, Unit> {
        final /* synthetic */ ReturnCreationPhotoPickerPerImageTypeComponent $component;
        final /* synthetic */ j<Object, ItemVI> $this_viewMapper;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/item/ItemVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.item.ItemViewMapperKt$itemViewMapper$1$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<ItemVI>, g.a, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ ReturnCreationPhotoPickerPerImageTypeComponent $component;
            final /* synthetic */ j<Object, ItemVI> $this_viewMapper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(j<Object, ItemVI> jVar, ReturnCreationPhotoPickerPerImageTypeComponent returnCreationPhotoPickerPerImageTypeComponent) {
                super(4);
                this.$this_viewMapper = jVar;
                this.$component = returnCreationPhotoPickerPerImageTypeComponent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final List<PhotoItem> invoke$lambda$1(A1<? extends List<PhotoItem>> a12) {
                return a12.getValue();
            }

            @Override // fd.InterfaceC6512o
            public /* bridge */ /* synthetic */ Unit invoke(i<ItemVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(iVar, aVar, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(i<ItemVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                int i12;
                Object itemViewMapperKt$itemViewMapper$1$4$1$1$1;
                i<ItemVI> iVar;
                PickerViewModel pickerViewModel;
                Intrinsics.checkNotNullParameter(content, "$this$content");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i11 & 6) == 0) {
                    i12 = i11 | (interfaceC3967k.n(content) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i12 & 131) == 130 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                    return;
                }
                h hVar = (h) interfaceC3967k.m(f.f());
                final ReturnCreationPhotoPickerPerImageTypeComponent returnCreationPhotoPickerPerImageTypeComponent = this.$component;
                PickerViewModel pickerViewModel2 = (PickerViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.item.ItemViewMapperKt$itemViewMapper$1$4$1$invoke$$inlined$viewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        PickerViewModel viewModel = ReturnCreationPhotoPickerPerImageTypeComponent.this.getViewModel();
                        Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return viewModel;
                    }
                }).a(PickerViewModel.class);
                InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(f.c());
                InterfaceC3978p0 a11 = C6285b.a(pickerViewModel2.observeMedia(content.b().getGroupId()), K.f71697a, interfaceC3967k, 48);
                int i13 = i12 & 14;
                Function1<b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i13, 14));
                ItemVI b11 = content.b();
                List<PhotoItem> invoke$lambda$1 = invoke$lambda$1(a11);
                interfaceC3967k.o(70183663);
                boolean F11 = interfaceC3967k.F(this.$component) | (i13 == 4) | interfaceC3967k.n(a11) | interfaceC3967k.F(interfaceC7851b) | interfaceC3967k.F(pickerViewModel2);
                ReturnCreationPhotoPickerPerImageTypeComponent returnCreationPhotoPickerPerImageTypeComponent2 = this.$component;
                Object C11 = interfaceC3967k.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    iVar = content;
                    pickerViewModel = pickerViewModel2;
                    itemViewMapperKt$itemViewMapper$1$4$1$1$1 = new ItemViewMapperKt$itemViewMapper$1$4$1$1$1(returnCreationPhotoPickerPerImageTypeComponent2, iVar, a11, interfaceC7851b, pickerViewModel);
                    interfaceC3967k.x(itemViewMapperKt$itemViewMapper$1$4$1$1$1);
                } else {
                    itemViewMapperKt$itemViewMapper$1$4$1$1$1 = C11;
                    pickerViewModel = pickerViewModel2;
                    iVar = content;
                }
                Function0 function0 = (Function0) itemViewMapperKt$itemViewMapper$1$4$1$1$1;
                interfaceC3967k.k();
                interfaceC3967k.o(70210492);
                boolean F12 = interfaceC3967k.F(pickerViewModel) | (i13 == 4);
                Object C12 = interfaceC3967k.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new ItemViewMapperKt$itemViewMapper$1$4$1$2$1(pickerViewModel, iVar);
                    interfaceC3967k.x(C12);
                }
                Function1 function1 = (Function1) C12;
                interfaceC3967k.k();
                interfaceC3967k.o(70212918);
                boolean F13 = interfaceC3967k.F(pickerViewModel) | (i13 == 4);
                Object C13 = interfaceC3967k.C();
                if (F13 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new ItemViewMapperKt$itemViewMapper$1$4$1$3$1(pickerViewModel, iVar);
                    interfaceC3967k.x(C13);
                }
                interfaceC3967k.k();
                ItemComposableKt.ItemComposable(b11, invoke$lambda$1, m470buildHandlerimpl, function0, function1, (Function1) C13, interfaceC3967k, CellDTO.$stable | IconDTO.$stable);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(j<Object, ItemVI> jVar, ReturnCreationPhotoPickerPerImageTypeComponent returnCreationPhotoPickerPerImageTypeComponent) {
            super(1);
            this.$this_viewMapper = jVar;
            this.$component = returnCreationPhotoPickerPerImageTypeComponent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k<ItemVI> kVar) {
            invoke2(kVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(k<ItemVI> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(new C4912a(true, 1510202494, new AnonymousClass1(this.$this_viewMapper, this.$component)));
        }
    }

    ItemViewMapperKt$itemViewMapper$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j<Object, ItemVI> jVar) {
        invoke2(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(j<Object, ItemVI> jVar) {
        ReturnCreationPhotoPickerPerImageTypeComponent returnCreationPhotoPickerPerImageTypeComponent = (ReturnCreationPhotoPickerPerImageTypeComponent) a.c(jVar, "$this$viewMapper", ReturnCreationPhotoPickerPerImageTypeComponent.class);
        jVar.k(AnonymousClass1.INSTANCE, new AnonymousClass2(returnCreationPhotoPickerPerImageTypeComponent));
        jVar.c().put(ChangeErrorVisibility.class, new c.a() { // from class: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.item.ItemViewMapperKt$itemViewMapper$1$invoke$$inlined$update$1
            @Override // ru.ozon.composer.compose.widget.c.a
            public final I handle(a.J.InterfaceC0007a update, I old) {
                Intrinsics.checkNotNullParameter(update, "update");
                Intrinsics.checkNotNullParameter(old, "old");
                ChangeErrorVisibility changeErrorVisibility = (ChangeErrorVisibility) update;
                ItemVI itemVI = (ItemVI) old;
                return changeErrorVisibility.getGroupId() == itemVI.getGroupId() ? ItemVI.copy$default(itemVI, 0L, 0, null, null, null, null, null, 0, changeErrorVisibility.getShowError(), 255, null) : itemVI;
            }
        });
        jVar.G(new AnonymousClass4(jVar, returnCreationPhotoPickerPerImageTypeComponent));
    }
}
