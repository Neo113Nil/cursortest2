package ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons;

import Ci.C2779a;
import Ci.k;
import Hi.g;
import Hi.l;
import S0.A1;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.PickerViewModel;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedComponent;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons.ButtonsViewMapperKt$buttonsViewMapper$1;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ButtonsViewMapperKt$buttonsViewMapper$1$3$1$3$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ ReturnCreationPhotoPickerUnifiedComponent $component;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ View $localView;
    final /* synthetic */ A1<List<PhotoItem>> $photos$delegate;
    final /* synthetic */ i<ButtonsVI> $this_content;
    final /* synthetic */ PickerViewModel $viewModel;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHi/g;", "it", "", "invoke", "(LHi/g;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons.ButtonsViewMapperKt$buttonsViewMapper$1$3$1$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<g, Unit> {
        final /* synthetic */ InterfaceC7851b $controller;
        final /* synthetic */ View $localView;
        final /* synthetic */ i<ButtonsVI> $this_content;
        final /* synthetic */ PickerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PickerViewModel pickerViewModel, i<ButtonsVI> iVar, InterfaceC7851b interfaceC7851b, View view) {
            super(1);
            this.$viewModel = pickerViewModel;
            this.$this_content = iVar;
            this.$controller = interfaceC7851b;
            this.$localView = view;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
            invoke2(gVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            PickerViewModel pickerViewModel = this.$viewModel;
            List<l> a11 = it.a();
            String link = this.$this_content.b().getUploadImageAction().getLink();
            if (link == null) {
                return;
            }
            pickerViewModel.attachPhotos(a11, link);
            InterfaceC7851b.a.b(this.$controller, this.$this_content.b().getPhotosScrollKey(), 0, false, 14);
            this.$localView.requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ButtonsViewMapperKt$buttonsViewMapper$1$3$1$3$1(ReturnCreationPhotoPickerUnifiedComponent returnCreationPhotoPickerUnifiedComponent, i<ButtonsVI> iVar, A1<? extends List<PhotoItem>> a12, PickerViewModel pickerViewModel, InterfaceC7851b interfaceC7851b, View view) {
        super(1);
        this.$component = returnCreationPhotoPickerUnifiedComponent;
        this.$this_content = iVar;
        this.$photos$delegate = a12;
        this.$viewModel = pickerViewModel;
        this.$controller = interfaceC7851b;
        this.$localView = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        List invoke$lambda$2;
        k modifyConfig;
        Intrinsics.checkNotNullParameter(it, "it");
        Bi.k galleryLauncher = this.$component.getGalleryLauncher();
        if (galleryLauncher != null) {
            k b11 = C2779a.b();
            boolean z11 = this.$component.getAppType() == AppType.SELECT;
            int maxCount = this.$this_content.b().getSettings().getMaxCount();
            invoke$lambda$2 = ButtonsViewMapperKt$buttonsViewMapper$1.AnonymousClass3.AnonymousClass1.invoke$lambda$2(this.$photos$delegate);
            modifyConfig = ButtonsViewMapperKt.modifyConfig(b11, z11, maxCount - invoke$lambda$2.size());
            galleryLauncher.b(modifyConfig, new AnonymousClass1(this.$viewModel, this.$this_content, this.$controller, this.$localView));
        }
    }
}
