package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import j10.h;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.R$layout;
import ru.ozon.app.android.universalwidgets.flags.UwObjectInflateDisabledFlag;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data.UniversalWidgetDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.views.UwObjectGridOneCenterTextView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemsVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 62\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u000267B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00072\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0010\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00120\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00020 j\b\u0012\u0004\u0012\u00020\u0002`!2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R0\u0010-\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060(j\u0002`)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040*0'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R6\u00105\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0015\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000402j\b\u0012\u0004\u0012\u00020\u0004`30'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010,¨\u00068"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/UniversalObjectGridOneSingleItemBannerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/di/UniversalObjectWidgetComponent;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "getUwObjectInflateDisabled", "()Z", "uwObjectInflateDisabled", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "", "getLayout", "()Ljava/lang/Integer;", "layout", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "getHolderProducer", "holderProducer", "Companion", "UniversalObjectGridOneSingleItemBannerHolderProducer", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UniversalObjectGridOneSingleItemBannerViewMapper extends WidgetViewMapper2<UniversalObjectWidgetComponent, UniversalWidgetDTO, ObjectItemsVO> {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002$\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/UniversalObjectGridOneSingleItemBannerViewMapper$UniversalObjectGridOneSingleItemBannerHolderProducer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/UniversalObjectGridOneSingleItemBannerViewMapper;)V", "view", "ref", "invoke", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/composer/ui/widget/k;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public final class UniversalObjectGridOneSingleItemBannerHolderProducer implements Function2<View, ComposerReferences, k<ObjectItemsVO>> {
        public UniversalObjectGridOneSingleItemBannerHolderProducer() {
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public k<ObjectItemsVO> invoke(@NotNull View view, @NotNull ComposerReferences ref) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(ref, "ref");
            UwObjectGridOneCenterTextView uwObjectGridOneCenterTextView = view instanceof UwObjectGridOneCenterTextView ? (UwObjectGridOneCenterTextView) view : null;
            if (uwObjectGridOneCenterTextView != null) {
                uwObjectGridOneCenterTextView.resetCorners();
            }
            return UniversalObjectGridOneSingleItemBannerViewMapper.this.getUwObjectInflateDisabled() ? new UniversalObjectGridOneSingleItemViewHolderOptimized(view, ref, new GridOneViewDelegateImpl((FrameLayout) view, false)) : new UniversalObjectGridOneSingleItemViewHolder(view, ref, new GridOneViewDelegateImpl((FrameLayout) view, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getUwObjectInflateDisabled() {
        return component().getFeatureChecker().isEnabled(UwObjectInflateDisabledFlag.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof UniversalWidgetDTO)) {
            return false;
        }
        UniversalWidgetDTO universalWidgetDTO = (UniversalWidgetDTO) state;
        if (!Intrinsics.d(universalWidgetDTO.getDesignType().getType(), "object.grid1")) {
            return false;
        }
        UniversalWidgetDTO.DesignTypeDTO.OptionsDTO options = universalWidgetDTO.getDesignType().getOptions();
        return Intrinsics.d(options != null ? options.getStyle() : null, "banner") && universalWidgetDTO.getItems() != null && universalWidgetDTO.getItems().size() == 1;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        super.constructLayout(composerRootView, viewObject, references, voHelper);
        ((RetainImagePrefetchComponentApi) references.getWidgetComponent(RetainImagePrefetchComponentApi.class)).getImagePrefetchInfoProviderStorage().addProvider(N.b(ObjectItemsVO.class), component().getGridOneSingleItemBannerImageSizeProvider());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        frameLayout.setId(R$id.rootFl);
        frameLayout.setLayoutParams(new RecyclerView.p(-1, -2));
        return frameLayout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ObjectItemsVO>> mo614getHolderProducer() {
        return new UniversalObjectGridOneSingleItemBannerHolderProducer();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        if (getUwObjectInflateDisabled()) {
            return null;
        }
        return Integer.valueOf(R$layout.item_grid_one);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<UniversalWidgetDTO, d, List<ObjectItemsVO>> getMapper() {
        return component().getGridOneMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<UniversalObjectWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return UniversalObjectWidgetComponent.INSTANCE.create(storage);
    }
}
