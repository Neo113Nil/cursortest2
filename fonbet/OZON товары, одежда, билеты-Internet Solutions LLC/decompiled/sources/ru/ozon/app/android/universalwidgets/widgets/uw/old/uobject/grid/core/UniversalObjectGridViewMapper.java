package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.core;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import j10.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.universalwidgets.R$layout;
import ru.ozon.app.android.universalwidgets.flags.UwObjectInflateDisabledFlag;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.core.UniversalObjectViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data.UniversalWidgetDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.UniversalObjectWidgetGridView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00042\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u000f0\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001e\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR<\u0010#\u001a$\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u00100\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/core/UniversalObjectGridViewMapper;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/core/UniversalObjectViewMapper;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "preCreateViewEnabled$delegate", "LSc/j;", "getPreCreateViewEnabled", "()Z", "preCreateViewEnabled", "Lkotlin/Function2;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "getUwObjectInflateDisabled", "uwObjectInflateDisabled", "", "getDesignType", "()Ljava/lang/String;", "designType", "", "getLayout", "()Ljava/lang/Integer;", "layout", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class UniversalObjectGridViewMapper extends UniversalObjectViewMapper {

    /* renamed from: preCreateViewEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j preCreateViewEnabled = LazyUtilsKt.unsafeLazy(new UniversalObjectGridViewMapper$preCreateViewEnabled$2(this));

    @NotNull
    private final Function2<View, ComposerReferences, k<ObjectItemVO>> holderProducer = new UniversalObjectGridViewMapper$holderProducer$1(this);

    private final boolean getPreCreateViewEnabled() {
        return ((Boolean) this.preCreateViewEnabled.getValue()).booleanValue();
    }

    private final boolean getUwObjectInflateDisabled() {
        return component().getFeatureChecker().isEnabled(UwObjectInflateDisabledFlag.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof UniversalWidgetDTO) && Intrinsics.d(((UniversalWidgetDTO) state).getDesignType().getType(), getDesignType());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        super.constructLayout(composerRootView, viewObject, references, voHelper);
        ((RetainImagePrefetchComponentApi) references.getWidgetComponent(RetainImagePrefetchComponentApi.class)).getImagePrefetchInfoProviderStorage().addProvider(N.b(ObjectItemVO.class), component().getUniversalGridImagePrefetchInfoProvider());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        UniversalObjectWidgetGridView universalObjectWidgetGridView;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (getPreCreateViewEnabled()) {
            universalObjectWidgetGridView = (UniversalObjectWidgetGridView) q.f64554a.i(N.b(UniversalObjectWidgetGridView.class), parent.getContext());
            if (universalObjectWidgetGridView == null) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                universalObjectWidgetGridView = new UniversalObjectWidgetGridView(context, null, 0, 6, null);
            }
        } else {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            universalObjectWidgetGridView = new UniversalObjectWidgetGridView(context2, null, 0, 6, null);
        }
        universalObjectWidgetGridView.setLayoutParams(new RecyclerView.p(-1, -2));
        return universalObjectWidgetGridView;
    }

    @NotNull
    public abstract String getDesignType();

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ObjectItemVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        if (getUwObjectInflateDisabled()) {
            return null;
        }
        return Integer.valueOf(R$layout.item_tile_uwidget);
    }
}
