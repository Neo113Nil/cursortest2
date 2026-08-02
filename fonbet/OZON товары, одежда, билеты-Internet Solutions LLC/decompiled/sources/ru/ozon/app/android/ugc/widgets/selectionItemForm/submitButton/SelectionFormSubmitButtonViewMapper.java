package ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton;

import A00.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.pdp.ui.configurators.ugc.common.SubmitButtonAvailabilityUpdate;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerViewModelImpl;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.di.SelectionItemFormComponent;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u00020\u001dj\u0002`\u001e2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R(\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100&0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/di/SelectionItemFormComponent;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO;)Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO;", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionFormSubmitButtonViewMapper extends OverlayWidgetScreenViewItemMapper2<SelectionItemFormComponent, SelectionFormSubmitButtonVO, SelectionFormSubmitButtonVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(SubmitButtonAvailabilityUpdate.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(SelectionFormSubmitButtonViewGroup selectionFormSubmitButtonViewGroup, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return selectionFormSubmitButtonViewGroup;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SelectionFormSubmitButtonVO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<SelectionFormSubmitButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        SelectionFormSubmitButtonViewGroup selectionFormSubmitButtonViewGroup = new SelectionFormSubmitButtonViewGroup(L11, null, 0, 6, null);
        return new SelectionFormSubmitButtonVH(selectionFormSubmitButtonViewGroup, (SelectionFormViewModel) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton.SelectionFormSubmitButtonViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SelectionFormViewModel selectionFormViewModel = SelectionFormSubmitButtonViewMapper.this.component().getSelectionFormViewModel();
                Intrinsics.g(selectionFormViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return selectionFormViewModel;
            }
        }).a(SelectionFormViewModel.class), (MediaPickerViewModelImpl) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton.SelectionFormSubmitButtonViewMapper$createHolder$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                MediaPickerViewModelImpl mediaPickerViewModel = SelectionFormSubmitButtonViewMapper.this.component().getMediaPickerViewModel();
                Intrinsics.g(mediaPickerViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return mediaPickerViewModel;
            }
        }).a(MediaPickerViewModelImpl.class), component().getTokenizedAnalytics(), container, component().getCustomActionHandlersFactory(), new OW.a(selectionFormSubmitButtonViewGroup, 0));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SelectionItemFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SelectionItemFormComponent.INSTANCE.getInstance(storage);
    }

    @Override // c20.r, I00.d
    public SelectionFormSubmitButtonVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SelectionFormSubmitButtonVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof SubmitButtonAvailabilityUpdate) {
            return SelectionFormSubmitButtonVO.copy$default(oldItem, 0L, null, oldItem.getButtonWrapper().updateDisabled(!((SubmitButtonAvailabilityUpdate) update).getEnabled()), 3, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<SelectionFormSubmitButtonVO> map(@NotNull SelectionFormSubmitButtonVO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(state);
    }
}
