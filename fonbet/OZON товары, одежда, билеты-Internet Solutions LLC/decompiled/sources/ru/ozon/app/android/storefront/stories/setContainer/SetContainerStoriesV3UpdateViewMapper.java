package ru.ozon.app.android.storefront.stories.setContainer;

import DM.i;
import Pc.a;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import io.reactivex.p;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.storefront.stories.playstoriesv3.PlayStoriesV3ViewModel;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.ViewedStoryModel;
import ru.ozon.app.android.storefront.stories.setContainer.data.SetContainerDTO;
import ru.ozon.app.android.storefront.stories.setContainer.data.SetContainerVO;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\n\u0010\u0012\u001a\u00060\u000ej\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000b2\n\u0010\u0012\u001a\u00060\u000ej\u0002`\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R6\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001d0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/SetContainerStoriesV3UpdateViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerDTO;", "Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;", "LPc/a;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3ViewModel;", "vmProvider", "<init>", "(LPc/a;)V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "onContainerInitialized", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/composer/ui/widget/l;)V", "references", "removeView", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "LPc/a;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lnc/b;", "disposable", "Lnc/b;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetContainerStoriesV3UpdateViewMapper extends SingleNoUiViewMapper<SetContainerDTO, SetContainerVO> {
    private InterfaceC8487b disposable;

    @NotNull
    private final Function2<SetContainerDTO, d, List<SetContainerVO>> mapper;

    @NotNull
    private final a<PlayStoriesV3ViewModel> vmProvider;

    public SetContainerStoriesV3UpdateViewMapper(@NotNull a<PlayStoriesV3ViewModel> vmProvider) {
        Intrinsics.checkNotNullParameter(vmProvider, "vmProvider");
        this.vmProvider = vmProvider;
        this.mapper = new SetContainerMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<SetContainerDTO, d, List<SetContainerVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void onContainerInitialized(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences refs, @NotNull h<l> voHelper, @NotNull l viewObject) {
        p<ViewedStoryModel> subscribeStoryUpdates;
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        super.onContainerInitialized(composerRootView, refs, voHelper, viewObject);
        r a11 = refs.getContainer().a();
        InterfaceC8487b interfaceC8487b = null;
        PlayStoriesV3ViewModel playStoriesV3ViewModel = a11 != null ? (PlayStoriesV3ViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.storefront.stories.setContainer.SetContainerStoriesV3UpdateViewMapper$onContainerInitialized$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = SetContainerStoriesV3UpdateViewMapper.this.vmProvider;
                PlayStoriesV3ViewModel playStoriesV3ViewModel2 = (PlayStoriesV3ViewModel) aVar.get();
                Intrinsics.g(playStoriesV3ViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return playStoriesV3ViewModel2;
            }
        }).a(PlayStoriesV3ViewModel.class) : null;
        InterfaceC8487b interfaceC8487b2 = this.disposable;
        if (interfaceC8487b2 != null) {
            interfaceC8487b2.dispose();
        }
        if (playStoriesV3ViewModel != null && (subscribeStoryUpdates = playStoriesV3ViewModel.subscribeStoryUpdates()) != null) {
            interfaceC8487b = subscribeStoryUpdates.subscribe(new GH.a(new SetContainerStoriesV3UpdateViewMapper$onContainerInitialized$1(refs, playStoriesV3ViewModel), 11), new i(SetContainerStoriesV3UpdateViewMapper$onContainerInitialized$2.INSTANCE, 12));
        }
        this.disposable = interfaceC8487b;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void removeView(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull l viewObject) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        super.removeView(composerRootView, references, viewObject);
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }
}
