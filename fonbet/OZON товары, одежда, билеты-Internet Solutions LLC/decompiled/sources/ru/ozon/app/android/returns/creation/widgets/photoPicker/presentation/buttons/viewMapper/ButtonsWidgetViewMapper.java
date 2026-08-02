package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewMapper;

import Ww.a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.returns.creation.databinding.PhotoPickerButtonsBinding;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.ButtonsDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewHolder.ButtonsViewHolder;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewObject.ButtonsVO;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewMapper/ButtonsWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/di/ReturnCreationPhotoPickerComponent;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/ButtonsDTO;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewObject/ButtonsVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/ButtonsDTO;Ll20/d;)Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ButtonsWidgetViewMapper extends OverlayWidgetScreenViewItemMapper2<ReturnCreationPhotoPickerComponent, ButtonsDTO, ButtonsVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(PhotoPickerButtonsBinding photoPickerButtonsBinding, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ConstraintLayout constraintLayout = photoPickerButtonsBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ButtonsDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ButtonsVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        PhotoPickerButtonsBinding inflate = PhotoPickerButtonsBinding.inflate(LayoutInflater.from(container.L()));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        w0 a11 = new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewMapper.ButtonsWidgetViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ButtonsViewModel buttonsViewModel = ButtonsWidgetViewMapper.this.component().getButtonsViewModel().get();
                Intrinsics.g(buttonsViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return buttonsViewModel;
            }
        }).a(ButtonsViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new ButtonsViewHolder(inflate, container, (ButtonsViewModel) a11, component().getCustomActionHandlersStoreFactory(), component().getGalleryLauncher(), component().getLogger(), component().getAppType() == AppType.SELECT, new a(inflate, 1));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReturnCreationPhotoPickerComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ReturnCreationPhotoPickerComponent.INSTANCE.create(ComposerWidgetComponentStorageKt.getContext(storage));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ButtonsVO> map(@NotNull ButtonsDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getPhotoPickerButtonsMapper().invoke(state, info);
    }
}
