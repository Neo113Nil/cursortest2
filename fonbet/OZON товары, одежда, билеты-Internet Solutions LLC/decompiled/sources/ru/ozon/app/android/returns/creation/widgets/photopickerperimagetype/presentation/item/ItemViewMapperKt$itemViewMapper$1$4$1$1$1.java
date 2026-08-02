package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.item;

import Ci.C2779a;
import Ci.k;
import Hi.g;
import Hi.l;
import S0.A1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.ChangeErrorVisibility;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.di.ReturnCreationPhotoPickerPerImageTypeComponent;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.PickerViewModel;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.item.ItemViewMapperKt$itemViewMapper$1;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ItemViewMapperKt$itemViewMapper$1$4$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ReturnCreationPhotoPickerPerImageTypeComponent $component;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ A1<List<PhotoItem>> $photos$delegate;
    final /* synthetic */ i<ItemVI> $this_content;
    final /* synthetic */ PickerViewModel $viewModel;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHi/g;", "it", "", "invoke", "(LHi/g;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.item.ItemViewMapperKt$itemViewMapper$1$4$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<g, Unit> {
        final /* synthetic */ InterfaceC7851b $controller;
        final /* synthetic */ i<ItemVI> $this_content;
        final /* synthetic */ PickerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC7851b interfaceC7851b, i<ItemVI> iVar, PickerViewModel pickerViewModel) {
            super(1);
            this.$controller = interfaceC7851b;
            this.$this_content = iVar;
            this.$viewModel = pickerViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
            invoke2(gVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (!it.a().isEmpty()) {
                this.$controller.update(new ChangeErrorVisibility(this.$this_content.b().getGroupId(), false));
            }
            PickerViewModel pickerViewModel = this.$viewModel;
            int groupId = this.$this_content.b().getGroupId();
            List<l> a11 = it.a();
            String link = this.$this_content.b().getUploadImageAction().getLink();
            if (link == null) {
                return;
            }
            pickerViewModel.attachPhotos(groupId, a11, link);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ItemViewMapperKt$itemViewMapper$1$4$1$1$1(ReturnCreationPhotoPickerPerImageTypeComponent returnCreationPhotoPickerPerImageTypeComponent, i<ItemVI> iVar, A1<? extends List<PhotoItem>> a12, InterfaceC7851b interfaceC7851b, PickerViewModel pickerViewModel) {
        super(0);
        this.$component = returnCreationPhotoPickerPerImageTypeComponent;
        this.$this_content = iVar;
        this.$photos$delegate = a12;
        this.$controller = interfaceC7851b;
        this.$viewModel = pickerViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List invoke$lambda$1;
        k modifyConfig;
        Bi.k galleryLauncher = this.$component.getGalleryLauncher();
        if (galleryLauncher != null) {
            k b11 = C2779a.b();
            boolean z11 = this.$component.getAppType() == AppType.SELECT;
            int maxCount = this.$this_content.b().getMaxCount();
            invoke$lambda$1 = ItemViewMapperKt$itemViewMapper$1.AnonymousClass4.AnonymousClass1.invoke$lambda$1(this.$photos$delegate);
            modifyConfig = ItemViewMapperKt.modifyConfig(b11, z11, maxCount - invoke$lambda$1.size());
            galleryLauncher.b(modifyConfig, new AnonymousClass1(this.$controller, this.$this_content, this.$viewModel));
        }
    }
}
