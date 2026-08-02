package ru.ozon.app.android.ugc.widgets.common.mediaPicker.core;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.data.MediaPickerDTO;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.di.MediaPickerComponent;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerViewModelImpl;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerWidgetVH;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.views.MediaPickerView;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormModalStateKey;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00020\u0019j\u0002`\u001a2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b#\u0010$R,\u0010'\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\"0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/core/MediaPickerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/di/MediaPickerComponent;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO;)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/views/MediaPickerView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/views/MediaPickerView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel;", "uploadViewModel", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerWidgetVH;", "createHolder", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/views/MediaPickerView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel;)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerWidgetVH;", "Lkotlin/Function2;", "Landroid/view/View;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/core/MediaPickerMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/core/MediaPickerMapper;", "mapper", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class MediaPickerViewMapper extends WidgetViewMapper2<MediaPickerComponent, MediaPickerDTO, MediaPickerVO> {

    @NotNull
    private final Function2<View, ComposerReferences, MediaPickerWidgetVH> holderProducer = new MediaPickerViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(MediaUpdateKey.class, ReviewFormModalStateKey.class);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof MediaPickerDTO;
    }

    @NotNull
    protected MediaPickerWidgetVH createHolder(@NotNull MediaPickerView view, @NotNull ComposerReferences refs, @NotNull UploadingAttachmentsViewModel uploadViewModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(uploadViewModel, "uploadViewModel");
        return new MediaPickerWidgetVH(view, refs, (MediaPickerViewModelImpl) new z0(refs.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaPickerViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                MediaPickerViewModelImpl mediaPickerViewModel = MediaPickerViewMapper.this.component().getMediaPickerViewModel();
                Intrinsics.g(mediaPickerViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return mediaPickerViewModel;
            }
        }).a(MediaPickerViewModelImpl.class), uploadViewModel, component().getTokenizedAnalytics(), component().getAppType() == AppType.SELECT, component().getSharedPreferences(), component().isTeenMode());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, MediaPickerWidgetVH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<MediaPickerComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return MediaPickerComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public MediaPickerView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new MediaPickerView(context);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public MediaPickerMapper getMapper() {
        return component().getMediaPickerMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public MediaPickerVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull MediaPickerVO oldItem) {
        MediaPickerVO copy;
        MediaPickerVO copy2;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof MediaUpdateKey) {
            copy2 = oldItem.copy((r35 & 1) != 0 ? oldItem.id : 0L, (r35 & 2) != 0 ? oldItem.items : ((MediaUpdateKey) update).getMedia(), (r35 & 4) != 0 ? oldItem.pickerItem : null, (r35 & 8) != 0 ? oldItem.removeIcon : null, (r35 & 16) != 0 ? oldItem.playIcon : null, (r35 & 32) != 0 ? oldItem.emptyItem : null, (r35 & 64) != 0 ? oldItem.maxItemsCount : 0, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.photoConfig : null, (r35 & 256) != 0 ? oldItem.videoConfig : null, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.uploadEvent : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.uploadErrorEvent : null, (r35 & 2048) != 0 ? oldItem.hidePickerBadgeCondition : null, (r35 & 4096) != 0 ? oldItem.onBoardingConfigVO : null, (r35 & 8192) != 0 ? oldItem.isExpanded : false, (r35 & 16384) != 0 ? oldItem.isModal : false);
            return copy2;
        }
        if (!(update instanceof ReviewFormModalStateKey)) {
            return oldItem;
        }
        copy = oldItem.copy((r35 & 1) != 0 ? oldItem.id : 0L, (r35 & 2) != 0 ? oldItem.items : null, (r35 & 4) != 0 ? oldItem.pickerItem : null, (r35 & 8) != 0 ? oldItem.removeIcon : null, (r35 & 16) != 0 ? oldItem.playIcon : null, (r35 & 32) != 0 ? oldItem.emptyItem : null, (r35 & 64) != 0 ? oldItem.maxItemsCount : 0, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.photoConfig : null, (r35 & 256) != 0 ? oldItem.videoConfig : null, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.uploadEvent : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.uploadErrorEvent : null, (r35 & 2048) != 0 ? oldItem.hidePickerBadgeCondition : null, (r35 & 4096) != 0 ? oldItem.onBoardingConfigVO : null, (r35 & 8192) != 0 ? oldItem.isExpanded : ((ReviewFormModalStateKey) update).getIsExpanded(), (r35 & 16384) != 0 ? oldItem.isModal : false);
        return copy;
    }
}
