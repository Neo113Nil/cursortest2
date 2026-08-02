package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import j10.h;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data.UniversalWidgetDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.Grid3VO$Grid3ItemVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.view.Grid3TextOutsideItemView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0018j\b\u0012\u0004\u0012\u00020\u0002`\u00192\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\f2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\u0006\u0010!\u001a\u00020 2\u0010\u0010$\u001a\f\u0012\u0004\u0012\u00020\u001d0\"j\u0002`#H\u0016¢\u0006\u0004\b&\u0010'R\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R<\u00100\u001a$\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 \u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/core/UniversalGrid3TextOutsideItemViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/di/UniversalObjectWidgetComponent;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO;", "<init>", "()V", "state", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO;)Lru/ozon/composer/ui/widget/h;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/core/UniversalObjectGrid3Mapper;", "getMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/core/UniversalObjectGrid3Mapper;", "mapper", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UniversalGrid3TextOutsideItemViewMapper extends WidgetViewMapper2<UniversalObjectWidgetComponent, UniversalWidgetDTO, Grid3VO$Grid3ItemVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<Grid3VO$Grid3ItemVO>> holderProducer = new UniversalGrid3TextOutsideItemViewMapper$holderProducer$1(this);
    private final Integer layout;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof UniversalWidgetDTO)) {
            return false;
        }
        UniversalWidgetDTO universalWidgetDTO = (UniversalWidgetDTO) state;
        return (!Intrinsics.d(universalWidgetDTO.getDesignType().getType(), "object.grid3") || universalWidgetDTO.getObjectGrid3New() == null || Intrinsics.d(universalWidgetDTO.getObjectGrid3New().isTextInsideCard(), Boolean.TRUE)) ? false : true;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        ((RetainImagePrefetchComponentApi) references.getWidgetComponent(RetainImagePrefetchComponentApi.class)).getImagePrefetchInfoProviderStorage().addProvider(N.b(Grid3VO$Grid3ItemVO.class), component().getGridImagePrefetchInfoProvider());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new Grid3TextOutsideItemView(context, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<Grid3VO$Grid3ItemVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<UniversalObjectWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return UniversalObjectWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public UniversalObjectGrid3Mapper getMapper() {
        return component().getGrid3Mapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public ru.ozon.composer.ui.widget.h getWidgetSpan(@NotNull UniversalWidgetDTO state, @NotNull Grid3VO$Grid3ItemVO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return state.getViewType();
    }
}
